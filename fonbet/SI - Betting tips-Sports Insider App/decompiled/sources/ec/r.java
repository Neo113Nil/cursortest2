package ec;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8996a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f8997b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8998c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f8999d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f9000e;

    public r(LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.f8996a = linearLayout;
        this.f8997b = appCompatImageView;
        this.f8998c = textView;
        this.f8999d = linearLayout2;
        this.f9000e = textView2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8996a;
    }
}
