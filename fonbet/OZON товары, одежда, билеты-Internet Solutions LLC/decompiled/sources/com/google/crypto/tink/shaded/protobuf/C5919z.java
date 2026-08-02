package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5919z {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f59480a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f59481b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    public interface a {
        int getNumber();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    public interface b<T extends a> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    public interface c {
        boolean a();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$d */
    public interface d<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        d<E> mutableCopyWithCapacity(int i11);
    }

    static {
        Charset.forName("US-ASCII");
        f59480a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f59481b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC5904j.f(bArr, 0, 0, false);
    }

    static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }
}
