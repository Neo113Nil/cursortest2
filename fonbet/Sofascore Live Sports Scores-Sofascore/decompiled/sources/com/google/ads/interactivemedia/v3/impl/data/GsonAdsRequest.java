package com.google.ads.interactivemedia.v3.impl.data;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$AutoPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$ContinuousPlayState;
import com.google.ads.interactivemedia.v3.impl.AdsRequestImpl$MutePlayState;
import com.google.ads.interactivemedia.v3.impl.data.AutoValue_GsonAdsRequest;
import defpackage.b2p;
import defpackage.bqn;
import defpackage.fl;
import defpackage.gbo;
import defpackage.gl;
import defpackage.jgi;
import defpackage.len;
import defpackage.pvd;
import defpackage.q3p;
import defpackage.rgi;
import defpackage.sf;
import defpackage.xln;
import defpackage.y3p;
import defpackage.y9;
import defpackage.z3p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class GsonAdsRequest {
    private static final boolean SUPPORTS_NATIVE_CLICK_SIGNALS = true;
    private static final boolean SUPPORTS_NATIVE_NETWORKING = true;
    private static final boolean SUPPORTS_NATIVE_VIEW_SIGNALS = true;
    private static final boolean SUPPORTS_QUICKSILVER = true;
    private static final boolean SUPPORTS_WRAPPED_COMPANIONS = true;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface Builder {
        @NonNull
        Builder adTagParameters(@NonNull Map<String, String> map);

        @NonNull
        Builder adTagUrl(@NonNull String str);

        @NonNull
        Builder adsResponse(@NonNull String str);

        @NonNull
        Builder apiKey(@NonNull String str);

        @NonNull
        Builder assetKey(@NonNull String str);

        @NonNull
        Builder authToken(@NonNull String str);

        @NonNull
        GsonAdsRequest build();

        @NonNull
        Builder companionSlots(@NonNull Map<String, String> map);

        @NonNull
        Builder consentSettings(@NonNull Map<String, String> map);

        @NonNull
        Builder contentDuration(@NonNull Float f);

        @NonNull
        Builder contentKeywords(@NonNull List<String> list);

        @NonNull
        Builder contentSourceId(@NonNull String str);

        @NonNull
        Builder contentSourceUrl(@NonNull String str);

        @NonNull
        Builder contentTitle(@NonNull String str);

        @NonNull
        Builder contentUrl(@NonNull String str);

        @NonNull
        Builder customAssetKey(@NonNull String str);

        @NonNull
        Builder customUiOptions(@Nullable CustomUiOptionsData customUiOptionsData);

        @NonNull
        Builder daiIntegration(@NonNull Integer num);

        @NonNull
        Builder enableNonce(@NonNull Boolean bool);

        @NonNull
        Builder env(@NonNull String str);

        @NonNull
        Builder format(@NonNull String str);

        @NonNull
        Builder identifierInfo(@NonNull IdentifierInfo identifierInfo);

        @NonNull
        Builder isAndroidTvAdsFramework(@NonNull Boolean bool);

        @NonNull
        Builder isTv(@NonNull Boolean bool);

        @NonNull
        Builder linearAdSlotHeight(@NonNull Integer num);

        @NonNull
        Builder linearAdSlotWidth(@NonNull Integer num);

        @NonNull
        Builder liveStreamEventId(@NonNull String str);

        @NonNull
        Builder liveStreamPrefetchSeconds(@NonNull Float f);

        @NonNull
        Builder marketAppInfo(@NonNull MarketAppInfo marketAppInfo);

        @NonNull
        Builder msParameter(@NonNull String str);

        @NonNull
        Builder network(@NonNull String str);

        @NonNull
        Builder networkCode(@NonNull String str);

        @NonNull
        Builder oAuthToken(@NonNull String str);

        @NonNull
        Builder omidAdSessionsOnStartedOnly(@NonNull Boolean bool);

        @NonNull
        Builder pauseAdSlot(@NonNull String str);

        @NonNull
        Builder pixelDensity(@NonNull Double d);

        @NonNull
        Builder platformSignals(@Nullable Map<String, String> map);

        @NonNull
        Builder preferredLinearOrientation(@NonNull Integer num);

        @NonNull
        Builder projectNumber(@NonNull String str);

        @NonNull
        Builder region(@NonNull String str);

        @NonNull
        Builder rubidiumApiVersion(int i);

        @NonNull
        Builder secureSignals(@NonNull List<SecureSignalsData> list);

        @NonNull
        Builder settings(@NonNull ImaSdkSettingsData imaSdkSettingsData);

        @NonNull
        Builder streamActivityMonitorId(@NonNull String str);

        @NonNull
        Builder supportsExternalNavigation(@NonNull Boolean bool);

        @NonNull
        Builder supportsIconClickFallback(@NonNull Boolean bool);

        @NonNull
        Builder supportsNativeClickSignals(@NonNull Boolean bool);

        @NonNull
        Builder supportsNativeNetworking(@NonNull Boolean bool);

        @NonNull
        Builder supportsNativeViewSignals(@NonNull Boolean bool);

        @NonNull
        Builder supportsOmidJsManagedAppSessions(@NonNull Boolean bool);

        @NonNull
        Builder supportsQuicksilver(@NonNull Boolean bool);

        @NonNull
        Builder supportsResizing(@NonNull Boolean bool);

        @NonNull
        Builder useQAStreamBaseUrl(@NonNull Boolean bool);

        @NonNull
        Builder usesCustomVideoPlayback(@NonNull Boolean bool);

        @NonNull
        Builder vastLoadTimeout(@NonNull Float f);

        @NonNull
        Builder videoContinuousPlay(@NonNull AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState);

        @NonNull
        Builder videoEnvironment(@NonNull VideoEnvironmentData videoEnvironmentData);

        @NonNull
        Builder videoId(@NonNull String str);

        @NonNull
        Builder videoPlayActivation(@NonNull AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState);

        @NonNull
        Builder videoPlayMuted(@NonNull AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState);

        @NonNull
        Builder videoStitcherSessionOptions(@Nullable Map<String, Object> map);

        @NonNull
        Builder vodConfigId(@NonNull String str);

        @NonNull
        Builder wrappedCompanionsEnabled(@NonNull Boolean bool);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_GsonAdsRequest.Builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GsonAdsRequest create(fl flVar, String str, Map<String, String> map, List<SecureSignalsData> list, @Nullable Map<String, String> map2, String str2, VideoEnvironmentData videoEnvironmentData, bqn bqnVar, MarketAppInfo marketAppInfo, boolean z, boolean z2, b2p b2pVar, IdentifierInfo identifierInfo, sf sfVar, boolean z3, float f) {
        int i;
        String str3 = ((gl) flVar).b;
        gl glVar = (gl) flVar;
        String str4 = glVar.c;
        gl glVar2 = (gl) flVar;
        AdsRequestImpl$AutoPlayState adsRequestImpl$AutoPlayState = glVar2.e;
        AdsRequestImpl$MutePlayState adsRequestImpl$MutePlayState = glVar2.f;
        AdsRequestImpl$ContinuousPlayState adsRequestImpl$ContinuousPlayState = glVar2.g;
        Map<String, String> companionSlots = getCompanionSlots((gbo) sfVar);
        ViewGroup viewGroup = ((xln) sfVar).a;
        int i2 = glVar.i;
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        throw null;
                    }
                }
            }
        } else {
            i = 1;
        }
        Integer valueOf = Integer.valueOf(i - 1);
        Builder builder = builder();
        builder.adTagUrl(str3);
        builder.adsResponse(str4);
        builder.companionSlots(companionSlots);
        builder.consentSettings(map);
        builder.contentDuration(null);
        builder.contentKeywords(null);
        builder.contentTitle(null);
        builder.contentUrl(null);
        builder.env(str);
        builder.secureSignals(list);
        builder.identifierInfo(identifierInfo);
        Boolean valueOf2 = Boolean.valueOf(z);
        builder.isTv(valueOf2);
        builder.isAndroidTvAdsFramework(Boolean.valueOf(z2));
        Boolean bool = Boolean.TRUE;
        builder.wrappedCompanionsEnabled(bool);
        builder.linearAdSlotWidth(Integer.valueOf(viewGroup.getWidth()));
        builder.linearAdSlotHeight(Integer.valueOf(viewGroup.getHeight()));
        builder.liveStreamPrefetchSeconds(null);
        builder.marketAppInfo(marketAppInfo);
        builder.msParameter((String) b2pVar.i());
        builder.network(str2);
        builder.videoEnvironment(videoEnvironmentData);
        builder.omidAdSessionsOnStartedOnly(bool);
        builder.pixelDensity(Double.valueOf(f));
        builder.preferredLinearOrientation(valueOf);
        builder.platformSignals(map2);
        builder.settings(ImaSdkSettingsData.createFromImaSdkSettingsImpl(bqnVar));
        builder.supportsExternalNavigation(Boolean.valueOf(!z));
        builder.supportsIconClickFallback(valueOf2);
        builder.supportsNativeClickSignals(bool);
        builder.supportsNativeNetworking(bool);
        builder.supportsNativeViewSignals(bool);
        builder.supportsOmidJsManagedAppSessions(Boolean.valueOf(z3));
        builder.supportsQuicksilver(bool);
        builder.supportsResizing(Boolean.FALSE);
        builder.usesCustomVideoPlayback(bool);
        builder.vastLoadTimeout(null);
        builder.videoContinuousPlay(adsRequestImpl$ContinuousPlayState);
        builder.videoPlayActivation(adsRequestImpl$AutoPlayState);
        builder.videoPlayMuted(adsRequestImpl$MutePlayState);
        builder.rubidiumApiVersion(y9.w());
        return builder.build();
    }

    public static GsonAdsRequest createFromStreamRequest(rgi rgiVar, String str, Map<String, String> map, List<SecureSignalsData> list, @Nullable Map<String, String> map2, String str2, VideoEnvironmentData videoEnvironmentData, bqn bqnVar, MarketAppInfo marketAppInfo, boolean z, boolean z2, b2p b2pVar, IdentifierInfo identifierInfo, jgi jgiVar, boolean z3, float f) {
        if (jgiVar != null) {
            throw new ClassCastException();
        }
        Map<String, String> companionSlots = getCompanionSlots(null);
        getPauseAdSlot(null);
        jgiVar.a();
        rgiVar.getFormat();
        Builder builder = builder();
        if (rgiVar.f()) {
            builder.useQAStreamBaseUrl(Boolean.valueOf(rgiVar.f()));
        }
        builder.adTagParameters(rgiVar.g());
        builder.apiKey(rgiVar.h());
        builder.assetKey(rgiVar.a());
        builder.authToken(rgiVar.e());
        builder.companionSlots(companionSlots);
        builder.consentSettings(map);
        builder.contentSourceId(rgiVar.b());
        rgiVar.d();
        throw null;
    }

    private static len extractDaiIntegration(rgi rgiVar) {
        return len.DAI_INTEGRATION_UNSPECIFIED;
    }

    @Nullable
    private static Map<String, String> getCompanionSlots(xln xlnVar) {
        z3p z3pVar = xlnVar.b;
        if (z3pVar != null && !z3pVar.isEmpty()) {
            y3p y3pVar = new y3p();
            Iterator it = z3pVar.keySet().iterator();
            if (!it.hasNext()) {
                return y3pVar.b();
            }
            z3pVar.get((String) it.next()).getClass();
            pvd.j();
        }
        return null;
    }

    @Nullable
    private static CustomUiOptionsData getCustomUiOptionsData(rgi rgiVar) {
        if (rgiVar.c() == null) {
            return null;
        }
        return CustomUiOptionsData.createFromCustomUiOptions(rgiVar.c());
    }

    @Nullable
    private static String getPauseAdSlot(xln xlnVar) {
        xlnVar.getClass();
        return null;
    }

    @Nullable
    public abstract z3p adTagParameters();

    @Nullable
    public abstract String adTagUrl();

    @Nullable
    public abstract String adsResponse();

    @Nullable
    public abstract String apiKey();

    @Nullable
    public abstract String assetKey();

    @Nullable
    public abstract String authToken();

    @Nullable
    public abstract z3p companionSlots();

    @Nullable
    public abstract z3p consentSettings();

    @Nullable
    public abstract Float contentDuration();

    @Nullable
    public abstract q3p contentKeywords();

    @Nullable
    public abstract String contentSourceId();

    @Nullable
    public abstract String contentSourceUrl();

    @Nullable
    public abstract String contentTitle();

    @Nullable
    public abstract String contentUrl();

    @Nullable
    public abstract String customAssetKey();

    @Nullable
    public abstract CustomUiOptionsData customUiOptions();

    @Nullable
    public abstract Integer daiIntegration();

    @Nullable
    public abstract Boolean enableNonce();

    @Nullable
    public abstract String env();

    @Nullable
    public abstract String format();

    @Nullable
    public abstract IdentifierInfo identifierInfo();

    @Nullable
    public abstract Boolean isAndroidTvAdsFramework();

    @Nullable
    public abstract Boolean isTv();

    @Nullable
    public abstract Integer linearAdSlotHeight();

    @Nullable
    public abstract Integer linearAdSlotWidth();

    @Nullable
    public abstract String liveStreamEventId();

    @Nullable
    public abstract Float liveStreamPrefetchSeconds();

    @Nullable
    public abstract MarketAppInfo marketAppInfo();

    @Nullable
    public abstract String msParameter();

    @Nullable
    public abstract String network();

    @Nullable
    public abstract String networkCode();

    @Nullable
    public abstract String oAuthToken();

    @Nullable
    public abstract Boolean omidAdSessionsOnStartedOnly();

    @Nullable
    public abstract String pauseAdSlot();

    @Nullable
    public abstract Double pixelDensity();

    @Nullable
    public abstract z3p platformSignals();

    @Nullable
    public abstract Integer preferredLinearOrientation();

    @Nullable
    public abstract String projectNumber();

    @Nullable
    public abstract String region();

    public abstract int rubidiumApiVersion();

    @Nullable
    public abstract q3p secureSignals();

    @Nullable
    public abstract ImaSdkSettingsData settings();

    @Nullable
    public abstract String streamActivityMonitorId();

    @Nullable
    public abstract Boolean supportsExternalNavigation();

    @Nullable
    public abstract Boolean supportsIconClickFallback();

    @Nullable
    public abstract Boolean supportsNativeClickSignals();

    @Nullable
    public abstract Boolean supportsNativeNetworking();

    @Nullable
    public abstract Boolean supportsNativeViewSignals();

    @Nullable
    public abstract Boolean supportsOmidJsManagedAppSessions();

    @Nullable
    public abstract Boolean supportsQuicksilver();

    @Nullable
    public abstract Boolean supportsResizing();

    @Nullable
    public abstract Boolean useQAStreamBaseUrl();

    @Nullable
    public abstract Boolean usesCustomVideoPlayback();

    @Nullable
    public abstract Float vastLoadTimeout();

    @Nullable
    public abstract AdsRequestImpl$ContinuousPlayState videoContinuousPlay();

    @Nullable
    public abstract VideoEnvironmentData videoEnvironment();

    @Nullable
    public abstract String videoId();

    @Nullable
    public abstract AdsRequestImpl$AutoPlayState videoPlayActivation();

    @Nullable
    public abstract AdsRequestImpl$MutePlayState videoPlayMuted();

    @Nullable
    public abstract z3p videoStitcherSessionOptions();

    @Nullable
    public abstract String vodConfigId();

    @Nullable
    public abstract Boolean wrappedCompanionsEnabled();
}
