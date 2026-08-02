package q0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final f f21916a;

    public d(f fVar) {
        this.f21916a = fVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
        c a7 = this.f21916a.a(i5);
        if (a7 == null) {
            return null;
        }
        return a7.f21914a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i5) {
        this.f21916a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i5) {
        c b10 = this.f21916a.b(i5);
        if (b10 == null) {
            return null;
        }
        return b10.f21914a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i5, int i10, Bundle bundle) {
        return this.f21916a.c(i5, i10, bundle);
    }
}
