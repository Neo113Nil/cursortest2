package com.moloco.sdk.publisher;

import android.content.Context;
import android.os.Build;
import com.google.protobuf.Internal;
import com.ironsource.L6;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.a2;
import com.moloco.sdk.acm.f;
import com.moloco.sdk.f2;
import com.moloco.sdk.h2;
import com.moloco.sdk.i2;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.publisher.g1;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.internal.publisher.u;
import com.moloco.sdk.internal.services.bidtoken.k;
import com.moloco.sdk.internal.services.bidtoken.o;
import com.moloco.sdk.internal.services.bidtoken.p;
import com.moloco.sdk.internal.services.events.g;
import com.moloco.sdk.internal.services.q;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.j2;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.e;
import com.moloco.sdk.service_locator.i;
import com.moloco.sdk.service_locator.j;
import com.moloco.sdk.service_locator.l;
import com.moloco.sdk.x0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.y1;
import defpackage.a70;
import defpackage.ad2;
import defpackage.b8f;
import defpackage.be5;
import defpackage.bf3;
import defpackage.g9i;
import defpackage.hje;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.i3l;
import defpackage.joa;
import defpackage.k13;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.mqi;
import defpackage.p2g;
import defpackage.rob;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.tub;
import defpackage.tz9;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.y6b;
import defpackage.yda;
import defpackage.ypa;
import defpackage.z45;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0081@¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JM\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 JM\u0010!\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b!\u0010 JU\u0010$\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b$\u0010%JM\u0010&\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001dH\u0007¢\u0006\u0004\b&\u0010 JM\u0010)\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`(H\u0007¢\u0006\u0004\b)\u0010 JM\u0010,\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`+H\u0007¢\u0006\u0004\b,\u0010 JM\u0010/\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172 \u0010\u001e\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`.H\u0007¢\u0006\u0004\b/\u0010 J\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b4\u0010\u0006J\u0017\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u000fJ\u000f\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u0010\u0003J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u0010;R2\u0010>\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0=0<8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010\u0003\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00170C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010TR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010H\u001a\u0004\bX\u0010YR*\u0010\\\u001a\u0004\u0018\u00010[8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u0010]\u0012\u0004\bb\u0010\u0003\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR*\u00105\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b5\u0010c\u0012\u0004\bg\u0010\u0003\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u000fR\u0016\u0010j\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00170k8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010o\u001a\u0002098FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0003\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Lcom/moloco/sdk/publisher/Moloco;", "", "<init>", "()V", "", "clearState$moloco_sdk_release", "(Lrq3;)Ljava/lang/Object;", "clearState", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "initParam", "Lcom/moloco/sdk/publisher/MolocoInitializationListener;", "listener", "initialize", "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;Lcom/moloco/sdk/publisher/MolocoInitializationListener;)V", "logMolocoInfo", "(Lcom/moloco/sdk/publisher/init/MolocoInitParams;)V", "Lcom/moloco/sdk/publisher/MediationInfo;", "mediationInfo", "Landroid/content/Context;", "context", "Lcom/moloco/sdk/publisher/MolocoBidTokenListener;", "getBidToken", "(Lcom/moloco/sdk/publisher/MediationInfo;Landroid/content/Context;Lcom/moloco/sdk/publisher/MolocoBidTokenListener;)V", "", "adUnitId", "watermarkString", "Lkotlin/Function2;", "Lcom/moloco/sdk/publisher/Banner;", "Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "Lcom/moloco/sdk/publisher/CreateBannerCallback;", "callback", "createBanner", "(Lcom/moloco/sdk/publisher/MediationInfo;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "createBannerTablet", "Lcom/moloco/sdk/publisher/BannerAdSize;", "size", "createMolocoBanner", "(Lcom/moloco/sdk/publisher/MediationInfo;Ljava/lang/String;Lcom/moloco/sdk/publisher/BannerAdSize;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "createMREC", "Lcom/moloco/sdk/publisher/NativeAd;", "Lcom/moloco/sdk/publisher/CreateNativeAdCallback;", "createNativeAd", "Lcom/moloco/sdk/publisher/InterstitialAd;", "Lcom/moloco/sdk/publisher/CreateInterstitialAdCallback;", "createInterstitial", "Lcom/moloco/sdk/publisher/RewardedInterstitialAd;", "Lcom/moloco/sdk/publisher/CreateRewardedInterstitialAdCallback;", "createRewardedInterstitial", "Lcom/moloco/sdk/j2;", "sdkInitResponse", "processInitConfigs", "(Lcom/moloco/sdk/j2;)V", "updateAndroidClientMetricsOnInitSuccess", "initParams", "initializeAndroidClientMetrics", "initializeILRD", "mediationName", "", "shouldInitializeILRD", "(Ljava/lang/String;)Z", "", "", "pendingInitByMediator", "Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release", "()Ljava/util/Map;", "getPendingInitByMediator$moloco_sdk_release$annotations", "", "_failedMediations", "Ljava/util/Set;", "Lcom/moloco/sdk/internal/publisher/g1;", "initializationHandler$delegate", "Ljoa;", "getInitializationHandler", "()Lcom/moloco/sdk/internal/publisher/g1;", "initializationHandler", "Lcom/moloco/sdk/internal/services/bidtoken/i;", "bidTokenHandler$delegate", "getBidTokenHandler", "()Lcom/moloco/sdk/internal/services/bidtoken/i;", "bidTokenHandler", "Lcom/moloco/sdk/internal/publisher/s;", "adCreator$delegate", "getAdCreator", "()Lcom/moloco/sdk/internal/publisher/s;", "adCreator", "Lku3;", "scope$delegate", "getScope", "()Lku3;", "scope", "Lyda;", "initJob", "Lyda;", "getInitJob", "()Lyda;", "setInitJob", "(Lyda;)V", "getInitJob$annotations", "Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "getInitParams", "()Lcom/moloco/sdk/publisher/init/MolocoInitParams;", "setInitParams", "getInitParams$annotations", "getAppKey$moloco_sdk_release", "()Ljava/lang/String;", "appKey", "", "getFailedMediations$moloco_sdk_release", "()Ljava/util/Set;", "failedMediations", "isInitialized", "()Z", "isInitialized$annotations", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class Moloco {

    @Nullable
    private static yda initJob;

    @Nullable
    private static MolocoInitParams initParams;

    @NotNull
    public static final Moloco INSTANCE = new Moloco();

    @NotNull
    private static final Map<String, List<MolocoInitializationListener>> pendingInitByMediator = new LinkedHashMap();

    @NotNull
    private static final Set<String> _failedMediations = new LinkedHashSet();

    /* renamed from: initializationHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final joa initializationHandler = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(2));

    /* renamed from: bidTokenHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final joa bidTokenHandler = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(3));

    /* renamed from: adCreator$delegate, reason: from kotlin metadata */
    @NotNull
    private static final joa adCreator = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(4));

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private static final joa scope = ypa.b(new com.moloco.sdk.internal.unity_bridge.b(5));
    public static final int $stable = 8;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i2.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Moloco() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s adCreator_delegate$lambda$9() {
        return new s(INSTANCE.getInitializationHandler().c, i.b(), new u(), new Moloco$adCreator$2$1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k bidTokenHandler_delegate$lambda$8() {
        return new k((o) p.a.getValue(), INSTANCE.getInitializationHandler(), i.b());
    }

    public static final void createBanner(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner async for adUnitId: " + adUnitId, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createBanner$1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createBanner$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createBanner(mediationInfo, str, str2, function2);
    }

    public static final void createBannerTablet(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner tablet async for adUnitId: " + adUnitId, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createBannerTablet$1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createBannerTablet$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createBannerTablet(mediationInfo, str, str2, function2);
    }

    public static final void createInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super InterstitialAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating interstitial ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createInterstitial$1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createInterstitial$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createInterstitial(mediationInfo, str, str2, function2);
    }

    public static final void createMREC(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating banner MREC async for adUnitId: " + adUnitId, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createMREC$1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createMREC$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createMREC(mediationInfo, str, str2, function2);
    }

    public static final void createMolocoBanner(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @NotNull BannerAdSize size, @Nullable String watermarkString, @NotNull Function2<? super Banner, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        size.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating Moloco banner async for adUnitId: " + adUnitId + ", size: " + size, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createMolocoBanner$1(mediationInfo, size, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createMolocoBanner$default(MediationInfo mediationInfo, String str, BannerAdSize bannerAdSize, String str2, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        createMolocoBanner(mediationInfo, str, bannerAdSize, str2, function2);
    }

    public static final void createNativeAd(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super NativeAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating native ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createNativeAd$1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createNativeAd$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createNativeAd(mediationInfo, str, str2, function2);
    }

    public static final void createRewardedInterstitial(@NotNull MediationInfo mediationInfo, @NotNull String adUnitId, @Nullable String watermarkString, @NotNull Function2<? super RewardedInterstitialAd, ? super MolocoAdError.AdCreateError, Unit> callback) {
        mediationInfo.getClass();
        adUnitId.getClass();
        callback.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Creating rewarded ad for mediation async for adUnitId: " + adUnitId, null, false, 12, null);
        xw3.L(INSTANCE.getScope(), null, null, new Moloco$createRewardedInterstitial$1(mediationInfo, adUnitId, watermarkString, callback, null), 3);
    }

    public static /* synthetic */ void createRewardedInterstitial$default(MediationInfo mediationInfo, String str, String str2, Function2 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        createRewardedInterstitial(mediationInfo, str, str2, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s getAdCreator() {
        return (s) adCreator.getValue();
    }

    public static final void getBidToken(@NotNull MediationInfo mediationInfo, @NotNull Context context, @NotNull MolocoBidTokenListener listener) {
        mediationInfo.getClass();
        context.getClass();
        listener.getClass();
        f1.e(context);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "[Thread id: " + Thread.currentThread().getId() + ", name: " + Thread.currentThread().getName() + "] Fetching bid token", null, false, 12, null);
        com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
        String name = mediationInfo.getName();
        aVar.getClass();
        xw3.L(com.moloco.sdk.internal.scheduling.a.a, null, null, new Moloco$getBidToken$1(com.moloco.sdk.acm.recorder.a.a(name), mediationInfo, listener, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.internal.services.bidtoken.i getBidTokenHandler() {
        return (com.moloco.sdk.internal.services.bidtoken.i) bidTokenHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g1 getInitializationHandler() {
        return (g1) initializationHandler.getValue();
    }

    private final ku3 getScope() {
        return (ku3) scope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 initializationHandler_delegate$lambda$7() {
        return new g1(i.b());
    }

    public static final synchronized void initialize(@NotNull MolocoInitParams initParam, @Nullable MolocoInitializationListener listener) {
        synchronized (Moloco.class) {
            try {
                initParam.getClass();
                Moloco moloco = INSTANCE;
                moloco.logMolocoInfo(initParam);
                if (initParam.getAppKey().length() == 0) {
                    throw new IllegalArgumentException("Moloco SDK initialized with empty appKey");
                }
                if (isInitialized()) {
                    if (Intrinsics.c(initParam.getAppKey(), moloco.getAppKey$moloco_sdk_release())) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized. Returning and notifying listener", null, false, 12, null);
                        if (moloco.shouldInitializeILRD(initParam.getMediationInfo().getName())) {
                            moloco.initializeILRD();
                        }
                        if (listener != null) {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.i(listener, g1.f);
                        }
                    } else {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Already initialized but with different appKey. Returning error and notifying listener", null, false, 12, null);
                        _failedMediations.add(initParam.getMediationInfo().getName());
                        com.moloco.sdk.acm.recorder.a aVar = com.moloco.sdk.acm.recorder.b.Companion;
                        String name = initParam.getMediationInfo().getName();
                        aVar.getClass();
                        com.moloco.sdk.acm.recorder.c a = com.moloco.sdk.acm.recorder.a.a(name);
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                        a.a(new com.moloco.sdk.acm.d("sdk_init_failure_different_app_key"));
                        if (listener != null) {
                            MolocoInitStatus molocoInitStatus = g1.f;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.i(listener, new MolocoInitStatus(Initialization.FAILURE, "Moloco SDK failed to initialize due to unexpected app key"));
                        }
                    }
                    return;
                }
                synchronized (moloco) {
                    try {
                        yda ydaVar = initJob;
                        if (ydaVar == null || !ydaVar.isActive()) {
                            Unit unit = Unit.a;
                            initParams = initParam;
                            f1.e(initParam.getAppContext());
                            hs4 hs4Var = z45.a;
                            initJob = xw3.L(s9a.c(hq4.c), null, null, new Moloco$initialize$2(initParam, listener, null), 3);
                            return;
                        }
                        String appKey = initParam.getAppKey();
                        MolocoInitParams molocoInitParams = initParams;
                        if (!Intrinsics.c(appKey, molocoInitParams != null ? molocoInitParams.getAppKey() : null)) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with different appKey. Notifying listener and avoiding init", null, false, 12, null);
                            _failedMediations.add(initParam.getMediationInfo().getName());
                            com.moloco.sdk.acm.recorder.a aVar2 = com.moloco.sdk.acm.recorder.b.Companion;
                            String name2 = initParam.getMediationInfo().getName();
                            aVar2.getClass();
                            com.moloco.sdk.acm.recorder.c a2 = com.moloco.sdk.acm.recorder.a.a(name2);
                            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                            a2.a(new com.moloco.sdk.acm.d("sdk_init_failure_different_app_key"));
                            if (listener != null) {
                                MolocoInitStatus molocoInitStatus2 = g1.f;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.i(listener, new MolocoInitStatus(Initialization.FAILURE, "Moloco SDK failed to initialize due to unexpected app key during existing initialization"));
                            }
                            return;
                        }
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Init Job active with same appKey. Queuing listener and returning for mediator: " + initParam.getMediationInfo().getName(), null, false, 12, null);
                        String name3 = initParam.getMediationInfo().getName();
                        Map<String, List<MolocoInitializationListener>> map = pendingInitByMediator;
                        List<MolocoInitializationListener> list = map.get(name3);
                        if (list == null) {
                            list = new ArrayList<>();
                            map.put(name3, list);
                        }
                        List<MolocoInitializationListener> list2 = list;
                        if (listener != null) {
                            list2.add(listener);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void initialize$default(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, int i, Object obj) {
        if ((i & 2) != 0) {
            molocoInitializationListener = null;
        }
        initialize(molocoInitParams, molocoInitializationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeAndroidClientMetrics(MolocoInitParams initParams2) {
        getInitializationHandler().getClass();
        try {
            j.b();
            com.moloco.sdk.internal.configs.a aVar = com.moloco.sdk.internal.configs.b.a;
            com.moloco.sdk.acm.b bVar = com.moloco.sdk.acm.b.a;
            String appKey = initParams2.getAppKey();
            String str = aVar.a;
            Context appContext = initParams2.getAppContext();
            long j = aVar.b;
            Pair pair = new Pair("AppKey", initParams2.getAppKey());
            Pair pair2 = new Pair("AppBundle", e.a().a().a);
            Pair pair3 = new Pair("AppVersion", e.a().a().b);
            Pair pair4 = new Pair("SdkVersion", BuildConfig.SDK_VERSION_NAME);
            e.b().a();
            Pair pair5 = new Pair("OS", "android");
            e.b().a();
            f fVar = new f(appKey, str, appContext, j, tub.h(pair, pair2, pair3, pair4, pair5, new Pair(L6.G, Build.VERSION.RELEASE)));
            mqi mqiVar = com.moloco.sdk.acm.services.c.a;
            com.moloco.sdk.acm.services.c.g("AndroidClientMetrics", "ACM initialize");
            AtomicReference atomicReference = com.moloco.sdk.acm.b.h;
            com.moloco.sdk.acm.k kVar = com.moloco.sdk.acm.k.c;
            com.moloco.sdk.acm.k kVar2 = com.moloco.sdk.acm.k.b;
            while (!atomicReference.compareAndSet(kVar, kVar2)) {
                if (atomicReference.get() != kVar) {
                    return;
                }
            }
            com.moloco.sdk.acm.b.d = new com.moloco.sdk.acm.j(fVar.a, fVar.b, fVar.d, fVar.e);
            xw3.L(com.moloco.sdk.acm.b.g, null, null, new i3l(fVar, null, 15), 3);
        } catch (IllegalStateException unused) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ACM cannot be initialized as Moloco SDK cannot be initialized", null, false, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializeILRD() {
        Object obj;
        Object u2gVar;
        j2 j2Var = getInitializationHandler().d;
        if (j2Var == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Moloco", "ILRD cannot be initialized as Moloco SDK is not initialized", null, false, 12, null);
            return;
        }
        com.moloco.sdk.internal.ilrd.k kVar = (com.moloco.sdk.internal.ilrd.k) com.moloco.sdk.service_locator.b.e.getValue();
        kVar.getClass();
        if (kVar.b != null) {
            p2g p2gVar = w2g.b;
            obj = Unit.a;
        } else {
            rq3 rq3Var = null;
            f2 m = j2Var.s() ? j2Var.m() : null;
            if (m == null) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(new Exception("No ILRD configuration found"));
            } else {
                Internal.ListAdapter l = m.l();
                if (!m.getEnabled()) {
                    p2g p2gVar3 = w2g.b;
                    u2gVar = new u2g(new Exception("Publisher has not opted into ILRD collection"));
                } else if (l.isEmpty()) {
                    p2g p2gVar4 = w2g.b;
                    u2gVar = new u2g(new Exception("No ILRD supported networks available"));
                } else {
                    hs4 hs4Var = z45.a;
                    ad2 c = s9a.c(hq4.c.plus(tz9.o()));
                    String j = m.j();
                    j.getClass();
                    com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k b = j.b();
                    wd5 wd5Var = xd5.b;
                    int k = m.k();
                    be5 be5Var = be5.SECONDS;
                    long R = wkn.R(k, be5Var);
                    int maxBatchSize = m.getMaxBatchSize();
                    long R2 = wkn.R(m.m(), be5Var);
                    long R3 = wkn.R(m.i(), be5Var);
                    com.moloco.sdk.internal.services.i b2 = i.b();
                    y6b y6bVar = b8f.i.f;
                    com.moloco.sdk.internal.services.o oVar = (com.moloco.sdk.internal.services.o) i.c.getValue();
                    String o = j2Var.o();
                    o.getClass();
                    String h = j2Var.h();
                    h.getClass();
                    com.moloco.sdk.internal.ilrd.e eVar = new com.moloco.sdk.internal.ilrd.e(c, j, b, R, maxBatchSize, R2, R3, b2, y6bVar, oVar, o, h, (com.moloco.sdk.internal.services.e) com.moloco.sdk.service_locator.k.a.getValue());
                    Context context = kVar.a;
                    n nVar = new n();
                    nVar.a = c;
                    nVar.c = eVar;
                    nVar.d = ypa.b(new com.moloco.sdk.internal.ilrd.o(l, context, nVar));
                    nVar.e = Collections.synchronizedSet(new LinkedHashSet());
                    kVar.b = nVar;
                    synchronized (nVar) {
                        g9i g9iVar = (g9i) nVar.b;
                        if (g9iVar == null || !g9iVar.isActive()) {
                            nVar.b = xw3.L(c, null, null, new hje(nVar, rq3Var, 21), 3);
                        }
                    }
                    p2g p2gVar5 = w2g.b;
                    obj = Unit.a;
                }
            }
            obj = u2gVar;
        }
        Throwable a = w2g.a(obj);
        if (a != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", bf3.o(new StringBuilder("ILRD initialization failed. "), a), null, false, 12, null);
        }
    }

    public static final boolean isInitialized() {
        return INSTANCE.getInitializationHandler().c.a.getValue() == Initialization.SUCCESS;
    }

    private final void logMolocoInfo(MolocoInitParams initParam) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Moloco SDK initializing", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "SDK Version: 4.10.1", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "Mediation: " + initParam.getMediationInfo().getName(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "isInitialized: " + isInitialized(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "Moloco", "=====================================", null, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processInitConfigs(j2 sdkInitResponse) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k kVar;
        com.moloco.sdk.internal.configs.a aVar;
        rq3 rq3Var = null;
        if (sdkInitResponse.r()) {
            y1 k = sdkInitResponse.k();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.debug$default(molocoLogger, "Moloco", "Init response has eventCollectionConfig", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionConfig:", false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "eventCollectionEnabled: " + k.k(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "mrefCollectionEnabled: " + k.l(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appFgUrl: " + k.i(), false, 4, null);
            MolocoLogger.debug$default(molocoLogger, "Moloco", "appBgUrl: " + k.h(), false, 4, null);
            com.moloco.sdk.internal.services.events.e eVar = (com.moloco.sdk.internal.services.events.e) l.c.getValue();
            boolean k2 = k.k();
            boolean l = k.l();
            String i = k.i();
            i.getClass();
            String h = k.h();
            h.getClass();
            eVar.getClass();
            eVar.a = new g(i, h, k2, l);
            if (k.k()) {
                r a = com.moloco.sdk.service_locator.b.a();
                a.getClass();
                MolocoLogger.debug$default(molocoLogger, "AnalyticsApplicationLifecycleTrackerImpl", "Start observing application lifecycle events", false, 4, null);
                xw3.L(a.c, null, null, new q(a, rq3Var, 0), 3);
            }
        } else {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "Init response does not have eventCollectionConfig", false, 4, null);
        }
        com.moloco.sdk.internal.services.config.a aVar2 = (com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.a.getValue();
        aVar2.getClass();
        LinkedHashMap linkedHashMap = aVar2.a;
        Iterator it = aVar2.c.iterator();
        while (it.hasNext()) {
            ((com.moloco.sdk.internal.services.config.handlers.a) it.next()).getClass();
            if (sdkInitResponse.t()) {
                h2 n = sdkInitResponse.n();
                String url = n.getUrl();
                url.getClass();
                aVar = new com.moloco.sdk.internal.configs.a(url, n.i());
            } else {
                aVar = com.moloco.sdk.internal.configs.b.a;
            }
            linkedHashMap.put(com.moloco.sdk.internal.configs.a.class.getName(), aVar);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "RemoteConfigService", "Adding config: ".concat(com.moloco.sdk.internal.configs.a.class.getName()), null, false, 12, null);
        }
        String name = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k.class.getName();
        Internal.ProtobufList l2 = sdkInitResponse.l();
        l2.getClass();
        ArrayList arrayList = new ArrayList(k13.r(l2, 10));
        Iterator<E> it2 = l2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((a2) it2.next()).getName());
        }
        boolean contains = arrayList.contains("ANDROID_STREAMING_ENABLED");
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "RemoteConfigService", com.appsflyer.internal.i.j("Adding StreamingEnabled: ", contains), null, false, 12, null);
        if (sdkInitResponse.q() && sdkInitResponse.i().j() && sdkInitResponse.i().h().j()) {
            x0 i2 = sdkInitResponse.i().h().i();
            kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k(sdkInitResponse.i().h().i().i() > 0.0d ? i2.i() : 1.0d, ((int) sdkInitResponse.i().h().i().j()) > 0 ? ((int) i2.j()) * 1024 : 512000, contains);
        } else {
            kVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k(1.0d, 512000, contains);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k kVar2 = kVar;
        MolocoLogger.debug$default(molocoLogger2, "RemoteConfigService", "Parsed and adding MediaConfig: " + kVar2.a + ", " + kVar2.b + ", " + kVar2.c + ", 209715200 ", false, 4, null);
        linkedHashMap.put(name, kVar2);
        Internal.ProtobufList<a2> l3 = sdkInitResponse.l();
        l3.getClass();
        for (a2 a2Var : l3) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "RemoteConfigService", "Adding ExperimentalFeatureFlag: " + a2Var.getName(), null, false, 12, null);
            LinkedHashMap linkedHashMap2 = aVar2.b;
            String name2 = a2Var.getName();
            String value = a2Var.getValue();
            linkedHashMap2.put(name2, (value == null || value.length() == 0) ? null : a2Var.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ku3 scope_delegate$lambda$10() {
        hs4 hs4Var = z45.a;
        return s9a.c(rob.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldInitializeILRD(String mediationName) {
        f2 m;
        j2 j2Var = getInitializationHandler().d;
        if (j2Var == null || (m = j2Var.m()) == null) {
            return false;
        }
        Internal.ListAdapter l = m.l();
        ArrayList arrayList = new ArrayList(k13.r(l, 10));
        Iterator<T> it = l.iterator();
        while (it.hasNext()) {
            i2 i2Var = (i2) it.next();
            String lowerCase = ((i2Var == null ? -1 : WhenMappings.$EnumSwitchMapping$0[i2Var.ordinal()]) == 1 ? "LevelPlay" : i2Var.name()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        String lowerCase2 = mediationName.toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        return arrayList.contains(lowerCase2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAndroidClientMetricsOnInitSuccess(rq3<? super Unit> rq3Var) {
        Object c = com.moloco.sdk.acm.b.a.c(new com.moloco.sdk.acm.i(((com.moloco.sdk.internal.configs.a) ((com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.a.getValue()).a(com.moloco.sdk.internal.configs.a.class, com.moloco.sdk.internal.configs.b.a)).a, new Long(r5.b)), rq3Var);
        return c == lu3.a ? c : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r12 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (defpackage.bea.q(r13, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clearState$moloco_sdk_release(@NotNull rq3<? super Unit> rq3Var) {
        Moloco$clearState$1 moloco$clearState$1;
        Object obj;
        int i;
        Object R;
        if (rq3Var instanceof Moloco$clearState$1) {
            moloco$clearState$1 = (Moloco$clearState$1) rq3Var;
            int i2 = moloco$clearState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                moloco$clearState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = moloco$clearState$1.result;
                obj = lu3.a;
                i = moloco$clearState$1.label;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj2);
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "Moloco", "clearState() unit testing function called", false, 4, null);
                    initParams = null;
                    yda ydaVar = initJob;
                    if (ydaVar != null) {
                        moloco$clearState$1.L$0 = this;
                        moloco$clearState$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (Moloco) moloco$clearState$1.L$0;
                    y6a.M(obj2);
                }
                initJob = null;
                pendingInitByMediator.clear();
                g1 initializationHandler2 = this.getInitializationHandler();
                moloco$clearState$1.L$0 = null;
                moloco$clearState$1.label = 2;
                initializationHandler2.d = null;
                initializationHandler2.e.l(null);
                initializationHandler2.b.l(null);
                com.moloco.sdk.service_locator.f fVar = com.moloco.sdk.service_locator.f.a;
                com.moloco.sdk.internal.services.init.n nVar = (com.moloco.sdk.internal.services.init.n) com.moloco.sdk.service_locator.f.e.getValue();
                nVar.d = null;
                com.moloco.sdk.internal.services.init.g gVar = nVar.b;
                R = xw3.R(gVar.b, new hje(gVar, rq3Var2, 22), moloco$clearState$1);
                if (R != obj) {
                    R = Unit.a;
                }
                if (R != obj) {
                    R = Unit.a;
                }
                if (R != obj) {
                    R = Unit.a;
                }
            }
        }
        moloco$clearState$1 = new Moloco$clearState$1(this, rq3Var);
        Object obj22 = moloco$clearState$1.result;
        obj = lu3.a;
        i = moloco$clearState$1.label;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        initJob = null;
        pendingInitByMediator.clear();
        g1 initializationHandler22 = this.getInitializationHandler();
        moloco$clearState$1.L$0 = null;
        moloco$clearState$1.label = 2;
        initializationHandler22.d = null;
        initializationHandler22.e.l(null);
        initializationHandler22.b.l(null);
        com.moloco.sdk.service_locator.f fVar2 = com.moloco.sdk.service_locator.f.a;
        com.moloco.sdk.internal.services.init.n nVar2 = (com.moloco.sdk.internal.services.init.n) com.moloco.sdk.service_locator.f.e.getValue();
        nVar2.d = null;
        com.moloco.sdk.internal.services.init.g gVar2 = nVar2.b;
        R = xw3.R(gVar2.b, new hje(gVar2, rq3Var22, 22), moloco$clearState$1);
        if (R != obj) {
        }
        if (R != obj) {
        }
        if (R != obj) {
        }
    }

    @Nullable
    public final String getAppKey$moloco_sdk_release() {
        MolocoInitParams molocoInitParams = initParams;
        if (molocoInitParams != null) {
            return molocoInitParams.getAppKey();
        }
        return null;
    }

    @NotNull
    public final Set<String> getFailedMediations$moloco_sdk_release() {
        return CollectionsKt.W0(_failedMediations);
    }

    @Nullable
    public final yda getInitJob() {
        return initJob;
    }

    @Nullable
    public final MolocoInitParams getInitParams() {
        return initParams;
    }

    @NotNull
    public final Map<String, List<MolocoInitializationListener>> getPendingInitByMediator$moloco_sdk_release() {
        return pendingInitByMediator;
    }

    public final void setInitJob(@Nullable yda ydaVar) {
        initJob = ydaVar;
    }

    public final void setInitParams(@Nullable MolocoInitParams molocoInitParams) {
        initParams = molocoInitParams;
    }

    public static /* synthetic */ void getInitJob$annotations() {
    }

    public static /* synthetic */ void getInitParams$annotations() {
    }

    public static /* synthetic */ void getPendingInitByMediator$moloco_sdk_release$annotations() {
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final void initialize(@NotNull MolocoInitParams molocoInitParams) {
        molocoInitParams.getClass();
        initialize$default(molocoInitParams, null, 2, null);
    }
}
