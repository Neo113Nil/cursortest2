package com.vk.api.generated.vkidmail.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: VkidmailCheckRestoreResponseDto.kt */
/* loaded from: classes15.dex */
public final class VkidmailCheckRestoreResponseDto implements Parcelable {
    public static final Parcelable.Creator<VkidmailCheckRestoreResponseDto> CREATOR = new a();

    @pmi0("auth_action")
    private final String authAction;

    @pmi0(LoginApiConstants.RESULT_NAME_AUTH_TOKEN)
    private final String authToken;

    @pmi0("error")
    private final VkidmailCheckRestoreErrorDto error;

    @pmi0("extended_restore")
    private final Boolean extendedRestore;

    @pmi0("next_step_url")
    private final String nextStepUrl;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final VkidmailCheckRestoreProfileDto profile;

    @pmi0("restore_hash")
    private final String restoreHash;

    /* compiled from: VkidmailCheckRestoreResponseDto.kt */
    public static final class a implements Parcelable.Creator<VkidmailCheckRestoreResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckRestoreResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            VkidmailCheckRestoreErrorDto createFromParcel = parcel.readInt() == 0 ? null : VkidmailCheckRestoreErrorDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VkidmailCheckRestoreResponseDto(readString, createFromParcel, readString2, readString3, readString4, valueOf, parcel.readInt() == 0 ? null : VkidmailCheckRestoreProfileDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VkidmailCheckRestoreResponseDto[] newArray(int i) {
            return new VkidmailCheckRestoreResponseDto[i];
        }
    }

    public VkidmailCheckRestoreResponseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkidmailCheckRestoreResponseDto)) {
            return false;
        }
        VkidmailCheckRestoreResponseDto vkidmailCheckRestoreResponseDto = (VkidmailCheckRestoreResponseDto) obj;
        return epx.f(this.nextStepUrl, vkidmailCheckRestoreResponseDto.nextStepUrl) && epx.f(this.error, vkidmailCheckRestoreResponseDto.error) && epx.f(this.authAction, vkidmailCheckRestoreResponseDto.authAction) && epx.f(this.authToken, vkidmailCheckRestoreResponseDto.authToken) && epx.f(this.restoreHash, vkidmailCheckRestoreResponseDto.restoreHash) && epx.f(this.extendedRestore, vkidmailCheckRestoreResponseDto.extendedRestore) && epx.f(this.profile, vkidmailCheckRestoreResponseDto.profile);
    }

    public final int hashCode() {
        String str = this.nextStepUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        VkidmailCheckRestoreErrorDto vkidmailCheckRestoreErrorDto = this.error;
        int hashCode2 = (hashCode + (vkidmailCheckRestoreErrorDto == null ? 0 : vkidmailCheckRestoreErrorDto.hashCode())) * 31;
        String str2 = this.authAction;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authToken;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.restoreHash;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.extendedRestore;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        VkidmailCheckRestoreProfileDto vkidmailCheckRestoreProfileDto = this.profile;
        return hashCode6 + (vkidmailCheckRestoreProfileDto != null ? vkidmailCheckRestoreProfileDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkidmailCheckRestoreResponseDto(nextStepUrl=" + this.nextStepUrl + ", error=" + this.error + ", authAction=" + this.authAction + ", authToken=" + this.authToken + ", restoreHash=" + this.restoreHash + ", extendedRestore=" + this.extendedRestore + ", profile=" + this.profile + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nextStepUrl);
        VkidmailCheckRestoreErrorDto vkidmailCheckRestoreErrorDto = this.error;
        if (vkidmailCheckRestoreErrorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidmailCheckRestoreErrorDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.authAction);
        parcel.writeString(this.authToken);
        parcel.writeString(this.restoreHash);
        Boolean bool = this.extendedRestore;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        VkidmailCheckRestoreProfileDto vkidmailCheckRestoreProfileDto = this.profile;
        if (vkidmailCheckRestoreProfileDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkidmailCheckRestoreProfileDto.writeToParcel(parcel, i);
        }
    }

    public VkidmailCheckRestoreResponseDto(String str, VkidmailCheckRestoreErrorDto vkidmailCheckRestoreErrorDto, String str2, String str3, String str4, Boolean bool, VkidmailCheckRestoreProfileDto vkidmailCheckRestoreProfileDto) {
        this.nextStepUrl = str;
        this.error = vkidmailCheckRestoreErrorDto;
        this.authAction = str2;
        this.authToken = str3;
        this.restoreHash = str4;
        this.extendedRestore = bool;
        this.profile = vkidmailCheckRestoreProfileDto;
    }

    public /* synthetic */ VkidmailCheckRestoreResponseDto(String str, VkidmailCheckRestoreErrorDto vkidmailCheckRestoreErrorDto, String str2, String str3, String str4, Boolean bool, VkidmailCheckRestoreProfileDto vkidmailCheckRestoreProfileDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : vkidmailCheckRestoreErrorDto, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : vkidmailCheckRestoreProfileDto);
    }
}
