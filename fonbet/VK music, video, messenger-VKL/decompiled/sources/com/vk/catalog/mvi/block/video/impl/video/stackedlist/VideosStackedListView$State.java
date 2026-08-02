package com.vk.catalog.mvi.block.video.impl.video.stackedlist;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import xsna.bh10;
import xsna.epx;
import xsna.jq;
import xsna.qoy;
import xsna.urd0;

/* compiled from: VideosStackedListView.kt */
/* loaded from: classes.dex */
public final class VideosStackedListView$State implements CatalogBlockState {
    public static final Parcelable.Creator<VideosStackedListView$State> CREATOR = new a();
    public final BlockId.CompositeId b;
    public final CatalogBlockVariant c;
    public final UserId d;
    public final String e;
    public final String f;
    public final VideoFile g;
    public final String h;
    public final CatalogViewStyle i;
    public final boolean j;
    public final DonutVideoUiModel k;

    /* compiled from: VideosStackedListView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<VideosStackedListView$State> {
        @Override // android.os.Parcelable.Creator
        public final VideosStackedListView$State createFromParcel(Parcel parcel) {
            return new VideosStackedListView$State((BlockId.CompositeId) parcel.readParcelable(VideosStackedListView$State.class.getClassLoader()), CatalogBlockVariant.valueOf(parcel.readString()), (UserId) parcel.readParcelable(VideosStackedListView$State.class.getClassLoader()), parcel.readString(), parcel.readString(), (VideoFile) parcel.readParcelable(VideosStackedListView$State.class.getClassLoader()), parcel.readString(), (CatalogViewStyle) parcel.readParcelable(VideosStackedListView$State.class.getClassLoader()), parcel.readInt() != 0, (DonutVideoUiModel) parcel.readParcelable(VideosStackedListView$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideosStackedListView$State[] newArray(int i) {
            return new VideosStackedListView$State[i];
        }
    }

    public VideosStackedListView$State(BlockId.CompositeId compositeId, CatalogBlockVariant catalogBlockVariant, UserId userId, String str, String str2, VideoFile videoFile, String str3, CatalogViewStyle catalogViewStyle, boolean z, DonutVideoUiModel donutVideoUiModel) {
        this.b = compositeId;
        this.c = catalogBlockVariant;
        this.d = userId;
        this.e = str;
        this.f = str2;
        this.g = videoFile;
        this.h = str3;
        this.i = catalogViewStyle;
        this.j = z;
        this.k = donutVideoUiModel;
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
        if (!(obj instanceof VideosStackedListView$State)) {
            return false;
        }
        VideosStackedListView$State videosStackedListView$State = (VideosStackedListView$State) obj;
        return epx.f(this.b, videosStackedListView$State.b) && this.c == videosStackedListView$State.c && epx.f(this.d, videosStackedListView$State.d) && epx.f(this.e, videosStackedListView$State.e) && epx.f(this.f, videosStackedListView$State.f) && epx.f(this.g, videosStackedListView$State.g) && epx.f(this.h, videosStackedListView$State.h) && epx.f(this.i, videosStackedListView$State.i) && this.j == videosStackedListView$State.j && epx.f(this.k, videosStackedListView$State.k);
    }

    public final int hashCode() {
        int a2 = urd0.a(jq.b(this.g, urd0.a(urd0.a(bh10.a(b.b(this.c, this.b.hashCode() * 31, 31), 31, this.d.b), 31, this.e), 31, this.f), 31), 31, this.h);
        CatalogViewStyle catalogViewStyle = this.i;
        int b = qoy.b((a2 + (catalogViewStyle == null ? 0 : catalogViewStyle.hashCode())) * 31, 31, this.j);
        DonutVideoUiModel donutVideoUiModel = this.k;
        return b + (donutVideoUiModel != null ? donutVideoUiModel.hashCode() : 0);
    }

    public final String toString() {
        return "State(blockId=" + this.b + ", blockVariant=" + this.c + ", ownerId=" + this.d + ", title=" + this.e + ", previewImageUrl=" + this.f + ", videoFile=" + this.g + ", urlToBlock=" + this.h + ", viewStyle=" + this.i + ", hasDragAndDrop=" + this.j + ", donutVideoUiModel=" + this.k + ')';
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
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeParcelable(this.k, i);
    }
}
