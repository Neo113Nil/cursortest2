package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.update.ui.NotInstalledHmsDialogHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes13.dex */
public class NotInstalledHmsAdapter implements IBridgeActivityDelegate {
    private static final Object c = new Object();
    private static boolean d;
    private Activity a;
    private Dialog b;

    public static class a implements DialogInterface.OnCancelListener {
        private final Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            SystemManager.getInstance().notifyUpdateResult(13);
            this.a.finish();
        }
    }

    public static class b implements DialogInterface.OnClickListener {
        private final Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SystemManager.getInstance().notifyUpdateResult(30);
            this.a.finish();
        }
    }

    private void a(Activity activity) {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            this.b.setOnCancelListener(null);
            this.b.cancel();
        }
        AlertDialog create = NotInstalledHmsDialogHelper.getDialogBuilder(activity).setPositiveButton(NotInstalledHmsDialogHelper.getConfirmResId(activity), new b(activity)).setOnCancelListener(new a(activity)).create();
        this.b = create;
        UIUtil.enableFocusedForButtonsInTV(create);
        this.b.show();
    }

    public static boolean getShowLock() {
        synchronized (c) {
            try {
                if (d) {
                    return false;
                }
                d = true;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        this.a = activity;
        a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        synchronized (c) {
            d = false;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        Activity activity = this.a;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        a(this.a);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
