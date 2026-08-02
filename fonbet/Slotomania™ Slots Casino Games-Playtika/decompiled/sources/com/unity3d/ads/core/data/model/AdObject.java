package com.unity3d.ads.core.data.model;

import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: AdObject.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bà\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ø\u0001\u0000¢\u0006\u0002\u0010\"J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0012HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0015HÆ\u0003J\u0014\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017HÆ\u0003ø\u0001\u0000J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jð\u0001\u0010d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 HÆ\u0001ø\u0001\u0000J\u0013\u0010e\u001a\u00020\b2\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020hHÖ\u0001J\t\u0010i\u001a\u00020\u0005HÖ\u0001R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010+R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010+\"\u0004\b.\u0010-R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00106\"\u0004\b=\u00108R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00106\"\u0004\b?\u00108R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00106\"\u0004\bC\u00108R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010:\"\u0004\bM\u0010NR%\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u0086\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010I\"\u0004\bP\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "opportunityId", "Lcom/google/protobuf/ByteString;", "placementId", "", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "isScarAd", "", "scarQueryId", "scarAdUnitId", "scarAdString", "isOfferwallAd", "offerwallPlacementName", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "playerServerId", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "ttl", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/time/Duration;", "state", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "loadConfiguration", "Lcom/unity3d/ads/LoadConfiguration;", "showConfiguration", "Lcom/unity3d/ads/ShowConfiguration;", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "(Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;)V", "getActivity", "()Ljava/lang/ref/WeakReference;", "setActivity", "(Ljava/lang/ref/WeakReference;)V", "getAdPlayer", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdType", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "()Z", "setOfferwallAd", "(Z)V", "setScarAd", "getLoadConfiguration", "()Lcom/unity3d/ads/LoadConfiguration;", "setLoadConfiguration", "(Lcom/unity3d/ads/LoadConfiguration;)V", "getLoadOptions", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "getOfferwallPlacementName", "()Ljava/lang/String;", "setOfferwallPlacementName", "(Ljava/lang/String;)V", "getOpportunityId", "()Lcom/google/protobuf/ByteString;", "getPlacementId", "getPlayerServerId", "setPlayerServerId", "getScarAdString", "setScarAdString", "getScarAdUnitId", "setScarAdUnitId", "getScarQueryId", "setScarQueryId", "getShowConfiguration", "()Lcom/unity3d/ads/ShowConfiguration;", "setShowConfiguration", "(Lcom/unity3d/ads/ShowConfiguration;)V", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setState", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "getTtl", "setTtl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdObject {
    private WeakReference<Activity> activity;
    private final AdPlayer adPlayer;
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;
    private boolean isScarAd;
    private LoadConfiguration loadConfiguration;
    private final UnityAdsLoadOptions loadOptions;
    private String offerwallPlacementName;
    private final ByteString opportunityId;
    private final String placementId;
    private String playerServerId;
    private String scarAdString;
    private String scarAdUnitId;
    private String scarQueryId;
    private ShowConfiguration showConfiguration;
    private MutableStateFlow<AdObjectState> state;
    private ByteString trackingToken;
    private MutableStateFlow<Duration> ttl;

    public static /* synthetic */ AdObject copy$default(AdObject adObject, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, String str3, String str4, boolean z2, String str5, AdPlayer adPlayer, String str6, UnityAdsLoadOptions unityAdsLoadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, MutableStateFlow mutableStateFlow, MutableStateFlow mutableStateFlow2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, int i, Object obj) {
        WeakReference weakReference2;
        ShowConfiguration showConfiguration2;
        ByteString byteString3 = (i & 1) != 0 ? adObject.opportunityId : byteString;
        String str7 = (i & 2) != 0 ? adObject.placementId : str;
        ByteString byteString4 = (i & 4) != 0 ? adObject.trackingToken : byteString2;
        boolean z4 = (i & 8) != 0 ? adObject.isScarAd : z;
        String str8 = (i & 16) != 0 ? adObject.scarQueryId : str2;
        String str9 = (i & 32) != 0 ? adObject.scarAdUnitId : str3;
        String str10 = (i & 64) != 0 ? adObject.scarAdString : str4;
        boolean z5 = (i & 128) != 0 ? adObject.isOfferwallAd : z2;
        String str11 = (i & 256) != 0 ? adObject.offerwallPlacementName : str5;
        AdPlayer adPlayer2 = (i & 512) != 0 ? adObject.adPlayer : adPlayer;
        String str12 = (i & 1024) != 0 ? adObject.playerServerId : str6;
        UnityAdsLoadOptions unityAdsLoadOptions2 = (i & 2048) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z6 = (i & 4096) != 0 ? adObject.isHeaderBidding : z3;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2 = (i & 8192) != 0 ? adObject.adType : diagnosticAdType;
        ByteString byteString5 = byteString3;
        MutableStateFlow mutableStateFlow3 = (i & 16384) != 0 ? adObject.ttl : mutableStateFlow;
        MutableStateFlow mutableStateFlow4 = (i & 32768) != 0 ? adObject.state : mutableStateFlow2;
        LoadConfiguration loadConfiguration2 = (i & 65536) != 0 ? adObject.loadConfiguration : loadConfiguration;
        ShowConfiguration showConfiguration3 = (i & 131072) != 0 ? adObject.showConfiguration : showConfiguration;
        if ((i & 262144) != 0) {
            showConfiguration2 = showConfiguration3;
            weakReference2 = adObject.activity;
        } else {
            weakReference2 = weakReference;
            showConfiguration2 = showConfiguration3;
        }
        return adObject.copy(byteString5, str7, byteString4, z4, str8, str9, str10, z5, str11, adPlayer2, str12, unityAdsLoadOptions2, z6, diagnosticAdType2, mutableStateFlow3, mutableStateFlow4, loadConfiguration2, showConfiguration2, weakReference2);
    }

    /* renamed from: component1, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    /* renamed from: component10, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    /* renamed from: component12, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    /* renamed from: component14, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    public final MutableStateFlow<Duration> component15() {
        return this.ttl;
    }

    public final MutableStateFlow<AdObjectState> component16() {
        return this.state;
    }

    /* renamed from: component17, reason: from getter */
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    /* renamed from: component18, reason: from getter */
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final WeakReference<Activity> component19() {
        return this.activity;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    /* renamed from: component3, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsScarAd() {
        return this.isScarAd;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScarAdString() {
        return this.scarAdString;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    /* renamed from: component9, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final AdObject copy(ByteString opportunityId, String placementId, ByteString trackingToken, boolean isScarAd, String scarQueryId, String scarAdUnitId, String scarAdString, boolean isOfferwallAd, String offerwallPlacementName, AdPlayer adPlayer, String playerServerId, UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, MutableStateFlow<Duration> ttl, MutableStateFlow<AdObjectState> state, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> activity) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdObject(opportunityId, placementId, trackingToken, isScarAd, scarQueryId, scarAdUnitId, scarAdString, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state, loadConfiguration, showConfiguration, activity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return Intrinsics.areEqual(this.opportunityId, adObject.opportunityId) && Intrinsics.areEqual(this.placementId, adObject.placementId) && Intrinsics.areEqual(this.trackingToken, adObject.trackingToken) && this.isScarAd == adObject.isScarAd && Intrinsics.areEqual(this.scarQueryId, adObject.scarQueryId) && Intrinsics.areEqual(this.scarAdUnitId, adObject.scarAdUnitId) && Intrinsics.areEqual(this.scarAdString, adObject.scarAdString) && this.isOfferwallAd == adObject.isOfferwallAd && Intrinsics.areEqual(this.offerwallPlacementName, adObject.offerwallPlacementName) && Intrinsics.areEqual(this.adPlayer, adObject.adPlayer) && Intrinsics.areEqual(this.playerServerId, adObject.playerServerId) && Intrinsics.areEqual(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && Intrinsics.areEqual(this.ttl, adObject.ttl) && Intrinsics.areEqual(this.state, adObject.state) && Intrinsics.areEqual(this.loadConfiguration, adObject.loadConfiguration) && Intrinsics.areEqual(this.showConfiguration, adObject.showConfiguration) && Intrinsics.areEqual(this.activity, adObject.activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.opportunityId.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.trackingToken.hashCode()) * 31;
        boolean z = this.isScarAd;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.scarQueryId;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scarAdUnitId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z2 = this.isOfferwallAd;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode4 + i3) * 31;
        String str4 = this.offerwallPlacementName;
        int hashCode5 = (i4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int hashCode6 = (hashCode5 + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str5 = this.playerServerId;
        int hashCode7 = (((hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.loadOptions.hashCode()) * 31;
        boolean z3 = this.isHeaderBidding;
        int hashCode8 = (((((((hashCode7 + (z3 ? 1 : z3 ? 1 : 0)) * 31) + this.adType.hashCode()) * 31) + this.ttl.hashCode()) * 31) + this.state.hashCode()) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int hashCode9 = (hashCode8 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int hashCode10 = (hashCode9 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        return hashCode10 + (weakReference != null ? weakReference.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdObject(opportunityId=");
        sb.append(this.opportunityId).append(", placementId=").append(this.placementId).append(", trackingToken=").append(this.trackingToken).append(", isScarAd=").append(this.isScarAd).append(", scarQueryId=").append(this.scarQueryId).append(", scarAdUnitId=").append(this.scarAdUnitId).append(", scarAdString=").append(this.scarAdString).append(", isOfferwallAd=").append(this.isOfferwallAd).append(", offerwallPlacementName=").append(this.offerwallPlacementName).append(", adPlayer=").append(this.adPlayer).append(", playerServerId=").append(this.playerServerId).append(", loadOptions=");
        sb.append(this.loadOptions).append(", isHeaderBidding=").append(this.isHeaderBidding).append(", adType=").append(this.adType).append(", ttl=").append(this.ttl).append(", state=").append(this.state).append(", loadConfiguration=").append(this.loadConfiguration).append(", showConfiguration=").append(this.showConfiguration).append(", activity=").append(this.activity).append(')');
        return sb.toString();
    }

    public AdObject(ByteString opportunityId, String placementId, ByteString trackingToken, boolean z, String str, String str2, String str3, boolean z2, String str4, AdPlayer adPlayer, String str5, UnityAdsLoadOptions loadOptions, boolean z3, DiagnosticEventRequestOuterClass.DiagnosticAdType adType, MutableStateFlow<Duration> ttl, MutableStateFlow<AdObjectState> state, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(trackingToken, "trackingToken");
        Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(ttl, "ttl");
        Intrinsics.checkNotNullParameter(state, "state");
        this.opportunityId = opportunityId;
        this.placementId = placementId;
        this.trackingToken = trackingToken;
        this.isScarAd = z;
        this.scarQueryId = str;
        this.scarAdUnitId = str2;
        this.scarAdString = str3;
        this.isOfferwallAd = z2;
        this.offerwallPlacementName = str4;
        this.adPlayer = adPlayer;
        this.playerServerId = str5;
        this.loadOptions = loadOptions;
        this.isHeaderBidding = z3;
        this.adType = adType;
        this.ttl = ttl;
        this.state = state;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
    }

    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    public final void setTrackingToken(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<set-?>");
        this.trackingToken = byteString;
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public final void setScarAd(boolean z) {
        this.isScarAd = z;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final void setScarQueryId(String str) {
        this.scarQueryId = str;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final void setScarAdUnitId(String str) {
        this.scarAdUnitId = str;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final void setScarAdString(String str) {
        this.scarAdString = str;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    public final void setOfferwallPlacementName(String str) {
        this.offerwallPlacementName = str;
    }

    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    public final void setPlayerServerId(String str) {
        this.playerServerId = str;
    }

    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AdObject(com.google.protobuf.ByteString r24, java.lang.String r25, com.google.protobuf.ByteString r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31, java.lang.String r32, com.unity3d.ads.adplayer.AdPlayer r33, java.lang.String r34, com.unity3d.ads.UnityAdsLoadOptions r35, boolean r36, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r37, kotlinx.coroutines.flow.MutableStateFlow r38, kotlinx.coroutines.flow.MutableStateFlow r39, com.unity3d.ads.LoadConfiguration r40, com.unity3d.ads.ShowConfiguration r41, java.lang.ref.WeakReference r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r27
        Lb:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L12
            r8 = r3
            goto L14
        L12:
            r8 = r28
        L14:
            r1 = r0 & 32
            if (r1 == 0) goto L1a
            r9 = r3
            goto L1c
        L1a:
            r9 = r29
        L1c:
            r1 = r0 & 64
            if (r1 == 0) goto L22
            r10 = r3
            goto L24
        L22:
            r10 = r30
        L24:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2a
            r11 = r2
            goto L2c
        L2a:
            r11 = r31
        L2c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L32
            r12 = r3
            goto L34
        L32:
            r12 = r32
        L34:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L3a
            r13 = r3
            goto L3c
        L3a:
            r13 = r33
        L3c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L42
            r14 = r3
            goto L44
        L42:
            r14 = r34
        L44:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L4f
            kotlinx.coroutines.flow.MutableStateFlow r1 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r3)
            r18 = r1
            goto L51
        L4f:
            r18 = r38
        L51:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L60
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.INIT
            kotlinx.coroutines.flow.MutableStateFlow r1 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r1)
            r19 = r1
            goto L62
        L60:
            r19 = r39
        L62:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L6a
            r20 = r3
            goto L6c
        L6a:
            r20 = r40
        L6c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L74
            r21 = r3
            goto L76
        L74:
            r21 = r41
        L76:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L8c
            r22 = r3
            r4 = r24
            r5 = r25
            r6 = r26
            r15 = r35
            r16 = r36
            r17 = r37
            r3 = r23
            goto L9c
        L8c:
            r22 = r42
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r15 = r35
            r16 = r36
            r17 = r37
        L9c:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.AdObject.<init>(com.google.protobuf.ByteString, java.lang.String, com.google.protobuf.ByteString, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.unity3d.ads.adplayer.AdPlayer, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.MutableStateFlow, com.unity3d.ads.LoadConfiguration, com.unity3d.ads.ShowConfiguration, java.lang.ref.WeakReference, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final MutableStateFlow<Duration> getTtl() {
        return this.ttl;
    }

    public final void setTtl(MutableStateFlow<Duration> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.ttl = mutableStateFlow;
    }

    public final MutableStateFlow<AdObjectState> getState() {
        return this.state;
    }

    public final void setState(MutableStateFlow<AdObjectState> mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<set-?>");
        this.state = mutableStateFlow;
    }

    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    public final void setLoadConfiguration(LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    public final void setShowConfiguration(ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final void setActivity(WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }
}
