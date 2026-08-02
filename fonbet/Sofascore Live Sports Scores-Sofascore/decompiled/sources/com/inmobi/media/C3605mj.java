package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.duf;
import defpackage.fc6;
import defpackage.fuf;
import defpackage.kef;
import defpackage.wel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.mj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3605mj {
    public static final C3605mj a;
    public static final /* synthetic */ KProperty[] b;
    public static final String c;
    public static String d;
    public static boolean e;
    public static long f;
    public static final List g;
    public static final AtomicBoolean h;
    public static final Qa i;
    public static final M1 j;
    public static final M1 k;

    static {
        Qa qa;
        int i2 = -1;
        kef kefVar = new kef(C3605mj.class, "sessionCnt", "getSessionCnt()I", 0);
        fuf fufVar = duf.a;
        b = new KProperty[]{fufVar.property1(kefVar), fufVar.property1(new kef(C3605mj.class, "userRetention", "getUserRetention()I", 0))};
        a = new C3605mj();
        c = "mj";
        g = kotlin.collections.b.l(0, 0, 0, 0);
        h = new AtomicBoolean(false);
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa = Pa.a(context, "session_pref_file");
        } else {
            qa = null;
        }
        i = qa;
        int i3 = 12;
        j = new M1(i2, new wel(28), i3);
        k = new M1(i2, new wel(29), i3);
    }

    public static void a(String str, Boolean bool) {
        str.getClass();
        if (Intrinsics.c(str, "banner") && a(1)) {
            List list = g;
            list.set(0, Integer.valueOf(Integer.min(((Number) list.get(0)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.c(str, "int") && !Intrinsics.c(bool, Boolean.TRUE) && a(2)) {
            List list2 = g;
            list2.set(1, Integer.valueOf(Integer.min(((Number) list2.get(1)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.c(str, IronSourceConstants.EVENTS_NATIVE) && a(4)) {
            List list3 = g;
            list3.set(3, Integer.valueOf(Integer.min(((Number) list3.get(3)).intValue() + 1, Integer.MAX_VALUE)));
        }
        if (Intrinsics.c(bool, Boolean.TRUE) && a(3)) {
            List list4 = g;
            list4.set(2, Integer.valueOf(Integer.min(((Number) list4.get(2)).intValue() + 1, Integer.MAX_VALUE)));
        }
    }

    public static final int b() {
        a.getClass();
        Qa qa = i;
        if (qa == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return Integer.min((int) ((currentTimeMillis - qa.a.getLong("u-ret", currentTimeMillis)) / 86400000), Integer.MAX_VALUE);
    }

    public static void c() {
        if (h.getAndSet(true)) {
            return;
        }
        if (AbstractC3890xj.a().getSessionEnabled()) {
            d = fc6.C();
            c.getClass();
        }
        f = System.currentTimeMillis() - Process.getElapsedCpuTime();
        if (a(5)) {
            Qa qa = i;
            if (qa != null) {
                qa.a("cnt", Integer.min(qa.a.getInt("cnt", 0) + 1, Integer.MAX_VALUE), false);
            }
            j.a();
        }
        if (a(6)) {
            Qa qa2 = i;
            if (qa2 != null && !qa2.a.contains("u-ret")) {
                qa2.a("u-ret", System.currentTimeMillis(), false);
            }
            k.a();
        }
    }

    public static final int a() {
        a.getClass();
        Qa qa = i;
        if (qa == null) {
            return 0;
        }
        return qa.a.getInt("cnt", 0);
    }

    public static boolean a(int i2) {
        return ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getSession().getSigControlList().contains(Integer.valueOf(i2));
    }
}
