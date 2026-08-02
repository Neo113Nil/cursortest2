package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class z4 extends t7 {
    public final /* synthetic */ b5 b;

    public z4(b5 b5Var) {
        this.b = b5Var;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.b.d();
    }

    @Override // defpackage.t7, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new y4(this.b.a().iterator(), 0);
    }
}
