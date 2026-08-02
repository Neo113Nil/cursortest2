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

/* compiled from: MessagesGetRecommendedFoldersResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetRecommendedFoldersResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetRecommendedFoldersResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<MessagesRecommendedFolderDto> items;

    /* compiled from: MessagesGetRecommendedFoldersResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetRecommendedFoldersResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetRecommendedFoldersResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesRecommendedFolderDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetRecommendedFoldersResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetRecommendedFoldersResponseDto[] newArray(int i) {
            return new MessagesGetRecommendedFoldersResponseDto[i];
        }
    }

    public MessagesGetRecommendedFoldersResponseDto(List<MessagesRecommendedFolderDto> list) {
        this.items = list;
    }

    public final List<MessagesRecommendedFolderDto> d() {
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
        return (obj instanceof MessagesGetRecommendedFoldersResponseDto) && epx.f(this.items, ((MessagesGetRecommendedFoldersResponseDto) obj).items);
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetRecommendedFoldersResponseDto(items="), this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MessagesRecommendedFolderDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
