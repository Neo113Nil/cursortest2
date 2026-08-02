package ec;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8972a;

    /* renamed from: b, reason: collision with root package name */
    public final LinearLayout f8973b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f8974c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8975d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8976e;

    public n(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, TextView textView, TextView textView2) {
        this.f8972a = linearLayout;
        this.f8973b = linearLayout2;
        this.f8974c = imageView;
        this.f8975d = textView;
        this.f8976e = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8972a;
    }
}
