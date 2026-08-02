package y6;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import f3.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25687a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f25687a) {
            case 0:
                try {
                    return ErrorCode.a(parcel.readInt());
                } catch (f e7) {
                    throw new IllegalArgumentException(e7);
                }
            case 1:
                int F0 = x.F0(parcel);
                String str = null;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        x.B0(parcel, readInt);
                    } else {
                        str = x.S(parcel, readInt);
                    }
                }
                x.b0(parcel, F0);
                return new FidoAppIdExtension(str);
            case 2:
                int F02 = x.F0(parcel);
                boolean z5 = false;
                boolean z7 = false;
                boolean z10 = false;
                String str2 = null;
                String str3 = null;
                byte[] bArr = null;
                byte[] bArr2 = null;
                Account account = null;
                long j = 0;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            str2 = x.S(parcel, readInt2);
                            break;
                        case 2:
                            str3 = x.S(parcel, readInt2);
                            break;
                        case 3:
                            bArr = x.N(parcel, readInt2);
                            break;
                        case 4:
                            bArr2 = x.N(parcel, readInt2);
                            break;
                        case 5:
                            z5 = x.r0(parcel, readInt2);
                            break;
                        case 6:
                            z7 = x.r0(parcel, readInt2);
                            break;
                        case 7:
                            j = x.x0(parcel, readInt2);
                            break;
                        case '\b':
                            account = (Account) x.P(parcel, readInt2, Account.CREATOR);
                            break;
                        case '\t':
                            z10 = x.r0(parcel, readInt2);
                            break;
                        default:
                            x.B0(parcel, readInt2);
                            break;
                    }
                }
                x.b0(parcel, F02);
                return new FidoCredentialDetails(str2, str3, bArr, bArr2, z5, z7, j, account, z10);
            case 3:
                int F03 = x.F0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 1) {
                        x.B0(parcel, readInt3);
                    } else {
                        bundle = x.M(parcel, readInt3);
                    }
                }
                x.b0(parcel, F03);
                return new ClearRestoreCredentialRequest(bundle);
            case 4:
                int F04 = x.F0(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        x.B0(parcel, readInt4);
                    } else {
                        bundle2 = x.M(parcel, readInt4);
                    }
                }
                x.b0(parcel, F04);
                return new CreateRestoreCredentialRequest(bundle2);
            case 5:
                int F05 = x.F0(parcel);
                Bundle bundle3 = null;
                while (parcel.dataPosition() < F05) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        x.B0(parcel, readInt5);
                    } else {
                        bundle3 = x.M(parcel, readInt5);
                    }
                }
                x.b0(parcel, F05);
                return new CreateRestoreCredentialResponse(bundle3);
            case 6:
                int F06 = x.F0(parcel);
                Bundle bundle4 = null;
                while (parcel.dataPosition() < F06) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        x.B0(parcel, readInt6);
                    } else {
                        bundle4 = x.M(parcel, readInt6);
                    }
                }
                x.b0(parcel, F06);
                return new GetRestoreCredentialRequest(bundle4);
            case 7:
                int F07 = x.F0(parcel);
                Bundle bundle5 = null;
                while (parcel.dataPosition() < F07) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        x.B0(parcel, readInt7);
                    } else {
                        bundle5 = x.M(parcel, readInt7);
                    }
                }
                x.b0(parcel, F07);
                return new GetRestoreCredentialResponse(bundle5);
            case 8:
                int F08 = x.F0(parcel);
                String str4 = null;
                int i5 = 0;
                String str5 = null;
                while (parcel.dataPosition() < F08) {
                    int readInt8 = parcel.readInt();
                    char c2 = (char) readInt8;
                    if (c2 == 2) {
                        i5 = x.v0(parcel, readInt8);
                    } else if (c2 == 3) {
                        str4 = x.S(parcel, readInt8);
                    } else if (c2 != 4) {
                        x.B0(parcel, readInt8);
                    } else {
                        str5 = x.S(parcel, readInt8);
                    }
                }
                x.b0(parcel, F08);
                return new ChannelIdValue(i5, str4, str5);
            case 9:
                int readInt9 = parcel.readInt();
                for (com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode : com.google.android.gms.fido.u2f.api.common.ErrorCode.values()) {
                    if (readInt9 == errorCode.f4793a) {
                        return errorCode;
                    }
                }
                return com.google.android.gms.fido.u2f.api.common.ErrorCode.f4791b;
            case 10:
                int F09 = x.F0(parcel);
                String str6 = null;
                int i10 = 0;
                while (parcel.dataPosition() < F09) {
                    int readInt10 = parcel.readInt();
                    char c8 = (char) readInt10;
                    if (c8 == 2) {
                        i10 = x.v0(parcel, readInt10);
                    } else if (c8 != 3) {
                        x.B0(parcel, readInt10);
                    } else {
                        str6 = x.S(parcel, readInt10);
                    }
                }
                x.b0(parcel, F09);
                return new ErrorResponseData(i10, str6);
            case 11:
                int F010 = x.F0(parcel);
                byte[] bArr3 = null;
                ArrayList arrayList = null;
                int i11 = 0;
                String str7 = null;
                while (parcel.dataPosition() < F010) {
                    int readInt11 = parcel.readInt();
                    char c10 = (char) readInt11;
                    if (c10 == 1) {
                        i11 = x.v0(parcel, readInt11);
                    } else if (c10 == 2) {
                        bArr3 = x.N(parcel, readInt11);
                    } else if (c10 == 3) {
                        str7 = x.S(parcel, readInt11);
                    } else if (c10 != 4) {
                        x.B0(parcel, readInt11);
                    } else {
                        arrayList = x.W(parcel, readInt11, Transport.CREATOR);
                    }
                }
                x.b0(parcel, F010);
                return new KeyHandle(i11, bArr3, str7, arrayList);
            case 12:
                try {
                    return ProtocolVersion.a(parcel.readString());
                } catch (z6.b e9) {
                    throw new RuntimeException(e9);
                }
            case 13:
                int F011 = x.F0(parcel);
                String str8 = null;
                String str9 = null;
                int i12 = 0;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < F011) {
                    int readInt12 = parcel.readInt();
                    char c11 = (char) readInt12;
                    if (c11 == 1) {
                        i12 = x.v0(parcel, readInt12);
                    } else if (c11 == 2) {
                        str8 = x.S(parcel, readInt12);
                    } else if (c11 == 3) {
                        bArr4 = x.N(parcel, readInt12);
                    } else if (c11 != 4) {
                        x.B0(parcel, readInt12);
                    } else {
                        str9 = x.S(parcel, readInt12);
                    }
                }
                x.b0(parcel, F011);
                return new RegisterRequest(str8, str9, bArr4, i12);
            case 14:
                int F012 = x.F0(parcel);
                Integer num = null;
                Double d10 = null;
                Uri uri = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                ChannelIdValue channelIdValue = null;
                String str10 = null;
                while (parcel.dataPosition() < F012) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            num = x.w0(parcel, readInt13);
                            break;
                        case 3:
                            d10 = x.s0(parcel, readInt13);
                            break;
                        case 4:
                            uri = (Uri) x.P(parcel, readInt13, Uri.CREATOR);
                            break;
                        case 5:
                            arrayList2 = x.W(parcel, readInt13, RegisterRequest.CREATOR);
                            break;
                        case 6:
                            arrayList3 = x.W(parcel, readInt13, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) x.P(parcel, readInt13, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            str10 = x.S(parcel, readInt13);
                            break;
                        default:
                            x.B0(parcel, readInt13);
                            break;
                    }
                }
                x.b0(parcel, F012);
                return new RegisterRequestParams(num, d10, uri, arrayList2, arrayList3, channelIdValue, str10);
            case 15:
                int F013 = x.F0(parcel);
                byte[] bArr5 = null;
                String str11 = null;
                String str12 = null;
                while (parcel.dataPosition() < F013) {
                    int readInt14 = parcel.readInt();
                    char c12 = (char) readInt14;
                    if (c12 == 2) {
                        bArr5 = x.N(parcel, readInt14);
                    } else if (c12 == 3) {
                        str11 = x.S(parcel, readInt14);
                    } else if (c12 != 4) {
                        x.B0(parcel, readInt14);
                    } else {
                        str12 = x.S(parcel, readInt14);
                    }
                }
                x.b0(parcel, F013);
                return new RegisterResponseData(str11, str12, bArr5);
            case 16:
                int F014 = x.F0(parcel);
                KeyHandle keyHandle = null;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < F014) {
                    int readInt15 = parcel.readInt();
                    char c13 = (char) readInt15;
                    if (c13 == 2) {
                        keyHandle = (KeyHandle) x.P(parcel, readInt15, KeyHandle.CREATOR);
                    } else if (c13 == 3) {
                        str13 = x.S(parcel, readInt15);
                    } else if (c13 != 4) {
                        x.B0(parcel, readInt15);
                    } else {
                        str14 = x.S(parcel, readInt15);
                    }
                }
                x.b0(parcel, F014);
                return new RegisteredKey(keyHandle, str13, str14);
            case 17:
                int F015 = x.F0(parcel);
                Integer num2 = null;
                Double d11 = null;
                Uri uri2 = null;
                byte[] bArr6 = null;
                ArrayList arrayList4 = null;
                ChannelIdValue channelIdValue2 = null;
                String str15 = null;
                while (parcel.dataPosition() < F015) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 2:
                            num2 = x.w0(parcel, readInt16);
                            break;
                        case 3:
                            d11 = x.s0(parcel, readInt16);
                            break;
                        case 4:
                            uri2 = (Uri) x.P(parcel, readInt16, Uri.CREATOR);
                            break;
                        case 5:
                            bArr6 = x.N(parcel, readInt16);
                            break;
                        case 6:
                            arrayList4 = x.W(parcel, readInt16, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue2 = (ChannelIdValue) x.P(parcel, readInt16, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            str15 = x.S(parcel, readInt16);
                            break;
                        default:
                            x.B0(parcel, readInt16);
                            break;
                    }
                }
                x.b0(parcel, F015);
                return new SignRequestParams(num2, d11, uri2, bArr6, arrayList4, channelIdValue2, str15);
            default:
                int F016 = x.F0(parcel);
                byte[] bArr7 = null;
                String str16 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < F016) {
                    int readInt17 = parcel.readInt();
                    char c14 = (char) readInt17;
                    if (c14 == 2) {
                        bArr7 = x.N(parcel, readInt17);
                    } else if (c14 == 3) {
                        str16 = x.S(parcel, readInt17);
                    } else if (c14 == 4) {
                        bArr8 = x.N(parcel, readInt17);
                    } else if (c14 != 5) {
                        x.B0(parcel, readInt17);
                    } else {
                        bArr9 = x.N(parcel, readInt17);
                    }
                }
                x.b0(parcel, F016);
                return new SignResponseData(bArr7, str16, bArr8, bArr9);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f25687a) {
            case 0:
                return new ErrorCode[i5];
            case 1:
                return new FidoAppIdExtension[i5];
            case 2:
                return new FidoCredentialDetails[i5];
            case 3:
                return new ClearRestoreCredentialRequest[i5];
            case 4:
                return new CreateRestoreCredentialRequest[i5];
            case 5:
                return new CreateRestoreCredentialResponse[i5];
            case 6:
                return new GetRestoreCredentialRequest[i5];
            case 7:
                return new GetRestoreCredentialResponse[i5];
            case 8:
                return new ChannelIdValue[i5];
            case 9:
                return new com.google.android.gms.fido.u2f.api.common.ErrorCode[i5];
            case 10:
                return new ErrorResponseData[i5];
            case 11:
                return new KeyHandle[i5];
            case 12:
                return new ProtocolVersion[i5];
            case 13:
                return new RegisterRequest[i5];
            case 14:
                return new RegisterRequestParams[i5];
            case 15:
                return new RegisterResponseData[i5];
            case 16:
                return new RegisteredKey[i5];
            case 17:
                return new SignRequestParams[i5];
            default:
                return new SignResponseData[i5];
        }
    }
}
