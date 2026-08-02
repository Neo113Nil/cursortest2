package com.bumptech.glide.load;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final b f29964d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Object f29965a;

    /* renamed from: b, reason: collision with root package name */
    public final b f29966b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29967c;
    private volatile byte[] keyBytes;

    public class a implements b {
        @Override // com.bumptech.glide.load.i.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public i(String str, Object obj, b bVar) {
        this.f29967c = com.bumptech.glide.util.k.b(str);
        this.f29965a = obj;
        this.f29966b = (b) com.bumptech.glide.util.k.d(bVar);
    }

    public static i a(String str, Object obj, b bVar) {
        return new i(str, obj, bVar);
    }

    public static b b() {
        return f29964d;
    }

    public static i e(String str) {
        return new i(str, null, b());
    }

    public static i f(String str, Object obj) {
        return new i(str, obj, b());
    }

    public Object c() {
        return this.f29965a;
    }

    public final byte[] d() {
        if (this.keyBytes == null) {
            this.keyBytes = this.f29967c.getBytes(g.f29962a);
        }
        return this.keyBytes;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f29967c.equals(((i) obj).f29967c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f29966b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f29967c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f29967c + "'}";
    }
}
