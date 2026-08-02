package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class q52 extends o8 {
    public final nz0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q52(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.banner_activity_link_arrow;
        ImageView imageView = (ImageView) nq8.B(R.id.banner_activity_link_arrow, root);
        if (imageView != null) {
            i = R.id.banner_activity_link_click_area;
            View B = nq8.B(R.id.banner_activity_link_click_area, root);
            if (B != null) {
                i = R.id.banner_activity_link_text;
                TextView textView = (TextView) nq8.B(R.id.banner_activity_link_text, root);
                if (textView != null) {
                    this.d = new nz0(B, imageView, textView, (ConstraintLayout) root);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.banner_activity_link;
    }

    public final void j() {
        nz0 nz0Var = this.d;
        View view = nz0Var.e;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.v = 0;
        tl3Var.t = R.id.banner_activity_link_text;
        tl3Var.setMarginStart(0);
        Context context = view.getContext();
        context.getClass();
        tl3Var.setMarginEnd(ao2.s(16, context));
        view.setLayoutParams(tl3Var);
        ImageView imageView = nz0Var.c;
        imageView.setRotation(270.0f);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.getClass();
        tl3 tl3Var2 = (tl3) layoutParams2;
        tl3Var2.v = R.id.banner_activity_link_click_area;
        tl3Var2.t = -1;
        tl3Var2.setMarginStart(0);
        Context context2 = imageView.getContext();
        context2.getClass();
        tl3Var2.setMarginEnd(ao2.s(8, context2));
        imageView.setLayoutParams(tl3Var2);
        TextView textView = nz0Var.d;
        Context context3 = textView.getContext();
        context3.getClass();
        textView.setPaddingRelative(ao2.s(12, context3), 0, 0, 0);
        ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        layoutParams3.getClass();
        tl3 tl3Var3 = (tl3) layoutParams3;
        tl3Var3.s = -1;
        tl3Var3.u = R.id.banner_activity_link_arrow;
        Context context4 = textView.getContext();
        context4.getClass();
        tl3Var3.setMarginEnd(ao2.s(4, context4));
        textView.setLayoutParams(tl3Var3);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.d.e.setOnClickListener(onClickListener);
    }

    public final void setText(@NotNull String str) {
        str.getClass();
        this.d.d.setText(str);
    }
}
