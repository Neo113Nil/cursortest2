package com.evervault.sdk.core.format;

import ch.f;
import com.evervault.sdk.core.DataType;
import defpackage.a;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jh.AbstractC5135a;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/evervault/sdk/core/format/R1StdEncryptionFormatter;", "Lcom/evervault/sdk/core/format/EncryptionFormatter;", "evVersion", "", "publicKey", "", "isDebug", "", "(Ljava/lang/String;[BZ)V", "formatEncryptedData", "dataType", "Lcom/evervault/sdk/core/DataType;", "keyIv", "encryptedData", "formatFile", "evervault-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nR1StdEncryptionFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 R1StdEncryptionFormatter.kt\ncom/evervault/sdk/core/format/R1StdEncryptionFormatter\n+ 2 Strings.kt\nio/ktor/utils/io/core/StringsKt\n*L\n1#1,58:1\n7#2,4:59\n*S KotlinDebug\n*F\n+ 1 R1StdEncryptionFormatter.kt\ncom/evervault/sdk/core/format/R1StdEncryptionFormatter\n*L\n18#1:59,4\n*E\n"})
/* loaded from: classes2.dex */
public final class R1StdEncryptionFormatter implements EncryptionFormatter {

    @NotNull
    private final String evVersion;
    private final boolean isDebug;

    @NotNull
    private final byte[] publicKey;

    public R1StdEncryptionFormatter(@NotNull String evVersion, @NotNull byte[] publicKey, boolean z10) {
        Intrinsics.checkNotNullParameter(evVersion, "evVersion");
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.evVersion = evVersion;
        this.publicKey = publicKey;
        this.isDebug = z10;
    }

    @Override // com.evervault.sdk.core.format.EncryptionFormatter
    @NotNull
    public String formatEncryptedData(@NotNull DataType dataType, @NotNull byte[] keyIv, @NotNull String encryptedData) {
        byte[] g10;
        String prefix;
        String paddingRemoved;
        String paddingRemoved2;
        String paddingRemoved3;
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(keyIv, "keyIv");
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        Base64.Companion companion = Base64.INSTANCE;
        String str = this.evVersion;
        Charset charset = Charsets.UTF_8;
        if (Intrinsics.areEqual(charset, charset)) {
            g10 = StringsKt.encodeToByteArray(str);
        } else {
            CharsetEncoder newEncoder = charset.newEncoder();
            Intrinsics.checkNotNullExpressionValue(newEncoder, "charset.newEncoder()");
            g10 = AbstractC5135a.g(newEncoder, str, 0, str.length());
        }
        String encode$default = Base64.encode$default(companion, g10, 0, 0, 6, null);
        String str2 = this.isDebug ? "debug:" : "";
        prefix = R1StdEncryptionFormatterKt.getPrefix(dataType);
        paddingRemoved = R1StdEncryptionFormatterKt.getPaddingRemoved(Base64.encode$default(companion, keyIv, 0, 0, 6, null));
        paddingRemoved2 = R1StdEncryptionFormatterKt.getPaddingRemoved(f.a(this.publicKey));
        paddingRemoved3 = R1StdEncryptionFormatterKt.getPaddingRemoved(encryptedData);
        return "ev:" + str2 + encode$default + prefix + ":" + paddingRemoved + ":" + paddingRemoved2 + ":" + paddingRemoved3 + ":$";
    }

    @Override // com.evervault.sdk.core.format.EncryptionFormatter
    @NotNull
    public byte[] formatFile(@NotNull byte[] keyIv, @NotNull byte[] encryptedData) {
        Intrinsics.checkNotNullParameter(keyIv, "keyIv");
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        byte[] plus = ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(ArraysKt.plus(new byte[]{37, 69, 86, 69, 78, 67}, new byte[]{3}), new byte[]{55, 0}), this.publicKey), keyIv), new byte[]{0}), encryptedData);
        int a10 = a.a(plus);
        return ArraysKt.plus(plus, new byte[]{(byte) (a10 & 255), (byte) ((a10 >>> 8) & 255), (byte) ((a10 >>> 16) & 255), (byte) ((a10 >>> 24) & 255)});
    }
}
