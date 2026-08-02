package com.evervault.sdk.core;

import com.evervault.sdk.EncryptionConfig;
import com.evervault.sdk.core.exceptions.ExceededMaxFileSizeException;
import com.evervault.sdk.core.format.EncryptionFormatter;
import com.twilio.voice.EventKeys;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jh.AbstractC5135a;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000eH\u0002¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/evervault/sdk/core/Crypto;", "Lcom/evervault/sdk/core/EncryptionService;", "encryptionFormatter", "Lcom/evervault/sdk/core/format/EncryptionFormatter;", "dataCipher", "Lcom/evervault/sdk/core/DataCipher;", "config", "Lcom/evervault/sdk/EncryptionConfig;", "(Lcom/evervault/sdk/core/format/EncryptionFormatter;Lcom/evervault/sdk/core/DataCipher;Lcom/evervault/sdk/EncryptionConfig;)V", "encrypt", "T", EventKeys.DATA, "", "format", "Lkotlin/Function2;", "([BLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "encryptData", "encryptString", "", "string", "dataType", "Lcom/evervault/sdk/core/DataType;", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCrypto.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Crypto.kt\ncom/evervault/sdk/core/Crypto\n+ 2 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,42:1\n7#2,4:43\n*S KotlinDebug\n*F\n+ 1 Crypto.kt\ncom/evervault/sdk/core/Crypto\n*L\n18#1:43,4\n*E\n"})
/* loaded from: classes2.dex */
public final class Crypto implements EncryptionService {

    @NotNull
    private final EncryptionConfig config;

    @NotNull
    private final DataCipher dataCipher;

    @NotNull
    private final EncryptionFormatter encryptionFormatter;

    public Crypto(@NotNull EncryptionFormatter encryptionFormatter, @NotNull DataCipher dataCipher, @NotNull EncryptionConfig config) {
        Intrinsics.checkNotNullParameter(encryptionFormatter, "encryptionFormatter");
        Intrinsics.checkNotNullParameter(dataCipher, "dataCipher");
        Intrinsics.checkNotNullParameter(config, "config");
        this.encryptionFormatter = encryptionFormatter;
        this.dataCipher = dataCipher;
        this.config = config;
    }

    private final <T> T encrypt(byte[] data, Function2<? super byte[], ? super byte[], ? extends T> format) {
        EncryptedData encrypt = this.dataCipher.encrypt(data);
        return format.invoke(encrypt.getData(), encrypt.getKeyIv());
    }

    @Override // com.evervault.sdk.core.EncryptionService
    @NotNull
    public byte[] encryptData(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length <= this.config.getMaxFileSizeInBytes()) {
            return (byte[]) encrypt(data, new Function2<byte[], byte[], byte[]>() { // from class: com.evervault.sdk.core.Crypto$encryptData$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final byte[] invoke(@NotNull byte[] encryptedData, @NotNull byte[] keyIv) {
                    EncryptionFormatter encryptionFormatter;
                    Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
                    Intrinsics.checkNotNullParameter(keyIv, "keyIv");
                    encryptionFormatter = Crypto.this.encryptionFormatter;
                    return encryptionFormatter.formatFile(keyIv, encryptedData);
                }
            });
        }
        throw new ExceededMaxFileSizeException(this.config.getMaxFileSizeInMB());
    }

    @Override // com.evervault.sdk.core.EncryptionService
    @NotNull
    public String encryptString(@NotNull String string, @NotNull final DataType dataType) {
        byte[] g10;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            g10 = StringsKt.encodeToByteArray(string);
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(newEncoder, "charset.newEncoder()");
            g10 = AbstractC5135a.g(newEncoder, string, 0, string.length());
        }
        return (String) encrypt(g10, new Function2<byte[], byte[], String>() { // from class: com.evervault.sdk.core.Crypto$encryptString$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final String invoke(@NotNull byte[] encryptedData, @NotNull byte[] keyIv) {
                EncryptionFormatter encryptionFormatter;
                Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
                Intrinsics.checkNotNullParameter(keyIv, "keyIv");
                encryptionFormatter = Crypto.this.encryptionFormatter;
                return encryptionFormatter.formatEncryptedData(dataType, keyIv, Base64.encode$default(Base64.INSTANCE, encryptedData, 0, 0, 6, null));
            }
        });
    }
}
