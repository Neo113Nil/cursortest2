package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SearchFilterItemSelectionDto.kt */
/* loaded from: classes15.dex */
public final class SearchFilterItemSelectionDto implements Parcelable {
    public static final Parcelable.Creator<SearchFilterItemSelectionDto> CREATOR = new a();

    @pmi0("filter_parameter")
    private final String filterParameter;

    @pmi0("filter_value_int")
    private final Integer filterValueInt;

    @pmi0("filter_value_str")
    private final String filterValueStr;

    @pmi0("is_default")
    private final boolean isDefault;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_selected")
    private final boolean isSelected;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: SearchFilterItemSelectionDto.kt */
    public static final class a implements Parcelable.Creator<SearchFilterItemSelectionDto> {
        @Override // android.os.Parcelable.Creator
        public final SearchFilterItemSelectionDto createFromParcel(Parcel parcel) {
            boolean z;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z2 = false;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new SearchFilterItemSelectionDto(readString, readString2, z3, z2, parcel.readInt() == 0 ? z : true, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchFilterItemSelectionDto[] newArray(int i) {
            return new SearchFilterItemSelectionDto[i];
        }
    }

    public SearchFilterItemSelectionDto(String str, String str2, boolean z, boolean z2, boolean z3, String str3, Integer num, String str4) {
        this.filterParameter = str;
        this.title = str2;
        this.isSelected = z;
        this.isDefault = z2;
        this.isEnabled = z3;
        this.filterValueStr = str3;
        this.filterValueInt = num;
        this.trackCode = str4;
    }

    public final boolean I() {
        return this.isDefault;
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
        if (!(obj instanceof SearchFilterItemSelectionDto)) {
            return false;
        }
        SearchFilterItemSelectionDto searchFilterItemSelectionDto = (SearchFilterItemSelectionDto) obj;
        return epx.f(this.filterParameter, searchFilterItemSelectionDto.filterParameter) && epx.f(this.title, searchFilterItemSelectionDto.title) && this.isSelected == searchFilterItemSelectionDto.isSelected && this.isDefault == searchFilterItemSelectionDto.isDefault && this.isEnabled == searchFilterItemSelectionDto.isEnabled && epx.f(this.filterValueStr, searchFilterItemSelectionDto.filterValueStr) && epx.f(this.filterValueInt, searchFilterItemSelectionDto.filterValueInt) && epx.f(this.trackCode, searchFilterItemSelectionDto.trackCode);
    }

    public final String f() {
        return this.filterValueStr;
    }

    public final boolean g() {
        return this.isEnabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(urd0.a(this.filterParameter.hashCode() * 31, 31, this.title), 31, this.isSelected), 31, this.isDefault), 31, this.isEnabled);
        String str = this.filterValueStr;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.filterValueInt;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean i() {
        return this.isSelected;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFilterItemSelectionDto(filterParameter=");
        sb.append(this.filterParameter);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isSelected=");
        sb.append(this.isSelected);
        sb.append(", isDefault=");
        sb.append(this.isDefault);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", filterValueStr=");
        sb.append(this.filterValueStr);
        sb.append(", filterValueInt=");
        sb.append(this.filterValueInt);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.filterParameter);
        parcel.writeString(this.title);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isDefault ? 1 : 0);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeString(this.filterValueStr);
        Integer num = this.filterValueInt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ SearchFilterItemSelectionDto(String str, String str2, boolean z, boolean z2, boolean z3, String str3, Integer num, String str4, int i, zcl zclVar) {
        this(str, str2, z, z2, z3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str4);
    }
}
