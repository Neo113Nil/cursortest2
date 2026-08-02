package ec;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sports.insider.ui.views.CustomGradientButton;
import com.sports.insider.ui.views.LivePrice;
import com.sports.insider.ui.views.ProfitViewV2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c0 implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8885a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f8886b;

    /* renamed from: c, reason: collision with root package name */
    public final FrameLayout f8887c;

    /* renamed from: d, reason: collision with root package name */
    public final CustomGradientButton f8888d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f8889e;

    /* renamed from: f, reason: collision with root package name */
    public final LivePrice f8890f;

    /* renamed from: g, reason: collision with root package name */
    public final ProfitViewV2 f8891g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f8892h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f8893i;
    public final TextView j;

    public c0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, CustomGradientButton customGradientButton, AppCompatImageView appCompatImageView2, LivePrice livePrice, ProfitViewV2 profitViewV2, FrameLayout frameLayout2, TextView textView, TextView textView2) {
        this.f8885a = constraintLayout;
        this.f8886b = appCompatImageView;
        this.f8887c = frameLayout;
        this.f8888d = customGradientButton;
        this.f8889e = appCompatImageView2;
        this.f8890f = livePrice;
        this.f8891g = profitViewV2;
        this.f8892h = frameLayout2;
        this.f8893i = textView;
        this.j = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8885a;
    }
}
