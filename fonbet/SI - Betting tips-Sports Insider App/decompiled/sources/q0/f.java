package q0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeProvider f21917a;

    public f() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f21917a = new e(this);
        } else {
            this.f21917a = new d(this);
        }
    }

    public c a(int i5) {
        return null;
    }

    public c b(int i5) {
        return null;
    }

    public boolean c(int i5, int i10, Bundle bundle) {
        return false;
    }

    public f(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f21917a = accessibilityNodeProvider;
    }
}
