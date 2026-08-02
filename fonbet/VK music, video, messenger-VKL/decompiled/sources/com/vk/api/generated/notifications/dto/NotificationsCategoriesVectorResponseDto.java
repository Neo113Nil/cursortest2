package com.vk.api.generated.notifications.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: NotificationsCategoriesVectorResponseDto.kt */
/* loaded from: classes15.dex */
public final class NotificationsCategoriesVectorResponseDto implements Parcelable {
    public static final Parcelable.Creator<NotificationsCategoriesVectorResponseDto> CREATOR = new a();

    @pmi0(HintCategories.PARAM_NAME)
    private final List<NotificationsCategoryDto> categories;

    /* compiled from: NotificationsCategoriesVectorResponseDto.kt */
    public static final class a implements Parcelable.Creator<NotificationsCategoriesVectorResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NotificationsCategoriesVectorResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NotificationsCategoryDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NotificationsCategoriesVectorResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NotificationsCategoriesVectorResponseDto[] newArray(int i) {
            return new NotificationsCategoriesVectorResponseDto[i];
        }
    }

    public NotificationsCategoriesVectorResponseDto(List<NotificationsCategoryDto> list) {
        this.categories = list;
    }

    public final List<NotificationsCategoryDto> d() {
        return this.categories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsCategoriesVectorResponseDto) && epx.f(this.categories, ((NotificationsCategoriesVectorResponseDto) obj).categories);
    }

    public final int hashCode() {
        return this.categories.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("NotificationsCategoriesVectorResponseDto(categories="), this.categories);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.categories);
        while (a2.hasNext()) {
            ((NotificationsCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
