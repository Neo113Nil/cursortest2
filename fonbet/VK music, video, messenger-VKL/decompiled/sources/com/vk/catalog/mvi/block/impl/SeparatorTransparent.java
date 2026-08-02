package com.vk.catalog.mvi.block.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.SeparatorTransparent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import xsna.a8a;
import xsna.b2a;
import xsna.f1u;
import xsna.f9t;
import xsna.g2a;
import xsna.ne7;
import xsna.o2a;
import xsna.q1a;
import xsna.q630;
import xsna.r2a;
import xsna.s1a;
import xsna.s2a;
import xsna.s3q0;
import xsna.t1a;
import xsna.txj0;
import xsna.u1a;
import xsna.vu5;
import xsna.wzs;
import xsna.zcl;

/* compiled from: SeparatorTransparent.kt */
/* loaded from: classes.dex */
public final class SeparatorTransparent {

    /* compiled from: SeparatorTransparent.kt */
    public static final class ViewState implements CatalogBlockState, r2a {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final String b;
        public final CatalogBlockVariant c;
        public final int d;

        /* compiled from: SeparatorTransparent.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState(((BlockId.Simple) parcel.readParcelable(ViewState.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), parcel.readInt(), null);
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState(String str, CatalogBlockVariant catalogBlockVariant, int i, zcl zclVar) {
            this.b = str;
            this.c = catalogBlockVariant;
            this.d = i;
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
            return BlockId.Simple.b(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(blockId=");
            io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
            sb.append(this.c);
            sb.append(", separatorSize=");
            return vu5.b(sb, this.d, ')');
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return BlockId.Simple.a(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(BlockId.Simple.a(this.b), i);
            parcel.writeString(this.c.name());
            parcel.writeInt(this.d);
        }
    }

    /* compiled from: SeparatorTransparent.kt */
    public static final class a extends o2a<ViewState> {
        @Override // xsna.o2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final ViewState viewState, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1671390304);
            if ((i & 48) == 0) {
                i2 = (M.J(viewState) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(q630Var) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 145) != 144)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1671390304, i2, -1, "com.vk.catalog.mvi.block.impl.SeparatorTransparent.BlockView.ContentImpl (SeparatorTransparent.kt:58)");
                }
                f9t.e(txj0.h(q630Var, viewState.d), M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.l(new wzs() { // from class: com.vk.catalog.mvi.block.impl.c0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        SeparatorTransparent.a.this.c(a8aVar, viewState, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: SeparatorTransparent.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogLayoutDto.SizeDto.values().length];
            try {
                iArr[CatalogLayoutDto.SizeDto.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogLayoutDto.SizeDto.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogLayoutDto.SizeDto.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogLayoutDto.SizeDto.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogLayoutDto.SizeDto.EXTRA_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogLayoutDto.SizeDto.NO_INSETS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class c<State extends CatalogBlockState> implements t1a {
        public static final c<State> b = new c<>();

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
    public static final class d<State extends CatalogBlockState, Vs extends r2a> implements s2a {
        public static final d<State, Vs> b = new d<>();

        @Override // xsna.s2a
        public final r2a a(CatalogBlockState catalogBlockState) {
            return (r2a) catalogBlockState;
        }
    }

    public static void a(f1u f1uVar) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.SeparatorTransparent;
        g2a g2aVar = new g2a(new b0());
        a aVar = new a();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(ViewState.class, c.b);
        f1uVar.h(ViewState.class, d.b);
        f1uVar.g(ViewState.class, aVar);
    }
}
