package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class zb3 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, tc3 tc3Var) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(null);
            composeView.setContent(tc3Var);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 6);
        composeView2.setParentCompositionContext(null);
        composeView2.setContent(tc3Var);
        View decorView = componentActivity.getWindow().getDecorView();
        if (qha.w(decorView) == null) {
            decorView.setTag(com.sofascore.results.R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (sha.u(decorView) == null) {
            decorView.setTag(com.sofascore.results.R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (rha.q(decorView) == null) {
            decorView.setTag(com.sofascore.results.R.id.view_tree_saved_state_registry_owner, componentActivity);
        }
        componentActivity.setContentView(composeView2, a);
    }
}
