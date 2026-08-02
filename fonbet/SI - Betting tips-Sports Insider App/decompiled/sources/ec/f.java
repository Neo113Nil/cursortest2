package ec;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f8932a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8933b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8934c;

    /* renamed from: d, reason: collision with root package name */
    public final SwipeRefreshLayout f8935d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f8936e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8937f;

    public f(FrameLayout frameLayout, ImageView imageView, TextView textView, SwipeRefreshLayout swipeRefreshLayout, TextView textView2, TextView textView3) {
        this.f8932a = frameLayout;
        this.f8933b = imageView;
        this.f8934c = textView;
        this.f8935d = swipeRefreshLayout;
        this.f8936e = textView2;
        this.f8937f = textView3;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8932a;
    }
}
