package y2;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeProvider f105961a;

    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final r f105962a;

        a(r rVar) {
            this.f105962a = rVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            q b11 = this.f105962a.b(i11);
            if (b11 == null) {
                return null;
            }
            return b11.z0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i11) {
            this.f105962a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i11) {
            q c11 = this.f105962a.c(i11);
            if (c11 == null) {
                return null;
            }
            return c11.z0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i11, int i12, Bundle bundle) {
            return this.f105962a.e(i11, i12, bundle);
        }
    }

    static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f105962a.a(i11, q.A0(accessibilityNodeInfo), str, bundle);
        }
    }

    public r() {
        this.f105961a = new b(this);
    }

    public void a(int i11, @NonNull q qVar, @NonNull String str, Bundle bundle) {
    }

    public q b(int i11) {
        return null;
    }

    public q c(int i11) {
        return null;
    }

    public final Object d() {
        return this.f105961a;
    }

    public boolean e(int i11, int i12, Bundle bundle) {
        return false;
    }

    public r(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f105961a = accessibilityNodeProvider;
    }
}
