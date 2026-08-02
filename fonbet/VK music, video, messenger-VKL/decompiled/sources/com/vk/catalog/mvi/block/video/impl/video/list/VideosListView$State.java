package com.vk.catalog.mvi.block.video.impl.video.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.jq;
import xsna.qoy;
import xsna.urd0;

/* compiled from: VideosListView.kt */
/* loaded from: classes.dex */
public final class VideosListView$State implements CatalogBlockState {
    public static final Parcelable.Creator<VideosListView$State> CREATOR = new a();
    public final BlockId.CompositeId b;
    public final CatalogBlockVariant c;
    public final UserId d;
    public final String e;
    public final VideoFile f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final DonutVideoUiModel j;
    public final boolean k;
    public final String l;

    /* compiled from: VideosListView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<VideosListView$State> {
        @Override // android.os.Parcelable.Creator
        public final VideosListView$State createFromParcel(Parcel parcel) {
            Class cls;
            boolean z;
            Class cls2;
            boolean z2;
            BlockId.CompositeId compositeId = (BlockId.CompositeId) parcel.readParcelable(VideosListView$State.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            UserId userId = (UserId) parcel.readParcelable(VideosListView$State.class.getClassLoader());
            String readString = parcel.readString();
            VideoFile videoFile = (VideoFile) parcel.readParcelable(VideosListView$State.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                cls = VideosListView$State.class;
                z = true;
            } else {
                cls = VideosListView$State.class;
                z = false;
            }
            if (parcel.readInt() != 0) {
                cls2 = cls;
                z2 = true;
            } else {
                cls2 = cls;
                z2 = false;
            }
            return new VideosListView$State(compositeId, valueOf, userId, readString, videoFile, readString2, z, z2, (DonutVideoUiModel) parcel.readParcelable(cls2.getClassLoader()), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideosListView$State[] newArray(int i) {
            return new VideosListView$State[i];
        }
    }

    public VideosListView$State(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, UserId userId, String str, VideoFile videoFile, String str2, boolean z, boolean z2, DonutVideoUiModel donutVideoUiModel, boolean z3, String str3) {
        this.b = compositeId;
        this.c = catalogBlockVariant;
        this.d = userId;
        this.e = str;
        this.f = videoFile;
        this.g = str2;
        this.h = z;
        this.i = z2;
        this.j = donutVideoUiModel;
        this.k = z3;
        this.l = str3;
    }

    public static VideosListView$State a(VideosListView$State videosListView$State, VideoFile videoFile, int i) {
        BlockId.CompositeId compositeId = videosListView$State.b;
        CatalogBlockVariant catalogBlockVariant = videosListView$State.c;
        UserId userId = videosListView$State.d;
        String str = videosListView$State.e;
        if ((i & 16) != 0) {
            videoFile = videosListView$State.f;
        }
        VideoFile videoFile2 = videoFile;
        String str2 = videosListView$State.g;
        boolean z = videosListView$State.h;
        boolean z2 = videosListView$State.i;
        DonutVideoUiModel donutVideoUiModel = videosListView$State.j;
        boolean z3 = videosListView$State.k;
        String str3 = (i & 1024) != 0 ? videosListView$State.l : null;
        videosListView$State.getClass();
        return new VideosListView$State(compositeId, catalogBlockVariant, userId, str, videoFile2, str2, z, z2, donutVideoUiModel, z3, str3);
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
        if (!(obj instanceof VideosListView$State)) {
            return false;
        }
        VideosListView$State videosListView$State = (VideosListView$State) obj;
        return epx.f(this.b, videosListView$State.b) && this.c == videosListView$State.c && epx.f(this.d, videosListView$State.d) && epx.f(this.e, videosListView$State.e) && epx.f(this.f, videosListView$State.f) && epx.f(this.g, videosListView$State.g) && this.h == videosListView$State.h && this.i == videosListView$State.i && epx.f(this.j, videosListView$State.j) && this.k == videosListView$State.k && epx.f(this.l, videosListView$State.l);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(jq.b(this.f, urd0.a(bh10.a(io.reactivex.rxjava3.subjects.b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d.b), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
        DonutVideoUiModel donutVideoUiModel = this.j;
        int b2 = qoy.b((b + (donutVideoUiModel == null ? 0 : donutVideoUiModel.hashCode())) * 31, 31, this.k);
        String str = this.l;
        return b2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", videoFile=");
        sb.append(this.f);
        sb.append(", urlToBlock=");
        sb.append(this.g);
        sb.append(", hasDragAndDrop=");
        sb.append(this.h);
        sb.append(", isTablet=");
        sb.append(this.i);
        sb.append(", donutVideoUiModel=");
        sb.append(this.j);
        sb.append(", isVideoClickable=");
        sb.append(this.k);
        sb.append(", pinSubscribersTooltipTitle=");
        return ho8.a(sb, this.l, ')');
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
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeParcelable(this.j, i);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeString(this.l);
    }
}
