package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o3p extends q3p {
    public final transient q3p c;

    public o3p(q3p q3pVar) {
        this.c = q3pVar;
    }

    @Override // defpackage.q3p, defpackage.j3p, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        q3p q3pVar = this.c;
        jca.e0(i, q3pVar.size());
        return q3pVar.get((q3pVar.size() - 1) - i);
    }

    @Override // defpackage.q3p, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.q3p, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.c.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.j3p
    public final boolean q() {
        return this.c.q();
    }

    @Override // defpackage.q3p
    public final q3p s() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.q3p, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final q3p subList(int i, int i2) {
        q3p q3pVar = this.c;
        jca.g0(i, i2, q3pVar.size());
        return q3pVar.subList(q3pVar.size() - i2, q3pVar.size() - i).s();
    }
}
