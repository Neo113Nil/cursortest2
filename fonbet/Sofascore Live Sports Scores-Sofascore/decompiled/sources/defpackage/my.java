package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class my extends p9 {
    public final /* synthetic */ xy d;
    public final /* synthetic */ wma e;
    public final /* synthetic */ xy f;

    public my(xy xyVar, wma wmaVar, xy xyVar2) {
        this.d = xyVar;
        this.e = wmaVar;
        this.f = xyVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().f) goto L19;
     */
    @Override // defpackage.p9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, da daVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        xy xyVar = this.d;
        dz dzVar = xyVar.z;
        if (dzVar.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        wma wmaVar = this.e;
        wma v = wmaVar.v();
        while (true) {
            if (v == null) {
                v = null;
                break;
            } else if (v.F.n(8)) {
                break;
            } else {
                v = v.v();
            }
        }
        Integer valueOf = v != null ? Integer.valueOf(v.b) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        daVar.b = intValue;
        xy xyVar2 = this.f;
        accessibilityNodeInfo.setParent(xyVar2, intValue);
        int i = wmaVar.b;
        int d = dzVar.B.d(i);
        if (d != -1) {
            b50 G = yfa.G(xyVar.getAndroidViewsHandler$ui(), d);
            if (G != null) {
                accessibilityNodeInfo.setTraversalBefore(G);
            } else {
                accessibilityNodeInfo.setTraversalBefore(xyVar2, d);
            }
            xyVar.f(i, accessibilityNodeInfo, dzVar.D);
        }
        int d2 = dzVar.C.d(i);
        if (d2 != -1) {
            b50 G2 = yfa.G(xyVar.getAndroidViewsHandler$ui(), d2);
            if (G2 != null) {
                accessibilityNodeInfo.setTraversalAfter(G2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(xyVar2, d2);
            }
            xyVar.f(i, accessibilityNodeInfo, dzVar.E);
        }
    }
}
