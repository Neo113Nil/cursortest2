package com.vk.odnoklassniki.registration.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.vk.api.generated.vkidok.dto.VkidokCheckPasswordProfileDto;
import com.vk.api.generated.vkidok.dto.VkidokPersonalInfoValidationRulesDto;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ProfileFormFragmentData.kt */
/* loaded from: classes4.dex */
public final class ProfileFormFragmentData implements Parcelable {
    public static final Parcelable.Creator<ProfileFormFragmentData> CREATOR = new a();

    @pmi0("max_messenger_hash")
    private final String maxMessengerHash;

    @pmi0("personal_info_validation_rules")
    private final VkidokPersonalInfoValidationRulesDto personalInfoValidationRules;

    @pmi0("phone")
    private final String phone;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final VkidokCheckPasswordProfileDto profile;

    @pmi0(O6.e1)
    private final String sid;

    /* compiled from: ProfileFormFragmentData.kt */
    public static final class a implements Parcelable.Creator<ProfileFormFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final ProfileFormFragmentData createFromParcel(Parcel parcel) {
            return new ProfileFormFragmentData(parcel.readString(), (VkidokPersonalInfoValidationRulesDto) parcel.readParcelable(ProfileFormFragmentData.class.getClassLoader()), (VkidokCheckPasswordProfileDto) parcel.readParcelable(ProfileFormFragmentData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileFormFragmentData[] newArray(int i) {
            return new ProfileFormFragmentData[i];
        }
    }

    public ProfileFormFragmentData(String str, VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto, VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto, String str2, String str3) {
        this.sid = str;
        this.personalInfoValidationRules = vkidokPersonalInfoValidationRulesDto;
        this.profile = vkidokCheckPasswordProfileDto;
        this.phone = str2;
        this.maxMessengerHash = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeParcelable(this.personalInfoValidationRules, i);
        parcel.writeParcelable(this.profile, i);
        parcel.writeString(this.phone);
        parcel.writeString(this.maxMessengerHash);
    }

    public /* synthetic */ ProfileFormFragmentData(String str, VkidokPersonalInfoValidationRulesDto vkidokPersonalInfoValidationRulesDto, VkidokCheckPasswordProfileDto vkidokCheckPasswordProfileDto, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : vkidokPersonalInfoValidationRulesDto, (i & 4) != 0 ? null : vkidokCheckPasswordProfileDto, str2, (i & 16) != 0 ? null : str3);
    }
}
