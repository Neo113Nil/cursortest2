package P8;

import O8.s;
import O8.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.ui.views.GifView;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8869a;

    /* renamed from: b, reason: collision with root package name */
    public final GifView f8870b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f8871c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f8872d;

    public f(ConstraintLayout constraintLayout, GifView gifView, ConstraintLayout constraintLayout2, ImageView imageView) {
        this.f8869a = constraintLayout;
        this.f8870b = gifView;
        this.f8871c = constraintLayout2;
        this.f8872d = imageView;
    }

    public static f a(View view) {
        int i10 = s.f8445D;
        GifView gifView = (GifView) N2.a.a(view, i10);
        if (gifView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = s.f8523w0;
            ImageView imageView = (ImageView) N2.a.a(view, i11);
            if (imageView != null) {
                return new f(constraintLayout, gifView, constraintLayout, imageView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(t.f8539j, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f8869a;
    }
}
