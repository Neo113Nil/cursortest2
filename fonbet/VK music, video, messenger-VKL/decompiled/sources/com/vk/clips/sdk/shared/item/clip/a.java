package com.vk.clips.sdk.shared.item.clip;

import com.vk.clips.sdk.facade.api.MyTargetFacadeCustomStatType;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkTrendingHashtag;
import com.vk.clips.sdk.models.SdkVideoRestriction;
import com.vk.clips.sdk.models.ads.SdkAdsFlags;
import com.vk.clips.sdk.models.ads.SdkClipsAdsFeaturesParams;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.feed.data.activities.SdkClipActivity;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemTooltipEvent;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.e;
import com.vk.movika.sdk.base.logic.interactor.c;
import com.vk.movika.sdk.base.observable.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a0d;
import xsna.a7f0;
import xsna.ai3;
import xsna.b0d;
import xsna.bd80;
import xsna.bjt0;
import xsna.bvm0;
import xsna.e0d;
import xsna.e3d;
import xsna.e5;
import xsna.epx;
import xsna.f4z;
import xsna.fnt0;
import xsna.gzs;
import xsna.h5;
import xsna.ioa0;
import xsna.izs;
import xsna.j0d;
import xsna.k7f;
import xsna.l1m;
import xsna.lst0;
import xsna.m0d;
import xsna.m0x;
import xsna.m16;
import xsna.m2d;
import xsna.mj50;
import xsna.mre;
import xsna.msy;
import xsna.n0d;
import xsna.n0x;
import xsna.no;
import xsna.nxc;
import xsna.ny;
import xsna.o8e;
import xsna.ojh0;
import xsna.ow;
import xsna.p8e;
import xsna.pih0;
import xsna.plh0;
import xsna.rkg0;
import xsna.rl70;
import xsna.rpp0;
import xsna.rws;
import xsna.s16;
import xsna.s3q0;
import xsna.sfq;
import xsna.su;
import xsna.t0d;
import xsna.t1d;
import xsna.t80;
import xsna.u0d;
import xsna.v7x;
import xsna.vdd;
import xsna.vkj0;
import xsna.wk50;
import xsna.wp50;
import xsna.x4p0;
import xsna.xne;
import xsna.xp50;
import xsna.y1e;
import xsna.y6;
import xsna.y6d;
import xsna.yas0;
import xsna.yof;
import xsna.z2d;
import xsna.z90;
import xsna.zn50;
import xsna.zrx0;

/* compiled from: ClipItemFeature.kt */
/* loaded from: classes17.dex */
public final class a extends wk50<y6d, z2d, ClipItemAction, ClipItemPatch> {
    public final f4z A;
    public final f4z B;
    public final f4z C;
    public final Object D;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> E;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> F;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> G;
    public final Object H;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> I;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> J;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> K;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> L;
    public final Object M;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> N;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> O;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> P;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> Q;
    public final mj50<z2d, ClipItemAction, ClipItemPatch> R;
    public final Object S;
    public final pih0 f;
    public final n0d g;
    public final ClipFeedTab h;
    public final yof i;
    public final xne j;
    public final m0x k;
    public final s16 l;
    public final bd80 m;
    public final ojh0 n;
    public final zn50 o;
    public final y1e p;
    public final b0d q;
    public final gzs<Boolean> r;
    public final izs<String, Boolean> s;
    public final izs<String, Boolean> t;
    public final vdd u;
    public final p8e v;
    public final yas0 w;
    public final zrx0 x;
    public final f4z y;
    public final f4z z;

    /* compiled from: ClipItemFeature.kt */
    /* renamed from: com.vk.clips.sdk.shared.item.clip.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0662a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ClipItemAction.HandleOnVideoFocusChanged.values().length];
            try {
                iArr[ClipItemAction.HandleOnVideoFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipItemAction.HandleOnVideoFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipItemAction.HandleOnSnapFocusChanged.values().length];
            try {
                iArr2[ClipItemAction.HandleOnSnapFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipItemAction.HandleOnSnapFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ClipItemAction.HandleOnItemViewFocusChanged.values().length];
            try {
                iArr3[ClipItemAction.HandleOnItemViewFocusChanged.FOCUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ClipItemAction.HandleOnItemViewFocusChanged.UNFOCUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public a(b bVar, su suVar, pih0 pih0Var, e5 e5Var, n0d n0dVar, ClipFeedTab clipFeedTab, yof yofVar, xne xneVar, m0x m0xVar, s16 s16Var, v7x v7xVar, bd80 bd80Var, ojh0 ojh0Var, zn50 zn50Var, y1e y1eVar, b0d b0dVar, plh0 plh0Var, nxc nxcVar, p pVar, h5 h5Var, vdd vddVar, p8e p8eVar, yas0 yas0Var, zrx0 zrx0Var) {
        super(ClipItemAction.b0.b, bVar);
        this.f = pih0Var;
        this.g = n0dVar;
        this.h = clipFeedTab;
        this.i = yofVar;
        this.j = xneVar;
        this.k = m0xVar;
        this.l = s16Var;
        this.m = bd80Var;
        this.n = ojh0Var;
        this.o = zn50Var;
        this.p = y1eVar;
        this.q = b0dVar;
        this.r = nxcVar;
        this.s = pVar;
        this.t = h5Var;
        this.u = vddVar;
        this.v = p8eVar;
        this.w = yas0Var;
        this.x = zrx0Var;
        f4z f4zVar = new f4z();
        this.y = f4zVar;
        f4z f4zVar2 = new f4z();
        this.z = f4zVar2;
        f4z f4zVar3 = new f4z();
        this.A = f4zVar3;
        f4z f4zVar4 = new f4z();
        this.B = f4zVar4;
        f4z f4zVar5 = new f4z();
        this.C = f4zVar5;
        c cVar = new c(7, this, suVar);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.D = msy.a(lazyThreadSafetyMode, cVar);
        this.E = O(new vkj0(f4zVar, f4zVar3, f4zVar4, f4zVar2, e5Var));
        this.F = O(new fnt0(f4zVar5, f4zVar2, new u0d(0, zn50Var, sfq.class, "muteInClipFeed", "muteInClipFeed()Z", 0, 0), pih0Var));
        this.G = O(new l1m(pih0Var, f4zVar3, f4zVar, yofVar));
        this.H = msy.a(lazyThreadSafetyMode, new y6(this, 16));
        this.I = O(new bjt0(f4zVar2));
        this.J = O(new rkg0(pih0Var, f4zVar2, f4zVar3));
        this.K = O(new ow(clipFeedTab, pih0Var, f4zVar2, f4zVar3, vddVar));
        this.L = O(new bvm0(pih0Var, f4zVar2, f4zVar3));
        this.M = msy.a(lazyThreadSafetyMode, new com.vk.catalog2.common.ui.holders.a(6, this, e5Var));
        this.N = O(new x4p0(f4zVar5, f4zVar2));
        this.O = O(new rws(f4zVar2, f4zVar3, plh0Var));
        this.P = O(new rl70(e5Var, pih0Var, m0xVar));
        this.Q = O(new m16(s16Var, f4zVar2));
        this.R = O(new lst0(p8eVar));
        this.S = msy.a(lazyThreadSafetyMode, new no(this, 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v166, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wk50
    public final void N(z2d z2dVar, ClipItemAction clipItemAction) {
        a aVar;
        a0d a0dVar;
        wp50 wp50Var;
        SdkVideoRestriction O;
        ClipItemPatch.UpdateItemViewFocused updateItemViewFocused;
        boolean z;
        SdkMusicTrack V;
        ClipItemPatch.UpdateSnapFocused updateSnapFocused;
        SdkClipsAdsFeaturesParams d3;
        z2d z2dVar2 = z2dVar;
        ClipItemAction clipItemAction2 = clipItemAction;
        if (clipItemAction2 instanceof ClipItemAction.b0) {
            T(ClipItemPatch.e.b);
        } else if (clipItemAction2 instanceof ClipItemAction.f) {
            ((mj50) this.D.getValue()).a(z2dVar2, clipItemAction2);
        } else if (clipItemAction2 instanceof ClipItemAction.h0) {
            this.E.a(z2dVar2, clipItemAction2);
        } else if (clipItemAction2 instanceof ClipItemAction.m0) {
            this.F.a(z2dVar2, clipItemAction2);
        } else if (clipItemAction2 instanceof ClipItemAction.g) {
            this.G.a(z2dVar2, clipItemAction2);
        } else if (clipItemAction2 instanceof ClipItemAction.i) {
            ((mj50) this.H.getValue()).a(z2dVar2, clipItemAction2);
        } else if (clipItemAction2 instanceof ClipItemAction.l0) {
            this.I.a(z2dVar2, clipItemAction2);
        } else {
            SdkClipActivity.Comments comments = null;
            SdkClipActivity.Likes likes = null;
            if (clipItemAction2 instanceof ClipItemAction.HandleOnVideoFocusChanged) {
                ClipItemAction.HandleOnVideoFocusChanged handleOnVideoFocusChanged = (ClipItemAction.HandleOnVideoFocusChanged) clipItemAction2;
                if (z2dVar2 instanceof z2d.a) {
                    int i = C0662a.$EnumSwitchMapping$0[handleOnVideoFocusChanged.ordinal()];
                    if (i == 1) {
                        this.o.getClass();
                        T(new ClipItemPatch.l(e.b()));
                        z2d.a aVar2 = (z2d.a) z2dVar2;
                        m0d m0dVar = aVar2.b;
                        String str = m0dVar.b;
                        SdkClipVideoFile sdkClipVideoFile = m0dVar.a;
                        boolean z2 = !this.r.invoke().booleanValue() && this.t.invoke(str).booleanValue() && ((this.i.m().a && this.s.invoke(str).booleanValue() && (d3 = sdkClipVideoFile.d3()) != null && (d3.c.contains(SdkAdsFlags.HIDE_FULLSCREEN_AD_BANNER) ^ true)) || U(m0dVar));
                        SdkClipsAdsFeaturesParams d32 = sdkClipVideoFile.d3();
                        List<String> list = U(m0dVar) ? d32 != null ? d32.b : null : null;
                        SdkClipsAdsFeaturesParams d33 = sdkClipVideoFile.d3();
                        T(new ClipItemPatch.j(this.l.b(str, z2, list, U(m0dVar) ? d33 != null ? d33.d : null : null, aVar2.v)));
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        T(m2d.b);
                        C(ClipItemAction.e.d.b);
                    }
                }
            } else if (clipItemAction2 instanceof ClipItemAction.HandleOnSnapFocusChanged) {
                ClipItemAction.HandleOnSnapFocusChanged handleOnSnapFocusChanged = (ClipItemAction.HandleOnSnapFocusChanged) clipItemAction2;
                if (z2dVar2 instanceof z2d.a) {
                    int i2 = C0662a.$EnumSwitchMapping$1[handleOnSnapFocusChanged.ordinal()];
                    if (i2 == 1) {
                        updateSnapFocused = ClipItemPatch.UpdateSnapFocused.FOCUSED;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        updateSnapFocused = ClipItemPatch.UpdateSnapFocused.UNFOCUSED;
                    }
                    T(updateSnapFocused);
                }
            } else if (clipItemAction2 instanceof ClipItemAction.HandleOnItemViewFocusChanged) {
                ClipItemAction.HandleOnItemViewFocusChanged handleOnItemViewFocusChanged = (ClipItemAction.HandleOnItemViewFocusChanged) clipItemAction2;
                if (z2dVar2 instanceof z2d.a) {
                    int i3 = C0662a.$EnumSwitchMapping$2[handleOnItemViewFocusChanged.ordinal()];
                    if (i3 == 1) {
                        updateItemViewFocused = ClipItemPatch.UpdateItemViewFocused.FOCUSED;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        updateItemViewFocused = ClipItemPatch.UpdateItemViewFocused.UNFOCUSED;
                    }
                    T(updateItemViewFocused);
                    z2d.a aVar3 = (z2d.a) z2dVar2;
                    rpp0 rpp0Var = aVar3.A;
                    SdkClipVideoFile sdkClipVideoFile2 = aVar3.b.a;
                    Object[] objArr = handleOnItemViewFocusChanged == ClipItemAction.HandleOnItemViewFocusChanged.UNFOCUSED;
                    Boolean valueOf = Boolean.valueOf(rpp0Var.a);
                    if (objArr == false) {
                        valueOf = null;
                    }
                    ClipFeedTab clipFeedTab = this.h;
                    vdd vddVar = this.u;
                    if (valueOf == null) {
                        if (vddVar.a(clipFeedTab, sdkClipVideoFile2)) {
                            List<SdkTrendingHashtag> R0 = sdkClipVideoFile2.R0();
                            if (!(R0 instanceof Collection) || !R0.isEmpty()) {
                                Iterator<T> it = R0.iterator();
                                while (it.hasNext()) {
                                    List<String> list2 = ((SdkTrendingHashtag) it.next()).c;
                                    if (list2 == null || list2.isEmpty()) {
                                    }
                                }
                            }
                            z = true;
                        }
                        z = false;
                        break;
                    }
                    z = valueOf.booleanValue();
                    Boolean valueOf2 = Boolean.valueOf(rpp0Var.b);
                    if (objArr == false) {
                        valueOf2 = null;
                    }
                    boolean booleanValue = valueOf2 != null ? valueOf2.booleanValue() : vddVar.a(clipFeedTab, sdkClipVideoFile2) && sdkClipVideoFile2.R0().isEmpty() && (V = sdkClipVideoFile2.V()) != null && V.k;
                    Boolean valueOf3 = objArr == true ? Boolean.valueOf(rpp0Var.c) : null;
                    T(new ClipItemPatch.i(z, booleanValue, valueOf3 != null ? valueOf3.booleanValue() : vddVar.c(clipFeedTab, sdkClipVideoFile2)));
                    if (objArr == true) {
                        C(ClipItemAction.i0.c.b);
                    } else {
                        C(ClipItemAction.i0.b.b);
                    }
                }
            } else {
                boolean z3 = clipItemAction2 instanceof ClipItemAction.o;
                f4z f4zVar = this.y;
                if (z3) {
                    f4zVar.b(new j0d.e(((ClipItemAction.o) clipItemAction2).b));
                } else {
                    boolean z4 = clipItemAction2 instanceof ClipItemAction.HandleOwnerClicked;
                    pih0 pih0Var = this.f;
                    f4z f4zVar2 = this.A;
                    if (z4) {
                        ClipItemAction.HandleOwnerClicked handleOwnerClicked = (ClipItemAction.HandleOwnerClicked) clipItemAction2;
                        if (z2dVar2 instanceof z2d.a) {
                            z2d.a aVar4 = (z2d.a) z2dVar2;
                            m0d m0dVar2 = aVar4.b;
                            SdkClipVideoFile sdkClipVideoFile3 = m0dVar2.a;
                            SdkClipVideoFile b = m0dVar2.b();
                            wp50 wp50Var2 = aVar4.B;
                            if (wp50Var2 != null) {
                                wp50Var2.f(new xp50.k(MyTargetFacadeCustomStatType.CLIP_AUTHOR_CLICK));
                            }
                            if (m0dVar2.h.isEmpty() && (!sdkClipVideoFile3.t0() || sdkClipVideoFile3.P1().isEmpty())) {
                                if (handleOwnerClicked == ClipItemAction.HandleOwnerClicked.AVATAR) {
                                    SdkOwner s = sdkClipVideoFile3.s();
                                    if (epx.f(s != null ? Boolean.valueOf(s.q) : null, Boolean.TRUE)) {
                                        f4zVar2.b(new t1d.a(b));
                                    }
                                }
                                f4zVar2.b(new t1d.r(b));
                                pih0Var.Ub(sdkClipVideoFile3.o0(), sdkClipVideoFile3.I0().b);
                            } else if (sdkClipVideoFile3.s() != null) {
                                f4zVar2.b(new t1d.h(b));
                                pih0Var.Ub(sdkClipVideoFile3.o0(), sdkClipVideoFile3.I0().b);
                            }
                        }
                    } else {
                        boolean z5 = clipItemAction2 instanceof ClipItemAction.p;
                        f4z f4zVar3 = this.C;
                        f4z f4zVar4 = this.z;
                        if (z5) {
                            if (z2dVar2 instanceof z2d.a) {
                                z2d.a aVar5 = (z2d.a) z2dVar2;
                                SdkClipVideoFile sdkClipVideoFile4 = aVar5.b.a;
                                if (sdkClipVideoFile4.k0()) {
                                    f4zVar3.b(ClipItemTooltipEvent.b.b);
                                } else {
                                    f4zVar4.b(new t0d.o(sdkClipVideoFile4, aVar5.d, aVar5.e));
                                }
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.w) {
                            if ((z2dVar2 instanceof z2d.a) && (O = ((z2d.a) z2dVar2).b.b().O()) != null) {
                                f4zVar2.b(new t1d.f0(O));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.x) {
                            if (z2dVar2 instanceof z2d.a) {
                                z2d.a aVar6 = (z2d.a) z2dVar2;
                                this.B.b(new e3d.a(aVar6.b.b(), aVar6.d));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.s) {
                            ClipItemAction.s sVar = (ClipItemAction.s) clipItemAction2;
                            if (z2dVar2 instanceof z2d.a) {
                                T(new ClipItemPatch.o(sVar.b));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.u) {
                            ClipItemAction.u uVar = (ClipItemAction.u) clipItemAction2;
                            if (z2dVar2 instanceof z2d.a) {
                                T(new ClipItemPatch.s(uVar.b));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.n) {
                            if (z2dVar2 instanceof z2d.a) {
                                f4zVar4.b(new t0d.j(((z2d.a) z2dVar2).d));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.r) {
                            f4zVar.b(j0d.a.a);
                            f4zVar4.b(t0d.g.a.a);
                            C(ClipItemAction.Tooltip.Hide.IMMEDIATE);
                            T(new ClipItemPatch.q(false));
                            T(new ClipItemPatch.r(false));
                        } else if (clipItemAction2 instanceof ClipItemAction.t) {
                            if (z2dVar2 instanceof z2d.a) {
                                p8e p8eVar = this.v;
                                if (p8eVar != null) {
                                    o8e.a.c cVar = o8e.a.c.a;
                                    m0d m0dVar3 = ((z2d.a) z2dVar2).b;
                                    p8eVar.a(new o8e(m0dVar3.a.I0(), m0dVar3.a.o0(), cVar));
                                }
                                f4zVar3.b(ClipItemTooltipEvent.f.b);
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.m) {
                            if ((z2dVar2 instanceof z2d.a) && (wp50Var = ((z2d.a) z2dVar2).B) != null) {
                                wp50Var.f(new xp50.k(MyTargetFacadeCustomStatType.CLIP_COMMENT));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.q) {
                            f4zVar3.b(ClipItemTooltipEvent.d.b);
                        } else if (clipItemAction2 instanceof ClipItemAction.y) {
                            if (z2dVar2 instanceof z2d.a) {
                                z2d.a aVar7 = (z2d.a) z2dVar2;
                                f4zVar2.b(new t1d.c(aVar7.b.b(), aVar7.d, aVar7.e));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.j) {
                            if (z2dVar2 instanceof z2d.a) {
                                f4zVar2.b(new t1d.g(((z2d.a) z2dVar2).b.b()));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.l) {
                            ClipItemAction.l lVar = (ClipItemAction.l) clipItemAction2;
                            UserId userId = lVar.b;
                            if (z2dVar2 instanceof z2d.a) {
                                z2d.a aVar8 = (z2d.a) z2dVar2;
                                UserId I0 = aVar8.b.a.I0();
                                k7f k7fVar = lVar.c;
                                if (epx.f(I0, userId)) {
                                    C(new ClipItemAction.g0.b(k7fVar));
                                } else {
                                    f4zVar4.b(new t0d.q.a(aVar8.c, userId, k7fVar));
                                }
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.k) {
                            ClipItemAction.k kVar = (ClipItemAction.k) clipItemAction2;
                            UserId userId2 = kVar.b;
                            if (z2dVar2 instanceof z2d.a) {
                                z2d.a aVar9 = (z2d.a) z2dVar2;
                                UserId I02 = aVar9.b.a.I0();
                                mre mreVar = kVar.c;
                                if (epx.f(I02, userId2)) {
                                    C(new ClipItemAction.g0.a(mreVar));
                                } else {
                                    f4zVar4.b(new t0d.m.a(aVar9.c, userId2, mreVar));
                                }
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.f0) {
                            if (z2dVar2 instanceof z2d.a) {
                                f4zVar2.b(new t1d.r(((z2d.a) z2dVar2).b.b()));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.e0) {
                            ClipItemAction.e0 e0Var = (ClipItemAction.e0) clipItemAction2;
                            f4zVar2.b(new t1d.v(e0Var.b, e0Var.c));
                        } else if (clipItemAction2 instanceof ClipItemAction.z) {
                            izs<SdkClipVideoFile, s3q0> izsVar = ((ClipItemAction.z) clipItemAction2).b;
                            if (z2dVar2 instanceof z2d.a) {
                                f4zVar4.b(new t0d.q.b(((z2d.a) z2dVar2).c, izsVar));
                            }
                        } else if (clipItemAction2 instanceof ClipItemAction.c) {
                            if (z2dVar2 instanceof z2d.a) {
                                z2d.a aVar10 = (z2d.a) z2dVar2;
                                wp50 wp50Var3 = aVar10.B;
                                if (wp50Var3 != null) {
                                    wp50Var3.f(new xp50.k(MyTargetFacadeCustomStatType.CLIP_BOOKMARK));
                                }
                                f4zVar4.b(new t0d.b(aVar10.b.b()));
                            }
                        } else {
                            if (!(clipItemAction2 instanceof ClipItemAction.d0)) {
                                if (!(clipItemAction2 instanceof ClipItemAction.j0)) {
                                    aVar = this;
                                    if (clipItemAction2 instanceof ClipItemAction.g0) {
                                        aVar.J.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.a) {
                                        aVar.K.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.k0) {
                                        aVar.L.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.d) {
                                        ((mj50) aVar.M.getValue()).a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.Tooltip) {
                                        aVar.N.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.h) {
                                        aVar.O.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.Nps) {
                                        aVar.P.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.c0) {
                                        ClipItemAction.c0 c0Var = (ClipItemAction.c0) clipItemAction2;
                                        if (z2dVar2 instanceof z2d.a) {
                                            if (c0Var instanceof ClipItemAction.c0.a) {
                                                a0dVar = a0d.a.a;
                                            } else if (c0Var instanceof ClipItemAction.c0.c) {
                                                a0dVar = new a0d.c(((ClipItemAction.c0.c) c0Var).b);
                                            } else {
                                                if (!(c0Var instanceof ClipItemAction.c0.b)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                a0dVar = a0d.b.a;
                                            }
                                            aVar.q.b(new e0d(((z2d.a) z2dVar2).b.b, a0dVar));
                                        }
                                    } else if (clipItemAction2 instanceof ClipItemAction.e) {
                                        aVar.Q.a(z2dVar2, clipItemAction2);
                                    } else if (clipItemAction2 instanceof ClipItemAction.v) {
                                        ClipItemAction.v vVar = (ClipItemAction.v) clipItemAction2;
                                        if (z2dVar2 instanceof z2d.a) {
                                            m0d m0dVar4 = ((z2d.a) z2dVar2).b;
                                            Boolean Q = m0dVar4.a.Q();
                                            boolean z6 = vVar.b;
                                            boolean z7 = vVar.c;
                                            if (!epx.f(Q, Boolean.valueOf(z6))) {
                                                if (z7) {
                                                    m0dVar4.a.xa(z6);
                                                    m0dVar4.b().xa(z6);
                                                    T(new ClipItemPatch.b.a.C0660b(m0dVar4));
                                                }
                                                T(new ClipItemPatch.g(new ioa0.b(z6, z7)));
                                            }
                                        }
                                    } else if (clipItemAction2 instanceof ClipItemAction.a0) {
                                        T(new ClipItemPatch.g(ioa0.a.a));
                                    } else if (clipItemAction2 instanceof ClipItemAction.b) {
                                        ClipItemAction.b bVar = (ClipItemAction.b) clipItemAction2;
                                        if (z2dVar2 instanceof z2d.a) {
                                            if (bVar instanceof ClipItemAction.b.d) {
                                                z2d.a aVar11 = (z2d.a) z2dVar2;
                                                m0d m0dVar5 = aVar11.b;
                                                t80 t80Var = m0dVar5.j;
                                                if (t80Var != null && !t80Var.c()) {
                                                    Iterator<T> it2 = t80Var.d().c.iterator();
                                                    while (true) {
                                                        if (!it2.hasNext()) {
                                                            break;
                                                        }
                                                        SdkClipActivity sdkClipActivity = (SdkClipActivity) it2.next();
                                                        SdkClipActivity.Likes likes2 = sdkClipActivity instanceof SdkClipActivity.Likes ? (SdkClipActivity.Likes) sdkClipActivity : null;
                                                        if (likes2 != null) {
                                                            likes = likes2;
                                                            break;
                                                        }
                                                    }
                                                    if (likes != null && aVar11.x) {
                                                        pih0Var.ai(new ClipViewerAnalyticsEvent.d(m0dVar5.b(), likes));
                                                    }
                                                    T(new ClipItemPatch.a.b(m0dVar5.a.a1()));
                                                }
                                            } else if (bVar instanceof ClipItemAction.b.C0652b) {
                                                z2d.a aVar12 = (z2d.a) z2dVar2;
                                                m0d m0dVar6 = aVar12.b;
                                                t80 t80Var2 = m0dVar6.j;
                                                if (t80Var2 != null && !t80Var2.c()) {
                                                    Iterator<T> it3 = t80Var2.d().c.iterator();
                                                    while (true) {
                                                        if (!it3.hasNext()) {
                                                            break;
                                                        }
                                                        SdkClipActivity sdkClipActivity2 = (SdkClipActivity) it3.next();
                                                        SdkClipActivity.Comments comments2 = sdkClipActivity2 instanceof SdkClipActivity.Comments ? (SdkClipActivity.Comments) sdkClipActivity2 : null;
                                                        if (comments2 != null) {
                                                            comments = comments2;
                                                            break;
                                                        }
                                                    }
                                                    if (comments != null && aVar12.x) {
                                                        pih0Var.ai(new ClipViewerAnalyticsEvent.c(m0dVar6.b(), comments));
                                                    }
                                                    T(new ClipItemPatch.a.C0658a(m0dVar6.a.a1()));
                                                }
                                            } else if (bVar instanceof ClipItemAction.b.c) {
                                                f4zVar4.b(new t0d.a.b(((z2d.a) z2dVar2).b.a));
                                            } else {
                                                if (!(bVar instanceof ClipItemAction.b.a)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                ClipItemAction.b.a aVar13 = (ClipItemAction.b.a) bVar;
                                                f4zVar4.b(new t0d.a.C3711a(((z2d.a) z2dVar2).b.a, aVar13.b, aVar13.c, aVar13.d));
                                            }
                                        }
                                    } else {
                                        if (!(clipItemAction2 instanceof ClipItemAction.i0)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        ((mj50) aVar.S.getValue()).a(z2dVar2, clipItemAction2);
                                    }
                                } else if (z2dVar2 instanceof z2d.a) {
                                    a7f0.a.e(this, this.p.a(((z2d.a) z2dVar2).b.b).U(new ai3(new z90(15), 8)), null, new com.vk.voip.ui.menu.feature.a(this, 21), null, null, 13);
                                    aVar = this;
                                }
                                aVar.R.a(z2dVar2, clipItemAction2);
                            }
                            if (z2dVar2 instanceof z2d.a) {
                                f4zVar2.b(new t1d.j(((z2d.a) z2dVar2).b.b()));
                            }
                        }
                    }
                }
            }
        }
        aVar = this;
        aVar.R.a(z2dVar2, clipItemAction2);
    }

    @Override // xsna.wk50
    public final List<ClipItemAction> Q(z2d z2dVar, z2d z2dVar2, ClipItemPatch clipItemPatch) {
        ny nyVar;
        z2d z2dVar3 = z2dVar;
        z2d z2dVar4 = z2dVar2;
        super.Q(z2dVar3, z2dVar4, clipItemPatch);
        if (z2dVar4 instanceof z2d.a) {
            z2d.a aVar = z2dVar3 instanceof z2d.a ? (z2d.a) z2dVar3 : null;
            z2d.a aVar2 = (z2d.a) z2dVar4;
            boolean z = aVar2.x;
            n0x n0xVar = aVar2.v;
            boolean z2 = false;
            boolean z3 = !((aVar != null && aVar.x == z) && epx.f(aVar != null ? aVar.v : null, n0xVar)) && z && (n0xVar instanceof n0x.b);
            boolean z4 = !epx.f(aVar != null ? aVar.v : null, n0xVar) && (n0xVar instanceof n0x.c);
            Boolean valueOf = (aVar == null || (nyVar = aVar.o) == null) ? null : Boolean.valueOf(nyVar.b);
            Boolean bool = Boolean.TRUE;
            if (!epx.f(valueOf, bool) && epx.f(Boolean.valueOf(aVar2.o.b), bool)) {
                z2 = true;
            }
            if (z3 || z4 || z2) {
                ArrayList arrayList = new ArrayList();
                if (z3) {
                    arrayList.add(ClipItemAction.Nps.e.b);
                }
                if (z4) {
                    arrayList.add(ClipItemAction.Nps.Close.Delayed);
                }
                if (z2) {
                    arrayList.add(ClipItemAction.c0.a.b);
                }
                return arrayList;
            }
        }
        return null;
    }

    public final boolean U(m0d m0dVar) {
        List<String> list;
        if (!this.i.E().a) {
            return false;
        }
        SdkClipsAdsFeaturesParams d3 = m0dVar.a.d3();
        if (d3 == null || (list = d3.b) == null || !(!list.isEmpty())) {
            SdkClipsAdsFeaturesParams d32 = m0dVar.a.d3();
            if ((d32 != null ? d32.d : null) == null) {
                return false;
            }
        }
        return true;
    }
}
