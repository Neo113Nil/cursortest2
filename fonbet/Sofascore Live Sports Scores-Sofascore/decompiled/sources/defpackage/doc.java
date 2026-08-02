package defpackage;

import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class doc implements krk {
    public final LinearLayout a;
    public final LinearLayout b;
    public final GridView c;
    public final CardView d;
    public final ConstraintLayout e;
    public final ImageView f;
    public final TextView g;
    public final TextView h;

    public doc(LinearLayout linearLayout, LinearLayout linearLayout2, GridView gridView, CardView cardView, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = gridView;
        this.d = cardView;
        this.e = constraintLayout;
        this.f = imageView;
        this.g = textView;
        this.h = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
