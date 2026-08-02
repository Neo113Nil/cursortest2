package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class drc implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final ImageView d;

    public drc(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.a = 5;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
    }

    public static drc a(View view) {
        int i = R.id.player1;
        ImageView imageView = (ImageView) nq8.B(R.id.player1, view);
        if (imageView != null) {
            i = R.id.player2;
            ImageView imageView2 = (ImageView) nq8.B(R.id.player2, view);
            if (imageView2 != null) {
                return new drc((ConstraintLayout) view, imageView, imageView2);
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ drc(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, e92 e92Var, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = imageView2;
        this.d = imageView4;
    }

    public drc(ConstraintLayout constraintLayout, e92 e92Var, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        this.a = 4;
        this.b = constraintLayout;
        this.c = imageView2;
        this.d = imageView4;
    }

    public drc(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout) {
        this.a = 6;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
    }

    public drc(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, e92 e92Var, e92 e92Var2, ImageView imageView5, ImageView imageView6) {
        this.a = 0;
        this.b = constraintLayout;
        this.c = imageView5;
        this.d = imageView6;
    }

    public drc(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, e92 e92Var, e92 e92Var2) {
        this.a = 3;
        this.b = constraintLayout;
        this.c = imageView5;
        this.d = imageView6;
    }
}
