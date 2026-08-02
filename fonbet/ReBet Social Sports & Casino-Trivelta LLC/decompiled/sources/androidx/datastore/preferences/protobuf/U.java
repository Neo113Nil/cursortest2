package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class U implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final P f19451a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f19452b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19453c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2141p f19454d;

    public U(m0 m0Var, AbstractC2141p abstractC2141p, P p10) {
        this.f19452b = m0Var;
        this.f19453c = abstractC2141p.e(p10);
        this.f19454d = abstractC2141p;
        this.f19451a = p10;
    }

    private int c(m0 m0Var, Object obj) {
        return m0Var.i(m0Var.g(obj));
    }

    private void d(m0 m0Var, AbstractC2141p abstractC2141p, Object obj, e0 e0Var, C2140o c2140o) {
        m0 m0Var2;
        Object f10 = m0Var.f(obj);
        C2143s d10 = abstractC2141p.d(obj);
        while (e0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                m0Var2 = m0Var;
                AbstractC2141p abstractC2141p2 = abstractC2141p;
                e0 e0Var2 = e0Var;
                C2140o c2140o2 = c2140o;
                try {
                    if (!f(e0Var2, c2140o2, abstractC2141p2, d10, m0Var2, f10)) {
                        m0Var2.o(obj, f10);
                        return;
                    }
                    e0Var = e0Var2;
                    c2140o = c2140o2;
                    abstractC2141p = abstractC2141p2;
                    m0Var = m0Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    m0Var2.o(obj, f10);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                m0Var2 = m0Var;
            }
        }
        m0Var.o(obj, f10);
    }

    public static U e(m0 m0Var, AbstractC2141p abstractC2141p, P p10) {
        return new U(m0Var, abstractC2141p, p10);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, e0 e0Var, C2140o c2140o) {
        d(this.f19452b, this.f19454d, obj, e0Var, c2140o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void b(Object obj, s0 s0Var) {
        Iterator n10 = this.f19454d.c(obj).n();
        if (n10.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) n10.next()).getKey());
            throw null;
        }
        g(this.f19452b, obj, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean equals(Object obj, Object obj2) {
        if (!this.f19452b.g(obj).equals(this.f19452b.g(obj2))) {
            return false;
        }
        if (this.f19453c) {
            return this.f19454d.c(obj).equals(this.f19454d.c(obj2));
        }
        return true;
    }

    public final boolean f(e0 e0Var, C2140o c2140o, AbstractC2141p abstractC2141p, C2143s c2143s, m0 m0Var, Object obj) {
        int tag = e0Var.getTag();
        int i10 = 0;
        if (tag != r0.f19578a) {
            if (r0.b(tag) != 2) {
                return e0Var.skipField();
            }
            Object b10 = abstractC2141p.b(c2140o, this.f19451a, r0.a(tag));
            if (b10 == null) {
                return m0Var.m(obj, e0Var, 0);
            }
            abstractC2141p.h(e0Var, b10, c2140o, c2143s);
            return true;
        }
        Object obj2 = null;
        AbstractC2132g abstractC2132g = null;
        while (e0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = e0Var.getTag();
            if (tag2 == r0.f19580c) {
                i10 = e0Var.readUInt32();
                obj2 = abstractC2141p.b(c2140o, this.f19451a, i10);
            } else if (tag2 == r0.f19581d) {
                if (obj2 != null) {
                    abstractC2141p.h(e0Var, obj2, c2140o, c2143s);
                } else {
                    abstractC2132g = e0Var.readBytes();
                }
            } else if (!e0Var.skipField()) {
                break;
            }
        }
        if (e0Var.getTag() != r0.f19579b) {
            throw C2150z.b();
        }
        if (abstractC2132g != null) {
            if (obj2 != null) {
                abstractC2141p.i(abstractC2132g, obj2, c2140o, c2143s);
            } else {
                m0Var.d(obj, i10, abstractC2132g);
            }
        }
        return true;
    }

    public final void g(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.s(m0Var.g(obj), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int getSerializedSize(Object obj) {
        int c10 = c(this.f19452b, obj);
        return this.f19453c ? c10 + this.f19454d.c(obj).f() : c10;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int hashCode(Object obj) {
        int hashCode = this.f19452b.g(obj).hashCode();
        return this.f19453c ? (hashCode * 53) + this.f19454d.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean isInitialized(Object obj) {
        return this.f19454d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void makeImmutable(Object obj) {
        this.f19452b.j(obj);
        this.f19454d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void mergeFrom(Object obj, Object obj2) {
        h0.F(this.f19452b, obj, obj2);
        if (this.f19453c) {
            h0.D(this.f19454d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public Object newInstance() {
        P p10 = this.f19451a;
        return p10 instanceof AbstractC2147w ? ((AbstractC2147w) p10).E() : p10.newBuilderForType().buildPartial();
    }
}
