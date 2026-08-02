package com.vk.catalog.mvi.block.impl.pager;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.i;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a1q;
import xsna.a8a;
import xsna.ahn;
import xsna.ao;
import xsna.az2;
import xsna.azl;
import xsna.b2a;
import xsna.b6l;
import xsna.bap;
import xsna.bo;
import xsna.bwj;
import xsna.c5g;
import xsna.cir;
import xsna.cp10;
import xsna.cri;
import xsna.dg50;
import xsna.dq;
import xsna.dt1;
import xsna.dwj;
import xsna.e43;
import xsna.egi;
import xsna.egi0;
import xsna.epx;
import xsna.f1u;
import xsna.f2a;
import xsna.faj;
import xsna.ffv;
import xsna.fw3;
import xsna.g2a;
import xsna.gzs;
import xsna.h9x;
import xsna.izs;
import xsna.ja8;
import xsna.jn50;
import xsna.k2a;
import xsna.k9q0;
import xsna.kai;
import xsna.ksr;
import xsna.ln50;
import xsna.lsr;
import xsna.m2a;
import xsna.mc90;
import xsna.n34;
import xsna.nb90;
import xsna.nfj;
import xsna.nr2;
import xsna.oav0;
import xsna.on00;
import xsna.on50;
import xsna.pha;
import xsna.q1a;
import xsna.q630;
import xsna.qoy;
import xsna.qr;
import xsna.qri;
import xsna.r1a;
import xsna.r2a;
import xsna.r9g;
import xsna.rc90;
import xsna.rdi;
import xsna.rg50;
import xsna.rx;
import xsna.s1a;
import xsna.s200;
import xsna.s2a;
import xsna.s3q0;
import xsna.shy;
import xsna.smk;
import xsna.spj;
import xsna.srg;
import xsna.swe0;
import xsna.sy90;
import xsna.t0a;
import xsna.t1a;
import xsna.tci;
import xsna.ttk0;
import xsna.txj0;
import xsna.u1a;
import xsna.udo;
import xsna.utk0;
import xsna.uvi;
import xsna.v1a;
import xsna.w4u;
import xsna.wd90;
import xsna.wzs;
import xsna.xev;
import xsna.xlg0;
import xsna.xp2;
import xsna.yjl;
import xsna.yvj;
import xsna.yzs;
import xsna.zcl;
import xsna.zfr0;
import xsna.zqh;
import xsna.ztr;
import xsna.zzs;

/* compiled from: HorizontalPagerView.kt */
/* loaded from: classes.dex */
public final class HorizontalPagerView {

    /* compiled from: HorizontalPagerView.kt */
    public static final class BlockView extends m2a<f, d, e> {
        public final Map<Class<? extends r2a>, k2a> b;

        /* compiled from: HorizontalPagerView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$BlockView$HandlePagerSideEffects$1$1", f = "HorizontalPagerView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes16.dex */
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ c $renderContext;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$renderContext = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$renderContext, spjVar);
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
                c cVar = this.$renderContext;
                cVar.d.invoke(new d.c(cVar.a.b, cVar.b.k()));
                return s3q0.a;
            }
        }

        /* compiled from: HorizontalPagerView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$BlockView$HandlePagerSideEffects$2$1", f = "HorizontalPagerView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes16.dex */
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ int $contentPagesCount;
            final /* synthetic */ c $renderContext;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar, int i, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$renderContext = cVar;
                this.$contentPagesCount = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$renderContext, this.$contentPagesCount, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                c cVar = this.$renderContext;
                f fVar = cVar.a;
                if (!fVar.e || fVar.f || (i = this.$contentPagesCount) == 0) {
                    return s3q0.a;
                }
                int i2 = i - 2;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (cVar.b.k() >= i2) {
                    c cVar2 = this.$renderContext;
                    cVar2.d.invoke(new d.b(cVar2.a.b));
                }
                return s3q0.a;
            }
        }

        /* compiled from: HorizontalPagerView.kt */
        /* loaded from: classes16.dex */
        public static final class c {
            public final f a;
            public final mc90 b;
            public final ksr c;
            public final izs<d, s3q0> d;
            public final a8a e;

            public c(f fVar, yjl yjlVar, ksr ksrVar, izs izsVar, a8a a8aVar) {
                this.a = fVar;
                this.b = yjlVar;
                this.c = ksrVar;
                this.d = izsVar;
                this.e = a8aVar;
            }

            public final ksr a() {
                return this.c;
            }

            public final mc90 b() {
                return this.b;
            }

            public final a8a c() {
                return this.e;
            }

            public final f d() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + dq.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            }

            public final String toString() {
                return "PagerRenderContext(state=" + this.a + ", pagerState=" + this.b + ", events=" + ((Object) ("EventsFlow(value=" + this.c + ')')) + ", onAction=" + this.d + ", parentCatalogScope=" + this.e + ')';
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BlockView(Map<Class<? extends r2a>, ? extends k2a> map) {
            super(e.class);
            this.b = map;
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(final a8a a8aVar, final f fVar, final izs izsVar, final ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            a8a a8aVar2;
            int i2;
            izs izsVar2;
            ksr ksrVar2;
            q630 q630Var2;
            BlockView blockView;
            int i3;
            androidx.compose.runtime.a M = aVar.M(-1128805225);
            if ((i & 6) == 0) {
                a8aVar2 = a8aVar;
                i2 = (M.J(a8aVar2) ? 4 : 2) | i;
            } else {
                a8aVar2 = a8aVar;
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(fVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                izsVar2 = izsVar;
                i2 |= M.y(izsVar2) ? 256 : 128;
            } else {
                izsVar2 = izsVar;
            }
            if ((i & 3072) == 0) {
                ksrVar2 = ksrVar;
                i2 |= M.J(ksrVar2) ? 2048 : 1024;
            } else {
                ksrVar2 = ksrVar;
            }
            if ((i & 24576) == 0) {
                i2 |= M.J(q630Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= M.J(this) ? 131072 : 65536;
            }
            if (M.t(i2 & 1, (74899 & i2) != 74898)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1128805225, i2, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.ContentImpl (HorizontalPagerView.kt:321)");
                }
                int size = fVar.c.size();
                int i4 = (fVar.f ? 1 : 0) + size;
                if (i4 == 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    androidx.compose.runtime.f s = M.s();
                    if (s != null) {
                        s.l(new rx(this, a8aVar2, fVar, izsVar2, ksrVar2, q630Var, i, 1));
                        return;
                    }
                    return;
                }
                q630Var2 = q630Var;
                BlockView blockView2 = this;
                int i5 = ((i2 >> 3) & 14) | ((i2 >> 6) & 7168);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-439901576, i5, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.rememberHorizontalPagerState (HorizontalPagerView.kt:358)");
                }
                int i6 = fVar.d;
                int i7 = size - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int g = swe0.g(i6, 0, i7);
                boolean o = M.o(i4);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                Object obj = x;
                if (o || x == c0012a) {
                    xev xevVar = new xev(i4);
                    M.R(xevVar);
                    obj = xevVar;
                }
                yjl b2 = rc90.b(g, (gzs) obj, M, 0, 2);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean J = ((i2 & 112) == 32) | M.J(b2) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
                Object x2 = M.x();
                if (J || x2 == c0012a) {
                    i3 = size;
                    c cVar = new c(fVar, b2, ksrVar, izsVar, a8aVar);
                    M.R(cVar);
                    x2 = cVar;
                } else {
                    i3 = size;
                }
                c cVar2 = (c) x2;
                int i8 = i2 >> 9;
                blockView2.d(i3, i8 & 896, M, cVar2);
                blockView2.e(cVar2, q630Var2, M, i8 & 1008);
                blockView = blockView2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                    blockView = blockView2;
                }
            } else {
                q630Var2 = q630Var;
                blockView = this;
                M.h();
            }
            androidx.compose.runtime.f s2 = M.s();
            if (s2 != null) {
                final BlockView blockView3 = blockView;
                final q630 q630Var3 = q630Var2;
                s2.l(new wzs() { // from class: xsna.efv
                    @Override // xsna.wzs
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).intValue();
                        HorizontalPagerView.BlockView.this.b(a8aVar, fVar, izsVar, ksrVar, q630Var3, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }

        public final void d(final int i, final int i2, androidx.compose.runtime.a aVar, final c cVar) {
            int i3;
            androidx.compose.runtime.a M = aVar.M(-1476485598);
            if ((i2 & 6) == 0) {
                i3 = (M.J(cVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= M.o(i) ? 32 : 16;
            }
            if (M.t(i3 & 1, (i3 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1476485598, i3, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HandlePagerSideEffects (HorizontalPagerView.kt:369)");
                }
                Integer valueOf = Integer.valueOf(cVar.b().k());
                int i4 = i3 & 14;
                boolean z = i4 == 4;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new a(cVar, null);
                    M.R(x);
                }
                bap.g(valueOf, (wzs) x, M, 0);
                Object[] objArr = {Integer.valueOf(cVar.b().k()), Boolean.valueOf(cVar.d().e), Boolean.valueOf(cVar.d().f), Integer.valueOf(i)};
                boolean z2 = (i4 == 4) | ((i3 & 112) == 32);
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new b(cVar, i, null);
                    M.R(x2);
                }
                bap.h(objArr, (wzs) x2, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: xsna.wev
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int I = ne7.I(i2 | 1);
                        this.d(i, I, (androidx.compose.runtime.a) obj, cVar);
                        return s3q0.a;
                    }
                });
            }
        }

        public final void e(final c cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            q630 f;
            androidx.compose.runtime.a M = aVar.M(-1563922088);
            if ((i & 6) == 0) {
                i2 = (M.J(cVar) ? 4 : 2) | i;
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
                    androidx.compose.runtime.b.f(-1563922088, i2, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HorizontalPagerContent (HorizontalPagerView.kt:408)");
                }
                int size = cVar.d().c.size();
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = i.a(0);
                    M.R(x);
                }
                final rg50 rg50Var = (rg50) x;
                q630 E = ahn.E(xp2.a(q630Var, null, 3), "mvi_catalog_horizontal_pager_test_tag");
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.d(), M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, E);
                cri.h7.getClass();
                LayoutNode.a b2 = cri.a.b();
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(b2);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.d());
                k9q0.w(M, D, cri.a.f());
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
                k9q0.t(M, cri.a.a());
                k9q0.w(M, c2, cri.a.e());
                mc90 b3 = cVar.b();
                f = txj0.f(q630.a.a, 1.0f);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new udo(rg50Var, 15);
                    M.R(x2);
                }
                nb90.a(b3, egi.o(f, (izs) x2), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(2106835151, new zzs() { // from class: xsna.vev
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int intValue = ((Integer) obj2).intValue();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                        int intValue2 = ((Integer) obj4).intValue();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2106835151, intValue2, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HorizontalPagerContent.<anonymous>.<anonymous> (HorizontalPagerView.kt:425)");
                        }
                        HorizontalPagerView.BlockView.this.h(intValue, cVar, rg50Var.getIntValue(), aVar2, (intValue2 >> 3) & 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                }, M), M, 48, 24576, 16380);
                M = M;
                g(size, cVar.b().k(), M, ((i2 << 3) & 7168) | 6);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new pha(this, cVar, q630Var, i, 5));
            }
        }

        public final void f(final int i, final int i2, androidx.compose.runtime.a aVar, final c cVar) {
            int i3;
            androidx.compose.runtime.f s;
            wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
            q630 b2;
            androidx.compose.runtime.a M = aVar.M(-304209215);
            if ((i2 & 6) == 0) {
                i3 = (M.o(i) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= M.J(cVar) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= M.J(this) ? 256 : 128;
            }
            if (M.t(i3 & 1, (i3 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-304209215, i3, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HorizontalPagerContentPage (HorizontalPagerView.kt:461)");
                }
                final r2a r2aVar = (r2a) nr2.u((ttk0) cVar.d().c.get(i), M).getValue();
                int i4 = i3 & 14;
                boolean J = M.J(cVar.d()) | M.J(cVar.c()) | M.J(cVar.b()) | (i4 == 4);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (J || x == c0012a) {
                    x = new b(cVar.d(), cVar.c(), cVar.b(), i);
                    M.R(x);
                }
                b bVar = (b) x;
                boolean J2 = M.J(cVar.a()) | M.J(r2aVar.w());
                Object x2 = M.x();
                if (J2 || x2 == c0012a) {
                    final HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$map$1 horizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$map$1 = new HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$map$1(cVar.a());
                    x2 = a1q.a(new ksr<smk>() { // from class: com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        /* renamed from: com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements lsr {
                            public final /* synthetic */ lsr b;
                            public final /* synthetic */ r2a c;

                            @b6l(c = "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$filter$1$2", f = "HorizontalPagerView.kt", l = {50}, m = "emit")
                            /* renamed from: com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(spj spjVar) {
                                    super(spjVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(lsr lsrVar, r2a r2aVar) {
                                this.b = lsrVar;
                                this.c = r2aVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // xsna.lsr
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, spj spjVar) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                if (spjVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) spjVar;
                                    int i2 = anonymousClass1.label;
                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            kotlin.a.a(obj2);
                                            if (epx.f(((smk) obj).w(), this.c.w())) {
                                                anonymousClass1.L$0 = null;
                                                anonymousClass1.L$1 = null;
                                                anonymousClass1.L$2 = null;
                                                anonymousClass1.L$3 = null;
                                                anonymousClass1.I$0 = 0;
                                                anonymousClass1.label = 1;
                                                if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.a.a(obj2);
                                        }
                                        return s3q0.a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(spjVar);
                                Object obj22 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return s3q0.a;
                            }
                        }

                        @Override // xsna.ksr
                        public final Object collect(lsr<? super smk> lsrVar, spj spjVar) {
                            Object collect = HorizontalPagerView$BlockView$HorizontalPagerContentPage$lambda$18$$inlined$map$1.this.collect(new AnonymousClass2(lsrVar, r2aVar), spjVar);
                            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                        }
                    });
                    M.R(x2);
                }
                ksr b3 = ((a1q) x2).b();
                k2a k2aVar = this.b.get(r2aVar.getClass());
                if (k2aVar == null) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("HorizontalPagerView has no registered view for " + r2aVar.getClass().getCanonicalName()));
                }
                if (k2aVar == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s != null) {
                        wzsVar = new wzs() { // from class: xsna.afv
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).intValue();
                                int I = ne7.I(i2 | 1);
                                this.f(i, I, (androidx.compose.runtime.a) obj, cVar);
                                return s3q0.a;
                            }
                        };
                        s.l(wzsVar);
                    }
                    return;
                }
                boolean z = (i3 & 112) == 32;
                Object x3 = M.x();
                if (z || x3 == c0012a) {
                    x3 = new nfj(cVar, 26);
                    M.R(x3);
                }
                izs izsVar = (izs) x3;
                boolean z2 = i4 == 4;
                Object x4 = M.x();
                if (z2 || x4 == c0012a) {
                    x4 = new izs() { // from class: xsna.bfv
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            tgi0 tgi0Var = (tgi0) obj;
                            bgi0.a(tgi0Var, i);
                            qgi0.r(tgi0Var, "mvi_catalog_horizontal_pager_item_test_tag");
                            return s3q0.a;
                        }
                    };
                    M.R(x4);
                }
                b2 = egi0.b(q630.a.a, false, (izs) x4);
                k2aVar.a(bVar, r2aVar, izsVar, b3, b2, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            s = M.s();
            if (s != null) {
                wzsVar = new wzs() { // from class: xsna.cfv
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int I = ne7.I(i2 | 1);
                        this.f(i, I, (androidx.compose.runtime.a) obj, cVar);
                        return s3q0.a;
                    }
                };
                s.l(wzsVar);
            }
        }

        public final void g(final int i, final int i2, androidx.compose.runtime.a aVar, final int i3) {
            int i4;
            androidx.compose.runtime.f s;
            wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
            androidx.compose.runtime.a M = aVar.M(-1713551600);
            int i5 = i3 & 6;
            r9g r9gVar = r9g.a;
            if (i5 == 0) {
                i4 = (M.J(r9gVar) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= M.o(i) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i4 |= M.o(i2) ? 256 : 128;
            }
            if (M.t(i4 & 1, (i4 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1713551600, i4, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HorizontalPagerDots (HorizontalPagerView.kt:534)");
                }
                if (i <= 1) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s != null) {
                        wzsVar = new wzs() { // from class: xsna.uev
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int I = ne7.I(i3 | 1);
                                HorizontalPagerView.BlockView.this.g(i, i2, (androidx.compose.runtime.a) obj, I);
                                return s3q0.a;
                            }
                        };
                        s.l(wzsVar);
                    }
                    return;
                }
                int g = swe0.g(i2, 0, i - 1);
                dt1.a.getClass();
                oav0.b(wd90.a.a, i, g, s200.H(r9gVar.b(q630.a.a, dt1.a.b()), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, null, null, 0, M, i4 & 112, PsExtractor.VIDEO_STREAM_MASK);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            s = M.s();
            if (s != null) {
                wzsVar = new wzs() { // from class: xsna.yev
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i3 | 1);
                        HorizontalPagerView.BlockView.this.g(i, i2, (androidx.compose.runtime.a) obj, I);
                        return s3q0.a;
                    }
                };
                s.l(wzsVar);
            }
        }

        public final void h(final int i, final c cVar, final int i2, androidx.compose.runtime.a aVar, final int i3) {
            int i4;
            androidx.compose.runtime.a M = aVar.M(553806695);
            if ((i3 & 6) == 0) {
                i4 = (M.o(i) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= M.J(cVar) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i4 |= M.o(i2) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i4 |= M.J(this) ? 2048 : 1024;
            }
            if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(553806695, i4, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HorizontalPagerPage (HorizontalPagerView.kt:444)");
                }
                if (i < cVar.d().c.size()) {
                    M.K(1486164442);
                    f(i, (i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i4 >> 3) & 896), M, cVar);
                    M.j();
                } else {
                    M.K(1486328184);
                    i(i2, (i4 >> 6) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, M);
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: xsna.zev
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        HorizontalPagerView.BlockView.this.h(i, cVar, i2, (androidx.compose.runtime.a) obj, ne7.I(i3 | 1));
                        return s3q0.a;
                    }
                });
            }
        }

        public final void i(final int i, final int i2, androidx.compose.runtime.a aVar) {
            int i3;
            q630 f;
            float f2;
            androidx.compose.runtime.a M = aVar.M(-1673519961);
            if ((i2 & 6) == 0) {
                i3 = (M.o(i) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if (M.t(i3 & 1, (i3 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1673519961, i3, -1, "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView.BlockView.HorizontalPagerSpinnerPage (HorizontalPagerView.kt:513)");
                }
                f = txj0.f(q630.a.a, 1.0f);
                if (i > 0) {
                    M.K(147494059);
                    f2 = ((azl) M.r(uvi.c())).j1(i);
                    M.j();
                } else {
                    M.K(147609565);
                    M.j();
                    f2 = 120;
                }
                q630 h = txj0.h(f, f2);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.a(), false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c2 = qri.c(M, h);
                cri.h7.getClass();
                LayoutNode.a b2 = cri.a.b();
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(b2);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.d());
                k9q0.w(M, D, cri.a.f());
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
                k9q0.t(M, cri.a.a());
                k9q0.w(M, c2, cri.a.e());
                zfr0.e(null, 0L, null, M, 0, 7);
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: xsna.dfv
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int I = ne7.I(i2 | 1);
                        HorizontalPagerView.BlockView.this.i(i, I, (androidx.compose.runtime.a) obj);
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    public static final class State implements CatalogBlockState, Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final List<CatalogBlockData> d;
        public final String e;
        public final int f;
        public final boolean g;

        /* compiled from: HorizontalPagerView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                String str = ((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b;
                CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(State.class, parcel, arrayList, i, 1);
                }
                return new State(str, valueOf, arrayList, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            throw null;
        }

        public /* synthetic */ State(String str, CatalogBlockVariant catalogBlockVariant, List list, String str2, int i, boolean z, int i2, zcl zclVar) {
            this(str, catalogBlockVariant, list, str2, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static State a(State state, ArrayList arrayList, String str, int i, boolean z, int i2) {
            String str2 = state.b;
            CatalogBlockVariant catalogBlockVariant = state.c;
            List list = arrayList;
            if ((i2 & 4) != 0) {
                list = state.d;
            }
            List list2 = list;
            if ((i2 & 8) != 0) {
                str = state.e;
            }
            String str3 = str;
            if ((i2 & 16) != 0) {
                i = state.f;
            }
            int i3 = i;
            if ((i2 & 32) != 0) {
                z = state.g;
            }
            state.getClass();
            return new State(str2, catalogBlockVariant, list2, str3, i3, z, null);
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final CatalogBlockVariant M7() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d) && epx.f(this.e, state.e) && this.f == state.f && this.g == state.g;
        }

        public final int hashCode() {
            int a2 = fw3.a(io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31), 31, this.d);
            String str = this.e;
            return Boolean.hashCode(this.g) + shy.a(this.f, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", pagerStateList=");
            sb.append(this.d);
            sb.append(", nextFrom=");
            sb.append(this.e);
            sb.append(", currentPage=");
            sb.append(this.f);
            sb.append(", isNextContentLoading=");
            return q0.a(sb, this.g, ')');
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(BlockId.Simple.a(this.b), i);
            parcel.writeString(this.c.name());
            Iterator a2 = ao.a(parcel, this.d);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, List list, String str2, int i, boolean z, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = list;
            this.e = str2;
            this.f = i;
            this.g = z;
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements b2a {
        public final c a;
        public final CatalogBlockData b;
        public final LinkedHashSet c = new LinkedHashSet();

        /* compiled from: HorizontalPagerView.kt */
        /* renamed from: com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$a$a, reason: collision with other inner class name */
        public static final class C0451a implements on50 {
            public final BlockId a;
            public final on50 b;

            public C0451a(BlockId blockId, on50 on50Var) {
                this.a = blockId;
                this.b = on50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0451a)) {
                    return false;
                }
                C0451a c0451a = (C0451a) obj;
                return epx.f(this.a, c0451a.a) && epx.f(this.b, c0451a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "PagerMviTaskId(blockId=" + this.a + ", blockTask=" + this.b + ')';
            }
        }

        public a(c cVar, CatalogBlockData catalogBlockData) {
            this.a = cVar;
            this.b = catalogBlockData;
        }

        @Override // xsna.b2a
        public final void a(t0a t0aVar) {
            this.a.v(t0aVar);
        }

        @Override // xsna.b2a
        public final void b() {
            this.a.r();
        }

        @Override // xsna.b2a
        public final void c() {
            this.a.q();
        }

        @Override // xsna.b2a
        public final void e(on50 on50Var, ln50<on50> ln50Var, izs<? super dwj, ? extends bwj> izsVar) {
            this.a.e(new C0451a(getCurrentState().w(), on50Var), ln50Var, new az2(15, (Object) this, (izs) izsVar));
        }

        @Override // xsna.b2a
        public final void f(List<String> list) {
            this.a.s(list);
        }

        @Override // xsna.b2a
        public final void g(String str, izs izsVar, v1a v1aVar) {
            this.a.c(str, izsVar, v1aVar);
        }

        @Override // xsna.b2a
        public final CatalogBlockState getCurrentState() {
            return (CatalogBlockState) this.b.b.getValue();
        }

        @Override // xsna.b2a
        public final void h(com.vk.libvideo.b bVar) {
            CatalogBlockState catalogBlockState = (CatalogBlockState) bVar.invoke(getCurrentState());
            if (catalogBlockState != null) {
                utk0 utk0Var = this.b.b;
                utk0Var.getClass();
                utk0Var.i(null, catalogBlockState);
            }
        }

        @Override // xsna.b2a
        public final void i(BlockId.Simple simple, List list) {
            rdi.E();
        }

        @Override // xsna.b2a
        public final void j() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((jn50) it.next()).a();
            }
        }

        @Override // xsna.b2a
        public final void k(String str) {
            this.a.a(str);
        }

        @Override // xsna.b2a
        public final void l(r1a r1aVar) {
            boolean z = r1aVar instanceof smk;
            c cVar = this.a;
            if (z) {
                r1aVar = new e(((State) ((b2a) cVar.b.b).getCurrentState()).b, (smk) r1aVar);
            }
            cVar.t(r1aVar);
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    /* loaded from: classes16.dex */
    public static final class b implements a8a {
        public final f a;
        public final a8a b;
        public final mc90 c;
        public final int d;

        /* compiled from: HorizontalPagerView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.pager.HorizontalPagerView$HorizontalPagerCatalogLazyItemScope$blockLayoutInfoSnapshotFlow$2", f = "HorizontalPagerView.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements yzs<a8a.a, a8a.a, spj<? super a8a.a>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            @Override // xsna.yzs
            public final Object invoke(a8a.a aVar, a8a.a aVar2, spj<? super a8a.a> spjVar) {
                a aVar3 = new a(3, spjVar);
                aVar3.L$0 = aVar;
                aVar3.L$1 = aVar2;
                return aVar3.invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                a8a.a aVar = (a8a.a) this.L$0;
                a8a.a aVar2 = (a8a.a) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                float f = aVar.a * aVar2.a;
                long d = h9x.d(aVar2.b, aVar.b);
                long d2 = h9x.d(aVar2.c, aVar.c);
                Integer num = aVar2.d;
                Integer num2 = aVar.e;
                h9x h9xVar = aVar2.f;
                long j = h9xVar != null ? h9xVar.a : 0L;
                h9x h9xVar2 = aVar.f;
                return new a8a.a(f, d, d2, num, num2, new h9x(h9x.d(j, h9xVar2 != null ? h9xVar2.a : 0L)), aVar.g || aVar2.g);
            }
        }

        public b(f fVar, a8a a8aVar, mc90 mc90Var, int i) {
            this.a = fVar;
            this.b = a8aVar;
            this.c = mc90Var;
            this.d = i;
        }

        @Override // xsna.a8a
        public final q630 a(q630 q630Var) {
            return txj0.f(q630Var, 1.0f);
        }

        @Override // xsna.a8a
        public final q630 b(q630 q630Var) {
            return txj0.c(q630Var, 1.0f);
        }

        @Override // xsna.a8a
        public final q630 c(q630 q630Var, BlockId.Simple simple, float f) {
            return b(q630Var);
        }

        @Override // xsna.a8a
        public final ksr<a8a.a> f(r2a r2aVar) {
            return new ztr(nr2.M(new w4u(this, 3)), this.b.f(this.a), new a(3, null));
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    /* loaded from: classes16.dex */
    public static final class c extends u1a<State, d> {
        public final Map<Class<? extends CatalogBlockState>, t1a<? super CatalogBlockState>> c;

        public c(LinkedHashMap linkedHashMap, b2a b2aVar) {
            super(b2aVar);
            this.c = linkedHashMap;
            for (CatalogBlockData catalogBlockData : ((State) ((b2a) this.b.b).getCurrentState()).d) {
                catalogBlockData.c = w(catalogBlockData);
            }
        }

        @Override // xsna.u1a, xsna.uic
        public final void clear() {
            super.clear();
            Iterator<T> it = ((State) ((b2a) this.b.b).getCurrentState()).d.iterator();
            while (it.hasNext()) {
                ((CatalogBlockData) it.next()).clear();
            }
        }

        @Override // xsna.u1a
        public final void g(d dVar) {
            String str;
            final d dVar2 = dVar;
            b2a b2aVar = (b2a) this.b.b;
            Object obj = null;
            if (dVar2 instanceof d.b) {
                if (((State) b2aVar.getCurrentState()).g || (str = ((State) b2aVar.getCurrentState()).e) == null) {
                    return;
                }
                c(str, new zqh(this, 19), new v1a(new com.vk.catalog.mvi.block.impl.pager.f(this, null), null));
                return;
            }
            if (dVar2 instanceof d.c) {
                m(new izs() { // from class: com.vk.catalog.mvi.block.impl.pager.e
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        HorizontalPagerView.State state = (HorizontalPagerView.State) obj2;
                        int i = ((HorizontalPagerView.d.c) HorizontalPagerView.d.this).c;
                        if (i < 0) {
                            i = 0;
                        }
                        return HorizontalPagerView.State.a(state, null, null, i, false, 47);
                    }
                });
                return;
            }
            if (!(dVar2 instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            q1a q1aVar = ((d.a) dVar2).c;
            Iterator<T> it = ((State) b2aVar.getCurrentState()).d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((CatalogBlockState) ((CatalogBlockData) next).b.getValue()).w(), q1aVar.w())) {
                    obj = next;
                    break;
                }
            }
            CatalogBlockData catalogBlockData = (CatalogBlockData) obj;
            if (catalogBlockData == null) {
                return;
            }
            if (catalogBlockData.c == null) {
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("HorizontalPagerInlineActor block data actor is empty for " + catalogBlockData.b.getValue()));
                catalogBlockData.c = w(catalogBlockData);
            }
            s1a<? super CatalogBlockState> s1aVar = catalogBlockData.c;
            if (s1aVar != null) {
                s1aVar.j(q1aVar);
            }
        }

        @Override // xsna.u1a
        public final State h(State state, State state2) {
            State state3 = state;
            State state4 = state2;
            List<CatalogBlockData> list = state4.d;
            List<CatalogBlockData> list2 = state3.d;
            int e = on00.e(c5g.u(list2, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj : list2) {
                linkedHashMap.put(((CatalogBlockData) obj).g().w(), obj);
            }
            List<CatalogBlockData> list3 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            for (CatalogBlockData catalogBlockData : list3) {
                CatalogBlockData catalogBlockData2 = (CatalogBlockData) linkedHashMap.get(catalogBlockData.g().w());
                if (catalogBlockData2 != null) {
                    s1a<? super CatalogBlockState> s1aVar = catalogBlockData2.c;
                    if (s1aVar != null) {
                        s1aVar.M(catalogBlockData.g());
                    }
                    catalogBlockData = catalogBlockData2;
                } else {
                    catalogBlockData.c = w(catalogBlockData);
                }
                arrayList.add(catalogBlockData);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                CatalogBlockData catalogBlockData3 = (CatalogBlockData) obj2;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((CatalogBlockData) it.next()) == catalogBlockData3) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((CatalogBlockData) it2.next()).clear();
            }
            int i = state3.f;
            int h = e43.h(list);
            if (h < 0) {
                h = 0;
            }
            return State.a(state4, arrayList, null, i > h ? h : i, false, 43);
        }

        public final s1a<? super CatalogBlockState> w(CatalogBlockData catalogBlockData) {
            t1a<? super CatalogBlockState> t1aVar = this.c.get(((CatalogBlockState) catalogBlockData.b.getValue()).getClass());
            if (t1aVar != null) {
                return t1aVar.a(new a(this, catalogBlockData));
            }
            return null;
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    /* loaded from: classes16.dex */
    public interface d extends q1a {

        /* compiled from: HorizontalPagerView.kt */
        public static final class a implements d {
            public final String b;
            public final q1a c;

            public a(String str, q1a q1aVar) {
                this.b = str;
                this.c = q1aVar;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: HorizontalPagerView.kt */
        public static final class b implements d {
            public final String b;

            public b(String str) {
                this.b = str;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: HorizontalPagerView.kt */
        public static final class c implements d {
            public final String b;
            public final int c;

            public c(String str, int i) {
                this.b = str;
                this.c = i;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    public static final class e implements smk {
        public final String a;
        public final smk b;

        public e(String str, smk smkVar) {
            this.a = str;
            this.b = smkVar;
        }

        @Override // xsna.smk
        public final BlockId w() {
            return BlockId.Simple.a(this.a);
        }
    }

    /* compiled from: HorizontalPagerView.kt */
    public static final class f implements r2a {
        public final String b;
        public final ArrayList c;
        public final int d;
        public final boolean e;
        public final boolean f;

        public f() {
            throw null;
        }

        public f(String str, ArrayList arrayList, int i, boolean z, boolean z2) {
            this.b = str;
            this.c = arrayList;
            this.d = i;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return BlockId.Simple.b(this.b, fVar.b) && epx.f(this.c, fVar.c) && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(shy.a(this.d, qr.a(this.c, BlockId.Simple.d(this.b) * 31, 31), 31), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", pagerViewStateList=");
            sb.append(this.c);
            sb.append(", currentPage=");
            sb.append(this.d);
            sb.append(", isNearEndTriggerEnabled=");
            sb.append(this.e);
            sb.append(", isSpinnerShowing=");
            return q0.a(sb, this.f, ')');
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }
    }

    public static void a(f1u f1uVar, cir cirVar) {
        dg50 dg50Var = new dg50();
        cirVar.invoke(dg50Var);
        final LinkedHashMap linkedHashMap = dg50Var.b;
        Set<CatalogBlockVariant> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (CatalogBlockVariant catalogBlockVariant : keySet) {
            if (catalogBlockVariant != null) {
                arrayList.add(catalogBlockVariant);
            }
        }
        g2a g2aVar = new g2a(new yzs() { // from class: com.vk.catalog.mvi.block.impl.pager.b
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogBlockVariant catalogBlockVariant2 = (CatalogBlockVariant) obj3;
                CatalogBlockVariant.Companion.getClass();
                CatalogBlockVariant a2 = CatalogBlockVariant.a.a(catalogBlockDto);
                a2.getClass();
                if (a2 == CatalogBlockVariant.UnknownBlock) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("HorizontalPagerView has no registered variant for " + catalogBlockDto.l0() + ", " + catalogBlockDto.n1().f() + ", " + catalogBlockDto.n1().i()));
                }
                f2a f2aVar = (f2a) linkedHashMap.get(a2);
                if (f2aVar == null) {
                    com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("HorizontalPagerView has no registered stateMapper for " + a2));
                }
                List a3 = f2aVar != null ? f2aVar.a(catalogExtraResponseObjectDto, catalogBlockDto, catalogBlockVariant2) : null;
                if (a3 == null) {
                    a3 = EmptyList.b;
                }
                String id = catalogBlockDto.getId();
                List list = a3;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new CatalogBlockData((CatalogBlockState) it.next()));
                }
                return new HorizontalPagerView.State(id, catalogBlockVariant2, arrayList2, catalogBlockDto.V1(), 0, false, 48, null);
            }
        });
        faj fajVar = new faj(dg50Var, 1);
        final LinkedHashMap linkedHashMap2 = dg50Var.d;
        s2a<? super CatalogBlockState, ?> s2aVar = new s2a() { // from class: com.vk.catalog.mvi.block.impl.pager.a
            /* JADX WARN: Removed duplicated region for block: B:12:0x006e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0011 A[SYNTHETIC] */
            @Override // xsna.s2a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final r2a a(CatalogBlockState catalogBlockState) {
                ttk0<r2a> Z;
                HorizontalPagerView.State state = (HorizontalPagerView.State) catalogBlockState;
                String str = state.b;
                List<CatalogBlockData> list = state.d;
                ArrayList arrayList2 = new ArrayList();
                for (CatalogBlockData catalogBlockData : list) {
                    if (catalogBlockData.Z() == null) {
                        Class<?> cls = ((utk0) catalogBlockData.e()).getValue().getClass();
                        s2a s2aVar2 = (s2a) linkedHashMap2.get(cls);
                        if (s2aVar2 == null) {
                            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException(xlg0.a(cls, new StringBuilder("HorizontalPagerView has no registered viewStateMapper for "))));
                        }
                        if (s2aVar2 == null) {
                            Z = null;
                            if (Z == null) {
                                arrayList2.add(Z);
                            }
                        } else {
                            catalogBlockData.a0(tci.s((utk0) catalogBlockData.e(), new srg(s2aVar2, 21)));
                        }
                    }
                    Z = catalogBlockData.Z();
                    if (Z == null) {
                    }
                }
                return new HorizontalPagerView.f(str, arrayList2, state.f, state.e != null, state.g);
            }
        };
        BlockView blockView = new BlockView(dg50Var.e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f1uVar.a((CatalogBlockVariant) it.next(), g2aVar);
        }
        f1uVar.c(State.class, new ffv(fajVar));
        f1uVar.h(State.class, s2aVar);
        f1uVar.g(f.class, blockView);
    }
}
