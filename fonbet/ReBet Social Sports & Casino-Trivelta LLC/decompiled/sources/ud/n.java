package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import od.q;
import od.r;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f66334a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f66335b;

    /* renamed from: c, reason: collision with root package name */
    public final View f66336c;

    /* renamed from: d, reason: collision with root package name */
    public final MobilistenTextView f66337d;

    /* renamed from: e, reason: collision with root package name */
    public final MobilistenTextView f66338e;

    /* renamed from: f, reason: collision with root package name */
    public final View f66339f;

    /* renamed from: g, reason: collision with root package name */
    public final View f66340g;

    public n(View view, ImageView imageView, View view2, MobilistenTextView mobilistenTextView, MobilistenTextView mobilistenTextView2, View view3, View view4) {
        this.f66334a = view;
        this.f66335b = imageView;
        this.f66336c = view2;
        this.f66337d = mobilistenTextView;
        this.f66338e = mobilistenTextView2;
        this.f66339f = view3;
        this.f66340g = view4;
    }

    public static n a(View view) {
        View a10;
        View a11;
        View a12;
        int i10 = q.f60676v;
        ImageView imageView = (ImageView) N2.a.a(view, i10);
        if (imageView != null && (a10 = N2.a.a(view, (i10 = q.f60279I))) != null) {
            i10 = q.f60469a9;
            MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i10);
            if (mobilistenTextView != null) {
                i10 = q.f60480b9;
                MobilistenTextView mobilistenTextView2 = (MobilistenTextView) N2.a.a(view, i10);
                if (mobilistenTextView2 != null && (a11 = N2.a.a(view, (i10 = q.f60513e9))) != null && (a12 = N2.a.a(view, (i10 = q.f60524f9))) != null) {
                    return new n(view, imageView, a10, mobilistenTextView, mobilistenTextView2, a11, a12);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static n b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(r.f60733D0, viewGroup);
        return a(viewGroup);
    }
}
