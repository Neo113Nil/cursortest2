package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r3i implements krk {
    public final LinearLayout a;
    public final TextView b;
    public final ShapeableImageView c;
    public final TextView d;

    public r3i(LinearLayout linearLayout, TextView textView, ShapeableImageView shapeableImageView, TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = shapeableImageView;
        this.d = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
