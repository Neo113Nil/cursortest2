package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract class k0 {
    public abstract void a(Object obj, int i10, int i11);

    public abstract void b(Object obj, int i10, long j10);

    public abstract void c(Object obj, int i10, Object obj2);

    public abstract void d(Object obj, int i10, AbstractC3476h abstractC3476h);

    public abstract void e(Object obj, int i10, long j10);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, d0 d0Var) {
        while (d0Var.getFieldNumber() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    public final boolean m(Object obj, d0 d0Var) {
        int tag = d0Var.getTag();
        int a10 = q0.a(tag);
        int b10 = q0.b(tag);
        if (b10 == 0) {
            e(obj, a10, d0Var.readInt64());
            return true;
        }
        if (b10 == 1) {
            b(obj, a10, d0Var.readFixed64());
            return true;
        }
        if (b10 == 2) {
            d(obj, a10, d0Var.readBytes());
            return true;
        }
        if (b10 != 3) {
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw A.e();
            }
            a(obj, a10, d0Var.readFixed32());
            return true;
        }
        Object n10 = n();
        int c10 = q0.c(a10, 4);
        l(n10, d0Var);
        if (c10 != d0Var.getTag()) {
            throw A.b();
        }
        c(obj, a10, r(n10));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(d0 d0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, r0 r0Var);

    public abstract void t(Object obj, r0 r0Var);
}
