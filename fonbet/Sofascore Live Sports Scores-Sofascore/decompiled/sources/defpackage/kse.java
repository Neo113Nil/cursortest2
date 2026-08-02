package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kse implements krk {
    public final LinearLayout a;
    public final LinearLayout b;
    public final ImageView c;
    public final ImageView d;
    public final ScrollInterceptorHorizontalScrollView e;

    public kse(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView, TextView textView) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = imageView;
        this.d = imageView2;
        this.e = scrollInterceptorHorizontalScrollView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
