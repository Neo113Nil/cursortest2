package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: UpdateAdapterMgr.java */
/* loaded from: classes13.dex */
public class c {
    public static final c b = new c();
    private WeakReference<Activity> a;

    public void a(Activity activity) {
        Activity a = a();
        if (a != null) {
            a.finish();
        }
        this.a = new WeakReference<>(activity);
    }

    public boolean b() {
        Activity a = a();
        if (a == null) {
            return true;
        }
        if (a.isTaskRoot()) {
            return false;
        }
        a.finish();
        return true;
    }

    private Activity a() {
        Activity activity;
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null || (activity = weakReference.get()) == null || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    public void b(Activity activity) {
        Activity a = a();
        if (activity == null || !activity.equals(a)) {
            return;
        }
        this.a = null;
    }
}
