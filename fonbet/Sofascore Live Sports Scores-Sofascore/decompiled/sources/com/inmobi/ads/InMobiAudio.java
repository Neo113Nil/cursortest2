package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.AbstractC3424fj;
import com.inmobi.media.AbstractC3435g4;
import com.inmobi.media.AbstractC3450gj;
import com.inmobi.media.AbstractC3632nk;
import com.inmobi.media.C3278a2;
import com.inmobi.media.C3293ah;
import com.inmobi.media.C3694q4;
import com.inmobi.media.F5;
import com.inmobi.media.N3;
import com.inmobi.media.R1;
import com.inmobi.media.R5;
import com.inmobi.media.T5;
import com.inmobi.media.V1;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC3337c9;
import com.inmobi.media.Xb;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.fc6;
import defpackage.yp8;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "load", "()V", "show", "", "", HandleInvocationsFromAdViewer.KEY_EXTRAS, "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "listener", "setListener", "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/a2;", "b", "Lcom/inmobi/media/a2;", "getMAdManager$media_release", "()Lcom/inmobi/media/a2;", "setMAdManager$media_release", "(Lcom/inmobi/media/a2;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiAudio extends RelativeLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* renamed from: b, reason: from kotlin metadata */
    public C3278a2 mAdManager;
    public final WeakReference c;
    public final C3293ah d;
    public long e;
    public int f;
    public int g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/V1;", "Lcom/inmobi/ads/InMobiAudio;", "audio", "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends V1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiAudio inMobiAudio) {
            super(inMobiAudio);
            inMobiAudio.getClass();
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            status.getClass();
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
                return;
            }
            mPubListener.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.V1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            info.getClass();
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                C3278a2 mAdManager = inMobiAudio.getMAdManager();
                if (mAdManager != null) {
                    mAdManager.k();
                }
            } catch (IllegalStateException e) {
                Xb.a((byte) 1, "InMobiAudio", e.getMessage());
                AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        a aVar = new a(this);
        C3293ah c3293ah = new C3293ah();
        this.d = c3293ah;
        if (!AbstractC3424fj.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.c = new WeakReference(context);
        }
        this.mAdManager = new C3278a2(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long a2 = a(attributeValue);
            if (a2 == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            c3293ah.a = a2;
        }
        Context context2 = getContext();
        context2.getClass();
        C3278a2 c3278a2 = this.mAdManager;
        if (c3278a2 != null) {
            c3278a2.a(context2, c3293ah, getFrameSizeString());
        }
    }

    public static long a(String str) {
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
            StringBuilder sb = new StringBuilder(str.subSequence(i, length + 1).toString());
            if (!"plid-".equalsIgnoreCase(sb.substring(0, 5))) {
                Xb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
                Xb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
                return Long.MIN_VALUE;
            }
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
        } catch (NumberFormatException unused) {
            Xb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Xb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Xb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Xb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f > 0 && inMobiAudio.g > 0;
    }

    private final String getFrameSizeString() {
        return fc6.g(this.f, this.g, "x");
    }

    public final void b() {
        C3278a2 c3278a2;
        R1 r1;
        try {
            C3694q4 c3694q4 = AbstractC3435g4.a;
            if (!((AdConfig) c3694q4.a(AdConfig.class)).getAudio().getIsAudioEnabled()) {
                C3278a2 c3278a22 = this.mAdManager;
                if (c3278a22 != null) {
                    c3278a22.a((short) 107);
                }
                C3278a2 c3278a23 = this.mAdManager;
                if (c3278a23 != null) {
                    c3278a23.a(c3278a23.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Xb.a((byte) 1, "InMobi", "");
                return;
            }
            C3293ah c3293ah = this.d;
            c3293ah.getClass();
            c3293ah.h = "NonAB";
            Context context = getContext();
            context.getClass();
            C3278a2 c3278a24 = this.mAdManager;
            if (c3278a24 != null) {
                c3278a24.a(context, this.d, getFrameSizeString());
            }
            C3278a2 c3278a25 = this.mAdManager;
            if (c3278a25 != null && (r1 = c3278a25.j) != null && r1.b == 7) {
                C3278a2 c3278a26 = this.mAdManager;
                if (c3278a26 != null) {
                    c3278a26.b((short) 15);
                }
                AudioAdEventListener audioAdEventListener = this.mPubListener;
                if (audioAdEventListener != null) {
                    audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                Xb.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            if (!a()) {
                C3278a2 c3278a27 = this.mAdManager;
                if (c3278a27 != null) {
                    c3278a27.a((short) 108);
                }
                C3278a2 c3278a28 = this.mAdManager;
                if (c3278a28 != null) {
                    c3278a28.a(c3278a28.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            if (((AdConfig) c3694q4.a(AdConfig.class)).getAudio().getMinDeviceVolume() > F5.a.a(AbstractC3424fj.a, AbstractC3424fj.f)) {
                C3278a2 c3278a29 = this.mAdManager;
                if (c3278a29 != null) {
                    c3278a29.a((short) 106);
                }
                C3278a2 c3278a210 = this.mAdManager;
                if (c3278a210 != null) {
                    c3278a210.a(c3278a210.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (this.f <= 0 || this.g <= 0) {
                ((Handler) AbstractC3632nk.a.getValue()).postDelayed(new yp8(this, 3), 200L);
                return;
            }
            long j = this.e;
            if (j == 0 || (c3278a2 = this.mAdManager) == null || c3278a2.a(j)) {
                this.e = SystemClock.elapsedRealtime();
                C3278a2 c3278a211 = this.mAdManager;
                if (c3278a211 != null) {
                    c3278a211.b(getFrameSizeString());
                }
            }
        } catch (Exception e) {
            C3278a2 c3278a212 = this.mAdManager;
            if (c3278a212 != null) {
                c3278a212.a((short) 105);
            }
            Xb.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void destroy() {
        removeAllViews();
        C3278a2 c3278a2 = this.mAdManager;
        if (c3278a2 != null) {
            c3278a2.h();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    @Nullable
    /* renamed from: getMAdManager$media_release, reason: from getter */
    public final C3278a2 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    public final void load() {
        C3278a2 c3278a2 = this.mAdManager;
        if (c3278a2 != null) {
            c3278a2.g();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            C3278a2 c3278a2 = this.mAdManager;
            if (c3278a2 != null) {
                c3278a2.j();
            }
            if (getLayoutParams() != null) {
                this.f = N3.b(getLayoutParams().width / R5.b());
                this.g = N3.b(getLayoutParams().height / R5.b());
            }
            if (this.f <= 0 || this.g <= 0) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                T5 t5 = R5.a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                rootWindowInsets.getClass();
                R5.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            C3278a2 c3278a2 = this.mAdManager;
            if (c3278a2 != null) {
                c3278a2.p();
            }
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e.getMessage();
        }
    }

    public final void pause() {
        C3278a2 c3278a2;
        try {
            if (this.c != null || (c3278a2 = this.mAdManager) == null) {
                return;
            }
            c3278a2.i();
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void resume() {
        C3278a2 c3278a2;
        try {
            if (this.c != null || (c3278a2 = this.mAdManager) == null) {
                return;
            }
            c3278a2.l();
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void setAudioSize(int widthInDp, int heightInDp) {
        this.f = widthInDp;
        this.g = heightInDp;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        contentUrl.getClass();
        this.d.f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                AbstractC3450gj.b = str;
            }
            String str2 = extras.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                AbstractC3450gj.a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.d.c = keywords;
    }

    public final void setListener(@NotNull AudioAdEventListener listener) {
        listener.getClass();
        this.mPubListener = listener;
    }

    public final void setMAdManager$media_release(@Nullable C3278a2 c3278a2) {
        this.mAdManager = c3278a2;
    }

    public final void setMPubListener$media_release(@Nullable AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3337c9(this));
    }

    public final void show() {
        C3278a2 c3278a2 = this.mAdManager;
        if (c3278a2 != null) {
            c3278a2.n();
        }
        C3278a2 c3278a22 = this.mAdManager;
        if (c3278a22 != null) {
            c3278a22.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, long j) {
        super(context);
        context.getClass();
        a aVar = new a(this);
        C3293ah c3293ah = new C3293ah();
        this.d = c3293ah;
        if (AbstractC3424fj.d()) {
            if (context instanceof Activity) {
                this.c = new WeakReference(context);
            }
            C3278a2 c3278a2 = new C3278a2(aVar);
            this.mAdManager = c3278a2;
            c3293ah.a = j;
            c3278a2.a(context, c3293ah, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        C3278a2 c3278a2;
        try {
            if (inMobiAudio.f > 0 && inMobiAudio.g > 0) {
                long j = inMobiAudio.e;
                if (j == 0 || (c3278a2 = inMobiAudio.mAdManager) == null || c3278a2.a(j)) {
                    inMobiAudio.e = SystemClock.elapsedRealtime();
                    C3278a2 c3278a22 = inMobiAudio.mAdManager;
                    if (c3278a22 != null) {
                        c3278a22.b(inMobiAudio.getFrameSizeString());
                        return;
                    }
                    return;
                }
                return;
            }
            Xb.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            C3278a2 c3278a23 = inMobiAudio.mAdManager;
            if (c3278a23 != null) {
                c3278a23.a((short) 108);
            }
            C3278a2 c3278a24 = inMobiAudio.mAdManager;
            if (c3278a24 != null) {
                c3278a24.a(c3278a24.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e) {
            C3278a2 c3278a25 = inMobiAudio.mAdManager;
            if (c3278a25 != null) {
                c3278a25.a((short) 105);
            }
            Xb.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e.getMessage();
        }
    }

    public final boolean a() {
        if (this.f <= 0 || this.g <= 0) {
            if (getLayoutParams() == null) {
                Xb.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
                if (getLayoutParams() != null) {
                    this.f = N3.b(getLayoutParams().width / R5.b());
                    this.g = N3.b(getLayoutParams().height / R5.b());
                }
            } else {
                Xb.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
        }
        return true;
    }
}
