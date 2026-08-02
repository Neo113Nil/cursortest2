package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsAchievementBlockButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsAchievementBlockButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsAchievementBlockButtonDto> CREATOR = new a();

    @pmi0("action")
    private final AppsCatalogBaseActionDto action;

    @pmi0("label")
    private final String label;

    @pmi0("tooltip")
    private final String tooltip;

    /* compiled from: AppsAchievementBlockButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsAchievementBlockButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAchievementBlockButtonDto createFromParcel(Parcel parcel) {
            return new AppsAchievementBlockButtonDto(parcel.readString(), AppsCatalogBaseActionDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAchievementBlockButtonDto[] newArray(int i) {
            return new AppsAchievementBlockButtonDto[i];
        }
    }

    public AppsAchievementBlockButtonDto(String str, AppsCatalogBaseActionDto appsCatalogBaseActionDto, String str2) {
        this.label = str;
        this.action = appsCatalogBaseActionDto;
        this.tooltip = str2;
    }

    public final AppsCatalogBaseActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAchievementBlockButtonDto)) {
            return false;
        }
        AppsAchievementBlockButtonDto appsAchievementBlockButtonDto = (AppsAchievementBlockButtonDto) obj;
        return epx.f(this.label, appsAchievementBlockButtonDto.label) && epx.f(this.action, appsAchievementBlockButtonDto.action) && epx.f(this.tooltip, appsAchievementBlockButtonDto.tooltip);
    }

    public final String f() {
        return this.tooltip;
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (this.label.hashCode() * 31)) * 31;
        String str = this.tooltip;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAchievementBlockButtonDto(label=");
        sb.append(this.label);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", tooltip=");
        return ho8.a(sb, this.tooltip, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.tooltip);
    }

    public /* synthetic */ AppsAchievementBlockButtonDto(String str, AppsCatalogBaseActionDto appsCatalogBaseActionDto, String str2, int i, zcl zclVar) {
        this(str, appsCatalogBaseActionDto, (i & 4) != 0 ? null : str2);
    }
}
