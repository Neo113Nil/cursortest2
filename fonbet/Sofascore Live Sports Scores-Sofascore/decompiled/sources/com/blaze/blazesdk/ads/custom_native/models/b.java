package com.blaze.blazesdk.ads.custom_native.models;

import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLinkActionHandleType;
import com.blaze.blazesdk.features.shared.models.ui_shared.f;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fc6;
import defpackage.gim;
import defpackage.n4m;
import defpackage.s6m;
import defpackage.zzl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class b {
    public static final n4m a(BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel, boolean z) {
        n4m.a cVar;
        i iVar;
        BlazeLinkActionHandleType blazeLinkActionHandleType;
        blazeGoogleCustomNativeAdModel.getClass();
        String C = fc6.C();
        gim.a aVar = new gim.a(blazeGoogleCustomNativeAdModel);
        BlazeGoogleCustomNativeAdModel.Content content = blazeGoogleCustomNativeAdModel.getContent();
        content.getClass();
        if (content instanceof BlazeGoogleCustomNativeAdModel.Content.Image) {
            BlazeGoogleCustomNativeAdModel.Content.Image image = (BlazeGoogleCustomNativeAdModel.Content.Image) content;
            cVar = new n4m.a.C1353a(image.getUrlString(), image.getDuration(), null);
        } else {
            if (!(content instanceof BlazeGoogleCustomNativeAdModel.Content.Video)) {
                zzl.b();
                return null;
            }
            BlazeGoogleCustomNativeAdModel.Content.Video video = (BlazeGoogleCustomNativeAdModel.Content.Video) content;
            cVar = new n4m.a.b.c(video.getUrlString(), video.getLoadingImageUrl(), null, null, null);
        }
        String title = blazeGoogleCustomNativeAdModel.getTitle();
        BlazeGoogleCustomNativeAdModel.CtaModel cta = blazeGoogleCustomNativeAdModel.getCta();
        if (cta != null) {
            BlazeGoogleCustomNativeAdModel.CtaModel.CTAType type = cta.getType();
            type.getClass();
            int i = a.a[type.ordinal()];
            if (i == 1) {
                blazeLinkActionHandleType = BlazeLinkActionHandleType.DEEPLINK;
            } else {
                if (i != 2) {
                    zzl.b();
                    return null;
                }
                blazeLinkActionHandleType = BlazeLinkActionHandleType.WEB;
            }
            BlazeLinkActionHandleType blazeLinkActionHandleType2 = blazeLinkActionHandleType;
            String text = cta.getText();
            String url = cta.getUrl();
            String backgroundColor = cta.getBackgroundColor();
            if (backgroundColor == null) {
                backgroundColor = "#FFFFFF";
            }
            String textColor = cta.getTextColor();
            if (textColor == null) {
                textColor = "#000000";
            }
            iVar = new i(blazeLinkActionHandleType2, text, url, backgroundColor, textColor, new f(s6m.a, true));
        } else {
            iVar = null;
        }
        return new n4m(C, aVar, cVar, title, null, null, null, null, iVar, null, false, false, null, z, 0, 0, null, null, null, null, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8380144, null);
    }

    public static /* synthetic */ n4m toPlayable$default(BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(blazeGoogleCustomNativeAdModel, z);
    }
}
