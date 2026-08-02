package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mwc {
    public final long a;
    public final long b;
    public final boolean c;

    public mwc(boolean z, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final mwc a(mwc mwcVar) {
        return new mwc(this.c, dnd.i(this.a, mwcVar.a), Math.max(this.b, mwcVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwc)) {
            return false;
        }
        mwc mwcVar = (mwc) obj;
        return dnd.c(this.a, mwcVar.a) && this.b == mwcVar.b && this.c == mwcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ljg.c(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) dnd.k(this.a));
        sb.append(", timeMillis=");
        sb.append(this.b);
        sb.append(", shouldApplyImmediately=");
        return lnb.r(sb, this.c, ')');
    }
}
