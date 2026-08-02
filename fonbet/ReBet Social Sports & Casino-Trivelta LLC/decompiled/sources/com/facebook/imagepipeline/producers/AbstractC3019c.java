package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3019c implements InterfaceC3030n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f30757a = false;

    public static boolean d(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean e(int i10) {
        return !d(i10);
    }

    public static int k(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static boolean l(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int n(int i10, int i11) {
        return i10 & (~i11);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3030n
    public synchronized void a() {
        if (this.f30757a) {
            return;
        }
        this.f30757a = true;
        try {
            f();
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3030n
    public synchronized void b(Object obj, int i10) {
        if (this.f30757a) {
            return;
        }
        this.f30757a = d(i10);
        try {
            h(obj, i10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3030n
    public synchronized void c(float f10) {
        if (this.f30757a) {
            return;
        }
        try {
            i(f10);
        } catch (Exception e10) {
            j(e10);
        }
    }

    public abstract void f();

    public abstract void g(Throwable th2);

    public abstract void h(Object obj, int i10);

    public abstract void i(float f10);

    public void j(Exception exc) {
        E6.a.O(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC3030n
    public synchronized void onFailure(Throwable th2) {
        if (this.f30757a) {
            return;
        }
        this.f30757a = true;
        try {
            g(th2);
        } catch (Exception e10) {
            j(e10);
        }
    }
}
