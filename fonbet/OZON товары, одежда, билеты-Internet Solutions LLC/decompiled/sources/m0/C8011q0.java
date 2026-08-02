package m0;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8011q0<T> implements H<T> {

    /* renamed from: a, reason: collision with root package name */
    private final float f73850a;

    /* renamed from: b, reason: collision with root package name */
    private final float f73851b;

    /* renamed from: c, reason: collision with root package name */
    private final T f73852c;

    public C8011q0() {
        this(null, 7);
    }

    @Override // m0.InterfaceC8002m
    public final X0 a(U0 u02) {
        T t2 = this.f73852c;
        return new j1(this.f73850a, this.f73851b, t2 == null ? null : (AbstractC8015t) u02.a().invoke(t2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8011q0) {
            C8011q0 c8011q0 = (C8011q0) obj;
            if (c8011q0.f73850a == this.f73850a && c8011q0.f73851b == this.f73851b && Intrinsics.d(c8011q0.f73852c, this.f73852c)) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.f73850a;
    }

    public final float g() {
        return this.f73851b;
    }

    public final T h() {
        return this.f73852c;
    }

    public final int hashCode() {
        T t2 = this.f73852c;
        return Float.hashCode(this.f73851b) + Pk0.b.a(this.f73850a, (t2 != null ? t2.hashCode() : 0) * 31, 31);
    }

    public C8011q0(float f7, float f11, T t2) {
        this.f73850a = f7;
        this.f73851b = f11;
        this.f73852c = t2;
    }

    public /* synthetic */ C8011q0(Object obj, int i11) {
        this(1.0f, 1500.0f, (i11 & 4) != 0 ? null : obj);
    }
}
