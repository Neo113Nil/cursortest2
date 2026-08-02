package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;

/* compiled from: ByteStrings.kt */
/* loaded from: classes13.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i) {
        return byteString.byteAt(i);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString byteString2) {
        return byteString.concat(byteString2);
    }

    public static final ByteString toByteString(byte[] bArr) {
        return ByteString.copyFrom(bArr);
    }

    public static final ByteString toByteStringUtf8(String str) {
        return ByteString.copyFromUtf8(str);
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        return ByteString.copyFrom(byteBuffer);
    }
}
