package com.vk.catalog.mvi.block.impl.filters;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.j;
import androidx.compose.foundation.layout.k;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import com.vk.catalog.mvi.section.domain.CatalogFilterOptionDo;
import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a8a;
import xsna.ahn;
import xsna.ao;
import xsna.b2a;
import xsna.b6l;
import xsna.bap;
import xsna.bbk0;
import xsna.bo;
import xsna.brm0;
import xsna.bu00;
import xsna.c1q;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.e43;
import xsna.egi0;
import xsna.enn0;
import xsna.epx;
import xsna.ew3;
import xsna.f1u;
import xsna.f9t;
import xsna.fgh;
import xsna.fh9;
import xsna.fnj;
import xsna.fpf0;
import xsna.fw3;
import xsna.g2a;
import xsna.gdv;
import xsna.gzs;
import xsna.ho8;
import xsna.hr80;
import xsna.iah0;
import xsna.izs;
import xsna.j5g;
import xsna.ja8;
import xsna.k9q0;
import xsna.kr;
import xsna.ks2;
import xsna.ksr;
import xsna.l5g;
import xsna.lg90;
import xsna.ln50;
import xsna.lsr;
import xsna.m200;
import xsna.m2a;
import xsna.m7a;
import xsna.mfr;
import xsna.mnv0;
import xsna.ms9;
import xsna.mtk0;
import xsna.n34;
import xsna.o83;
import xsna.oy5;
import xsna.pg90;
import xsna.q1a;
import xsna.q630;
import xsna.q6b;
import xsna.qn50;
import xsna.qoy;
import xsna.qr;
import xsna.qri;
import xsna.r2a;
import xsna.rdu;
import xsna.rte0;
import xsna.s1a;
import xsna.s200;
import xsna.s3q0;
import xsna.smk;
import xsna.spj;
import xsna.sy90;
import xsna.t1a;
import xsna.txj0;
import xsna.u1a;
import xsna.uqi;
import xsna.vog0;
import xsna.vu5;
import xsna.wlb0;
import xsna.wpg;
import xsna.wzs;
import xsna.xvy;
import xsna.y4a;
import xsna.yvj;
import xsna.z1v0;
import xsna.zcl;

/* compiled from: HorizontalFiltersWithScrollView.kt */
/* loaded from: classes.dex */
public final class HorizontalFiltersWithScrollView {
    public static final HorizontalFiltersWithScrollView a = new HorizontalFiltersWithScrollView();

    /* compiled from: HorizontalFiltersWithScrollView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final CatalogFilterDo d;
        public final List<CatalogFilterDo> e;
        public final int f;

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                String str = ((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b;
                CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
                CatalogFilterDo catalogFilterDo = (CatalogFilterDo) parcel.readParcelable(State.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(State.class, parcel, arrayList, i, 1);
                }
                return new State(str, valueOf, catalogFilterDo, arrayList, parcel.readInt(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            throw null;
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, CatalogFilterDo catalogFilterDo, List list, int i, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = catalogFilterDo;
            this.e = list;
            this.f = i;
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
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d) && epx.f(this.e, state.e) && this.f == state.f;
        }

        public final int hashCode() {
            int b = io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
            CatalogFilterDo catalogFilterDo = this.d;
            return Integer.hashCode(this.f) + fw3.a((b + (catalogFilterDo == null ? 0 : catalogFilterDo.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", showFilter=");
            sb.append(this.d);
            sb.append(", blockFilters=");
            sb.append(this.e);
            sb.append(", selectedIndex=");
            return vu5.b(sb, this.f, ')');
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(BlockId.Simple.a(this.b), i);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
            Iterator a2 = ao.a(parcel, this.e);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeInt(this.f);
        }
    }

    /* compiled from: HorizontalFiltersWithScrollView.kt */
    /* loaded from: classes16.dex */
    public interface a extends q1a {

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        /* renamed from: com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView$a$a, reason: collision with other inner class name */
        public static final class C0449a implements a {
            public final String b;
            public final int c;

            public C0449a(String str, int i) {
                this.b = str;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0449a)) {
                    return false;
                }
                C0449a c0449a = (C0449a) obj;
                return epx.f(this.b, c0449a.b) && this.c == c0449a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClickBlockFilter(blockId=");
                io.reactivex.rxjava3.processors.b.b(sb, this.b, ", filterIndex=");
                return vu5.b(sb, this.c, ')');
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        public static final class b implements a {
            public final String b;
            public final String c;

            public b(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClickFilterOption(blockId=");
                io.reactivex.rxjava3.processors.b.b(sb, this.b, ", replacementId=");
                return ho8.a(sb, this.c, ')');
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ClickShowFilter(blockId=" + ((Object) BlockId.Simple.e(this.b)) + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: HorizontalFiltersWithScrollView.kt */
    public static final class b extends m2a<f, a, c> {

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView$BlockView$ContentImpl$1$1", f = "HorizontalFiltersWithScrollView.kt", l = {Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE}, m = "invokeSuspend")
        /* loaded from: classes16.dex */
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ xvy $lazyListState;
            final /* synthetic */ f $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xvy xvyVar, f fVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$lazyListState = xvyVar;
                this.$state = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$lazyListState, this.$state, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    xvy xvyVar = this.$lazyListState;
                    int i2 = this.$state.e;
                    this.label = 1;
                    fh9 fh9Var = xvy.y;
                    if (xvyVar.f(i2, this) == coroutineSingletons) {
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

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(final a8a a8aVar, final f fVar, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            a.C0011a.C0012a c0012a;
            mtk0 mtk0Var;
            int i3;
            Throwable th;
            b bVar;
            q630 m;
            int i4 = fVar.e;
            androidx.compose.runtime.a M = aVar.M(776498415);
            if ((i & 48) == 0) {
                i2 = (M.J(fVar) ? 32 : 16) | i;
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
                i2 |= M.J(q630Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= M.J(this) ? 131072 : 65536;
            }
            int i5 = i2;
            if (M.t(i5 & 1, (74897 & i5) != 74896)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(776498415, i5, -1, "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView.BlockView.ContentImpl (HorizontalFiltersWithScrollView.kt:296)");
                }
                int i6 = 14;
                HorizontalFiltersWithScrollView.a.a(ksrVar, izsVar, M, ((i5 >> 9) & 14) | 384 | ((i5 >> 3) & 112));
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
                Object x = M.x();
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (x == c0012a2) {
                    x = new xvy(i4, 2, 0);
                    M.R(x);
                }
                xvy xvyVar = (xvy) x;
                Object x2 = M.x();
                if (x2 == c0012a2) {
                    x2 = bbk0.b(new ks2(i6, xvyVar, context));
                    M.R(x2);
                }
                mtk0 mtk0Var2 = (mtk0) x2;
                Integer valueOf = Integer.valueOf(i4);
                int i7 = i5 & 112;
                boolean z = i7 == 32;
                Object x3 = M.x();
                if (z || x3 == c0012a2) {
                    x3 = new a(xvyVar, fVar, null);
                    M.R(x3);
                }
                bap.g(valueOf, (wzs) x3, M, 0);
                float f = 10;
                float f2 = 8;
                HashSet hashSet = iah0.a;
                q630 G = s200.G(q630Var, f, f2, f, fnj.d(context) ? 0 : f2);
                dt1.a.getClass();
                k a2 = j.a(androidx.compose.foundation.layout.a.a, dt1.a.c(), M, 48);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, G);
                cri.h7.getClass();
                LayoutNode.a b = cri.a.b();
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(b);
                } else {
                    M.f();
                }
                k9q0.w(M, a2, cri.a.d());
                k9q0.w(M, D, cri.a.f());
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
                k9q0.t(M, cri.a.a());
                k9q0.w(M, c, cri.a.e());
                f.a aVar2 = fVar.c;
                q630.a aVar3 = q630.a.a;
                if (aVar2 == null) {
                    M.K(-511299824);
                    M.j();
                    bVar = this;
                    i3 = i7;
                    mtk0Var = mtk0Var2;
                    c0012a = c0012a2;
                    th = null;
                } else {
                    M.K(-511299823);
                    boolean z2 = ((i5 & 896) == 256) | (i7 == 32);
                    Object x4 = M.x();
                    if (z2 || x4 == c0012a2) {
                        x4 = new ew3(10, izsVar, fVar);
                        M.R(x4);
                    }
                    c0012a = c0012a2;
                    mtk0Var = mtk0Var2;
                    i3 = i7;
                    th = null;
                    bVar = this;
                    bVar.d(aVar2, null, (gzs) x4, M, (i5 >> 6) & 7168, 2);
                    Object x5 = M.x();
                    if (x5 == c0012a) {
                        x5 = new oy5(mtk0Var, 1);
                        M.R(x5);
                    }
                    m = hr80.m(txj0.h(txj0.v(rdu.a(aVar3, (izs) x5), (float) 0.5d), 30), wlb0.h(M).r().a(), androidx.compose.ui.graphics.e.a);
                    f9t.e(m, M, 0);
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
                final List l = e43.l(l5g.a(wlb0.h(M).getBackground().b()), l5g.a(wlb0.h(M).d().a()));
                final float floatValue = ((Number) mtk0Var.getValue()).floatValue();
                q630 f3 = bu00.f(aVar3, new izs() { // from class: xsna.idv
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        ggj ggjVar = (ggj) obj;
                        ggjVar.s1();
                        float f4 = 2;
                        float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) / f4;
                        float I0 = ggjVar.I0(36);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) / f4;
                        oio.x1(ggjVar, new y7z(l, null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(I0) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2)), 0), 0L, 0L, floatValue, null, null, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                        return s3q0.a;
                    }
                });
                cp10 d = ja8.d(dt1.a.f(), false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, f3);
                LayoutNode.a b2 = cri.a.b();
                if (M.N() == null) {
                    n34.r();
                    throw th;
                }
                M.H();
                if (M.L()) {
                    M.I(b2);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.d());
                k9q0.w(M, D2, cri.a.f());
                k9q0.w(M, Integer.valueOf(hashCode2), cri.a.c());
                k9q0.t(M, cri.a.a());
                k9q0.w(M, c2, cri.a.e());
                q630 E = ahn.E(aVar3, "mvi_catalog_slider_test_tag");
                boolean z3 = ((458752 & i5) == 131072) | (i3 == 32) | ((i5 & 896) == 256);
                Object x6 = M.x();
                if (z3 || x6 == c0012a) {
                    x6 = new o83(fVar, bVar, izsVar, 3);
                    M.R(x6);
                }
                z1v0.a(E, xvyVar, null, null, null, null, false, (izs) x6, M, 54, 252);
                if (kr.f(M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: xsna.kdv
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        HorizontalFiltersWithScrollView.b.this.b(a8aVar, fVar, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(final f.a aVar, q630 q630Var, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
            int i3;
            q630 q630Var2;
            androidx.compose.runtime.a aVar3;
            final q630 q630Var3;
            androidx.compose.runtime.f s;
            q630 b;
            lg90 a2;
            androidx.compose.runtime.a M = aVar2.M(1565142232);
            if ((i & 6) == 0) {
                i3 = (M.J(aVar) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                q630Var2 = q630Var;
                i3 |= M.J(q630Var2) ? 32 : 16;
                if ((i & 384) == 0) {
                    i3 |= M.y(gzsVar) ? 256 : 128;
                }
                if (M.t(i3 & 1, (i3 & 147) == 146)) {
                    aVar3 = M;
                    aVar3.h();
                    q630Var3 = q630Var2;
                } else {
                    q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1565142232, i3, -1, "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView.BlockView.FilterButton (HorizontalFiltersWithScrollView.kt:387)");
                    }
                    SubnavigationButtonSize subnavigationButtonSize = SubnavigationButtonSize.Small;
                    SubnavigationButtonMode subnavigationButtonMode = SubnavigationButtonMode.Outline;
                    SubnavigationBarAppearance subnavigationBarAppearance = SubnavigationBarAppearance.Neutral;
                    boolean c = aVar.c();
                    q630 G = m200.G(rte0.d(s200.F(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var4), vog0.b(8)), IntrinsicSize.Max);
                    boolean z = (i3 & 14) == 4;
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new fgh(aVar, 21);
                        M.R(x);
                    }
                    b = egi0.b(G, false, (izs) x);
                    String b2 = aVar.b();
                    Integer a3 = aVar.a();
                    if (a3 == null) {
                        M.K(988143918);
                        M.j();
                        a2 = null;
                    } else {
                        M.K(988143919);
                        a2 = pg90.a(a3.intValue(), 0, M);
                        M.j();
                    }
                    aVar3 = M;
                    q630 q630Var5 = q630Var4;
                    mnv0.a(subnavigationButtonSize, subnavigationButtonMode, subnavigationBarAppearance, c, gzsVar, b, b2, a2, null, null, false, false, aVar3, ((i3 << 6) & 57344) | 16777654, 3840);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var5;
                }
                s = aVar3.s();
                if (s == null) {
                    s.l(new wzs() { // from class: xsna.ldv
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            HorizontalFiltersWithScrollView.b.this.d(aVar, q630Var3, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    });
                    return;
                }
                return;
            }
            q630Var2 = q630Var;
            if ((i & 384) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
            }
            s = aVar3.s();
            if (s == null) {
            }
        }
    }

    /* compiled from: HorizontalFiltersWithScrollView.kt */
    public interface c extends smk {

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements c {
            public final String a;
            public final List<CatalogFilterOptionDo> b;

            public a() {
                throw null;
            }

            public a(String str, List list) {
                this.a = str;
                this.b = list;
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
                StringBuilder sb = new StringBuilder("ShowFiltersBottomSheet(blockId=");
                io.reactivex.rxjava3.processors.b.b(sb, this.a, ", filterOptions=");
                return ms9.a(')', sb, this.b);
            }

            @Override // xsna.smk
            public final BlockId w() {
                return new BlockId.Simple(this.a);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: HorizontalFiltersWithScrollView.kt */
    @b6l(c = "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView$FilterHandleEvents$1$1", f = "HorizontalFiltersWithScrollView.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes16.dex */
    public static final class d<T> extends SuspendLambda implements wzs<T, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ izs<a, s3q0> $sendAction;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Context context, izs<? super a, s3q0> izsVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$context = context;
            this.$sendAction = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            d dVar = new d(this.$context, this.$sendAction, spjVar);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // xsna.wzs
        public final Object invoke(Object obj, spj<? super s3q0> spjVar) {
            return ((d) create((c) obj, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            new mfr.a(this.$context, ((c.a) cVar).b, new defpackage.c(18, this.$sendAction, cVar)).I0(null);
            return s3q0.a;
        }
    }

    /* compiled from: HorizontalFiltersWithScrollView.kt */
    /* loaded from: classes16.dex */
    public static final class e extends u1a<State, a> {
        public final m7a c;

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView$InlineActor$1$1", f = "HorizontalFiltersWithScrollView.kt", l = {197}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;

            /* compiled from: HorizontalFiltersWithScrollView.kt */
            /* renamed from: com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView$e$a$a, reason: collision with other inner class name */
            public static final class C0450a<T> implements lsr {
                public final /* synthetic */ e b;

                public C0450a(e eVar) {
                    this.b = eVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    String str;
                    T t;
                    List<CatalogFilterOptionDo> list;
                    T t2;
                    y4a y4aVar = (y4a) obj;
                    if ((y4aVar instanceof enn0) && (str = ((enn0) y4aVar).b) != null) {
                        e eVar = this.b;
                        b2a b2aVar = (b2a) eVar.b.b;
                        CatalogFilterDo catalogFilterDo = ((State) b2aVar.getCurrentState()).d;
                        String str2 = null;
                        if (catalogFilterDo != null && (list = catalogFilterDo.f) != null) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t2 = (T) null;
                                    break;
                                }
                                t2 = it.next();
                                if (brm0.v(((CatalogFilterOptionDo) t2).d, str, false)) {
                                    break;
                                }
                            }
                            CatalogFilterOptionDo catalogFilterOptionDo = t2;
                            if (catalogFilterOptionDo != null) {
                                str2 = catalogFilterOptionDo.d;
                                if (str2 != null) {
                                    eVar.s(Collections.singletonList(str2));
                                }
                            }
                        }
                        Iterator<T> it2 = ((State) b2aVar.getCurrentState()).e.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = (T) null;
                                break;
                            }
                            t = it2.next();
                            String str3 = ((CatalogFilterDo) t).e;
                            if (str3 != null && brm0.v(str3, str, false)) {
                                break;
                            }
                        }
                        CatalogFilterDo catalogFilterDo2 = t;
                        if (catalogFilterDo2 != null) {
                            str2 = catalogFilterDo2.e;
                        }
                        if (str2 != null) {
                        }
                    }
                    return s3q0.a;
                }
            }

            public a(spj<? super a> spjVar) {
                super(2, spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return e.this.new a(spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    ksr<y4a> b = e.this.c.b();
                    C0450a c0450a = new C0450a(e.this);
                    this.label = 1;
                    if (b.collect(c0450a, this) == coroutineSingletons) {
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

        public e(b2a b2aVar, m7a m7aVar) {
            super(b2aVar);
            this.c = m7aVar;
            e(new qn50(0), ln50.a.b, new wpg(this, 19));
        }

        @Override // xsna.u1a
        public final void g(a aVar) {
            String str;
            final a aVar2 = aVar;
            b2a b2aVar = (b2a) this.b.b;
            if (aVar2 instanceof a.c) {
                String str2 = ((State) b2aVar.getCurrentState()).b;
                CatalogFilterDo catalogFilterDo = ((State) b2aVar.getCurrentState()).d;
                List<CatalogFilterOptionDo> list = catalogFilterDo != null ? catalogFilterDo.f : null;
                if (list == null) {
                    list = EmptyList.b;
                }
                t(new c.a(str2, list));
                return;
            }
            if (aVar2 instanceof a.b) {
                s(Collections.singletonList(((a.b) aVar2).c));
                return;
            }
            if (!(aVar2 instanceof a.C0449a)) {
                throw new NoWhenBranchMatchedException();
            }
            m(new izs() { // from class: com.vk.catalog.mvi.block.impl.filters.c
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    HorizontalFiltersWithScrollView.State state = (HorizontalFiltersWithScrollView.State) obj;
                    return new HorizontalFiltersWithScrollView.State(state.b, state.c, state.d, state.e, ((HorizontalFiltersWithScrollView.a.C0449a) HorizontalFiltersWithScrollView.a.this).c, null);
                }
            });
            CatalogFilterDo catalogFilterDo2 = (CatalogFilterDo) j5g.b0(((a.C0449a) aVar2).c, ((State) b2aVar.getCurrentState()).e);
            if (catalogFilterDo2 == null || (str = catalogFilterDo2.e) == null) {
                return;
            }
            s(Collections.singletonList(str));
        }
    }

    /* compiled from: HorizontalFiltersWithScrollView.kt */
    public static final class f implements r2a {
        public final String b;
        public final a c;
        public final ArrayList d;
        public final int e;

        /* compiled from: HorizontalFiltersWithScrollView.kt */
        /* loaded from: classes16.dex */
        public static final class a {
            public final String a;
            public final boolean b;
            public final Integer c;

            public a(Integer num, String str, boolean z) {
                this.a = str;
                this.b = z;
                this.c = num;
            }

            public final Integer a() {
                return this.c;
            }

            public final String b() {
                return this.a;
            }

            public final boolean c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
                Integer num = this.c;
                return b + (num == null ? 0 : num.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ButtonViewState(title=");
                sb.append(this.a);
                sb.append(", isSelected=");
                sb.append(this.b);
                sb.append(", icon=");
                return uqi.b(sb, this.c, ')');
            }
        }

        public f() {
            throw null;
        }

        public f(String str, a aVar, ArrayList arrayList, int i) {
            this.b = str;
            this.c = aVar;
            this.d = arrayList;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return BlockId.Simple.b(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d) && this.e == fVar.e;
        }

        public final int hashCode() {
            int d = BlockId.Simple.d(this.b) * 31;
            a aVar = this.c;
            return Integer.hashCode(this.e) + qr.a(this.d, (d + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", showFilter=");
            sb.append(this.c);
            sb.append(", blockFilters=");
            sb.append(this.d);
            sb.append(", selectedIndex=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class g<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ q6b b;

        public g(q6b q6bVar) {
            this.b = q6bVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    public static void b(f1u f1uVar, m7a m7aVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.HorizontalFiltersWithScroll;
        g2a g2aVar = new g2a(new com.vk.catalog.mvi.block.impl.filters.a());
        q6b q6bVar = new q6b(m7aVar, 1);
        com.vk.catalog.mvi.block.impl.filters.b bVar = new com.vk.catalog.mvi.block.impl.filters.b();
        b bVar2 = new b(fpf0.a(c.class));
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(State.class, new g(q6bVar));
        f1uVar.h(State.class, bVar);
        f1uVar.g(f.class, bVar2);
    }

    public final <T extends c> void a(ksr<? extends T> ksrVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(346255034);
        if ((i & 6) == 0) {
            i2 = (M.J(ksrVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(346255034, i2, -1, "com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView.FilterHandleEvents (HorizontalFiltersWithScrollView.kt:263)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
            boolean y = M.y(context) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new d(context, izsVar, null);
                M.R(x);
            }
            c1q.a(ksrVar, (wzs) x, M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.l(new gdv(i, 0, this, ksrVar, izsVar));
        }
    }
}
