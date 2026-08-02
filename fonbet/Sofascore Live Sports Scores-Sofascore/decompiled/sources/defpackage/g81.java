package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class g81 extends ot8 implements Function1 {
    public static final g81 b = new g81(1, jrk.class, "bind", "bind(Landroid/view/View;)Lcom/sofascore/results/databinding/ViewBaseballEventResultBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ComposeView composeView = (ComposeView) nq8.B(R.id.header, view);
        if (composeView != null) {
            return new jrk((ConstraintLayout) view, composeView);
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.header)));
        return null;
    }
}
