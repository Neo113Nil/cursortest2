package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3480l implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3479k f37334a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[q0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[q0.b.f37388j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37387i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37385g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37395q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37397s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37393o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37386h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37383e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37396r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37398t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37384f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[q0.b.f37389k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C3480l(AbstractC3479k abstractC3479k) {
        AbstractC3479k abstractC3479k2 = (AbstractC3479k) AbstractC3493z.b(abstractC3479k, "output");
        this.f37334a = abstractC3479k2;
        abstractC3479k2.f37329a = this;
    }

    public static C3480l g(AbstractC3479k abstractC3479k) {
        C3480l c3480l = abstractC3479k.f37329a;
        return c3480l != null ? c3480l : new C3480l(abstractC3479k);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void a(int i10, H.a aVar, Map map) {
        if (this.f37334a.T()) {
            h(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f37334a.D0(i10, 2);
            this.f37334a.F0(H.a(aVar, entry.getKey(), entry.getValue()));
            H.b(this.f37334a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void b(int i10, Object obj, e0 e0Var) {
        this.f37334a.l0(i10, (O) obj, e0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void c(int i10, List list, e0 e0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            e(i10, list.get(i11), e0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void d(int i10, AbstractC3476h abstractC3476h) {
        this.f37334a.a0(i10, abstractC3476h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void e(int i10, Object obj, e0 e0Var) {
        this.f37334a.r0(i10, (O) obj, e0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void f(int i10, List list, e0 e0Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            b(i10, list.get(i11), e0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public r0.a fieldOrder() {
        return r0.a.ASCENDING;
    }

    public final void h(int i10, H.a aVar, Map map) {
        int[] iArr = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType;
        throw null;
    }

    public final void i(int i10, Object obj) {
        if (obj instanceof String) {
            this.f37334a.C0(i10, (String) obj);
        } else {
            this.f37334a.a0(i10, (AbstractC3476h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeBool(int i10, boolean z10) {
        this.f37334a.Y(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeBoolList(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.Y(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.e(((Boolean) list.get(i13)).booleanValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.Z(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeBytesList(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f37334a.a0(i10, (AbstractC3476h) list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeDouble(int i10, double d10) {
        this.f37334a.b0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeDoubleList(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.b0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.i(((Double) list.get(i13)).doubleValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.c0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeEndGroup(int i10) {
        this.f37334a.D0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeEnum(int i10, int i11) {
        this.f37334a.d0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeEnumList(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.d0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.k(((Integer) list.get(i13)).intValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.e0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeFixed32(int i10, int i11) {
        this.f37334a.f0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeFixed32List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.m(((Integer) list.get(i13)).intValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeFixed64(int i10, long j10) {
        this.f37334a.h0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeFixed64List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.o(((Long) list.get(i13)).longValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeFloat(int i10, float f10) {
        this.f37334a.j0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeFloatList(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.j0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.q(((Float) list.get(i13)).floatValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.k0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeInt32(int i10, int i11) {
        this.f37334a.n0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeInt32List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.n0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.u(((Integer) list.get(i13)).intValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.o0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeInt64(int i10, long j10) {
        this.f37334a.p0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeInt64List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.p0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.w(((Long) list.get(i13)).longValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void writeMessageSetItem(int i10, Object obj) {
        if (obj instanceof AbstractC3476h) {
            this.f37334a.t0(i10, (AbstractC3476h) obj);
        } else {
            this.f37334a.s0(i10, (O) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSFixed32(int i10, int i11) {
        this.f37334a.u0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSFixed32List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.C(((Integer) list.get(i13)).intValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSFixed64(int i10, long j10) {
        this.f37334a.w0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSFixed64List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.E(((Long) list.get(i13)).longValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSInt32(int i10, int i11) {
        this.f37334a.y0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSInt32List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.y0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.G(((Integer) list.get(i13)).intValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.z0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSInt64(int i10, long j10) {
        this.f37334a.A0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeSInt64List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.A0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.I(((Long) list.get(i13)).longValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.B0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeStartGroup(int i10) {
        this.f37334a.D0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeString(int i10, String str) {
        this.f37334a.C0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeStringList(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof D)) {
            while (i11 < list.size()) {
                this.f37334a.C0(i10, (String) list.get(i11));
                i11++;
            }
        } else {
            D d10 = (D) list;
            while (i11 < list.size()) {
                i(i10, d10.getRaw(i11));
                i11++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeUInt32(int i10, int i11) {
        this.f37334a.E0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeUInt32List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.E0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.N(((Integer) list.get(i13)).intValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.F0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeUInt64(int i10, long j10) {
        this.f37334a.G0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void writeUInt64List(int i10, List list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f37334a.G0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37334a.D0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC3479k.P(((Long) list.get(i13)).longValue());
        }
        this.f37334a.F0(i12);
        while (i11 < list.size()) {
            this.f37334a.H0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
