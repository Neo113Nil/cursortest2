package ec;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8969a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f8970b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f8971c;

    public m(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2) {
        this.f8969a = linearLayout;
        this.f8970b = appCompatImageView;
        this.f8971c = linearLayout2;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8969a;
    }
}
