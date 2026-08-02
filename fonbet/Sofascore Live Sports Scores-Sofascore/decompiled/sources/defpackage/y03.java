package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class y03 extends ot8 implements Function1 {
    public static final y03 b = new y03(1, osk.class, "bind", "bind(Landroid/view/View;)Lcom/sofascore/results/databinding/ViewEventResultMmaBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.barrier;
        if (((Barrier) nq8.B(R.id.barrier, view)) != null) {
            i = R.id.result_first;
            TextView textView = (TextView) nq8.B(R.id.result_first, view);
            if (textView != null) {
                i = R.id.result_group;
                Group group = (Group) nq8.B(R.id.result_group, view);
                if (group != null) {
                    i = R.id.result_second;
                    TextView textView2 = (TextView) nq8.B(R.id.result_second, view);
                    if (textView2 != null) {
                        i = R.id.result_slash;
                        TextView textView3 = (TextView) nq8.B(R.id.result_slash, view);
                        if (textView3 != null) {
                            i = R.id.text_primary;
                            TextView textView4 = (TextView) nq8.B(R.id.text_primary, view);
                            if (textView4 != null) {
                                i = R.id.text_secondary;
                                TextView textView5 = (TextView) nq8.B(R.id.text_secondary, view);
                                if (textView5 != null) {
                                    return new osk((ConstraintLayout) view, textView, group, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
