package com.vk.newsfeed.impl.items.posting.item.modals;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.h1;
import com.vk.core.compose.component.cell.content.x;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.movika.sdk.base.logic.interactor.g;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.commons.http.Http;
import xsna.aoe0;
import xsna.b6l;
import xsna.bap;
import xsna.blk;
import xsna.bpn0;
import xsna.buv0;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.d8v0;
import xsna.drm0;
import xsna.dt1;
import xsna.dw20;
import xsna.etv0;
import xsna.fqi;
import xsna.gzs;
import xsna.ip6;
import xsna.ir;
import xsna.izs;
import xsna.ja8;
import xsna.jai;
import xsna.jz70;
import xsna.k9q0;
import xsna.kai;
import xsna.l48;
import xsna.lg90;
import xsna.m7b;
import xsna.msy;
import xsna.n34;
import xsna.o9v0;
import xsna.ojc;
import xsna.pg90;
import xsna.pgc0;
import xsna.ps7;
import xsna.q630;
import xsna.qri;
import xsna.ra8;
import xsna.rdi;
import xsna.rrv0;
import xsna.rs80;
import xsna.s3q0;
import xsna.sg50;
import xsna.spg0;
import xsna.spj;
import xsna.sy90;
import xsna.tlo0;
import xsna.txj0;
import xsna.utk0;
import xsna.v5v;
import xsna.vtk0;
import xsna.wiu0;
import xsna.wzs;
import xsna.xik;
import xsna.ylu0;
import xsna.yq8;
import xsna.yr00;
import xsna.yrj0;
import xsna.yvj;
import xsna.zb1;

/* compiled from: SimplePostingCreateBottomSheet.kt */
/* loaded from: classes4.dex */
public final class d {
    public final rs80 a;
    public final pgc0 b;
    public final com.vk.newsfeed.impl.items.posting.item.modals.b c;
    public final ComposeView d;
    public dw20 e;
    public final utk0 f;
    public final Object g;

    /* compiled from: SimplePostingCreateBottomSheet.kt */
    public static final class a implements Cell$Middle.d {
        public final VkOnboarding$HighlighterMarkerType a;
        public final VkOnboarding$TintColor b;
        public final boolean c;
        public final v5v d;

        public a(String str, VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType, VkOnboarding$TintColor vkOnboarding$TintColor, int i) {
            vkOnboarding$HighlighterMarkerType = (i & 2) != 0 ? VkOnboarding$HighlighterMarkerType.Type4 : vkOnboarding$HighlighterMarkerType;
            vkOnboarding$TintColor = (i & 4) != 0 ? VkOnboarding$TintColor.Lime : vkOnboarding$TintColor;
            this.a = vkOnboarding$HighlighterMarkerType;
            this.b = vkOnboarding$TintColor;
            this.c = true;
            bpn0 bpn0Var = v5v.c;
            this.d = v5v.a.a(str);
        }

        @Override // com.vk.core.compose.component.cell.content.Cell$Middle.d, com.vk.core.compose.component.cell.content.Cell$Middle.c, com.vk.core.compose.component.cell.content.Cell$Middle.b
        public final void c(q630 q630Var, Cell$Middle.Size size, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(2012172362);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(size.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2012172362, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.HighlightedTitle.Content (SimplePostingCreateBottomSheet.kt:410)");
                }
                d8v0.a(this.d.b, q630Var, this.a, this.b, true, false, this.c, null, kai.c(-297933042, new aoe0(1, this, size), M), M, ((i2 << 3) & 112) | 805330944, Http.StatusCode.RANGE_NOT_SATISFIABLE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new zb1(i, 2, this, q630Var, size);
            }
        }
    }

    /* compiled from: SimplePostingCreateBottomSheet.kt */
    public static final class b implements Cell$Left.Main {
        public final String a;
        public final x b;
        public final gzs<s3q0> c;

        /* compiled from: SimplePostingCreateBottomSheet.kt */
        @b6l(c = "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet$TooltipIcon$Content$4$1", f = "SimplePostingCreateBottomSheet.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ etv0 $tooltipState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(etv0 etv0Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$tooltipState = etv0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$tooltipState, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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

        public b(String str, x xVar, gzs gzsVar) {
            this.a = str;
            this.b = xVar;
            this.c = gzsVar;
        }

        @Override // com.vk.core.compose.component.cell.content.Cell$Left
        public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(1824429222);
            if ((i & 6) == 0) {
                i2 = (M.J(spg0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(q630Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1824429222, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.TooltipIcon.Content (SimplePostingCreateBottomSheet.kt:441)");
                }
                if (this.a == null) {
                    M.K(-1240072287);
                    this.b.a(spg0Var, q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    M.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    f s = M.s();
                    if (s != null) {
                        s.d = new yrj0(i, 0, this, spg0Var, q630Var);
                        return;
                    }
                    return;
                }
                M.K(-1258497540);
                M.j();
                boolean z = (i2 & 896) == 256;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new yr00(this, 29);
                    M.R(x);
                }
                buv0 z2 = rdi.z(false, (izs) x, null, M, 0, 5);
                jai c = kai.c(-1185619213, new ip6(this, spg0Var, q630Var, 5), M);
                String str = this.a;
                gzs<s3q0> gzsVar = this.c;
                o9v0.a(str, z2, null, null, null, null, null, null, gzsVar, gzsVar, null, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, c, M, 0, 805306368, 523516);
                aVar2 = M;
                s3q0 s3q0Var = s3q0.a;
                boolean y = aVar2.y(z2);
                Object x2 = aVar2.x();
                if (y || x2 == c0012a) {
                    x2 = new a(z2, null);
                    aVar2.R(x2);
                }
                bap.g(s3q0Var, (wzs) x2, aVar2, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            f s2 = aVar2.s();
            if (s2 != null) {
                s2.d = new fqi(i, 4, this, spg0Var, q630Var);
            }
        }
    }

    public d(Context context, rs80 rs80Var, pgc0 pgc0Var, com.vk.newsfeed.impl.items.posting.item.modals.b bVar) {
        String string;
        this.a = rs80Var;
        this.b = pgc0Var;
        this.c = bVar;
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setTag("PostingComposeView");
        this.d = composeView;
        this.f = vtk0.a(Boolean.FALSE);
        this.g = msy.a(LazyThreadSafetyMode.NONE, new jz70(this, 21));
        rs80 rs80Var2 = bVar.a;
        if (rs80Var2.e) {
            string = context.getString(R.string.newsfeed_newpost_create_redesigned);
        } else {
            String str = rs80Var2.i;
            string = str == null ? context.getString(R.string.newsfeed_newpost_create) : str;
        }
        composeView.setContent(new jai(-70467892, new ps7(11, this, string), true));
    }

    public final void a(int i, m7b m7bVar, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i2) {
        h1 h1Var;
        boolean z;
        int i3;
        Cell$Middle.d a2;
        h1 h1Var2;
        String str;
        androidx.compose.runtime.a M = aVar.M(-1187319986);
        int i4 = i2 | (M.o(i) ? 4 : 2) | (M.J(m7bVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1187319986, i4, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.ChannelPostingCell (SimplePostingCreateBottomSheet.kt:372)");
            }
            boolean z2 = m7bVar.b;
            String N = d370.N(R.string.newsfeed_newpost_channel_post, 0, M);
            if (z2) {
                M.K(1901334773);
                a2 = new a(d370.O(R.string.onboarding_higlighted_text, new Object[]{N}, M), null, null, 14);
                M.j();
                z = z2;
                i3 = -1;
                h1Var = null;
            } else {
                M.K(1901556640);
                h1Var = null;
                z = z2;
                i3 = -1;
                a2 = Cell$Middle.d.b.a(N, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            Cell$Middle.d dVar = a2;
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            lg90 a3 = pg90.a(i, i4 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x a4 = com.vk.core.compose.component.cell.content.f.a(a3, size, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            if (!z || (str = m7bVar.c) == null || drm0.N(str)) {
                M.K(1902071983);
                M.j();
                h1Var2 = h1Var;
            } else {
                M.K(1446829170);
                h1 b2 = Cell$Middle.c.b.b(m7bVar.c, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M = M;
                M.j();
                h1Var2 = b2;
            }
            androidx.compose.runtime.a aVar2 = M;
            wiu0.b(q630Var, false, a4, Cell$Middle.a.a(dVar, h1Var2, null, null, aVar2, 196608, 28), null, gzsVar, null, aVar2, ((i4 >> 6) & 14) | ((i4 << 6) & 458752), 82);
            M = aVar2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new yq8(this, i, m7bVar, q630Var, gzsVar, i2);
        }
    }

    public final void b(final int i, androidx.compose.runtime.a aVar, jai jaiVar, gzs gzsVar, q630 q630Var, final boolean z) {
        final jai jaiVar2;
        gzs gzsVar2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1835180880);
        int i2 = i | (M.l(z) ? 4 : 2) | 384;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1835180880, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.OneTapBlockerUntilHighlighterIsShowed (SimplePostingCreateBottomSheet.kt:276)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar2 = jaiVar;
            jaiVar2.invoke(M, 6);
            if (z) {
                M.K(1720317766);
                q630 a2 = ra8.a.a(aVar2);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50 sg50Var = (sg50) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    gzsVar2 = gzsVar;
                    x2 = new xik(1, gzsVar2);
                    M.R(x2);
                } else {
                    gzsVar2 = gzsVar;
                }
                ja8.a(ojc.b(a2, sg50Var, null, false, null, (gzs) x2, 28), M, 0);
            } else {
                gzsVar2 = gzsVar;
                M.K(1707425176);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            jaiVar2 = jaiVar;
            gzsVar2 = gzsVar;
            M.h();
            q630Var2 = q630Var;
        }
        f s = M.s();
        if (s != null) {
            final gzs gzsVar3 = gzsVar2;
            s.d = new wzs(z, gzsVar3, q630Var2, jaiVar2, i) { // from class: xsna.urj0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ jai f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3121);
                    com.vk.newsfeed.impl.items.posting.item.modals.d.this.b(I, (androidx.compose.runtime.a) obj, this.f, this.d, this.e, this.c);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final int i, final int i2, final String str, final q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i3) {
        androidx.compose.runtime.a M = aVar.M(1172171460);
        int i4 = i3 | (M.o(i) ? 4 : 2) | (M.o(i2) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1172171460, i4, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.PostPostingCell (SimplePostingCreateBottomSheet.kt:347)");
            }
            lg90 a2 = pg90.a(i, i4 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x a3 = com.vk.core.compose.component.cell.content.f.a(a2, Cell$Left.Main.Size.Medium, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new g(29);
                M.R(x);
            }
            wiu0.b(q630Var, false, new b(str, a3, (gzs) x), Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(i2, (i4 >> 3) & 14, M), null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, M, 196608, 30), null, gzsVar, null, M, ((i4 >> 9) & 14) | ((i4 << 3) & 458752), 82);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new wzs(i, i2, str, q630Var, gzsVar, i3) { // from class: xsna.vrj0
                public final /* synthetic */ int c;
                public final /* synthetic */ int d;
                public final /* synthetic */ String e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ gzs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.newsfeed.impl.items.posting.item.modals.d.this.c(this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void d(int i, Cell$Middle.d dVar, q630 q630Var, tlo0 tlo0Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a aVar2;
        h1 b2;
        androidx.compose.runtime.a M = aVar.M(236806840);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.J(dVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.y(tlo0Var) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(236806840, i3, -1, "com.vk.newsfeed.impl.items.posting.item.modals.SimplePostingCreateBottomSheet.PostingCell (SimplePostingCreateBottomSheet.kt:307)");
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            lg90 a2 = pg90.a(i, i3 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            x a3 = com.vk.core.compose.component.cell.content.f.a(a2, size, ylu0Var.getIcon().a, null, null, M, 196664, 24);
            if (tlo0Var == null) {
                M.K(-1918134919);
                M.j();
                b2 = null;
            } else {
                M.K(-1918134918);
                b2 = Cell$Middle.c.b.b(blk.J(tlo0Var, M), 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            wiu0.b(q630Var, false, a3, Cell$Middle.a.a(dVar, b2, null, null, M, ((i3 >> 3) & 14) | 196608, 28), null, gzsVar, null, M, ((i3 >> 6) & 14) | ((i3 << 3) & 458752), 82);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        f s = aVar2.s();
        if (s != null) {
            s.d = new l48(this, i, dVar, q630Var, tlo0Var, gzsVar, i2);
        }
    }
}
