package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rtg {
    public final String a;
    public final su b;
    public final long c;

    public rtg(String str, su suVar, long j) {
        this.a = str;
        this.b = suVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rtg)) {
            return false;
        }
        rtg rtgVar = (rtg) obj;
        return this.a.equals(rtgVar.a) && this.b.equals(rtgVar.b) && this.c == rtgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenSession(screenName=");
        sb.append(this.a);
        sb.append(", analyticsScreenData=");
        sb.append(this.b);
        sb.append(", startTime=");
        return lnb.l(this.c, ")", sb);
    }
}
