package x0;

import x0.AbstractC10611p;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10600e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f104736a;

    /* renamed from: b, reason: collision with root package name */
    private final int f104737b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC10611p.a f104738c;

    public C10600e(int i11, int i12, AbstractC10611p.a aVar) {
        this.f104736a = i11;
        this.f104737b = i12;
        this.f104738c = aVar;
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "startIndex should be >= 0, but was ").toString());
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException(Ej.b.a(i12, "size should be >0, but was ").toString());
        }
    }

    public final int a() {
        return this.f104737b;
    }

    public final int b() {
        return this.f104736a;
    }

    public final T c() {
        return (T) this.f104738c;
    }
}
