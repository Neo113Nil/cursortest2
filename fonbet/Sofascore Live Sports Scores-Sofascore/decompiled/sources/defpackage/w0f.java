package defpackage;

import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.results.main.MainActivity;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w0f extends j1f {
    public final PartnerOfferType h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0f(PartnerOfferType partnerOfferType) {
        super(dmi.q("MOTW Partner – ", partnerOfferType == PartnerOfferType.SeeMore ? "See more" : partnerOfferType.name()), j7f.c, new jie(24), a.c(MainActivity.class), null, null, 112);
        partnerOfferType.getClass();
        this.h = partnerOfferType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0f) && this.h == ((w0f) obj).h;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "MatchOfTheWeekDevMock(offerType=" + this.h + ")";
    }
}
