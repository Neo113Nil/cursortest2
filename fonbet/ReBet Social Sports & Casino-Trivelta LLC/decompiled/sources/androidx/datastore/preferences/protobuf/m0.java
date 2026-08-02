package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f19540a = 100;

    public abstract void a(Object obj, int i10, int i11);

    public abstract void b(Object obj, int i10, long j10);

    public abstract void c(Object obj, int i10, Object obj2);

    public abstract void d(Object obj, int i10, AbstractC2132g abstractC2132g);

    public abstract void e(Object obj, int i10, long j10);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, e0 e0Var, int i10) {
        while (e0Var.getFieldNumber() != Integer.MAX_VALUE && m(obj, e0Var, i10)) {
        }
    }

    public final boolean m(Object obj, e0 e0Var, int i10) {
        int tag = e0Var.getTag();
        int a10 = r0.a(tag);
        int b10 = r0.b(tag);
        if (b10 == 0) {
            e(obj, a10, e0Var.readInt64());
            return true;
        }
        if (b10 == 1) {
            b(obj, a10, e0Var.readFixed64());
            return true;
        }
        if (b10 == 2) {
            d(obj, a10, e0Var.readBytes());
            return true;
        }
        if (b10 != 3) {
            if (b10 == 4) {
                return false;
            }
            if (b10 != 5) {
                throw C2150z.e();
            }
            a(obj, a10, e0Var.readFixed32());
            return true;
        }
        Object n10 = n();
        int c10 = r0.c(a10, 4);
        int i11 = i10 + 1;
        if (i11 >= f19540a) {
            throw C2150z.i();
        }
        l(n10, e0Var, i11);
        if (c10 != e0Var.getTag()) {
            throw C2150z.b();
        }
        c(obj, a10, r(n10));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(e0 e0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, s0 s0Var);

    public abstract void t(Object obj, s0 s0Var);
}
