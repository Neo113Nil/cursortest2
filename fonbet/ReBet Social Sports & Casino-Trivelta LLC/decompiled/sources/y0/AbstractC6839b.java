package y0;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: y0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6839b {
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
