package com.vk.catalog.mvi.block.video.impl.catalog.banner;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.movika.sdk.base.ui.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a8a;
import xsna.ahn;
import xsna.b2a;
import xsna.b6l;
import xsna.bap;
import xsna.c1q;
import xsna.epx;
import xsna.f1u;
import xsna.fpf0;
import xsna.fxc0;
import xsna.g0t;
import xsna.g2a;
import xsna.in50;
import xsna.izs;
import xsna.j1a;
import xsna.k1a;
import xsna.ksr;
import xsna.ln50;
import xsna.m1a;
import xsna.m2a;
import xsna.q1a;
import xsna.q630;
import xsna.r2a;
import xsna.s1a;
import xsna.s2a;
import xsna.s3q0;
import xsna.smk;
import xsna.spj;
import xsna.t1a;
import xsna.tyr0;
import xsna.u1a;
import xsna.vyr0;
import xsna.wzs;
import xsna.xzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: CatalogBannerView.kt */
/* loaded from: classes.dex */
public final class CatalogBannerView {

    /* compiled from: CatalogBannerView.kt */
    public static final class BannerViewState implements r2a, Parcelable {
        public static final Parcelable.Creator<BannerViewState> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final CatalogBlockVariant f;

        /* compiled from: CatalogBannerView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<BannerViewState> {
            @Override // android.os.Parcelable.Creator
            public final BannerViewState createFromParcel(Parcel parcel) {
                return new BannerViewState(((BlockId.Simple) parcel.readParcelable(BannerViewState.class.getClassLoader())).b, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CatalogBlockVariant.valueOf(parcel.readString()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final BannerViewState[] newArray(int i) {
                return new BannerViewState[i];
            }
        }

        public BannerViewState(String str, String str2, String str3, String str4, CatalogBlockVariant catalogBlockVariant, zcl zclVar) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = catalogBlockVariant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(BlockId.Simple.a(this.b), i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            CatalogBlockVariant catalogBlockVariant = this.f;
            if (catalogBlockVariant == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(catalogBlockVariant.name());
            }
        }
    }

    /* compiled from: CatalogBannerView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final String d;
        public final BannerViewState e;

        /* compiled from: CatalogBannerView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), parcel.readString(), BannerViewState.CREATOR.createFromParcel(parcel), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, String str2, BannerViewState bannerViewState, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = str2;
            this.e = bannerViewState;
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
            int b = io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
            String str = this.d;
            return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", blockIdToHide=");
            sb.append(this.d);
            sb.append(", viewState=");
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
            parcel.writeString(this.d);
            this.e.writeToParcel(parcel, i);
        }
    }

    /* compiled from: CatalogBannerView.kt */
    public static final class a extends m2a<BannerViewState, b, c> {
        public final com.vk.libvideo.adfree.api.di.a b;
        public final tyr0 c;

        /* compiled from: CatalogBannerView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView$BlockView$ContentImpl$1$1", f = "CatalogBannerView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView$a$a, reason: collision with other inner class name */
        /* loaded from: classes16.dex */
        public static final class C0457a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;

            public C0457a(spj<? super C0457a> spjVar) {
                super(2, spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return a.this.new C0457a(spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C0457a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                a.this.c.b();
                return s3q0.a;
            }
        }

        /* compiled from: CatalogBannerView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView$BlockView$ContentImpl$2$1", f = "CatalogBannerView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes16.dex */
        public static final class b extends SuspendLambda implements wzs<c, spj<? super s3q0>, Object> {
            final /* synthetic */ Context $context;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                b bVar = a.this.new b(this.$context, spjVar);
                bVar.L$0 = obj;
                return bVar;
            }

            @Override // xsna.wzs
            public final Object invoke(c cVar, spj<? super s3q0> spjVar) {
                return ((b) create(cVar, spjVar)).invokeSuspend(s3q0.a);
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
                a.this.b.b(this.$context, ((c.a) cVar).b);
                return s3q0.a;
            }
        }

        /* compiled from: CatalogBannerView.kt */
        /* loaded from: classes16.dex */
        public static final /* synthetic */ class c {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CatalogBlockVariant.values().length];
                try {
                    iArr[CatalogBlockVariant.CatalogBannersVideoSubAdsOffClose.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(com.vk.libvideo.adfree.api.di.a aVar, tyr0 tyr0Var) {
            super(fpf0.a(c.class));
            this.b = aVar;
            this.c = tyr0Var;
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(a8a a8aVar, BannerViewState bannerViewState, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1602441268);
            if ((i & 48) == 0) {
                i2 = (M.J(bannerViewState) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(ksrVar) ? 2048 : 1024;
            }
            if ((196608 & i) == 0) {
                i2 |= M.J(this) ? 131072 : 65536;
            }
            if (M.t(i2 & 1, (66705 & i2) != 66704)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1602441268, i2, -1, "com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView.BlockView.ContentImpl (CatalogBannerView.kt:172)");
                }
                CatalogBlockVariant catalogBlockVariant = bannerViewState.f;
                if ((catalogBlockVariant != null ? c.$EnumSwitchMapping$0[catalogBlockVariant.ordinal()] : -1) == 1) {
                    M.K(234079024);
                    if (fxc0.B().J().U0()) {
                        M.K(234164956);
                        Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
                        s3q0 s3q0Var = s3q0.a;
                        int i3 = 458752 & i2;
                        boolean z = i3 == 131072;
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z || x == c0012a) {
                            x = new C0457a(null);
                            M.R(x);
                        }
                        bap.g(s3q0Var, (wzs) x, M, 6);
                        boolean y = M.y(context) | (i3 == 131072);
                        Object x2 = M.x();
                        if (y || x2 == c0012a) {
                            x2 = new b(context, null);
                            M.R(x2);
                        }
                        c1q.a(ksrVar, (wzs) x2, M, (i2 >> 9) & 14);
                        int i4 = i2 >> 3;
                        m1a.a(bannerViewState, izsVar, ahn.E(q630.a.a, "catalog_banner_ad_free_sub_test_tag"), M, (i4 & 112) | (i4 & 14) | 384);
                    } else {
                        M.K(226690422);
                    }
                    M.j();
                    M.j();
                } else {
                    M.K(1947245360);
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
                s.l(new k1a(this, a8aVar, bannerViewState, izsVar, ksrVar, q630Var, i));
            }
        }
    }

    /* compiled from: CatalogBannerView.kt */
    /* loaded from: classes16.dex */
    public interface b extends q1a {

        /* compiled from: CatalogBannerView.kt */
        public static final class a implements b {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: CatalogBannerView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView$b$b, reason: collision with other inner class name */
        public static final class C0458b implements b {
            public final String b;

            public C0458b(String str) {
                this.b = str;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: CatalogBannerView.kt */
    public interface c extends smk {

        /* compiled from: CatalogBannerView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements c {
            public final BlockId.Simple a;
            public final String b;

            public a(BlockId.Simple simple, String str) {
                this.a = simple;
                this.b = str;
            }

            @Override // xsna.smk
            public final BlockId w() {
                return this.a;
            }
        }
    }

    /* compiled from: CatalogBannerView.kt */
    /* loaded from: classes16.dex */
    public static final class d extends u1a<State, b> {
        public final vyr0 c;
        public final tyr0 d;

        public d(b2a b2aVar, vyr0 vyr0Var, tyr0 tyr0Var) {
            super(b2aVar);
            this.c = vyr0Var;
            this.d = tyr0Var;
        }

        @Override // xsna.u1a
        public final void g(b bVar) {
            b bVar2 = bVar;
            boolean z = bVar2 instanceof b.a;
            tyr0 tyr0Var = this.d;
            if (z) {
                tyr0Var.c();
                e(new in50(fpf0.a(b.a.class)), ln50.a.b, new s0(3, this, bVar2));
                return;
            }
            if (!(bVar2 instanceof b.C0458b)) {
                throw new NoWhenBranchMatchedException();
            }
            tyr0Var.k();
            this.c.c(null);
            String str = ((State) ((b2a) this.b.b).getCurrentState()).d;
            if (str != null) {
                a(str);
            }
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class e<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ j1a b;

        public e(j1a j1aVar) {
            this.b = j1aVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: CatalogBannerView.kt */
    public static final class f implements s2a, g0t {
        public final /* synthetic */ izs b;

        public f(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.s2a
        public final /* synthetic */ r2a a(CatalogBlockState catalogBlockState) {
            return (r2a) this.b.invoke(catalogBlockState);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof s2a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static void a(f1u f1uVar, vyr0 vyr0Var, com.vk.libvideo.adfree.api.di.a aVar, tyr0 tyr0Var) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.CatalogBannersVideoSubAdsOffClose;
        g2a g2aVar = new g2a(new com.vk.catalog.mvi.block.video.impl.catalog.banner.a());
        j1a j1aVar = new j1a(vyr0Var, tyr0Var);
        f fVar = new f(com.vk.catalog.mvi.block.video.impl.catalog.banner.d.b);
        a aVar2 = new a(aVar, tyr0Var);
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(State.class, new e(j1aVar));
        f1uVar.h(State.class, fVar);
        f1uVar.g(BannerViewState.class, aVar2);
    }
}
