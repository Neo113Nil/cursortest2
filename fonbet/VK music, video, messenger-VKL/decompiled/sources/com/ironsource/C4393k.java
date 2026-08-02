package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4393k implements Hg {
    private WeakReference<Activity> a;

    public C4393k(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Hg
    public void a() {
        WindowInsetsController windowInsetsController;
        int statusBars;
        Activity activity = this.a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            statusBars = WindowInsets.Type.statusBars();
            windowInsetsController.hide(statusBars);
        }
    }
}
