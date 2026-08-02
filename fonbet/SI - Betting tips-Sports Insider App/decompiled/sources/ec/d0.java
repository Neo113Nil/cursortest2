package ec;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.ProfitView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8918a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f8919b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f8920c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f8921d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f8922e;

    /* renamed from: f, reason: collision with root package name */
    public final CustomButton f8923f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f8924g;

    /* renamed from: h, reason: collision with root package name */
    public final ProfitView f8925h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f8926i;
    public final FrameLayout j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f8927k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f8928l;

    public d0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, FrameLayout frameLayout2, AppCompatImageView appCompatImageView2, CustomButton customButton, AppCompatImageView appCompatImageView3, ProfitView profitView, AppCompatImageView appCompatImageView4, FrameLayout frameLayout3, TextView textView, TextView textView2) {
        this.f8918a = constraintLayout;
        this.f8919b = appCompatImageView;
        this.f8920c = frameLayout;
        this.f8921d = frameLayout2;
        this.f8922e = appCompatImageView2;
        this.f8923f = customButton;
        this.f8924g = appCompatImageView3;
        this.f8925h = profitView;
        this.f8926i = appCompatImageView4;
        this.j = frameLayout3;
        this.f8927k = textView;
        this.f8928l = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8918a;
    }
}
