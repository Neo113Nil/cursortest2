package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import defpackage.joa;
import defpackage.wel;
import defpackage.ypa;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3286aa {
    public static final joa a = ypa.b(new wel(13));
    public static final Z9 b;
    public static final C5 c;
    public static final Xa d;

    static {
        long currentTimeMillis = System.currentTimeMillis();
        b = new Z9();
        d = new Xa(a());
        Context context = AbstractC3424fj.a;
        if (context != null) {
            c = new C5(context, a(), (Kc) AbstractC3424fj.e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            C3359d5 c3359d5 = C3359d5.d;
            c3359d5.getClass();
            Qa a2 = AbstractC3364da.a();
            if (a2 != null) {
                a2.a(c3359d5.a, currentTimeMillis, true);
            }
            Qa a3 = AbstractC3364da.a();
            if (a3 != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                a3.a("s-cnt", 0, false);
            }
        }
        if (AbstractC3834vf.a.getCrashConfig().getReportOOMInfo()) {
            for (AbstractC3410f5 abstractC3410f5 : kotlin.collections.b.j(C3384e5.d, C3333c5.d)) {
                abstractC3410f5.getClass();
                Qa a4 = AbstractC3364da.a();
                if (a4 != null) {
                    a4.a(abstractC3410f5.a, currentTimeMillis, true);
                }
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z, long j) {
        jSONObject.getClass();
        if (a().getCrashConfig().getReportSessionInfo() && z) {
            C3359d5 c3359d5 = C3359d5.d;
            c3359d5.getClass();
            Qa a2 = AbstractC3364da.a();
            long j2 = 0;
            if (a2 != null) {
                String str = c3359d5.a;
                str.getClass();
                long j3 = a2.a.getLong(str, 0L);
                String str2 = c3359d5.b;
                if (j3 == 0) {
                    a2.a(str2, j, true);
                } else {
                    a2.a(str2, j - j3, true);
                }
            }
            c3359d5.getClass();
            Qa a3 = AbstractC3364da.a();
            if (a3 != null) {
                String str3 = c3359d5.b;
                str3.getClass();
                j2 = a3.a.getLong(str3, 0L);
            }
            jSONObject.put("crashFreeSessionLength", j2);
            Qa a4 = AbstractC3364da.a();
            jSONObject.put("crashFreeSessionCount", a4 != null ? a4.a.getInt("s-cnt", 0) : 0);
        }
    }

    public static final Y9 b() {
        return new Y9(AbstractC3750s9.b());
    }

    public static void c() {
        Qa a2;
        if (a().getCrashConfig().getReportSessionInfo() && (a2 = AbstractC3364da.a()) != null) {
            a2.a("s-cnt", a2.a.getInt("s-cnt", 0) + 1, false);
        }
        C5 c5 = c;
        if (c5 != null) {
            Iterator it = c5.c.iterator();
            while (it.hasNext()) {
                ((B5) it.next()).a();
            }
        }
        Xa xa = d;
        xa.getClass();
        Hl.a(new Ua(xa, null));
        ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{2, 1, 152, 150, 151}, xa.d);
        C3694q4 c3694q4 = AbstractC3435g4.a;
        AbstractC3435g4.a("crashReporting", b);
    }

    public static void a(Q2 q2) {
        q2.getClass();
        Xa xa = d;
        xa.getClass();
        q2.getClass();
        if (xa.a.getCatchConfig().getEnabled() && xa.c.b.a()) {
            Hl.a(new Ta(xa, q2, null));
        }
    }

    public static CrashConfig a() {
        return (CrashConfig) AbstractC3435g4.a.a(CrashConfig.class);
    }
}
