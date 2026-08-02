package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66318a;

    /* renamed from: b, reason: collision with root package name */
    public final Placeholder f66319b;

    /* renamed from: c, reason: collision with root package name */
    public final MobilistenTextView f66320c;

    /* renamed from: d, reason: collision with root package name */
    public final MobilistenTextView f66321d;

    /* renamed from: e, reason: collision with root package name */
    public final MobilistenTextView f66322e;

    /* renamed from: f, reason: collision with root package name */
    public final MobilistenTextView f66323f;

    public j(ConstraintLayout constraintLayout, Placeholder placeholder, MobilistenTextView mobilistenTextView, MobilistenTextView mobilistenTextView2, MobilistenTextView mobilistenTextView3, MobilistenTextView mobilistenTextView4) {
        this.f66318a = constraintLayout;
        this.f66319b = placeholder;
        this.f66320c = mobilistenTextView;
        this.f66321d = mobilistenTextView2;
        this.f66322e = mobilistenTextView3;
        this.f66323f = mobilistenTextView4;
    }

    public static j a(View view) {
        int i10 = q.f60439Y;
        Placeholder placeholder = (Placeholder) N2.a.a(view, i10);
        if (placeholder != null) {
            i10 = q.f60693w6;
            MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i10);
            if (mobilistenTextView != null) {
                i10 = q.f60226C6;
                MobilistenTextView mobilistenTextView2 = (MobilistenTextView) N2.a.a(view, i10);
                if (mobilistenTextView2 != null) {
                    i10 = q.f60479b8;
                    MobilistenTextView mobilistenTextView3 = (MobilistenTextView) N2.a.a(view, i10);
                    if (mobilistenTextView3 != null) {
                        i10 = q.f60725z8;
                        MobilistenTextView mobilistenTextView4 = (MobilistenTextView) N2.a.a(view, i10);
                        if (mobilistenTextView4 != null) {
                            return new j((ConstraintLayout) view, placeholder, mobilistenTextView, mobilistenTextView2, mobilistenTextView3, mobilistenTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static j d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60792k, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66318a;
    }
}
