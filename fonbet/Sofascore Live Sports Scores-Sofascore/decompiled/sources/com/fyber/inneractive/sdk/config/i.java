package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i {
    public final Context a;
    public WeakReference b;

    public i(Context context, Context context2) {
        h hVar = new h(this);
        this.a = context2;
        if (context instanceof Activity) {
            this.b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.b);
        return context != null ? context : this.a;
    }
}
