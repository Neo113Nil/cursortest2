package ec;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8947a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f8948b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f8949c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8950d;

    public h(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.f8947a = linearLayout;
        this.f8948b = textView;
        this.f8949c = linearLayout2;
        this.f8950d = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8947a;
    }
}
