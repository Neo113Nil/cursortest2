package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3286aa;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3450gj;
import com.inmobi.media.AbstractC3587m1;
import com.inmobi.media.AbstractC3776t9;
import com.inmobi.media.AbstractC3777ta;
import com.inmobi.media.C3293ah;
import com.inmobi.media.C3658ok;
import com.inmobi.media.C3802u9;
import com.inmobi.media.C3803ua;
import com.inmobi.media.C3829va;
import com.inmobi.media.C3855wa;
import com.inmobi.media.C3881xa;
import com.inmobi.media.R5;
import com.inmobi.media.Xb;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.joa;
import defpackage.wx4;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0002GHB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010E\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0012\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", "listener", "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "setListener", "(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "keywords", "setKeywords", "(Ljava/lang/String;)V", "getSignals", "()V", "", "response", "load", "([B)V", "loadAdUnit", "show", "(Landroid/content/Context;)V", "", "isReady", "()Z", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "disableHardwareAcceleration", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lcom/inmobi/media/ta;", "mPubListener", "Lcom/inmobi/media/ta;", "getMPubListener$media_release", "()Lcom/inmobi/media/ta;", "setMPubListener$media_release", "(Lcom/inmobi/media/ta;)V", "Lcom/inmobi/media/xa;", "mAdManager", "Lcom/inmobi/media/xa;", "getMAdManager$media_release", "()Lcom/inmobi/media/xa;", "setMAdManager$media_release", "(Lcom/inmobi/media/xa;)V", "Lcom/inmobi/ads/PreloadManager;", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "Companion", "a", "com/inmobi/media/u9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiInterstitial {

    @NotNull
    public static final C3802u9 Companion = new C3802u9();
    public final Context a;
    public boolean b;
    public final WeakReference c;
    public final C3293ah d;
    public final a e;
    public final e f;
    public C3881xa mAdManager;
    public AbstractC3777ta mPubListener;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial$a;", "Lcom/inmobi/media/wa;", "Lcom/inmobi/ads/InMobiInterstitial;", "interstitial", "<init>", "(Lcom/inmobi/ads/InMobiInterstitial;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C3855wa {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiInterstitial inMobiInterstitial) {
            super(inMobiInterstitial);
            inMobiInterstitial.getClass();
        }

        @Override // com.inmobi.media.C3855wa, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3855wa, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AbstractC3777ta mPubListener$media_release;
            status.getClass();
            InMobiInterstitial inMobiInterstitial = this.a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3855wa, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            info.getClass();
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e) {
                    String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    access$getTAG$cp.getClass();
                    Xb.a((byte) 1, access$getTAG$cp, e.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(@NotNull Context context, long j, @NotNull InterstitialAdEventListener interstitialAdEventListener) {
        context.getClass();
        interstitialAdEventListener.getClass();
        C3293ah c3293ah = new C3293ah();
        this.d = c3293ah;
        this.e = new a(this);
        this.f = new e(this);
        if (!AbstractC3424fj.d()) {
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        this.a = context.getApplicationContext();
        c3293ah.a = j;
        this.c = new WeakReference(context);
        setMPubListener$media_release(new C3803ua(interstitialAdEventListener));
        setMAdManager$media_release(new C3881xa());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    public final void a(Activity activity) {
        try {
            if (this.b) {
                getMAdManager$media_release().a(activity);
            } else {
                Xb.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            e.getMessage();
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    @NotNull
    public final C3881xa getMAdManager$media_release() {
        C3881xa c3881xa = this.mAdManager;
        if (c3881xa != null) {
            return c3881xa;
        }
        Intrinsics.i("mAdManager");
        throw null;
    }

    @NotNull
    public final AbstractC3777ta getMPubListener$media_release() {
        AbstractC3777ta abstractC3777ta = this.mPubListener;
        if (abstractC3777ta != null) {
            return abstractC3777ta;
        }
        Intrinsics.i("mPubListener");
        throw null;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.f;
    }

    @wx4
    public final void getSignals() {
        C3293ah c3293ah = this.d;
        c3293ah.getClass();
        c3293ah.h = "AB";
        C3881xa mAdManager$media_release = getMAdManager$media_release();
        C3293ah c3293ah2 = this.d;
        Context context = this.a;
        if (context == null) {
            Intrinsics.i("mContext");
            throw null;
        }
        mAdManager$media_release.a(c3293ah2, context, false, "getToken");
        getMAdManager$media_release().a(this.e);
    }

    public final boolean isReady() {
        C3829va c3829va;
        C3658ok c3658ok;
        C3881xa mAdManager$media_release = getMAdManager$media_release();
        C3829va c3829va2 = mAdManager$media_release.h;
        boolean z = c3829va2 != null && 2 == mAdManager$media_release.a && c3829va2.b == 4;
        if (!z && (((c3829va = getMAdManager$media_release().h) == null || (c3658ok = c3829va.H) == null || !c3658ok.b) && c3829va != null)) {
            c3829va.b0();
        }
        return z;
    }

    public final void load() {
        try {
            this.b = true;
            this.d.h = "NonAB";
            C3881xa mAdManager$media_release = getMAdManager$media_release();
            C3293ah c3293ah = this.d;
            Context context = this.a;
            if (context == null) {
                Intrinsics.i("mContext");
                throw null;
            }
            mAdManager$media_release.a(c3293ah, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                R5.c((Context) this.c.get());
            }
            loadAdUnit();
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            e.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.e);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String str = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Xb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C3881xa mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3587m1 f = mAdManager$media_release.f();
            str = f != null ? f.a(lossReason, auctionPrice) : null;
        }
        if (str != null) {
            Xb.a((byte) 1, "InMobi", str);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String str = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Xb.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C3881xa mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3587m1 f = mAdManager$media_release.f();
            str = f != null ? f.a(minBidToWin) : null;
        }
        if (str != null) {
            Xb.a((byte) 1, "InMobi", str);
        }
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        contentUrl.getClass();
        this.d.f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC3450gj.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC3450gj.a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.d.c = keywords;
    }

    public final void setListener(@NotNull InterstitialAdEventListener listener) {
        listener.getClass();
        setMPubListener$media_release(new C3803ua(listener));
    }

    public final void setMAdManager$media_release(@NotNull C3881xa c3881xa) {
        c3881xa.getClass();
        this.mAdManager = c3881xa;
    }

    public final void setMPubListener$media_release(@NotNull AbstractC3777ta abstractC3777ta) {
        abstractC3777ta.getClass();
        this.mPubListener = abstractC3777ta;
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        watermarkData.getClass();
        getMAdManager$media_release().a(watermarkData);
    }

    public final void show(@NotNull Context context) {
        context.getClass();
        if (context instanceof Activity) {
            a((Activity) context);
        } else {
            Xb.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
            a(null);
        }
    }

    @wx4
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void show() {
        a(null);
    }

    public final void load(@Nullable byte[] response) {
        this.b = true;
        this.d.h = "AB";
        C3881xa mAdManager$media_release = getMAdManager$media_release();
        C3293ah c3293ah = this.d;
        Context context = this.a;
        if (context != null) {
            mAdManager$media_release.a(c3293ah, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                R5.c((Context) this.c.get());
            }
            getMAdManager$media_release().a(response, this.e);
            return;
        }
        Intrinsics.i("mContext");
        throw null;
    }
}
