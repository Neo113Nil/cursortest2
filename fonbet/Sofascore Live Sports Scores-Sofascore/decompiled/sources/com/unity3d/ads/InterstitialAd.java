package com.unity3d.ads;

import android.app.Activity;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/InterstitialAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "<init>", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "show", "", "activity", "Landroid/app/Activity;", "configuration", "Lcom/unity3d/ads/ShowConfiguration;", "listener", "Lcom/unity3d/ads/InterstitialShowListener;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InterstitialAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final AdObject adObject;

    @Nullable
    private AdExpiredListener<InterstitialAd> onAdExpired;

    @NotNull
    private final SafeCallbackInvoke safeCallbackInvoke;

    public InterstitialAd(@NotNull AdObject adObject, @NotNull SafeCallbackInvoke safeCallbackInvoke) {
        ku3 scope;
        adObject.getClass();
        safeCallbackInvoke.getClass();
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        xw3.L(scope, null, null, new InterstitialAd$1$1(this, null), 3);
    }

    public static final void load(@NotNull LoadConfiguration loadConfiguration, @NotNull LoadListener<InterstitialAd> loadListener) {
        INSTANCE.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(InterstitialAd interstitialAd, Activity activity, ShowConfiguration showConfiguration, InterstitialShowListener interstitialShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            interstitialShowListener = null;
        }
        interstitialAd.show(activity, showConfiguration, interstitialShowListener);
    }

    @Nullable
    public final AdExpiredListener<InterstitialAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(@Nullable AdExpiredListener<InterstitialAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(@NotNull Activity activity, @Nullable ShowConfiguration configuration, @Nullable InterstitialShowListener listener) {
        activity.getClass();
        xw3.L((ku3) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class))), null, null, new InterstitialAd$show$1(configuration, this, activity, listener, null), 3);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/InterstitialAd$Companion;", "", "<init>", "()V", "load", "", "configuration", "Lcom/unity3d/ads/LoadConfiguration;", "listener", "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/InterstitialAd;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void load(@NotNull LoadConfiguration configuration, @NotNull LoadListener<InterstitialAd> listener) {
            configuration.getClass();
            listener.getClass();
            xw3.L((ku3) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, duf.a.getOrCreateKotlinClass(ku3.class))), null, null, new InterstitialAd$Companion$load$1(configuration, listener, null), 3);
        }

        private Companion() {
        }
    }
}
