package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cld implements krk {
    public final FrameLayout a;
    public final FrameLayout b;
    public final ConstraintLayout c;
    public final TextView d;
    public final ImageView e;
    public final View f;

    public cld(FrameLayout frameLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout2, ConstraintLayout constraintLayout, TextView textView, ImageView imageView, View view) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = constraintLayout;
        this.d = textView;
        this.e = imageView;
        this.f = view;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
