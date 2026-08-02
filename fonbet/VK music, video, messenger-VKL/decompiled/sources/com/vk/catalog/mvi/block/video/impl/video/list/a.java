package com.vk.catalog.mvi.block.video.impl.video.list;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.movika.sdk.base.ui.s;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.b6l;
import xsna.bap;
import xsna.bpf0;
import xsna.buv0;
import xsna.cis0;
import xsna.dai;
import xsna.egi;
import xsna.egi0;
import xsna.etv0;
import xsna.fcy;
import xsna.fpf0;
import xsna.fw00;
import xsna.gyo0;
import xsna.gzs;
import xsna.hdt0;
import xsna.hmj0;
import xsna.i95;
import xsna.izs;
import xsna.j6;
import xsna.ju80;
import xsna.ksr;
import xsna.m2a;
import xsna.mno0;
import xsna.msy;
import xsna.mx9;
import xsna.o9v0;
import xsna.orj0;
import xsna.q630;
import xsna.qe20;
import xsna.qni0;
import xsna.rdi;
import xsna.s200;
import xsna.s3q0;
import xsna.spj;
import xsna.svd;
import xsna.tm1;
import xsna.txj0;
import xsna.v630;
import xsna.vjs0;
import xsna.vst0;
import xsna.w0f;
import xsna.wlb0;
import xsna.wzs;
import xsna.x4o;
import xsna.x7t0;
import xsna.xjs0;
import xsna.yvj;
import xsna.zoi;

/* compiled from: VideosListView.kt */
/* loaded from: classes.dex */
public final class a extends m2a<vst0, c, vjs0> {
    public final xjs0 b;
    public final Object c;

    /* compiled from: VideosListView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.video.impl.video.list.VideosListView$BlockView$BindAfterCustomModifier$4$1", f = "VideosListView.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.catalog.mvi.block.video.impl.video.list.a$a, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public static final class C0471a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ etv0 $tooltipState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0471a(etv0 etv0Var, spj<? super C0471a> spjVar) {
            super(2, spjVar);
            this.$tooltipState = etv0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new C0471a(this.$tooltipState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((C0471a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$tooltipState.setVisible(true);
            return s3q0.a;
        }
    }

    /* compiled from: VideosListView.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Long> {
        public b(Object obj) {
            super(0, obj, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
        }

        @Override // xsna.gzs
        public final Long invoke() {
            return Long.valueOf(qni0.a());
        }
    }

    public a(hdt0 hdt0Var, x4o x4oVar) {
        super(fpf0.a(vjs0.class));
        this.b = new xjs0(hdt0Var, x4oVar);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new w0f(14));
    }

    public final void c(vst0 vst0Var, izs<? super c, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        vst0 vst0Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(141718202);
        if ((i & 6) == 0) {
            i2 = i | (M.J(vst0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(141718202, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.list.VideosListView.BlockView.BindAfterCustomModifier (VideosListView.kt:423)");
            }
            VideoCellViewState.c a = vst0Var.c.a();
            if (a == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f s = M.s();
                if (s != null) {
                    s.l(new i95(i, 2, this, vst0Var, izsVar));
                    return;
                }
                return;
            }
            String str = vst0Var.d;
            if (str == null) {
                M.K(-25579488);
                a.b().c(q630.a.a, M, 6);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f s2 = M.s();
                if (s2 != null) {
                    s2.l(new ju80(i, 4, this, vst0Var, izsVar, false));
                    return;
                }
                return;
            }
            vst0Var2 = vst0Var;
            M.K(-43860312);
            M.j();
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new hmj0(8, izsVar, vst0Var2);
                M.R(x);
            }
            aVar2 = M;
            buv0 z2 = rdi.z(false, null, (izs) x, aVar2, 0, 3);
            zoi<q630> b2 = a.b();
            VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
            VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
            VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
            VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size48;
            VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Azure;
            boolean s3 = wlb0.h(aVar2).s();
            boolean y = aVar2.y(z2) | aVar2.J(a);
            Object x2 = aVar2.x();
            if (y || x2 == c0012a) {
                x2 = new j6(21, z2, a);
                aVar2.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean y2 = aVar2.y(z2);
            Object x3 = aVar2.x();
            if (y2 || x3 == c0012a) {
                x3 = new orj0(z2, 28);
                aVar2.R(x3);
            }
            b2.c(o9v0.g(str, z2, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, vkOnboarding$TintColor, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, gzsVar, (gzs) x3, s3, 261632), aVar2, 0);
            boolean y3 = aVar2.y(z2);
            Object x4 = aVar2.x();
            if (y3 || x4 == c0012a) {
                x4 = new C0471a(z2, null);
                aVar2.R(x4);
            }
            bap.g(str, (wzs) x4, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            vst0Var2 = vst0Var;
            aVar2 = M;
            aVar2.h();
        }
        f s4 = aVar2.s();
        if (s4 != null) {
            s4.l(new mx9(i, 6, this, vst0Var2, izsVar, false));
        }
    }

    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m2a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(final a8a a8aVar, final vst0 vst0Var, final izs izsVar, final ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 q630Var2;
        String str;
        q630 f;
        q630 b2;
        VideoMetaViewState.a a;
        VideoMetaViewState.a b3;
        VideoCellViewState videoCellViewState = vst0Var.c;
        androidx.compose.runtime.a M = aVar.M(2037740736);
        if ((i & 48) == 0) {
            i2 = (M.J(vst0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 16384 : 8192;
        } else {
            q630Var2 = q630Var;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74897 & i2) != 74896)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2037740736, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.list.VideosListView.BlockView.ContentImpl (VideosListView.kt:348)");
            }
            int i3 = i2 >> 9;
            this.b.a(ksrVar, M, i3 & 14);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new bpf0();
                M.R(x);
            }
            bpf0 bpf0Var = (bpf0) x;
            dai.c d = videoCellViewState.d();
            int i4 = i2 & 896;
            int i5 = i2 & 112;
            boolean y = (i4 == 256) | (i5 == 32) | M.y(bpf0Var);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new svd(izsVar, vst0Var, bpf0Var, 13);
                M.R(x2);
            }
            d.c((gzs) x2, M, 0);
            dai.c b4 = videoCellViewState.b().e().b();
            boolean y2 = (i4 == 256) | (i5 == 32) | M.y(bpf0Var);
            Object x3 = M.x();
            if (y2 || x3 == c0012a) {
                x3 = new tm1(izsVar, vst0Var, bpf0Var, 7);
                M.R(x3);
            }
            b4.c((gzs) x3, M, 0);
            VideoCellViewState.c a2 = videoCellViewState.a();
            dai.c a3 = a2 != null ? a2.a() : null;
            if (a3 == null) {
                M.K(1267331686);
            } else {
                M.K(-236212997);
                boolean z = (i5 == 32) | (i4 == 256);
                Object x4 = M.x();
                if (z || x4 == c0012a) {
                    x4 = new s(23, izsVar, vst0Var);
                    M.R(x4);
                }
                a3.c((gzs) x4, M, 0);
            }
            M.j();
            c(vst0Var, izsVar, M, (i3 & 896) | ((i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            VideoMetaViewState c = videoCellViewState.c();
            dai.c b5 = (c == null || (b3 = c.b()) == null) ? null : b3.b();
            if (b5 == null) {
                M.K(1267560621);
            } else {
                M.K(-236205612);
                boolean y3 = (i4 == 256) | (i5 == 32) | M.y(bpf0Var);
                Object x5 = M.x();
                if (y3 || x5 == c0012a) {
                    x5 = new qe20(izsVar, vst0Var, bpf0Var, 4);
                    M.R(x5);
                }
                b5.c((gzs) x5, M, 0);
            }
            M.j();
            VideoMetaViewState c2 = videoCellViewState.c();
            dai.c b6 = (c2 == null || (a = c2.a()) == null) ? null : a.b();
            if (b6 == null) {
                M.K(1267797709);
            } else {
                M.K(-236197964);
                boolean y4 = (i4 == 256) | (i5 == 32) | M.y(bpf0Var);
                Object x6 = M.x();
                if (y4 || x6 == c0012a) {
                    x6 = new fw00(izsVar, vst0Var, bpf0Var, 5);
                    M.R(x6);
                }
                b6.c((gzs) x6, M, 0);
            }
            M.j();
            PlaceholderViewState a4 = videoCellViewState.b().a();
            zoi<PlaceholderViewState.Appearance> a5 = a4 != null ? a4.a() : null;
            if (a5 == null) {
                M.K(1268022459);
            } else {
                M.K(-236190714);
                a5.c(videoCellViewState.b().e().d() ? PlaceholderViewState.Appearance.Overlay : PlaceholderViewState.Appearance.Neutral, M, 0);
            }
            M.j();
            videoCellViewState.f().c(VideoCellViewState.Size.Small, M, 6);
            VideoMetaViewState c3 = videoCellViewState.c();
            if (c3 == null) {
                M.K(1268455250);
                M.j();
                str = null;
            } else {
                M.K(-236176753);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1507634108, 48, -1, "com.vk.catalog.mvi.block.video.impl.video.list.VideosListView.getVideoTitle (VideosListView.kt:476)");
                }
                VideoMetaViewState.h c4 = c3.c();
                VideoMetaViewState.i iVar = c4 instanceof VideoMetaViewState.i ? (VideoMetaViewState.i) c4 : null;
                mno0 a6 = iVar != null ? iVar.a() : null;
                if (a6 == null) {
                    M.K(1454840315);
                    M.j();
                    str = null;
                } else {
                    M.K(1432403654);
                    String a7 = ((mno0.i) a6).a(0, M);
                    M.j();
                    str = a7;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            f = txj0.f(q630Var2, 1.0f);
            boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
            q630 q630Var3 = q630.a.a;
            if (booleanValue) {
                M.K(1268747085);
                boolean y5 = M.y(bpf0Var);
                Object x7 = M.x();
                if (y5 || x7 == c0012a) {
                    x7 = new gyo0(bpf0Var, 10);
                    M.R(x7);
                }
                q630Var3 = egi.o(q630Var3, (izs) x7);
                M.j();
            } else {
                M.K(1268928962);
                M.j();
            }
            q630 C = s200.C(f.g(q630Var3), s200.l(16, 6));
            qni0 qni0Var = qni0.a;
            boolean y6 = M.y(qni0Var);
            Object x8 = M.x();
            if (y6 || x8 == c0012a) {
                x8 = new b(qni0Var);
                M.R(x8);
            }
            gzs gzsVar = (gzs) ((fcy) x8);
            boolean z2 = (i4 == 256) | (i5 == 32);
            Object x9 = M.x();
            if (z2 || x9 == c0012a) {
                x9 = new x7t0(2, izsVar, vst0Var);
                M.R(x9);
            }
            q630 a8 = v630.a(C, gzsVar, (izs) x9);
            boolean J = M.J(str) | (i5 == 32);
            Object x10 = M.x();
            if (J || x10 == c0012a) {
                x10 = new cis0(2, vst0Var, str);
                M.R(x10);
            }
            b2 = egi0.b(a8, false, (izs) x10);
            com.vk.libvideo.design.compose.video.videocell.a.g(videoCellViewState, b2, M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            final q630 q630Var4 = q630Var2;
            s.l(new wzs() { // from class: xsna.ust0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    com.vk.catalog.mvi.block.video.impl.video.list.a.this.b(a8aVar, vst0Var, izsVar, ksrVar, q630Var4, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            });
        }
    }
}
