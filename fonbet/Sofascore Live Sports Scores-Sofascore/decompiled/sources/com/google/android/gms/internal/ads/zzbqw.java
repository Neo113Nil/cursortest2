package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import defpackage.bf3;
import defpackage.eql;
import defpackage.f0o;
import defpackage.inn;
import defpackage.k3o;
import defpackage.l3o;
import defpackage.m3o;
import defpackage.n3o;
import defpackage.o3o;
import defpackage.v9f;
import defpackage.w9f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqw implements zzbqh {
    public final zzeem a;

    public zzbqw(zzeem zzeemVar) {
        this.a = zzeemVar;
    }

    public static final Bundle b(Map map) {
        Bundle f = bf3.f("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        f.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        f.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        f.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        f.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        f.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        f.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e);
            }
        }
        return f;
    }

    public static final ArrayList c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:245:0x054e A[Catch: all -> 0x055f, TryCatch #6 {all -> 0x055f, blocks: (B:231:0x051b, B:233:0x0521, B:236:0x0528, B:241:0x0534, B:243:0x053c, B:245:0x054e, B:247:0x0552, B:249:0x0556, B:251:0x055a, B:254:0x0565, B:256:0x0570, B:259:0x0577, B:261:0x057b, B:264:0x0582, B:266:0x0586, B:269:0x058f, B:271:0x0593, B:274:0x059c, B:276:0x05ac, B:278:0x05b0, B:280:0x05b4, B:283:0x0562), top: B:230:0x051b }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0570 A[Catch: all -> 0x055f, TRY_LEAVE, TryCatch #6 {all -> 0x055f, blocks: (B:231:0x051b, B:233:0x0521, B:236:0x0528, B:241:0x0534, B:243:0x053c, B:245:0x054e, B:247:0x0552, B:249:0x0556, B:251:0x055a, B:254:0x0565, B:256:0x0570, B:259:0x0577, B:261:0x057b, B:264:0x0582, B:266:0x0586, B:269:0x058f, B:271:0x0593, B:274:0x059c, B:276:0x05ac, B:278:0x05b0, B:280:0x05b4, B:283:0x0562), top: B:230:0x051b }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0577 A[Catch: all -> 0x055f, TRY_ENTER, TryCatch #6 {all -> 0x055f, blocks: (B:231:0x051b, B:233:0x0521, B:236:0x0528, B:241:0x0534, B:243:0x053c, B:245:0x054e, B:247:0x0552, B:249:0x0556, B:251:0x055a, B:254:0x0565, B:256:0x0570, B:259:0x0577, B:261:0x057b, B:264:0x0582, B:266:0x0586, B:269:0x058f, B:271:0x0593, B:274:0x059c, B:276:0x05ac, B:278:0x05b0, B:280:0x05b4, B:283:0x0562), top: B:230:0x051b }] */
    @Override // com.google.android.gms.internal.ads.zzbqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Map map) {
        Activity activity;
        HashMap hashMap;
        Object obj2;
        inn innVar;
        AdRequest build;
        AdSize adSize;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue()) {
            zzeen zzeenVar = new zzeen();
            String str = (String) map.get("adUnitId");
            if (!TextUtils.isEmpty(str)) {
                zzeenVar.e = str;
            }
            String str2 = (String) map.get("format");
            if (!TextUtils.isEmpty(str2)) {
                zzeenVar.f = str2;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Va)).booleanValue()) {
                boolean z = false;
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                    z = true;
                }
                zzeenVar.g = z;
                if (z) {
                    AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it = c((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            builder.addKeyword((String) it.next());
                        }
                    }
                    builder.addNetworkExtrasBundle(AdMobAdapter.class, b(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                builder.addCustomTargeting(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e);
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        builder.setContentUrl((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder.setNeighboringContentUrls(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder.setRequestAgent((String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        builder.setPublisherProvidedId((String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = c((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            builder.addCategoryExclusion((String) it2.next());
                        }
                    }
                    build = builder.build();
                } else {
                    AdRequest.Builder builder2 = new AdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it3 = c((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            builder2.addKeyword((String) it3.next());
                        }
                    }
                    builder2.addNetworkExtrasBundle(AdMobAdapter.class, b(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> keys2 = jSONObject2.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                builder2.addCustomTargeting(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e2);
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        builder2.setContentUrl((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder2.setNeighboringContentUrls(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder2.setRequestAgent((String) map.get("requestAgent"));
                    }
                    build = builder2.build();
                }
                zzeenVar.a = build;
                String str3 = (String) map.get("width");
                String str4 = (String) map.get("height");
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    adSize = AdSize.BANNER;
                } else {
                    try {
                        adSize = new AdSize(Integer.parseInt(str3), Integer.parseInt(str4));
                    } catch (NumberFormatException e3) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.generateAdSize", e3);
                        adSize = AdSize.BANNER;
                    }
                }
                zzeenVar.d = adSize;
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    VideoOptions.Builder builder3 = new VideoOptions.Builder();
                    if (map.containsKey("startMuted")) {
                        builder3.setStartMuted(((String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        builder3.setCustomControlsRequested(((String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        builder3.setClickToExpandRequested(((String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    zzeenVar.c = builder3.build();
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (zzeenVar.c != null && zzeenVar.f.equals("NATIVE"))) {
                    NativeAdOptions.Builder builder4 = new NativeAdOptions.Builder();
                    if (map.containsKey("disableImageLoading")) {
                        builder4.setReturnUrlsForImageAssets(((String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str5 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str5)) {
                            try {
                                builder4.setMediaAspectRatio(Integer.parseInt(str5));
                            } catch (NumberFormatException e4) {
                                com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e4);
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        builder4.setRequestMultipleImages(((String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str6 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                builder4.setAdChoicesPlacement(Integer.parseInt(str6));
                            } catch (NumberFormatException e5) {
                                com.google.android.gms.ads.internal.zzt.zzh().d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e5);
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        builder4.setRequestCustomMuteThisAd(((String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    VideoOptions videoOptions = zzeenVar.c;
                    if (videoOptions != null) {
                        builder4.setVideoOptions(videoOptions);
                    }
                    zzeenVar.b = builder4.build();
                }
            }
            String str7 = (String) map.get("action");
            if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(zzeenVar.e)) {
                return;
            }
            if (str7.equals("load") && !TextUtils.isEmpty(zzeenVar.f)) {
                zzeem zzeemVar = this.a;
                synchronized (zzeemVar) {
                    try {
                        String str8 = zzeenVar.f;
                        switch (str8.hashCode()) {
                            case -1999289321:
                                if (str8.equals("NATIVE")) {
                                    String str9 = zzeenVar.e;
                                    AdLoader.Builder builder5 = new AdLoader.Builder(zzeemVar.H4(), str9);
                                    builder5.forNativeAd(new f0o(5, zzeemVar, str9));
                                    builder5.withAdListener(new eql(zzeemVar));
                                    NativeAdOptions nativeAdOptions = zzeenVar.b;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Va)).booleanValue() && nativeAdOptions != null) {
                                        builder5.withNativeAdOptions(nativeAdOptions);
                                    }
                                    builder5.build().loadAd(zzeenVar.a);
                                    return;
                                }
                                break;
                            case -1372958932:
                                if (str8.equals("INTERSTITIAL")) {
                                    String str10 = zzeenVar.e;
                                    InterstitialAd.load(zzeemVar.H4(), str10, zzeenVar.a, new m3o(zzeemVar, str10));
                                    break;
                                }
                                break;
                            case -428325382:
                                if (str8.equals("APP_OPEN_AD")) {
                                    String str11 = zzeenVar.e;
                                    AppOpenAd.load(zzeemVar.H4(), str11, zzeenVar.a, new k3o(zzeemVar, str11));
                                    return;
                                }
                                break;
                            case 543046670:
                                if (str8.equals("REWARDED")) {
                                    String str12 = zzeenVar.e;
                                    RewardedAd.load(zzeemVar.H4(), str12, zzeenVar.a, new n3o(zzeemVar, str12));
                                    return;
                                }
                                break;
                            case 1854800829:
                                if (str8.equals("REWARDED_INTERSTITIAL")) {
                                    String str13 = zzeenVar.e;
                                    RewardedInterstitialAd.load(zzeemVar.H4(), str13, zzeenVar.a, new o3o(zzeemVar, str13));
                                    return;
                                }
                                break;
                            case 1951953708:
                                if (str8.equals(com.ironsource.mediationsdk.j.a)) {
                                    String str14 = zzeenVar.e;
                                    inn innVar2 = zzbjg.Va;
                                    BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2)).booleanValue() && zzeenVar.g) ? new AdManagerAdView(zzeemVar.H4()) : new AdView(zzeemVar.H4());
                                    adManagerAdView.setAdSize(zzeenVar.d);
                                    adManagerAdView.setAdUnitId(str14);
                                    adManagerAdView.setAdListener(new l3o(zzeemVar, str14, adManagerAdView));
                                    VideoOptions videoOptions2 = zzeenVar.c;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2)).booleanValue() && zzeenVar.g && videoOptions2 != null) {
                                        ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptions2);
                                    }
                                    adManagerAdView.loadAd(zzeenVar.a);
                                    return;
                                }
                                break;
                        }
                        return;
                    } finally {
                    }
                }
            }
            if (str7.equals("show")) {
                zzeem zzeemVar2 = this.a;
                String str15 = zzeenVar.e;
                synchronized (zzeemVar2) {
                    try {
                        zzeea zzeeaVar = zzeemVar2.d;
                        zzclm zzclmVar = zzeeaVar.d;
                        if (zzclmVar != null && !zzclmVar.q()) {
                            activity = zzeeaVar.d.zzj();
                            if (activity != null && (obj2 = (hashMap = zzeemVar2.a).get(str15)) != null) {
                                innVar = zzbjg.Ua;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                                    if (!(obj2 instanceof AppOpenAd)) {
                                        if (!(obj2 instanceof InterstitialAd)) {
                                            if (!(obj2 instanceof RewardedAd)) {
                                                if (!(obj2 instanceof RewardedInterstitialAd)) {
                                                }
                                                zzeemVar2.G4(zzeem.I4(obj2));
                                                if (obj2 instanceof AppOpenAd) {
                                                    ((AppOpenAd) obj2).show(activity);
                                                    return;
                                                }
                                                if (obj2 instanceof InterstitialAd) {
                                                    ((InterstitialAd) obj2).show(activity);
                                                    return;
                                                }
                                                if (obj2 instanceof RewardedAd) {
                                                    ((RewardedAd) obj2).show(activity, w9f.i);
                                                    return;
                                                }
                                                if (obj2 instanceof RewardedInterstitialAd) {
                                                    ((RewardedInterstitialAd) obj2).show(activity, v9f.h);
                                                    return;
                                                }
                                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue() && ((obj2 instanceof AdView) || (obj2 instanceof NativeAd))) {
                                                    Intent intent = new Intent();
                                                    Context H4 = zzeemVar2.H4();
                                                    intent.setClassName(H4, OutOfContextTestingActivity.CLASS_NAME);
                                                    intent.putExtra("adUnit", str15);
                                                    com.google.android.gms.ads.internal.zzt.zzc();
                                                    com.google.android.gms.ads.internal.util.zzs.zzY(H4, intent);
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                                hashMap.remove(str15);
                                zzeemVar2.G4(zzeem.I4(obj2));
                                if (obj2 instanceof AppOpenAd) {
                                }
                            }
                        }
                        activity = null;
                        if (activity != null) {
                            innVar = zzbjg.Ua;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).booleanValue()) {
                            }
                            hashMap.remove(str15);
                            zzeemVar2.G4(zzeem.I4(obj2));
                            if (obj2 instanceof AppOpenAd) {
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
