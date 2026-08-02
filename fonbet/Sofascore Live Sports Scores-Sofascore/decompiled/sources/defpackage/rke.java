package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rke implements i72 {
    public final i78 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        qx9.t(!false);
        new i78(sparseBooleanArray);
    }

    public rke(i78 i78Var) {
        this.a = i78Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rke) {
            return this.a.equals(((rke) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
