package defpackage;

import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mv9 extends cck {
    public final cck a;
    public Object b = null;
    public cck c = mca.d;

    public mv9(iv9 iv9Var) {
        this.a = iv9Var.e.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((wu9) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new xu9(obj, this.c.next());
    }
}
