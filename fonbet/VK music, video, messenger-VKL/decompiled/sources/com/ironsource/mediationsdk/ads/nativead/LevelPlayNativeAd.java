package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C4336gd;
import com.ironsource.C4452n4;
import com.ironsource.Zb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
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
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.s3q0;
import xsna.to2;
import xsna.vo2;
import xsna.xz3;
import xsna.yy4;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {
    private String a;
    private C4336gd b;
    private LevelPlayNativeAdListener c;
    private Zb d;
    private AdapterNativeAdData e;
    private AdapterNativeAdViewBinder f;
    private final AtomicBoolean g;

    public static final class Builder {
        private String a;
        private LevelPlayNativeAdListener b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.a = str;
        }

        public final Builder withActivity(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        public final Builder withListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.b = levelPlayNativeAdListener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, zcl zclVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd) {
        s3q0 s3q0Var;
        levelPlayNativeAd.b();
        Zb zb = levelPlayNativeAd.d;
        if (zb != null) {
            zb.a(levelPlayNativeAd.b);
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            levelPlayNativeAd.a();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            Zb zb = this.d;
            if (zb != null) {
                zb.J();
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f;
    }

    public final UUID getObjectId() {
        Zb zb = this.d;
        if (zb != null) {
            return zb.h();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
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
        String b = p.h().b();
        if (b.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new to2(this, 7));
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): ".concat(b), IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new yy4(2, this, adInfo), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new vo2(2, this, adInfo), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new xz3(1, this, ironSourceError), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(final AdInfo adInfo, final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: xsna.p2z
            @Override // java.lang.Runnable
            public final void run() {
                LevelPlayNativeAd.a(LevelPlayNativeAd.this, adapterNativeAdData, adapterNativeAdViewBinder, adInfo);
            }
        }, 0L, 2, null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.c = levelPlayNativeAdListener;
    }

    private LevelPlayNativeAd(Builder builder) {
        this.g = new AtomicBoolean(false);
        this.a = builder.getMPlacementName$mediationsdk_release();
        this.c = builder.getMListener$mediationsdk_release();
    }

    private final void b() {
        if (this.g.compareAndSet(false, true)) {
            Zb c = p.h().c();
            this.d = c;
            if (c != null) {
                c.a(this);
                this.b = new C4336gd(p.h().i(this.a));
            }
        }
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder, AdInfo adInfo) {
        levelPlayNativeAd.e = adapterNativeAdData;
        levelPlayNativeAd.f = adapterNativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(levelPlayNativeAd, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, IronSourceError ironSourceError) {
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(levelPlayNativeAd, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo) {
        LevelPlayNativeAdListener levelPlayNativeAdListener = levelPlayNativeAd.c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(levelPlayNativeAd, adInfo);
        }
    }
}
