package com.vk.api.generated.atum.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AtumVkuiSuperAppTypeStatsParametersDto.kt */
/* loaded from: classes14.dex */
public final class AtumVkuiSuperAppTypeStatsParametersDto implements Parcelable {
    public static final Parcelable.Creator<AtumVkuiSuperAppTypeStatsParametersDto> CREATOR = new a();

    @pmi0("action_element_id")
    private final Integer actionElementId;

    @pmi0("action_index")
    private final Integer actionIndex;

    @pmi0("section_uid")
    private final String sectionUid;

    @pmi0("widget_uid")
    private final String widgetUid;

    /* compiled from: AtumVkuiSuperAppTypeStatsParametersDto.kt */
    public static final class a implements Parcelable.Creator<AtumVkuiSuperAppTypeStatsParametersDto> {
        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSuperAppTypeStatsParametersDto createFromParcel(Parcel parcel) {
            return new AtumVkuiSuperAppTypeStatsParametersDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AtumVkuiSuperAppTypeStatsParametersDto[] newArray(int i) {
            return new AtumVkuiSuperAppTypeStatsParametersDto[i];
        }
    }

    public AtumVkuiSuperAppTypeStatsParametersDto(String str, Integer num, Integer num2, String str2) {
        this.widgetUid = str;
        this.actionElementId = num;
        this.actionIndex = num2;
        this.sectionUid = str2;
    }

    public final Integer d() {
        return this.actionElementId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtumVkuiSuperAppTypeStatsParametersDto)) {
            return false;
        }
        AtumVkuiSuperAppTypeStatsParametersDto atumVkuiSuperAppTypeStatsParametersDto = (AtumVkuiSuperAppTypeStatsParametersDto) obj;
        return epx.f(this.widgetUid, atumVkuiSuperAppTypeStatsParametersDto.widgetUid) && epx.f(this.actionElementId, atumVkuiSuperAppTypeStatsParametersDto.actionElementId) && epx.f(this.actionIndex, atumVkuiSuperAppTypeStatsParametersDto.actionIndex) && epx.f(this.sectionUid, atumVkuiSuperAppTypeStatsParametersDto.sectionUid);
    }

    public final int hashCode() {
        int hashCode = this.widgetUid.hashCode() * 31;
        Integer num = this.actionElementId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.actionIndex;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sectionUid;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AtumVkuiSuperAppTypeStatsParametersDto(widgetUid=");
        sb.append(this.widgetUid);
        sb.append(", actionElementId=");
        sb.append(this.actionElementId);
        sb.append(", actionIndex=");
        sb.append(this.actionIndex);
        sb.append(", sectionUid=");
        return ho8.a(sb, this.sectionUid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.widgetUid);
        Integer num = this.actionElementId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.actionIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.sectionUid);
    }

    public /* synthetic */ AtumVkuiSuperAppTypeStatsParametersDto(String str, Integer num, Integer num2, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2);
    }
}
