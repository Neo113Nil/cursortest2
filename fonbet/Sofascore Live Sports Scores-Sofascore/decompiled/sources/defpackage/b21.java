package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b21 extends ot8 implements Function1 {
    public static final b21 b = new b21(1, nsk.class, "bind", "bind(Landroid/view/View;)Lcom/sofascore/results/databinding/ViewEventResultDateBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.aggregated_score;
        TextView textView = (TextView) nq8.B(R.id.aggregated_score, view);
        if (textView != null) {
            i = R.id.text_primary;
            TextView textView2 = (TextView) nq8.B(R.id.text_primary, view);
            if (textView2 != null) {
                i = R.id.text_secondary;
                TextView textView3 = (TextView) nq8.B(R.id.text_secondary, view);
                if (textView3 != null) {
                    return new nsk((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
