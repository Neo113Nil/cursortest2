package com.vk.api.generated.utils.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsScreenNameSuggestionsDto.kt */
/* loaded from: classes15.dex */
public final class UtilsScreenNameSuggestionsDto implements Parcelable {
    public static final Parcelable.Creator<UtilsScreenNameSuggestionsDto> CREATOR = new a();

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<String> items;

    /* compiled from: UtilsScreenNameSuggestionsDto.kt */
    public static final class a implements Parcelable.Creator<UtilsScreenNameSuggestionsDto> {
        @Override // android.os.Parcelable.Creator
        public final UtilsScreenNameSuggestionsDto createFromParcel(Parcel parcel) {
            return new UtilsScreenNameSuggestionsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final UtilsScreenNameSuggestionsDto[] newArray(int i) {
            return new UtilsScreenNameSuggestionsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsScreenNameSuggestionsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsScreenNameSuggestionsDto)) {
            return false;
        }
        UtilsScreenNameSuggestionsDto utilsScreenNameSuggestionsDto = (UtilsScreenNameSuggestionsDto) obj;
        return epx.f(this.count, utilsScreenNameSuggestionsDto.count) && epx.f(this.items, utilsScreenNameSuggestionsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UtilsScreenNameSuggestionsDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.items);
    }

    public UtilsScreenNameSuggestionsDto(Integer num, List<String> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ UtilsScreenNameSuggestionsDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
