package com.vk.video.profile.presentation.views.creatoronboarding.videocounter;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ahn;
import xsna.anp;
import xsna.azl;
import xsna.b6l;
import xsna.bap;
import xsna.bpn0;
import xsna.brm0;
import xsna.cri;
import xsna.d370;
import xsna.d8v0;
import xsna.dt1;
import xsna.dtp0;
import xsna.duk0;
import xsna.egi;
import xsna.frv0;
import xsna.gp;
import xsna.hr80;
import xsna.if2;
import xsna.ive;
import xsna.iyk0;
import xsna.izs;
import xsna.jq2;
import xsna.juo;
import xsna.k9q0;
import xsna.kai;
import xsna.l5g;
import xsna.m4k0;
import xsna.mgb;
import xsna.mkg0;
import xsna.mm2;
import xsna.n34;
import xsna.p0p0;
import xsna.pco;
import xsna.pzj;
import xsna.q630;
import xsna.qf2;
import xsna.qpp;
import xsna.qq3;
import xsna.qri;
import xsna.rg50;
import xsna.rpo0;
import xsna.rpp;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.spj;
import xsna.sq2;
import xsna.sy90;
import xsna.txj0;
import xsna.ud6;
import xsna.uvi;
import xsna.v5v;
import xsna.vog0;
import xsna.w5h;
import xsna.wak0;
import xsna.wh50;
import xsna.wuv0;
import xsna.wzs;
import xsna.x2e0;
import xsna.ylu0;
import xsna.yqv0;
import xsna.yvj;
import xsna.zak0;
import xsna.zq;

/* compiled from: VideoProfileCreatorOnboardingVideoCounterView.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCreatorOnboardingVideoCounterView extends rpo0 {
    public static final /* synthetic */ int o = 0;
    public final rg50 m;
    public final wh50 n;

    /* compiled from: VideoProfileCreatorOnboardingVideoCounterView.kt */
    @b6l(c = "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView$ThemedContent$4$1", f = "VideoProfileCreatorOnboardingVideoCounterView.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS, 97}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ SnapshotStateList<if2<Float, sq2>> $progressStates;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SnapshotStateList<if2<Float, sq2>> snapshotStateList, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$progressStates = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return VideoProfileCreatorOnboardingVideoCounterView.this.new a(this.$progressStates, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009e -> B:7:0x00a2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c9 -> B:6:0x00cd). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            VideoProfileCreatorOnboardingVideoCounterView videoProfileCreatorOnboardingVideoCounterView;
            SnapshotStateList<if2<Float, sq2>> snapshotStateList;
            int i;
            int i2;
            int i3;
            int i4;
            SnapshotStateList<if2<Float, sq2>> snapshotStateList2;
            VideoProfileCreatorOnboardingVideoCounterView videoProfileCreatorOnboardingVideoCounterView2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.label;
            if (i5 == 0) {
                kotlin.a.a(obj);
                videoProfileCreatorOnboardingVideoCounterView = VideoProfileCreatorOnboardingVideoCounterView.this;
                snapshotStateList = this.$progressStates;
                i = 3;
                i2 = 0;
                if (i2 >= i) {
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.I$1;
                    i4 = this.I$0;
                    snapshotStateList2 = (SnapshotStateList) this.L$1;
                    videoProfileCreatorOnboardingVideoCounterView2 = (VideoProfileCreatorOnboardingVideoCounterView) this.L$0;
                    kotlin.a.a(obj);
                    s3q0 s3q0Var = s3q0.a;
                    i = i4;
                    snapshotStateList = snapshotStateList2;
                    videoProfileCreatorOnboardingVideoCounterView = videoProfileCreatorOnboardingVideoCounterView2;
                    i2 = i3 + 1;
                    if (i2 >= i) {
                        return s3q0.a;
                    }
                    int i6 = videoProfileCreatorOnboardingVideoCounterView.getProgressState() >= i2 + 1 ? 1 : 0;
                    if2<Float, sq2> if2Var = snapshotStateList.get(i2);
                    if (i6 == 0 || if2Var.d().floatValue() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Float f = new Float(i6 == 0 ? 0.0f : 1.0f);
                        this.L$0 = videoProfileCreatorOnboardingVideoCounterView;
                        this.L$1 = snapshotStateList;
                        this.L$2 = null;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.I$2 = i2;
                        this.I$3 = 0;
                        this.I$4 = i6;
                        this.label = 2;
                        if (if2Var.e(f, this) != coroutineSingletons) {
                            i3 = i2;
                            i4 = i;
                            snapshotStateList2 = snapshotStateList;
                            videoProfileCreatorOnboardingVideoCounterView2 = videoProfileCreatorOnboardingVideoCounterView;
                            s3q0 s3q0Var2 = s3q0.a;
                            i = i4;
                            snapshotStateList = snapshotStateList2;
                            videoProfileCreatorOnboardingVideoCounterView = videoProfileCreatorOnboardingVideoCounterView2;
                            i2 = i3 + 1;
                            if (i2 >= i) {
                            }
                        }
                    } else {
                        Float f2 = new Float(1.0f);
                        dtp0 d = jq2.d(600, 0, juo.a, 2);
                        this.L$0 = videoProfileCreatorOnboardingVideoCounterView;
                        this.L$1 = snapshotStateList;
                        this.L$2 = null;
                        this.I$0 = i;
                        this.I$1 = i2;
                        this.I$2 = i2;
                        this.I$3 = 0;
                        this.I$4 = i6;
                        this.label = 1;
                        if (if2.c(if2Var, f2, d, null, this, 12) != coroutineSingletons) {
                            i3 = i2;
                            i4 = i;
                            snapshotStateList2 = snapshotStateList;
                            videoProfileCreatorOnboardingVideoCounterView2 = videoProfileCreatorOnboardingVideoCounterView;
                            i = i4;
                            snapshotStateList = snapshotStateList2;
                            videoProfileCreatorOnboardingVideoCounterView = videoProfileCreatorOnboardingVideoCounterView2;
                            i2 = i3 + 1;
                            if (i2 >= i) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                i3 = this.I$1;
                i4 = this.I$0;
                snapshotStateList2 = (SnapshotStateList) this.L$1;
                videoProfileCreatorOnboardingVideoCounterView2 = (VideoProfileCreatorOnboardingVideoCounterView) this.L$0;
                kotlin.a.a(obj);
                i = i4;
                snapshotStateList = snapshotStateList2;
                videoProfileCreatorOnboardingVideoCounterView = videoProfileCreatorOnboardingVideoCounterView2;
                i2 = i3 + 1;
                if (i2 >= i) {
                }
            }
        }
    }

    public VideoProfileCreatorOnboardingVideoCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.m = i.a(0);
        this.n = k.b(Boolean.valueOf(getVisibility() == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgressState() {
        return this.m.getIntValue();
    }

    private final void setProgressState(int i) {
        ((wak0) this.m).C(i);
    }

    private final void setViewVisible(boolean z) {
        ((zak0) this.n).setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    @Override // xsna.rpo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(int i, androidx.compose.runtime.a aVar) {
        duk0 duk0Var;
        boolean z;
        Object x;
        boolean z2;
        Object x2;
        androidx.compose.runtime.a M = aVar.M(-1246629262);
        int i2 = i | (M.y(this) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-1246629262, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.ThemedContent (VideoProfileCreatorOnboardingVideoCounterView.kt:57)");
            }
            if (((Boolean) ((zak0) this.n).getValue()).booleanValue()) {
                M.K(249987714);
                Object x3 = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x3 == c0012a) {
                    ArrayList arrayList = new ArrayList(3);
                    int i3 = 0;
                    while (i3 < 3) {
                        i3++;
                        arrayList.add(qf2.a(getProgressState() >= i3 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                    x3 = k.d(arrayList);
                    M.R(x3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) x3;
                if (snapshotStateList == null || !snapshotStateList.isEmpty()) {
                    ListIterator listIterator = snapshotStateList.listIterator();
                    do {
                        duk0Var = (duk0) listIterator;
                        if (duk0Var.hasNext()) {
                        }
                    } while (((Number) ((if2) duk0Var.next()).d()).floatValue() == 1.0f);
                    z = true;
                    rpp rppVar = qpp.a;
                    dtp0 d = jq2.d(600, 0, juo.a, 2);
                    x = M.x();
                    if (x == c0012a) {
                        x = new m4k0(10);
                        M.R(x);
                    }
                    mm2.f(z, null, rppVar, anp.n(d, (izs) x), null, kai.c(-319552033, new ive(2, this, snapshotStateList), M), M, 196608, 18);
                    Integer valueOf = Integer.valueOf(getProgressState());
                    z2 = (i2 & 14) != 4 || M.y(this);
                    x2 = M.x();
                    if (!z2 || x2 == c0012a) {
                        x2 = new a(snapshotStateList, null);
                        M.R(x2);
                    }
                    bap.g(valueOf, (wzs) x2, M, 0);
                }
                z = false;
                rpp rppVar2 = qpp.a;
                dtp0 d2 = jq2.d(600, 0, juo.a, 2);
                x = M.x();
                if (x == c0012a) {
                }
                mm2.f(z, null, rppVar2, anp.n(d2, (izs) x), null, kai.c(-319552033, new ive(2, this, snapshotStateList), M), M, 196608, 18);
                Integer valueOf2 = Integer.valueOf(getProgressState());
                if ((i2 & 14) != 4) {
                }
                x2 = M.x();
                if (!z2) {
                }
                x2 = new a(snapshotStateList, null);
                M.R(x2);
                bap.g(valueOf2, (wzs) x2, M, 0);
            } else {
                M.K(247326736);
            }
            M.j();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new w5h(this, i, 11);
        }
    }

    public final void B(izs<? super Integer, Float> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1295700168);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1295700168, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.ContentBody (VideoProfileCreatorOnboardingVideoCounterView.kt:113)");
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, txj0.f(q630.a.a, 1.0f));
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            q630 E = ahn.E(hr80.m(F, ylu0Var.getBackground().x, vog0.b(16)), "video_creators_onboarding_counter");
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
            int i3 = ((i2 >> 3) & 14) | 8;
            F(i3, M);
            C(i3, M);
            D(izsVar, M, (i2 & 112) | 70);
            M.G();
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new pzj(this, izsVar, i, 11);
        }
    }

    public final void C(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String a2;
        androidx.compose.runtime.a M = aVar.M(-915254777);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(this) : M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (b.d()) {
                b.f(-915254777, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.CounterText (VideoProfileCreatorOnboardingVideoCounterView.kt:153)");
            }
            if (getProgressState() < 3) {
                M.K(-1902566281);
                a2 = d370.O(R.string.video_profile_creator_onboarding_counter_counter_progress, new Object[]{Integer.valueOf(3 - getProgressState())}, M);
                M.j();
            } else {
                a2 = zq.a(M, -1902337904, R.string.video_profile_creator_onboarding_counter_counter_completed, M, 0);
            }
            if (b.d()) {
                b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (b.d()) {
                b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            aVar2 = M;
            yqv0.c(a2, ahn.E(s200.H(q630.a.a, 12, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), "video_creators_onboarding_counter_subtitle"), ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 0, 0, 8184);
            if (b.d()) {
                b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new qq3(this, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(izs<? super Integer, Float> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1233075002);
        int i2 = (M.y(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (b.d()) {
                b.f(-1233075002, i2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.Progress (VideoProfileCreatorOnboardingVideoCounterView.kt:173)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = k.b(new pco(0));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            a.h hVar = androidx.compose.foundation.layout.a.g;
            float f = 12;
            q630 G = s200.G(txj0.f(q630.a.a, 1.0f), f, 8, f, f);
            boolean J = M.J(azlVar);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new p0p0(2, azlVar, wh50Var);
                M.R(x2);
            }
            q630 o2 = egi.o(G, (izs) x2);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = j.a(hVar, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, o2);
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
            M.K(-1315975795);
            for (int i3 = 0; i3 < 3; i3++) {
                E(izsVar.invoke(Integer.valueOf(i3)).floatValue(), ((pco) wh50Var.getValue()).b, i3, M, 4096 | ((i2 << 6) & 7168));
            }
            if (gp.d(M)) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new ud6(this, izsVar, i, 15);
        }
    }

    public final void E(final float f, final float f2, int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        final int i4;
        androidx.compose.runtime.a M = aVar.M(-624266253);
        if ((i2 & 6) == 0) {
            i3 = (M.n(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.n(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 256 : 128;
        } else {
            i4 = i;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (b.d()) {
                b.f(-624266253, i3, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.ProgressItem (VideoProfileCreatorOnboardingVideoCounterView.kt:196)");
            }
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (b.d()) {
                b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (b.d()) {
                b.e();
            }
            x2e0.c(f, ahn.E(txj0.v(q630.a.a, 0.32f * f2), brm0.y("video_creators_onboarding_counter_indicator_key", "key", String.valueOf(i4))), j, ylu0Var2.p().b, 1, M, i3 & 14);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.u7t0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    ((Integer) obj2).intValue();
                    int i5 = VideoProfileCreatorOnboardingVideoCounterView.o;
                    VideoProfileCreatorOnboardingVideoCounterView.this.E(f, f2, i4, aVar2, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void F(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1589270040);
        int i2 = i & 1;
        int i3 = 1;
        if (M.t(i2, i2 != 0)) {
            if (b.d()) {
                b.f(1589270040, i, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.Title (VideoProfileCreatorOnboardingVideoCounterView.kt:131)");
            }
            bpn0 bpn0Var = v5v.c;
            v5v a2 = v5v.a.a(d370.N(R.string.video_profile_creator_onboarding_counter_title, 0, M));
            Pair<Integer, Integer> pair = a2.b;
            if (b.d()) {
                b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (b.d()) {
                b.e();
            }
            d8v0.b(pair, l5g.c(14, ylu0Var.getBackground().f, 0.35f), s200.D(txj0.f(q630.a.a, 1.0f), 12), null, true, false, false, null, kai.c(-1020599076, new mgb(a2, i3), M), M, 805331328, 488);
            if (b.d()) {
                b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new mkg0(this, i, 2);
        }
    }

    public final void setProgress(int i) {
        setProgressState(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        setViewVisible(i == 0);
    }
}
