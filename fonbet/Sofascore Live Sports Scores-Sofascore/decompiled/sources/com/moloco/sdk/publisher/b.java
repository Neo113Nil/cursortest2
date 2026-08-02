package com.moloco.sdk.publisher;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import defpackage.mk9;
import defpackage.ok9;
import defpackage.yj9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit MolocoCreateRewardedInterstitialAd$lambda$10;
        Unit MolocoCreateNativeAd$lambda$8;
        Unit MolocoCreateInterstitialAd$lambda$9;
        switch (this.a) {
            case 0:
                MolocoCreateRewardedInterstitialAd$lambda$10 = MolocoSamplesKt.MolocoCreateRewardedInterstitialAd$lambda$10((RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                return MolocoCreateRewardedInterstitialAd$lambda$10;
            case 1:
                MolocoCreateNativeAd$lambda$8 = MolocoSamplesKt.MolocoCreateNativeAd$lambda$8((NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
                return MolocoCreateNativeAd$lambda$8;
            case 2:
                MolocoCreateInterstitialAd$lambda$9 = MolocoSamplesKt.MolocoCreateInterstitialAd$lambda$9((InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
                return MolocoCreateInterstitialAd$lambda$9;
            case 3:
                ((Integer) obj2).intValue();
                ((mk9) obj).getClass();
                return 100L;
            case 4:
                ok9 ok9Var = (ok9) obj;
                ok9Var.getClass();
                ((yj9) obj2).getClass();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Retry attempt #" + ok9Var.b + " for " + ok9Var.a.a, null, false, 12, null);
                return Unit.a;
            case 5:
                ((Integer) obj2).intValue();
                ((mk9) obj).getClass();
                return 100L;
            case 6:
                ok9 ok9Var2 = (ok9) obj;
                ok9Var2.getClass();
                ((yj9) obj2).getClass();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Retry attempt #" + ok9Var2.b + " for " + ok9Var2.a.a, null, false, 12, null);
                return Unit.a;
            default:
                PackageManager packageManager = (PackageManager) obj;
                Intent intent = (Intent) obj2;
                packageManager.getClass();
                intent.getClass();
                return Boolean.valueOf(intent.resolveActivity(packageManager) != null);
        }
    }

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
    }
}
