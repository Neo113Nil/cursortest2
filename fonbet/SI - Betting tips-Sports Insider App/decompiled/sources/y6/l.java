package y6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzaw;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzq;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import f3.x;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import k7.r0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25686a;

    public /* synthetic */ l(int i5) {
        this.f25686a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25686a) {
            case 0:
                int F0 = x.F0(parcel);
                String str = null;
                String str2 = null;
                byte[] bArr = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String str3 = null;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            str = x.S(parcel, readInt);
                            break;
                        case 2:
                            str2 = x.S(parcel, readInt);
                            break;
                        case 3:
                            bArr = x.N(parcel, readInt);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) x.P(parcel, readInt, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) x.P(parcel, readInt, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) x.P(parcel, readInt, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) x.P(parcel, readInt, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            str3 = x.S(parcel, readInt);
                            break;
                        case '\t':
                            x.S(parcel, readInt);
                            break;
                        default:
                            x.B0(parcel, readInt);
                            break;
                    }
                }
                x.b0(parcel, F0);
                return new PublicKeyCredential(str, str2, bArr, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3);
            case 1:
                int F02 = x.F0(parcel);
                String str4 = null;
                byte[] bArr2 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 2) {
                        str4 = x.S(parcel, readInt2);
                    } else if (c2 == 3) {
                        bArr2 = x.N(parcel, readInt2);
                    } else if (c2 != 4) {
                        x.B0(parcel, readInt2);
                    } else {
                        arrayList = x.W(parcel, readInt2, Transport.CREATOR);
                    }
                }
                x.b0(parcel, F02);
                return new PublicKeyCredentialDescriptor(str4, bArr2, arrayList);
            case 2:
                int F03 = x.F0(parcel);
                String str5 = null;
                Integer num = null;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    char c8 = (char) readInt3;
                    if (c8 == 2) {
                        str5 = x.S(parcel, readInt3);
                    } else if (c8 != 3) {
                        x.B0(parcel, readInt3);
                    } else {
                        num = x.w0(parcel, readInt3);
                    }
                }
                x.b0(parcel, F03);
                return new PublicKeyCredentialParameters(str5, num.intValue());
            case 3:
                int F04 = x.F0(parcel);
                byte[] bArr3 = null;
                Double d10 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                Integer num2 = null;
                TokenBinding tokenBinding = null;
                String str7 = null;
                AuthenticationExtensions authenticationExtensions = null;
                Long l6 = null;
                String str8 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            bArr3 = x.N(parcel, readInt4);
                            break;
                        case 3:
                            d10 = x.s0(parcel, readInt4);
                            break;
                        case 4:
                            str6 = x.S(parcel, readInt4);
                            break;
                        case 5:
                            arrayList2 = x.W(parcel, readInt4, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            num2 = x.w0(parcel, readInt4);
                            break;
                        case 7:
                            tokenBinding = (TokenBinding) x.P(parcel, readInt4, TokenBinding.CREATOR);
                            break;
                        case '\b':
                            str7 = x.S(parcel, readInt4);
                            break;
                        case '\t':
                            authenticationExtensions = (AuthenticationExtensions) x.P(parcel, readInt4, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            l6 = x.y0(parcel, readInt4);
                            break;
                        case 11:
                            str8 = x.S(parcel, readInt4);
                            break;
                        case '\f':
                            resultReceiver = (ResultReceiver) x.P(parcel, readInt4, ResultReceiver.CREATOR);
                            break;
                        default:
                            x.B0(parcel, readInt4);
                            break;
                    }
                }
                x.b0(parcel, F04);
                return new PublicKeyCredentialRequestOptions(bArr3, d10, str6, arrayList2, num2, tokenBinding, str7, authenticationExtensions, l6, str8, resultReceiver);
            case 4:
                int F05 = x.F0(parcel);
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < F05) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 == 2) {
                        str9 = x.S(parcel, readInt5);
                    } else if (c10 == 3) {
                        str10 = x.S(parcel, readInt5);
                    } else if (c10 != 4) {
                        x.B0(parcel, readInt5);
                    } else {
                        str11 = x.S(parcel, readInt5);
                    }
                }
                x.b0(parcel, F05);
                return new PublicKeyCredentialRpEntity(str9, str10, str11);
            case 5:
                try {
                    return PublicKeyCredentialType.a(parcel.readString());
                } catch (h e7) {
                    throw new RuntimeException(e7);
                }
            case 6:
                int F06 = x.F0(parcel);
                byte[] bArr4 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < F06) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 == 2) {
                        bArr4 = x.N(parcel, readInt6);
                    } else if (c11 == 3) {
                        str12 = x.S(parcel, readInt6);
                    } else if (c11 == 4) {
                        str13 = x.S(parcel, readInt6);
                    } else if (c11 != 5) {
                        x.B0(parcel, readInt6);
                    } else {
                        str14 = x.S(parcel, readInt6);
                    }
                }
                x.b0(parcel, F06);
                return new PublicKeyCredentialUserEntity(str12, str13, str14, bArr4);
            case 7:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return ResidentKeyRequirement.a(readString);
                } catch (j e9) {
                    throw new RuntimeException(e9);
                }
            case 8:
                int F07 = x.F0(parcel);
                String str15 = null;
                while (parcel.dataPosition() < F07) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        x.B0(parcel, readInt7);
                    } else {
                        str15 = x.S(parcel, readInt7);
                    }
                }
                x.b0(parcel, F07);
                return new zzaw(str15);
            case 9:
                int F08 = x.F0(parcel);
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < F08) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        str16 = x.S(parcel, readInt8);
                    } else if (c12 != 3) {
                        x.B0(parcel, readInt8);
                    } else {
                        str17 = x.S(parcel, readInt8);
                    }
                }
                x.b0(parcel, F08);
                return new TokenBinding(str16, str17);
            case 10:
                try {
                    return AttestationConveyancePreference.a(parcel.readString());
                } catch (c e10) {
                    throw new RuntimeException(e10);
                }
            case 11:
                int F09 = x.F0(parcel);
                boolean z5 = false;
                while (parcel.dataPosition() < F09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        x.B0(parcel, readInt9);
                    } else {
                        z5 = x.r0(parcel, readInt9);
                    }
                }
                x.b0(parcel, F09);
                return new UserVerificationMethodExtension(z5);
            case 12:
                try {
                    return UserVerificationRequirement.a(parcel.readString());
                } catch (m e11) {
                    throw new RuntimeException(e11);
                }
            case 13:
                int F010 = x.F0(parcel);
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < F010) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 1) {
                        x.B0(parcel, readInt10);
                    } else {
                        arrayList3 = x.W(parcel, readInt10, UvmEntry.CREATOR);
                    }
                }
                x.b0(parcel, F010);
                return new UvmEntries(arrayList3);
            case 14:
                int F011 = x.F0(parcel);
                int i5 = 0;
                short s8 = 0;
                short s10 = 0;
                while (parcel.dataPosition() < F011) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    if (c13 == 1) {
                        i5 = x.v0(parcel, readInt11);
                    } else if (c13 == 2) {
                        x.G0(parcel, readInt11, 4);
                        s8 = (short) parcel.readInt();
                    } else if (c13 != 3) {
                        x.B0(parcel, readInt11);
                    } else {
                        x.G0(parcel, readInt11, 4);
                        s10 = (short) parcel.readInt();
                    }
                }
                x.b0(parcel, F011);
                return new UvmEntry(s8, s10, i5);
            case 15:
                int F012 = x.F0(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                String str18 = null;
                while (parcel.dataPosition() < F012) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 1) {
                        uvmEntries = (UvmEntries) x.P(parcel, readInt12, UvmEntries.CREATOR);
                    } else if (c14 == 2) {
                        zzfVar = (zzf) x.P(parcel, readInt12, zzf.CREATOR);
                    } else if (c14 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) x.P(parcel, readInt12, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c14 == 4) {
                        zzhVar = (zzh) x.P(parcel, readInt12, zzh.CREATOR);
                    } else if (c14 != 5) {
                        x.B0(parcel, readInt12);
                    } else {
                        str18 = x.S(parcel, readInt12);
                    }
                }
                x.b0(parcel, F012);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, str18);
            case 16:
                int F013 = x.F0(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                zzs zzsVar = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                zzz zzzVar = null;
                zzab zzabVar = null;
                zzad zzadVar = null;
                zzu zzuVar = null;
                zzag zzagVar = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                zzak zzakVar = null;
                zzaw zzawVar = null;
                zzai zzaiVar = null;
                while (parcel.dataPosition() < F013) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) x.P(parcel, readInt13, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            zzsVar = (zzs) x.P(parcel, readInt13, zzs.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) x.P(parcel, readInt13, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            zzzVar = (zzz) x.P(parcel, readInt13, zzz.CREATOR);
                            break;
                        case 6:
                            zzabVar = (zzab) x.P(parcel, readInt13, zzab.CREATOR);
                            break;
                        case 7:
                            zzadVar = (zzad) x.P(parcel, readInt13, zzad.CREATOR);
                            break;
                        case '\b':
                            zzuVar = (zzu) x.P(parcel, readInt13, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) x.P(parcel, readInt13, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) x.P(parcel, readInt13, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzakVar = (zzak) x.P(parcel, readInt13, zzak.CREATOR);
                            break;
                        case '\f':
                            zzawVar = (zzaw) x.P(parcel, readInt13, zzaw.CREATOR);
                            break;
                        case '\r':
                            zzaiVar = (zzai) x.P(parcel, readInt13, zzai.CREATOR);
                            break;
                        default:
                            x.B0(parcel, readInt13);
                            break;
                    }
                }
                x.b0(parcel, F013);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzakVar, zzawVar, zzaiVar);
            case 17:
                int F014 = x.F0(parcel);
                boolean z7 = false;
                while (parcel.dataPosition() < F014) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        x.B0(parcel, readInt14);
                    } else {
                        z7 = x.r0(parcel, readInt14);
                    }
                }
                x.b0(parcel, F014);
                return new AuthenticationExtensionsCredPropsOutputs(z7);
            case 18:
                int F015 = x.F0(parcel);
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < F015) {
                    int readInt15 = parcel.readInt();
                    char c15 = (char) readInt15;
                    if (c15 == 1) {
                        bArr5 = x.N(parcel, readInt15);
                    } else if (c15 != 2) {
                        x.B0(parcel, readInt15);
                    } else {
                        bArr6 = x.N(parcel, readInt15);
                    }
                }
                x.b0(parcel, F015);
                return new zzf(bArr5 == null ? null : r0.h(bArr5.length, bArr5), bArr6 != null ? r0.h(bArr6.length, bArr6) : null);
            case 19:
                int F016 = x.F0(parcel);
                boolean z10 = false;
                byte[] bArr7 = null;
                while (parcel.dataPosition() < F016) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 1) {
                        z10 = x.r0(parcel, readInt16);
                    } else if (c16 != 2) {
                        x.B0(parcel, readInt16);
                    } else {
                        bArr7 = x.N(parcel, readInt16);
                    }
                }
                x.b0(parcel, F016);
                return new zzh(z10, bArr7 != null ? r0.h(bArr7.length, bArr7) : null);
            case 20:
                int F017 = x.F0(parcel);
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                byte[] bArr10 = null;
                byte[] bArr11 = null;
                byte[] bArr12 = null;
                while (parcel.dataPosition() < F017) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 2) {
                        bArr8 = x.N(parcel, readInt17);
                    } else if (c17 == 3) {
                        bArr9 = x.N(parcel, readInt17);
                    } else if (c17 == 4) {
                        bArr10 = x.N(parcel, readInt17);
                    } else if (c17 == 5) {
                        bArr11 = x.N(parcel, readInt17);
                    } else if (c17 != 6) {
                        x.B0(parcel, readInt17);
                    } else {
                        bArr12 = x.N(parcel, readInt17);
                    }
                }
                x.b0(parcel, F017);
                return new AuthenticatorAssertionResponse(bArr8, bArr9, bArr10, bArr11, bArr12);
            case 21:
                int F018 = x.F0(parcel);
                byte[] bArr13 = null;
                byte[] bArr14 = null;
                byte[] bArr15 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < F018) {
                    int readInt18 = parcel.readInt();
                    char c18 = (char) readInt18;
                    if (c18 == 2) {
                        bArr13 = x.N(parcel, readInt18);
                    } else if (c18 == 3) {
                        bArr14 = x.N(parcel, readInt18);
                    } else if (c18 == 4) {
                        bArr15 = x.N(parcel, readInt18);
                    } else if (c18 != 5) {
                        x.B0(parcel, readInt18);
                    } else {
                        strArr = x.T(parcel, readInt18);
                    }
                }
                x.b0(parcel, F018);
                return new AuthenticatorAttestationResponse(bArr13, bArr14, bArr15, strArr);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                int F019 = x.F0(parcel);
                int i10 = 0;
                String str19 = null;
                int i11 = 0;
                while (parcel.dataPosition() < F019) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 2) {
                        i10 = x.v0(parcel, readInt19);
                    } else if (c19 == 3) {
                        str19 = x.S(parcel, readInt19);
                    } else if (c19 != 4) {
                        x.B0(parcel, readInt19);
                    } else {
                        i11 = x.v0(parcel, readInt19);
                    }
                }
                x.b0(parcel, F019);
                return new AuthenticatorErrorResponse(i10, str19, i11);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                int F020 = x.F0(parcel);
                String str20 = null;
                Boolean bool = null;
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < F020) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 2) {
                        str20 = x.S(parcel, readInt20);
                    } else if (c20 == 3) {
                        int z0 = x.z0(parcel, readInt20);
                        if (z0 == 0) {
                            bool = null;
                        } else {
                            x.I0(parcel, z0, 4);
                            bool = Boolean.valueOf(parcel.readInt() != 0);
                        }
                    } else if (c20 == 4) {
                        str21 = x.S(parcel, readInt20);
                    } else if (c20 != 5) {
                        x.B0(parcel, readInt20);
                    } else {
                        str22 = x.S(parcel, readInt20);
                    }
                }
                x.b0(parcel, F020);
                return new AuthenticatorSelectionCriteria(str20, bool, str21, str22);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                int F021 = x.F0(parcel);
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
                Uri uri = null;
                byte[] bArr16 = null;
                while (parcel.dataPosition() < F021) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 2) {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) x.P(parcel, readInt21, PublicKeyCredentialCreationOptions.CREATOR);
                    } else if (c21 == 3) {
                        uri = (Uri) x.P(parcel, readInt21, Uri.CREATOR);
                    } else if (c21 != 4) {
                        x.B0(parcel, readInt21);
                    } else {
                        bArr16 = x.N(parcel, readInt21);
                    }
                }
                x.b0(parcel, F021);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr16);
            case C0122e9.F /* 25 */:
                int F022 = x.F0(parcel);
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
                Uri uri2 = null;
                byte[] bArr17 = null;
                while (parcel.dataPosition() < F022) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 2) {
                        publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) x.P(parcel, readInt22, PublicKeyCredentialRequestOptions.CREATOR);
                    } else if (c22 == 3) {
                        uri2 = (Uri) x.P(parcel, readInt22, Uri.CREATOR);
                    } else if (c22 != 4) {
                        x.B0(parcel, readInt22);
                    } else {
                        bArr17 = x.N(parcel, readInt22);
                    }
                }
                x.b0(parcel, F022);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri2, bArr17);
            case C0122e9.G /* 26 */:
                try {
                    return COSEAlgorithmIdentifier.a(parcel.readInt());
                } catch (d e12) {
                    throw new RuntimeException(e12);
                }
            case C0122e9.H /* 27 */:
                int F023 = x.F0(parcel);
                byte[] bArr18 = null;
                byte[] bArr19 = null;
                byte[] bArr20 = null;
                long j = 0;
                while (parcel.dataPosition() < F023) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 1) {
                        j = x.x0(parcel, readInt23);
                    } else if (c23 == 2) {
                        bArr18 = x.N(parcel, readInt23);
                    } else if (c23 == 3) {
                        bArr19 = x.N(parcel, readInt23);
                    } else if (c23 != 4) {
                        x.B0(parcel, readInt23);
                    } else {
                        bArr20 = x.N(parcel, readInt23);
                    }
                }
                x.b0(parcel, F023);
                return new zzq(j, bArr18, bArr19, bArr20);
            case 28:
                int F024 = x.F0(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < F024) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        x.B0(parcel, readInt24);
                    } else {
                        arrayList4 = x.W(parcel, readInt24, zzq.CREATOR);
                    }
                }
                x.b0(parcel, F024);
                return new zzs(arrayList4);
            default:
                int F025 = x.F0(parcel);
                while (parcel.dataPosition() < F025) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        x.B0(parcel, readInt25);
                    } else {
                        x.r0(parcel, readInt25);
                    }
                }
                x.b0(parcel, F025);
                return new zzu();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f25686a) {
            case 0:
                return new PublicKeyCredential[i5];
            case 1:
                return new PublicKeyCredentialDescriptor[i5];
            case 2:
                return new PublicKeyCredentialParameters[i5];
            case 3:
                return new PublicKeyCredentialRequestOptions[i5];
            case 4:
                return new PublicKeyCredentialRpEntity[i5];
            case 5:
                return new PublicKeyCredentialType[i5];
            case 6:
                return new PublicKeyCredentialUserEntity[i5];
            case 7:
                return new ResidentKeyRequirement[i5];
            case 8:
                return new zzaw[i5];
            case 9:
                return new TokenBinding[i5];
            case 10:
                return new AttestationConveyancePreference[i5];
            case 11:
                return new UserVerificationMethodExtension[i5];
            case 12:
                return new UserVerificationRequirement[i5];
            case 13:
                return new UvmEntries[i5];
            case 14:
                return new UvmEntry[i5];
            case 15:
                return new AuthenticationExtensionsClientOutputs[i5];
            case 16:
                return new AuthenticationExtensions[i5];
            case 17:
                return new AuthenticationExtensionsCredPropsOutputs[i5];
            case 18:
                return new zzf[i5];
            case 19:
                return new zzh[i5];
            case 20:
                return new AuthenticatorAssertionResponse[i5];
            case 21:
                return new AuthenticatorAttestationResponse[i5];
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new AuthenticatorErrorResponse[i5];
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new AuthenticatorSelectionCriteria[i5];
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new BrowserPublicKeyCredentialCreationOptions[i5];
            case C0122e9.F /* 25 */:
                return new BrowserPublicKeyCredentialRequestOptions[i5];
            case C0122e9.G /* 26 */:
                return new COSEAlgorithmIdentifier[i5];
            case C0122e9.H /* 27 */:
                return new zzq[i5];
            case 28:
                return new zzs[i5];
            default:
                return new zzu[i5];
        }
    }
}
