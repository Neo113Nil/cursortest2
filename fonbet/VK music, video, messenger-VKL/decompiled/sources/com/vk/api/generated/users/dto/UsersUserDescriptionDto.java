package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersUserDescriptionDto.kt */
/* loaded from: classes15.dex */
public final class UsersUserDescriptionDto implements Parcelable {
    public static final Parcelable.Creator<UsersUserDescriptionDto> CREATOR = new a();

    @pmi0("highlighted")
    private final BaseBoolIntDto highlighted;

    @pmi0("message")
    private final String message;

    @pmi0("text")
    private final String text;

    /* compiled from: UsersUserDescriptionDto.kt */
    public static final class a implements Parcelable.Creator<UsersUserDescriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersUserDescriptionDto createFromParcel(Parcel parcel) {
            return new UsersUserDescriptionDto(parcel.readString(), parcel.readString(), (BaseBoolIntDto) parcel.readParcelable(UsersUserDescriptionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UsersUserDescriptionDto[] newArray(int i) {
            return new UsersUserDescriptionDto[i];
        }
    }

    public UsersUserDescriptionDto() {
        this(null, null, null, 7, null);
    }

    public final BaseBoolIntDto d() {
        return this.highlighted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersUserDescriptionDto)) {
            return false;
        }
        UsersUserDescriptionDto usersUserDescriptionDto = (UsersUserDescriptionDto) obj;
        return epx.f(this.message, usersUserDescriptionDto.message) && epx.f(this.text, usersUserDescriptionDto.text) && this.highlighted == usersUserDescriptionDto.highlighted;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.highlighted;
        return hashCode2 + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "UsersUserDescriptionDto(message=" + this.message + ", text=" + this.text + ", highlighted=" + this.highlighted + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.message);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.highlighted, i);
    }

    public UsersUserDescriptionDto(String str, String str2, BaseBoolIntDto baseBoolIntDto) {
        this.message = str;
        this.text = str2;
        this.highlighted = baseBoolIntDto;
    }

    public /* synthetic */ UsersUserDescriptionDto(String str, String str2, BaseBoolIntDto baseBoolIntDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : baseBoolIntDto);
    }
}
