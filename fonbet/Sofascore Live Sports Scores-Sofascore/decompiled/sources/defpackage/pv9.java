package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pv9 extends cck {
    public int a;
    public Object b;
    public final /* synthetic */ Iterator c;

    public pv9(cck cckVar) {
        this.c = cckVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i <= 0) {
            qjd qjdVar = (qjd) this.c.next();
            this.b = qjdVar.a;
            i = qjdVar.a();
            this.a = i;
        }
        this.a = i - 1;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
