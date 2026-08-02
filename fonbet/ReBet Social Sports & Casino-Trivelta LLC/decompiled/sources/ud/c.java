package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66267a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f66268b;

    /* renamed from: c, reason: collision with root package name */
    public final MobilistenTextView f66269c;

    /* renamed from: d, reason: collision with root package name */
    public final MobilistenTextView f66270d;

    /* renamed from: e, reason: collision with root package name */
    public final View f66271e;

    /* renamed from: f, reason: collision with root package name */
    public final Group f66272f;

    /* renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f66273g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f66274h;

    /* renamed from: i, reason: collision with root package name */
    public final MobilistenTextView f66275i;

    /* renamed from: j, reason: collision with root package name */
    public final MobilistenTextView f66276j;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f66277k;

    /* renamed from: l, reason: collision with root package name */
    public final MobilistenTextView f66278l;

    /* renamed from: m, reason: collision with root package name */
    public final ImageView f66279m;

    public c(ConstraintLayout constraintLayout, ImageView imageView, MobilistenTextView mobilistenTextView, MobilistenTextView mobilistenTextView2, View view, Group group, ConstraintLayout constraintLayout2, ImageView imageView2, MobilistenTextView mobilistenTextView3, MobilistenTextView mobilistenTextView4, ImageView imageView3, MobilistenTextView mobilistenTextView5, ImageView imageView4) {
        this.f66267a = constraintLayout;
        this.f66268b = imageView;
        this.f66269c = mobilistenTextView;
        this.f66270d = mobilistenTextView2;
        this.f66271e = view;
        this.f66272f = group;
        this.f66273g = constraintLayout2;
        this.f66274h = imageView2;
        this.f66275i = mobilistenTextView3;
        this.f66276j = mobilistenTextView4;
        this.f66277k = imageView3;
        this.f66278l = mobilistenTextView5;
        this.f66279m = imageView4;
    }

    public static c a(View view) {
        View a10;
        int i10 = q.f60608o1;
        ImageView imageView = (ImageView) N2.a.a(view, i10);
        if (imageView != null) {
            i10 = q.f60678v1;
            MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i10);
            if (mobilistenTextView != null) {
                i10 = q.f60688w1;
                MobilistenTextView mobilistenTextView2 = (MobilistenTextView) N2.a.a(view, i10);
                if (mobilistenTextView2 != null && (a10 = N2.a.a(view, (i10 = q.f60698x1))) != null) {
                    i10 = q.f60708y1;
                    Group group = (Group) N2.a.a(view, i10);
                    if (group != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i10 = q.f60718z1;
                        ImageView imageView2 = (ImageView) N2.a.a(view, i10);
                        if (imageView2 != null) {
                            i10 = q.f60201A1;
                            MobilistenTextView mobilistenTextView3 = (MobilistenTextView) N2.a.a(view, i10);
                            if (mobilistenTextView3 != null) {
                                i10 = q.f60211B1;
                                MobilistenTextView mobilistenTextView4 = (MobilistenTextView) N2.a.a(view, i10);
                                if (mobilistenTextView4 != null) {
                                    i10 = q.f60551i4;
                                    ImageView imageView3 = (ImageView) N2.a.a(view, i10);
                                    if (imageView3 != null) {
                                        i10 = q.f60225C5;
                                        MobilistenTextView mobilistenTextView5 = (MobilistenTextView) N2.a.a(view, i10);
                                        if (mobilistenTextView5 != null) {
                                            i10 = q.f60378R8;
                                            ImageView imageView4 = (ImageView) N2.a.a(view, i10);
                                            if (imageView4 != null) {
                                                return new c(constraintLayout, imageView, mobilistenTextView, mobilistenTextView2, a10, group, constraintLayout, imageView2, mobilistenTextView3, mobilistenTextView4, imageView3, mobilistenTextView5, imageView4);
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

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60776c, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public ConstraintLayout b() {
        return this.f66267a;
    }
}
