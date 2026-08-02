package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bjc {
    public final SparseArray a;
    public d6k b;

    public bjc(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(d6k d6kVar, int i, int i2) {
        int a = d6kVar.a(i);
        SparseArray sparseArray = this.a;
        bjc bjcVar = (bjc) sparseArray.get(a);
        if (bjcVar == null) {
            bjcVar = new bjc(1);
            sparseArray.put(d6kVar.a(i), bjcVar);
        }
        if (i2 > i) {
            bjcVar.a(d6kVar, i + 1, i2);
        } else {
            bjcVar.b = d6kVar;
        }
    }
}
