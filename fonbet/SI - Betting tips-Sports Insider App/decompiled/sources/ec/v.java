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
public final class v implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f9018a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f9019b;

    /* renamed from: c, reason: collision with root package name */
    public final CustomGradientButton f9020c;

    /* renamed from: d, reason: collision with root package name */
    public final CustomButton f9021d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f9022e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f9023f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckPrice f9024g;

    /* renamed from: h, reason: collision with root package name */
    public final ProfitView f9025h;

    /* renamed from: i, reason: collision with root package name */
    public final AppCompatImageView f9026i;
    public final FrameLayout j;

    /* renamed from: k, reason: collision with root package name */
    public final MaterialTextView f9027k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f9028l;

    public v(ConstraintLayout constraintLayout, FrameLayout frameLayout, CustomGradientButton customGradientButton, CustomButton customButton, ImageView imageView, AppCompatImageView appCompatImageView, CheckPrice checkPrice, ProfitView profitView, AppCompatImageView appCompatImageView2, FrameLayout frameLayout2, MaterialTextView materialTextView, TextView textView) {
        this.f9018a = constraintLayout;
        this.f9019b = frameLayout;
        this.f9020c = customGradientButton;
        this.f9021d = customButton;
        this.f9022e = imageView;
        this.f9023f = appCompatImageView;
        this.f9024g = checkPrice;
        this.f9025h = profitView;
        this.f9026i = appCompatImageView2;
        this.j = frameLayout2;
        this.f9027k = materialTextView;
        this.f9028l = textView;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f9018a;
    }
}
