package com.blaze.blazesdk.ads.custom_native;

import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.ads.custom_native.models.BlazeTrackingPixel;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.evl;
import defpackage.ezl;
import defpackage.jod;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ int d = 0;
    public int a;
    public BlazeGoogleCustomNativeAdModel b;
    public final jod c = new jod();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.ads.custom_native.a$a, reason: collision with other inner class name */
    public static final class C0004a {
        public C0004a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new C0004a(null);
    }

    public final BlazeTrackingPixel a(BlazeTrackingPixel.PixelAdsEvents pixelAdsEvents) {
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = this.b;
        Object obj = null;
        Set<BlazeTrackingPixel> trackingPixelAdList = blazeGoogleCustomNativeAdModel != null ? blazeGoogleCustomNativeAdModel.getTrackingPixelAdList() : null;
        if (trackingPixelAdList == null) {
            return null;
        }
        Iterator<T> it = trackingPixelAdList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((BlazeTrackingPixel) next).getEventType() == pixelAdsEvents) {
                obj = next;
                break;
            }
        }
        return (BlazeTrackingPixel) obj;
    }

    public final void b() {
        BlazeGoogleCustomNativeAdModel.Content content;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel2 = this.b;
        if (blazeGoogleCustomNativeAdModel2 == null || (content = blazeGoogleCustomNativeAdModel2.getContent()) == null || !(content instanceof BlazeGoogleCustomNativeAdModel.Content.Video) || (blazeGoogleCustomNativeAdModel = this.b) == null) {
            return;
        }
        BlazeTrackingPixel a = a(BlazeTrackingPixel.PixelAdsEvents.PAUSED_AD_PAGE);
        if (a != null) {
            e(a);
        }
        BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
        if (googleCustomNativeAdsHandler$blazesdk_release != null) {
            googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.PAUSED_AD_PAGE, blazeGoogleCustomNativeAdModel);
        }
    }

    public final void c(int i) {
        BlazeGoogleCustomNativeAdModel.Content content;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel2 = this.b;
        if (blazeGoogleCustomNativeAdModel2 == null || (content = blazeGoogleCustomNativeAdModel2.getContent()) == null || !(content instanceof BlazeGoogleCustomNativeAdModel.Content.Video) || this.a >= i || (blazeGoogleCustomNativeAdModel = this.b) == null) {
            return;
        }
        this.a = i;
        if (i >= 50) {
            this.a = Integer.MAX_VALUE;
            BlazeTrackingPixel a = a(BlazeTrackingPixel.PixelAdsEvents.AD_PAGE_MID);
            if (a != null) {
                e(a);
            }
            BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
            if (googleCustomNativeAdsHandler$blazesdk_release != null) {
                googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.AD_PAGE_MID, blazeGoogleCustomNativeAdModel);
                return;
            }
            return;
        }
        if (i >= 33) {
            this.a = 50;
            BlazeTrackingPixel a2 = a(BlazeTrackingPixel.PixelAdsEvents.AD_PAGE_THIRD);
            if (a2 != null) {
                e(a2);
            }
            BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release2 = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
            if (googleCustomNativeAdsHandler$blazesdk_release2 != null) {
                googleCustomNativeAdsHandler$blazesdk_release2.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.AD_PAGE_THIRD, blazeGoogleCustomNativeAdModel);
                return;
            }
            return;
        }
        if (i >= 25) {
            this.a = 33;
            BlazeTrackingPixel a3 = a(BlazeTrackingPixel.PixelAdsEvents.AD_PAGE_FIRST_QUARTER);
            if (a3 != null) {
                e(a3);
            }
            BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release3 = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
            if (googleCustomNativeAdsHandler$blazesdk_release3 != null) {
                googleCustomNativeAdsHandler$blazesdk_release3.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.AD_PAGE_FIRST_QUARTER, blazeGoogleCustomNativeAdModel);
            }
        }
    }

    public final void d(BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel) {
        blazeGoogleCustomNativeAdModel.getClass();
        this.a = 0;
        this.b = blazeGoogleCustomNativeAdModel;
        BlazeTrackingPixel a = a(BlazeTrackingPixel.PixelAdsEvents.OPENED_AD);
        if (a != null) {
            e(a);
        }
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = blazeSDK.getGoogleCustomNativeAdsHandler$blazesdk_release();
        if (googleCustomNativeAdsHandler$blazesdk_release != null) {
            googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.OPENED_AD, blazeGoogleCustomNativeAdModel);
        }
        BlazeTrackingPixel a2 = a(BlazeTrackingPixel.PixelAdsEvents.AD_PAGE_START);
        if (a2 != null) {
            e(a2);
        }
        BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release2 = blazeSDK.getGoogleCustomNativeAdsHandler$blazesdk_release();
        if (googleCustomNativeAdsHandler$blazesdk_release2 != null) {
            googleCustomNativeAdsHandler$blazesdk_release2.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.AD_PAGE_START, blazeGoogleCustomNativeAdModel);
        }
        blazeGoogleCustomNativeAdModel.setValid(false);
    }

    public final void e(BlazeTrackingPixel blazeTrackingPixel) {
        Iterator<T> it = blazeTrackingPixel.getUrls().iterator();
        while (it.hasNext()) {
            evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new ezl(this, (String) it.next(), blazeTrackingPixel.getCustomUserAgent(), null), 1, null);
        }
    }

    public final void f() {
        BlazeGoogleCustomNativeAdModel.Content content;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel2 = this.b;
        if (blazeGoogleCustomNativeAdModel2 == null || (content = blazeGoogleCustomNativeAdModel2.getContent()) == null || !(content instanceof BlazeGoogleCustomNativeAdModel.Content.Video) || (blazeGoogleCustomNativeAdModel = this.b) == null) {
            return;
        }
        BlazeTrackingPixel a = a(BlazeTrackingPixel.PixelAdsEvents.RESUMED_AD_PAGE);
        if (a != null) {
            e(a);
        }
        BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
        if (googleCustomNativeAdsHandler$blazesdk_release != null) {
            googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.RESUMED_AD_PAGE, blazeGoogleCustomNativeAdModel);
        }
    }

    public final void g() {
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel = this.b;
        if (blazeGoogleCustomNativeAdModel != null) {
            BlazeTrackingPixel a = a(BlazeTrackingPixel.PixelAdsEvents.CTA_CLICKED);
            if (a != null) {
                e(a);
            }
            BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
            if (googleCustomNativeAdsHandler$blazesdk_release != null) {
                googleCustomNativeAdsHandler$blazesdk_release.onAdEvent(BlazeGoogleCustomNativeAdsHandler.EventType.CTA_CLICKED, blazeGoogleCustomNativeAdModel);
            }
        }
    }
}
