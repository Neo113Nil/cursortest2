package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cvl implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final BlazeTextView c;

    public cvl(ConstraintLayout constraintLayout, ImageView imageView, BlazeTextView blazeTextView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = blazeTextView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
