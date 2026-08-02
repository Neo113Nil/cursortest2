package defpackage;

import androidx.appcompat.app.AppCompatActivity;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ne implements qtk {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ne(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0750  */
    @Override // defpackage.qtk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ltk a(Class cls, qzc qzcVar) {
        ltk ltkVar;
        mtk mtkVar;
        ntk ntkVar;
        Function1 function1;
        int i = 0;
        Object[] objArr = 0;
        ltk ltkVar2 = null;
        switch (this.a) {
            case 0:
                return new pe(new ic4(((mc4) ((oe) l98.T((AppCompatActivity) this.b, oe.class))).h), new fjg((Object) qzcVar, (byte) (objArr == true ? 1 : 0)));
            case 1:
                final d3g d3gVar = new d3g();
                z41 z41Var = (z41) this.b;
                pc4 pc4Var = new pc4((mc4) z41Var.b, (ic4) z41Var.c, yso.w(qzcVar));
                pc4 pc4Var2 = (pc4) ((ya9) fz8.Q(ya9.class, pc4Var));
                pc4Var2.getClass();
                b10 e = lv9.e(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
                e.A("vj", pc4Var2.c);
                e.A("q81", pc4Var2.d);
                e.A("qk1", pc4Var2.e);
                e.A("eu1", pc4Var2.f);
                e.A("su1", pc4Var2.g);
                e.A("dv1", pc4Var2.h);
                e.A("k92", pc4Var2.j);
                e.A("pq2", pc4Var2.k);
                e.A("br2", pc4Var2.l);
                e.A("us2", pc4Var2.m);
                e.A("ku2", pc4Var2.o);
                e.A("p63", pc4Var2.p);
                e.A("la3", pc4Var2.q);
                e.A("tr3", pc4Var2.r);
                e.A("ks3", pc4Var2.s);
                e.A("ov3", pc4Var2.t);
                e.A("w24", pc4Var2.u);
                e.A("q54", pc4Var2.v);
                e.A("n84", pc4Var2.w);
                e.A("ai4", pc4Var2.x);
                e.A("q05", pc4Var2.y);
                e.A("kd5", pc4Var2.z);
                e.A("sh5", pc4Var2.A);
                e.A("th5", pc4Var2.B);
                e.A("di5", pc4Var2.C);
                e.A("hi5", pc4Var2.D);
                e.A("mr5", pc4Var2.F);
                e.A("xs5", pc4Var2.G);
                e.A("ct5", pc4Var2.H);
                e.A("kv5", pc4Var2.I);
                e.A("hw5", pc4Var2.J);
                e.A("zw5", pc4Var2.K);
                e.A("dz5", pc4Var2.L);
                e.A("nz5", pc4Var2.M);
                e.A("p06", pc4Var2.N);
                e.A("w06", pc4Var2.O);
                e.A("n16", pc4Var2.P);
                e.A("u16", pc4Var2.Q);
                e.A("r36", pc4Var2.R);
                e.A("d46", pc4Var2.S);
                e.A("p46", pc4Var2.T);
                e.A("y46", pc4Var2.U);
                e.A("b66", pc4Var2.V);
                e.A("w66", pc4Var2.W);
                e.A("bc6", pc4Var2.X);
                e.A("mc6", pc4Var2.Y);
                e.A("nc6", pc4Var2.Z);
                e.A("yd6", pc4Var2.a0);
                e.A("lo6", pc4Var2.b0);
                e.A("hp6", pc4Var2.c0);
                e.A("cq6", pc4Var2.d0);
                e.A("nr6", pc4Var2.g0);
                e.A("qr6", pc4Var2.h0);
                e.A("is6", pc4Var2.i0);
                e.A("pu6", pc4Var2.j0);
                e.A("xu6", pc4Var2.k0);
                e.A("cv6", pc4Var2.l0);
                e.A("mv6", pc4Var2.m0);
                e.A("yv6", pc4Var2.n0);
                e.A("dw6", pc4Var2.o0);
                e.A("kw6", pc4Var2.p0);
                e.A("ax6", pc4Var2.q0);
                e.A("ay6", pc4Var2.r0);
                e.A("jz6", pc4Var2.s0);
                e.A("lz6", pc4Var2.t0);
                e.A("j07", pc4Var2.u0);
                e.A("p07", pc4Var2.v0);
                e.A("y07", pc4Var2.w0);
                e.A("e17", pc4Var2.x0);
                e.A("k17", pc4Var2.y0);
                e.A("h27", pc4Var2.z0);
                e.A("n27", pc4Var2.A0);
                e.A("j37", pc4Var2.B0);
                e.A("d47", pc4Var2.C0);
                e.A("m47", pc4Var2.D0);
                e.A("e57", pc4Var2.E0);
                e.A("r57", pc4Var2.F0);
                e.A("h67", pc4Var2.G0);
                e.A("r77", pc4Var2.H0);
                e.A("n87", pc4Var2.I0);
                e.A("t97", pc4Var2.J0);
                e.A("ia7", pc4Var2.K0);
                e.A("ta7", pc4Var2.L0);
                e.A("ob7", pc4Var2.M0);
                e.A("wb7", pc4Var2.N0);
                e.A("gc7", pc4Var2.O0);
                e.A("yc7", pc4Var2.P0);
                e.A("te7", pc4Var2.Q0);
                e.A("if7", pc4Var2.R0);
                e.A("gk7", pc4Var2.S0);
                e.A("ml7", pc4Var2.T0);
                e.A("im7", pc4Var2.U0);
                e.A("tm7", pc4Var2.V0);
                e.A("ao7", pc4Var2.W0);
                e.A("vo7", pc4Var2.X0);
                e.A("vp7", pc4Var2.Y0);
                e.A("rr7", pc4Var2.Z0);
                e.A("is7", pc4Var2.a1);
                e.A("tu7", pc4Var2.b1);
                e.A("nv7", pc4Var2.c1);
                e.A("my7", pc4Var2.f1);
                e.A("qy7", pc4Var2.g1);
                e.A("com.sofascore.results.dialog.FollowSubStagesViewModel", pc4Var2.h1);
                e.A("ga9", pc4Var2.i1);
                e.A("ac9", pc4Var2.j1);
                e.A("yta", pc4Var2.k1);
                e.A("nua", pc4Var2.l1);
                e.A("kva", pc4Var2.n1);
                e.A("fwa", pc4Var2.o1);
                e.A("zwa", pc4Var2.p1);
                e.A("gya", pc4Var2.q1);
                e.A("eza", pc4Var2.r1);
                e.A("tza", pc4Var2.s1);
                e.A("o4b", pc4Var2.t1);
                e.A("xeb", pc4Var2.u1);
                e.A("njb", pc4Var2.v1);
                e.A("ypb", pc4Var2.w1);
                e.A("zqb", pc4Var2.x1);
                e.A("esb", pc4Var2.y1);
                e.A("osb", pc4Var2.z1);
                e.A("axb", pc4Var2.A1);
                e.A("dyb", pc4Var2.B1);
                e.A("e5c", pc4Var2.C1);
                e.A("nlc", pc4Var2.D1);
                e.A("emc", pc4Var2.E1);
                e.A("nmc", pc4Var2.F1);
                e.A("vmc", pc4Var2.G1);
                e.A("cnc", pc4Var2.H1);
                e.A("rnc", pc4Var2.I1);
                e.A("vnc", pc4Var2.J1);
                e.A("znc", pc4Var2.K1);
                e.A("ioc", pc4Var2.L1);
                e.A("qoc", pc4Var2.M1);
                e.A("fpc", pc4Var2.N1);
                e.A("kpc", pc4Var2.O1);
                e.A("vpc", pc4Var2.P1);
                e.A("aqc", pc4Var2.Q1);
                e.A("jqc", pc4Var2.R1);
                e.A("ebd", pc4Var2.S1);
                e.A("yfd", pc4Var2.T1);
                e.A("khd", pc4Var2.U1);
                e.A("com.sofascore.results.onboarding.OnboardingViewModel", pc4Var2.V1);
                e.A("b1e", pc4Var2.W1);
                e.A("v1e", pc4Var2.X1);
                e.A("y1e", pc4Var2.Y1);
                e.A("m2e", pc4Var2.Z1);
                e.A("r2e", pc4Var2.a2);
                e.A("e3e", pc4Var2.b2);
                e.A("ade", pc4Var2.c2);
                e.A("ple", pc4Var2.d2);
                e.A("ome", pc4Var2.e2);
                e.A("roe", pc4Var2.g2);
                e.A("fqe", pc4Var2.h2);
                e.A("qqe", pc4Var2.i2);
                e.A("jre", pc4Var2.j2);
                e.A("gte", pc4Var2.k2);
                e.A("nwe", pc4Var2.l2);
                e.A("f9f", pc4Var2.m2);
                e.A("q9f", pc4Var2.n2);
                e.A("t9f", pc4Var2.o2);
                e.A("ebf", pc4Var2.p2);
                e.A("fbf", pc4Var2.q2);
                e.A("sbf", pc4Var2.r2);
                e.A("ybf", pc4Var2.s2);
                e.A("mlf", pc4Var2.t2);
                e.A("qlf", pc4Var2.u2);
                e.A("jsf", pc4Var2.v2);
                e.A("rsf", pc4Var2.w2);
                e.A("zsf", pc4Var2.x2);
                e.A("vtf", pc4Var2.y2);
                e.A("buf", pc4Var2.z2);
                e.A("bxg", pc4Var2.A2);
                e.A("pyg", pc4Var2.B2);
                e.A("mdh", pc4Var2.C2);
                e.A("kth", pc4Var2.D2);
                e.A("a0i", pc4Var2.E2);
                e.A("g1i", pc4Var2.F2);
                e.A("r1i", pc4Var2.G2);
                e.A("d3i", pc4Var2.H2);
                e.A("q3i", pc4Var2.I2);
                e.A("g4i", pc4Var2.J2);
                e.A("n4i", pc4Var2.K2);
                e.A("p5i", pc4Var2.L2);
                e.A("j6i", pc4Var2.M2);
                e.A("h7i", pc4Var2.N2);
                e.A("h8i", pc4Var2.O2);
                e.A("o8i", pc4Var2.P2);
                e.A("rbi", pc4Var2.Q2);
                e.A("lci", pc4Var2.R2);
                e.A("aoi", pc4Var2.T2);
                e.A("dsi", pc4Var2.U2);
                e.A("nui", pc4Var2.V2);
                e.A("pvi", pc4Var2.W2);
                e.A("jwi", pc4Var2.X2);
                e.A("xwi", pc4Var2.Y2);
                e.A("txi", pc4Var2.Z2);
                e.A("tyi", pc4Var2.a3);
                e.A("y0j", pc4Var2.b3);
                e.A("g2j", pc4Var2.c3);
                e.A("l2j", pc4Var2.d3);
                e.A("y2j", pc4Var2.e3);
                e.A("n3j", pc4Var2.f3);
                e.A("q3j", pc4Var2.g3);
                e.A("l4j", pc4Var2.h3);
                e.A("klj", pc4Var2.i3);
                e.A("qlj", pc4Var2.j3);
                e.A("koj", pc4Var2.k3);
                e.A("muj", pc4Var2.l3);
                e.A("uvj", pc4Var2.m3);
                e.A("c0k", pc4Var2.n3);
                e.A("k0k", pc4Var2.o3);
                e.A("n0k", pc4Var2.p3);
                e.A("u3k", pc4Var2.r3);
                e.A("g4k", pc4Var2.s3);
                e.A("xdk", pc4Var2.t3);
                e.A("agk", pc4Var2.u3);
                e.A("dnk", pc4Var2.v3);
                e.A("onk", pc4Var2.w3);
                e.A("aok", pc4Var2.x3);
                e.A("j3l", pc4Var2.y3);
                e.A("p3l", pc4Var2.z3);
                e.A("com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel", pc4Var2.A3);
                e.A("l5l", pc4Var2.B3);
                e.A("qkl", pc4Var2.C3);
                e.A("ill", pc4Var2.D3);
                yff yffVar = (yff) e.c(true).get(cls.getName());
                Function1 function12 = (Function1) qzcVar.a.get(za9.d);
                pc4 pc4Var3 = (pc4) ((ya9) fz8.Q(ya9.class, pc4Var));
                pc4Var3.getClass();
                Object obj = pc4Var3.E3.get();
                Object obj2 = pc4Var3.F3.get();
                Object obj3 = pc4Var3.G3.get();
                Object obj4 = pc4Var3.H3.get();
                Object obj5 = pc4Var3.I3.get();
                yqo.v("ij", obj);
                yqo.v("kk", obj2);
                yqo.v("ov5", obj3);
                yqo.v("c36", obj4);
                yqo.v("l66", obj5);
                Object obj6 = awf.j(5, new Object[]{"ij", obj, "kk", obj2, "ov5", obj3, "c36", obj4, "l66", obj5}, null).get(cls.getName());
                if (obj6 != null) {
                    if (yffVar != null) {
                        sw9.r(cls.getName(), " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.", "Found the @HiltViewModel-annotated class ");
                    } else if (function12 != null) {
                        ltkVar = (ltk) function12.invoke(obj6);
                        ltkVar2 = ltkVar;
                        Closeable closeable = new Closeable() { // from class: wa9
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                d3g.this.a();
                            }
                        };
                        ltkVar2.getClass();
                        mtkVar = ltkVar2.a;
                        if (mtkVar.d) {
                        }
                    } else {
                        a70.l(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                    }
                    return ltkVar2;
                }
                if (function12 != null) {
                    a70.l(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                } else if (yffVar != null) {
                    ltkVar = (ltk) yffVar.get();
                    ltkVar2 = ltkVar;
                    Closeable closeable2 = new Closeable() { // from class: wa9
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            d3g.this.a();
                        }
                    };
                    ltkVar2.getClass();
                    mtkVar = ltkVar2.a;
                    if (mtkVar.d) {
                        synchronized (mtkVar.a) {
                            mtkVar.c.add(closeable2);
                            Unit unit = Unit.a;
                        }
                    } else {
                        mtk.a(closeable2);
                    }
                } else {
                    a70.l(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                }
                return ltkVar2;
            default:
                KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(cls);
                ntk[] ntkVarArr = (ntk[]) this.b;
                ntk[] ntkVarArr2 = (ntk[]) Arrays.copyOf(ntkVarArr, ntkVarArr.length);
                orCreateKotlinClass.getClass();
                int length = ntkVarArr2.length;
                while (true) {
                    if (i < length) {
                        ntkVar = ntkVarArr2[i];
                        if (!Intrinsics.c(ntkVar.a, orCreateKotlinClass)) {
                            i++;
                        }
                    } else {
                        ntkVar = null;
                    }
                }
                ltk ltkVar3 = (ntkVar == null || (function1 = ntkVar.b) == null) ? null : (ltk) function1.invoke(qzcVar);
                if (ltkVar3 != null) {
                    return ltkVar3;
                }
                ogj.h(dmi.q("No initializer set for given class ", orCreateKotlinClass.getQualifiedName()));
                return null;
        }
    }
}
