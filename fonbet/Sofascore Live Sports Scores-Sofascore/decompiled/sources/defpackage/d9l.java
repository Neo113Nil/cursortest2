package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d9l {
    public c9l a;

    public d9l(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b9l(fx.b(i, interpolator, j));
        } else {
            this.a = new z8l(i, interpolator, j);
        }
    }

    public static void a(View view, qo2 qo2Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            b9l.h(view, qo2Var);
            return;
        }
        PathInterpolator pathInterpolator = z8l.e;
        View.OnApplyWindowInsetsListener y8lVar = qo2Var != null ? new y8l(view, qo2Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, y8lVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(y8lVar);
        }
    }
}
