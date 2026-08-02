package y2;

import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10826b {

    /* renamed from: y2.b$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z11);
    }

    /* renamed from: y2.b$b, reason: collision with other inner class name */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC2289b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final a f105938a;

        AccessibilityManagerTouchExplorationStateChangeListenerC2289b(@NonNull a aVar) {
            this.f105938a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC2289b) {
                return this.f105938a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC2289b) obj).f105938a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f105938a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z11) {
            this.f105938a.onTouchExplorationStateChanged(z11);
        }
    }

    public static void a(@NonNull AccessibilityManager accessibilityManager, @NonNull a aVar) {
        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2289b(aVar));
    }

    public static void b(@NonNull AccessibilityManager accessibilityManager, @NonNull a aVar) {
        accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC2289b(aVar));
    }
}
