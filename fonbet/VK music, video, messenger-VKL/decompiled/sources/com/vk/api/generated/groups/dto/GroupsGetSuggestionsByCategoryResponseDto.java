package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GroupsGetSuggestionsByCategoryResponseDto.kt */
/* loaded from: classes14.dex */
public final class GroupsGetSuggestionsByCategoryResponseDto implements Parcelable {
    public static final Parcelable.Creator<GroupsGetSuggestionsByCategoryResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<GroupsSuggestionByCategoryDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: GroupsGetSuggestionsByCategoryResponseDto.kt */
    public static final class a implements Parcelable.Creator<GroupsGetSuggestionsByCategoryResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsGetSuggestionsByCategoryResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(GroupsSuggestionByCategoryDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new GroupsGetSuggestionsByCategoryResponseDto(readInt, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsGetSuggestionsByCategoryResponseDto[] newArray(int i) {
            return new GroupsGetSuggestionsByCategoryResponseDto[i];
        }
    }

    public GroupsGetSuggestionsByCategoryResponseDto(int i, List<GroupsSuggestionByCategoryDto> list, String str, String str2) {
        this.count = i;
        this.items = list;
        this.trackCode = str;
        this.nextFrom = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsGetSuggestionsByCategoryResponseDto)) {
            return false;
        }
        GroupsGetSuggestionsByCategoryResponseDto groupsGetSuggestionsByCategoryResponseDto = (GroupsGetSuggestionsByCategoryResponseDto) obj;
        return this.count == groupsGetSuggestionsByCategoryResponseDto.count && epx.f(this.items, groupsGetSuggestionsByCategoryResponseDto.items) && epx.f(this.trackCode, groupsGetSuggestionsByCategoryResponseDto.trackCode) && epx.f(this.nextFrom, groupsGetSuggestionsByCategoryResponseDto.nextFrom);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.items), 31, this.trackCode);
        String str = this.nextFrom;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsGetSuggestionsByCategoryResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((GroupsSuggestionByCategoryDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ GroupsGetSuggestionsByCategoryResponseDto(int i, List list, String str, String str2, int i2, zcl zclVar) {
        this(i, list, str, (i2 & 8) != 0 ? null : str2);
    }
}
