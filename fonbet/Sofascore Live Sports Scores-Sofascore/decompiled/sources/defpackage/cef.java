package defpackage;

import com.sofascore.model.mvvm.model.OffersBannerBackground;
import com.sofascore.model.mvvm.model.OffersBannerLayout;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cef {
    public final Integer a;
    public final OffersBannerLayout b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final OffersBannerBackground i;
    public final bef j;

    public cef(Integer num, OffersBannerLayout offersBannerLayout, String str, String str2, String str3, String str4, String str5, String str6, OffersBannerBackground offersBannerBackground) {
        bef befVar = bef.u;
        str.getClass();
        str2.getClass();
        str3.getClass();
        befVar.getClass();
        this.a = num;
        this.b = offersBannerLayout;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = offersBannerBackground;
        this.j = befVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cef)) {
            return false;
        }
        cef cefVar = (cef) obj;
        return this.a.equals(cefVar.a) && this.b == cefVar.b && Intrinsics.c(this.c, cefVar.c) && Intrinsics.c(this.d, cefVar.d) && Intrinsics.c(this.e, cefVar.e) && Intrinsics.c(this.f, cefVar.f) && Intrinsics.c(this.g, cefVar.g) && this.h.equals(cefVar.h) && this.i == cefVar.i && this.j == cefVar.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        OffersBannerLayout offersBannerLayout = this.b;
        int c = dmi.c(dmi.c(dmi.c((hashCode + (offersBannerLayout == null ? 0 : offersBannerLayout.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int hashCode2 = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode3 = (this.h.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        OffersBannerBackground offersBannerBackground = this.i;
        return this.j.hashCode() + ((hashCode3 + (offersBannerBackground != null ? offersBannerBackground.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerItem(promotionId=");
        sb.append(this.a);
        sb.append(", layout=");
        sb.append(this.b);
        sb.append(", title=");
        bf3.v(sb, this.c, ", description=", this.d, ", cta=");
        bf3.v(sb, this.e, ", regulative=", this.f, ", url=");
        sb.append(this.g);
        sb.append(", image=");
        sb.append((Object) this.h);
        sb.append(", background=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
