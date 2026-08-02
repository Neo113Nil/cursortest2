package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: StickersPopupSettingsFlagsDto.kt */
/* loaded from: classes15.dex */
public final class StickersPopupSettingsFlagsDto implements Parcelable {
    public static final Parcelable.Creator<StickersPopupSettingsFlagsDto> CREATOR = new a();

    @pmi0("animation_interrupter")
    private final boolean animationInterrupter;

    @pmi0("disable_peer_ids")
    private final boolean disablePeerIds;

    /* compiled from: StickersPopupSettingsFlagsDto.kt */
    public static final class a implements Parcelable.Creator<StickersPopupSettingsFlagsDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPopupSettingsFlagsDto createFromParcel(Parcel parcel) {
            return new StickersPopupSettingsFlagsDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPopupSettingsFlagsDto[] newArray(int i) {
            return new StickersPopupSettingsFlagsDto[i];
        }
    }

    public StickersPopupSettingsFlagsDto(boolean z, boolean z2) {
        this.disablePeerIds = z;
        this.animationInterrupter = z2;
    }

    public final boolean d() {
        return this.animationInterrupter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.disablePeerIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPopupSettingsFlagsDto)) {
            return false;
        }
        StickersPopupSettingsFlagsDto stickersPopupSettingsFlagsDto = (StickersPopupSettingsFlagsDto) obj;
        return this.disablePeerIds == stickersPopupSettingsFlagsDto.disablePeerIds && this.animationInterrupter == stickersPopupSettingsFlagsDto.animationInterrupter;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.animationInterrupter) + (Boolean.hashCode(this.disablePeerIds) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersPopupSettingsFlagsDto(disablePeerIds=");
        sb.append(this.disablePeerIds);
        sb.append(", animationInterrupter=");
        return q0.a(sb, this.animationInterrupter, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.disablePeerIds ? 1 : 0);
        parcel.writeInt(this.animationInterrupter ? 1 : 0);
    }
}
