package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ClassifiedsGetUserContactInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsGetUserContactInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsGetUserContactInfoResponseDto> CREATOR = new a();

    @pmi0("author_name")
    private final String authorName;

    @pmi0("disable_call_alert")
    private final ClassifiedsUserDisableCallAlertDto disableCallAlert;

    @pmi0(CampaignEx.JSON_KEY_IMAGE_URL)
    private final String imageUrl;

    @pmi0("is_chat_locked")
    private final Boolean isChatLocked;

    @pmi0("is_phone_disabled")
    private final Boolean isPhoneDisabled;

    @pmi0("is_phone_locked")
    private final Boolean isPhoneLocked;

    @pmi0("phone")
    private final String phone;

    @pmi0("product_id")
    private final String productId;

    /* compiled from: ClassifiedsGetUserContactInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsGetUserContactInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetUserContactInfoResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            ClassifiedsUserDisableCallAlertDto classifiedsUserDisableCallAlertDto;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                classifiedsUserDisableCallAlertDto = null;
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                classifiedsUserDisableCallAlertDto = null;
            }
            return new ClassifiedsGetUserContactInfoResponseDto(readString, readString2, readString3, valueOf, valueOf2, valueOf3, parcel.readString(), parcel.readInt() == 0 ? classifiedsUserDisableCallAlertDto : ClassifiedsUserDisableCallAlertDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsGetUserContactInfoResponseDto[] newArray(int i) {
            return new ClassifiedsGetUserContactInfoResponseDto[i];
        }
    }

    public ClassifiedsGetUserContactInfoResponseDto(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, ClassifiedsUserDisableCallAlertDto classifiedsUserDisableCallAlertDto) {
        this.productId = str;
        this.authorName = str2;
        this.imageUrl = str3;
        this.isChatLocked = bool;
        this.isPhoneLocked = bool2;
        this.isPhoneDisabled = bool3;
        this.phone = str4;
        this.disableCallAlert = classifiedsUserDisableCallAlertDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsGetUserContactInfoResponseDto)) {
            return false;
        }
        ClassifiedsGetUserContactInfoResponseDto classifiedsGetUserContactInfoResponseDto = (ClassifiedsGetUserContactInfoResponseDto) obj;
        return epx.f(this.productId, classifiedsGetUserContactInfoResponseDto.productId) && epx.f(this.authorName, classifiedsGetUserContactInfoResponseDto.authorName) && epx.f(this.imageUrl, classifiedsGetUserContactInfoResponseDto.imageUrl) && epx.f(this.isChatLocked, classifiedsGetUserContactInfoResponseDto.isChatLocked) && epx.f(this.isPhoneLocked, classifiedsGetUserContactInfoResponseDto.isPhoneLocked) && epx.f(this.isPhoneDisabled, classifiedsGetUserContactInfoResponseDto.isPhoneDisabled) && epx.f(this.phone, classifiedsGetUserContactInfoResponseDto.phone) && epx.f(this.disableCallAlert, classifiedsGetUserContactInfoResponseDto.disableCallAlert);
    }

    public final int hashCode() {
        int hashCode = this.productId.hashCode() * 31;
        String str = this.authorName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isChatLocked;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPhoneLocked;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPhoneDisabled;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClassifiedsUserDisableCallAlertDto classifiedsUserDisableCallAlertDto = this.disableCallAlert;
        return hashCode7 + (classifiedsUserDisableCallAlertDto != null ? classifiedsUserDisableCallAlertDto.hashCode() : 0);
    }

    public final String toString() {
        return "ClassifiedsGetUserContactInfoResponseDto(productId=" + this.productId + ", authorName=" + this.authorName + ", imageUrl=" + this.imageUrl + ", isChatLocked=" + this.isChatLocked + ", isPhoneLocked=" + this.isPhoneLocked + ", isPhoneDisabled=" + this.isPhoneDisabled + ", phone=" + this.phone + ", disableCallAlert=" + this.disableCallAlert + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.productId);
        parcel.writeString(this.authorName);
        parcel.writeString(this.imageUrl);
        Boolean bool = this.isChatLocked;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isPhoneLocked;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isPhoneDisabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        parcel.writeString(this.phone);
        ClassifiedsUserDisableCallAlertDto classifiedsUserDisableCallAlertDto = this.disableCallAlert;
        if (classifiedsUserDisableCallAlertDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            classifiedsUserDisableCallAlertDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ClassifiedsGetUserContactInfoResponseDto(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, ClassifiedsUserDisableCallAlertDto classifiedsUserDisableCallAlertDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : classifiedsUserDisableCallAlertDto);
    }
}
