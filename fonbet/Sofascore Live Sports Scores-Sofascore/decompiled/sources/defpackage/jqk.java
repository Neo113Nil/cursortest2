package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class jqk {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jqk(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqk)) {
            return false;
        }
        jqk jqkVar = (jqk) obj;
        return this.a == jqkVar.a && this.b.equals(jqkVar.b) && this.c.equals(jqkVar.c) && this.d.equals(jqkVar.d) && this.e.equals(jqkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dmi.c(dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "VideoMediaUIModel(id=", ", title=", this.b, ", subtitle=");
        bf3.v(t, this.c, ", thumbnailUrl=", this.d, ", videoUrl=");
        return mz1.o(t, this.e, ")");
    }
}
