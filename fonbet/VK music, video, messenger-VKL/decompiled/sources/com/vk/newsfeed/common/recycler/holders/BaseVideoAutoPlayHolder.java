package com.vk.newsfeed.common.recycler.holders;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.ad.BaseAdsDataProvider;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.log.L;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.newsfeed.common.recycler.holders.attachments.BaseVideoAutoPlayHolderUiDtoBindDelegate;
import com.vk.newsfeed.common.recycler.holders.attachments.BaseVideoAutoPlayHolderUiDtoBindDelegate.MyTargetAdsDataProvider;
import com.vk.newsfeed.common.recycler.holders.attachments.ShittyAdsDtoProvider;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.toggle.features.FeedFeatures;
import com.vk.video.ui.slider.impl.VideoSliderAutoPlayHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.HashSet;
import java.util.List;
import one.video.transform.TransformController;
import xsna.a6n0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d3b0;
import xsna.djs0;
import xsna.dnt0;
import xsna.e3m;
import xsna.e6o;
import xsna.efd;
import xsna.enj;
import xsna.ent0;
import xsna.epx;
import xsna.f4s0;
import xsna.fh5;
import xsna.fi;
import xsna.fnj;
import xsna.fq6;
import xsna.fxc0;
import xsna.fxj0;
import xsna.g4s0;
import xsna.g620;
import xsna.gjx;
import xsna.h4s0;
import xsna.hd60;
import xsna.hq6;
import xsna.iah0;
import xsna.joj0;
import xsna.jq6;
import xsna.kbj0;
import xsna.ktc0;
import xsna.lhz0;
import xsna.nr4;
import xsna.nr50;
import xsna.o25;
import xsna.ol60;
import xsna.pzl;
import xsna.q8d;
import xsna.qcy;
import xsna.qr50;
import xsna.qrq;
import xsna.rm80;
import xsna.ry0;
import xsna.s0t0;
import xsna.s3q0;
import xsna.s6o;
import xsna.s980;
import xsna.sj0;
import xsna.sps0;
import xsna.te1;
import xsna.tf3;
import xsna.tl0;
import xsna.toz;
import xsna.tps0;
import xsna.u1c0;
import xsna.uoj0;
import xsna.uvt0;
import xsna.wgt0;
import xsna.wjz0;
import xsna.wwr0;
import xsna.xcs0;
import xsna.xuu0;
import xsna.yg5;
import xsna.yix;
import xsna.zg;

/* loaded from: classes4.dex */
public abstract class BaseVideoAutoPlayHolder<T extends ol60, N extends VideoAttachment> extends fi<T, N> implements View.OnClickListener, ent0, fh5.b {
    public final com.vk.libvideo.autoplay.b K;
    public final fh5 L;

    @Nullable
    public final DurationView M;

    @Nullable
    public final InteractiveDurationView N;

    @Nullable
    public final NoStyleSubtitleView O;
    public final View P;

    @Nullable
    public final xuu0 Q;

    @Nullable
    public final View R;

    @Nullable
    public final xcs0 S;
    public final FrescoImageView T;

    @Nullable
    public final ProgressBar U;
    public final VideoErrorView V;
    public final RatioFrameLayout W;
    public final VideoTextureView X;
    public final LinearLayout Y;
    public final View Z;
    public final ImageView a0;

    @Nullable
    public final View b0;
    public final View c0;

    @Nullable
    public final ActionLinkView d0;

    @Nullable
    public final s0t0 e0;

    @Nullable
    public final q8d f0;

    @Nullable
    public final ClipEndOverlayView g0;

    @Nullable
    public yg5 h0;
    public int i0;
    public final a j0;

    @Nullable
    public final fq6 k0;

    @NonNull
    public final tps0 l0;

    @Nullable
    public TransformController.ScaleType m0;
    public final int n0;

    @NonNull
    public final sps0 o0;
    public Long p0;
    public BaseVideoAutoPlayHolderUiDtoBindDelegate q0;

    @NonNull
    public final yix r0;

    public class a implements sj0 {
        public int b;

        @Override // xsna.sj0
        public final int getAdapterPosition() {
            return this.b;
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            a = iArr;
            try {
                iArr[TransformController.ScaleType.CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TransformController.ScaleType.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BaseVideoAutoPlayHolder(int i, ViewGroup viewGroup, @NonNull tps0.b bVar) {
        this(tf3.b(viewGroup, i, viewGroup, false), viewGroup, bVar, null);
    }

    public static jq6 j7(ol60 ol60Var) {
        if (ol60Var instanceof efd) {
            return ((efd) ol60Var).j;
        }
        if (ol60Var instanceof g4s0) {
            return ((g4s0) ol60Var).j;
        }
        if (ol60Var instanceof f4s0) {
            return ((f4s0) ol60Var).j;
        }
        if (ol60Var instanceof h4s0) {
            return ((h4s0) ol60Var).j;
        }
        if (ol60Var instanceof a6n0) {
            return ((a6n0) ol60Var).j;
        }
        if (ol60Var instanceof nr50) {
            return ((nr50) ol60Var).q;
        }
        if (ol60Var instanceof qr50) {
            return ((qr50) ol60Var).j;
        }
        return null;
    }

    public void E7(Activity activity) {
        this.L.p(activity, this.o0.d, null, null, null, false, null);
    }

    public void F7(View view, int i, boolean z) {
        boolean z2;
        yg5 yg5Var;
        Context context = view.getContext();
        while (true) {
            z2 = context instanceof Activity;
            if (z2 || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        VideoAttachment videoAttachment = (VideoAttachment) this.E;
        if ("fave".equals(this.u)) {
            qrq.a(t6(), videoAttachment);
        }
        if (z2 && this.I && (yg5Var = this.h0) != null && (yg5Var.V() || this.h0.v() || g620.f().d(this.h0.A()))) {
            s0t0 s0t0Var = this.e0;
            if (s0t0Var != null) {
                s0t0Var.a(this.L);
            } else {
                E7((Activity) context);
            }
        } else {
            ShitAttachment shitAttachment = videoAttachment.h;
            u1c0 J0 = J0();
            hd60.a().A0(context, r7(), videoAttachment.l, shitAttachment == null ? null : new ShittyAdsDataProvider(shitAttachment, J0 != null ? J0.k : -1), videoAttachment.m, videoAttachment.o, false, null);
        }
        PostInteract postInteract = videoAttachment.g;
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.video_start);
        }
    }

    public void H7() {
        LinearLayout linearLayout = this.Y;
        if (linearLayout == null || this.M == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        boolean v = this.h0.v();
        boolean z0 = this.h0.A().z0();
        if (this.o0.b || g620.f().d(this.h0.A())) {
            linearLayout.setVisibility(8);
            return;
        }
        if (!v || z0) {
            linearLayout.setVisibility(0);
            layoutParams.gravity = 8388693;
            linearLayout.setLayoutParams(layoutParams);
        } else {
            linearLayout.setVisibility(0);
            layoutParams.gravity = 8388659;
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // xsna.io2
    public final boolean M() {
        return this.h0.p0();
    }

    @Override // xsna.qi6
    public void Q6(@NonNull s6o s6oVar) {
        super.Q6(s6oVar);
        t7();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eq6, xsna.rp6
    public final void R6(@NonNull T t) {
        com.vk.libvideo.autoplay.a aVar;
        fh5 fh5Var;
        View.OnClickListener onClickListener;
        String str;
        BaseAdsDataProvider baseAdsDataProvider;
        String str2;
        lhz0 lhz0Var;
        String str3;
        com.vk.libvideo.autoplay.a aVar2;
        lhz0 lhz0Var2;
        String str4;
        jq6 j7 = j7(t);
        if (j7 != null) {
            VideoFile videoFile = j7.b;
            VideoAttachment videoAttachment = j7.a;
            this.E = videoAttachment;
            this.j0.b = getBindingAdapterPosition();
            if (this.q0 == null) {
                this.q0 = new BaseVideoAutoPlayHolderUiDtoBindDelegate(this.L, this.f0, this.U, this.T, this.W, this.S, this.K);
            }
            BaseVideoAutoPlayHolderUiDtoBindDelegate baseVideoAutoPlayHolderUiDtoBindDelegate = this.q0;
            baseVideoAutoPlayHolderUiDtoBindDelegate.getClass();
            ?? r5 = baseVideoAutoPlayHolderUiDtoBindDelegate.h;
            com.vk.libvideo.autoplay.b bVar = baseVideoAutoPlayHolderUiDtoBindDelegate.g;
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5 e = bVar.e(videoFile, null);
            videoAttachment.Kb(e.V());
            e.Q(j7.q);
            this.h0 = e;
            u1c0 J0 = J0();
            com.vk.libvideo.autoplay.a k7 = k7();
            String str5 = this.v;
            View.OnClickListener o7 = o7();
            hq6 hq6Var = t instanceof qr50 ? new hq6(this, t) : null;
            xcs0 xcs0Var = baseVideoAutoPlayHolderUiDtoBindDelegate.f;
            fh5 fh5Var2 = baseVideoAutoPlayHolderUiDtoBindDelegate.a;
            ShitAttachment shitAttachment = j7.c;
            ol60 ol60Var = J0 != null ? J0.h : null;
            int i = J0 != null ? J0.k : -1;
            baseVideoAutoPlayHolderUiDtoBindDelegate.j = hq6Var;
            if (shitAttachment != null) {
                aVar = k7;
                str = str5;
                fh5Var = fh5Var2;
                onClickListener = o7;
                baseAdsDataProvider = new ShittyAdsDtoProvider(shitAttachment, j7.r, j7.s, i, j7.u, j7.t, j7.f);
            } else {
                int i2 = 0;
                if (ol60Var instanceof nr50) {
                    yix yixVar = (yix) r5.getValue();
                    gjx gjxVar = ((nr50) ol60Var).i;
                    baseVideoAutoPlayHolderUiDtoBindDelegate.i = yixVar.b(gjxVar);
                    wjz0 content = gjxVar.getContent();
                    Owner owner = (content == null || (str4 = content.a.f) == null) ? null : new Owner(null, str4, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194301, null);
                    wjz0 content2 = gjxVar.getContent();
                    String str6 = content2 != null ? content2.a.c : null;
                    wjz0 content3 = gjxVar.getContent();
                    String n = content3 != null ? content3.a.n() : null;
                    wjz0 content4 = gjxVar.getContent();
                    if (content4 != null && (lhz0Var2 = content4.g) != null) {
                        i2 = (int) lhz0Var2.a.D;
                    }
                    wjz0 content5 = gjxVar.getContent();
                    String str7 = content5 != null ? content5.a.r : null;
                    wjz0 content6 = gjxVar.getContent();
                    String str8 = content6 != null ? content6.a.h : null;
                    if (str7 != null && str8 != null) {
                        str7 = pzl.b(str7, " · ", str8);
                    } else if (str7 == null) {
                        if (str8 == null) {
                            aVar2 = k7;
                            str7 = null;
                            fh5Var = fh5Var2;
                            onClickListener = o7;
                            String str9 = str6;
                            aVar = aVar2;
                            str = str5;
                            baseAdsDataProvider = baseVideoAutoPlayHolderUiDtoBindDelegate.new MyTargetAdsDataProvider(owner, str9, n, i2, str7, true);
                        } else {
                            str7 = str8;
                        }
                    }
                    aVar2 = k7;
                    fh5Var = fh5Var2;
                    onClickListener = o7;
                    String str92 = str6;
                    aVar = aVar2;
                    str = str5;
                    baseAdsDataProvider = baseVideoAutoPlayHolderUiDtoBindDelegate.new MyTargetAdsDataProvider(owner, str92, n, i2, str7, true);
                } else {
                    aVar = k7;
                    fh5Var = fh5Var2;
                    onClickListener = o7;
                    if (ol60Var instanceof qr50) {
                        yix yixVar2 = (yix) r5.getValue();
                        gjx gjxVar2 = ((qr50) ol60Var).h;
                        baseVideoAutoPlayHolderUiDtoBindDelegate.i = yixVar2.b(gjxVar2);
                        wjz0 content7 = gjxVar2.getContent();
                        Owner owner2 = (content7 == null || (str3 = content7.a.f) == null) ? null : new Owner(null, str3, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194301, null);
                        wjz0 content8 = gjxVar2.getContent();
                        String str10 = content8 != null ? content8.a.c : null;
                        wjz0 content9 = gjxVar2.getContent();
                        String n2 = content9 != null ? content9.a.n() : null;
                        wjz0 content10 = gjxVar2.getContent();
                        if (content10 != null && (lhz0Var = content10.g) != null) {
                            i2 = (int) lhz0Var.a.D;
                        }
                        wjz0 content11 = gjxVar2.getContent();
                        String str11 = content11 != null ? content11.a.r : null;
                        wjz0 content12 = gjxVar2.getContent();
                        String str12 = content12 != null ? content12.a.h : null;
                        if (str11 != null && str12 != null) {
                            str11 = pzl.b(str11, " · ", str12);
                        } else if (str11 == null) {
                            if (str12 == null) {
                                str2 = str5;
                                str11 = null;
                                String str13 = str10;
                                str = str2;
                                baseAdsDataProvider = baseVideoAutoPlayHolderUiDtoBindDelegate.new MyTargetAdsDataProvider(owner2, str13, n2, i2, str11, false);
                            } else {
                                str11 = str12;
                            }
                        }
                        str2 = str5;
                        String str132 = str10;
                        str = str2;
                        baseAdsDataProvider = baseVideoAutoPlayHolderUiDtoBindDelegate.new MyTargetAdsDataProvider(owner2, str132, n2, i2, str11, false);
                    } else {
                        str = str5;
                        baseAdsDataProvider = null;
                    }
                }
            }
            fh5Var.k(videoFile, e, aVar);
            fh5Var.A0 = baseAdsDataProvider;
            fh5Var.w(j7.h);
            fh5Var.l = str;
            fh5Var.s(j7.m);
            q8d q8dVar = baseVideoAutoPlayHolderUiDtoBindDelegate.b;
            if (q8dVar != null) {
                q8dVar.a(videoFile);
            }
            fh5Var.n = j7.n;
            if (xcs0Var != null) {
                uoj0 uoj0Var = fh5Var.H0;
                List<joj0> list = uoj0Var != null ? uoj0Var.c : null;
                ActionLink m1 = videoFile.m1();
                xcs0Var.a(new xcs0.a(epx.f(m1 != null ? m1.c : null, "video"), onClickListener, list, new wwr0(videoFile, onClickListener, xcs0Var.getContext()), new djs0(videoFile)));
            }
            ProgressBar progressBar = baseVideoAutoPlayHolderUiDtoBindDelegate.c;
            if (progressBar != null) {
                progressBar.setMax(j7.o);
            }
            ktc0 d7 = d7();
            FrescoImageView frescoImageView = baseVideoAutoPlayHolderUiDtoBindDelegate.d;
            frescoImageView.setIgnoreTrafficSaverPredicate(new ry0(j7, 8));
            frescoImageView.setRemoteImage((List<? extends fxj0>) j7.p);
            frescoImageView.setPostprocessor(d7);
            h7();
            RatioFrameLayout ratioFrameLayout = baseVideoAutoPlayHolderUiDtoBindDelegate.e;
            ratioFrameLayout.setContentDescription(ratioFrameLayout.getContext().getString(R.string.accessibility_video_title, j7.g));
            H7();
        }
    }

    @Override // xsna.fh5.b
    public void U1(@NonNull fh5.a aVar) {
        H7();
    }

    @Override // xsna.fi
    @NonNull
    public final View f7() {
        return this.X;
    }

    @Override // xsna.fi, xsna.io2
    @NonNull
    @Deprecated
    public final VideoResizer.VideoFitType getContentScaleType() {
        int[] iArr = b.a;
        TransformController.ScaleType scaleType = this.m0;
        if (scaleType == null) {
            scaleType = TransformController.ScaleType.CROP;
        }
        int i = iArr[scaleType.ordinal()];
        if (i == 1) {
            return VideoResizer.VideoFitType.CROP;
        }
        if (i == 2) {
            return VideoResizer.VideoFitType.FIT;
        }
        throw new IncompatibleClassChangeError();
    }

    public final void h7() {
        int[] iArr = b.a;
        TransformController.ScaleType scaleType = this.m0;
        if (scaleType == null) {
            scaleType = TransformController.ScaleType.CROP;
        }
        int i = iArr[scaleType.ordinal()];
        FrescoImageView frescoImageView = this.T;
        if (i == 1) {
            frescoImageView.setScaleType(ScaleType.CENTER_CROP);
        } else {
            if (i != 2) {
                return;
            }
            frescoImageView.setScaleType(ScaleType.FIT_CENTER);
        }
    }

    @Override // xsna.fi, xsna.io2
    public final float i0() {
        return this.n0;
    }

    public final void i7(float f) {
        this.W.setRatio(f);
    }

    public com.vk.libvideo.autoplay.a k7() {
        RepeatMode repeatMode = RepeatMode.BY_VIDEO_PARAMS;
        SubtitlesConfigurationMode subtitlesConfigurationMode = SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE;
        toz.a.getClass();
        return new com.vk.libvideo.autoplay.a(false, repeatMode, false, null, false, false, true, true, false, true, true, null, subtitlesConfigurationMode, toz.b.b, AutoPlayAdPixelsTrackerType.NEWSFEED, PlayerType.INLINE, ScreenType.INLINE, false, null);
    }

    public final View.OnClickListener o7() {
        s6o s6oVar = this.q;
        if (s6oVar != null) {
            return s6oVar.a(this, s6oVar.e);
        }
        L.e("BaseVideoAutoPlayHolder", "doubleLikeHelper is null, so double tap will not be handled");
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VideoAttachment videoAttachment;
        ShitAttachment shitAttachment;
        AdSource adSource;
        Activity b2;
        s980 s980Var;
        N n = this.E;
        if (n != 0 && (s980Var = this.y) != 0) {
            s980Var.Mg(view, J0(), q6(), n);
        }
        yg5 yg5Var = this.h0;
        if (yg5Var == null || yg5Var.R0().h()) {
            return;
        }
        int id = view.getId();
        fh5 fh5Var = this.L;
        VideoFile videoFile = fh5Var.o;
        if ((id == R.id.feed_carousel_product_sound_control || id == R.id.video_sound_control) && (this.h0.d() || this.h0.isPlaying() || this.h0.w0())) {
            if (fh5Var.u0()) {
                return;
            }
            C7(view);
            return;
        }
        if (id == R.id.video_subtitles_control && this.h0.isPlaying()) {
            fh5Var.v0();
            return;
        }
        if (id == R.id.video_watch_later_control) {
            ImageView imageView = fh5Var.H;
            if (imageView == null || (b2 = enj.b(imageView)) == null) {
                return;
            }
            boolean X = fh5Var.o.X();
            int i = 1;
            if (o25.a().b()) {
                fxc0.B().m0(b2, fh5Var.o, fh5Var.k, fh5Var.l, new te1(fh5Var, i), new tl0(fh5Var, 8));
                s3q0 s3q0Var = s3q0.a;
                return;
            } else {
                if (((Boolean) fh5Var.g0.getValue()).booleanValue()) {
                    o25.a().getClass();
                } else {
                    o25.a().getClass();
                }
                fh5Var.S0(!X);
                return;
            }
        }
        if ((id == R.id.video_replay || id == R.id.video_end_replay || id == R.id.video_play_again || id == R.id.interactive_video_replay) && this.h0.a()) {
            fh5Var.n0();
            H7();
            return;
        }
        if (id == R.id.retry) {
            fh5Var.m0();
            H7();
            return;
        }
        if (id == R.id.video_action_link || id == R.id.video_complete_action) {
            Activity h = e3m.h(view.getContext());
            if (h != null) {
                fh5Var.j0(h);
                return;
            }
            return;
        }
        if (id == R.id.video_end_add) {
            fh5Var.x();
            return;
        }
        if (id == R.id.video_end_share) {
            kbj0 b3 = nr4.b();
            Context context = view.getContext();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            b3.i(context, videoFile, false, false, Peer.Unknown.e, null);
            return;
        }
        if (id == R.id.video_watch_full_button || id == R.id.interactive_video_end_watch_full) {
            Activity h2 = e3m.h(view.getContext());
            if (h2 != null) {
                this.L.p(h2, false, null, null, null, false, null);
                return;
            }
            return;
        }
        FeedFeatures feedFeatures = FeedFeatures.ADS_VIDEO_CLICK;
        feedFeatures.getClass();
        if (!com.vk.toggle.b.A.a(feedFeatures) || (videoAttachment = (VideoAttachment) this.E) == null || (shitAttachment = videoAttachment.h) == null || (adSource = shitAttachment.X) == null || adSource != AdSource.VK_FEED_YANDEX) {
            F7(view, this.h0.g0(), this.h0.V());
        } else {
            u1c0 J0 = J0();
            hd60.a().r0(view.getContext(), shitAttachment, J0 != null ? J0.k : -1, AdClickContext.IMAGE);
        }
    }

    @Override // xsna.fi, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        fq6 fq6Var = this.k0;
        if (fq6Var != null) {
            view.getViewTreeObserver().addOnPreDrawListener(fq6Var);
        }
        wgt0 s7 = s7();
        tps0 tps0Var = this.l0;
        boolean z = tps0Var instanceof tps0.a;
        RatioFrameLayout ratioFrameLayout = this.W;
        if (z) {
            tps0.a aVar = (tps0.a) tps0Var;
            bwt0.m0(aVar.a, aVar.b, ratioFrameLayout);
            ratioFrameLayout.setOrientation(aVar.d);
            Float f = aVar.c;
            if (f != null) {
                ratioFrameLayout.setRatio(f.floatValue());
                return;
            }
            return;
        }
        if (tps0Var instanceof tps0.b) {
            tps0.b bVar = (tps0.b) tps0Var;
            if (s7.a <= 0 || s7.b <= 0) {
                ratioFrameLayout.setOrientation(0);
                bwt0.m0(-1, -2, ratioFrameLayout);
                ratioFrameLayout.setRatio(0.5625f);
                return;
            }
            ratioFrameLayout.setOrientation(0);
            ViewGroup viewGroup = this.H.get();
            int i = this.i0;
            if (i <= 0 && viewGroup != null) {
                i = viewGroup.getWidth();
            }
            w7(i, bVar);
        }
    }

    @Override // xsna.fi, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.I = false;
        fq6 fq6Var = this.k0;
        if (fq6Var != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(fq6Var);
        }
        DurationView durationView = this.M;
        if (durationView != null) {
            durationView.c();
        }
        InteractiveDurationView interactiveDurationView = this.N;
        if (interactiveDurationView != null) {
            interactiveDurationView.e();
        }
        ProgressBar progressBar = this.U;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        NoStyleSubtitleView noStyleSubtitleView = this.O;
        if (noStyleSubtitleView != null) {
            noStyleSubtitleView.setRenderItems(null);
            noStyleSubtitleView.setVisibility(4);
        }
        this.L.S();
    }

    public final View.OnClickListener p7(Long l) {
        s6o s6oVar = this.q;
        if (s6oVar != null) {
            l.getClass();
            return new e6o(s6oVar, l, this, s6oVar.e);
        }
        L.e("BaseVideoAutoPlayHolder", "doubleLikeHelper is null, so double tap will not be handled");
        qcy<Object>[] qcyVarArr = bwt0.a;
        return new uvt0(300L, this);
    }

    @Override // xsna.ent0
    @Nullable
    public dnt0 q3() {
        return this.L;
    }

    public final VideoFile r7() {
        VideoAttachment videoAttachment = (VideoAttachment) this.E;
        if (videoAttachment == null) {
            return null;
        }
        return videoAttachment.k;
    }

    public final wgt0 s7() {
        wgt0 wgt0Var;
        wgt0 wgt0Var2;
        yg5 yg5Var = this.h0;
        d3b0 v0 = yg5Var == null ? null : yg5Var.v0();
        if (v0 != null) {
            wgt0 a2 = rm80.a(v0);
            if (a2.a * a2.b != 0) {
                wgt0Var2 = rm80.a(v0);
                L.e("Video size: " + wgt0Var2.a + "x" + wgt0Var2.b);
                return wgt0Var2;
            }
        }
        VideoFile r7 = r7();
        if (r7 != null) {
            if (r7.getHeight() * r7.getWidth() != 0) {
                wgt0Var = new wgt0(r7.getWidth(), r7.getHeight());
                wgt0Var2 = wgt0Var;
                L.e("Video size: " + wgt0Var2.a + "x" + wgt0Var2.b);
                return wgt0Var2;
            }
        }
        int measuredWidth = this.W.getMeasuredWidth();
        wgt0Var = new wgt0(measuredWidth, (int) (measuredWidth * 0.5625f));
        wgt0Var2 = wgt0Var;
        L.e("Video size: " + wgt0Var2.a + "x" + wgt0Var2.b);
        return wgt0Var2;
    }

    public final void t7() {
        View.OnClickListener o7 = o7();
        Long l = this.p0;
        if (l == null) {
            l = Long.valueOf(ViewConfiguration.getDoubleTapTimeout() + 300);
            this.p0 = l;
        }
        View.OnClickListener p7 = p7(l);
        ActionLinkView actionLinkView = this.d0;
        if (actionLinkView != null) {
            actionLinkView.setOnClickListener(o7);
        }
        this.itemView.setOnClickListener(p7);
        this.W.setOnClickListener(p7);
        View view = this.R;
        if (view != null) {
            view.setOnClickListener(o7);
        }
        View view2 = this.Z;
        if (view2 != null) {
            view2.setOnClickListener(o7);
        }
        View view3 = this.b0;
        if (view3 != null) {
            view3.setOnClickListener(o7);
        }
        ImageView imageView = this.a0;
        if (imageView != null) {
            imageView.setOnClickListener(o7);
        }
        this.V.a(new VideoErrorView.a(null, o7, false, false, false, null));
        ClipEndOverlayView clipEndOverlayView = this.g0;
        if (clipEndOverlayView != null) {
            clipEndOverlayView.setOnClickListener(o7);
        }
    }

    public final void w7(int i, tps0.b bVar) {
        wgt0 s7 = s7();
        int i2 = s7.b;
        int i3 = s7.a;
        if (i <= 0 || i3 <= 0 || i2 <= 0) {
            return;
        }
        Context context = this.itemView.getContext();
        boolean d = g620.f().d(this.h0.A());
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i4 = displayMetrics.widthPixels;
        int i5 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        float f = i3;
        float f2 = i2;
        float f3 = f / f2;
        Float f4 = bVar.a;
        if (f4 != null) {
            f3 = f4.floatValue();
        }
        HashSet hashSet = iah0.a;
        float f5 = (fnj.d(context) || i4 > i5) ? i * 0.7f : i;
        float f6 = (f3 >= 1.0f || d) ? f5 / f3 : f5;
        if (!bVar.b) {
            float f7 = i5 * 0.7f;
            if (f6 > f7) {
                f6 = f7;
            }
        }
        rect.left = 0;
        rect.top = 0;
        rect.right = (int) f5;
        rect.bottom = (int) f6;
        RatioFrameLayout ratioFrameLayout = this.W;
        ViewGroup.LayoutParams layoutParams = ratioFrameLayout.getLayoutParams();
        layoutParams.width = rect.width();
        layoutParams.height = rect.height();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 1;
        }
        if (i3 <= 0 || i2 <= 0) {
            ratioFrameLayout.setRatio(0.5625f);
        } else {
            VideoAttachment videoAttachment = (VideoAttachment) this.E;
            if (videoAttachment == null || videoAttachment.h == null || bVar.a != null || i2 <= i3) {
                ratioFrameLayout.setRatio(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                ratioFrameLayout.setRatio(f2 / f);
            }
        }
        ratioFrameLayout.setLayoutParams(layoutParams);
        VideoTextureView videoTextureView = this.X;
        videoTextureView.getMatrixProvider().l(i3, i2);
        TransformController.ScaleType scaleType = this.m0;
        if (scaleType == null) {
            scaleType = TransformController.ScaleType.CROP;
        }
        videoTextureView.i(scaleType, false);
    }

    @Override // xsna.eq6
    /* renamed from: z7 */
    public void c7(N n) {
        if (j7(this.C) != null) {
            return;
        }
        ShitAttachment shitAttachment = n.h;
        PostInteract postInteract = n.g;
        u1c0 J0 = J0();
        ShittyAdsDataProvider shittyAdsDataProvider = shitAttachment != null ? new ShittyAdsDataProvider(shitAttachment, J0 != null ? J0.k : -1) : null;
        this.j0.b = getBindingAdapterPosition();
        VideoFile videoFile = n.k;
        com.vk.libvideo.autoplay.b bVar = this.K;
        bVar.getClass();
        yg5 e = bVar.e(videoFile, null);
        this.h0 = e;
        n.Kb(e.V());
        this.h0.Q(this.t);
        yg5 yg5Var = this.h0;
        com.vk.libvideo.autoplay.a k7 = k7();
        fh5 fh5Var = this.L;
        fh5Var.k(videoFile, yg5Var, k7);
        fh5Var.A0 = shittyAdsDataProvider;
        String str = postInteract != null ? postInteract.b : null;
        fh5Var.w(n.l);
        fh5Var.l = this.v;
        fh5Var.s(str);
        q8d q8dVar = this.f0;
        if (q8dVar != null) {
            q8dVar.a(videoFile);
        }
        ProgressBar progressBar = this.U;
        if (progressBar != null) {
            progressBar.setMax(videoFile.getDuration() * 1000);
        }
        zg zgVar = new zg(this, 7);
        FrescoImageView frescoImageView = this.T;
        frescoImageView.setIgnoreTrafficSaverPredicate(zgVar);
        frescoImageView.setRemoteImage((List<? extends fxj0>) e7(n));
        frescoImageView.setPostprocessor(d7());
        h7();
        this.W.setContentDescription(this.itemView.getContext().getString(R.string.accessibility_video_title, videoFile.getTitle()));
        H7();
        fh5Var.n = n.l != null;
        xcs0 xcs0Var = this.S;
        if (xcs0Var != null) {
            uoj0 uoj0Var = fh5Var.H0;
            xcs0Var.a(new xcs0.a(videoFile.m1() != null && "video".equals(videoFile.m1().c), o7(), uoj0Var != null ? uoj0Var.c : null, new wwr0(videoFile, o7(), xcs0Var.getContext()), new djs0(videoFile)));
        }
    }

    public BaseVideoAutoPlayHolder(View view, ViewGroup viewGroup, @NonNull tps0 tps0Var, @Nullable VideoSliderAutoPlayHolder videoSliderAutoPlayHolder) {
        this(view, viewGroup, tps0Var, new sps0(null, null, false, 255), videoSliderAutoPlayHolder);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v11 xsna.fh5, still in use, count: 2, list:
          (r4v11 xsna.fh5) from 0x024d: MOVE (r42v1 xsna.fh5) = (r4v11 xsna.fh5)
          (r4v11 xsna.fh5) from 0x0246: MOVE (r42v3 xsna.fh5) = (r4v11 xsna.fh5)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.fq6] */
    public BaseVideoAutoPlayHolder(android.view.View r42, android.view.ViewGroup r43, @androidx.annotation.NonNull final xsna.tps0 r44, @androidx.annotation.NonNull xsna.sps0 r45, @androidx.annotation.Nullable xsna.s0t0 r46) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder.<init>(android.view.View, android.view.ViewGroup, xsna.tps0, xsna.sps0, xsna.s0t0):void");
    }

    public static class ShittyAdsDataProvider extends BaseAdsDataProvider {
        public static final Parcelable.Creator<ShittyAdsDataProvider> CREATOR = new a();
        public final Owner b;
        public final ShitAttachment c;
        public final String d;
        public final int e;

        public class a extends Serializer.c<ShittyAdsDataProvider> {
            @Override // com.vk.core.serialize.Serializer.c
            public final ShittyAdsDataProvider a(@NonNull Serializer serializer) {
                return new ShittyAdsDataProvider(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShittyAdsDataProvider[i];
            }
        }

        public ShittyAdsDataProvider(ShitAttachment shitAttachment, int i) {
            this.c = shitAttachment;
            Owner owner = new Owner();
            this.b = owner;
            String str = shitAttachment.F;
            String str2 = shitAttachment.J;
            String str3 = shitAttachment.l;
            owner.c = str;
            this.e = i;
            ImageSize Cb = shitAttachment.G.Cb(iah0.a(48), true, false);
            if (Cb != null) {
                owner.e = Cb.d.d;
            }
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(str3)) {
                sb.append(str3);
            }
            if (!str2.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(str2);
            }
            this.d = sb.toString();
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final void Da(@NonNull FragmentActivity fragmentActivity) {
            hd60.a().r0(fragmentActivity, this.c, this.e, AdClickContext.HEADER);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(@NonNull Serializer serializer) {
            serializer.i0(this.c);
            serializer.i0(this.b);
            serializer.j0(this.d);
            serializer.S(this.e);
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        @Nullable
        public final String S1() {
            ShitAttachment shitAttachment = this.c;
            return shitAttachment.l0 ? shitAttachment.u : shitAttachment.p;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final void a8(@NonNull Context context) {
            hd60.a().O(context, this.c, this.e, true);
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        @Nullable
        public final String getDescription() {
            return this.d;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        public final int getDuration() {
            VideoAttachment videoAttachment = this.c.I;
            if (videoAttachment != null) {
                return videoAttachment.k.getDuration();
            }
            return 0;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        @Nullable
        public final String getMessage() {
            return this.c.A;
        }

        @Override // com.vk.libvideo.api.ad.AdsDataProvider
        @Nullable
        public final Owner s() {
            return this.b;
        }

        public ShittyAdsDataProvider(Serializer serializer) {
            this.c = (ShitAttachment) serializer.G(ShitAttachment.class.getClassLoader());
            this.b = (Owner) serializer.G(Owner.class.getClassLoader());
            this.d = serializer.H();
            this.e = serializer.u();
        }
    }

    public void C7(View view) {
    }

    @Override // xsna.fh5.b
    public void i5(@NonNull fh5.a aVar, @NonNull fh5.a aVar2) {
    }
}
