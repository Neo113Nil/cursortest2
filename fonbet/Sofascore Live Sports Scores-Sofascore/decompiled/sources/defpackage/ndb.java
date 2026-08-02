package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.e;
import java.util.List;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ndb implements AccessibilityManager.AccessibilityStateChangeListener, cdi {
    public final boolean a;
    public final boolean b;
    public final e1d c = e.f(Boolean.FALSE);
    public final mdb d;
    public final ldb e;

    public ndb(boolean z, boolean z2, boolean z3) {
        this.a = z2;
        this.b = z3;
        ldb ldbVar = null;
        this.d = z ? new mdb() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            ldbVar = new ldb(this);
        }
        this.e = ldbVar;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.J(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && StringsKt.J(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void e(AccessibilityManager accessibilityManager) {
        ldb ldbVar;
        ((eoh) this.c).setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
        accessibilityManager.addAccessibilityStateChangeListener(this);
        mdb mdbVar = this.d;
        if (mdbVar != null) {
            ((eoh) mdbVar.a).setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
            accessibilityManager.addTouchExplorationStateChangeListener(mdbVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (ldbVar = this.e) == null) {
            return;
        }
        ((eoh) ldbVar.a).setValue(Boolean.valueOf(c(accessibilityManager)));
        ((eoh) ldbVar.b).setValue(Boolean.valueOf(d(accessibilityManager)));
        accessibilityManager.addAccessibilityServicesStateChangeListener(ldbVar);
    }

    public final void f(AccessibilityManager accessibilityManager) {
        ldb ldbVar;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        mdb mdbVar = this.d;
        if (mdbVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(mdbVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (ldbVar = this.e) == null) {
            return;
        }
        accessibilityManager.removeAccessibilityServicesStateChangeListener(ldbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        if (((java.lang.Boolean) ((defpackage.eoh) r2.a).getValue()).booleanValue() == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (((java.lang.Boolean) ((defpackage.eoh) r2.b).getValue()).booleanValue() == true) goto L22;
     */
    @Override // defpackage.cdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getValue() {
        boolean z;
        if (((Boolean) ((eoh) this.c).getValue()).booleanValue()) {
            z = true;
            mdb mdbVar = this.d;
            if (mdbVar == null || !((Boolean) ((eoh) mdbVar.a).getValue()).booleanValue()) {
                boolean z2 = this.a;
                ldb ldbVar = this.e;
                if (z2) {
                    if (ldbVar != null) {
                    }
                }
                if (this.b) {
                    if (ldbVar != null) {
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        ((eoh) this.c).setValue(Boolean.valueOf(z));
    }
}
