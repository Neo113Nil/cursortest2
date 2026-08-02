package com.inmobi.media;

import android.content.Context;
import defpackage.joa;
import defpackage.xt8;
import defpackage.ypa;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class G9 {
    public static final joa a = ypa.b(new xt8(11));
    public static final String b = "G9";

    public static void a(String str) {
        Qa qa = (Qa) a.getValue();
        if (qa != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa.a("cip", str, false);
            Unit unit = Unit.a;
        }
        b.getClass();
    }

    public static final Qa b() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        return Pa.a(context, "inmobi_store");
    }

    public static String a() {
        Qa qa = (Qa) a.getValue();
        String string = qa != null ? qa.a.getString("cip", null) : null;
        b.getClass();
        return string;
    }
}
