package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g73 extends o8 {
    public final iq5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g73(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.stat_name;
        TextView textView = (TextView) nq8.B(R.id.stat_name, root);
        if (textView != null) {
            i = R.id.value_left;
            TextView textView2 = (TextView) nq8.B(R.id.value_left, root);
            if (textView2 != null) {
                i = R.id.value_right;
                TextView textView3 = (TextView) nq8.B(R.id.value_right, root);
                if (textView3 != null) {
                    this.d = new iq5((ConstraintLayout) root, textView, textView2, textView3, 1);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.list_cell_compare;
    }

    public final void j(String str, String str2) {
        str.getClass();
        str2.getClass();
        iq5 iq5Var = this.d;
        iq5Var.d.setText(str);
        iq5Var.e.setText(str2);
    }

    public final void setStatTitle(@NotNull String str) {
        str.getClass();
        this.d.c.setText(str);
    }
}
