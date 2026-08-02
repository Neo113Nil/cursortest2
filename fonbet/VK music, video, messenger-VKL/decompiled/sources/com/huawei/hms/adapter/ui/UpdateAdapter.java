package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.c;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {
    private WeakReference<Activity> a;
    private Context b;
    private int c;
    private UpdateBean d;
    private boolean e = false;

    private static Object a(String str, String str2, Object[] objArr) throws Throwable {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || objArr == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Activity) {
                clsArr[i] = Activity.class;
            } else if (obj instanceof Context) {
                clsArr[i] = Context.class;
            } else if (obj instanceof UpdateBean) {
                clsArr[i] = UpdateBean.class;
            } else if (obj instanceof Integer) {
                clsArr[i] = Integer.TYPE;
            } else if (obj instanceof Boolean) {
                clsArr[i] = Boolean.TYPE;
            }
        }
        Class<?> cls = Class.forName(str);
        return cls.getMethod(str2, clsArr).invoke(cls.getDeclaredConstructor(null).newInstance(null), objArr);
    }

    private Activity b() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        a();
    }

    public static Object invokeMethod(String str, String str2, Object[] objArr) {
        try {
            return a(str, str2, objArr);
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            c();
            return;
        }
        if (activity.isFinishing()) {
            c();
            return;
        }
        this.b = activity.getApplicationContext();
        this.a = new WeakReference<>(activity);
        c.b.a(b());
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        try {
            this.c = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
        } catch (Throwable th) {
            th.getMessage();
        }
        if (this.c == 0) {
            c();
            return;
        }
        if (intent.hasExtra("installHMS")) {
            this.e = true;
        }
        if (a(intent, activity)) {
            return;
        }
        try {
            if (AvailableUtil.isInstallerLibExist(this.b)) {
                UpdateBean updateBean = (UpdateBean) a("com.huawei.hms.adapter.ui.InstallerAdapter", "setUpdateBean", new Object[]{activity, Integer.valueOf(this.c), Boolean.valueOf(this.e)});
                this.d = updateBean;
                a("com.huawei.hms.adapter.ui.InstallerAdapter", "startUpdateHms", new Object[]{activity, updateBean, 1001});
                this.d = null;
            }
        } catch (Throwable th2) {
            th2.getMessage();
            c();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        c.b.b(b());
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        int i3;
        if (i != getRequestCode()) {
            this.d = null;
            return false;
        }
        if (AvailableUtil.isInstallerLibExist(this.b) && i2 == 1214) {
            Activity b = b();
            if (b == null) {
                this.d = null;
                return true;
            }
            invokeMethod("com.huawei.hms.update.manager.UpdateManager", "startUpdate", new Object[]{b, 1001, this.d});
            this.d = null;
        }
        if (i2 == -1) {
            if (intent != null) {
                try {
                    i3 = intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0);
                } catch (Throwable unused) {
                    i3 = 0;
                }
                if (i3 == 1) {
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.d = null;
                    a();
                    return true;
                }
                a(intent);
            }
        } else if (i2 == 0) {
            this.d = null;
            Activity b2 = b();
            if (b2 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(b2.getApplicationContext()).getHMSPackageName();
            if (TextUtils.isEmpty(hMSPackageName)) {
                hMSPackageName = "com.huawei.hwid";
            }
            if (this.e || a(b2, hMSPackageName, this.c)) {
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i2 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        a();
        return true;
    }

    private boolean a(Intent intent, Activity activity) {
        boolean z = false;
        if (intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            z = true;
            if (TextUtils.isEmpty(hMSPackageName)) {
                c();
                return true;
            }
            ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
            Intent intent2 = new Intent();
            intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
            intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
            intent2.setComponent(componentName);
            activity.startActivityForResult(intent2, 1001);
        }
        return z;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    private void a(Intent intent) {
        int i = -1;
        try {
            i = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        } catch (Throwable unused) {
        }
        if (i == 0) {
            SystemManager.getInstance().notifyUpdateResult(0);
            return;
        }
        if (i == 13) {
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (i == 8) {
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            SystemManager.getInstance().notifyUpdateResult(i);
        }
    }

    private void a() {
        Activity b = b();
        if (b == null || b.isFinishing()) {
            return;
        }
        b.finish();
    }

    private boolean a(Context context, String str, int i) {
        if (context != null && !TextUtils.isEmpty(str) && i != 0) {
            PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
