package com.vk.catalog.mvi.block.video.impl.upload;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.sn;
import xsna.zcl;

/* compiled from: UploadListView.kt */
/* loaded from: classes.dex */
public final class UploadListView$UploadListState implements CatalogBlockState {
    public static final Parcelable.Creator<UploadListView$UploadListState> CREATOR = new a();
    public final String b;
    public final CatalogBlockVariant c;
    public final Boolean d;
    public final UserId e;
    public final List<VideoUploadEvent> f;

    /* compiled from: UploadListView.kt */
    /* loaded from: classes16.dex */
    public static final class a implements Parcelable.Creator<UploadListView$UploadListState> {
        @Override // android.os.Parcelable.Creator
        public final UploadListView$UploadListState createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String str = ((BlockId.Simple) parcel.readParcelable(UploadListView$UploadListState.class.getClassLoader())).b;
            CatalogBlockVariant valueOf2 = CatalogBlockVariant.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UploadListView$UploadListState(str, valueOf2, valueOf, (UserId) parcel.readParcelable(UploadListView$UploadListState.class.getClassLoader()), null, 16, null);
        }

        @Override // android.os.Parcelable.Creator
        public final UploadListView$UploadListState[] newArray(int i) {
            return new UploadListView$UploadListState[i];
        }
    }

    public UploadListView$UploadListState() {
        throw null;
    }

    public UploadListView$UploadListState(String str, CatalogBlockVariant catalogBlockVariant, Boolean bool, UserId userId, List list, zcl zclVar) {
        this.b = str;
        this.c = catalogBlockVariant;
        this.d = bool;
        this.e = userId;
        this.f = list;
    }

    public static UploadListView$UploadListState a(UploadListView$UploadListState uploadListView$UploadListState, List list) {
        String str = uploadListView$UploadListState.b;
        CatalogBlockVariant catalogBlockVariant = uploadListView$UploadListState.c;
        Boolean bool = uploadListView$UploadListState.d;
        UserId userId = uploadListView$UploadListState.e;
        uploadListView$UploadListState.getClass();
        return new UploadListView$UploadListState(str, catalogBlockVariant, bool, userId, list, null);
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
        if (!(obj instanceof UploadListView$UploadListState)) {
            return false;
        }
        UploadListView$UploadListState uploadListView$UploadListState = (UploadListView$UploadListState) obj;
        return BlockId.Simple.b(this.b, uploadListView$UploadListState.b) && this.c == uploadListView$UploadListState.c && epx.f(this.d, uploadListView$UploadListState.d) && epx.f(this.e, uploadListView$UploadListState.e) && epx.f(this.f, uploadListView$UploadListState.f);
    }

    public final int hashCode() {
        int b = b.b(this.c, BlockId.Simple.d(this.b) * 31, 31);
        Boolean bool = this.d;
        return this.f.hashCode() + bh10.a((b + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.e.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadListState(blockId=");
        io.reactivex.rxjava3.processors.b.b(sb, this.b, ", blockVariant=");
        sb.append(this.c);
        sb.append(", isVideosDelayed=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", uploadEventsStateList=");
        return ms9.a(')', sb, this.f);
    }

    @Override // com.vk.catalog.mvi.block.CatalogBlockState
    public final BlockId w() {
        return BlockId.Simple.a(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(BlockId.Simple.a(this.b), i);
        parcel.writeString(this.c.name());
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.e, i);
    }

    public UploadListView$UploadListState(String str, CatalogBlockVariant catalogBlockVariant, Boolean bool, UserId userId, List list, int i, zcl zclVar) {
        this(str, catalogBlockVariant, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? UserId.d : userId, (i & 16) != 0 ? EmptyList.b : list, null);
    }
}
