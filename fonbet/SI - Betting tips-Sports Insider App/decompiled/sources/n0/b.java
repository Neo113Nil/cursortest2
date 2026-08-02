package n0;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sports.insider.ui.activities.SplashActivity;
import io.sentry.android.replay.a0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends io.sentry.util.network.b {

    /* renamed from: d, reason: collision with root package name */
    public a0 f20815d;

    /* renamed from: e, reason: collision with root package name */
    public final a f20816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SplashActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f20816e = new a(this, activity);
    }

    @Override // io.sentry.util.network.b
    public final void h() {
        SplashActivity splashActivity = (SplashActivity) this.f17176b;
        Resources.Theme theme = splashActivity.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        m(theme, new TypedValue());
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = splashActivity.getWindow().getDecorView();
            Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f20816e);
        }
    }

    @Override // io.sentry.util.network.b
    public final void l(io.sentry.android.core.internal.gestures.c keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "<set-?>");
        this.f17177c = keepOnScreenCondition;
        View findViewById = ((SplashActivity) this.f17176b).findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.f20815d != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f20815d);
        }
        a0 a0Var = new a0(this, findViewById, 2);
        this.f20815d = a0Var;
        viewTreeObserver.addOnPreDrawListener(a0Var);
    }
}
