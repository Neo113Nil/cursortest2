package sj;

import org.spongycastle.asn1.AbstractC5940s;

/* renamed from: sj.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6370a {
    private static Li.a[] EMPTY_ARRAY = new Li.a[0];

    /* renamed from: a, reason: collision with root package name */
    public Li.b f64947a;

    public C6370a(Li.b bVar) {
        this.f64947a = bVar;
    }

    public static Li.b b(byte[] bArr) {
        try {
            return Li.b.c(AbstractC5940s.g(bArr));
        } catch (ClassCastException e10) {
            throw new C6373d("malformed data: " + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new C6373d("malformed data: " + e11.getMessage(), e11);
        }
    }

    public byte[] a() {
        return this.f64947a.a();
    }

    public Li.b c() {
        return this.f64947a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6370a) {
            return c().equals(((C6370a) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return c().hashCode();
    }

    public C6370a(byte[] bArr) {
        this(b(bArr));
    }
}
