package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class efe extends afe {
    public final dfe e;
    public Object f;
    public boolean g;
    public int h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public efe(dfe dfeVar) {
        super(r0, 1, r1);
        Object obj = dfeVar.b;
        fee feeVar = dfeVar.d;
        this.e = dfeVar;
        this.h = feeVar.e;
    }

    @Override // defpackage.afe, java.util.Iterator
    public final Object next() {
        if (this.e.d.e != this.h) {
            a70.o();
            return null;
        }
        Object next = super.next();
        this.f = next;
        this.g = true;
        return next;
    }

    @Override // defpackage.afe, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            zzl.s();
            return;
        }
        Object obj = this.f;
        dfe dfeVar = this.e;
        i5k.a(dfeVar).remove(obj);
        this.f = null;
        this.g = false;
        this.h = dfeVar.d.e;
        this.d--;
    }
}
