package com.vk.video.profile.presentation.views.creatoronboarding.items;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.ahn;
import xsna.anp;
import xsna.b6l;
import xsna.bap;
import xsna.brm0;
import xsna.c5g;
import xsna.ce0;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.dtp0;
import xsna.e43;
import xsna.ec2;
import xsna.epx;
import xsna.frv0;
import xsna.ft3;
import xsna.ge0;
import xsna.gzs;
import xsna.hbk0;
import xsna.izs;
import xsna.j5g;
import xsna.jq2;
import xsna.juo;
import xsna.k9q0;
import xsna.kai;
import xsna.mm2;
import xsna.n34;
import xsna.ojc;
import xsna.okq;
import xsna.pg90;
import xsna.pn00;
import xsna.pzu0;
import xsna.q630;
import xsna.qpp;
import xsna.qri;
import xsna.rpo0;
import xsna.rpp;
import xsna.s200;
import xsna.s3q0;
import xsna.slr0;
import xsna.spj;
import xsna.sy90;
import xsna.szw;
import xsna.tmi;
import xsna.txj0;
import xsna.ty6;
import xsna.vjw;
import xsna.wh50;
import xsna.wlb0;
import xsna.wzs;
import xsna.xpy;
import xsna.yqv0;
import xsna.yvj;
import xsna.yzs;
import xsna.zak0;
import xsna.zrp;
import xsna.zzs0;

/* compiled from: VideoProfileCreatorOnboardingItemsView.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCreatorOnboardingItemsView extends rpo0 {
    public static final /* synthetic */ int q = 0;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;

    /* compiled from: VideoProfileCreatorOnboardingItemsView.kt */
    @b6l(c = "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView$AnimateViewEffect$1$1", f = "VideoProfileCreatorOnboardingItemsView.kt", l = {228, 236}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ hbk0<VideoProfileCreatorOnboardingItemType, Boolean> $itemsVisibilityStates;
        final /* synthetic */ wh50<Boolean> $titleVisibilityState;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wh50<Boolean> wh50Var, hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$titleVisibilityState = wh50Var;
            this.$itemsVisibilityStates = hbk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return VideoProfileCreatorOnboardingItemsView.this.new a(this.$titleVisibilityState, this.$itemsVisibilityStates, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
        
            r14.L$0 = r8;
            r14.L$1 = null;
            r14.L$2 = r7;
            r14.L$3 = r6;
            r14.L$4 = null;
            r14.L$5 = null;
            r14.I$0 = r5;
            r14.I$1 = r12;
            r14.I$2 = r15;
            r14.I$3 = 0;
            r14.label = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00f0, code lost:
        
            if (xsna.qsl.b(600, r14) != r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00f3, code lost:
        
            r1 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
        
            if (xsna.qsl.b(600, r14) == r0) goto L45;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fc A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00f3 -> B:15:0x00f4). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var;
            Iterator it;
            int i;
            List list;
            int i2;
            int i3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.label;
            if (i4 == 0) {
                kotlin.a.a(obj);
                if (!VideoProfileCreatorOnboardingItemsView.this.getVisibleItemsSet().isEmpty()) {
                    this.$titleVisibilityState.setValue(Boolean.TRUE);
                }
                Set visibleItemsSet = VideoProfileCreatorOnboardingItemsView.this.getVisibleItemsSet();
                hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var2 = this.$itemsVisibilityStates;
                Iterator it2 = visibleItemsSet.iterator();
                while (it2.hasNext()) {
                    hbk0Var2.put((VideoProfileCreatorOnboardingItemType) it2.next(), Boolean.TRUE);
                }
                List t0 = j5g.t0(VideoProfileCreatorOnboardingItemType.h(), VideoProfileCreatorOnboardingItemsView.this.getVisibleItemsSet());
                hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var3 = this.$itemsVisibilityStates;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : t0) {
                    if (epx.f(hbk0Var3.get((VideoProfileCreatorOnboardingItemType) obj2), Boolean.TRUE)) {
                        arrayList.add(obj2);
                    }
                }
                hbk0Var = this.$itemsVisibilityStates;
                it = arrayList.iterator();
                i = 0;
                list = arrayList;
                i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                    }
                    i = i3;
                }
                return coroutineSingletons;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                gzs onAnimationEnded = VideoProfileCreatorOnboardingItemsView.this.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke();
                }
                return s3q0.a;
            }
            int i5 = this.I$1;
            i2 = this.I$0;
            it = (Iterator) this.L$3;
            hbk0Var = (hbk0) this.L$2;
            list = (List) this.L$0;
            kotlin.a.a(obj);
            i = i5;
            while (true) {
                if (it.hasNext()) {
                    if (VideoProfileCreatorOnboardingItemsView.this.getVisibleItemsSet().isEmpty()) {
                        this.$titleVisibilityState.setValue(Boolean.FALSE);
                    }
                    if (!list.isEmpty()) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                    }
                } else {
                    Object next = it.next();
                    i3 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    hbk0Var.put((VideoProfileCreatorOnboardingItemType) next, Boolean.FALSE);
                    if (i < e43.h(list)) {
                        break;
                    }
                    i = i3;
                }
            }
            return coroutineSingletons;
        }
    }

    /* compiled from: VideoProfileCreatorOnboardingItemsView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoProfileCreatorOnboardingItemType.values().length];
            try {
                iArr[VideoProfileCreatorOnboardingItemType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoProfileCreatorOnboardingItemType.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoProfileCreatorOnboardingItemType.DESCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoProfileCreatorOnboardingItemsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = k.b(Boolean.valueOf(getVisibility() == 0));
        this.n = k.b(EmptySet.b);
        this.o = k.b(null);
        this.p = k.b(null);
    }

    public static s3q0 B(VideoProfileCreatorOnboardingItemsView videoProfileCreatorOnboardingItemsView, VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType) {
        izs<VideoProfileCreatorOnboardingItemType, s3q0> onItemClicked = videoProfileCreatorOnboardingItemsView.getOnItemClicked();
        if (onItemClicked != null) {
            onItemClicked.invoke(videoProfileCreatorOnboardingItemType);
        }
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gzs<s3q0> getOnAnimationEnded() {
        return (gzs) ((zak0) this.p).getValue();
    }

    private final izs<VideoProfileCreatorOnboardingItemType, s3q0> getOnItemClicked() {
        return (izs) ((zak0) this.o).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<VideoProfileCreatorOnboardingItemType> getVisibleItemsSet() {
        return (Set) ((zak0) this.n).getValue();
    }

    private final void setOnAnimationEnded(gzs<s3q0> gzsVar) {
        ((zak0) this.p).setValue(gzsVar);
    }

    private final void setOnItemClicked(izs<? super VideoProfileCreatorOnboardingItemType, s3q0> izsVar) {
        ((zak0) this.o).setValue(izsVar);
    }

    private final void setViewVisible(boolean z) {
        ((zak0) this.m).setValue(Boolean.valueOf(z));
    }

    private final void setVisibleItemsSet(Set<? extends VideoProfileCreatorOnboardingItemType> set) {
        ((zak0) this.n).setValue(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1134796853);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1134796853, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.ThemedContent (VideoProfileCreatorOnboardingItemsView.kt:65)");
            }
            if (((Boolean) ((zak0) this.m).getValue()).booleanValue()) {
                M.K(1045556978);
                Object x = M.x();
                Object obj = a.C0011a.a;
                Object obj2 = x;
                if (x == obj) {
                    zrp<VideoProfileCreatorOnboardingItemType> h = VideoProfileCreatorOnboardingItemType.h();
                    ArrayList arrayList = new ArrayList(c5g.u(h, 10));
                    for (VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType : h) {
                        arrayList.add(new Pair(videoProfileCreatorOnboardingItemType, Boolean.valueOf(getVisibleItemsSet().contains(videoProfileCreatorOnboardingItemType))));
                    }
                    hbk0 hbk0Var = new hbk0();
                    hbk0Var.putAll(pn00.s(arrayList));
                    M.R(hbk0Var);
                    obj2 = hbk0Var;
                }
                hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var2 = (hbk0) obj2;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = j.d(!getVisibleItemsSet().isEmpty(), M);
                }
                wh50<Boolean> wh50Var = (wh50) x2;
                q630 E = ahn.E(txj0.f(q630.a.a, 1.0f), "video_creators_onboarding_items");
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
                cri.h7.getClass();
                LayoutNode.a aVar2 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar2);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                int i3 = (i2 << 3) & 112;
                G(((Boolean) wh50Var.getValue()).booleanValue(), M, 64 | i3);
                F(hbk0Var2, M, 70 | i3);
                C(wh50Var, hbk0Var2, M, ((i2 << 6) & 896) | 566);
                M.G();
            } else {
                M.K(1042601965);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ce0(this, i, 12);
        }
    }

    public final void C(wh50<Boolean> wh50Var, hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1740987972);
        if ((i & 6) == 0) {
            i2 = (M.J(wh50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(hbk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(this) : M.y(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1740987972, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.AnimateViewEffect (VideoProfileCreatorOnboardingItemsView.kt:211)");
            }
            Set<VideoProfileCreatorOnboardingItemType> visibleItemsSet = getVisibleItemsSet();
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && M.y(this))) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new a(wh50Var, hbk0Var, null);
                M.R(x);
            }
            bap.g(visibleItemsSet, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ec2(i, 6, this, wh50Var, hbk0Var);
        }
    }

    public final void D(final VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType, final boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1863765309);
        if ((i & 6) == 0) {
            i2 = (M.o(videoProfileCreatorOnboardingItemType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(this) : M.y(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1863765309, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.AnimatedItem (VideoProfileCreatorOnboardingItemsView.kt:148)");
            }
            boolean z2 = !z;
            rpp rppVar = qpp.a;
            dtp0 d = jq2.d(600, 0, juo.a, 2);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new zzs0(1);
                M.R(x);
            }
            mm2.f(z2, null, rppVar, anp.n(d, (izs) x), null, kai.c(-2005814373, new yzs() { // from class: xsna.r7t0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    int i3 = VideoProfileCreatorOnboardingItemsView.q;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2005814373, intValue, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.AnimatedItem.<anonymous> (VideoProfileCreatorOnboardingItemsView.kt:160)");
                    }
                    VideoProfileCreatorOnboardingItemsView.this.E(videoProfileCreatorOnboardingItemType, z, gzsVar, aVar2, 4096);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 196608, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new okq(this, videoProfileCreatorOnboardingItemType, z, gzsVar, i, 1);
        }
    }

    public final void E(final VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType, final boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1921432026);
        int i3 = i | (M.o(videoProfileCreatorOnboardingItemType.ordinal()) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(this) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1921432026, i3, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.Item (VideoProfileCreatorOnboardingItemsView.kt:169)");
            }
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            q630.a aVar2 = q630.a.a;
            q630 b2 = ojc.b(txj0.f(aVar2, 1.0f), null, null, false, null, gzsVar, 28);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i4 = b.$EnumSwitchMapping$0[videoProfileCreatorOnboardingItemType.ordinal()];
            if (i4 == 1) {
                i2 = R.string.video_profile_creator_onboarding_avatar_item;
            } else if (i4 == 2) {
                i2 = R.string.video_profile_creator_onboarding_cover_item;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.video_profile_creator_onboarding_description_item;
            }
            String N = d370.N(i2, 0, M);
            frv0 frv0Var = wlb0.l(M).T;
            long j = wlb0.h(M).getText().m;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(N, ahn.E(new xpy(1.0f, true), brm0.y("video_creators_onboarding_items_item_key", "key", videoProfileCreatorOnboardingItemType.name())), j, null, null, 0, 1, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8120);
            M = M;
            if (z) {
                M.K(1288850768);
                vjw.a(pg90.a(R.drawable.vk_icon_check_circle_filled_blue_24, 0, M), null, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar2), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 440, 120);
                M.j();
            } else {
                M.K(1289151902);
                pzu0.a(slr0.b(R.drawable.vk_icon_chevron_compact_right_24, M), s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, 1, aVar2), wlb0.h(M).getIcon().n, M, Tensorflow.FRAME_WIDTH, 0);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(videoProfileCreatorOnboardingItemType, z, gzsVar, i) { // from class: xsna.s7t0
                public final /* synthetic */ VideoProfileCreatorOnboardingItemType c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gzs e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                    ((Integer) obj2).getClass();
                    int i5 = VideoProfileCreatorOnboardingItemsView.q;
                    VideoProfileCreatorOnboardingItemsView.this.E(this.c, this.d, this.e, aVar4, ne7.I(4097));
                    return s3q0.a;
                }
            };
        }
    }

    public final void F(hbk0<VideoProfileCreatorOnboardingItemType, Boolean> hbk0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1124066758);
        int i2 = (i & 6) == 0 ? (M.J(hbk0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(this) : M.y(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1124066758, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.ItemsList (VideoProfileCreatorOnboardingItemsView.kt:133)");
            }
            for (VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType : VideoProfileCreatorOnboardingItemType.h()) {
                boolean z = !epx.f(hbk0Var.get(videoProfileCreatorOnboardingItemType), Boolean.TRUE);
                boolean o = ((i2 & 112) == 32 || ((i2 & 64) != 0 && M.y(this))) | M.o(videoProfileCreatorOnboardingItemType.ordinal());
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new ge0(22, this, videoProfileCreatorOnboardingItemType);
                    M.R(x);
                }
                D(videoProfileCreatorOnboardingItemType, z, (gzs) x, M, 4096 | ((i2 << 6) & 7168));
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ft3(this, hbk0Var, i, 4);
        }
    }

    public final void G(boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final boolean z2;
        androidx.compose.runtime.a M = aVar.M(1449517059);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1449517059, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView.Title (VideoProfileCreatorOnboardingItemsView.kt:106)");
            }
            z2 = z;
            mm2.f(z2, null, qpp.a, anp.f(jq2.d(600, 0, juo.a, 2), 2), null, tmi.a, M, (i2 & 14) | 196608, 18);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q7t0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = VideoProfileCreatorOnboardingItemsView.q;
                    int I = ne7.I(i | 1);
                    VideoProfileCreatorOnboardingItemsView.this.G(z2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void setAnimationEndedCallback(gzs<s3q0> gzsVar) {
        setOnAnimationEnded(gzsVar);
    }

    public final void setItemClickListener(izs<? super VideoProfileCreatorOnboardingItemType, s3q0> izsVar) {
        setOnItemClicked(izsVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setViewVisible(i == 0);
    }

    public final void setVisibleItems(Collection<? extends VideoProfileCreatorOnboardingItemType> collection) {
        setVisibleItemsSet(j5g.S0(collection));
    }
}
