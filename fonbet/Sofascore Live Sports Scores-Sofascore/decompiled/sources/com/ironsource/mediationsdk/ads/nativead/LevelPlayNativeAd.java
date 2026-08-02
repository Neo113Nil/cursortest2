package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C3961ac;
import com.ironsource.C4077fd;
import com.ironsource.C4157k4;
import com.ironsource.Yb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a6b;
import defpackage.kx0;
import defpackage.yp8;
import defpackage.yq5;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    @Nullable
    private String a;

    @Nullable
    private C4077fd b;

    @Nullable
    private LevelPlayNativeAdListener c;

    @Nullable
    private Yb d;

    @Nullable
    private AdapterNativeAdData e;

    @Nullable
    private AdapterNativeAdViewBinder f;

    @NotNull
    private final AtomicBoolean g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {

        @Nullable
        private String a;

        @Nullable
        private LevelPlayNativeAdListener b;

        @NotNull
        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        @Nullable
        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.b;
        }

        @Nullable
        public final String getMPlacementName$mediationsdk_release() {
            return this.a;
        }

        public final void setMListener$mediationsdk_release(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(@Nullable String str) {
            this.a = str;
        }

        @NotNull
        public final Builder withActivity(@Nullable Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        @NotNull
        public final Builder withListener(@NotNull LevelPlayNativeAdListener levelPlayNativeAdListener) {
            levelPlayNativeAdListener.getClass();
            this.b = levelPlayNativeAdListener;
            return this;
        }

        @NotNull
        public final Builder withPlacementName(@Nullable String str) {
            this.a = str;
            return this;
        }
    }

    private LevelPlayNativeAd(Builder builder) {
        this.g = new AtomicBoolean(false);
        this.a = builder.getMPlacementName$mediationsdk_release();
        this.c = builder.getMListener$mediationsdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd) {
        Unit unit;
        levelPlayNativeAd.getClass();
        levelPlayNativeAd.b();
        Yb yb = levelPlayNativeAd.d;
        if (yb != null) {
            yb.a(levelPlayNativeAd.b);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            levelPlayNativeAd.a();
        }
    }

    private final void b() {
        if (this.g.compareAndSet(false, true)) {
            Yb c = p.g().c();
            this.d = c;
            if (c != null) {
                c.a(this);
                C3961ac i = p.g().i(this.a);
                i.getClass();
                this.b = new C4077fd(i);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            Yb yb = this.d;
            if (yb != null) {
                yb.J();
            }
        } catch (Throwable th) {
            C4157k4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    @Nullable
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f;
    }

    @Nullable
    public final UUID getObjectId() {
        Yb yb = this.d;
        if (yb != null) {
            return yb.h();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    @Nullable
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String b = p.g().b();
        b.getClass();
        if (b.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new yp8(this, 5));
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): ".concat(b), IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(@Nullable AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a6b(this, adInfo, 0), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(@Nullable AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a6b(this, adInfo, 1), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new yq5(19, this, ironSourceError), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(@Nullable AdInfo adInfo, @NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new kx0(this, adapterNativeAdData, adapterNativeAdViewBinder, adInfo, 8), 0L, 2, null);
    }

    public final void setListener(@Nullable LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.c = levelPlayNativeAdListener;
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        levelPlayNativeAd.getClass();
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        levelPlayNativeAd.e = adapterNativeAdData;
        levelPlayNativeAd.f = adapterNativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, IronSourceError ironSourceError) {
        levelPlayNativeAd.getClass();
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        levelPlayNativeAd.getClass();
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        levelPlayNativeAd.getClass();
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(levelPlayNativeAd, adInfo);
        }
    }
}
