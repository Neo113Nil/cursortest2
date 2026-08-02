package io.reactivex;

import C.C2702w;
import sc.C9656b;

/* loaded from: classes9.dex */
public final class o<T> {

    /* renamed from: b, reason: collision with root package name */
    static final o<Object> f66521b = new o<>(null);

    /* renamed from: a, reason: collision with root package name */
    final Object f66522a;

    private o(Object obj) {
        this.f66522a = obj;
    }

    public static <T> o<T> a() {
        return (o<T>) f66521b;
    }

    public static <T> o<T> b(Throwable th2) {
        C9656b.c(th2, "error is null");
        return new o<>(Gc.k.f(th2));
    }

    public static <T> o<T> c(T t2) {
        C9656b.c(t2, "value is null");
        return new o<>(t2);
    }

    public final Throwable d() {
        Object obj = this.f66522a;
        if (Gc.k.i(obj)) {
            return Gc.k.g(obj);
        }
        return null;
    }

    public final T e() {
        T t2 = (T) this.f66522a;
        if (t2 == null || Gc.k.i(t2)) {
            return null;
        }
        return t2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return C9656b.a(this.f66522a, ((o) obj).f66522a);
        }
        return false;
    }

    public final boolean f() {
        return this.f66522a == null;
    }

    public final boolean g() {
        return Gc.k.i(this.f66522a);
    }

    public final boolean h() {
        Object obj = this.f66522a;
        return (obj == null || Gc.k.i(obj)) ? false : true;
    }

    public final int hashCode() {
        Object obj = this.f66522a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f66522a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!Gc.k.i(obj)) {
            return C2702w.c(obj, "OnNextNotification[", "]");
        }
        return "OnErrorNotification[" + Gc.k.g(obj) + "]";
    }
}
