package com.blaze.gam.custom_native;

import android.net.Uri;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.custom_native.models.BlazeTrackingPixel;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0005"}, d2 = {"toAdModel", "Lcom/blaze/blazesdk/ads/custom_native/models/BlazeGoogleCustomNativeAdModel;", "Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "extraInfo", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "blaze_gam_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeCustomNativeAdsParsingKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Keep
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BlazeGoogleCustomNativeAdModel toAdModel(@Nullable NativeCustomFormatAd nativeCustomFormatAd, @Nullable BlazeContentExtraInfo blazeContentExtraInfo) {
        String str;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        BlazeGoogleCustomNativeAdModel.CtaModel.CTAType cTAType;
        BlazeGoogleCustomNativeAdModel.CtaModel.CTAType cTAType2;
        String lowerCase;
        String lowerCase2;
        BlazeGoogleCustomNativeAdModel.Content content;
        List split$default;
        List split$default2;
        Uri uri;
        String obj;
        if (nativeCustomFormatAd == null) {
            return null;
        }
        CharSequence text = nativeCustomFormatAd.getText("Advertiser");
        String obj2 = text != null ? text.toString() : null;
        CharSequence text2 = nativeCustomFormatAd.getText("AdType");
        if (text2 == null || (obj = text2.toString()) == null) {
            str = null;
        } else {
            str = obj.toLowerCase(Locale.ROOT);
            str.getClass();
        }
        NativeAd.Image image = nativeCustomFormatAd.getImage("Image");
        String uri2 = (image == null || (uri = image.getUri()) == null) ? null : uri.toString();
        CharSequence text3 = nativeCustomFormatAd.getText("VideoURL");
        String obj3 = text3 != null ? text3.toString() : null;
        CharSequence text4 = nativeCustomFormatAd.getText("CTAType");
        String obj4 = text4 != null ? text4.toString() : null;
        CharSequence text5 = nativeCustomFormatAd.getText("CTAUrl");
        String obj5 = text5 != null ? text5.toString() : null;
        CharSequence text6 = nativeCustomFormatAd.getText("CTAText");
        String obj6 = text6 != null ? text6.toString() : null;
        ArrayList arrayList = new ArrayList();
        CharSequence text7 = nativeCustomFormatAd.getText("TrackingURL");
        String obj7 = text7 != null ? text7.toString() : null;
        if (obj7 != null && obj7.length() != 0) {
            arrayList.add(obj7);
        }
        CharSequence text8 = nativeCustomFormatAd.getText("ImpressionTrackingUrls");
        if (text8 == null || text8.length() == 0) {
            blazeGoogleCustomNativeAdModel = 0;
        } else {
            split$default2 = StringsKt__StringsKt.split$default(text8, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
            blazeGoogleCustomNativeAdModel = 0;
            ArrayList arrayList2 = new ArrayList(k13.r(split$default2, 10));
            Iterator it = split$default2.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.l0((String) it.next()).toString());
            }
            arrayList.addAll(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        CharSequence text9 = nativeCustomFormatAd.getText("ClickTrackingUrls");
        if (text9 != null && text9.length() != 0) {
            split$default = StringsKt__StringsKt.split$default(text9, new String[]{BlazeDataSourcePersonalizedType.STRING_SEPARATOR}, false, 0, 6, null);
            ArrayList arrayList4 = new ArrayList(k13.r(split$default, 10));
            Iterator it2 = split$default.iterator();
            while (it2.hasNext()) {
                arrayList4.add(StringsKt.l0((String) it2.next()).toString());
            }
            arrayList3.addAll(arrayList4);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(b.j(new BlazeTrackingPixel(BlazeTrackingPixel.PixelAdsEvents.OPENED_AD, arrayList, null, 4, null), new BlazeTrackingPixel(BlazeTrackingPixel.PixelAdsEvents.CTA_CLICKED, arrayList3, null, 4, null)));
        if (Intrinsics.c(obj4, "web")) {
            cTAType2 = BlazeGoogleCustomNativeAdModel.CtaModel.CTAType.WEB;
        } else {
            if (!Intrinsics.c(obj4, "inApp")) {
                cTAType = blazeGoogleCustomNativeAdModel;
                BlazeGoogleCustomNativeAdModel.CtaModel ctaModel = (cTAType != null || obj5 == null || obj5.length() == 0 || obj6 == null || obj6.length() == 0) ? blazeGoogleCustomNativeAdModel : new BlazeGoogleCustomNativeAdModel.CtaModel(cTAType, obj5, obj6, null, null, 24, null);
                Locale locale = Locale.ROOT;
                lowerCase = "image".toLowerCase(locale);
                lowerCase.getClass();
                if (Intrinsics.c(str, lowerCase) || uri2 == null) {
                    lowerCase2 = "video".toLowerCase(locale);
                    lowerCase2.getClass();
                    if (Intrinsics.c(str, lowerCase2) || obj3 == null) {
                        content = blazeGoogleCustomNativeAdModel;
                    } else {
                        CharSequence text10 = nativeCustomFormatAd.getText("VideoPreviewImage");
                        content = new BlazeGoogleCustomNativeAdModel.Content.Video(obj3, text10 != null ? text10.toString() : blazeGoogleCustomNativeAdModel);
                    }
                } else {
                    content = new BlazeGoogleCustomNativeAdModel.Content.Image(uri2, 5000.0d);
                }
                if (content != null) {
                    return blazeGoogleCustomNativeAdModel;
                }
                return new BlazeGoogleCustomNativeAdModel(content, obj2, ctaModel, linkedHashSet, new BlazeCustomNativeAdData(nativeCustomFormatAd, blazeContentExtraInfo == null ? new BlazeContentExtraInfo(null, null, null, null, null, 31, null) : blazeContentExtraInfo), null, 32, null);
            }
            cTAType2 = BlazeGoogleCustomNativeAdModel.CtaModel.CTAType.DEEPLINK;
        }
        cTAType = cTAType2;
        if (cTAType != null) {
        }
        Locale locale2 = Locale.ROOT;
        lowerCase = "image".toLowerCase(locale2);
        lowerCase.getClass();
        if (Intrinsics.c(str, lowerCase)) {
        }
        lowerCase2 = "video".toLowerCase(locale2);
        lowerCase2.getClass();
        if (Intrinsics.c(str, lowerCase2)) {
        }
        content = blazeGoogleCustomNativeAdModel;
        if (content != null) {
        }
    }
}
