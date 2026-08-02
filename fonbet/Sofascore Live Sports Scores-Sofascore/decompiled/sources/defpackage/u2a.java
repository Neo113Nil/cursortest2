package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u2a implements krk {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final ImageView c;

    public u2a(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
