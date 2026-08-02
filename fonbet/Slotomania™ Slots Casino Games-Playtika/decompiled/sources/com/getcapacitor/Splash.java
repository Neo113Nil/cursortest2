package com.getcapacitor;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* loaded from: classes6.dex */
public class Splash {
    public static final String CONFIG_KEY_PREFIX = "plugins.SplashScreen.";
    public static final boolean DEFAULT_AUTO_HIDE = true;
    public static final int DEFAULT_FADE_IN_DURATION = 200;
    public static final int DEFAULT_FADE_OUT_DURATION = 200;
    public static final int DEFAULT_LAUNCH_SHOW_DURATION = 3000;
    public static final int DEFAULT_SHOW_DURATION = 3000;
    public static final boolean DEFAULT_SPLASH_FULL_SCREEN = false;
    public static final boolean DEFAULT_SPLASH_IMMERSIVE = false;
    private static boolean isHiding;
    private static boolean isVisible;
    private static ProgressBar spinnerBar;
    private static ImageView splashImage;
    private static WindowManager wm;

    public interface SplashListener {
        void completed();

        void error();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f2, code lost:
    
        if (r0.equals("horizontal") == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void buildViews(Context context, CapConfig capConfig) {
        ImageView.ScaleType scaleType;
        char c = 4;
        if (splashImage == null) {
            try {
                Drawable drawable = context.getResources().getDrawable(context.getResources().getIdentifier(capConfig.getString("plugins.SplashScreen.androidSplashResourceName", "splash"), "drawable", context.getPackageName()), context.getTheme());
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (drawable instanceof LayerDrawable) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                        Object drawable2 = layerDrawable.getDrawable(i);
                        if (drawable2 instanceof Animatable) {
                            ((Animatable) drawable2).start();
                        }
                    }
                }
                ImageView imageView = new ImageView(context);
                splashImage = imageView;
                imageView.setFitsSystemWindows(true);
                Boolean valueOf = Boolean.valueOf(capConfig.getBoolean("plugins.SplashScreen.splashImmersive", false));
                Boolean valueOf2 = Boolean.valueOf(capConfig.getBoolean("plugins.SplashScreen.splashFullScreen", false));
                if (valueOf.booleanValue()) {
                    splashImage.setSystemUiVisibility(5894);
                } else if (valueOf2.booleanValue()) {
                    splashImage.setSystemUiVisibility(4);
                }
                splashImage.setDrawingCacheEnabled(true);
                String string = capConfig.getString("plugins.SplashScreen.backgroundColor");
                if (string != null) {
                    try {
                        splashImage.setBackgroundColor(Color.parseColor(string));
                    } catch (IllegalArgumentException unused) {
                        Logger.debug("Background color not applied");
                    }
                }
                try {
                    scaleType = ImageView.ScaleType.valueOf(capConfig.getString("plugins.SplashScreen.androidScaleType", "FIT_XY"));
                } catch (IllegalArgumentException unused2) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                }
                splashImage.setScaleType(scaleType);
                splashImage.setImageDrawable(drawable);
            } catch (Resources.NotFoundException unused3) {
                Logger.warn("No splash screen found, not displaying");
                return;
            }
        }
        if (spinnerBar == null) {
            String string2 = capConfig.getString("plugins.SplashScreen.androidSpinnerStyle");
            if (string2 != null) {
                String lowerCase = string2.toLowerCase();
                lowerCase.hashCode();
                switch (lowerCase.hashCode()) {
                    case -1971382379:
                        if (lowerCase.equals("largeinverse")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 102742843:
                        if (lowerCase.equals("large")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109548807:
                        if (lowerCase.equals("small")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1051779145:
                        if (lowerCase.equals("smallinverse")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1387629604:
                        break;
                    case 1959910192:
                        if (lowerCase.equals("inverse")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                int i2 = R.attr.progressBarStyleLarge;
                switch (c) {
                    case 0:
                        i2 = R.attr.progressBarStyleLargeInverse;
                        break;
                    case 2:
                        i2 = R.attr.progressBarStyleSmall;
                        break;
                    case 3:
                        i2 = R.attr.progressBarStyleSmallInverse;
                        break;
                    case 4:
                        i2 = R.attr.progressBarStyleHorizontal;
                        break;
                    case 5:
                        i2 = R.attr.progressBarStyleInverse;
                        break;
                }
                spinnerBar = new ProgressBar(context, null, i2);
            } else {
                spinnerBar = new ProgressBar(context);
            }
            spinnerBar.setIndeterminate(true);
            String string3 = capConfig.getString("plugins.SplashScreen.spinnerColor");
            if (string3 != null) {
                try {
                    int[][] iArr = {new int[]{R.attr.state_enabled}, new int[]{-16842910}, new int[]{-16842912}, new int[]{R.attr.state_pressed}};
                    int parseColor = Color.parseColor(string3);
                    spinnerBar.setIndeterminateTintList(new ColorStateList(iArr, new int[]{parseColor, parseColor, parseColor, parseColor}));
                } catch (IllegalArgumentException unused4) {
                    Logger.debug("Spinner color not applied");
                }
            }
        }
    }

    public static void showOnLaunch(BridgeActivity bridgeActivity, CapConfig capConfig) {
        Integer valueOf = Integer.valueOf(capConfig.getInt("plugins.SplashScreen.launchShowDuration", 3000));
        Boolean valueOf2 = Boolean.valueOf(capConfig.getBoolean("plugins.SplashScreen.launchAutoHide", true));
        if (valueOf.intValue() == 0) {
            return;
        }
        show(bridgeActivity, valueOf.intValue(), 0, 200, valueOf2.booleanValue(), null, true, capConfig);
    }

    public static void show(Activity activity) {
        show(activity, 3000, 200, 200, true, null, null);
    }

    public static void show(Activity activity, int i, int i2, int i3, boolean z, SplashListener splashListener, CapConfig capConfig) {
        show(activity, i, i2, i3, z, splashListener, false, capConfig);
    }

    public static void show(final Activity activity, final int i, final int i2, final int i3, final boolean z, final SplashListener splashListener, final boolean z2, final CapConfig capConfig) {
        wm = (WindowManager) activity.getSystemService("window");
        if (activity.isFinishing()) {
            return;
        }
        buildViews(activity, capConfig);
        if (isVisible) {
            splashListener.completed();
        } else {
            final Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.getcapacitor.Splash.1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Splash.isVisible = true;
                    if (z) {
                        new Handler().postDelayed(new Runnable() { // from class: com.getcapacitor.Splash.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Splash.hide(activity, i3, z2);
                                if (splashListener != null) {
                                    splashListener.completed();
                                }
                            }
                        }, i);
                        return;
                    }
                    SplashListener splashListener2 = splashListener;
                    if (splashListener2 != null) {
                        splashListener2.completed();
                    }
                }
            };
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: com.getcapacitor.Splash.2
                @Override // java.lang.Runnable
                public void run() {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                    layoutParams.gravity = 17;
                    layoutParams.flags = activity.getWindow().getAttributes().flags;
                    layoutParams.format = -3;
                    try {
                        Splash.wm.addView(Splash.splashImage, layoutParams);
                        Splash.splashImage.setAlpha(0.0f);
                        Splash.splashImage.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(i2).setListener(animatorListener).start();
                        Splash.splashImage.setVisibility(0);
                        if (Splash.spinnerBar != null) {
                            Boolean valueOf = Boolean.valueOf(capConfig.getBoolean("plugins.SplashScreen.showSpinner", false));
                            Splash.spinnerBar.setVisibility(4);
                            if (Splash.spinnerBar.getParent() != null) {
                                Splash.wm.removeView(Splash.spinnerBar);
                            }
                            layoutParams.height = -2;
                            layoutParams.width = -2;
                            Splash.wm.addView(Splash.spinnerBar, layoutParams);
                            if (valueOf.booleanValue()) {
                                Splash.spinnerBar.setAlpha(0.0f);
                                Splash.spinnerBar.animate().alpha(1.0f).setInterpolator(new LinearInterpolator()).setDuration(i2).start();
                                Splash.spinnerBar.setVisibility(0);
                            }
                        }
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                        Logger.debug("Could not add splash view");
                    }
                }
            });
        }
    }

    public static void hide(Context context, int i) {
        hide(context, i, false);
    }

    public static void hide(Context context, final int i, boolean z) {
        ImageView imageView;
        if (z && isVisible) {
            Logger.debug("SplashScreen was automatically hidden after the launch timeout. You should call `SplashScreen.hide()` as soon as your web app is loaded (or increase the timeout).Read more at https://capacitorjs.com/docs/apis/splash-screen#hiding-the-splash-screen");
        }
        if (isHiding || (imageView = splashImage) == null || imageView.getParent() == null) {
            return;
        }
        isHiding = true;
        final Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: com.getcapacitor.Splash.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Splash.tearDown(false);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Splash.tearDown(false);
            }
        };
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.getcapacitor.Splash.4
            @Override // java.lang.Runnable
            public void run() {
                if (Splash.spinnerBar != null) {
                    Splash.spinnerBar.setAlpha(1.0f);
                    Splash.spinnerBar.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(i).start();
                }
                Splash.splashImage.setAlpha(1.0f);
                Splash.splashImage.animate().alpha(0.0f).setInterpolator(new LinearInterpolator()).setDuration(i).setListener(animatorListener).start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tearDown(boolean z) {
        ProgressBar progressBar = spinnerBar;
        if (progressBar != null && progressBar.getParent() != null) {
            spinnerBar.setVisibility(4);
            if (z) {
                wm.removeView(spinnerBar);
            }
        }
        ImageView imageView = splashImage;
        if (imageView != null && imageView.getParent() != null) {
            splashImage.setVisibility(4);
            wm.removeView(splashImage);
        }
        isHiding = false;
        isVisible = false;
    }

    public static void onPause() {
        tearDown(true);
    }

    public static void onDestroy() {
        tearDown(true);
    }
}
