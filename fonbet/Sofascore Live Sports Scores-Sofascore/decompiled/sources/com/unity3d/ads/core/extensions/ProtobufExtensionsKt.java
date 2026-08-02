package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import defpackage.a70;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010\n\u001a\u00020\u0003*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u0007*\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"URL_SAFE_AND_NO_WRAP", "", "toByteString", "Lcom/google/protobuf/ByteString;", "Ljava/util/UUID;", "toUUID", "toBase64", "", "urlSafe", "", "fromBase64", "toISO8859ByteString", "toISO8859String", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    @NotNull
    public static final ByteString fromBase64(@NotNull String str, boolean z) {
        str.getClass();
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, z ? 10 : 2));
        copyFrom.getClass();
        return copyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    @NotNull
    public static final String toBase64(@NotNull ByteString byteString, boolean z) {
        byteString.getClass();
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), z ? 10 : 2);
        encodeToString.getClass();
        return encodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    @NotNull
    public static final ByteString toByteString(@NotNull UUID uuid) {
        uuid.getClass();
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        copyFrom.getClass();
        return copyFrom;
    }

    @NotNull
    public static final ByteString toISO8859ByteString(@NotNull String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.e);
        bytes.getClass();
        ByteString copyFrom = ByteString.copyFrom(bytes);
        copyFrom.getClass();
        return copyFrom;
    }

    @NotNull
    public static final String toISO8859String(@NotNull ByteString byteString) {
        byteString.getClass();
        String byteString2 = byteString.toString(Charsets.e);
        byteString2.getClass();
        return byteString2;
    }

    @NotNull
    public static final UUID toUUID(@NotNull ByteString byteString) {
        byteString.getClass();
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        asReadOnlyByteBuffer.getClass();
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            fromString.getClass();
            return fromString;
        }
        if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        }
        a70.p("Expected 16 byte ByteString or UUID string");
        return null;
    }
}
