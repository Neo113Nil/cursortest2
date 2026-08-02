package com.vk.catalog.mvi.block.video.impl.p002short.draft;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.c;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.a8a;
import xsna.ahn;
import xsna.alb0;
import xsna.b2a;
import xsna.b6l;
import xsna.br;
import xsna.c1q;
import xsna.e3m;
import xsna.epx;
import xsna.fet0;
import xsna.fpf0;
import xsna.gp;
import xsna.gzs;
import xsna.izs;
import xsna.ksr;
import xsna.l49;
import xsna.ldo;
import xsna.lq;
import xsna.lrc;
import xsna.lza;
import xsna.m2a;
import xsna.mlg0;
import xsna.nma;
import xsna.od3;
import xsna.ojc;
import xsna.q1a;
import xsna.q630;
import xsna.q7o;
import xsna.qer0;
import xsna.r2a;
import xsna.s200;
import xsna.s3q0;
import xsna.sd4;
import xsna.sg50;
import xsna.spj;
import xsna.sua;
import xsna.t0a;
import xsna.txj0;
import xsna.u1a;
import xsna.w1a;
import xsna.wzs;
import xsna.z13;
import xsna.zcl;
import xsna.zfr0;

/* compiled from: DraftShortVideoListView.kt */
/* loaded from: classes.dex */
public final class DraftShortVideoListView {
    public static final g a = new g();

    /* compiled from: DraftShortVideoListView.kt */
    public interface State extends CatalogBlockState {

        /* compiled from: DraftShortVideoListView.kt */
        public static final class ClipState implements State {
            public static final Parcelable.Creator<ClipState> CREATOR = new a();
            public final BlockId.CompositeId b;
            public final CatalogBlockVariant c;
            public final String d;
            public final VideoFile e;

            /* compiled from: DraftShortVideoListView.kt */
            /* loaded from: classes16.dex */
            public static final class a implements Parcelable.Creator<ClipState> {
                @Override // android.os.Parcelable.Creator
                public final ClipState createFromParcel(Parcel parcel) {
                    return new ClipState((BlockId.CompositeId) parcel.readParcelable(ClipState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), parcel.readString(), (VideoFile) parcel.readParcelable(ClipState.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ClipState[] newArray(int i) {
                    return new ClipState[i];
                }
            }

            public ClipState(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, String str, VideoFile videoFile) {
                this.b = compositeId;
                this.c = catalogBlockVariant;
                this.d = str;
                this.e = videoFile;
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
                if (!(obj instanceof ClipState)) {
                    return false;
                }
                ClipState clipState = (ClipState) obj;
                return epx.f(this.b, clipState.b) && this.c == clipState.c && epx.f(this.d, clipState.d) && epx.f(this.e, clipState.e);
            }

            public final int hashCode() {
                int b = io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31);
                String str = this.d;
                return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ClipState(blockId=");
                sb.append(this.b);
                sb.append(", blockVariant=");
                sb.append(this.c);
                sb.append(", imageUrl=");
                sb.append(this.d);
                sb.append(", file=");
                return lq.a(sb, this.e, ')');
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
            }
        }

        /* compiled from: DraftShortVideoListView.kt */
        public static final class LoadingState implements State {
            public static final Parcelable.Creator<LoadingState> CREATOR = new a();
            public final String b;
            public final CatalogBlockVariant c;
            public final UserId d;

            /* compiled from: DraftShortVideoListView.kt */
            /* loaded from: classes16.dex */
            public static final class a implements Parcelable.Creator<LoadingState> {
                @Override // android.os.Parcelable.Creator
                public final LoadingState createFromParcel(Parcel parcel) {
                    return new LoadingState(((BlockId.Simple) parcel.readParcelable(LoadingState.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), (UserId) parcel.readParcelable(LoadingState.class.getClassLoader()), null);
                }

                @Override // android.os.Parcelable.Creator
                public final LoadingState[] newArray(int i) {
                    return new LoadingState[i];
                }
            }

            public LoadingState(String str, CatalogBlockVariant catalogBlockVariant, UserId userId, zcl zclVar) {
                this.b = str;
                this.c = catalogBlockVariant;
                this.d = userId;
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
                if (!(obj instanceof LoadingState)) {
                    return false;
                }
                LoadingState loadingState = (LoadingState) obj;
                return BlockId.Simple.b(this.b, loadingState.b) && this.c == loadingState.c && epx.f(this.d, loadingState.d);
            }

            public final int hashCode() {
                int b = io.reactivex.rxjava3.subjects.b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
                UserId userId = this.d;
                return b + (userId == null ? 0 : Long.hashCode(userId.b));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadingState(blockId=");
                io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
                sb.append(this.c);
                sb.append(", ownerId=");
                return gp.b(sb, this.d, ')');
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

        /* compiled from: DraftShortVideoListView.kt */
        public static final class PlaceholderState implements State {
            public static final Parcelable.Creator<PlaceholderState> CREATOR = new a();
            public final String b;
            public final CatalogBlockVariant c;

            /* compiled from: DraftShortVideoListView.kt */
            /* loaded from: classes16.dex */
            public static final class a implements Parcelable.Creator<PlaceholderState> {
                @Override // android.os.Parcelable.Creator
                public final PlaceholderState createFromParcel(Parcel parcel) {
                    return new PlaceholderState(((BlockId.Simple) parcel.readParcelable(PlaceholderState.class.getClassLoader())).b, CatalogBlockVariant.valueOf(parcel.readString()), null);
                }

                @Override // android.os.Parcelable.Creator
                public final PlaceholderState[] newArray(int i) {
                    return new PlaceholderState[i];
                }
            }

            public PlaceholderState(String str, CatalogBlockVariant catalogBlockVariant, zcl zclVar) {
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
                if (!(obj instanceof PlaceholderState)) {
                    return false;
                }
                PlaceholderState placeholderState = (PlaceholderState) obj;
                return BlockId.Simple.b(this.b, placeholderState.b) && this.c == placeholderState.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + (BlockId.Simple.d(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PlaceholderState(blockId=");
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
    }

    /* compiled from: DraftShortVideoListView.kt */
    public static final class a extends m2a<d, c, com.vk.catalog.mvi.block.video.impl.p002short.draft.c> {
        public final com.vk.catalog.mvi.block.video.impl.p002short.draft.d b;

        /* compiled from: DraftShortVideoListView.kt */
        @b6l(c = "com.vk.catalog.mvi.block.video.impl.short.draft.DraftShortVideoListView$BlockView$ContentImpl$1$1", f = "DraftShortVideoListView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.vk.catalog.mvi.block.video.impl.short.draft.DraftShortVideoListView$a$a, reason: collision with other inner class name */
        /* loaded from: classes16.dex */
        public static final class C0466a extends SuspendLambda implements wzs<com.vk.catalog.mvi.block.video.impl.p002short.draft.c, spj<? super s3q0>, Object> {
            final /* synthetic */ Context $context;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0466a(Context context, spj<? super C0466a> spjVar) {
                super(2, spjVar);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C0466a c0466a = a.this.new C0466a(this.$context, spjVar);
                c0466a.L$0 = obj;
                return c0466a;
            }

            @Override // xsna.wzs
            public final Object invoke(com.vk.catalog.mvi.block.video.impl.p002short.draft.c cVar, spj<? super s3q0> spjVar) {
                return ((C0466a) create(cVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                com.vk.catalog.mvi.block.video.impl.p002short.draft.c cVar = (com.vk.catalog.mvi.block.video.impl.p002short.draft.c) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                com.vk.catalog.mvi.block.video.impl.p002short.draft.d dVar = a.this.b;
                Context context = this.$context;
                dVar.getClass();
                if (cVar instanceof c.a) {
                    Activity h = e3m.h(context);
                    if (h != null) {
                        c.a aVar = (c.a) cVar;
                        dVar.a(aVar.b, aVar.c, h);
                    }
                } else {
                    if (!(cVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Activity h2 = e3m.h(context);
                    if (h2 != null) {
                        c.b bVar = (c.b) cVar;
                        VideoFile videoFile = bVar.b;
                        View view = bVar.c;
                        String Y6 = videoFile.Y6();
                        if (Y6 != null) {
                            new lrc(context, ((Boolean) dVar.e.getValue()).booleanValue(), new com.vk.movika.sdk.base.presenter.c(10, dVar, videoFile), new l49(2, dVar, videoFile, Y6), new ldo(dVar, videoFile, view, h2, 0)).c();
                        }
                    }
                }
                return s3q0.a;
            }
        }

        public a(com.vk.catalog.mvi.block.video.impl.p002short.draft.d dVar) {
            super(fpf0.a(com.vk.catalog.mvi.block.video.impl.p002short.draft.c.class));
            this.b = dVar;
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(a8a a8aVar, d dVar, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            q630 a;
            q630 d;
            q630 d2;
            q630 f;
            izs izsVar2 = izsVar;
            androidx.compose.runtime.a M = aVar.M(-407685578);
            if ((i & 6) == 0) {
                i2 = (M.J(a8aVar) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(dVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(izsVar2) ? 256 : 128;
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
                    androidx.compose.runtime.b.f(-407685578, i2, -1, "com.vk.catalog.mvi.block.video.impl.short.draft.DraftShortVideoListView.BlockView.ContentImpl (DraftShortVideoListView.kt:298)");
                }
                Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b());
                Object obj = (View) M.r(AndroidCompositionLocals_androidKt.c());
                boolean y = ((458752 & i2) == 131072) | M.y(context);
                Object x = M.x();
                Object obj2 = a.C0011a.a;
                if (y || x == obj2) {
                    x = new C0466a(context, null);
                    M.R(x);
                }
                c1q.a(ksrVar, (wzs) x, M, (i2 >> 9) & 14);
                a = a8aVar.a(s200.D(q630Var, 1));
                d = sua.d(0.5625f, a, false);
                if (dVar instanceof d.a) {
                    M.K(807426712);
                    d.a aVar2 = (d.a) dVar;
                    Object x2 = M.x();
                    if (x2 == obj2) {
                        x2 = q7o.f();
                        M.R(x2);
                    }
                    sg50 sg50Var = (sg50) x2;
                    mlg0 a2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                    boolean y2 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | M.y(obj);
                    Object x3 = M.x();
                    if (y2 || x3 == obj2) {
                        x3 = new lza(izsVar2, dVar, obj, 3);
                        M.R(x3);
                    }
                    com.vk.catalog.mvi.block.video.impl.p002short.draft.b.a(aVar2, izsVar2, ahn.E(ojc.b(d, sg50Var, a2, false, null, (gzs) x3, 28), "mvi_catalog_short_video_card_test_tag"), M, (i2 >> 3) & 112, 0);
                    izsVar2 = izsVar2;
                    M.j();
                } else {
                    boolean z = dVar instanceof d.c;
                    q630.a aVar3 = q630.a.a;
                    if (z) {
                        M.K(808435111);
                        d.c cVar = (d.c) dVar;
                        f = txj0.f(aVar3, 1.0f);
                        h.a(cVar, izsVar2, ahn.E(a8a.d(a8aVar, f, BlockId.Simple.a(cVar.b)), "mvi_catalog_placeholder"), M, (i2 >> 3) & 112);
                        M.j();
                    } else {
                        if (!(dVar instanceof d.b)) {
                            throw alb0.c(-943786499, M);
                        }
                        M.K(808865267);
                        SpinnerState spinnerState = SpinnerState.Loading;
                        d2 = txj0.d(aVar3, 1.0f);
                        zfr0.f(spinnerState, d2, null, 0L, null, null, M, 54, 60);
                        M.j();
                    }
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.l(new nma(this, a8aVar, dVar, izsVar2, ksrVar, q630Var, i, 1));
            }
        }
    }

    /* compiled from: DraftShortVideoListView.kt */
    /* loaded from: classes16.dex */
    public static final class b<S extends CatalogBlockState> extends u1a<S, c> {
        public b(b2a b2aVar) {
            super(b2aVar);
            CatalogBlockState currentState = ((b2a) this.b.b).getCurrentState();
            State.LoadingState loadingState = currentState instanceof State.LoadingState ? (State.LoadingState) currentState : null;
            if (loadingState != null) {
                w1a.b(this, null, new e(this, loadingState, null), 3);
            }
        }

        @Override // xsna.u1a
        public final void g(c cVar) {
            c cVar2 = cVar;
            b2a b2aVar = (b2a) this.b.b;
            if (cVar2 instanceof c.b) {
                CatalogBlockState currentState = b2aVar.getCurrentState();
                State.ClipState clipState = currentState instanceof State.ClipState ? (State.ClipState) currentState : null;
                if (clipState == null) {
                    return;
                }
                VideoFile videoFile = clipState.e;
                v(new t0a.a(videoFile.r(), null, null, null, 14));
                t(new c.a(clipState.b, videoFile, ((c.b) cVar2).c));
                return;
            }
            if (cVar2 instanceof c.C0467c) {
                CatalogBlockState currentState2 = b2aVar.getCurrentState();
                State.ClipState clipState2 = currentState2 instanceof State.ClipState ? (State.ClipState) currentState2 : null;
                if (clipState2 == null) {
                    return;
                }
                t(new c.b(clipState2.b, clipState2.e, ((c.C0467c) cVar2).c));
                return;
            }
            if (!(cVar2 instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            CatalogBlockState currentState3 = b2aVar.getCurrentState();
            State.PlaceholderState placeholderState = currentState3 instanceof State.PlaceholderState ? (State.PlaceholderState) currentState3 : null;
            if (placeholderState == null) {
                return;
            }
            t(new fet0.d(new BlockId.Simple(placeholderState.b)));
        }
    }

    /* compiled from: DraftShortVideoListView.kt */
    /* loaded from: classes16.dex */
    public interface c extends q1a {

        /* compiled from: DraftShortVideoListView.kt */
        public static final class a implements c {
            public final String b;

            public a(String str) {
                this.b = str;
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
                return "PlaceholderButtonClicked(blockId=" + ((Object) BlockId.Simple.e(this.b)) + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return new BlockId.Simple(this.b);
            }
        }

        /* compiled from: DraftShortVideoListView.kt */
        public static final class b implements c {
            public final BlockId.CompositeId b;
            public final View c;

            public b(BlockId.CompositeId compositeId, View view) {
                this.b = compositeId;
                this.c = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShortVideoClicked(blockId=");
                sb.append(this.b);
                sb.append(", view=");
                return br.b(sb, this.c, ')');
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: DraftShortVideoListView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.short.draft.DraftShortVideoListView$c$c, reason: collision with other inner class name */
        public static final class C0467c implements c {
            public final BlockId.CompositeId b;
            public final View c;

            public C0467c(BlockId.CompositeId compositeId, View view) {
                this.b = compositeId;
                this.c = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0467c)) {
                    return false;
                }
                C0467c c0467c = (C0467c) obj;
                return epx.f(this.b, c0467c.b) && epx.f(this.c, c0467c.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ShortVideoMenuClicked(blockId=");
                sb.append(this.b);
                sb.append(", view=");
                return br.b(sb, this.c, ')');
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }
    }

    /* compiled from: DraftShortVideoListView.kt */
    public interface d extends r2a {

        /* compiled from: DraftShortVideoListView.kt */
        public static final class a implements d {
            public final BlockId.CompositeId b;
            public final String c;

            static {
                new sd4(19);
            }

            public a(BlockId.CompositeId compositeId, String str) {
                this.b = compositeId;
                this.c = str;
            }

            @Override // xsna.r2a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: DraftShortVideoListView.kt */
        public static final class b implements d {
            public final String b;

            static {
                new z13(15);
            }

            public b(String str) {
                this.b = str;
            }

            @Override // xsna.r2a
            public final BlockId w() {
                return BlockId.Simple.a(this.b);
            }
        }

        /* compiled from: DraftShortVideoListView.kt */
        public static final class c implements d {
            public final String b;

            static {
                new od3(28);
            }

            public c(String str) {
                this.b = str;
            }

            @Override // xsna.r2a
            public final BlockId w() {
                return BlockId.Simple.a(this.b);
            }
        }
    }
}
