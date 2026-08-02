package defpackage;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class unm implements krk {
    public final ConstraintLayout a;
    public final View b;
    public final CardView c;
    public final BlazeTextView d;
    public final CardView e;

    public unm(ConstraintLayout constraintLayout, View view, CardView cardView, BlazeTextView blazeTextView, CardView cardView2) {
        this.a = constraintLayout;
        this.b = view;
        this.c = cardView;
        this.d = blazeTextView;
        this.e = cardView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
