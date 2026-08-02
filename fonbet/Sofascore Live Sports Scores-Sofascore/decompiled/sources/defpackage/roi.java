package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class roi {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public roi(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roi)) {
            return false;
        }
        roi roiVar = (roi) obj;
        return Float.compare(this.a, roiVar.a) == 0 && Float.compare(this.b, roiVar.b) == 0 && Float.compare(this.c, roiVar.c) == 0 && Float.compare(this.d, roiVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ViewBox(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
