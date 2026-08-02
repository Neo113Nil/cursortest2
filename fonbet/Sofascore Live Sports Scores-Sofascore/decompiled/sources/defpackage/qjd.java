package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qjd {
    public final Object a;
    public int b;
    public final /* synthetic */ rjd c;

    public qjd(rjd rjdVar, int i) {
        this.c = rjdVar;
        this.a = rjdVar.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        rjd rjdVar = this.c;
        if (i == -1 || i >= rjdVar.c || !sha.r(obj, rjdVar.a[i])) {
            this.b = rjdVar.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return rjdVar.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qjd) {
            qjd qjdVar = (qjd) obj;
            if (a() == qjdVar.a() && sha.r(this.a, qjdVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        return a == 1 ? valueOf : mz1.j(a, valueOf, " x ");
    }
}
