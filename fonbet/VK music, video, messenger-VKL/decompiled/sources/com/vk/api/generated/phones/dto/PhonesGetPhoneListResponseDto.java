package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PhonesGetPhoneListResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhonesGetPhoneListResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhonesGetPhoneListResponseDto> CREATOR = new a();

    @pmi0("area_code")
    private final String areaCode;

    @pmi0(HintCategories.PARAM_NAME)
    private final PhonesCategoriesDto categories;

    @pmi0("country")
    private final String country;

    @pmi0("diff_urls")
    private final List<String> diffUrls;

    @pmi0("new_version")
    private final Integer newVersion;

    @pmi0("url")
    private final String url;

    /* compiled from: PhonesGetPhoneListResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhonesGetPhoneListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesGetPhoneListResponseDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            PhonesCategoriesDto phonesCategoriesDto;
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
                phonesCategoriesDto = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                phonesCategoriesDto = null;
            }
            return new PhonesGetPhoneListResponseDto(readString, createStringArrayList, valueOf, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? phonesCategoriesDto : PhonesCategoriesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesGetPhoneListResponseDto[] newArray(int i) {
            return new PhonesGetPhoneListResponseDto[i];
        }
    }

    public PhonesGetPhoneListResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonesGetPhoneListResponseDto)) {
            return false;
        }
        PhonesGetPhoneListResponseDto phonesGetPhoneListResponseDto = (PhonesGetPhoneListResponseDto) obj;
        return epx.f(this.url, phonesGetPhoneListResponseDto.url) && epx.f(this.diffUrls, phonesGetPhoneListResponseDto.diffUrls) && epx.f(this.newVersion, phonesGetPhoneListResponseDto.newVersion) && epx.f(this.country, phonesGetPhoneListResponseDto.country) && epx.f(this.areaCode, phonesGetPhoneListResponseDto.areaCode) && epx.f(this.categories, phonesGetPhoneListResponseDto.categories);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.diffUrls;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.newVersion;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.country;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.areaCode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PhonesCategoriesDto phonesCategoriesDto = this.categories;
        return hashCode5 + (phonesCategoriesDto != null ? phonesCategoriesDto.hashCode() : 0);
    }

    public final String toString() {
        return "PhonesGetPhoneListResponseDto(url=" + this.url + ", diffUrls=" + this.diffUrls + ", newVersion=" + this.newVersion + ", country=" + this.country + ", areaCode=" + this.areaCode + ", categories=" + this.categories + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeStringList(this.diffUrls);
        Integer num = this.newVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.country);
        parcel.writeString(this.areaCode);
        PhonesCategoriesDto phonesCategoriesDto = this.categories;
        if (phonesCategoriesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phonesCategoriesDto.writeToParcel(parcel, i);
        }
    }

    public PhonesGetPhoneListResponseDto(String str, List<String> list, Integer num, String str2, String str3, PhonesCategoriesDto phonesCategoriesDto) {
        this.url = str;
        this.diffUrls = list;
        this.newVersion = num;
        this.country = str2;
        this.areaCode = str3;
        this.categories = phonesCategoriesDto;
    }

    public /* synthetic */ PhonesGetPhoneListResponseDto(String str, List list, Integer num, String str2, String str3, PhonesCategoriesDto phonesCategoriesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : phonesCategoriesDto);
    }
}
