package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kwh implements og3, Iterable, eia {
    public final jlh a;
    public final int b;
    public final mwf c;

    public kwh(jlh jlhVar, int i, cv8 cv8Var, mwf mwfVar) {
        this.a = jlhVar;
        this.b = i;
        this.c = mwfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kwh)) {
            return false;
        }
        kwh kwhVar = (kwh) obj;
        return kwhVar.b == this.b && kwhVar.a == this.a && kwhVar.c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.a.hashCode() + (this.b * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jwh(this.a, this.b, null, this.c);
    }
}
