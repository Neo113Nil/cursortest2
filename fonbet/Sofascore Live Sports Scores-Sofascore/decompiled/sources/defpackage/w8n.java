package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class w8n {
    public final Object a;
    public final int b;

    public w8n(int i, k7n k7nVar) {
        this.a = k7nVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w8n)) {
            return false;
        }
        w8n w8nVar = (w8n) obj;
        return this.a == w8nVar.a && this.b == w8nVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
