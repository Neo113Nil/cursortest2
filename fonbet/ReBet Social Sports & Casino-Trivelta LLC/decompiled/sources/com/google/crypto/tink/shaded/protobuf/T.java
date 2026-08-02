package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC3473e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class T implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final O f37261a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f37262b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f37263c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC3485q f37264d;

    public T(k0 k0Var, AbstractC3485q abstractC3485q, O o10) {
        this.f37262b = k0Var;
        this.f37263c = abstractC3485q.e(o10);
        this.f37264d = abstractC3485q;
        this.f37261a = o10;
    }

    private int d(k0 k0Var, Object obj) {
        return k0Var.i(k0Var.g(obj));
    }

    private void e(k0 k0Var, AbstractC3485q abstractC3485q, Object obj, d0 d0Var, C3484p c3484p) {
        k0 k0Var2;
        Object f10 = k0Var.f(obj);
        AbstractC3487t d10 = abstractC3485q.d(obj);
        while (d0Var.getFieldNumber() != Integer.MAX_VALUE) {
            try {
                k0Var2 = k0Var;
                AbstractC3485q abstractC3485q2 = abstractC3485q;
                d0 d0Var2 = d0Var;
                C3484p c3484p2 = c3484p;
                try {
                    if (!g(d0Var2, c3484p2, abstractC3485q2, d10, k0Var2, f10)) {
                        k0Var2.o(obj, f10);
                        return;
                    }
                    d0Var = d0Var2;
                    c3484p = c3484p2;
                    abstractC3485q = abstractC3485q2;
                    k0Var = k0Var2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    k0Var2.o(obj, f10);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                k0Var2 = k0Var;
            }
        }
        k0Var.o(obj, f10);
    }

    public static T f(k0 k0Var, AbstractC3485q abstractC3485q, O o10) {
        return new T(k0Var, abstractC3485q, o10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void a(Object obj, byte[] bArr, int i10, int i11, AbstractC3473e.a aVar) {
        AbstractC3491x abstractC3491x = (AbstractC3491x) obj;
        if (abstractC3491x.unknownFields == l0.c()) {
            abstractC3491x.unknownFields = l0.k();
        }
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void b(Object obj, d0 d0Var, C3484p c3484p) {
        e(this.f37262b, this.f37264d, obj, d0Var, c3484p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void c(Object obj, r0 r0Var) {
        Iterator f10 = this.f37264d.c(obj).f();
        if (f10.hasNext()) {
            android.support.v4.media.session.b.a(((Map.Entry) f10.next()).getKey());
            throw null;
        }
        h(this.f37262b, obj, r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean equals(Object obj, Object obj2) {
        if (!this.f37262b.g(obj).equals(this.f37262b.g(obj2))) {
            return false;
        }
        if (this.f37263c) {
            return this.f37264d.c(obj).equals(this.f37264d.c(obj2));
        }
        return true;
    }

    public final boolean g(d0 d0Var, C3484p c3484p, AbstractC3485q abstractC3485q, AbstractC3487t abstractC3487t, k0 k0Var, Object obj) {
        int tag = d0Var.getTag();
        if (tag != q0.f37377a) {
            if (q0.b(tag) != 2) {
                return d0Var.skipField();
            }
            Object b10 = abstractC3485q.b(c3484p, this.f37261a, q0.a(tag));
            if (b10 == null) {
                return k0Var.m(obj, d0Var);
            }
            abstractC3485q.h(d0Var, b10, c3484p, abstractC3487t);
            return true;
        }
        Object obj2 = null;
        int i10 = 0;
        AbstractC3476h abstractC3476h = null;
        while (d0Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = d0Var.getTag();
            if (tag2 == q0.f37379c) {
                i10 = d0Var.readUInt32();
                obj2 = abstractC3485q.b(c3484p, this.f37261a, i10);
            } else if (tag2 == q0.f37380d) {
                if (obj2 != null) {
                    abstractC3485q.h(d0Var, obj2, c3484p, abstractC3487t);
                } else {
                    abstractC3476h = d0Var.readBytes();
                }
            } else if (!d0Var.skipField()) {
                break;
            }
        }
        if (d0Var.getTag() != q0.f37378b) {
            throw A.b();
        }
        if (abstractC3476h != null) {
            if (obj2 != null) {
                abstractC3485q.i(abstractC3476h, obj2, c3484p, abstractC3487t);
            } else {
                k0Var.d(obj, i10, abstractC3476h);
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int getSerializedSize(Object obj) {
        int d10 = d(this.f37262b, obj);
        return this.f37263c ? d10 + this.f37264d.c(obj).b() : d10;
    }

    public final void h(k0 k0Var, Object obj, r0 r0Var) {
        k0Var.s(k0Var.g(obj), r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int hashCode(Object obj) {
        int hashCode = this.f37262b.g(obj).hashCode();
        return this.f37263c ? (hashCode * 53) + this.f37264d.c(obj).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final boolean isInitialized(Object obj) {
        return this.f37264d.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void makeImmutable(Object obj) {
        this.f37262b.j(obj);
        this.f37264d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void mergeFrom(Object obj, Object obj2) {
        g0.F(this.f37262b, obj, obj2);
        if (this.f37263c) {
            g0.D(this.f37264d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public Object newInstance() {
        O o10 = this.f37261a;
        return o10 instanceof AbstractC3491x ? ((AbstractC3491x) o10).D() : o10.newBuilderForType().buildPartial();
    }
}
