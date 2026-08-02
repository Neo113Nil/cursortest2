package ec;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.SiGradientRView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f8841a;

    /* renamed from: b, reason: collision with root package name */
    public final CustomButton f8842b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8843c;

    /* renamed from: d, reason: collision with root package name */
    public final AppCompatImageView f8844d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f8845e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f8846f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f8847g;

    /* renamed from: h, reason: collision with root package name */
    public final SiGradientRView f8848h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f8849i;
    public final TextView j;

    public a(FrameLayout frameLayout, CustomButton customButton, TextView textView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, SiGradientRView siGradientRView, TextView textView2, TextView textView3) {
        this.f8841a = frameLayout;
        this.f8842b = customButton;
        this.f8843c = textView;
        this.f8844d = appCompatImageView;
        this.f8845e = appCompatImageView2;
        this.f8846f = appCompatImageView3;
        this.f8847g = appCompatImageView4;
        this.f8848h = siGradientRView;
        this.f8849i = textView2;
        this.j = textView3;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8841a;
    }
}
