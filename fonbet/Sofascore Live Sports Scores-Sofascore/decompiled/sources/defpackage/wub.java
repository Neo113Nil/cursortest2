package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wub {
    public float a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wub)) {
            return false;
        }
        wub wubVar = (wub) obj;
        return Float.compare(this.a, wubVar.a) == 0 && Float.compare(this.b, wubVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Margins(left=" + this.a + ", top=" + this.b + ")";
    }
}
