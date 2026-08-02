package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.PlaceholderView;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonLinkDo;
import com.vk.catalog.mvi.section.domain.CatalogImageDo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.ahn;
import xsna.b2a;
import xsna.bo;
import xsna.cp10;
import xsna.cri;
import xsna.csa0;
import xsna.dn;
import xsna.dt1;
import xsna.e43;
import xsna.epx;
import xsna.f1u;
import xsna.fwu0;
import xsna.g0t;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.ja8;
import xsna.k9q0;
import xsna.ldv0;
import xsna.lg90;
import xsna.n34;
import xsna.ne7;
import xsna.q1a;
import xsna.q2a;
import xsna.q630;
import xsna.qri;
import xsna.r1a;
import xsna.r2a;
import xsna.s1a;
import xsna.s2a;
import xsna.s3q0;
import xsna.sy90;
import xsna.t1a;
import xsna.t8p0;
import xsna.txj0;
import xsna.u1a;
import xsna.vl20;
import xsna.wlb0;
import xsna.wra0;
import xsna.wzs;
import xsna.xzs;
import xsna.y48;
import xsna.yiz;
import xsna.zcl;
import xsna.zra0;

/* compiled from: PlaceholderView.kt */
/* loaded from: classes.dex */
public final class PlaceholderView {

    /* compiled from: PlaceholderView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final ViewState d;
        public final CatalogButtonLinkDo e;

        /* compiled from: PlaceholderView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), ViewState.CREATOR.createFromParcel(parcel), (CatalogButtonLinkDo) parcel.readParcelable(State.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, ViewState viewState, CatalogButtonLinkDo catalogButtonLinkDo, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = viewState;
            this.e = catalogButtonLinkDo;
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
            int hashCode = (this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31)) * 31;
            CatalogButtonLinkDo catalogButtonLinkDo = this.e;
            return hashCode + (catalogButtonLinkDo == null ? 0 : catalogButtonLinkDo.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", viewState=");
            sb.append(this.d);
            sb.append(", button=");
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
            this.d.writeToParcel(parcel, i);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: PlaceholderView.kt */
    public static final class ViewState implements r2a, Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final String b;
        public final List<CatalogImageDo> c;
        public final Float d;
        public final String e;
        public final String f;
        public final String g;

        /* compiled from: PlaceholderView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String str = ((BlockId.Simple) parcel.readParcelable(ViewState.class.getClassLoader())).b;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (i != readInt) {
                        i = bo.b(ViewState.class, parcel, arrayList, i, 1);
                    }
                }
                return new ViewState(str, arrayList, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString(), parcel.readString(), parcel.readString(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState() {
            throw null;
        }

        public ViewState(String str, List list, Float f, String str2, String str3, String str4, zcl zclVar) {
            this.b = str;
            this.c = list;
            this.d = f;
            this.e = str2;
            this.f = str3;
            this.g = str4;
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
            List<CatalogImageDo> list = this.c;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator f = dn.f(parcel, list, 1);
                while (f.hasNext()) {
                    parcel.writeParcelable((Parcelable) f.next(), i);
                }
            }
            Float f2 = this.d;
            if (f2 == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.d(parcel, 1, f2);
            }
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
        }
    }

    /* compiled from: PlaceholderView.kt */
    public static final class a extends q2a<ViewState, b> {
        @Override // xsna.q2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final ViewState viewState, final izs<? super b, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            final q630 q630Var2;
            q630 f;
            int i3;
            y48 y48Var;
            androidx.compose.runtime.a M = aVar.M(-892690549);
            if ((i & 6) == 0) {
                i2 = (M.J(a8aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(viewState) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                q630Var2 = q630Var;
                i2 |= M.J(q630Var2) ? 2048 : 1024;
            } else {
                q630Var2 = q630Var;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-892690549, i2, -1, "com.vk.catalog.mvi.block.impl.PlaceholderView.BlockView.ContentImpl (PlaceholderView.kt:123)");
                }
                f = txj0.f(q630Var2, 1.0f);
                q630 E = ahn.E(a8a.d(a8aVar, f, BlockId.Simple.a(viewState.b)), "mvi_catalog_placeholder");
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.a(), false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, E);
                cri.h7.getClass();
                LayoutNode.a b = cri.a.b();
                t8p0 t8p0Var = null;
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
                k9q0.w(M, d, cri.a.d());
                k9q0.w(M, D, cri.a.f());
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.c());
                k9q0.t(M, cri.a.a());
                k9q0.w(M, c, cri.a.e());
                List<CatalogImageDo> list = viewState.c;
                CatalogImageDo catalogImageDo = list != null ? (CatalogImageDo) j5g.k0(list) : null;
                if (catalogImageDo == null) {
                    M.K(-105764515);
                    M.j();
                    i3 = 256;
                } else {
                    M.K(-105764514);
                    lg90 l = fwu0.l(null, catalogImageDo.getUrl(), null, null, M, 0, 61);
                    long b2 = wlb0.h(M).getIcon().b();
                    Float f2 = viewState.d;
                    i3 = 256;
                    t8p0Var = csa0.a(l, b2, f2 != null ? yiz.o(f2.floatValue()) : 9205357640488583168L, null, null, M, 196616, 24);
                    M = M;
                    M.j();
                }
                t8p0 t8p0Var2 = t8p0Var;
                vl20 a = zra0.a.a(viewState.e, null, viewState.f, null, M, 196608, 26);
                String str = viewState.g;
                if (str == null) {
                    M.K(-105194983);
                    M.j();
                    y48Var = null;
                } else {
                    M.K(-105194982);
                    boolean z = ((i2 & 896) == i3) | ((i2 & 112) == 32);
                    Object x = M.x();
                    if (z || x == a.C0011a.a) {
                        x = new gzs() { // from class: com.vk.catalog.mvi.block.impl.x
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new PlaceholderView.b(viewState.b));
                                return s3q0.a;
                            }
                        };
                        M.R(x);
                    }
                    androidx.compose.runtime.a aVar2 = M;
                    M = aVar2;
                    y48 a2 = wra0.b.a(wra0.a.C3954a.a(str, (gzs) x, null, null, null, false, null, null, null, null, null, null, false, false, null, null, aVar2, 0, 12582912, 131068), null, null, M, 14);
                    M.j();
                    y48Var = a2;
                }
                androidx.compose.runtime.a aVar3 = M;
                ldv0.d(null, t8p0Var2, a, y48Var, null, null, false, aVar3, 0, 113);
                M = aVar3;
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: com.vk.catalog.mvi.block.impl.y
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        PlaceholderView.a.this.c(a8aVar, viewState, izsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: PlaceholderView.kt */
    /* loaded from: classes16.dex */
    public static final class b implements q1a {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return new BlockId.Simple(this.b);
        }
    }

    /* compiled from: PlaceholderView.kt */
    public static final class c extends u1a<State, b> {
        @Override // xsna.u1a
        public final void g(b bVar) {
            CatalogLinkButtonActionDo d;
            CatalogButtonLinkDo catalogButtonLinkDo = ((State) this.b.n()).e;
            if (catalogButtonLinkDo == null || (d = catalogButtonLinkDo.d()) == null) {
                return;
            }
            t(new r1a.a(d));
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

    /* compiled from: PlaceholderView.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<b2a, c> {
        public static final e b = new e(1, c.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final c invoke(b2a b2aVar) {
            return new c(b2aVar);
        }
    }

    /* compiled from: PlaceholderView.kt */
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
        List l = e43.l(CatalogBlockVariant.PlaceholderLibrary, CatalogBlockVariant.PlaceholderChannel, CatalogBlockVariant.PlaceHolderBig);
        w wVar = new w();
        e eVar = e.b;
        f fVar = new f(z.b);
        a aVar = new a();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            f1uVar.a((CatalogBlockVariant) it.next(), wVar);
        }
        f1uVar.c(State.class, new d(eVar));
        f1uVar.h(State.class, fVar);
        f1uVar.g(ViewState.class, aVar);
    }
}
