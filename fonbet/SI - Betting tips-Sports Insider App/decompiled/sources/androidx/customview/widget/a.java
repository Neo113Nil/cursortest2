package androidx.customview.widget;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends q0.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1544b;

    public a(b bVar) {
        this.f1544b = bVar;
    }

    @Override // q0.f
    public final q0.c a(int i5) {
        return new q0.c(AccessibilityNodeInfo.obtain(this.f1544b.obtainAccessibilityNodeInfo(i5).f21914a));
    }

    @Override // q0.f
    public final q0.c b(int i5) {
        b bVar = this.f1544b;
        int i10 = i5 == 2 ? bVar.mAccessibilityFocusedVirtualViewId : bVar.mKeyboardFocusedVirtualViewId;
        if (i10 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i10);
    }

    @Override // q0.f
    public final boolean c(int i5, int i10, Bundle bundle) {
        return this.f1544b.performAction(i5, i10, bundle);
    }
}
