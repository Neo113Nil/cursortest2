package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hdm implements rim {
    public final float a;
    public final float b;

    public hdm(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static hdm copy$default(hdm hdmVar, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = hdmVar.a;
        }
        if ((i & 2) != 0) {
            f2 = hdmVar.b;
        }
        hdmVar.getClass();
        return new hdm(f, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdm)) {
            return false;
        }
        hdm hdmVar = (hdm) obj;
        return Float.compare(this.a, hdmVar.a) == 0 && Float.compare(this.b, hdmVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(deltaY=");
        sb.append(this.a);
        sb.append(", progress=");
        return wt3.n(sb, this.b, ')');
    }
}
