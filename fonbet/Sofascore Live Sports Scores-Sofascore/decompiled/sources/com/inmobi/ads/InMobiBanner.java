package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.media.AbstractC3330c2;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3450gj;
import com.inmobi.media.AbstractC3587m1;
import com.inmobi.media.AbstractC3632nk;
import com.inmobi.media.AbstractC3846w1;
import com.inmobi.media.C3293ah;
import com.inmobi.media.C3356d2;
import com.inmobi.media.C3381e2;
import com.inmobi.media.C3388e9;
import com.inmobi.media.C3433g2;
import com.inmobi.media.C3485i2;
import com.inmobi.media.C3794u1;
import com.inmobi.media.C3820v1;
import com.inmobi.media.C3839vk;
import com.inmobi.media.C3906y9;
import com.inmobi.media.E1;
import com.inmobi.media.EnumC3943zk;
import com.inmobi.media.HandlerC3459h2;
import com.inmobi.media.N3;
import com.inmobi.media.Pf;
import com.inmobi.media.Qa;
import com.inmobi.media.Qf;
import com.inmobi.media.R5;
import com.inmobi.media.T5;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC3414f9;
import com.inmobi.media.Xb;
import com.inmobi.media.Z1;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.ironsource.C4427z5;
import com.ironsource.T2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.fc6;
import defpackage.gz8;
import defpackage.ij8;
import defpackage.jp5;
import defpackage.jx1;
import defpackage.tub;
import defpackage.us9;
import defpackage.wv8;
import defpackage.wx4;
import defpackage.yq5;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u0089\u00012\u00020\u0001:\u0005\u008a\u0001\u008b\u0001\\B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000b¢\u0006\u0004\b/\u0010\rJ\u000f\u00100\u001a\u00020\u000bH\u0014¢\u0006\u0004\b0\u0010\rJ\u000f\u00101\u001a\u00020\u000bH\u0014¢\u0006\u0004\b1\u0010\rJ\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J#\u00108\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'H\u0007¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u00020\u000b2\b\b\u0001\u00106\u001a\u00020'2\b\b\u0001\u00107\u001a\u00020'H\u0000¢\u0006\u0004\b:\u00109J\u000f\u0010<\u001a\u00020\u000bH\u0007¢\u0006\u0004\b<\u0010\rJ\u001f\u0010@\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020'H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020#H\u0016¢\u0006\u0004\bC\u0010&J\u000f\u0010E\u001a\u00020\u000bH\u0000¢\u0006\u0004\bD\u0010\rJ\u000f\u0010G\u001a\u00020\u000bH\u0001¢\u0006\u0004\bF\u0010\rJ\r\u0010H\u001a\u00020\u000b¢\u0006\u0004\bH\u0010\rJ\r\u0010I\u001a\u00020\u000b¢\u0006\u0004\bI\u0010\rJ\r\u0010J\u001a\u00020\b¢\u0006\u0004\bJ\u0010KJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020'2\u0006\u0010U\u001a\u00020P¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020#¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000bH\u0007¢\u0006\u0004\bZ\u0010\rR$\u0010b\u001a\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR$\u0010h\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010OR\"\u0010p\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR$\u0010x\u001a\u0004\u0018\u00010q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u001a\u0010~\u001a\u00020y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R&\u0010\u0085\u0001\u001a\u00020\u007f8\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u0012\u0005\b\u0084\u0001\u0010\r\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0088\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008c\u0001"}, d2 = {"Lcom/inmobi/ads/InMobiBanner;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "getSignals", "()V", "", "response", "load", "([B)V", "refreshBanner$media_release", "refreshBanner", "(Landroid/content/Context;)V", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/BannerAdEventListener;", "listener", "setListener", "(Lcom/inmobi/ads/listeners/BannerAdEventListener;)V", "", "enabled", "setEnableAutoRefresh", "(Z)V", "", T2.b, "setRefreshInterval", "(I)V", "Lcom/inmobi/ads/InMobiBanner$AnimationType;", "animationType", "setAnimationType", "(Lcom/inmobi/ads/InMobiBanner$AnimationType;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "widthInDp", "heightInDp", "setBannerSize", "(II)V", "updateLayoutParamsForResolvedSize$media_release", "updateLayoutParamsForResolvedSize", "setupBannerSizeObserver", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "hasWindowFocus", "onWindowFocusChanged", "scheduleRefresh$media_release", "scheduleRefresh", "swapAdUnitsAndDisplayAd$media_release", "swapAdUnitsAndDisplayAd", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "getPlacementId", "()J", "Lcom/inmobi/ads/banner/AudioListener;", "audioListener", "setAudioListener", "(Lcom/inmobi/ads/banner/AudioListener;)V", "", "minBidToWin", "notifyWin", "(D)V", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "isAudioAd", "()Z", "destroy", "Lcom/inmobi/media/c2;", "a", "Lcom/inmobi/media/c2;", "getMPubListener$media_release", "()Lcom/inmobi/media/c2;", "setMPubListener$media_release", "(Lcom/inmobi/media/c2;)V", "mPubListener", "b", "Lcom/inmobi/ads/banner/AudioListener;", "getMAudioListener$media_release", "()Lcom/inmobi/ads/banner/AudioListener;", "setMAudioListener$media_release", "mAudioListener", "Lcom/inmobi/media/Z1;", com.mbridge.msdk.foundation.controller.a.q, "Lcom/inmobi/media/Z1;", "getAudioStatusInternal$media_release", "()Lcom/inmobi/media/Z1;", "setAudioStatusInternal$media_release", "(Lcom/inmobi/media/Z1;)V", "audioStatusInternal", "Lcom/inmobi/media/i2;", "d", "Lcom/inmobi/media/i2;", "getMAdManager$media_release", "()Lcom/inmobi/media/i2;", "setMAdManager$media_release", "(Lcom/inmobi/media/i2;)V", "mAdManager", "Lcom/inmobi/media/ah;", C4427z5.q, "Lcom/inmobi/media/ah;", "getMPubSettings$media_release", "()Lcom/inmobi/media/ah;", "mPubSettings", "Lcom/inmobi/ads/PreloadManager;", "o", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "Companion", "AnimationType", "com/inmobi/media/e9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiBanner extends RelativeLayout {

    @NotNull
    public static final C3388e9 Companion = new C3388e9();

    /* renamed from: a, reason: from kotlin metadata */
    public AbstractC3330c2 mPubListener;

    /* renamed from: b, reason: from kotlin metadata */
    public AudioListener mAudioListener;

    /* renamed from: c, reason: from kotlin metadata */
    public Z1 audioStatusInternal;

    /* renamed from: d, reason: from kotlin metadata */
    public C3485i2 mAdManager;
    public final a e;
    public int f;
    public boolean g;
    public final HandlerC3459h2 h;
    public int i;
    public int j;
    public AnimationType k;
    public long l;
    public WeakReference m;

    /* renamed from: n, reason: from kotlin metadata */
    public final C3293ah mPubSettings;
    public final d o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$AnimationType;", "", "<init>", "(Ljava/lang/String;I)V", "ANIMATION_OFF", "ROTATE_HORIZONTAL_AXIS", "ANIMATION_ALPHA", "ROTATE_VERTICAL_AXIS", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ANIMATION_OFF = new AnimationType("ANIMATION_OFF", 0);
        public static final AnimationType ROTATE_HORIZONTAL_AXIS = new AnimationType("ROTATE_HORIZONTAL_AXIS", 1);
        public static final AnimationType ANIMATION_ALPHA = new AnimationType("ANIMATION_ALPHA", 2);
        public static final AnimationType ROTATE_VERTICAL_AXIS = new AnimationType("ROTATE_VERTICAL_AXIS", 3);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ANIMATION_OFF, ROTATE_HORIZONTAL_AXIS, ANIMATION_ALPHA, ROTATE_VERTICAL_AXIS};
        }

        static {
            AnimationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private AnimationType(String str, int i) {
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiBanner$a;", "Lcom/inmobi/media/g2;", "Lcom/inmobi/ads/InMobiBanner;", "banner", "<init>", "(Lcom/inmobi/ads/InMobiBanner;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C3433g2 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiBanner inMobiBanner) {
            super(inMobiBanner);
            inMobiBanner.getClass();
        }

        @Override // com.inmobi.media.C3433g2, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3433g2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            status.getClass();
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner == null) {
                return;
            }
            AbstractC3330c2 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(inMobiBanner, status);
            }
            inMobiBanner.scheduleRefresh$media_release();
        }

        @Override // com.inmobi.media.C3433g2, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            info.getClass();
            super.onAdFetchSuccessful(info);
            InMobiBanner inMobiBanner = a().get();
            if (inMobiBanner != null) {
                try {
                    C3485i2 mAdManager = inMobiBanner.getMAdManager();
                    if (mAdManager != null) {
                        mAdManager.a(inMobiBanner);
                    }
                    C3485i2 mAdManager2 = inMobiBanner.getMAdManager();
                    if (mAdManager2 != null) {
                        mAdManager2.o();
                    }
                } catch (IllegalStateException e) {
                    String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
                    access$getTAG$cp.getClass();
                    Xb.a((byte) 1, access$getTAG$cp, e.getMessage());
                    AbstractC3330c2 mPubListener = inMobiBanner.getMPubListener();
                    if (mPubListener != null) {
                        mPubListener.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.audioStatusInternal = Z1.d;
        this.e = new a(this);
        this.g = true;
        this.k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C3293ah c3293ah = new C3293ah();
        this.mPubSettings = c3293ah;
        this.o = new d(this);
        if (!AbstractC3424fj.d()) {
            throw new SdkNotInitializedException("InMobiBanner");
        }
        if (context instanceof Activity) {
            this.m = new WeakReference(context);
        }
        this.mAdManager = new C3485i2();
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", T2.b);
        if (attributeValue != null) {
            long a2 = a(attributeValue);
            if (a2 == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            c3293ah.a = a2;
        }
        Context context2 = getContext();
        context2.getClass();
        a(this, context2);
        C3485i2 c3485i2 = this.mAdManager;
        this.f = c3485i2 != null ? c3485i2.k() : 0;
        this.h = new HandlerC3459h2(this);
        if (attributeValue2 != null) {
            try {
                int length = attributeValue2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.d(attributeValue2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                setRefreshInterval(Integer.parseInt(attributeValue2.subSequence(i, length + 1).toString()));
            } catch (NumberFormatException unused) {
                Xb.a((byte) 1, "InMobiBanner", "Refresh interval value supplied in XML layout is not valid. Falling back to default value.");
            }
        }
    }

    public static final void access$captureStandardBannerSize(InMobiBanner inMobiBanner, int i, int i2) {
        inMobiBanner.getClass();
        if (i <= 0 || i2 <= 0) {
            return;
        }
        inMobiBanner.i = i;
        inMobiBanner.j = i2;
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiBanner";
    }

    public static final Unit e() {
        String str = E1.c;
        if (str == null) {
            str = "";
        }
        LinkedHashMap i = tub.i(new Pair("trigger", str));
        C3839vk c3839vk = C3839vk.a;
        C3839vk.b("BannerSetBannerSizeUsed", i, EnumC3943zk.SDK);
        return Unit.a;
    }

    private final String getFrameSizeString() {
        return fc6.g(this.i, this.j, "x");
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z) {
        C3906y9 c3906y9;
        C3906y9 c3906y92;
        C3906y9 c3906y93;
        C3906y9 c3906y94;
        C3906y9 c3906y95;
        try {
            C3293ah c3293ah = this.mPubSettings;
            c3293ah.getClass();
            str.getClass();
            c3293ah.h = str;
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 == null || !c3485i2.l()) {
                f();
                d();
                Context context = getContext();
                context.getClass();
                a(this, context);
                C3485i2 c3485i22 = this.mAdManager;
                if (c3485i22 != null) {
                    c3485i22.g();
                }
                C3485i2 c3485i23 = this.mAdManager;
                if (c3485i23 != null && (c3906y92 = c3485i23.f) != null) {
                    c3906y92.a("InMobiBanner", "load called - placementType - " + str + " " + this);
                }
                a("load", new jx1(this, publisherCallbacks, z, 3));
                return;
            }
            C3485i2 c3485i24 = this.mAdManager;
            if (c3485i24 != null) {
                c3485i24.g();
            }
            C3485i2 c3485i25 = this.mAdManager;
            if (c3485i25 != null && (c3906y95 = c3485i25.f) != null) {
                c3906y95.a("InMobiBanner", "load called - placementType - " + str + " " + this);
            }
            C3485i2 c3485i26 = this.mAdManager;
            if (c3485i26 != null && (c3906y94 = c3485i26.f) != null) {
                c3906y94.b("InMobiBanner", "load already in progress");
            }
            C3485i2 c3485i27 = this.mAdManager;
            if (c3485i27 != null) {
                c3485i27.b((short) 2169);
            }
            AbstractC3330c2 abstractC3330c2 = this.mPubListener;
            if (abstractC3330c2 != null) {
                abstractC3330c2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
            }
            C3485i2 c3485i28 = this.mAdManager;
            if (c3485i28 != null && (c3906y93 = c3485i28.f) != null) {
                c3906y93.b("InMobiBanner", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
            }
            Xb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
        } catch (Exception e) {
            C3485i2 c3485i29 = this.mAdManager;
            if (c3485i29 != null) {
                c3485i29.a((short) 2172);
            }
            AbstractC3330c2 abstractC3330c22 = this.mPubListener;
            if (abstractC3330c22 != null) {
                abstractC3330c22.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C3485i2 c3485i210 = this.mAdManager;
            if (c3485i210 == null || (c3906y9 = c3485i210.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "Load failed with unexpected error: ", e);
        }
    }

    public final boolean b(String str) {
        C3906y9 c3906y9;
        C3906y9 c3906y92;
        if (c()) {
            return true;
        }
        if (getLayoutParams() == null) {
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 != null && (c3906y92 = c3485i2.f) != null) {
                c3906y92.b("InMobiBanner", fc6.n("The layout params of the banner must be set before calling ", str, " or call setBannerSize(int widthInDp, int heightInDp) before ", str));
            }
            return false;
        }
        if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
            f();
            return true;
        }
        C3485i2 c3485i22 = this.mAdManager;
        if (c3485i22 != null && (c3906y9 = c3485i22.f) != null) {
            wv8.x("The height or width of a Banner ad can't be WRAP_CONTENT or call setBannerSize(int widthInDp, int heightInDp) before ", str, c3906y9, "InMobiBanner");
        }
        return false;
    }

    public final boolean c() {
        return this.i > 0 && this.j > 0;
    }

    public final void d() {
        C3293ah c3293ah = this.mPubSettings;
        C3794u1 a2 = AbstractC3846w1.a(c3293ah.h, c3293ah.d);
        C3293ah c3293ah2 = this.mPubSettings;
        c3293ah2.d = a2.a;
        C3820v1 c3820v1 = a2.b;
        c3293ah2.b = c3820v1 != null ? fc6.g(c3820v1.a, c3820v1.b, "x") : null;
        C3820v1 c3820v12 = a2.b;
        if (c3820v12 != null) {
            updateLayoutParamsForResolvedSize$media_release(c3820v12.a, c3820v12.b);
        }
    }

    public final void destroy() {
        a();
        removeAllViews();
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null) {
            c3485i2.j();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.mPubSettings.e = true;
    }

    public final void f() {
        if (getLayoutParams() == null || c()) {
            return;
        }
        int b = N3.b(getLayoutParams().width / R5.b());
        int b2 = N3.b(getLayoutParams().height / R5.b());
        if (b <= 0 || b2 <= 0) {
            return;
        }
        this.i = b;
        this.j = b2;
    }

    @NotNull
    /* renamed from: getAudioStatusInternal$media_release, reason: from getter */
    public final Z1 getAudioStatusInternal() {
        return this.audioStatusInternal;
    }

    @Nullable
    /* renamed from: getMAdManager$media_release, reason: from getter */
    public final C3485i2 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* renamed from: getMAudioListener$media_release, reason: from getter */
    public final AudioListener getMAudioListener() {
        return this.mAudioListener;
    }

    @Nullable
    /* renamed from: getMPubListener$media_release, reason: from getter */
    public final AbstractC3330c2 getMPubListener() {
        return this.mPubListener;
    }

    @NotNull
    /* renamed from: getMPubSettings$media_release, reason: from getter */
    public final C3293ah getMPubSettings() {
        return this.mPubSettings;
    }

    public final long getPlacementId() {
        return this.mPubSettings.a;
    }

    @NotNull
    public final PreloadManager getPreloadManager() {
        return this.o;
    }

    @wx4
    public final void getSignals() {
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null) {
            c3485i2.a(this.e);
        }
    }

    public final boolean isAudioAd() {
        C3381e2 c3381e2;
        Ad b;
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 == null || (c3381e2 = c3485i2.m) == null || (b = c3381e2.b(0)) == null) {
            return false;
        }
        MetaInfo metaInfo = b.getMetaInfo();
        return Intrinsics.c(metaInfo != null ? metaInfo.getCreativeType() : null, "audio");
    }

    public final void load(@Nullable byte[] response) {
        b();
        C3293ah c3293ah = this.mPubSettings;
        c3293ah.getClass();
        c3293ah.h = "AB";
        f();
        d();
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 == null || c3485i2.k == null || c3485i2.l == null || c3485i2.a == 0) {
            Context context = getContext();
            context.getClass();
            a(this, context);
        }
        C3485i2 c3485i22 = this.mAdManager;
        if (c3485i22 != null) {
            c3485i22.g();
        }
        a("load(byte[])", new ij8(16, this, response));
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String str = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Xb.a((byte) 1, "InMobi", "loss notification failed to trigger");
            Unit unit = Unit.a;
        }
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null) {
            if (c3485i2.f() != null) {
                AbstractC3587m1 f = c3485i2.f();
                str = f != null ? f.a(lossReason, auctionPrice) : null;
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            Xb.a((byte) 1, "InMobi", str);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String str = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Xb.a((byte) 1, "InMobi", "win notification failed to trigger");
            Unit unit = Unit.a;
        }
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null) {
            if (c3485i2.f() != null) {
                AbstractC3587m1 f = c3485i2.f();
                str = f != null ? f.a(minBidToWin) : null;
            }
            if (str == null || str.length() <= 0) {
                return;
            }
            Xb.a((byte) 1, "InMobi", str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C3906y9 c3906y9;
        try {
            super.onAttachedToWindow();
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 != null) {
                c3485i2.n();
            }
            f();
            if (!c()) {
                setupBannerSizeObserver();
            }
            scheduleRefresh$media_release();
            if (Build.VERSION.SDK_INT >= 29) {
                T5 t5 = R5.a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                rootWindowInsets.getClass();
                R5.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 == null || (c3906y9 = c3485i22.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "InMobiBanner#onAttachedToWindow() handler threw unexpected error: ", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C3906y9 c3906y9;
        try {
            super.onDetachedFromWindow();
            a();
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 != null) {
                c3485i2.t();
            }
        } catch (Exception e) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 == null || (c3906y9 = c3485i22.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "InMobiBanner.onDetachedFromWindow() handler threw unexpected error: ", e);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        C3906y9 c3906y9;
        changedView.getClass();
        try {
            super.onVisibilityChanged(changedView, visibility);
            if (visibility == 0) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 == null || (c3906y9 = c3485i2.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "InMobiBanner$1.onVisibilityChanged() handler threw unexpected error: ", e);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        C3906y9 c3906y9;
        try {
            super.onWindowFocusChanged(hasWindowFocus);
            if (hasWindowFocus) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 == null || (c3906y9 = c3485i2.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "InMobiBanner$1.onWindowFocusChanged() handler threw unexpected error: ", e);
        }
    }

    public final void pause() {
        C3906y9 c3906y9;
        C3485i2 c3485i2;
        try {
            if (this.m != null || (c3485i2 = this.mAdManager) == null) {
                return;
            }
            c3485i2.m();
        } catch (Exception e) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 == null || (c3906y9 = c3485i22.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "SDK encountered unexpected error in pausing ad; ", e);
        }
    }

    public final void refreshBanner$media_release() {
        a((PublisherCallbacks) this.e, "NonAB", true);
    }

    public final void resume() {
        C3906y9 c3906y9;
        C3485i2 c3485i2;
        try {
            if (this.m != null || (c3485i2 = this.mAdManager) == null) {
                return;
            }
            c3485i2.p();
        } catch (Exception e) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 == null || (c3906y9 = c3485i22.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "SDK encountered unexpected error in resuming ad; ", e);
        }
    }

    public final void scheduleRefresh$media_release() {
        HandlerC3459h2 handlerC3459h2;
        if (isShown() && hasWindowFocus()) {
            HandlerC3459h2 handlerC3459h22 = this.h;
            if (handlerC3459h22 != null) {
                handlerC3459h22.removeMessages(1);
            }
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 == null || !c3485i2.i() || !this.g || (handlerC3459h2 = this.h) == null) {
                return;
            }
            handlerC3459h2.sendEmptyMessageDelayed(1, this.f * 1000);
        }
    }

    public final void setAnimationType(@NotNull AnimationType animationType) {
        animationType.getClass();
        this.k = animationType;
    }

    public final void setAudioListener(@NotNull AudioListener audioListener) {
        audioListener.getClass();
        this.mAudioListener = audioListener;
        Z1 z1 = this.audioStatusInternal;
        if (z1 == Z1.d || audioListener == null) {
            return;
        }
        Z1.b.getClass();
        z1.getClass();
        int ordinal = z1.ordinal();
        audioListener.onAudioStatusChanged(this, ordinal != 1 ? ordinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
    }

    public final void setAudioStatusInternal$media_release(@NotNull Z1 z1) {
        z1.getClass();
        this.audioStatusInternal = z1;
    }

    @wx4
    public final void setBannerSize(int widthInDp, int heightInDp) {
        if (widthInDp > 0 && heightInDp > 0) {
            this.i = widthInDp;
            this.j = heightInDp;
        }
        us9 us9Var = new us9(1);
        String str = E1.c;
        Pf pf = Qf.a;
        if (pf == null) {
            pf = Qf.a(str);
        }
        if (pf.b.contains("BannerSetBannerSizeUsed")) {
            return;
        }
        us9Var.invoke();
        pf.b.add("BannerSetBannerSizeUsed");
        Qf.a = pf;
        Qa a2 = Qf.a();
        if (a2 != null) {
            String str2 = pf.a;
            ConcurrentHashMap concurrentHashMap = Qa.b;
            a2.a("app_version", str2, false);
        }
        Qa a3 = Qf.a();
        if (a3 != null) {
            a3.b(pf.b);
        }
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        contentUrl.getClass();
        this.mPubSettings.f = contentUrl;
    }

    public final void setEnableAutoRefresh(boolean enabled) {
        C3906y9 c3906y9;
        try {
            if (this.g == enabled) {
                return;
            }
            this.g = enabled;
            if (enabled) {
                scheduleRefresh$media_release();
            } else {
                a();
            }
        } catch (Exception e) {
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 == null || (c3906y9 = c3485i2.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "Setting up auto-refresh failed with unexpected error: ", e);
        }
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
        this.mPubSettings.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.mPubSettings.c = keywords;
    }

    public final void setListener(@NotNull BannerAdEventListener listener) {
        listener.getClass();
        this.mPubListener = new C3356d2(listener);
    }

    public final void setMAdManager$media_release(@Nullable C3485i2 c3485i2) {
        this.mAdManager = c3485i2;
    }

    public final void setMAudioListener$media_release(@Nullable AudioListener audioListener) {
        this.mAudioListener = audioListener;
    }

    public final void setMPubListener$media_release(@Nullable AbstractC3330c2 abstractC3330c2) {
        this.mPubListener = abstractC3330c2;
    }

    public final void setRefreshInterval(int refreshInterval) {
        C3906y9 c3906y9;
        try {
            C3293ah c3293ah = this.mPubSettings;
            c3293ah.getClass();
            c3293ah.h = "NonAB";
            Context context = getContext();
            context.getClass();
            a(this, context);
            C3485i2 c3485i2 = this.mAdManager;
            this.f = c3485i2 != null ? c3485i2.a(refreshInterval, this.f) : 0;
        } catch (Exception e) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 == null || (c3906y9 = c3485i22.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "Setting refresh interval failed with unexpected error: ", e);
        }
    }

    public final void setWatermarkData(@NotNull WatermarkData watermarkData) {
        watermarkData.getClass();
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null) {
            c3485i2.a(watermarkData);
        }
    }

    public final void setupBannerSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3414f9(this));
    }

    public final void swapAdUnitsAndDisplayAd$media_release() {
        C3906y9 c3906y9;
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null) {
            c3485i2.s();
        }
        try {
            Animation a2 = b.a(this.k, getWidth(), getHeight());
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 != null) {
                c3485i22.b(this);
            }
            if (a2 != null) {
                startAnimation(a2);
            }
        } catch (Exception e) {
            C3485i2 c3485i23 = this.mAdManager;
            if (c3485i23 == null || (c3906y9 = c3485i23.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "Unexpected error while displaying Banner Ad : ", e);
        }
    }

    public final void updateLayoutParamsForResolvedSize$media_release(int widthInDp, int heightInDp) {
        int b = (int) (R5.b() * widthInDp);
        int b2 = (int) (R5.b() * heightInDp);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = b;
            layoutParams.height = b2;
        } else {
            layoutParams = new RelativeLayout.LayoutParams(b, b2);
        }
        setLayoutParams(layoutParams);
        requestLayout();
    }

    @wx4
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void load() {
        b();
        a((PublisherCallbacks) this.e, "NonAB", false);
    }

    public final void load(@NotNull Context context) {
        context.getClass();
        b();
        this.m = context instanceof Activity ? new WeakReference(context) : null;
        a((PublisherCallbacks) this.e, "NonAB", false);
    }

    public final boolean b() {
        C3906y9 c3906y9;
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 == null || (c3906y9 = c3485i2.f) == null) {
            return true;
        }
        c3906y9.c("InMobiBanner", "checkStateAndLogError");
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiBanner(@NotNull Context context, long j) {
        super(context);
        context.getClass();
        this.audioStatusInternal = Z1.d;
        this.e = new a(this);
        this.g = true;
        this.k = AnimationType.ROTATE_HORIZONTAL_AXIS;
        C3293ah c3293ah = new C3293ah();
        this.mPubSettings = c3293ah;
        this.o = new d(this);
        if (AbstractC3424fj.d()) {
            if (context instanceof Activity) {
                this.m = new WeakReference(context);
            }
            this.mAdManager = new C3485i2();
            c3293ah.a = j;
            a(this, context);
            C3485i2 c3485i2 = this.mAdManager;
            this.f = c3485i2 != null ? c3485i2.k() : 0;
            this.h = new HandlerC3459h2(this);
            return;
        }
        throw new SdkNotInitializedException("InMobiBanner");
    }

    public static final Unit a(InMobiBanner inMobiBanner, byte[] bArr) {
        C3906y9 c3906y9;
        C3485i2 c3485i2 = inMobiBanner.mAdManager;
        if (c3485i2 != null && (c3906y9 = c3485i2.f) != null) {
            c3906y9.c("InMobiBanner", "load with response");
        }
        C3485i2 c3485i22 = inMobiBanner.mAdManager;
        if (c3485i22 != null) {
            c3485i22.a(bArr, inMobiBanner.e);
        }
        return Unit.a;
    }

    public static final Unit a(InMobiBanner inMobiBanner, PublisherCallbacks publisherCallbacks, boolean z) {
        C3485i2 c3485i2;
        inMobiBanner.a();
        long j = inMobiBanner.l;
        if (j == 0 || (c3485i2 = inMobiBanner.mAdManager) == null || c3485i2.a(j)) {
            inMobiBanner.l = SystemClock.elapsedRealtime();
            C3485i2 c3485i22 = inMobiBanner.mAdManager;
            if (c3485i22 != null) {
                c3485i22.a(publisherCallbacks, inMobiBanner.getFrameSizeString(), z);
            }
        }
        return Unit.a;
    }

    public final void a(String str, Function0 function0) {
        C3906y9 c3906y9;
        C3906y9 c3906y92;
        C3485i2 c3485i2 = this.mAdManager;
        if (c3485i2 != null && (c3906y92 = c3485i2.f) != null) {
            c3906y92.c("InMobiBanner", "validateSizeAndLoad");
        }
        if (!b(str)) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 != null && (c3906y9 = c3485i22.f) != null) {
                c3906y9.b("InMobiBanner", "invalid banner size. fail.");
            }
            C3485i2 c3485i23 = this.mAdManager;
            if (c3485i23 != null) {
                c3485i23.a((short) 2170);
            }
            AbstractC3330c2 abstractC3330c2 = this.mPubListener;
            if (abstractC3330c2 != null) {
                abstractC3330c2.a(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
                return;
            }
            return;
        }
        if (!c()) {
            ((Handler) AbstractC3632nk.a.getValue()).postDelayed(new yq5(12, this, function0), 200L);
        } else {
            function0.invoke();
        }
    }

    public static final void a(InMobiBanner inMobiBanner, Function0 function0) {
        C3906y9 c3906y9;
        C3906y9 c3906y92;
        try {
            if (inMobiBanner.c()) {
                function0.invoke();
                return;
            }
            C3485i2 c3485i2 = inMobiBanner.mAdManager;
            if (c3485i2 != null && (c3906y92 = c3485i2.f) != null) {
                c3906y92.b("InMobiBanner", "The height or width of the banner can not be determined");
            }
            C3485i2 c3485i22 = inMobiBanner.mAdManager;
            if (c3485i22 != null) {
                c3485i22.a((short) 2171);
            }
            AbstractC3330c2 abstractC3330c2 = inMobiBanner.mPubListener;
            if (abstractC3330c2 != null) {
                abstractC3330c2.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR));
            }
        } catch (Exception e) {
            C3485i2 c3485i23 = inMobiBanner.mAdManager;
            if (c3485i23 != null) {
                c3485i23.a((short) 2172);
            }
            AbstractC3330c2 abstractC3330c22 = inMobiBanner.mPubListener;
            if (abstractC3330c22 != null) {
                abstractC3330c22.a(inMobiBanner, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
            C3485i2 c3485i24 = inMobiBanner.mAdManager;
            if (c3485i24 == null || (c3906y9 = c3485i24.f) == null) {
                return;
            }
            c3906y9.a("InMobiBanner", "InMobiBanner$4.run() threw unexpected error: ", e);
        }
    }

    public static void a(InMobiBanner inMobiBanner, Context context) {
        int i;
        C3485i2 c3485i2 = inMobiBanner.mAdManager;
        if (c3485i2 != null) {
            c3485i2.a(context, inMobiBanner.mPubSettings, inMobiBanner.getFrameSizeString());
        }
        C3485i2 c3485i22 = inMobiBanner.mAdManager;
        if (c3485i22 != null) {
            int i2 = inMobiBanner.f;
            i = c3485i22.a(i2, i2);
        } else {
            i = 0;
        }
        inMobiBanner.f = i;
    }

    public final void a() {
        HandlerC3459h2 handlerC3459h2 = this.h;
        if (handlerC3459h2 != null) {
            handlerC3459h2.removeMessages(1);
        }
    }

    public final long a(String str) {
        C3906y9 c3906y9;
        C3906y9 c3906y92;
        StringBuilder sb;
        C3906y9 c3906y93;
        try {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            sb = new StringBuilder(str.subSequence(i, length + 1).toString());
        } catch (NumberFormatException unused) {
            C3485i2 c3485i2 = this.mAdManager;
            if (c3485i2 != null && (c3906y92 = c3485i2.f) != null) {
                wv8.x("Invalid Placement id: ", str, c3906y92, "InMobiBanner");
            }
        } catch (StringIndexOutOfBoundsException unused2) {
            C3485i2 c3485i22 = this.mAdManager;
            if (c3485i22 != null && (c3906y9 = c3485i22.f) != null) {
                wv8.x("Invalid Placement id: ", str, c3906y9, "InMobiBanner");
            }
        }
        if ("plid-".equalsIgnoreCase(sb.substring(0, 5))) {
            String substring = sb.substring(5, sb.length());
            substring.getClass();
            int length2 = substring.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length2) {
                boolean z4 = Intrinsics.d(substring.charAt(!z3 ? i2 : length2), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    }
                    length2--;
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            return Long.parseLong(substring.subSequence(i2, length2 + 1).toString());
        }
        C3485i2 c3485i23 = this.mAdManager;
        if (c3485i23 != null && (c3906y93 = c3485i23.f) != null) {
            c3906y93.b("InMobiBanner", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }
}
