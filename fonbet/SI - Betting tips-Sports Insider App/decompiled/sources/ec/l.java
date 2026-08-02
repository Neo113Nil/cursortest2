package ec;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8963a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8964b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f8965c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8966d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f8967e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8968f;

    public l(LinearLayout linearLayout, ImageView imageView, AppCompatImageView appCompatImageView, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.f8963a = linearLayout;
        this.f8964b = imageView;
        this.f8965c = appCompatImageView;
        this.f8966d = textView;
        this.f8967e = linearLayout2;
        this.f8968f = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8963a;
    }
}
