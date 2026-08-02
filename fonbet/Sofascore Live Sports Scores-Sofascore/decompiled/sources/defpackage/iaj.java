package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iaj {
    public static final iaj f = new iaj(false, 9205357640488583168L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d1g.a, false);
    public final boolean a;
    public final long b;
    public final float c;
    public final d1g d;
    public final boolean e;

    public iaj(boolean z, long j, float f2, d1g d1gVar, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = f2;
        this.d = d1gVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iaj)) {
            return false;
        }
        iaj iajVar = (iaj) obj;
        return this.a == iajVar.a && dnd.c(this.b, iajVar.b) && Float.compare(this.c, iajVar.c) == 0 && this.d == iajVar.d && this.e == iajVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + fc6.a(this.c, ljg.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) dnd.k(this.b));
        sb.append(", lineHeight=");
        sb.append(this.c);
        sb.append(", direction=");
        sb.append(this.d);
        sb.append(", handlesCrossed=");
        return lnb.r(sb, this.e, ')');
    }
}
