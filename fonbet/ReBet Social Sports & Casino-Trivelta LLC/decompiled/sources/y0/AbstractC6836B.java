package y0;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: y0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6836B {
    public static void a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
