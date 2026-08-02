package com.vk.ecomm.product_list.presentation;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.product_list.presentation.q;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a97;
import xsna.ad0;
import xsna.ahh0;
import xsna.ahn;
import xsna.alb0;
import xsna.b6l;
import xsna.bap;
import xsna.bqd0;
import xsna.cr7;
import xsna.cri;
import xsna.do7;
import xsna.dsy;
import xsna.dt1;
import xsna.dz5;
import xsna.efu;
import xsna.f870;
import xsna.fdc;
import xsna.g4o;
import xsna.gsy;
import xsna.gzs;
import xsna.h9c;
import xsna.hr80;
import xsna.iyl;
import xsna.izg0;
import xsna.izi0;
import xsna.izs;
import xsna.jv90;
import xsna.k9q0;
import xsna.kai;
import xsna.kq01;
import xsna.kqu0;
import xsna.ldv0;
import xsna.lg90;
import xsna.lsr;
import xsna.m4s;
import xsna.muv0;
import xsna.n34;
import xsna.nr2;
import xsna.nxu;
import xsna.oe7;
import xsna.pg90;
import xsna.q010;
import xsna.q130;
import xsna.q630;
import xsna.qol;
import xsna.qri;
import xsna.r37;
import xsna.re10;
import xsna.re7;
import xsna.rrv0;
import xsna.rte0;
import xsna.s3q0;
import xsna.se7;
import xsna.sm0;
import xsna.sol;
import xsna.spj;
import xsna.sy90;
import xsna.txj0;
import xsna.u890;
import xsna.u8p0;
import xsna.upd0;
import xsna.uqy;
import xsna.vl20;
import xsna.vog0;
import xsna.wh50;
import xsna.wra0;
import xsna.wzs;
import xsna.x2d;
import xsna.ylu0;
import xsna.yvj;
import xsna.yzs;
import xsna.z37;
import xsna.z42;
import xsna.zfr0;
import xsna.zra0;

/* compiled from: ProductListMviComposeComponent.kt */
/* loaded from: classes18.dex */
public final class g {

    /* compiled from: ProductListMviComposeComponent.kt */
    @b6l(c = "com.vk.ecomm.product_list.presentation.ProductListMviComposeComponentKt$ProductListMviComposeComponent$2$1", f = "ProductListMviComposeComponent.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements yzs<z37<e>, j, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<j, s3q0> $onEvent;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super j, s3q0> izsVar, spj<? super a> spjVar) {
            super(3, spjVar);
            this.$onEvent = izsVar;
        }

        @Override // xsna.yzs
        public final Object invoke(z37<e> z37Var, j jVar, spj<? super s3q0> spjVar) {
            a aVar = new a(this.$onEvent, spjVar);
            aVar.L$0 = jVar;
            return aVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            j jVar = (j) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$onEvent.invoke(jVar);
            return s3q0.a;
        }
    }

    /* compiled from: ProductListMviComposeComponent.kt */
    @b6l(c = "com.vk.ecomm.product_list.presentation.ProductListMviComposeComponentKt$ProductListViewTracker$1$1", f = "ProductListMviComposeComponent.kt", l = {258}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ dsy $gridState;
        final /* synthetic */ izs<String, s3q0> $onTrackView;
        final /* synthetic */ wh50<Set<String>> $previousKeys;
        int label;

        /* compiled from: ProductListMviComposeComponent.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ wh50<Set<String>> b;
            public final /* synthetic */ izs<String, s3q0> c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(wh50<Set<String>> wh50Var, izs<? super String, s3q0> izsVar) {
                this.b = wh50Var;
                this.c = izsVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                Set<String> set = (Set) obj;
                wh50<Set<String>> wh50Var = this.b;
                Iterator<T> it = izi0.g(set, wh50Var.getValue()).iterator();
                while (it.hasNext()) {
                    this.c.invoke((String) it.next());
                }
                wh50Var.setValue(set);
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(dsy dsyVar, wh50<Set<String>> wh50Var, izs<? super String, s3q0> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$gridState = dsyVar;
            this.$previousKeys = wh50Var;
            this.$onTrackView = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$gridState, this.$previousKeys, this.$onTrackView, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new q010(this.$gridState, 21));
                a aVar = new a(this.$previousKeys, this.$onTrackView);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public static final void a(q.b bVar, izs<? super e, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1555685618);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1555685618, i3, -1, "com.vk.ecomm.product_list.presentation.ProductListDefaultErrorView (ProductListMviComposeComponent.kt:198)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            bVar.getClass();
            lg90 a2 = pg90.a(R.drawable.vk_icon_error_triangle_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            u8p0 s = ad0.s(a2, 0L, null, new oe7(j, 5, porterDuffColorFilter), null, null, null, M, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            vl20 a3 = zra0.a.a(null, null, kq01.g(bVar.c, M), null, M, 196608, 27);
            String g = kq01.g(bVar.d, M);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nxu(izsVar, 3);
                M.R(x);
            }
            ldv0.d(d, s, a3, wra0.b.a(wra0.a.C3954a.a(g, (gzs) x, null, ButtonStyle.Secondary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, 27648, 12582912, 131044), null, null, M, 14), null, null, false, M, 6, 112);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new g4o(bVar, izsVar, i, 2);
        }
    }

    public static final void b(ArrayList arrayList, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1448961593);
        if ((i & 6) == 0) {
            i2 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1448961593, i2, -1, "com.vk.ecomm.product_list.presentation.ProductListGrid (ProductListMviComposeComponent.kt:143)");
            }
            dsy a2 = gsy.a(0, 3, M);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new re10(izsVar, 1);
                M.R(x);
            }
            g(a2, (izs) x, M, 0);
            q630 t = n34.t(ahn.E(txj0.d(q630.a.a, 1.0f), "product_list_grid"), dz5.I(0, 1, M, false), null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(t, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            int i5 = i2;
            efu.b bVar = new efu.b(2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            float f = kqu0.t;
            a.j g = androidx.compose.foundation.layout.a.g(f);
            float f2 = kqu0.u;
            u890 u890Var = new u890(f2, kqu0.r, f2, f);
            boolean z2 = ((i5 & 14) == 4) | (i4 == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new com.vk.libvideo.design.view.video.a(25, arrayList, izsVar);
                M.R(x2);
            }
            i3 = 3;
            uqy.b(bVar, m, a2, u890Var, g, null, null, false, null, (izs) x2, M, 0, 0, 976);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            i3 = 3;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9c(arrayList, izsVar, i, i3);
        }
    }

    public static final void c(bqd0 bqd0Var, izs<? super j, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1149345668);
        int i2 = (M.J(bqd0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1149345668, i2, -1, "com.vk.ecomm.product_list.presentation.ProductListMviComposeComponent (ProductListMviComposeComponent.kt:56)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new q130(bqd0Var, 19);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new a(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(-1392593990, new jv90(bqd0Var, 2), M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new do7(bqd0Var, izsVar, i, 7);
        }
    }

    public static final void d(q.d dVar, izs<? super e, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1084940434);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1084940434, i3, -1, "com.vk.ecomm.product_list.presentation.ProductListNetworkErrorView (ProductListMviComposeComponent.kt:225)");
            }
            q630 d = txj0.d(q630.a.a, 1.0f);
            dVar.getClass();
            u8p0 s = ad0.s(pg90.a(R.drawable.vk_icon_illustration_antenna_120, 0, M), 0L, null, null, null, null, null, M, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            vl20 a2 = zra0.a.a(kq01.g(dVar.c, M), null, kq01.g(dVar.d, M), null, M, 196608, 26);
            String g = kq01.g(dVar.e, M);
            boolean z = (i3 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new a97(izsVar, 10);
                M.R(x);
            }
            ldv0.d(d, s, a2, wra0.b.a(wra0.a.C3954a.a(g, (gzs) x, null, ButtonStyle.Secondary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, M, 27648, 12582912, 131044), null, null, M, 14), null, null, false, M, 6, 112);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new qol(dVar, izsVar, i, 3);
        }
    }

    public static final void e(q qVar, izs<? super e, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-707132518);
        if ((i & 6) == 0) {
            i2 = (M.J(qVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-707132518, i2, -1, "com.vk.ecomm.product_list.presentation.ProductListScreen (ProductListMviComposeComponent.kt:77)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 12;
            q630 d = rte0.d(txj0.d(aVar2, 1.0f), vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            q630 t = n34.t(aVar2, dz5.I(0, 1, M, false), null);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new sm0(6);
                M.R(x);
            }
            f(qVar, ahh0.b(t, m4s.C((izs) x, M, 6), Orientation.Vertical), izsVar, M, (i2 & 14) | ((i2 << 3) & 896));
            if (qVar instanceof q.a) {
                M.K(-1741620224);
                b(((q.a) qVar).c, izsVar, M, i2 & 112);
                M.j();
            } else if (qVar instanceof q.c) {
                M.K(-1741393986);
                zfr0.f(SpinnerState.Loading, txj0.d(aVar2, 1.0f), null, 0L, SpinnerSize.Size56, null, M, 24630, 44);
                M.j();
            } else if (qVar instanceof q.d) {
                M.K(-471807587);
                d((q.d) qVar, izsVar, M, i2 & 112);
                M.j();
            } else {
                if (!(qVar instanceof q.b)) {
                    throw alb0.c(-471824526, M);
                }
                M.K(-471802371);
                a((q.b) qVar, izsVar, M, i2 & 112);
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x2d(qVar, izsVar, i, 2);
        }
    }

    public static final void f(q qVar, q630 q630Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(462227133);
        if ((i & 6) == 0) {
            i2 = (M.J(qVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(462227133, i2, -1, "com.vk.ecomm.product_list.presentation.ProductListTopBar (ProductListMviComposeComponent.kt:126)");
            }
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(kq01.g(qVar.i().a, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new iyl(izsVar, 4);
                M.R(x);
            }
            muv0.h(a2, q630Var2, null, null, null, TopBar$Before.d.a.a(null, (gzs) x, null, null, M, 24576, 13), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, i2 & 112, 0, 8156);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sol(i, 2, qVar, q630Var, izsVar);
        }
    }

    public static final void g(dsy dsyVar, izs<? super String, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2114305869);
        int i2 = (M.J(dsyVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2114305869, i2, -1, "com.vk.ecomm.product_list.presentation.ProductListViewTracker (ProductListMviComposeComponent.kt:252)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(EmptySet.b);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new b(dsyVar, wh50Var, izsVar, null);
                M.R(x2);
            }
            bap.g(dsyVar, (wzs) x2, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fdc(dsyVar, izsVar, i, 8);
        }
    }

    public static final void h(upd0 upd0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-819673260);
        int i2 = i | (M.J(upd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-819673260, i2, -1, "com.vk.ecomm.product_list.presentation.ProductTile (ProductListMviComposeComponent.kt:181)");
            }
            MarketProductTileConfig marketProductTileConfig = upd0Var.b;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new h(izsVar, upd0Var);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new i(izsVar, upd0Var);
                M.R(x2);
            }
            izs izsVar3 = (izs) x2;
            q630.a aVar2 = q630.a.a;
            com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, aVar2, null, izsVar2, izsVar3, null, M, 48, 100);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cr7(i, 11, upd0Var, izsVar, q630Var2);
        }
    }
}
