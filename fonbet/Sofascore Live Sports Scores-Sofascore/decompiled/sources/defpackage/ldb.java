package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ldb implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final e1d a;
    public final e1d b;

    public ldb(ndb ndbVar) {
        Boolean bool = Boolean.FALSE;
        this.a = e.f(bool);
        this.b = e.f(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        ((eoh) this.a).setValue(Boolean.valueOf(ndb.c(accessibilityManager)));
        ((eoh) this.b).setValue(Boolean.valueOf(ndb.d(accessibilityManager)));
    }
}
