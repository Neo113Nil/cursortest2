package com.vk.api.generated.combo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: ComboSubscriptionsNavigationInfoDto.kt */
/* loaded from: classes14.dex */
public final class ComboSubscriptionsNavigationInfoDto implements Parcelable {
    public static final Parcelable.Creator<ComboSubscriptionsNavigationInfoDto> CREATOR = new a();

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("is_show")
    private final boolean isShow;

    /* compiled from: ComboSubscriptionsNavigationInfoDto.kt */
    public static final class a implements Parcelable.Creator<ComboSubscriptionsNavigationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ComboSubscriptionsNavigationInfoDto createFromParcel(Parcel parcel) {
            return new ComboSubscriptionsNavigationInfoDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ComboSubscriptionsNavigationInfoDto[] newArray(int i) {
            return new ComboSubscriptionsNavigationInfoDto[i];
        }
    }

    public ComboSubscriptionsNavigationInfoDto(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isShow = z2;
    }

    public final boolean d() {
        return this.isEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isShow;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComboSubscriptionsNavigationInfoDto)) {
            return false;
        }
        ComboSubscriptionsNavigationInfoDto comboSubscriptionsNavigationInfoDto = (ComboSubscriptionsNavigationInfoDto) obj;
        return this.isEnabled == comboSubscriptionsNavigationInfoDto.isEnabled && this.isShow == comboSubscriptionsNavigationInfoDto.isShow;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isShow) + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComboSubscriptionsNavigationInfoDto(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isShow=");
        return q0.a(sb, this.isShow, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isEnabled ? 1 : 0);
        parcel.writeInt(this.isShow ? 1 : 0);
    }
}
