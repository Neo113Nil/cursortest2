package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hnk extends b7e {
    public final boolean Y(int i) {
        Object a0 = CollectionsKt.a0(i + 1, this.i);
        Integer valueOf = a0 != null ? Integer.valueOf(v(a0)) : null;
        haf hafVar = pzh.b;
        if (valueOf != null && valueOf.intValue() == 0) {
            return false;
        }
        return valueOf == null || valueOf.intValue() != 5;
    }

    @Override // defpackage.b7e, defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        return i == 5 ? new ai6(this, pvk.a(layoutInflater, viewGroup), 3) : i == 0 ? new wk4(this, bcb.a(layoutInflater, viewGroup), 4) : i == 2 ? new bs7(zl.e(layoutInflater, viewGroup), false, 0, false, 30, 1) : super.z(viewGroup, i);
    }
}
