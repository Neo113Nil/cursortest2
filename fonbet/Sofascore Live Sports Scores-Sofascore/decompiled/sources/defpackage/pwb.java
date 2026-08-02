package defpackage;

import com.sofascore.model.branding.PartnerOfferType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pwb implements qwb {
    public final PartnerOfferType a;
    public final String b;

    public pwb(PartnerOfferType partnerOfferType, String str) {
        partnerOfferType.getClass();
        this.a = partnerOfferType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwb)) {
            return false;
        }
        pwb pwbVar = (pwb) obj;
        return this.a == pwbVar.a && Intrinsics.c(this.b, pwbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Partner(offerType=" + this.a + ", url=" + this.b + ")";
    }
}
