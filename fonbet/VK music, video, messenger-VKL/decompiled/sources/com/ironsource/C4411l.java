package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4411l implements Hg {
    private WeakReference<Activity> a;

    public C4411l(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Hg
    public void a() {
        Activity activity = this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
