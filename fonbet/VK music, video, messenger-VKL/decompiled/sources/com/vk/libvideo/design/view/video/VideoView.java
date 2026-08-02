package com.vk.libvideo.design.view.video;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.util.Property;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.VideoAdData;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.fullscreenvideo.ControlsState;
import com.vk.libvideo.api.ad.AdBannerData;
import com.vk.libvideo.api.ad.AdsDataProvider;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.autoplay.j;
import com.vk.libvideo.design.view.actionlink.b;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.buttons.EpisodeButton;
import com.vk.libvideo.design.view.endview.VideoEndView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.libvideo.design.view.fullscreen.VideoTopBarView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.panel.VideoBottomPanelView;
import com.vk.libvideo.design.view.preview.PreviewImageView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.dialogs.BaseAnimationDialog;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.videotracker.FullscreenTransition;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.RewindType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.SubsShowBlocker;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.libvideo.ui.VideoPlayerAdsPanel;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.media.player.action.VideoSeekAction;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression;
import com.vk.toggle.features.VideoFeatures;
import com.vk.typography.FontFamily;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.l2;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.controls.models.PlayerState;
import one.video.controls.models.UIPlayerSeek;
import one.video.controls.view.CastTextView;
import one.video.controls.view.state.CastButtonState;
import one.video.controls.views.ControlsIcon;
import one.video.controls.views.PlayButton;
import one.video.controls.views.PlayerControlsView;
import one.video.controls.views.SkipBackButton;
import one.video.controls.views.SkipForwardButton;
import one.video.controls.views.VideoButtonsView;
import one.video.controls.views.VideoShortActions;
import one.video.controls.views.preview.FullSeekPreviewLayout;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import one.video.exo.offline.DownloadInfo;
import one.video.player.OneVideoPlayer;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import one.video.smartcast.api.ConnectionState;
import one.video.transform.TransformController;
import xsna.a0w0;
import xsna.a20;
import xsna.a390;
import xsna.a440;
import xsna.a78;
import xsna.afl0;
import xsna.akw;
import xsna.alt0;
import xsna.aqt0;
import xsna.ass0;
import xsna.asu0;
import xsna.avj0;
import xsna.avt0;
import xsna.axo0;
import xsna.ayr0;
import xsna.b04;
import xsna.b1t0;
import xsna.b25;
import xsna.bpn0;
import xsna.bqt0;
import xsna.bv9;
import xsna.bwt0;
import xsna.c20;
import xsna.c5g;
import xsna.c63;
import xsna.cck0;
import xsna.clt0;
import xsna.cy20;
import xsna.d20;
import xsna.d3b0;
import xsna.d3m;
import xsna.d4s0;
import xsna.dck0;
import xsna.de4;
import xsna.dhr0;
import xsna.djs0;
import xsna.dpe0;
import xsna.dqm0;
import xsna.dzn;
import xsna.e3m;
import xsna.e43;
import xsna.e5o;
import xsna.e6;
import xsna.ebs0;
import xsna.eg0;
import xsna.ehm0;
import xsna.enj;
import xsna.epx;
import xsna.eqt0;
import xsna.etn;
import xsna.etv0;
import xsna.f4m;
import xsna.fbs0;
import xsna.fkq0;
import xsna.fnj;
import xsna.fot;
import xsna.fpf0;
import xsna.fxc0;
import xsna.fyd0;
import xsna.g560;
import xsna.gos0;
import xsna.gpt0;
import xsna.gqh0;
import xsna.gv2;
import xsna.gz80;
import xsna.gzs;
import xsna.h560;
import xsna.hbj0;
import xsna.hfm0;
import xsna.hg1;
import xsna.hnt0;
import xsna.hvr0;
import xsna.i0q0;
import xsna.i1t0;
import xsna.i560;
import xsna.ia90;
import xsna.iah0;
import xsna.id;
import xsna.izr0;
import xsna.j5g;
import xsna.j660;
import xsna.j8n0;
import xsna.jao;
import xsna.je0;
import xsna.jjc;
import xsna.jox;
import xsna.jwx;
import xsna.kcj0;
import xsna.kky;
import xsna.kox;
import xsna.ksq0;
import xsna.kzn;
import xsna.kzr0;
import xsna.l0a;
import xsna.l6n0;
import xsna.lqt0;
import xsna.lt00;
import xsna.lxh0;
import xsna.lzl0;
import xsna.m33;
import xsna.m52;
import xsna.mcr0;
import xsna.mnh0;
import xsna.msy;
import xsna.mvl0;
import xsna.mzr0;
import xsna.nkt0;
import xsna.no2;
import xsna.nqt0;
import xsna.o330;
import xsna.o4;
import xsna.o640;
import xsna.o7k0;
import xsna.ofy0;
import xsna.og0;
import xsna.oq80;
import xsna.oqh0;
import xsna.oqs0;
import xsna.ozr0;
import xsna.p640;
import xsna.pgn;
import xsna.pis0;
import xsna.pnr0;
import xsna.prq0;
import xsna.pwh0;
import xsna.pz9;
import xsna.q0a;
import xsna.q0s0;
import xsna.q3s0;
import xsna.q640;
import xsna.q8p0;
import xsna.q8s0;
import xsna.qah0;
import xsna.qb3;
import xsna.qcy;
import xsna.qgs0;
import xsna.qjj0;
import xsna.qjl0;
import xsna.qr;
import xsna.qu5;
import xsna.qws0;
import xsna.r6i0;
import xsna.rlt0;
import xsna.rrn0;
import xsna.rts0;
import xsna.rx4;
import xsna.rzl0;
import xsna.s0v0;
import xsna.s290;
import xsna.s3q0;
import xsna.sc4;
import xsna.sms0;
import xsna.sqf0;
import xsna.swe0;
import xsna.tbe0;
import xsna.thu0;
import xsna.tn9;
import xsna.tnf;
import xsna.tqf0;
import xsna.tsk0;
import xsna.tw3;
import xsna.tzr0;
import xsna.u5p0;
import xsna.u8l;
import xsna.ucp;
import xsna.umz;
import xsna.uvs0;
import xsna.uxs;
import xsna.uys0;
import xsna.v5n0;
import xsna.vxs;
import xsna.w0o0;
import xsna.w0t0;
import xsna.w7o0;
import xsna.wjs0;
import xsna.wk;
import xsna.wpt0;
import xsna.wqt0;
import xsna.wxt;
import xsna.wxv;
import xsna.wy0;
import xsna.wzs;
import xsna.x2j0;
import xsna.x2s0;
import xsna.xn50;
import xsna.xpt0;
import xsna.xqt0;
import xsna.xvq0;
import xsna.xwp0;
import xsna.xy80;
import xsna.xz9;
import xsna.y1o;
import xsna.ydt0;
import xsna.ye0;
import xsna.yg5;
import xsna.yks0;
import xsna.ypj;
import xsna.ypt0;
import xsna.yqt0;
import xsna.yum0;
import xsna.ywp0;
import xsna.z0h0;
import xsna.zhr0;
import xsna.zjp0;
import xsna.zpt0;
import xsna.zqt0;
import xsna.zz00;

/* compiled from: VideoView.kt */
/* loaded from: classes2.dex */
public class VideoView extends FrameLayout implements ywp0, yks0.a, VideoFastSeekView.b, hnt0 {
    public static final /* synthetic */ qcy<Object>[] T0;
    public AdsDataProvider A;
    public final Object A0;
    public boolean B;
    public final Object B0;
    public VideoFile C;
    public TransformController.ScaleType C0;
    public List<Image> D;
    public io.reactivex.rxjava3.disposables.c D0;
    public final Object E;
    public final sc4 E0;
    public final Object F;
    public final o4 F0;
    public final Object G;
    public final zqt0 G0;
    public boolean H;
    public final Object H0;
    public yg5 I;
    public final Object I0;
    public boolean J;
    public final Object J0;
    public boolean K;
    public etn K0;
    public a78 L;
    public final Object L0;
    public boolean M;
    public final Object M0;
    public View N;
    public final Object N0;
    public boolean O;
    public final PlayerType O0;
    public boolean P;
    public izr0 P0;
    public boolean Q;
    public final Object Q0;
    public boolean R;
    public final Object R0;
    public boolean S;
    public final Object S0;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public Float a0;
    public final fbs0 b;
    public boolean b0;
    public final Object c;
    public boolean c0;
    public final uxs d;
    public final Object d0;
    public final Object e;
    public final Object e0;
    public final Object f;
    public final Object f0;
    public final Object g;
    public final Object g0;
    public final Object h;
    public final alt0 h0;
    public final Object i;
    public final Object i0;
    public final xpt0 j;
    public xy80 j0;
    public final wpt0 k;
    public boolean k0;
    public final ypt0 l;
    public boolean l0;
    public final yum0 m;
    public AnimatorSet m0;
    public thu0 n;
    public bv9 n0;
    public boolean o;
    public gv2 o0;
    public wzs<? super String, ? super Boolean, s3q0> p;
    public tnf p0;
    public u8l q;
    public AnimatorSet q0;
    public no2 r;
    public boolean r0;
    public ebs0 s;
    public boolean s0;
    public f t;
    public boolean t0;
    public d u;
    public boolean u0;
    public b v;
    public final pgn v0;
    public final bpn0 w;
    public Boolean w0;
    public boolean x;
    public boolean x0;
    public final com.vk.libvideo.autoplay.b y;
    public one.video.player.tracks.c y0;
    public yks0 z;
    public final Object z0;

    /* compiled from: VideoView.kt */
    public static final class a implements UIPlayerSeek.b {
        public a() {
        }

        @Override // one.video.controls.models.UIPlayerSeek.b
        public final void c(float f) {
            VideoView.M(VideoView.this, f);
        }
    }

    /* compiled from: VideoView.kt */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: VideoView.kt */
    public final class c implements akw {
        @Override // xsna.akw
        public final Future b(Context context, Uri uri) {
            qcy<Object>[] qcyVarArr = VideoView.T0;
            l2 r0 = mcr0.i(uri, 0, 0, 0, new s0v0(), null).r0(asu0.a.c());
            io.reactivex.rxjava3.internal.observers.g gVar = new io.reactivex.rxjava3.internal.observers.g();
            r0.subscribe(gVar);
            return gVar;
        }
    }

    /* compiled from: VideoView.kt */
    public interface d {
        void a(boolean z);
    }

    /* compiled from: VideoView.kt */
    public final class e {
        public e() {
        }

        public final int a() {
            VideoView videoView = VideoView.this;
            int seekBarHeight = videoView.getViewBinding().r.getSeekBarHeight();
            if (!videoView.G0.a()) {
                return seekBarHeight;
            }
            int i = 0;
            int g = swe0.g(videoView.getViewBinding().r.W3(videoView.getContext()).getMeasuredHeight() - seekBarHeight, 0, iah0.a(35));
            if (videoView.M && videoView.B) {
                etn doc2DocConfig = videoView.getDoc2DocConfig();
                VideoFile videoFile = videoView.getVideoFile();
                if (doc2DocConfig.g(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null)) {
                    i = iah0.a(80);
                }
            }
            return seekBarHeight + g + i;
        }

        public final int b() {
            int a;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            int i;
            VideoFullscreenBottomBarView fullscreenBottomBar;
            int i2;
            VideoView videoView = VideoView.this;
            if (!videoView.getUiVisible()) {
                if (!videoView.B) {
                    int[] iArr = new int[2];
                    videoView.getLocationOnScreen(iArr);
                    int measuredHeight = videoView.getMeasuredHeight() + iArr[1];
                    int i3 = iah0.j(videoView.getContext()).y;
                    int a2 = iah0.a(64);
                    if (measuredHeight > i3 - a2) {
                        return a2;
                    }
                }
                return 0;
            }
            if (videoView.getViewBinding().I != null) {
                qcy<Object>[] qcyVarArr = VideoView.T0;
                if (!videoView.M0()) {
                    VideoPlayerAdsPanel videoPlayerAdsPanel = videoView.getViewBinding().I;
                    int measuredHeight2 = videoPlayerAdsPanel != null ? videoPlayerAdsPanel.getMeasuredHeight() : 0;
                    VideoPlayerAdsPanel videoPlayerAdsPanel2 = videoView.getViewBinding().I;
                    if (videoPlayerAdsPanel2 != null) {
                        ViewGroup.LayoutParams layoutParams = videoPlayerAdsPanel2.getLayoutParams();
                        marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            r3 = marginLayoutParams.bottomMargin;
                        }
                    }
                    r3 += measuredHeight2;
                }
                a = a();
            } else {
                if (videoView.M && !videoView.B) {
                    qcy<Object>[] qcyVarArr2 = VideoView.T0;
                    if (!videoView.M0()) {
                        VideoBottomPanelView videoBottomPanelView = videoView.getViewBinding().G;
                        int measuredHeight3 = videoBottomPanelView != null ? videoBottomPanelView.getMeasuredHeight() : 0;
                        VideoBottomPanelView videoBottomPanelView2 = videoView.getViewBinding().G;
                        if (videoBottomPanelView2 != null) {
                            ViewGroup.LayoutParams layoutParams2 = videoBottomPanelView2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (marginLayoutParams2 != null) {
                                i2 = marginLayoutParams2.bottomMargin;
                                i = measuredHeight3 + i2;
                            }
                        }
                        i2 = 0;
                        i = measuredHeight3 + i2;
                    } else if (videoView.J0() || (fullscreenBottomBar = videoView.getFullscreenBottomBar()) == null) {
                        i = 0;
                    } else {
                        int measuredHeight4 = fullscreenBottomBar.getMeasuredHeight();
                        ViewGroup.LayoutParams layoutParams3 = fullscreenBottomBar.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        int i4 = measuredHeight4 + (marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0);
                        ViewGroup.LayoutParams layoutParams4 = fullscreenBottomBar.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        i = ((marginLayoutParams4 != null ? marginLayoutParams4.topMargin : 0) / 2) + i4;
                    }
                    int measuredHeight5 = videoView.getViewBinding().u.getMeasuredHeight() + i;
                    if (!videoView.getDoc2DocConfig().a || videoView.G0.b()) {
                        ViewGroup.LayoutParams layoutParams5 = videoView.getViewBinding().u.getLayoutParams();
                        marginLayoutParams = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                        measuredHeight5 += marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                    }
                    Context context = videoView.getContext();
                    HashSet hashSet = iah0.a;
                    if (fnj.b(context)) {
                        return measuredHeight5;
                    }
                    qcy<Object>[] qcyVarArr3 = bwt0.a;
                    return measuredHeight5 - ((int) videoView.getResources().getDimension(R.dimen.subtitles_bottom_margin));
                }
                qcy<Object>[] qcyVarArr4 = VideoView.T0;
                if (!videoView.M0()) {
                    VideoBottomPanelView videoBottomPanelView3 = videoView.getViewBinding().G;
                    int measuredHeight6 = videoBottomPanelView3 != null ? videoBottomPanelView3.getMeasuredHeight() : 0;
                    VideoBottomPanelView videoBottomPanelView4 = videoView.getViewBinding().G;
                    if (videoBottomPanelView4 != null) {
                        ViewGroup.LayoutParams layoutParams6 = videoBottomPanelView4.getLayoutParams();
                        marginLayoutParams = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                        if (marginLayoutParams != null) {
                            r3 = marginLayoutParams.bottomMargin;
                        }
                    }
                    r3 += measuredHeight6;
                }
                a = a();
            }
            return a + r3;
        }
    }

    /* compiled from: VideoView.kt */
    public interface f {
    }

    /* compiled from: VideoView.kt */
    public static final /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ControlsIcon.values().length];
            try {
                iArr[ControlsIcon.SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ControlsIcon.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ControlsIcon.CHROME_CAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ControlsIcon.SMART_CAST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ControlsIcon.BUGREPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ControlsIcon.FEEDBACK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MediaRouteConnectStatus.values().length];
            try {
                iArr2[MediaRouteConnectStatus.NO_DEVICES_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[MediaRouteConnectStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MediaRouteConnectStatus.CONNECTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MediaRouteConnectStatus.CONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VideoView.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((VideoView) this.receiver).t();
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(VideoView.class, "coverDisposable", "getCoverDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        T0 = new qcy[]{mutablePropertyReference1Impl};
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static s3q0 A(VideoView videoView) {
        if (videoView.getViewBinding().p.getVisibility() == 0 && videoView.getViewBinding().p.getAlpha() == 1.0f) {
            videoView.b.onClick(videoView.getViewBinding().p);
            VideoFile videoFile = videoView.C;
            if (videoFile != null) {
                videoView.getMarketAnalytics().a(new zz00(videoFile.o0(), videoFile.I0().b, EmptyList.b, CommonMarketStat$TypeRefSource.VIDEO_ATTACHED_ITEMS));
            }
        }
        return s3q0.a;
    }

    public static yqt0 C(VideoView videoView) {
        return new yqt0(videoView.getAuthBridge(), videoView.K0, new hvr0(videoView, 11), videoView.C);
    }

    public static s3q0 D(VideoView videoView) {
        videoView.getVkVideoLiveSDKRepository().getClass();
        return s3q0.a;
    }

    public static kzn F(VideoView videoView) {
        return new kzn(videoView.getDonutVideoComponent(), videoView.getViewBinding(), videoView.b);
    }

    public static int G(VideoView videoView) {
        return videoView.getSubtitlesShiftCalculator().b();
    }

    public static void H0(VideoView videoView, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        boolean z5;
        int i3;
        boolean z6;
        float f2;
        int i4;
        float f3;
        float f4;
        oqh0 oqh0Var;
        boolean z7;
        boolean z8;
        float f5;
        int i5;
        etv0 etv0Var;
        je0 N0;
        og0 og0Var;
        boolean z9 = (i2 & 4) != 0 ? true : z3;
        boolean z10 = (i2 & 8) != 0 ? false : z4;
        boolean z11 = (i2 & 16) == 0;
        videoView.t0 = z11;
        yg5 yg5Var = videoView.I;
        boolean z12 = (yg5Var == null || (N0 = yg5Var.N0()) == null || (og0Var = ye0.this.A) == null || !og0Var.c()) ? false : true;
        if (z10 || !videoView.O) {
            if (!videoView.hasTransientState() || z12) {
                boolean z13 = !videoView.getMinifiedState().h() && ((z && !z12) || (videoView.getAccessibilityManager().isEnabled() && videoView.getAccessibilityManager().isTouchExplorationEnabled()));
                if (videoView.getShouldSkipControlsAnimation() && videoView.r0 == z13) {
                    return;
                }
                videoView.r0 = z13;
                if (!z13 && (etv0Var = videoView.getMultiTrackOnboarding().b.f) != null) {
                    etv0Var.b(false);
                }
                videoView.getViewBinding().g.getSkippableRow$core_release().setVisibility(!videoView.getMinifiedState().h() ? 0 : 8);
                videoView.s0 = z2;
                videoView.T();
                AnimatorSet animatorSet = videoView.m0;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                videoView.q0.cancel();
                AnimatorSet animatorSet2 = new AnimatorSet();
                videoView.q0 = animatorSet2;
                animatorSet2.setDuration(300L);
                videoView.q0.setInterpolator(BaseAnimationDialog.Z);
                videoView.m0 = videoView.q0;
                d3m.b(videoView.getViewBinding().w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                if (videoView.getViewBinding().z.getSkipBackListener() != null) {
                    d3m.b(videoView.getViewBinding().x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                }
                if (videoView.getViewBinding().z.getSkipForwardListener() != null) {
                    d3m.b(videoView.getViewBinding().y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                }
                yg5 yg5Var2 = videoView.I;
                boolean z14 = yg5Var2 != null && yg5Var2.P0();
                videoView.e1();
                yg5 yg5Var3 = videoView.I;
                if (yg5Var3 == null) {
                    return;
                }
                boolean z15 = videoView.r0;
                Property property = View.TRANSLATION_Y;
                Property property2 = View.ALPHA;
                if (z15) {
                    float alpha = videoView.getViewBinding().w.getAlpha() == 1.0f ? 0.0f : videoView.getViewBinding().w.getAlpha();
                    wqt0 animatorFactory = videoView.getAnimatorFactory();
                    boolean z16 = videoView.c0;
                    oqh0 oqh0Var2 = animatorFactory.e;
                    xqt0 xqt0Var = animatorFactory.a;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    PlayButton playButton = xqt0Var.w;
                    View view = xqt0Var.i;
                    PlayerControlsView playerControlsView = xqt0Var.z;
                    float f6 = alpha;
                    VkContentBadge vkContentBadge = xqt0Var.p;
                    if (playButton.getAlpha() == 1.0f || ((Boolean) animatorFactory.f.invoke()).booleanValue()) {
                        oqh0Var = oqh0Var2;
                    } else {
                        oqh0Var = oqh0Var2;
                        arrayList2.add(ObjectAnimator.ofFloat(xqt0Var.w, (Property<PlayButton, Float>) property2, f6, 1.0f));
                    }
                    arrayList.addAll(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    if (vkContentBadge.getAlpha() != 1.0f && ((Boolean) animatorFactory.g.invoke()).booleanValue() && !z11) {
                        arrayList3.add(ObjectAnimator.ofFloat(vkContentBadge, (Property<VkContentBadge, Float>) property2, f6, 1.0f));
                    }
                    arrayList.addAll(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    if (!((Boolean) oqh0Var.invoke()).booleanValue()) {
                        if (playerControlsView.getSkipBackListener() != null) {
                            arrayList4.add(ObjectAnimator.ofFloat(xqt0Var.x, (Property<SkipBackButton, Float>) property2, f6, 1.0f));
                        }
                        if (playerControlsView.getSkipForwardListener() != null) {
                            arrayList4.add(ObjectAnimator.ofFloat(xqt0Var.y, (Property<SkipForwardButton, Float>) property2, f6, 1.0f));
                        }
                    }
                    arrayList.addAll(arrayList4);
                    Context context = animatorFactory.c;
                    ArrayList arrayList5 = new ArrayList();
                    VideoShortActions videoShortActions = xqt0Var.v;
                    CastTextView castTextView = xqt0Var.F;
                    VideoButtonsView videoButtonsView = xqt0Var.u;
                    UIPlayerSeek uIPlayerSeek = xqt0Var.r;
                    if (view.getAlpha() == 1.0f) {
                        z7 = z11;
                        z8 = z14;
                    } else {
                        z7 = z11;
                        z8 = z14;
                        arrayList5.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, f6, 1.0f));
                    }
                    if (!((Boolean) oqh0Var.invoke()).booleanValue()) {
                        if (uIPlayerSeek.W3(context).getAlpha() == 1.0f) {
                            i5 = 2;
                        } else {
                            i5 = 2;
                            arrayList5.add(ObjectAnimator.ofFloat(uIPlayerSeek.W3(context), (Property<View, Float>) property2, f6, 1.0f));
                        }
                        if (videoButtonsView.getAlpha() != 1.0f) {
                            float[] fArr = new float[i5];
                            fArr[0] = f6;
                            fArr[1] = 1.0f;
                            arrayList5.add(ObjectAnimator.ofFloat(videoButtonsView, (Property<VideoButtonsView, Float>) property2, fArr));
                        }
                        if (castTextView.getAlpha() != 1.0f) {
                            float[] fArr2 = new float[i5];
                            fArr2[0] = f6;
                            fArr2[1] = 1.0f;
                            arrayList5.add(ObjectAnimator.ofFloat(castTextView, (Property<CastTextView, Float>) property2, fArr2));
                        }
                        if (animatorFactory.b.c() && videoShortActions.getAlpha() != 1.0f) {
                            arrayList5.add(ObjectAnimator.ofFloat(videoShortActions, (Property<VideoShortActions, Float>) property2, f6, 1.0f));
                        }
                    }
                    arrayList.addAll(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    if (!((Boolean) oqh0Var.invoke()).booleanValue()) {
                        arrayList6.add(ObjectAnimator.ofFloat(xqt0Var.j, (Property<NoStyleSubtitleView, Float>) property, -((Number) animatorFactory.d.invoke()).intValue()));
                    }
                    arrayList.addAll(arrayList6);
                    ArrayList arrayList7 = new ArrayList();
                    if (!((Boolean) oqh0Var.invoke()).booleanValue() && !z16) {
                        VideoToolbarView videoToolbarView = xqt0Var.H;
                        if (videoToolbarView != null) {
                            f5 = 1.0f;
                            if (!epx.d(Float.valueOf(videoToolbarView.getAlpha()), 1.0f)) {
                                arrayList7.add(ObjectAnimator.ofFloat(xqt0Var.H, (Property<VideoToolbarView, Float>) property2, 1.0f));
                            }
                        } else {
                            f5 = 1.0f;
                        }
                        VideoTopBarView videoTopBarView = xqt0Var.L;
                        if (videoTopBarView != null && !epx.d(Float.valueOf(videoTopBarView.getAlpha()), f5)) {
                            arrayList7.add(ObjectAnimator.ofFloat(xqt0Var.L, (Property<VideoTopBarView, Float>) property2, f5));
                        }
                        VideoBottomPanelView videoBottomPanelView = xqt0Var.G;
                        if (videoBottomPanelView != null && !epx.d(Float.valueOf(videoBottomPanelView.getAlpha()), f5)) {
                            arrayList7.add(ObjectAnimator.ofFloat(xqt0Var.G, (Property<VideoBottomPanelView, Float>) property2, f5));
                        }
                        VideoFullscreenBottomBarView videoFullscreenBottomBarView = xqt0Var.K;
                        if (videoFullscreenBottomBarView != null && !epx.d(Float.valueOf(videoFullscreenBottomBarView.getAlpha()), f5)) {
                            arrayList7.add(ObjectAnimator.ofFloat(xqt0Var.K, (Property<VideoFullscreenBottomBarView, Float>) property2, f5));
                        }
                    }
                    arrayList.addAll(arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    LinearLayout linearLayout = xqt0Var.J;
                    View view2 = xqt0Var.A;
                    if (linearLayout != null && xqt0Var.H != null) {
                        arrayList8.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property, iah0.b(48.0f)));
                    }
                    if (view2.getTranslationY() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && xqt0Var.H != null) {
                        arrayList8.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, iah0.b(95.0f)));
                    }
                    arrayList.addAll(arrayList8);
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!videoView.o0((Animator) next)) {
                            arrayList9.add(next);
                        }
                    }
                    videoView.q0.playTogether(arrayList9);
                    videoView.q0.addListener(new lqt0(videoView, z8, z7, yg5Var3));
                } else {
                    wqt0 animatorFactory2 = videoView.getAnimatorFactory();
                    xqt0 xqt0Var2 = animatorFactory2.a;
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    PlayButton playButton2 = xqt0Var2.w;
                    NoStyleSubtitleView noStyleSubtitleView = xqt0Var2.j;
                    View view3 = xqt0Var2.i;
                    if (playButton2.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && z9) {
                        arrayList11.add(ObjectAnimator.ofFloat(playButton2, (Property<PlayButton, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    arrayList10.addAll(arrayList11);
                    ArrayList arrayList12 = new ArrayList();
                    PlayerControlsView playerControlsView2 = xqt0Var2.z;
                    if (playButton2.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z9 || ((Boolean) animatorFactory2.e.invoke()).booleanValue())) {
                        if (playerControlsView2.getSkipBackListener() != null) {
                            z5 = z9;
                            i3 = 1;
                            arrayList12.add(ObjectAnimator.ofFloat(xqt0Var2.x, (Property<SkipBackButton, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        } else {
                            z5 = z9;
                            i3 = 1;
                        }
                        if (playerControlsView2.getSkipForwardListener() != null) {
                            SkipForwardButton skipForwardButton = xqt0Var2.y;
                            float[] fArr3 = new float[i3];
                            fArr3[0] = 0.0f;
                            arrayList12.add(ObjectAnimator.ofFloat(skipForwardButton, (Property<SkipForwardButton, Float>) property2, fArr3));
                        }
                    } else {
                        z5 = z9;
                        i3 = 1;
                    }
                    arrayList10.addAll(arrayList12);
                    VkContentBadge vkContentBadge2 = xqt0Var2.p;
                    float[] fArr4 = new float[i3];
                    fArr4[0] = 0.0f;
                    arrayList10.addAll(Collections.singletonList(ObjectAnimator.ofFloat(vkContentBadge2, (Property<VkContentBadge, Float>) property2, fArr4)));
                    Context context2 = animatorFactory2.c;
                    ArrayList arrayList13 = new ArrayList();
                    float f7 = ((Boolean) animatorFactory2.h.invoke()).booleanValue() ? 0.0f : 1.0f;
                    VideoShortActions videoShortActions2 = xqt0Var2.v;
                    CastTextView castTextView2 = xqt0Var2.F;
                    VideoButtonsView videoButtonsView2 = xqt0Var2.u;
                    boolean z17 = z11;
                    UIPlayerSeek uIPlayerSeek2 = xqt0Var2.r;
                    if (view3.getAlpha() == f7) {
                        z6 = z14;
                        f2 = f7;
                        i4 = 1;
                    } else {
                        z6 = z14;
                        f2 = f7;
                        i4 = 1;
                        arrayList13.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) property2, f2));
                    }
                    if (uIPlayerSeek2.W3(context2).getAlpha() != f2) {
                        View W3 = uIPlayerSeek2.W3(context2);
                        float[] fArr5 = new float[i4];
                        fArr5[0] = f2;
                        arrayList13.add(ObjectAnimator.ofFloat(W3, (Property<View, Float>) property2, fArr5));
                    }
                    if (videoButtonsView2.getAlpha() != f2) {
                        float[] fArr6 = new float[i4];
                        fArr6[0] = f2;
                        arrayList13.add(ObjectAnimator.ofFloat(videoButtonsView2, (Property<VideoButtonsView, Float>) property2, fArr6));
                    }
                    if (castTextView2.getAlpha() != f2) {
                        float[] fArr7 = new float[i4];
                        fArr7[0] = f2;
                        arrayList13.add(ObjectAnimator.ofFloat(castTextView2, (Property<CastTextView, Float>) property2, fArr7));
                    }
                    if (animatorFactory2.b.c() && videoShortActions2.getAlpha() != f2) {
                        arrayList13.add(ObjectAnimator.ofFloat(videoShortActions2, (Property<VideoShortActions, Float>) property2, f2));
                    }
                    arrayList10.addAll(arrayList13);
                    ArrayList arrayList14 = new ArrayList();
                    if (noStyleSubtitleView.getTranslationY() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        arrayList14.add(ObjectAnimator.ofFloat(noStyleSubtitleView, (Property<NoStyleSubtitleView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    arrayList10.addAll(arrayList14);
                    ArrayList arrayList15 = new ArrayList();
                    VideoToolbarView videoToolbarView2 = xqt0Var2.H;
                    if (videoToolbarView2 != null) {
                        f3 = 0.0f;
                        if (!epx.d(Float.valueOf(videoToolbarView2.getAlpha()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            arrayList15.add(ObjectAnimator.ofFloat(xqt0Var2.H, (Property<VideoToolbarView, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        }
                    } else {
                        f3 = 0.0f;
                    }
                    VideoTopBarView videoTopBarView2 = xqt0Var2.L;
                    if (videoTopBarView2 != null && !epx.d(Float.valueOf(videoTopBarView2.getAlpha()), f3)) {
                        arrayList15.add(ObjectAnimator.ofFloat(xqt0Var2.L, (Property<VideoTopBarView, Float>) property2, f3));
                    }
                    VideoBottomPanelView videoBottomPanelView2 = xqt0Var2.G;
                    if (videoBottomPanelView2 != null && !epx.d(Float.valueOf(videoBottomPanelView2.getAlpha()), f3)) {
                        arrayList15.add(ObjectAnimator.ofFloat(xqt0Var2.G, (Property<VideoBottomPanelView, Float>) property2, f3));
                    }
                    VideoFullscreenBottomBarView videoFullscreenBottomBarView2 = xqt0Var2.K;
                    if (videoFullscreenBottomBarView2 != null && !epx.d(Float.valueOf(videoFullscreenBottomBarView2.getAlpha()), f3)) {
                        arrayList15.add(ObjectAnimator.ofFloat(xqt0Var2.K, (Property<VideoFullscreenBottomBarView, Float>) property2, f3));
                    }
                    arrayList10.addAll(arrayList15);
                    ArrayList arrayList16 = new ArrayList();
                    LinearLayout linearLayout2 = xqt0Var2.J;
                    View view4 = xqt0Var2.A;
                    if (linearLayout2 != null) {
                        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        arrayList16.add(ObjectAnimator.ofFloat(linearLayout2, (Property<LinearLayout, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    } else {
                        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                    if (view4.getTranslationY() != f4) {
                        arrayList16.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) property, f4));
                    }
                    arrayList10.addAll(arrayList16);
                    ArrayList arrayList17 = new ArrayList();
                    Iterator it2 = arrayList10.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (!videoView.o0((Animator) next2)) {
                            arrayList17.add(next2);
                        }
                    }
                    ArrayList arrayList18 = new ArrayList(arrayList17);
                    if (videoView.getMinifiedState() == AutoPlayMinifiedState.PIP && videoView.getActualEndView().getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        arrayList18.add(ObjectAnimator.ofFloat(videoView.getActualEndView(), (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    videoView.q0.playTogether(arrayList18);
                    videoView.q0.addListener(new nqt0(videoView, z5, z2, z17, z6));
                }
                videoView.q0.start();
                videoView.E0();
                videoView.Y(300L);
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
                videoFeatures.getClass();
                if (com.vk.toggle.b.A.a(videoFeatures)) {
                    qu5.c().getClass();
                    videoView.getViewBinding().F.setVisibility(8);
                }
                videoView.getViewBinding().g.p(videoView.r0, videoView.B, videoView.M);
            }
        }
    }

    public static s3q0 I(VideoView videoView) {
        d3b0 v0;
        ebs0 ebs0Var;
        q640 q640Var = videoView.getMultiTrackOnboarding().b;
        etv0 etv0Var = q640Var.f;
        if (etv0Var != null) {
            etv0Var.b(false);
        }
        q640Var.f = null;
        q640Var.b.b(HintId.INFO_VIDEO_SELECT_TOOLTIP_AUDIO_TRACK.getId());
        SharedPreferences.Editor edit = ((SharedPreferences) p640.a.getValue()).edit();
        edit.putInt("shown_count", 0);
        edit.apply();
        yg5 yg5Var = videoView.I;
        if (yg5Var != null && (v0 = yg5Var.v0()) != null && (ebs0Var = videoView.s) != null) {
            ebs0Var.bk(new b1t0(v0));
        }
        return s3q0.a;
    }

    public static void J(VideoView videoView) {
        videoView.getViewBinding().o.e(videoView.getActionLinkOffsetCalculator().a());
    }

    public static final void M(VideoView videoView, float f2) {
        videoView.getViewBinding().w.setTranslationY((!videoView.M || videoView.B) ? (-iah0.a(60)) * f2 : 0.0f);
        videoView.b0 = f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        videoView.c0 = f2 == 1.0f;
        videoView.getViewBinding().w.setVisibility(f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 8);
        videoView.getViewBinding().w.setAlpha(f2);
        float f3 = 1 - f2;
        videoView.getViewBinding().v.setAlpha(f3);
        videoView.getViewBinding().x.setAlpha(f3);
        videoView.getViewBinding().y.setAlpha(f3);
        View activeTopPanel = videoView.getActiveTopPanel();
        View activeBottomPanel = videoView.getActiveBottomPanel();
        if (activeTopPanel != null) {
            activeTopPanel.setVisibility((f2 == 1.0f || videoView.L0()) ? 4 : 0);
        }
        if (activeBottomPanel != null) {
            activeBottomPanel.setVisibility((f2 == 1.0f || videoView.M0()) ? 4 : 0);
        }
        if (activeTopPanel != null) {
            activeTopPanel.setAlpha(f3);
        }
        if (activeBottomPanel != null) {
            activeBottomPanel.setAlpha(f3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AccessibilityManager getAccessibilityManager() {
        return (AccessibilityManager) this.g0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final c20 getActionLinkOffsetCalculator() {
        return (c20) this.R0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final d20 getActionLinkProductTracker() {
        return (d20) this.Q0.getValue();
    }

    private final View getActiveBottomPanel() {
        Object obj;
        Object obj2;
        List l = e43.l(getViewBinding().G, getViewBinding().K);
        Iterator it = l.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            ViewGroup viewGroup = (ViewGroup) obj2;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                break;
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) obj2;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        Iterator it2 = l.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            ViewGroup viewGroup3 = (ViewGroup) next;
            if (viewGroup3 != null && viewGroup3.getVisibility() == 4 && viewGroup3.getAlpha() != 1.0f) {
                obj = next;
                break;
            }
        }
        return (ViewGroup) obj;
    }

    private final View getActiveTopPanel() {
        Object obj;
        Object obj2;
        List l = e43.l(getViewBinding().L, getViewBinding().H, getViewBinding().v);
        Iterator it = l.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            ViewGroup viewGroup = (ViewGroup) obj2;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                break;
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) obj2;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        Iterator it2 = l.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            ViewGroup viewGroup3 = (ViewGroup) next;
            if (viewGroup3 != null && viewGroup3.getVisibility() == 4 && viewGroup3.getAlpha() != 1.0f) {
                obj = next;
                break;
            }
        }
        return (ViewGroup) obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final mzr0 getAdControllerMapper() {
        return (mzr0) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final wqt0 getAnimatorFactory() {
        return (wqt0) this.E.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final b25 getAuthBridge() {
        return (b25) this.I0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final pz9 getCastButtonProvider() {
        return (pz9) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xz9 getCastEntryPoint() {
        return (xz9) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final q0a getCastViewStateProvider() {
        return (q0a) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ControlsIcon[] getControls() {
        return (ControlsIcon[]) this.N0.getValue();
    }

    private final io.reactivex.rxjava3.disposables.c getCoverDisposable() {
        qcy<Object> qcyVar = T0[0];
        return (io.reactivex.rxjava3.disposables.c) this.v0.b;
    }

    private final fot getDetector() {
        return (fot) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kzn getDonutDelegate() {
        return (kzn) this.e0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final DonutVideoComponent getDonutVideoComponent() {
        return (DonutVideoComponent) this.J0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kox getIntervalDelegate() {
        return (kox) this.d0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final lt00 getMarketAnalytics() {
        return (lt00) this.H0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final o640 getMultiTrackOnboarding() {
        return (o640) this.i0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final s290 getOverlayImageMapper() {
        return (s290) this.G.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a390 getOverlayRestrictionMapper() {
        return (a390) this.F.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PowerManager getPowerManager() {
        return (PowerManager) this.f0.getValue();
    }

    private final int getProductBadgeShift() {
        View view = getViewBinding().I == null ? getViewBinding().G : getViewBinding().I;
        int i2 = 0;
        if (!M0()) {
            int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    i2 = marginLayoutParams.bottomMargin;
                }
            }
            i2 += measuredHeight;
        }
        return iah0.a(28) + getViewBinding().r.getSeekBarHeight() + i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getShouldSkipControlsAnimation() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final e getSubtitlesShiftCalculator() {
        return (e) this.L0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final tzr0 getVideoAdProgressMapper() {
        return (tzr0) this.B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final yqt0 getViewControlsVisibilityHandler() {
        return (yqt0) this.M0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a0w0 getVkVideoLiveSDKRepository() {
        return (a0w0) this.S0.getValue();
    }

    private final void setBottomPanelVisibility(boolean z) {
        if (getViewBinding().I != null) {
            VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
            if (videoBottomPanelView != null) {
                videoBottomPanelView.setVisibility(8);
            }
            VideoPlayerAdsPanel videoPlayerAdsPanel = getViewBinding().I;
            if (videoPlayerAdsPanel != null) {
                videoPlayerAdsPanel.setVisibility(0);
                return;
            }
            return;
        }
        VideoBottomPanelView videoBottomPanelView2 = getViewBinding().G;
        if (videoBottomPanelView2 != null) {
            boolean z2 = (!M0() && z && this.r0) ? false : true;
            etn etnVar = this.K0;
            boolean z3 = this.B;
            VideoFile videoFile = this.C;
            videoBottomPanelView2.setVisibility(etnVar.f(z3, videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) ? 8 : z2 ? 4 : 0);
        }
    }

    private final void setCoverDisposable(io.reactivex.rxjava3.disposables.c cVar) {
        qcy<Object> qcyVar = T0[0];
        this.v0.b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProductBadgeMargins$lambda$132(VideoView videoView) {
        VkContentBadge vkContentBadge = videoView.getViewBinding().p;
        ViewGroup.LayoutParams layoutParams = videoView.getViewBinding().r.W3(videoView.getContext()).getLayoutParams();
        f4m.s(iah0.a(16) + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0), vkContentBadge);
    }

    public static s3q0 z(VideoView videoView) {
        videoView.getVkVideoLiveSDKRepository().getClass();
        return s3q0.a;
    }

    public final void A0() {
        je0 N0;
        if (this.b0) {
            return;
        }
        yg5 yg5Var = this.I;
        com.vk.libvideo.api.ad.a j = (yg5Var == null || (N0 = yg5Var.N0()) == null) ? null : ((ye0.a) N0).j();
        if ((j instanceof a.AbstractC1195a) && ((a.AbstractC1195a) j).c()) {
            return;
        }
        d3m.c(getViewBinding().w, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        yg5 yg5Var2 = this.I;
        boolean z = false;
        if (yg5Var2 != null && yg5Var2.P0()) {
            z = true;
        }
        if (getViewBinding().z.getSkipBackListener() != null && !z) {
            d3m.c(getViewBinding().x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (getViewBinding().z.getSkipForwardListener() == null || z) {
            return;
        }
        d3m.c(getViewBinding().y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void B0() {
        if (this.b0) {
            return;
        }
        d3m.e(getViewBinding().w, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        if (getViewBinding().z.getSkipBackListener() != null) {
            d3m.e(getViewBinding().x, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
        if (getViewBinding().z.getSkipForwardListener() != null) {
            d3m.e(getViewBinding().y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void C0() {
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            yg5Var.I();
        }
        if (((Boolean) this.G0.d.getValue()).booleanValue()) {
            yg5 yg5Var2 = this.I;
            if (yg5Var2 != null) {
                yg5Var2.e();
                return;
            }
            return;
        }
        yg5 yg5Var3 = this.I;
        if (yg5Var3 != null) {
            yg5Var3.play();
        }
    }

    public final void E0() {
        getViewBinding().r.W3(getContext()).post(new qb3(this, 16));
        int productBadgeShift = getProductBadgeShift();
        if (productBadgeShift != bwt0.M(getViewBinding().p)) {
            f4m.q(productBadgeShift, getViewBinding().p);
        }
    }

    @Override // xsna.hnt0
    public final void E3(VideoAutoPlay videoAutoPlay, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        S(videoAutoPlay, true);
        VideoFile videoFile = this.C;
        if (videoFile != null) {
            getIntervalDelegate().a(videoFile, this.M, this.u0);
        }
    }

    public final void F0(boolean z, Boolean bool) {
        getViewBinding().c.setVisibility(!(fxc0.B().J().S0() && (bool != null ? bool.booleanValue() : getViewBinding().d.getVisibility() == 0)) && z ? 0 : 8);
    }

    public final void G0(final boolean z, final boolean z2) {
        VideoView videoView;
        VideoFile videoFile;
        VideoRestriction O;
        yks0 yks0Var = this.z;
        final boolean z3 = (yks0Var == null || (videoFile = yks0Var.e) == null || (O = videoFile.O()) == null) ? true : O.f;
        if (getPowerManager().isPowerSaveMode()) {
            post(new Runnable() { // from class: xsna.spt0
                @Override // java.lang.Runnable
                public final void run() {
                    qcy<Object>[] qcyVarArr = VideoView.T0;
                    VideoView.H0(VideoView.this, z && z3, true, false, z2, 20);
                }
            });
            videoView = this;
        } else {
            videoView = this;
            H0(videoView, z && z3, true, false, z2, 20);
        }
        VideoFile videoFile2 = videoView.C;
        if (videoFile2 != null) {
            wzs<? super String, ? super Boolean, s3q0> wzsVar = videoView.p;
            if (wzsVar != null) {
                wzsVar.invoke(videoFile2.a1(), Boolean.valueOf(z));
            }
            f fVar = videoView.t;
            if (fVar != null) {
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) ((oq80) fVar).c;
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                videoMinimizableDiscoveryFragment.ko().Hf().getClass();
                if (videoMinimizableDiscoveryFragment.O0) {
                    return;
                }
                xn50.a.c(videoMinimizableDiscoveryFragment, new c.k(z));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024f  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.yks0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void He(List list, VideoFile videoFile) {
        yg5 yg5Var;
        boolean z;
        View fullscreenBottomBar;
        DonutVideoUiModel.PreviewBadge previewBadge;
        DonutVideoUiModel.PreviewBadge previewBadge2;
        DonutVideoUiModel.PreviewBadge previewBadge3;
        DonutPriceTemplate donutPriceTemplate;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        ViewTreeObserver viewTreeObserver3;
        ViewTreeObserver viewTreeObserver4;
        ActionLink m1;
        yg5 yg5Var2;
        rlt0 m0;
        String str = null;
        this.w0 = null;
        setLandscape(X0(getContext()));
        this.C = videoFile;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e2 = this.y.e(videoFile, null);
        this.I = e2;
        if (e2 != null) {
            P(videoFile, e2);
            S(e2, true);
        }
        List<VideoEpisode> Y3 = videoFile.Y3();
        ArrayList arrayList = new ArrayList(c5g.u(Y3, 10));
        for (VideoEpisode videoEpisode : Y3) {
            long j = videoEpisode.b;
            ucp ucpVar = ucp.a;
            arrayList.add(new oqs0(j, ucp.i(videoEpisode.c).toString()));
        }
        getViewBinding().r.H3(videoFile.getDuration(), arrayList);
        getIntervalDelegate().a(videoFile, this.M, this.u0);
        TimelineThumbs B0 = videoFile.B0();
        zqt0 zqt0Var = this.G0;
        if (B0 != null) {
            getViewBinding().r.setTimelineThumbs(new axo0(B0));
            getViewBinding().C.setTimelineImages((!zqt0Var.b() || s0()) ? null : new axo0(B0));
        } else {
            getViewBinding().r.setTimelineThumbs(null);
            if (zqt0Var.b()) {
                getViewBinding().C.setTimelineImages(null);
            }
        }
        kox intervalDelegate = getIntervalDelegate();
        boolean z2 = this.B;
        boolean z3 = this.M;
        boolean e3 = intervalDelegate.a.e(Boolean.valueOf(videoFile.T1()));
        jox joxVar = new jox(e3, z2, z3, Boolean.valueOf(videoFile.T1()));
        if (!epx.f(intervalDelegate.d, joxVar)) {
            intervalDelegate.d = joxVar;
            if (e3) {
                xqt0 xqt0Var = intervalDelegate.b;
                int a2 = iah0.a(z2 ? 12 : 4);
                SetBuilder setBuilder = new SetBuilder();
                if (z3 || intervalDelegate.c.a()) {
                    setBuilder.add(UIPlayerSeek.IntervalsDisplayConfig.Orientation.LANDSCAPE);
                    setBuilder.add(UIPlayerSeek.IntervalsDisplayConfig.Orientation.PORTRAIT);
                }
                xqt0Var.r.setIntervalsDisplayConfig(new UIPlayerSeek.IntervalsDisplayConfig(false, setBuilder.d(), new UIPlayerSeek.IntervalsDisplayConfig.a("·", a2, a2)));
            }
        }
        N(videoFile);
        yg5 yg5Var3 = this.I;
        if (yg5Var3 != null) {
            yg5Var3.f0(this);
        }
        Q(videoFile);
        yks0 yks0Var = this.z;
        if (yks0Var != null) {
            yks0Var.j(videoFile);
        }
        getViewBinding().o.a(new a20(videoFile, this.M));
        Y(this.M ? 600L : 300L);
        VideoFile videoFile2 = this.C;
        if (videoFile2 != null && (m1 = videoFile2.m1()) != null && (yg5Var2 = this.I) != null && (m0 = yg5Var2.m0()) != null) {
            Bundle b2 = qr.b(CampaignEx.JSON_KEY_LINK_TYPE, m1.c, "value", m1.e);
            b2.putString(NotificationCompat.CATEGORY_EVENT, "show_link");
            m0.h(b2);
        }
        yg5 yg5Var4 = this.I;
        if ((yg5Var4 != null && yg5Var4.isPlaying()) || ((yg5Var = this.I) != null && yg5Var.w0())) {
            setKeepScreenOn(true);
        }
        e1();
        VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.j;
        if (videoBottomPanelView != null && (viewTreeObserver4 = videoBottomPanelView.getViewTreeObserver()) != null) {
            viewTreeObserver4.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        VideoPlayerAdsPanel videoPlayerAdsPanel = getViewBinding().I;
        ypt0 ypt0Var = this.l;
        if (videoPlayerAdsPanel != null && (viewTreeObserver3 = videoPlayerAdsPanel.getViewTreeObserver()) != null) {
            viewTreeObserver3.removeOnGlobalLayoutListener(ypt0Var);
        }
        VideoFullscreenBottomBarView fullscreenBottomBar2 = getFullscreenBottomBar();
        wpt0 wpt0Var = this.k;
        if (fullscreenBottomBar2 != null && (viewTreeObserver2 = fullscreenBottomBar2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(wpt0Var);
        }
        boolean z4 = getViewBinding().G != null;
        if (getFullscreenBottomBar() != null && this.M) {
            etn etnVar = this.K0;
            boolean z5 = this.B;
            VideoFile videoFile3 = this.C;
            if (etnVar.f(z5, videoFile3 != null ? Boolean.valueOf(videoFile3.T1()) : null)) {
                z = true;
                if (!z) {
                    onGlobalLayoutListener = wpt0Var;
                } else if (!z4) {
                    onGlobalLayoutListener = ypt0Var;
                }
                fullscreenBottomBar = !z ? getFullscreenBottomBar() : z4 ? getViewBinding().G : getViewBinding().I;
                if (fullscreenBottomBar != null && (viewTreeObserver = fullscreenBottomBar.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                Integer K2 = videoFile.K2();
                int intValue = K2 == null ? K2.intValue() : 0;
                this.x0 = intValue <= 0;
                getViewBinding().p.setText(intValue != 1 ? getResources().getString(R.string.video_product_attach_single_product_badge) : getResources().getQuantityString(R.plurals.video_product_attach_badge, intValue, Integer.valueOf(intValue)));
                getViewBinding().p.setCapsule(false);
                a0();
                getViewBinding().g.i(new VideoSkippablePartView.a(null, getViewBinding().z.getPlayerState(), this.C, new lxh0(this, 13), new mvl0(this, 15), 9));
                if (getDonutVideoComponent().J().a()) {
                    kzn donutDelegate = getDonutDelegate();
                    boolean h2 = getMinifiedState().h();
                    yg5 yg5Var5 = this.I;
                    Integer valueOf = yg5Var5 != null ? Integer.valueOf(yg5Var5.h0().a) : null;
                    yg5 yg5Var6 = this.I;
                    Integer valueOf2 = yg5Var6 != null ? Integer.valueOf(yg5Var6.h0().b) : null;
                    xqt0 xqt0Var2 = donutDelegate.b;
                    if (e5o.a(videoFile)) {
                        DonutVideoUiModel a3 = donutDelegate.a.wb().a(nkt0.a(videoFile), DonutVideoCardSource.PLAYER);
                        xqt0Var2.E.setText((a3 == null || (previewBadge3 = a3.b) == null || (donutPriceTemplate = previewBadge3.c) == null) ? (a3 == null || (previewBadge = a3.b) == null) ? null : previewBadge.b : y1o.b(donutPriceTemplate, xqt0Var2.E.getContext()));
                        DonutBadge donutBadge = xqt0Var2.E;
                        if (a3 != null && (previewBadge2 = a3.b) != null) {
                            str = previewBadge2.d;
                        }
                        donutBadge.setContentDescription(str);
                        donutDelegate.b(videoFile, h2);
                        donutDelegate.a(new dzn(videoFile, xqt0Var2.M, valueOf, valueOf2, xqt0Var2.c.getTransformController().e, h2));
                    } else {
                        donutDelegate.b(videoFile, h2);
                    }
                }
                if (zqt0Var.b()) {
                    return;
                }
                getViewBinding().r.setSeekBarAlwaysVisible(r0());
                getViewBinding().r.setExtendSeekBarEnabled((!((Boolean) zqt0Var.h.getValue()).booleanValue() || s0() || videoFile.B0() == null) ? false : true);
                return;
            }
        }
        z = false;
        if (!z) {
        }
        if (!z) {
        }
        if (fullscreenBottomBar != null) {
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        Integer K22 = videoFile.K2();
        if (K22 == null) {
        }
        this.x0 = intValue <= 0;
        getViewBinding().p.setText(intValue != 1 ? getResources().getString(R.string.video_product_attach_single_product_badge) : getResources().getQuantityString(R.plurals.video_product_attach_badge, intValue, Integer.valueOf(intValue)));
        getViewBinding().p.setCapsule(false);
        a0();
        getViewBinding().g.i(new VideoSkippablePartView.a(null, getViewBinding().z.getPlayerState(), this.C, new lxh0(this, 13), new mvl0(this, 15), 9));
        if (getDonutVideoComponent().J().a()) {
        }
        if (zqt0Var.b()) {
        }
    }

    public final boolean I0() {
        VideoFile videoFile = this.C;
        Boolean valueOf = videoFile != null ? Boolean.valueOf(videoFile.T1()) : null;
        Context context = getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            return this.G0.a() || this.K0.e(valueOf) || this.K0.h(valueOf) || this.K0.k(valueOf);
        }
        return false;
    }

    public final boolean J0() {
        yg5 yg5Var;
        if (this.M) {
            etn etnVar = this.K0;
            boolean z = this.B;
            VideoFile videoFile = this.C;
            if (etnVar.f(z, videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) && !n0() && (((yg5Var = this.I) == null || !yg5Var.P0()) && this.M && !this.H && !this.c0)) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.hnt0
    public final void J3(yg5 yg5Var, int i2, int i3, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        h3(yg5Var, i2, i3);
    }

    public final boolean L0() {
        VideoFile videoFile = this.C;
        boolean T1 = videoFile != null ? videoFile.T1() : false;
        if ((this.M ? this.K0.j(this.B, Boolean.valueOf(T1)) : this.G0.a() && !T1) && !n0()) {
            yg5 yg5Var = this.I;
            if (!(yg5Var != null && yg5Var.P0()) && !this.c0) {
                return false;
            }
        }
        return true;
    }

    public final boolean M0() {
        a78 a78Var = this.L;
        if (a78Var instanceof a78.b) {
            return true;
        }
        if (a78Var instanceof a78.c) {
            return this.B;
        }
        if (a78Var instanceof a78.a) {
            return ((Boolean) ((a78.a) a78Var).a.invoke()).booleanValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(VideoFile videoFile) {
        boolean z;
        boolean z2;
        yg5 yg5Var;
        boolean z3;
        yg5 yg5Var2;
        boolean z4;
        d3b0 v0;
        ImageSize imageUrl = getImageUrl();
        if (videoFile.getWidth() > 0 && videoFile.getHeight() > 0) {
            PreviewImageView previewImageView = getViewBinding().d;
            int width = videoFile.getWidth();
            int height = videoFile.getHeight();
            previewImageView.c = width;
            previewImageView.d = height;
        } else if (imageUrl != null) {
            PreviewImageView previewImageView2 = getViewBinding().d;
            com.vk.dto.common.im.Image image = imageUrl.d;
            int i2 = image.b;
            int i3 = image.c;
            previewImageView2.c = i2;
            previewImageView2.d = i3;
        }
        t0(getImageUrl());
        yg5 yg5Var3 = this.I;
        if (yg5Var3 == null || (v0 = yg5Var3.v0()) == null) {
            z = false;
        } else {
            gpt0 gpt0Var = gpt0.a;
            z = epx.f(gpt0.A(v0), Boolean.TRUE);
        }
        boolean z5 = true;
        if (z) {
            yg5 yg5Var4 = this.I;
            if (!(yg5Var4 != null && yg5Var4.J())) {
                yg5 yg5Var5 = this.I;
                if (!(yg5Var5 != null && yg5Var5.a())) {
                    z4 = false;
                    b0(videoFile, true, false, z4);
                    return;
                }
            }
            z4 = true;
            b0(videoFile, true, false, z4);
            return;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            yg5 yg5Var6 = this.I;
            if (!((yg5Var6 == null || yg5Var6.isPrepared()) ? false : true)) {
                yg5 yg5Var7 = this.I;
                if (!(yg5Var7 != null && yg5Var7.a())) {
                    z3 = false;
                    yg5Var2 = this.I;
                    if (!(yg5Var2 == null && yg5Var2.J())) {
                        yg5 yg5Var8 = this.I;
                        if (!(yg5Var8 != null && yg5Var8.a())) {
                            z5 = false;
                        }
                    }
                    b0(videoFile, z3, false, z5);
                    return;
                }
            }
            z3 = true;
            yg5Var2 = this.I;
            if (!(yg5Var2 == null && yg5Var2.J())) {
            }
            b0(videoFile, z3, false, z5);
            return;
        }
        yg5 yg5Var9 = this.I;
        if (!((yg5Var9 == null || yg5Var9.isPrepared()) ? false : true)) {
            yg5 yg5Var10 = this.I;
            if (!(yg5Var10 != null && yg5Var10.a())) {
                z2 = false;
                yg5Var = this.I;
                if (!(yg5Var == null && yg5Var.J())) {
                    yg5 yg5Var11 = this.I;
                    if (!(yg5Var11 != null && yg5Var11.a())) {
                        z5 = false;
                    }
                }
                b0(videoFile, z2, false, z5);
            }
        }
        z2 = true;
        yg5Var = this.I;
        if (!(yg5Var == null && yg5Var.J())) {
        }
        b0(videoFile, z2, false, z5);
    }

    public final void N0() {
        d3b0 v0;
        OneVideoPlayer a2;
        d3b0 v02;
        OneVideoPlayer a3;
        setKeepScreenOn(false);
        G0(true, false);
        setEndMenuVisible(true);
        PreviewImageView previewImageView = getViewBinding().d;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        previewImageView.setContentScaleType(VideoTextureView.a.a(getVideoScaleType()));
        B0();
        yg5 yg5Var = this.I;
        long j = 0;
        long j2 = 1000;
        int duration = (int) (((yg5Var == null || (v02 = yg5Var.v0()) == null || (a3 = v02.a()) == null) ? 0L : a3.getDuration()) / j2);
        yg5 yg5Var2 = this.I;
        if (yg5Var2 != null && (v0 = yg5Var2.v0()) != null && (a2 = v0.a()) != null) {
            j = a2.getCurrentPosition();
        }
        int i2 = (int) (j / j2);
        float f2 = duration != 0 ? i2 / duration : 1.0f;
        if (duration == i2 || f2 > 0.98f) {
            setEndMenuVisible(true);
        }
        VideoFile videoFile = this.C;
        if (videoFile != null) {
            getViewBinding().a.c(new djs0(videoFile).c(), true);
            if (videoFile.F4().j()) {
                bwt0.p0(getViewBinding().a.d, false);
                bwt0.p0(getViewBinding().a.e, false);
                bwt0.p0(getViewBinding().a.f, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void O(one.video.player.tracks.c cVar) {
        VideoFile videoFile;
        if (((Boolean) this.G0.i.getValue()).booleanValue()) {
            if (this.y0 == null && cVar != null && (videoFile = this.C) != null) {
                N(videoFile);
            }
            this.y0 = cVar;
        }
    }

    public final void O0() {
        Collection collection;
        LinearLayout linearLayout;
        VideoFile A;
        dpe0 w4;
        yg5 yg5Var = this.I;
        if (yg5Var == null || (A = yg5Var.A()) == null || (w4 = A.w4()) == null || (collection = w4.a().values()) == null) {
            collection = EmptyList.b;
        }
        if (collection.isEmpty() || getMinifiedState().h() || (linearLayout = getViewBinding().J) == null) {
            return;
        }
        String str = (String) j5g.Z(j5g.S0(c5g.v(collection)));
        if (str != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            appCompatTextView.setText(str);
            appCompatTextView.setClickable(true);
            appCompatTextView.setFocusable(true);
            appCompatTextView.setForeground(appCompatTextView.getContext().getDrawable(R.drawable.white_ripple_bounded_4dp));
            appCompatTextView.setTextColor(-1);
            float f2 = 8;
            appCompatTextView.setCompoundDrawablePadding(iah0.a(f2));
            appCompatTextView.setIncludeFontPadding(false);
            appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(-1));
            com.vk.typography.b.k(appCompatTextView, FontFamily.BOLD, Float.valueOf(15.0f), 4);
            Drawable a2 = m33.a(R.drawable.vk_icon_stars_16, appCompatTextView.getContext());
            a2.setTint(-1);
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
            appCompatTextView.setBackground(appCompatTextView.getContext().getDrawable(R.drawable.bg_rounded_4));
            appCompatTextView.setBackgroundTintList(ColorStateList.valueOf(appCompatTextView.getContext().getColor(R.color.vk_black_alpha45)));
            float f3 = 6;
            appCompatTextView.setPadding(iah0.a(f2), iah0.a(f3), iah0.a(f2), iah0.a(f3));
            bwt0.i0(appCompatTextView, new aqt0(0, this, appCompatTextView));
            linearLayout.addView(appCompatTextView, new ViewGroup.LayoutParams(-2, -2));
            TooltipType tooltipType = TooltipType.NEURO;
            yg5 yg5Var2 = this.I;
            alt0 alt0Var = this.h0;
            alt0Var.getClass();
            alt0Var.a(Collections.singletonList(tooltipType), yg5Var2);
        }
        linearLayout.setVisibility(0);
        postDelayed(this.E0, 4000L);
        post(new e6(10, this, linearLayout));
        linearLayout.setTranslationY(this.r0 ? iah0.b(48.0f) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void P(VideoFile videoFile, yg5 yg5Var) {
        VideoFile videoFile2;
        int measuredHeight;
        boolean z;
        VideoTopBarView topBar;
        VideoToolbarView videoToolbarView;
        Owner s;
        String P;
        VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
        fbs0 fbs0Var = this.b;
        boolean z2 = false;
        if (videoBottomPanelView != null) {
            boolean z3 = this.M && this.K0.f(this.B, Boolean.valueOf(videoFile.T1()));
            setBottomPanelVisibility((videoFile.isExternal() || z3 || this.c0) ? false : true);
            if (!z3 && this.M) {
                videoBottomPanelView.setButtonsOnClickListener(fbs0Var);
                videoBottomPanelView.setShowPlaylist(this.Q);
                videoBottomPanelView.P4(videoFile, this.M);
                TooltipType tooltipType = TooltipType.DOWNLOAD;
                yg5 yg5Var2 = this.I;
                alt0 alt0Var = this.h0;
                alt0Var.getClass();
                alt0Var.a(Collections.singletonList(tooltipType), yg5Var2);
            }
            s3q0 s3q0Var = s3q0.a;
        }
        boolean z4 = (!this.K0.f(this.B, Boolean.valueOf(videoFile.T1())) || !this.M || videoFile.isExternal() || this.H || this.c0) ? false : true;
        VideoFullscreenBottomBarView fullscreenBottomBar = getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
            fullscreenBottomBar.a(new vxs(this.B, this.M, this.D, videoFile, this.Q, videoFile.J8()));
        }
        VideoFullscreenBottomBarView fullscreenBottomBar2 = getFullscreenBottomBar();
        if (fullscreenBottomBar2 != null) {
            fullscreenBottomBar2.setVisibility(z4 ? 0 : 8);
        }
        boolean z5 = (getAuthBridge().a(videoFile.I0()) || ((s = videoFile.s()) != null && fkq0.d(s.b)) || (P = videoFile.P()) == null || P.length() == 0 || videoFile.L9()) ? false : true;
        VideoTopBarView topBar2 = getTopBar();
        if (topBar2 != null) {
            boolean z6 = this.B;
            boolean z7 = this.M;
            DonutVideoUiModel a2 = getDonutVideoComponent().wb().a(nkt0.a(videoFile), DonutVideoCardSource.PLAYER);
            boolean U = videoFile.U();
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            boolean a3 = com.vk.libvideo.autoplay.e.a();
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                qu5.c().getClass();
            }
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            videoFile2 = videoFile;
            topBar2.a(new q8p0(z6, z7, videoFile2, a2, z5, U, a3, false, v0(b.C1208b.a().x)));
        } else {
            videoFile2 = videoFile;
        }
        VideoTopBarView topBar3 = getTopBar();
        if (topBar3 != null) {
            topBar3.setSmallScreenMode(this.H && this.B);
        }
        if (!yg5Var.P0()) {
            View view = this.N;
            if (view != null) {
                view.setVisibility(8);
            }
            getViewBinding().q.setVisibility(8);
        }
        if (((Boolean) this.h.getValue()).booleanValue()) {
            measuredHeight = iah0.a(this.B ? 30 : 90);
        } else {
            VideoToolbarView videoToolbarView2 = getViewBinding().H;
            measuredHeight = (videoToolbarView2 != null ? videoToolbarView2.getMeasuredHeight() : 0) + (this.B ? 0 : iah0.a(16));
        }
        f4m.t(measuredHeight, getViewBinding().B);
        if (videoFile2.isExternal()) {
            return;
        }
        getViewBinding().getClass();
        long position = (yg5Var.isPlaying() || yg5Var.getPosition() > 0) ? yg5Var.getPosition() : j.b(yg5Var.A());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(position);
        long seconds2 = timeUnit.toSeconds(yg5Var.getDuration());
        UIPlayerSeek uIPlayerSeek = getViewBinding().r;
        uIPlayerSeek.setCurrentVideoDurationSeconds(seconds2);
        uIPlayerSeek.setCurrentVideoPosition(seconds);
        uIPlayerSeek.W1(new UIPlayerSeek.a(this.B, !videoFile2.q0(), !videoFile2.q0(), this.A != null));
        uIPlayerSeek.setPreviewPlaceholder(enj.e(R.drawable.vk_icon_globe_cross_outline_20, R.attr.vk_ui_icon_secondary, getContext()));
        VideoButtonsView videoButtonsView = getViewBinding().u;
        boolean z8 = this.A != null;
        boolean booleanValue = ((Boolean) this.G0.c.getValue()).booleanValue();
        boolean z9 = this.R;
        videoButtonsView.getClass();
        videoButtonsView.D = z8;
        videoButtonsView.v.setVisibility(!z8 ? 0 : 8);
        videoButtonsView.setTechBugreportButtonVisibility(booleanValue);
        videoButtonsView.B.setVisibility(z9 ? 0 : 8);
        VideoPlayerAdsPanel videoPlayerAdsPanel = getViewBinding().I;
        if (videoPlayerAdsPanel != null) {
            videoPlayerAdsPanel.d = this.A;
            videoPlayerAdsPanel.a();
            videoPlayerAdsPanel.setButtonOnClickListener(fbs0Var);
            s3q0 s3q0Var2 = s3q0.a;
        }
        if (this.M) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            View fullscreenBottomBar3 = getViewBinding().I == null ? getFullscreenBottomBar() != null ? getFullscreenBottomBar() : getViewBinding().G : getViewBinding().I;
            if (fullscreenBottomBar3 != null && fullscreenBottomBar3.getMeasuredHeight() == 0) {
                fullscreenBottomBar3.measure(makeMeasureSpec, makeMeasureSpec);
            }
            VideoToolbarView videoToolbarView3 = getViewBinding().H;
            if (videoToolbarView3 != null && videoToolbarView3.getMeasuredHeight() == 0 && (videoToolbarView = getViewBinding().H) != null) {
                videoToolbarView.measure(makeMeasureSpec, makeMeasureSpec);
            }
            VideoTopBarView topBar4 = getTopBar();
            if (topBar4 != null && topBar4.getMeasuredHeight() == 0 && (topBar = getTopBar()) != null) {
                topBar.measure(makeMeasureSpec, makeMeasureSpec);
            }
        }
        VideoEndView videoEndView = getViewBinding().a;
        if (!videoFile2.i9() || getAuthBridge().a(videoFile2.I0()) || n0()) {
            z = false;
        } else {
            fxc0.B().getClass();
            z = true;
        }
        bwt0.p0(videoEndView.e, z);
        if (videoFile2.i0() && !n0() && !this.P) {
            fxc0.B().getClass();
            z2 = true;
        }
        bwt0.p0(videoEndView.d, z2);
        videoEndView.c(new djs0(videoFile2).c(), true);
        a1(videoFile);
        if (yg5Var.d() && !videoFile2.Z9()) {
            P0(true);
        } else if (yg5Var.a()) {
            N0();
        }
        a0();
    }

    public final void P0(boolean z) {
        VideoFile videoFile;
        if (getDonutVideoComponent().J().a() && (videoFile = this.C) != null && e5o.a(videoFile) && z) {
            return;
        }
        if (!z || getMinifiedState() == AutoPlayMinifiedState.MINIPLAYER) {
            bv9 bv9Var = this.n0;
            if (bv9Var != null) {
                i0q0.g(bv9Var);
            }
            this.n0 = null;
            d3m.e(getViewBinding().f, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new tw3(this, 26), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            return;
        }
        if (this.n0 == null) {
            bv9 bv9Var2 = new bv9(this, 18);
            this.n0 = bv9Var2;
            i0q0.d(500L, bv9Var2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void Q(VideoFile videoFile) {
        boolean c2 = fxc0.B().c(videoFile);
        yg5 yg5Var = this.I;
        boolean z = yg5Var != null && yg5Var.B();
        io.reactivex.rxjava3.disposables.c cVar = this.D0;
        if (cVar != null) {
            cVar.dispose();
        }
        this.D0 = null;
        if (videoFile.l6() == 1) {
            R(VideoOverlayView.c.e.a);
            return;
        }
        if (videoFile.z0() && videoFile.Na() > 0) {
            R(new VideoOverlayView.c.d(videoFile.Na() * 1000, getMinifiedState() != AutoPlayMinifiedState.NONE, epx.f(videoFile.P8(), Boolean.TRUE), fxc0.B().J().n1(), new com.vk.libvideo.design.view.video.a(0, new umz(), videoFile), new x2j0(this, 17)));
            return;
        }
        if (videoFile.z0()) {
            R(new VideoOverlayView.c.C1234c(getResources().getString(R.string.live_stream_upcoming_description), new fyd0(this, 26)));
            return;
        }
        if (videoFile.l6() == 3) {
            R(new VideoOverlayView.c.a(getResources().getString(R.string.live_stream_end_description)));
            return;
        }
        yks0 yks0Var = this.z;
        if (yks0Var != null && yks0Var.d) {
            R(new VideoOverlayView.c.g(getResources().getString(R.string.video_such_videos_will_be_shown_less), getResources().getString(R.string.video_hide_cancel), new q3s0(videoFile, 3)));
            return;
        }
        if (!c2 || !z) {
            if (!videoFile.Z9()) {
                F0(true, null);
                f4m.j(getViewBinding().l);
                return;
            }
            if (getDonutVideoComponent().J().a() && e5o.a(videoFile)) {
                F0(false, null);
                f4m.j(getViewBinding().l);
                f4m.j(getViewBinding().n);
                getDonutDelegate().b(videoFile, getMinifiedState().h());
                return;
            }
            F0(true, null);
            f4m.j(getViewBinding().l);
            getViewBinding().n.setVisibility(videoFile.Z9() ? 0 : 8);
            VideoRestrictionView videoRestrictionView = getViewBinding().n;
            String J1 = videoFile.J1();
            TextView textView = videoRestrictionView.b;
            bwt0.p0(textView, true);
            if (J1 == null || J1.length() == 0) {
                J1 = videoRestrictionView.getContext().getString(R.string.error);
            }
            textView.setText(J1);
            bwt0.p0(videoRestrictionView.c, false);
            return;
        }
        if (this.M && getImageUrl() == null) {
            VideoOverlayView videoOverlayView = getViewBinding().l;
            int width = videoFile.getWidth();
            int height = videoFile.getHeight();
            videoOverlayView.getClass();
            if (width <= 0 || height <= 0) {
                videoOverlayView.j5(16, 9);
            } else {
                videoOverlayView.j5(width, height);
            }
        }
        getViewBinding().l.setCoverContentScaleType(getViewBinding().c.getTransformController().e);
        F0(false, null);
        getViewBinding().l.setVisibility(0);
        f4m.j(getViewBinding().n);
        VideoRestriction O = videoFile.O();
        if (O != null) {
            o7k0 o7k0Var = new o7k0(4, videoFile, this);
            Image image = new Image((List<ImageSize>) e43.m(getImageUrl()));
            com.vk.libvideo.design.view.overlay.b a2 = getOverlayRestrictionMapper().a(O);
            com.vk.libvideo.design.view.overlay.a a3 = getOverlayImageMapper().a(image);
            getViewBinding().l.Z4((i1t0) this.G0.k.getValue(), getMinifiedState() == AutoPlayMinifiedState.MINIPLAYER ? new VideoOverlayView.c.f(a2, a3, o7k0Var) : new VideoOverlayView.c.i(a2, a3, O.d, o7k0Var));
        }
        io.reactivex.rxjava3.disposables.c subscribe = wjs0.b.a0(io.reactivex.rxjava3.android.schedulers.a.b()).b0(ayr0.class).subscribe(new qgs0(new r6i0(this, 21), 2));
        hg1.b(this, subscribe);
        this.D0 = subscribe;
    }

    public final void Q0(a.AbstractC1195a abstractC1195a) {
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            Activity b2 = enj.b(this);
            FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
            VideoFile videoFile = this.C;
            if (fragmentActivity == null || videoFile == null) {
                return;
            }
            ydt0 Y = fxc0.B().Y();
            VideoAdData videoAdData = new VideoAdData(videoFile, new Size(abstractC1195a.a().getWidth(), abstractC1195a.a().getHeight()).toString(), yg5Var.w0());
            no2 no2Var = this.r;
            Y.a(fragmentActivity, videoAdData, no2Var != null ? no2Var.Ia() : null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void R(VideoOverlayView.c cVar) {
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            yg5Var.pause();
        }
        G0(false, false);
        getViewBinding().l.setVisibility(0);
        getViewBinding().l.Z4((i1t0) this.G0.k.getValue(), cVar);
    }

    public final void R0(boolean z, boolean z2) {
        yg5 yg5Var = this.I;
        if (yg5Var == null || !yg5Var.P0()) {
            return;
        }
        if (z) {
            if (z2) {
                View view = this.N;
                if (view != null) {
                    d3m.c(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                d3m.c(getViewBinding().q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
            View view2 = this.N;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            getViewBinding().q.setVisibility(0);
            return;
        }
        if (z2) {
            View view3 = this.N;
            if (view3 != null) {
                d3m.e(view3, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
            d3m.e(getViewBinding().q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        View view4 = this.N;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        getViewBinding().q.setVisibility(8);
    }

    @Override // xsna.hnt0
    public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        ControlsState.CastStatus v0 = v0(mediaRouteConnectStatus);
        VideoTopBarView topBar = getTopBar();
        if (topBar != null) {
            topBar.b(null);
            com.vk.fullscreenvideo.design.view.top.a aVar = topBar.i;
            if (aVar != null) {
                aVar.a(v0);
            }
        }
        VideoFullscreenBottomBarView fullscreenBottomBar = getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
            fullscreenBottomBar.c(null);
            com.vk.fullscreenvideo.design.view.bottom.a aVar2 = fullscreenBottomBar.e;
            if (aVar2 != null) {
                aVar2.a(v0);
            }
        }
        if (I0()) {
            getViewBinding().u.Q4(ControlsIcon.CHROME_CAST, false);
        } else {
            List<VideoUrl> list = zhr0.a;
            VideoButtonsView videoButtonsView = getViewBinding().u;
            int i2 = zhr0.b.$EnumSwitchMapping$0[mediaRouteConnectStatus.ordinal()];
            if (i2 == 1) {
                videoButtonsView.setChromeCastActive(false);
                videoButtonsView.Q4(ControlsIcon.CHROME_CAST, true);
            } else if (i2 == 2) {
                videoButtonsView.setChromeCastActive(false);
                videoButtonsView.Q4(ControlsIcon.CHROME_CAST, true);
            } else if (i2 == 3) {
                videoButtonsView.setChromeCastActive(false);
                videoButtonsView.Q4(ControlsIcon.CHROME_CAST, true);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                videoButtonsView.setChromeCastActive(true);
                videoButtonsView.Q4(ControlsIcon.CHROME_CAST, true);
            }
        }
        a0();
    }

    public final void S(yg5 yg5Var, boolean z) {
        TransformController.ScaleType scaleType;
        TransformController.ScaleType scaleType2;
        AdBannerData a2;
        je0 N0 = yg5Var.N0();
        Size size = null;
        com.vk.libvideo.api.ad.a j = N0 != null ? ((ye0.a) N0).j() : null;
        a.AbstractC1195a abstractC1195a = j instanceof a.AbstractC1195a ? (a.AbstractC1195a) j : null;
        if (abstractC1195a != null && (a2 = abstractC1195a.a()) != null) {
            size = new Size(a2.getWidth(), a2.getHeight());
        }
        if (yg5Var.P0() && size != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            VideoResizer.VideoFitType videoFitType = VideoResizer.VideoFitType.FIT;
            getViewBinding().c.getMatrixProvider().l(width, height);
            VideoTextureView videoTextureView = getViewBinding().c;
            SoftReference<Bitmap> softReference = VideoTextureView.r;
            int i2 = VideoTextureView.a.C1236a.$EnumSwitchMapping$0[videoFitType.ordinal()];
            if (i2 == 1) {
                scaleType2 = TransformController.ScaleType.CROP;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scaleType2 = TransformController.ScaleType.FIT;
            }
            videoTextureView.i(scaleType2, false);
        } else if (z) {
            int i3 = yg5Var.h0().a;
            int i4 = yg5Var.h0().b;
            SoftReference<Bitmap> softReference2 = VideoTextureView.r;
            VideoResizer.VideoFitType a3 = VideoTextureView.a.a(getVideoScaleType());
            getViewBinding().c.getMatrixProvider().l(i3, i4);
            VideoTextureView videoTextureView2 = getViewBinding().c;
            int i5 = VideoTextureView.a.C1236a.$EnumSwitchMapping$0[a3.ordinal()];
            if (i5 == 1) {
                scaleType = TransformController.ScaleType.CROP;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                scaleType = TransformController.ScaleType.FIT;
            }
            videoTextureView2.i(scaleType, false);
        }
        post(new wk(this, 20));
    }

    public final void S0() {
        yg5 yg5Var;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        com.vk.toggle.b.A.a(videoFeatures);
        boolean z = !this.r0;
        G0(z, false);
        u8l u8lVar = this.q;
        if (u8lVar != null) {
            u8lVar.zb(z);
        }
        if (!this.r0 || (yg5Var = this.I) == null || yg5Var.a()) {
            return;
        }
        l0();
    }

    public final void T() {
        gv2 gv2Var = this.o0;
        if (gv2Var != null) {
            i0q0.g(gv2Var);
        }
        this.o0 = null;
    }

    @Override // xsna.hnt0
    public final void T0(VideoAutoPlay videoAutoPlay) {
        if (!videoAutoPlay.J()) {
            d3m.e(getViewBinding().h, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
        P0(!this.b0);
    }

    @Override // xsna.hnt0
    public final void U(VideoAutoPlay videoAutoPlay) {
        getViewBinding().z.setPlayerState(PlayerState.PAUSE);
        b0(this.C, true, false, false);
        G0(false, false);
        P0(false);
    }

    @Override // xsna.hnt0
    public final void U3(DownloadInfo downloadInfo) {
        VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
        if (videoBottomPanelView != null) {
            VideoBottomBarView videoBottomBarView = videoBottomPanelView.v;
            videoBottomBarView.getClass();
            if (fxc0.B().s().isEnabled()) {
                videoBottomBarView.i.c(gpt0.F(downloadInfo), downloadInfo != null ? downloadInfo.a : null);
            }
        }
        VideoFullscreenBottomBarView fullscreenBottomBar = getFullscreenBottomBar();
        if (fullscreenBottomBar == null || !fxc0.B().s().isEnabled()) {
            return;
        }
        fullscreenBottomBar.c(null);
        com.vk.fullscreenvideo.design.view.bottom.a aVar = fullscreenBottomBar.e;
        if (aVar != null) {
            aVar.m(downloadInfo);
        }
    }

    public final void V(Configuration configuration) {
        Object obj;
        Object obj2;
        Y0(configuration);
        getViewBinding().j.b();
        getViewBinding().k.hide();
        getViewBinding().r.U1(new UIPlayerSeek.c(false, this.r0));
        getViewBinding().u.P4(new xwp0.a(false, this.r0));
        VideoPlayerAdsPanel videoPlayerAdsPanel = getViewBinding().I;
        if (videoPlayerAdsPanel != null) {
            int i2 = videoPlayerAdsPanel.c;
            int i3 = configuration.orientation;
            if (i2 != i3) {
                videoPlayerAdsPanel.c = i3;
                videoPlayerAdsPanel.b(videoPlayerAdsPanel.getContext());
            }
        }
        VideoFile videoFile = this.C;
        if (videoFile != null) {
            He(EmptyList.b, videoFile);
        }
        postDelayed(new tn9(this, 23), 50L);
        c1();
        i560.d.a();
        a0();
        Z0();
        if (this.c0) {
            List l = e43.l(getViewBinding().L, getViewBinding().H, getViewBinding().v);
            List l2 = e43.l(getViewBinding().G, getViewBinding().K);
            Iterator it = l.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                View view = (View) obj2;
                if (view != null && view.getVisibility() == 0) {
                    break;
                }
            }
            View view2 = (View) obj2;
            if (view2 != null) {
                view2.setVisibility(4);
                view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            Iterator it2 = l2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                View view3 = (View) next;
                if (view3 != null && view3.getVisibility() == 0) {
                    obj = next;
                    break;
                }
            }
            View view4 = (View) obj;
            if (view4 != null) {
                view4.setVisibility(4);
                view4.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public final void V0() {
        View view;
        zqt0 zqt0Var = this.G0;
        if (zqt0Var.b() && zqt0Var.a()) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context) || this.M) {
                f4m.r(iah0.a(8), getViewBinding().u);
                Object parent = getViewBinding().s.getParent();
                view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    f4m.s(0, view);
                    return;
                }
                return;
            }
            f4m.r(iah0.a(11), getViewBinding().u);
            Object parent2 = getViewBinding().s.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
            if (view != null) {
                f4m.s(iah0.a(8), view);
            }
        }
    }

    @Override // xsna.hnt0
    public final void V3(yg5 yg5Var) {
        OneVideoPlayer a2;
        PlayerState playerState = getViewBinding().z.getPlayerState();
        PlayerState playerState2 = (yg5Var.isPlaying() || yg5Var.w0()) ? PlayerState.PLAYING : PlayerState.PAUSE;
        getViewBinding().z.setPlayerState(playerState2);
        S(yg5Var, !(playerState == PlayerState.PAUSE && playerState2 == PlayerState.PLAYING));
        PreviewImageView previewImageView = getViewBinding().d;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        previewImageView.setContentScaleType(VideoTextureView.a.a(getVideoScaleType()));
        d3b0 v0 = yg5Var.v0();
        if (((v0 == null || (a2 = v0.a()) == null) ? null : a2.getState()) == OneVideoPlayer.State.PLAYING) {
            d4(yg5Var);
        }
        d3m.e(getViewBinding().h, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        setEndMenuVisible(false);
        P0(false);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        com.vk.toggle.b.A.a(videoFeatures);
        gpt0 gpt0Var = gpt0.a;
        if (!epx.f(gpt0.A(yg5Var.v0()), Boolean.TRUE)) {
            b0(this.C, false, true, false);
        }
        setKeepScreenOn(true);
        if (getViewBinding().w.getVisibility() == 0) {
            k0();
        }
        i560.d.a();
        getViewBinding().g.v(playerState2, yg5Var.w0());
    }

    public final void W() {
        rlt0 m0;
        xy80 xy80Var = this.j0;
        if (xy80Var == null) {
            return;
        }
        yg5 yg5Var = this.I;
        if (yg5Var != null && (m0 = yg5Var.m0()) != null) {
            m0.m(FullscreenTransition.TAP);
        }
        l0();
        int i2 = 1;
        if (xy80Var.c()) {
            xy80Var.i();
            if (this.B) {
                getViewBinding().u.setFullScreenMode(false);
            } else {
                getViewBinding().u.setFullScreenMode(true);
                i2 = 0;
            }
            xy80Var.b(i2);
            return;
        }
        if (this.B) {
            getViewBinding().u.setFullScreenMode(false);
            xy80Var.f();
        } else {
            getViewBinding().u.setFullScreenMode(true);
            xy80Var.e();
        }
    }

    public final void W0(ConnectionState connectionState) {
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (bVar.a(videoFeatures)) {
            qu5.c().getClass();
            Context context = getCastViewStateProvider().a;
            l0a l0aVar = new l0a(null, false);
            P0(false);
            ConnectionState connectionState2 = ConnectionState.CONNECTED;
            if (connectionState == connectionState2) {
                T();
                G0(true, false);
                VideoToolbarView videoToolbarView = getViewBinding().H;
                if (videoToolbarView != null) {
                    videoToolbarView.setAutoplayInactive(true);
                }
                getViewBinding().z.setShortActionsAutoplayInactive(true);
            } else {
                VideoToolbarView videoToolbarView2 = getViewBinding().H;
                if (videoToolbarView2 != null) {
                    videoToolbarView2.setAutoplayInactive(false);
                }
                getViewBinding().z.setShortActionsAutoplayInactive(false);
            }
            getViewBinding().v.setAutoplayVisibility(true);
            CastTextView castTextView = getViewBinding().F;
            if (!epx.f(castTextView.b, l0aVar)) {
                castTextView.b = l0aVar;
                castTextView.setText((CharSequence) null);
                castTextView.setVisibility(8);
            }
            pz9 castButtonProvider = getCastButtonProvider();
            boolean a2 = bVar.a(videoFeatures);
            boolean z = connectionState == connectionState2;
            castButtonProvider.getClass();
            CastButtonState castButtonState = new CastButtonState(a2, z ? CastButtonState.CastButtonConnectionState.CONNECTED : CastButtonState.CastButtonConnectionState.DISCONNECTED);
            if (I0()) {
                getViewBinding().u.Q4(ControlsIcon.SMART_CAST, false);
            } else {
                getViewBinding().u.z.f.c(castButtonState);
            }
        }
    }

    public final int X(int i2) {
        return (this.G0.b() && this.M) ? iah0.a(16) + i2 : i2;
    }

    public final boolean X0(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        Activity h2 = e3m.h(context);
        if (h2 != null && h2.isInPictureInPictureMode()) {
            c63 c63Var = c63.a;
            Activity b2 = c63.b();
            if (b2 != null && !b2.equals(context)) {
                Configuration configuration2 = new Configuration(configuration);
                configuration2.orientation = b2.getResources().getConfiguration().orientation;
                configuration = configuration2;
            }
        }
        return Y0(configuration);
    }

    @Override // xsna.hnt0
    public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
        if (this.u0) {
            return;
        }
        getViewBinding().r.C3(j, j2);
        VideoSkippablePartView.m(getViewBinding().g, Long.valueOf(j), false, videoAutoPlay.R0().h(), videoAutoPlay.w0(), 2);
        Context context = getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context) || this.G0.b()) {
            return;
        }
        getViewBinding().g.u(this.M && !this.B);
        a0();
    }

    public final void Y(long j) {
        VideoFile videoFile;
        ActionLinkSnippet actionLinkSnippet;
        Good good;
        ActionLink m1;
        boolean z0 = fxc0.B().J().z0();
        boolean h2 = getMinifiedState().h();
        VideoFile videoFile2 = this.C;
        String str = (videoFile2 == null || (m1 = videoFile2.m1()) == null) ? null : m1.c;
        if (z0 && !h2 && epx.f(str, "product")) {
            getViewBinding().o.d();
            getViewBinding().o.post(new b04(this, 17));
            getViewBinding().o.setVisibility(0);
            b bVar = this.v;
            if (bVar != null) {
                bVar.a(true);
                return;
            }
            return;
        }
        tnf tnfVar = this.p0;
        if (tnfVar != null) {
            i0q0.g(tnfVar);
        }
        this.p0 = null;
        yg5 yg5Var = this.I;
        if (yg5Var == null || !yg5Var.P0()) {
            VideoFile videoFile3 = this.C;
            if ((videoFile3 != null ? videoFile3.m1() : null) != null && !epx.f(str, "video") && !h2 && !f1()) {
                if (this.r0 || this.l0) {
                    d3m.e(getViewBinding().o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    b bVar2 = this.v;
                    if (bVar2 != null) {
                        bVar2.a(false);
                        return;
                    }
                    return;
                }
                if (fxc0.B().J().q() && (videoFile = this.C) != null) {
                    bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                    yg5 e2 = b.C1208b.a().e(videoFile, null);
                    VideoAutoPlay videoAutoPlay = e2 instanceof VideoAutoPlay ? (VideoAutoPlay) e2 : null;
                    d20 actionLinkProductTracker = getActionLinkProductTracker();
                    ActionLink m12 = videoFile.m1();
                    long j2 = (m12 == null || (actionLinkSnippet = m12.f) == null || (good = actionLinkSnippet.j) == null) ? 0L : good.b;
                    String str2 = videoAutoPlay != null ? videoAutoPlay.K : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String type = videoFile.getType();
                    long o0 = videoFile.o0();
                    long j3 = videoFile.I0().b;
                    actionLinkProductTracker.getClass();
                    actionLinkProductTracker.a = new b.C1229b.a.j(j2, "", "", "", null, str2, type, o0, j3);
                    actionLinkProductTracker.a(MobileOfficialAppsVideoStat$TypeOverlayLiveProductCardImpression.EventSubtype.OLD_ACTION);
                }
                d3m.c(getViewBinding().o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : j, (r15 & 4) != 0 ? null : new id(this, 14), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                b bVar3 = this.v;
                if (bVar3 != null) {
                    bVar3.a(true);
                    return;
                }
                return;
            }
        }
        getViewBinding().o.setVisibility(8);
        b bVar4 = this.v;
        if (bVar4 != null) {
            bVar4.a(false);
        }
    }

    public final boolean Y0(Configuration configuration) {
        u8l u8lVar;
        boolean z = configuration.orientation == 2;
        boolean z2 = z && z != this.B;
        setLandscape(z);
        boolean z3 = !this.B && getViewBinding().c.getMatrixProvider().getContentWidth() > getViewBinding().c.getMatrixProvider().getContentHeight();
        if ((!q0() || z3) && getViewBinding().c.getTransformController().e == TransformController.ScaleType.CROP) {
            TransformController.ScaleType scaleType = TransformController.ScaleType.FIT;
            getViewBinding().c.i(scaleType, false);
            j0(scaleType);
        }
        i0q0.f(new pnr0(this, 5));
        if (z2 && (u8lVar = this.q) != null) {
            u8lVar.zb(false);
        }
        return this.B;
    }

    public final void Z0() {
        kzn donutDelegate = getDonutDelegate();
        VideoFile videoFile = this.C;
        FrameLayout frameLayout = getViewBinding().M;
        yg5 yg5Var = this.I;
        Integer valueOf = yg5Var != null ? Integer.valueOf(yg5Var.h0().a) : null;
        yg5 yg5Var2 = this.I;
        donutDelegate.a(new dzn(videoFile, frameLayout, valueOf, yg5Var2 != null ? Integer.valueOf(yg5Var2.h0().b) : null, getViewBinding().c.getTransformController().e, getMinifiedState().h()));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void a(boolean z) {
        Context t;
        if (rts0.b.a().P0() instanceof VideoMinimizableState.Collapsed) {
            t = getContext();
        } else {
            dhr0 dhr0Var = dhr0.a;
            Context context = getContext();
            dhr0Var.getClass();
            t = dhr0.t(context);
        }
        Context context2 = t;
        i560 i560Var = i560.d;
        boolean z2 = this.B;
        de4 de4Var = new de4(26);
        i560Var.getClass();
        g560 g560Var = new g560(z2, 0);
        ((com.vk.video.kidsprofile.restricteduseractions.a) i560Var.b.getValue()).getClass();
        i0q0.j(new h560(i560Var, g560Var, context2, z, de4Var));
    }

    public final void a0() {
        ypj fVar;
        VideoFile videoFile;
        if (getViewBinding().g.getAreControlsHiddenBySkippable$core_release().getValue().booleanValue()) {
            for (ControlsIcon controlsIcon : getControls()) {
                getViewBinding().u.Q4(controlsIcon, false);
            }
            return;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && (videoFile = this.C) != null && videoFile.T1()) {
            getViewBinding().u.Q4(ControlsIcon.CHROME_CAST, false);
            getViewBinding().u.Q4(ControlsIcon.SMART_CAST, false);
        }
        etn etnVar = this.K0;
        VideoFile videoFile2 = this.C;
        if (!etnVar.e(videoFile2 != null ? Boolean.valueOf(videoFile2.T1()) : null)) {
            etn etnVar2 = this.K0;
            VideoFile videoFile3 = this.C;
            if (!etnVar2.h(videoFile3 != null ? Boolean.valueOf(videoFile3.T1()) : null)) {
                return;
            }
        }
        for (ControlsIcon controlsIcon2 : getControls()) {
            if (I0() && (controlsIcon2 == ControlsIcon.CHROME_CAST || controlsIcon2 == ControlsIcon.SMART_CAST)) {
                getViewBinding().u.Q4(controlsIcon2, false);
            } else {
                ypj.e eVar = new ypj.e(this.B, this.M, this.H);
                switch (g.$EnumSwitchMapping$0[controlsIcon2.ordinal()]) {
                    case 1:
                        fVar = new ypj.f(eVar);
                        break;
                    case 2:
                        fVar = new ypj.d(q0(), eVar);
                        break;
                    case 3:
                        fVar = new ypj.b(this.o, eVar);
                        break;
                    case 4:
                        fVar = new ypj.g(eVar);
                        break;
                    case 5:
                        fVar = new ypj.a(eVar);
                        break;
                    case 6:
                        fVar = new ypj.c(eVar);
                        break;
                    default:
                        fVar = null;
                        break;
                }
                if (fVar != null) {
                    getViewBinding().u.Q4(controlsIcon2, getViewControlsVisibilityHandler().a(fVar));
                }
            }
        }
    }

    public void a1(VideoFile videoFile) {
        getViewBinding().u.setFullScreenMode(videoFile.getHeight() >= videoFile.getWidth() ? !this.B : this.B);
    }

    public final void b0(VideoFile videoFile, boolean z, boolean z2, boolean z3) {
        boolean z4 = getDonutVideoComponent().J().a() && videoFile != null && e5o.a(videoFile);
        yg5 yg5Var = this.I;
        if ((yg5Var != null && yg5Var.P0()) || (videoFile != null && videoFile.Z9() && !fxc0.B().c(this.C) && !z4)) {
            f4m.j(getViewBinding().d);
            return;
        }
        Boolean bool = this.w0;
        if (bool == null || !bool.equals(Boolean.valueOf(z))) {
            Animation animation = getViewBinding().d.getAnimation();
            if (animation != null && animation.hasStarted()) {
                d3m.b(getViewBinding().d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            }
            this.w0 = Boolean.valueOf(z);
            if (z) {
                if (z2) {
                    d3m.c(getViewBinding().d, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    getViewBinding().d.setAlpha(1.0f);
                    getViewBinding().d.setVisibility(0);
                }
            } else if (z2) {
                d3m.e(getViewBinding().d, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            } else {
                f4m.j(getViewBinding().d);
            }
            if (fxc0.B().J().S0()) {
                F0(!z, Boolean.valueOf(z));
            }
        }
        if (z3) {
            getViewBinding().d.setColorFilter(Color.argb(153, 0, 0, 0), PorterDuff.Mode.SRC_ATOP);
        } else {
            getViewBinding().d.clearColorFilter();
        }
    }

    public final void b1(VideoFullscreenBottomBarView videoFullscreenBottomBarView) {
        int i2;
        Activity h2;
        boolean z = videoFullscreenBottomBarView.getVisibility() == 0 && videoFullscreenBottomBarView.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        etn etnVar = this.K0;
        boolean z2 = this.B;
        VideoFile videoFile = this.C;
        boolean z3 = etnVar.f(z2, videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) && this.M && !this.H;
        if (z || z3) {
            int measuredHeight = videoFullscreenBottomBarView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = videoFullscreenBottomBarView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i2 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + measuredHeight;
        } else {
            i2 = (!this.M || (h2 = e3m.h(videoFullscreenBottomBarView.getContext())) == null) ? 0 : iah0.h(h2, true);
        }
        getViewBinding().z.setPadding(0, i2, 0, X(i2));
    }

    @Override // xsna.ywp0
    public final void c() {
        if (jjc.d().a()) {
            return;
        }
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(sms0.a);
        }
        s3q0 s3q0Var = s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void c0(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        View view;
        boolean c2 = je0Var.d().c();
        if (!c2 && (view = this.N) != null) {
            view.setVisibility(0);
        }
        VideoAdLayout videoAdLayout = getViewBinding().q;
        mzr0 adControllerMapper = getAdControllerMapper();
        adControllerMapper.getClass();
        ofy0 ofy0Var = new ofy0(je0Var, adControllerMapper);
        com.vk.libvideo.design.view.ad.data.a c3 = getAdControllerMapper().c(aVar);
        eg0 a2 = getAdControllerMapper().a(getAdConfig());
        zqt0 zqt0Var = this.G0;
        ozr0 ozr0Var = (ozr0) zqt0Var.l.getValue();
        qcy<Object>[] qcyVarArr = VideoAdLayout.d;
        videoAdLayout.a(ofy0Var, c3, a2, null, ozr0Var, this.z0);
        c1();
        PlayerControlsView playerControlsView = getViewBinding().z;
        yg5 yg5Var = this.I;
        playerControlsView.setPlayerState((yg5Var == null || !yg5Var.w0()) ? PlayerState.PAUSE : PlayerState.PLAYING);
        P0(false);
        H0(this, false, true, c2, false, 24);
        l0();
        if (zqt0Var.b()) {
            getViewBinding().r.setSeekBarAlwaysVisible(r0());
        }
        if (((Boolean) zqt0Var.b.getValue()).booleanValue() && (rts0.b.a().P0() instanceof VideoMinimizableState.Collapsed)) {
            getViewBinding().q.setVisibility(8);
        } else {
            if (c2) {
                getViewBinding().q.setVisibility(0);
            } else {
                d3m.c(getViewBinding().q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View view2 = this.N;
            if (view2 != null) {
                d3m.c(view2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        SubsShowBlocker subsShowBlocker = SubsShowBlocker.ADS;
        yum0 yum0Var = this.m;
        yum0Var.b.add(subsShowBlocker);
        yum0Var.b(true);
        LinearLayout linearLayout = getViewBinding().J;
        if (linearLayout != null) {
            d3m.e(linearLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        if (aVar instanceof a.AbstractC1195a) {
            a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
            getViewBinding().c.d(abstractC1195a.a().getWidth(), abstractC1195a.a().getHeight());
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.constraintlayout.widget.ConstraintLayout, one.video.ad.ux.controls.OneVideoAdBaseControls] */
    public final void c1() {
        OneVideoAdBaseControls.c state;
        ?? r0;
        if (!this.M || this.B) {
            VideoAdLayout.g(getViewBinding().q);
            return;
        }
        VideoAdLayout videoAdLayout = getViewBinding().q;
        int contentWidth = getViewBinding().c.getMatrixProvider().getContentWidth();
        int contentHeight = getViewBinding().c.getMatrixProvider().getContentHeight();
        ?? r3 = videoAdLayout.b;
        if (r3 == 0 || (state = r3.getState()) == null || (r0 = videoAdLayout.b) == 0) {
            return;
        }
        r0.setState(OneVideoAdBaseControls.c.a(state, null, contentWidth, contentHeight, 7));
    }

    @Override // xsna.ywp0
    public final void d() {
        if (jjc.d().a()) {
            return;
        }
        sc4 sc4Var = this.E0;
        removeCallbacks(sc4Var);
        sc4Var.run();
        VideoPipStateHolder.a.getClass();
        if (VideoPipStateHolder.f()) {
            VideoPipStateHolder.j(getContext());
        } else {
            ebs0 ebs0Var = this.s;
            if (ebs0Var != null) {
                ebs0Var.bk(w0t0.a);
            }
        }
        s3q0 s3q0Var = s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d1(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = getViewBinding().r.W3(getContext()).getVisibility() == 0;
        boolean h2 = getMinifiedState().h();
        VideoMinimizableState P0 = rts0.b.a().P0();
        VideoMinimizableState.Animating animating = P0 instanceof VideoMinimizableState.Animating ? (VideoMinimizableState.Animating) P0 : null;
        if (animating != null && com.vk.libvideo.api.minimizable.a.d(animating.b)) {
            VideoMinimizableState videoMinimizableState = animating.c;
            if ((videoMinimizableState instanceof VideoMinimizableState.Collapsed) || (videoMinimizableState instanceof VideoMinimizableState.Hidden)) {
                z3 = true;
                yg5 yg5Var = this.I;
                z4 = (this.x0 || z2 || z || h2 || z3 || (yg5Var == null && yg5Var.a()) || m0() || z5) ? false : true;
                getViewBinding().p.clearAnimation();
                getViewBinding().p.setVisibility(z4 ? 0 : 8);
                if (z4) {
                    getViewBinding().p.setAlpha(1.0f);
                }
                return z4;
            }
        }
        z3 = false;
        yg5 yg5Var2 = this.I;
        if (this.x0) {
        }
        getViewBinding().p.clearAnimation();
        getViewBinding().p.setVisibility(z4 ? 0 : 8);
        if (z4) {
        }
        return z4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void d4(yg5 yg5Var) {
        P0(false);
        if (this.r0) {
            l0();
            getViewBinding().u.setTechBugreportButtonVisibility(((Boolean) this.G0.c.getValue()).booleanValue());
        }
    }

    @Override // xsna.ywp0
    public final void e() {
        jjc.a(new afl0(this, 23));
    }

    public final void e1() {
        VideoFile videoFile;
        yg5 yg5Var;
        View view = getViewBinding().A;
        yg5 yg5Var2 = this.I;
        view.setVisibility((yg5Var2 == null || yg5Var2.P0() || (videoFile = this.C) == null || !videoFile.k0() || ((yg5Var = this.I) != null && yg5Var.a()) || getMinifiedState().h()) ? 8 : 0);
    }

    @Override // xsna.ywp0
    public final void f() {
        if (jjc.d().a()) {
            return;
        }
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(q8s0.a);
        }
        xz9 castEntryPoint = getCastEntryPoint();
        getContext();
        castEntryPoint.getClass();
        s3q0 s3q0Var = s3q0.a;
    }

    public final boolean f1() {
        yks0 yks0Var = this.z;
        return yks0Var != null && yks0Var.d;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hnt0
    public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        je0 N0;
        ye0.a.C4096a f2;
        if (!hasTransientState() || ye0.this.A.c()) {
            if (this.T) {
                c0(aVar2, aVar);
                this.T = false;
            }
            getViewBinding().q.c(getVideoAdProgressMapper().a(aVar, aVar2), (ozr0) this.G0.l.getValue());
            b0(this.C, false, true, false);
            if (!(rts0.b.a().P0() instanceof VideoMinimizableState.Collapsed)) {
                View view = this.N;
                if (view != null) {
                    view.setVisibility(0);
                }
                getViewBinding().q.setVisibility(0);
            }
            if (aVar instanceof a.AbstractC1195a) {
                a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
                getViewBinding().c.d(abstractC1195a.a().getWidth(), abstractC1195a.a().getHeight());
                yg5 yg5Var = this.I;
                if (yg5Var == null || (N0 = yg5Var.N0()) == null || (f2 = ((ye0.a) N0).f()) == null || !f2.b() || !f2.a) {
                    return;
                }
                Q0(abstractC1195a);
                f2.a = false;
            }
        }
    }

    public final b getActionLinkVisibilityListener() {
        return this.v;
    }

    public final View getActualEndView() {
        gpt0 gpt0Var = gpt0.a;
        return gpt0.a(this.C) ? getViewBinding().e : getViewBinding().a;
    }

    public final View getAdBackground() {
        return this.N;
    }

    public kzr0 getAdConfig() {
        boolean z = this.M;
        no2 no2Var = this.r;
        return new kzr0(false, true, z, no2Var != null ? no2Var.Ia() : null, false);
    }

    public final no2 getAnimationDialogCallbackProvider() {
        return this.r;
    }

    public final yg5 getAutoPlay() {
        return this.I;
    }

    public final a78 getBottomPanelVisibilityMode() {
        return this.L;
    }

    public final fbs0 getButtonsListener() {
        return this.b;
    }

    public final u8l getDecorViewVisibilityCallback() {
        return this.q;
    }

    public final etn getDoc2DocConfig() {
        return this.K0;
    }

    public final VideoFullscreenBottomBarView getFullscreenBottomBar() {
        return getViewBinding().K;
    }

    public ImageSize getImageUrl() {
        gpt0 gpt0Var = gpt0.a;
        return gpt0.i(getContext(), this.C);
    }

    public final boolean getLandscape() {
        return this.B;
    }

    public final AutoPlayMinifiedState getMinifiedState() {
        AutoPlayMinifiedState R0;
        yg5 yg5Var = this.I;
        return (yg5Var == null || (R0 = yg5Var.R0()) == null) ? AutoPlayMinifiedState.NONE : R0;
    }

    public final xy80 getOrientationListener() {
        return this.j0;
    }

    public PlayerType getPlayerType() {
        return this.O0;
    }

    public final boolean getResumed() {
        return this.U;
    }

    public final AdsDataProvider getShit() {
        return this.A;
    }

    public final List<Image> getSimilarVideosPreviews() {
        return this.D;
    }

    public final gzs<s3q0> getSkipBackListener() {
        return getViewBinding().z.getSkipBackListener();
    }

    public final gzs<s3q0> getSkipForwardListener() {
        return getViewBinding().z.getSkipForwardListener();
    }

    public final yum0 getSubsVisibilityController() {
        return this.m;
    }

    public final d getSubtitleShiftListener() {
        return this.u;
    }

    public final boolean getSwipingNow() {
        return this.J;
    }

    public final wzs<String, Boolean, s3q0> getToggleUiVisibilityListener() {
        return this.p;
    }

    public final VideoTopBarView getTopBar() {
        return getViewBinding().L;
    }

    public final boolean getUiVisible() {
        return this.r0;
    }

    public final boolean getUnderBottomSheet() {
        return this.O;
    }

    public final ebs0 getVideoClickActionCallback() {
        return this.s;
    }

    public com.vk.libvideo.autoplay.a getVideoConfig() {
        VideoFile videoFile;
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        RepeatMode repeatMode = (!com.vk.libvideo.autoplay.e.a() || this.M) ? RepeatMode.BY_VIDEO_PARAMS : RepeatMode.OFF;
        boolean z = !f1();
        SubtitlesConfigurationMode subtitlesConfigurationMode = SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE;
        yks0 yks0Var = this.z;
        return new com.vk.libvideo.autoplay.a(true, repeatMode, null, z, false, false, null, subtitlesConfigurationMode, null, (yks0Var == null || (videoFile = yks0Var.e) == null || !videoFile.p0()) ? AutoPlayAdPixelsTrackerType.NONE : AutoPlayAdPixelsTrackerType.NEWSFEED, getPlayerType(), this.B ? ScreenType.LANDSCAPE : ScreenType.PORTRAIT, false, null, 405436);
    }

    public final VideoFile getVideoFile() {
        return this.C;
    }

    public final yks0 getVideoFileController() {
        return this.z;
    }

    public final int getVideoHeight() {
        yg5 yg5Var = this.I;
        if (yg5Var == null) {
            return 0;
        }
        return yg5Var.A().getHeight();
    }

    public TransformController.ScaleType getVideoScaleType() {
        return this.C0;
    }

    public final int getVideoWidth() {
        yg5 yg5Var = this.I;
        if (yg5Var == null) {
            return 0;
        }
        return yg5Var.A().getWidth();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xqt0 getViewBinding() {
        return (xqt0) this.i.getValue();
    }

    public final f getVisibilityChangeListener() {
        return this.t;
    }

    public final boolean getWithoutBottomPanel() {
        return this.K;
    }

    @Override // xsna.hnt0
    public final void h() {
        c1();
        getViewBinding().q.f();
        B0();
    }

    @Override // xsna.hnt0
    public final void h3(yg5 yg5Var, int i2, int i3) {
        if (getMinifiedState() == AutoPlayMinifiedState.MINIPLAYER) {
            d3m.e(getViewBinding().h, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            b0(this.C, true, true, false);
            return;
        }
        G0(false, false);
        u8l u8lVar = this.q;
        if (u8lVar != null) {
            u8lVar.zb(true);
        }
        getViewBinding().h.a(new VideoErrorView.a(getResources().getString(i2), this.b, true, false, yg5Var.R0() == AutoPlayMinifiedState.PIP, getResources().getString(i3)));
        i0q0.h(this.n0);
        d3m.c(getViewBinding().h, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        d3m.e(getViewBinding().f, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        VideoFile videoFile = this.C;
        if (videoFile != null) {
            t0(getImageUrl());
            b0(videoFile, true, true, true);
        }
    }

    @Override // xsna.ywp0
    public final void i() {
        EpisodeButton episodeBtn;
        if (jjc.d().a()) {
            return;
        }
        VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
        if (videoBottomPanelView != null && (episodeBtn = videoBottomPanelView.getEpisodeBtn()) != null) {
            episodeBtn.callOnClick();
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.hnt0
    public final void j() {
        izr0 izr0Var;
        if (this.M && BuildInfo.s() && (izr0Var = this.P0) != null) {
            izr0Var.a.removeOnAttachStateChangeListener(izr0Var.b);
            this.P0 = null;
        }
        getViewBinding().c.h();
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            S(yg5Var, true);
        }
        d3m.e(getViewBinding().q, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        yum0.a(this.m, SubsShowBlocker.ADS);
        View view = this.N;
        if (view != null) {
            d3m.e(view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        getViewBinding().q.b();
        this.T = false;
        if (this.G0.b()) {
            getViewBinding().r.setSeekBarAlwaysVisible(r0());
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            getViewBinding().F.setAlpha(1.0f);
        }
    }

    public final void j0(TransformController.ScaleType scaleType) {
        boolean q0 = q0();
        etn etnVar = this.K0;
        boolean z = this.B;
        VideoFile videoFile = this.C;
        boolean a2 = (etnVar.f(z, videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) && this.M) ? getViewControlsVisibilityHandler().a(new ypj.d(q0(), new ypj.e(this.B, this.M, this.H))) : q0 && this.M;
        VideoButtonsView videoButtonsView = getViewBinding().u;
        videoButtonsView.G = scaleType;
        ImageView imageView = videoButtonsView.t;
        if (a2) {
            videoButtonsView.setResizeButtonVisibility(true);
            if (scaleType == TransformController.ScaleType.CROP) {
                videoButtonsView.F.getClass();
                videoButtonsView.T4(imageView, R.drawable.one_video_icon_video_fill_none_24);
                imageView.setContentDescription(videoButtonsView.getContext().getString(R.string.one_video_accessibility_resize_none));
            } else if (scaleType == TransformController.ScaleType.FIT) {
                videoButtonsView.F.getClass();
                videoButtonsView.T4(imageView, R.drawable.one_video_icon_video_fill_24);
                imageView.setContentDescription(videoButtonsView.getContext().getString(R.string.one_video_accessibility_resize));
            }
        } else {
            videoButtonsView.setResizeButtonVisibility(false);
        }
        VideoFullscreenBottomBarView fullscreenBottomBar = getFullscreenBottomBar();
        if (fullscreenBottomBar != null) {
            ControlsState.ResizeStatus resizeStatus = !q0 ? ControlsState.ResizeStatus.UNAVAILABLE : scaleType == TransformController.ScaleType.FIT ? ControlsState.ResizeStatus.FIT : scaleType == TransformController.ScaleType.CROP ? ControlsState.ResizeStatus.CROP : ControlsState.ResizeStatus.UNAVAILABLE;
            fullscreenBottomBar.c(null);
            com.vk.fullscreenvideo.design.view.bottom.a aVar = fullscreenBottomBar.e;
            if (aVar != null) {
                aVar.j(resizeStatus);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ywp0
    public final void k() {
        ebs0 ebs0Var;
        d3b0 v0;
        if (!((Boolean) this.G0.c.getValue()).booleanValue() || jjc.d().a()) {
            return;
        }
        yg5 yg5Var = this.I;
        VideoTechBugreportData b2 = (yg5Var == null || (v0 = yg5Var.v0()) == null) ? null : w7o0.b(v0, VideoTechBugreportData.VideoType.VIDEO);
        if (b2 != null && (ebs0Var = this.s) != null) {
            ebs0Var.bk(new qjj0(b2));
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void k0() {
        yg5 yg5Var;
        yg5 yg5Var2;
        int i2;
        VideoFile videoFile;
        yg5 yg5Var3;
        yg5 yg5Var4;
        boolean n0 = n0();
        yg5 yg5Var5 = this.I;
        boolean z = false;
        boolean z2 = (yg5Var5 != null && yg5Var5.J()) || (getViewBinding().d.getVisibility() == 0 && !s0());
        yg5 yg5Var6 = this.I;
        boolean z3 = (yg5Var6 == null || yg5Var6.isPlaying() || (yg5Var4 = this.I) == null || yg5Var4.M()) ? false : true;
        boolean z4 = this.r0;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z4 || !this.s0 ? !(z2 && z3) && (((yg5Var = this.I) == null || !yg5Var.P0()) && ((yg5Var2 = this.I) == null || !yg5Var2.B())) : ((yg5Var3 = this.I) == null || !yg5Var3.B()) && !this.s0) {
            i2 = 0;
            f2 = 1.0f;
        } else {
            i2 = 8;
        }
        if (this.J) {
            return;
        }
        if (getViewBinding().i.getAlpha() == f2 && getViewBinding().i.getVisibility() == i2) {
            return;
        }
        int i3 = (n0 || ((videoFile = this.C) != null && videoFile.Z9())) ? 8 : i2;
        getViewBinding().r.W3(getContext()).setVisibility(i3);
        getViewBinding().u.setVisibility(i3);
        getViewBinding().i.setVisibility(i2);
        if (this.G0.c()) {
            getViewBinding().v.setVisibility(this.S ? i2 : 8);
        }
        boolean z5 = this.t0;
        yg5 yg5Var7 = this.I;
        if (yg5Var7 != null && yg5Var7.P0()) {
            z = true;
        }
        d1(z5, z);
    }

    public final void l0() {
        T();
        gv2 gv2Var = new gv2(this, 19);
        this.o0 = gv2Var;
        i0q0.d(3000L, gv2Var);
    }

    @Override // xsna.hnt0
    public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        if (this.M && BuildInfo.s() && this.P0 == null) {
            VideoAdLayout videoAdLayout = getViewBinding().q;
            izr0 izr0Var = new izr0(videoAdLayout);
            videoAdLayout.addOnAttachStateChangeListener(izr0Var.b);
            this.P0 = izr0Var;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures)) {
            getViewBinding().F.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        setKeepScreenOn(true);
        if (!(aVar instanceof a.AbstractC1195a)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c0(je0Var, aVar);
            return;
        }
        if (hasTransientState()) {
            a.AbstractC1195a abstractC1195a = (a.AbstractC1195a) aVar;
            if (!abstractC1195a.c()) {
                View view = this.N;
                if (view != null) {
                    view.setVisibility(8);
                }
                getViewBinding().q.setVisibility(8);
                getViewBinding().c.d(abstractC1195a.a().getWidth(), abstractC1195a.a().getHeight());
                this.T = true;
                return;
            }
        }
        c0(je0Var, aVar);
    }

    public final boolean m0() {
        return getViewBinding().a.getVisibility() == 0 || getViewBinding().e.getVisibility() == 0;
    }

    @Override // xsna.hnt0
    public void m4(VideoAutoPlay videoAutoPlay) {
        getViewBinding().z.setPlayerState(PlayerState.END);
        getViewBinding().c.h();
        setKeepScreenOn(false);
        if (getMinifiedState().h()) {
            return;
        }
        N0();
    }

    public final boolean n0() {
        return this.A != null;
    }

    @Override // xsna.hnt0
    public final void n2(yg5 yg5Var) {
        getViewBinding().z.setPlayerState(PlayerState.BUFFERING);
        P0(!this.b0);
    }

    @Override // xsna.ywp0
    public final void o(boolean z) {
        if (jjc.d().a()) {
            return;
        }
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(new d4s0(z));
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final boolean o0(Animator animator) {
        ObjectAnimator objectAnimator = animator instanceof ObjectAnimator ? (ObjectAnimator) animator : null;
        return objectAnimator != null && epx.f(objectAnimator.getTarget(), getViewBinding().p) && epx.f(objectAnimator.getPropertyName(), View.ALPHA.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            yg5Var.f0(this);
        }
        VideoFile videoFile = this.C;
        if (videoFile != null) {
            Q(videoFile);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        io.reactivex.rxjava3.disposables.c cVar = this.D0;
        if (cVar != null) {
            cVar.dispose();
        }
        b0(this.C, true, false, false);
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            yg5Var.T(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        AnimatorSet animatorSet = this.m0;
        if ((animatorSet == null || !animatorSet.isRunning()) && !this.O) {
            getViewBinding().j.setTranslationY(-getSubtitlesShiftCalculator().b());
            d dVar = this.u;
            if (dVar != null) {
                boolean z2 = getViewBinding().j.getTextView().getVisibility() == 0;
                getViewBinding().j.getTextView().getHeight();
                dVar.a(z2);
            }
        }
        E0();
        Z0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (getViewBinding().n.getVisibility() == 0) {
            getViewBinding().n.measure(i2, i3);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        EpisodeButton episodeBtn;
        VideoFile videoFile;
        if (!z) {
            VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
            if (videoBottomPanelView == null || (episodeBtn = videoBottomPanelView.getEpisodeBtn()) == null || (videoFile = this.C) == null) {
                return;
            }
            episodeBtn.t.setText(EpisodeButton.Q4(i2, videoFile));
            return;
        }
        int i3 = i2 / 1000;
        if (this.V != i3) {
            this.V = i3;
        }
        if (m0()) {
            setEndMenuVisible(false);
        }
        if (!this.G0.b() || getViewBinding().C.getTimelineImages() == null) {
            return;
        }
        FullSeekPreviewLayout fullSeekPreviewLayout = getViewBinding().C;
        long progress = seekBar.getProgress();
        long max = seekBar.getMax();
        VideoSeekPreviewImage videoSeekPreviewImage = fullSeekPreviewLayout.b;
        videoSeekPreviewImage.g = progress;
        videoSeekPreviewImage.h = max;
        videoSeekPreviewImage.U();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        yg5 yg5Var;
        this.u0 = true;
        VideoFile videoFile = this.C;
        if (videoFile != null) {
            getIntervalDelegate().a(videoFile, this.M, this.u0);
        }
        this.W = this.V;
        SubsShowBlocker subsShowBlocker = SubsShowBlocker.SEEKBAR;
        yum0 yum0Var = this.m;
        yum0Var.b.add(subsShowBlocker);
        yum0Var.b(true);
        yg5 yg5Var2 = this.I;
        if (yg5Var2 != null) {
            yg5Var2.F();
        }
        zqt0 zqt0Var = this.G0;
        if (zqt0Var.b() && (yg5Var = this.I) != null) {
            yg5Var.pause();
        }
        setEndMenuVisible(false);
        T();
        if (!this.b0) {
            G0(true, false);
        }
        if (zqt0Var.b() && getViewBinding().C.getTimelineImages() != null) {
            d3m.c(getViewBinding().C, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            FullSeekPreviewLayout fullSeekPreviewLayout = getViewBinding().C;
            long progress = seekBar.getProgress();
            long max = seekBar.getMax();
            VideoSeekPreviewImage videoSeekPreviewImage = fullSeekPreviewLayout.b;
            videoSeekPreviewImage.g = progress;
            videoSeekPreviewImage.h = max;
            videoSeekPreviewImage.U();
        }
        yg5 yg5Var3 = this.I;
        if (yg5Var3 != null) {
            VideoSkippablePartView.m(getViewBinding().g, Long.valueOf(yg5Var3.getPosition()), this.u0, false, false, 12);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        EpisodeButton episodeBtn;
        VideoFile videoFile;
        rlt0 m0;
        yg5 yg5Var;
        this.u0 = false;
        int progress = seekBar.getProgress();
        yum0.a(this.m, SubsShowBlocker.SEEKBAR);
        zqt0 zqt0Var = this.G0;
        if (zqt0Var.b() && getViewBinding().C.getTimelineImages() != null) {
            d3m.e(getViewBinding().C, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        yg5 yg5Var2 = this.I;
        if (yg5Var2 != null) {
            yg5Var2.K();
            long j = progress * 1000;
            yg5Var2.seek(j);
            if (zqt0Var.b() && !this.b0 && (yg5Var = this.I) != null) {
                yg5Var.play();
            }
            ebs0 ebs0Var = this.s;
            if (ebs0Var != null) {
                ebs0Var.bk(new VideoSeekAction(j, this.b0 ? VideoSeekAction.Source.PreciseSlider : VideoSeekAction.Source.Slider, this.M));
            }
            if (this.W >= 0 && (m0 = yg5Var2.m0()) != null) {
                m0.l(this.W, progress / 1000, RewindType.SLIDER);
            }
        }
        if (!this.b0) {
            if (this.r0) {
                G0(true, false);
            }
            l0();
        }
        this.W = -1;
        VideoBottomPanelView videoBottomPanelView = getViewBinding().G;
        if (videoBottomPanelView == null || (episodeBtn = videoBottomPanelView.getEpisodeBtn()) == null || (videoFile = this.C) == null) {
            return;
        }
        episodeBtn.t.setText(EpisodeButton.Q4(progress, videoFile));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        yg5 yg5Var;
        yg5 yg5Var2;
        if (this.b0) {
            w();
            return true;
        }
        getDetector().a(motionEvent);
        if (this.M && (yg5Var = this.I) != null && !yg5Var.a() && (yg5Var2 = this.I) != null && !yg5Var2.P0() && epx.f(this.w0, Boolean.FALSE)) {
            getViewBinding().c.getTransformController().d(motionEvent);
        }
        if (mnh0.r(motionEvent) && this.a0 != null) {
            d3m.e(getViewBinding().m, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            yg5 yg5Var3 = this.I;
            if (yg5Var3 != null) {
                Float f2 = this.a0;
                yg5Var3.setPlaybackSpeed(f2 != null ? f2.floatValue() : 1.0f);
            }
            this.a0 = null;
        }
        return true;
    }

    @Override // com.vk.libvideo.design.view.seek.VideoFastSeekView.b
    public final void p() {
        rlt0 m0;
        if (this.W >= 0) {
            yg5 yg5Var = this.I;
            if (yg5Var != null && (m0 = yg5Var.m0()) != null) {
                m0.l(this.W, this.V, RewindType.DOUBLE_TAP);
            }
            this.W = -1;
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            yg5 yg5Var2 = this.I;
            if (yg5Var2 == null || yg5Var2.a() || this.r0) {
                return;
            }
            G0(false, false);
            u8l u8lVar = this.q;
            if (u8lVar != null) {
                u8lVar.zb(false);
                return;
            }
            return;
        }
        yg5 yg5Var3 = this.I;
        if (yg5Var3 == null || yg5Var3.a() || this.r0 || this.I == null) {
            return;
        }
        G0(false, false);
        u8l u8lVar2 = this.q;
        if (u8lVar2 != null) {
            u8lVar2.zb(false);
        }
    }

    @Override // xsna.hnt0
    public final void p2(VideoAutoPlay videoAutoPlay) {
        getViewBinding().z.setPlayerState((videoAutoPlay.isPlaying() || videoAutoPlay.w0()) ? PlayerState.PLAYING : videoAutoPlay.x.h() ? PlayerState.PAUSE : PlayerState.IDLE);
    }

    @Override // xsna.hnt0
    public final void q(List<? extends SubtitleRenderItem> list) {
        getViewBinding().j.setRenderItems(list);
    }

    public final boolean q0() {
        float width = getWidth() / getHeight();
        float abs = Math.abs(width - (getViewBinding().c.getMatrixProvider().getContentWidth() / getViewBinding().c.getMatrixProvider().getContentHeight())) / width;
        return 0.01f <= abs && abs <= 1.0f;
    }

    public final boolean r0() {
        yg5 yg5Var;
        VideoFile videoFile;
        return (this.M || (yg5Var = this.I) == null || yg5Var.P0() || (videoFile = this.C) == null || videoFile.T1() || getMinifiedState().h()) ? false : true;
    }

    @Override // xsna.hnt0
    public final void r1(yg5 yg5Var) {
        getViewBinding().z.setPlayerState(PlayerState.PAUSE);
        setKeepScreenOn(yg5Var.isPlaying() || yg5Var.w0());
        P0(false);
        getViewBinding().g.v(getViewBinding().z.getPlayerState(), false);
    }

    @Override // xsna.ywp0
    public final void s() {
        if (jjc.d().a()) {
            return;
        }
        y0(true);
        s3q0 s3q0Var = s3q0.a;
    }

    public final boolean s0() {
        yg5 yg5Var = this.I;
        return yg5Var != null && yg5Var.u0() && yg5Var.g0() == -6;
    }

    public final void setActionLinkVisibilityListener(b bVar) {
        this.v = bVar;
    }

    public final void setAdBackground(View view) {
        this.N = view;
    }

    public final void setAnimationDialogCallbackProvider(no2 no2Var) {
        this.r = no2Var;
    }

    public final void setAutoPlay(yg5 yg5Var) {
        this.I = yg5Var;
    }

    public final void setBottomPanelVisibilityMode(a78 a78Var) {
        this.L = a78Var;
    }

    public final void setDecorViewVisibilityCallback(u8l u8lVar) {
        this.q = u8lVar;
    }

    public final void setDoc2DocConfig(etn etnVar) {
        this.K0 = etnVar;
    }

    public final void setEndMenuVisible(boolean z) {
        boolean h2 = getMinifiedState().h();
        boolean z2 = false;
        if (!h2 && z) {
            P0(false);
            getViewBinding().k.hide();
        }
        yg5 yg5Var = this.I;
        if (yg5Var != null && yg5Var.P0()) {
            z2 = true;
        }
        View actualEndView = getActualEndView();
        if (h2 || !z || z2) {
            d3m.e(actualEndView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        } else {
            d3m.c(actualEndView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (h2 || !z || z2) {
            return;
        }
        B0();
    }

    public final void setFullscreenBottomBar(VideoFullscreenBottomBarView videoFullscreenBottomBarView) {
        getViewBinding().K = videoFullscreenBottomBarView;
        if (videoFullscreenBottomBarView != null) {
            videoFullscreenBottomBarView.setOnClickActionListener$core_release(new lzl0(this, 10));
        }
    }

    public final void setFullscreenContext(boolean z) {
        if (this.M != z) {
            this.M = z;
            V0();
        }
    }

    public final void setFullscreenLocked(boolean z) {
        this.l0 = z;
    }

    public final void setHideControlsAfterFastSeek(boolean z) {
        this.k0 = z;
    }

    public final void setLandscape(boolean z) {
        this.B = z;
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            yg5Var.a0(getVideoConfig());
        }
    }

    public final void setModalDialogOpen(boolean z) {
        if (this.H != z) {
            this.H = z;
            Context context = getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                return;
            }
            VideoFullscreenBottomBarView fullscreenBottomBar = getFullscreenBottomBar();
            boolean z2 = false;
            if (fullscreenBottomBar != null) {
                fullscreenBottomBar.setVisibility(!J0() ? 0 : 8);
            }
            VideoFullscreenBottomBarView fullscreenBottomBar2 = getFullscreenBottomBar();
            if (fullscreenBottomBar2 != null) {
                b1(fullscreenBottomBar2);
            }
            VideoTopBarView topBar = getTopBar();
            if (topBar != null) {
                if (z && this.B) {
                    z2 = true;
                }
                topBar.setSmallScreenMode(z2);
            }
            a0();
        }
    }

    public final void setOrientationListener(xy80 xy80Var) {
        this.j0 = xy80Var;
    }

    public final void setPipButtonVisible(boolean z) {
        VideoButtonsView videoButtonsView = getViewBinding().u;
        ControlsIcon controlsIcon = ControlsIcon.PICTURE_IN_PICTURE;
        if (this.G0.c()) {
            z = false;
        }
        videoButtonsView.Q4(controlsIcon, z);
    }

    public final void setPlayerControlsBottomPadding(int i2) {
        f4m.v(i2, getViewBinding().z);
        E0();
    }

    public final void setPostingMode(boolean z) {
        this.P = z;
    }

    public final void setResumed(boolean z) {
        this.U = z;
    }

    public final void setShit(AdsDataProvider adsDataProvider) {
        this.A = adsDataProvider;
    }

    public final void setShortActionsAutoPlaySwitchVisibility(boolean z) {
        getViewBinding().z.setShortActionsAutoplayVisibility(z);
    }

    public final void setShortActionsButtonsVisibility(boolean z) {
        this.S = z;
        getViewBinding().z.setShortActionsButtonsVisibility(z);
    }

    public final void setShowFeedbackButton(boolean z) {
        this.R = z;
        a0();
    }

    public final void setShowPlaylist(boolean z) {
        this.Q = z;
    }

    public final void setSimilarVideosPreviews(List<Image> list) {
        this.D = list;
        VideoFile videoFile = this.C;
        yg5 yg5Var = this.I;
        if (videoFile == null || yg5Var == null) {
            return;
        }
        P(videoFile, yg5Var);
    }

    public final void setSkipBackListener(gzs<s3q0> gzsVar) {
        getViewBinding().z.setSkipBackListener(gzsVar);
    }

    public final void setSkipForwardListener(gzs<s3q0> gzsVar) {
        getViewBinding().z.setSkipForwardListener(gzsVar);
    }

    public final void setSubtitleShiftListener(d dVar) {
        this.u = dVar;
    }

    public final void setSwipingNow(boolean z) {
        this.J = z;
    }

    public final void setToggleUiVisibilityListener(wzs<? super String, ? super Boolean, s3q0> wzsVar) {
        this.p = wzsVar;
    }

    public final void setTopBar(VideoTopBarView videoTopBarView) {
        getViewBinding().L = videoTopBarView;
        if (videoTopBarView != null) {
            videoTopBarView.setViewClickListener$core_release(new ehm0(this, 11));
        }
    }

    public final void setUnderBottomSheet(boolean z) {
        this.O = z;
    }

    public final void setVideoClickActionCallback(ebs0 ebs0Var) {
        this.s = ebs0Var;
    }

    public final void setVideoFile(VideoFile videoFile) {
        this.C = videoFile;
    }

    public final void setVideoFileController(yks0 yks0Var) {
        this.z = yks0Var;
    }

    public void setVideoScaleType(TransformController.ScaleType scaleType) {
        this.C0 = scaleType;
    }

    public final void setVisibilityChangeListener(f fVar) {
        this.t = fVar;
    }

    public final void setWithoutBottomPanel(boolean z) {
        this.K = z;
    }

    @Override // xsna.ywp0
    public final void t() {
        d3b0 v0;
        if (jjc.d().a()) {
            return;
        }
        q640 q640Var = getMultiTrackOnboarding().b;
        etv0 etv0Var = q640Var.f;
        if (etv0Var != null) {
            etv0Var.b(false);
        }
        q640Var.f = null;
        q640Var.b.b(HintId.INFO_VIDEO_SELECT_TOOLTIP_AUDIO_TRACK.getId());
        SharedPreferences.Editor edit = ((SharedPreferences) p640.a.getValue()).edit();
        edit.putInt("shown_count", 0);
        edit.apply();
        yg5 yg5Var = this.I;
        if (yg5Var == null || (v0 = yg5Var.v0()) == null) {
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(new b1t0(v0));
        }
        s3q0 s3q0Var2 = s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(ImageSize imageSize) {
        String str;
        Pair pair;
        VideoRestriction O;
        yg5 yg5Var;
        boolean booleanValue;
        if (imageSize == null || (str = imageSize.d.d) == null) {
            str = "";
        }
        post(new m52(this, 8));
        VideoFile videoFile = this.C;
        if (videoFile != null && videoFile.z0()) {
            VideoFile videoFile2 = this.C;
            if ((videoFile2 != null ? videoFile2.Na() : 0L) > 0) {
                r1 = getMinifiedState() == AutoPlayMinifiedState.NONE;
                pair = new Pair(Boolean.valueOf(r1), Boolean.valueOf(r1));
                boolean booleanValue2 = ((Boolean) pair.d()).booleanValue();
                booleanValue = ((Boolean) pair.g()).booleanValue();
                Uri parse = Uri.parse(str);
                bpn0 bpn0Var = VideoOverlayView.I;
                jwx c2 = VideoOverlayView.b.c();
                if (!booleanValue) {
                    c2 = null;
                }
                q i2 = mcr0.i(parse, 0, 0, 0, new s0v0(), c2);
                asu0.a.getClass();
                setCoverDisposable(i2.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xvq0(new bqt0(this, booleanValue2, booleanValue), 5), new o330(new qjl0(this, 16), 26)));
            }
        }
        boolean z = fxc0.B().c(this.C) && (yg5Var = this.I) != null && yg5Var.B();
        VideoFile videoFile3 = this.C;
        if (videoFile3 != null && (O = videoFile3.O()) != null && O.d && z) {
            r1 = true;
        }
        pair = new Pair(Boolean.valueOf(z), Boolean.valueOf(r1));
        boolean booleanValue22 = ((Boolean) pair.d()).booleanValue();
        booleanValue = ((Boolean) pair.g()).booleanValue();
        Uri parse2 = Uri.parse(str);
        bpn0 bpn0Var2 = VideoOverlayView.I;
        jwx c22 = VideoOverlayView.b.c();
        if (!booleanValue) {
        }
        q i22 = mcr0.i(parse2, 0, 0, 0, new s0v0(), c22);
        asu0.a.getClass();
        setCoverDisposable(i22.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xvq0(new bqt0(this, booleanValue22, booleanValue), 5), new o330(new qjl0(this, 16), 26)));
    }

    @Override // xsna.hnt0
    public final void t2() {
        G0(false, false);
    }

    @Override // xsna.ywp0
    public final void v() {
        if (jjc.d().a()) {
            return;
        }
        l0();
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(new qws0(15, null, false));
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final ControlsState.CastStatus v0(MediaRouteConnectStatus mediaRouteConnectStatus) {
        int i2 = mediaRouteConnectStatus == null ? -1 : g.$EnumSwitchMapping$1[mediaRouteConnectStatus.ordinal()];
        if (i2 == -1) {
            Context context = getContext();
            HashSet hashSet = iah0.a;
            return fnj.d(context) ? I0() ? ControlsState.CastStatus.DISCONNECTED : ControlsState.CastStatus.UNAVAILABLE : ControlsState.CastStatus.DISCONNECTED;
        }
        if (i2 == 1) {
            Context context2 = getContext();
            HashSet hashSet2 = iah0.a;
            return fnj.d(context2) ? I0() ? ControlsState.CastStatus.DISCONNECTED : ControlsState.CastStatus.UNAVAILABLE : ControlsState.CastStatus.DISCONNECTED;
        }
        if (i2 == 2 || i2 == 3) {
            return ControlsState.CastStatus.DISCONNECTED;
        }
        if (i2 == 4) {
            return ControlsState.CastStatus.CONNECTED;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.ywp0
    public final void w() {
        jjc.a(new prq0(this, 18));
    }

    public final void w0(boolean z) {
        this.U = true;
        T();
        l0();
        yg5 yg5Var = this.I;
        if (yg5Var != null) {
            if (z) {
                y0(false);
                setEndMenuVisible(false);
            } else {
                if (yg5Var.a()) {
                    setEndMenuVisible(true);
                    return;
                }
                setEndMenuVisible(false);
                VideoFile videoFile = this.C;
                if (videoFile != null) {
                    He(EmptyList.b, videoFile);
                }
            }
        }
    }

    @Override // xsna.ywp0
    public final void x() {
        if (jjc.d().a()) {
            return;
        }
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(q8s0.a);
        }
        thu0 thu0Var = this.n;
        if (thu0Var != null) {
            thu0Var.performClick();
        }
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.ywp0
    public final void y() {
        if (jjc.d().a()) {
            return;
        }
        ebs0 ebs0Var = this.s;
        if (ebs0Var != null) {
            ebs0Var.bk(ass0.a);
        }
        s3q0 s3q0Var = s3q0.a;
    }

    public final void y0(boolean z) {
        yg5 yg5Var = this.I;
        if (yg5Var == null || yg5Var.isPlaying() || !this.U) {
            return;
        }
        if (z) {
            yg5Var.z0(getViewBinding().c, getVideoConfig(), null);
            yg5Var.S(false);
            i0q0.f(new pnr0(this, 5));
        } else if (yg5Var.v0() == null) {
            G0(false, false);
            P0(true);
            yg5Var.z0(getViewBinding().c, getVideoConfig(), null);
            yg5Var.f();
        } else {
            yg5Var.z0(getViewBinding().c, getVideoConfig(), null);
            yg5Var.f();
        }
        setEndMenuVisible(false);
        setKeepScreenOn(true);
        yg5 yg5Var2 = this.I;
        if (yg5Var2 != null && yg5Var2.isPlaying() && !getMinifiedState().h()) {
            A0();
        }
        l0();
    }

    @Override // xsna.hnt0
    public final void z0(VideoAutoPlay videoAutoPlay, int i2) {
        getViewBinding().r.O3(i2);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v69, types: [xsna.wpt0] */
    /* JADX WARN: Type inference failed for: r3v70, types: [xsna.xpt0] */
    /* JADX WARN: Type inference failed for: r3v71, types: [xsna.ypt0] */
    public VideoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        fbs0 fbs0Var = new fbs0(new eqt0(this));
        this.b = fbs0Var;
        int i3 = 20;
        j8n0 j8n0Var = new j8n0(this, i3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, j8n0Var);
        int i4 = 0;
        int i5 = 0;
        int i6 = 11;
        this.d = new uxs(new u5p0(this, i6), new wxt(i5, this, VideoView.class, "resizeClicked", "resizeClicked()V", i4, 5), new wxv(i5, this, VideoView.class, "chromeCastClicked", "chromeCastClicked()V", i4, 2), new rx4(i5, this, VideoView.class, "onBugReportClicked", "onBugReportClicked()V", i4, 6), new kcj0(this, 23));
        int i7 = 2;
        this.e = msy.a(lazyThreadSafetyMode, new gos0(i7));
        this.f = msy.a(lazyThreadSafetyMode, new tbe0(this, 29));
        this.g = msy.a(lazyThreadSafetyMode, new zpt0(0));
        int i8 = 12;
        this.h = msy.a(lazyThreadSafetyMode, new z0h0(i8));
        this.i = msy.a(lazyThreadSafetyMode, new qah0(this, i3));
        this.w = new bpn0(new uvs0(this, i7));
        c cVar = new c();
        gpt0 gpt0Var = gpt0.a;
        this.x = Preference.j().getBoolean("video_fast_seek_tooltip", false);
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        this.y = b.C1208b.a();
        this.D = EmptyList.b;
        this.E = msy.a(lazyThreadSafetyMode, new gqh0(this, 19));
        this.F = msy.a(lazyThreadSafetyMode, new sqf0(i8));
        int i9 = 1;
        this.G = msy.a(lazyThreadSafetyMode, new q0s0(i9));
        this.L = a78.c.a;
        this.U = true;
        this.V = -1;
        this.W = -1;
        this.d0 = msy.a(lazyThreadSafetyMode, new avj0(this, 24));
        this.e0 = msy.a(lazyThreadSafetyMode, new ksq0(this, i6));
        int i10 = 17;
        this.f0 = msy.a(lazyThreadSafetyMode, new cck0(this, i10));
        int i11 = 18;
        this.g0 = msy.a(lazyThreadSafetyMode, new dck0(this, i11));
        this.i0 = msy.a(lazyThreadSafetyMode, new clt0(this, i9));
        this.q0 = new AnimatorSet();
        this.r0 = true;
        this.s0 = true;
        this.v0 = new pgn();
        int i12 = 22;
        this.z0 = msy.a(lazyThreadSafetyMode, new cy20(i12));
        this.A0 = msy.a(lazyThreadSafetyMode, new w0o0(7));
        this.B0 = msy.a(lazyThreadSafetyMode, new tqf0(i6));
        this.C0 = TransformController.ScaleType.FIT;
        this.E0 = new sc4(this, i10);
        this.F0 = new o4(this, i12);
        zqt0 zqt0Var = new zqt0();
        this.G0 = zqt0Var;
        this.H0 = msy.a(lazyThreadSafetyMode, new hbj0(this, 25));
        this.I0 = msy.a(lazyThreadSafetyMode, new pwh0(this, 28));
        this.J0 = msy.a(lazyThreadSafetyMode, new v5n0(this, i11));
        this.K0 = new etn(false, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        this.L0 = msy.a(lazyThreadSafetyMode, new tsk0(this, 26));
        this.M0 = msy.a(lazyThreadSafetyMode, new pis0(this, 8));
        this.N0 = msy.a(lazyThreadSafetyMode, new ia90(16));
        this.O0 = PlayerType.FULLSCREEN;
        int i13 = 5;
        this.Q0 = msy.a(lazyThreadSafetyMode, new dqm0(i13));
        this.R0 = msy.a(lazyThreadSafetyMode, new rrn0(this, i12));
        this.S0 = msy.a(lazyThreadSafetyMode, new l6n0(this, i11));
        LayoutInflater.from(context).inflate(R.layout.video_view, (ViewGroup) this, true);
        if (fxc0.B().J().S0()) {
            xqt0 viewBinding = getViewBinding();
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewBinding.M = frameLayout;
            removeView(getViewBinding().c);
            removeView(getViewBinding().d);
            removeView(getViewBinding().E);
            FrameLayout frameLayout2 = getViewBinding().M;
            if (frameLayout2 != null) {
                frameLayout2.addView(getViewBinding().c, getViewBinding().c.getLayoutParams());
            }
            FrameLayout frameLayout3 = getViewBinding().M;
            if (frameLayout3 != null) {
                frameLayout3.addView(getViewBinding().d, getViewBinding().d.getLayoutParams());
            }
            FrameLayout frameLayout4 = getViewBinding().M;
            if (frameLayout4 != null) {
                frameLayout4.addView(getViewBinding().E, getViewBinding().E.getLayoutParams());
            }
            addView(getViewBinding().M, 0);
        }
        if (((Boolean) zqt0Var.f.getValue()).booleanValue() && gz80.a(31)) {
            avt0 avt0Var = new avt0(getViewBinding().b);
            getViewBinding().b.setViewDrawCacher(avt0Var);
            PlayerControlsView playerControlsView = getViewBinding().z;
            avt0.a aVar = avt0Var.a;
            playerControlsView.setVideoViewCacher(aVar);
            getViewBinding().a.setBlurSnapshots(aVar);
        }
        getViewBinding().g.o(this.B, this.M);
        getViewBinding().h.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        this.m = new yum0(getViewBinding().j);
        getViewBinding().p.setTag("bottom_about_video");
        bwt0.i0(getViewBinding().p, new hfm0(this, i11));
        getViewBinding().s.setTag("episode_button");
        getViewBinding().t.setTag("episode_button");
        E0();
        getViewBinding().u.Q4(ControlsIcon.VK_LOGO, false);
        V0();
        c63 c63Var = c63.a;
        Activity b2 = c63.b();
        Context context2 = e43.a;
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable((context2 == null ? null : context2).getApplicationContext()) != 0 || fxc0.B().J().V0() || b2 == null) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SMART_CAST;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures)) {
                getViewBinding().u.Q4(ControlsIcon.SMART_CAST, false);
            }
        } else {
            i0q0.f(new wy0(this, b2, context, i13));
        }
        getViewBinding().r.W3(context).setVisibility(8);
        getViewBinding().u.setVisibility(8);
        getViewBinding().w.setVisibility(8);
        getViewBinding().z.setControlsListener(this);
        getViewBinding().r.setImageLoader(cVar);
        bwt0.h0(fbs0Var, getViewBinding().o);
        getViewBinding().o.setTag("action_link_tag");
        getViewBinding().k.setCallback(this);
        getViewBinding().a.setButtonsOnClickListener(fbs0Var);
        getViewBinding().e.setButtonsOnClickListener(fbs0Var);
        getViewBinding().r.setButtonsClickListener(fbs0Var);
        setLandscape(X0(context));
        this.r0 = getViewBinding().r.W3(context).getVisibility() == 0;
        bwt0.i0(getViewBinding().A, new rzl0(this, i3));
        this.k = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.wpt0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                qcy<Object>[] qcyVarArr = VideoView.T0;
                VideoView videoView = VideoView.this;
                VideoFullscreenBottomBarView fullscreenBottomBar = videoView.getFullscreenBottomBar();
                if (fullscreenBottomBar != null) {
                    videoView.b1(fullscreenBottomBar);
                }
            }
        };
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.xpt0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int h2;
                Activity h3;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                VideoView videoView = VideoView.this;
                VideoBottomPanelView videoBottomPanelView = videoView.getViewBinding().G;
                if (videoBottomPanelView != null) {
                    if ((videoBottomPanelView.getVisibility() != 0 || videoBottomPanelView.getAlpha() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && videoView.M0()) {
                        h2 = (!videoView.M || (h3 = e3m.h(videoBottomPanelView.getContext())) == null) ? 0 : iah0.h(h3, true);
                    } else {
                        int measuredHeight = videoBottomPanelView.getMeasuredHeight();
                        ViewGroup.LayoutParams layoutParams = videoBottomPanelView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        h2 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + measuredHeight;
                    }
                    videoView.getViewBinding().z.setPadding(0, h2, 0, videoView.X(h2));
                }
            }
        };
        this.l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.ypt0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i14;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                VideoView videoView = VideoView.this;
                VideoPlayerAdsPanel videoPlayerAdsPanel = videoView.getViewBinding().I;
                if (videoPlayerAdsPanel != null) {
                    if (!videoView.B) {
                        if (videoView.M) {
                            Activity h2 = e3m.h(videoPlayerAdsPanel.getContext());
                            if (h2 != null) {
                                i14 = iah0.h(h2, true);
                            }
                        } else {
                            int measuredHeight = videoPlayerAdsPanel.getMeasuredHeight();
                            ViewGroup.LayoutParams layoutParams = videoPlayerAdsPanel.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            i14 = (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + measuredHeight;
                        }
                        videoView.getViewBinding().z.setPadding(0, i14, 0, videoView.X(i14));
                    }
                    i14 = 0;
                    videoView.getViewBinding().z.setPadding(0, i14, 0, videoView.X(i14));
                }
            }
        };
        this.h0 = new alt0(e43.l(new jao((uys0) findViewWithTag("download_video")), new a440(context, getViewBinding().u), getMultiTrackOnboarding().b, new j660(context, getViewBinding().J), new kky(context, getViewBinding().u)));
        if (zqt0Var.b()) {
            setClipChildren(false);
            setClipToPadding(false);
            getViewBinding().z.setClipChildren(false);
            getViewBinding().z.setClipToPadding(false);
            getViewBinding().r.setSeekBarAlwaysVisible(true);
            getViewBinding().r.setSeekBarAlwaysVisible(false);
            getViewBinding().c.getTransformController().b.add(new zjp0(getViewBinding().C));
            getViewBinding().C.setImageLoader(cVar);
            if (((Boolean) zqt0Var.h.getValue()).booleanValue()) {
                getViewBinding().r.setExtendSeekBarListener(new a());
            }
        }
    }

    @Override // xsna.hnt0
    public final void E() {
    }

    @Override // xsna.ywp0
    public final void b() {
    }

    @Override // xsna.hnt0
    public final void c2() {
    }

    @Override // xsna.yks0.a
    public final void dismiss() {
    }

    @Override // xsna.ywp0
    public final void n() {
    }

    @Override // xsna.ywp0
    public final void r() {
    }

    @Override // xsna.hnt0
    public final void u() {
    }

    /* compiled from: View.kt */
    public static final class i implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ VideoView c;
        public final /* synthetic */ LinearLayout d;

        public i(View view, VideoView videoView, LinearLayout linearLayout) {
            this.b = view;
            this.c = videoView;
            this.d = linearLayout;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            VideoView videoView = this.c;
            videoView.removeCallbacks(videoView.E0);
            f4m.j(this.d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }

    @Override // xsna.hnt0
    public final void K2(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void S2(long j) {
    }

    @Override // xsna.hnt0
    public final void U0(one.video.player.tracks.b bVar) {
    }

    @Override // xsna.hnt0
    public final void j4(VideoAutoPlay videoAutoPlay) {
    }

    @Override // xsna.hnt0
    public final void l(x2s0 x2s0Var) {
    }

    @Override // xsna.hnt0
    public final void p0(yg5 yg5Var) {
    }

    @Override // xsna.yks0.a
    public final void uf(boolean z) {
    }

    @Override // xsna.yks0.a
    public final void vk(boolean z) {
    }

    @Override // xsna.hnt0
    public final void x0(boolean z) {
    }

    @Override // xsna.hnt0
    public final void H(long j, long j2) {
    }

    @Override // xsna.hnt0
    public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
    }

    @Override // xsna.yks0.a
    public final void L9(VideoFile videoFile, boolean z) {
    }

    @Override // xsna.hnt0
    public final void N3(VideoAutoPlay videoAutoPlay, long j) {
    }

    @Override // xsna.hnt0
    public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
    }
}
