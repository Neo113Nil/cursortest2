package com.ironsource;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4170l implements Eg {
    private WeakReference<Activity> a;

    public C4170l(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Eg
    public void a() {
        Activity activity = this.a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
