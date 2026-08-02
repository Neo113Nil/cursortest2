package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class c2c implements f2c {
    public final String a;
    public final String b;
    public final long c;

    public c2c(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2c)) {
            return false;
        }
        c2c c2cVar = (c2c) obj;
        return this.a.equals(c2cVar.a) && this.b.equals(c2cVar.b) && this.c == c2cVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return lnb.l(this.c, ")", mz1.s("OnTweetVideoFullScreenClick(videoUrl=", this.a, ", thumbnailUrl=", this.b, ", currentPosition="));
    }
}
