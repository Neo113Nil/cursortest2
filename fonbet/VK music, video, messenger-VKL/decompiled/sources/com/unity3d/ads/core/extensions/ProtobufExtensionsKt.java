package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import xsna.emb;

/* compiled from: ProtobufExtensions.kt */
/* loaded from: classes14.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z) {
        return ByteString.copyFrom(Base64.decode(str, z ? 10 : 2));
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    public static final String toBase64(ByteString byteString, boolean z) {
        return Base64.encodeToString(byteString.toByteArray(), z ? 10 : 2);
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    public static final ByteString toByteString(UUID uuid) {
        return ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
    }

    public static final ByteString toISO8859ByteString(String str) {
        return ByteString.copyFrom(str.getBytes(emb.d));
    }

    public static final String toISO8859String(ByteString byteString) {
        return byteString.toString(emb.d);
    }

    public static final UUID toUUID(ByteString byteString) {
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        if (asReadOnlyByteBuffer.remaining() == 36) {
            return UUID.fromString(byteString.toStringUtf8());
        }
        if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
