package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.LinksSmallListView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.h1;
import com.vk.core.compose.component.cell.content.o;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.b2a;
import xsna.epx;
import xsna.f1u;
import xsna.fwu0;
import xsna.gzs;
import xsna.izs;
import xsna.mcc0;
import xsna.ojc;
import xsna.q1a;
import xsna.q2a;
import xsna.q630;
import xsna.qg1;
import xsna.r1a;
import xsna.r2a;
import xsna.s1a;
import xsna.s3q0;
import xsna.t1a;
import xsna.u1a;
import xsna.wiu0;
import xsna.wzs;

/* compiled from: LinksSmallListView.kt */
/* loaded from: classes.dex */
public final class LinksSmallListView {

    /* compiled from: LinksSmallListView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final BlockId.CompositeId b;
        public final CatalogBlockVariant c;
        public final CatalogLinkDo d;

        /* compiled from: LinksSmallListView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State((BlockId.CompositeId) parcel.readParcelable(State.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (CatalogLinkDo) parcel.readParcelable(State.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, CatalogLinkDo catalogLinkDo) {
            this.b = compositeId;
            this.c = catalogBlockVariant;
            this.d = catalogLinkDo;
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
            return epx.f(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            return "State(blockId=" + this.b + ", blockVariant=" + this.c + ", link=" + this.d + ')';
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
        }
    }

    /* compiled from: LinksSmallListView.kt */
    public static final class a extends q2a<d, b> {
        @Override // xsna.q2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final d dVar, final izs<? super b, s3q0> izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1265947227);
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
            if (M.t(i2 & 1, (i2 & 1169) != 1168)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1265947227, i2, -1, "com.vk.catalog.mvi.block.impl.LinksSmallListView.BlockView.ContentImpl (LinksSmallListView.kt:100)");
                }
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new qg1(14, izsVar, dVar);
                    M.R(x);
                }
                q630 c = ojc.c(q630Var, false, null, null, (gzs) x, 15);
                com.vk.core.compose.component.cell.content.x a = com.vk.core.compose.component.cell.content.f.a(fwu0.l(null, dVar.d, null, null, M, 0, 61), Cell$Left.Main.Size.Small, 0L, null, null, M, 196664, 28);
                h1 a2 = Cell$Middle.d.b.a(dVar.c, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                Cell$Middle.Size size = Cell$Middle.Size.Medium;
                wiu0.b(c, false, a, Cell$Middle.a.a(a2, null, null, null, M, 199680, 22), o.b.a.a(null, null, 0L, false, M, 196608, 31), null, null, M, 0, 98);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: xsna.wdz
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        LinksSmallListView.a.this.c(a8aVar, dVar, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: LinksSmallListView.kt */
    /* loaded from: classes16.dex */
    public static final class b implements q1a {
        public final BlockId.CompositeId b;

        public b(BlockId.CompositeId compositeId) {
            this.b = compositeId;
        }

        @Override // xsna.q1a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: LinksSmallListView.kt */
    public static final class c extends u1a<State, b> {
        @Override // xsna.u1a
        public final void g(b bVar) {
            mcc0 mcc0Var = this.b;
            t(new r1a.b(((State) mcc0Var.n()).d.getUrl(), ((State) mcc0Var.n()).d.r()));
        }
    }

    /* compiled from: LinksSmallListView.kt */
    public static final class d implements r2a {
        public final BlockId.CompositeId b;
        public final String c;
        public final String d;

        public d(BlockId.CompositeId compositeId, String str, String str2) {
            this.b = compositeId;
            this.c = str;
            this.d = str2;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class e<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ izs b;

        public e(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: LinksSmallListView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b2a, c> {
        public static final f b = new f(1, c.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final c invoke(b2a b2aVar) {
            return new c(b2aVar);
        }
    }

    public static void a(f1u f1uVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.LinksSmallList;
        r rVar = new r();
        f fVar = f.b;
        q qVar = new q();
        a aVar = new a();
        f1uVar.a(catalogBlockVariant, rVar);
        f1uVar.c(State.class, new e(fVar));
        f1uVar.h(State.class, qVar);
        f1uVar.g(d.class, aVar);
    }
}
