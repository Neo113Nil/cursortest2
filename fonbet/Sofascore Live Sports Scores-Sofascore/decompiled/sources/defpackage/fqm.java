package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fqm {
    public final boolean a;
    public final boolean b;

    public fqm(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static fqm copy$default(fqm fqmVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fqmVar.a;
        }
        if ((i & 2) != 0) {
            z2 = fqmVar.b;
        }
        fqmVar.getClass();
        return new fqm(z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqm)) {
            return false;
        }
        fqm fqmVar = (fqm) obj;
        return this.a == fqmVar.a && this.b == fqmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerPlayButtonState(isPlaying=");
        sb.append(this.a);
        sb.append(", isUserInteractionEnabled=");
        return lnb.r(sb, this.b, ')');
    }
}
