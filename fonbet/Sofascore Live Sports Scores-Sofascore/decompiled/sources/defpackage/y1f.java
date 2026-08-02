package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y1f extends o8 {
    public final dk2 d;
    public final ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1f(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        TextView textView = (TextView) nq8.B(R.id.all_players_button, root);
        if (textView == null) {
            yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(R.id.all_players_button)));
            throw null;
        }
        this.d = new dk2((LinearLayout) root, textView, 6);
        this.e = new ArrayList();
        setVisibility(8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.popular_players_layout;
    }
}
