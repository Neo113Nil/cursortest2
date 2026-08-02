package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bwf extends c1a {
    public final /* synthetic */ dwf d;

    public bwf(dwf dwfVar) {
        this.d = dwfVar;
    }

    @Override // defpackage.wu9, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.contains(obj);
    }

    @Override // defpackage.c1a
    public final Object get(int i) {
        rjd rjdVar = this.d.e;
        z1a.v(i, rjdVar.c);
        return rjdVar.a[i];
    }

    @Override // defpackage.wu9
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.e.c;
    }

    @Override // defpackage.c1a, defpackage.vv9, defpackage.wu9
    public Object writeReplace() {
        return super.writeReplace();
    }
}
