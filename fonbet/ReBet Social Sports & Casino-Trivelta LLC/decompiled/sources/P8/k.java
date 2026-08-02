package P8;

import O8.s;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.giphy.sdk.ui.views.GPHVideoControls;
import com.giphy.sdk.ui.views.VideoBufferingIndicator;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final View f8918a;

    /* renamed from: b, reason: collision with root package name */
    public final VideoBufferingIndicator f8919b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8920c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f8921d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f8922e;

    /* renamed from: f, reason: collision with root package name */
    public final ProgressBar f8923f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8924g;

    /* renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f8925h;

    /* renamed from: i, reason: collision with root package name */
    public final SurfaceView f8926i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f8927j;

    /* renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f8928k;

    /* renamed from: l, reason: collision with root package name */
    public final GPHVideoControls f8929l;

    public k(View view, VideoBufferingIndicator videoBufferingIndicator, TextView textView, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, ProgressBar progressBar, TextView textView2, ConstraintLayout constraintLayout2, SurfaceView surfaceView, TextView textView3, ConstraintLayout constraintLayout3, GPHVideoControls gPHVideoControls) {
        this.f8918a = view;
        this.f8919b = videoBufferingIndicator;
        this.f8920c = textView;
        this.f8921d = constraintLayout;
        this.f8922e = simpleDraweeView;
        this.f8923f = progressBar;
        this.f8924g = textView2;
        this.f8925h = constraintLayout2;
        this.f8926i = surfaceView;
        this.f8927j = textView3;
        this.f8928k = constraintLayout3;
        this.f8929l = gPHVideoControls;
    }

    public static k a(View view) {
        int i10 = s.f8486e;
        VideoBufferingIndicator videoBufferingIndicator = (VideoBufferingIndicator) N2.a.a(view, i10);
        if (videoBufferingIndicator != null) {
            i10 = s.f8510q;
            TextView textView = (TextView) N2.a.a(view, i10);
            if (textView != null) {
                i10 = s.f8512r;
                ConstraintLayout constraintLayout = (ConstraintLayout) N2.a.a(view, i10);
                if (constraintLayout != null) {
                    i10 = s.f8489f0;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) N2.a.a(view, i10);
                    if (simpleDraweeView != null) {
                        i10 = s.f8515s0;
                        ProgressBar progressBar = (ProgressBar) N2.a.a(view, i10);
                        if (progressBar != null) {
                            i10 = s.f8525x0;
                            TextView textView2 = (TextView) N2.a.a(view, i10);
                            if (textView2 != null) {
                                i10 = s.f8527y0;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) N2.a.a(view, i10);
                                if (constraintLayout2 != null) {
                                    i10 = s.f8444C0;
                                    SurfaceView surfaceView = (SurfaceView) N2.a.a(view, i10);
                                    if (surfaceView != null) {
                                        i10 = s.f8446D0;
                                        TextView textView3 = (TextView) N2.a.a(view, i10);
                                        if (textView3 != null) {
                                            i10 = s.f8448E0;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) N2.a.a(view, i10);
                                            if (constraintLayout3 != null) {
                                                i10 = s.f8460K0;
                                                GPHVideoControls gPHVideoControls = (GPHVideoControls) N2.a.a(view, i10);
                                                if (gPHVideoControls != null) {
                                                    return new k(view, videoBufferingIndicator, textView, constraintLayout, simpleDraweeView, progressBar, textView2, constraintLayout2, surfaceView, textView3, constraintLayout3, gPHVideoControls);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
