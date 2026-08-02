package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/InterstitialAd;", "Lcom/vungle/ads/BaseFullscreenAd;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/g1;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/g1;", "constructAdInternal", "", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class InterstitialAd extends BaseFullscreenAd {
    public /* synthetic */ InterstitialAd(Context context, String str, AdConfig adConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? new AdConfig() : adConfig);
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public g1 constructAdInternal$vungle_ads_release(@NotNull Context context) {
        context.getClass();
        return new g1(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAd(@NotNull Context context, @NotNull String str, @NotNull AdConfig adConfig) {
        super(context, str, adConfig);
        context.getClass();
        str.getClass();
        adConfig.getClass();
    }
}
