package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import defpackage.fjn;
import defpackage.ohn;
import defpackage.vlo;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeem extends com.google.android.gms.ads.internal.client.zzds {
    public final HashMap a = new HashMap();
    public final Context b;
    public final WeakReference c;
    public final zzeea d;
    public final zzhdi e;
    public zzedp f;

    public zzeem(Context context, WeakReference weakReference, zzeea zzeeaVar, zzhdi zzhdiVar) {
        this.b = context;
        this.c = weakReference;
        this.d = zzeeaVar;
        this.e = zzhdiVar;
    }

    public static String I4(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdx zzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final synchronized void E4(Object obj, String str) {
        this.a.put(str, obj);
        F4(I4(obj));
    }

    public final synchronized void F4(String str) {
        try {
            zzcgo d = this.f.d(str);
            ohn ohnVar = new ohn(this, 12);
            d.addListener(new vlo(0, d, ohnVar), this.e);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTester.setAdAsOutOfContext", e);
            this.d.b();
        }
    }

    public final synchronized void G4(String str) {
        try {
            zzcgo d = this.f.d(str);
            fjn fjnVar = new fjn(this, 11);
            d.addListener(new vlo(0, d, fjnVar), this.e);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTester.setAdAsShown", e);
            this.d.b();
        }
    }

    public final Context H4() {
        Context context = (Context) this.c.get();
        return context == null ? this.b : context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.Z1(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap hashMap = this.a;
        Object obj = hashMap.get(str);
        if (obj != null) {
            hashMap.remove(str);
        }
        if (obj instanceof AdView) {
            AdView adView = (AdView) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag(TtmlNode.TAG_LAYOUT);
            zzeeo.b(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(adView);
            adView.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            NativeAdView nativeAdView = new NativeAdView(context);
            nativeAdView.setTag("ad_view_tag");
            zzeeo.b(nativeAdView, -1, -1);
            viewGroup.addView(nativeAdView);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            zzeeo.b(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            nativeAdView.addView(linearLayout2);
            Resources c = com.google.android.gms.ads.internal.zzt.zzh().c();
            linearLayout2.addView(zzeeo.a(context, c == null ? "Headline" : c.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "headline_header_tag"));
            String headline = nativeAd.getHeadline();
            if (headline == null) {
                headline = "";
            }
            View a = zzeeo.a(context, headline, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            nativeAdView.setHeadlineView(a);
            linearLayout2.addView(a);
            linearLayout2.addView(zzeeo.a(context, c == null ? "Body" : c.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "body_header_tag"));
            String body = nativeAd.getBody();
            if (body == null) {
                body = "";
            }
            View a2 = zzeeo.a(context, body, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            nativeAdView.setBodyView(a2);
            linearLayout2.addView(a2);
            linearLayout2.addView(zzeeo.a(context, c == null ? "Media View" : c.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, "media_view_header_tag"));
            MediaView mediaView = new MediaView(context);
            mediaView.setTag("media_view_tag");
            nativeAdView.setMediaView(mediaView);
            linearLayout2.addView(mediaView);
            nativeAdView.setNativeAd(nativeAd);
        }
    }
}
