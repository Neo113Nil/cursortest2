package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hmm implements krk {
    public final ConstraintLayout a;
    public final BlazeTextView b;
    public final BlazeTextView c;
    public final ImageView d;

    public hmm(ConstraintLayout constraintLayout, BlazeTextView blazeTextView, BlazeTextView blazeTextView2, ImageView imageView) {
        this.a = constraintLayout;
        this.b = blazeTextView;
        this.c = blazeTextView2;
        this.d = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
