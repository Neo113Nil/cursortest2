package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.catalog.mvi.domain.CatalogLinkActionStyle;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogButtonDo;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.a;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import xsna.a8a;
import xsna.ahn;
import xsna.b2a;
import xsna.epx;
import xsna.f1u;
import xsna.g0t;
import xsna.g2a;
import xsna.gzs;
import xsna.hyu;
import xsna.ikg0;
import xsna.izs;
import xsna.ln50;
import xsna.m7a;
import xsna.ne7;
import xsna.q1a;
import xsna.q2a;
import xsna.q630;
import xsna.qn50;
import xsna.r1a;
import xsna.r2a;
import xsna.s1a;
import xsna.s2a;
import xsna.s3q0;
import xsna.t1a;
import xsna.u1a;
import xsna.wzs;
import xsna.xzs;
import xsna.z5b;
import xsna.zcl;
import xsna.zdf;

/* compiled from: HeaderView.kt */
/* loaded from: classes.dex */
public final class HeaderView {

    /* compiled from: HeaderView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final ViewState d;
        public final CatalogButtonDo e;

        /* compiled from: HeaderView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), ViewState.CREATOR.createFromParcel(parcel), (CatalogButtonDo) parcel.readParcelable(State.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, ViewState viewState, CatalogButtonDo catalogButtonDo, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = viewState;
            this.e = catalogButtonDo;
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
            CatalogButtonDo catalogButtonDo = this.e;
            return hashCode + (catalogButtonDo == null ? 0 : catalogButtonDo.hashCode());
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

    /* compiled from: HeaderView.kt */
    public static final class ViewState implements r2a, Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final CatalogLinkActionStyle e;
        public final boolean f;

        /* compiled from: HeaderView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState(((BlockId.Simple) parcel.readParcelable(ViewState.class.getClassLoader())).b, parcel.readString(), parcel.readString(), (CatalogLinkActionStyle) parcel.readParcelable(ViewState.class.getClassLoader()), parcel.readInt() != 0, null);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState(String str, String str2, String str3, CatalogLinkActionStyle catalogLinkActionStyle, boolean z, zcl zclVar) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = catalogLinkActionStyle;
            this.f = z;
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
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    /* compiled from: HeaderView.kt */
    public static final class a extends q2a<ViewState, b> {
        @Override // xsna.q2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final ViewState viewState, final izs<? super b, s3q0> izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(1526827683);
            if ((i & 48) == 0) {
                i2 = (M.J(viewState) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(q630Var) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1526827683, i2, -1, "com.vk.catalog.mvi.block.impl.HeaderView.BlockView.ContentImpl (HeaderView.kt:182)");
                }
                ButtonAppearance buttonAppearance = epx.f(viewState.e, CatalogLinkActionStyle.Secondary.b) ? ButtonAppearance.Neutral : ButtonAppearance.Accent;
                com.vk.core.compose.component.group.header.b bVar = viewState.f ? b.C0749b.a : b.c.a;
                q630 E = ahn.E(q630Var, "mvi_catalog_header_test_tag");
                ikg0 ikg0Var = null;
                aVar2 = M;
                com.vk.core.compose.component.group.header.a a = a.C0748a.a(f.a.a(viewState.c, null, null, null, null, null, null, null, false, M, 805306368, 510), aVar2);
                String str = viewState.d;
                if (str == null) {
                    aVar2.K(2020773179);
                } else {
                    aVar2.K(2020773180);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new hyu(0);
                        aVar2.R(x);
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                    boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                    Object x2 = aVar2.x();
                    if (z || x2 == c0012a) {
                        x2 = new gzs() { // from class: com.vk.catalog.mvi.block.impl.c
                            @Override // xsna.gzs
                            public final Object invoke() {
                                izs.this.invoke(new HeaderView.b(viewState.b));
                                return s3q0.a;
                            }
                        };
                        aVar2.R(x2);
                    }
                    GroupHeader$Right.a.C0743a a3 = GroupHeader$Right.a.C0743a.C0744a.a(str, (gzs) x2, null, null, buttonAppearance, null, a2, aVar2, 0, 16364);
                    aVar2 = aVar2;
                    ikg0Var = GroupHeader$Right.c.a(a3, null, null, null, aVar2, 14);
                }
                aVar2.j();
                com.vk.core.compose.component.group.header.g.a(a, E, bVar, null, ikg0Var, false, aVar2, 0, 104);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.l(new wzs() { // from class: com.vk.catalog.mvi.block.impl.d
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        HeaderView.a.this.c(a8aVar, viewState, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: HeaderView.kt */
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

    /* compiled from: HeaderView.kt */
    /* loaded from: classes16.dex */
    public static final class c extends u1a<State, b> {
        public final m7a c;

        public c(b2a b2aVar, m7a m7aVar) {
            super(b2aVar);
            this.c = m7aVar;
        }

        @Override // xsna.u1a
        public final void g(b bVar) {
            CatalogLinkButtonActionDo catalogLinkButtonActionDo;
            CatalogButtonDo catalogButtonDo = ((State) ((b2a) this.b.b).getCurrentState()).e;
            if (catalogButtonDo == null || (catalogLinkButtonActionDo = catalogButtonDo.c) == null) {
                return;
            }
            if (!(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.SwitchSection)) {
                t(new r1a.a(catalogLinkButtonActionDo));
                return;
            }
            CatalogLinkButtonActionDo.SwitchSection switchSection = (CatalogLinkButtonActionDo.SwitchSection) catalogLinkButtonActionDo;
            e(new qn50(0), ln50.a.b, new z5b(this, switchSection.b, switchSection.c, 3));
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class d<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ zdf b;

        public d(zdf zdfVar) {
            this.b = zdfVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: HeaderView.kt */
    public static final class e implements s2a, g0t {
        public final /* synthetic */ izs b;

        public e(izs izsVar) {
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

    public static void a(f1u f1uVar, m7a m7aVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.Header;
        g2a g2aVar = new g2a(new com.vk.catalog.mvi.block.impl.a());
        zdf zdfVar = new zdf(m7aVar, 3);
        e eVar = new e(f.b);
        a aVar = new a();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(State.class, new d(zdfVar));
        f1uVar.h(State.class, eVar);
        f1uVar.g(ViewState.class, aVar);
    }
}
