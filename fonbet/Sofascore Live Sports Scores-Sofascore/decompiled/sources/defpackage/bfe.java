package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bfe extends t7 implements wv9 {
    public static final bfe e;
    public final Object b;
    public final Object c;
    public final bee d;

    static {
        k03 k03Var = k03.d;
        bee beeVar = bee.f;
        beeVar.getClass();
        e = new bfe(k03Var, k03Var, beeVar);
    }

    public bfe(Object obj, Object obj2, bee beeVar) {
        this.b = obj;
        this.c = obj2;
        this.d = beeVar;
    }

    @Override // defpackage.v2, java.util.Collection
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.t7, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        u0k u0kVar = this.d.d;
        if (obj == this) {
            return true;
        }
        byte b = 0;
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                return set instanceof bfe ? u0kVar.g(((bfe) obj).d.d, new eee(b, 12)) : set instanceof dfe ? u0kVar.g(((dfe) obj).d.c, new eee(b, 13)) : super.equals(obj);
            }
        }
        return false;
    }

    @Override // defpackage.v2
    public final int getSize() {
        return this.d.e;
    }

    @Override // defpackage.t7, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        bee beeVar = this.d;
        return new afe(this.b, 1, beeVar);
    }
}
