package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2497k implements Bg {
    private WeakReference<Activity> a;

    public C2497k(Activity activity) {
        this.a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.Bg
    public void a() {
        Activity activity = this.a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
