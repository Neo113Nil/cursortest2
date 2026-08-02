package com.vk.api.generated.messages.dto;

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

/* compiled from: MessagesGetVideoMessageShapesByIdsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetVideoMessageShapesByIdsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetVideoMessageShapesByIdsResponseDto> CREATOR = new a();

    @pmi0("shapes")
    private final List<MessagesVideoMessageShapeResponseItemDto> shapes;

    /* compiled from: MessagesGetVideoMessageShapesByIdsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetVideoMessageShapesByIdsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetVideoMessageShapesByIdsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesVideoMessageShapeResponseItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetVideoMessageShapesByIdsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetVideoMessageShapesByIdsResponseDto[] newArray(int i) {
            return new MessagesGetVideoMessageShapesByIdsResponseDto[i];
        }
    }

    public MessagesGetVideoMessageShapesByIdsResponseDto(List<MessagesVideoMessageShapeResponseItemDto> list) {
        this.shapes = list;
    }

    public final List<MessagesVideoMessageShapeResponseItemDto> d() {
        return this.shapes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetVideoMessageShapesByIdsResponseDto) && epx.f(this.shapes, ((MessagesGetVideoMessageShapesByIdsResponseDto) obj).shapes);
    }

    public final int hashCode() {
        return this.shapes.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetVideoMessageShapesByIdsResponseDto(shapes="), this.shapes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.shapes);
        while (a2.hasNext()) {
            ((MessagesVideoMessageShapeResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
