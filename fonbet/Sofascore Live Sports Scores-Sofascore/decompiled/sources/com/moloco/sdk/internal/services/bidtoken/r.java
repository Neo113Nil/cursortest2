package com.moloco.sdk.internal.services.bidtoken;

import android.hardware.SensorManager;
import android.os.Build;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.a0;
import com.moloco.sdk.b0;
import com.moloco.sdk.e0;
import com.moloco.sdk.f0;
import com.moloco.sdk.g0;
import com.moloco.sdk.h0;
import com.moloco.sdk.i0;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.services.d0;
import com.moloco.sdk.j0;
import com.moloco.sdk.k0;
import com.moloco.sdk.l0;
import com.moloco.sdk.m0;
import com.moloco.sdk.n0;
import com.moloco.sdk.o0;
import com.moloco.sdk.p0;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import com.moloco.sdk.q0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.y;
import com.moloco.sdk.z;
import defpackage.zzl;
import java.util.Date;
import java.util.TimeZone;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class r {
    public final com.moloco.sdk.internal.services.s a;
    public final com.moloco.sdk.internal.services.g b;

    public r(com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.internal.services.g gVar) {
        sVar.getClass();
        gVar.getClass();
        this.a = sVar;
        this.b = gVar;
    }

    public final q0 a(com.moloco.sdk.internal.services.bidtoken.providers.k kVar, g gVar) {
        Boolean bool;
        com.moloco.sdk.o oVar;
        com.moloco.sdk.v vVar;
        i0 i0Var;
        gVar.getClass();
        com.moloco.sdk.internal.services.s sVar = this.a;
        c0 a = sVar.a();
        com.moloco.sdk.internal.services.f a2 = this.b.a();
        com.moloco.sdk.t h = q0.h();
        m0 h2 = n0.h();
        boolean z = kVar.a;
        com.moloco.sdk.internal.services.bidtoken.providers.f fVar = kVar.i;
        com.moloco.sdk.internal.services.bidtoken.providers.m mVar = kVar.h;
        com.moloco.sdk.internal.services.bidtoken.providers.h hVar = kVar.f;
        com.moloco.sdk.internal.services.bidtoken.providers.a aVar = kVar.j;
        com.moloco.sdk.internal.services.bidtoken.providers.s sVar2 = kVar.e;
        MolocoPrivacy.PrivacySettings privacySettings = kVar.b;
        com.moloco.sdk.internal.services.bidtoken.providers.o oVar2 = kVar.k;
        h2.d(z);
        h.n((n0) h2.build());
        f0 h3 = g0.h();
        com.moloco.sdk.internal.services.bidtoken.providers.q qVar = kVar.c;
        Boolean bool2 = qVar.a;
        if (bool2 != null) {
            h3.d(bool2.booleanValue());
        }
        Long l = qVar.b;
        if (l != null) {
            h3.h(l.longValue());
        }
        Long l2 = qVar.c;
        if (l2 != null) {
            h3.i(l2.longValue());
        }
        h.o((g0) h3.build());
        com.moloco.sdk.x h4 = y.h();
        Long l3 = kVar.d.a;
        if (l3 != null) {
            h4.d(l3.longValue());
        }
        h.l((y) h4.build());
        h0 h5 = j0.h();
        Integer num = sVar2.a;
        if (num != null) {
            h5.d(num.intValue());
        }
        Integer num2 = sVar2.b;
        if (num2 != null) {
            h5.h(num2.intValue());
        }
        Boolean bool3 = sVar2.c;
        if (bool3 != null) {
            h5.i(bool3.booleanValue());
        }
        f1 f1Var = sVar2.d;
        if (f1Var != null) {
            if (f1Var instanceof com.moloco.sdk.internal.services.a) {
                i0Var = i0.CELLULAR;
            } else if (f1Var.equals(com.moloco.sdk.internal.services.b.a)) {
                i0Var = i0.NO_NETWORK;
            } else {
                if (!f1Var.equals(com.moloco.sdk.internal.services.b.b)) {
                    zzl.b();
                    return null;
                }
                i0Var = i0.WIFI;
            }
            h5.j(i0Var);
        }
        h.p((j0) h5.build());
        com.moloco.sdk.r h6 = com.moloco.sdk.s.h();
        Integer num3 = hVar.a;
        if (num3 != null) {
            h6.i(num3.intValue());
        }
        Integer num4 = hVar.b;
        if (num4 != null) {
            int intValue = num4.intValue();
            h6.d(intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? com.moloco.sdk.q.UNKNOWN : com.moloco.sdk.q.FULL : com.moloco.sdk.q.NOT_CHARGING : com.moloco.sdk.q.DISCHARGING : com.moloco.sdk.q.CHARGING);
        }
        Boolean bool4 = hVar.c;
        if (bool4 != null) {
            h6.h(bool4.booleanValue());
        }
        h.j((com.moloco.sdk.s) h6.build());
        com.moloco.sdk.l h7 = com.moloco.sdk.m.h();
        com.facebook.appevents.j jVar = kVar.g;
        if (jVar instanceof com.moloco.sdk.internal.services.m) {
            h7.d(false);
            h7.h(((com.moloco.sdk.internal.services.m) jVar).a);
        } else {
            if (!jVar.equals(com.moloco.sdk.internal.services.n.a)) {
                zzl.b();
                return null;
            }
            h7.d(true);
        }
        h.h((com.moloco.sdk.m) h7.build());
        k0 h8 = l0.h();
        Boolean isAgeRestrictedUser = privacySettings.getIsAgeRestrictedUser();
        if (isAgeRestrictedUser != null) {
            h8.h(isAgeRestrictedUser.booleanValue());
        }
        Boolean isUserConsent = privacySettings.getIsUserConsent();
        if (isUserConsent != null) {
            h8.i(isUserConsent.booleanValue());
        }
        Boolean isDoNotSell = privacySettings.getIsDoNotSell();
        if (isDoNotSell != null) {
            h8.d(isDoNotSell.booleanValue());
        }
        String tCFConsent = privacySettings.getTCFConsent();
        if (tCFConsent != null) {
            h8.j(tCFConsent);
        }
        h8.k(privacySettings.get_usPrivacy());
        h.q((l0) h8.build());
        com.moloco.sdk.u h9 = com.moloco.sdk.w.h();
        h9.r(a.f);
        String str = Build.VERSION.RELEASE;
        h9.x();
        h9.t(a.a);
        h9.u(a.b);
        h9.o(a.c);
        h9.h(a.g);
        h9.j(a.d ? 5 : 1);
        h9.p();
        z h10 = a0.h();
        h10.d(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
        h9.k((a0) h10.build());
        h9.A(a2.a);
        h9.l(a2.c);
        h9.z(a2.e);
        h9.y(a2.f);
        h9.w();
        if (gVar.a) {
            h9.i(a.i * 1000000);
        }
        com.moloco.sdk.internal.services.h hVar2 = mVar.a;
        if (hVar2 != null) {
            int i = q.a[hVar2.ordinal()];
            if (i == 1) {
                vVar = com.moloco.sdk.v.UNKNOWN;
            } else if (i == 2) {
                vVar = com.moloco.sdk.v.PORTRAIT;
            } else {
                if (i != 3) {
                    zzl.b();
                    return null;
                }
                vVar = com.moloco.sdk.v.LANDSCAPE;
            }
            h9.v(vVar);
        }
        try {
            Object systemService = sVar.a.getSystemService("sensor");
            systemService.getClass();
            bool = Boolean.valueOf(((SensorManager) systemService).getDefaultSensor(4) != null);
        } catch (Exception unused) {
            bool = null;
        }
        if (bool != null) {
            h9.n(bool.booleanValue());
        }
        String str2 = mVar.c;
        if (str2 != null) {
            h9.q(str2);
        }
        String str3 = mVar.b;
        if (str3 != null) {
            h9.s(str3);
        }
        h9.B(a2.g);
        h9.C(a2.h);
        h9.m(a.j);
        h9.d(a.k);
        h.k((com.moloco.sdk.w) h9.build());
        com.moloco.sdk.n h11 = com.moloco.sdk.p.h();
        d0 d0Var = fVar.a;
        if (d0Var != null) {
            int i2 = q.b[d0Var.ordinal()];
            if (i2 == 1) {
                oVar = com.moloco.sdk.o.SILENT;
            } else if (i2 == 2) {
                oVar = com.moloco.sdk.o.VIBRATE;
            } else {
                if (i2 != 3) {
                    zzl.b();
                    return null;
                }
                oVar = com.moloco.sdk.o.NORMAL;
            }
            h11.d(oVar);
        }
        Integer num5 = fVar.b;
        if (num5 != null) {
            h11.h(num5.intValue());
        }
        h.i((com.moloco.sdk.p) h11.build());
        com.moloco.sdk.j h12 = com.moloco.sdk.k.h();
        Float f = aVar.d;
        if (f != null) {
            h12.i(f.floatValue());
        }
        Boolean bool5 = aVar.b;
        if (bool5 != null) {
            h12.h(bool5.booleanValue());
        }
        Boolean bool6 = aVar.a;
        if (bool6 != null) {
            h12.d(bool6.booleanValue());
        }
        Boolean bool7 = aVar.c;
        if (bool7 != null) {
            h12.j(bool7.booleanValue());
        }
        h.d((com.moloco.sdk.k) h12.build());
        if (oVar2.a.length() > 0) {
            b0 h13 = e0.h();
            h13.i(oVar2.a);
            h13.h(oVar2.c);
            h13.j(oVar2.b);
            com.moloco.sdk.c0 h14 = com.moloco.sdk.d0.h();
            h14.d(oVar2.d);
            h14.i(oVar2.e);
            h14.j(oVar2.f);
            h14.h(oVar2.g);
            h14.k(oVar2.h);
            h13.d((com.moloco.sdk.d0) h14.build());
            h.m((e0) h13.build());
        }
        String str4 = kVar.l.a;
        if (str4 != null && !StringsKt.R(str4)) {
            o0 h15 = p0.h();
            h15.d(str4);
            h.r((p0) h15.build());
        }
        GeneratedMessageLite build = h.build();
        build.getClass();
        return (q0) build;
    }
}
