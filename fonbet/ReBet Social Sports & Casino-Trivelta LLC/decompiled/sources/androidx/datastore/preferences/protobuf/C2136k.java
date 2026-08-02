package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2136k implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2135j f19537a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
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
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19588i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19586g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19596q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19598s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19594o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19587h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19584e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19597r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19599t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19585f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[r0.b.f19590k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C2136k(AbstractC2135j abstractC2135j) {
        AbstractC2135j abstractC2135j2 = (AbstractC2135j) AbstractC2149y.b(abstractC2135j, "output");
        this.f19537a = abstractC2135j2;
        abstractC2135j2.f19531a = this;
    }

    public static C2136k g(AbstractC2135j abstractC2135j) {
        C2136k c2136k = abstractC2135j.f19531a;
        return c2136k != null ? c2136k : new C2136k(abstractC2135j);
    }

    public final void A(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void B(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.x(((Long) list.get(i13)).longValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void C(int i10, Object obj) {
        if (obj instanceof String) {
            this.f19537a.K0(i10, (String) obj);
        } else {
            this.f19537a.e0(i10, (AbstractC2132g) obj);
        }
    }

    public final void D(int i10, AbstractC2148x abstractC2148x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void E(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.C0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.F(((Integer) list.get(i13)).intValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.D0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void F(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void G(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.E0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.H(((Long) list.get(i13)).longValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.F0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void H(int i10, AbstractC2148x abstractC2148x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public void I(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.G0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.J(((Integer) list.get(i13)).intValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.H0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void J(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void K(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.I0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.L(((Long) list.get(i13)).longValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.J0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void L(int i10, AbstractC2148x abstractC2148x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public void M(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.Q(((Integer) list.get(i13)).intValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void N(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void O(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.S(((Long) list.get(i13)).longValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void a(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void b(int i10, AbstractC2132g abstractC2132g) {
        this.f19537a.e0(i10, abstractC2132g);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void c(int i10, Object obj, f0 f0Var) {
        this.f19537a.y0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void d(int i10, I.a aVar, Map map) {
        if (this.f19537a.X()) {
            m(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f19537a.M0(i10, 2);
            this.f19537a.O0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f19537a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void e(int i10, Object obj, f0 f0Var) {
        this.f19537a.r0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void f(int i10, List list, f0 f0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public s0.a fieldOrder() {
        return s0.a.ASCENDING;
    }

    public final void h(int i10, AbstractC2130e abstractC2130e, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void i(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.d(((Boolean) list.get(i13)).booleanValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void j(int i10, boolean z10, Object obj, I.a aVar) {
        this.f19537a.M0(i10, 2);
        this.f19537a.O0(I.b(aVar, Boolean.valueOf(z10), obj));
        I.e(this.f19537a, aVar, Boolean.valueOf(z10), obj);
    }

    public final void k(int i10, I.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f19537a.M0(i10, 2);
            this.f19537a.O0(I.b(aVar, Integer.valueOf(i13), obj));
            I.e(this.f19537a, aVar, Integer.valueOf(i13), obj);
        }
    }

    public final void l(int i10, I.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f19537a.M0(i10, 2);
            this.f19537a.O0(I.b(aVar, Long.valueOf(j10), obj));
            I.e(this.f19537a, aVar, Long.valueOf(j10), obj);
        }
    }

    public final void m(int i10, I.a aVar, Map map) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[aVar.f19428a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    j(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    j(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                k(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                l(i10, aVar, map);
                return;
            case 12:
                n(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f19428a);
        }
    }

    public final void n(int i10, I.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f19537a.M0(i10, 2);
            this.f19537a.O0(I.b(aVar, str, obj));
            I.e(this.f19537a, aVar, str, obj);
        }
    }

    public final void o(int i10, AbstractC2137l abstractC2137l, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void p(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.g0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.i(((Double) list.get(i13)).doubleValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.h0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    public final void q(int i10, AbstractC2148x abstractC2148x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void r(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.k(((Integer) list.get(i13)).intValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.j0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void s(int i10, AbstractC2148x abstractC2148x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void t(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.k0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.m(((Integer) list.get(i13)).intValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.l0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void u(int i10, G g10, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void v(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.m0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.o(((Long) list.get(i13)).longValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.n0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void w(int i10, AbstractC2145u abstractC2145u, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeBool(int i10, boolean z10) {
        this.f19537a.a0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeBoolList(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2130e)) {
            i(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            h(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeBytesList(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f19537a.e0(i10, (AbstractC2132g) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeDouble(int i10, double d10) {
        this.f19537a.g0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeDoubleList(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2137l)) {
            p(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            o(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeEndGroup(int i10) {
        this.f19537a.M0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeEnum(int i10, int i11) {
        this.f19537a.i0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeEnumList(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2148x)) {
            r(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            q(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeFixed32(int i10, int i11) {
        this.f19537a.k0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeFixed32List(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2148x)) {
            t(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            s(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeFixed64(int i10, long j10) {
        this.f19537a.m0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeFixed64List(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            v(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            u(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeFloat(int i10, float f10) {
        this.f19537a.o0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeFloatList(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2145u)) {
            x(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            w(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeInt32(int i10, int i11) {
        this.f19537a.u0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeInt32List(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2148x)) {
            z(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            y(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeInt64(int i10, long j10) {
        this.f19537a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeInt64List(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            B(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            A(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public final void writeMessageSetItem(int i10, Object obj) {
        if (obj instanceof AbstractC2132g) {
            this.f19537a.B0(i10, (AbstractC2132g) obj);
        } else {
            this.f19537a.A0(i10, (P) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSFixed32(int i10, int i11) {
        this.f19537a.C0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSFixed32List(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2148x)) {
            E(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            D(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSFixed64(int i10, long j10) {
        this.f19537a.E0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSFixed64List(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            G(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            F(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSInt32(int i10, int i11) {
        this.f19537a.G0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSInt32List(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2148x)) {
            I(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            H(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSInt64(int i10, long j10) {
        this.f19537a.I0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeSInt64List(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            K(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            J(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeStartGroup(int i10) {
        this.f19537a.M0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeString(int i10, String str) {
        this.f19537a.K0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeStringList(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof C)) {
            while (i11 < list.size()) {
                this.f19537a.K0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            C c10 = (C) list;
            while (i11 < list.size()) {
                C(i10, c10.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeUInt32(int i10, int i11) {
        this.f19537a.N0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeUInt32List(int i10, List list, boolean z10) {
        if (!(list instanceof AbstractC2148x)) {
            M(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            L(i10, null, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeUInt64(int i10, long j10) {
        this.f19537a.P0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.s0
    public void writeUInt64List(int i10, List list, boolean z10) {
        if (!(list instanceof G)) {
            O(i10, list, z10);
        } else {
            android.support.v4.media.session.b.a(list);
            N(i10, null, z10);
        }
    }

    public final void x(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.o0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.q(((Float) list.get(i13)).floatValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.p0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    public final void y(int i10, AbstractC2148x abstractC2148x, boolean z10) {
        if (!z10) {
            throw null;
        }
        this.f19537a.M0(i10, 2);
        throw null;
    }

    public final void z(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19537a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f19537a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC2135j.v(((Integer) list.get(i13)).intValue());
        }
        this.f19537a.O0(i12);
        while (i11 < list.size()) {
            this.f19537a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }
}
