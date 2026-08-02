package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.blaze.blazesdk.widgets.ui.WidgetTimeElementCustomView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nym implements krk {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final BlazeTextView d;
    public final View e;
    public final WidgetTimeElementCustomView f;
    public final WidgetTimeElementCustomView g;
    public final CardView h;
    public final StatusIndicatorView i;
    public final BlazeTextView j;
    public final FrameLayout k;
    public final ImageView l;
    public final ConstraintLayout m;

    public nym(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, BlazeTextView blazeTextView, View view, WidgetTimeElementCustomView widgetTimeElementCustomView, WidgetTimeElementCustomView widgetTimeElementCustomView2, CardView cardView, StatusIndicatorView statusIndicatorView, BlazeTextView blazeTextView2, FrameLayout frameLayout, ImageView imageView2, ConstraintLayout constraintLayout3) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = imageView;
        this.d = blazeTextView;
        this.e = view;
        this.f = widgetTimeElementCustomView;
        this.g = widgetTimeElementCustomView2;
        this.h = cardView;
        this.i = statusIndicatorView;
        this.j = blazeTextView2;
        this.k = frameLayout;
        this.l = imageView2;
        this.m = constraintLayout3;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
