package com.vk.catalog.mvi.block.impl.banner;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.hints.HintId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.b2a;
import xsna.bpn0;
import xsna.epx;
import xsna.f1u;
import xsna.g0t;
import xsna.g2a;
import xsna.izs;
import xsna.j26;
import xsna.oq;
import xsna.pla;
import xsna.q1a;
import xsna.q2a;
import xsna.q36;
import xsna.q630;
import xsna.r2a;
import xsna.r36;
import xsna.s1a;
import xsna.s200;
import xsna.s2a;
import xsna.s3q0;
import xsna.t1a;
import xsna.u1a;
import xsna.wvw;
import xsna.wzs;
import xsna.xzs;
import xsna.zcl;

/* compiled from: BannerView.kt */
/* loaded from: classes.dex */
public final class BannerView {

    /* compiled from: BannerView.kt */
    public static final class BannerViewState implements r2a, Parcelable {
        public static final Parcelable.Creator<BannerViewState> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final CatalogBlockVariant e;

        /* compiled from: BannerView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<BannerViewState> {
            @Override // android.os.Parcelable.Creator
            public final BannerViewState createFromParcel(Parcel parcel) {
                return new BannerViewState(((BlockId.Simple) parcel.readParcelable(BannerViewState.class.getClassLoader())).b, parcel.readString(), parcel.readString(), CatalogBlockVariant.valueOf(parcel.readString()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final BannerViewState[] newArray(int i) {
                return new BannerViewState[i];
            }
        }

        public BannerViewState(String str, String str2, String str3, CatalogBlockVariant catalogBlockVariant, zcl zclVar) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = catalogBlockVariant;
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
            parcel.writeString(this.e.name());
        }
    }

    /* compiled from: BannerView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final BannerViewState d;

        /* compiled from: BannerView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), BannerViewState.CREATOR.createFromParcel(parcel), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, BannerViewState bannerViewState, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = bannerViewState;
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
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", viewState=");
            sb.append(this.d);
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
            this.d.writeToParcel(parcel, i);
        }
    }

    /* compiled from: BannerView.kt */
    /* loaded from: classes16.dex */
    public interface a extends q1a {

        /* compiled from: BannerView.kt */
        /* renamed from: com.vk.catalog.mvi.block.impl.banner.BannerView$a$a, reason: collision with other inner class name */
        public static final class C0448a implements a {
            public final String b;
            public final HintId c;

            public C0448a(String str, HintId hintId) {
                this.b = str;
                this.c = hintId;
            }

            public final HintId a() {
                return this.c;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }
    }

    /* compiled from: BannerView.kt */
    public static final class b extends q2a<BannerViewState, a> {

        /* compiled from: BannerView.kt */
        /* loaded from: classes16.dex */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CatalogBlockVariant.values().length];
                try {
                    iArr[CatalogBlockVariant.PlaceholderBannerLibrary.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // xsna.q2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(a8a a8aVar, BannerViewState bannerViewState, izs<? super a, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.f fVar;
            wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
            androidx.compose.runtime.a M = aVar.M(1813152501);
            if ((i & 48) == 0) {
                i2 = (M.J(bannerViewState) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 145) != 144)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1813152501, i2, -1, "com.vk.catalog.mvi.block.impl.banner.BannerView.BlockView.ContentImpl (BannerView.kt:105)");
                }
                if (a.$EnumSwitchMapping$0[bannerViewState.e.ordinal()] != 1) {
                    if (oq.h(2118289159, M)) {
                        androidx.compose.runtime.b.e();
                    }
                    fVar = M.s();
                    if (fVar != null) {
                        wzsVar = new q36(this, a8aVar, bannerViewState, izsVar, q630Var, i);
                        fVar.l(wzsVar);
                    }
                    return;
                }
                M.K(2117759617);
                bpn0 bpn0Var = pla.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                float f = 16;
                j26.a(bannerViewState, ((wvw) bpn0Var.getValue()).b().a(HintId.INFO_ADDED_VIDEO_MOVED.getId()), izsVar, s200.G(q630.a.a, f, 12, f, f), M, (i2 & 896) | ((i2 >> 3) & 14));
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            fVar = M.s();
            if (fVar != null) {
                wzsVar = new r36(this, a8aVar, bannerViewState, izsVar, q630Var, i);
                fVar.l(wzsVar);
            }
        }
    }

    /* compiled from: BannerView.kt */
    public static final class c extends u1a<State, a> {
        @Override // xsna.u1a
        public final void g(a aVar) {
            a aVar2 = aVar;
            if (!(aVar2 instanceof a.C0448a)) {
                throw new NoWhenBranchMatchedException();
            }
            bpn0 bpn0Var = pla.a;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            ((wvw) bpn0Var.getValue()).b().b(((a.C0448a) aVar2).a().getId());
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class d<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ izs b;

        public d(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: BannerView.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<b2a, c> {
        public static final e b = new e(1, c.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final c invoke(b2a b2aVar) {
            return new c(b2aVar);
        }
    }

    /* compiled from: BannerView.kt */
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

    public static void a(f1u f1uVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.PlaceholderBannerLibrary;
        g2a g2aVar = new g2a(new com.vk.catalog.mvi.block.impl.banner.a());
        e eVar = e.b;
        f fVar = new f(com.vk.catalog.mvi.block.impl.banner.b.b);
        b bVar = new b();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(State.class, new d(eVar));
        f1uVar.h(State.class, fVar);
        f1uVar.g(BannerViewState.class, bVar);
    }
}
