package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fnk extends w31 implements a1i {
    public final int g;
    public final long h;
    public final jy7 i;

    public fnk(int i, long j, jy7 jy7Var) {
        super(null, null, null, null, false);
        this.g = i;
        this.h = j;
        this.i = jy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnk)) {
            return false;
        }
        fnk fnkVar = (fnk) obj;
        return this.g == fnkVar.g && this.h == fnkVar.h && this.i.equals(fnkVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ljg.c(Integer.hashCode(this.g) * 31, 31, this.h);
    }

    @Override // defpackage.w31
    public final int i() {
        return this.g;
    }

    public final String toString() {
        return "VenueFeedCardModel(id=" + this.g + ", createdAtTimestamp=" + this.h + ", venue=" + this.i + ")";
    }
}
