package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qvl {
    public final int a;
    public final boolean b;
    public final boolean c;

    public qvl() {
        this.a = 0;
        this.b = false;
        this.c = false;
    }

    public final boolean a() {
        return this.a > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvl)) {
            return false;
        }
        qvl qvlVar = (qvl) obj;
        return this.a == qvlVar.a && this.b == qvlVar.b && this.c == qvlVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + u0a.t(Integer.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetLoadState(itemCount=");
        sb.append(this.a);
        sb.append(", isLoaded=");
        sb.append(this.b);
        sb.append(", isError=");
        return lnb.r(sb, this.c, ')');
    }

    public qvl(int i, boolean z) {
        this.a = i;
        this.b = true;
        this.c = z;
    }
}
