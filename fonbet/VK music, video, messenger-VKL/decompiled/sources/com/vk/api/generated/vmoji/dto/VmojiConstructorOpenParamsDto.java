package com.vk.api.generated.vmoji.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VmojiConstructorOpenParamsDto.kt */
/* loaded from: classes15.dex */
public final class VmojiConstructorOpenParamsDto implements Parcelable {
    public static final Parcelable.Creator<VmojiConstructorOpenParamsDto> CREATOR = new a();

    @pmi0("control_id")
    private final String controlId;

    @pmi0("control_item_value")
    private final String controlItemValue;

    @pmi0("section_id")
    private final String sectionId;

    /* compiled from: VmojiConstructorOpenParamsDto.kt */
    public static final class a implements Parcelable.Creator<VmojiConstructorOpenParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final VmojiConstructorOpenParamsDto createFromParcel(Parcel parcel) {
            return new VmojiConstructorOpenParamsDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiConstructorOpenParamsDto[] newArray(int i) {
            return new VmojiConstructorOpenParamsDto[i];
        }
    }

    public VmojiConstructorOpenParamsDto() {
        this(null, null, null, 7, null);
    }

    public final String d() {
        return this.controlId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.controlItemValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiConstructorOpenParamsDto)) {
            return false;
        }
        VmojiConstructorOpenParamsDto vmojiConstructorOpenParamsDto = (VmojiConstructorOpenParamsDto) obj;
        return epx.f(this.sectionId, vmojiConstructorOpenParamsDto.sectionId) && epx.f(this.controlId, vmojiConstructorOpenParamsDto.controlId) && epx.f(this.controlItemValue, vmojiConstructorOpenParamsDto.controlItemValue);
    }

    public final String f() {
        return this.sectionId;
    }

    public final int hashCode() {
        String str = this.sectionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.controlId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.controlItemValue;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiConstructorOpenParamsDto(sectionId=");
        sb.append(this.sectionId);
        sb.append(", controlId=");
        sb.append(this.controlId);
        sb.append(", controlItemValue=");
        return ho8.a(sb, this.controlItemValue, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sectionId);
        parcel.writeString(this.controlId);
        parcel.writeString(this.controlItemValue);
    }

    public VmojiConstructorOpenParamsDto(String str, String str2, String str3) {
        this.sectionId = str;
        this.controlId = str2;
        this.controlItemValue = str3;
    }

    public /* synthetic */ VmojiConstructorOpenParamsDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
