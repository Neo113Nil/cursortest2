package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dwf extends sv9 {
    public static final dwf h;
    public final transient rjd e;
    public final transient int f;
    public transient bwf g;

    static {
        rjd rjdVar = new rjd();
        rjdVar.d(3);
        h = new dwf(rjdVar);
    }

    public dwf(rjd rjdVar) {
        this.e = rjdVar;
        long j = 0;
        int i = 0;
        while (true) {
            int i2 = rjdVar.c;
            if (i >= i2) {
                this.f = jaa.M(j);
                return;
            } else {
                z1a.v(i, i2);
                j += rjdVar.b[i];
                i++;
            }
        }
    }

    @Override // defpackage.wu9
    public final boolean p() {
        throw null;
    }

    @Override // defpackage.sv9
    public final vv9 r() {
        bwf bwfVar = this.g;
        if (bwfVar != null) {
            return bwfVar;
        }
        bwf bwfVar2 = new bwf(this);
        this.g = bwfVar2;
        return bwfVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f;
    }

    @Override // defpackage.sv9, defpackage.wu9
    public Object writeReplace() {
        return new cwf(this);
    }
}
