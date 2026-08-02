package q5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.c1;
import com.google.android.gms.appset.zza;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.zbf;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import f3.x;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.HashSet;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22036a;

    public /* synthetic */ b(int i5) {
        this.f22036a = i5;
    }

    public static void a(zzbg zzbgVar, Parcel parcel, int i5) {
        String str = zzbgVar.f5797a;
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 2, str, false);
        h8.b.N(parcel, 3, zzbgVar.f5798b, i5, false);
        h8.b.O(parcel, 4, zzbgVar.f5799c, false);
        long j = zzbgVar.f5800d;
        h8.b.U(parcel, 5, 8);
        parcel.writeLong(j);
        h8.b.W(parcel, V);
    }

    public static void b(zzpl zzplVar, Parcel parcel) {
        int i5 = zzplVar.f5813a;
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(i5);
        h8.b.O(parcel, 2, zzplVar.f5814b, false);
        long j = zzplVar.f5815c;
        h8.b.U(parcel, 3, 8);
        parcel.writeLong(j);
        h8.b.M(parcel, 4, zzplVar.f5816d);
        h8.b.O(parcel, 6, zzplVar.f5817e, false);
        h8.b.O(parcel, 7, zzplVar.f5818f, false);
        h8.b.H(parcel, 8, zzplVar.f5819g);
        h8.b.W(parcel, V);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f22036a) {
            case 0:
                int F0 = x.F0(parcel);
                String str = null;
                String str2 = null;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        str = x.S(parcel, readInt);
                    } else if (c2 != 2) {
                        x.B0(parcel, readInt);
                    } else {
                        str2 = x.S(parcel, readInt);
                    }
                }
                x.b0(parcel, F0);
                return new zza(str, str2);
            case 1:
                int F02 = x.F0(parcel);
                String str3 = null;
                int i5 = 0;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    char c8 = (char) readInt2;
                    if (c8 == 1) {
                        str3 = x.S(parcel, readInt2);
                    } else if (c8 != 2) {
                        x.B0(parcel, readInt2);
                    } else {
                        i5 = x.v0(parcel, readInt2);
                    }
                }
                x.b0(parcel, F02);
                return new zzc(str3, i5);
            case 2:
                int F03 = x.F0(parcel);
                String str4 = null;
                String str5 = null;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                long j = 0;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i10 = x.v0(parcel, readInt3);
                            break;
                        case 2:
                            j = x.x0(parcel, readInt3);
                            break;
                        case 3:
                            str4 = x.S(parcel, readInt3);
                            break;
                        case 4:
                            i11 = x.v0(parcel, readInt3);
                            break;
                        case 5:
                            i12 = x.v0(parcel, readInt3);
                            break;
                        case 6:
                            str5 = x.S(parcel, readInt3);
                            break;
                        default:
                            x.B0(parcel, readInt3);
                            break;
                    }
                }
                x.b0(parcel, F03);
                return new AccountChangeEvent(i10, j, str4, i11, i12, str5);
            case 3:
                int F04 = x.F0(parcel);
                String str6 = null;
                int i13 = 0;
                int i14 = 0;
                Account account = null;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 1) {
                        i13 = x.v0(parcel, readInt4);
                    } else if (c10 == 2) {
                        i14 = x.v0(parcel, readInt4);
                    } else if (c10 == 3) {
                        str6 = x.S(parcel, readInt4);
                    } else if (c10 != 4) {
                        x.B0(parcel, readInt4);
                    } else {
                        account = (Account) x.P(parcel, readInt4, Account.CREATOR);
                    }
                }
                x.b0(parcel, F04);
                return new AccountChangeEventsRequest(i13, i14, str6, account);
            case 4:
                int F05 = x.F0(parcel);
                ArrayList arrayList = null;
                int i15 = 0;
                while (parcel.dataPosition() < F05) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        i15 = x.v0(parcel, readInt5);
                    } else if (c11 != 2) {
                        x.B0(parcel, readInt5);
                    } else {
                        arrayList = x.W(parcel, readInt5, AccountChangeEvent.CREATOR);
                    }
                }
                x.b0(parcel, F05);
                return new AccountChangeEventsResponse(arrayList, i15);
            case 5:
                int F06 = x.F0(parcel);
                String str7 = null;
                Long l6 = null;
                ArrayList arrayList2 = null;
                String str8 = null;
                int i16 = 0;
                boolean z5 = false;
                boolean z7 = false;
                while (parcel.dataPosition() < F06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i16 = x.v0(parcel, readInt6);
                            break;
                        case 2:
                            str7 = x.S(parcel, readInt6);
                            break;
                        case 3:
                            l6 = x.y0(parcel, readInt6);
                            break;
                        case 4:
                            z5 = x.r0(parcel, readInt6);
                            break;
                        case 5:
                            z7 = x.r0(parcel, readInt6);
                            break;
                        case 6:
                            arrayList2 = x.U(parcel, readInt6);
                            break;
                        case 7:
                            str8 = x.S(parcel, readInt6);
                            break;
                        default:
                            x.B0(parcel, readInt6);
                            break;
                    }
                }
                x.b0(parcel, F06);
                return new TokenData(i16, str7, l6, z5, z7, arrayList2, str8);
            case 6:
                int F07 = x.F0(parcel);
                long j6 = 0;
                long j10 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < F07) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 == 1) {
                        j6 = x.x0(parcel, readInt7);
                    } else if (c12 == 2) {
                        i17 = x.v0(parcel, readInt7);
                    } else if (c12 != 3) {
                        x.B0(parcel, readInt7);
                    } else {
                        j10 = x.x0(parcel, readInt7);
                    }
                }
                x.b0(parcel, F07);
                return new zzaf(j6, j10, i17);
            case 7:
                int F08 = x.F0(parcel);
                String str9 = null;
                String str10 = null;
                zzpl zzplVar = null;
                String str11 = null;
                zzbg zzbgVar = null;
                zzbg zzbgVar2 = null;
                zzbg zzbgVar3 = null;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < F08) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str9 = x.S(parcel, readInt8);
                            break;
                        case 3:
                            str10 = x.S(parcel, readInt8);
                            break;
                        case 4:
                            zzplVar = (zzpl) x.P(parcel, readInt8, zzpl.CREATOR);
                            break;
                        case 5:
                            j11 = x.x0(parcel, readInt8);
                            break;
                        case 6:
                            z10 = x.r0(parcel, readInt8);
                            break;
                        case 7:
                            str11 = x.S(parcel, readInt8);
                            break;
                        case '\b':
                            zzbgVar = (zzbg) x.P(parcel, readInt8, zzbg.CREATOR);
                            break;
                        case '\t':
                            j12 = x.x0(parcel, readInt8);
                            break;
                        case '\n':
                            zzbgVar2 = (zzbg) x.P(parcel, readInt8, zzbg.CREATOR);
                            break;
                        case 11:
                            j13 = x.x0(parcel, readInt8);
                            break;
                        case '\f':
                            zzbgVar3 = (zzbg) x.P(parcel, readInt8, zzbg.CREATOR);
                            break;
                        default:
                            x.B0(parcel, readInt8);
                            break;
                    }
                }
                x.b0(parcel, F08);
                return new zzah(str9, str10, zzplVar, j11, z10, str11, zzbgVar, j12, zzbgVar2, j13, zzbgVar3);
            case 8:
                int F09 = x.F0(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < F09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        x.B0(parcel, readInt9);
                    } else {
                        bundle = x.M(parcel, readInt9);
                    }
                }
                x.b0(parcel, F09);
                return new zzao(bundle);
            case 9:
                int F010 = x.F0(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < F010) {
                    int readInt10 = parcel.readInt();
                    if (((char) readInt10) != 2) {
                        x.B0(parcel, readInt10);
                    } else {
                        bundle2 = x.M(parcel, readInt10);
                    }
                }
                x.b0(parcel, F010);
                return new zzbe(bundle2);
            case 10:
                int F011 = x.F0(parcel);
                long j14 = 0;
                String str12 = null;
                zzbe zzbeVar = null;
                String str13 = null;
                while (parcel.dataPosition() < F011) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    if (c13 == 2) {
                        str12 = x.S(parcel, readInt11);
                    } else if (c13 == 3) {
                        zzbeVar = (zzbe) x.P(parcel, readInt11, zzbe.CREATOR);
                    } else if (c13 == 4) {
                        str13 = x.S(parcel, readInt11);
                    } else if (c13 != 5) {
                        x.B0(parcel, readInt11);
                    } else {
                        j14 = x.x0(parcel, readInt11);
                    }
                }
                x.b0(parcel, F011);
                return new zzbg(str12, zzbeVar, str13, j14);
            case 11:
                int F012 = x.F0(parcel);
                int i18 = 0;
                long j15 = 0;
                String str14 = null;
                while (parcel.dataPosition() < F012) {
                    int readInt12 = parcel.readInt();
                    char c14 = (char) readInt12;
                    if (c14 == 1) {
                        str14 = x.S(parcel, readInt12);
                    } else if (c14 == 2) {
                        j15 = x.x0(parcel, readInt12);
                    } else if (c14 != 3) {
                        x.B0(parcel, readInt12);
                    } else {
                        i18 = x.v0(parcel, readInt12);
                    }
                }
                x.b0(parcel, F012);
                return new zzoh(str14, j15, i18);
            case 12:
                int F013 = x.F0(parcel);
                byte[] bArr = null;
                String str15 = null;
                Bundle bundle3 = null;
                String str16 = null;
                long j16 = 0;
                long j17 = 0;
                int i19 = 0;
                while (parcel.dataPosition() < F013) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            j16 = x.x0(parcel, readInt13);
                            break;
                        case 2:
                            bArr = x.N(parcel, readInt13);
                            break;
                        case 3:
                            str15 = x.S(parcel, readInt13);
                            break;
                        case 4:
                            bundle3 = x.M(parcel, readInt13);
                            break;
                        case 5:
                            i19 = x.v0(parcel, readInt13);
                            break;
                        case 6:
                            j17 = x.x0(parcel, readInt13);
                            break;
                        case 7:
                            str16 = x.S(parcel, readInt13);
                            break;
                        default:
                            x.B0(parcel, readInt13);
                            break;
                    }
                }
                x.b0(parcel, F013);
                return new zzom(j16, bArr, str15, bundle3, i19, j17, str16);
            case 13:
                int F014 = x.F0(parcel);
                while (true) {
                    ArrayList arrayList3 = null;
                    while (parcel.dataPosition() < F014) {
                        int readInt14 = parcel.readInt();
                        if (((char) readInt14) != 1) {
                            x.B0(parcel, readInt14);
                        } else {
                            int z0 = x.z0(parcel, readInt14);
                            int dataPosition = parcel.dataPosition();
                            if (z0 == 0) {
                                break;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int readInt15 = parcel.readInt();
                            for (int i20 = 0; i20 < readInt15; i20++) {
                                arrayList4.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(dataPosition + z0);
                            arrayList3 = arrayList4;
                        }
                    }
                    x.b0(parcel, F014);
                    return new zzoo(arrayList3);
                    break;
                }
            case 14:
                int F015 = x.F0(parcel);
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < F015) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        x.B0(parcel, readInt16);
                    } else {
                        arrayList5 = x.W(parcel, readInt16, zzom.CREATOR);
                    }
                }
                x.b0(parcel, F015);
                return new zzoq(arrayList5);
            case 15:
                int F016 = x.F0(parcel);
                String str17 = null;
                Long l10 = null;
                Float f6 = null;
                String str18 = null;
                String str19 = null;
                Double d10 = null;
                long j18 = 0;
                int i21 = 0;
                while (parcel.dataPosition() < F016) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 1:
                            i21 = x.v0(parcel, readInt17);
                            break;
                        case 2:
                            str17 = x.S(parcel, readInt17);
                            break;
                        case 3:
                            j18 = x.x0(parcel, readInt17);
                            break;
                        case 4:
                            l10 = x.y0(parcel, readInt17);
                            break;
                        case 5:
                            int z02 = x.z0(parcel, readInt17);
                            if (z02 == 0) {
                                f6 = null;
                                break;
                            } else {
                                x.I0(parcel, z02, 4);
                                f6 = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            str18 = x.S(parcel, readInt17);
                            break;
                        case 7:
                            str19 = x.S(parcel, readInt17);
                            break;
                        case '\b':
                            d10 = x.s0(parcel, readInt17);
                            break;
                        default:
                            x.B0(parcel, readInt17);
                            break;
                    }
                }
                x.b0(parcel, F016);
                return new zzpl(i21, str17, j18, l10, f6, str18, str19, d10);
            case 16:
                int F017 = x.F0(parcel);
                boolean z11 = false;
                int i22 = 0;
                boolean z12 = false;
                boolean z13 = false;
                int i23 = 0;
                int i24 = 0;
                long j19 = 0;
                long j20 = 0;
                long j21 = 0;
                long j22 = 0;
                long j23 = 0;
                long j24 = 0;
                long j25 = 0;
                String str20 = "";
                String str21 = str20;
                String str22 = str21;
                String str23 = str22;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                Boolean bool = null;
                ArrayList arrayList6 = null;
                String str30 = null;
                String str31 = null;
                int i25 = 100;
                boolean z14 = true;
                boolean z15 = true;
                long j26 = -2147483648L;
                while (parcel.dataPosition() < F017) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            str24 = x.S(parcel, readInt18);
                            break;
                        case 3:
                            str25 = x.S(parcel, readInt18);
                            break;
                        case 4:
                            str26 = x.S(parcel, readInt18);
                            break;
                        case 5:
                            str27 = x.S(parcel, readInt18);
                            break;
                        case 6:
                            j19 = x.x0(parcel, readInt18);
                            break;
                        case 7:
                            j20 = x.x0(parcel, readInt18);
                            break;
                        case '\b':
                            str28 = x.S(parcel, readInt18);
                            break;
                        case '\t':
                            z14 = x.r0(parcel, readInt18);
                            break;
                        case '\n':
                            z11 = x.r0(parcel, readInt18);
                            break;
                        case 11:
                            j26 = x.x0(parcel, readInt18);
                            break;
                        case '\f':
                            str29 = x.S(parcel, readInt18);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                        case '!':
                        default:
                            x.B0(parcel, readInt18);
                            break;
                        case 14:
                            j21 = x.x0(parcel, readInt18);
                            break;
                        case 15:
                            i22 = x.v0(parcel, readInt18);
                            break;
                        case 16:
                            z15 = x.r0(parcel, readInt18);
                            break;
                        case 18:
                            z12 = x.r0(parcel, readInt18);
                            break;
                        case 21:
                            int z03 = x.z0(parcel, readInt18);
                            if (z03 == 0) {
                                bool = null;
                                break;
                            } else {
                                x.I0(parcel, z03, 4);
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                                break;
                            }
                        case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                            j22 = x.x0(parcel, readInt18);
                            break;
                        case g.ISCRASH_FIELD_NUMBER /* 23 */:
                            arrayList6 = x.U(parcel, readInt18);
                            break;
                        case C0122e9.F /* 25 */:
                            str20 = x.S(parcel, readInt18);
                            break;
                        case C0122e9.G /* 26 */:
                            str21 = x.S(parcel, readInt18);
                            break;
                        case C0122e9.H /* 27 */:
                            str30 = x.S(parcel, readInt18);
                            break;
                        case 28:
                            z13 = x.r0(parcel, readInt18);
                            break;
                        case C0122e9.I /* 29 */:
                            j23 = x.x0(parcel, readInt18);
                            break;
                        case 30:
                            i25 = x.v0(parcel, readInt18);
                            break;
                        case 31:
                            str22 = x.S(parcel, readInt18);
                            break;
                        case ' ':
                            i23 = x.v0(parcel, readInt18);
                            break;
                        case '\"':
                            j24 = x.x0(parcel, readInt18);
                            break;
                        case C0122e9.J /* 35 */:
                            str31 = x.S(parcel, readInt18);
                            break;
                        case '$':
                            str23 = x.S(parcel, readInt18);
                            break;
                        case '%':
                            j25 = x.x0(parcel, readInt18);
                            break;
                        case C0122e9.K /* 38 */:
                            i24 = x.v0(parcel, readInt18);
                            break;
                    }
                }
                x.b0(parcel, F017);
                return new zzr(str24, str25, str26, str27, j19, j20, str28, z14, z11, j26, str29, j21, i22, z15, z12, bool, j22, arrayList6, str20, str21, str30, z13, j23, i25, str22, i23, j24, str31, str23, j25, i24);
            case 17:
                int F018 = x.F0(parcel);
                HashSet hashSet = new HashSet();
                int i26 = 0;
                ArrayList arrayList7 = null;
                zzs zzsVar = null;
                int i27 = 0;
                while (parcel.dataPosition() < F018) {
                    int readInt19 = parcel.readInt();
                    char c15 = (char) readInt19;
                    if (c15 == 1) {
                        i26 = x.v0(parcel, readInt19);
                        hashSet.add(1);
                    } else if (c15 == 2) {
                        arrayList7 = x.W(parcel, readInt19, zzu.CREATOR);
                        hashSet.add(2);
                    } else if (c15 == 3) {
                        i27 = x.v0(parcel, readInt19);
                        hashSet.add(3);
                    } else if (c15 != 4) {
                        x.B0(parcel, readInt19);
                    } else {
                        zzsVar = (zzs) x.P(parcel, readInt19, zzs.CREATOR);
                        hashSet.add(4);
                    }
                }
                if (parcel.dataPosition() == F018) {
                    return new zzo(hashSet, i26, arrayList7, i27, zzsVar);
                }
                throw new h6.a(c1.i(F018, "Overread allowed size end="), parcel);
            case 18:
                int F019 = x.F0(parcel);
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                ArrayList arrayList10 = null;
                ArrayList arrayList11 = null;
                ArrayList arrayList12 = null;
                int i28 = 0;
                while (parcel.dataPosition() < F019) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            i28 = x.v0(parcel, readInt20);
                            break;
                        case 2:
                            arrayList8 = x.U(parcel, readInt20);
                            break;
                        case 3:
                            arrayList9 = x.U(parcel, readInt20);
                            break;
                        case 4:
                            arrayList10 = x.U(parcel, readInt20);
                            break;
                        case 5:
                            arrayList11 = x.U(parcel, readInt20);
                            break;
                        case 6:
                            arrayList12 = x.U(parcel, readInt20);
                            break;
                        default:
                            x.B0(parcel, readInt20);
                            break;
                    }
                }
                x.b0(parcel, F019);
                return new zzs(i28, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12);
            case 19:
                int F020 = x.F0(parcel);
                HashSet hashSet2 = new HashSet();
                int i29 = 0;
                zzw zzwVar = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < F020) {
                    int readInt21 = parcel.readInt();
                    char c16 = (char) readInt21;
                    if (c16 == 1) {
                        i29 = x.v0(parcel, readInt21);
                        hashSet2.add(1);
                    } else if (c16 == 2) {
                        zzwVar = (zzw) x.P(parcel, readInt21, zzw.CREATOR);
                        hashSet2.add(2);
                    } else if (c16 == 3) {
                        str32 = x.S(parcel, readInt21);
                        hashSet2.add(3);
                    } else if (c16 == 4) {
                        str33 = x.S(parcel, readInt21);
                        hashSet2.add(4);
                    } else if (c16 != 5) {
                        x.B0(parcel, readInt21);
                    } else {
                        str34 = x.S(parcel, readInt21);
                        hashSet2.add(5);
                    }
                }
                if (parcel.dataPosition() == F020) {
                    return new zzu(hashSet2, i29, zzwVar, str32, str33, str34);
                }
                throw new h6.a(c1.i(F020, "Overread allowed size end="), parcel);
            case 20:
                int F021 = x.F0(parcel);
                HashSet hashSet3 = new HashSet();
                int i30 = 0;
                String str35 = null;
                byte[] bArr2 = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                int i31 = 0;
                while (parcel.dataPosition() < F021) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            i30 = x.v0(parcel, readInt22);
                            hashSet3.add(1);
                            break;
                        case 2:
                            str35 = x.S(parcel, readInt22);
                            hashSet3.add(2);
                            break;
                        case 3:
                            i31 = x.v0(parcel, readInt22);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArr2 = x.N(parcel, readInt22);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) x.P(parcel, readInt22, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) x.P(parcel, readInt22, DeviceMetaData.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            x.B0(parcel, readInt22);
                            break;
                    }
                }
                if (parcel.dataPosition() == F021) {
                    return new zzw(hashSet3, i30, str35, i31, bArr2, pendingIntent, deviceMetaData);
                }
                throw new h6.a(c1.i(F021, "Overread allowed size end="), parcel);
            case 21:
                int F022 = x.F0(parcel);
                int i32 = 0;
                boolean z16 = false;
                boolean z17 = false;
                long j27 = 0;
                while (parcel.dataPosition() < F022) {
                    int readInt23 = parcel.readInt();
                    char c17 = (char) readInt23;
                    if (c17 == 1) {
                        i32 = x.v0(parcel, readInt23);
                    } else if (c17 == 2) {
                        z16 = x.r0(parcel, readInt23);
                    } else if (c17 == 3) {
                        j27 = x.x0(parcel, readInt23);
                    } else if (c17 != 4) {
                        x.B0(parcel, readInt23);
                    } else {
                        z17 = x.r0(parcel, readInt23);
                    }
                }
                x.b0(parcel, F022);
                return new DeviceMetaData(i32, z16, j27, z17);
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                int F023 = x.F0(parcel);
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                int i33 = 0;
                ArrayList arrayList13 = null;
                String str36 = null;
                Account account2 = null;
                String str37 = null;
                String str38 = null;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < F023) {
                    int readInt24 = parcel.readInt();
                    switch ((char) readInt24) {
                        case 1:
                            arrayList13 = x.W(parcel, readInt24, Scope.CREATOR);
                            break;
                        case 2:
                            str36 = x.S(parcel, readInt24);
                            break;
                        case 3:
                            z18 = x.r0(parcel, readInt24);
                            break;
                        case 4:
                            z19 = x.r0(parcel, readInt24);
                            break;
                        case 5:
                            account2 = (Account) x.P(parcel, readInt24, Account.CREATOR);
                            break;
                        case 6:
                            str37 = x.S(parcel, readInt24);
                            break;
                        case 7:
                            str38 = x.S(parcel, readInt24);
                            break;
                        case '\b':
                            z20 = x.r0(parcel, readInt24);
                            break;
                        case '\t':
                            bundle4 = x.M(parcel, readInt24);
                            break;
                        case '\n':
                            z21 = x.r0(parcel, readInt24);
                            break;
                        case 11:
                            i33 = x.v0(parcel, readInt24);
                            break;
                        default:
                            x.B0(parcel, readInt24);
                            break;
                    }
                }
                x.b0(parcel, F023);
                return new AuthorizationRequest(arrayList13, str36, z18, z19, account2, str37, str38, z20, bundle4, z21, i33);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                int F024 = x.F0(parcel);
                String str39 = null;
                String str40 = null;
                String str41 = null;
                ArrayList arrayList14 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent2 = null;
                Bundle bundle5 = null;
                while (parcel.dataPosition() < F024) {
                    int readInt25 = parcel.readInt();
                    switch ((char) readInt25) {
                        case 1:
                            str39 = x.S(parcel, readInt25);
                            break;
                        case 2:
                            str40 = x.S(parcel, readInt25);
                            break;
                        case 3:
                            str41 = x.S(parcel, readInt25);
                            break;
                        case 4:
                            arrayList14 = x.U(parcel, readInt25);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) x.P(parcel, readInt25, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) x.P(parcel, readInt25, PendingIntent.CREATOR);
                            break;
                        case 7:
                            bundle5 = x.M(parcel, readInt25);
                            break;
                        default:
                            x.B0(parcel, readInt25);
                            break;
                    }
                }
                x.b0(parcel, F024);
                return new AuthorizationResult(str39, str40, str41, arrayList14, googleSignInAccount, pendingIntent2, bundle5);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                int F025 = x.F0(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < F025) {
                    int readInt26 = parcel.readInt();
                    if (((char) readInt26) != 1) {
                        x.B0(parcel, readInt26);
                    } else {
                        pendingIntent3 = (PendingIntent) x.P(parcel, readInt26, PendingIntent.CREATOR);
                    }
                }
                x.b0(parcel, F025);
                return new BeginSignInResult(pendingIntent3);
            case C0122e9.F /* 25 */:
                int F026 = x.F0(parcel);
                boolean z22 = false;
                String str42 = null;
                while (parcel.dataPosition() < F026) {
                    int readInt27 = parcel.readInt();
                    char c18 = (char) readInt27;
                    if (c18 == 1) {
                        str42 = x.S(parcel, readInt27);
                    } else if (c18 != 2) {
                        x.B0(parcel, readInt27);
                    } else {
                        z22 = x.r0(parcel, readInt27);
                    }
                }
                x.b0(parcel, F026);
                return new zbf(str42, z22);
            case C0122e9.G /* 26 */:
                int F027 = x.F0(parcel);
                String str43 = null;
                String str44 = null;
                while (parcel.dataPosition() < F027) {
                    int readInt28 = parcel.readInt();
                    char c19 = (char) readInt28;
                    if (c19 == 1) {
                        str43 = x.S(parcel, readInt28);
                    } else if (c19 != 2) {
                        x.B0(parcel, readInt28);
                    } else {
                        str44 = x.S(parcel, readInt28);
                    }
                }
                x.b0(parcel, F027);
                return new ClearTokenRequest(str43, str44);
            case C0122e9.H /* 27 */:
                int F028 = x.F0(parcel);
                int i34 = 0;
                while (parcel.dataPosition() < F028) {
                    int readInt29 = parcel.readInt();
                    if (((char) readInt29) != 1) {
                        x.B0(parcel, readInt29);
                    } else {
                        i34 = x.v0(parcel, readInt29);
                    }
                }
                x.b0(parcel, F028);
                return new GetPhoneNumberHintIntentRequest(i34);
            case 28:
                int F029 = x.F0(parcel);
                String str45 = null;
                String str46 = null;
                String str47 = null;
                String str48 = null;
                ArrayList arrayList15 = null;
                boolean z23 = false;
                int i35 = 0;
                while (parcel.dataPosition() < F029) {
                    int readInt30 = parcel.readInt();
                    switch ((char) readInt30) {
                        case 1:
                            str45 = x.S(parcel, readInt30);
                            break;
                        case 2:
                            str46 = x.S(parcel, readInt30);
                            break;
                        case 3:
                            str47 = x.S(parcel, readInt30);
                            break;
                        case 4:
                            str48 = x.S(parcel, readInt30);
                            break;
                        case 5:
                            z23 = x.r0(parcel, readInt30);
                            break;
                        case 6:
                            i35 = x.v0(parcel, readInt30);
                            break;
                        case 7:
                            arrayList15 = x.W(parcel, readInt30, zbf.CREATOR);
                            break;
                        default:
                            x.B0(parcel, readInt30);
                            break;
                    }
                }
                x.b0(parcel, F029);
                return new GetSignInIntentRequest(str45, str46, str47, str48, z23, i35, arrayList15);
            default:
                int F030 = x.F0(parcel);
                ArrayList arrayList16 = null;
                Account account3 = null;
                String str49 = null;
                while (parcel.dataPosition() < F030) {
                    int readInt31 = parcel.readInt();
                    char c20 = (char) readInt31;
                    if (c20 == 1) {
                        arrayList16 = x.W(parcel, readInt31, Scope.CREATOR);
                    } else if (c20 == 2) {
                        account3 = (Account) x.P(parcel, readInt31, Account.CREATOR);
                    } else if (c20 != 3) {
                        x.B0(parcel, readInt31);
                    } else {
                        str49 = x.S(parcel, readInt31);
                    }
                }
                x.b0(parcel, F030);
                return new RevokeAccessRequest(arrayList16, account3, str49);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f22036a) {
            case 0:
                return new zza[i5];
            case 1:
                return new zzc[i5];
            case 2:
                return new AccountChangeEvent[i5];
            case 3:
                return new AccountChangeEventsRequest[i5];
            case 4:
                return new AccountChangeEventsResponse[i5];
            case 5:
                return new TokenData[i5];
            case 6:
                return new zzaf[i5];
            case 7:
                return new zzah[i5];
            case 8:
                return new zzao[i5];
            case 9:
                return new zzbe[i5];
            case 10:
                return new zzbg[i5];
            case 11:
                return new zzoh[i5];
            case 12:
                return new zzom[i5];
            case 13:
                return new zzoo[i5];
            case 14:
                return new zzoq[i5];
            case 15:
                return new zzpl[i5];
            case 16:
                return new zzr[i5];
            case 17:
                return new zzo[i5];
            case 18:
                return new zzs[i5];
            case 19:
                return new zzu[i5];
            case 20:
                return new zzw[i5];
            case 21:
                return new DeviceMetaData[i5];
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new AuthorizationRequest[i5];
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new AuthorizationResult[i5];
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new BeginSignInResult[i5];
            case C0122e9.F /* 25 */:
                return new zbf[i5];
            case C0122e9.G /* 26 */:
                return new ClearTokenRequest[i5];
            case C0122e9.H /* 27 */:
                return new GetPhoneNumberHintIntentRequest[i5];
            case 28:
                return new GetSignInIntentRequest[i5];
            default:
                return new RevokeAccessRequest[i5];
        }
    }
}
