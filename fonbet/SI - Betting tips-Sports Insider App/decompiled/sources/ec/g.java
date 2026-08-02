package ec;

import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8938a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8939b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f8940c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f8941d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f8942e;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f8943f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f8944g;

    /* renamed from: h, reason: collision with root package name */
    public final FrameLayout f8945h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f8946i;
    public final SwipeRefreshLayout j;

    public g(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, RecyclerView recyclerView, EditText editText, FrameLayout frameLayout, ImageView imageView4, SwipeRefreshLayout swipeRefreshLayout) {
        this.f8938a = constraintLayout;
        this.f8939b = imageView;
        this.f8940c = imageView2;
        this.f8941d = imageView3;
        this.f8942e = constraintLayout2;
        this.f8943f = recyclerView;
        this.f8944g = editText;
        this.f8945h = frameLayout;
        this.f8946i = imageView4;
        this.j = swipeRefreshLayout;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8938a;
    }
}
