package com.blaze.gam.custom_native;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import defpackage.a70;
import defpackage.eql;
import defpackage.l1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jm\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/blaze/gam/custom_native/BlazeCustomNativeAdsManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "adUnit", "formatId", "publisherProvidedId", "Landroid/os/Bundle;", "networkExtrasBundle", "", "customTargetingMap", "Lkotlin/Function1;", "Lcom/google/android/gms/ads/nativead/NativeCustomFormatAd;", "", "onAdsDataLoaded", "onAdsDataFailed", "requestAd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "Lcom/google/android/gms/ads/AdLoader;", "adLoader", "Lcom/google/android/gms/ads/AdLoader;", "blaze_gam_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BlazeCustomNativeAdsManager {
    private AdLoader adLoader;

    @NotNull
    private final Context context;

    public BlazeCustomNativeAdsManager(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestAd$lambda$0(Function1 function1, NativeCustomFormatAd nativeCustomFormatAd) {
        nativeCustomFormatAd.getClass();
        function1.invoke(nativeCustomFormatAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestAd$lambda$1(NativeCustomFormatAd nativeCustomFormatAd, String str) {
        nativeCustomFormatAd.getClass();
        str.getClass();
    }

    public final void requestAd(@NotNull String adUnit, @NotNull String formatId, @Nullable String publisherProvidedId, @Nullable Bundle networkExtrasBundle, @NotNull Map<String, String> customTargetingMap, @NotNull Function1<? super NativeCustomFormatAd, Unit> onAdsDataLoaded, @NotNull Function1<? super String, Unit> onAdsDataFailed) {
        adUnit.getClass();
        formatId.getClass();
        customTargetingMap.getClass();
        onAdsDataLoaded.getClass();
        onAdsDataFailed.getClass();
        this.adLoader = new AdLoader.Builder(this.context, adUnit).forCustomFormatAd(formatId, new l1(onAdsDataLoaded, 9), new a70(19)).withAdListener(new eql(onAdsDataFailed)).build();
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (publisherProvidedId != null) {
            builder.setPublisherProvidedId(publisherProvidedId);
        }
        if (networkExtrasBundle != null) {
            builder.addNetworkExtrasBundle(AdMobAdapter.class, networkExtrasBundle);
        }
        for (Map.Entry<String, String> entry : customTargetingMap.entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        build.getClass();
        AdLoader adLoader = this.adLoader;
        if (adLoader == null) {
            Intrinsics.i("adLoader");
            throw null;
        }
        adLoader.loadAd(build);
    }
}
