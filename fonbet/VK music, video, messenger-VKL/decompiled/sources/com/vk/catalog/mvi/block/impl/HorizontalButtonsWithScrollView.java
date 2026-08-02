package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogButtonDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a8a;
import xsna.ahn;
import xsna.ao;
import xsna.b2a;
import xsna.b6l;
import xsna.bap;
import xsna.bhu0;
import xsna.bo;
import xsna.buv0;
import xsna.c5g;
import xsna.cri;
import xsna.dt1;
import xsna.e43;
import xsna.epx;
import xsna.etv0;
import xsna.f1u;
import xsna.fw3;
import xsna.g2a;
import xsna.gp;
import xsna.gzs;
import xsna.h7v;
import xsna.izs;
import xsna.j5g;
import xsna.k9q0;
import xsna.m200;
import xsna.n34;
import xsna.o9v0;
import xsna.p490;
import xsna.p4a;
import xsna.q1a;
import xsna.q2a;
import xsna.q630;
import xsna.qri;
import xsna.r1a;
import xsna.r2a;
import xsna.rcv;
import xsna.rdi;
import xsna.rte0;
import xsna.s1a;
import xsna.s200;
import xsna.s3q0;
import xsna.spj;
import xsna.sy90;
import xsna.t0a;
import xsna.t1a;
import xsna.u1a;
import xsna.vcv;
import xsna.vog0;
import xsna.vu5;
import xsna.wlb0;
import xsna.wzs;
import xsna.yvj;
import xsna.yzs;
import xsna.zcl;
import xsna.zgo;

/* compiled from: HorizontalButtonsWithScrollView.kt */
/* loaded from: classes.dex */
public final class HorizontalButtonsWithScrollView {

    /* compiled from: HorizontalButtonsWithScrollView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final List<CatalogButtonDo> d;
        public final Hint e;

        /* compiled from: HorizontalButtonsWithScrollView.kt */
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
                return new State(str, valueOf, arrayList, (Hint) parcel.readParcelable(State.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State() {
            throw null;
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, List list, Hint hint, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = list;
            this.e = hint;
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
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d) && epx.f(this.e, state.e);
        }

        public final int hashCode() {
            int a2 = fw3.a(io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31), 31, this.d);
            Hint hint = this.e;
            return a2 + (hint == null ? 0 : hint.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", buttonList=");
            sb.append(this.d);
            sb.append(", authorCabinetHint=");
            sb.append(this.e);
            sb.append(')');
            return sb.toString();
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
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: HorizontalButtonsWithScrollView.kt */
    /* loaded from: classes16.dex */
    public interface a extends q1a {

        /* compiled from: HorizontalButtonsWithScrollView.kt */
        /* renamed from: com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView$a$a, reason: collision with other inner class name */
        public static final class C0447a implements a {
            public final String b;
            public final int c;

            public C0447a(String str, int i) {
                this.b = str;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0447a)) {
                    return false;
                }
                C0447a c0447a = (C0447a) obj;
                return epx.f(this.b, c0447a.b) && this.c == c0447a.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClickAction(blockId=");
                io.reactivex.rxjava3.processors.b.b(sb, this.b, ", buttonIndex=");
                return vu5.b(sb, this.c, ')');
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: HorizontalButtonsWithScrollView.kt */
        public static final class b implements a {
            public final String b;
            public final Hint c;

            public b(String str, Hint hint) {
                this.b = str;
                this.c = hint;
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
                return this.c.b.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnHintDismissed(blockId=");
                io.reactivex.rxjava3.processors.b.b(sb, this.b, ", hint=");
                sb.append(this.c);
                sb.append(')');
                return sb.toString();
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: HorizontalButtonsWithScrollView.kt */
    public static final class b extends q2a<d, a> {

        /* compiled from: HorizontalButtonsWithScrollView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView$BlockView$ContentImpl$1$1$2$1", f = "HorizontalButtonsWithScrollView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes16.dex */
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

        /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(d.a aVar, q630 q630Var, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
            final d.a aVar3;
            int i3;
            q630 q630Var2;
            androidx.compose.runtime.a aVar4;
            final q630 q630Var3;
            androidx.compose.runtime.f s;
            androidx.compose.runtime.a M = aVar2.M(639232627);
            if ((i & 6) == 0) {
                aVar3 = aVar;
                i3 = (M.J(aVar3) ? 4 : 2) | i;
            } else {
                aVar3 = aVar;
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
                    aVar4 = M;
                    aVar4.h();
                    q630Var3 = q630Var2;
                } else {
                    q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(639232627, i3, -1, "com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView.BlockView.Button (HorizontalButtonsWithScrollView.kt:201)");
                    }
                    q630 q630Var5 = q630Var4;
                    aVar4 = M;
                    bhu0.e(gzsVar, ButtonSize.Small, ButtonStyle.Secondary, ButtonAppearance.Neutral, ahn.E(m200.G(rte0.d(s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var4), vog0.b(48)), IntrinsicSize.Max), "horizontal_button_with_scroll_test_tag"), null, false, false, null, null, null, aVar3.b(), null, null, null, null, false, null, null, null, aVar4, ((i3 >> 6) & 14) | X2.b.f, 0, 0, 4190176);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630Var3 = q630Var5;
                }
                s = aVar4.s();
                if (s == null) {
                    s.l(new wzs() { // from class: xsna.scv
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            HorizontalButtonsWithScrollView.b.this.d(aVar3, q630Var3, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
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
            s = aVar4.s();
            if (s == null) {
            }
        }

        @Override // xsna.q2a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final void c(a8a a8aVar, final d dVar, final izs<? super a, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            Iterator it;
            boolean z;
            int i3;
            androidx.compose.runtime.a aVar3;
            androidx.compose.runtime.a M = aVar.M(2076877355);
            int i4 = 32;
            if ((i & 48) == 0) {
                i2 = (M.J(dVar) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(q630Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= M.J(this) ? 16384 : 8192;
            }
            boolean z2 = false;
            if (M.t(i2 & 1, (i2 & 9361) != 9360)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2076877355, i2, -1, "com.vk.catalog.mvi.block.impl.HorizontalButtonsWithScrollView.BlockView.ContentImpl (HorizontalButtonsWithScrollView.kt:159)");
                }
                float f = 8;
                q630 E = s200.E(p490.r(q630Var, p490.x(M), 14), f, f);
                a.l lVar = androidx.compose.foundation.layout.a.a;
                dt1.a.getClass();
                androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.e(), M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
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
                M.K(-350215716);
                Iterator it2 = dVar.c.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    d.a aVar4 = (d.a) next;
                    Hint a3 = aVar4.a();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (a3 != null) {
                        M.K(-530337877);
                        int i7 = i2 & 896;
                        int i8 = i2 & 112;
                        boolean J = (i7 == 256 ? true : z2) | (i8 == i4 ? true : z2) | M.J(aVar4);
                        Object x = M.x();
                        if (J || x == c0012a) {
                            x = new zgo(izsVar, dVar, aVar4, 2);
                            M.R(x);
                        }
                        androidx.compose.runtime.a aVar5 = M;
                        final int i9 = i5;
                        z = false;
                        it = it2;
                        buv0 z3 = rdi.z(false, null, (izs) x, aVar5, 0, 3);
                        String title = aVar4.a().getTitle();
                        if (title == null) {
                            title = "";
                        }
                        q630 g = o9v0.g(title, z3, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size96, VkOnboarding$TintColor.Azure, VkTooltip$BalloonPosition.Bottom, null, null, null, wlb0.h(aVar5).s(), 245696);
                        boolean o = (i7 == 256) | (i8 == 32) | aVar5.o(i9);
                        Object x2 = aVar5.x();
                        if (o || x2 == c0012a) {
                            x2 = new gzs() { // from class: xsna.tcv
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs.this.invoke(new HorizontalButtonsWithScrollView.a.C0447a(dVar.b, i9));
                                    return s3q0.a;
                                }
                            };
                            aVar5.R(x2);
                        }
                        d(aVar4, g, (gzs) x2, aVar5, (i2 >> 3) & 7168, 0);
                        aVar3 = aVar5;
                        s3q0 s3q0Var = s3q0.a;
                        boolean y = aVar3.y(z3);
                        Object x3 = aVar3.x();
                        if (y || x3 == c0012a) {
                            x3 = new a(z3, null);
                            aVar3.R(x3);
                        }
                        bap.g(s3q0Var, (wzs) x3, aVar3, 6);
                        aVar3.j();
                        i3 = 32;
                    } else {
                        it = it2;
                        final int i10 = i5;
                        z = z2;
                        androidx.compose.runtime.a aVar6 = M;
                        aVar6.K(-529131574);
                        boolean o2 = ((i2 & 112) == 32 ? true : z) | ((i2 & 896) == 256 ? true : z) | aVar6.o(i10);
                        Object x4 = aVar6.x();
                        if (o2 || x4 == c0012a) {
                            x4 = new gzs() { // from class: xsna.ucv
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    izs.this.invoke(new HorizontalButtonsWithScrollView.a.C0447a(dVar.b, i10));
                                    return s3q0.a;
                                }
                            };
                            aVar6.R(x4);
                        }
                        i3 = 32;
                        d(aVar4, null, (gzs) x4, aVar6, (i2 >> 3) & 7168, 2);
                        aVar3 = aVar6;
                        aVar3.j();
                    }
                    M = aVar3;
                    i5 = i6;
                    i4 = i3;
                    z2 = z;
                    it2 = it;
                }
                aVar2 = M;
                if (gp.d(aVar2)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.l(new vcv(this, a8aVar, dVar, izsVar, q630Var, i));
            }
        }
    }

    /* compiled from: HorizontalButtonsWithScrollView.kt */
    /* loaded from: classes16.dex */
    public static final class c extends u1a<State, a> {
        public final h7v c;

        public c(b2a b2aVar, h7v h7vVar) {
            super(b2aVar);
            this.c = h7vVar;
        }

        @Override // xsna.u1a
        public final void g(a aVar) {
            CatalogLinkButtonActionDo catalogLinkButtonActionDo;
            a aVar2 = aVar;
            b2a b2aVar = (b2a) this.b.b;
            if (aVar2 instanceof a.C0447a) {
                CatalogButtonDo catalogButtonDo = (CatalogButtonDo) j5g.b0(((a.C0447a) aVar2).c, ((State) b2aVar.getCurrentState()).d);
                if (catalogButtonDo == null || (catalogLinkButtonActionDo = catalogButtonDo.c) == null) {
                    return;
                }
                if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenAuthorCabinet) {
                    v(new t0a.a(null, null, t0a.a.b.a, null, 11));
                }
                t(new r1a.a(catalogLinkButtonActionDo));
                return;
            }
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Hint hint = ((a.b) aVar2).c;
            this.c.b(hint.b);
            if (epx.f(((State) b2aVar.getCurrentState()).e, hint)) {
                m(new n());
            }
        }
    }

    /* compiled from: HorizontalButtonsWithScrollView.kt */
    public static final class d implements r2a {
        public final String b;
        public final ArrayList c;

        /* compiled from: HorizontalButtonsWithScrollView.kt */
        /* loaded from: classes16.dex */
        public static final class a {
            public final String a;
            public final Hint b;

            public a(String str, Hint hint) {
                this.a = str;
                this.b = hint;
            }

            public final Hint a() {
                return this.b;
            }

            public final String b() {
                return this.a;
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
                int hashCode = this.a.hashCode() * 31;
                Hint hint = this.b;
                return hashCode + (hint == null ? 0 : hint.b.hashCode());
            }

            public final String toString() {
                return "ButtonViewState(title=" + this.a + ", hint=" + this.b + ')';
            }
        }

        public d() {
            throw null;
        }

        public d(String str, ArrayList arrayList) {
            this.b = str;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return BlockId.Simple.b(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (BlockId.Simple.d(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", buttonViewStateList=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class e<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ rcv b;

        public e(rcv rcvVar) {
            this.b = rcvVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    public static void a(f1u f1uVar, final h7v h7vVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.HorizontalButtonsWithScroll;
        g2a g2aVar = new g2a(new yzs() { // from class: com.vk.catalog.mvi.block.impl.l
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
                CatalogBlockVariant catalogBlockVariant2 = (CatalogBlockVariant) obj3;
                List<CatalogButtonDto> e2 = catalogBlockDto.e();
                if (e2 == null) {
                    return null;
                }
                List<CatalogButtonDto> list = e2;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(p4a.c((CatalogButtonDto) it.next(), catalogBlockDto));
                }
                return new HorizontalButtonsWithScrollView.State(catalogBlockDto.getId(), catalogBlockVariant2, arrayList, h7v.this.p(HintId.CREATORS_DASHBOARD_WEBVIEW.getId()), null);
            }
        });
        rcv rcvVar = new rcv(h7vVar, 0);
        m mVar = new m();
        b bVar = new b();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(State.class, new e(rcvVar));
        f1uVar.h(State.class, mVar);
        f1uVar.g(d.class, bVar);
    }
}
