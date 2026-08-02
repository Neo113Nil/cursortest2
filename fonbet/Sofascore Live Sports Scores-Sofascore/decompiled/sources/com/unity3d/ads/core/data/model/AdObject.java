package com.unity3d.ads.core.data.model;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.ByteString;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.dmi;
import defpackage.f1d;
import defpackage.ku3;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001:\u0001wBÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0010\u0010+\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010)J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b3\u0010,J\u0010\u00104\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014HÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b?\u0010@JÜ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bC\u0010)J\u0010\u0010E\u001a\u00020DHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bO\u0010)R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010L\u001a\u0004\bP\u0010'\"\u0004\bQ\u0010RR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010S\u001a\u0004\b\n\u0010,\"\u0004\bT\u0010UR$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010N\u001a\u0004\bV\u0010)\"\u0004\bW\u0010XR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Y\u001a\u0004\bZ\u0010/R$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010N\u001a\u0004\b[\u0010)\"\u0004\b\\\u0010XR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010]\u001a\u0004\b^\u00102R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\b\u0011\u0010,R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u00105R*\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010a\u001a\u0004\bb\u00107\"\u0004\bc\u0010dR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010a\u001a\u0004\be\u00107\"\u0004\bf\u0010dR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010g\u001a\u0004\bh\u0010:\"\u0004\bi\u0010jR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010k\u001a\u0004\bl\u0010<\"\u0004\bm\u0010nR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010o\u001a\u0004\bp\u0010>\"\u0004\bq\u0010rR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010s\u001a\u0004\bt\u0010@\"\u0004\bu\u0010v¨\u0006x"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject;", "", "Lku3;", "adScope", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "placementId", HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "", "isOfferwallAd", "offerwallPlacementName", "Lcom/unity3d/ads/adplayer/AdPlayer;", "adPlayer", "playerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "adType", "Lf1d;", "Lxd5;", "ttl", "Lcom/unity3d/ads/core/data/model/AdObjectState;", "state", "Lcom/unity3d/ads/LoadConfiguration;", "loadConfiguration", "Lcom/unity3d/ads/ShowConfiguration;", "showConfiguration", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "webViewLessLoadingRequiredData", "<init>", "(Lku3;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lf1d;Lf1d;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "component1", "()Lku3;", "component2", "()Lcom/google/protobuf/ByteString;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "component6", "component7", "()Lcom/unity3d/ads/adplayer/AdPlayer;", "component8", "component9", "()Lcom/unity3d/ads/UnityAdsLoadOptions;", "component10", "component11", "()Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "component12", "()Lf1d;", "component13", "component14", "()Lcom/unity3d/ads/LoadConfiguration;", "component15", "()Lcom/unity3d/ads/ShowConfiguration;", "component16", "()Ljava/lang/ref/WeakReference;", "component17", "()Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "copy", "(Lku3;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lcom/google/protobuf/ByteString;ZLjava/lang/String;Lcom/unity3d/ads/adplayer/AdPlayer;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;ZLgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;Lf1d;Lf1d;Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/ShowConfiguration;Ljava/lang/ref/WeakReference;Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)Lcom/unity3d/ads/core/data/model/AdObject;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lku3;", "getAdScope", "Lcom/google/protobuf/ByteString;", "getOpportunityId", "Ljava/lang/String;", "getPlacementId", "getTrackingToken", "setTrackingToken", "(Lcom/google/protobuf/ByteString;)V", "Z", "setOfferwallAd", "(Z)V", "getOfferwallPlacementName", "setOfferwallPlacementName", "(Ljava/lang/String;)V", "Lcom/unity3d/ads/adplayer/AdPlayer;", "getAdPlayer", "getPlayerServerId", "setPlayerServerId", "Lcom/unity3d/ads/UnityAdsLoadOptions;", "getLoadOptions", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getAdType", "Lf1d;", "getTtl", "setTtl", "(Lf1d;)V", "getState", "setState", "Lcom/unity3d/ads/LoadConfiguration;", "getLoadConfiguration", "setLoadConfiguration", "(Lcom/unity3d/ads/LoadConfiguration;)V", "Lcom/unity3d/ads/ShowConfiguration;", "getShowConfiguration", "setShowConfiguration", "(Lcom/unity3d/ads/ShowConfiguration;)V", "Ljava/lang/ref/WeakReference;", "getActivity", "setActivity", "(Ljava/lang/ref/WeakReference;)V", "Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "getWebViewLessLoadingRequiredData", "setWebViewLessLoadingRequiredData", "(Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;)V", "WebViewLessLoadingRequiredData", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AdObject {

    @Nullable
    private WeakReference<Activity> activity;

    @Nullable
    private final AdPlayer adPlayer;

    @NotNull
    private final ku3 adScope;

    @NotNull
    private final DiagnosticEventRequestOuterClass.DiagnosticAdType adType;
    private final boolean isHeaderBidding;
    private boolean isOfferwallAd;

    @Nullable
    private LoadConfiguration loadConfiguration;

    @NotNull
    private final UnityAdsLoadOptions loadOptions;

    @Nullable
    private String offerwallPlacementName;

    @NotNull
    private final ByteString opportunityId;

    @NotNull
    private final String placementId;

    @Nullable
    private String playerServerId;

    @Nullable
    private ShowConfiguration showConfiguration;

    @NotNull
    private f1d state;

    @NotNull
    private ByteString trackingToken;

    @NotNull
    private f1d ttl;

    @Nullable
    private WebViewLessLoadingRequiredData webViewLessLoadingRequiredData;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AdObject(defpackage.ku3 r21, com.google.protobuf.ByteString r22, java.lang.String r23, com.google.protobuf.ByteString r24, boolean r25, java.lang.String r26, com.unity3d.ads.adplayer.AdPlayer r27, java.lang.String r28, com.unity3d.ads.UnityAdsLoadOptions r29, boolean r30, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType r31, defpackage.f1d r32, defpackage.f1d r33, com.unity3d.ads.LoadConfiguration r34, com.unity3d.ads.ShowConfiguration r35, java.lang.ref.WeakReference r36, com.unity3d.ads.core.data.model.AdObject.WebViewLessLoadingRequiredData r37, int r38, kotlin.jvm.internal.DefaultConstructorMarker r39) {
        /*
            r20 = this;
            r0 = r38
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r25
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r26
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r9 = r2
            goto L1c
        L1a:
            r9 = r27
        L1c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L22
            r10 = r2
            goto L24
        L22:
            r10 = r28
        L24:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2e
            fdi r1 = defpackage.gdi.a(r2)
            r14 = r1
            goto L30
        L2e:
            r14 = r32
        L30:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L3c
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.INIT
            fdi r1 = defpackage.gdi.a(r1)
            r15 = r1
            goto L3e
        L3c:
            r15 = r33
        L3e:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L45
            r16 = r2
            goto L47
        L45:
            r16 = r34
        L47:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L4e
            r17 = r2
            goto L50
        L4e:
            r17 = r35
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L59
            r18 = r2
            goto L5b
        L59:
            r18 = r36
        L5b:
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L73
            r19 = r2
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r11 = r29
            r12 = r30
            r13 = r31
            r2 = r20
            goto L85
        L73:
            r19 = r37
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r11 = r29
            r12 = r30
            r13 = r31
        L85:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.model.AdObject.<init>(ku3, com.google.protobuf.ByteString, java.lang.String, com.google.protobuf.ByteString, boolean, java.lang.String, com.unity3d.ads.adplayer.AdPlayer, java.lang.String, com.unity3d.ads.UnityAdsLoadOptions, boolean, gatewayprotocol.v1.DiagnosticEventRequestOuterClass$DiagnosticAdType, f1d, f1d, com.unity3d.ads.LoadConfiguration, com.unity3d.ads.ShowConfiguration, java.lang.ref.WeakReference, com.unity3d.ads.core.data.model.AdObject$WebViewLessLoadingRequiredData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ AdObject copy$default(AdObject adObject, ku3 ku3Var, ByteString byteString, String str, ByteString byteString2, boolean z, String str2, AdPlayer adPlayer, String str3, UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, f1d f1dVar, f1d f1dVar2, LoadConfiguration loadConfiguration, ShowConfiguration showConfiguration, WeakReference weakReference, WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, int i, Object obj) {
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData2;
        WeakReference weakReference2;
        ku3 ku3Var2;
        AdObject adObject2;
        ShowConfiguration showConfiguration2;
        ByteString byteString3;
        String str4;
        ByteString byteString4;
        boolean z3;
        String str5;
        AdPlayer adPlayer2;
        String str6;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z4;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        f1d f1dVar3;
        f1d f1dVar4;
        LoadConfiguration loadConfiguration2;
        ku3 ku3Var3 = (i & 1) != 0 ? adObject.adScope : ku3Var;
        ByteString byteString5 = (i & 2) != 0 ? adObject.opportunityId : byteString;
        String str7 = (i & 4) != 0 ? adObject.placementId : str;
        ByteString byteString6 = (i & 8) != 0 ? adObject.trackingToken : byteString2;
        boolean z5 = (i & 16) != 0 ? adObject.isOfferwallAd : z;
        String str8 = (i & 32) != 0 ? adObject.offerwallPlacementName : str2;
        AdPlayer adPlayer3 = (i & 64) != 0 ? adObject.adPlayer : adPlayer;
        String str9 = (i & 128) != 0 ? adObject.playerServerId : str3;
        UnityAdsLoadOptions unityAdsLoadOptions3 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? adObject.loadOptions : unityAdsLoadOptions;
        boolean z6 = (i & 512) != 0 ? adObject.isHeaderBidding : z2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3 = (i & 1024) != 0 ? adObject.adType : diagnosticAdType;
        f1d f1dVar5 = (i & a.o) != 0 ? adObject.ttl : f1dVar;
        f1d f1dVar6 = (i & 4096) != 0 ? adObject.state : f1dVar2;
        LoadConfiguration loadConfiguration3 = (i & 8192) != 0 ? adObject.loadConfiguration : loadConfiguration;
        ku3 ku3Var4 = ku3Var3;
        ShowConfiguration showConfiguration3 = (i & 16384) != 0 ? adObject.showConfiguration : showConfiguration;
        WeakReference weakReference3 = (i & 32768) != 0 ? adObject.activity : weakReference;
        if ((i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0) {
            weakReference2 = weakReference3;
            webViewLessLoadingRequiredData2 = adObject.webViewLessLoadingRequiredData;
            showConfiguration2 = showConfiguration3;
            byteString3 = byteString5;
            str4 = str7;
            byteString4 = byteString6;
            z3 = z5;
            str5 = str8;
            adPlayer2 = adPlayer3;
            str6 = str9;
            unityAdsLoadOptions2 = unityAdsLoadOptions3;
            z4 = z6;
            diagnosticAdType2 = diagnosticAdType3;
            f1dVar3 = f1dVar5;
            f1dVar4 = f1dVar6;
            loadConfiguration2 = loadConfiguration3;
            ku3Var2 = ku3Var4;
            adObject2 = adObject;
        } else {
            webViewLessLoadingRequiredData2 = webViewLessLoadingRequiredData;
            weakReference2 = weakReference3;
            ku3Var2 = ku3Var4;
            adObject2 = adObject;
            showConfiguration2 = showConfiguration3;
            byteString3 = byteString5;
            str4 = str7;
            byteString4 = byteString6;
            z3 = z5;
            str5 = str8;
            adPlayer2 = adPlayer3;
            str6 = str9;
            unityAdsLoadOptions2 = unityAdsLoadOptions3;
            z4 = z6;
            diagnosticAdType2 = diagnosticAdType3;
            f1dVar3 = f1dVar5;
            f1dVar4 = f1dVar6;
            loadConfiguration2 = loadConfiguration3;
        }
        return adObject2.copy(ku3Var2, byteString3, str4, byteString4, z3, str5, adPlayer2, str6, unityAdsLoadOptions2, z4, diagnosticAdType2, f1dVar3, f1dVar4, loadConfiguration2, showConfiguration2, weakReference2, webViewLessLoadingRequiredData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ku3 getAdScope() {
        return this.adScope;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsHeaderBidding() {
        return this.isHeaderBidding;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final f1d getTtl() {
        return this.ttl;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final f1d getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @Nullable
    public final WeakReference<Activity> component16() {
        return this.activity;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOfferwallAd() {
        return this.isOfferwallAd;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @NotNull
    public final AdObject copy(@NotNull ku3 adScope, @NotNull ByteString opportunityId, @NotNull String placementId, @NotNull ByteString trackingToken, boolean isOfferwallAd, @Nullable String offerwallPlacementName, @Nullable AdPlayer adPlayer, @Nullable String playerServerId, @NotNull UnityAdsLoadOptions loadOptions, boolean isHeaderBidding, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType adType, @NotNull f1d ttl, @NotNull f1d state, @Nullable LoadConfiguration loadConfiguration, @Nullable ShowConfiguration showConfiguration, @Nullable WeakReference<Activity> activity, @Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        adScope.getClass();
        opportunityId.getClass();
        placementId.getClass();
        trackingToken.getClass();
        loadOptions.getClass();
        adType.getClass();
        ttl.getClass();
        state.getClass();
        return new AdObject(adScope, opportunityId, placementId, trackingToken, isOfferwallAd, offerwallPlacementName, adPlayer, playerServerId, loadOptions, isHeaderBidding, adType, ttl, state, loadConfiguration, showConfiguration, activity, webViewLessLoadingRequiredData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdObject)) {
            return false;
        }
        AdObject adObject = (AdObject) other;
        return Intrinsics.c(this.adScope, adObject.adScope) && Intrinsics.c(this.opportunityId, adObject.opportunityId) && Intrinsics.c(this.placementId, adObject.placementId) && Intrinsics.c(this.trackingToken, adObject.trackingToken) && this.isOfferwallAd == adObject.isOfferwallAd && Intrinsics.c(this.offerwallPlacementName, adObject.offerwallPlacementName) && Intrinsics.c(this.adPlayer, adObject.adPlayer) && Intrinsics.c(this.playerServerId, adObject.playerServerId) && Intrinsics.c(this.loadOptions, adObject.loadOptions) && this.isHeaderBidding == adObject.isHeaderBidding && this.adType == adObject.adType && Intrinsics.c(this.ttl, adObject.ttl) && Intrinsics.c(this.state, adObject.state) && Intrinsics.c(this.loadConfiguration, adObject.loadConfiguration) && Intrinsics.c(this.showConfiguration, adObject.showConfiguration) && Intrinsics.c(this.activity, adObject.activity) && Intrinsics.c(this.webViewLessLoadingRequiredData, adObject.webViewLessLoadingRequiredData);
    }

    @Nullable
    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    @Nullable
    public final AdPlayer getAdPlayer() {
        return this.adPlayer;
    }

    @NotNull
    public final ku3 getAdScope() {
        return this.adScope;
    }

    @NotNull
    public final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.adType;
    }

    @Nullable
    public final LoadConfiguration getLoadConfiguration() {
        return this.loadConfiguration;
    }

    @NotNull
    public final UnityAdsLoadOptions getLoadOptions() {
        return this.loadOptions;
    }

    @Nullable
    public final String getOfferwallPlacementName() {
        return this.offerwallPlacementName;
    }

    @NotNull
    public final ByteString getOpportunityId() {
        return this.opportunityId;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final String getPlayerServerId() {
        return this.playerServerId;
    }

    @Nullable
    public final ShowConfiguration getShowConfiguration() {
        return this.showConfiguration;
    }

    @NotNull
    public final f1d getState() {
        return this.state;
    }

    @NotNull
    public final ByteString getTrackingToken() {
        return this.trackingToken;
    }

    @NotNull
    public final f1d getTtl() {
        return this.ttl;
    }

    @Nullable
    public final WebViewLessLoadingRequiredData getWebViewLessLoadingRequiredData() {
        return this.webViewLessLoadingRequiredData;
    }

    public int hashCode() {
        int e = dmi.e((this.trackingToken.hashCode() + dmi.c((this.opportunityId.hashCode() + (this.adScope.hashCode() * 31)) * 31, 31, this.placementId)) * 31, 31, this.isOfferwallAd);
        String str = this.offerwallPlacementName;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        AdPlayer adPlayer = this.adPlayer;
        int hashCode2 = (hashCode + (adPlayer == null ? 0 : adPlayer.hashCode())) * 31;
        String str2 = this.playerServerId;
        int hashCode3 = (this.state.hashCode() + ((this.ttl.hashCode() + ((this.adType.hashCode() + dmi.e((this.loadOptions.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.isHeaderBidding)) * 31)) * 31)) * 31;
        LoadConfiguration loadConfiguration = this.loadConfiguration;
        int hashCode4 = (hashCode3 + (loadConfiguration == null ? 0 : loadConfiguration.hashCode())) * 31;
        ShowConfiguration showConfiguration = this.showConfiguration;
        int hashCode5 = (hashCode4 + (showConfiguration == null ? 0 : showConfiguration.hashCode())) * 31;
        WeakReference<Activity> weakReference = this.activity;
        int hashCode6 = (hashCode5 + (weakReference == null ? 0 : weakReference.hashCode())) * 31;
        WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = this.webViewLessLoadingRequiredData;
        return hashCode6 + (webViewLessLoadingRequiredData != null ? webViewLessLoadingRequiredData.hashCode() : 0);
    }

    public final boolean isHeaderBidding() {
        return this.isHeaderBidding;
    }

    public final boolean isOfferwallAd() {
        return this.isOfferwallAd;
    }

    public final void setActivity(@Nullable WeakReference<Activity> weakReference) {
        this.activity = weakReference;
    }

    public final void setLoadConfiguration(@Nullable LoadConfiguration loadConfiguration) {
        this.loadConfiguration = loadConfiguration;
    }

    public final void setOfferwallAd(boolean z) {
        this.isOfferwallAd = z;
    }

    public final void setOfferwallPlacementName(@Nullable String str) {
        this.offerwallPlacementName = str;
    }

    public final void setPlayerServerId(@Nullable String str) {
        this.playerServerId = str;
    }

    public final void setShowConfiguration(@Nullable ShowConfiguration showConfiguration) {
        this.showConfiguration = showConfiguration;
    }

    public final void setState(@NotNull f1d f1dVar) {
        f1dVar.getClass();
        this.state = f1dVar;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        byteString.getClass();
        this.trackingToken = byteString;
    }

    public final void setTtl(@NotNull f1d f1dVar) {
        f1dVar.getClass();
        this.ttl = f1dVar;
    }

    public final void setWebViewLessLoadingRequiredData(@Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    @NotNull
    public String toString() {
        return "AdObject(adScope=" + this.adScope + ", opportunityId=" + this.opportunityId + ", placementId=" + this.placementId + ", trackingToken=" + this.trackingToken + ", isOfferwallAd=" + this.isOfferwallAd + ", offerwallPlacementName=" + this.offerwallPlacementName + ", adPlayer=" + this.adPlayer + ", playerServerId=" + this.playerServerId + ", loadOptions=" + this.loadOptions + ", isHeaderBidding=" + this.isHeaderBidding + ", adType=" + this.adType + ", ttl=" + this.ttl + ", state=" + this.state + ", loadConfiguration=" + this.loadConfiguration + ", showConfiguration=" + this.showConfiguration + ", activity=" + this.activity + ", webViewLessLoadingRequiredData=" + this.webViewLessLoadingRequiredData + ')';
    }

    public AdObject(@NotNull ku3 ku3Var, @NotNull ByteString byteString, @NotNull String str, @NotNull ByteString byteString2, boolean z, @Nullable String str2, @Nullable AdPlayer adPlayer, @Nullable String str3, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, boolean z2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, @NotNull f1d f1dVar, @NotNull f1d f1dVar2, @Nullable LoadConfiguration loadConfiguration, @Nullable ShowConfiguration showConfiguration, @Nullable WeakReference<Activity> weakReference, @Nullable WebViewLessLoadingRequiredData webViewLessLoadingRequiredData) {
        ku3Var.getClass();
        byteString.getClass();
        str.getClass();
        byteString2.getClass();
        unityAdsLoadOptions.getClass();
        diagnosticAdType.getClass();
        f1dVar.getClass();
        f1dVar2.getClass();
        this.adScope = ku3Var;
        this.opportunityId = byteString;
        this.placementId = str;
        this.trackingToken = byteString2;
        this.isOfferwallAd = z;
        this.offerwallPlacementName = str2;
        this.adPlayer = adPlayer;
        this.playerServerId = str3;
        this.loadOptions = unityAdsLoadOptions;
        this.isHeaderBidding = z2;
        this.adType = diagnosticAdType;
        this.ttl = f1dVar;
        this.state = f1dVar2;
        this.loadConfiguration = loadConfiguration;
        this.showConfiguration = showConfiguration;
        this.activity = weakReference;
        this.webViewLessLoadingRequiredData = webViewLessLoadingRequiredData;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdObject$WebViewLessLoadingRequiredData;", "", "webviewUrl", "", "adResponse", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adRefreshState", "Lcom/unity3d/ads/core/data/model/AdRefreshState;", "<init>", "(Ljava/lang/String;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "getWebviewUrl", "()Ljava/lang/String;", "getAdResponse", "()Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "setAdResponse", "(Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;)V", "getAdRefreshState", "()Lcom/unity3d/ads/core/data/model/AdRefreshState;", "setAdRefreshState", "(Lcom/unity3d/ads/core/data/model/AdRefreshState;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WebViewLessLoadingRequiredData {

        @Nullable
        private AdRefreshState adRefreshState;

        @NotNull
        private AdResponseOuterClass.AdResponse adResponse;

        @NotNull
        private final String webviewUrl;

        public WebViewLessLoadingRequiredData(@NotNull String str, @NotNull AdResponseOuterClass.AdResponse adResponse, @Nullable AdRefreshState adRefreshState) {
            str.getClass();
            adResponse.getClass();
            this.webviewUrl = str;
            this.adResponse = adResponse;
            this.adRefreshState = adRefreshState;
        }

        public static /* synthetic */ WebViewLessLoadingRequiredData copy$default(WebViewLessLoadingRequiredData webViewLessLoadingRequiredData, String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webViewLessLoadingRequiredData.webviewUrl;
            }
            if ((i & 2) != 0) {
                adResponse = webViewLessLoadingRequiredData.adResponse;
            }
            if ((i & 4) != 0) {
                adRefreshState = webViewLessLoadingRequiredData.adRefreshState;
            }
            return webViewLessLoadingRequiredData.copy(str, adResponse, adRefreshState);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        @NotNull
        public final WebViewLessLoadingRequiredData copy(@NotNull String webviewUrl, @NotNull AdResponseOuterClass.AdResponse adResponse, @Nullable AdRefreshState adRefreshState) {
            webviewUrl.getClass();
            adResponse.getClass();
            return new WebViewLessLoadingRequiredData(webviewUrl, adResponse, adRefreshState);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebViewLessLoadingRequiredData)) {
                return false;
            }
            WebViewLessLoadingRequiredData webViewLessLoadingRequiredData = (WebViewLessLoadingRequiredData) other;
            return Intrinsics.c(this.webviewUrl, webViewLessLoadingRequiredData.webviewUrl) && Intrinsics.c(this.adResponse, webViewLessLoadingRequiredData.adResponse) && this.adRefreshState == webViewLessLoadingRequiredData.adRefreshState;
        }

        @Nullable
        public final AdRefreshState getAdRefreshState() {
            return this.adRefreshState;
        }

        @NotNull
        public final AdResponseOuterClass.AdResponse getAdResponse() {
            return this.adResponse;
        }

        @NotNull
        public final String getWebviewUrl() {
            return this.webviewUrl;
        }

        public int hashCode() {
            int hashCode = (this.adResponse.hashCode() + (this.webviewUrl.hashCode() * 31)) * 31;
            AdRefreshState adRefreshState = this.adRefreshState;
            return hashCode + (adRefreshState == null ? 0 : adRefreshState.hashCode());
        }

        public final void setAdRefreshState(@Nullable AdRefreshState adRefreshState) {
            this.adRefreshState = adRefreshState;
        }

        public final void setAdResponse(@NotNull AdResponseOuterClass.AdResponse adResponse) {
            adResponse.getClass();
            this.adResponse = adResponse;
        }

        @NotNull
        public String toString() {
            return "WebViewLessLoadingRequiredData(webviewUrl=" + this.webviewUrl + ", adResponse=" + this.adResponse + ", adRefreshState=" + this.adRefreshState + ')';
        }

        public /* synthetic */ WebViewLessLoadingRequiredData(String str, AdResponseOuterClass.AdResponse adResponse, AdRefreshState adRefreshState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, adResponse, (i & 4) != 0 ? null : adRefreshState);
        }
    }
}
