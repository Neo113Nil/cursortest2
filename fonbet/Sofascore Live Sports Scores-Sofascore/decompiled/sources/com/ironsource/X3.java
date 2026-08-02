package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class X3 {
    MutableContextWrapper a;

    public synchronized void a(Activity activity) {
        try {
            MutableContextWrapper mutableContextWrapper = this.a;
            if (mutableContextWrapper == null) {
                mutableContextWrapper = new MutableContextWrapper(activity);
                this.a = mutableContextWrapper;
            }
            mutableContextWrapper.setBaseContext(activity);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.a = null;
    }

    public Activity a() {
        return (Activity) this.a.getBaseContext();
    }
}
