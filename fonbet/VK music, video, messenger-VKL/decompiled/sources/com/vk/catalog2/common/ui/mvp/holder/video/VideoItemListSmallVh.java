package com.vk.catalog2.common.ui.mvp.holder.video;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoScreenSource;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.libvideo.ui.UpcomingIndicatorView;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.a390;
import xsna.a5o;
import xsna.acp0;
import xsna.asp;
import xsna.azn;
import xsna.bpn0;
import xsna.bu00;
import xsna.bwt0;
import xsna.c98;
import xsna.cfi0;
import xsna.cpu;
import xsna.cqs0;
import xsna.d2c0;
import xsna.d7s0;
import xsna.djt0;
import xsna.drm0;
import xsna.e3m;
import xsna.e5o;
import xsna.e6s0;
import xsna.ejt0;
import xsna.epx;
import xsna.eqs0;
import xsna.f4m;
import xsna.f5o;
import xsna.fcs0;
import xsna.fl4;
import xsna.fqs0;
import xsna.fxc0;
import xsna.g620;
import xsna.g7s0;
import xsna.gpt0;
import xsna.gsg;
import xsna.hdt0;
import xsna.hm80;
import xsna.i1t0;
import xsna.i8n0;
import xsna.iah0;
import xsna.ift0;
import xsna.j5g;
import xsna.j8n0;
import xsna.jaa0;
import xsna.jl4;
import xsna.k5o;
import xsna.k7l0;
import xsna.l5o;
import xsna.lyd;
import xsna.m33;
import xsna.m6t0;
import xsna.msy;
import xsna.myc0;
import xsna.nkt0;
import xsna.o0r0;
import xsna.ols0;
import xsna.pkd;
import xsna.prq0;
import xsna.pvo0;
import xsna.qmj0;
import xsna.qr;
import xsna.s3q0;
import xsna.s490;
import xsna.s6s0;
import xsna.sub;
import xsna.sxq0;
import xsna.t9b;
import xsna.ta50;
import xsna.u4a;
import xsna.uqm0;
import xsna.w6s0;
import xsna.wmd0;
import xsna.x4o;
import xsna.xg5;
import xsna.xwk;
import xsna.y1o;
import xsna.y3l0;
import xsna.yg5;
import xsna.z2d0;
import xsna.z8s;
import xsna.zps0;
import xsna.zrp;
import xsna.zyn;

/* compiled from: VideoItemListSmallVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemListSmallVh extends VideoItemVh {
    public static final Object c0 = msy.a(LazyThreadSafetyMode.NONE, new cfi0(6));
    public final Boolean A;
    public final boolean B;
    public VkText C;
    public View D;
    public VkText E;
    public VkImage F;
    public DurationView G;
    public InteractiveDurationView H;
    public VkImage I;
    public VideoOverlayView J;
    public UpcomingIndicatorView K;
    public VkText L;
    public VkImage M;
    public VkImage N;
    public VkImage O;
    public VkImage P;
    public DonutBadge Q;
    public djt0 R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final int m;
    public final g7s0 n;
    public final pkd o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final hdt0 s;
    public final DonutVideoCardSource t;
    public final ift0 u;
    public final cqs0 v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoItemListSmallVh.kt */
    public static final class SpecialState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SpecialState[] $VALUES;
        public static final SpecialState Delayed;
        public static final SpecialState Draft;
        public static final SpecialState None;
        public static final SpecialState Private;

        static {
            SpecialState specialState = new SpecialState("None", 0);
            None = specialState;
            SpecialState specialState2 = new SpecialState("Private", 1);
            Private = specialState2;
            SpecialState specialState3 = new SpecialState("Draft", 2);
            Draft = specialState3;
            SpecialState specialState4 = new SpecialState("Delayed", 3);
            Delayed = specialState4;
            SpecialState[] specialStateArr = {specialState, specialState2, specialState3, specialState4};
            $VALUES = specialStateArr;
            $ENTRIES = new asp(specialStateArr);
        }

        public SpecialState() {
            throw null;
        }

        public static SpecialState valueOf(String str) {
            return (SpecialState) Enum.valueOf(SpecialState.class, str);
        }

        public static SpecialState[] values() {
            return (SpecialState[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoItemListSmallVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecialState.values().length];
            try {
                iArr[SpecialState.Draft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpecialState.Delayed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpecialState.Private.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpecialState.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoItemListSmallVh(int i, u4a u4aVar, SearchStatInfoProvider searchStatInfoProvider, boolean z, String str, boolean z2, hdt0 hdt0Var, DonutVideoCardSource donutVideoCardSource, int i2) {
        super(r8.f, searchStatInfoProvider, r3, r4, r5, r6, r7, r8);
        g7s0 B = fxc0.B();
        fl4 g = lyd.g();
        o0r0 e = xwk.e();
        cpu a2 = xg5.a();
        pkd f = g620.f();
        Boolean bool = null;
        String str2 = (i2 & 512) != 0 ? null : str;
        boolean z3 = (i2 & 1024) != 0 ? false : z2;
        boolean z4 = (i2 & 2048) == 0;
        DonutVideoCardSource donutVideoCardSource2 = (i2 & 8192) != 0 ? DonutVideoCardSource.SMALL_CARD : donutVideoCardSource;
        u4a.a aVar = u4aVar.b;
        this.m = i;
        this.n = B;
        this.o = f;
        this.p = z;
        this.q = z3;
        this.r = z4;
        this.s = hdt0Var;
        this.t = donutVideoCardSource2;
        ift0 ift0Var = new ift0();
        this.u = ift0Var;
        this.v = new cqs0(ift0Var, 1);
        this.w = B.J().j0();
        this.x = B.J().B0();
        this.y = B.J().F1();
        this.z = B.J().Y1();
        if (str2 != null) {
            bool = Boolean.valueOf(str2.equals("PROFILE") || str2.equals("PLAYLIST"));
        }
        this.A = bool;
        this.B = epx.f(str2, "PLAYLIST");
        d2c0 d2c0Var = new d2c0(13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, d2c0Var);
        this.T = msy.a(lazyThreadSafetyMode, new ta50(17));
        this.U = msy.a(lazyThreadSafetyMode, new qmj0(4));
        this.V = msy.a(lazyThreadSafetyMode, new jaa0(this, 29));
        this.W = msy.a(lazyThreadSafetyMode, new fcs0(this, 3));
        this.X = msy.a(lazyThreadSafetyMode, new acp0(this, 6));
        this.Y = msy.a(lazyThreadSafetyMode, new i8n0(this, 9));
        this.Z = msy.a(lazyThreadSafetyMode, new prq0(this, 12));
        this.a0 = msy.a(lazyThreadSafetyMode, new wmd0(this, 19));
        this.b0 = msy.a(lazyThreadSafetyMode, new j8n0(this, 14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0484, code lost:
    
        if (xsna.gpt0.C(r5) != false) goto L273;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07f9  */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v20, types: [com.vk.libvideo.design.view.duration.DurationView] */
    /* JADX WARN: Type inference failed for: r12v21, types: [com.vk.libvideo.design.view.duration.DurationView] */
    /* JADX WARN: Type inference failed for: r12v22, types: [com.vk.libvideo.design.view.movika.InteractiveDurationView] */
    /* JADX WARN: Type inference failed for: r12v23, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v24, types: [com.vk.libvideo.design.view.movika.InteractiveDurationView] */
    /* JADX WARN: Type inference failed for: r12v25, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v26, types: [com.vk.libvideo.design.view.duration.DurationView] */
    /* JADX WARN: Type inference failed for: r12v27, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v28, types: [com.vk.core.view.components.picture.VkImage] */
    /* JADX WARN: Type inference failed for: r12v29, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31, types: [com.vk.donut.video.model.presentation.video.DonutVideoUiModel$PreviewBadge, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v32, types: [com.vk.donut.video.model.presentation.video.DonutVideoUiModel$PreviewBadge] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34, types: [com.vk.libvideo.design.view.duration.DurationView] */
    /* JADX WARN: Type inference failed for: r12v35, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [com.vk.libvideo.design.view.movika.InteractiveDurationView] */
    /* JADX WARN: Type inference failed for: r12v39, types: [com.vk.libvideo.design.view.movika.InteractiveDurationView] */
    /* JADX WARN: Type inference failed for: r12v40, types: [com.vk.libvideo.design.view.movika.InteractiveDurationView] */
    /* JADX WARN: Type inference failed for: r12v41, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49, types: [xsna.fqs0$a] */
    /* JADX WARN: Type inference failed for: r12v50, types: [xsna.fqs0] */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43, types: [com.vk.libvideo.design.view.duration.DurationView] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46, types: [com.vk.libvideo.design.view.movika.InteractiveDurationView] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String P;
        String g;
        VideoRestriction videoRestriction;
        int i;
        CharSequence charSequence;
        int i2;
        UIBlockVideo uIBlockVideo;
        boolean a2;
        VkImage vkImage;
        ?? r12;
        CharSequence charSequence2;
        ListBuilder a3;
        azn a4;
        CharSequence P2;
        boolean z;
        VideoFile A;
        super.N6(uIBlock);
        UIBlockVideo uIBlockVideo2 = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo2 == null) {
            return;
        }
        String str = uIBlockVideo2.K;
        VideoFile videoFile = uIBlockVideo2.B;
        DonutVideoUiModel a5 = ((l5o) this.Y.getValue()).a(nkt0.a(videoFile), this.t);
        boolean isEmpty = uIBlock.Db().isEmpty();
        djt0 djt0Var = this.R;
        if (djt0Var != null) {
            djt0Var.setCanSwipe((uIBlockVideo2.L || uIBlockVideo2.H) && isEmpty);
        }
        VkImage vkImage2 = this.P;
        if (vkImage2 != null) {
            vkImage2.setVisibility(!isEmpty ? 0 : 8);
        }
        View view = this.D;
        if (view == null) {
            view = null;
        }
        Context context = view.getContext();
        boolean c = this.o.c(videoFile);
        boolean z2 = this.q;
        if (c) {
            VkImage vkImage3 = this.F;
            if (vkImage3 == null) {
                vkImage3 = null;
            }
            bwt0.r0(e3m.a(R.dimen.video_catalog_small_content_clip_item_width, context), vkImage3);
            VkImage vkImage4 = this.F;
            if (vkImage4 == null) {
                vkImage4 = null;
            }
            bwt0.c0(e3m.a(R.dimen.video_catalog_small_content_clip_item_height, context), vkImage4);
            VideoOverlayView videoOverlayView = this.J;
            if (videoOverlayView == null) {
                videoOverlayView = null;
            }
            bwt0.r0(e3m.a(R.dimen.video_catalog_small_content_clip_item_width, context), videoOverlayView);
            VideoOverlayView videoOverlayView2 = this.J;
            if (videoOverlayView2 == null) {
                videoOverlayView2 = null;
            }
            bwt0.c0(e3m.a(R.dimen.video_catalog_small_content_clip_item_height, context), videoOverlayView2);
        } else if (!z2) {
            VkImage vkImage5 = this.F;
            if (vkImage5 == null) {
                vkImage5 = null;
            }
            bwt0.r0(e3m.a(R.dimen.video_catalog_small_content_item_width, context), vkImage5);
            VkImage vkImage6 = this.F;
            if (vkImage6 == null) {
                vkImage6 = null;
            }
            bwt0.c0(e3m.a(R.dimen.video_catalog_small_content_item_height, context), vkImage6);
            VideoOverlayView videoOverlayView3 = this.J;
            if (videoOverlayView3 == null) {
                videoOverlayView3 = null;
            }
            bwt0.r0(e3m.a(R.dimen.video_catalog_small_content_item_width, context), videoOverlayView3);
            VideoOverlayView videoOverlayView4 = this.J;
            if (videoOverlayView4 == null) {
                videoOverlayView4 = null;
            }
            bwt0.c0(e3m.a(R.dimen.video_catalog_small_content_item_height, context), videoOverlayView4);
        }
        bpn0 bpn0Var = VideoOverlayView.I;
        VkImage vkImage7 = this.F;
        VkImage vkImage8 = vkImage7 == null ? null : vkImage7;
        VideoOverlayView videoOverlayView5 = this.J;
        VideoOverlayView videoOverlayView6 = videoOverlayView5 == null ? null : videoOverlayView5;
        DurationView durationView = this.G;
        DurationView durationView2 = durationView == null ? null : durationView;
        g7s0 g7s0Var = this.n;
        boolean c2 = g7s0Var.c(videoFile);
        VideoRestriction O = videoFile.O();
        com.vk.libvideo.design.view.overlay.b a6 = O != null ? ((a390) this.U.getValue()).a(O) : null;
        boolean z3 = videoFile.d8() || videoFile.z0();
        VideoPipStateHolder.a.getClass();
        yg5 c3 = VideoPipStateHolder.c();
        VideoOverlayView.b.a(new VideoOverlayView.a(vkImage8, videoOverlayView6, new d7s0(1, this, videoFile), null, durationView2, false, false, c2, new jl4(26, this, videoFile), new t9b(21, this, videoFile), a6, z3, epx.f((c3 == null || (A = c3.A()) == null) ? null : A.a1(), videoFile.a1()), new y3l0(this, 19), (i1t0) this.V.getValue(), new sub(this, videoFile, context, 7), 232));
        int i3 = a.$EnumSwitchMapping$0[(videoFile.Z1() ? SpecialState.Draft : ols0.a(videoFile) ? SpecialState.Delayed : (videoFile.getPrivacy().isEmpty() || Collections.singletonList(PrivacyRules.a.d).equals(videoFile.getPrivacy().get(0).zb())) ? SpecialState.None : SpecialState.Private).ordinal()];
        boolean z4 = this.z;
        if (i3 == 1) {
            VkImage vkImage9 = this.N;
            if (vkImage9 != null) {
                vkImage9.setVisibility(0);
            }
            if (vkImage9 != null) {
                vkImage9.setImageResource(R.drawable.vk_icon_pen_16);
            }
        } else if (i3 == 2) {
            VkImage vkImage10 = this.N;
            if (vkImage10 != null) {
                vkImage10.setVisibility(0);
            }
            if (vkImage10 != null) {
                vkImage10.setImageResource(R.drawable.vk_icon_clock_outline_16);
            }
        } else if (i3 != 3) {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            VkImage vkImage11 = this.N;
            if (vkImage11 != null) {
                vkImage11.setVisibility(8);
            }
        } else if (z4) {
            VkImage vkImage12 = this.N;
            Integer a7 = m6t0.a(videoFile.getPrivacy());
            VideoRestriction O2 = videoFile.O();
            if (vkImage12 != null) {
                vkImage12.setVisibility((a7 == null || !(O2 == null || O2.d)) ? 8 : 0);
            }
            if (vkImage12 != null && vkImage12.getVisibility() == 0) {
                vkImage12.setContentDescription(((PrivacySetting.PrivacyRule) j5g.Y(videoFile.getPrivacy())).Ab());
                if (a7 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                vkImage12.setImageResource(a7.intValue());
            }
        } else {
            boolean z5 = videoFile.getPrivacy().isEmpty() || Collections.singletonList(PrivacyRules.a.d).equals(videoFile.getPrivacy().get(0).zb());
            VkImage vkImage13 = this.N;
            if (vkImage13 != null) {
                vkImage13.setImageResource(R.drawable.vk_icon_lock_16);
            }
            VkImage vkImage14 = this.N;
            if (vkImage14 != null) {
                vkImage14.setVisibility(!z5 ? 0 : 8);
            }
        }
        boolean z6 = videoFile instanceof MusicVideoFile;
        if (z6) {
            VkText vkText = this.E;
            if (vkText == null) {
                vkText = null;
            }
            MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
            bu00.q(vkText, s490.d(e(), musicVideoFile.l, musicVideoFile.D1, R.attr.vk_ui_text_secondary));
        } else {
            VkText vkText2 = this.E;
            if (vkText2 == null) {
                vkText2 = null;
            }
            bu00.q(vkText2, videoFile.getTitle());
        }
        ?? r11 = c0;
        boolean z7 = this.y;
        if (z7) {
            VkText vkText3 = this.L;
            if (vkText3 != null) {
                CatalogViewStyle catalogViewStyle = uIBlockVideo2.l;
                boolean z8 = (catalogViewStyle instanceof VideoCatalogViewStyle) && ((VideoCatalogViewStyle) catalogViewStyle).Ab();
                List list = (List) r11.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Regex) it.next()).f(str)) {
                            break;
                        }
                    }
                }
                if (!new Regex(".*/video/?.*/added").f(str)) {
                    z = false;
                    boolean z9 = this.r;
                    vkText3.setVisibility((((z9 || z8) && (z9 || !z)) || !myc0.f(videoFile.P())) ? 8 : 0);
                }
                z = true;
                boolean z92 = this.r;
                vkText3.setVisibility((((z92 || z8) && (z92 || !z)) || !myc0.f(videoFile.P())) ? 8 : 0);
            }
            VkText vkText4 = this.L;
            if (vkText4 == null || vkText4.getVisibility() != 0 || z6) {
                VkImage vkImage15 = this.O;
                if (vkImage15 != null) {
                    f4m.j(vkImage15);
                }
            } else {
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfoHelper.k(this.O, false, videoFile.Y(), false, false, 48);
            }
            VkText vkText5 = this.L;
            if (vkText5 != null) {
                if (z6) {
                    MusicVideoFile musicVideoFile2 = (MusicVideoFile) videoFile;
                    P2 = s490.d(e(), s490.i(musicVideoFile2.B1), s490.c(musicVideoFile2.C1), R.attr.vk_ui_text_secondary);
                } else {
                    P2 = videoFile.P();
                }
                vkText5.setText(P2);
            }
        } else if (z6) {
            VkText vkText6 = this.L;
            if (vkText6 != null) {
                vkText6.setVisibility(0);
            }
            VkText vkText7 = this.L;
            if (vkText7 != null) {
                MusicVideoFile musicVideoFile3 = (MusicVideoFile) videoFile;
                vkText7.setText(s490.d(e(), s490.i(musicVideoFile3.B1), s490.c(musicVideoFile3.C1), R.attr.vk_ui_text_secondary));
            }
        } else {
            VkText vkText8 = this.L;
            if (vkText8 != null) {
                vkText8.setVisibility(0);
            }
            VkText vkText9 = this.L;
            if (vkText9 != null) {
                boolean f = new Regex(".*/video/?.*/added").f(str);
                if (!z2) {
                    List list2 = (List) r11.getValue();
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Regex) it2.next()).f(str)) {
                                break;
                            }
                        }
                    }
                    if (!f) {
                        VkImage vkImage16 = this.O;
                        if (vkImage16 != null) {
                            f4m.j(vkImage16);
                        }
                        P = this.u.b(e(), videoFile).toString();
                        vkText9.setText(P);
                    }
                }
                VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                VerifyInfoHelper.k(this.O, false, videoFile.Y(), false, false, 48);
                P = videoFile.P();
                vkText9.setText(P);
            }
            VkText vkText10 = this.L;
            if (vkText10 != null) {
                vkText10.setVisibility(k(videoFile) ? 8 : 0);
            }
        }
        boolean z10 = this.x;
        if (z7) {
            StringBuilder sb = new StringBuilder();
            if (videoFile.k1() <= 0 && !videoFile.z0() && (!g7s0Var.c(videoFile) || videoFile.L8() != 0)) {
                gpt0 gpt0Var = gpt0.a;
                sb.append((CharSequence) z8s.e(videoFile.L8(), e()));
            }
            if (videoFile.b0() == 0 && videoFile.k1() <= 0) {
                gpt0 gpt0Var2 = gpt0.a;
            }
            UpcomingIndicatorView upcomingIndicatorView = this.K;
            if (upcomingIndicatorView == null || upcomingIndicatorView.getVisibility() != 0) {
                if (!drm0.N(sb)) {
                    sb.append(" · ");
                }
                gpt0 gpt0Var3 = gpt0.a;
                sb.append(gpt0.r(e(), videoFile));
            }
            String sb2 = sb.toString();
            if (a5 == null || (a4 = k5o.a(a5)) == null) {
                r12 = 0;
                charSequence2 = null;
            } else {
                zyn zynVar = (zyn) this.a0.getValue();
                View view2 = this.D;
                if (view2 == null) {
                    view2 = null;
                }
                r12 = 0;
                charSequence2 = zynVar.a(a4, view2.getContext(), null);
            }
            if (charSequence2 != null) {
                r12 = new fqs0(1, charSequence2, r12, 4);
            }
            String str2 = drm0.N(sb2) ? null : " · ";
            if (str2 == null) {
                str2 = "";
            }
            this.v.getClass();
            List singletonList = Collections.singletonList(new eqs0.c(sb2));
            if (r12 != 0 && (a3 = cqs0.a(r12, singletonList)) != null) {
                singletonList = a3;
            }
            zps0 zps0Var = new zps0(str2, singletonList);
            VkText vkText11 = this.C;
            if (vkText11 == null) {
                vkText11 = null;
            }
            vkText11.setMaxLines((r12 != 0 ? r12.b : null) != null ? 2 : 1);
            VkText vkText12 = this.C;
            if (vkText12 == null) {
                vkText12 = null;
            }
            vkText12.setVisibility((drm0.N(sb2) && charSequence2 == null) ? 8 : 0);
            VkText vkText13 = this.C;
            if (vkText13 == null) {
                vkText13 = null;
            }
            VideoInfoTextView videoInfoTextView = vkText13 instanceof VideoInfoTextView ? (VideoInfoTextView) vkText13 : null;
            if (videoInfoTextView != null) {
                videoInfoTextView.setEllipsizeEnabled(true);
            }
            VkText vkText14 = this.C;
            if (vkText14 == null) {
                vkText14 = null;
            }
            VideoInfoTextView videoInfoTextView2 = vkText14 instanceof VideoInfoTextView ? (VideoInfoTextView) vkText14 : null;
            if (videoInfoTextView2 != null) {
                videoInfoTextView2.setText(zps0Var);
            }
            VkText vkText15 = this.C;
            if (vkText15 == null) {
                vkText15 = null;
            }
            vkText15.setOnClickListener(new hm80(2, a5, this));
        } else {
            boolean z11 = this.w;
            if (z2) {
                String str3 = (String) new z2d0(this, videoFile, uIBlockVideo2, 5).invoke();
                VkText vkText16 = this.C;
                if (vkText16 == null) {
                    vkText16 = null;
                }
                vkText16.setText(str3);
                boolean z12 = (videoFile.v() && videoFile.q0()) || (z11 && videoFile.k1() > 0);
                VkText vkText17 = this.C;
                if (vkText17 == null) {
                    vkText17 = null;
                }
                vkText17.setVisibility((!z10 ? !drm0.N(str3) : !(drm0.N(str3) || (z12 && !this.B))) ? 8 : 0);
            } else {
                int h = z10 ? h(videoFile) : videoFile.k1();
                gpt0 gpt0Var4 = gpt0.a;
                boolean z13 = ((long) videoFile.b0()) * 1000 == 0 && (z6 || z11 || h == 0);
                VkText vkText18 = this.C;
                if (vkText18 == null) {
                    vkText18 = null;
                }
                vkText18.setVisibility(z13 ? 8 : 0);
                if (!z13) {
                    if (z6) {
                        Context e = e();
                        g = uqm0.g(videoFile.L8()) ? e.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : e.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()));
                    } else {
                        g = g(uIBlockVideo2);
                    }
                    VkText vkText19 = this.C;
                    if (vkText19 == null) {
                        vkText19 = null;
                    }
                    vkText19.setText(g);
                }
            }
        }
        VkText vkText20 = this.E;
        if (vkText20 == null) {
            vkText20 = null;
        }
        MusicVideoFile musicVideoFile4 = z6 ? (MusicVideoFile) videoFile : null;
        if (musicVideoFile4 == null || !musicVideoFile4.A1) {
            videoRestriction = null;
            vkText20.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            videoRestriction = null;
            vkText20.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, vkText20.getContext()), (Drawable) null);
            vkText20.setCompoundDrawablePadding(iah0.a(4));
        }
        VideoRestriction O3 = videoFile.O();
        if (O3 == null || (e5o.b(O3) && ((f5o) this.b0.getValue()).a())) {
            O3 = videoRestriction;
        }
        boolean z14 = ((O3 != null && (!O3.d || !O3.f)) && z4) || ((videoFile.getDuration() == 0 && g7s0Var.c(videoFile)) && !z4);
        ?? r122 = this.G;
        if (r122 == null) {
            r122 = videoRestriction;
        }
        r122.setVisibility((videoFile.x0() || videoFile.W9() || z14 || (!z4 && videoFile.q0())) ? 8 : 0);
        ?? r123 = this.H;
        if (r123 == null) {
            r123 = videoRestriction;
        }
        r123.setVisibility((videoFile.q0() || !videoFile.W9() || z14) ? 8 : 0);
        VkImage vkImage17 = this.M;
        if (vkImage17 != null) {
            vkImage17.setVisibility((z14 || (!videoFile.x0() && (!videoFile.q0() || z4))) ? 8 : 0);
        }
        ?? r124 = this.H;
        if (r124 == null) {
            r124 = videoRestriction;
        }
        if (r124.getVisibility() == 0) {
            ?? r125 = this.H;
            if (r125 == null) {
                r125 = videoRestriction;
            }
            r125.setTextDescriptionVisible(false);
            ?? r126 = this.H;
            ?? r1 = r126 == null ? videoRestriction : r126;
            if (r126 == null) {
                r126 = videoRestriction;
            }
            r1.setDurationText(gpt0.m(r126.getContext(), videoFile, true, false));
        }
        ?? r127 = this.G;
        if (r127 == null) {
            r127 = videoRestriction;
        }
        if (r127.getVisibility() == 0) {
            ?? r128 = this.G;
            ?? r13 = r128 == null ? videoRestriction : r128;
            if (r128 == null) {
                r128 = videoRestriction;
            }
            r13.setText(gpt0.m(r128.getContext(), videoFile, true, z4));
        }
        ?? r129 = this.F;
        ?? r14 = r129 == null ? videoRestriction : r129;
        if (r129 == null) {
            r129 = videoRestriction;
        }
        r14.setContentDescription(gpt0.g(r129.getContext(), videoFile));
        ?? r1210 = a5 != null ? a5.b : videoRestriction;
        if (r1210 == null) {
            DonutBadge donutBadge = this.Q;
            if (donutBadge != null) {
                f4m.j(donutBadge);
            }
            i = 0;
        } else {
            DonutBadge donutBadge2 = this.Q;
            i = 0;
            if (donutBadge2 != null) {
                donutBadge2.setVisibility(0);
            }
            DonutBadge donutBadge3 = this.Q;
            if (donutBadge3 != null) {
                DonutPriceTemplate donutPriceTemplate = r1210.c;
                if (donutPriceTemplate != null) {
                    ?? r6 = this.D;
                    if (r6 == null) {
                        r6 = videoRestriction;
                    }
                    charSequence = y1o.b(donutPriceTemplate, r6.getContext());
                } else {
                    charSequence = r1210.b;
                }
                donutBadge3.setText(charSequence);
            }
            DonutBadge donutBadge4 = this.Q;
            if (donutBadge4 != null) {
                donutBadge4.setContentDescription(r1210.d);
            }
            DonutBadge donutBadge5 = this.Q;
            if (donutBadge5 != null) {
                donutBadge5.setOnClickListener(new gsg(4, r1210, this));
            }
        }
        if (z10) {
            int h2 = h(videoFile);
            UpcomingIndicatorView upcomingIndicatorView2 = this.K;
            if (upcomingIndicatorView2 != null) {
                upcomingIndicatorView2.setVisibility(h2 != 0 ? i : 8);
            }
            UpcomingIndicatorView upcomingIndicatorView3 = this.K;
            if (upcomingIndicatorView3 != null) {
                upcomingIndicatorView3.setUpcoming(h2);
                s3q0 s3q0Var = s3q0.a;
            }
        } else {
            UpcomingIndicatorView upcomingIndicatorView4 = this.K;
            if (upcomingIndicatorView4 != null) {
                i2 = 8;
                upcomingIndicatorView4.setVisibility(8);
                uIBlockVideo = (UIBlockVideo) uIBlock;
                s6s0 b = b(uIBlockVideo, true);
                if (((Boolean) this.W.getValue()).booleanValue()) {
                    int i4 = e6s0.f;
                    a2 = e6s0.a.a(b);
                } else {
                    float f2 = w6s0.d;
                    a2 = w6s0.a.a(b);
                }
                vkImage = this.I;
                ?? r2 = videoRestriction;
                if (vkImage != null) {
                    r2 = vkImage;
                }
                if (g7s0Var.c(uIBlockVideo.B) || a2) {
                    i2 = i;
                }
                r2.setVisibility(i2);
            }
        }
        i2 = 8;
        uIBlockVideo = (UIBlockVideo) uIBlock;
        s6s0 b2 = b(uIBlockVideo, true);
        if (((Boolean) this.W.getValue()).booleanValue()) {
        }
        vkImage = this.I;
        ?? r22 = videoRestriction;
        if (vkImage != null) {
        }
        if (g7s0Var.c(uIBlockVideo.B)) {
        }
        i2 = i;
        r22.setVisibility(i2);
    }

    public final Context e() {
        View view = this.D;
        if (view == null) {
            view = null;
        }
        return view.getContext();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final String g(UIBlockVideo uIBlockVideo) {
        VideoFile videoFile = uIBlockVideo.B;
        String str = uIBlockVideo.K;
        Owner s = videoFile.s();
        boolean f = qr.f(s != null ? s.b : null);
        boolean f2 = new Regex(".*/video/?.*/added").f(str);
        List list = (List) c0.getValue();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Regex) it.next()).f(str)) {
                    break;
                }
            }
        }
        if (!f2 || !epx.f(this.A, Boolean.FALSE) || f) {
            if (this.x && videoFile.z0() && videoFile.Na() > 0 && this.K == null) {
                return pvo0.i(false, (int) videoFile.Na(), false, false);
            }
            if (!this.w || videoFile.k1() <= 0) {
                gpt0 gpt0Var = gpt0.a;
                return gpt0.k(e(), videoFile).toString();
            }
            gpt0 gpt0Var2 = gpt0.a;
            return gpt0.r(e(), videoFile);
        }
        return this.u.b(e(), videoFile).toString();
    }

    public final int h(VideoFile videoFile) {
        if (videoFile.z0() && videoFile.Na() > 0) {
            return (int) videoFile.Na();
        }
        if (!this.w || videoFile.k1() <= 0) {
            return 0;
        }
        return videoFile.k1();
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void j(DonutVideoAction donutVideoAction, DonutVideoClickSource donutVideoClickSource) {
        View view = this.D;
        if (view == null) {
            view = null;
        }
        Activity a2 = VideoItemVh.a(view);
        if (a2 == null) {
            return;
        }
        ((x4o) this.Z.getValue()).a(donutVideoAction, a2, new a5o(new a5o.a(DonutVideoScreenSource.VK_VIDEO.h(), donutVideoClickSource.h()), 1));
    }

    public final boolean k(VideoFile videoFile) {
        boolean z = this.w;
        boolean z2 = this.B;
        if (z && videoFile.k1() > 0 && !z2) {
            return true;
        }
        if (this.n.c(videoFile) && videoFile.L8() == 0) {
            return true;
        }
        return this.x && videoFile.v() && videoFile.q0() && videoFile.Na() > 0 && !z2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        boolean g = this.n.J().g();
        int i = this.m;
        if (g) {
            Context context = layoutInflater.getContext();
            List singletonList = Collections.singletonList(new ejt0(R.drawable.vk_icon_delete_outline_24, iah0.a(24), iah0.a(74), R.attr.vk_ui_accent_red, 0, new sxq0(this, 4)));
            djt0 djt0Var = new djt0(context);
            djt0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            k7l0 k7l0Var = new k7l0(singletonList, 22);
            View inflate = layoutInflater.inflate(i, (ViewGroup) djt0Var, false);
            if (inflate.getBackground() == null) {
                inflate.setBackground(e3m.e(android.R.attr.windowBackground, context));
            }
            djt0Var.setFrontView(inflate);
            djt0Var.setBackView(k7l0Var);
            djt0Var.setId(R.id.video_swipe_layout_root);
            this.R = djt0Var;
            view = djt0Var.getFrontView();
            view2 = djt0Var;
        } else {
            View inflate2 = layoutInflater.inflate(i, viewGroup, false);
            view = inflate2;
            view2 = inflate2;
        }
        this.D = view;
        this.J = (VideoOverlayView) view.findViewById(R.id.overlay_view);
        this.E = (VkText) view.findViewById(R.id.title);
        this.C = (VkText) view.findViewById(R.id.subtitle_date);
        this.L = (VkText) view.findViewById(R.id.subtitle_views);
        this.F = (VkImage) view.findViewById(R.id.preview);
        this.G = (DurationView) view.findViewById(R.id.duration);
        VkImage vkImage = (VkImage) view.findViewById(R.id.menu);
        vkImage.setImageResource(R.drawable.vk_icon_more_vertical_16);
        this.I = vkImage;
        VkImage vkImage2 = (VkImage) view.findViewById(R.id.live_badge);
        if (vkImage2 != null) {
            vkImage2.setImageResource(R.drawable.vk_icon_live_badge_20);
        } else {
            vkImage2 = null;
        }
        this.M = vkImage2;
        this.K = (UpcomingIndicatorView) view.findViewById(R.id.video_upcoming_indicator);
        VkImage vkImage3 = (VkImage) view.findViewById(R.id.icon_verify);
        if (vkImage3 != null) {
            vkImage3.setImageResource(R.drawable.vk_icon_verified_16);
        } else {
            vkImage3 = null;
        }
        this.O = vkImage3;
        this.N = (VkImage) view.findViewById(R.id.special_state_icon);
        this.Q = (DonutBadge) view.findViewById(R.id.donut_price_badge);
        this.H = (InteractiveDurationView) view.findViewById(R.id.interactive_duration);
        VkImage vkImage4 = (VkImage) view.findViewById(R.id.drag_icon);
        this.P = vkImage4;
        if (vkImage4 != null) {
            vkImage4.setImageResource(R.drawable.vk_icon_menu_outline_16);
        }
        float a2 = e3m.a(R.dimen.small_video_corner_radius, layoutInflater.getContext());
        this.k = a2;
        if (this.p) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.small_video_item_root);
            ProgressBar progressBar = new ProgressBar(view.getContext(), null, 0, android.R.style.Widget.ProgressBar.Horizontal);
            progressBar.setId(R.id.progress_bar);
            progressBar.setIndeterminate(false);
            progressBar.setLayoutParams(new ConstraintLayout.b(0, iah0.a(5.0f)));
            progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, progressBar.getContext()));
            bwt0.d(progressBar, a2, (r4 & 2) != 0, (r4 & 4) != 0);
            progressBar.setVisibility(8);
            constraintLayout.addView(progressBar);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(constraintLayout);
            boolean z = this.q;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            bVar.l(R.id.progress_bar, 6, R.id.preview, 6, iah0.a(z ? 2.0f : 0.0f));
            if (z) {
                f = 2.0f;
            }
            bVar.l(R.id.progress_bar, 7, R.id.preview, 7, iah0.a(f));
            bVar.l(R.id.progress_bar, 4, R.id.preview, 4, iah0.a(-0.5f));
            bVar.b(constraintLayout);
        }
        VkImage vkImage5 = this.I;
        (vkImage5 != null ? vkImage5 : null).setOnClickListener(new c98(this, 1));
        view.setOnClickListener(new c98(this, 1));
        return view2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
