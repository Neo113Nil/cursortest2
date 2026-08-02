package ec;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final LinearLayout f8951a;

    /* renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f8952b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8953c;

    public i(LinearLayout linearLayout, FlexboxLayout flexboxLayout, TextView textView) {
        this.f8951a = linearLayout;
        this.f8952b = flexboxLayout;
        this.f8953c = textView;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8951a;
    }
}
