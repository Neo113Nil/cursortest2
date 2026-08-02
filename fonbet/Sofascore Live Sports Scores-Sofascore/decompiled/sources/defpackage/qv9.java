package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qv9 extends vu9 {
    public rjd a;
    public boolean b;

    @Override // defpackage.vu9
    public final vu9 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:9:0x0019). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, Object obj) {
        int i2;
        rjd rjdVar = this.a;
        if (i == 0) {
            return;
        }
        if (this.b) {
            rjd rjdVar2 = new rjd();
            rjdVar2.d(rjdVar.c);
            if (rjdVar.c != 0) {
                i2 = 0;
                while (i2 != -1) {
                    z1a.v(i2, rjdVar.c);
                    Object obj2 = rjdVar.a[i2];
                    z1a.v(i2, rjdVar.c);
                    rjdVar2.e(rjdVar.b[i2], obj2);
                    i2++;
                    if (i2 < rjdVar.c) {
                    }
                }
                this.a = rjdVar2;
            }
            i2 = -1;
            while (i2 != -1) {
            }
            this.a = rjdVar2;
        }
        this.b = false;
        obj.getClass();
        rjd rjdVar3 = this.a;
        rjdVar3.e(rjdVar3.b(obj) + i, obj);
    }
}
