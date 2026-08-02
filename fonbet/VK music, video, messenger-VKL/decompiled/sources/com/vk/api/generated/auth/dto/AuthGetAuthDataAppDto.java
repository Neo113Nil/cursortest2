package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthGetAuthDataAppDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataAppDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataAppDto> CREATOR = new a();

    @pmi0("authorize_using_oauth_process")
    private final boolean authorizeUsingOauthProcess;

    @pmi0("business_id")
    private final AuthGetAuthDataAppBusinessIdDto businessId;

    @pmi0("flow_with_continue_as")
    private final Boolean flowWithContinueAs;

    @pmi0("is_esia_form")
    private final boolean isEsiaForm;

    @pmi0("is_external")
    private final boolean isExternal;

    @pmi0("is_restore_support")
    private final boolean isRestoreSupport;

    @pmi0("is_sber_forms")
    private final boolean isSberForms;

    @pmi0("is_validate_phone_skip")
    private final boolean isValidatePhoneSkip;

    @pmi0("is_vk_auth_app")
    private final boolean isVkAuthApp;

    @pmi0("name")
    private final String name;

    @pmi0("name_accuse")
    private final String nameAccuse;

    @pmi0("photo")
    private final String photo;

    @pmi0("photo_24")
    private final String photo24;

    @pmi0("qr_code_auth")
    private final AuthGetAuthDataAppQrCodeAuthDto qrCodeAuth;

    @pmi0(SharedKt.PARAM_SCOPES)
    private final List<AuthGetAuthDataAppScopeDto> scopes;

    @pmi0("send_registration_payload")
    private final boolean sendRegistrationPayload;

    @pmi0("vk_app_auth")
    private final AuthGetAuthDataAppVkAuthAppDto vkAppAuth;

    /* compiled from: AuthGetAuthDataAppDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataAppDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppDto createFromParcel(Parcel parcel) {
            boolean z;
            AuthGetAuthDataAppQrCodeAuthDto authGetAuthDataAppQrCodeAuthDto;
            boolean z2;
            boolean z3;
            AuthGetAuthDataAppVkAuthAppDto authGetAuthDataAppVkAuthAppDto;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            Boolean valueOf;
            String str;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AuthGetAuthDataAppScopeDto.CREATOR, parcel, arrayList, i, 1);
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            AuthGetAuthDataAppQrCodeAuthDto createFromParcel = AuthGetAuthDataAppQrCodeAuthDto.CREATOR.createFromParcel(parcel);
            AuthGetAuthDataAppVkAuthAppDto createFromParcel2 = AuthGetAuthDataAppVkAuthAppDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z = false;
                authGetAuthDataAppQrCodeAuthDto = createFromParcel;
                z2 = true;
            } else {
                z = false;
                authGetAuthDataAppQrCodeAuthDto = createFromParcel;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
                authGetAuthDataAppVkAuthAppDto = createFromParcel2;
                z4 = true;
            } else {
                z3 = true;
                authGetAuthDataAppVkAuthAppDto = createFromParcel2;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z5 = z;
                z = z3;
            } else {
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z3;
            } else {
                z6 = z3;
                z3 = z5;
            }
            if (parcel.readInt() != 0) {
                z7 = z5;
                z5 = z6;
            } else {
                z7 = z5;
            }
            if (parcel.readInt() != 0) {
                z8 = z6;
            } else {
                z8 = z6;
                z6 = z7;
            }
            if (parcel.readInt() != 0) {
                z9 = z7;
                z7 = z8;
            } else {
                z9 = z7;
            }
            if (parcel.readInt() != 0) {
                z10 = z8;
            } else {
                z10 = z8;
                z8 = z9;
            }
            AuthGetAuthDataAppBusinessIdDto authGetAuthDataAppBusinessIdDto = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z9 = z10;
                }
                valueOf = Boolean.valueOf(z9);
            }
            if (parcel.readInt() == 0) {
                str = readString;
            } else {
                str = readString;
                authGetAuthDataAppBusinessIdDto = AuthGetAuthDataAppBusinessIdDto.CREATOR.createFromParcel(parcel);
            }
            return new AuthGetAuthDataAppDto(str, readString2, arrayList, readString3, readString4, authGetAuthDataAppQrCodeAuthDto, authGetAuthDataAppVkAuthAppDto, z2, z4, z, z3, z5, z6, z7, z8, valueOf, authGetAuthDataAppBusinessIdDto);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppDto[] newArray(int i) {
            return new AuthGetAuthDataAppDto[i];
        }
    }

    public AuthGetAuthDataAppDto(String str, String str2, List<AuthGetAuthDataAppScopeDto> list, String str3, String str4, AuthGetAuthDataAppQrCodeAuthDto authGetAuthDataAppQrCodeAuthDto, AuthGetAuthDataAppVkAuthAppDto authGetAuthDataAppVkAuthAppDto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, AuthGetAuthDataAppBusinessIdDto authGetAuthDataAppBusinessIdDto) {
        this.photo = str;
        this.photo24 = str2;
        this.scopes = list;
        this.name = str3;
        this.nameAccuse = str4;
        this.qrCodeAuth = authGetAuthDataAppQrCodeAuthDto;
        this.vkAppAuth = authGetAuthDataAppVkAuthAppDto;
        this.isSberForms = z;
        this.isExternal = z2;
        this.isValidatePhoneSkip = z3;
        this.isVkAuthApp = z4;
        this.sendRegistrationPayload = z5;
        this.isEsiaForm = z6;
        this.authorizeUsingOauthProcess = z7;
        this.isRestoreSupport = z8;
        this.flowWithContinueAs = bool;
        this.businessId = authGetAuthDataAppBusinessIdDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataAppDto)) {
            return false;
        }
        AuthGetAuthDataAppDto authGetAuthDataAppDto = (AuthGetAuthDataAppDto) obj;
        return epx.f(this.photo, authGetAuthDataAppDto.photo) && epx.f(this.photo24, authGetAuthDataAppDto.photo24) && epx.f(this.scopes, authGetAuthDataAppDto.scopes) && epx.f(this.name, authGetAuthDataAppDto.name) && epx.f(this.nameAccuse, authGetAuthDataAppDto.nameAccuse) && epx.f(this.qrCodeAuth, authGetAuthDataAppDto.qrCodeAuth) && epx.f(this.vkAppAuth, authGetAuthDataAppDto.vkAppAuth) && this.isSberForms == authGetAuthDataAppDto.isSberForms && this.isExternal == authGetAuthDataAppDto.isExternal && this.isValidatePhoneSkip == authGetAuthDataAppDto.isValidatePhoneSkip && this.isVkAuthApp == authGetAuthDataAppDto.isVkAuthApp && this.sendRegistrationPayload == authGetAuthDataAppDto.sendRegistrationPayload && this.isEsiaForm == authGetAuthDataAppDto.isEsiaForm && this.authorizeUsingOauthProcess == authGetAuthDataAppDto.authorizeUsingOauthProcess && this.isRestoreSupport == authGetAuthDataAppDto.isRestoreSupport && epx.f(this.flowWithContinueAs, authGetAuthDataAppDto.flowWithContinueAs) && epx.f(this.businessId, authGetAuthDataAppDto.businessId);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.vkAppAuth.hashCode() + ((this.qrCodeAuth.hashCode() + urd0.a(urd0.a(fw3.a(urd0.a(this.photo.hashCode() * 31, 31, this.photo24), 31, this.scopes), 31, this.name), 31, this.nameAccuse)) * 31)) * 31, 31, this.isSberForms), 31, this.isExternal), 31, this.isValidatePhoneSkip), 31, this.isVkAuthApp), 31, this.sendRegistrationPayload), 31, this.isEsiaForm), 31, this.authorizeUsingOauthProcess), 31, this.isRestoreSupport);
        Boolean bool = this.flowWithContinueAs;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        AuthGetAuthDataAppBusinessIdDto authGetAuthDataAppBusinessIdDto = this.businessId;
        return hashCode + (authGetAuthDataAppBusinessIdDto != null ? authGetAuthDataAppBusinessIdDto.hashCode() : 0);
    }

    public final String toString() {
        return "AuthGetAuthDataAppDto(photo=" + this.photo + ", photo24=" + this.photo24 + ", scopes=" + this.scopes + ", name=" + this.name + ", nameAccuse=" + this.nameAccuse + ", qrCodeAuth=" + this.qrCodeAuth + ", vkAppAuth=" + this.vkAppAuth + ", isSberForms=" + this.isSberForms + ", isExternal=" + this.isExternal + ", isValidatePhoneSkip=" + this.isValidatePhoneSkip + ", isVkAuthApp=" + this.isVkAuthApp + ", sendRegistrationPayload=" + this.sendRegistrationPayload + ", isEsiaForm=" + this.isEsiaForm + ", authorizeUsingOauthProcess=" + this.authorizeUsingOauthProcess + ", isRestoreSupport=" + this.isRestoreSupport + ", flowWithContinueAs=" + this.flowWithContinueAs + ", businessId=" + this.businessId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photo);
        parcel.writeString(this.photo24);
        Iterator a2 = ao.a(parcel, this.scopes);
        while (a2.hasNext()) {
            ((AuthGetAuthDataAppScopeDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.nameAccuse);
        this.qrCodeAuth.writeToParcel(parcel, i);
        this.vkAppAuth.writeToParcel(parcel, i);
        parcel.writeInt(this.isSberForms ? 1 : 0);
        parcel.writeInt(this.isExternal ? 1 : 0);
        parcel.writeInt(this.isValidatePhoneSkip ? 1 : 0);
        parcel.writeInt(this.isVkAuthApp ? 1 : 0);
        parcel.writeInt(this.sendRegistrationPayload ? 1 : 0);
        parcel.writeInt(this.isEsiaForm ? 1 : 0);
        parcel.writeInt(this.authorizeUsingOauthProcess ? 1 : 0);
        parcel.writeInt(this.isRestoreSupport ? 1 : 0);
        Boolean bool = this.flowWithContinueAs;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        AuthGetAuthDataAppBusinessIdDto authGetAuthDataAppBusinessIdDto = this.businessId;
        if (authGetAuthDataAppBusinessIdDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authGetAuthDataAppBusinessIdDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthGetAuthDataAppDto(String str, String str2, List list, String str3, String str4, AuthGetAuthDataAppQrCodeAuthDto authGetAuthDataAppQrCodeAuthDto, AuthGetAuthDataAppVkAuthAppDto authGetAuthDataAppVkAuthAppDto, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Boolean bool, AuthGetAuthDataAppBusinessIdDto authGetAuthDataAppBusinessIdDto, int i, zcl zclVar) {
        this(str, str2, list, str3, str4, authGetAuthDataAppQrCodeAuthDto, authGetAuthDataAppVkAuthAppDto, z, z2, z3, z4, z5, z6, z7, z8, (i & 32768) != 0 ? null : bool, (i & 65536) != 0 ? null : authGetAuthDataAppBusinessIdDto);
    }
}
