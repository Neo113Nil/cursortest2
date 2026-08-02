package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import org.bouncycastle.i18n.LocalizedMessage;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3493z {
    public static final byte[] EMPTY_BYTE_ARRAY;

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f37487a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f37488b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f37489c = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f37490d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC3477i f37491e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    public interface a {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    public interface b {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    public interface c {
        boolean isInRange(int i10);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$d */
    public interface d extends List, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d mutableCopyWithCapacity(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        f37490d = ByteBuffer.wrap(bArr);
        f37491e = AbstractC3477i.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int h10 = h(i11, bArr, i10, i11);
        if (h10 == 0) {
            return 1;
        }
        return h10;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return p0.m(bArr);
    }

    public static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f37488b);
    }
}
