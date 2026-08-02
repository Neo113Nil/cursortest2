package com.vk.api.generated.apps.dto;

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
import xsna.shy;

/* compiled from: AppsGetGroupsListResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetGroupsListResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetGroupsListResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("count_installed")
    private final int countInstalled;

    @pmi0("items")
    private final List<AppsGetGroupsListItemDto> items;

    /* compiled from: AppsGetGroupsListResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetGroupsListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetGroupsListResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = en.a(AppsGetGroupsListItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetGroupsListResponseDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetGroupsListResponseDto[] newArray(int i) {
            return new AppsGetGroupsListResponseDto[i];
        }
    }

    public AppsGetGroupsListResponseDto(int i, int i2, List<AppsGetGroupsListItemDto> list) {
        this.count = i;
        this.countInstalled = i2;
        this.items = list;
    }

    public final List<AppsGetGroupsListItemDto> d() {
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
        if (!(obj instanceof AppsGetGroupsListResponseDto)) {
            return false;
        }
        AppsGetGroupsListResponseDto appsGetGroupsListResponseDto = (AppsGetGroupsListResponseDto) obj;
        return this.count == appsGetGroupsListResponseDto.count && this.countInstalled == appsGetGroupsListResponseDto.countInstalled && epx.f(this.items, appsGetGroupsListResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.countInstalled, Integer.hashCode(this.count) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetGroupsListResponseDto(count=");
        sb.append(this.count);
        sb.append(", countInstalled=");
        sb.append(this.countInstalled);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeInt(this.countInstalled);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((AppsGetGroupsListItemDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
