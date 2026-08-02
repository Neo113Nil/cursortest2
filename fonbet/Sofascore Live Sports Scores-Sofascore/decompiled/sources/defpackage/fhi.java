package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fhi extends k53 implements vfa {
    public final fjg o;
    public final yea p;
    public final eml q;
    public final vfa[] r;
    public final p5c s;
    public final gfa t;
    public boolean u;
    public String v;
    public String w;

    public fhi(fjg fjgVar, yea yeaVar, eml emlVar, vfa[] vfaVarArr) {
        fjgVar.getClass();
        this.o = fjgVar;
        this.p = yeaVar;
        this.q = emlVar;
        this.r = vfaVarArr;
        this.s = yeaVar.b;
        this.t = yeaVar.a;
        int ordinal = emlVar.ordinal();
        if (vfaVarArr != null) {
            vfa vfaVar = vfaVarArr[ordinal];
            if (vfaVar == null && vfaVar == this) {
                return;
            }
            vfaVarArr[ordinal] = this;
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void B(int i) {
        if (this.u) {
            F(String.valueOf(i));
        } else {
            this.o.m(i);
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void F(String str) {
        str.getClass();
        this.o.q(str);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final p5c a() {
        return this.s;
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final wf3 b(SerialDescriptor serialDescriptor) {
        vfa vfaVar;
        serialDescriptor.getClass();
        yea yeaVar = this.p;
        eml x = oea.x(yeaVar, serialDescriptor);
        char c = x.a;
        fjg fjgVar = this.o;
        fjgVar.l(c);
        fjgVar.d();
        String str = this.v;
        if (str != null) {
            String str2 = this.w;
            if (str2 == null) {
                str2 = serialDescriptor.h();
            }
            fjgVar.g();
            fjgVar.q(str);
            fjgVar.l(':');
            fjgVar.s();
            F(str2);
            this.v = null;
            this.w = null;
        }
        if (this.q == x) {
            return this;
        }
        vfa[] vfaVarArr = this.r;
        return (vfaVarArr == null || (vfaVar = vfaVarArr[x.ordinal()]) == null) ? new fhi(fjgVar, yeaVar, x, vfaVarArr) : vfaVar;
    }

    @Override // defpackage.k53, defpackage.wf3
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        fjg fjgVar = this.o;
        fjgVar.t();
        fjgVar.i();
        fjgVar.l(this.q.b);
    }

    @Override // defpackage.k53
    public final void c0(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int ordinal = this.q.ordinal();
        fjg fjgVar = this.o;
        boolean z = true;
        if (ordinal == 1) {
            if (!fjgVar.a) {
                fjgVar.l(',');
            }
            fjgVar.g();
            return;
        }
        if (ordinal == 2) {
            if (fjgVar.a) {
                this.u = true;
                fjgVar.g();
                return;
            }
            if (i % 2 == 0) {
                fjgVar.l(',');
                fjgVar.g();
            } else {
                fjgVar.l(':');
                fjgVar.s();
                z = false;
            }
            this.u = z;
            return;
        }
        if (ordinal != 3) {
            if (!fjgVar.a) {
                fjgVar.l(',');
            }
            fjgVar.g();
            hz8.Q(this.p, serialDescriptor);
            F(serialDescriptor.e(i));
            fjgVar.l(':');
            fjgVar.s();
            return;
        }
        if (i == 0) {
            this.u = true;
        }
        if (i == 1) {
            fjgVar.l(',');
            fjgVar.s();
            this.u = false;
        }
    }

    @Override // defpackage.vfa
    public final yea d() {
        return this.p;
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void e(double d) {
        if (this.u) {
            F(String.valueOf(d));
        } else {
            ((yz1) this.o.b).g(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw yfa.a(Double.valueOf(d), null);
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void g(byte b) {
        if (this.u) {
            F(String.valueOf((int) b));
        } else {
            this.o.j(b);
        }
    }

    @Override // defpackage.k53, defpackage.wf3
    public final void h(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (obj != null || this.t.f) {
            super.h(serialDescriptor, i, kSerializer, obj);
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        F(serialDescriptor.e(i));
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final Encoder k(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean a = ghi.a(serialDescriptor);
        eml emlVar = this.q;
        yea yeaVar = this.p;
        fjg fjgVar = this.o;
        if (a) {
            if (!(fjgVar instanceof rf3)) {
                fjgVar = new rf3((yz1) fjgVar.b, this.u);
            }
            return new fhi(fjgVar, yeaVar, emlVar, null);
        }
        if (serialDescriptor.isInline() && serialDescriptor.equals(qfa.a)) {
            if (!(fjgVar instanceof qf3)) {
                fjgVar = new qf3((yz1) fjgVar.b, this.u);
            }
            return new fhi(fjgVar, yeaVar, emlVar, null);
        }
        if (this.v != null) {
            this.w = serialDescriptor.h();
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r1, defpackage.nii.i) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1 != defpackage.sv2.a) goto L20;
     */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(KSerializer kSerializer, Object obj) {
        String D;
        KSerializer kSerializer2;
        kSerializer.getClass();
        yea yeaVar = this.p;
        boolean z = kSerializer instanceof e7;
        sv2 sv2Var = yeaVar.a.k;
        if (!z) {
            int ordinal = sv2Var.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    mha kind = kSerializer.getDescriptor().getKind();
                    if (!Intrinsics.c(kind, nii.f)) {
                    }
                    D = aik.D(yeaVar, kSerializer.getDescriptor());
                } else if (ordinal != 2) {
                    zzl.b();
                    return;
                }
            }
            D = null;
        }
        if (z) {
            e7 e7Var = (e7) kSerializer;
            if (obj == null) {
                pvd.A(e7Var.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.", "Value for serializer ");
                return;
            }
            kSerializer2 = mha.n(e7Var, this, obj);
        } else {
            kSerializer2 = kSerializer;
        }
        if (D != null) {
            aik.z(yeaVar, kSerializer, kSerializer2, D);
            aik.A(kSerializer2.getDescriptor().getKind());
            String h = kSerializer2.getDescriptor().h();
            this.v = D;
            this.w = h;
        }
        kSerializer2.serialize(this, obj);
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void m(long j) {
        if (this.u) {
            F(String.valueOf(j));
        } else {
            this.o.n(j);
        }
    }

    @Override // defpackage.wf3
    public final boolean o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.t.a;
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void p() {
        this.o.o("null");
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void r(short s) {
        if (this.u) {
            F(String.valueOf((int) s));
        } else {
            this.o.p(s);
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void s(boolean z) {
        if (this.u) {
            F(String.valueOf(z));
        } else {
            ((yz1) this.o.b).g(String.valueOf(z));
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void v(float f) {
        if (this.u) {
            F(String.valueOf(f));
        } else {
            ((yz1) this.o.b).g(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw yfa.a(Float.valueOf(f), null);
        }
    }

    @Override // defpackage.k53, kotlinx.serialization.encoding.Encoder
    public final void w(char c) {
        F(String.valueOf(c));
    }

    @Override // defpackage.vfa
    public final void z(b bVar) {
        bVar.getClass();
        if (this.v == null || (bVar instanceof c)) {
            l(sfa.a, bVar);
        } else {
            aik.i0(this.w, bVar);
            throw null;
        }
    }
}
