package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class klh implements og3, Iterable, eia {
    public final jlh a;
    public final int b;
    public final int c;

    public klh(jlh jlhVar, int i, int i2) {
        this.a = jlhVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof klh)) {
            return false;
        }
        klh klhVar = (klh) obj;
        return klhVar.b == this.b && klhVar.c == this.c && klhVar.a == this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        jlh jlhVar = this.a;
        if (jlhVar.h != this.c) {
            llh.e();
        }
        int i = this.b;
        jlhVar.p(i);
        return new y39(jlhVar, i + 1, jlhVar.a[(i * 5) + 3] + i);
    }
}
