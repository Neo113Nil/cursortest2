package com.vk.biometrics.lock.impl.presentation.base.mvi.settings;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.movika.tools.controls.seekbar.s;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dlv0;
import xsna.dnn0;
import xsna.dt1;
import xsna.f97;
import xsna.izs;
import xsna.kai;
import xsna.phv0;
import xsna.q630;
import xsna.qco0;
import xsna.ug5;
import xsna.yzs;

/* compiled from: BiometricsLockSettingsView.kt */
/* loaded from: classes15.dex */
public final class h {
    public static final void a(dlv0 dlv0Var, final izs izsVar, final boolean z, final boolean z2, final ug5 ug5Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1121130177);
        int i2 = i | (M.J(dlv0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.J(ug5Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1121130177, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.ContentScene (BiometricsLockSettingsView.kt:161)");
            }
            aVar2 = M;
            phv0.b(null, null, null, kai.c(-1397078012, new s(dlv0Var, 1), M), null, 0, 0L, 0L, kai.c(218788763, new yzs() { // from class: xsna.e97
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0316, code lost:
                
                    if (r4 == r3) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x03a7, code lost:
                
                    if (r3 == r2) goto L78;
                 */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    izs izsVar2;
                    Object obj4;
                    String str;
                    char c;
                    Object obj5;
                    Object obj6;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(218788763, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.ContentScene.<anonymous> (BiometricsLockSettingsView.kt:175)");
                        }
                        dt1.a.getClass();
                        cp10 d = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630.a aVar4 = q630.a.a;
                        q630 c2 = qri.c(aVar3, aVar4);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar3, d, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar3, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar3, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar3, c2, dVar);
                        float f = 1.0f;
                        q630 H = s200.H(p490.D(hr80.m(txj0.d(aVar4, 1.0f), wlb0.h(aVar3).getBackground().g, androidx.compose.ui.graphics.e.a), p490.x(aVar3), 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, m7p0.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar3, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c3 = qri.c(aVar3, H);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a, cVar);
                        k9q0.w(aVar3, D2, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c3, dVar);
                        f9t.e(q9g.a(aVar4, 1.0f), aVar3, 0);
                        float f2 = 32;
                        float f3 = 16;
                        a87.a(d370.N(R.string.bl_secure_entrance_title, 0, aVar3), d370.N(R.string.bl_secure_entrance_subtitle, 0, aVar3), s200.G(aVar4, f2, f3, f2, 44), null, aVar3, 0, 8);
                        f9t.e(q9g.a(aVar4, 1.0f), aVar3, 0);
                        ijv0.a(SeparatorDpi.At2x, SeparatorAppearance.Primary, true, null, null, aVar3, 438, 24);
                        izs izsVar3 = izs.this;
                        boolean z3 = z;
                        Object obj7 = a.C0011a.a;
                        if (z3) {
                            aVar3.K(-1319732092);
                            plg0 plg0Var = new plg0(2);
                            boolean J = aVar3.J(izsVar3);
                            Object x = aVar3.x();
                            if (J || x == obj7) {
                                x = new g97(izsVar3, 0);
                                aVar3.R(x);
                            }
                            boolean z4 = z2;
                            q630 a2 = d1p0.a(aVar4, z4, false, plg0Var, (izs) x, 10);
                            Object x2 = aVar3.x();
                            if (x2 == obj7) {
                                x2 = new mo1(4);
                                aVar3.R(x2);
                            }
                            q630 b = egi0.b(a2, true, (izs) x2);
                            qco0 a3 = qco0.a.a(100663296, 254, aVar3, d370.N(R.string.bl_touch_id_entrance, 0, aVar3), null);
                            dnn0 a4 = dnn0.a.a(z4, aVar3);
                            f = 1.0f;
                            str = null;
                            izsVar2 = izsVar3;
                            obj4 = obj7;
                            c = 14;
                            wiu0.c(a3, b, null, a4, aVar3, 0, 4);
                        } else {
                            izsVar2 = izsVar3;
                            obj4 = obj7;
                            str = null;
                            c = 14;
                            aVar3.K(-1328615669);
                        }
                        aVar3.j();
                        boolean J2 = aVar3.J(izsVar2);
                        Object x3 = aVar3.x();
                        if (J2 || x3 == obj4) {
                            x3 = new i97(izsVar2, 0);
                            aVar3.R(x3);
                        }
                        String str2 = str;
                        float f4 = f;
                        q630 c4 = ojc.c(aVar4, false, null, null, (gzs) x3, 15);
                        Object x4 = aVar3.x();
                        if (x4 == obj4) {
                            x4 = new wh1(5);
                            aVar3.R(x4);
                        }
                        q630 b2 = egi0.b(c4, true, (izs) x4);
                        qco0 a5 = qco0.a.a(100663296, 254, aVar3, d370.N(R.string.bl_auto_lock_title, 0, aVar3), str2);
                        Context context = (Context) aVar3.r(AndroidCompositionLocals_androidKt.b);
                        int i3 = ug5Var.a;
                        String string = i3 == 0 ? context.getString(R.string.bl_auto_lock_time_immediate) : context.getString(R.string.bl_auto_lock_time_count, Integer.valueOf(i3));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-966762594, 48, -1, "com.vk.core.compose.component.cell.content.RightTextContent.Companion.invoke (RightTextContent.kt:42)");
                        }
                        Object x5 = aVar3.x();
                        if (x5 == obj4) {
                            x5 = new qkg0(string);
                            aVar3.R(x5);
                        }
                        qkg0 qkg0Var = (qkg0) x5;
                        ((zak0) qkg0Var.a).setValue(string);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        wiu0.c(a5, b2, null, qkg0Var, aVar3, 0, 4);
                        q630 f5 = txj0.f(aVar4, f4);
                        boolean J3 = aVar3.J(izsVar2);
                        Object x6 = aVar3.x();
                        if (J3 || x6 == obj4) {
                            x6 = new j97(izsVar2, 0);
                            aVar3.R(x6);
                        }
                        q630 c5 = ojc.c(f5, false, null, null, (gzs) x6, 15);
                        Object x7 = aVar3.x();
                        if (x7 == obj4) {
                            x7 = new com.vk.movika.sdk.base.observable.s(6);
                            aVar3.R(x7);
                        }
                        q630 b3 = egi0.b(c5, true, (izs) x7);
                        float f6 = 14;
                        Object obj8 = obj4;
                        izs izsVar4 = izsVar2;
                        yqv0.c(d370.N(R.string.bl_hide_content_title, 0, aVar3), s200.E(b3, f3, f6), wlb0.h(aVar3).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).X, aVar3, 0, 0, 8184);
                        q630 f7 = txj0.f(aVar4, f4);
                        boolean J4 = aVar3.J(izsVar4);
                        Object x8 = aVar3.x();
                        if (J4) {
                            obj5 = obj8;
                        } else {
                            obj5 = obj8;
                        }
                        x8 = new c97(izsVar4, 0);
                        aVar3.R(x8);
                        q630 c6 = ojc.c(f7, false, null, null, (gzs) x8, 15);
                        Object x9 = aVar3.x();
                        if (x9 == obj5) {
                            x9 = new i8(9);
                            aVar3.R(x9);
                        }
                        Object obj9 = obj5;
                        yqv0.c(d370.N(R.string.bl_change_pin_password, 0, aVar3), s200.E(egi0.b(c6, true, (izs) x9), f3, f6), wlb0.h(aVar3).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).X, aVar3, 0, 0, 8184);
                        q630 f8 = txj0.f(aVar4, f4);
                        boolean J5 = aVar3.J(izsVar4);
                        Object x10 = aVar3.x();
                        if (J5) {
                            obj6 = obj9;
                        } else {
                            obj6 = obj9;
                        }
                        x10 = new d97(izsVar4, 0);
                        aVar3.R(x10);
                        q630 c7 = ojc.c(f8, false, null, null, (gzs) x10, 15);
                        Object x11 = aVar3.x();
                        if (x11 == obj6) {
                            x11 = new j60(4);
                            aVar3.R(x11);
                        }
                        Object obj10 = obj6;
                        yqv0.c(d370.N(R.string.bl_disable_secure_entrance, 0, aVar3), s200.E(egi0.b(c7, true, (izs) x11), f3, f6), wlb0.h(aVar3).getText().k, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar3).X, aVar3, 0, 0, 8184);
                        f9t.e(txj0.h(aVar4, 12), aVar3, 6);
                        aVar3.G();
                        boolean J6 = aVar3.J(izsVar4);
                        Object x12 = aVar3.x();
                        if (J6 || x12 == obj10) {
                            x12 = new h97(izsVar4, 0);
                            aVar3.R(x12);
                        }
                        b57.a((gzs) x12, null, false, null, wlb0.h(aVar3).d().a, aVar3, 0, 14);
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805309440, 503);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new f97(dlv0Var, izsVar, z, z2, ug5Var, i);
        }
    }
}
