package com.moloco.sdk.internal.unity_bridge;

import android.content.Context;
import android.os.Handler;
import com.appsflyer.internal.p;
import com.facebook.v;
import com.ironsource.U3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityLoadCallback;
import com.moloco.sdk.internal.unity_bridge.internal.e;
import com.moloco.sdk.internal.unity_bridge.internal.f;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.joa;
import defpackage.lnb;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityPlugin;", "", "<init>", "()V", "", "appKey", "mediationName", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;", "callback", "", "initializeSdk", "(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityInitCallback;)V", "mediation", "adUnitId", "bidResponse", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;", U3.h.E, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;)V", "Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;", U3.h.H, "(Ljava/lang/String;Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityShowCallback;)V", "callingMethod", "logUninitializedAccessError", "(Ljava/lang/String;)V", "Lf1d;", "", "initState", "Lf1d;", "Landroid/content/Context;", "context$delegate", "Ljoa;", "getContext", "()Landroid/content/Context;", "context", "Lcom/moloco/sdk/internal/unity_bridge/internal/f;", "adManager$delegate", "getAdManager", "()Lcom/moloco/sdk/internal/unity_bridge/internal/f;", "adManager", "TAG", "Ljava/lang/String;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class MolocoUnityPlugin {

    @NotNull
    private static final String TAG = "MolocoUnityPlugin";

    @NotNull
    public static final MolocoUnityPlugin INSTANCE = new MolocoUnityPlugin();

    @NotNull
    private static final f1d initState = gdi.a(Boolean.FALSE);

    /* renamed from: context$delegate, reason: from kotlin metadata */
    @NotNull
    private static final joa context = ypa.b(new b(0));

    /* renamed from: adManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final joa adManager = ypa.b(new b(1));
    public static final int $stable = 8;

    private MolocoUnityPlugin() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f adManager_delegate$lambda$1() {
        return new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context context_delegate$lambda$0() {
        return f1.e(null);
    }

    private final f getAdManager() {
        return (f) adManager.getValue();
    }

    private final Context getContext() {
        return (Context) context.getValue();
    }

    public static final void initializeSdk(@NotNull final String appKey, @NotNull final String mediationName, @NotNull final MolocoUnityInitCallback callback) {
        appKey.getClass();
        mediationName.getClass();
        callback.getClass();
        Moloco.initialize(new MolocoInitParams(INSTANCE.getContext(), appKey, new MediationInfo(mediationName)), new MolocoInitializationListener() { // from class: com.moloco.sdk.internal.unity_bridge.a
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                MolocoUnityPlugin.initializeSdk$lambda$3(appKey, mediationName, callback, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdk$lambda$3(String str, String str2, MolocoUnityInitCallback molocoUnityInitCallback, MolocoInitStatus molocoInitStatus) {
        molocoInitStatus.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, TAG, "initialized " + str + ' ' + str2 + ' ' + molocoInitStatus.getInitialization(), null, false, 12, null);
        boolean z = molocoInitStatus.getInitialization() == Initialization.SUCCESS;
        f1d f1dVar = initState;
        Boolean valueOf = Boolean.valueOf(z);
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, valueOf);
        molocoUnityInitCallback.onInitialized(z);
    }

    public static final void loadInterstitial(@NotNull String mediation, @NotNull String adUnitId, @NotNull final String bidResponse, @NotNull final MolocoUnityLoadCallback callback) {
        mediation.getClass();
        adUnitId.getClass();
        bidResponse.getClass();
        callback.getClass();
        if (!((Boolean) ((fdi) initState).getValue()).booleanValue()) {
            INSTANCE.logUninitializedAccessError(U3.h.E);
            return;
        }
        final f adManager2 = INSTANCE.getAdManager();
        String obj = StringsKt.l0(mediation).toString();
        final String obj2 = StringsKt.l0(adUnitId).toString();
        adManager2.getClass();
        obj.getClass();
        obj2.getClass();
        final Handler a = f.a();
        Moloco.createInterstitial$default(new MediationInfo(obj), obj2, null, new Function2() { // from class: com.moloco.sdk.internal.unity_bridge.internal.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                InterstitialAd interstitialAd = (InterstitialAd) obj3;
                MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj4;
                Handler handler = a;
                String str = obj2;
                MolocoUnityLoadCallback molocoUnityLoadCallback = callback;
                if (adCreateError != null) {
                    handler.post(new p(5, molocoUnityLoadCallback, str, adCreateError));
                    return Unit.a;
                }
                interstitialAd.getClass();
                f fVar = adManager2;
                InterstitialAd interstitialAd2 = (InterstitialAd) fVar.a.a.get(str);
                if (interstitialAd2 != null) {
                    if (interstitialAd2.isLoaded()) {
                        handler.post(new b(molocoUnityLoadCallback, str, 0));
                        return Unit.a;
                    }
                    interstitialAd2.destroy();
                }
                interstitialAd.load(bidResponse, new c(fVar, str, interstitialAd, handler, molocoUnityLoadCallback));
                return Unit.a;
            }
        }, 4, null);
    }

    private final void logUninitializedAccessError(String callingMethod) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, TAG, lnb.o("ERROR: Failed to execute ", callingMethod, "() - please ensure the Moloco Unity Plugin has been initialized by calling 'MolocoSdk.InitializeSdk();'!"), null, false, 12, null);
    }

    public static final void showInterstitial(@NotNull String adUnitId, @NotNull MolocoUnityShowCallback callback) {
        adUnitId.getClass();
        callback.getClass();
        if (!((Boolean) ((fdi) initState).getValue()).booleanValue()) {
            INSTANCE.logUninitializedAccessError(U3.h.H);
            return;
        }
        f adManager2 = INSTANCE.getAdManager();
        String obj = StringsKt.l0(adUnitId).toString();
        adManager2.getClass();
        obj.getClass();
        Handler a = f.a();
        InterstitialAd interstitialAd = (InterstitialAd) adManager2.a.a.get(obj);
        if (interstitialAd != null && interstitialAd.isLoaded()) {
            interstitialAd.show(new e(a, callback));
            return;
        }
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        a.post(new v(6, callback, obj));
    }
}
