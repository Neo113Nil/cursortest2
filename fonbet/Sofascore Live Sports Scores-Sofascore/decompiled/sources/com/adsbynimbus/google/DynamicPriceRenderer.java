package com.adsbynimbus.google;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import defpackage.ad2;
import defpackage.bga;
import defpackage.cjb;
import defpackage.df5;
import defpackage.dmi;
import defpackage.ef5;
import defpackage.fhh;
import defpackage.fsf;
import defpackage.hcd;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.iie;
import defpackage.jcd;
import defpackage.ku3;
import defpackage.ky1;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.ly1;
import defpackage.nf;
import defpackage.oc3;
import defpackage.of;
import defpackage.p2g;
import defpackage.pv1;
import defpackage.qcd;
import defpackage.qyf;
import defpackage.rik;
import defpackage.rob;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.u6b;
import defpackage.w2g;
import defpackage.wca;
import defpackage.wcd;
import defpackage.xw3;
import defpackage.yda;
import defpackage.yea;
import defpackage.z45;
import defpackage.z9a;
import defpackage.zf;
import defpackage.zmb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001c\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\b*\u00020\u0007*\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\t\u001a1\u0010\u0014\u001a\u00020\u0013*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0014\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0017\u001a/\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a?\u0010!\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0013\u0010'\u001a\u00020\u0013*\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010-\u001a\u00020,*\u00020)2\u0006\u0010+\u001a\u00020*H\u0080H¢\u0006\u0004\b-\u0010.\u001a\u0013\u00101\u001a\u000200*\u00020/H\u0000¢\u0006\u0004\b1\u00102\"#\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020*038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u001a\u0010>\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u001a\u0010A\u001a\u00020\u0001*\u0004\u0018\u00010\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@\".\u0010H\u001a\u0004\u0018\u00010,*\u00020B2\b\u0010C\u001a\u0004\u0018\u00010,8Æ\u0002@À\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/google/android/gms/ads/admanager/AdManagerAdView;", "", "name", "info", "", "handleEventForNimbus", "(Lcom/google/android/gms/ads/admanager/AdManagerAdView;Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "T", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;Ljava/lang/String;Ljava/lang/String;)Z", "Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;", "Landroid/app/Activity;", "activity", "Lwcd;", "nimbusAd", "Ljcd;", "nimbusAdManager", "Lcom/adsbynimbus/google/NimbusRewardCallback;", "callback", "", "showAd", "(Lcom/google/android/gms/ads/rewardedinterstitial/RewardedInterstitialAd;Landroid/app/Activity;Lwcd;Ljcd;Lcom/adsbynimbus/google/NimbusRewardCallback;)V", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "(Lcom/google/android/gms/ads/rewarded/RewardedAd;Landroid/app/Activity;Lwcd;Ljcd;Lcom/adsbynimbus/google/NimbusRewardCallback;)V", "Lcom/adsbynimbus/google/GoogleAuctionData;", "auctionData", "Lcom/google/android/gms/ads/ResponseInfo;", "responseInfo", "com/adsbynimbus/google/DynamicPriceRenderer$FullScreenContentCallback$1", "FullScreenContentCallback", "(Lcom/adsbynimbus/google/GoogleAuctionData;Ljcd;Lcom/google/android/gms/ads/ResponseInfo;Lcom/adsbynimbus/google/NimbusRewardCallback;)Lcom/adsbynimbus/google/DynamicPriceRenderer$FullScreenContentCallback$1;", "Lcom/google/android/gms/ads/rewarded/RewardItem;", "rewardItem", "renderDynamicPriceRewardedAd", "(Landroid/app/Activity;Lcom/adsbynimbus/google/GoogleAuctionData;Lcom/google/android/gms/ads/ResponseInfo;Lcom/google/android/gms/ads/rewarded/RewardItem;Ljcd;Lcom/adsbynimbus/google/NimbusRewardCallback;)V", "Landroid/os/Bundle;", "adMetadata", "shouldNimbusRenderAd", "(Landroid/os/Bundle;)Z", "destroy", "(Landroid/app/Activity;)V", "Landroid/view/ViewGroup;", "Lhcd;", "ad", "Lof;", "render", "(Landroid/view/ViewGroup;Lhcd;Lrq3;)Ljava/lang/Object;", "Lcom/adsbynimbus/google/RenderEvent;", "Lyda;", "trackClick", "(Lcom/adsbynimbus/google/RenderEvent;)Lyda;", "Lzmb;", "a", "Lzmb;", "getDynamicPriceAdCache", "()Lzmb;", "dynamicPriceAdCache", "Lyea;", "b", "Lyea;", "getJsonSerializer", "()Lyea;", "jsonSerializer", "getAsErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "asErrorMessage", "Lcom/google/android/gms/ads/BaseAdView;", "controller", "getNimbusAdController", "(Lcom/google/android/gms/ads/BaseAdView;)Lof;", "setNimbusAdController", "(Lcom/google/android/gms/ads/BaseAdView;Lof;)V", "nimbusAdController", "google_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicPriceRenderer {
    public static final zmb a = new zmb(10);
    public static final bga b = pv1.n;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.adsbynimbus.google.DynamicPriceRenderer$FullScreenContentCallback$1] */
    private static final DynamicPriceRenderer$FullScreenContentCallback$1 FullScreenContentCallback(final GoogleAuctionData googleAuctionData, final jcd jcdVar, final ResponseInfo responseInfo, final NimbusRewardCallback nimbusRewardCallback) {
        return new FullScreenContentCallback() { // from class: com.adsbynimbus.google.DynamicPriceRenderer$FullScreenContentCallback$1
            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdDismissedFullScreenContent() {
                NimbusRewardCallback.this.onAdClosed();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdFailedToShowFullScreenContent(AdError error) {
                error.getClass();
                String message = error.getMessage();
                message.getClass();
                NimbusRewardCallback.this.onError(new qcd(4, message, null));
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdImpression() {
                DynamicPriceWinLossKt.notifyImpression(jcdVar, googleAuctionData, responseInfo);
                NimbusRewardCallback.this.onAdImpression();
            }

            @Override // com.google.android.gms.ads.FullScreenContentCallback
            public void onAdShowedFullScreenContent() {
                NimbusRewardCallback.this.onAdPresented();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAsErrorMessage(String str) {
        return dmi.j(']', "Error Rendering Dynamic Price Nimbus Ad [", str);
    }

    @NotNull
    public static final zmb getDynamicPriceAdCache() {
        return a;
    }

    @NotNull
    public static final yea getJsonSerializer() {
        return b;
    }

    @Nullable
    public static final of getNimbusAdController(@NotNull BaseAdView baseAdView) {
        baseAdView.getClass();
        Object tag = baseAdView.getTag(com.sofascore.results.R.id.controller);
        if (tag instanceof of) {
            return (of) tag;
        }
        return null;
    }

    public static final <T extends InterstitialAd> boolean handleEventForNimbus(@NotNull final T t, @NotNull String str, @NotNull String str2) {
        Object u2gVar;
        t.getClass();
        str.getClass();
        str2.getClass();
        if (!str.equals("na_render")) {
            return false;
        }
        try {
            p2g p2gVar = w2g.b;
            final RenderEvent renderEvent = (RenderEvent) b.b(RenderEvent.INSTANCE.serializer(), str2);
            final hcd hcdVar = (hcd) a.e(renderEvent.getAuctionId());
            final FullScreenContentCallback fullScreenContentCallback = t.getFullScreenContentCallback();
            t.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.adsbynimbus.google.DynamicPriceRenderer$handleEventForNimbus$2$1$1
                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdClicked() {
                    FullScreenContentCallback fullScreenContentCallback2 = FullScreenContentCallback.this;
                    if (fullScreenContentCallback2 != null) {
                        fullScreenContentCallback2.onAdClicked();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdDismissedFullScreenContent() {
                    FullScreenContentCallback fullScreenContentCallback2 = FullScreenContentCallback.this;
                    if (fullScreenContentCallback2 != null) {
                        fullScreenContentCallback2.onAdDismissedFullScreenContent();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdFailedToShowFullScreenContent(AdError p0) {
                    p0.getClass();
                    FullScreenContentCallback fullScreenContentCallback2 = FullScreenContentCallback.this;
                    if (fullScreenContentCallback2 != null) {
                        fullScreenContentCallback2.onAdFailedToShowFullScreenContent(p0);
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdImpression() {
                    FullScreenContentCallback fullScreenContentCallback2 = FullScreenContentCallback.this;
                    if (fullScreenContentCallback2 != null) {
                        fullScreenContentCallback2.onAdImpression();
                    }
                }

                @Override // com.google.android.gms.ads.FullScreenContentCallback
                public void onAdShowedFullScreenContent() {
                    iie iieVar = iie.a;
                    iie.i = new DynamicPriceRenderer$handleEventForNimbus$2$1$1$onAdShowedFullScreenContent$1(hcdVar, t, renderEvent);
                    FullScreenContentCallback fullScreenContentCallback2 = FullScreenContentCallback.this;
                    if (fullScreenContentCallback2 != null) {
                        fullScreenContentCallback2.onAdShowedFullScreenContent();
                    }
                }
            });
            u2gVar = Unit.a;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a2 = w2g.a(u2gVar);
        if (a2 == null) {
            return true;
        }
        String asErrorMessage = getAsErrorMessage(a2.getMessage());
        cjb.a(asErrorMessage);
        FullScreenContentCallback fullScreenContentCallback2 = t.getFullScreenContentCallback();
        if (fullScreenContentCallback2 == null) {
            return true;
        }
        fullScreenContentCallback2.onAdFailedToShowFullScreenContent(new AdError(-6, asErrorMessage, "Adsbynimbus"));
        return true;
    }

    @Nullable
    public static final Object render(@NotNull ViewGroup viewGroup, @NotNull hcd hcdVar, @NotNull rq3<? super of> rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        fsf fsfVar = new fsf();
        fhh fhhVar = qyf.a;
        rik.t(hcdVar, viewGroup, new DynamicPriceRenderer$render$2$1(lj2Var, fsfVar));
        lj2Var.v(new DynamicPriceRenderer$render$2$2(fsfVar));
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    private static final Object render$$forInline(ViewGroup viewGroup, hcd hcdVar, rq3<? super of> rq3Var) {
        lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        fsf fsfVar = new fsf();
        fhh fhhVar = qyf.a;
        rik.t(hcdVar, viewGroup, new DynamicPriceRenderer$render$2$1(lj2Var, fsfVar));
        lj2Var.v(new DynamicPriceRenderer$render$2$2(fsfVar));
        Unit unit = Unit.a;
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }

    private static final void renderDynamicPriceRewardedAd(Activity activity, final GoogleAuctionData googleAuctionData, final ResponseInfo responseInfo, final RewardItem rewardItem, final jcd jcdVar, NimbusRewardCallback nimbusRewardCallback) {
        final NimbusRewardCallback nimbusRewardCallback2;
        Unit unit;
        googleAuctionData.setNimbusWin(true);
        ly1.b = 60000;
        fhh fhhVar = qyf.a;
        ky1 u = rik.u(activity, googleAuctionData.getAd());
        if (u != null) {
            nimbusRewardCallback2 = nimbusRewardCallback;
            u.d.add(new nf() { // from class: com.adsbynimbus.google.DynamicPriceRenderer$renderDynamicPriceRewardedAd$1$1

                /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[zf.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[2] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[8] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[10] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                    }
                }

                @Override // defpackage.nf
                public void onAdEvent(zf adEvent) {
                    adEvent.getClass();
                    int ordinal = adEvent.ordinal();
                    NimbusRewardCallback nimbusRewardCallback3 = NimbusRewardCallback.this;
                    if (ordinal == 0) {
                        nimbusRewardCallback3.onAdPresented();
                        return;
                    }
                    if (ordinal == 1) {
                        DynamicPriceWinLossKt.notifyImpression(jcdVar, googleAuctionData, responseInfo);
                        nimbusRewardCallback3.onAdImpression();
                        return;
                    }
                    if (ordinal == 2) {
                        nimbusRewardCallback3.onAdClicked();
                    } else if (ordinal == 8) {
                        nimbusRewardCallback3.onUserEarnedReward(rewardItem);
                    } else {
                        if (ordinal != 10) {
                            return;
                        }
                        nimbusRewardCallback3.onAdClosed();
                    }
                }

                @Override // defpackage.pcd
                public void onError(qcd error) {
                    error.getClass();
                    NimbusRewardCallback.this.onError(error);
                }
            });
            u.l();
            unit = Unit.a;
        } else {
            nimbusRewardCallback2 = nimbusRewardCallback;
            unit = null;
        }
        if (unit == null) {
            nimbusRewardCallback2.onError(new qcd(4, "No renderer for ad", null));
        }
    }

    public static final void setNimbusAdController(@NotNull BaseAdView baseAdView, @Nullable of ofVar) {
        baseAdView.getClass();
        baseAdView.setTag(com.sofascore.results.R.id.controller, ofVar);
    }

    private static final boolean shouldNimbusRenderAd(Bundle bundle) {
        return c.j(bundle.getString("AdSystem"), "Nimbus");
    }

    public static final void showAd(@NotNull RewardedInterstitialAd rewardedInterstitialAd, @NotNull Activity activity, @NotNull wcd wcdVar, @NotNull jcd jcdVar, @NotNull NimbusRewardCallback nimbusRewardCallback) {
        rewardedInterstitialAd.getClass();
        activity.getClass();
        wcdVar.getClass();
        jcdVar.getClass();
        nimbusRewardCallback.getClass();
        GoogleAuctionData googleAuctionData = new GoogleAuctionData(wcdVar);
        ResponseInfo responseInfo = rewardedInterstitialAd.getResponseInfo();
        responseInfo.getClass();
        rewardedInterstitialAd.setFullScreenContentCallback(FullScreenContentCallback(googleAuctionData, jcdVar, responseInfo, nimbusRewardCallback));
        int i = 0;
        rewardedInterstitialAd.setOnPaidEventListener(new df5(googleAuctionData, i));
        Bundle adMetadata = rewardedInterstitialAd.getAdMetadata();
        adMetadata.getClass();
        if (!shouldNimbusRenderAd(adMetadata)) {
            rewardedInterstitialAd.show(activity, new ef5(nimbusRewardCallback, i));
            return;
        }
        ResponseInfo responseInfo2 = rewardedInterstitialAd.getResponseInfo();
        responseInfo2.getClass();
        RewardItem rewardItem = rewardedInterstitialAd.getRewardItem();
        rewardItem.getClass();
        renderDynamicPriceRewardedAd(activity, googleAuctionData, responseInfo2, rewardItem, jcdVar, nimbusRewardCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$6(GoogleAuctionData googleAuctionData, AdValue adValue) {
        adValue.getClass();
        googleAuctionData.onPaidEvent(adValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$7(NimbusRewardCallback nimbusRewardCallback, RewardItem rewardItem) {
        rewardItem.getClass();
        nimbusRewardCallback.onUserEarnedReward(rewardItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$8(GoogleAuctionData googleAuctionData, AdValue adValue) {
        adValue.getClass();
        googleAuctionData.onPaidEvent(adValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$9(NimbusRewardCallback nimbusRewardCallback, RewardItem rewardItem) {
        rewardItem.getClass();
        nimbusRewardCallback.onUserEarnedReward(rewardItem);
    }

    @NotNull
    public static final yda trackClick(@NotNull RenderEvent renderEvent) {
        renderEvent.getClass();
        ad2 ad2Var = oc3.a;
        hs4 hs4Var = z45.a;
        return xw3.L(ad2Var, hq4.c, null, new DynamicPriceRenderer$trackClick$1(renderEvent, null), 2);
    }

    public static final void showAd(@NotNull RewardedAd rewardedAd, @NotNull Activity activity, @NotNull wcd wcdVar, @NotNull jcd jcdVar, @NotNull NimbusRewardCallback nimbusRewardCallback) {
        rewardedAd.getClass();
        activity.getClass();
        wcdVar.getClass();
        jcdVar.getClass();
        nimbusRewardCallback.getClass();
        GoogleAuctionData googleAuctionData = new GoogleAuctionData(wcdVar);
        ResponseInfo responseInfo = rewardedAd.getResponseInfo();
        responseInfo.getClass();
        rewardedAd.setFullScreenContentCallback(FullScreenContentCallback(googleAuctionData, jcdVar, responseInfo, nimbusRewardCallback));
        int i = 1;
        rewardedAd.setOnPaidEventListener(new df5(googleAuctionData, i));
        Bundle adMetadata = rewardedAd.getAdMetadata();
        adMetadata.getClass();
        if (shouldNimbusRenderAd(adMetadata)) {
            ResponseInfo responseInfo2 = rewardedAd.getResponseInfo();
            responseInfo2.getClass();
            RewardItem rewardItem = rewardedAd.getRewardItem();
            rewardItem.getClass();
            renderDynamicPriceRewardedAd(activity, googleAuctionData, responseInfo2, rewardItem, jcdVar, nimbusRewardCallback);
            return;
        }
        rewardedAd.show(activity, new ef5(nimbusRewardCallback, i));
    }

    public static final boolean handleEventForNimbus(@NotNull AdManagerAdView adManagerAdView, @NotNull String str, @NotNull String str2) {
        ku3 ku3Var;
        adManagerAdView.getClass();
        str.getClass();
        str2.getClass();
        if (!str.equals("na_render")) {
            return false;
        }
        Object context = adManagerAdView.getContext();
        context.getClass();
        ad2 ad2Var = oc3.a;
        u6b u6bVar = context instanceof u6b ? (u6b) context : null;
        if (u6bVar != null) {
            ku3Var = wca.x(u6bVar.getLifecycle());
        } else {
            ku3Var = oc3.a;
        }
        hs4 hs4Var = z45.a;
        xw3.L(ku3Var, rob.a.f, null, new DynamicPriceRenderer$handleEventForNimbus$1$1(adManagerAdView, str2, null), 2);
        return true;
    }
}
