package com.safedk.android.analytics.brandsafety;

import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class DetectTouchUtils {
    private static final String a = "DetectTouchUtils";
    private static final HashMap<String, w> b = new HashMap<>();
    private static final HashMap<String, w> c = new HashMap<>();
    private static String d = null;
    private static boolean e = false;
    private static final Timer f = new Timer("RedirectSimulationTimer");
    private static TimerTask g = null;
    private static final ExecutorService h = Executors.newSingleThreadExecutor();

    public static w a(String str) {
        Logger.d(a, "getLastTouchEvent is latestTouchEventBySdkMap contains ", str, "? ", Boolean.valueOf(b.containsKey(str)), ", map = ", b);
        if (b.containsKey(str) && b.get(str) != null) {
            Logger.d(a, "getLastTouchEvent returns ", b.get(str));
            return b.get(str);
        }
        return null;
    }

    public static w a(String str, String str2) {
        return c.get(str + "_" + str2);
    }

    public static void activityOnTouch(String sdkPackageName, MotionEvent me2) {
        try {
            if (me2.getAction() == 0) {
                Logger.d(a, "activity on touch started, sdk: ", sdkPackageName, ", motion event: ", me2, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                if ((0 != me2.getEventTime()) && me2.getActionMasked() != 2) {
                    a(null, sdkPackageName, null);
                }
            }
        } catch (Throwable th) {
            Logger.d(a, "error in activity on touch", th);
        }
    }

    public static void viewOnTouch(String sdkPackage, View view, MotionEvent me2) {
        String str;
        String sdkPackage2 = sdkPackage;
        try {
            if (me2.getAction() != 0) {
                return;
            }
            Logger.d(a, "view on touch, started, sdkPackage = ", sdkPackage2, ", View = ", view, ", MotionEvent = ", me2);
            if (sdkPackage2.equals(com.safedk.android.utils.h.a) && (view instanceof MaxNativeAdView)) {
                String b2 = NativeFinder.b((MaxNativeAdView) view);
                if (b2 == null) {
                    b2 = BannerFinder.a((MaxNativeAdView) view);
                }
                if (b2 != null) {
                    sdkPackage2 = b2;
                    try {
                        Logger.d(a, "view on touch, translate Max native ad view to sdk: ", sdkPackage2, ", view: ", view, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
                    } catch (Throwable th) {
                        th = th;
                        Logger.d(a, "error in view on touch", th);
                        return;
                    }
                } else {
                    Logger.d(a, "view on touch, failed to translate Max native ad view to sdk, view: ", view);
                }
                str = null;
            } else {
                if (view instanceof WebView) {
                    Logger.d(a, "web view on touch, sdk: ", sdkPackage2, ", view: ", view);
                } else if (view instanceof ViewGroup) {
                    Logger.d(a, "view group on touch, sdk: ", sdkPackage2, ", view: ", view);
                } else {
                    if ((CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.ALLOW_FULL_SCREEN_MULTI_CLICK_URL_UPDATES, false) && view.getTag() != null && CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null) != null && view.getTag().equals(CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULLSCREEN_NEXT_BUTTON_TAG, (String) null))) || (CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null) != null && view.getTag() != null && com.safedk.android.utils.n.b(view.getTag().toString(), CreativeInfoManager.a(sdkPackage2, AdNetworkConfiguration.FULL_SCREEN_MULTI_VIEW_TAG_AD_SPECIFIC, (String) null)))) {
                        Object[] objArr = new Object[8];
                        objArr[0] = "view on touch, custom view : (";
                        objArr[1] = view.getClass().getName();
                        objArr[2] = ") on touch, sdk: ";
                        objArr[3] = sdkPackage2;
                        objArr[4] = ", view: ";
                        objArr[5] = view;
                        objArr[6] = ", tag : ";
                        objArr[7] = view.getTag() != null ? view.getTag() : "";
                        Logger.d(a, objArr);
                        str = (String) view.getTag();
                        SafeDK.getInstance().z().a(sdkPackage2, view, System.currentTimeMillis());
                    } else {
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = "view on touch, sdk: ";
                        objArr2[1] = sdkPackage2;
                        objArr2[2] = ", view: ";
                        objArr2[3] = view;
                        objArr2[4] = ", tag : ";
                        objArr2[5] = view.getTag() != null ? view.getTag() : "";
                        Logger.d(a, objArr2);
                    }
                }
                str = null;
            }
            a(view != null ? BrandSafetyUtils.a(view) : null, sdkPackage2, str);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void a(final String str, final String str2, final String str3) {
        if (com.safedk.android.utils.n.c()) {
            h.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.c(str, str2, str3);
                }
            });
        } else {
            c(str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2, String str3) {
        String str4;
        if (!SafeDK.S() || (!e && ((str4 = d) == null || str == null || !str4.contains(str)))) {
            w wVar = new w(Long.valueOf(SystemClock.elapsedRealtime()), Long.valueOf(System.currentTimeMillis()), str, str3);
            b.put(str2, wVar);
            Logger.d(a, "Set latest touch event, setting sdk: ", str2, ", details: ", wVar, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            if (str != null) {
                String str5 = str2 + "_" + str;
                c.put(str5, wVar);
                Logger.d(a, "Set latest touch event, setting key: ", str5, ", details: ", wVar);
                if (com.safedk.android.utils.h.o.equals(str2)) {
                    BannerFinder.a(wVar);
                    return;
                }
                return;
            }
            return;
        }
        Logger.d(a, "ignore touch event, sdk: ", str2, ", view address: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
    }

    public static void b(final String str) {
        if (com.safedk.android.utils.n.c()) {
            h.execute(new Runnable() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.2
                @Override // java.lang.Runnable
                public void run() {
                    DetectTouchUtils.e(str);
                }
            });
        } else {
            e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        if (SafeDK.S()) {
            TimerTask timerTask = g;
            if (timerTask != null) {
                timerTask.cancel();
            }
            d = str;
            Logger.d(a, "set ignore next touch event: ", str, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
            long f2 = SafeDK.getInstance().f();
            TimerTask timerTask2 = new TimerTask() { // from class: com.safedk.android.analytics.brandsafety.DetectTouchUtils.3
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    String unused = DetectTouchUtils.d = null;
                    Logger.d(DetectTouchUtils.a, "timeout ignore next touch event");
                }
            };
            g = timerTask2;
            f.schedule(timerTask2, f2);
        }
    }

    public static void a() {
        d = null;
        Logger.d(a, "reset ignore next touch event");
    }

    public static boolean b() {
        boolean z = !e;
        e = z;
        Logger.d(a, "toggle ignore touch events: ", Boolean.valueOf(z));
        return e;
    }

    public static void viewChangedByExternalLib(ViewGroup viewGroup, View view) {
        try {
            Logger.d(a, "view on view group add view, started, viewGroup = ", viewGroup, ", view = ", view.getClass().getCanonicalName());
            Activity a2 = com.safedk.android.utils.o.a(viewGroup);
            if (a2 != null) {
                Logger.d(a, "view on view group add view, started, activity = ", a2);
                if (!BrandSafetyUtils.d(a2.getClass()) || !view.getClass().getCanonicalName().toLowerCase().contains("com.braze.ui.inappmessage")) {
                    Logger.d(a, "view on view group add view, activity = ", a2, " is not an ad inter activity, skipping");
                } else if (SafeDK.getInstance() != null && SafeDK.getInstance().z() != null) {
                    String a3 = BrandSafetyUtils.a((Class) a2.getClass());
                    Logger.d(a, "view on view group add view, activity = ", a2, " is an ad inter activity and the newly added view is of an external lib. requestNoSampling will be invoked for sdk ", a3);
                    SafeDK.getInstance().z().a(a3, (String) null, false);
                }
            }
        } catch (Throwable th) {
            Logger.d(a, "error in on view group add view", th);
        }
    }
}
