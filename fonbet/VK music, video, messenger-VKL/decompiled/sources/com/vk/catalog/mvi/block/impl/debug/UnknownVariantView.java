package com.vk.catalog.mvi.block.impl.debug;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.impl.debug.UnknownVariantView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.internal.api.GsonHolder;
import xsna.a8a;
import xsna.b2a;
import xsna.cp10;
import xsna.cri;
import xsna.dt1;
import xsna.epx;
import xsna.f1u;
import xsna.g2a;
import xsna.gzs;
import xsna.hr80;
import xsna.ja8;
import xsna.k9q0;
import xsna.l5g;
import xsna.mhy;
import xsna.n34;
import xsna.ne7;
import xsna.o2a;
import xsna.ojc;
import xsna.q1a;
import xsna.q630;
import xsna.qri;
import xsna.r2a;
import xsna.s1a;
import xsna.s200;
import xsna.s2a;
import xsna.s3q0;
import xsna.sy90;
import xsna.t1a;
import xsna.u1a;
import xsna.wzs;
import xsna.yqv0;

/* compiled from: UnknownVariantView.kt */
/* loaded from: classes16.dex */
public final class UnknownVariantView {

    /* compiled from: UnknownVariantView.kt */
    public static final class ViewState implements CatalogBlockState, r2a {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();
        public final BlockId.Unique b;
        public final CatalogBlockVariant c;
        public final CatalogBlockDto d;
        public final CatalogExtraResponseObjectDto e;

        /* compiled from: UnknownVariantView.kt */
        public static final class a implements Parcelable.Creator<ViewState> {
            @Override // android.os.Parcelable.Creator
            public final ViewState createFromParcel(Parcel parcel) {
                return new ViewState((BlockId.Unique) parcel.readParcelable(ViewState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (CatalogBlockDto) parcel.readParcelable(ViewState.class.getClassLoader()), (CatalogExtraResponseObjectDto) parcel.readParcelable(ViewState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ViewState[] newArray(int i) {
                return new ViewState[i];
            }
        }

        public ViewState(BlockId.Unique unique, CatalogBlockVariant catalogBlockVariant, CatalogBlockDto catalogBlockDto, CatalogExtraResponseObjectDto catalogExtraResponseObjectDto) {
            this.b = unique;
            this.c = catalogBlockVariant;
            this.d = catalogBlockDto;
            this.e = catalogExtraResponseObjectDto;
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
            return epx.f(this.b, viewState.b) && this.c == viewState.c && epx.f(this.d, viewState.d) && epx.f(this.e, viewState.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "ViewState(blockId=" + this.b + ", blockVariant=" + this.c + ", blockDto=" + this.d + ", extraDto=" + this.e + ')';
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
            parcel.writeParcelable(this.e, i);
        }
    }

    /* compiled from: UnknownVariantView.kt */
    public static final class a extends o2a<ViewState> {
        @Override // xsna.o2a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final void c(final a8a a8aVar, final ViewState viewState, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a M = aVar.M(2029029237);
            if ((i & 6) == 0) {
                i2 = (M.J(a8aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(viewState) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(q630Var) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2029029237, i2, -1, "com.vk.catalog.mvi.block.impl.debug.UnknownVariantView.BlockView.ContentImpl (UnknownVariantView.kt:61)");
                }
                final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                q630 m = hr80.m(a8aVar.a(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, 1, q630Var)), l5g.c(14, l5g.h, 0.25f), e.a);
                int i3 = i2 & 112;
                boolean y = (i3 == 32) | M.y(context);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (y || x == c0012a) {
                    x = new gzs() { // from class: com.vk.catalog.mvi.block.impl.debug.b
                        @Override // xsna.gzs
                        public final Object invoke() {
                            mhy.a(context, GsonHolder.a().toJson(UnknownVariantView.ViewState.this.e));
                            return s3q0.a;
                        }
                    };
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                boolean y2 = M.y(context) | (i3 == 32);
                Object x2 = M.x();
                if (y2 || x2 == c0012a) {
                    x2 = new gzs() { // from class: com.vk.catalog.mvi.block.impl.debug.c
                        @Override // xsna.gzs
                        public final Object invoke() {
                            mhy.a(context, GsonHolder.a().toJson(UnknownVariantView.ViewState.this.d));
                            return s3q0.a;
                        }
                    };
                    M.R(x2);
                }
                q630 D = s200.D(ojc.e(239, null, gzsVar, (gzs) x2, m), 16);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c = qri.c(M, D);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D2, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                CatalogBlockDto catalogBlockDto = viewState.d;
                aVar2 = M;
                yqv0.c("Unknown block: {" + catalogBlockDto.l0() + ", " + catalogBlockDto.n1().f() + ", " + catalogBlockDto.n1().i() + "}\nid = " + catalogBlockDto.getId() + "\n\nClick to copy block json to clipboard\nLong click to copy extra json to clipboard", null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar2, 0, 0, 16382);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2 = M;
                aVar2.h();
            }
            f s = aVar2.s();
            if (s != null) {
                s.d = new wzs() { // from class: com.vk.catalog.mvi.block.impl.debug.d
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        UnknownVariantView.a.this.c(a8aVar, viewState, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                };
            }
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class b<State extends CatalogBlockState> implements t1a {
        public static final b<State> b = new b<>();

        /* compiled from: CatalogBlockInlineActorFactory.kt */
        public static final class a extends u1a<State, q1a> {
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
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.UnknownBlock;
        g2a g2aVar = new g2a(new com.vk.catalog.mvi.block.impl.debug.a());
        a aVar = new a();
        f1uVar.a(catalogBlockVariant, g2aVar);
        f1uVar.c(ViewState.class, b.b);
        f1uVar.h(ViewState.class, c.b);
        f1uVar.g(ViewState.class, aVar);
    }
}
