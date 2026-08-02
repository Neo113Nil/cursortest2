package ud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.zoho.livechat.android.ui.ImagePager;
import od.q;
import od.r;

/* renamed from: ud.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6547a {

    /* renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f66257a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f66258b;

    /* renamed from: c, reason: collision with root package name */
    public final Toolbar f66259c;

    /* renamed from: d, reason: collision with root package name */
    public final ImagePager f66260d;

    /* renamed from: e, reason: collision with root package name */
    public final View f66261e;

    public C6547a(CoordinatorLayout coordinatorLayout, AppCompatImageView appCompatImageView, Toolbar toolbar, ImagePager imagePager, View view) {
        this.f66257a = coordinatorLayout;
        this.f66258b = appCompatImageView;
        this.f66259c = toolbar;
        this.f66260d = imagePager;
        this.f66261e = view;
    }

    public static C6547a a(View view) {
        View a10;
        int i10 = q.f60696x;
        AppCompatImageView appCompatImageView = (AppCompatImageView) N2.a.a(view, i10);
        if (appCompatImageView != null) {
            i10 = q.f60333N3;
            Toolbar toolbar = (Toolbar) N2.a.a(view, i10);
            if (toolbar != null) {
                i10 = q.f60552i5;
                ImagePager imagePager = (ImagePager) N2.a.a(view, i10);
                if (imagePager != null && (a10 = N2.a.a(view, (i10 = q.f60457Z7))) != null) {
                    return new C6547a((CoordinatorLayout) view, appCompatImageView, toolbar, imagePager, a10);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C6547a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static C6547a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(r.f60772a, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    public CoordinatorLayout b() {
        return this.f66257a;
    }
}
