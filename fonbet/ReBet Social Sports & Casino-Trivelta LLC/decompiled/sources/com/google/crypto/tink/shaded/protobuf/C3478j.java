package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3478j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3477i f37322a;

    /* renamed from: b, reason: collision with root package name */
    public int f37323b;

    /* renamed from: c, reason: collision with root package name */
    public int f37324c;

    /* renamed from: d, reason: collision with root package name */
    public int f37325d = 0;

    public C3478j(AbstractC3477i abstractC3477i) {
        AbstractC3477i abstractC3477i2 = (AbstractC3477i) AbstractC3493z.b(abstractC3477i, "input");
        this.f37322a = abstractC3477i2;
        abstractC3477i2.f37304d = this;
    }

    public static C3478j f(AbstractC3477i abstractC3477i) {
        C3478j c3478j = abstractC3477i.f37304d;
        return c3478j != null ? c3478j : new C3478j(abstractC3477i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void a(Object obj, e0 e0Var, C3484p c3484p) {
        m(3);
        g(obj, e0Var, c3484p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void b(Map map, H.a aVar, C3484p c3484p) {
        m(2);
        this.f37322a.l(this.f37322a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void c(Object obj, e0 e0Var, C3484p c3484p) {
        m(2);
        h(obj, e0Var, c3484p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void d(List list, e0 e0Var, C3484p c3484p) {
        int B10;
        if (q0.b(this.f37323b) != 2) {
            throw A.e();
        }
        int i10 = this.f37323b;
        do {
            list.add(j(e0Var, c3484p));
            if (this.f37322a.e() || this.f37325d != 0) {
                return;
            } else {
                B10 = this.f37322a.B();
            }
        } while (B10 == i10);
        this.f37325d = B10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void e(List list, e0 e0Var, C3484p c3484p) {
        int B10;
        if (q0.b(this.f37323b) != 3) {
            throw A.e();
        }
        int i10 = this.f37323b;
        do {
            list.add(i(e0Var, c3484p));
            if (this.f37322a.e() || this.f37325d != 0) {
                return;
            } else {
                B10 = this.f37322a.B();
            }
        } while (B10 == i10);
        this.f37325d = B10;
    }

    public final void g(Object obj, e0 e0Var, C3484p c3484p) {
        int i10 = this.f37324c;
        this.f37324c = q0.c(q0.a(this.f37323b), 4);
        try {
            e0Var.b(obj, this, c3484p);
            if (this.f37323b == this.f37324c) {
            } else {
                throw A.h();
            }
        } finally {
            this.f37324c = i10;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int getFieldNumber() {
        int i10 = this.f37325d;
        if (i10 != 0) {
            this.f37323b = i10;
            this.f37325d = 0;
        } else {
            this.f37323b = this.f37322a.B();
        }
        int i11 = this.f37323b;
        if (i11 == 0 || i11 == this.f37324c) {
            return Integer.MAX_VALUE;
        }
        return q0.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int getTag() {
        return this.f37323b;
    }

    public final void h(Object obj, e0 e0Var, C3484p c3484p) {
        int C10 = this.f37322a.C();
        AbstractC3477i abstractC3477i = this.f37322a;
        if (abstractC3477i.f37301a >= abstractC3477i.f37302b) {
            throw A.i();
        }
        int l10 = abstractC3477i.l(C10);
        this.f37322a.f37301a++;
        e0Var.b(obj, this, c3484p);
        this.f37322a.a(0);
        r5.f37301a--;
        this.f37322a.k(l10);
    }

    public final Object i(e0 e0Var, C3484p c3484p) {
        Object newInstance = e0Var.newInstance();
        g(newInstance, e0Var, c3484p);
        e0Var.makeImmutable(newInstance);
        return newInstance;
    }

    public final Object j(e0 e0Var, C3484p c3484p) {
        Object newInstance = e0Var.newInstance();
        h(newInstance, e0Var, c3484p);
        e0Var.makeImmutable(newInstance);
        return newInstance;
    }

    public void k(List list, boolean z10) {
        int B10;
        int B11;
        if (q0.b(this.f37323b) != 2) {
            throw A.e();
        }
        if (!(list instanceof D) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B10 = this.f37322a.B();
                }
            } while (B10 == this.f37323b);
            this.f37325d = B10;
            return;
        }
        D d10 = (D) list;
        do {
            d10.z0(readBytes());
            if (this.f37322a.e()) {
                return;
            } else {
                B11 = this.f37322a.B();
            }
        } while (B11 == this.f37323b);
        this.f37325d = B11;
    }

    public final void l(int i10) {
        if (this.f37322a.d() != i10) {
            throw A.m();
        }
    }

    public final void m(int i10) {
        if (q0.b(this.f37323b) != i10) {
            throw A.e();
        }
    }

    public final void n(int i10) {
        if ((i10 & 3) != 0) {
            throw A.h();
        }
    }

    public final void o(int i10) {
        if ((i10 & 7) != 0) {
            throw A.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean readBool() {
        m(0);
        return this.f37322a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readBoolList(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3474f)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f37322a.m()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Boolean.valueOf(this.f37322a.m()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        AbstractC3474f abstractC3474f = (AbstractC3474f) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                abstractC3474f.addBoolean(this.f37322a.m());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            abstractC3474f.addBoolean(this.f37322a.m());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public AbstractC3476h readBytes() {
        m(2);
        return this.f37322a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readBytesList(List list) {
        int B10;
        if (q0.b(this.f37323b) != 2) {
            throw A.e();
        }
        do {
            list.add(readBytes());
            if (this.f37322a.e()) {
                return;
            } else {
                B10 = this.f37322a.B();
            }
        } while (B10 == this.f37323b);
        this.f37325d = B10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public double readDouble() {
        m(1);
        return this.f37322a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readDoubleList(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3481m)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 1) {
                do {
                    list.add(Double.valueOf(this.f37322a.o()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int C10 = this.f37322a.C();
            o(C10);
            int d10 = this.f37322a.d() + C10;
            do {
                list.add(Double.valueOf(this.f37322a.o()));
            } while (this.f37322a.d() < d10);
            return;
        }
        AbstractC3481m abstractC3481m = (AbstractC3481m) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 1) {
            do {
                abstractC3481m.addDouble(this.f37322a.o());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int C11 = this.f37322a.C();
        o(C11);
        int d11 = this.f37322a.d() + C11;
        do {
            abstractC3481m.addDouble(this.f37322a.o());
        } while (this.f37322a.d() < d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int readEnum() {
        m(0);
        return this.f37322a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readEnumList(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3492y)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37322a.p()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Integer.valueOf(this.f37322a.p()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                abstractC3492y.addInt(this.f37322a.p());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            abstractC3492y.addInt(this.f37322a.p());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int readFixed32() {
        m(5);
        return this.f37322a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readFixed32List(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3492y)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 2) {
                int C10 = this.f37322a.C();
                n(C10);
                int d10 = this.f37322a.d() + C10;
                do {
                    list.add(Integer.valueOf(this.f37322a.q()));
                } while (this.f37322a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f37322a.q()));
                if (this.f37322a.e()) {
                    return;
                } else {
                    B10 = this.f37322a.B();
                }
            } while (B10 == this.f37323b);
            this.f37325d = B10;
            return;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 2) {
            int C11 = this.f37322a.C();
            n(C11);
            int d11 = this.f37322a.d() + C11;
            do {
                abstractC3492y.addInt(this.f37322a.q());
            } while (this.f37322a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw A.e();
        }
        do {
            abstractC3492y.addInt(this.f37322a.q());
            if (this.f37322a.e()) {
                return;
            } else {
                B11 = this.f37322a.B();
            }
        } while (B11 == this.f37323b);
        this.f37325d = B11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long readFixed64() {
        m(1);
        return this.f37322a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readFixed64List(List list) {
        int B10;
        int B11;
        if (!(list instanceof F)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f37322a.r()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int C10 = this.f37322a.C();
            o(C10);
            int d10 = this.f37322a.d() + C10;
            do {
                list.add(Long.valueOf(this.f37322a.r()));
            } while (this.f37322a.d() < d10);
            return;
        }
        F f10 = (F) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 1) {
            do {
                f10.addLong(this.f37322a.r());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int C11 = this.f37322a.C();
        o(C11);
        int d11 = this.f37322a.d() + C11;
        do {
            f10.addLong(this.f37322a.r());
        } while (this.f37322a.d() < d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public float readFloat() {
        m(5);
        return this.f37322a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readFloatList(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3489v)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 2) {
                int C10 = this.f37322a.C();
                n(C10);
                int d10 = this.f37322a.d() + C10;
                do {
                    list.add(Float.valueOf(this.f37322a.s()));
                } while (this.f37322a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw A.e();
            }
            do {
                list.add(Float.valueOf(this.f37322a.s()));
                if (this.f37322a.e()) {
                    return;
                } else {
                    B10 = this.f37322a.B();
                }
            } while (B10 == this.f37323b);
            this.f37325d = B10;
            return;
        }
        AbstractC3489v abstractC3489v = (AbstractC3489v) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 2) {
            int C11 = this.f37322a.C();
            n(C11);
            int d11 = this.f37322a.d() + C11;
            do {
                abstractC3489v.addFloat(this.f37322a.s());
            } while (this.f37322a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw A.e();
        }
        do {
            abstractC3489v.addFloat(this.f37322a.s());
            if (this.f37322a.e()) {
                return;
            } else {
                B11 = this.f37322a.B();
            }
        } while (B11 == this.f37323b);
        this.f37325d = B11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int readInt32() {
        m(0);
        return this.f37322a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readInt32List(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3492y)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37322a.t()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Integer.valueOf(this.f37322a.t()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                abstractC3492y.addInt(this.f37322a.t());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            abstractC3492y.addInt(this.f37322a.t());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long readInt64() {
        m(0);
        return this.f37322a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readInt64List(List list) {
        int B10;
        int B11;
        if (!(list instanceof F)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Long.valueOf(this.f37322a.u()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Long.valueOf(this.f37322a.u()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        F f10 = (F) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                f10.addLong(this.f37322a.u());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            f10.addLong(this.f37322a.u());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int readSFixed32() {
        m(5);
        return this.f37322a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readSFixed32List(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3492y)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 2) {
                int C10 = this.f37322a.C();
                n(C10);
                int d10 = this.f37322a.d() + C10;
                do {
                    list.add(Integer.valueOf(this.f37322a.v()));
                } while (this.f37322a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f37322a.v()));
                if (this.f37322a.e()) {
                    return;
                } else {
                    B10 = this.f37322a.B();
                }
            } while (B10 == this.f37323b);
            this.f37325d = B10;
            return;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 2) {
            int C11 = this.f37322a.C();
            n(C11);
            int d11 = this.f37322a.d() + C11;
            do {
                abstractC3492y.addInt(this.f37322a.v());
            } while (this.f37322a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw A.e();
        }
        do {
            abstractC3492y.addInt(this.f37322a.v());
            if (this.f37322a.e()) {
                return;
            } else {
                B11 = this.f37322a.B();
            }
        } while (B11 == this.f37323b);
        this.f37325d = B11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long readSFixed64() {
        m(1);
        return this.f37322a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readSFixed64List(List list) {
        int B10;
        int B11;
        if (!(list instanceof F)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 1) {
                do {
                    list.add(Long.valueOf(this.f37322a.w()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int C10 = this.f37322a.C();
            o(C10);
            int d10 = this.f37322a.d() + C10;
            do {
                list.add(Long.valueOf(this.f37322a.w()));
            } while (this.f37322a.d() < d10);
            return;
        }
        F f10 = (F) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 1) {
            do {
                f10.addLong(this.f37322a.w());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int C11 = this.f37322a.C();
        o(C11);
        int d11 = this.f37322a.d() + C11;
        do {
            f10.addLong(this.f37322a.w());
        } while (this.f37322a.d() < d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int readSInt32() {
        m(0);
        return this.f37322a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readSInt32List(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3492y)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37322a.x()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Integer.valueOf(this.f37322a.x()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                abstractC3492y.addInt(this.f37322a.x());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            abstractC3492y.addInt(this.f37322a.x());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long readSInt64() {
        m(0);
        return this.f37322a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readSInt64List(List list) {
        int B10;
        int B11;
        if (!(list instanceof F)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Long.valueOf(this.f37322a.y()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Long.valueOf(this.f37322a.y()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        F f10 = (F) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                f10.addLong(this.f37322a.y());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            f10.addLong(this.f37322a.y());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public String readString() {
        m(2);
        return this.f37322a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readStringList(List list) {
        k(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readStringListRequireUtf8(List list) {
        k(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public String readStringRequireUtf8() {
        m(2);
        return this.f37322a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int readUInt32() {
        m(0);
        return this.f37322a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readUInt32List(List list) {
        int B10;
        int B11;
        if (!(list instanceof AbstractC3492y)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37322a.C()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Integer.valueOf(this.f37322a.C()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        AbstractC3492y abstractC3492y = (AbstractC3492y) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                abstractC3492y.addInt(this.f37322a.C());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            abstractC3492y.addInt(this.f37322a.C());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long readUInt64() {
        m(0);
        return this.f37322a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void readUInt64List(List list) {
        int B10;
        int B11;
        if (!(list instanceof F)) {
            int b10 = q0.b(this.f37323b);
            if (b10 == 0) {
                do {
                    list.add(Long.valueOf(this.f37322a.D()));
                    if (this.f37322a.e()) {
                        return;
                    } else {
                        B10 = this.f37322a.B();
                    }
                } while (B10 == this.f37323b);
                this.f37325d = B10;
                return;
            }
            if (b10 != 2) {
                throw A.e();
            }
            int d10 = this.f37322a.d() + this.f37322a.C();
            do {
                list.add(Long.valueOf(this.f37322a.D()));
            } while (this.f37322a.d() < d10);
            l(d10);
            return;
        }
        F f10 = (F) list;
        int b11 = q0.b(this.f37323b);
        if (b11 == 0) {
            do {
                f10.addLong(this.f37322a.D());
                if (this.f37322a.e()) {
                    return;
                } else {
                    B11 = this.f37322a.B();
                }
            } while (B11 == this.f37323b);
            this.f37325d = B11;
            return;
        }
        if (b11 != 2) {
            throw A.e();
        }
        int d11 = this.f37322a.d() + this.f37322a.C();
        do {
            f10.addLong(this.f37322a.D());
        } while (this.f37322a.d() < d11);
        l(d11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean skipField() {
        int i10;
        if (this.f37322a.e() || (i10 = this.f37323b) == this.f37324c) {
            return false;
        }
        return this.f37322a.E(i10);
    }
}
