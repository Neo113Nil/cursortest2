package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewUtil.java */
/* loaded from: classes13.dex */
public class f1 {
    private static final AtomicInteger a = new AtomicInteger(1);

    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static void b(Window window) {
        if (window != null) {
            try {
                window.getDecorView().setSystemUiVisibility(4098);
            } catch (Throwable th) {
                q0.b("ViewUtil", th.getMessage());
            }
        }
    }

    public static void c(Window window) {
        if (window != null) {
            try {
                int i = Build.VERSION.SDK_INT;
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (i >= 30) {
                    attributes.layoutInDisplayCutoutMode = 3;
                } else {
                    attributes.layoutInDisplayCutoutMode = 1;
                }
                window.setAttributes(attributes);
            } catch (Throwable th) {
                q0.b("ViewUtil", th.getMessage());
            }
        }
    }

    public static void d(Window window) {
        if (window != null) {
            try {
                window.requestFeature(1);
                window.setFlags(1024, 1024);
                window.addFlags(512);
            } catch (Throwable th) {
                q0.b("ViewUtil", th.getMessage());
            }
        }
    }

    public static void a(Window window) {
        if (window != null) {
            try {
                window.addFlags(67108864);
                window.getDecorView().setSystemUiVisibility(4098);
            } catch (Throwable th) {
                q0.b("ViewUtil", th.getMessage());
            }
        }
    }
}
