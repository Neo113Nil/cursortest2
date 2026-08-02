package com.vk.catalog.mvi.block.video.impl.p002short;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog.mvi.block.video.impl.p002short.e;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.VideoFile;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.ahn;
import xsna.b2a;
import xsna.b6l;
import xsna.bh10;
import xsna.c1q;
import xsna.cg50;
import xsna.dp0;
import xsna.dtl;
import xsna.dvh0;
import xsna.egi0;
import xsna.epx;
import xsna.f1u;
import xsna.fcy;
import xsna.fet0;
import xsna.fpf0;
import xsna.g6;
import xsna.g7s0;
import xsna.gzs;
import xsna.izs;
import xsna.jq;
import xsna.kqu0;
import xsna.ksr;
import xsna.m2a;
import xsna.mcc0;
import xsna.mi10;
import xsna.mlg0;
import xsna.ojc;
import xsna.per;
import xsna.q1a;
import xsna.q630;
import xsna.q7o;
import xsna.qer0;
import xsna.qni0;
import xsna.qoy;
import xsna.qwe;
import xsna.r2a;
import xsna.rte0;
import xsna.s1a;
import xsna.s200;
import xsna.s3q0;
import xsna.sg50;
import xsna.shy;
import xsna.spj;
import xsna.sua;
import xsna.t0a;
import xsna.t1a;
import xsna.tfj0;
import xsna.txj0;
import xsna.u1a;
import xsna.ume0;
import xsna.v630;
import xsna.vog0;
import xsna.vu5;
import xsna.wzs;
import xsna.ydt0;
import xsna.zoi;

/* compiled from: ShortVideoListView.kt */
/* loaded from: classes.dex */
public final class ShortVideoListView {

    /* compiled from: ShortVideoListView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final BlockId.CompositeId b;
        public final CatalogBlockVariant c;
        public final int d;
        public final String e;
        public final boolean f;
        public final VideoFile g;
        public final String h;
        public final boolean i;

        /* compiled from: ShortVideoListView.kt */
        /* loaded from: classes16.dex */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Class cls;
                boolean z;
                BlockId.CompositeId compositeId = (BlockId.CompositeId) parcel.readParcelable(State.class.getClassLoader());
                CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    cls = State.class;
                    z = true;
                } else {
                    cls = State.class;
                    z = false;
                }
                return new State(compositeId, valueOf, readInt, readString, z, (VideoFile) parcel.readParcelable(cls.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, int i, String str, boolean z, VideoFile videoFile, String str2, boolean z2) {
            this.b = compositeId;
            this.c = catalogBlockVariant;
            this.d = i;
            this.e = str;
            this.f = z;
            this.g = videoFile;
            this.h = str2;
            this.i = z2;
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
            return epx.f(this.b, state.b) && this.c == state.c && this.d == state.d && epx.f(this.e, state.e) && this.f == state.f && epx.f(this.g, state.g) && epx.f(this.h, state.h) && this.i == state.i;
        }

        public final int hashCode() {
            int a2 = shy.a(this.d, io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31), 31);
            String str = this.e;
            int b = jq.b(this.g, qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31);
            String str2 = this.h;
            return Boolean.hashCode(this.i) + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            sb.append(this.b);
            sb.append(", blockVariant=");
            sb.append(this.c);
            sb.append(", views=");
            sb.append(this.d);
            sb.append(", imageUrl=");
            sb.append(this.e);
            sb.append(", isClipClosePrivacy=");
            sb.append(this.f);
            sb.append(", file=");
            sb.append(this.g);
            sb.append(", trackCode=");
            sb.append(this.h);
            sb.append(", isPinnedIconVisible=");
            return q0.a(sb, this.i, ')');
        }

        @Override // com.vk.catalog.mvi.block.CatalogBlockState
        public final BlockId w() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c.name());
            parcel.writeInt(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeParcelable(this.g, i);
            parcel.writeString(this.h);
            parcel.writeInt(this.i ? 1 : 0);
        }
    }

    /* compiled from: ShortVideoListView.kt */
    public static final class a extends m2a<e, d, com.vk.catalog.mvi.block.video.impl.p002short.e> {
        public final com.vk.catalog.mvi.block.video.impl.p002short.f b;
        public final boolean c;

        /* compiled from: ShortVideoListView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.short.ShortVideoListView$a$a, reason: collision with other inner class name */
        /* loaded from: classes16.dex */
        public static final /* synthetic */ class C0464a extends FunctionReferenceImpl implements gzs<Long> {
            public C0464a(Object obj) {
                super(0, obj, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
            }

            @Override // xsna.gzs
            public final Long invoke() {
                return Long.valueOf(qni0.a());
            }
        }

        /* compiled from: ShortVideoListView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.short.ShortVideoListView$BlockView$ContentImpl$2$1", f = "ShortVideoListView.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes16.dex */
        public static final class b extends SuspendLambda implements wzs<com.vk.catalog.mvi.block.video.impl.p002short.e, spj<? super s3q0>, Object> {
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
            public final Object invoke(com.vk.catalog.mvi.block.video.impl.p002short.e eVar, spj<? super s3q0> spjVar) {
                return ((b) create(eVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.vk.catalog.mvi.block.video.impl.p002short.e eVar = (com.vk.catalog.mvi.block.video.impl.p002short.e) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                com.vk.catalog.mvi.block.video.impl.p002short.f fVar = a.this.b;
                Context context = this.$context;
                if (!(eVar instanceof e.a)) {
                    fVar.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                ydt0 Y = fVar.a.Y();
                e.a aVar = (e.a) eVar;
                VideoFile videoFile = aVar.b;
                Y.k(context, videoFile, (r43 & 4) != 0 ? null : videoFile.x8(), (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : aVar.c, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : true, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                return s3q0.a;
            }
        }

        /* compiled from: ShortVideoListView.kt */
        /* loaded from: classes16.dex */
        public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<Long> {
            public c(Object obj) {
                super(0, obj, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
            }

            @Override // xsna.gzs
            public final Long invoke() {
                return Long.valueOf(qni0.a());
            }
        }

        public a(com.vk.catalog.mvi.block.video.impl.p002short.f fVar, boolean z) {
            super(fpf0.a(com.vk.catalog.mvi.block.video.impl.p002short.e.class));
            this.b = fVar;
            this.c = z;
        }

        /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(final a8a a8aVar, final e eVar, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
            int i2;
            q630 a;
            q630 d;
            q630 b2;
            q630 d2;
            androidx.compose.runtime.a M = aVar.M(-2140919880);
            if ((i & 6) == 0) {
                i2 = (M.J(a8aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(eVar) ? 32 : 16;
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
                    androidx.compose.runtime.b.f(-2140919880, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.ShortVideoListView.BlockView.ContentImpl (ShortVideoListView.kt:270)");
                }
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
                zoi zoiVar = (zoi) eVar.j.getValue();
                int i3 = i2 & 112;
                int i4 = i2 & 896;
                boolean z = (i3 == 32) | (i4 == 256);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new c() { // from class: xsna.cgj0
                        @Override // com.vk.catalog.mvi.block.video.impl.short.ShortVideoListView.c
                        public final void invoke(boolean z2) {
                            ShortVideoListView.e eVar2 = ShortVideoListView.e.this;
                            izsVar.invoke(z2 ? new ShortVideoListView.d.a(eVar2.b) : new ShortVideoListView.d.c(eVar2.b));
                        }
                    };
                    M.R(x);
                }
                zoiVar.c((c) x, M, 0);
                boolean y = ((458752 & i2) == 131072) | M.y(context);
                Object x2 = M.x();
                if (y || x2 == c0012a) {
                    x2 = new b(context, null);
                    M.R(x2);
                }
                c1q.a(ksrVar, (wzs) x2, M, (i2 >> 9) & 14);
                if (this.c) {
                    d2 = sua.d(0.5625f, txj0.v(q630Var, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE), false);
                    d = rte0.d(d2, vog0.b(kqu0.e));
                } else {
                    a = a8aVar.a(s200.D(q630Var, 1));
                    d = sua.d(0.5625f, a, false);
                }
                q630 q630Var2 = d;
                if (eVar.i != null) {
                    M.K(121466748);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = q7o.f();
                        M.R(x3);
                    }
                    sg50 sg50Var = (sg50) x3;
                    mlg0 a2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                    boolean z2 = (i4 == 256) | (i3 == 32);
                    Object x4 = M.x();
                    if (z2 || x4 == c0012a) {
                        x4 = new ume0(4, izsVar, eVar);
                        M.R(x4);
                    }
                    q630 b3 = ojc.b(q630Var2, sg50Var, a2, false, null, (gzs) x4, 28);
                    qni0 qni0Var = qni0.a;
                    boolean y2 = M.y(qni0Var);
                    Object x5 = M.x();
                    if (y2 || x5 == c0012a) {
                        x5 = new c(qni0Var);
                        M.R(x5);
                    }
                    gzs gzsVar = (gzs) ((fcy) x5);
                    boolean z3 = (i4 == 256) | (i3 == 32);
                    Object x6 = M.x();
                    if (z3 || x6 == c0012a) {
                        x6 = new dvh0(1, izsVar, eVar);
                        M.R(x6);
                    }
                    q630 a3 = v630.a(b3, gzsVar, (izs) x6);
                    boolean z4 = i3 == 32;
                    Object x7 = M.x();
                    if (z4 || x7 == c0012a) {
                        x7 = new mi10(eVar, 23);
                        M.R(x7);
                    }
                    b2 = egi0.b(a3, false, (izs) x7);
                    dtl.a(eVar, b2, M, (i2 >> 3) & 14, 0);
                    M.j();
                } else {
                    M.K(122815434);
                    Object x8 = M.x();
                    if (x8 == c0012a) {
                        x8 = q7o.f();
                        M.R(x8);
                    }
                    sg50 sg50Var2 = (sg50) x8;
                    mlg0 a4 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                    boolean z5 = (i4 == 256) | (i3 == 32);
                    Object x9 = M.x();
                    if (z5 || x9 == c0012a) {
                        x9 = new dp0(19, izsVar, eVar);
                        M.R(x9);
                    }
                    q630 b4 = ojc.b(q630Var2, sg50Var2, a4, false, null, (gzs) x9, 28);
                    qni0 qni0Var2 = qni0.a;
                    boolean y3 = M.y(qni0Var2);
                    Object x10 = M.x();
                    if (y3 || x10 == c0012a) {
                        x10 = new C0464a(qni0Var2);
                        M.R(x10);
                    }
                    gzs gzsVar2 = (gzs) ((fcy) x10);
                    boolean z6 = (i4 == 256) | (i3 == 32);
                    Object x11 = M.x();
                    if (z6 || x11 == c0012a) {
                        x11 = new g6(29, izsVar, eVar);
                        M.R(x11);
                    }
                    tfj0.d(eVar, ahn.E(v630.a(b4, gzsVar2, (izs) x11), "mvi_catalog_short_video_card_test_tag"), M, (i2 >> 3) & 14, 0);
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
                s.l(new wzs() { // from class: xsna.dgj0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        ShortVideoListView.a.this.b(a8aVar, eVar, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                        return s3q0.a;
                    }
                });
            }
        }
    }

    /* compiled from: ShortVideoListView.kt */
    public static final class b extends u1a<State, d> {
        @Override // xsna.u1a
        public final void g(d dVar) {
            d dVar2 = dVar;
            boolean z = dVar2 instanceof d.b;
            mcc0 mcc0Var = this.b;
            if (z) {
                v(new t0a.a(((State) mcc0Var.n()).g.r(), null, null, null, 14));
                t(new e.a(((State) mcc0Var.n()).b, ((State) mcc0Var.n()).g, ((State) mcc0Var.n()).h));
            } else if (dVar2 instanceof d.C0465d) {
                d.C0465d c0465d = (d.C0465d) dVar2;
                v(new VideoCatalogAnalyticsEvent.a(((State) mcc0Var.n()).g.r(), c0465d.b(), c0465d.a()));
            } else if (dVar2 instanceof d.c) {
                t(new fet0.b(((State) mcc0Var.n()).b, ((State) mcc0Var.n()).g));
            } else {
                if (!(dVar2 instanceof d.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                t(new fet0.c(((State) mcc0Var.n()).b, ((State) mcc0Var.n()).g));
            }
        }
    }

    /* compiled from: ShortVideoListView.kt */
    /* loaded from: classes16.dex */
    public interface c {
        void invoke(boolean z);
    }

    /* compiled from: ShortVideoListView.kt */
    /* loaded from: classes16.dex */
    public interface d extends q1a {

        /* compiled from: ShortVideoListView.kt */
        public static final class a implements d {
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
                return "DelayedShortVideoMenuClicked(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: ShortVideoListView.kt */
        public static final class b implements d {
            public final BlockId.CompositeId b;

            public b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ShortVideoClicked(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: ShortVideoListView.kt */
        public static final class c implements d {
            public final BlockId.CompositeId b;

            public c(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ShortVideoMenuClicked(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: ShortVideoListView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.short.ShortVideoListView$d$d, reason: collision with other inner class name */
        public static final class C0465d implements d {
            public final BlockId.CompositeId b;
            public final long c;
            public final long d;

            public C0465d(BlockId.CompositeId compositeId, long j, long j2) {
                this.b = compositeId;
                this.c = j;
                this.d = j2;
            }

            public final long a() {
                return this.d;
            }

            public final long b() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0465d)) {
                    return false;
                }
                C0465d c0465d = (C0465d) obj;
                return epx.f(this.b, c0465d.b) && this.c == c0465d.c && this.d == c0465d.d;
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

    /* compiled from: ShortVideoListView.kt */
    public static final class e implements r2a {
        public static final per k = new per(26);
        public final BlockId.CompositeId b;
        public final int c;
        public final String d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final String i;
        public final Object j = zoi.a.a();

        public e(BlockId.CompositeId compositeId, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
            this.b = compositeId;
            this.c = i;
            this.d = str;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = str2;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class f<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ izs b;

        public f(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: ShortVideoListView.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements izs<b2a, b> {
        public static final g b = new g(1, b.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final b invoke(b2a b2aVar) {
            return new b(b2aVar);
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class h<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ izs b;

        public h(izs izsVar) {
            this.b = izsVar;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    /* compiled from: ShortVideoListView.kt */
    public static final /* synthetic */ class i extends FunctionReferenceImpl implements izs<b2a, b> {
        public static final i b = new i(1, b.class, "<init>", "<init>(Lcom/vk/catalog/mvi/block/CatalogBlockOperations;)V", 0);

        @Override // xsna.izs
        public final b invoke(b2a b2aVar) {
            return new b(b2aVar);
        }
    }

    public static void a(f1u f1uVar, qwe qweVar, g7s0 g7s0Var) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.ShortVideoList;
        com.vk.catalog.mvi.block.video.impl.p002short.h hVar = new com.vk.catalog.mvi.block.video.impl.p002short.h(qweVar);
        g gVar = g.b;
        com.vk.catalog.mvi.block.video.impl.p002short.g gVar2 = new com.vk.catalog.mvi.block.video.impl.p002short.g(g7s0Var);
        a aVar = new a(new com.vk.catalog.mvi.block.video.impl.p002short.f(g7s0Var), false);
        f1uVar.a(catalogBlockVariant, hVar);
        f1uVar.c(State.class, new f(gVar));
        f1uVar.h(State.class, gVar2);
        f1uVar.g(e.class, aVar);
    }

    public static void b(cg50 cg50Var, qwe qweVar, g7s0 g7s0Var) {
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.ShortVideoSliderList;
        com.vk.catalog.mvi.block.video.impl.p002short.h hVar = new com.vk.catalog.mvi.block.video.impl.p002short.h(qweVar);
        i iVar = i.b;
        com.vk.catalog.mvi.block.video.impl.p002short.g gVar = new com.vk.catalog.mvi.block.video.impl.p002short.g(g7s0Var);
        a aVar = new a(new com.vk.catalog.mvi.block.video.impl.p002short.f(g7s0Var), true);
        cg50Var.a(catalogBlockVariant, hVar);
        cg50Var.c(State.class, new h(iVar));
        cg50Var.h(State.class, gVar);
        cg50Var.g(e.class, aVar);
    }
}
