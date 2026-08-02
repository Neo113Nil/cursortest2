package ec;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f9001a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9002b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f9003c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f9004d;

    public s(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.f9001a = linearLayout;
        this.f9002b = textView;
        this.f9003c = linearLayout2;
        this.f9004d = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f9001a;
    }
}
