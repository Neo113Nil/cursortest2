package u5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzak;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import f3.x;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import k7.r0;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24050a;

    public /* synthetic */ b(int i5) {
        this.f24050a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f24050a) {
            case 0:
                int F0 = x.F0(parcel);
                int i5 = 0;
                PendingIntent pendingIntent = null;
                String str = null;
                String str2 = null;
                ArrayList arrayList = null;
                String str3 = null;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            pendingIntent = (PendingIntent) x.P(parcel, readInt, PendingIntent.CREATOR);
                            break;
                        case 2:
                            str = x.S(parcel, readInt);
                            break;
                        case 3:
                            str2 = x.S(parcel, readInt);
                            break;
                        case 4:
                            arrayList = x.U(parcel, readInt);
                            break;
                        case 5:
                            str3 = x.S(parcel, readInt);
                            break;
                        case 6:
                            i5 = x.v0(parcel, readInt);
                            break;
                        default:
                            x.B0(parcel, readInt);
                            break;
                    }
                }
                x.b0(parcel, F0);
                return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i5);
            case 1:
                int F02 = x.F0(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        x.B0(parcel, readInt2);
                    } else {
                        pendingIntent2 = (PendingIntent) x.P(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                x.b0(parcel, F02);
                return new SaveAccountLinkingTokenResult(pendingIntent2);
            case 2:
                int F03 = x.F0(parcel);
                int i10 = 0;
                SignInPassword signInPassword = null;
                String str4 = null;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        signInPassword = (SignInPassword) x.P(parcel, readInt3, SignInPassword.CREATOR);
                    } else if (c2 == 2) {
                        str4 = x.S(parcel, readInt3);
                    } else if (c2 != 3) {
                        x.B0(parcel, readInt3);
                    } else {
                        i10 = x.v0(parcel, readInt3);
                    }
                }
                x.b0(parcel, F03);
                return new SavePasswordRequest(signInPassword, str4, i10);
            case 3:
                int F04 = x.F0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    if (((char) readInt4) != 1) {
                        x.B0(parcel, readInt4);
                    } else {
                        pendingIntent3 = (PendingIntent) x.P(parcel, readInt4, PendingIntent.CREATOR);
                    }
                }
                x.b0(parcel, F04);
                return new SavePasswordResult(pendingIntent3);
            case 4:
                int F05 = x.F0(parcel);
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                Uri uri = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < F05) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str5 = x.S(parcel, readInt5);
                            break;
                        case 2:
                            str6 = x.S(parcel, readInt5);
                            break;
                        case 3:
                            str7 = x.S(parcel, readInt5);
                            break;
                        case 4:
                            str8 = x.S(parcel, readInt5);
                            break;
                        case 5:
                            uri = (Uri) x.P(parcel, readInt5, Uri.CREATOR);
                            break;
                        case 6:
                            str9 = x.S(parcel, readInt5);
                            break;
                        case 7:
                            str10 = x.S(parcel, readInt5);
                            break;
                        case '\b':
                            str11 = x.S(parcel, readInt5);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) x.P(parcel, readInt5, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            x.B0(parcel, readInt5);
                            break;
                    }
                }
                x.b0(parcel, F05);
                return new SignInCredential(str5, str6, str7, str8, uri, str9, str10, str11, publicKeyCredential);
            case 5:
                int F06 = x.F0(parcel);
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < F06) {
                    int readInt6 = parcel.readInt();
                    char c8 = (char) readInt6;
                    if (c8 == 1) {
                        str12 = x.S(parcel, readInt6);
                    } else if (c8 != 2) {
                        x.B0(parcel, readInt6);
                    } else {
                        str13 = x.S(parcel, readInt6);
                    }
                }
                x.b0(parcel, F06);
                return new SignInPassword(str12, str13);
            case 6:
                int F07 = x.F0(parcel);
                Intent intent = null;
                int i11 = 0;
                int i12 = 0;
                while (parcel.dataPosition() < F07) {
                    int readInt7 = parcel.readInt();
                    char c10 = (char) readInt7;
                    if (c10 == 1) {
                        i11 = x.v0(parcel, readInt7);
                    } else if (c10 == 2) {
                        i12 = x.v0(parcel, readInt7);
                    } else if (c10 != 3) {
                        x.B0(parcel, readInt7);
                    } else {
                        intent = (Intent) x.P(parcel, readInt7, Intent.CREATOR);
                    }
                }
                x.b0(parcel, F07);
                return new zaa(i11, i12, intent);
            case 7:
                int F08 = x.F0(parcel);
                ArrayList arrayList2 = null;
                String str14 = null;
                while (parcel.dataPosition() < F08) {
                    int readInt8 = parcel.readInt();
                    char c11 = (char) readInt8;
                    if (c11 == 1) {
                        arrayList2 = x.U(parcel, readInt8);
                    } else if (c11 != 2) {
                        x.B0(parcel, readInt8);
                    } else {
                        str14 = x.S(parcel, readInt8);
                    }
                }
                x.b0(parcel, F08);
                return new zag(str14, arrayList2);
            case 8:
                int F09 = x.F0(parcel);
                zay zayVar = null;
                int i13 = 0;
                while (parcel.dataPosition() < F09) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 == 1) {
                        i13 = x.v0(parcel, readInt9);
                    } else if (c12 != 2) {
                        x.B0(parcel, readInt9);
                    } else {
                        zayVar = (zay) x.P(parcel, readInt9, zay.CREATOR);
                    }
                }
                x.b0(parcel, F09);
                return new zai(i13, zayVar);
            case 9:
                int F010 = x.F0(parcel);
                ConnectionResult connectionResult = null;
                int i14 = 0;
                zaaa zaaaVar = null;
                while (parcel.dataPosition() < F010) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 == 1) {
                        i14 = x.v0(parcel, readInt10);
                    } else if (c13 == 2) {
                        connectionResult = (ConnectionResult) x.P(parcel, readInt10, ConnectionResult.CREATOR);
                    } else if (c13 != 3) {
                        x.B0(parcel, readInt10);
                    } else {
                        zaaaVar = (zaaa) x.P(parcel, readInt10, zaaa.CREATOR);
                    }
                }
                x.b0(parcel, F010);
                return new zak(i14, connectionResult, zaaaVar);
            case 10:
                int F011 = x.F0(parcel);
                String str15 = null;
                byte[] bArr = null;
                Bundle bundle = null;
                long j = 0;
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < F011) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 == 1) {
                        str15 = x.S(parcel, readInt11);
                    } else if (c14 == 2) {
                        i16 = x.v0(parcel, readInt11);
                    } else if (c14 == 3) {
                        j = x.x0(parcel, readInt11);
                    } else if (c14 == 4) {
                        bArr = x.N(parcel, readInt11);
                    } else if (c14 == 5) {
                        bundle = x.M(parcel, readInt11);
                    } else if (c14 != 1000) {
                        x.B0(parcel, readInt11);
                    } else {
                        i15 = x.v0(parcel, readInt11);
                    }
                }
                x.b0(parcel, F011);
                return new ProxyRequest(i15, str15, i16, j, bArr, bundle);
            case 11:
                int F012 = x.F0(parcel);
                PendingIntent pendingIntent4 = null;
                Bundle bundle2 = null;
                byte[] bArr2 = null;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < F012) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 1) {
                        i18 = x.v0(parcel, readInt12);
                    } else if (c15 == 2) {
                        pendingIntent4 = (PendingIntent) x.P(parcel, readInt12, PendingIntent.CREATOR);
                    } else if (c15 == 3) {
                        i19 = x.v0(parcel, readInt12);
                    } else if (c15 == 4) {
                        bundle2 = x.M(parcel, readInt12);
                    } else if (c15 == 5) {
                        bArr2 = x.N(parcel, readInt12);
                    } else if (c15 != 1000) {
                        x.B0(parcel, readInt12);
                    } else {
                        i17 = x.v0(parcel, readInt12);
                    }
                }
                x.b0(parcel, F012);
                return new ProxyResponse(i17, i18, pendingIntent4, i19, bundle2, bArr2);
            case 12:
                int F013 = x.F0(parcel);
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                Uri uri2 = null;
                String str20 = null;
                String str21 = null;
                ArrayList arrayList3 = null;
                String str22 = null;
                String str23 = null;
                long j6 = 0;
                while (parcel.dataPosition() < F013) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 2:
                            str16 = x.S(parcel, readInt13);
                            break;
                        case 3:
                            str17 = x.S(parcel, readInt13);
                            break;
                        case 4:
                            str18 = x.S(parcel, readInt13);
                            break;
                        case 5:
                            str19 = x.S(parcel, readInt13);
                            break;
                        case 6:
                            uri2 = (Uri) x.P(parcel, readInt13, Uri.CREATOR);
                            break;
                        case 7:
                            str20 = x.S(parcel, readInt13);
                            break;
                        case '\b':
                            j6 = x.x0(parcel, readInt13);
                            break;
                        case '\t':
                            str21 = x.S(parcel, readInt13);
                            break;
                        case '\n':
                            arrayList3 = x.W(parcel, readInt13, Scope.CREATOR);
                            break;
                        case 11:
                            str22 = x.S(parcel, readInt13);
                            break;
                        case '\f':
                            str23 = x.S(parcel, readInt13);
                            break;
                        default:
                            x.B0(parcel, readInt13);
                            break;
                    }
                }
                x.b0(parcel, F013);
                return new GoogleSignInAccount(str16, str17, str18, str19, uri2, str20, j6, str21, arrayList3, str22, str23);
            case 13:
                int F014 = x.F0(parcel);
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                Account account = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                int i20 = 0;
                boolean z5 = false;
                boolean z7 = false;
                boolean z10 = false;
                while (parcel.dataPosition() < F014) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            i20 = x.v0(parcel, readInt14);
                            break;
                        case 2:
                            arrayList5 = x.W(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) x.P(parcel, readInt14, Account.CREATOR);
                            break;
                        case 4:
                            z5 = x.r0(parcel, readInt14);
                            break;
                        case 5:
                            z7 = x.r0(parcel, readInt14);
                            break;
                        case 6:
                            z10 = x.r0(parcel, readInt14);
                            break;
                        case 7:
                            str24 = x.S(parcel, readInt14);
                            break;
                        case '\b':
                            str25 = x.S(parcel, readInt14);
                            break;
                        case '\t':
                            arrayList4 = x.W(parcel, readInt14, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            str26 = x.S(parcel, readInt14);
                            break;
                        default:
                            x.B0(parcel, readInt14);
                            break;
                    }
                }
                x.b0(parcel, F014);
                return new GoogleSignInOptions(i20, arrayList5, account, z5, z7, z10, str24, str25, GoogleSignInOptions.l0(arrayList4), str26);
            case 14:
                int F015 = x.F0(parcel);
                String str27 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str28 = "";
                while (parcel.dataPosition() < F015) {
                    int readInt15 = parcel.readInt();
                    char c16 = (char) readInt15;
                    if (c16 == 4) {
                        str27 = x.S(parcel, readInt15);
                    } else if (c16 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) x.P(parcel, readInt15, GoogleSignInAccount.CREATOR);
                    } else if (c16 != '\b') {
                        x.B0(parcel, readInt15);
                    } else {
                        str28 = x.S(parcel, readInt15);
                    }
                }
                x.b0(parcel, F015);
                return new SignInAccount(str27, googleSignInAccount, str28);
            case 15:
                try {
                    return Transport.a(parcel.readString());
                } catch (w6.a e7) {
                    throw new RuntimeException(e7);
                }
            case 16:
                int F016 = x.F0(parcel);
                Bundle bundle3 = null;
                int i21 = 0;
                int i22 = 0;
                while (parcel.dataPosition() < F016) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 == 1) {
                        i21 = x.v0(parcel, readInt16);
                    } else if (c17 == 2) {
                        i22 = x.v0(parcel, readInt16);
                    } else if (c17 != 3) {
                        x.B0(parcel, readInt16);
                    } else {
                        bundle3 = x.M(parcel, readInt16);
                    }
                }
                x.b0(parcel, F016);
                return new GoogleSignInOptionsExtensionParcelable(i21, i22, bundle3);
            case 17:
                int F017 = x.F0(parcel);
                String str29 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < F017) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 2) {
                        str29 = x.S(parcel, readInt17);
                    } else if (c18 != 5) {
                        x.B0(parcel, readInt17);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) x.P(parcel, readInt17, GoogleSignInOptions.CREATOR);
                    }
                }
                x.b0(parcel, F017);
                return new SignInConfiguration(str29, googleSignInOptions);
            case 18:
                int F018 = x.F0(parcel);
                boolean z11 = false;
                ArrayList arrayList6 = null;
                while (parcel.dataPosition() < F018) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        arrayList6 = x.U(parcel, readInt18);
                    } else if (c19 != 2) {
                        x.B0(parcel, readInt18);
                    } else {
                        z11 = x.r0(parcel, readInt18);
                    }
                }
                x.b0(parcel, F018);
                return new DeleteBytesRequest(arrayList6, z11);
            case 19:
                int F019 = x.F0(parcel);
                boolean z12 = false;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < F019) {
                    int readInt19 = parcel.readInt();
                    char c20 = (char) readInt19;
                    if (c20 == 1) {
                        arrayList7 = x.U(parcel, readInt19);
                    } else if (c20 != 2) {
                        x.B0(parcel, readInt19);
                    } else {
                        z12 = x.r0(parcel, readInt19);
                    }
                }
                x.b0(parcel, F019);
                return new RetrieveBytesRequest(arrayList7, z12);
            case 20:
                int F020 = x.F0(parcel);
                String str30 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                boolean z13 = false;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < F020) {
                    int readInt20 = parcel.readInt();
                    char c21 = (char) readInt20;
                    if (c21 == 1) {
                        bArr3 = x.N(parcel, readInt20);
                    } else if (c21 == 2) {
                        z13 = x.r0(parcel, readInt20);
                    } else if (c21 != 3) {
                        x.B0(parcel, readInt20);
                    } else {
                        str30 = x.S(parcel, readInt20);
                    }
                }
                x.b0(parcel, F020);
                return new StoreBytesData(str30, z13, bArr3);
            case 21:
                try {
                    return Attachment.a(parcel.readString());
                } catch (y6.b e9) {
                    throw new RuntimeException(e9);
                }
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                int F021 = x.F0(parcel);
                boolean z14 = false;
                while (parcel.dataPosition() < F021) {
                    int readInt21 = parcel.readInt();
                    if (((char) readInt21) != 1) {
                        x.B0(parcel, readInt21);
                    } else {
                        z14 = x.r0(parcel, readInt21);
                    }
                }
                x.b0(parcel, F021);
                return new zzz(z14);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                int F022 = x.F0(parcel);
                long j10 = 0;
                while (parcel.dataPosition() < F022) {
                    int readInt22 = parcel.readInt();
                    if (((char) readInt22) != 1) {
                        x.B0(parcel, readInt22);
                    } else {
                        j10 = x.x0(parcel, readInt22);
                    }
                }
                x.b0(parcel, F022);
                return new zzab(j10);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                int F023 = x.F0(parcel);
                boolean z15 = false;
                while (parcel.dataPosition() < F023) {
                    int readInt23 = parcel.readInt();
                    if (((char) readInt23) != 1) {
                        x.B0(parcel, readInt23);
                    } else {
                        z15 = x.r0(parcel, readInt23);
                    }
                }
                x.b0(parcel, F023);
                return new zzad(z15);
            case C0122e9.F /* 25 */:
                int F024 = x.F0(parcel);
                boolean z16 = false;
                while (parcel.dataPosition() < F024) {
                    int readInt24 = parcel.readInt();
                    if (((char) readInt24) != 1) {
                        x.B0(parcel, readInt24);
                    } else {
                        z16 = x.r0(parcel, readInt24);
                    }
                }
                x.b0(parcel, F024);
                return new GoogleThirdPartyPaymentExtension(z16);
            case C0122e9.G /* 26 */:
                int F025 = x.F0(parcel);
                String str31 = null;
                while (parcel.dataPosition() < F025) {
                    int readInt25 = parcel.readInt();
                    if (((char) readInt25) != 1) {
                        x.B0(parcel, readInt25);
                    } else {
                        str31 = x.S(parcel, readInt25);
                    }
                }
                x.b0(parcel, F025);
                return new zzag(str31);
            case C0122e9.H /* 27 */:
                int F026 = x.F0(parcel);
                int i23 = 0;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < F026) {
                    int readInt26 = parcel.readInt();
                    char c22 = (char) readInt26;
                    if (c22 == 1) {
                        bArr4 = x.N(parcel, readInt26);
                    } else if (c22 == 2) {
                        bArr5 = x.N(parcel, readInt26);
                    } else if (c22 == 3) {
                        bArr6 = x.N(parcel, readInt26);
                    } else if (c22 != 4) {
                        x.B0(parcel, readInt26);
                    } else {
                        i23 = x.v0(parcel, readInt26);
                    }
                }
                x.b0(parcel, F026);
                return new zzai(bArr4 == null ? null : r0.h(bArr4.length, bArr4), bArr5 == null ? null : r0.h(bArr5.length, bArr5), bArr6 != null ? r0.h(bArr6.length, bArr6) : null, i23);
            case 28:
                int F027 = x.F0(parcel);
                while (true) {
                    byte[][] bArr7 = null;
                    while (parcel.dataPosition() < F027) {
                        int readInt27 = parcel.readInt();
                        if (((char) readInt27) != 1) {
                            x.B0(parcel, readInt27);
                        } else {
                            int z0 = x.z0(parcel, readInt27);
                            int dataPosition = parcel.dataPosition();
                            if (z0 == 0) {
                                break;
                            }
                            int readInt28 = parcel.readInt();
                            byte[][] bArr8 = new byte[readInt28][];
                            for (int i24 = 0; i24 < readInt28; i24++) {
                                bArr8[i24] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(dataPosition + z0);
                            bArr7 = bArr8;
                        }
                    }
                    x.b0(parcel, F027);
                    return new zzak(bArr7);
                    break;
                }
            default:
                int F028 = x.F0(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArr9 = null;
                ArrayList arrayList8 = null;
                Double d10 = null;
                ArrayList arrayList9 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer num = null;
                TokenBinding tokenBinding = null;
                String str32 = null;
                AuthenticationExtensions authenticationExtensions = null;
                String str33 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < F028) {
                    int readInt29 = parcel.readInt();
                    switch ((char) readInt29) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) x.P(parcel, readInt29, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) x.P(parcel, readInt29, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArr9 = x.N(parcel, readInt29);
                            break;
                        case 5:
                            arrayList8 = x.W(parcel, readInt29, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            d10 = x.s0(parcel, readInt29);
                            break;
                        case 7:
                            arrayList9 = x.W(parcel, readInt29, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case '\b':
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) x.P(parcel, readInt29, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            num = x.w0(parcel, readInt29);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) x.P(parcel, readInt29, TokenBinding.CREATOR);
                            break;
                        case 11:
                            str32 = x.S(parcel, readInt29);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) x.P(parcel, readInt29, AuthenticationExtensions.CREATOR);
                            break;
                        case '\r':
                            str33 = x.S(parcel, readInt29);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) x.P(parcel, readInt29, ResultReceiver.CREATOR);
                            break;
                        default:
                            x.B0(parcel, readInt29);
                            break;
                    }
                }
                x.b0(parcel, F028);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr9, arrayList8, d10, arrayList9, authenticatorSelectionCriteria, num, tokenBinding, str32, authenticationExtensions, str33, resultReceiver);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f24050a) {
            case 0:
                return new SaveAccountLinkingTokenRequest[i5];
            case 1:
                return new SaveAccountLinkingTokenResult[i5];
            case 2:
                return new SavePasswordRequest[i5];
            case 3:
                return new SavePasswordResult[i5];
            case 4:
                return new SignInCredential[i5];
            case 5:
                return new SignInPassword[i5];
            case 6:
                return new zaa[i5];
            case 7:
                return new zag[i5];
            case 8:
                return new zai[i5];
            case 9:
                return new zak[i5];
            case 10:
                return new ProxyRequest[i5];
            case 11:
                return new ProxyResponse[i5];
            case 12:
                return new GoogleSignInAccount[i5];
            case 13:
                return new GoogleSignInOptions[i5];
            case 14:
                return new SignInAccount[i5];
            case 15:
                return new Transport[i5];
            case 16:
                return new GoogleSignInOptionsExtensionParcelable[i5];
            case 17:
                return new SignInConfiguration[i5];
            case 18:
                return new DeleteBytesRequest[i5];
            case 19:
                return new RetrieveBytesRequest[i5];
            case 20:
                return new StoreBytesData[i5];
            case 21:
                return new Attachment[i5];
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new zzz[i5];
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new zzab[i5];
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new zzad[i5];
            case C0122e9.F /* 25 */:
                return new GoogleThirdPartyPaymentExtension[i5];
            case C0122e9.G /* 26 */:
                return new zzag[i5];
            case C0122e9.H /* 27 */:
                return new zzai[i5];
            case 28:
                return new zzak[i5];
            default:
                return new PublicKeyCredentialCreationOptions[i5];
        }
    }
}
