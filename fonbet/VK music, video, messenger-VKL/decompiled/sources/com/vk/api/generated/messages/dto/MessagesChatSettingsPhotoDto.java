package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesChatSettingsPhotoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatSettingsPhotoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatSettingsPhotoDto> CREATOR = new a();

    @pmi0("is_default_call_photo")
    private final Boolean isDefaultCallPhoto;

    @pmi0("is_default_photo")
    private final Boolean isDefaultPhoto;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    /* compiled from: MessagesChatSettingsPhotoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatSettingsPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsPhotoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesChatSettingsPhotoDto(readString, readString2, readString3, readString4, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatSettingsPhotoDto[] newArray(int i) {
            return new MessagesChatSettingsPhotoDto[i];
        }
    }

    public MessagesChatSettingsPhotoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String d() {
        return this.photo100;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photo200;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsPhotoDto)) {
            return false;
        }
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = (MessagesChatSettingsPhotoDto) obj;
        return epx.f(this.photo50, messagesChatSettingsPhotoDto.photo50) && epx.f(this.photo100, messagesChatSettingsPhotoDto.photo100) && epx.f(this.photo200, messagesChatSettingsPhotoDto.photo200) && epx.f(this.photoBase, messagesChatSettingsPhotoDto.photoBase) && epx.f(this.isDefaultPhoto, messagesChatSettingsPhotoDto.isDefaultPhoto) && epx.f(this.isDefaultCallPhoto, messagesChatSettingsPhotoDto.isDefaultCallPhoto);
    }

    public final String f() {
        return this.photo50;
    }

    public final String g() {
        return this.photoBase;
    }

    public final int hashCode() {
        String str = this.photo50;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo100;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isDefaultPhoto;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefaultCallPhoto;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatSettingsPhotoDto(photo50=");
        sb.append(this.photo50);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", isDefaultPhoto=");
        sb.append(this.isDefaultPhoto);
        sb.append(", isDefaultCallPhoto=");
        return tn.a(sb, this.isDefaultCallPhoto, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photoBase);
        Boolean bool = this.isDefaultPhoto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isDefaultCallPhoto;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public MessagesChatSettingsPhotoDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.photo50 = str;
        this.photo100 = str2;
        this.photo200 = str3;
        this.photoBase = str4;
        this.isDefaultPhoto = bool;
        this.isDefaultCallPhoto = bool2;
    }

    public /* synthetic */ MessagesChatSettingsPhotoDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2);
    }
}
