package com.huawei.hms.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.NotInstalledHmsAdapter;
import com.huawei.hms.adapter.ui.UpdateAdapter;
import com.huawei.hms.availableupdate.c;
import com.huawei.hms.update.note.AppSpoofResolution;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes13.dex */
public class AvailableAdapter {
    private final int a;
    private AvailableCallBack b;
    private SystemObserver d = new a();
    private boolean c = false;

    public interface AvailableCallBack {
        void onComplete(int i);
    }

    public class a implements SystemObserver {
        public a() {
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onNoticeResult(int i) {
            AvailableCallBack a = AvailableAdapter.this.a();
            if (a == null) {
                return true;
            }
            a.onComplete(i);
            return true;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onSolutionResult(Intent intent, String str) {
            return false;
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemObserver
        public boolean onUpdateResult(int i) {
            AvailableCallBack a = AvailableAdapter.this.a();
            if (a == null) {
                return true;
            }
            a.onComplete(i);
            return true;
        }
    }

    public AvailableAdapter(int i) {
        this.a = i;
    }

    private void b(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public int checkHuaweiMobileServicesForUpdate(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a2 = a(context);
        if (a2 == 0 && HMSPackageManager.getInstance(context).isApkNeedUpdate(this.a)) {
            return 2;
        }
        return a2;
    }

    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, "context must not be null.");
        int a2 = a(context);
        if (a2 == 0 && HMSPackageManager.getInstance(context).isApkUpdateNecessary(this.a)) {
            return 2;
        }
        return a2;
    }

    public boolean isUserNoticeError(int i) {
        return i == 29;
    }

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2;
    }

    public void setCalledBySolutionInstallHms(boolean z) {
        this.c = z;
    }

    public void startNotice(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        if (UIUtil.isBackground(activity)) {
            availableCallBack.onComplete(28);
            return;
        }
        this.b = availableCallBack;
        SystemManager.getSystemNotifier().registerObserver(this.d);
        activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, AppSpoofResolution.class.getName()));
    }

    public void startResolution(Activity activity, AvailableCallBack availableCallBack) {
        if (activity == null || availableCallBack == null) {
            return;
        }
        b(activity);
        if (UIUtil.isBackground(activity)) {
            availableCallBack.onComplete(28);
            return;
        }
        boolean a2 = a(activity);
        if (!AvailableUtil.isInstallerLibExist(activity) && !a2) {
            a(activity, availableCallBack);
            return;
        }
        if (c.b.b()) {
            this.b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.d);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, UpdateAdapter.class.getName());
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.UPDATE_VERSION, this.a);
            if (this.c) {
                intentStartBridgeActivity.putExtra("installHMS", "installHMS");
            }
            intentStartBridgeActivity.putExtra(CommonCode.MapKey.NEW_UPDATE, a2);
            activity.startActivity(intentStartBridgeActivity);
        }
    }

    private int a(Context context) {
        if (HMSPackageManager.getInstance(context).isUseOldCertificate()) {
            return 13;
        }
        PackageManagerHelper.PackageStates hMSPackageStatesForMultiService = HMSPackageManager.getInstance(context).getHMSPackageStatesForMultiService();
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(hMSPackageStatesForMultiService)) {
            return 1;
        }
        if (PackageManagerHelper.PackageStates.SPOOF.equals(hMSPackageStatesForMultiService)) {
            return 29;
        }
        return PackageManagerHelper.PackageStates.DISABLED.equals(hMSPackageStatesForMultiService) ? 3 : 0;
    }

    private void a(Activity activity, AvailableCallBack availableCallBack) {
        if (NotInstalledHmsAdapter.getShowLock()) {
            this.b = availableCallBack;
            SystemManager.getSystemNotifier().registerObserver(this.d);
            activity.startActivity(BridgeActivity.getIntentStartBridgeActivity(activity, NotInstalledHmsAdapter.class.getName()));
            return;
        }
        availableCallBack.onComplete(31);
    }

    private boolean a(Activity activity) {
        return !HMSPackageManager.getInstance(activity).isUpdateHmsForThirdPartyDevice() && HMSPackageManager.getInstance(activity).getHmsVersionCode() >= 40000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AvailableCallBack a() {
        return this.b;
    }
}
