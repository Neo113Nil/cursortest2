package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v2j implements krk {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    public v2j(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = textView;
        this.f = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
