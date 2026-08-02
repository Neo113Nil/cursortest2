package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qmj implements rlj, Serializable {
    public final String a;
    public final ArrayList b;

    public qmj(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    @Override // defpackage.rlj
    public final gvh e0() {
        return gvh.c;
    }

    @Override // defpackage.rlj
    public final List f0() {
        return this.b;
    }

    @Override // defpackage.rlj
    public final String g0() {
        return this.a;
    }
}
