package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zoho.livechat.android.ui.customviews.ZoomableImageView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f66327a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoomableImageView f66328b;

    public l(LinearLayout linearLayout, ZoomableImageView zoomableImageView) {
        this.f66327a = linearLayout;
        this.f66328b = zoomableImageView;
    }

    public static l a(View view) {
        int i10 = q.f60706y;
        ZoomableImageView zoomableImageView = (ZoomableImageView) N2.a.a(view, i10);
        if (zoomableImageView != null) {
            return new l((LinearLayout) view, zoomableImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static l c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static l d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60798n, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public LinearLayout b() {
        return this.f66327a;
    }
}
