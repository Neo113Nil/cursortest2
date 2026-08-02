package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class yo1 {
    public static final long a = hz8.i(40.0f, 40.0f);

    /* JADX WARN: Removed duplicated region for block: B:216:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(scj scjVar, xtc xtcVar, final boolean z, final q4a q4aVar, final dfj dfjVar, kja kjaVar, fja fjaVar, final abj abjVar, final n52 n52Var, final s9j s9jVar, final qug qugVar, of3 of3Var, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        boolean z2;
        av8 av8Var;
        int i5;
        int i6;
        boolean z3;
        wzc wzcVar;
        boolean z4;
        Object lcjVar;
        final jwj jwjVar;
        b1d b1dVar;
        int i7;
        kx4 kx4Var;
        int i8;
        int i9;
        boolean z5;
        final iy2 iy2Var;
        ema emaVar;
        cej cejVar;
        ku3 ku3Var;
        final eje ejeVar;
        ku3 ku3Var2;
        final lcj lcjVar2;
        boolean z6;
        boolean z7;
        ewd ewdVar;
        boolean z8;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(965149429);
        if ((i & 6) == 0) {
            i3 = (av8Var2.g(scjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var2.g(xtcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= av8Var2.h(false) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= av8Var2.g(q4aVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= av8Var2.g(dfjVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= av8Var2.g(kjaVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= av8Var2.g(fjaVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= av8Var2.g(abjVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= av8Var2.i(null) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (av8Var2.g(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var2.g(n52Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            obj = null;
            i4 |= av8Var2.g(null) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            obj = null;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var2.g(obj) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? av8Var2.g(s9jVar) : av8Var2.i(s9jVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= av8Var2.g(qugVar) ? 131072 : 65536;
        }
        int i10 = i4 | 1572864;
        if (av8Var2.T(i3 & 1, ((306783379 & i3) == 306783378 && (599187 & i10) == 599186) ? false : true)) {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            kx4 kx4Var2 = (kx4) av8Var2.k(dh3.h);
            ema emaVar2 = (ema) av8Var2.k(dh3.n);
            final boolean c = Intrinsics.c(abjVar, dti.h);
            av8Var2.d0(-2038132442);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var2);
            }
            wzc wzcVar2 = (wzc) O;
            av8Var2.s(false);
            ewd ewdVar2 = c ? ewd.b : ewd.a;
            boolean booleanValue = ((Boolean) xw3.z(wzcVar2, av8Var2, 0).getValue()).booleanValue();
            Object O2 = av8Var2.O();
            if (O2 == a99Var) {
                O2 = e.f(Boolean.FALSE);
                av8Var2.n0(O2);
            }
            e1d e1dVar = (e1d) O2;
            boolean g = av8Var2.g(wzcVar2);
            Object O3 = av8Var2.O();
            if (g || O3 == a99Var) {
                i5 = i3;
                O3 = new e85(wzcVar2, e1dVar, null, 0);
                av8Var2.n0(O3);
            } else {
                i5 = i3;
            }
            hz8.o(av8Var2, wzcVar2, (Function2) O3);
            final boolean booleanValue2 = ((Boolean) e1dVar.getValue()).booleanValue();
            if (booleanValue) {
                av8Var2.d0(-204276188);
                z3 = ((ata) ((s8l) av8Var2.k(dh3.u))).b();
                i6 = 0;
                av8Var2.s(false);
            } else {
                i6 = 0;
                av8Var2.d0(-2037593295);
                av8Var2.s(false);
                z3 = false;
            }
            Object O4 = av8Var2.O();
            if (O4 == a99Var) {
                wzcVar = wzcVar2;
                z4 = true;
                O4 = beh.b(1, i6, a62.c, 2);
                av8Var2.n0(O4);
            } else {
                wzcVar = wzcVar2;
                z4 = true;
            }
            b1d b1dVar2 = (b1d) O4;
            boolean z9 = ((i5 & 14) == 4 ? z4 : false) | ((i10 & 896) == 256) | ((i10 & 7168) == 2048);
            Object O5 = av8Var2.O();
            if (z9 || O5 == a99Var) {
                wxf wxfVar = wxf.i;
                if (!c) {
                    wxfVar = null;
                }
                O5 = new jwj(scjVar, q4aVar, wxfVar);
                av8Var2.n0(O5);
            }
            jwj jwjVar2 = (jwj) O5;
            boolean g2 = av8Var2.g(jwjVar2);
            Object O6 = av8Var2.O();
            if (g2 || O6 == a99Var) {
                O6 = new cej();
                av8Var2.n0(O6);
            }
            cej cejVar2 = (cej) O6;
            final kja b = kjaVar.b(q4aVar != null ? q4aVar.k() : null);
            Object O7 = av8Var2.O();
            if (O7 == a99Var) {
                O7 = hz8.G(g.a, av8Var2);
                av8Var2.n0(O7);
            }
            ku3 ku3Var3 = (ku3) O7;
            av8Var2.d0(-2035821392);
            eib eibVar = dfjVar.a.k;
            if (eibVar == null) {
                eib eibVar2 = eib.c;
                eibVar = pie.a.P();
            }
            u2h u2hVar = u2h.a;
            eje b2 = lje.b(eibVar, av8Var2);
            av8Var2.s(false);
            Object O8 = av8Var2.O();
            if (O8 == a99Var) {
                O8 = new kkj();
                av8Var2.n0(O8);
            }
            final kkj kkjVar = (kkj) O8;
            iy2 iy2Var2 = (iy2) av8Var2.k(dh3.f);
            boolean g3 = av8Var2.g(jwjVar2);
            Object O9 = av8Var2.O();
            if (g3 || O9 == a99Var) {
                boolean z10 = z3;
                jwjVar = jwjVar2;
                b1dVar = b1dVar2;
                av8Var = av8Var2;
                i7 = i10;
                kx4Var = kx4Var2;
                i8 = i5;
                i9 = 16384;
                lcjVar = new lcj(jwjVar, cejVar2, kx4Var, z, z10, kkjVar, ku3Var3, b2, iy2Var2);
                z5 = z10;
                iy2Var = iy2Var2;
                emaVar = emaVar2;
                cejVar = cejVar2;
                ku3Var = ku3Var3;
                ejeVar = b2;
                av8Var.n0(lcjVar);
            } else {
                cejVar = cejVar2;
                kx4Var = kx4Var2;
                emaVar = emaVar2;
                ejeVar = b2;
                z5 = z3;
                b1dVar = b1dVar2;
                jwjVar = jwjVar2;
                i7 = i10;
                i8 = i5;
                iy2Var = iy2Var2;
                i9 = 16384;
                ku3Var = ku3Var3;
                lcjVar = O9;
                av8Var = av8Var2;
            }
            lcj lcjVar3 = (lcj) lcjVar;
            final z69 z69Var = (z69) av8Var.k(dh3.l);
            boolean g4 = av8Var.g((efj) av8Var.k(dh3.r)) | av8Var.g(ku3Var);
            Object O10 = av8Var.O();
            if (g4 || O10 == a99Var) {
                O10 = new vo1();
                av8Var.n0(O10);
            }
            final vo1 vo1Var = (vo1) O10;
            boolean g5 = av8Var.g(jwjVar) | ((57344 & i8) == i9) | av8Var.i(lcjVar3) | av8Var.i(z69Var) | av8Var.i(iy2Var) | av8Var.g(vo1Var) | av8Var.g(kx4Var) | ((i8 & 896) == 256) | ((i8 & 7168) == 2048) | ((i7 & 3670016) == 1048576);
            Object O11 = av8Var.O();
            if (g5 || O11 == a99Var) {
                ku3Var2 = ku3Var;
                final kx4 kx4Var3 = kx4Var;
                lcjVar2 = lcjVar3;
                Function0 function0 = new Function0(q4aVar, lcjVar2, z69Var, iy2Var, vo1Var, kx4Var3, z) { // from class: lo1
                    public final /* synthetic */ q4a b;
                    public final /* synthetic */ lcj c;
                    public final /* synthetic */ z69 d;
                    public final /* synthetic */ iy2 e;
                    public final /* synthetic */ kx4 f;
                    public final /* synthetic */ boolean g;

                    {
                        this.f = kx4Var3;
                        this.g = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        u8j u8jVar;
                        g9i g9iVar;
                        jwj.this.b = this.b;
                        lcj lcjVar4 = this.c;
                        boolean z11 = this.g;
                        if (!z11 && (u8jVar = lcjVar4.e.a) != null && (g9iVar = u8jVar.u) != null) {
                            g9iVar.e(null);
                            u8jVar.u = null;
                        }
                        lcjVar4.j = this.d;
                        lcjVar4.h = this.e;
                        lcjVar4.c = this.f;
                        lcjVar4.i = z11;
                        return Unit.a;
                    }
                };
                z6 = z;
                av8Var.n0(function0);
                O11 = function0;
            } else {
                z6 = z;
                ku3Var2 = ku3Var;
                lcjVar2 = lcjVar3;
            }
            hz8.t((Function0) O11, av8Var);
            boolean i11 = av8Var.i(lcjVar2);
            Object O12 = av8Var.O();
            if (i11 || O12 == a99Var) {
                z7 = false;
                O12 = new qo1(lcjVar2, 0);
                av8Var.n0(O12);
            } else {
                z7 = false;
            }
            hz8.d(lcjVar2, (Function1) O12, av8Var);
            int i12 = kjaVar.c;
            boolean z11 = (i12 == 7 || i12 == 8) ? z7 : true;
            boolean h = av8Var.h(z11) | av8Var.i(b1dVar);
            Object O13 = av8Var.O();
            if (h || O13 == a99Var) {
                O13 = new m1(z11, b1dVar, 1);
                av8Var.n0(O13);
            }
            boolean z12 = z7;
            final cej cejVar3 = cejVar;
            xtc z13 = iz8.H(xtcVar, z6, z11, (Function0) O13).z(new t9j(jwjVar, cejVar3, lcjVar2, q4aVar, z6, b, fjaVar, c, wzcVar, b1dVar));
            boolean z14 = (z && ((acj) ((eoh) lcjVar2.q).getValue()) == acj.a) ? true : z12;
            if (emaVar == ema.b) {
                ewdVar = ewdVar2;
                if (ewdVar != ewd.a) {
                    z8 = z12;
                    xtc a2 = bvg.a(z13, qugVar, ewdVar, null, z14, z8, wzcVar, 160);
                    kze.a.getClass();
                    xtc u = v9g.u(sea.w(a2, n9e.f), new s5h(25, lcjVar2, ku3Var2));
                    k1c c2 = e12.c(uxf.c, true);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, u);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, c2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    final ewd ewdVar3 = ewdVar;
                    final jwj jwjVar3 = jwjVar;
                    final boolean z15 = z5;
                    final lcj lcjVar4 = lcjVar2;
                    z2 = z;
                    lz.f(lcjVar4, z2, yqo.H(-673241599, av8Var, new Function2() { // from class: so1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            of3 of3Var2 = (of3) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            av8 av8Var3 = (av8) of3Var2;
                            if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                                s9j s9jVar2 = s9j.this;
                                if (s9jVar2 == null) {
                                    s9jVar2 = p4h.c;
                                }
                                final abj abjVar2 = abjVar;
                                final cej cejVar4 = cejVar3;
                                final dfj dfjVar2 = dfjVar;
                                final boolean z16 = z15;
                                final boolean z17 = booleanValue2;
                                final jwj jwjVar4 = jwjVar3;
                                final lcj lcjVar5 = lcjVar4;
                                final n52 n52Var2 = n52Var;
                                final boolean z18 = z;
                                final qug qugVar2 = qugVar;
                                final ewd ewdVar4 = ewdVar3;
                                final kkj kkjVar2 = kkjVar;
                                final eje ejeVar2 = ejeVar;
                                final boolean z19 = c;
                                final kja kjaVar2 = b;
                                s9jVar2.a(yqo.H(1969169726, av8Var3, new Function2() { // from class: uo1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        of3 of3Var3 = (of3) obj4;
                                        int intValue2 = ((Integer) obj5).intValue();
                                        av8 av8Var4 = (av8) of3Var3;
                                        if (av8Var4.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                            int i13 = abj.this instanceof zaj ? Integer.MAX_VALUE : 1;
                                            cej cejVar5 = cejVar4;
                                            xtc A = s9a.A(utc.a, new kr1(cejVar5, 15));
                                            wnn.K(1, i13);
                                            dfj dfjVar3 = dfjVar2;
                                            if (i13 != Integer.MAX_VALUE) {
                                                A = A.z(new n99(dfjVar3, 1, i13));
                                            }
                                            xtc B = wnn.B(A.z(new qcj(dfjVar3)));
                                            boolean z20 = z16;
                                            boolean z21 = z17;
                                            jwj jwjVar5 = jwjVar4;
                                            lcj lcjVar6 = lcjVar5;
                                            n52 n52Var3 = n52Var2;
                                            boolean z22 = z18;
                                            xtc z23 = B.z(new o9j(z20, z21, cejVar5, jwjVar5, lcjVar6, n52Var3, z22, qugVar2, ewdVar4, kkjVar2, ejeVar2));
                                            k1c c3 = e12.c(uxf.c, true);
                                            int hashCode2 = Long.hashCode(av8Var4.T);
                                            aee m2 = av8Var4.m();
                                            xtc C2 = fqj.C(av8Var4, z23);
                                            if3.k7.getClass();
                                            zg3 zg3Var2 = hf3.b;
                                            av8Var4.h0();
                                            if (av8Var4.S) {
                                                av8Var4.l(zg3Var2);
                                            } else {
                                                av8Var4.q0();
                                            }
                                            waa.K(av8Var4, c3, hf3.g);
                                            waa.K(av8Var4, m2, hf3.f);
                                            waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                                            waa.J(av8Var4, hf3.k);
                                            waa.K(av8Var4, C2, hf3.d);
                                            e12.a(0, av8Var4, new tcj(cejVar5, jwjVar5, dfjVar3, z19, kjaVar2));
                                            if (z22 && z20 && ((Boolean) ((eoh) lcjVar6.k).getValue()).booleanValue()) {
                                                av8Var4.d0(-810654004);
                                                yo1.f(lcjVar6, av8Var4, 0);
                                                av8Var4.d0(-810526873);
                                                yo1.e(lcjVar6, av8Var4, 0);
                                                av8Var4.s(false);
                                                av8Var4.s(false);
                                            } else {
                                                av8Var4.d0(-810390690);
                                                av8Var4.s(false);
                                            }
                                            av8Var4.s(true);
                                        } else {
                                            av8Var4.W();
                                        }
                                        return Unit.a;
                                    }
                                }), av8Var3, 6);
                            } else {
                                av8Var3.W();
                            }
                            return Unit.a;
                        }
                    }), av8Var, ((i8 >> 3) & 112) | 384);
                    av8Var.s(true);
                }
            } else {
                ewdVar = ewdVar2;
            }
            z8 = true;
            xtc a22 = bvg.a(z13, qugVar, ewdVar, null, z14, z8, wzcVar, 160);
            kze.a.getClass();
            xtc u2 = v9g.u(sea.w(a22, n9e.f), new s5h(25, lcjVar2, ku3Var2));
            k1c c22 = e12.c(uxf.c, true);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, u2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, c22, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            final ewd ewdVar32 = ewdVar;
            final jwj jwjVar32 = jwjVar;
            final boolean z152 = z5;
            final lcj lcjVar42 = lcjVar2;
            z2 = z;
            lz.f(lcjVar42, z2, yqo.H(-673241599, av8Var, new Function2() { // from class: so1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    of3 of3Var2 = (of3) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    av8 av8Var3 = (av8) of3Var2;
                    if (av8Var3.T(intValue & 1, (intValue & 3) != 2)) {
                        s9j s9jVar2 = s9j.this;
                        if (s9jVar2 == null) {
                            s9jVar2 = p4h.c;
                        }
                        final abj abjVar2 = abjVar;
                        final cej cejVar4 = cejVar3;
                        final dfj dfjVar2 = dfjVar;
                        final boolean z16 = z152;
                        final boolean z17 = booleanValue2;
                        final jwj jwjVar4 = jwjVar32;
                        final lcj lcjVar5 = lcjVar42;
                        final n52 n52Var2 = n52Var;
                        final boolean z18 = z;
                        final qug qugVar2 = qugVar;
                        final ewd ewdVar4 = ewdVar32;
                        final kkj kkjVar2 = kkjVar;
                        final eje ejeVar2 = ejeVar;
                        final boolean z19 = c;
                        final kja kjaVar2 = b;
                        s9jVar2.a(yqo.H(1969169726, av8Var3, new Function2() { // from class: uo1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                of3 of3Var3 = (of3) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                av8 av8Var4 = (av8) of3Var3;
                                if (av8Var4.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    int i13 = abj.this instanceof zaj ? Integer.MAX_VALUE : 1;
                                    cej cejVar5 = cejVar4;
                                    xtc A = s9a.A(utc.a, new kr1(cejVar5, 15));
                                    wnn.K(1, i13);
                                    dfj dfjVar3 = dfjVar2;
                                    if (i13 != Integer.MAX_VALUE) {
                                        A = A.z(new n99(dfjVar3, 1, i13));
                                    }
                                    xtc B = wnn.B(A.z(new qcj(dfjVar3)));
                                    boolean z20 = z16;
                                    boolean z21 = z17;
                                    jwj jwjVar5 = jwjVar4;
                                    lcj lcjVar6 = lcjVar5;
                                    n52 n52Var3 = n52Var2;
                                    boolean z22 = z18;
                                    xtc z23 = B.z(new o9j(z20, z21, cejVar5, jwjVar5, lcjVar6, n52Var3, z22, qugVar2, ewdVar4, kkjVar2, ejeVar2));
                                    k1c c3 = e12.c(uxf.c, true);
                                    int hashCode22 = Long.hashCode(av8Var4.T);
                                    aee m22 = av8Var4.m();
                                    xtc C22 = fqj.C(av8Var4, z23);
                                    if3.k7.getClass();
                                    zg3 zg3Var22 = hf3.b;
                                    av8Var4.h0();
                                    if (av8Var4.S) {
                                        av8Var4.l(zg3Var22);
                                    } else {
                                        av8Var4.q0();
                                    }
                                    waa.K(av8Var4, c3, hf3.g);
                                    waa.K(av8Var4, m22, hf3.f);
                                    waa.K(av8Var4, Integer.valueOf(hashCode22), hf3.j);
                                    waa.J(av8Var4, hf3.k);
                                    waa.K(av8Var4, C22, hf3.d);
                                    e12.a(0, av8Var4, new tcj(cejVar5, jwjVar5, dfjVar3, z19, kjaVar2));
                                    if (z22 && z20 && ((Boolean) ((eoh) lcjVar6.k).getValue()).booleanValue()) {
                                        av8Var4.d0(-810654004);
                                        yo1.f(lcjVar6, av8Var4, 0);
                                        av8Var4.d0(-810526873);
                                        yo1.e(lcjVar6, av8Var4, 0);
                                        av8Var4.s(false);
                                        av8Var4.s(false);
                                    } else {
                                        av8Var4.d0(-810390690);
                                        av8Var4.s(false);
                                    }
                                    av8Var4.s(true);
                                } else {
                                    av8Var4.W();
                                }
                                return Unit.a;
                            }
                        }), av8Var3, 6);
                    } else {
                        av8Var3.W();
                    }
                    return Unit.a;
                }
            }), av8Var, ((i8 >> 3) & 112) | 384);
            av8Var.s(true);
        } else {
            z2 = z;
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u3 = av8Var.u();
        if (u3 != null) {
            u3.d = new to1(scjVar, xtcVar, z2, q4aVar, dfjVar, kjaVar, fjaVar, abjVar, n52Var, s9jVar, qugVar, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final scj scjVar, final xtc xtcVar, final boolean z, q4a q4aVar, final dfj dfjVar, final kja kjaVar, final fja fjaVar, final abj abjVar, final n52 n52Var, final s9j s9jVar, qug qugVar, of3 of3Var, final int i, final int i2, final int i3) {
        int i4;
        xtc xtcVar2;
        boolean z2;
        dfj dfjVar2;
        int i5;
        int i6;
        final q4a q4aVar2;
        av8 av8Var;
        final qug qugVar2;
        eqf u;
        q4a q4aVar3;
        int i7;
        int i8;
        qug o0;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(469439921);
        if ((i & 6) == 0) {
            i4 = (av8Var2.g(scjVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 32 : 16;
        } else {
            xtcVar2 = xtcVar;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i4 |= av8Var2.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            z2 = z;
        }
        int i9 = i4 | 3072;
        int i10 = i3 & 16;
        if (i10 != 0) {
            i9 = i4 | 27648;
        } else if ((i & 24576) == 0) {
            i9 |= av8Var2.g(q4aVar) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                dfjVar2 = dfjVar;
                i9 |= av8Var2.g(dfjVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            } else {
                dfjVar2 = dfjVar;
            }
            if ((i & 1572864) == 0) {
                i9 |= av8Var2.g(kjaVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            if ((i & 12582912) == 0) {
                i9 |= av8Var2.g(fjaVar) ? 8388608 : 4194304;
            }
            if ((i & 100663296) == 0) {
                i9 |= av8Var2.g(abjVar) ? 67108864 : 33554432;
            }
            i5 = i9 | 805306368;
            int i11 = i2 | 6;
            if ((i2 & 48) == 0) {
                i11 |= av8Var2.g(n52Var) ? 32 : 16;
            }
            i6 = i11;
            if ((i3 & 4096) == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 |= av8Var2.g(null) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i2 & 3072) == 0) {
                i6 |= (i2 & 4096) == 0 ? av8Var2.g(s9jVar) : av8Var2.i(s9jVar) ? a.o : 1024;
            }
            if ((i2 & 24576) == 0) {
                i6 |= 8192;
            }
            if (av8Var2.T(i5 & 1, (306783379 & i5) == 306783378 || (i6 & 9363) != 9362)) {
                av8Var2.W();
                q4aVar2 = q4aVar;
                av8Var = av8Var2;
                qugVar2 = qugVar;
            } else {
                av8Var2.Y();
                if ((i & 1) == 0 || av8Var2.B()) {
                    q4aVar3 = i10 != 0 ? null : q4aVar;
                    i7 = i6 & (-57345);
                    i8 = i5;
                    o0 = hkg.o0(av8Var2);
                } else {
                    av8Var2.W();
                    i7 = i6 & (-57345);
                    i8 = i5;
                    q4aVar3 = q4aVar;
                    o0 = qugVar;
                }
                av8Var2.t();
                int i12 = 2147483646 & i8;
                int i13 = (i7 & 14) | 384 | (i7 & 112);
                int i14 = i7 << 3;
                q4a q4aVar4 = q4aVar3;
                a(scjVar, xtcVar2, z2, q4aVar4, dfjVar2, kjaVar, fjaVar, abjVar, n52Var, s9jVar, o0, av8Var2, i12, (i14 & 7168) | i13 | (i14 & 57344));
                q4aVar2 = q4aVar4;
                av8Var = av8Var2;
                qugVar2 = o0;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: ro1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int K = aba.K(i | 1);
                        int K2 = aba.K(i2);
                        yo1.b(scj.this, xtcVar, z, q4aVar2, dfjVar, kjaVar, fjaVar, abjVar, n52Var, s9jVar, qugVar2, (of3) obj, K, K2, i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        if ((196608 & i) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i5 = i9 | 805306368;
        int i112 = i2 | 6;
        if ((i2 & 48) == 0) {
        }
        i6 = i112;
        if ((i3 & 4096) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (av8Var2.T(i5 & 1, (306783379 & i5) == 306783378 || (i6 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void c(final wcj wcjVar, final Function1 function1, final xtc xtcVar, final boolean z, final dfj dfjVar, final kja kjaVar, final ija ijaVar, final boolean z2, final int i, final int i2, final jwk jwkVar, Function1 function12, final wzc wzcVar, final pvh pvhVar, final tc3 tc3Var, of3 of3Var, final int i3) {
        av8 av8Var;
        final Function1 function13;
        Function1 function14;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-971111025);
        int i4 = i3 | (av8Var2.g(wcjVar) ? 4 : 2) | (av8Var2.i(function1) ? 32 : 16) | (av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.h(z) ? a.o : 1024) | (av8Var2.h(false) ? 16384 : 8192) | (av8Var2.g(dfjVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var2.g(kjaVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var2.g(ijaVar) ? 8388608 : 4194304) | (av8Var2.h(z2) ? 67108864 : 33554432) | (av8Var2.e(i) ? 536870912 : 268435456);
        int i5 = 196608 | (av8Var2.e(i2) ? 4 : 2) | (av8Var2.g(jwkVar) ? 32 : 16) | 384 | (av8Var2.g(wzcVar) ? a.o : 1024) | (av8Var2.g(pvhVar) ? 16384 : 8192);
        if (av8Var2.T(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            av8Var2.Y();
            int i6 = i3 & 1;
            a99 a99Var = nf3.a;
            if (i6 == 0 || av8Var2.B()) {
                Object O = av8Var2.O();
                if (O == a99Var) {
                    O = new x91(8);
                    av8Var2.n0(O);
                }
                function14 = (Function1) O;
            } else {
                av8Var2.W();
                function14 = function12;
            }
            av8Var2.t();
            qu9 e = kjaVar.e(z2);
            boolean z3 = !z2;
            int i7 = z2 ? 1 : i2;
            int i8 = z2 ? 1 : i;
            boolean z4 = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object O2 = av8Var2.O();
            if (z4 || O2 == a99Var) {
                O2 = new s1(17, wcjVar, function1);
                av8Var2.n0(O2);
            }
            int i9 = i5 << 9;
            int i10 = (i4 & 910) | ((i4 >> 6) & 7168) | (i9 & 57344) | 196608 | (i9 & 3670016) | (i9 & 29360128);
            int i11 = ((i4 >> 15) & 896) | (i4 & 7168) | (i4 & 57344) | 196608;
            av8Var = av8Var2;
            Function1 function15 = function14;
            l98.e(wcjVar, (Function1) O2, xtcVar, dfjVar, jwkVar, function15, wzcVar, pvhVar, z3, i8, i7, e, ijaVar, z, false, tc3Var, av8Var, i10, i11);
            function13 = function15;
        } else {
            av8Var = av8Var2;
            av8Var.W();
            function13 = function12;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(function1, xtcVar, z, dfjVar, kjaVar, ijaVar, z2, i, i2, jwkVar, function13, wzcVar, pvhVar, tc3Var, i3) { // from class: oo1
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ xtc c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ dfj e;
                public final /* synthetic */ kja f;
                public final /* synthetic */ ija g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;
                public final /* synthetic */ int j;
                public final /* synthetic */ jwk k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ wzc m;
                public final /* synthetic */ pvh n;
                public final /* synthetic */ tc3 o;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    yo1.c(wcj.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, final Function1 function1, final xtc xtcVar, boolean z, boolean z2, final dfj dfjVar, kja kjaVar, ija ijaVar, final boolean z3, int i, int i2, jwk jwkVar, Function1 function12, wzc wzcVar, final pvh pvhVar, final tc3 tc3Var, of3 of3Var, final int i3, final int i4, final int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        kja kjaVar2;
        int i9;
        ija ijaVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        av8 av8Var;
        final int i19;
        final jwk jwkVar2;
        final Function1 function13;
        final wzc wzcVar2;
        final boolean z6;
        final boolean z7;
        final int i20;
        final ija ijaVar3;
        final kja kjaVar3;
        eqf u;
        int i21;
        int i22;
        Function1 function14;
        kja kjaVar4;
        ija ijaVar4;
        boolean z8;
        boolean z9;
        int i23;
        jwk jwkVar3;
        wzc wzcVar3;
        int i24;
        int i25;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (av8Var2.g(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i26 = i5 & 8;
        if (i26 != 0) {
            i6 |= 3072;
        } else if ((i3 & 3072) == 0) {
            z4 = z;
            i6 |= av8Var2.h(z4) ? a.o : 1024;
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else if ((i3 & 24576) == 0) {
                z5 = z2;
                i6 |= av8Var2.h(z5) ? 16384 : 8192;
                if ((i3 & 196608) == 0) {
                    i6 |= av8Var2.g(dfjVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
                }
                i8 = i5 & 64;
                if (i8 != 0) {
                    i6 |= 1572864;
                    kjaVar2 = kjaVar;
                } else {
                    kjaVar2 = kjaVar;
                    if ((i3 & 1572864) == 0) {
                        i6 |= av8Var2.g(kjaVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                i9 = i5 & 128;
                if (i9 != 0) {
                    i6 |= 12582912;
                    ijaVar2 = ijaVar;
                } else {
                    ijaVar2 = ijaVar;
                    if ((i3 & 12582912) == 0) {
                        i6 |= av8Var2.g(ijaVar2) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 100663296) == 0) {
                    i6 |= av8Var2.h(z3) ? 67108864 : 33554432;
                }
                if ((i3 & 805306368) == 0) {
                    if ((i5 & 512) == 0 && av8Var2.e(i)) {
                        i25 = 536870912;
                        i6 |= i25;
                    }
                    i25 = 268435456;
                    i6 |= i25;
                }
                i10 = i5 & 1024;
                if (i10 != 0) {
                    i12 = i4 | 6;
                    i11 = i10;
                } else {
                    i11 = i10;
                    i12 = i4 | (av8Var2.e(i2) ? 4 : 2);
                }
                i13 = i5 & a.o;
                if (i13 != 0) {
                    i15 = i12 | 48;
                    i14 = i13;
                } else {
                    i14 = i13;
                    i15 = i12 | (av8Var2.g(jwkVar) ? 32 : 16);
                }
                int i27 = i15;
                i16 = i6;
                int i28 = i27 | 384;
                i17 = i5 & 8192;
                if (i17 != 0) {
                    i18 = i27 | 3456;
                } else {
                    i18 = i28 | (av8Var2.g(wzcVar) ? a.o : 1024);
                }
                if ((i4 & 24576) == 0) {
                    i18 |= av8Var2.g(pvhVar) ? 16384 : 8192;
                }
                if (av8Var2.T(i16 & 1, (i16 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
                    av8Var2.Y();
                    int i29 = i3 & 1;
                    Object obj = nf3.a;
                    if (i29 == 0 || av8Var2.B()) {
                        if (i26 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            z5 = false;
                        }
                        if (i8 != 0) {
                            kjaVar2 = kja.g;
                        }
                        ija ijaVar5 = i9 != 0 ? ija.c : ijaVar2;
                        if ((i5 & 512) != 0) {
                            i21 = z3 ? 1 : Integer.MAX_VALUE;
                            i22 = i16 & (-1879048193);
                        } else {
                            i21 = i;
                            i22 = i16;
                        }
                        int i30 = i11 != 0 ? 1 : i2;
                        jwk jwkVar4 = i14 != 0 ? wib.j : jwkVar;
                        ija ijaVar6 = ijaVar5;
                        Object O = av8Var2.O();
                        if (O == obj) {
                            O = new x91(9);
                            av8Var2.n0(O);
                        }
                        Function1 function15 = (Function1) O;
                        wzc wzcVar4 = i17 != 0 ? null : wzcVar;
                        kja kjaVar5 = kjaVar2;
                        function14 = function15;
                        kjaVar4 = kjaVar5;
                        ijaVar4 = ijaVar6;
                        z8 = z4;
                        z9 = z5;
                        i23 = i22;
                        jwkVar3 = jwkVar4;
                        wzcVar3 = wzcVar4;
                        i24 = i30;
                    } else {
                        av8Var2.W();
                        if ((i5 & 512) != 0) {
                            i23 = i16 & (-1879048193);
                            i24 = i2;
                            jwkVar3 = jwkVar;
                            wzcVar3 = wzcVar;
                        } else {
                            i24 = i2;
                            jwkVar3 = jwkVar;
                            wzcVar3 = wzcVar;
                            i23 = i16;
                        }
                        ijaVar4 = ijaVar2;
                        z8 = z4;
                        z9 = z5;
                        kjaVar4 = kjaVar2;
                        i21 = i;
                        function14 = function12;
                    }
                    av8Var2.t();
                    Object O2 = av8Var2.O();
                    if (O2 == obj) {
                        O2 = e.f(new wcj(6, 0L, str));
                        av8Var2.n0(O2);
                    }
                    e1d e1dVar = (e1d) O2;
                    wcj wcjVar = (wcj) e1dVar.getValue();
                    int i31 = i24;
                    wcj wcjVar2 = new wcj(new q80(str), wcjVar.b, wcjVar.c);
                    boolean g = av8Var2.g(wcjVar2);
                    Object O3 = av8Var2.O();
                    if (g || O3 == obj) {
                        O3 = new j4(24, wcjVar2, e1dVar);
                        av8Var2.n0(O3);
                    }
                    hz8.t((Function0) O3, av8Var2);
                    boolean z10 = (i23 & 14) == 4;
                    Object O4 = av8Var2.O();
                    if (z10 || O4 == obj) {
                        O4 = e.f(str);
                        av8Var2.n0(O4);
                    }
                    Object obj2 = (e1d) O4;
                    qu9 e = kjaVar4.e(z3);
                    boolean z11 = !z3;
                    int i32 = z3 ? 1 : i31;
                    int i33 = i18;
                    int i34 = z3 ? 1 : i21;
                    boolean g2 = av8Var2.g(obj2) | ((i23 & 112) == 32);
                    Object O5 = av8Var2.O();
                    if (g2 || O5 == obj) {
                        O5 = new fa(8, (Object) e1dVar, obj2, function1);
                        av8Var2.n0(O5);
                    }
                    int i35 = i33 << 9;
                    av8Var = av8Var2;
                    l98.e(wcjVar2, (Function1) O5, xtcVar, dfjVar, jwkVar3, function14, wzcVar3, pvhVar, z11, i34, i32, e, ijaVar4, z8, z9, tc3Var, av8Var, (i23 & 896) | ((i23 >> 6) & 7168) | (i35 & 57344) | 196608 | (3670016 & i35) | (i35 & 29360128), ((i23 >> 15) & 896) | (i23 & 7168) | (i23 & 57344) | 196608);
                    i20 = i31;
                    i19 = i21;
                    jwkVar2 = jwkVar3;
                    function13 = function14;
                    wzcVar2 = wzcVar3;
                    ijaVar3 = ijaVar4;
                    z6 = z8;
                    z7 = z9;
                    kjaVar3 = kjaVar4;
                } else {
                    av8Var = av8Var2;
                    av8Var.W();
                    i19 = i;
                    jwkVar2 = jwkVar;
                    function13 = function12;
                    wzcVar2 = wzcVar;
                    z6 = z4;
                    z7 = z5;
                    i20 = i2;
                    ijaVar3 = ijaVar2;
                    kjaVar3 = kjaVar2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new Function2() { // from class: po1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int K = aba.K(i3 | 1);
                            int K2 = aba.K(i4);
                            yo1.d(str, function1, xtcVar, z6, z7, dfjVar, kjaVar3, ijaVar3, z3, i19, i20, jwkVar2, function13, wzcVar2, pvhVar, tc3Var, (of3) obj3, K, K2, i5);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            z5 = z2;
            if ((i3 & 196608) == 0) {
            }
            i8 = i5 & 64;
            if (i8 != 0) {
            }
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            if ((i3 & 100663296) == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i10 = i5 & 1024;
            if (i10 != 0) {
            }
            i13 = i5 & a.o;
            if (i13 != 0) {
            }
            int i272 = i15;
            i16 = i6;
            int i282 = i272 | 384;
            i17 = i5 & 8192;
            if (i17 != 0) {
            }
            if ((i4 & 24576) == 0) {
            }
            if (av8Var2.T(i16 & 1, (i16 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z4 = z;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        z5 = z2;
        if ((i3 & 196608) == 0) {
        }
        i8 = i5 & 64;
        if (i8 != 0) {
        }
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        if ((i3 & 100663296) == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i10 = i5 & 1024;
        if (i10 != 0) {
        }
        i13 = i5 & a.o;
        if (i13 != 0) {
        }
        int i2722 = i15;
        i16 = i6;
        int i2822 = i2722 | 384;
        i17 = i5 & 8192;
        if (i17 != 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        if (av8Var2.T(i16 & 1, (i16 & 306783379) == 306783378 || (i18 & 74899) != 74898)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(lcj lcjVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1991581797);
        int i2 = (av8Var.i(lcjVar) ? 4 : 2) | i;
        int i3 = 0;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            boolean g = av8Var.g(lcjVar);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                O = goh.b(new mo1(lcjVar, i3));
                av8Var.n0(O);
            }
            if (((Boolean) ((cdi) O).getValue()).booleanValue()) {
                av8Var.d0(535437134);
                boolean i4 = av8Var.i(lcjVar);
                Object O2 = av8Var.O();
                if (i4 || O2 == a99Var) {
                    O2 = new wo1(lcjVar, 0);
                    av8Var.n0(O2);
                }
                pnd pndVar = (pnd) O2;
                boolean i5 = av8Var.i(lcjVar);
                Object O3 = av8Var.O();
                if (i5 || O3 == a99Var) {
                    O3 = new xo1(lcjVar, i3);
                    av8Var.n0(O3);
                }
                a00.a(pndVar, koi.a(utc.a, lcjVar, (PointerInputEventHandler) O3), a, av8Var, 384, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(535820573);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new no1(lcjVar, i, i3);
        }
    }

    public static final void f(lcj lcjVar, of3 of3Var, int i) {
        a99 a99Var;
        utc utcVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2025287684);
        int i2 = (av8Var.i(lcjVar) ? 4 : 2) | i;
        int i3 = 1;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            boolean g = av8Var.g(lcjVar);
            Object O = av8Var.O();
            a99 a99Var2 = nf3.a;
            if (g || O == a99Var2) {
                O = goh.b(new mo1(lcjVar, i3));
                av8Var.n0(O);
            }
            iaj iajVar = (iaj) ((cdi) O).getValue();
            boolean z = iajVar.a;
            utc utcVar2 = utc.a;
            if (z) {
                av8Var.d0(-354609545);
                boolean i4 = av8Var.i(lcjVar);
                Object O2 = av8Var.O();
                if (i4 || O2 == a99Var2) {
                    O2 = new wo1(lcjVar, 1);
                    av8Var.n0(O2);
                }
                pnd pndVar = (pnd) O2;
                d1g d1gVar = iajVar.d;
                boolean z2 = iajVar.e;
                boolean i5 = av8Var.i(lcjVar);
                Object O3 = av8Var.O();
                if (i5 || O3 == a99Var2) {
                    O3 = new xo1(lcjVar, i3);
                    av8Var.n0(O3);
                }
                utcVar = utcVar2;
                a99Var = a99Var2;
                fcp.Y(pndVar, true, d1gVar, z2, a, iajVar.c, koi.a(utcVar2, lcjVar, (PointerInputEventHandler) O3), av8Var, 24624, 0);
                av8Var.s(false);
            } else {
                a99Var = a99Var2;
                utcVar = utcVar2;
                av8Var.d0(-353981826);
                av8Var.s(false);
            }
            boolean g2 = av8Var.g(lcjVar);
            Object O4 = av8Var.O();
            if (g2 || O4 == a99Var) {
                O4 = goh.b(new mo1(lcjVar, 2));
                av8Var.n0(O4);
            }
            iaj iajVar2 = (iaj) ((cdi) O4).getValue();
            if (iajVar2.a) {
                av8Var.d0(-353488678);
                boolean i6 = av8Var.i(lcjVar);
                Object O5 = av8Var.O();
                if (i6 || O5 == a99Var) {
                    O5 = new wo1(lcjVar, 2);
                    av8Var.n0(O5);
                }
                pnd pndVar2 = (pnd) O5;
                d1g d1gVar2 = iajVar2.d;
                boolean z3 = iajVar2.e;
                boolean i7 = av8Var.i(lcjVar);
                Object O6 = av8Var.O();
                if (i7 || O6 == a99Var) {
                    O6 = new xo1(lcjVar, 2);
                    av8Var.n0(O6);
                }
                fcp.Y(pndVar2, false, d1gVar2, z3, a, iajVar2.c, koi.a(utcVar, lcjVar, (PointerInputEventHandler) O6), av8Var, 24624, 0);
                av8Var.s(false);
            } else {
                av8Var.d0(-352863842);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new no1(lcjVar, i, 1);
        }
    }
}
