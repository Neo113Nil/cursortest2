package ec;

import android.view.View;
import android.widget.FrameLayout;
import com.sports.insider.ui.views.OopsButton;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f9005a;

    /* renamed from: b, reason: collision with root package name */
    public final OopsButton f9006b;

    public t(FrameLayout frameLayout, OopsButton oopsButton) {
        this.f9005a = frameLayout;
        this.f9006b = oopsButton;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f9005a;
    }
}
