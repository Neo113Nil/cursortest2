package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f89 implements krk {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final ImageView c;
    public final ImageView d;
    public final ScrollInterceptorHorizontalScrollView e;

    public f89(ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = scrollInterceptorHorizontalScrollView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
