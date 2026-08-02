package com.evervault.sdk.core;

import com.evervault.sdk.EncryptionConfig;
import com.evervault.sdk.core.DataCipher;
import com.evervault.sdk.core.exceptions.InvalidCipherException;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/evervault/sdk/core/JvmDataCipher;", "Lcom/evervault/sdk/core/DataCipher;", "ecdhTeamKey", "", "derivedSecret", "config", "Lcom/evervault/sdk/EncryptionConfig;", "([B[BLcom/evervault/sdk/EncryptionConfig;)V", "encrypt", "Lcom/evervault/sdk/core/EncryptedData;", EventKeys.DATA, "Factory", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class JvmDataCipher implements DataCipher {

    /* renamed from: Factory, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final EncryptionConfig config;

    @NotNull
    private final byte[] derivedSecret;

    @NotNull
    private final byte[] ecdhTeamKey;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/evervault/sdk/core/JvmDataCipher$Factory;", "Lcom/evervault/sdk/core/DataCipher$Factory;", "()V", "createCipher", "Lcom/evervault/sdk/core/DataCipher;", "ecdhTeamKey", "", "derivedSecret", "config", "Lcom/evervault/sdk/EncryptionConfig;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.evervault.sdk.core.JvmDataCipher$Factory, reason: from kotlin metadata */
    public static final class Companion implements DataCipher.Factory {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.evervault.sdk.core.DataCipher.Factory
        @NotNull
        public DataCipher createCipher(@NotNull byte[] ecdhTeamKey, @NotNull byte[] derivedSecret, @NotNull EncryptionConfig config) {
            Intrinsics.checkNotNullParameter(ecdhTeamKey, "ecdhTeamKey");
            Intrinsics.checkNotNullParameter(derivedSecret, "derivedSecret");
            Intrinsics.checkNotNullParameter(config, "config");
            return new JvmDataCipher(ecdhTeamKey, derivedSecret, config);
        }

        private Companion() {
        }
    }

    public JvmDataCipher(@NotNull byte[] ecdhTeamKey, @NotNull byte[] derivedSecret, @NotNull EncryptionConfig config) {
        Intrinsics.checkNotNullParameter(ecdhTeamKey, "ecdhTeamKey");
        Intrinsics.checkNotNullParameter(derivedSecret, "derivedSecret");
        Intrinsics.checkNotNullParameter(config, "config");
        this.ecdhTeamKey = ecdhTeamKey;
        this.derivedSecret = derivedSecret;
        this.config = config;
    }

    @Override // com.evervault.sdk.core.DataCipher
    @NotNull
    public EncryptedData encrypt(@NotNull byte[] data) {
        byte[] generateBytes;
        Intrinsics.checkNotNullParameter(data, "data");
        generateBytes = JvmDataCipherKt.generateBytes(this.config.getIvLength());
        GCMBlockCipher gCMBlockCipher = new GCMBlockCipher(new AESEngine());
        gCMBlockCipher.init(true, new AEADParameters(new KeyParameter(this.derivedSecret), this.config.getAuthTagLength(), generateBytes, this.ecdhTeamKey));
        byte[] bArr = new byte[gCMBlockCipher.getOutputSize(data.length)];
        try {
            gCMBlockCipher.doFinal(bArr, gCMBlockCipher.processBytes(data, 0, data.length, bArr, 0));
            return new EncryptedData(bArr, generateBytes);
        } catch (InvalidCipherTextException e10) {
            throw new InvalidCipherException(e10);
        }
    }
}
