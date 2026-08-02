package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.ApkResolutionFailedManager;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.utils.IntentUtil;
import com.huawei.hms.utils.RegionUtils;
import com.huawei.hms.utils.ResolutionFlagUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import xsna.xy6;

/* loaded from: classes13.dex */
public class BaseResolutionAdapter implements IBridgeActivityDelegate {
    private WeakReference<Activity> a;
    private String b = "";
    private long c = 0;

    private void a(long j) {
        Activity c;
        if (!RegionUtils.isChinaROM(c()) || (c = c()) == null || c.isFinishing()) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("package", c.getPackageName());
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        hashMap.put(CommonCode.MapKey.RESOLUTION_FLAG, xy6.a(j, "-", sb));
        HiAnalyticsUtils.getInstance().onEvent(c, HiAnalyticsConstant.HMS_SDK_BASE_START_RESOLUTION, hashMap);
    }

    private void b() {
        Activity c = c();
        if (c == null || c.isFinishing()) {
            return;
        }
        c.finish();
    }

    private Activity c() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void d() {
        SystemManager.getInstance().notifyResolutionResult(null, this.b);
        b();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        Bundle bundle;
        if (activity == null) {
            d();
            return;
        }
        if (activity.isFinishing()) {
            return;
        }
        this.a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            d();
            return;
        }
        try {
            bundle = intent.getExtras();
            try {
                this.b = intent.getStringExtra(CommonCode.MapKey.TRANSACTION_ID);
                this.c = intent.getLongExtra(CommonCode.MapKey.RESOLUTION_FLAG, 0L);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            bundle = null;
        }
        if (!a()) {
            d();
            return;
        }
        if (this.b != null && Build.VERSION.SDK_INT >= 29) {
            ApkResolutionFailedManager.getInstance().removeTask(this.b);
        }
        if (bundle == null) {
            d();
            return;
        }
        Parcelable parcelable = bundle.getParcelable(CommonCode.MapKey.HAS_RESOLUTION);
        if (parcelable == null) {
            d();
            return;
        }
        if (parcelable instanceof Intent) {
            try {
                activity.startActivityForResult(IntentUtil.modifyIntentBehaviorsSafe((Intent) parcelable), 1001);
            } catch (Throwable unused3) {
                d();
            }
        } else if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), 1001, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused4) {
                d();
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        if (i2 == 1001 || i2 == 1002) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT, i2);
        }
        if (i2 == -1 || intent.hasExtra(KpmsConstant.KIT_UPDATE_RESULT) || intent.hasExtra(CommonCode.MapKey.PRIVACY_STATEMENT_CONFIRM_RESULT)) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.b);
        }
        b();
        return true;
    }

    private boolean a() {
        long resolutionFlag = ResolutionFlagUtil.getInstance().getResolutionFlag(this.b);
        ResolutionFlagUtil.getInstance().removeResolutionFlag(this.b);
        if (resolutionFlag != 0 && resolutionFlag == this.c) {
            return true;
        }
        a(resolutionFlag);
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
