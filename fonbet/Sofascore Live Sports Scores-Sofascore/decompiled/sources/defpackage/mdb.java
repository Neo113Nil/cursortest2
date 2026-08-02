package defpackage;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mdb implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final e1d a = e.f(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        ((eoh) this.a).setValue(Boolean.valueOf(z));
    }
}
