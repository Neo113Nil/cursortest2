package g6;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.internal.zzai;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.libs.identity.zzeg;
import com.google.android.gms.libs.identity.zzei;
import com.google.android.gms.libs.identity.zzek;
import com.google.android.gms.libs.identity.zzem;
import com.google.android.gms.libs.identity.zzh;
import com.google.android.gms.libs.identity.zzl;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LocationRequest;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9851a;

    public /* synthetic */ j(int i5) {
        this.f9851a = i5;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        int i10 = getServiceRequest.f4505a;
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = getServiceRequest.f4506b;
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = getServiceRequest.f4507c;
        h8.b.U(parcel, 3, 4);
        parcel.writeInt(i12);
        h8.b.O(parcel, 4, getServiceRequest.f4508d, false);
        h8.b.I(parcel, 5, getServiceRequest.f4509e);
        h8.b.Q(parcel, 6, getServiceRequest.f4510f, i5);
        h8.b.F(parcel, 7, getServiceRequest.f4511g);
        h8.b.N(parcel, 8, getServiceRequest.f4512h, i5, false);
        h8.b.Q(parcel, 10, getServiceRequest.f4513i, i5);
        h8.b.Q(parcel, 11, getServiceRequest.j, i5);
        boolean z5 = getServiceRequest.f4514k;
        h8.b.U(parcel, 12, 4);
        parcel.writeInt(z5 ? 1 : 0);
        int i13 = getServiceRequest.f4515l;
        h8.b.U(parcel, 13, 4);
        parcel.writeInt(i13);
        boolean z7 = getServiceRequest.f4516m;
        h8.b.U(parcel, 14, 4);
        parcel.writeInt(z7 ? 1 : 0);
        h8.b.O(parcel, 15, getServiceRequest.f4517n, false);
        h8.b.W(parcel, V);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9851a) {
            case 0:
                int F0 = f3.x.F0(parcel);
                String str = null;
                int i5 = 0;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i5 = f3.x.v0(parcel, readInt);
                    } else if (c2 != 2) {
                        f3.x.B0(parcel, readInt);
                    } else {
                        str = f3.x.S(parcel, readInt);
                    }
                }
                f3.x.b0(parcel, F0);
                return new ClientIdentity(i5, str);
            case 1:
                int F02 = f3.x.F0(parcel);
                int i10 = 0;
                boolean z5 = false;
                boolean z7 = false;
                IBinder iBinder = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    char c8 = (char) readInt2;
                    if (c8 == 1) {
                        i10 = f3.x.v0(parcel, readInt2);
                    } else if (c8 == 2) {
                        iBinder = f3.x.u0(parcel, readInt2);
                    } else if (c8 == 3) {
                        connectionResult = (ConnectionResult) f3.x.P(parcel, readInt2, ConnectionResult.CREATOR);
                    } else if (c8 == 4) {
                        z5 = f3.x.r0(parcel, readInt2);
                    } else if (c8 != 5) {
                        f3.x.B0(parcel, readInt2);
                    } else {
                        z7 = f3.x.r0(parcel, readInt2);
                    }
                }
                f3.x.b0(parcel, F02);
                return new zaaa(i10, iBinder, connectionResult, z5, z7);
            case 2:
                int F03 = f3.x.F0(parcel);
                Scope[] scopeArr = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i11 = f3.x.v0(parcel, readInt3);
                    } else if (c10 == 2) {
                        i12 = f3.x.v0(parcel, readInt3);
                    } else if (c10 == 3) {
                        i13 = f3.x.v0(parcel, readInt3);
                    } else if (c10 != 4) {
                        f3.x.B0(parcel, readInt3);
                    } else {
                        scopeArr = (Scope[]) f3.x.V(parcel, readInt3, Scope.CREATOR);
                    }
                }
                f3.x.b0(parcel, F03);
                return new zaac(i11, i12, i13, scopeArr);
            case 3:
                int F04 = f3.x.F0(parcel);
                ArrayList arrayList = null;
                int i14 = 0;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i14 = f3.x.v0(parcel, readInt4);
                    } else if (c11 != 2) {
                        f3.x.B0(parcel, readInt4);
                    } else {
                        arrayList = f3.x.W(parcel, readInt4, MethodInvocation.CREATOR);
                    }
                }
                f3.x.b0(parcel, F04);
                return new TelemetryData(i14, arrayList);
            case 4:
                int F05 = f3.x.F0(parcel);
                int i15 = 0;
                int i16 = 0;
                boolean z10 = false;
                long j = 0;
                String str2 = null;
                while (parcel.dataPosition() < F05) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        i15 = f3.x.v0(parcel, readInt5);
                    } else if (c12 == 2) {
                        str2 = f3.x.S(parcel, readInt5);
                    } else if (c12 == 3) {
                        j = f3.x.x0(parcel, readInt5);
                    } else if (c12 == 4) {
                        i16 = f3.x.v0(parcel, readInt5);
                    } else if (c12 != 5) {
                        f3.x.B0(parcel, readInt5);
                    } else {
                        z10 = f3.x.r0(parcel, readInt5);
                    }
                }
                f3.x.b0(parcel, F05);
                return new zab(i15, i16, j, str2, z10);
            case 5:
                int F06 = f3.x.F0(parcel);
                int i17 = -1;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                String str3 = null;
                String str4 = null;
                long j6 = 0;
                long j10 = 0;
                while (parcel.dataPosition() < F06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i18 = f3.x.v0(parcel, readInt6);
                            break;
                        case 2:
                            i19 = f3.x.v0(parcel, readInt6);
                            break;
                        case 3:
                            i20 = f3.x.v0(parcel, readInt6);
                            break;
                        case 4:
                            j6 = f3.x.x0(parcel, readInt6);
                            break;
                        case 5:
                            j10 = f3.x.x0(parcel, readInt6);
                            break;
                        case 6:
                            str3 = f3.x.S(parcel, readInt6);
                            break;
                        case 7:
                            str4 = f3.x.S(parcel, readInt6);
                            break;
                        case '\b':
                            i21 = f3.x.v0(parcel, readInt6);
                            break;
                        case '\t':
                            i17 = f3.x.v0(parcel, readInt6);
                            break;
                        default:
                            f3.x.B0(parcel, readInt6);
                            break;
                    }
                }
                f3.x.b0(parcel, F06);
                return new MethodInvocation(i18, i19, i20, j6, j10, str3, str4, i21, i17);
            case 6:
                int F07 = f3.x.F0(parcel);
                Account account = null;
                int i22 = 0;
                int i23 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < F07) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        i22 = f3.x.v0(parcel, readInt7);
                    } else if (c13 == 2) {
                        account = (Account) f3.x.P(parcel, readInt7, Account.CREATOR);
                    } else if (c13 == 3) {
                        i23 = f3.x.v0(parcel, readInt7);
                    } else if (c13 != 4) {
                        f3.x.B0(parcel, readInt7);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) f3.x.P(parcel, readInt7, GoogleSignInAccount.CREATOR);
                    }
                }
                f3.x.b0(parcel, F07);
                return new zay(i22, account, i23, googleSignInAccount);
            case 7:
                int F08 = f3.x.F0(parcel);
                int i24 = 0;
                boolean z11 = false;
                boolean z12 = false;
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < F08) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 == 1) {
                        i24 = f3.x.v0(parcel, readInt8);
                    } else if (c14 == 2) {
                        z11 = f3.x.r0(parcel, readInt8);
                    } else if (c14 == 3) {
                        z12 = f3.x.r0(parcel, readInt8);
                    } else if (c14 == 4) {
                        i25 = f3.x.v0(parcel, readInt8);
                    } else if (c14 != 5) {
                        f3.x.B0(parcel, readInt8);
                    } else {
                        i26 = f3.x.v0(parcel, readInt8);
                    }
                }
                f3.x.b0(parcel, F08);
                return new RootTelemetryConfiguration(i24, z11, z12, i25, i26);
            case 8:
                int F09 = f3.x.F0(parcel);
                int i27 = 0;
                while (parcel.dataPosition() < F09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 1) {
                        f3.x.B0(parcel, readInt9);
                    } else {
                        i27 = f3.x.v0(parcel, readInt9);
                    }
                }
                f3.x.b0(parcel, F09);
                return new zzai(i27);
            case 9:
                return new BinderWrapper(parcel);
            case 10:
                int F010 = f3.x.F0(parcel);
                Bundle bundle = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                int i28 = 0;
                Feature[] featureArr = null;
                while (parcel.dataPosition() < F010) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 == 1) {
                        bundle = f3.x.M(parcel, readInt10);
                    } else if (c15 == 2) {
                        featureArr = (Feature[]) f3.x.V(parcel, readInt10, Feature.CREATOR);
                    } else if (c15 == 3) {
                        i28 = f3.x.v0(parcel, readInt10);
                    } else if (c15 != 4) {
                        f3.x.B0(parcel, readInt10);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) f3.x.P(parcel, readInt10, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                f3.x.b0(parcel, F010);
                zzj zzjVar = new zzj();
                zzjVar.f4553a = bundle;
                zzjVar.f4554b = featureArr;
                zzjVar.f4555c = i28;
                zzjVar.f4556d = connectionTelemetryConfiguration;
                return zzjVar;
            case 11:
                int F011 = f3.x.F0(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z13 = false;
                boolean z14 = false;
                int i29 = 0;
                while (parcel.dataPosition() < F011) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) f3.x.P(parcel, readInt11, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            z13 = f3.x.r0(parcel, readInt11);
                            break;
                        case 3:
                            z14 = f3.x.r0(parcel, readInt11);
                            break;
                        case 4:
                            iArr = f3.x.O(parcel, readInt11);
                            break;
                        case 5:
                            i29 = f3.x.v0(parcel, readInt11);
                            break;
                        case 6:
                            iArr2 = f3.x.O(parcel, readInt11);
                            break;
                        default:
                            f3.x.B0(parcel, readInt11);
                            break;
                    }
                }
                f3.x.b0(parcel, F011);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z13, z14, iArr, i29, iArr2);
            case 12:
                int F012 = f3.x.F0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr2 = GetServiceRequest.f4503o;
                String str5 = null;
                IBinder iBinder2 = null;
                Account account2 = null;
                String str6 = null;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                boolean z15 = false;
                int i33 = 0;
                boolean z16 = false;
                Feature[] featureArr2 = GetServiceRequest.f4504p;
                Feature[] featureArr3 = featureArr2;
                while (parcel.dataPosition() < F012) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            i30 = f3.x.v0(parcel, readInt12);
                            break;
                        case 2:
                            i31 = f3.x.v0(parcel, readInt12);
                            break;
                        case 3:
                            i32 = f3.x.v0(parcel, readInt12);
                            break;
                        case 4:
                            str5 = f3.x.S(parcel, readInt12);
                            break;
                        case 5:
                            iBinder2 = f3.x.u0(parcel, readInt12);
                            break;
                        case 6:
                            scopeArr2 = (Scope[]) f3.x.V(parcel, readInt12, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = f3.x.M(parcel, readInt12);
                            break;
                        case '\b':
                            account2 = (Account) f3.x.P(parcel, readInt12, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            f3.x.B0(parcel, readInt12);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) f3.x.V(parcel, readInt12, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) f3.x.V(parcel, readInt12, Feature.CREATOR);
                            break;
                        case '\f':
                            z15 = f3.x.r0(parcel, readInt12);
                            break;
                        case '\r':
                            i33 = f3.x.v0(parcel, readInt12);
                            break;
                        case 14:
                            z16 = f3.x.r0(parcel, readInt12);
                            break;
                        case 15:
                            str6 = f3.x.S(parcel, readInt12);
                            break;
                    }
                }
                f3.x.b0(parcel, F012);
                return new GetServiceRequest(i30, i31, i32, str5, iBinder2, scopeArr2, bundle2, account2, featureArr2, featureArr3, z15, i33, z16, str6);
            case 13:
                int F013 = f3.x.F0(parcel);
                boolean z17 = false;
                int i34 = 0;
                while (parcel.dataPosition() < F013) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        z17 = f3.x.r0(parcel, readInt13);
                    } else if (c16 != 2) {
                        f3.x.B0(parcel, readInt13);
                    } else {
                        i34 = f3.x.v0(parcel, readInt13);
                    }
                }
                f3.x.b0(parcel, F013);
                return new ModuleAvailabilityResponse(i34, z17);
            case 14:
                int F014 = f3.x.F0(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < F014) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        f3.x.B0(parcel, readInt14);
                    } else {
                        pendingIntent = (PendingIntent) f3.x.P(parcel, readInt14, PendingIntent.CREATOR);
                    }
                }
                f3.x.b0(parcel, F014);
                return new ModuleInstallIntentResponse(pendingIntent);
            case 15:
                int F015 = f3.x.F0(parcel);
                int i35 = 0;
                boolean z18 = false;
                while (parcel.dataPosition() < F015) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 1) {
                        i35 = f3.x.v0(parcel, readInt15);
                    } else if (c17 != 2) {
                        f3.x.B0(parcel, readInt15);
                    } else {
                        z18 = f3.x.r0(parcel, readInt15);
                    }
                }
                f3.x.b0(parcel, F015);
                return new ModuleInstallResponse(i35, z18);
            case 16:
                int F016 = f3.x.F0(parcel);
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                Long l6 = null;
                Long l10 = null;
                while (parcel.dataPosition() < F016) {
                    int readInt16 = parcel.readInt();
                    char c18 = (char) readInt16;
                    if (c18 == 1) {
                        i36 = f3.x.v0(parcel, readInt16);
                    } else if (c18 == 2) {
                        i37 = f3.x.v0(parcel, readInt16);
                    } else if (c18 == 3) {
                        l6 = f3.x.y0(parcel, readInt16);
                    } else if (c18 == 4) {
                        l10 = f3.x.y0(parcel, readInt16);
                    } else if (c18 != 5) {
                        f3.x.B0(parcel, readInt16);
                    } else {
                        i38 = f3.x.v0(parcel, readInt16);
                    }
                }
                f3.x.b0(parcel, F016);
                return new ModuleInstallStatusUpdate(i36, i37, l6, l10, i38);
            case 17:
                int F017 = f3.x.F0(parcel);
                ArrayList arrayList2 = null;
                String str7 = null;
                boolean z19 = false;
                String str8 = null;
                while (parcel.dataPosition() < F017) {
                    int readInt17 = parcel.readInt();
                    char c19 = (char) readInt17;
                    if (c19 == 1) {
                        arrayList2 = f3.x.W(parcel, readInt17, Feature.CREATOR);
                    } else if (c19 == 2) {
                        z19 = f3.x.r0(parcel, readInt17);
                    } else if (c19 == 3) {
                        str8 = f3.x.S(parcel, readInt17);
                    } else if (c19 != 4) {
                        f3.x.B0(parcel, readInt17);
                    } else {
                        str7 = f3.x.S(parcel, readInt17);
                    }
                }
                f3.x.b0(parcel, F017);
                return new ApiFeatureRequest(arrayList2, z19, str8, str7);
            case 18:
                int F018 = f3.x.F0(parcel);
                int i39 = 0;
                String str9 = null;
                int i40 = 0;
                while (parcel.dataPosition() < F018) {
                    int readInt18 = parcel.readInt();
                    char c20 = (char) readInt18;
                    if (c20 == 1) {
                        i39 = f3.x.v0(parcel, readInt18);
                    } else if (c20 == 2) {
                        str9 = f3.x.S(parcel, readInt18);
                    } else if (c20 != 3) {
                        f3.x.B0(parcel, readInt18);
                    } else {
                        i40 = f3.x.v0(parcel, readInt18);
                    }
                }
                f3.x.b0(parcel, F018);
                return new FavaDiagnosticsEntity(i39, str9, i40);
            case 19:
                int F019 = f3.x.F0(parcel);
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                String str10 = null;
                int i41 = 0;
                while (parcel.dataPosition() < F019) {
                    int readInt19 = parcel.readInt();
                    char c21 = (char) readInt19;
                    if (c21 == 1) {
                        i41 = f3.x.v0(parcel, readInt19);
                    } else if (c21 == 2) {
                        iBinder3 = f3.x.u0(parcel, readInt19);
                    } else if (c21 == 3) {
                        iBinder4 = f3.x.u0(parcel, readInt19);
                    } else if (c21 == 4) {
                        pendingIntent2 = (PendingIntent) f3.x.P(parcel, readInt19, PendingIntent.CREATOR);
                    } else if (c21 != 6) {
                        f3.x.B0(parcel, readInt19);
                    } else {
                        str10 = f3.x.S(parcel, readInt19);
                    }
                }
                f3.x.b0(parcel, F019);
                return new zzee(i41, iBinder3, iBinder4, pendingIntent2, str10);
            case 20:
                int F020 = f3.x.F0(parcel);
                long j11 = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayList3 = null;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < F020) {
                    int readInt20 = parcel.readInt();
                    char c22 = (char) readInt20;
                    if (c22 == 1) {
                        locationRequest = (LocationRequest) f3.x.P(parcel, readInt20, LocationRequest.CREATOR);
                    } else if (c22 == 5) {
                        arrayList3 = f3.x.W(parcel, readInt20, ClientIdentity.CREATOR);
                    } else if (c22 == '\b') {
                        z20 = f3.x.r0(parcel, readInt20);
                    } else if (c22 != '\t') {
                        switch (c22) {
                            case 11:
                                z22 = f3.x.r0(parcel, readInt20);
                                break;
                            case '\f':
                                z23 = f3.x.r0(parcel, readInt20);
                                break;
                            case '\r':
                                f3.x.S(parcel, readInt20);
                                break;
                            case 14:
                                j11 = f3.x.x0(parcel, readInt20);
                                break;
                            default:
                                f3.x.B0(parcel, readInt20);
                                break;
                        }
                    } else {
                        z21 = f3.x.r0(parcel, readInt20);
                    }
                }
                f3.x.b0(parcel, F020);
                return new zzeg(locationRequest, arrayList3, z20, z21, z22, z23, j11);
            case 21:
                int F021 = f3.x.F0(parcel);
                zzeg zzegVar = null;
                IBinder iBinder5 = null;
                IBinder iBinder6 = null;
                PendingIntent pendingIntent3 = null;
                IBinder iBinder7 = null;
                String str11 = null;
                int i42 = 1;
                while (parcel.dataPosition() < F021) {
                    int readInt21 = parcel.readInt();
                    switch ((char) readInt21) {
                        case 1:
                            i42 = f3.x.v0(parcel, readInt21);
                            break;
                        case 2:
                            zzegVar = (zzeg) f3.x.P(parcel, readInt21, zzeg.CREATOR);
                            break;
                        case 3:
                            iBinder5 = f3.x.u0(parcel, readInt21);
                            break;
                        case 4:
                            pendingIntent3 = (PendingIntent) f3.x.P(parcel, readInt21, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder6 = f3.x.u0(parcel, readInt21);
                            break;
                        case 6:
                            iBinder7 = f3.x.u0(parcel, readInt21);
                            break;
                        case 7:
                        default:
                            f3.x.B0(parcel, readInt21);
                            break;
                        case '\b':
                            str11 = f3.x.S(parcel, readInt21);
                            break;
                    }
                }
                f3.x.b0(parcel, F021);
                return new zzei(i42, zzegVar, iBinder5, iBinder6, pendingIntent3, iBinder7, str11);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                int F022 = f3.x.F0(parcel);
                int i43 = -1;
                int i44 = 0;
                short s8 = 0;
                int i45 = 0;
                long j12 = 0;
                float f6 = 0.0f;
                double d10 = 0.0d;
                double d11 = 0.0d;
                String str12 = null;
                while (parcel.dataPosition() < F022) {
                    int readInt22 = parcel.readInt();
                    switch ((char) readInt22) {
                        case 1:
                            str12 = f3.x.S(parcel, readInt22);
                            break;
                        case 2:
                            j12 = f3.x.x0(parcel, readInt22);
                            break;
                        case 3:
                            f3.x.G0(parcel, readInt22, 4);
                            s8 = (short) parcel.readInt();
                            break;
                        case 4:
                            f3.x.G0(parcel, readInt22, 8);
                            d10 = parcel.readDouble();
                            break;
                        case 5:
                            f3.x.G0(parcel, readInt22, 8);
                            d11 = parcel.readDouble();
                            break;
                        case 6:
                            f6 = f3.x.t0(parcel, readInt22);
                            break;
                        case 7:
                            i44 = f3.x.v0(parcel, readInt22);
                            break;
                        case '\b':
                            i45 = f3.x.v0(parcel, readInt22);
                            break;
                        case '\t':
                            i43 = f3.x.v0(parcel, readInt22);
                            break;
                        default:
                            f3.x.B0(parcel, readInt22);
                            break;
                    }
                }
                f3.x.b0(parcel, F022);
                return new zzek(str12, i44, s8, d10, d11, f6, j12, i45, i43);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                int F023 = f3.x.F0(parcel);
                String str13 = "";
                ArrayList arrayList4 = null;
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < F023) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 1) {
                        arrayList4 = f3.x.U(parcel, readInt23);
                    } else if (c23 == 2) {
                        pendingIntent4 = (PendingIntent) f3.x.P(parcel, readInt23, PendingIntent.CREATOR);
                    } else if (c23 != 3) {
                        f3.x.B0(parcel, readInt23);
                    } else {
                        str13 = f3.x.S(parcel, readInt23);
                    }
                }
                f3.x.b0(parcel, F023);
                return new zzem(arrayList4, pendingIntent4, str13);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                int F024 = f3.x.F0(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                ArrayList arrayList5 = null;
                com.google.android.gms.libs.identity.ClientIdentity clientIdentity = null;
                int i46 = 0;
                while (parcel.dataPosition() < F024) {
                    int readInt24 = parcel.readInt();
                    char c24 = (char) readInt24;
                    if (c24 == 1) {
                        i46 = f3.x.v0(parcel, readInt24);
                    } else if (c24 == 3) {
                        str14 = f3.x.S(parcel, readInt24);
                    } else if (c24 == 4) {
                        str15 = f3.x.S(parcel, readInt24);
                    } else if (c24 == 6) {
                        str16 = f3.x.S(parcel, readInt24);
                    } else if (c24 == 7) {
                        clientIdentity = (com.google.android.gms.libs.identity.ClientIdentity) f3.x.P(parcel, readInt24, com.google.android.gms.libs.identity.ClientIdentity.CREATOR);
                    } else if (c24 != '\b') {
                        f3.x.B0(parcel, readInt24);
                    } else {
                        arrayList5 = f3.x.W(parcel, readInt24, Feature.CREATOR);
                    }
                }
                f3.x.b0(parcel, F024);
                return new com.google.android.gms.libs.identity.ClientIdentity(i46, str14, str15, str16, arrayList5, clientIdentity);
            case C0122e9.F /* 25 */:
                int F025 = f3.x.F0(parcel);
                DeviceOrientationRequest deviceOrientationRequest = zzh.f4894e;
                List list = zzh.f4893d;
                String str17 = null;
                while (parcel.dataPosition() < F025) {
                    int readInt25 = parcel.readInt();
                    char c25 = (char) readInt25;
                    if (c25 == 1) {
                        deviceOrientationRequest = (DeviceOrientationRequest) f3.x.P(parcel, readInt25, DeviceOrientationRequest.CREATOR);
                    } else if (c25 == 2) {
                        list = f3.x.W(parcel, readInt25, ClientIdentity.CREATOR);
                    } else if (c25 != 3) {
                        f3.x.B0(parcel, readInt25);
                    } else {
                        str17 = f3.x.S(parcel, readInt25);
                    }
                }
                f3.x.b0(parcel, F025);
                return new zzh(deviceOrientationRequest, list, str17);
            case C0122e9.G /* 26 */:
                int F026 = f3.x.F0(parcel);
                zzh zzhVar = null;
                IBinder iBinder8 = null;
                IBinder iBinder9 = null;
                int i47 = 1;
                while (parcel.dataPosition() < F026) {
                    int readInt26 = parcel.readInt();
                    char c26 = (char) readInt26;
                    if (c26 == 1) {
                        i47 = f3.x.v0(parcel, readInt26);
                    } else if (c26 == 2) {
                        zzhVar = (zzh) f3.x.P(parcel, readInt26, zzh.CREATOR);
                    } else if (c26 == 3) {
                        iBinder8 = f3.x.u0(parcel, readInt26);
                    } else if (c26 != 4) {
                        f3.x.B0(parcel, readInt26);
                    } else {
                        iBinder9 = f3.x.u0(parcel, readInt26);
                    }
                }
                f3.x.b0(parcel, F026);
                return new com.google.android.gms.libs.identity.zzj(i47, zzhVar, iBinder8, iBinder9);
            case C0122e9.H /* 27 */:
                int F027 = f3.x.F0(parcel);
                Status status = null;
                while (parcel.dataPosition() < F027) {
                    int readInt27 = parcel.readInt();
                    if (((char) readInt27) != 1) {
                        f3.x.B0(parcel, readInt27);
                    } else {
                        status = (Status) f3.x.P(parcel, readInt27, Status.CREATOR);
                    }
                }
                f3.x.b0(parcel, F027);
                return new zzl(status);
            case 28:
                int F028 = f3.x.F0(parcel);
                StringToIntConverter stringToIntConverter = null;
                int i48 = 0;
                while (parcel.dataPosition() < F028) {
                    int readInt28 = parcel.readInt();
                    char c27 = (char) readInt28;
                    if (c27 == 1) {
                        i48 = f3.x.v0(parcel, readInt28);
                    } else if (c27 != 2) {
                        f3.x.B0(parcel, readInt28);
                    } else {
                        stringToIntConverter = (StringToIntConverter) f3.x.P(parcel, readInt28, StringToIntConverter.CREATOR);
                    }
                }
                f3.x.b0(parcel, F028);
                return new zaa(i48, stringToIntConverter);
            default:
                int F029 = f3.x.F0(parcel);
                ArrayList arrayList6 = null;
                int i49 = 0;
                while (parcel.dataPosition() < F029) {
                    int readInt29 = parcel.readInt();
                    char c28 = (char) readInt29;
                    if (c28 == 1) {
                        i49 = f3.x.v0(parcel, readInt29);
                    } else if (c28 != 2) {
                        f3.x.B0(parcel, readInt29);
                    } else {
                        arrayList6 = f3.x.W(parcel, readInt29, zac.CREATOR);
                    }
                }
                f3.x.b0(parcel, F029);
                return new StringToIntConverter(arrayList6, i49);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f9851a) {
            case 0:
                return new ClientIdentity[i5];
            case 1:
                return new zaaa[i5];
            case 2:
                return new zaac[i5];
            case 3:
                return new TelemetryData[i5];
            case 4:
                return new zab[i5];
            case 5:
                return new MethodInvocation[i5];
            case 6:
                return new zay[i5];
            case 7:
                return new RootTelemetryConfiguration[i5];
            case 8:
                return new zzai[i5];
            case 9:
                return new BinderWrapper[i5];
            case 10:
                return new zzj[i5];
            case 11:
                return new ConnectionTelemetryConfiguration[i5];
            case 12:
                return new GetServiceRequest[i5];
            case 13:
                return new ModuleAvailabilityResponse[i5];
            case 14:
                return new ModuleInstallIntentResponse[i5];
            case 15:
                return new ModuleInstallResponse[i5];
            case 16:
                return new ModuleInstallStatusUpdate[i5];
            case 17:
                return new ApiFeatureRequest[i5];
            case 18:
                return new FavaDiagnosticsEntity[i5];
            case 19:
                return new zzee[i5];
            case 20:
                return new zzeg[i5];
            case 21:
                return new zzei[i5];
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new zzek[i5];
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new zzem[i5];
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new com.google.android.gms.libs.identity.ClientIdentity[i5];
            case C0122e9.F /* 25 */:
                return new zzh[i5];
            case C0122e9.G /* 26 */:
                return new com.google.android.gms.libs.identity.zzj[i5];
            case C0122e9.H /* 27 */:
                return new zzl[i5];
            case 28:
                return new zaa[i5];
            default:
                return new StringToIntConverter[i5];
        }
    }
}
