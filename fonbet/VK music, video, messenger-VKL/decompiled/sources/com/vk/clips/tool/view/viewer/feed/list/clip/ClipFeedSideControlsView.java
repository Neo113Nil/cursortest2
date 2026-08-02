package com.vk.clips.tool.view.viewer.feed.list.clip;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.sidecontrols.models.AnonymousMode;
import com.vk.clips.design.view.sidecontrols.models.AvailabilityConfig;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.side.favorites.FavoritesLoadingState;
import com.vk.clips.design.view.sidecontrols.side.reactions.ReactionsLoading;
import com.vk.clips.viewer.impl.feed.view.list.item.controls.side.shares.fast.config.ClipsFastShareConfig$Strategy;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.DislikeAnonymous;
import com.vk.libvideo.api.FavouriteButton;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vk.movika.sdk.base.logic.processor.h;
import io.reactivex.rxjava3.internal.operators.single.e0;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.base.version_info.VersionConstants;
import xsna.abj0;
import xsna.asu0;
import xsna.bwt0;
import xsna.byg0;
import xsna.c3f0;
import xsna.ceg;
import xsna.cn70;
import xsna.cod;
import xsna.crj;
import xsna.deg;
import xsna.dtq;
import xsna.e7z;
import xsna.egd;
import xsna.epx;
import xsna.etq;
import xsna.fnj;
import xsna.g2u0;
import xsna.ggg;
import xsna.gzs;
import xsna.h2e;
import xsna.hg;
import xsna.i4f;
import xsna.iah0;
import xsna.itq;
import xsna.izs;
import xsna.j03;
import xsna.jmc;
import xsna.k41;
import xsna.l17;
import xsna.lwc;
import xsna.m7e;
import xsna.msy;
import xsna.mwc;
import xsna.n7e;
import xsna.nwc;
import xsna.o25;
import xsna.o2e;
import xsna.owc;
import xsna.p2e;
import xsna.pih0;
import xsna.pwc;
import xsna.q2e;
import xsna.q4f;
import xsna.q6f0;
import xsna.qwc;
import xsna.r830;
import xsna.rn9;
import xsna.rwc;
import xsna.s2e;
import xsna.s3q0;
import xsna.s830;
import xsna.skd;
import xsna.swc;
import xsna.t34;
import xsna.t3f;
import xsna.t930;
import xsna.toc;
import xsna.tr0;
import xsna.u6z;
import xsna.uoc;
import xsna.v01;
import xsna.v34;
import xsna.vyc;
import xsna.w6z;
import xsna.x6z;
import xsna.xbn;
import xsna.xkj0;
import xsna.xz;
import xsna.yaj0;
import xsna.ybn;
import xsna.za;
import xsna.zaj0;
import xsna.zbn;
import xsna.zlq;
import xsna.zof;

/* compiled from: ClipFeedSideControlsView.kt */
/* loaded from: classes17.dex */
public final class ClipFeedSideControlsView extends jmc implements uoc {
    public static final m7e r;
    public static final m7e s;
    public static final m7e t;
    public static final n7e u;
    public static final n7e v;
    public final /* synthetic */ crj h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final rwc m;
    public final Object n;
    public final Object o;
    public final q4f p;
    public VideoFile q;

    /* compiled from: ClipFeedSideControlsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DislikeAnonymous.values().length];
            try {
                iArr[DislikeAnonymous.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DislikeAnonymous.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FavouriteButton.values().length];
            try {
                iArr2[FavouriteButton.SHOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FavouriteButton.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipFeedSideControlsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Activity> {
        @Override // xsna.gzs
        public final Activity invoke() {
            return ((ClipFeedSideControlsView) this.receiver).getActivity();
        }
    }

    /* compiled from: ClipFeedSideControlsView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ClipFeedSideControlsView clipFeedSideControlsView = (ClipFeedSideControlsView) this.receiver;
            m7e m7eVar = ClipFeedSideControlsView.r;
            if (clipFeedSideControlsView.isAttachedToWindow()) {
                j03.j(clipFeedSideControlsView.getContext(), th2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClipFeedSideControlsView.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<n7e, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(n7e n7eVar) {
            ClipFeedSideControlsView clipFeedSideControlsView = (ClipFeedSideControlsView) this.receiver;
            m7e m7eVar = ClipFeedSideControlsView.r;
            clipFeedSideControlsView.f(n7eVar);
            return s3q0.a;
        }
    }

    static {
        m7e m7eVar = new m7e((c3f0) null, (ceg) null, (yaj0) null, (dtq) null, 31);
        r = m7eVar;
        c3f0 c3f0Var = m7eVar.a;
        w6z w6zVar = c3f0Var.a;
        CounterMode counterMode = CounterMode.UNAVAILABLE;
        w6z w6zVar2 = new w6z(w6zVar.a, w6zVar.b, counterMode, w6zVar.d);
        xbn xbnVar = c3f0Var.b;
        c3f0 c3f0Var2 = new c3f0(w6zVar2, xbnVar);
        ceg cegVar = m7eVar.b;
        ceg cegVar2 = new ceg(cegVar.a, cegVar.b, counterMode, cegVar.d);
        yaj0 yaj0Var = m7eVar.c;
        yaj0 yaj0Var2 = new yaj0(yaj0Var.a, yaj0Var.b, counterMode, yaj0Var.d);
        dtq dtqVar = m7eVar.d;
        r830 r830Var = m7eVar.e;
        s = new m7e(c3f0Var2, cegVar2, yaj0Var2, dtqVar, r830Var);
        t = new m7e(new c3f0(new w6z(new u6z(false), counterMode, 9), new xbn(counterMode, 11)), new ceg(AnonymousMode.INTERACTION_DISALLOWED, counterMode, 9), new yaj0(AnonymousMode.INTERACTION_ALLOWED, counterMode, 9), new dtq(AvailabilityConfig.UNAVAILABLE, 6), 16);
        u = new n7e(new q6f0(new e7z(c3f0Var.a, 2), new zbn(xbnVar, 2), 4), new ggg(cegVar, 2), new abj0(yaj0Var, 2), new itq(m7eVar.d, 6), new t930(m7eVar.e, 2));
        v = new n7e(new q6f0(new e7z(w6zVar2, 2), new zbn(xbnVar, 2), 4), new ggg(cegVar2, 2), new abj0(yaj0Var2, 2), new itq(dtqVar, 6), new t930(r830Var, 2));
    }

    public ClipFeedSideControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final i4f getCommonComponent() {
        return (i4f) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final cod getControllersConfig() {
        return (cod) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final zof getExperiments() {
        return (zof) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final q2e getFastSharePopupHelper() {
        return (q2e) this.j.getValue();
    }

    public static s3q0 i(ClipFeedSideControlsView clipFeedSideControlsView, VideoFile videoFile) {
        final View shareContainer = clipFeedSideControlsView.getShareContainer();
        if (shareContainer != null) {
            final q2e fastSharePopupHelper = clipFeedSideControlsView.getFastSharePopupHelper();
            za zaVar = new za(clipFeedSideControlsView, 27);
            fastSharePopupHelper.d();
            int i = 1;
            shareContainer.getParent().requestDisallowInterceptTouchEvent(true);
            Context context = shareContainer.getContext();
            View rootView = shareContainer.getRootView();
            final ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            if (viewGroup != null) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    viewGroup = viewGroup2;
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.setClickable(true);
                frameLayout.setFocusable(true);
                frameLayout.setOnClickListener(new v01(fastSharePopupHelper, 3));
                frameLayout.setBackground(null);
                fastSharePopupHelper.d = frameLayout;
                zlq zlqVar = new zlq(context);
                zlqVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zlqVar.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zlqVar.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                zlqVar.setLayoutParams(new FrameLayout.LayoutParams(-2, cn70.b(VersionConstants.PRODUCT_MAJOR_VERSION)));
                fastSharePopupHelper.c = zlqVar;
                frameLayout.addView(zlqVar);
                viewGroup.addView(frameLayout);
                zlqVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.i2e
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        if (i4 - i2 == i8 - i6 && i5 - i3 == i9 - i7) {
                            return;
                        }
                        q2e.this.getClass();
                        Rect c2 = f4m.c(shareContainer);
                        viewGroup.getLocationOnScreen(new int[2]);
                        int width = view.getWidth();
                        Integer valueOf = Integer.valueOf(width);
                        if (width <= 0) {
                            valueOf = null;
                        }
                        int intValue = valueOf != null ? valueOf.intValue() : view.getMeasuredWidth();
                        int height = view.getHeight();
                        Integer valueOf2 = height > 0 ? Integer.valueOf(height) : null;
                        float intValue2 = valueOf2 != null ? valueOf2.intValue() : view.getMeasuredHeight();
                        view.setTranslationX(((c2.right - r3[0]) - cn70.b(32)) - intValue);
                        view.setTranslationY(((c2.height() / 2.0f) + c2.top) - intValue2);
                        view.setPivotX(intValue);
                        view.setPivotY(intValue2);
                    }
                });
                if (!zlqVar.isLaidOut() || zlqVar.isLayoutRequested()) {
                    zlqVar.addOnLayoutChangeListener(new s2e(fastSharePopupHelper, zlqVar, frameLayout));
                } else {
                    q2e.a(fastSharePopupHelper, zlqVar, frameLayout);
                }
            }
            zlq zlqVar2 = fastSharePopupHelper.c;
            if (zlqVar2 != null) {
                shareContainer.setOnTouchListener(new rn9(fastSharePopupHelper, i));
                t3f t3fVar = fastSharePopupHelper.b;
                ClipsFastShareConfig$Strategy clipsFastShareConfig$Strategy = h2e.a;
                fastSharePopupHelper.f.b(new e0(fastSharePopupHelper.c(t3fVar, h2e.a, false), new t34(new o2e(fastSharePopupHelper, zlqVar2, shareContainer, videoFile, zaVar, 0), 8)).l(new v34(new tr0(5), 5)).m(asu0.a.d()).subscribe(new xz(new l17(zlqVar2, fastSharePopupHelper, shareContainer, videoFile, zaVar), 17), new k41(new p2e(zlqVar2, fastSharePopupHelper, shareContainer, videoFile, zaVar, 0), 12)));
            }
        }
        return s3q0.a;
    }

    public static vyc l(ClipFeedSideControlsView clipFeedSideControlsView) {
        return new vyc(clipFeedSideControlsView.getCommonComponent(), clipFeedSideControlsView.m, new c(1, clipFeedSideControlsView, ClipFeedSideControlsView.class, "renderError", "renderError(Ljava/lang/Throwable;)V", 0), new h(clipFeedSideControlsView, 15));
    }

    @Override // xsna.uoc
    public final void Z3(boolean z) {
        AvailabilityConfig.Companion.getClass();
        AvailabilityConfig availabilityConfig = z ? AvailabilityConfig.AVAILABLE : AvailabilityConfig.UNAVAILABLE;
        rwc rwcVar = this.m;
        swc swcVar = rwcVar.b;
        n7e n7eVar = rwcVar.c;
        pwc pwcVar = swcVar.a;
        q6f0 q6f0Var = n7eVar.a;
        mwc mwcVar = (mwc) pwcVar.c;
        zbn zbnVar = q6f0Var.b;
        mwcVar.getClass();
        xbn xbnVar = zbnVar.a;
        xbn xbnVar2 = xbnVar.a == availabilityConfig ? xbnVar : new xbn(availabilityConfig, xbnVar.b, xbnVar.c, xbnVar.d);
        zbn zbnVar2 = xbnVar.equals(xbnVar2) ? zbnVar : new zbn(xbnVar2, mwc.a(zbnVar.b, xbnVar2, null));
        q6f0 a2 = zbnVar.equals(zbnVar2) ? q6f0Var : q6f0.a(q6f0Var, null, zbnVar2, null, 5);
        if (!q6f0Var.equals(a2)) {
            n7eVar = n7e.a(n7eVar, a2, null, 30);
        }
        rwcVar.c(n7eVar);
    }

    @Override // xsna.jmc
    public final n7e e() {
        return this.m.c;
    }

    public Activity getActivity() {
        return g2u0.c(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jmc
    public byg0 getCustomSideControlsConfig() {
        return (byg0) this.n.getValue();
    }

    @Override // xsna.uoc
    public toc getDelegator() {
        return getCommonComponent().a;
    }

    public PointF getLikePosition() {
        View likeContainer = getLikeContainer();
        if (likeContainer == null) {
            return new PointF();
        }
        RectF G = bwt0.G(likeContainer);
        float f = G.left;
        float f2 = G.top;
        Context context = getContext();
        HashSet hashSet = iah0.a;
        return new PointF(f, f2 - fnj.a(context));
    }

    @Override // xsna.rr6
    public s3q0 getPresenter() {
        this.h.getClass();
        return s3q0.a;
    }

    @Override // xsna.jmc
    public xkj0 getSideControlsFactory() {
        return this.p;
    }

    @Override // xsna.rr6
    public View getView() {
        return this.h.getView();
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return this.h.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    @Override // xsna.uoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1(VideoFile videoFile) {
        boolean z;
        rwc rwcVar;
        t930 t930Var;
        x6z x6zVar;
        VideoFile videoFile2 = this.q;
        boolean f = epx.f(videoFile2 != null ? videoFile2.a1() : null, videoFile.a1());
        this.q = videoFile;
        if (!f) {
            getControlsUseCases().b.h.e();
        }
        rwc rwcVar2 = this.m;
        swc swcVar = rwcVar2.b;
        n7e n7eVar = rwcVar2.c;
        swcVar.getClass();
        t930 t930Var2 = n7eVar.e;
        itq itqVar = n7eVar.d;
        abj0 abj0Var = n7eVar.c;
        ggg gggVar = n7eVar.b;
        pwc pwcVar = swcVar.a;
        q6f0 q6f0Var = n7eVar.a;
        pwcVar.getClass();
        zbn zbnVar = q6f0Var.b;
        owc owcVar = (owc) pwcVar.b;
        e7z e7zVar = q6f0Var.a;
        owcVar.getClass();
        x6z x6zVar2 = e7zVar.b;
        w6z w6zVar = e7zVar.a;
        boolean z2 = w6zVar.a.h() && !egd.b(videoFile) && videoFile.i0();
        if (!videoFile.O9()) {
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (!(clipVideoFile != null ? clipVideoFile.J1 : false)) {
                z = false;
                if (x6zVar2.a == z2 || x6zVar2.b != z) {
                    rwcVar = rwcVar2;
                } else {
                    rwcVar = rwcVar2;
                    if (x6zVar2.c == videoFile.l1()) {
                        t930Var = t930Var2;
                        x6zVar = x6zVar2;
                        e7z e7zVar2 = x6zVar2.equals(x6zVar) ? e7zVar : new e7z(w6zVar, x6zVar);
                        ((mwc) pwcVar.c).getClass();
                        ybn ybnVar = zbnVar.b;
                        xbn xbnVar = zbnVar.a;
                        ybn a2 = mwc.a(ybnVar, xbnVar, videoFile);
                        zbn zbnVar2 = ybnVar.equals(a2) ? zbnVar : new zbn(xbnVar, a2);
                        q6f0 q6f0Var2 = (!e7zVar.equals(e7zVar2) && zbnVar.equals(zbnVar2) && q6f0Var.c == ReactionsLoading.NONE) ? q6f0Var : new q6f0(e7zVar2, zbnVar2, ReactionsLoading.NONE);
                        swcVar.b.getClass();
                        deg degVar = gggVar.b;
                        ceg cegVar = gggVar.a;
                        boolean z3 = (cegVar.a.h() || egd.c(videoFile) || (!videoFile.c0() && videoFile.c1() <= 0)) ? false : true;
                        deg degVar2 = (degVar.a == z3 || degVar.b != videoFile.c1()) ? new deg(z3, videoFile.c1()) : degVar;
                        ggg gggVar2 = degVar.equals(degVar2) ? gggVar : new ggg(cegVar, degVar2);
                        swcVar.c.getClass();
                        zaj0 zaj0Var = abj0Var.b;
                        yaj0 yaj0Var = abj0Var.a;
                        boolean z4 = (yaj0Var.a.h() || egd.b(videoFile) || !videoFile.Fa()) ? false : true;
                        boolean b2 = o25.a().b();
                        zaj0 zaj0Var2 = (zaj0Var.a != z4 && zaj0Var.c == videoFile.W7() && zaj0Var.b == b2) ? zaj0Var : new zaj0(zaj0Var.d, videoFile.W7(), z4, b2);
                        abj0 abj0Var2 = zaj0Var.equals(zaj0Var2) ? abj0Var : new abj0(yaj0Var, zaj0Var2);
                        swcVar.d.getClass();
                        etq etqVar = itqVar.b;
                        etq a3 = nwc.a(etqVar, itqVar.a, videoFile);
                        itq a4 = (etqVar.equals(a3) || itqVar.c != FavoritesLoadingState.NONE) ? itq.a(itqVar, null, a3, FavoritesLoadingState.NONE, 1) : itqVar;
                        swcVar.e.getClass();
                        t930 t930Var3 = t930Var;
                        s830 s830Var = t930Var3.b;
                        r830 r830Var = t930Var3.a;
                        s830 s830Var2 = s830Var.a == r830Var.a.h() ? s830Var : new s830(r830Var.a.h());
                        t930 t930Var4 = s830Var.equals(s830Var2) ? t930Var3 : new t930(r830Var, s830Var2);
                        rwcVar.c((!q6f0Var.equals(q6f0Var2) && gggVar.equals(gggVar2) && abj0Var.equals(abj0Var2) && itqVar.equals(a4) && t930Var3.equals(t930Var4)) ? n7eVar : new n7e(q6f0Var2, gggVar2, abj0Var2, a4, t930Var4));
                    }
                }
                t930Var = t930Var2;
                x6zVar = new x6z(x6zVar2.d, videoFile.l1(), z2, z);
                if (x6zVar2.equals(x6zVar)) {
                }
                ((mwc) pwcVar.c).getClass();
                ybn ybnVar2 = zbnVar.b;
                xbn xbnVar2 = zbnVar.a;
                ybn a22 = mwc.a(ybnVar2, xbnVar2, videoFile);
                if (ybnVar2.equals(a22)) {
                }
                if (!e7zVar.equals(e7zVar2)) {
                }
                swcVar.b.getClass();
                deg degVar3 = gggVar.b;
                ceg cegVar2 = gggVar.a;
                if (cegVar2.a.h()) {
                }
                if (degVar3.a == z3) {
                }
                if (degVar3.equals(degVar2)) {
                }
                swcVar.c.getClass();
                zaj0 zaj0Var3 = abj0Var.b;
                yaj0 yaj0Var2 = abj0Var.a;
                if (yaj0Var2.a.h()) {
                }
                boolean b22 = o25.a().b();
                if (zaj0Var3.a != z4) {
                }
                if (zaj0Var3.equals(zaj0Var2)) {
                }
                swcVar.d.getClass();
                etq etqVar2 = itqVar.b;
                etq a32 = nwc.a(etqVar2, itqVar.a, videoFile);
                if (etqVar2.equals(a32)) {
                }
                swcVar.e.getClass();
                t930 t930Var32 = t930Var;
                s830 s830Var3 = t930Var32.b;
                r830 r830Var2 = t930Var32.a;
                if (s830Var3.a == r830Var2.a.h()) {
                }
                if (s830Var3.equals(s830Var2)) {
                }
                rwcVar.c((!q6f0Var.equals(q6f0Var2) && gggVar.equals(gggVar2) && abj0Var.equals(abj0Var2) && itqVar.equals(a4) && t930Var32.equals(t930Var4)) ? n7eVar : new n7e(q6f0Var2, gggVar2, abj0Var2, a4, t930Var4));
            }
        }
        z = true;
        if (x6zVar2.a == z2) {
        }
        rwcVar = rwcVar2;
        t930Var = t930Var2;
        x6zVar = new x6z(x6zVar2.d, videoFile.l1(), z2, z);
        if (x6zVar2.equals(x6zVar)) {
        }
        ((mwc) pwcVar.c).getClass();
        ybn ybnVar22 = zbnVar.b;
        xbn xbnVar22 = zbnVar.a;
        ybn a222 = mwc.a(ybnVar22, xbnVar22, videoFile);
        if (ybnVar22.equals(a222)) {
        }
        if (!e7zVar.equals(e7zVar2)) {
        }
        swcVar.b.getClass();
        deg degVar32 = gggVar.b;
        ceg cegVar22 = gggVar.a;
        if (cegVar22.a.h()) {
        }
        if (degVar32.a == z3) {
        }
        if (degVar32.equals(degVar2)) {
        }
        swcVar.c.getClass();
        zaj0 zaj0Var32 = abj0Var.b;
        yaj0 yaj0Var22 = abj0Var.a;
        if (yaj0Var22.a.h()) {
        }
        boolean b222 = o25.a().b();
        if (zaj0Var32.a != z4) {
        }
        if (zaj0Var32.equals(zaj0Var2)) {
        }
        swcVar.d.getClass();
        etq etqVar22 = itqVar.b;
        etq a322 = nwc.a(etqVar22, itqVar.a, videoFile);
        if (etqVar22.equals(a322)) {
        }
        swcVar.e.getClass();
        t930 t930Var322 = t930Var;
        s830 s830Var32 = t930Var322.b;
        r830 r830Var22 = t930Var322.a;
        if (s830Var32.a == r830Var22.a.h()) {
        }
        if (s830Var32.equals(s830Var2)) {
        }
        rwcVar.c((!q6f0Var.equals(q6f0Var2) && gggVar.equals(gggVar2) && abj0Var.equals(abj0Var2) && itqVar.equals(a4) && t930Var322.equals(t930Var4)) ? n7eVar : new n7e(q6f0Var2, gggVar2, abj0Var2, a4, t930Var4));
    }

    public final void n(m7e m7eVar) {
        t930 t930Var;
        rwc rwcVar = this.m;
        swc swcVar = rwcVar.b;
        n7e n7eVar = rwcVar.c;
        swcVar.getClass();
        t930 t930Var2 = n7eVar.e;
        itq itqVar = n7eVar.d;
        abj0 abj0Var = n7eVar.c;
        ggg gggVar = n7eVar.b;
        pwc pwcVar = swcVar.a;
        q6f0 q6f0Var = n7eVar.a;
        c3f0 c3f0Var = m7eVar.a;
        pwcVar.getClass();
        zbn zbnVar = q6f0Var.b;
        owc owcVar = (owc) pwcVar.b;
        e7z e7zVar = q6f0Var.a;
        w6z w6zVar = c3f0Var.a;
        owcVar.getClass();
        w6z w6zVar2 = e7zVar.a;
        if (w6zVar2.equals(w6zVar)) {
            w6zVar = w6zVar2;
        }
        e7z e7zVar2 = w6zVar2.equals(w6zVar) ? e7zVar : new e7z(w6zVar, e7zVar.b);
        mwc mwcVar = (mwc) pwcVar.c;
        xbn xbnVar = c3f0Var.b;
        mwcVar.getClass();
        xbn xbnVar2 = zbnVar.a;
        if (xbnVar2.equals(xbnVar)) {
            xbnVar = xbnVar2;
        }
        zbn zbnVar2 = xbnVar2.equals(xbnVar) ? zbnVar : new zbn(xbnVar, mwc.a(zbnVar.b, xbnVar, null));
        q6f0 a2 = (e7zVar.equals(e7zVar2) && zbnVar.equals(zbnVar2)) ? q6f0Var : q6f0.a(q6f0Var, e7zVar2, zbnVar2, null, 4);
        lwc lwcVar = swcVar.b;
        ceg cegVar = m7eVar.b;
        lwcVar.getClass();
        ceg cegVar2 = gggVar.a;
        if (cegVar2.equals(cegVar)) {
            cegVar = cegVar2;
        }
        ggg gggVar2 = cegVar2.equals(cegVar) ? gggVar : new ggg(cegVar, gggVar.b);
        qwc qwcVar = swcVar.c;
        yaj0 yaj0Var = m7eVar.c;
        qwcVar.getClass();
        yaj0 yaj0Var2 = abj0Var.a;
        if (yaj0Var2.equals(yaj0Var)) {
            yaj0Var = yaj0Var2;
        }
        abj0 abj0Var2 = yaj0Var2.equals(yaj0Var) ? abj0Var : new abj0(yaj0Var, abj0Var.b);
        nwc nwcVar = swcVar.d;
        dtq dtqVar = m7eVar.d;
        nwcVar.getClass();
        dtq dtqVar2 = itqVar.a;
        if (dtqVar2.equals(dtqVar)) {
            dtqVar = dtqVar2;
        }
        itq a3 = dtqVar2.equals(dtqVar) ? itqVar : itq.a(itqVar, dtqVar, nwc.a(itqVar.b, dtqVar, null), null, 4);
        skd skdVar = swcVar.e;
        r830 r830Var = m7eVar.e;
        skdVar.getClass();
        r830 r830Var2 = t930Var2.a;
        if (r830Var2.equals(r830Var)) {
            r830Var = r830Var2;
        }
        if (r830Var2.equals(r830Var)) {
            t930Var = t930Var2;
        } else {
            s830 s830Var = t930Var2.b;
            if (s830Var.a != r830Var.a.h()) {
                s830Var = new s830(r830Var.a.h());
            }
            t930Var = new t930(r830Var, s830Var);
        }
        if (!q6f0Var.equals(a2) || !gggVar.equals(gggVar2) || !abj0Var.equals(abj0Var2) || !itqVar.equals(a3) || !t930Var2.equals(t930Var)) {
            n7eVar = new n7e(a2, gggVar2, abj0Var2, a3, t930Var);
        }
        rwcVar.c(n7eVar);
    }

    public final void o(boolean z) {
        m7e m7eVar = z ? r : s;
        if (getControllersConfig() == null) {
            n(m7eVar);
        } else if (getControllersConfig() == null) {
            n(m7eVar);
        } else {
            xbn xbnVar = m7eVar.a.b;
            int[] iArr = a.$EnumSwitchMapping$0;
            throw null;
        }
    }

    @Override // xsna.rr6
    public final void pause() {
        this.h.getClass();
    }

    public final void q(boolean z) {
        AvailabilityConfig.Companion.getClass();
        AvailabilityConfig availabilityConfig = z ? AvailabilityConfig.AVAILABLE : AvailabilityConfig.UNAVAILABLE;
        rwc rwcVar = this.m;
        swc swcVar = rwcVar.b;
        n7e n7eVar = rwcVar.c;
        nwc nwcVar = swcVar.d;
        itq itqVar = n7eVar.d;
        nwcVar.getClass();
        dtq dtqVar = itqVar.a;
        dtq dtqVar2 = dtqVar.a == availabilityConfig ? dtqVar : new dtq(availabilityConfig, dtqVar.b, dtqVar.c);
        itq a2 = dtqVar.equals(dtqVar2) ? itqVar : itq.a(itqVar, dtqVar2, nwc.a(itqVar.b, dtqVar2, null), null, 4);
        if (!itqVar.equals(a2)) {
            n7eVar = n7e.a(n7eVar, null, a2, 23);
        }
        rwcVar.c(n7eVar);
    }

    @Override // xsna.rr6
    public final void release() {
        this.h.getClass();
    }

    @Override // xsna.rr6
    public final void resume() {
        this.h.getClass();
    }

    public final void setAnalyticsCallback(pih0 pih0Var) {
        getCommonComponent().a.d = pih0Var;
    }

    @Override // xsna.rr6
    public void setPresenter(s3q0 s3q0Var) {
        this.h.getClass();
    }

    public ClipFeedSideControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.h = new crj(context);
        com.vk.movika.sdk.base.logic.processor.actions.d dVar = new com.vk.movika.sdk.base.logic.processor.actions.d(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, dVar);
        int i2 = 19;
        this.j = msy.a(lazyThreadSafetyMode, new hg(this, i2));
        this.k = msy.a(lazyThreadSafetyMode, new f(this, i2));
        this.l = msy.a(lazyThreadSafetyMode, new g(this, 23));
        this.m = new rwc(getExperiments().y() ? v : u, new d(1, this, ClipFeedSideControlsView.class, "render", "render(Lcom/vk/clips/design/view/sidecontrols/ClipsFeedItemSideControlsState;)V", 0));
        this.n = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 21));
        this.o = msy.a(lazyThreadSafetyMode, new i(this, 14));
        this.p = new q4f();
        getCommonComponent().a.h = new com.vk.im.engine.internal.storage.delegates.messages.b(this, 26);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jmc
    public vyc getControlsUseCases() {
        return (vyc) this.o.getValue();
    }
}
