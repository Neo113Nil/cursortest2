package com.unity3d.ads;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import defpackage.duf;
import defpackage.ku3;
import defpackage.xw3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/BannerAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/View;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;Landroid/view/View;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "getView", "()Landroid/view/View;", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AdObject adObject;

    @Nullable
    private AdExpiredListener<BannerAd> onAdExpired;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    @NotNull
    private final View view;

    public BannerAd(@NotNull AdObject adObject, @NotNull View view, @NotNull SafeCallbackInvoke safeCallbackInvoke) {
        ku3 scope;
        adObject.getClass();
        view.getClass();
        safeCallbackInvoke.getClass();
        this.adObject = adObject;
        this.view = view;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        xw3.L(scope, null, null, new BannerAd$1$1(this, null), 3);
    }

    public static final void load(@NotNull BannerConfiguration bannerConfiguration, @NotNull LoadListener<BannerAd> loadListener) {
        INSTANCE.load(bannerConfiguration, loadListener);
    }

    @Nullable
    public final AdExpiredListener<BannerAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final void setOnAdExpired(@Nullable AdExpiredListener<BannerAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/BannerAd$Companion;", "", "<init>", "()V", "load", "", "configuration", "Lcom/unity3d/ads/BannerConfiguration;", "listener", "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/BannerAd;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void load(@NotNull BannerConfiguration configuration, @NotNull LoadListener<BannerAd> listener) {
            configuration.getClass();
            listener.getClass();
            xw3.L((ku3) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class))), null, null, new BannerAd$Companion$load$1(listener, configuration, null), 3);
        }

        private Companion() {
        }
    }
}
