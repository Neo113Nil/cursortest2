package com.vk.catalog.mvi.block.video.impl.video.largelist.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import xsna.ah50;
import xsna.epx;
import xsna.fjz;
import xsna.gi5;
import xsna.iht0;
import xsna.j0z;
import xsna.jq;
import xsna.kzr0;
import xsna.mno0;
import xsna.nr;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;
import xsna.yg5;
import xsna.yjk0;
import xsna.zhf0;

/* compiled from: VideoLargeListState.kt */
/* loaded from: classes.dex */
public final class VideoLargeListState implements CatalogBlockState, j0z {
    public static final Parcelable.Creator<VideoLargeListState> CREATOR = new a();
    public final int A;
    public final BlockId.CompositeId b;
    public final CatalogBlockVariant c;
    public final VideoFile d;
    public final String e;
    public final String f;
    public final DonutVideoUiModel g;
    public final VideoPinType h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ah50 l;
    public final ah50 m;
    public final zhf0 n;
    public final boolean o;
    public final iht0.c p;
    public final mno0 q;
    public final yg5 r;
    public final com.vk.libvideo.autoplay.a s;
    public final gi5 t;
    public final Integer u;
    public final fjz v;
    public final WeakReference<yjk0> w;
    public final WeakReference<ViewGroup> x;
    public final kzr0 y;
    public final WeakReference<VideoTextureView> z;

    /* compiled from: VideoLargeListState.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<VideoLargeListState> {
        @Override // android.os.Parcelable.Creator
        public final VideoLargeListState createFromParcel(Parcel parcel) {
            return new VideoLargeListState((BlockId.CompositeId) parcel.readParcelable(VideoLargeListState.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (VideoFile) parcel.readParcelable(VideoLargeListState.class.getClassLoader()), parcel.readString(), parcel.readString(), (DonutVideoUiModel) parcel.readParcelable(VideoLargeListState.class.getClassLoader()), (VideoPinType) parcel.readParcelable(VideoLargeListState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, null, null, null, false, null, null, null, null, null, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), null, null, null, null, null, parcel.readInt(), 33029120, null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoLargeListState[] newArray(int i) {
            return new VideoLargeListState[i];
        }
    }

    public VideoLargeListState(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, VideoFile videoFile, String str, String str2, DonutVideoUiModel donutVideoUiModel, VideoPinType videoPinType, boolean z, boolean z2, boolean z3, ah50 ah50Var, ah50 ah50Var2, zhf0 zhf0Var, boolean z4, iht0.c cVar, mno0 mno0Var, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, gi5 gi5Var, Integer num, fjz fjzVar, WeakReference<yjk0> weakReference, WeakReference<ViewGroup> weakReference2, kzr0 kzr0Var, WeakReference<VideoTextureView> weakReference3, int i) {
        this.b = compositeId;
        this.c = catalogBlockVariant;
        this.d = videoFile;
        this.e = str;
        this.f = str2;
        this.g = donutVideoUiModel;
        this.h = videoPinType;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = ah50Var;
        this.m = ah50Var2;
        this.n = zhf0Var;
        this.o = z4;
        this.p = cVar;
        this.q = mno0Var;
        this.r = yg5Var;
        this.s = aVar;
        this.t = gi5Var;
        this.u = num;
        this.v = fjzVar;
        this.w = weakReference;
        this.x = weakReference2;
        this.y = kzr0Var;
        this.z = weakReference3;
        this.A = i;
    }

    public static VideoLargeListState a(VideoLargeListState videoLargeListState, VideoFile videoFile, boolean z, boolean z2, ah50 ah50Var, ah50 ah50Var2, zhf0 zhf0Var, boolean z3, iht0.c cVar, mno0 mno0Var, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, gi5 gi5Var, Integer num, fjz fjzVar, WeakReference weakReference, WeakReference weakReference2, kzr0 kzr0Var, WeakReference weakReference3, int i, int i2) {
        BlockId.CompositeId compositeId = videoLargeListState.b;
        CatalogBlockVariant catalogBlockVariant = videoLargeListState.c;
        VideoFile videoFile2 = (i2 & 4) != 0 ? videoLargeListState.d : videoFile;
        String str = videoLargeListState.e;
        VideoFile videoFile3 = videoFile2;
        String str2 = videoLargeListState.f;
        DonutVideoUiModel donutVideoUiModel = videoLargeListState.g;
        VideoPinType videoPinType = videoLargeListState.h;
        boolean z4 = videoLargeListState.i;
        boolean z5 = (i2 & 256) != 0 ? videoLargeListState.j : z;
        boolean z6 = (i2 & 512) != 0 ? videoLargeListState.k : z2;
        ah50 ah50Var3 = (i2 & 1024) != 0 ? videoLargeListState.l : ah50Var;
        ah50 ah50Var4 = (i2 & 2048) != 0 ? videoLargeListState.m : ah50Var2;
        zhf0 zhf0Var2 = (i2 & 4096) != 0 ? videoLargeListState.n : zhf0Var;
        boolean z7 = (i2 & 8192) != 0 ? videoLargeListState.o : z3;
        iht0.c cVar2 = (i2 & 16384) != 0 ? videoLargeListState.p : cVar;
        mno0 mno0Var2 = (i2 & 32768) != 0 ? videoLargeListState.q : mno0Var;
        yg5 yg5Var2 = (i2 & 65536) != 0 ? videoLargeListState.r : yg5Var;
        com.vk.libvideo.autoplay.a aVar2 = (i2 & 131072) != 0 ? videoLargeListState.s : aVar;
        gi5 gi5Var2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? videoLargeListState.t : gi5Var;
        Integer num2 = (i2 & 524288) != 0 ? videoLargeListState.u : num;
        fjz fjzVar2 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? videoLargeListState.v : fjzVar;
        WeakReference weakReference4 = (i2 & 2097152) != 0 ? videoLargeListState.w : weakReference;
        WeakReference weakReference5 = (i2 & 4194304) != 0 ? videoLargeListState.x : weakReference2;
        kzr0 kzr0Var2 = (i2 & 8388608) != 0 ? videoLargeListState.y : kzr0Var;
        WeakReference weakReference6 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? videoLargeListState.z : weakReference3;
        int i3 = (i2 & 33554432) != 0 ? videoLargeListState.A : i;
        videoLargeListState.getClass();
        return new VideoLargeListState(compositeId, catalogBlockVariant, videoFile3, str, str2, donutVideoUiModel, videoPinType, z4, z5, z6, ah50Var3, ah50Var4, zhf0Var2, z7, cVar2, mno0Var2, yg5Var2, aVar2, gi5Var2, num2, fjzVar2, weakReference4, weakReference5, kzr0Var2, weakReference6, i3);
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
        if (!(obj instanceof VideoLargeListState)) {
            return false;
        }
        VideoLargeListState videoLargeListState = (VideoLargeListState) obj;
        return epx.f(this.b, videoLargeListState.b) && this.c == videoLargeListState.c && epx.f(this.d, videoLargeListState.d) && epx.f(this.e, videoLargeListState.e) && epx.f(this.f, videoLargeListState.f) && epx.f(this.g, videoLargeListState.g) && this.h == videoLargeListState.h && this.i == videoLargeListState.i && this.j == videoLargeListState.j && this.k == videoLargeListState.k && epx.f(this.l, videoLargeListState.l) && epx.f(this.m, videoLargeListState.m) && epx.f(this.n, videoLargeListState.n) && this.o == videoLargeListState.o && epx.f(this.p, videoLargeListState.p) && epx.f(this.q, videoLargeListState.q) && epx.f(this.r, videoLargeListState.r) && epx.f(this.s, videoLargeListState.s) && epx.f(this.t, videoLargeListState.t) && epx.f(this.u, videoLargeListState.u) && epx.f(this.v, videoLargeListState.v) && epx.f(this.w, videoLargeListState.w) && epx.f(this.x, videoLargeListState.x) && epx.f(this.y, videoLargeListState.y) && epx.f(this.z, videoLargeListState.z) && this.A == videoLargeListState.A;
    }

    @Override // xsna.j0z
    public final VideoTextureView getVideoTextureView() {
        return this.z.get();
    }

    public final int hashCode() {
        int a2 = urd0.a(jq.b(this.d, b.b(this.c, this.b.hashCode() * 31, 31), 31), 31, this.e);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        DonutVideoUiModel donutVideoUiModel = this.g;
        int hashCode2 = (hashCode + (donutVideoUiModel == null ? 0 : donutVideoUiModel.hashCode())) * 31;
        VideoPinType videoPinType = this.h;
        int hashCode3 = (this.p.hashCode() + qoy.b((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + qoy.b(qoy.b(qoy.b((hashCode2 + (videoPinType == null ? 0 : videoPinType.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k)) * 31)) * 31)) * 31, 31, this.o)) * 31;
        mno0 mno0Var = this.q;
        int hashCode4 = (hashCode3 + (mno0Var == null ? 0 : mno0Var.hashCode())) * 31;
        yg5 yg5Var = this.r;
        int hashCode5 = (hashCode4 + (yg5Var == null ? 0 : yg5Var.hashCode())) * 31;
        com.vk.libvideo.autoplay.a aVar = this.s;
        int hashCode6 = (this.t.hashCode() + ((hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        Integer num = this.u;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        fjz fjzVar = this.v;
        int hashCode8 = (this.x.hashCode() + ((this.w.hashCode() + ((hashCode7 + (fjzVar == null ? 0 : fjzVar.hashCode())) * 31)) * 31)) * 31;
        kzr0 kzr0Var = this.y;
        return Integer.hashCode(this.A) + ((this.z.hashCode() + ((hashCode8 + (kzr0Var != null ? kzr0Var.hashCode() : 0)) * 31)) * 31);
    }

    @Override // xsna.j0z
    public final com.vk.libvideo.autoplay.a j() {
        return this.s;
    }

    @Override // xsna.j0z
    public final iht0.c o() {
        return this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoLargeListState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", videoFile=");
        sb.append(this.d);
        sb.append(", urlToBlock=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", donutVideoUiModel=");
        sb.append(this.g);
        sb.append(", pinType=");
        sb.append(this.h);
        sb.append(", isAddEnabled=");
        sb.append(this.i);
        sb.append(", isTimelineChanging=");
        sb.append(this.j);
        sb.append(", isActionsBackgroundVisible=");
        sb.append(this.k);
        sb.append(", progressState=");
        sb.append(this.l);
        sb.append(", bufferedProgressState=");
        sb.append(this.m);
        sb.append(", lastVideoViewBounds=");
        sb.append(this.n);
        sb.append(", isVideoFocused=");
        sb.append(this.o);
        sb.append(", slot=");
        sb.append(this.p);
        sb.append(", topText=");
        sb.append(this.q);
        sb.append(", autoPlay=");
        sb.append(this.r);
        sb.append(", autoPlayConfig=");
        sb.append(this.s);
        sb.append(", autoPlayState=");
        sb.append(this.t);
        sb.append(", currentViewers=");
        sb.append(this.u);
        sb.append(", liveEventsDelegate=");
        sb.append(this.v);
        sb.append(", spectatorsInlineView=");
        sb.append(this.w);
        sb.append(", liveInlineHolderView=");
        sb.append(this.x);
        sb.append(", videoAdLayoutConfig=");
        sb.append(this.y);
        sb.append(", videoView=");
        sb.append(this.z);
        sb.append(", forceUpdateIncrement=");
        return vu5.b(sb, this.A, ')');
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
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        Integer num = this.u;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.A);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ VideoLargeListState(com.vk.catalog.mvi.block.BlockId.CompositeId r49, com.vk.catalog.mvi.register.CatalogBlockVariant r50, com.vk.dto.common.VideoFile r51, java.lang.String r52, java.lang.String r53, com.vk.donut.video.model.presentation.video.DonutVideoUiModel r54, com.vk.libvideo.author.VideoPinType r55, boolean r56, boolean r57, boolean r58, xsna.ah50 r59, xsna.ah50 r60, xsna.zhf0 r61, boolean r62, xsna.iht0.c r63, xsna.mno0 r64, xsna.yg5 r65, com.vk.libvideo.autoplay.a r66, xsna.gi5 r67, java.lang.Integer r68, xsna.fjz r69, java.lang.ref.WeakReference r70, java.lang.ref.WeakReference r71, xsna.kzr0 r72, java.lang.ref.WeakReference r73, int r74, int r75, xsna.zcl r76) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState.<init>(com.vk.catalog.mvi.block.BlockId$CompositeId, com.vk.catalog.mvi.register.CatalogBlockVariant, com.vk.dto.common.VideoFile, java.lang.String, java.lang.String, com.vk.donut.video.model.presentation.video.DonutVideoUiModel, com.vk.libvideo.author.VideoPinType, boolean, boolean, boolean, xsna.ah50, xsna.ah50, xsna.zhf0, boolean, xsna.iht0$c, xsna.mno0, xsna.yg5, com.vk.libvideo.autoplay.a, xsna.gi5, java.lang.Integer, xsna.fjz, java.lang.ref.WeakReference, java.lang.ref.WeakReference, xsna.kzr0, java.lang.ref.WeakReference, int, int, xsna.zcl):void");
    }
}
