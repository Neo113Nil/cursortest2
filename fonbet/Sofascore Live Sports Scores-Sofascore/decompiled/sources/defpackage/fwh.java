package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fwh implements zy7 {
    public final yt9 a;
    public final String b;
    public final pe4 c;

    public fwh(yt9 yt9Var, String str, pe4 pe4Var) {
        this.a = yt9Var;
        this.b = str;
        this.c = pe4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwh)) {
            return false;
        }
        fwh fwhVar = (fwh) obj;
        return Intrinsics.c(this.a, fwhVar.a) && Intrinsics.c(this.b, fwhVar.b) && this.c == fwhVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
