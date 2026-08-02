package com.vk.api.generated.places.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.likes.dto.LikesReactionSetDto;
import com.vk.api.generated.wall.dto.WallWallpostDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PlacesGetPostsResponseDto.kt */
/* loaded from: classes15.dex */
public final class PlacesGetPostsResponseDto implements Parcelable {
    public static final Parcelable.Creator<PlacesGetPostsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallpostDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("reaction_sets")
    private final List<LikesReactionSetDto> reactionSets;

    /* compiled from: PlacesGetPostsResponseDto.kt */
    public static final class a implements Parcelable.Creator<PlacesGetPostsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PlacesGetPostsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = en.a(WallWallpostDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(LikesReactionSetDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new PlacesGetPostsResponseDto(readInt, arrayList2, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PlacesGetPostsResponseDto[] newArray(int i) {
            return new PlacesGetPostsResponseDto[i];
        }
    }

    public PlacesGetPostsResponseDto(int i, List<WallWallpostDto> list, String str, List<LikesReactionSetDto> list2) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
        this.reactionSets = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacesGetPostsResponseDto)) {
            return false;
        }
        PlacesGetPostsResponseDto placesGetPostsResponseDto = (PlacesGetPostsResponseDto) obj;
        return this.count == placesGetPostsResponseDto.count && epx.f(this.items, placesGetPostsResponseDto.items) && epx.f(this.nextFrom, placesGetPostsResponseDto.nextFrom) && epx.f(this.reactionSets, placesGetPostsResponseDto.reactionSets);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<LikesReactionSetDto> list = this.reactionSets;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesGetPostsResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", reactionSets=");
        return ms9.a(')', sb, this.reactionSets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((WallWallpostDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
        List<LikesReactionSetDto> list = this.reactionSets;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((LikesReactionSetDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ PlacesGetPostsResponseDto(int i, List list, String str, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2);
    }
}
