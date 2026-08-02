package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.SeparatorView;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import xsna.a8a;
import xsna.b2a;
import xsna.f1u;
import xsna.g2a;
import xsna.jqu0;
import xsna.ne7;
import xsna.o2a;
import xsna.q1a;
import xsna.q630;
import xsna.r2a;
import xsna.s1a;
import xsna.s200;
import xsna.s2a;
import xsna.s3q0;
import xsna.t1a;
import xsna.u1a;
import xsna.wzs;
import xsna.zcl;

/* compiled from: SeparatorView.kt */
/* loaded from: classes.dex */
public final class SeparatorView {

    /* compiled from: SeparatorView.kt */
    public static final class ViewState implements CatalogBlockState, r2a {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;

        /* compiled from: SeparatorView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState(((BlockId.Simple) parcel.readParcelable(ViewState.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), null);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState(String str, CatalogBlockVariant catalogBlockVariant, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
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
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return BlockId.Simple.b(this.b, viewState.b) && this.c == viewState.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (BlockId.Simple.d(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
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
        }
    }

    /* compiled from: SeparatorView.kt */
    public static final class a extends o2a<ViewState> {
        @Override // xsna.o2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final ViewState viewState, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-247581506);
            if ((i & 384) == 0) {
                i2 = (M.J(q630Var) ? 256 : 128) | i;
            } else {
                i2 = i;
            }
            if (M.t(i2 & 1, (i2 & 129) != 128)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-247581506, i2, -1, "com.vk.catalog.mvi.block.impl.SeparatorView.BlockView.ContentImpl (SeparatorView.kt:47)");
                }
                float f = 16;
                jqu0.a(s200.H(q630Var, f, 8, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 14);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: com.vk.catalog.mvi.block.impl.e0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        SeparatorView.a.this.c(a8aVar, viewState, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class b<State extends CatalogBlockState> implements t1a {
        public static final b<State> b = new b<>();

        /* compiled from: CatalogBlockInlineActorFactory.kt */
        /* loaded from: classes16.dex */
        public static final class a extends u1a<State, q1a> {
            public a(b2a b2aVar) {
                super(b2aVar);
            }

            @Override // xsna.u1a
            public final void g(q1a q1aVar) {
                throw new IllegalStateException(("Empty actor, registered for state " + ViewState.class.getCanonicalName() + ", trying to handle action " + q1aVar).toString());
            }
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return new a(b2aVar);
        }
    }

    /* compiled from: CatalogBlockViewStateMapper.kt */
    public static final class c<State extends CatalogBlockState, Vs extends r2a> implements s2a {
        public static final c<State, Vs> b = new c<>();

        @Override // xsna.s2a
        public final r2a a(CatalogBlockState catalogBlockState) {
            return (r2a) catalogBlockState;
        }
    }

    public static void a(f1u f1uVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.Separator;
        g2a g2aVar = new g2a(new d0());
        a aVar = new a();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(ViewState.class, b.b);
        f1uVar.h(ViewState.class, c.b);
        f1uVar.g(ViewState.class, aVar);
    }
}
