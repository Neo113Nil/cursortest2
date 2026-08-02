package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetUpdatedTimeDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetUpdatedTimeDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetUpdatedTimeDto> CREATOR = new a();

    @pmi0("is_show")
    private final boolean isShow;

    @pmi0("updated_at")
    private final String updatedAt;

    /* compiled from: SuperAppUniversalWidgetUpdatedTimeDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetUpdatedTimeDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetUpdatedTimeDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetUpdatedTimeDto(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetUpdatedTimeDto[] newArray(int i) {
            return new SuperAppUniversalWidgetUpdatedTimeDto[i];
        }
    }

    public SuperAppUniversalWidgetUpdatedTimeDto(boolean z, String str) {
        this.isShow = z;
        this.updatedAt = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetUpdatedTimeDto)) {
            return false;
        }
        SuperAppUniversalWidgetUpdatedTimeDto superAppUniversalWidgetUpdatedTimeDto = (SuperAppUniversalWidgetUpdatedTimeDto) obj;
        return this.isShow == superAppUniversalWidgetUpdatedTimeDto.isShow && epx.f(this.updatedAt, superAppUniversalWidgetUpdatedTimeDto.updatedAt);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isShow) * 31;
        String str = this.updatedAt;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetUpdatedTimeDto(isShow=");
        sb.append(this.isShow);
        sb.append(", updatedAt=");
        return ho8.a(sb, this.updatedAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isShow ? 1 : 0);
        parcel.writeString(this.updatedAt);
    }

    public /* synthetic */ SuperAppUniversalWidgetUpdatedTimeDto(boolean z, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
