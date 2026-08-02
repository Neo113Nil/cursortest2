package com.vk.api.generated.businessGroups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: BusinessGroupsGetShieldSettingsResponseDto.kt */
/* loaded from: classes14.dex */
public final class BusinessGroupsGetShieldSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<BusinessGroupsGetShieldSettingsResponseDto> CREATOR = new a();

    @pmi0("button")
    private final BusinessGroupsShieldSettingsButtonDto button;

    @pmi0("description")
    private final String description;

    @pmi0("image")
    private final BusinessGroupsShieldSettingsImageDto image;

    @pmi0("info")
    private final BusinessGroupsShieldSettingsInfoDto info;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("logo_abbreviation")
    private final String logoAbbreviation;

    @pmi0("messages")
    private final List<BusinessGroupsShieldSettingsMessageDto> messages;

    @pmi0("notice")
    private final String notice;

    @pmi0("shield_items")
    private final List<BusinessGroupsShieldSettingsBaseItemDto> shieldItems;

    @pmi0("title")
    private final String title;

    @pmi0("verification_items")
    private final List<BusinessGroupsShieldSettingsVerificationItemDto> verificationItems;

    /* compiled from: BusinessGroupsGetShieldSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<BusinessGroupsGetShieldSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetShieldSettingsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String readString = parcel.readString();
            BusinessGroupsShieldSettingsInfoDto createFromParcel = BusinessGroupsShieldSettingsInfoDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i = 0;
            String readString4 = parcel.readString();
            BusinessGroupsShieldSettingsImageDto createFromParcel2 = parcel.readInt() == 0 ? null : BusinessGroupsShieldSettingsImageDto.CREATOR.createFromParcel(parcel);
            BusinessGroupsShieldSettingsButtonDto createFromParcel3 = parcel.readInt() == 0 ? null : BusinessGroupsShieldSettingsButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(BusinessGroupsShieldSettingsBaseItemDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(BusinessGroupsShieldSettingsVerificationItemDto.CREATOR, parcel, arrayList2, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(BusinessGroupsShieldSettingsMessageDto.CREATOR, parcel, arrayList4, i, 1);
                }
                arrayList3 = arrayList4;
            }
            return new BusinessGroupsGetShieldSettingsResponseDto(readString, createFromParcel, readString2, readString3, valueOf, readString4, createFromParcel2, createFromParcel3, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessGroupsGetShieldSettingsResponseDto[] newArray(int i) {
            return new BusinessGroupsGetShieldSettingsResponseDto[i];
        }
    }

    public BusinessGroupsGetShieldSettingsResponseDto(String str, BusinessGroupsShieldSettingsInfoDto businessGroupsShieldSettingsInfoDto, String str2, String str3, Boolean bool, String str4, BusinessGroupsShieldSettingsImageDto businessGroupsShieldSettingsImageDto, BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto, List<BusinessGroupsShieldSettingsBaseItemDto> list, List<BusinessGroupsShieldSettingsVerificationItemDto> list2, List<BusinessGroupsShieldSettingsMessageDto> list3) {
        this.title = str;
        this.info = businessGroupsShieldSettingsInfoDto;
        this.description = str2;
        this.notice = str3;
        this.isVerified = bool;
        this.logoAbbreviation = str4;
        this.image = businessGroupsShieldSettingsImageDto;
        this.button = businessGroupsShieldSettingsButtonDto;
        this.shieldItems = list;
        this.verificationItems = list2;
        this.messages = list3;
    }

    public final BusinessGroupsShieldSettingsButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BusinessGroupsShieldSettingsImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessGroupsGetShieldSettingsResponseDto)) {
            return false;
        }
        BusinessGroupsGetShieldSettingsResponseDto businessGroupsGetShieldSettingsResponseDto = (BusinessGroupsGetShieldSettingsResponseDto) obj;
        return epx.f(this.title, businessGroupsGetShieldSettingsResponseDto.title) && epx.f(this.info, businessGroupsGetShieldSettingsResponseDto.info) && epx.f(this.description, businessGroupsGetShieldSettingsResponseDto.description) && epx.f(this.notice, businessGroupsGetShieldSettingsResponseDto.notice) && epx.f(this.isVerified, businessGroupsGetShieldSettingsResponseDto.isVerified) && epx.f(this.logoAbbreviation, businessGroupsGetShieldSettingsResponseDto.logoAbbreviation) && epx.f(this.image, businessGroupsGetShieldSettingsResponseDto.image) && epx.f(this.button, businessGroupsGetShieldSettingsResponseDto.button) && epx.f(this.shieldItems, businessGroupsGetShieldSettingsResponseDto.shieldItems) && epx.f(this.verificationItems, businessGroupsGetShieldSettingsResponseDto.verificationItems) && epx.f(this.messages, businessGroupsGetShieldSettingsResponseDto.messages);
    }

    public final BusinessGroupsShieldSettingsInfoDto f() {
        return this.info;
    }

    public final String g() {
        return this.logoAbbreviation;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.info.hashCode() + (this.title.hashCode() * 31)) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notice;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isVerified;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.logoAbbreviation;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BusinessGroupsShieldSettingsImageDto businessGroupsShieldSettingsImageDto = this.image;
        int hashCode6 = (hashCode5 + (businessGroupsShieldSettingsImageDto == null ? 0 : businessGroupsShieldSettingsImageDto.hashCode())) * 31;
        BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto = this.button;
        int hashCode7 = (hashCode6 + (businessGroupsShieldSettingsButtonDto == null ? 0 : businessGroupsShieldSettingsButtonDto.hashCode())) * 31;
        List<BusinessGroupsShieldSettingsBaseItemDto> list = this.shieldItems;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<BusinessGroupsShieldSettingsVerificationItemDto> list2 = this.verificationItems;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BusinessGroupsShieldSettingsMessageDto> list3 = this.messages;
        return hashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List<BusinessGroupsShieldSettingsMessageDto> i() {
        return this.messages;
    }

    public final List<BusinessGroupsShieldSettingsBaseItemDto> j() {
        return this.shieldItems;
    }

    public final List<BusinessGroupsShieldSettingsVerificationItemDto> k() {
        return this.verificationItems;
    }

    public final Boolean l() {
        return this.isVerified;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BusinessGroupsGetShieldSettingsResponseDto(title=");
        sb.append(this.title);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", notice=");
        sb.append(this.notice);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", logoAbbreviation=");
        sb.append(this.logoAbbreviation);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", shieldItems=");
        sb.append(this.shieldItems);
        sb.append(", verificationItems=");
        sb.append(this.verificationItems);
        sb.append(", messages=");
        return ms9.a(')', sb, this.messages);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.info.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeString(this.notice);
        Boolean bool = this.isVerified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.logoAbbreviation);
        BusinessGroupsShieldSettingsImageDto businessGroupsShieldSettingsImageDto = this.image;
        if (businessGroupsShieldSettingsImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            businessGroupsShieldSettingsImageDto.writeToParcel(parcel, i);
        }
        BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto = this.button;
        if (businessGroupsShieldSettingsButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            businessGroupsShieldSettingsButtonDto.writeToParcel(parcel, i);
        }
        List<BusinessGroupsShieldSettingsBaseItemDto> list = this.shieldItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BusinessGroupsShieldSettingsBaseItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<BusinessGroupsShieldSettingsVerificationItemDto> list2 = this.verificationItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BusinessGroupsShieldSettingsVerificationItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<BusinessGroupsShieldSettingsMessageDto> list3 = this.messages;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f3 = dn.f(parcel, list3, 1);
        while (f3.hasNext()) {
            ((BusinessGroupsShieldSettingsMessageDto) f3.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BusinessGroupsGetShieldSettingsResponseDto(String str, BusinessGroupsShieldSettingsInfoDto businessGroupsShieldSettingsInfoDto, String str2, String str3, Boolean bool, String str4, BusinessGroupsShieldSettingsImageDto businessGroupsShieldSettingsImageDto, BusinessGroupsShieldSettingsButtonDto businessGroupsShieldSettingsButtonDto, List list, List list2, List list3, int i, zcl zclVar) {
        this(str, businessGroupsShieldSettingsInfoDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : businessGroupsShieldSettingsImageDto, (i & 128) != 0 ? null : businessGroupsShieldSettingsButtonDto, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : list3);
    }
}
