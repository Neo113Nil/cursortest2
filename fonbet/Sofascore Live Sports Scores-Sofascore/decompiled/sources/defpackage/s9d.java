package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s9d extends h6b {
    public static final /* synthetic */ int d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9d(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.click_area;
        View B = nq8.B(R.id.click_area, root);
        if (B != null) {
            i = R.id.divider;
            if (nq8.B(R.id.divider, root) != null) {
                i = R.id.guideline;
                if (((Guideline) nq8.B(R.id.guideline, root)) != null) {
                    i = R.id.ic_chevron;
                    if (((ImageView) nq8.B(R.id.ic_chevron, root)) != null) {
                        i = R.id.settings_link_text;
                        if (((TextView) nq8.B(R.id.settings_link_text, root)) != null) {
                            i = R.id.title;
                            if (((TextView) nq8.B(R.id.title, root)) != null) {
                                B.setOnClickListener(new ix4(context, 2));
                                return;
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        setVisibility(zu3.V.hasMcc(Integer.valueOf(ke0.c)) ? 0 : 8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.netherlands_regulations_footer;
    }
}
