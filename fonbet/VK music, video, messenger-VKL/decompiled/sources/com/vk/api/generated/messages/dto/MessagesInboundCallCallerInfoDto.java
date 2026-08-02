package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCropPhotoRectDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesInboundCallCallerInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesInboundCallCallerInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesInboundCallCallerInfoDto> CREATOR = new a();

    @pmi0("crop_rect")
    private final BaseCropPhotoRectDto cropRect;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("photo_max")
    private final String photoMax;

    @pmi0("photo_max_orig")
    private final String photoMaxOrig;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    /* compiled from: MessagesInboundCallCallerInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesInboundCallCallerInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesInboundCallCallerInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MessagesInboundCallCallerInfoDto.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            BaseCropPhotoRectDto baseCropPhotoRectDto = (BaseCropPhotoRectDto) parcel.readParcelable(MessagesInboundCallCallerInfoDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesInboundCallCallerInfoDto(readString, readString2, userId, readString3, readString4, readString5, readString6, baseCropPhotoRectDto, valueOf, (BaseSexDto) parcel.readParcelable(MessagesInboundCallCallerInfoDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(MessagesInboundCallCallerInfoDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesInboundCallCallerInfoDto[] newArray(int i) {
            return new MessagesInboundCallCallerInfoDto[i];
        }
    }

    public MessagesInboundCallCallerInfoDto(String str, String str2, UserId userId, String str3, String str4, String str5, String str6, BaseCropPhotoRectDto baseCropPhotoRectDto, Boolean bool, BaseSexDto baseSexDto, BaseBoolIntDto baseBoolIntDto) {
        this.firstName = str;
        this.lastName = str2;
        this.userId = userId;
        this.photoBase = str3;
        this.photoMax = str4;
        this.photoMaxOrig = str5;
        this.photo400 = str6;
        this.cropRect = baseCropPhotoRectDto;
        this.isNft = bool;
        this.sex = baseSexDto;
        this.verified = baseBoolIntDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesInboundCallCallerInfoDto)) {
            return false;
        }
        MessagesInboundCallCallerInfoDto messagesInboundCallCallerInfoDto = (MessagesInboundCallCallerInfoDto) obj;
        return epx.f(this.firstName, messagesInboundCallCallerInfoDto.firstName) && epx.f(this.lastName, messagesInboundCallCallerInfoDto.lastName) && epx.f(this.userId, messagesInboundCallCallerInfoDto.userId) && epx.f(this.photoBase, messagesInboundCallCallerInfoDto.photoBase) && epx.f(this.photoMax, messagesInboundCallCallerInfoDto.photoMax) && epx.f(this.photoMaxOrig, messagesInboundCallCallerInfoDto.photoMaxOrig) && epx.f(this.photo400, messagesInboundCallCallerInfoDto.photo400) && epx.f(this.cropRect, messagesInboundCallCallerInfoDto.cropRect) && epx.f(this.isNft, messagesInboundCallCallerInfoDto.isNft) && this.sex == messagesInboundCallCallerInfoDto.sex && this.verified == messagesInboundCallCallerInfoDto.verified;
    }

    public final int hashCode() {
        int a2 = bh10.a(urd0.a(this.firstName.hashCode() * 31, 31, this.lastName), 31, this.userId.b);
        String str = this.photoBase;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoMax;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoMaxOrig;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo400;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BaseCropPhotoRectDto baseCropPhotoRectDto = this.cropRect;
        int hashCode5 = (hashCode4 + (baseCropPhotoRectDto == null ? 0 : baseCropPhotoRectDto.hashCode())) * 31;
        Boolean bool = this.isNft;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode7 = (hashCode6 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.verified;
        return hashCode7 + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesInboundCallCallerInfoDto(firstName=" + this.firstName + ", lastName=" + this.lastName + ", userId=" + this.userId + ", photoBase=" + this.photoBase + ", photoMax=" + this.photoMax + ", photoMaxOrig=" + this.photoMaxOrig + ", photo400=" + this.photo400 + ", cropRect=" + this.cropRect + ", isNft=" + this.isNft + ", sex=" + this.sex + ", verified=" + this.verified + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.photoMax);
        parcel.writeString(this.photoMaxOrig);
        parcel.writeString(this.photo400);
        parcel.writeParcelable(this.cropRect, i);
        Boolean bool = this.isNft;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.sex, i);
        parcel.writeParcelable(this.verified, i);
    }

    public /* synthetic */ MessagesInboundCallCallerInfoDto(String str, String str2, UserId userId, String str3, String str4, String str5, String str6, BaseCropPhotoRectDto baseCropPhotoRectDto, Boolean bool, BaseSexDto baseSexDto, BaseBoolIntDto baseBoolIntDto, int i, zcl zclVar) {
        this(str, str2, userId, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : baseCropPhotoRectDto, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : baseSexDto, (i & 1024) != 0 ? null : baseBoolIntDto);
    }
}
