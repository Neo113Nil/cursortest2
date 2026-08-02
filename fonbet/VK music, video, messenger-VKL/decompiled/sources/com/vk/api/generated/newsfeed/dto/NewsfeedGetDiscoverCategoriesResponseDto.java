package com.vk.api.generated.newsfeed.dto;

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

/* compiled from: NewsfeedGetDiscoverCategoriesResponseDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedGetDiscoverCategoriesResponseDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedGetDiscoverCategoriesResponseDto> CREATOR = new a();

    @pmi0("preselected_id")
    private final String preselectedId;

    @pmi0("tabs")
    private final List<NewsfeedDiscoverCategoryTabInfoDto> tabs;

    /* compiled from: NewsfeedGetDiscoverCategoriesResponseDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedGetDiscoverCategoriesResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDiscoverCategoriesResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(NewsfeedDiscoverCategoryTabInfoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new NewsfeedGetDiscoverCategoriesResponseDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedGetDiscoverCategoriesResponseDto[] newArray(int i) {
            return new NewsfeedGetDiscoverCategoriesResponseDto[i];
        }
    }

    public NewsfeedGetDiscoverCategoriesResponseDto(String str, List<NewsfeedDiscoverCategoryTabInfoDto> list) {
        this.preselectedId = str;
        this.tabs = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetDiscoverCategoriesResponseDto)) {
            return false;
        }
        NewsfeedGetDiscoverCategoriesResponseDto newsfeedGetDiscoverCategoriesResponseDto = (NewsfeedGetDiscoverCategoriesResponseDto) obj;
        return epx.f(this.preselectedId, newsfeedGetDiscoverCategoriesResponseDto.preselectedId) && epx.f(this.tabs, newsfeedGetDiscoverCategoriesResponseDto.tabs);
    }

    public final int hashCode() {
        return this.tabs.hashCode() + (this.preselectedId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedGetDiscoverCategoriesResponseDto(preselectedId=");
        sb.append(this.preselectedId);
        sb.append(", tabs=");
        return ms9.a(')', sb, this.tabs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.preselectedId);
        Iterator a2 = ao.a(parcel, this.tabs);
        while (a2.hasNext()) {
            ((NewsfeedDiscoverCategoryTabInfoDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
