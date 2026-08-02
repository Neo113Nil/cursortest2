package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogLinkDo;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.b2a;
import xsna.epx;
import xsna.f1u;
import xsna.fwu0;
import xsna.g2a;
import xsna.gzs;
import xsna.izs;
import xsna.mcc0;
import xsna.ojc;
import xsna.phw;
import xsna.q1a;
import xsna.q2a;
import xsna.q630;
import xsna.r1a;
import xsna.r2a;
import xsna.rp1;
import xsna.s1a;
import xsna.s3q0;
import xsna.t0a;
import xsna.t1a;
import xsna.td10;
import xsna.u1a;
import xsna.wiu0;
import xsna.zcl;

/* compiled from: OpenSectionArrowButtonView.kt */
/* loaded from: classes.dex */
public final class OpenSectionArrowButtonView {

    /* compiled from: OpenSectionArrowButtonView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final CatalogLinkDo d;

        /* compiled from: OpenSectionArrowButtonView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(((BlockId.Simple) parcel.readParcelable(State.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), (CatalogLinkDo) parcel.readParcelable(State.class.getClassLoader()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(String str, CatalogBlockVariant catalogBlockVariant, CatalogLinkDo catalogLinkDo, zcl zclVar) {
            this.b = str;
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
            return BlockId.Simple.b(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", link=");
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
            parcel.writeParcelable(this.d, i);
        }
    }

    /* compiled from: OpenSectionArrowButtonView.kt */
    public static final class a extends q2a<d, b> {
        @Override // xsna.q2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(a8a a8aVar, d dVar, izs<? super b, s3q0> izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(-182071043);
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
                    androidx.compose.runtime.b.f(-182071043, i2, -1, "com.vk.catalog.mvi.block.impl.OpenSectionArrowButtonView.BlockView.ContentImpl (OpenSectionArrowButtonView.kt:152)");
                }
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new rp1(14, izsVar, dVar);
                    M.R(x);
                }
                wiu0.b(ojc.c(q630Var, false, null, null, (gzs) x, 15), false, com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(null, dVar.c, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252), Cell$Middle.a.a(Cell$Middle.d.b.a(dVar.d, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(dVar.e, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28), o.b.a.a(null, null, 0L, false, M, 196608, 31), null, null, M, 0, 98);
                aVar2 = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            androidx.compose.runtime.f s = aVar2.s();
            if (s != null) {
                s.l(new td10(this, a8aVar, dVar, izsVar, q630Var, i));
            }
        }
    }

    /* compiled from: OpenSectionArrowButtonView.kt */
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

    /* compiled from: OpenSectionArrowButtonView.kt */
    public static final class c extends u1a<State, b> {
        @Override // xsna.u1a
        public final void g(b bVar) {
            mcc0 mcc0Var = this.b;
            String url = ((State) mcc0Var.n()).d.getUrl();
            String r = ((State) mcc0Var.n()).d.r();
            String d = ((State) mcc0Var.n()).d.d();
            v(new t0a.a(r, url, d != null ? new t0a.a.C3709a(d) : null, null, 8));
            t(new r1a.b(((State) mcc0Var.n()).d.getUrl(), ((State) mcc0Var.n()).d.r()));
        }
    }

    /* compiled from: OpenSectionArrowButtonView.kt */
    public static final class d implements r2a {
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public d(String str, String str2, String str3, String str4) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
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

    /* compiled from: OpenSectionArrowButtonView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b2a, c> {
        public static final f b = new f(1, c.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final c invoke(b2a b2aVar) {
            return new c(b2aVar);
        }
    }

    public static void a(f1u f1uVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.OpenSectionArrowButton;
        g2a g2aVar = new g2a(new s());
        f fVar = f.b;
        u uVar = new u();
        a aVar = new a();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(State.class, new e(fVar));
        f1uVar.h(State.class, uVar);
        f1uVar.g(d.class, aVar);
    }
}
