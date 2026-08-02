package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rbe extends wbe {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public rbe(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbe)) {
            return false;
        }
        rbe rbeVar = (rbe) obj;
        return Float.compare(this.c, rbeVar.c) == 0 && Float.compare(this.d, rbeVar.d) == 0 && Float.compare(this.e, rbeVar.e) == 0 && Float.compare(this.f, rbeVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + fc6.a(this.e, fc6.a(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return wt3.n(sb, this.f, ')');
    }
}
