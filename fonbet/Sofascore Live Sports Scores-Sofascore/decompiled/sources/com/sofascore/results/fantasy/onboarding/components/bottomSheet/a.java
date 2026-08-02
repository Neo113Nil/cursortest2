package com.sofascore.results.fantasy.onboarding.components.bottomSheet;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aee;
import defpackage.av8;
import defpackage.bkh;
import defpackage.eqf;
import defpackage.fqj;
import defpackage.hf3;
import defpackage.hkg;
import defpackage.if3;
import defpackage.l98;
import defpackage.mha;
import defpackage.nf3;
import defpackage.nq8;
import defpackage.nz;
import defpackage.oea;
import defpackage.of3;
import defpackage.qug;
import defpackage.r22;
import defpackage.rz8;
import defpackage.s6a;
import defpackage.t23;
import defpackage.u23;
import defpackage.utc;
import defpackage.uxf;
import defpackage.vxd;
import defpackage.waa;
import defpackage.wj7;
import defpackage.ww9;
import defpackage.xi7;
import defpackage.xtc;
import defpackage.zg3;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111 A[LOOP:0: B:33:0x010b->B:35:0x0111, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(FantasySectionedInfoType fantasySectionedInfoType, xtc xtcVar, qug qugVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        qug qugVar2;
        int i4;
        int i5;
        qug qugVar3;
        xtc xtcVar3;
        eqf u;
        qug o0;
        xtc xtcVar4;
        Integer a;
        xtc xtcVar5;
        qug qugVar4;
        boolean z;
        fantasySectionedInfoType.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1340108476);
        int i6 = (i & 6) == 0 ? i | (av8Var.g(fantasySectionedInfoType) ? 4 : 2) : i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i6 | (av8Var.g(xtcVar2) ? 32 : 16);
        }
        if ((i2 & 4) == 0) {
            qugVar2 = qugVar;
            if (av8Var.g(qugVar2)) {
                i4 = NotificationCompat.FLAG_LOCAL_ONLY;
                i5 = i3 | i4;
                int i8 = 1;
                if (av8Var.T(i5 & 1, (i5 & 147) == 146)) {
                    av8Var.W();
                    qugVar3 = qugVar2;
                    xtcVar3 = xtcVar2;
                } else {
                    av8Var.Y();
                    int i9 = i & 1;
                    utc utcVar = utc.a;
                    if (i9 == 0 || av8Var.B()) {
                        if (i7 != 0) {
                            xtcVar2 = utcVar;
                        }
                        if ((i2 & 4) != 0) {
                            o0 = hkg.o0(av8Var);
                            xtcVar4 = xtcVar2;
                            av8Var.t();
                            Context context = (Context) av8Var.k(nz.b);
                            xtc d0 = l98.d0(l98.f0(hkg.u0(xtcVar4, o0, false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fantasySectionedInfoType.getB() == null ? 16.0f : 48.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
                            int hashCode = Long.hashCode(av8Var.T);
                            aee m = av8Var.m();
                            xtc C = fqj.C(av8Var, d0);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.q0();
                            } else {
                                av8Var.l(zg3Var);
                            }
                            waa.K(av8Var, a2, hf3.g);
                            waa.K(av8Var, m, hf3.f);
                            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                            waa.J(av8Var, hf3.k);
                            waa.K(av8Var, C, hf3.d);
                            av8Var.d0(515654567);
                            for (wj7 wj7Var : fantasySectionedInfoType.X0()) {
                                rz8.i(s6a.N(wj7Var.a, 6, av8Var), wj7Var.b.a(av8Var), wj7Var.c.a(av8Var), null, av8Var, 0);
                                nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                            }
                            av8Var.s(false);
                            a = fantasySectionedInfoType.getA();
                            if (a != null) {
                                av8Var.d0(-1194266552);
                                av8Var.s(false);
                                z = true;
                                xtcVar5 = xtcVar4;
                                qugVar4 = o0;
                            } else {
                                av8Var.d0(-1194266551);
                                int intValue = a.intValue();
                                xtc f = vxd.f(utcVar, 56.0f, av8Var, utcVar, 1.0f);
                                String v = oea.v(R.string.fantasy_read_the_rules_button, av8Var);
                                boolean i10 = av8Var.i(context) | av8Var.e(intValue);
                                Object O = av8Var.O();
                                if (i10 || O == nf3.a) {
                                    O = new xi7(context, intValue, i8);
                                    av8Var.n0(O);
                                }
                                xtcVar5 = xtcVar4;
                                qugVar4 = o0;
                                mha.h(v, (Function0) O, f, null, null, false, false, false, 0L, 0, 0, av8Var, 384, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                                av8Var.s(false);
                                z = true;
                            }
                            av8Var.s(z);
                            xtcVar3 = xtcVar5;
                            qugVar3 = qugVar4;
                        }
                    } else {
                        av8Var.W();
                    }
                    xtcVar4 = xtcVar2;
                    o0 = qugVar2;
                    av8Var.t();
                    Context context2 = (Context) av8Var.k(nz.b);
                    xtc d02 = l98.d0(l98.f0(hkg.u0(xtcVar4, o0, false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fantasySectionedInfoType.getB() == null ? 16.0f : 48.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a22 = t23.a(ww9.d, uxf.o, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, d02);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a22, hf3.g);
                    waa.K(av8Var, m2, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C2, hf3.d);
                    av8Var.d0(515654567);
                    while (r15.hasNext()) {
                    }
                    av8Var.s(false);
                    a = fantasySectionedInfoType.getA();
                    if (a != null) {
                    }
                    av8Var.s(z);
                    xtcVar3 = xtcVar5;
                    qugVar3 = qugVar4;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new r22(fantasySectionedInfoType, xtcVar3, qugVar3, i, i2, 4);
                    return;
                }
                return;
            }
        } else {
            qugVar2 = qugVar;
        }
        i4 = 128;
        i5 = i3 | i4;
        int i82 = 1;
        if (av8Var.T(i5 & 1, (i5 & 147) == 146)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}
