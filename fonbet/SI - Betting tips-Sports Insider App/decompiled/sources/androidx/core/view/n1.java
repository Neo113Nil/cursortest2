package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.sports.insider.R;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n1 extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f1363e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final q1.a f1364f = new q1.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f1365g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f1366h = new AccelerateInterpolator(1.5f);

    public static void f(View view, s1 s1Var) {
        j1 k6 = k(view);
        if (k6 != null) {
            k6.onEnd(s1Var);
            if (k6.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                f(viewGroup.getChildAt(i5), s1Var);
            }
        }
    }

    public static void g(View view, s1 s1Var, k2 k2Var, boolean z5) {
        j1 k6 = k(view);
        if (k6 != null) {
            k6.mDispachedInsets = k2Var;
            if (!z5) {
                k6.onPrepare(s1Var);
                z5 = k6.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                g(viewGroup.getChildAt(i5), s1Var, k2Var, z5);
            }
        }
    }

    public static void h(View view, k2 k2Var, List list) {
        j1 k6 = k(view);
        if (k6 != null) {
            k2Var = k6.onProgress(k2Var, list);
            if (k6.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                h(viewGroup.getChildAt(i5), k2Var, list);
            }
        }
    }

    public static void i(View view, s1 s1Var, i1 i1Var) {
        j1 k6 = k(view);
        if (k6 != null) {
            k6.onStart(s1Var, i1Var);
            if (k6.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                i(viewGroup.getChildAt(i5), s1Var, i1Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static j1 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof m1) {
            return ((m1) tag).f1357a;
        }
        return null;
    }
}
