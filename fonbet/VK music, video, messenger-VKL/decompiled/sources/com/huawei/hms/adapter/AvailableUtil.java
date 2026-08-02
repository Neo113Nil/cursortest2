package com.huawei.hms.adapter;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AndroidException;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.common.HmsCheckedState;
import com.huawei.hms.utils.AgHmsUpdateState;

/* loaded from: classes13.dex */
public class AvailableUtil {
    private static final Object a = new Object();
    private static boolean b = false;
    private static boolean c = false;

    public class a implements Runnable {
        final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AvailableUtil.isInstallerLibExist(this.a)) {
                UpdateAdapter.invokeMethod("com.huawei.hms.adapter.ui.InstallerAdapter", "checkHmsUpdateInfo", new Object[]{this.a});
            } else {
                AgHmsUpdateState.getInstance().setCheckedState(HmsCheckedState.NOT_NEED_UPDATE);
            }
        }
    }

    public static void asyncCheckHmsUpdateInfo(Context context) {
        if (HmsCheckedState.UNCHECKED != AgHmsUpdateState.getInstance().getCheckedState()) {
            return;
        }
        new Thread(new a(context), "Thread-asyncCheckHmsV3UpdateInfo").start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (java.lang.String.valueOf(r4).equalsIgnoreCase("yes") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean isInstallerLibExist(Context context) {
        boolean z;
        if (b) {
            return c;
        }
        synchronized (a) {
            if (!b) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    try {
                        Class.forName("com.huawei.hms.update.manager.UpdateManager");
                    } catch (AndroidException | ClassNotFoundException | RuntimeException unused) {
                    }
                } else {
                    ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                    if (applicationInfo != null) {
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null) {
                            Object obj = bundle.get("availableHMSCoreInstaller");
                            if (obj != null) {
                            }
                        }
                    }
                    z = false;
                    c = z;
                    b = true;
                }
                z = true;
                c = z;
                b = true;
            }
        }
        return c;
    }
}
