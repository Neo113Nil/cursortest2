package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cwf implements Serializable {
    public final Object[] a;
    public final int[] b;

    public cwf(dwf dwfVar) {
        int size = dwfVar.s().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (qjd qjdVar : dwfVar.s()) {
            this.a[i] = qjdVar.a;
            this.b[i] = qjdVar.a();
            i++;
        }
    }

    public Object readResolve() {
        Object[] objArr = this.a;
        int length = objArr.length;
        rjd rjdVar = new rjd();
        rjdVar.d(length);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            int i2 = this.b[i];
            if (i2 != 0) {
                obj.getClass();
                rjdVar.e(rjdVar.b(obj) + i2, obj);
            }
        }
        if (rjdVar.c != 0) {
            return new dwf(rjdVar);
        }
        int i3 = sv9.d;
        return dwf.h;
    }
}
