package com.vk.api.generated.explore.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetObjectDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetObjectDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetObjectDto> CREATOR = new a();

    @pmi0("payload")
    private final ExploreWidgetPayloadDto payload;

    @pmi0("type")
    private final ExploreWidgetTypesDto type;

    @pmi0("uid")
    private final String uid;

    @pmi0("widget_id")
    private final String widgetId;

    /* compiled from: ExploreWidgetObjectDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetObjectDto createFromParcel(Parcel parcel) {
            return new ExploreWidgetObjectDto(parcel.readString(), ExploreWidgetTypesDto.CREATOR.createFromParcel(parcel), ExploreWidgetPayloadDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetObjectDto[] newArray(int i) {
            return new ExploreWidgetObjectDto[i];
        }
    }

    public ExploreWidgetObjectDto(String str, ExploreWidgetTypesDto exploreWidgetTypesDto, ExploreWidgetPayloadDto exploreWidgetPayloadDto, String str2) {
        this.widgetId = str;
        this.type = exploreWidgetTypesDto;
        this.payload = exploreWidgetPayloadDto;
        this.uid = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetObjectDto)) {
            return false;
        }
        ExploreWidgetObjectDto exploreWidgetObjectDto = (ExploreWidgetObjectDto) obj;
        return epx.f(this.widgetId, exploreWidgetObjectDto.widgetId) && this.type == exploreWidgetObjectDto.type && epx.f(this.payload, exploreWidgetObjectDto.payload) && epx.f(this.uid, exploreWidgetObjectDto.uid);
    }

    public final int hashCode() {
        int hashCode = (this.payload.hashCode() + ((this.type.hashCode() + (this.widgetId.hashCode() * 31)) * 31)) * 31;
        String str = this.uid;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreWidgetObjectDto(widgetId=");
        sb.append(this.widgetId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", uid=");
        return ho8.a(sb, this.uid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.widgetId);
        this.type.writeToParcel(parcel, i);
        this.payload.writeToParcel(parcel, i);
        parcel.writeString(this.uid);
    }

    public /* synthetic */ ExploreWidgetObjectDto(String str, ExploreWidgetTypesDto exploreWidgetTypesDto, ExploreWidgetPayloadDto exploreWidgetPayloadDto, String str2, int i, zcl zclVar) {
        this(str, exploreWidgetTypesDto, exploreWidgetPayloadDto, (i & 8) != 0 ? null : str2);
    }
}
