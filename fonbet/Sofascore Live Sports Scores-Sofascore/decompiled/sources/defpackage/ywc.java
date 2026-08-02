package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ywc implements lic {
    public final float a;
    public final xwc b;
    public final xwc c;

    public ywc(float f, xwc xwcVar, xwc xwcVar2) {
        this.a = f;
        this.b = xwcVar;
        this.c = xwcVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ywc)) {
            return false;
        }
        ywc ywcVar = (ywc) obj;
        return Float.compare(this.a, ywcVar.a) == 0 && Objects.equals(this.b, ywcVar.b) && Objects.equals(this.c, ywcVar.c);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        xwc xwcVar = this.b;
        int hashCode2 = (hashCode + (xwcVar != null ? xwcVar.hashCode() : 0)) * 31;
        xwc xwcVar2 = this.c;
        return hashCode2 + (xwcVar2 != null ? xwcVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
