package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import defpackage.au5;
import defpackage.duf;
import defpackage.fuf;
import defpackage.kt4;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class F1 {
    public static AppSetIdInfo a;

    static {
        b();
    }

    public static void a(LinkedHashMap linkedHashMap) {
        AppSetIdInfo appSetIdInfo;
        linkedHashMap.getClass();
        if (a() && (appSetIdInfo = a) != null) {
            linkedHashMap.put("d-app-set-id", appSetIdInfo.getId());
            int scope = appSetIdInfo.getScope();
            StringBuilder sb = new StringBuilder();
            sb.append(scope);
        }
    }

    public static void b() {
        Context context = AbstractC3424fj.a;
        if (context != null && a()) {
            AppSetIdClient client = AppSet.getClient(context);
            client.getClass();
            Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
            appSetIdInfo.getClass();
            appSetIdInfo.addOnSuccessListener(new kt4(new au5(28), 15));
        }
    }

    public static final Unit a(AppSetIdInfo appSetIdInfo) {
        a = appSetIdInfo;
        return Unit.a;
    }

    public static boolean a() {
        try {
            fuf fufVar = duf.a;
            fufVar.getOrCreateKotlinClass(AppSetIdInfo.class).getSimpleName();
            fufVar.getOrCreateKotlinClass(Task.class).getSimpleName();
            return true;
        } catch (NoClassDefFoundError e) {
            e.toString();
            return false;
        }
    }

    public static final void a(Function1 function1, Object obj) {
        function1.invoke(obj);
    }
}
