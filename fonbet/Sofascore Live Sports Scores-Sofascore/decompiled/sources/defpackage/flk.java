package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class flk {
    public final String a;
    public final ukk b;
    public final ArrayList c;
    public final alk d;
    public final wkk e;
    public final ArrayList f;
    public final dlk g;

    public flk(String str, ukk ukkVar, ArrayList arrayList, alk alkVar, wkk wkkVar, ArrayList arrayList2, dlk dlkVar) {
        str.getClass();
        alkVar.getClass();
        this.a = str;
        this.b = ukkVar;
        this.c = arrayList;
        this.d = alkVar;
        this.e = wkkVar;
        this.f = arrayList2;
        this.g = dlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flk)) {
            return false;
        }
        flk flkVar = (flk) obj;
        return Intrinsics.c(this.a, flkVar.a) && this.b.equals(flkVar.b) && this.c.equals(flkVar.c) && Intrinsics.c(this.d, flkVar.d) && Intrinsics.c(this.e, flkVar.e) && this.f.equals(flkVar.f) && Intrinsics.c(this.g, flkVar.g);
    }

    public final int hashCode() {
        int d = vxd.d(this.d.a, vxd.d(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b.a), 31), 31);
        wkk wkkVar = this.e;
        int d2 = vxd.d(this.f, (d + (wkkVar == null ? 0 : wkkVar.a.hashCode())) * 31, 31);
        dlk dlkVar = this.g;
        return d2 + (dlkVar != null ? dlkVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "InlineAd(adSystem=" + this.a + ", adTitle=" + this.b + ", impressions=" + this.c + ", creatives=" + this.d + ", adVerifications=" + this.e + ", errorHandlers=" + this.f + ", extensions=" + this.g + ')';
    }
}
