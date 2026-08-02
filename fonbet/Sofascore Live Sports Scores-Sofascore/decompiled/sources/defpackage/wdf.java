package defpackage;

import com.sofascore.model.mvvm.model.OffersBannerBackground;
import com.sofascore.model.mvvm.model.OffersBannerLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class wdf {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OffersBannerLayout.values().length];
        try {
            iArr[OffersBannerLayout.Clean.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OffersBannerLayout.Logo.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OffersBannerLayout.Creative.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[OffersBannerLayout.CreativeContentTwoThirds.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[OffersBannerBackground.values().length];
        try {
            iArr2[OffersBannerBackground.Image.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[OffersBannerBackground.EntityHeader.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
