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
import xsna.zcl;

/* compiled from: AlbumsListView.kt */
/* loaded from: classes.dex */
public final class AlbumsListView$AlbumHorizontalState implements CatalogBlockReorderState {
    public static final Parcelable.Creator<AlbumsListView$AlbumHorizontalState> CREATOR = new a();
    public final BlockId b;
    public final CatalogBlockVariant c;
    public final CatalogBlockReorderState$ReorderData$Album d;
    public final VideoAlbum e;
    public final boolean f;
    public final Image g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    /* compiled from: AlbumsListView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<AlbumsListView$AlbumHorizontalState> {
        @Override // android.os.Parcelable.Creator
        public final AlbumsListView$AlbumHorizontalState createFromParcel(Parcel parcel) {
            Class cls;
            BlockId blockId;
            CatalogBlockVariant catalogBlockVariant;
            CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album;
            VideoAlbum videoAlbum;
            boolean z;
            boolean z2;
            boolean z3;
            BlockId blockId2 = (BlockId) parcel.readParcelable(AlbumsListView$AlbumHorizontalState.class.getClassLoader());
            CatalogBlockVariant valueOf = CatalogBlockVariant.valueOf(parcel.readString());
            CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album2 = (CatalogBlockReorderState$ReorderData$Album) parcel.readParcelable(AlbumsListView$AlbumHorizontalState.class.getClassLoader());
            VideoAlbum videoAlbum2 = (VideoAlbum) parcel.readParcelable(AlbumsListView$AlbumHorizontalState.class.getClassLoader());
            boolean z4 = true;
            if (parcel.readInt() != 0) {
                cls = AlbumsListView$AlbumHorizontalState.class;
                blockId = blockId2;
                catalogBlockVariant = valueOf;
                catalogBlockReorderState$ReorderData$Album = catalogBlockReorderState$ReorderData$Album2;
                videoAlbum = videoAlbum2;
                z = true;
            } else {
                cls = AlbumsListView$AlbumHorizontalState.class;
                blockId = blockId2;
                catalogBlockVariant = valueOf;
                catalogBlockReorderState$ReorderData$Album = catalogBlockReorderState$ReorderData$Album2;
                videoAlbum = videoAlbum2;
                z = false;
            }
            Image image = (Image) parcel.readParcelable(cls.getClassLoader());
            boolean z5 = false;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                z5 = z2;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z2 = z3;
            }
            return new AlbumsListView$AlbumHorizontalState(blockId, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, videoAlbum, z, image, readString, z4, z5, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumsListView$AlbumHorizontalState[] newArray(int i) {
            return new AlbumsListView$AlbumHorizontalState[i];
        }
    }

    public AlbumsListView$AlbumHorizontalState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album, VideoAlbum videoAlbum, boolean z, Image image, String str, boolean z2, boolean z3, boolean z4) {
        this.b = blockId;
        this.c = catalogBlockVariant;
        this.d = catalogBlockReorderState$ReorderData$Album;
        this.e = videoAlbum;
        this.f = z;
        this.g = image;
        this.h = str;
        this.i = z2;
        this.j = z3;
        this.k = z4;
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
        if (!(obj instanceof AlbumsListView$AlbumHorizontalState)) {
            return false;
        }
        AlbumsListView$AlbumHorizontalState albumsListView$AlbumHorizontalState = (AlbumsListView$AlbumHorizontalState) obj;
        return epx.f(this.b, albumsListView$AlbumHorizontalState.b) && this.c == albumsListView$AlbumHorizontalState.c && epx.f(this.d, albumsListView$AlbumHorizontalState.d) && epx.f(this.e, albumsListView$AlbumHorizontalState.e) && this.f == albumsListView$AlbumHorizontalState.f && epx.f(this.g, albumsListView$AlbumHorizontalState.g) && epx.f(this.h, albumsListView$AlbumHorizontalState.h) && this.i == albumsListView$AlbumHorizontalState.i && this.j == albumsListView$AlbumHorizontalState.j && this.k == albumsListView$AlbumHorizontalState.k;
    }

    public final int hashCode() {
        int b = qoy.b((this.e.hashCode() + ((this.d.hashCode() + b.b(this.c, this.b.hashCode() * 31, 31)) * 31)) * 31, 31, this.f);
        Image image = this.g;
        int hashCode = (b + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.h;
        return Boolean.hashCode(this.k) + qoy.b(qoy.b((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumHorizontalState(blockId=");
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
        sb.append(", ownerName=");
        sb.append(this.h);
        sb.append(", isOwnerVerified=");
        sb.append(this.i);
        sb.append(", newVideoBadge=");
        sb.append(this.j);
        sb.append(", isDraggable=");
        return q0.a(sb, this.k, ')');
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
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
    }

    public /* synthetic */ AlbumsListView$AlbumHorizontalState(BlockId blockId, CatalogBlockVariant catalogBlockVariant, CatalogBlockReorderState$ReorderData$Album catalogBlockReorderState$ReorderData$Album, VideoAlbum videoAlbum, boolean z, Image image, String str, boolean z2, boolean z3, boolean z4, int i, zcl zclVar) {
        this(blockId, catalogBlockVariant, catalogBlockReorderState$ReorderData$Album, videoAlbum, z, image, (i & 64) != 0 ? null : str, (i & 128) != 0 ? false : z2, z3, z4);
    }
}
