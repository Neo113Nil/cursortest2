package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z8l extends c9l {
    public static final PathInterpolator e = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    public static final qq7 f = new qq7(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, d9l d9lVar) {
        qo2 k = k(view);
        if (k != null) {
            k.d(d9lVar);
            if (k.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), d9lVar);
            }
        }
    }

    public static void g(View view, d9l d9lVar, x9l x9lVar, boolean z) {
        qo2 k = k(view);
        if (k != null) {
            k.b = x9lVar;
            if (!z) {
                k.e(d9lVar);
                z = k.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), d9lVar, x9lVar, z);
            }
        }
    }

    public static void h(View view, x9l x9lVar, List list) {
        qo2 k = k(view);
        if (k != null) {
            x9lVar = k.f(x9lVar, list);
            if (k.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), x9lVar, list);
            }
        }
    }

    public static void i(View view, d9l d9lVar, c0l c0lVar) {
        qo2 k = k(view);
        if (k != null) {
            k.g(d9lVar, c0lVar);
            if (k.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), d9lVar, c0lVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static qo2 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof y8l) {
            return ((y8l) tag).a;
        }
        return null;
    }
}
