package com.sofascore.results.dialog;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a99;
import defpackage.aee;
import defpackage.av8;
import defpackage.bf3;
import defpackage.bkh;
import defpackage.boh;
import defpackage.dfj;
import defpackage.eqf;
import defpackage.f50;
import defpackage.ff3;
import defpackage.fqj;
import defpackage.gi;
import defpackage.gv9;
import defpackage.hf3;
import defpackage.hkg;
import defpackage.hp1;
import defpackage.if3;
import defpackage.k8g;
import defpackage.kq9;
import defpackage.kv1;
import defpackage.l8g;
import defpackage.l98;
import defpackage.ljg;
import defpackage.lv1;
import defpackage.lz;
import defpackage.mz1;
import defpackage.nf3;
import defpackage.o3a;
import defpackage.o67;
import defpackage.o7g;
import defpackage.oea;
import defpackage.of3;
import defpackage.p28;
import defpackage.p4h;
import defpackage.ry;
import defpackage.s6a;
import defpackage.t23;
import defpackage.tee;
import defpackage.tol;
import defpackage.u23;
import defpackage.udj;
import defpackage.utc;
import defpackage.uxf;
import defpackage.waa;
import defpackage.wnn;
import defpackage.ww9;
import defpackage.wxf;
import defpackage.wzc;
import defpackage.xtc;
import defpackage.xth;
import defpackage.yf8;
import defpackage.zg3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:76:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(boolean z, tee teeVar, String str, int i, gv9 gv9Var, Function0 function0, Function1 function1, of3 of3Var, int i2) {
        boolean z2;
        int i3;
        wxf wxfVar = ww9.b;
        lv1 lv1Var = uxf.m;
        kv1 kv1Var = uxf.o;
        p4h p4hVar = ww9.d;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1843248589);
        int i4 = i2 | (av8Var.h(z) ? 4 : 2) | (av8Var.g(teeVar) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(i) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var.i(gv9Var) ? 16384 : 8192) | (av8Var.i(function0) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE) | (av8Var.i(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (av8Var.T(i4 & 1, (599187 & i4) != 599186)) {
            utc utcVar = utc.a;
            xtc b0 = l98.b0(bkh.d(utcVar, 1.0f), 24.0f);
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f, 7);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, f0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, (dfj) xth.s.getValue(), av8Var, ((i4 >> 6) & 14) | 48, 0, 131064);
            udj.c(oea.v(i, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.d(), av8Var, 48, 0, 131064);
            Collection values = teeVar.values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            xtc A = wnn.A(utcVar, o7g.a(16.0f));
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.n;
                av8Var.n0(O2);
            }
            xtc y = tol.y(A, true, true, true, D2, wzcVar, new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 1), av8Var, 0);
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, y);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode2);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C2, f50Var3);
            kq9.b(s6a.N(z2 ? R.drawable.ic_notification_deselected : R.drawable.ic_notification_active, 6, av8Var), null, bkh.l(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 16.0f), lz.D(R.color.primary_default, av8Var), av8Var, 432, 0);
            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            String upperCase = oea.v(z2 ? R.string.motorsport_unfollow_sessions_button : R.string.motorsport_follow_sessions_button, av8Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            yf8 yf8Var2 = xth.a;
            float f = 8.0f;
            utc utcVar2 = utcVar;
            udj.c(upperCase, d0, lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.a(), av8Var, 48, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            float f2 = 1.0f;
            xtc f02 = l98.f0(hkg.u0(bkh.d(utcVar2, 1.0f), hkg.o0(av8Var), false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            Iterator p = ljg.p(av8Var, C3, f50Var3, -930791399, gv9Var);
            while (p.hasNext()) {
                FollowSubStagesViewModel.SubStageInfo subStageInfo = (FollowSubStagesViewModel.SubStageInfo) p.next();
                xtc d = bkh.d(utcVar2, f2);
                long D3 = lz.D(R.color.n_lv_4, av8Var);
                Object O3 = av8Var.O();
                if (O3 == a99Var) {
                    O3 = mz1.e(av8Var);
                }
                wzc wzcVar2 = (wzc) O3;
                Object[] objArr2 = new Object[0];
                Object O4 = av8Var.O();
                if (O4 == a99Var) {
                    O4 = o67.o;
                    av8Var.n0(O4);
                }
                av8 av8Var2 = av8Var;
                xtc y2 = tol.y(d, true, true, true, D3, wzcVar2, new gi(12, (boh) o3a.N(objArr2, (Function0) O4, av8Var, 48), function1, subStageInfo), av8Var2, 0);
                l8g a4 = k8g.a(wxfVar, lv1Var, av8Var2, 48);
                int hashCode4 = Long.hashCode(av8Var2.T);
                aee m4 = av8Var2.m();
                xtc C4 = fqj.C(av8Var2, y2);
                if3.k7.getClass();
                zg3 zg3Var3 = hf3.b;
                av8Var2.h0();
                if (av8Var2.S) {
                    av8Var2.l(zg3Var3);
                } else {
                    av8Var2.q0();
                }
                waa.K(av8Var2, a4, hf3.g);
                waa.K(av8Var2, m4, hf3.f);
                waa.K(av8Var2, Integer.valueOf(hashCode4), hf3.j);
                waa.J(av8Var2, hf3.k);
                waa.K(av8Var2, C4, hf3.d);
                Boolean bool = (Boolean) teeVar.get(Integer.valueOf(subStageInfo.a));
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                xtc l = bkh.l(l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, 1), 24.0f);
                if (z) {
                    if (!booleanValue) {
                        i3 = R.drawable.ic_notification_mute;
                        wxf wxfVar2 = wxfVar;
                        kq9.b(s6a.N(i3, 6, av8Var2), !booleanValue ? "Checked" : "Unchecked", l, lz.D(R.color.primary_default, av8Var2), av8Var2, 384, 0);
                        utc utcVar3 = utcVar2;
                        float f3 = f;
                        udj.c(subStageInfo.b, l98.f0(utcVar3, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var2, 48, 0, 262136);
                        av8Var = av8Var2;
                        av8Var.s(true);
                        f = f3;
                        utcVar2 = utcVar3;
                        wxfVar = wxfVar2;
                        f2 = 1.0f;
                    }
                    i3 = R.drawable.ic_notification_active;
                    wxf wxfVar22 = wxfVar;
                    kq9.b(s6a.N(i3, 6, av8Var2), !booleanValue ? "Checked" : "Unchecked", l, lz.D(R.color.primary_default, av8Var2), av8Var2, 384, 0);
                    utc utcVar32 = utcVar2;
                    float f32 = f;
                    udj.c(subStageInfo.b, l98.f0(utcVar32, f32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var2, 48, 0, 262136);
                    av8Var = av8Var2;
                    av8Var.s(true);
                    f = f32;
                    utcVar2 = utcVar32;
                    wxfVar = wxfVar22;
                    f2 = 1.0f;
                } else {
                    if (!booleanValue) {
                        i3 = R.drawable.ic_notification_deselected;
                        wxf wxfVar222 = wxfVar;
                        kq9.b(s6a.N(i3, 6, av8Var2), !booleanValue ? "Checked" : "Unchecked", l, lz.D(R.color.primary_default, av8Var2), av8Var2, 384, 0);
                        utc utcVar322 = utcVar2;
                        float f322 = f;
                        udj.c(subStageInfo.b, l98.f0(utcVar322, f322, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var2, 48, 0, 262136);
                        av8Var = av8Var2;
                        av8Var.s(true);
                        f = f322;
                        utcVar2 = utcVar322;
                        wxfVar = wxfVar222;
                        f2 = 1.0f;
                    }
                    i3 = R.drawable.ic_notification_active;
                    wxf wxfVar2222 = wxfVar;
                    kq9.b(s6a.N(i3, 6, av8Var2), !booleanValue ? "Checked" : "Unchecked", l, lz.D(R.color.primary_default, av8Var2), av8Var2, 384, 0);
                    utc utcVar3222 = utcVar2;
                    float f3222 = f;
                    udj.c(subStageInfo.b, l98.f0(utcVar3222, f3222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, av8Var2, 48, 0, 262136);
                    av8Var = av8Var2;
                    av8Var.s(true);
                    f = f3222;
                    utcVar2 = utcVar3222;
                    wxfVar = wxfVar2222;
                    f2 = 1.0f;
                }
            }
            ljg.t(av8Var, false, true, true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hp1(z, teeVar, str, i, gv9Var, function0, function1, i2);
        }
    }
}
