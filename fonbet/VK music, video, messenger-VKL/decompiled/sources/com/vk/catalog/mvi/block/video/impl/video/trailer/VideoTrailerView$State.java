package com.vk.catalog.mvi.block.video.impl.video.trailer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.j;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.lang.ref.WeakReference;
import xsna.ah50;
import xsna.epx;
import xsna.gi5;
import xsna.iht0;
import xsna.jq;
import xsna.qoy;
import xsna.yg5;
import xsna.zcl;

/* compiled from: VideoTrailerView.kt */
/* loaded from: classes.dex */
public final class VideoTrailerView$State implements CatalogBlockState {
    public static final Parcelable.Creator<VideoTrailerView$State> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final VideoFile d;
    public final yg5 e;
    public final com.vk.libvideo.autoplay.a f;
    public final gi5 g;
    public final WeakReference<VideoTextureView> h;
    public final iht0.c i;
    public final ah50 j;
    public final ah50 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    /* compiled from: VideoTrailerView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<VideoTrailerView$State> {
        @Override // android.os.Parcelable.Creator
        public final VideoTrailerView$State createFromParcel(Parcel parcel) {
            return new VideoTrailerView$State((BlockId) parcel.readParcelable(VideoTrailerView$State.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (VideoFile) parcel.readParcelable(VideoTrailerView$State.class.getClassLoader()), null, null, null, null, null, null, null, false, false, false, 8184, null);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTrailerView$State[] newArray(int i) {
            return new VideoTrailerView$State[i];
        }
    }

    public VideoTrailerView$State(BlockId blockId, CatalogBlockVariant catalogBlockVariant, VideoFile videoFile, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, gi5 gi5Var, WeakReference<VideoTextureView> weakReference, iht0.c cVar, ah50 ah50Var, ah50 ah50Var2, boolean z, boolean z2, boolean z3) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = videoFile;
        this.e = yg5Var;
        this.f = aVar;
        this.g = gi5Var;
        this.h = weakReference;
        this.i = cVar;
        this.j = ah50Var;
        this.k = ah50Var2;
        this.l = z;
        this.m = z2;
        this.n = z3;
    }

    public static VideoTrailerView$State a(VideoTrailerView$State videoTrailerView$State, VideoFile videoFile, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, gi5 gi5Var, WeakReference weakReference, iht0.c cVar, boolean z, boolean z2, boolean z3, int i) {
        BlockId blockId = videoTrailerView$State.b;
        CatalogBlockVariant catalogBlockVariant = videoTrailerView$State.c;
        VideoFile videoFile2 = (i & 4) != 0 ? videoTrailerView$State.d : videoFile;
        yg5 yg5Var2 = (i & 8) != 0 ? videoTrailerView$State.e : yg5Var;
        com.vk.libvideo.autoplay.a aVar2 = (i & 16) != 0 ? videoTrailerView$State.f : aVar;
        gi5 gi5Var2 = (i & 32) != 0 ? videoTrailerView$State.g : gi5Var;
        WeakReference weakReference2 = (i & 64) != 0 ? videoTrailerView$State.h : weakReference;
        iht0.c cVar2 = (i & 128) != 0 ? videoTrailerView$State.i : cVar;
        ah50 ah50Var = videoTrailerView$State.j;
        ah50 ah50Var2 = videoTrailerView$State.k;
        boolean z4 = (i & 1024) != 0 ? videoTrailerView$State.l : z;
        boolean z5 = (i & 2048) != 0 ? videoTrailerView$State.m : z2;
        boolean z6 = (i & 4096) != 0 ? videoTrailerView$State.n : z3;
        videoTrailerView$State.getClass();
        return new VideoTrailerView$State(blockId, catalogBlockVariant, videoFile2, yg5Var2, aVar2, gi5Var2, weakReference2, cVar2, ah50Var, ah50Var2, z4, z5, z6);
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
        if (!(obj instanceof VideoTrailerView$State)) {
            return false;
        }
        VideoTrailerView$State videoTrailerView$State = (VideoTrailerView$State) obj;
        return epx.f(this.b, videoTrailerView$State.b) && this.c == videoTrailerView$State.c && epx.f(this.d, videoTrailerView$State.d) && epx.f(this.e, videoTrailerView$State.e) && epx.f(this.f, videoTrailerView$State.f) && epx.f(this.g, videoTrailerView$State.g) && epx.f(this.h, videoTrailerView$State.h) && epx.f(this.i, videoTrailerView$State.i) && epx.f(this.j, videoTrailerView$State.j) && epx.f(this.k, videoTrailerView$State.k) && this.l == videoTrailerView$State.l && this.m == videoTrailerView$State.m && this.n == videoTrailerView$State.n;
    }

    public final int hashCode() {
        int b = jq.b(this.d, b.b(this.c, this.b.hashCode() * 31, 31), 31);
        yg5 yg5Var = this.e;
        int hashCode = (b + (yg5Var == null ? 0 : yg5Var.hashCode())) * 31;
        com.vk.libvideo.autoplay.a aVar = this.f;
        return Boolean.hashCode(this.n) + qoy.b(qoy.b((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", videoFile=");
        sb.append(this.d);
        sb.append(", autoPlay=");
        sb.append(this.e);
        sb.append(", autoPlayConfig=");
        sb.append(this.f);
        sb.append(", autoPlayState=");
        sb.append(this.g);
        sb.append(", videoView=");
        sb.append(this.h);
        sb.append(", slot=");
        sb.append(this.i);
        sb.append(", progressState=");
        sb.append(this.j);
        sb.append(", bufferedProgressState=");
        sb.append(this.k);
        sb.append(", isVideoFocused=");
        sb.append(this.l);
        sb.append(", shouldPlayOnFocusGain=");
        sb.append(this.m);
        sb.append(", isTimelineChanging=");
        return q0.a(sb, this.n, ')');
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

    public /* synthetic */ VideoTrailerView$State(BlockId blockId, CatalogBlockVariant catalogBlockVariant, VideoFile videoFile, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar, gi5 gi5Var, WeakReference weakReference, iht0.c cVar, ah50 ah50Var, ah50 ah50Var2, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(blockId, catalogBlockVariant, videoFile, (i & 8) != 0 ? null : yg5Var, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? new gi5(videoFile, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 268435454) : gi5Var, (i & 64) != 0 ? new WeakReference(null) : weakReference, (i & 128) != 0 ? new iht0.c() : cVar, (i & 256) != 0 ? j.a(-1L) : ah50Var, (i & 512) != 0 ? j.a(0L) : ah50Var2, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? false : z2, (i & 4096) != 0 ? false : z3);
    }
}
