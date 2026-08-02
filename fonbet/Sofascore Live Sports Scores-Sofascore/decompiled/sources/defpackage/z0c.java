package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z0c extends AtomicInteger implements k55 {
    public final w0c a;
    public final uxf b;
    public final a1c[] c;
    public final Object[] d;

    public z0c(w0c w0cVar, int i, uxf uxfVar) {
        super(i);
        this.a = w0cVar;
        this.b = uxfVar;
        a1c[] a1cVarArr = new a1c[i];
        for (int i2 = 0; i2 < i; i2++) {
            a1cVarArr[i2] = new a1c(this, i2);
        }
        this.c = a1cVarArr;
        this.d = new Object[i];
    }

    public final void a(int i) {
        a1c[] a1cVarArr = this.c;
        int length = a1cVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            a1c a1cVar = a1cVarArr[i2];
            a1cVar.getClass();
            r55.a(a1cVar);
        }
        while (true) {
            i++;
            if (i >= length) {
                return;
            }
            a1c a1cVar2 = a1cVarArr[i];
            a1cVar2.getClass();
            r55.a(a1cVar2);
        }
    }

    @Override // defpackage.k55
    public final void d() {
        if (getAndSet(0) > 0) {
            for (a1c a1cVar : this.c) {
                a1cVar.getClass();
                r55.a(a1cVar);
            }
        }
    }
}
