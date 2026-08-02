package com.vk.catalog.mvi.block.impl.slider;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.runtime.i;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.ui.entity.CatalogBlockData;
import com.vk.catalog.mvi.section.ui.utils.ParcelableLazyListState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.flow.binding.g;
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
import xsna.b2a;
import xsna.b6l;
import xsna.bgi0;
import xsna.bo;
import xsna.bwj;
import xsna.c5g;
import xsna.dg50;
import xsna.dwj;
import xsna.egi;
import xsna.egi0;
import xsna.epx;
import xsna.ezc0;
import xsna.f1u;
import xsna.f2a;
import xsna.fw3;
import xsna.g2a;
import xsna.gzs;
import xsna.h9x;
import xsna.hb40;
import xsna.izs;
import xsna.j1k0;
import xsna.jig0;
import xsna.jn50;
import xsna.k2a;
import xsna.ksr;
import xsna.ksy;
import xsna.l1k0;
import xsna.ln50;
import xsna.lqy;
import xsna.lsr;
import xsna.m1k0;
import xsna.m2a;
import xsna.nr2;
import xsna.o440;
import xsna.oji0;
import xsna.on50;
import xsna.p5;
import xsna.pb00;
import xsna.q1a;
import xsna.q630;
import xsna.qbc0;
import xsna.qgi0;
import xsna.qoy;
import xsna.qr;
import xsna.r1a;
import xsna.r2a;
import xsna.rdi;
import xsna.rg50;
import xsna.s101;
import xsna.s1a;
import xsna.s200;
import xsna.s2a;
import xsna.s3q0;
import xsna.smk;
import xsna.spj;
import xsna.t0a;
import xsna.t1a;
import xsna.tci;
import xsna.tgi0;
import xsna.ttk0;
import xsna.tz50;
import xsna.u1a;
import xsna.u890;
import xsna.utk0;
import xsna.v1a;
import xsna.xlg0;
import xsna.xp2;
import xsna.xvy;
import xsna.yzs;
import xsna.zcl;
import xsna.ztr;
import xsna.zzs;

/* compiled from: SliderView.kt */
/* loaded from: classes.dex */
public final class SliderView {

    /* compiled from: SliderView.kt */
    public static final class BlockView extends m2a<f, b, e> {
        public final Map<Class<? extends r2a>, k2a> b;

        /* compiled from: SliderView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements gzs<Object> {
            public final /* synthetic */ r2a b;

            public a(r2a r2aVar) {
                this.b = r2aVar;
            }

            @Override // xsna.gzs
            public final Object invoke() {
                return "SliderView has no registered view for " + this.b.getClass().getCanonicalName();
            }
        }

        /* compiled from: SliderView.kt */
        /* loaded from: classes16.dex */
        public static final class b implements izs<q1a, s3q0> {
            public final /* synthetic */ izs<b, s3q0> b;
            public final /* synthetic */ f c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(izs<? super b, s3q0> izsVar, f fVar) {
                this.b = izsVar;
                this.c = fVar;
            }

            @Override // xsna.izs
            public final s3q0 invoke(q1a q1aVar) {
                this.b.invoke(new b.a(this.c.b, q1aVar));
                return s3q0.a;
            }
        }

        /* compiled from: SliderView.kt */
        /* loaded from: classes16.dex */
        public static final class c implements izs<tgi0, s3q0> {
            public final /* synthetic */ int b;

            public c(int i) {
                this.b = i;
            }

            @Override // xsna.izs
            public final s3q0 invoke(tgi0 tgi0Var) {
                tgi0 tgi0Var2 = tgi0Var;
                bgi0.a(tgi0Var2, this.b);
                qgi0.r(tgi0Var2, "mvi_catalog_slider_item_test_tag");
                return s3q0.a;
            }
        }

        /* compiled from: LazyDsl.kt */
        /* loaded from: classes16.dex */
        public static final class d implements izs<Integer, Object> {
            public final /* synthetic */ List b;

            public d(ArrayList arrayList) {
                this.b = arrayList;
            }

            @Override // xsna.izs
            public final Object invoke(Integer num) {
                this.b.get(num.intValue());
                return null;
            }
        }

        /* compiled from: LazyDsl.kt */
        /* loaded from: classes16.dex */
        public static final class e implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
            public final /* synthetic */ List b;
            public final /* synthetic */ f c;
            public final /* synthetic */ a8a d;
            public final /* synthetic */ ksr e;
            public final /* synthetic */ BlockView f;
            public final /* synthetic */ izs g;

            public e(ArrayList arrayList, f fVar, a8a a8aVar, ksr ksrVar, BlockView blockView, izs izsVar) {
                this.b = arrayList;
                this.c = fVar;
                this.d = a8aVar;
                this.e = ksrVar;
                this.f = blockView;
                this.g = izsVar;
            }

            @Override // xsna.zzs
            public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
                int i;
                ksy ksyVar2 = ksyVar;
                int intValue = num.intValue();
                androidx.compose.runtime.a aVar2 = aVar;
                int intValue2 = num2.intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar2.o(intValue) ? 32 : 16;
                }
                boolean z = true;
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    ttk0 ttk0Var = (ttk0) this.b.get(intValue);
                    aVar2.K(890903251);
                    f fVar = this.c;
                    boolean J = ((((i & 14) ^ 6) > 4 && aVar2.J(ksyVar2)) || (i & 6) == 4) | aVar2.J(fVar);
                    a8a a8aVar = this.d;
                    boolean J2 = J | aVar2.J(a8aVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J2 || x == c0012a) {
                        x = new d(fVar, a8aVar, ksyVar2);
                        aVar2.R(x);
                    }
                    d dVar = (d) x;
                    final r2a r2aVar = (r2a) nr2.u(ttk0Var, aVar2).getValue();
                    BlockId w = r2aVar.w();
                    ksr ksrVar = this.e;
                    boolean J3 = aVar2.J(w) | aVar2.J(ksrVar);
                    Object x2 = aVar2.x();
                    if (J3 || x2 == c0012a) {
                        final SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$map$1 sliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$map$1 = new SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$map$1(ksrVar);
                        x2 = new a1q(new ksr<smk>() { // from class: com.vk.catalog.mvi.block.impl.slider.SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$filter$1

                            /* compiled from: Emitters.kt */
                            /* renamed from: com.vk.catalog.mvi.block.impl.slider.SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$filter$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements lsr {
                                public final /* synthetic */ lsr b;
                                public final /* synthetic */ r2a c;

                                @b6l(c = "com.vk.catalog.mvi.block.impl.slider.SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$filter$1$2", f = "SliderView.kt", l = {50}, m = "emit")
                                /* renamed from: com.vk.catalog.mvi.block.impl.slider.SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$filter$1$2$1, reason: invalid class name */
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
                                Object collect = SliderView$BlockView$ContentImpl_MIJsHyQ$lambda$20$lambda$19$lambda$16$lambda$10$$inlined$map$1.this.collect(new AnonymousClass2(lsrVar, r2aVar), spjVar);
                                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                            }
                        });
                        aVar2.R(x2);
                    }
                    ksr ksrVar2 = ((a1q) x2).a;
                    aVar2.K(1691330886);
                    k2a k2aVar = this.f.b.get(r2aVar.getClass());
                    if (k2aVar == null) {
                        aVar2.K(1128309982);
                        boolean J4 = aVar2.J(r2aVar);
                        Object x3 = aVar2.x();
                        if (J4 || x3 == c0012a) {
                            x3 = new a(r2aVar);
                            aVar2.R(x3);
                        }
                        L.k((gzs) x3);
                    } else {
                        aVar2.K(1114968202);
                    }
                    aVar2.j();
                    aVar2.j();
                    if (k2aVar == null) {
                        aVar2.K(891869054);
                    } else {
                        aVar2.K(891869055);
                        izs izsVar = this.g;
                        boolean J5 = aVar2.J(izsVar) | aVar2.J(fVar);
                        Object x4 = aVar2.x();
                        if (J5 || x4 == c0012a) {
                            x4 = new b(izsVar, fVar);
                            aVar2.R(x4);
                        }
                        izs izsVar2 = (izs) x4;
                        if ((((i & 112) ^ 48) <= 32 || !aVar2.o(intValue)) && (i & 48) != 32) {
                            z = false;
                        }
                        Object x5 = aVar2.x();
                        if (z || x5 == c0012a) {
                            x5 = new c(intValue);
                            aVar2.R(x5);
                        }
                        k2aVar.a(dVar, r2aVar, izsVar2, ksrVar2, egi0.b(q630.a.a, false, (izs) x5), aVar2, 0);
                    }
                    aVar2.j();
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BlockView(Map<Class<? extends r2a>, ? extends k2a> map) {
            super(e.class);
            this.b = map;
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(a8a a8aVar, final f fVar, final izs izsVar, final ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            final a8a a8aVar2;
            int i2;
            androidx.compose.runtime.a M = aVar.M(-459103139);
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
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(ksrVar) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= M.J(q630Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= M.J(this) ? 131072 : 65536;
            }
            if (M.t(i2 & 1, (i2 & 74899) != 74898)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-459103139, i2, -1, "com.vk.catalog.mvi.block.impl.slider.SliderView.BlockView.ContentImpl (SliderView.kt:271)");
                }
                xvy xvyVar = fVar.d;
                boolean z = fVar.e;
                int i3 = i2 & 896;
                int i4 = i2 & 112;
                boolean z2 = (i3 == 256) | (i4 == 32);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z2 || x == c0012a) {
                    x = new j1k0(0, izsVar, fVar);
                    M.R(x);
                }
                s101.e(0, 0, M, (gzs) x, xvyVar, z);
                xvy xvyVar2 = fVar.d;
                boolean z3 = fVar.e;
                boolean z4 = (i3 == 256) | (i4 == 32);
                Object x2 = M.x();
                if (z4 || x2 == c0012a) {
                    x2 = new p5(25, izsVar, fVar);
                    M.R(x2);
                }
                tz50 I = s101.I(xvyVar2, z3, (gzs) x2, M);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = i.a(0);
                    M.R(x3);
                }
                final rg50 rg50Var = (rg50) x3;
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new o440(rg50Var, 28);
                    M.R(x4);
                }
                q630 E = ahn.E(xp2.a(egi.o(q630Var, (izs) x4), null, 3), "mvi_catalog_slider_test_tag");
                xvy xvyVar3 = fVar.d;
                u890 m = s200.m(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                a.j g = androidx.compose.foundation.layout.a.g(12);
                boolean z5 = (i4 == 32) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072) | (i3 == 256);
                Object x5 = M.x();
                if (z5 || x5 == c0012a) {
                    izs izsVar2 = new izs() { // from class: xsna.k1k0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            nvy nvyVar = (nvy) obj;
                            SliderView.f fVar2 = SliderView.f.this;
                            ArrayList arrayList = fVar2.c;
                            nvyVar.e(arrayList.size(), null, new SliderView.BlockView.d(arrayList), kai.b(2039820996, new SliderView.BlockView.e(arrayList, fVar2, a8aVar2, ksrVar, this, izsVar)));
                            if (fVar2.f) {
                                nvy.g(nvyVar, null, null, kai.b(-510024805, new y9a(rg50Var, 3)), 3);
                            }
                            return s3q0.a;
                        }
                    };
                    M.R(izsVar2);
                    x5 = izsVar2;
                }
                lqy.b(E, xvyVar3, m, g, null, I, false, null, (izs) x5, M, 24960, 424);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new jig0(this, a8aVar, fVar, izsVar, ksrVar, q630Var, i));
            }
        }
    }

    /* compiled from: SliderView.kt */
    /* loaded from: classes16.dex */
    public static final class a extends u1a<State, b> {
        public final Map<Class<? extends CatalogBlockState>, t1a<? super CatalogBlockState>> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<Class<? extends CatalogBlockState>, ? extends t1a<? super CatalogBlockState>> map, b2a b2aVar) {
            super(b2aVar);
            this.c = map;
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
        public final void g(b bVar) {
            b bVar2 = bVar;
            b2a b2aVar = (b2a) this.b.b;
            Object obj = null;
            if (bVar2 instanceof b.C0452b) {
                String str = ((State) b2aVar.getCurrentState()).e;
                if (str != null) {
                    c(str, new pb00(this, 26), new v1a(new com.vk.catalog.mvi.block.impl.slider.e(this, null), null));
                    return;
                }
                return;
            }
            if (!(bVar2 instanceof b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            q1a q1aVar = ((b.a) bVar2).c;
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
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{"SliderInlineActor block data actor is empty for " + catalogBlockData.b.getValue()});
                }
                catalogBlockData.c = w(catalogBlockData);
            }
            s1a<? super CatalogBlockState> s1aVar = catalogBlockData.c;
            if (s1aVar != null) {
                s1aVar.j(q1aVar);
            }
        }

        @Override // xsna.u1a
        public final State h(State state, State state2) {
            State state3 = state2;
            Iterator<T> it = state.d.iterator();
            while (it.hasNext()) {
                ((CatalogBlockData) it.next()).clear();
            }
            for (CatalogBlockData catalogBlockData : state3.d) {
                catalogBlockData.c = w(catalogBlockData);
            }
            return state3;
        }

        public final s1a<? super CatalogBlockState> w(CatalogBlockData catalogBlockData) {
            t1a<? super CatalogBlockState> t1aVar = this.c.get(((CatalogBlockState) catalogBlockData.b.getValue()).getClass());
            if (t1aVar != null) {
                return t1aVar.a(new c(this, catalogBlockData));
            }
            return null;
        }
    }

    /* compiled from: SliderView.kt */
    /* loaded from: classes16.dex */
    public interface b extends q1a {

        /* compiled from: SliderView.kt */
        public static final class a implements b {
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

        /* compiled from: SliderView.kt */
        /* renamed from: com.vk.catalog.mvi.block.impl.slider.SliderView$b$b, reason: collision with other inner class name */
        public static final class C0452b implements b {
            public final String b;

            public C0452b(String str) {
                this.b = str;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: SliderView.kt */
    /* loaded from: classes16.dex */
    public static final class c implements b2a {
        public final a a;
        public final CatalogBlockData b;
        public final LinkedHashSet c = new LinkedHashSet();

        /* compiled from: SliderView.kt */
        public static final class a implements on50 {
            public final BlockId a;
            public final on50 b;

            public a(BlockId blockId, on50 on50Var) {
                this.a = blockId;
                this.b = on50Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "SliderMviTaskId(blockId=" + this.a + ", blockTask=" + this.b + ')';
            }
        }

        public c(a aVar, CatalogBlockData catalogBlockData) {
            this.a = aVar;
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
            this.a.e(new a(getCurrentState().w(), on50Var), ln50Var, new l1k0(0, izsVar, this));
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
            a aVar = this.a;
            if (z) {
                r1aVar = new e(((State) ((b2a) aVar.b.b).getCurrentState()).b, (smk) r1aVar);
            }
            aVar.t(r1aVar);
        }
    }

    /* compiled from: SliderView.kt */
    /* loaded from: classes16.dex */
    public static final class d implements a8a {
        public final f a;
        public final a8a b;
        public final ksy c;

        /* compiled from: SliderView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.slider.SliderView$SliderCatalogLazyItemScope$blockLayoutInfoSnapshotFlow$2", f = "SliderView.kt", l = {}, m = "invokeSuspend")
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
                h9x h9xVar;
                long j;
                a8a.a aVar = (a8a.a) this.L$0;
                a8a.a aVar2 = (a8a.a) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                float f = aVar2.a * aVar.a;
                h9x h9xVar2 = aVar.f;
                if (h9xVar2 != null) {
                    long j2 = h9xVar2.a;
                    h9x h9xVar3 = aVar2.f;
                    if (h9xVar3 != null) {
                        j = h9xVar3.a;
                    } else {
                        long j3 = 0;
                        j = (j3 & 4294967295L) | (j3 << 32);
                    }
                    h9xVar = new h9x(h9x.d(j2, j));
                } else {
                    h9xVar = null;
                }
                return new a8a.a(f, h9x.d(aVar2.b, aVar.b), h9x.d(aVar2.c, aVar.c), aVar2.d, aVar.e, h9xVar, aVar.g || aVar2.g);
            }
        }

        public d(f fVar, a8a a8aVar, ksy ksyVar) {
            this.a = fVar;
            this.b = a8aVar;
            this.c = ksyVar;
        }

        @Override // xsna.a8a
        public final q630 a(q630 q630Var) {
            return this.c.a(q630Var);
        }

        @Override // xsna.a8a
        public final q630 b(q630 q630Var) {
            return this.c.b(q630Var);
        }

        @Override // xsna.a8a
        public final q630 c(q630 q630Var, BlockId.Simple simple, float f) {
            return b(q630Var);
        }

        @Override // xsna.a8a
        public final ksr<a8a.a> f(r2a r2aVar) {
            return new ztr(nr2.M(new g(24, this, r2aVar)), this.b.f(this.a), new a(3, null));
        }
    }

    /* compiled from: SliderView.kt */
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

    /* compiled from: SliderView.kt */
    public static final class f implements r2a {
        public final String b;
        public final ArrayList c;
        public final xvy d;
        public final boolean e;
        public final boolean f;

        public f() {
            throw null;
        }

        public f(String str, ArrayList arrayList, xvy xvyVar, boolean z, boolean z2) {
            this.b = str;
            this.c = arrayList;
            this.d = xvyVar;
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
            return BlockId.Simple.b(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b((this.d.hashCode() + qr.a(this.c, BlockId.Simple.d(this.b) * 31, 31)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", sliderViewStateList=");
            sb.append(this.c);
            sb.append(", lazyListState=");
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

    public static void a(f1u f1uVar, dg50 dg50Var, oji0 oji0Var) {
        oji0Var.invoke(dg50Var);
        Set<CatalogBlockVariant> keySet = dg50Var.b.keySet();
        ArrayList arrayList = new ArrayList();
        for (CatalogBlockVariant catalogBlockVariant : keySet) {
            if (catalogBlockVariant != null) {
                arrayList.add(catalogBlockVariant);
            }
        }
        final LinkedHashMap linkedHashMap = dg50Var.b;
        g2a g2aVar = new g2a(new yzs() { // from class: com.vk.catalog.mvi.block.impl.slider.a
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogBlockVariant catalogBlockVariant2 = (CatalogBlockVariant) obj3;
                CatalogBlockVariant.Companion.getClass();
                CatalogBlockVariant a2 = CatalogBlockVariant.a.a(catalogBlockDto);
                a2.getClass();
                if (a2 == CatalogBlockVariant.UnknownBlock) {
                    L.k(new qbc0(catalogBlockDto, 13));
                }
                f2a f2aVar = (f2a) linkedHashMap.get(a2);
                if (f2aVar == null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.e, new Object[]{"SliderView has no registered stateMapper for " + a2});
                    }
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
                return new SliderView.State(id, catalogBlockVariant2, arrayList2, catalogBlockDto.V1(), null, false, 48, null);
            }
        });
        ezc0 ezc0Var = new ezc0(dg50Var, 2);
        final LinkedHashMap linkedHashMap2 = dg50Var.d;
        s2a<? super CatalogBlockState, ?> s2aVar = new s2a() { // from class: com.vk.catalog.mvi.block.impl.slider.b
            /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0011 A[SYNTHETIC] */
            @Override // xsna.s2a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final r2a a(CatalogBlockState catalogBlockState) {
                ttk0<r2a> Z;
                SliderView.State state = (SliderView.State) catalogBlockState;
                String str = state.b;
                List<CatalogBlockData> list = state.d;
                ArrayList arrayList2 = new ArrayList();
                for (CatalogBlockData catalogBlockData : list) {
                    if (catalogBlockData.Z() == null) {
                        Class<?> cls = ((utk0) catalogBlockData.e()).getValue().getClass();
                        s2a s2aVar2 = (s2a) linkedHashMap2.get(cls);
                        if (s2aVar2 == null) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.e, new Object[]{xlg0.a(cls, new StringBuilder("SliderView has no registered viewStateMapper for "))});
                            }
                        }
                        if (s2aVar2 == null) {
                            Z = null;
                            if (Z == null) {
                                arrayList2.add(Z);
                            }
                        } else {
                            catalogBlockData.a0(tci.s((utk0) catalogBlockData.e(), new hb40(s2aVar2, 19)));
                        }
                    }
                    Z = catalogBlockData.Z();
                    if (Z == null) {
                    }
                }
                xvy xvyVar = state.f;
                String str2 = state.e;
                return new SliderView.f(str, arrayList2, xvyVar, str2 != null, str2 != null);
            }
        };
        BlockView blockView = new BlockView(dg50Var.e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f1uVar.a((CatalogBlockVariant) it.next(), g2aVar);
        }
        f1uVar.c(State.class, new m1k0(ezc0Var, 0));
        f1uVar.h(State.class, s2aVar);
        f1uVar.g(f.class, blockView);
    }

    /* compiled from: SliderView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final List<CatalogBlockData> d;
        public final String e;
        public final xvy f;
        public final boolean g;

        /* compiled from: SliderView.kt */
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
                return new State(str, valueOf, arrayList, parcel.readString(), ((ParcelableLazyListState) parcel.readParcelable(State.class.getClassLoader())).b, parcel.readInt() != 0, null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            throw null;
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, List list, String str2, xvy xvyVar, boolean z, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = list;
            this.e = str2;
            this.f = xvyVar;
            this.g = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static State a(State state, ArrayList arrayList, String str, boolean z, int i) {
            String str2 = state.b;
            CatalogBlockVariant catalogBlockVariant = state.c;
            List list = arrayList;
            if ((i & 4) != 0) {
                list = state.d;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                str = state.e;
            }
            String str3 = str;
            xvy xvyVar = state.f;
            if ((i & 32) != 0) {
                z = state.g;
            }
            state.getClass();
            return new State(str2, catalogBlockVariant, list2, str3, xvyVar, z, null);
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
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d) && epx.f(this.e, state.e) && ParcelableLazyListState.e(this.f, state.f) && this.g == state.g;
        }

        public final int hashCode() {
            int a2 = fw3.a(io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31), 31, this.d);
            String str = this.e;
            return Boolean.hashCode(this.g) + ((ParcelableLazyListState.f(this.f) + ((a2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", sliderStateList=");
            sb.append(this.d);
            sb.append(", nextFrom=");
            sb.append(this.e);
            sb.append(", lazyListState=");
            sb.append((Object) ParcelableLazyListState.g(this.f));
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
            parcel.writeParcelable(ParcelableLazyListState.a(this.f), i);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public /* synthetic */ State(String str, CatalogBlockVariant catalogBlockVariant, List list, String str2, xvy xvyVar, boolean z, int i, zcl zclVar) {
            this(str, catalogBlockVariant, list, str2, (i & 16) != 0 ? ParcelableLazyListState.d() : xvyVar, (i & 32) != 0 ? false : z, null);
        }
    }
}
