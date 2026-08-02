package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2150z;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.r0;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2134i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2133h f19507a;

    /* renamed from: b, reason: collision with root package name */
    public int f19508b;

    /* renamed from: c, reason: collision with root package name */
    public int f19509c;

    /* renamed from: d, reason: collision with root package name */
    public int f19510d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[r0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[r0.b.f19589j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19593n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19582c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19595p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19588i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19587h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19583d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19586g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19584e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19592m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19596q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19597r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19598s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19599t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19590k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19594o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19585f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C2134i(AbstractC2133h abstractC2133h) {
        AbstractC2133h abstractC2133h2 = (AbstractC2133h) AbstractC2149y.b(abstractC2133h, "input");
        this.f19507a = abstractC2133h2;
        abstractC2133h2.f19487d = this;
    }

    public static C2134i f(AbstractC2133h abstractC2133h) {
        C2134i c2134i = abstractC2133h.f19487d;
        return c2134i != null ? c2134i : new C2134i(abstractC2133h);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, f0 f0Var, C2140o c2140o) {
        o(2);
        h(obj, f0Var, c2140o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(List list, f0 f0Var, C2140o c2140o) {
        int C10;
        if (r0.b(this.f19508b) != 2) {
            throw C2150z.e();
        }
        int i10 = this.f19508b;
        do {
            list.add(k(f0Var, c2140o));
            if (this.f19507a.f() || this.f19510d != 0) {
                return;
            } else {
                C10 = this.f19507a.C();
            }
        } while (C10 == i10);
        this.f19510d = C10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f19507a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Map map, I.a aVar, C2140o c2140o) {
        o(2);
        int m10 = this.f19507a.m(this.f19507a.D());
        Object obj = aVar.f19429b;
        Object obj2 = aVar.f19431d;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.f19507a.f()) {
                    break;
                }
                if (fieldNumber == 1) {
                    obj = i(aVar.f19428a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new C2150z("Unable to parse map entry.");
                        }
                    } catch (C2150z.a unused) {
                        if (!skipField()) {
                            throw new C2150z("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = i(aVar.f19430c, aVar.f19431d.getClass(), c2140o);
                }
            } catch (Throwable th2) {
                this.f19507a.l(m10);
                throw th2;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void d(Object obj, f0 f0Var, C2140o c2140o) {
        o(3);
        g(obj, f0Var, c2140o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(List list, f0 f0Var, C2140o c2140o) {
        int C10;
        if (r0.b(this.f19508b) != 3) {
            throw C2150z.e();
        }
        int i10 = this.f19508b;
        do {
            list.add(j(f0Var, c2140o));
            if (this.f19507a.f() || this.f19510d != 0) {
                return;
            } else {
                C10 = this.f19507a.C();
            }
        } while (C10 == i10);
        this.f19510d = C10;
    }

    public final void g(Object obj, f0 f0Var, C2140o c2140o) {
        int i10 = this.f19509c;
        this.f19509c = r0.c(r0.a(this.f19508b), 4);
        try {
            f0Var.a(obj, this, c2140o);
            if (this.f19508b == this.f19509c) {
            } else {
                throw C2150z.h();
            }
        } finally {
            this.f19509c = i10;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int getFieldNumber() {
        int i10 = this.f19510d;
        if (i10 != 0) {
            this.f19508b = i10;
            this.f19510d = 0;
        } else {
            this.f19508b = this.f19507a.C();
        }
        int i11 = this.f19508b;
        if (i11 == 0 || i11 == this.f19509c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int getTag() {
        return this.f19508b;
    }

    public final void h(Object obj, f0 f0Var, C2140o c2140o) {
        int D10 = this.f19507a.D();
        AbstractC2133h abstractC2133h = this.f19507a;
        if (abstractC2133h.f19484a >= abstractC2133h.f19485b) {
            throw C2150z.i();
        }
        int m10 = abstractC2133h.m(D10);
        this.f19507a.f19484a++;
        f0Var.a(obj, this, c2140o);
        this.f19507a.a(0);
        r5.f19484a--;
        this.f19507a.l(m10);
    }

    public final Object i(r0.b bVar, Class cls, C2140o c2140o) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(readEnum());
            case 5:
                return Integer.valueOf(readFixed32());
            case 6:
                return Long.valueOf(readFixed64());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(readInt32());
            case 9:
                return Long.valueOf(readInt64());
            case 10:
                return l(cls, c2140o);
            case 11:
                return Integer.valueOf(readSFixed32());
            case 12:
                return Long.valueOf(readSFixed64());
            case 13:
                return Integer.valueOf(readSInt32());
            case 14:
                return Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return Integer.valueOf(readUInt32());
            case 17:
                return Long.valueOf(readUInt64());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object j(f0 f0Var, C2140o c2140o) {
        Object newInstance = f0Var.newInstance();
        g(newInstance, f0Var, c2140o);
        f0Var.makeImmutable(newInstance);
        return newInstance;
    }

    public final Object k(f0 f0Var, C2140o c2140o) {
        Object newInstance = f0Var.newInstance();
        h(newInstance, f0Var, c2140o);
        f0Var.makeImmutable(newInstance);
        return newInstance;
    }

    public Object l(Class cls, C2140o c2140o) {
        o(2);
        return k(b0.a().c(cls), c2140o);
    }

    public void m(List list, boolean z10) {
        int C10;
        int C11;
        if (r0.b(this.f19508b) != 2) {
            throw C2150z.e();
        }
        if (!(list instanceof C) || z10) {
            do {
                list.add(z10 ? readStringRequireUtf8() : readString());
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        C c10 = (C) list;
        do {
            c10.U(readBytes());
            if (this.f19507a.f()) {
                return;
            } else {
                C11 = this.f19507a.C();
            }
        } while (C11 == this.f19508b);
        this.f19510d = C11;
    }

    public final void n(int i10) {
        if (this.f19507a.e() != i10) {
            throw C2150z.m();
        }
    }

    public final void o(int i10) {
        if (r0.b(this.f19508b) != i10) {
            throw C2150z.e();
        }
    }

    public final void p(int i10) {
        if ((i10 & 3) != 0) {
            throw C2150z.h();
        }
    }

    public final void q(int i10) {
        if ((i10 & 7) != 0) {
            throw C2150z.h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean readBool() {
        o(0);
        return this.f19507a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readBoolList(List list) {
        int C10;
        if (list instanceof AbstractC2130e) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.n();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.n();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Boolean.valueOf(this.f19507a.n()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Boolean.valueOf(this.f19507a.n()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public AbstractC2132g readBytes() {
        o(2);
        return this.f19507a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readBytesList(List list) {
        int C10;
        if (r0.b(this.f19508b) != 2) {
            throw C2150z.e();
        }
        do {
            list.add(readBytes());
            if (this.f19507a.f()) {
                return;
            } else {
                C10 = this.f19507a.C();
            }
        } while (C10 == this.f19508b);
        this.f19510d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public double readDouble() {
        o(1);
        return this.f19507a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readDoubleList(List list) {
        int C10;
        if (list instanceof AbstractC2137l) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 1) {
                this.f19507a.p();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            q(this.f19507a.D());
            this.f19507a.e();
            this.f19507a.p();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 1) {
            do {
                list.add(Double.valueOf(this.f19507a.p()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int D10 = this.f19507a.D();
        q(D10);
        int e10 = this.f19507a.e() + D10;
        do {
            list.add(Double.valueOf(this.f19507a.p()));
        } while (this.f19507a.e() < e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int readEnum() {
        o(0);
        return this.f19507a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readEnumList(List list) {
        int C10;
        if (list instanceof AbstractC2148x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.q();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.q();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f19507a.q()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Integer.valueOf(this.f19507a.q()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int readFixed32() {
        o(5);
        return this.f19507a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readFixed32List(List list) {
        int C10;
        if (list instanceof AbstractC2148x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw C2150z.e();
                }
                this.f19507a.r();
                throw null;
            }
            p(this.f19507a.D());
            this.f19507a.e();
            this.f19507a.r();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 2) {
            int D10 = this.f19507a.D();
            p(D10);
            int e10 = this.f19507a.e() + D10;
            do {
                list.add(Integer.valueOf(this.f19507a.r()));
            } while (this.f19507a.e() < e10);
            return;
        }
        if (b11 != 5) {
            throw C2150z.e();
        }
        do {
            list.add(Integer.valueOf(this.f19507a.r()));
            if (this.f19507a.f()) {
                return;
            } else {
                C10 = this.f19507a.C();
            }
        } while (C10 == this.f19508b);
        this.f19510d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long readFixed64() {
        o(1);
        return this.f19507a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readFixed64List(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 1) {
                this.f19507a.s();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            q(this.f19507a.D());
            this.f19507a.e();
            this.f19507a.s();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 1) {
            do {
                list.add(Long.valueOf(this.f19507a.s()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int D10 = this.f19507a.D();
        q(D10);
        int e10 = this.f19507a.e() + D10;
        do {
            list.add(Long.valueOf(this.f19507a.s()));
        } while (this.f19507a.e() < e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public float readFloat() {
        o(5);
        return this.f19507a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readFloatList(List list) {
        int C10;
        if (list instanceof AbstractC2145u) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw C2150z.e();
                }
                this.f19507a.t();
                throw null;
            }
            p(this.f19507a.D());
            this.f19507a.e();
            this.f19507a.t();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 2) {
            int D10 = this.f19507a.D();
            p(D10);
            int e10 = this.f19507a.e() + D10;
            do {
                list.add(Float.valueOf(this.f19507a.t()));
            } while (this.f19507a.e() < e10);
            return;
        }
        if (b11 != 5) {
            throw C2150z.e();
        }
        do {
            list.add(Float.valueOf(this.f19507a.t()));
            if (this.f19507a.f()) {
                return;
            } else {
                C10 = this.f19507a.C();
            }
        } while (C10 == this.f19508b);
        this.f19510d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int readInt32() {
        o(0);
        return this.f19507a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readInt32List(List list) {
        int C10;
        if (list instanceof AbstractC2148x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.u();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.u();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f19507a.u()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Integer.valueOf(this.f19507a.u()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long readInt64() {
        o(0);
        return this.f19507a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readInt64List(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.v();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.v();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f19507a.v()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Long.valueOf(this.f19507a.v()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int readSFixed32() {
        o(5);
        return this.f19507a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readSFixed32List(List list) {
        int C10;
        if (list instanceof AbstractC2148x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw C2150z.e();
                }
                this.f19507a.w();
                throw null;
            }
            p(this.f19507a.D());
            this.f19507a.e();
            this.f19507a.w();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 2) {
            int D10 = this.f19507a.D();
            p(D10);
            int e10 = this.f19507a.e() + D10;
            do {
                list.add(Integer.valueOf(this.f19507a.w()));
            } while (this.f19507a.e() < e10);
            return;
        }
        if (b11 != 5) {
            throw C2150z.e();
        }
        do {
            list.add(Integer.valueOf(this.f19507a.w()));
            if (this.f19507a.f()) {
                return;
            } else {
                C10 = this.f19507a.C();
            }
        } while (C10 == this.f19508b);
        this.f19510d = C10;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long readSFixed64() {
        o(1);
        return this.f19507a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readSFixed64List(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 1) {
                this.f19507a.x();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            q(this.f19507a.D());
            this.f19507a.e();
            this.f19507a.x();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 1) {
            do {
                list.add(Long.valueOf(this.f19507a.x()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int D10 = this.f19507a.D();
        q(D10);
        int e10 = this.f19507a.e() + D10;
        do {
            list.add(Long.valueOf(this.f19507a.x()));
        } while (this.f19507a.e() < e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int readSInt32() {
        o(0);
        return this.f19507a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readSInt32List(List list) {
        int C10;
        if (list instanceof AbstractC2148x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.y();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.y();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f19507a.y()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Integer.valueOf(this.f19507a.y()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long readSInt64() {
        o(0);
        return this.f19507a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readSInt64List(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.z();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.z();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f19507a.z()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Long.valueOf(this.f19507a.z()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String readString() {
        o(2);
        return this.f19507a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readStringList(List list) {
        m(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readStringListRequireUtf8(List list) {
        m(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String readStringRequireUtf8() {
        o(2);
        return this.f19507a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int readUInt32() {
        o(0);
        return this.f19507a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readUInt32List(List list) {
        int C10;
        if (list instanceof AbstractC2148x) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.D();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.D();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Integer.valueOf(this.f19507a.D()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Integer.valueOf(this.f19507a.D()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long readUInt64() {
        o(0);
        return this.f19507a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void readUInt64List(List list) {
        int C10;
        if (list instanceof G) {
            android.support.v4.media.session.b.a(list);
            int b10 = r0.b(this.f19508b);
            if (b10 == 0) {
                this.f19507a.E();
                throw null;
            }
            if (b10 != 2) {
                throw C2150z.e();
            }
            this.f19507a.D();
            this.f19507a.e();
            this.f19507a.E();
            throw null;
        }
        int b11 = r0.b(this.f19508b);
        if (b11 == 0) {
            do {
                list.add(Long.valueOf(this.f19507a.E()));
                if (this.f19507a.f()) {
                    return;
                } else {
                    C10 = this.f19507a.C();
                }
            } while (C10 == this.f19508b);
            this.f19510d = C10;
            return;
        }
        if (b11 != 2) {
            throw C2150z.e();
        }
        int e10 = this.f19507a.e() + this.f19507a.D();
        do {
            list.add(Long.valueOf(this.f19507a.E()));
        } while (this.f19507a.e() < e10);
        n(e10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean skipField() {
        int i10;
        if (this.f19507a.f() || (i10 = this.f19508b) == this.f19509c) {
            return false;
        }
        return this.f19507a.F(i10);
    }
}
