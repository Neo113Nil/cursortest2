package com.vk.libvideo.ui.video2.skippablepart;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoSkippablePart;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.libvideo.ui.video2.skippablepart.a;
import com.vk.stat.scheme.CommonVideoStat$TypeClickSkipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.time.DurationUnit;
import one.video.controls.models.PlayerState;
import xsna.a2s0;
import xsna.aht0;
import xsna.b8f0;
import xsna.bht0;
import xsna.bjc;
import xsna.bpn0;
import xsna.buc0;
import xsna.c3k0;
import xsna.cht0;
import xsna.dbs0;
import xsna.dhr0;
import xsna.eoo;
import xsna.epx;
import xsna.etn;
import xsna.gzs;
import xsna.h8n0;
import xsna.i8n0;
import xsna.iah0;
import xsna.ivs0;
import xsna.izs;
import xsna.j5g;
import xsna.jds0;
import xsna.jjc;
import xsna.m2l0;
import xsna.mit0;
import xsna.msy;
import xsna.nrq0;
import xsna.pn00;
import xsna.prq0;
import xsna.q500;
import xsna.qqf0;
import xsna.qyt;
import xsna.r6i0;
import xsna.rsr;
import xsna.s3q0;
import xsna.ta50;
import xsna.ttk0;
import xsna.up;
import xsna.utk0;
import xsna.uzp0;
import xsna.vtk0;
import xsna.wmd0;
import xsna.xh50;
import xsna.y3l0;
import xsna.yl40;
import xsna.zgt0;
import xsna.zno;
import xsna.zst0;

/* compiled from: VideoSkippablePartView.kt */
/* loaded from: classes3.dex */
public final class VideoSkippablePartView extends FrameLayout {
    public static final /* synthetic */ int C = 0;
    public izs<? super Long, s3q0> A;
    public izs<? super dbs0, s3q0> B;
    public final Object b;
    public final utk0 c;
    public final b8f0 d;
    public final utk0 e;
    public final b8f0 f;
    public final utk0 g;
    public final b8f0 h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final utk0 p;
    public final utk0 q;
    public final utk0 r;
    public final utk0 s;
    public final utk0 t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final bpn0 x;
    public final Object y;
    public final Object z;

    /* compiled from: VideoSkippablePartView.kt */
    public static final class a {
        public final mit0 a;
        public final PlayerState b;
        public final VideoFile c;
        public final izs<Long, s3q0> d;
        public final izs<dbs0, s3q0> e;

        public a() {
            throw null;
        }

        public a(mit0 mit0Var, PlayerState playerState, VideoFile videoFile, izs izsVar, izs izsVar2, int i) {
            mit0Var = (i & 1) != 0 ? null : mit0Var;
            playerState = (i & 2) != 0 ? null : playerState;
            this.a = mit0Var;
            this.b = playerState;
            this.c = videoFile;
            this.d = izsVar;
            this.e = izsVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            mit0 mit0Var = this.a;
            int hashCode = (mit0Var == null ? 0 : mit0Var.hashCode()) * 31;
            PlayerState playerState = this.b;
            int hashCode2 = (hashCode + (playerState == null ? 0 : playerState.hashCode())) * 31;
            VideoFile videoFile = this.c;
            int hashCode3 = (hashCode2 + (videoFile == null ? 0 : videoFile.hashCode())) * 961;
            izs<Long, s3q0> izsVar = this.d;
            return this.e.hashCode() + ((hashCode3 + (izsVar != null ? izsVar.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(newPlayerState=");
            sb.append(this.a);
            sb.append(", oldPlayerState=");
            sb.append(this.b);
            sb.append(", videoFile=");
            sb.append(this.c);
            sb.append(", nextVideo=null, onSeekRequested=");
            sb.append(this.d);
            sb.append(", onNextVideo=");
            return up.c(sb, this.e, ')');
        }
    }

    /* compiled from: VideoSkippablePartView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PlayerState.values().length];
            try {
                iArr[PlayerState.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerState.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoSkippableSection.values().length];
            try {
                iArr2[VideoSkippableSection.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoSkippableSection.ENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoSkippableSection.UNSKIPPABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.vk.libvideo.ui.video2.PlayerState.values().length];
            try {
                iArr3[com.vk.libvideo.ui.video2.PlayerState.PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[com.vk.libvideo.ui.video2.PlayerState.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[com.vk.libvideo.ui.video2.PlayerState.AD_PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* compiled from: VideoSkippablePartView.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            VideoSkippablePartView videoSkippablePartView = (VideoSkippablePartView) this.receiver;
            int i = VideoSkippablePartView.C;
            videoSkippablePartView.l(false);
            return s3q0.a;
        }
    }

    public VideoSkippablePartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 22;
        y3l0 y3l0Var = new y3l0(context, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, y3l0Var);
        utk0 a2 = vtk0.a(VideoSkippableSection.UNSKIPPABLE);
        this.c = a2;
        this.d = rsr.f(a2);
        utk0 a3 = vtk0.a(null);
        this.e = a3;
        this.f = rsr.f(a3);
        Boolean bool = Boolean.FALSE;
        utk0 a4 = vtk0.a(bool);
        this.g = a4;
        this.h = rsr.f(a4);
        this.i = msy.a(lazyThreadSafetyMode, new qqf0(4));
        int i2 = 12;
        this.j = msy.a(lazyThreadSafetyMode, new i8n0(context, i2));
        this.k = msy.a(lazyThreadSafetyMode, new prq0(this, 16));
        this.l = msy.a(lazyThreadSafetyMode, new wmd0(this, i));
        this.m = msy.a(lazyThreadSafetyMode, new yl40(context, 1));
        this.n = msy.a(lazyThreadSafetyMode, new ivs0(this, 4));
        this.o = msy.a(lazyThreadSafetyMode, new jds0(this, 6));
        this.p = vtk0.a(new VideoFileOld());
        this.q = vtk0.a(null);
        this.r = vtk0.a(null);
        this.s = vtk0.a(bool);
        this.t = vtk0.a(bool);
        VideoSkippableSection videoSkippableSection = VideoSkippableSection.OPENING;
        Boolean bool2 = Boolean.TRUE;
        Pair pair = new Pair(videoSkippableSection, vtk0.a(bool2));
        VideoSkippableSection videoSkippableSection2 = VideoSkippableSection.ENDING;
        this.u = pn00.k(pair, new Pair(videoSkippableSection2, vtk0.a(bool2)));
        this.v = pn00.k(new Pair(videoSkippableSection, vtk0.a(bool)), new Pair(videoSkippableSection2, vtk0.a(bool)));
        this.w = msy.a(lazyThreadSafetyMode, new buc0(17));
        this.x = new bpn0(new ta50(19));
        this.y = msy.a(lazyThreadSafetyMode, new h8n0(this, i2));
        this.z = msy.a(lazyThreadSafetyMode, new nrq0(this, 7));
        setClickable(false);
        setFocusable(false);
        setClipToPadding(false);
        setClipChildren(false);
        getSkippableRow$core_release().addView(getWatchButton());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = 8;
        layoutParams.setMarginStart(iah0.a(f));
        getSkippableRow$core_release().addView(getSkipButton(), layoutParams);
        getRootContainer().addView(getNextVideoPreview());
        LinearLayout rootContainer = getRootContainer();
        LinearLayout skippableRow$core_release = getSkippableRow$core_release();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = iah0.a(f);
        s3q0 s3q0Var = s3q0.a;
        rootContainer.addView(skippableRow$core_release, layoutParams2);
        addView(getRootContainer());
        setVisibility(8);
        int i3 = 20;
        jjc.g(getWatchButton(), new m2l0(this, i3));
        jjc.g(getSkipButton(), new c3k0(this, 15));
        jjc.g(getNextVideoPreview(), new r6i0(this, i3));
    }

    public static ClipDrawable a(VideoSkippablePartView videoSkippablePartView) {
        dhr0 dhr0Var = dhr0.a;
        Context darkThemeContext = videoSkippablePartView.getDarkThemeContext();
        dhr0Var.getClass();
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(dhr0.f.a(R.attr.vk_ui_background_contrast_hover, darkThemeContext)), 8388611, 1);
        clipDrawable.setLevel(0);
        return clipDrawable;
    }

    public static VkButton b(VideoSkippablePartView videoSkippablePartView) {
        dhr0 dhr0Var = dhr0.a;
        Context darkThemeContext = videoSkippablePartView.getDarkThemeContext();
        dhr0Var.getClass();
        return videoSkippablePartView.k(new LayerDrawable(new Drawable[]{new ColorDrawable(dhr0.f.a(R.attr.vk_ui_background_contrast, videoSkippablePartView.getDarkThemeContext())), videoSkippablePartView.getSkipFillDrawable()}), dhr0.f.a(R.attr.vk_ui_text_primary_invariably, darkThemeContext), R.id.video_skippable_parts_skip_button);
    }

    public static VkButton c(VideoSkippablePartView videoSkippablePartView) {
        dhr0 dhr0Var = dhr0.a;
        Context darkThemeContext = videoSkippablePartView.getDarkThemeContext();
        dhr0Var.getClass();
        return videoSkippablePartView.k(new ColorDrawable(dhr0.f.a(R.attr.vk_ui_background_secondary_alpha, videoSkippablePartView.getDarkThemeContext())), dhr0.f.a(R.attr.vk_ui_text_accent_themed, darkThemeContext), R.id.video_skippable_parts_watch_button);
    }

    public static ObjectAnimator d(VideoSkippablePartView videoSkippablePartView) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(videoSkippablePartView.getSkipFillDrawable(), "level", 0, 10000);
        ofInt.setDuration(8000L);
        ofInt.setInterpolator(new LinearInterpolator());
        return ofInt;
    }

    public static s3q0 e(VideoSkippablePartView videoSkippablePartView) {
        videoSkippablePartView.setAutoSkip$core_release(false);
        videoSkippablePartView.setSkippableDismissed(true);
        videoSkippablePartView.setSkippableRowVisible$core_release(false);
        videoSkippablePartView.l(true);
        return s3q0.a;
    }

    public static s3q0 f(VideoSkippablePartView videoSkippablePartView) {
        videoSkippablePartView.setAutoSkip$core_release(true);
        videoSkippablePartView.setSkippableDismissed(false);
        videoSkippablePartView.l(false);
        return s3q0.a;
    }

    public static s3q0 g(VideoSkippablePartView videoSkippablePartView) {
        videoSkippablePartView.setAutoSkip$core_release(true);
        videoSkippablePartView.setSkippableDismissed(false);
        videoSkippablePartView.l(false);
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getAreNewControlsEnabled() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Context getDarkThemeContext() {
        return (Context) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final aht0 getDelegate() {
        return (aht0) this.y.getValue();
    }

    private final VideoFile getNextVideo() {
        a2s0 b2 = getVideosQueue().b(false, false);
        if (b2 != null) {
            return b2.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKImageView getNextVideoPreview() {
        return (VKImageView) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getRootContainer() {
        return (LinearLayout) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getSkipButton() {
        return (VkButton) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ObjectAnimator getSkipFillAnimator() {
        return (ObjectAnimator) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ClipDrawable getSkipFillDrawable() {
        return (ClipDrawable) this.n.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zst0 getVideosQueue() {
        return (zst0) this.z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkButton getWatchButton() {
        return (VkButton) this.k.getValue();
    }

    public static aht0 h(VideoSkippablePartView videoSkippablePartView) {
        return new aht0(videoSkippablePartView, videoSkippablePartView.getWatchButton(), videoSkippablePartView.getSkipButton());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(VideoSkippablePartView videoSkippablePartView, Long l, boolean z, boolean z2, boolean z3, int i) {
        List<VideoSkippablePart.Part> list;
        boolean z4;
        VideoSkippableSection videoSkippableSection;
        int i2;
        List<VideoSkippablePart.Part> list2;
        VideoSkippablePart.Part part;
        Long l2;
        a.b bVar = null;
        Long l3 = (i & 1) != 0 ? null : l;
        boolean z5 = false;
        boolean z6 = (i & 2) != 0 ? false : z;
        boolean z7 = (i & 4) != 0 ? false : z2;
        boolean z8 = (i & 8) != 0 ? false : z3;
        b8f0 b8f0Var = videoSkippablePartView.d;
        utk0 utk0Var = videoSkippablePartView.p;
        if (z6) {
            videoSkippablePartView.setSkippableRowVisible$core_release(false);
            return;
        }
        if (z7 || z8) {
            videoSkippablePartView.setSkippableRowVisible$core_release(false);
            videoSkippablePartView.setAutoSkip$core_release(false);
            return;
        }
        VideoSkippablePart A2 = ((VideoFile) utk0Var.getValue()).A2();
        if (A2 == null || (list = A2.c) == null) {
            return;
        }
        VideoSkippablePart.Part part2 = (VideoSkippablePart.Part) j5g.a0(list);
        VideoSkippablePart.Part part3 = (VideoSkippablePart.Part) j5g.k0(list);
        if (part2 == null || part3 == null) {
            return;
        }
        zno.a aVar = zno.c;
        long e = zno.e(eoo.e(((VideoFile) utk0Var.getValue()).getDuration(), DurationUnit.SECONDS));
        long j = part2.c;
        Long l4 = part2.d;
        q500 q500Var = new q500(j, l4 != null ? l4.longValue() : 0L);
        q500 q500Var2 = new q500(part3.c, e);
        boolean z9 = l3 != null && q500Var.f(l3.longValue());
        if (l3 != null && q500Var2.f(l3.longValue())) {
            if (videoSkippablePartView.q.getValue() != null) {
                z4 = true;
                videoSkippableSection = (l3 == null && q500Var.f(l3.longValue())) ? VideoSkippableSection.OPENING : (l3 == null && q500Var2.f(l3.longValue())) ? VideoSkippableSection.ENDING : VideoSkippableSection.UNSKIPPABLE;
                if (videoSkippableSection != b8f0Var.b.getValue() && l3 != null) {
                    videoSkippablePartView.c.setValue(videoSkippableSection);
                    long longValue = l3.longValue();
                    utk0 utk0Var2 = videoSkippablePartView.r;
                    utk0 utk0Var3 = videoSkippablePartView.t;
                    i2 = b.$EnumSwitchMapping$1[videoSkippableSection.ordinal()];
                    if (i2 != 1) {
                        videoSkippablePartView.getDelegate().d(videoSkippableSection, ((Boolean) utk0Var3.getValue()).booleanValue());
                        VideoSkippablePart A22 = ((VideoFile) utk0Var.getValue()).A2();
                        if (A22 != null && (list2 = A22.c) != null && (part = (VideoSkippablePart.Part) j5g.a0(list2)) != null && (l2 = part.d) != null) {
                            bVar = new a.b(l2.longValue());
                        }
                        utk0Var2.setValue(bVar);
                        videoSkippablePartView.t(longValue, q500Var);
                    } else if (i2 == 2) {
                        videoSkippablePartView.getDelegate().d(videoSkippableSection, ((Boolean) utk0Var3.getValue()).booleanValue());
                        utk0Var2.setValue(a.C1253a.a);
                        videoSkippablePartView.t(longValue, q500Var2);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        videoSkippablePartView.n();
                    }
                }
                xh50 xh50Var = (xh50) videoSkippablePartView.v.get((VideoSkippableSection) b8f0Var.b.getValue());
                boolean booleanValue = xh50Var == null ? ((Boolean) xh50Var.getValue()).booleanValue() : false;
                if ((!z9 || z4) && !booleanValue) {
                    z5 = true;
                }
                videoSkippablePartView.setSkippableRowVisible$core_release(z5);
            }
            VKApplication vKApplication = com.vk.core.apps.a.a;
        }
        z4 = false;
        if (l3 == null) {
        }
        if (videoSkippableSection != b8f0Var.b.getValue()) {
            videoSkippablePartView.c.setValue(videoSkippableSection);
            long longValue2 = l3.longValue();
            utk0 utk0Var22 = videoSkippablePartView.r;
            utk0 utk0Var32 = videoSkippablePartView.t;
            i2 = b.$EnumSwitchMapping$1[videoSkippableSection.ordinal()];
            if (i2 != 1) {
            }
        }
        xh50 xh50Var2 = (xh50) videoSkippablePartView.v.get((VideoSkippableSection) b8f0Var.b.getValue());
        if (xh50Var2 == null) {
        }
        if (!z9) {
        }
        z5 = true;
        videoSkippablePartView.setSkippableRowVisible$core_release(z5);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    private final void setSkippableDismissed(boolean z) {
        xh50 xh50Var = (xh50) this.v.get(getCurrentSectionFlow$core_release().getValue());
        if (xh50Var == null) {
            return;
        }
        xh50Var.setValue(Boolean.valueOf(z));
        xh50Var.getValue();
    }

    public final ttk0<Boolean> getAreControlsHiddenBySkippable$core_release() {
        return this.h;
    }

    public final ttk0<VideoSkippableSection> getCurrentSectionFlow$core_release() {
        return this.d;
    }

    public final ttk0<ScreenState> getScreenRotationFlow$core_release() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final LinearLayout getSkippableRow$core_release() {
        return (LinearLayout) this.b.getValue();
    }

    public final void i(a aVar) {
        izs<dbs0, s3q0> izsVar = aVar.e;
        izs<Long, s3q0> izsVar2 = aVar.d;
        boolean areNewControlsEnabled = getAreNewControlsEnabled();
        utk0 utk0Var = this.t;
        utk0 utk0Var2 = this.p;
        if (!areNewControlsEnabled) {
            VideoFile videoFile = aVar.c;
            if (videoFile == null) {
                return;
            }
            utk0Var2.getClass();
            utk0Var2.i(null, videoFile);
            VideoSkippablePart A2 = videoFile.A2();
            Boolean valueOf = Boolean.valueOf(A2 != null && A2.b);
            utk0Var.getClass();
            utk0Var.i(null, valueOf);
            j();
            this.A = izsVar2;
            this.B = izsVar;
            return;
        }
        mit0 mit0Var = aVar.a;
        if (mit0Var == null) {
            return;
        }
        VideoFile videoFile2 = mit0Var.a;
        ScreenState screenState = mit0Var.c.b;
        if (screenState == null) {
            return;
        }
        utk0Var2.setValue(videoFile2);
        VideoSkippablePart A22 = videoFile2.A2();
        Boolean valueOf2 = Boolean.valueOf(A22 != null && A22.b);
        utk0Var.getClass();
        utk0Var.i(null, valueOf2);
        this.A = izsVar2;
        this.B = izsVar;
        utk0 utk0Var3 = this.e;
        utk0Var3.getClass();
        utk0Var3.i(null, screenState);
        Boolean bool = Boolean.TRUE;
        utk0 utk0Var4 = this.s;
        utk0Var4.getClass();
        utk0Var4.i(null, bool);
        j();
        int i = b.$EnumSwitchMapping$2[mit0Var.b.a.a.ordinal()];
        if (i == 1) {
            setAutoSkip$core_release(false);
            ObjectAnimator skipFillAnimator = getSkipFillAnimator();
            ClipDrawable skipFillDrawable = getSkipFillDrawable();
            skipFillAnimator.cancel();
            skipFillDrawable.setLevel(0);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            n();
        } else {
            if (screenState == ScreenState.MINI || screenState == ScreenState.PIP || !s()) {
                return;
            }
            setAutoSkip$core_release(true);
        }
    }

    public final void j() {
        VideoFile nextVideo = getNextVideo();
        utk0 utk0Var = this.q;
        utk0Var.setValue(nextVideo);
        VideoFile videoFile = (VideoFile) utk0Var.getValue();
        if (videoFile != null) {
            VKImageView nextVideoPreview = getNextVideoPreview();
            ImageSize imageSize = (ImageSize) j5g.k0(videoFile.getImage().c);
            String str = imageSize != null ? imageSize.d.d : null;
            if (str == null) {
                str = "";
            }
            nextVideoPreview.O0(str, ImageScreenSize.SIZE_160DP);
        }
    }

    public final VkButton k(Drawable drawable, int i, int i2) {
        VkButton vkButton = new VkButton(getContext(), null, 6, 0);
        vkButton.setId(i2);
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vkButton.setVisibility(8);
        vkButton.setTextTint(ColorStateList.valueOf(i));
        vkButton.setBackground(drawable);
        return vkButton;
    }

    public final void l(boolean z) {
        izs<? super dbs0, s3q0> izsVar;
        utk0 utk0Var = this.r;
        CommonVideoStat$TypeClickSkipItem.EventType eventType = null;
        if (z) {
            utk0Var.setValue(null);
        }
        ObjectAnimator skipFillAnimator = getSkipFillAnimator();
        ClipDrawable skipFillDrawable = getSkipFillDrawable();
        skipFillAnimator.cancel();
        skipFillDrawable.setLevel(0);
        setSkippableRowVisible$core_release(false);
        int i = bht0.a.$EnumSwitchMapping$0[((VideoSkippableSection) this.d.b.getValue()).ordinal()];
        if (i == 1) {
            eventType = z ? CommonVideoStat$TypeClickSkipItem.EventType.WATCH_INTRO_BUTTON_TAP : CommonVideoStat$TypeClickSkipItem.EventType.SKIP_INTRO_BUTTON_TAP;
        } else if (i == 2) {
            eventType = z ? CommonVideoStat$TypeClickSkipItem.EventType.WATCH_CREDITS_BUTTON_TAP : CommonVideoStat$TypeClickSkipItem.EventType.SKIP_CREDITS_BUTTON_TAP;
        }
        CommonVideoStat$TypeClickSkipItem.EventSubtype eventSubtype = s() ? CommonVideoStat$TypeClickSkipItem.EventSubtype.AUTO : CommonVideoStat$TypeClickSkipItem.EventSubtype.CLICK;
        if (eventType != null) {
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(((VideoFile) r2.getValue()).o0()), null, null, ((VideoFile) this.p.getValue()).r(), null, 44, null), new CommonVideoStat$TypeClickSkipItem(eventType, eventSubtype), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
        }
        com.vk.libvideo.ui.video2.skippablepart.a aVar = (com.vk.libvideo.ui.video2.skippablepart.a) utk0Var.getValue();
        if (aVar instanceof a.b) {
            izs<? super Long, s3q0> izsVar2 = this.A;
            if (izsVar2 != null) {
                izsVar2.invoke(Long.valueOf(((a.b) aVar).a));
                return;
            }
            return;
        }
        if (!(aVar instanceof a.C1253a) || (izsVar = this.B) == null) {
            return;
        }
        izsVar.invoke(zgt0.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void n() {
        ObjectAnimator skipFillAnimator = getSkipFillAnimator();
        ClipDrawable skipFillDrawable = getSkipFillDrawable();
        skipFillAnimator.cancel();
        skipFillDrawable.setLevel(0);
        setSkippableRowVisible$core_release(false);
        this.r.setValue(null);
        Iterator it = this.v.values().iterator();
        while (it.hasNext()) {
            ((xh50) it.next()).setValue(Boolean.FALSE);
        }
    }

    public final void o(boolean z, boolean z2) {
        if (getAreNewControlsEnabled()) {
            q();
        } else {
            r(z, z2);
        }
    }

    public final void p(boolean z, boolean z2, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z);
        utk0 utk0Var = this.s;
        utk0Var.getClass();
        utk0Var.i(null, valueOf);
        if (getAreNewControlsEnabled()) {
            q();
        } else {
            r(z2, z3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void q() {
        int i;
        int b2;
        VideoSkippablePartView videoSkippablePartView = getDelegate().a;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(100L);
        TransitionManager.beginDelayedTransition(videoSkippablePartView, changeBounds);
        aht0 delegate = getDelegate();
        ScreenState screenState = (ScreenState) this.f.b.getValue();
        boolean booleanValue = ((Boolean) this.s.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.x.getValue()).booleanValue();
        if (screenState == null) {
            i = -1;
        } else {
            delegate.getClass();
            i = aht0.a.$EnumSwitchMapping$0[screenState.ordinal()];
        }
        if (i == 1) {
            b2 = aht0.b(delegate.c() ? iah0.a(96) : ((etn) delegate.e.getValue()).b ? iah0.a(47) : iah0.a(50), iah0.a(12), booleanValue);
        } else if (i != 2) {
            b2 = aht0.b((delegate.c() && booleanValue2) ? iah0.a(28) : (!delegate.c() || booleanValue2) ? (delegate.c() || !booleanValue2) ? iah0.a(12) : iah0.a(18) : iah0.a(36), booleanValue2 ? iah0.a(6) : iah0.a(12), booleanValue);
        } else {
            b2 = aht0.b(iah0.a(((etn) delegate.e.getValue()).a ? 64 : 67), iah0.a(12), booleanValue);
        }
        getDelegate().getClass();
        aht0.a(this, b2);
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void r(boolean z, boolean z2) {
        int b2;
        VideoSkippablePartView videoSkippablePartView = getDelegate().a;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(100L);
        TransitionManager.beginDelayedTransition(videoSkippablePartView, changeBounds);
        aht0 delegate = getDelegate();
        boolean booleanValue = ((Boolean) this.s.getValue()).booleanValue();
        boolean booleanValue2 = ((Boolean) this.x.getValue()).booleanValue();
        if (delegate.c() && z2) {
            b2 = aht0.b(iah0.a(booleanValue2 ? 77 : 80), iah0.a(12), booleanValue);
        } else if (delegate.c()) {
            b2 = aht0.b(iah0.a(booleanValue2 ? 24 : 36), iah0.a(12), booleanValue);
        } else if (z && z2) {
            b2 = aht0.b(iah0.a(booleanValue2 ? 44 : 50), iah0.a(12), booleanValue);
        } else if (z2) {
            b2 = ((etn) delegate.e.getValue()).a ? aht0.b(iah0.a(44), iah0.a(12), booleanValue) : aht0.b(iah0.a(68), iah0.a(12), booleanValue);
        } else {
            b2 = aht0.b(booleanValue2 ? iah0.a(18) : iah0.a(12), booleanValue2 ? iah0.a(6) : iah0.a(12), booleanValue);
        }
        getDelegate().getClass();
        aht0.a(this, b2);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final boolean s() {
        Object obj = Boolean.TRUE;
        xh50 xh50Var = (xh50) this.u.get(getCurrentSectionFlow$core_release().getValue());
        if (xh50Var != null) {
            obj = xh50Var.getValue();
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void setAutoSkip$core_release(boolean z) {
        xh50 xh50Var = (xh50) this.u.get(getCurrentSectionFlow$core_release().getValue());
        if (xh50Var == null) {
            return;
        }
        xh50Var.setValue(Boolean.valueOf(z));
        xh50Var.getValue();
    }

    public final void setSkippableRowVisible$core_release(boolean z) {
        bht0.a(this, z);
        VkButton watchButton = getWatchButton();
        boolean z2 = false;
        utk0 utk0Var = this.s;
        bht0.a(watchButton, z && !((Boolean) utk0Var.getValue()).booleanValue());
        bht0.a(getSkipButton(), z);
        VKImageView nextVideoPreview = getNextVideoPreview();
        if (z && !((Boolean) utk0Var.getValue()).booleanValue() && this.d.b.getValue() == VideoSkippableSection.ENDING) {
            z2 = true;
        }
        bht0.a(nextVideoPreview, z2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final void t(long j, q500 q500Var) {
        xh50 xh50Var = (xh50) this.u.get((VideoSkippableSection) this.d.b.getValue());
        if (xh50Var != null ? ((Boolean) xh50Var.getValue()).booleanValue() : false) {
            long j2 = q500Var.b;
            if (j >= j2 && q500Var.c - j2 > 8000) {
                c cVar = new c(0, this, VideoSkippablePartView.class, "handleCurrentAction", "handleCurrentAction(Z)V", 0);
                VKApplication vKApplication = com.vk.core.apps.a.a;
                ObjectAnimator skipFillAnimator = getSkipFillAnimator();
                ClipDrawable skipFillDrawable = getSkipFillDrawable();
                skipFillAnimator.cancel();
                skipFillDrawable.setLevel(0);
                getSkipFillAnimator().removeAllListeners();
                getSkipFillAnimator().removeAllUpdateListeners();
                getSkipFillDrawable().setLevel(0);
                ObjectAnimator skipFillAnimator2 = getSkipFillAnimator();
                cht0 cht0Var = new cht0(new qyt(0, this, VideoSkippablePartView.class, "shouldAutoSkip", "shouldAutoSkip()Z", 0, 3), cVar);
                skipFillAnimator2.addUpdateListener(cht0Var);
                skipFillAnimator2.addListener(cht0Var);
                getSkipFillAnimator().start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r5 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r5 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(boolean z) {
        int i = b.$EnumSwitchMapping$1[((VideoSkippableSection) this.d.b.getValue()).ordinal()];
        boolean z2 = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (this.q.getValue() != null) {
            }
        }
        if (z2 != ((Boolean) this.h.b.getValue()).booleanValue()) {
            Boolean valueOf = Boolean.valueOf(z2);
            utk0 utk0Var = this.g;
            utk0Var.getClass();
            utk0Var.i(null, valueOf);
        }
    }

    public final void v(PlayerState playerState, boolean z) {
        if (z) {
            n();
            return;
        }
        int i = b.$EnumSwitchMapping$0[playerState.ordinal()];
        if (i != 1) {
            if (i == 2 && s()) {
                setAutoSkip$core_release(true);
                return;
            }
            return;
        }
        setAutoSkip$core_release(false);
        ObjectAnimator skipFillAnimator = getSkipFillAnimator();
        ClipDrawable skipFillDrawable = getSkipFillDrawable();
        skipFillAnimator.cancel();
        skipFillDrawable.setLevel(0);
    }
}
