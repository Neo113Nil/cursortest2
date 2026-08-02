package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cfe extends t7 implements xv9, Collection, eia {
    public static final cfe e;
    public final Object b;
    public final Object c;
    public final cee d;

    static {
        it7 it7Var = it7.k;
        e = new cfe(it7Var, it7Var, cee.f);
    }

    public cfe(Object obj, Object obj2, cee ceeVar) {
        this.b = obj;
        this.c = obj2;
        this.d = ceeVar;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.d.e;
    }

    @Override // defpackage.t7, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new afe(this.b, 2, this.d);
    }
}
