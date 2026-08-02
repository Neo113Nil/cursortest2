package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DonutGoalsInfoDto.kt */
/* loaded from: classes14.dex */
public final class DonutGoalsInfoDto implements Parcelable {
    public static final Parcelable.Creator<DonutGoalsInfoDto> CREATOR = new a();

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: DonutGoalsInfoDto.kt */
    public static final class a implements Parcelable.Creator<DonutGoalsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutGoalsInfoDto createFromParcel(Parcel parcel) {
            return new DonutGoalsInfoDto(parcel.readString(), (BaseLinkButtonDto) parcel.readParcelable(DonutGoalsInfoDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DonutGoalsInfoDto[] newArray(int i) {
            return new DonutGoalsInfoDto[i];
        }
    }

    public DonutGoalsInfoDto(String str, BaseLinkButtonDto baseLinkButtonDto, String str2) {
        this.title = str;
        this.actionButton = baseLinkButtonDto;
        this.subtitle = str2;
    }

    public final BaseLinkButtonDto d() {
        return this.actionButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutGoalsInfoDto)) {
            return false;
        }
        DonutGoalsInfoDto donutGoalsInfoDto = (DonutGoalsInfoDto) obj;
        return epx.f(this.title, donutGoalsInfoDto.title) && epx.f(this.actionButton, donutGoalsInfoDto.actionButton) && epx.f(this.subtitle, donutGoalsInfoDto.subtitle);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.actionButton.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.subtitle;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutGoalsInfoDto(title=");
        sb.append(this.title);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.actionButton, i);
        parcel.writeString(this.subtitle);
    }

    public /* synthetic */ DonutGoalsInfoDto(String str, BaseLinkButtonDto baseLinkButtonDto, String str2, int i, zcl zclVar) {
        this(str, baseLinkButtonDto, (i & 4) != 0 ? null : str2);
    }
}
