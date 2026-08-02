package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: StickersImageConfigModifierDto.kt */
/* loaded from: classes15.dex */
public final class StickersImageConfigModifierDto implements Parcelable {
    public static final Parcelable.Creator<StickersImageConfigModifierDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("modifier")
    private final String modifier;

    /* compiled from: StickersImageConfigModifierDto.kt */
    public static final class a implements Parcelable.Creator<StickersImageConfigModifierDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigModifierDto createFromParcel(Parcel parcel) {
            return new StickersImageConfigModifierDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersImageConfigModifierDto[] newArray(int i) {
            return new StickersImageConfigModifierDto[i];
        }
    }

    public StickersImageConfigModifierDto(String str, String str2) {
        this.id = str;
        this.modifier = str2;
    }

    public final String d() {
        return this.modifier;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersImageConfigModifierDto)) {
            return false;
        }
        StickersImageConfigModifierDto stickersImageConfigModifierDto = (StickersImageConfigModifierDto) obj;
        return epx.f(this.id, stickersImageConfigModifierDto.id) && epx.f(this.modifier, stickersImageConfigModifierDto.modifier);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.modifier.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersImageConfigModifierDto(id=");
        sb.append(this.id);
        sb.append(", modifier=");
        return ho8.a(sb, this.modifier, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.modifier);
    }
}
