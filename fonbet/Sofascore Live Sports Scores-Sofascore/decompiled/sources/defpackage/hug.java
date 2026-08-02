package defpackage;

import android.view.View;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hug implements View.OnScrollChangeListener {
    public int a;
    public final /* synthetic */ ScrollInterceptorHorizontalScrollView b;

    public hug(ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView) {
        this.b = scrollInterceptorHorizontalScrollView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        if (i == this.a) {
            ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = this.b;
            super/*android.view.View*/.setOnScrollChangeListener(scrollInterceptorHorizontalScrollView.e);
        }
    }
}
