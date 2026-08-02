package com.vk.api.generated.education.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseObjectDto;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.wp;
import xsna.zcl;

/* compiled from: EducationSchoolDto.kt */
/* loaded from: classes14.dex */
public final class EducationSchoolDto implements Parcelable {
    public static final Parcelable.Creator<EducationSchoolDto> CREATOR = new a();

    @pmi0("admin_level")
    private final GroupsGroupAdminLevelDto adminLevel;

    @pmi0("city")
    private final BaseObjectDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("crop_photo")
    private final BaseCropPhotoDto cropPhoto;

    @pmi0("description")
    private final String description;

    @pmi0("has_photo")
    private final BaseBoolIntDto hasPhoto;

    @pmi0("id")
    private final UserId id;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("name")
    private final String name;

    @pmi0("organization_type")
    private final EducationOrganizationTypeDto organizationType;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("region_code")
    private final Integer regionCode;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("site")
    private final String site;

    @pmi0("status")
    private final String status;

    @pmi0("vendor")
    private final EducationVendorItemDto vendor;

    /* compiled from: EducationSchoolDto.kt */
    public static final class a implements Parcelable.Creator<EducationSchoolDto> {
        @Override // android.os.Parcelable.Creator
        public final EducationSchoolDto createFromParcel(Parcel parcel) {
            UserId userId;
            EducationOrganizationTypeDto createFromParcel;
            EducationOrganizationTypeDto educationOrganizationTypeDto;
            EducationVendorItemDto createFromParcel2;
            UserId userId2 = (UserId) parcel.readParcelable(EducationSchoolDto.class.getClassLoader());
            String readString = parcel.readString();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(EducationSchoolDto.class.getClassLoader());
            BaseObjectDto baseObjectDto = (BaseObjectDto) parcel.readParcelable(EducationSchoolDto.class.getClassLoader());
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(EducationSchoolDto.class.getClassLoader());
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = (GroupsGroupAdminLevelDto) parcel.readParcelable(EducationSchoolDto.class.getClassLoader());
            BaseCropPhotoDto baseCropPhotoDto = (BaseCropPhotoDto) parcel.readParcelable(EducationSchoolDto.class.getClassLoader());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                userId = userId2;
                createFromParcel = null;
            } else {
                userId = userId2;
                createFromParcel = EducationOrganizationTypeDto.CREATOR.createFromParcel(parcel);
            }
            EducationOrganizationTypeDto educationOrganizationTypeDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                educationOrganizationTypeDto = educationOrganizationTypeDto2;
                createFromParcel2 = null;
            } else {
                educationOrganizationTypeDto = educationOrganizationTypeDto2;
                createFromParcel2 = EducationVendorItemDto.CREATOR.createFromParcel(parcel);
            }
            return new EducationSchoolDto(userId, readString, baseBoolIntDto, baseObjectDto, baseCountryDto, readString2, readInt, readString3, groupsGroupAdminLevelDto, baseCropPhotoDto, readString4, readString5, readString6, readString7, readString8, readString9, readString10, educationOrganizationTypeDto, createFromParcel2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final EducationSchoolDto[] newArray(int i) {
            return new EducationSchoolDto[i];
        }
    }

    public EducationSchoolDto(UserId userId, String str, BaseBoolIntDto baseBoolIntDto, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str2, int i, String str3, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseCropPhotoDto baseCropPhotoDto, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EducationOrganizationTypeDto educationOrganizationTypeDto, EducationVendorItemDto educationVendorItemDto, Integer num) {
        this.id = userId;
        this.name = str;
        this.hasPhoto = baseBoolIntDto;
        this.city = baseObjectDto;
        this.country = baseCountryDto;
        this.description = str2;
        this.membersCount = i;
        this.status = str3;
        this.adminLevel = groupsGroupAdminLevelDto;
        this.cropPhoto = baseCropPhotoDto;
        this.photo100 = str4;
        this.photo200 = str5;
        this.photo50 = str6;
        this.photoBase = str7;
        this.screenName = str8;
        this.site = str9;
        this.phone = str10;
        this.organizationType = educationOrganizationTypeDto;
        this.vendor = educationVendorItemDto;
        this.regionCode = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationSchoolDto)) {
            return false;
        }
        EducationSchoolDto educationSchoolDto = (EducationSchoolDto) obj;
        return epx.f(this.id, educationSchoolDto.id) && epx.f(this.name, educationSchoolDto.name) && this.hasPhoto == educationSchoolDto.hasPhoto && epx.f(this.city, educationSchoolDto.city) && epx.f(this.country, educationSchoolDto.country) && epx.f(this.description, educationSchoolDto.description) && this.membersCount == educationSchoolDto.membersCount && epx.f(this.status, educationSchoolDto.status) && this.adminLevel == educationSchoolDto.adminLevel && epx.f(this.cropPhoto, educationSchoolDto.cropPhoto) && epx.f(this.photo100, educationSchoolDto.photo100) && epx.f(this.photo200, educationSchoolDto.photo200) && epx.f(this.photo50, educationSchoolDto.photo50) && epx.f(this.photoBase, educationSchoolDto.photoBase) && epx.f(this.screenName, educationSchoolDto.screenName) && epx.f(this.site, educationSchoolDto.site) && epx.f(this.phone, educationSchoolDto.phone) && epx.f(this.organizationType, educationSchoolDto.organizationType) && epx.f(this.vendor, educationSchoolDto.vendor) && epx.f(this.regionCode, educationSchoolDto.regionCode);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.membersCount, urd0.a((this.country.hashCode() + ((this.city.hashCode() + wp.b(this.hasPhoto, urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31)) * 31)) * 31, 31, this.description), 31), 31, this.status);
        GroupsGroupAdminLevelDto groupsGroupAdminLevelDto = this.adminLevel;
        int hashCode = (a2 + (groupsGroupAdminLevelDto == null ? 0 : groupsGroupAdminLevelDto.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode2 = (hashCode + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        String str = this.photo100;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo50;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.screenName;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.site;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phone;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        EducationOrganizationTypeDto educationOrganizationTypeDto = this.organizationType;
        int hashCode10 = (hashCode9 + (educationOrganizationTypeDto == null ? 0 : educationOrganizationTypeDto.hashCode())) * 31;
        EducationVendorItemDto educationVendorItemDto = this.vendor;
        int hashCode11 = (hashCode10 + (educationVendorItemDto == null ? 0 : educationVendorItemDto.hashCode())) * 31;
        Integer num = this.regionCode;
        return hashCode11 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EducationSchoolDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", hasPhoto=");
        sb.append(this.hasPhoto);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", adminLevel=");
        sb.append(this.adminLevel);
        sb.append(", cropPhoto=");
        sb.append(this.cropPhoto);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", screenName=");
        sb.append(this.screenName);
        sb.append(", site=");
        sb.append(this.site);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", organizationType=");
        sb.append(this.organizationType);
        sb.append(", vendor=");
        sb.append(this.vendor);
        sb.append(", regionCode=");
        return uqi.b(sb, this.regionCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.hasPhoto, i);
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        parcel.writeString(this.description);
        parcel.writeInt(this.membersCount);
        parcel.writeString(this.status);
        parcel.writeParcelable(this.adminLevel, i);
        parcel.writeParcelable(this.cropPhoto, i);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.screenName);
        parcel.writeString(this.site);
        parcel.writeString(this.phone);
        EducationOrganizationTypeDto educationOrganizationTypeDto = this.organizationType;
        if (educationOrganizationTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationOrganizationTypeDto.writeToParcel(parcel, i);
        }
        EducationVendorItemDto educationVendorItemDto = this.vendor;
        if (educationVendorItemDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            educationVendorItemDto.writeToParcel(parcel, i);
        }
        Integer num = this.regionCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ EducationSchoolDto(UserId userId, String str, BaseBoolIntDto baseBoolIntDto, BaseObjectDto baseObjectDto, BaseCountryDto baseCountryDto, String str2, int i, String str3, GroupsGroupAdminLevelDto groupsGroupAdminLevelDto, BaseCropPhotoDto baseCropPhotoDto, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EducationOrganizationTypeDto educationOrganizationTypeDto, EducationVendorItemDto educationVendorItemDto, Integer num, int i2, zcl zclVar) {
        this(userId, str, baseBoolIntDto, baseObjectDto, baseCountryDto, str2, i, str3, (i2 & 256) != 0 ? null : groupsGroupAdminLevelDto, (i2 & 512) != 0 ? null : baseCropPhotoDto, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : str7, (i2 & 16384) != 0 ? null : str8, (32768 & i2) != 0 ? null : str9, (65536 & i2) != 0 ? null : str10, (131072 & i2) != 0 ? null : educationOrganizationTypeDto, (262144 & i2) != 0 ? null : educationVendorItemDto, (i2 & 524288) != 0 ? null : num);
    }
}
