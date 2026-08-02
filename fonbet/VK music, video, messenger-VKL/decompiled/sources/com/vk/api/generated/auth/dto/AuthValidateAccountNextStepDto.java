package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthValidateAccountNextStepDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateAccountNextStepDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateAccountNextStepDto> CREATOR = new a();

    @pmi0("available_libverify_verification_types")
    private final List<String> availableLibverifyVerificationTypes;

    @pmi0("callin_option")
    private final Integer callinOption;

    @pmi0("external_id")
    private final String externalId;

    @pmi0("has_another_verification_methods")
    private final Boolean hasAnotherVerificationMethods;

    @pmi0("max_options")
    private final AuthMaxOptionsDto maxOptions;

    @pmi0("service_code")
    private final ServiceCodeDto serviceCode;

    @pmi0("show_modal_verification_methods")
    private final Boolean showModalVerificationMethods;

    @pmi0("verification_method")
    private final String verificationMethod;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthValidateAccountNextStepDto.kt */
    public static final class ServiceCodeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ServiceCodeDto[] $VALUES;
        public static final Parcelable.Creator<ServiceCodeDto> CREATOR;

        @pmi0("1")
        public static final ServiceCodeDto TYPE_1FA;

        @pmi0("2")
        public static final ServiceCodeDto TYPE_2FA;
        private final int value;

        /* compiled from: AuthValidateAccountNextStepDto.kt */
        public static final class a implements Parcelable.Creator<ServiceCodeDto> {
            @Override // android.os.Parcelable.Creator
            public final ServiceCodeDto createFromParcel(Parcel parcel) {
                return ServiceCodeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceCodeDto[] newArray(int i) {
                return new ServiceCodeDto[i];
            }
        }

        static {
            ServiceCodeDto serviceCodeDto = new ServiceCodeDto("TYPE_1FA", 0, 1);
            TYPE_1FA = serviceCodeDto;
            ServiceCodeDto serviceCodeDto2 = new ServiceCodeDto("TYPE_2FA", 1, 2);
            TYPE_2FA = serviceCodeDto2;
            ServiceCodeDto[] serviceCodeDtoArr = {serviceCodeDto, serviceCodeDto2};
            $VALUES = serviceCodeDtoArr;
            $ENTRIES = new asp(serviceCodeDtoArr);
            CREATOR = new a();
        }

        private ServiceCodeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static ServiceCodeDto valueOf(String str) {
            return (ServiceCodeDto) Enum.valueOf(ServiceCodeDto.class, str);
        }

        public static ServiceCodeDto[] values() {
            return (ServiceCodeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AuthValidateAccountNextStepDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateAccountNextStepDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateAccountNextStepDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            String readString = parcel.readString();
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
            return new AuthValidateAccountNextStepDto(readString, valueOf, valueOf2, parcel.readString(), parcel.readInt() == 0 ? null : ServiceCodeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0 ? AuthMaxOptionsDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateAccountNextStepDto[] newArray(int i) {
            return new AuthValidateAccountNextStepDto[i];
        }
    }

    public AuthValidateAccountNextStepDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final List<String> d() {
        return this.availableLibverifyVerificationTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.externalId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateAccountNextStepDto)) {
            return false;
        }
        AuthValidateAccountNextStepDto authValidateAccountNextStepDto = (AuthValidateAccountNextStepDto) obj;
        return epx.f(this.verificationMethod, authValidateAccountNextStepDto.verificationMethod) && epx.f(this.hasAnotherVerificationMethods, authValidateAccountNextStepDto.hasAnotherVerificationMethods) && epx.f(this.showModalVerificationMethods, authValidateAccountNextStepDto.showModalVerificationMethods) && epx.f(this.externalId, authValidateAccountNextStepDto.externalId) && this.serviceCode == authValidateAccountNextStepDto.serviceCode && epx.f(this.callinOption, authValidateAccountNextStepDto.callinOption) && epx.f(this.availableLibverifyVerificationTypes, authValidateAccountNextStepDto.availableLibverifyVerificationTypes) && epx.f(this.maxOptions, authValidateAccountNextStepDto.maxOptions);
    }

    public final Boolean f() {
        return this.hasAnotherVerificationMethods;
    }

    public final AuthMaxOptionsDto g() {
        return this.maxOptions;
    }

    public final int hashCode() {
        String str = this.verificationMethod;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasAnotherVerificationMethods;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showModalVerificationMethods;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.externalId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServiceCodeDto serviceCodeDto = this.serviceCode;
        int hashCode5 = (hashCode4 + (serviceCodeDto == null ? 0 : serviceCodeDto.hashCode())) * 31;
        Integer num = this.callinOption;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.availableLibverifyVerificationTypes;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        AuthMaxOptionsDto authMaxOptionsDto = this.maxOptions;
        return hashCode7 + (authMaxOptionsDto != null ? authMaxOptionsDto.hashCode() : 0);
    }

    public final ServiceCodeDto i() {
        return this.serviceCode;
    }

    public final String j() {
        return this.verificationMethod;
    }

    public final String toString() {
        return "AuthValidateAccountNextStepDto(verificationMethod=" + this.verificationMethod + ", hasAnotherVerificationMethods=" + this.hasAnotherVerificationMethods + ", showModalVerificationMethods=" + this.showModalVerificationMethods + ", externalId=" + this.externalId + ", serviceCode=" + this.serviceCode + ", callinOption=" + this.callinOption + ", availableLibverifyVerificationTypes=" + this.availableLibverifyVerificationTypes + ", maxOptions=" + this.maxOptions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.verificationMethod);
        Boolean bool = this.hasAnotherVerificationMethods;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.showModalVerificationMethods;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.externalId);
        ServiceCodeDto serviceCodeDto = this.serviceCode;
        if (serviceCodeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceCodeDto.writeToParcel(parcel, i);
        }
        Integer num = this.callinOption;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeStringList(this.availableLibverifyVerificationTypes);
        AuthMaxOptionsDto authMaxOptionsDto = this.maxOptions;
        if (authMaxOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authMaxOptionsDto.writeToParcel(parcel, i);
        }
    }

    public AuthValidateAccountNextStepDto(String str, Boolean bool, Boolean bool2, String str2, ServiceCodeDto serviceCodeDto, Integer num, List<String> list, AuthMaxOptionsDto authMaxOptionsDto) {
        this.verificationMethod = str;
        this.hasAnotherVerificationMethods = bool;
        this.showModalVerificationMethods = bool2;
        this.externalId = str2;
        this.serviceCode = serviceCodeDto;
        this.callinOption = num;
        this.availableLibverifyVerificationTypes = list;
        this.maxOptions = authMaxOptionsDto;
    }

    public /* synthetic */ AuthValidateAccountNextStepDto(String str, Boolean bool, Boolean bool2, String str2, ServiceCodeDto serviceCodeDto, Integer num, List list, AuthMaxOptionsDto authMaxOptionsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : serviceCodeDto, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : authMaxOptionsDto);
    }
}
