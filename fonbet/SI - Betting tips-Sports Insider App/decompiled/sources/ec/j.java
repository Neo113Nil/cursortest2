package ec;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8955b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8956c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8957d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f8958e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8959f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8960g;

    public j(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4) {
        this.f8954a = linearLayout;
        this.f8955b = imageView;
        this.f8956c = textView;
        this.f8957d = textView2;
        this.f8958e = linearLayout2;
        this.f8959f = textView3;
        this.f8960g = textView4;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8954a;
    }
}
