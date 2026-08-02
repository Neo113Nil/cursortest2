package ec;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import com.sports.insider.ui.views.CheckPrice;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.CustomGradientButton;
import com.sports.insider.ui.views.ProfitView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f9029a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9030b;

    /* renamed from: c, reason: collision with root package name */
    public final CustomGradientButton f9031c;

    /* renamed from: d, reason: collision with root package name */
    public final CustomButton f9032d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9033e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f9034f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckPrice f9035g;

    /* renamed from: h, reason: collision with root package name */
    public final ProfitView f9036h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f9037i;
    public final FrameLayout j;

    /* renamed from: k, reason: collision with root package name */
    public final MaterialTextView f9038k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f9039l;

    public w(ConstraintLayout constraintLayout, FrameLayout frameLayout, CustomGradientButton customGradientButton, CustomButton customButton, ImageView imageView, AppCompatImageView appCompatImageView, CheckPrice checkPrice, ProfitView profitView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout2, MaterialTextView materialTextView, TextView textView) {
        this.f9029a = constraintLayout;
        this.f9030b = frameLayout;
        this.f9031c = customGradientButton;
        this.f9032d = customButton;
        this.f9033e = imageView;
        this.f9034f = appCompatImageView;
        this.f9035g = checkPrice;
        this.f9036h = profitView;
        this.f9037i = appCompatImageView2;
        this.j = frameLayout2;
        this.f9038k = materialTextView;
        this.f9039l = textView;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f9029a;
    }
}
