package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2515l implements Bg {
    private WeakReference<Activity> a;

    public C2515l(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Bg
    public void a() {
        Activity activity = this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
