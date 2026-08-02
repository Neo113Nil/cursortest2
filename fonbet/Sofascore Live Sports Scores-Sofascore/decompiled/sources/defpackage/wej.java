package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wej {
    public final long a;
    public final long b;

    public wej(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wej)) {
            return false;
        }
        wej wejVar = (wej) obj;
        long j = wejVar.a;
        int i = r13.j;
        return e8k.a(this.a, j) && e8k.a(this.b, wejVar.b);
    }

    public final int hashCode() {
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        vxd.q(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) r13.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
