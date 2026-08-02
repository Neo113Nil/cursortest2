package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersUserDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: NewsfeedGetActivitiesResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetActivitiesResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetActivitiesResponseDto> CREATOR = new a();

    @pmi0("items")
    private final List<NewsfeedGetActivitiesResponseItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserDto> profiles;

    /* compiled from: NewsfeedGetActivitiesResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetActivitiesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetActivitiesResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(NewsfeedGetActivitiesResponseItemDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(NewsfeedGetActivitiesResponseDto.class, parcel, arrayList2, i, 1);
            }
            return new NewsfeedGetActivitiesResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetActivitiesResponseDto[] newArray(int i) {
            return new NewsfeedGetActivitiesResponseDto[i];
        }
    }

    public NewsfeedGetActivitiesResponseDto(List<NewsfeedGetActivitiesResponseItemDto> list, List<UsersUserDto> list2) {
        this.items = list;
        this.profiles = list2;
    }

    public final List<NewsfeedGetActivitiesResponseItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UsersUserDto> e() {
        return this.profiles;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetActivitiesResponseDto)) {
            return false;
        }
        NewsfeedGetActivitiesResponseDto newsfeedGetActivitiesResponseDto = (NewsfeedGetActivitiesResponseDto) obj;
        return epx.f(this.items, newsfeedGetActivitiesResponseDto.items) && epx.f(this.profiles, newsfeedGetActivitiesResponseDto.profiles);
    }

    public final int hashCode() {
        return this.profiles.hashCode() + (this.items.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetActivitiesResponseDto(items=");
        sb.append(this.items);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.profiles);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((NewsfeedGetActivitiesResponseItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.profiles);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
    }
}
