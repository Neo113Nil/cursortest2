package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class a {
    public static boolean a(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.m mVar) {
        context.getClass();
        d dVar = d.f;
        if (d.a(dVar)) {
            return d.a(dVar, context, intent, intent2, mVar);
        }
        dVar.d = new c(new WeakReference(context), intent, intent2, mVar);
        return false;
    }

    public static void b(b bVar) {
        bVar.getClass();
        d.f.a(bVar);
    }

    public static void a(Context context) {
        context.getClass();
        d.a(d.f, context);
    }

    public static boolean a() {
        return d.a(d.f);
    }

    public static void a(b bVar) {
        bVar.getClass();
        d.a(d.f, bVar);
    }
}
