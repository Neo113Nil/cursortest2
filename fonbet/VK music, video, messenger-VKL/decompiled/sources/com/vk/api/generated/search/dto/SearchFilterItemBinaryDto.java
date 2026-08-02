package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: SearchFilterItemBinaryDto.kt */
/* loaded from: classes15.dex */
public final class SearchFilterItemBinaryDto implements Parcelable {
    public static final Parcelable.Creator<SearchFilterItemBinaryDto> CREATOR = new a();

    @pmi0("filter_parameter")
    private final String filterParameter;

    @pmi0("filter_value_int")
    private final Integer filterValueInt;

    @pmi0("filter_value_str")
    private final String filterValueStr;

    @pmi0("is_selected")
    private final Boolean isSelected;

    /* compiled from: SearchFilterItemBinaryDto.kt */
    public static final class a implements Parcelable.Creator<SearchFilterItemBinaryDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchFilterItemBinaryDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SearchFilterItemBinaryDto(readString, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchFilterItemBinaryDto[] newArray(int i) {
            return new SearchFilterItemBinaryDto[i];
        }
    }

    public SearchFilterItemBinaryDto(String str, String str2, Integer num, Boolean bool) {
        this.filterParameter = str;
        this.filterValueStr = str2;
        this.filterValueInt = num;
        this.isSelected = bool;
    }

    public final String d() {
        return this.filterParameter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.filterValueInt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchFilterItemBinaryDto)) {
            return false;
        }
        SearchFilterItemBinaryDto searchFilterItemBinaryDto = (SearchFilterItemBinaryDto) obj;
        return epx.f(this.filterParameter, searchFilterItemBinaryDto.filterParameter) && epx.f(this.filterValueStr, searchFilterItemBinaryDto.filterValueStr) && epx.f(this.filterValueInt, searchFilterItemBinaryDto.filterValueInt) && epx.f(this.isSelected, searchFilterItemBinaryDto.isSelected);
    }

    public final String f() {
        return this.filterValueStr;
    }

    public final Boolean g() {
        return this.isSelected;
    }

    public final int hashCode() {
        int hashCode = this.filterParameter.hashCode() * 31;
        String str = this.filterValueStr;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.filterValueInt;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isSelected;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFilterItemBinaryDto(filterParameter=");
        sb.append(this.filterParameter);
        sb.append(", filterValueStr=");
        sb.append(this.filterValueStr);
        sb.append(", filterValueInt=");
        sb.append(this.filterValueInt);
        sb.append(", isSelected=");
        return tn.a(sb, this.isSelected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filterParameter);
        parcel.writeString(this.filterValueStr);
        Integer num = this.filterValueInt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ SearchFilterItemBinaryDto(String str, String str2, Integer num, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
