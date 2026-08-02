package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dim {
    public final int a;
    public final boolean b;

    public dim(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static dim copy$default(dim dimVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dimVar.a;
        }
        if ((i2 & 2) != 0) {
            z = dimVar.b;
        }
        dimVar.getClass();
        return new dim(i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dim)) {
            return false;
        }
        dim dimVar = (dim) obj;
        return this.a == dimVar.a && this.b == dimVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PipExitData(orientation=");
        sb.append(this.a);
        sb.append(", wasPlaying=");
        return lnb.r(sb, this.b, ')');
    }
}
