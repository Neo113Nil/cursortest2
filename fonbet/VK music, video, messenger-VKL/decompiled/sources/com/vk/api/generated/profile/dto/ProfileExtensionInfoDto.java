package com.vk.api.generated.profile.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import java.util.List;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ProfileExtensionInfoDto.kt */
/* loaded from: classes15.dex */
public final class ProfileExtensionInfoDto implements Parcelable {
    public static final Parcelable.Creator<ProfileExtensionInfoDto> CREATOR = new a();

    @pmi0("birth_date_max")
    private final String birthDateMax;

    @pmi0("extend_fields")
    private final List<String> extendFields;

    @pmi0("extend_fields_values")
    private final ProfileExtendFieldsValuesDto extendFieldsValues;

    @pmi0("extend_suggested_fields")
    private final List<String> extendSuggestedFields;

    @pmi0("should_show_additional_sign_up_agreement")
    private final Integer shouldShowAdditionalSignUpAgreement;

    @pmi0(O6.e1)
    private final String sid;

    /* compiled from: ProfileExtensionInfoDto.kt */
    public static final class a implements Parcelable.Creator<ProfileExtensionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final ProfileExtensionInfoDto createFromParcel(Parcel parcel) {
            return new ProfileExtensionInfoDto(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ProfileExtendFieldsValuesDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileExtensionInfoDto[] newArray(int i) {
            return new ProfileExtensionInfoDto[i];
        }
    }

    public ProfileExtensionInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final List<String> d() {
        return this.extendFields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ProfileExtendFieldsValuesDto e() {
        return this.extendFieldsValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileExtensionInfoDto)) {
            return false;
        }
        ProfileExtensionInfoDto profileExtensionInfoDto = (ProfileExtensionInfoDto) obj;
        return epx.f(this.sid, profileExtensionInfoDto.sid) && epx.f(this.extendFields, profileExtensionInfoDto.extendFields) && epx.f(this.birthDateMax, profileExtensionInfoDto.birthDateMax) && epx.f(this.extendSuggestedFields, profileExtensionInfoDto.extendSuggestedFields) && epx.f(this.extendFieldsValues, profileExtensionInfoDto.extendFieldsValues) && epx.f(this.shouldShowAdditionalSignUpAgreement, profileExtensionInfoDto.shouldShowAdditionalSignUpAgreement);
    }

    public final List<String> f() {
        return this.extendSuggestedFields;
    }

    public final Integer g() {
        return this.shouldShowAdditionalSignUpAgreement;
    }

    public final int hashCode() {
        String str = this.sid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.extendFields;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.birthDateMax;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.extendSuggestedFields;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ProfileExtendFieldsValuesDto profileExtendFieldsValuesDto = this.extendFieldsValues;
        int hashCode5 = (hashCode4 + (profileExtendFieldsValuesDto == null ? 0 : profileExtendFieldsValuesDto.hashCode())) * 31;
        Integer num = this.shouldShowAdditionalSignUpAgreement;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String i() {
        return this.sid;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileExtensionInfoDto(sid=");
        sb.append(this.sid);
        sb.append(", extendFields=");
        sb.append(this.extendFields);
        sb.append(", birthDateMax=");
        sb.append(this.birthDateMax);
        sb.append(", extendSuggestedFields=");
        sb.append(this.extendSuggestedFields);
        sb.append(", extendFieldsValues=");
        sb.append(this.extendFieldsValues);
        sb.append(", shouldShowAdditionalSignUpAgreement=");
        return uqi.b(sb, this.shouldShowAdditionalSignUpAgreement, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeStringList(this.extendFields);
        parcel.writeString(this.birthDateMax);
        parcel.writeStringList(this.extendSuggestedFields);
        ProfileExtendFieldsValuesDto profileExtendFieldsValuesDto = this.extendFieldsValues;
        if (profileExtendFieldsValuesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profileExtendFieldsValuesDto.writeToParcel(parcel, i);
        }
        Integer num = this.shouldShowAdditionalSignUpAgreement;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public ProfileExtensionInfoDto(String str, List<String> list, String str2, List<String> list2, ProfileExtendFieldsValuesDto profileExtendFieldsValuesDto, Integer num) {
        this.sid = str;
        this.extendFields = list;
        this.birthDateMax = str2;
        this.extendSuggestedFields = list2;
        this.extendFieldsValues = profileExtendFieldsValuesDto;
        this.shouldShowAdditionalSignUpAgreement = num;
    }

    public /* synthetic */ ProfileExtensionInfoDto(String str, List list, String str2, List list2, ProfileExtendFieldsValuesDto profileExtendFieldsValuesDto, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : profileExtendFieldsValuesDto, (i & 32) != 0 ? null : num);
    }
}
