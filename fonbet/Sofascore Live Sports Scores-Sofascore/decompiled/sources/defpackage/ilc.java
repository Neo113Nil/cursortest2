package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ilc extends o8 {
    public final pn2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilc(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.end_glove_image;
        ImageView imageView = (ImageView) nq8.B(R.id.end_glove_image, root);
        if (imageView != null) {
            i = R.id.position_text;
            TextView textView = (TextView) nq8.B(R.id.position_text, root);
            if (textView != null) {
                i = R.id.start_glove_image;
                ImageView imageView2 = (ImageView) nq8.B(R.id.start_glove_image, root);
                if (imageView2 != null) {
                    this.d = new pn2((LinearLayout) root, imageView, textView, imageView2, 2);
                    setVisibility(8);
                    o8.d(this, 0, 7);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_current_position_layout;
    }
}
