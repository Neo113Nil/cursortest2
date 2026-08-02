package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class izd extends o8 {
    public final h04 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.date;
        TextView textView = (TextView) nq8.B(R.id.date, root);
        if (textView != null) {
            i = R.id.result;
            TextView textView2 = (TextView) nq8.B(R.id.result, root);
            if (textView2 != null) {
                this.d = new h04((ConstraintLayout) root, textView, textView2, 4);
                setVisibility(8);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_statistics_dialog_event_row;
    }
}
