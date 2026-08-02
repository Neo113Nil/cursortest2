package com.vk.catalog.mvi.block.video.impl.video.largelisttablet;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.domain.analytics.source.DonutVideoClickSource;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import defpackage.b0;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8a;
import xsna.b2a;
import xsna.bh10;
import xsna.dai;
import xsna.e43;
import xsna.egi0;
import xsna.epx;
import xsna.f1u;
import xsna.f2a;
import xsna.f5o;
import xsna.fcy;
import xsna.fet0;
import xsna.fpf0;
import xsna.g7s0;
import xsna.ge0;
import xsna.grs0;
import xsna.gzs;
import xsna.hdt0;
import xsna.izs;
import xsna.jq;
import xsna.ksr;
import xsna.l1k0;
import xsna.l5o;
import xsna.m2a;
import xsna.m7a;
import xsna.mno0;
import xsna.q1a;
import xsna.q630;
import xsna.qni0;
import xsna.r2a;
import xsna.s1a;
import xsna.s200;
import xsna.t1a;
import xsna.txj0;
import xsna.u1a;
import xsna.u890;
import xsna.urd0;
import xsna.v630;
import xsna.vjs0;
import xsna.vu5;
import xsna.w3k0;
import xsna.wo1;
import xsna.x4o;
import xsna.xjs0;
import xsna.xo1;
import xsna.yyl0;
import xsna.zoi;
import xsna.zv;

/* compiled from: VideoLargeListTabletView.kt */
/* loaded from: classes16.dex */
public final class VideoLargeListTabletView {

    /* compiled from: VideoLargeListTabletView.kt */
    public static final class State implements CatalogBlockState {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public final BlockId.CompositeId b;
        public final CatalogBlockVariant c;
        public final UserId d;
        public final VideoFile e;
        public final String f;
        public final DonutVideoUiModel g;
        public final boolean h;

        /* compiled from: VideoLargeListTabletView.kt */
        public static final class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State((BlockId.CompositeId) parcel.readParcelable(State.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (UserId) parcel.readParcelable(State.class.getClassLoader()), (VideoFile) parcel.readParcelable(State.class.getClassLoader()), parcel.readString(), (DonutVideoUiModel) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, UserId userId, VideoFile videoFile, String str, DonutVideoUiModel donutVideoUiModel, boolean z) {
            this.b = compositeId;
            this.c = catalogBlockVariant;
            this.d = userId;
            this.e = videoFile;
            this.f = str;
            this.g = donutVideoUiModel;
            this.h = z;
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
            return epx.f(this.b, state.b) && this.c == state.c && epx.f(this.d, state.d) && epx.f(this.e, state.e) && epx.f(this.f, state.f) && epx.f(this.g, state.g) && this.h == state.h;
        }

        public final int hashCode() {
            int a2 = urd0.a(jq.b(this.e, bh10.a(io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d.b), 31), 31, this.f);
            DonutVideoUiModel donutVideoUiModel = this.g;
            return Boolean.hashCode(this.h) + ((a2 + (donutVideoUiModel == null ? 0 : donutVideoUiModel.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(blockId=");
            sb.append(this.b);
            sb.append(", blockVariant=");
            sb.append(this.c);
            sb.append(", ownerId=");
            sb.append(this.d);
            sb.append(", videoFile=");
            sb.append(this.e);
            sb.append(", urlToBlock=");
            sb.append(this.f);
            sb.append(", donutVideoUiModel=");
            sb.append(this.g);
            sb.append(", isVideoClickable=");
            return q0.a(sb, this.h, ')');
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
            parcel.writeString(this.f);
            parcel.writeParcelable(this.g, i);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    /* compiled from: VideoLargeListTabletView.kt */
    public static final class a extends m2a<d, c, vjs0> {
        public final xjs0 b;

        /* compiled from: VideoLargeListTabletView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0468a extends FunctionReferenceImpl implements gzs<Long> {
            @Override // xsna.gzs
            public final Long invoke() {
                return Long.valueOf(qni0.a());
            }
        }

        public a(hdt0 hdt0Var, x4o x4oVar) {
            super(fpf0.a(vjs0.class));
            this.b = new xjs0(hdt0Var, x4oVar);
        }

        @Override // xsna.m2a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void b(a8a a8aVar, d dVar, izs izsVar, ksr ksrVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            String a;
            VideoMetaViewState.a aVar2;
            VideoMetaViewState.a aVar3;
            VideoCellViewState videoCellViewState = dVar.c;
            PreviewViewState previewViewState = videoCellViewState.a;
            androidx.compose.runtime.a M = aVar.M(1449471963);
            if ((i & 48) == 0) {
                i2 = (M.J(dVar) ? 32 : 16) | i;
            } else {
                i2 = i;
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
            if (M.t(i2 & 1, (74897 & i2) != 74896)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1449471963, i2, -1, "com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView.BlockView.ContentImpl (VideoLargeListTabletView.kt:262)");
                }
                this.b.a(ksrVar, M, (i2 >> 9) & 14);
                dai.c d = videoCellViewState.d();
                int i3 = i2 & 896;
                int i4 = i2 & 112;
                boolean z = (i3 == 256) | (i4 == 32);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new grs0(0, izsVar, dVar);
                    M.R(x);
                }
                d.c((gzs) x, M, 0);
                dai.c b = previewViewState.a.b();
                boolean z2 = (i3 == 256) | (i4 == 32);
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new com.vk.movika.sdk.base.presenter.c(24, izsVar, dVar);
                    M.R(x2);
                }
                b.c((gzs) x2, M, 0);
                VideoCellViewState.c a2 = videoCellViewState.a();
                dai.c a3 = a2 != null ? a2.a() : null;
                if (a3 == null) {
                    M.K(-381305557);
                } else {
                    M.K(1373173142);
                    boolean z3 = (i4 == 32) | (i3 == 256);
                    Object x3 = M.x();
                    if (z3 || x3 == c0012a) {
                        x3 = new zv(23, izsVar, dVar);
                        M.R(x3);
                    }
                    a3.c((gzs) x3, M, 0);
                }
                M.j();
                VideoMetaViewState c = videoCellViewState.c();
                dai.c b2 = (c == null || (aVar3 = c.d) == null) ? null : aVar3.b();
                if (b2 == null) {
                    M.K(-381129880);
                } else {
                    M.K(1373178809);
                    boolean z4 = (i3 == 256) | (i4 == 32);
                    Object x4 = M.x();
                    if (z4 || x4 == c0012a) {
                        x4 = new ge0(20, izsVar, dVar);
                        M.R(x4);
                    }
                    b2.c((gzs) x4, M, 0);
                }
                M.j();
                VideoMetaViewState c2 = videoCellViewState.c();
                dai.c b3 = (c2 == null || (aVar2 = c2.e) == null) ? null : aVar2.b();
                if (b3 == null) {
                    M.K(-380946360);
                } else {
                    M.K(1373184729);
                    boolean z5 = (i3 == 256) | (i4 == 32);
                    Object x5 = M.x();
                    if (z5 || x5 == c0012a) {
                        x5 = new wo1(19, izsVar, dVar);
                        M.R(x5);
                    }
                    b3.c((gzs) x5, M, 0);
                }
                M.j();
                PlaceholderViewState a4 = previewViewState.a();
                zoi<PlaceholderViewState.Appearance> a5 = a4 != null ? a4.a() : null;
                if (a5 == null) {
                    M.K(-380773504);
                } else {
                    M.K(1373190305);
                    a5.c(previewViewState.a.d() ? PlaceholderViewState.Appearance.Overlay : PlaceholderViewState.Appearance.Neutral, M, 0);
                }
                M.j();
                videoCellViewState.f().c(VideoCellViewState.Size.Medium, M, 6);
                VideoMetaViewState c3 = videoCellViewState.c();
                if (c3 == null) {
                    M.K(-380369481);
                    M.j();
                    a = null;
                } else {
                    M.K(1373203338);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1712724319, 48, -1, "com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView.getVideoTitle (VideoLargeListTabletView.kt:329)");
                    }
                    VideoMetaViewState.h hVar = c3.a;
                    VideoMetaViewState.i iVar = hVar instanceof VideoMetaViewState.i ? (VideoMetaViewState.i) hVar : null;
                    mno0.i iVar2 = iVar != null ? iVar.b : null;
                    if (iVar2 == null) {
                        M.K(-441146984);
                        M.j();
                        a = null;
                    } else {
                        M.K(955600777);
                        a = iVar2.a(0, M);
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                }
                float f = 16;
                float f2 = 6;
                q630 C = s200.C(txj0.f(q630Var, 1.0f), new u890(f, f2, f, f2));
                qni0 qni0Var = qni0.a;
                boolean y = M.y(qni0Var);
                Object x6 = M.x();
                if (y || x6 == c0012a) {
                    x6 = new C0468a(0, qni0Var, qni0.class, "currentServerTimeMillis", "currentServerTimeMillis()J", 0);
                    M.R(x6);
                }
                gzs gzsVar = (gzs) ((fcy) x6);
                boolean z6 = (i3 == 256) | (i4 == 32);
                Object x7 = M.x();
                if (z6 || x7 == c0012a) {
                    x7 = new b0(29, izsVar, dVar);
                    M.R(x7);
                }
                q630 a6 = v630.a(C, gzsVar, (izs) x7);
                boolean J = (i4 == 32) | M.J(a);
                Object x8 = M.x();
                if (J || x8 == c0012a) {
                    x8 = new l1k0(7, dVar, a);
                    M.R(x8);
                }
                com.vk.libvideo.design.compose.video.videocell.a.g(videoCellViewState, egi0.b(a6, false, (izs) x8), M, 0, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            f s = M.s();
            if (s != null) {
                s.d = new xo1(this, a8aVar, dVar, izsVar, ksrVar, q630Var, i, 1);
            }
        }
    }

    /* compiled from: VideoLargeListTabletView.kt */
    public static final class b extends u1a<State, c> {
        @Override // xsna.u1a
        public final void g(c cVar) {
            DonutVideoUiModel.DescriptionChip descriptionChip;
            c cVar2 = cVar;
            b2a b2aVar = (b2a) this.b.b;
            if (cVar2 instanceof c.C0469c) {
                if (((State) b2aVar.getCurrentState()).h) {
                    t(new vjs0.c(((c.C0469c) cVar2).b, ((State) b2aVar.getCurrentState()).e, null, null));
                    return;
                }
                return;
            }
            if (cVar2 instanceof c.b) {
                t(new fet0.e(((State) b2aVar.getCurrentState()).e, ((State) b2aVar.getCurrentState()).f));
                return;
            }
            if (!(cVar2 instanceof c.a)) {
                if (!(cVar2 instanceof c.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                c.d dVar = (c.d) cVar2;
                v(new VideoCatalogAnalyticsEvent.a(((State) b2aVar.getCurrentState()).e.r(), dVar.c, dVar.d));
                return;
            }
            DonutVideoUiModel donutVideoUiModel = ((State) b2aVar.getCurrentState()).g;
            DonutVideoAction donutVideoAction = (donutVideoUiModel == null || (descriptionChip = donutVideoUiModel.c) == null) ? null : descriptionChip.e;
            if (donutVideoAction != null) {
                t(new vjs0.a(((c.a) cVar2).b, donutVideoAction, DonutVideoClickSource.DESCRIPTION));
            } else if (((State) b2aVar.getCurrentState()).h) {
                t(new vjs0.c(((c.a) cVar2).b, ((State) b2aVar.getCurrentState()).e, null, null));
            }
        }
    }

    /* compiled from: VideoLargeListTabletView.kt */
    public interface c extends q1a {

        /* compiled from: VideoLargeListTabletView.kt */
        public static final class a implements c {
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
                return "OnMetaClick(blockId=" + this.b + ')';
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListTabletView.kt */
        public static final class b implements c {
            public final BlockId.CompositeId b;

            public b(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListTabletView.kt */
        /* renamed from: com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView$c$c, reason: collision with other inner class name */
        public static final class C0469c implements c {
            public final BlockId.CompositeId b;

            public C0469c(BlockId.CompositeId compositeId) {
                this.b = compositeId;
            }

            @Override // xsna.q1a
            public final BlockId w() {
                return this.b;
            }
        }

        /* compiled from: VideoLargeListTabletView.kt */
        public static final class d implements c {
            public final BlockId.CompositeId b;
            public final long c;
            public final long d;

            public d(BlockId.CompositeId compositeId, long j, long j2) {
                this.b = compositeId;
                this.c = j;
                this.d = j2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d;
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

    /* compiled from: VideoLargeListTabletView.kt */
    public static final class d implements r2a {
        public final BlockId.CompositeId b;
        public final VideoCellViewState c;

        public d(BlockId.CompositeId compositeId, VideoCellViewState videoCellViewState) {
            this.b = compositeId;
            this.c = videoCellViewState;
        }

        @Override // xsna.r2a
        public final BlockId w() {
            return this.b;
        }
    }

    /* compiled from: CatalogBlockInlineActorFactory.kt */
    public static final class e<State extends CatalogBlockState> implements t1a {
        public final /* synthetic */ yyl0 b;

        public e(yyl0 yyl0Var) {
            this.b = yyl0Var;
        }

        @Override // xsna.t1a
        public final s1a<State> a(b2a b2aVar) {
            return (s1a) this.b.invoke(b2aVar);
        }
    }

    public static void a(f1u f1uVar, hdt0 hdt0Var, x4o x4oVar, final l5o l5oVar, Context context, final g7s0 g7s0Var, m7a m7aVar, w3k0 w3k0Var, final f5o f5oVar, final boolean z) {
        List l = e43.l(CatalogBlockVariant.VideosLargeList, CatalogBlockVariant.VideosLargeListInvisibleAuthor);
        f2a<?> f2aVar = new f2a() { // from class: xsna.frs0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
            @Override // xsna.f2a
            public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
                ?? r5;
                boolean z2;
                List<UsersUserFullDto> list = catalogExtraResponseObjectDto.c;
                List<GroupsGroupFullDto> list2 = catalogExtraResponseObjectDto.d;
                List<String> f3 = catalogBlockDto.f3();
                if (f3 != null) {
                    r5 = new ArrayList();
                    Iterator it = f3.iterator();
                    while (it.hasNext()) {
                        String str = (String) j5g.k0(drm0.c0((String) it.next(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                        VideoVideoFullDto videoVideoFullDto = null;
                        if (str != null) {
                            int parseInt = Integer.parseInt(str);
                            List<VideoVideoFullDto> list3 = catalogExtraResponseObjectDto.h;
                            if (list3 != null) {
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    ?? next = it2.next();
                                    Integer s1 = ((VideoVideoFullDto) next).s1();
                                    if (s1 != null && s1.intValue() == parseInt) {
                                        videoVideoFullDto = next;
                                        break;
                                    }
                                }
                                videoVideoFullDto = videoVideoFullDto;
                            }
                        }
                        if (videoVideoFullDto != null) {
                            r5.add(videoVideoFullDto);
                        }
                    }
                } else {
                    r5 = EmptyList.b;
                }
                Iterable<VideoVideoFullDto> iterable = (Iterable) r5;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                for (VideoVideoFullDto videoVideoFullDto2 : iterable) {
                    VideoFile videoFile = (VideoFile) j5g.Y(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto2), list, list2, z, 20));
                    String id = catalogBlockDto.getId();
                    Integer s12 = videoVideoFullDto2.s1();
                    BlockId.CompositeId b2 = com.vk.catalog.mvi.block.a.b(s12 != null ? s12.intValue() : 0, id);
                    UserId q = catalogBlockDto.n1().q();
                    if (q == null) {
                        q = UserId.d;
                    }
                    UserId userId = q;
                    String url = catalogBlockDto.getUrl();
                    if (url == null) {
                        url = "";
                    }
                    String str2 = url;
                    DonutVideoUiModel a2 = l5oVar.a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD);
                    f5o f5oVar2 = f5oVar;
                    if (f5oVar2 != null) {
                        z2 = true;
                        if (f5oVar2.a()) {
                            arrayList.add(new VideoLargeListTabletView.State(b2, catalogBlockVariant, userId, videoFile, str2, a2, kpt0.h(videoFile, z2, g7s0Var.J().Y1())));
                        }
                    }
                    z2 = false;
                    arrayList.add(new VideoLargeListTabletView.State(b2, catalogBlockVariant, userId, videoFile, str2, a2, kpt0.h(videoFile, z2, g7s0Var.J().Y1())));
                }
                return arrayList;
            }
        };
        yyl0 yyl0Var = new yyl0(m7aVar, 12);
        com.vk.catalog.mvi.block.video.impl.video.largelisttablet.b bVar = new com.vk.catalog.mvi.block.video.impl.video.largelisttablet.b(context, w3k0Var, hdt0Var);
        a aVar = new a(hdt0Var, x4oVar);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            f1uVar.a((CatalogBlockVariant) it.next(), f2aVar);
        }
        f1uVar.c(State.class, new e(yyl0Var));
        f1uVar.h(State.class, bVar);
        f1uVar.g(d.class, aVar);
    }
}
