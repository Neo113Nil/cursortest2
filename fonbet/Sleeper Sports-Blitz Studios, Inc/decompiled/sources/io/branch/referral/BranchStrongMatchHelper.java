package io.branch.referral;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsService;
import io.branch.referral.Defines;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes9.dex */
class BranchStrongMatchHelper {
    private static final int STRONG_MATCH_CHECK_TIME_OUT = 500;
    private static final int STRONG_MATCH_URL_HIT_DELAY = 750;
    private static int StrongMatchUrlHitDelay = 750;
    private static final long THIRTY_DAYS_EPOCH_MILLI_SEC = 2592000000L;
    private static BranchStrongMatchHelper branchStrongMatchHelper_;
    private Class<?> CustomTabsCallbackClass;
    private Class<?> CustomTabsClientClass;
    private Class<?> CustomTabsSessionClass;
    private Class<?> ICustomTabsServiceClass;
    private boolean isCustomTabsAvailable_;
    private final Handler timeOutHandler_;
    private Object mClient_ = null;
    private boolean isStrongMatchUrlLaunched = false;

    interface StrongMatchCheckEvents {
        void onStrongMatchCheckFinished();
    }

    private BranchStrongMatchHelper() {
        this.isCustomTabsAvailable_ = true;
        try {
            this.CustomTabsClientClass = Class.forName("android.support.customtabs.CustomTabsClient");
            this.CustomTabsCallbackClass = Class.forName("android.support.customtabs.CustomTabsCallback");
            this.CustomTabsSessionClass = Class.forName("android.support.customtabs.CustomTabsSession");
            this.ICustomTabsServiceClass = Class.forName("android.support.customtabs.ICustomTabsService");
        } catch (Throwable unused) {
            this.isCustomTabsAvailable_ = false;
        }
        this.timeOutHandler_ = new Handler();
    }

    public static BranchStrongMatchHelper getInstance() {
        if (branchStrongMatchHelper_ == null) {
            branchStrongMatchHelper_ = new BranchStrongMatchHelper();
        }
        return branchStrongMatchHelper_;
    }

    void setStrongMatchUrlHitDelay(int i) {
        StrongMatchUrlHitDelay = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    void checkForStrongMatch(Context context, String str, DeviceInfo deviceInfo, final PrefHelper prefHelper, final StrongMatchCheckEvents strongMatchCheckEvents) {
        this.isStrongMatchUrlLaunched = false;
        BranchStrongMatchHelper branchStrongMatchHelper = 2592000000;
        if (System.currentTimeMillis() - prefHelper.getLastStrongMatchTime() < THIRTY_DAYS_EPOCH_MILLI_SEC) {
            updateStrongMatchCheckFinished(strongMatchCheckEvents, this.isStrongMatchUrlLaunched);
            return;
        }
        if (!this.isCustomTabsAvailable_) {
            updateStrongMatchCheckFinished(strongMatchCheckEvents, this.isStrongMatchUrlLaunched);
            return;
        }
        try {
        } catch (Throwable unused) {
            branchStrongMatchHelper = this;
        }
        try {
            if (deviceInfo.getHardwareID() != null) {
                final Uri buildStrongMatchUrl = buildStrongMatchUrl(str, deviceInfo, prefHelper, context);
                if (buildStrongMatchUrl != null) {
                    this.timeOutHandler_.postDelayed(new Runnable() { // from class: io.branch.referral.BranchStrongMatchHelper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BranchStrongMatchHelper branchStrongMatchHelper2 = BranchStrongMatchHelper.this;
                            branchStrongMatchHelper2.updateStrongMatchCheckFinished(strongMatchCheckEvents, branchStrongMatchHelper2.isStrongMatchUrlLaunched);
                        }
                    }, 500L);
                    final Method method = this.CustomTabsClientClass.getMethod("warmup", Long.TYPE);
                    final Method method2 = this.CustomTabsClientClass.getMethod("newSession", this.CustomTabsCallbackClass);
                    final Method method3 = this.CustomTabsSessionClass.getMethod("mayLaunchUrl", Uri.class, Bundle.class, List.class);
                    Intent intent = new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                    intent.setPackage("com.android.chrome");
                    context.bindService(intent, new MockCustomTabServiceConnection() { // from class: io.branch.referral.BranchStrongMatchHelper.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        @Override // io.branch.referral.BranchStrongMatchHelper.MockCustomTabServiceConnection
                        public void onCustomTabsServiceConnected(ComponentName componentName, Object obj) {
                            BranchStrongMatchHelper branchStrongMatchHelper2 = BranchStrongMatchHelper.this;
                            branchStrongMatchHelper2.mClient_ = branchStrongMatchHelper2.CustomTabsClientClass.cast(obj);
                            if (BranchStrongMatchHelper.this.mClient_ != null) {
                                try {
                                    method.invoke(BranchStrongMatchHelper.this.mClient_, 0);
                                    Object invoke = method2.invoke(BranchStrongMatchHelper.this.mClient_, null);
                                    if (invoke != null) {
                                        PrefHelper.Debug("Strong match request " + buildStrongMatchUrl);
                                        method3.invoke(invoke, buildStrongMatchUrl, null, null);
                                        prefHelper.saveLastStrongMatchTime(System.currentTimeMillis());
                                        BranchStrongMatchHelper.this.isStrongMatchUrlLaunched = true;
                                    }
                                } catch (Throwable unused2) {
                                    BranchStrongMatchHelper.this.mClient_ = null;
                                    BranchStrongMatchHelper branchStrongMatchHelper3 = BranchStrongMatchHelper.this;
                                    branchStrongMatchHelper3.updateStrongMatchCheckFinished(strongMatchCheckEvents, branchStrongMatchHelper3.isStrongMatchUrlLaunched);
                                }
                            }
                        }

                        @Override // android.content.ServiceConnection
                        public void onServiceDisconnected(ComponentName componentName) {
                            BranchStrongMatchHelper.this.mClient_ = null;
                            BranchStrongMatchHelper branchStrongMatchHelper2 = BranchStrongMatchHelper.this;
                            branchStrongMatchHelper2.updateStrongMatchCheckFinished(strongMatchCheckEvents, branchStrongMatchHelper2.isStrongMatchUrlLaunched);
                        }
                    }, 33);
                    return;
                }
                updateStrongMatchCheckFinished(strongMatchCheckEvents, this.isStrongMatchUrlLaunched);
                return;
            }
            updateStrongMatchCheckFinished(strongMatchCheckEvents, this.isStrongMatchUrlLaunched);
            PrefHelper.Debug("Cannot use cookie-based matching since device id is not available");
        } catch (Throwable unused2) {
            updateStrongMatchCheckFinished(strongMatchCheckEvents, branchStrongMatchHelper.isStrongMatchUrlLaunched);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStrongMatchCheckFinished(final StrongMatchCheckEvents strongMatchCheckEvents, boolean z) {
        if (strongMatchCheckEvents != null) {
            if (z) {
                new Handler().postDelayed(new Runnable() { // from class: io.branch.referral.BranchStrongMatchHelper.3
                    @Override // java.lang.Runnable
                    public void run() {
                        strongMatchCheckEvents.onStrongMatchCheckFinished();
                    }
                }, StrongMatchUrlHitDelay);
            } else {
                strongMatchCheckEvents.onStrongMatchCheckFinished();
            }
        }
    }

    private Uri buildStrongMatchUrl(String str, DeviceInfo deviceInfo, PrefHelper prefHelper, Context context) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = ("https://" + str + "/_strong_match?os=" + deviceInfo.getOsName()) + "&" + Defines.Jsonkey.HardwareID.getKey() + "=" + deviceInfo.getHardwareID();
        String str3 = str2 + "&" + Defines.Jsonkey.HardwareIDType.getKey() + "=" + (deviceInfo.getHardwareID().isReal() ? Defines.Jsonkey.HardwareIDTypeVendor : Defines.Jsonkey.HardwareIDTypeRandom).getKey();
        String aid = deviceInfo.getSystemObserver().getAID();
        if (aid != null && !BranchUtil.checkTestMode(context)) {
            str3 = str3 + "&" + Defines.Jsonkey.GoogleAdvertisingID.getKey() + "=" + aid;
        }
        if (!prefHelper.getDeviceFingerPrintID().equals(PrefHelper.NO_STRING_VALUE)) {
            str3 = str3 + "&" + Defines.Jsonkey.DeviceFingerprintID.getKey() + "=" + prefHelper.getDeviceFingerPrintID();
        }
        if (!deviceInfo.getAppVersion().equals(PrefHelper.NO_STRING_VALUE)) {
            str3 = str3 + "&" + Defines.Jsonkey.AppVersion.getKey() + "=" + deviceInfo.getAppVersion();
        }
        if (prefHelper.hasValidBranchKey()) {
            str3 = str3 + "&" + Defines.Jsonkey.BranchKey.getKey() + "=" + prefHelper.getBranchKey();
        }
        return Uri.parse(str3 + "&sdk=android4.3.2");
    }

    private abstract class MockCustomTabServiceConnection implements ServiceConnection {
        public abstract void onCustomTabsServiceConnected(ComponentName componentName, Object obj);

        MockCustomTabServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Constructor declaredConstructor = BranchStrongMatchHelper.this.CustomTabsClientClass.getDeclaredConstructor(BranchStrongMatchHelper.this.ICustomTabsServiceClass, ComponentName.class);
                declaredConstructor.setAccessible(true);
                onCustomTabsServiceConnected(componentName, declaredConstructor.newInstance(Class.forName("android.support.customtabs.ICustomTabsService$Stub").getMethod("asInterface", IBinder.class).invoke(null, iBinder), componentName));
            } catch (Throwable unused) {
                onCustomTabsServiceConnected(null, null);
            }
        }
    }
}
