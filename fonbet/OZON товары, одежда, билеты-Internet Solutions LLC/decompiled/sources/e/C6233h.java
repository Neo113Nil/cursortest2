package e;

import a1.C4912a;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ActivityC5043j;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.C0;
import androidx.lifecycle.D0;
import org.jetbrains.annotations.NotNull;

/* renamed from: e.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6233h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ViewGroup.LayoutParams f61699a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ActivityC5043j activityC5043j, C4912a c4912a) {
        View childAt = ((ViewGroup) activityC5043j.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.a(c4912a);
            return;
        }
        ComposeView composeView2 = new ComposeView(activityC5043j, null, 6, 0);
        composeView2.setParentCompositionContext(null);
        composeView2.a(c4912a);
        View decorView = activityC5043j.getWindow().getDecorView();
        if (C0.a(decorView) == null) {
            C0.b(decorView, activityC5043j);
        }
        if (D0.a(decorView) == null) {
            D0.b(decorView, activityC5043j);
        }
        if (M4.f.a(decorView) == null) {
            M4.f.b(decorView, activityC5043j);
        }
        activityC5043j.setContentView(composeView2, f61699a);
    }
}
