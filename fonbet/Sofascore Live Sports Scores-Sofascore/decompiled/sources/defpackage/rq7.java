package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rq7 implements Map.Entry, eia {
    public final t6b a;
    public final x6b b;
    public rq7 c;
    public rq7 d;
    public boolean e;

    public rq7(t6b t6bVar, x6b x6bVar) {
        this.a = t6bVar;
        this.b = x6bVar;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rq7) {
            rq7 rq7Var = (rq7) obj;
            return this.a.equals(rq7Var.a) && this.b == rq7Var.b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", value=" + this.b + ")";
    }
}
