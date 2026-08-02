package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class rj {
    private static float gm = -1.0f;
    private static boolean hc = true;
    private static ViewConfiguration kj = null;
    private static int oo = -1;
    private static float ork = -1.0f;
    private static float pcc = -1.0f;
    private static WindowManager qf = null;
    private static int sf = -1;
    private static final Object tmg = new Object();
    private static Boolean vh = null;
    private static int vj = -1;
    private static int vy = -1;
    private static int wh = -1;

    public static boolean dax(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static boolean gbb(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", null).invoke(loadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean gm(Activity activity) {
        Boolean bool;
        Boolean bool2 = vh;
        if (bool2 == null) {
            synchronized (tmg) {
                try {
                    Boolean bool3 = vh;
                    if (bool3 == null) {
                        String pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(pcc2) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(pcc2);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (str.equals(jSONArray.getString(i))) {
                                        vh = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e) {
                                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e.getMessage());
                            }
                        }
                        bool = Boolean.valueOf(oo(activity) || pcc("ro.miui.notch", activity) == 1 || gbb(activity) || lu(activity) || jr(activity) || dax(activity) || nac(activity));
                        vh = bool;
                    } else {
                        bool = bool3;
                    }
                    bool2 = bool;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return bool2.booleanValue();
    }

    public static int hc(Context context) {
        return ((Integer) vh(context).first).intValue();
    }

    public static boolean jr(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static float kj(Context context) {
        pcc(context, true);
        return pcc;
    }

    public static boolean lu(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean nac(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean oo(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    hc = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e.getMessage());
            }
        }
        return false;
    }

    public static int ork(Context context) {
        pcc(context);
        return sf;
    }

    public static int pcc(Bitmap bitmap) {
        try {
            ArrayList<Integer> sf2 = sf(bitmap);
            if (sf2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = sf2.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((i2 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void qf(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static int[] sf(Context context) {
        if (context == null) {
            return null;
        }
        WindowManager windowManager = qf;
        if (windowManager == null) {
            windowManager = (WindowManager) com.bytedance.sdk.openadsdk.core.lu.pcc().getSystemService("window");
            qf = windowManager;
        }
        int[] iArr = new int[2];
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int tmg(Context context) {
        return ((Integer) vh(context).second).intValue();
    }

    public static Pair<Integer, Integer> vh(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static void vj(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.rj.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    rj.pcc(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    public static float vy(Context context) {
        pcc(context);
        return gm;
    }

    public static void wh(View view) {
        if (view == null) {
            return;
        }
        pcc(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.rj.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static int qf(Context context) {
        pcc(context);
        return gm(context, vj);
    }

    public static int wh(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
        if (context == null) {
            return wh;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            wh = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return wh;
    }

    public static int vj(Context context) {
        pcc(context);
        return vj;
    }

    public static boolean oo(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int oo(Context context) {
        pcc(context);
        return gm(context, oo);
    }

    public static int sf(Context context, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        return Float.valueOf(pcc(context, f, true)).intValue();
    }

    public static int[] sf(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void sf(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static boolean sf() {
        return hc && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap sf(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(qfVar.getWidth(), qfVar.getHeight(), Bitmap.Config.RGB_565);
            qfVar.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static ArrayList<Integer> sf(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void sf(View view, final float f) {
        if (view != null && f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.rj.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static void pcc(Context context) {
        pcc(context, false);
    }

    public static void pcc(Context context, boolean z) {
        Context pcc2 = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context;
        if (pcc2 == null) {
            return;
        }
        qf = (WindowManager) pcc2.getSystemService("window");
        if (gm() || z) {
            DisplayMetrics displayMetrics = pcc2.getResources().getDisplayMetrics();
            pcc = displayMetrics.density;
            sf = displayMetrics.densityDpi;
            gm = displayMetrics.scaledDensity;
            oo = displayMetrics.widthPixels;
            vj = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i = oo;
            int i2 = vj;
            if (i > i2) {
                oo = i2;
                vj = i;
            }
        } else {
            int i3 = oo;
            int i4 = vj;
            if (i3 < i4) {
                oo = i4;
                vj = i3;
            }
        }
        wh = configuration.smallestScreenWidthDp;
    }

    public static int gm(Context context, float f) {
        pcc(context, true);
        float kj2 = kj(context);
        if (kj2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            kj2 = 1.0f;
        }
        return (int) ((f / kj2) + 0.5f);
    }

    public static int gm(Context context) {
        pcc(context);
        return oo;
    }

    @Nullable
    public static int[] gm(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    private static boolean gm() {
        return pcc < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || sf < 0 || gm < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || oo < 0 || vj < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm(final com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.utils.rj.4
                        @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                        public JSONObject gm() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int pcc2 = rj.pcc(bitmap);
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", pcc2 == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.atb.sf(ofVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(ofVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    public static float pcc(Context context, float f) {
        pcc(context);
        return vy(context) * f;
    }

    public static float pcc(Context context, float f, boolean z) {
        pcc(context);
        return (kj(context) * f) + (z ? 0.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Nullable
    public static int[] pcc(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static void pcc(View view, int i) {
        if (view == null || view.getVisibility() == i || !pcc(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static void pcc(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void pcc(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        pcc(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void pcc(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap pcc(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("UIUtils", th.getMessage());
            return bitmap;
        }
    }

    public static float pcc() {
        float f = ork;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.lu.pcc().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        ork = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void pcc(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("UIUtils", e.getMessage());
        }
    }

    public static int pcc(String str, Activity activity) {
        if (mk.wh()) {
            try {
                Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e.getMessage());
            } catch (IllegalAccessException e2) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e2.getMessage());
            } catch (IllegalArgumentException e3) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e3.getMessage());
            } catch (NoSuchMethodException e4) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e4.getMessage());
            } catch (InvocationTargetException e5) {
                com.bytedance.sdk.component.utils.lo.gm("UIUtils", e5.getMessage());
            }
        }
        return 0;
    }

    public static void pcc(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.lo.gm("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void pcc(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.lo.gm("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void pcc(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void pcc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.dax daxVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        pcc(textView, daxVar, ofVar, 14);
    }

    public static void pcc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.dax daxVar, com.bytedance.sdk.openadsdk.core.model.of ofVar, int i) {
        pcc(textView, daxVar, (ofVar == null || ofVar.xfm() == null) ? -1.0d : ofVar.xfm().oo(), i);
    }

    public static void pcc(TextView textView, com.bytedance.sdk.openadsdk.core.widget.dax daxVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            daxVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            pcc(daxVar, d, i);
        }
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.widget.dax daxVar, double d, int i) {
        if (d < 0.0d) {
            daxVar.setVisibility(8);
        } else {
            daxVar.setVisibility(0);
            daxVar.pcc(d, i);
        }
    }

    public static Bitmap pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        WebView webView = qfVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap sf2 = sf(qfVar);
        if (sf2 == null) {
            sf2 = pcc(webView);
        }
        webView.setLayerType(layerType, null);
        if (sf2 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.oo.pcc(sf2, sf2.getWidth() / 6, sf2.getHeight() / 6);
    }

    public static void pcc(final com.bytedance.sdk.openadsdk.core.model.of ofVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.rj.3
            @Override // java.lang.Runnable
            public void run() {
                rj.gm(ofVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    private static boolean pcc(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    public static boolean pcc(float f, float f2, Context context) {
        if (f != -1.0f && f2 != -1.0f) {
            ViewConfiguration viewConfiguration = kj;
            if (viewConfiguration == null) {
                viewConfiguration = ViewConfiguration.get(context);
                kj = viewConfiguration;
            }
            int i = vy;
            if (i == -1) {
                i = viewConfiguration.getScaledTouchSlop();
                vy = i;
            }
            if (f - f2 > i) {
                return true;
            }
        }
        return false;
    }

    public static void pcc(boolean z) {
        vh = Boolean.valueOf(z);
    }
}
