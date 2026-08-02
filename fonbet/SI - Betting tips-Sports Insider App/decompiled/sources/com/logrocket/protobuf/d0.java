package com.logrocket.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6681a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6682b;

    static {
        Charset.forName("US-ASCII");
        f6681a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6682b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw new f0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i5 = (0 - 0) + length;
            if (i5 < 0) {
                throw new f0("Failed to parse the message.");
            }
            if (i5 > Integer.MAX_VALUE) {
                throw new f0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } catch (f0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
