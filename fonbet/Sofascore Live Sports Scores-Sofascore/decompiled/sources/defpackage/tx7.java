package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tx7 {
    public sl6 a;
    public sl6 b;
    public sl6 c;
    public sl6 d;
    public boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tx7) {
            tx7 tx7Var = (tx7) obj;
            if (this.a == tx7Var.a && this.b == tx7Var.b && this.c == tx7Var.c && this.d == tx7Var.d && this.e == tx7Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (Integer.hashCode(0) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        sl6 sl6Var = this.a;
        sl6 sl6Var2 = this.b;
        sl6 sl6Var3 = this.c;
        sl6 sl6Var4 = this.d;
        boolean z = this.e;
        StringBuilder sb = new StringBuilder("FeedPagingState(page=0, newsPage=");
        sb.append(sl6Var);
        sb.append(", videoPage=");
        sb.append(sl6Var2);
        sb.append(", shortVideoPage=");
        sb.append(sl6Var3);
        sb.append(", influencerVideoPage=");
        sb.append(sl6Var4);
        sb.append(", initialLoad=");
        return wt3.p(sb, z, ")");
    }
}
