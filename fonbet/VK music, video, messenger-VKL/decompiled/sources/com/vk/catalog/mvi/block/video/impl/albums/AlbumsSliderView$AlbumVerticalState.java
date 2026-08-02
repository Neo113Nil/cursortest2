package com.vk.catalog.mvi.block.video.impl.albums;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockReorderState;
import com.vk.catalog.mvi.block.CatalogBlockReorderState$ReorderData$Album;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.Image;
import com.vk.dto.video.VideoAlbum;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.qoy;

/* compiled from: AlbumsSliderView.kt */
/* loaded from: classes.dex */
public final class AlbumsSliderView$AlbumVerticalState implements CatalogBlockReorderState {
    public static final Parcelable.Creator<AlbumsSliderView$AlbumVerticalState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final CatalogBlockReorderState$ReorderData$Album d;
    public final VideoAlbum e;
    public final boolean f;
    public final Image g;
    public final boolean h;

    /* compiled from: AlbumsSliderView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<AlbumsSliderView$AlbumVerticalState> {
        @Override // android.os.Parcelable.Creator
        public final AlbumsSliderView$AlbumVerticalState createFromParcel(Parcel parcel) {
            Class cls;
            BlockId blockId;
            CatalogBlockVariant catalogBlockVariant;
            CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album;
            VideoAlbum videoAlbum;
            boolean z;
            BlockId blockId2 = (BlockId) parcel.readParcelable(AlbumsSliderView$AlbumVerticalState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album2 = (CatalogBlockReorderState$ReorderData$Album) parcel.readParcelable(AlbumsSliderView$AlbumVerticalState.class.getClassLoader());
            VideoAlbum videoAlbum2 = (VideoAlbum) parcel.readParcelable(AlbumsSliderView$AlbumVerticalState.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = AlbumsSliderView$AlbumVerticalState.class;
                blockId = blockId2;
                catalogBlockVariant = valueOf;
                catalogBlockReorderState$ReorderData$Album = catalogBlockReorderState$ReorderData$Album2;
                videoAlbum = videoAlbum2;
                z = true;
            } else {
                cls = AlbumsSliderView$AlbumVerticalState.class;
                blockId = blockId2;
                catalogBlockVariant = valueOf;
                catalogBlockReorderState$ReorderData$Album = catalogBlockReorderState$ReorderData$Album2;
                videoAlbum = videoAlbum2;
                z = false;
            }
            return new AlbumsSliderView$AlbumVerticalState(blockId, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, videoAlbum, z, (Image) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumsSliderView$AlbumVerticalState[] newArray(int i) {
            return new AlbumsSliderView$AlbumVerticalState[i];
        }
    }

    public AlbumsSliderView$AlbumVerticalState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album, VideoAlbum videoAlbum, boolean z, Image image, boolean z2) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = catalogBlockReorderState$ReorderData$Album;
        this.e = videoAlbum;
        this.f = z;
        this.g = image;
        this.h = z2;
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final CatalogBlockVariant M7() {
        return this.c;
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockReorderState
    public final CatalogBlockReorderState$ReorderData$Album c3() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumsSliderView$AlbumVerticalState)) {
            return false;
        }
        AlbumsSliderView$AlbumVerticalState albumsSliderView$AlbumVerticalState = (AlbumsSliderView$AlbumVerticalState) obj;
        return epx.f(this.b, albumsSliderView$AlbumVerticalState.b) && this.c == albumsSliderView$AlbumVerticalState.c && epx.f(this.d, albumsSliderView$AlbumVerticalState.d) && epx.f(this.e, albumsSliderView$AlbumVerticalState.e) && this.f == albumsSliderView$AlbumVerticalState.f && epx.f(this.g, albumsSliderView$AlbumVerticalState.g) && this.h == albumsSliderView$AlbumVerticalState.h;
    }

    public final int hashCode() {
        int b = qoy.b((this.e.hashCode() + ((this.d.hashCode() + b.b(this.c, this.b.hashCode() * 31, 31)) * 31)) * 31, 31, this.f);
        Image image = this.g;
        return Boolean.hashCode(this.h) + ((b + (image == null ? 0 : image.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumVerticalState(blockId=");
        sb.append(this.b);
        sb.append(", blockVariant=");
        sb.append(this.c);
        sb.append(", reorderData=");
        sb.append(this.d);
        sb.append(", album=");
        sb.append(this.e);
        sb.append(", isNft=");
        sb.append(this.f);
        sb.append(", ownerImage=");
        sb.append(this.g);
        sb.append(", newVideoBadge=");
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
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
