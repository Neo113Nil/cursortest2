package ec;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8977a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f8978b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8979c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8980d;

    /* renamed from: e, reason: collision with root package name */
    public final LinearLayout f8981e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f8982f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8983g;

    public o(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout2, TextView textView3, TextView textView4) {
        this.f8977a = linearLayout;
        this.f8978b = imageView;
        this.f8979c = textView;
        this.f8980d = textView2;
        this.f8981e = linearLayout2;
        this.f8982f = textView3;
        this.f8983g = textView4;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8977a;
    }
}
