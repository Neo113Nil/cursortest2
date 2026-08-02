package defpackage;

import com.sofascore.model.branding.PartnerOfferType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class iwb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartnerOfferType.values().length];
        try {
            iArr[PartnerOfferType.Streaming.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartnerOfferType.Product.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PartnerOfferType.Giveaway.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PartnerOfferType.SeeMore.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
