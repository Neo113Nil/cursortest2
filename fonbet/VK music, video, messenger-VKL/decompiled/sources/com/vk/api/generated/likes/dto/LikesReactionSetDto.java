package com.vk.api.generated.likes.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: LikesReactionSetDto.kt */
/* loaded from: classes14.dex */
public final class LikesReactionSetDto implements Parcelable {
    public static final Parcelable.Creator<LikesReactionSetDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<LikesReactionMetaDto> items;

    /* compiled from: LikesReactionSetDto.kt */
    public static final class a implements Parcelable.Creator<LikesReactionSetDto> {
        @Override // android.os.Parcelable.Creator
        public final LikesReactionSetDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(LikesReactionMetaDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new LikesReactionSetDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LikesReactionSetDto[] newArray(int i) {
            return new LikesReactionSetDto[i];
        }
    }

    public LikesReactionSetDto(String str, List<LikesReactionMetaDto> list) {
        this.id = str;
        this.items = list;
    }

    public final List<LikesReactionMetaDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesReactionSetDto)) {
            return false;
        }
        LikesReactionSetDto likesReactionSetDto = (LikesReactionSetDto) obj;
        return epx.f(this.id, likesReactionSetDto.id) && epx.f(this.items, likesReactionSetDto.items);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikesReactionSetDto(id=");
        sb.append(this.id);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((LikesReactionMetaDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
