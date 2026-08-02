package ec;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8988a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8989b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f8990c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8991d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8992e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f8993f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8994g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f8995h;

    public q(LinearLayout linearLayout, ImageView imageView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4) {
        this.f8988a = linearLayout;
        this.f8989b = imageView;
        this.f8990c = appCompatImageView;
        this.f8991d = textView;
        this.f8992e = textView2;
        this.f8993f = linearLayout2;
        this.f8994g = textView3;
        this.f8995h = textView4;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8988a;
    }
}
