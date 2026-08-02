package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hcg extends RelativeLayout {
    public final ad2 a;
    public final ez0 b;
    public final hcg c;

    public hcg(Context context) {
        super(context);
        hs4 hs4Var = z45.a;
        this.a = s9a.c(rob.a);
        View inflate = LayoutInflater.from(context).inflate(R.layout.close_button_layout, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.close_image_view;
        ImageView imageView = (ImageView) nq8.B(R.id.close_image_view, inflate);
        if (imageView != null) {
            i = R.id.countdown_textview;
            TextView textView = (TextView) nq8.B(R.id.countdown_textview, inflate);
            if (textView != null) {
                this.b = new ez0(constraintLayout, constraintLayout, imageView, textView, 4);
                this.c = this;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                gig gigVar = gig.SMALL;
                int applyDimension = (int) TypedValue.applyDimension(1, 44.0f, displayMetrics);
                setLayoutParams(new RelativeLayout.LayoutParams(applyDimension, applyDimension));
                a(false);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(boolean z) {
        xw3.L(this.a, null, null, new mp1(this, z, null, 5), 3);
    }

    @NotNull
    public View getView() {
        return this.c;
    }

    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        ((ConstraintLayout) this.b.c).setOnClickListener(onClickListener);
    }
}
