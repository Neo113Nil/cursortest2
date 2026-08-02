package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i7d implements Iterator, eia {
    public int a = -1;
    public boolean b;
    public final /* synthetic */ gtj c;

    public i7d(gtj gtjVar) {
        this.c = gtjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < ((zwh) this.c.e).e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        this.b = true;
        zwh zwhVar = (zwh) this.c.e;
        int i = this.a + 1;
        this.a = i;
        return (s6d) zwhVar.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            a70.r("You must call next() before you can remove an element");
            return;
        }
        zwh zwhVar = (zwh) this.c.e;
        ((s6d) zwhVar.f(this.a)).c = null;
        int i = this.a;
        Object[] objArr = zwhVar.c;
        Object obj = objArr[i];
        Object obj2 = gz8.e;
        if (obj != obj2) {
            objArr[i] = obj2;
            zwhVar.a = true;
        }
        this.a = i - 1;
        this.b = false;
    }
}
