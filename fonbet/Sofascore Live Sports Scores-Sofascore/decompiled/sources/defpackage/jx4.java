package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jx4 extends h6b {
    public static final /* synthetic */ int d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx4(Context context) {
        super(context, null, 0);
        context.getClass();
        int i = 0;
        View root = getRoot();
        int i2 = R.id.click_area_1;
        View B = nq8.B(R.id.click_area_1, root);
        if (B != null) {
            i2 = R.id.click_area_2;
            View B2 = nq8.B(R.id.click_area_2, root);
            if (B2 != null) {
                i2 = R.id.divider;
                if (nq8.B(R.id.divider, root) != null) {
                    i2 = R.id.ic_18_plus;
                    if (((ImageView) nq8.B(R.id.ic_18_plus, root)) != null) {
                        i2 = R.id.ic_chevron_1;
                        if (((ImageView) nq8.B(R.id.ic_chevron_1, root)) != null) {
                            i2 = R.id.ic_chevron_2;
                            if (((ImageView) nq8.B(R.id.ic_chevron_2, root)) != null) {
                                i2 = R.id.link_1;
                                if (((TextView) nq8.B(R.id.link_1, root)) != null) {
                                    i2 = R.id.link_2;
                                    if (((TextView) nq8.B(R.id.link_2, root)) != null) {
                                        i2 = R.id.title;
                                        if (((TextView) nq8.B(R.id.title, root)) != null) {
                                            B.setOnClickListener(new ix4(context, i));
                                            B2.setOnClickListener(new ix4(context, 1));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.rq4
    public final void e(u6b u6bVar) {
        u6bVar.getClass();
        Context context = getContext();
        context.getClass();
        setVisibility(rfo.L(context) ? 0 : 8);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.denmark_regulations_footer;
    }
}
