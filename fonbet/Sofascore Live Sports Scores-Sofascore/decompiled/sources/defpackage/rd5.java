package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rd5 extends o8 {
    public final z82 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.h2h_container;
        View B = nq8.B(R.id.h2h_container, root);
        if (B != null) {
            u79 a = u79.a(B);
            i = R.id.h2h_container_2;
            View B2 = nq8.B(R.id.h2h_container_2, root);
            if (B2 != null) {
                u79 a2 = u79.a(B2);
                i = R.id.h2h_subtitle_2;
                TextView textView = (TextView) nq8.B(R.id.h2h_subtitle_2, root);
                if (textView != null) {
                    i = R.id.h2h_title;
                    TextView textView2 = (TextView) nq8.B(R.id.h2h_title, root);
                    if (textView2 != null) {
                        i = R.id.h2h_title_2;
                        TextView textView3 = (TextView) nq8.B(R.id.h2h_title_2, root);
                        if (textView3 != null) {
                            this.d = new z82((ViewGroup) root, (Object) a, (Object) a2, textView, (View) textView2, textView3, 12);
                            setVisibility(8);
                            o8.d(this, 0, 7);
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.duel_view;
    }
}
