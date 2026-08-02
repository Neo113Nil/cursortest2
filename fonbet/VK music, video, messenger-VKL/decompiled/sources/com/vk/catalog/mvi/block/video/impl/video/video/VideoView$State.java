package com.vk.catalog.mvi.block.video.impl.video.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.jq;
import xsna.urd0;

/* compiled from: VideoView.kt */
/* loaded from: classes.dex */
public final class VideoView$State implements CatalogBlockState {
    public static final Parcelable.Creator<VideoView$State> CREATOR = new a();
    public final BlockId.CompositeId b;
    public final CatalogBlockVariant c;
    public final VideoFile d;
    public final String e;
    public final String f;
    public final DonutVideoUiModel g;

    /* compiled from: VideoView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<VideoView$State> {
        @Override // android.os.Parcelable.Creator
        public final VideoView$State createFromParcel(Parcel parcel) {
            return new VideoView$State((BlockId.CompositeId) parcel.readParcelable(VideoView$State.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (VideoFile) parcel.readParcelable(VideoView$State.class.getClassLoader()), parcel.readString(), parcel.readString(), (DonutVideoUiModel) parcel.readParcelable(VideoView$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoView$State[] newArray(int i) {
            return new VideoView$State[i];
        }
    }

    public VideoView$State(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, VideoFile videoFile, String str, String str2, DonutVideoUiModel donutVideoUiModel) {
        this.b = compositeId;
        this.c = catalogBlockVariant;
        this.d = videoFile;
        this.e = str;
        this.f = str2;
        this.g = donutVideoUiModel;
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
        if (!(obj instanceof VideoView$State)) {
            return false;
        }
        VideoView$State videoView$State = (VideoView$State) obj;
        return epx.f(this.b, videoView$State.b) && this.c == videoView$State.c && epx.f(this.d, videoView$State.d) && epx.f(this.e, videoView$State.e) && epx.f(this.f, videoView$State.f) && epx.f(this.g, videoView$State.g);
    }

    public final int hashCode() {
        int b = jq.b(this.d, b.b(this.c, this.b.hashCode() * 31, 31), 31);
        String str = this.e;
        int a2 = urd0.a((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        DonutVideoUiModel donutVideoUiModel = this.g;
        return a2 + (donutVideoUiModel != null ? donutVideoUiModel.hashCode() : 0);
    }

    public final String toString() {
        return "State(blockId=" + this.b + ", blockVariant=" + this.c + ", videoFile=" + this.d + ", trackCode=" + this.e + ", urlToBlock=" + this.f + ", donutVideoUiModel=" + this.g + ')';
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
    }
}
