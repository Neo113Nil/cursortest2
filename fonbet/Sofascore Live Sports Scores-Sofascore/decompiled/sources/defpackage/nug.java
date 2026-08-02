package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nug implements syd {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public wtg e = null;
    public wtg f = null;

    public nug(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.syd
    public final boolean u0() {
        return this.b.contains(this);
    }
}
