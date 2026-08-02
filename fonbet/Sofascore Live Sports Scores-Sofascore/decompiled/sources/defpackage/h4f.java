package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h4f extends l8d {
    public final Object a;
    public final long b;

    public h4f(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4f)) {
            return false;
        }
        h4f h4fVar = (h4f) obj;
        return this.a.equals(h4fVar.a) && this.b == h4fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb.append(this.a);
        sb.append(", compositeKey=");
        return fn0.n(sb, this.b, ')');
    }
}
