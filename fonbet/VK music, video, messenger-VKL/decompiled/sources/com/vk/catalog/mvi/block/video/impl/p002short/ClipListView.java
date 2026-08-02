package com.vk.catalog.mvi.block.video.impl.p002short;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.c;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.b2a;
import xsna.bh10;
import xsna.cg50;
import xsna.dai;
import xsna.egi0;
import xsna.epx;
import xsna.f1u;
import xsna.fcy;
import xsna.fet0;
import xsna.fk;
import xsna.fpf0;
import xsna.g7s0;
import xsna.gzs;
import xsna.izs;
import xsna.j7d;
import xsna.jq;
import xsna.k22;
import xsna.ksr;
import xsna.m2a;
import xsna.mmc;
import xsna.nmc;
import xsna.pls0;
import xsna.pvo0;
import xsna.q1a;
import xsna.q630;
import xsna.qni0;
import xsna.qoy;
import xsna.qwe;
import xsna.r2a;
import xsna.rh4;
import xsna.s1a;
import xsna.s200;
import xsna.t0a;
import xsna.t1a;
import xsna.txj0;
import xsna.u1a;
import xsna.v630;
import xsna.vu5;

/* compiled from: ClipListView.kt */
/* loaded from: classes16.dex */
public final class ClipListView {

    /* compiled from: ClipListView.kt */
    public static final class ClipListState implements CatalogBlockState {
        public static final Parcelable.Creator<ClipListState> CREATOR = new a();
        public final BlockId.CompositeId b;
        public final CatalogBlockVariant c;
        public final String d;
        public final VideoFile e;
        public final boolean f;

        /* compiled from: ClipListView.kt */
        public static final class a implements Parcelable.Creator<ClipListState> {
            @Override // android.os.Parcelable.Creator
            public final ClipListState createFromParcel(Parcel parcel) {
                return new ClipListState((BlockId.CompositeId) parcel.readParcelable(ClipListState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), parcel.readString(), (VideoFile) parcel.readParcelable(ClipListState.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ClipListState[] newArray(int i) {
                return new ClipListState[i];
            }
        }

        public ClipListState(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, String str, VideoFile videoFile, boolean z) {
            this.b = compositeId;
            this.c = catalogBlockVariant;
            this.d = str;
            this.e = videoFile;
            this.f = z;
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
            if (!(obj instanceof ClipListState)) {
                return false;
            }
            ClipListState clipListState = (ClipListState) obj;
            return epx.f(this.b, clipListState.b) && this.c == clipListState.c && epx.f(this.d, clipListState.d) && epx.f(this.e, clipListState.e) && this.f == clipListState.f;
        }

        public final int hashCode() {
            int b = io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31);
            String str = this.d;
            return Boolean.hashCode(this.f) + jq.b(this.e, (b + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipListState(blockId=");
            sb.append(this.b);
            sb.append(", blockVariant=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            sb.append(this.d);
            sb.append(", file=");
            sb.append(this.e);
            sb.append(", isPinnedIconVisible=");
            return q0.a(sb, this.f, ')');
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
            parcel.writeInt(this.f ? 1 : 0);
        }
    }

    /* compiled from: ClipListView.kt */
    public static final class a extends m2a<c, b, com.vk.catalog.mvi.block.video.impl.p002short.c> {
        public final boolean b;

        /* compiled from: ClipListView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.short.ClipListView$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0462a extends FunctionReferenceImpl implements gzs<Long> {
            @Override // xsna.gzs
            public final Long invoke() {
                return Long.valueOf(qni0.a());
            }
        }

        public a(boolean z) {
            super(fpf0.a(com.vk.catalog.mvi.block.video.impl.p002short.c.class));
            this.b = z;
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(a8a a8aVar, c cVar, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            nmc nmcVar = cVar.e;
            PreviewViewState previewViewState = nmcVar.a;
            androidx.compose.runtime.a M = aVar.M(2032985733);
            if ((i & 6) == 0) {
                i2 = (M.J(a8aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(cVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.J(ksrVar) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= M.J(q630Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= M.J(this) ? 131072 : 65536;
            }
            if (M.t(i2 & 1, (74899 & i2) != 74898)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2032985733, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.ClipListView.BlockView.ContentImpl (ClipListView.kt:317)");
                }
                com.vk.catalog.mvi.block.video.impl.p002short.d.a(ksrVar, M, (i2 >> 9) & 14);
                q630 v = this.b ? txj0.v(q630Var, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE) : a8aVar.a(s200.D(q630Var, 1));
                PreviewViewState.z zVar = previewViewState.d;
                PreviewViewState.n nVar = zVar instanceof PreviewViewState.n ? (PreviewViewState.n) zVar : null;
                dai.c a = nVar != null ? nVar.a() : null;
                Object obj = a.C0011a.a;
                if (a == null) {
                    M.K(1344791704);
                } else {
                    M.K(-510808951);
                    boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                    Object x = M.x();
                    if (z || x == obj) {
                        x = new com.vk.movika.sdk.base.logic.interactor.c(8, izsVar, cVar);
                        M.R(x);
                    }
                    a.c((gzs) x, M, 0);
                }
                M.j();
                dai.c b = previewViewState.a.b();
                int i3 = i2 & 896;
                int i4 = i2 & 112;
                boolean z2 = (i3 == 256) | (i4 == 32);
                Object x2 = M.x();
                if (z2 || x2 == obj) {
                    x2 = new fk(3, izsVar, cVar);
                    M.R(x2);
                }
                b.c((gzs) x2, M, 0);
                Object obj2 = qni0.a;
                boolean y = M.y(obj2);
                Object x3 = M.x();
                if (y || x3 == obj) {
                    x3 = new C0462a(0, obj2, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
                    M.R(x3);
                }
                gzs gzsVar = (gzs) ((fcy) x3);
                boolean z3 = (i3 == 256) | (i4 == 32);
                Object x4 = M.x();
                if (z3 || x4 == obj) {
                    x4 = new rh4(6, izsVar, cVar);
                    M.R(x4);
                }
                q630 a2 = v630.a(v, gzsVar, (izs) x4);
                boolean J = M.J(a) | (i4 == 32);
                Object x5 = M.x();
                if (J || x5 == obj) {
                    x5 = new k22(3, cVar, a);
                    M.R(x5);
                }
                mmc.a(nmcVar, egi0.b(a2, false, (izs) x5), M, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new j7d(this, a8aVar, cVar, izsVar, ksrVar, q630Var, i);
            }
        }
    }

    /* compiled from: ClipListView.kt */
    public interface b extends q1a {

        /* compiled from: ClipListView.kt */
        public static final class a implements b {
            public final BlockId.CompositeId b;

            public a(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ClipListItemClicked(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: ClipListView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.short.ClipListView$b$b, reason: collision with other inner class name */
        public static final class C0463b implements b {
            public final BlockId.CompositeId b;

            public C0463b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0463b) && epx.f(this.b, ((C0463b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ClipListItemMenuClicked(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: ClipListView.kt */
        public static final class c implements b {
            public final BlockId.CompositeId b;
            public final long c;
            public final long d;

            public c(BlockId.CompositeId compositeId, long j, long j2) {
                this.b = compositeId;
                this.c = j;
                this.d = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
            }

            public final int hashCode() {
                return Long.hashCode(this.d) + bh10.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VideoCardViewedAction(blockId=");
                sb.append(this.b);
                sb.append(", startViewMs=");
                sb.append(this.c);
                sb.append(", endViewMs=");
                return vu5.a(')', this.d, sb);
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: ClipListView.kt */
    public static final class c implements r2a {
        public final BlockId.CompositeId b;
        public final String c;
        public final boolean d;
        public final nmc e;

        public c(BlockId.CompositeId compositeId, String str, boolean z, nmc nmcVar) {
            this.b = compositeId;
            this.c = str;
            this.d = z;
            this.e = nmcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return this.e.a.hashCode() + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            return "ClipListViewState(blockId=" + this.b + ", delayedDate=" + this.c + ", isPinned=" + this.d + ", clipCardViewState=" + this.e + ')';
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: ClipListView.kt */
    public static final class d extends u1a<ClipListState, b> {
        @Override // xsna.u1a
        public final void g(b bVar) {
            b bVar2 = bVar;
            b2a b2aVar = (b2a) this.b.b;
            if (bVar2 instanceof b.a) {
                v(new t0a.a(((ClipListState) b2aVar.getCurrentState()).e.r(), null, null, null, 14));
                t(new c.a(((ClipListState) b2aVar.getCurrentState()).b, ((ClipListState) b2aVar.getCurrentState()).e));
            } else if (bVar2 instanceof b.c) {
                b.c cVar = (b.c) bVar2;
                v(new VideoCatalogAnalyticsEvent.a(((ClipListState) b2aVar.getCurrentState()).e.r(), cVar.c, cVar.d));
            } else {
                if (!(bVar2 instanceof b.C0463b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (pls0.f(((ClipListState) b2aVar.getCurrentState()).e)) {
                    t(new fet0.c(((ClipListState) b2aVar.getCurrentState()).b, ((ClipListState) b2aVar.getCurrentState()).e));
                } else {
                    t(new fet0.b(((ClipListState) b2aVar.getCurrentState()).b, ((ClipListState) b2aVar.getCurrentState()).e));
                }
            }
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

    /* compiled from: ClipListView.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<b2a, d> {
        public static final f b = new f(1, d.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final d invoke(b2a b2aVar) {
            return new d(b2aVar);
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class g<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ izs b;

        public g(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: ClipListView.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements izs<b2a, d> {
        public static final h b = new h(1, d.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final d invoke(b2a b2aVar) {
            return new d(b2aVar);
        }
    }

    public static String a(int i) {
        String i2 = pvo0.i(false, i, false, true);
        if (i2.length() <= 0) {
            return i2;
        }
        return ((Object) String.valueOf(i2.charAt(0)).toUpperCase(Locale.ROOT)) + i2.substring(1);
    }

    public static void b(f1u f1uVar, qwe qweVar, g7s0 g7s0Var) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.ShortVideoList;
        com.vk.catalog.mvi.block.video.impl.p002short.a aVar = new com.vk.catalog.mvi.block.video.impl.p002short.a();
        f fVar = f.b;
        com.vk.catalog.mvi.block.video.impl.p002short.b bVar = new com.vk.catalog.mvi.block.video.impl.p002short.b(g7s0Var, qweVar);
        a aVar2 = new a(false);
        f1uVar.a(catalogBlockVariant, aVar);
        f1uVar.c(ClipListState.class, new e(fVar));
        f1uVar.h(ClipListState.class, bVar);
        f1uVar.g(c.class, aVar2);
    }

    public static void c(cg50 cg50Var, qwe qweVar, g7s0 g7s0Var) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.ShortVideoSliderList;
        com.vk.catalog.mvi.block.video.impl.p002short.a aVar = new com.vk.catalog.mvi.block.video.impl.p002short.a();
        h hVar = h.b;
        com.vk.catalog.mvi.block.video.impl.p002short.b bVar = new com.vk.catalog.mvi.block.video.impl.p002short.b(g7s0Var, qweVar);
        a aVar2 = new a(true);
        cg50Var.a(catalogBlockVariant, aVar);
        cg50Var.c(ClipListState.class, new g(hVar));
        cg50Var.h(ClipListState.class, bVar);
        cg50Var.g(c.class, aVar2);
    }
}
