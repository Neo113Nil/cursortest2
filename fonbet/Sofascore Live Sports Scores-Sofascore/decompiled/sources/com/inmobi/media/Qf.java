package com.inmobi.media;

import android.content.Context;
import defpackage.rm5;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Qf {
    public static Pf a;

    public static Pf a(String str) {
        Set a2;
        if (str == null) {
            str = "";
        }
        Pf pf = a;
        if (pf == null) {
            Qa a3 = a();
            String string = a3 != null ? a3.a.getString("app_version", null) : null;
            Qa a4 = a();
            LinkedHashSet linkedHashSet = (a4 == null || (a2 = a4.a(rm5.a)) == null) ? new LinkedHashSet() : CollectionsKt.V0(a2);
            if (Intrinsics.c(string, str)) {
                Pf pf2 = new Pf(str, linkedHashSet);
                a = pf2;
                pf = pf2;
            } else {
                Qa a5 = a();
                if (a5 != null) {
                    a5.a("app_version");
                }
                Qa a6 = a();
                if (a6 != null) {
                    a6.a("reported_events");
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                pf = new Pf(str, linkedHashSet2);
                a = pf;
                Qa a7 = a();
                if (a7 != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    a7.a("app_version", str, false);
                }
                Qa a8 = a();
                if (a8 != null) {
                    a8.b(linkedHashSet2);
                }
            }
        }
        if (Intrinsics.c(pf.a, str)) {
            return pf;
        }
        Qa a9 = a();
        if (a9 != null) {
            a9.a("app_version");
        }
        Qa a10 = a();
        if (a10 != null) {
            a10.a("reported_events");
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Pf pf3 = new Pf(str, linkedHashSet3);
        a = pf3;
        Qa a11 = a();
        if (a11 != null) {
            ConcurrentHashMap concurrentHashMap2 = Qa.b;
            a11.a("app_version", str, false);
        }
        Qa a12 = a();
        if (a12 != null) {
            a12.b(linkedHashSet3);
        }
        return pf3;
    }

    public static Qa a() {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        return Pa.a(context, "telemetry_once_per_app_version_store");
    }
}
