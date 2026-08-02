package n6;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.server.converter.zac;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.common.server.response.zal;
import com.google.android.gms.common.server.response.zam;
import com.google.android.gms.common.server.response.zan;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.libs.identity.zzek;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.DeviceOrientation;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.SleepClassifyEvent;
import com.google.android.gms.location.SleepSegmentEvent;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.zzad;
import com.google.android.gms.location.zzal;
import com.google.android.gms.location.zzas;
import com.google.android.gms.location.zzb;
import f3.x;
import g6.v;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.List;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20859a;

    public /* synthetic */ a(int i5) {
        this.f20859a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20859a) {
            case 0:
                int F0 = x.F0(parcel);
                int i5 = 0;
                String str = null;
                int i10 = 0;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        i5 = x.v0(parcel, readInt);
                    } else if (c2 == 2) {
                        str = x.S(parcel, readInt);
                    } else if (c2 != 3) {
                        x.B0(parcel, readInt);
                    } else {
                        i10 = x.v0(parcel, readInt);
                    }
                }
                x.b0(parcel, F0);
                return new zac(i5, str, i10);
            case 1:
                int F02 = x.F0(parcel);
                String str2 = null;
                int i11 = 0;
                FastJsonResponse$Field fastJsonResponse$Field = null;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    char c8 = (char) readInt2;
                    if (c8 == 1) {
                        i11 = x.v0(parcel, readInt2);
                    } else if (c8 == 2) {
                        str2 = x.S(parcel, readInt2);
                    } else if (c8 != 3) {
                        x.B0(parcel, readInt2);
                    } else {
                        fastJsonResponse$Field = (FastJsonResponse$Field) x.P(parcel, readInt2, FastJsonResponse$Field.CREATOR);
                    }
                }
                x.b0(parcel, F02);
                return new zam(i11, str2, fastJsonResponse$Field);
            case 2:
                int F03 = x.F0(parcel);
                ArrayList arrayList = null;
                int i12 = 0;
                String str3 = null;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i12 = x.v0(parcel, readInt3);
                    } else if (c10 == 2) {
                        arrayList = x.W(parcel, readInt3, zal.CREATOR);
                    } else if (c10 != 3) {
                        x.B0(parcel, readInt3);
                    } else {
                        str3 = x.S(parcel, readInt3);
                    }
                }
                x.b0(parcel, F03);
                return new zan(i12, str3, arrayList);
            case 3:
                int F04 = x.F0(parcel);
                String str4 = null;
                int i13 = 0;
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i13 = x.v0(parcel, readInt4);
                    } else if (c11 == 2) {
                        str4 = x.S(parcel, readInt4);
                    } else if (c11 != 3) {
                        x.B0(parcel, readInt4);
                    } else {
                        arrayList2 = x.W(parcel, readInt4, zam.CREATOR);
                    }
                }
                x.b0(parcel, F04);
                return new zal(i13, str4, arrayList2);
            case 4:
                int F05 = x.F0(parcel);
                int i14 = 0;
                Parcel parcel2 = null;
                zan zanVar = null;
                while (parcel.dataPosition() < F05) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 == 1) {
                        i14 = x.v0(parcel, readInt5);
                    } else if (c12 == 2) {
                        int z0 = x.z0(parcel, readInt5);
                        int dataPosition = parcel.dataPosition();
                        if (z0 == 0) {
                            parcel2 = null;
                        } else {
                            Parcel obtain = Parcel.obtain();
                            obtain.appendFrom(parcel, dataPosition, z0);
                            parcel.setDataPosition(dataPosition + z0);
                            parcel2 = obtain;
                        }
                    } else if (c12 != 3) {
                        x.B0(parcel, readInt5);
                    } else {
                        zanVar = (zan) x.P(parcel, readInt5, zan.CREATOR);
                    }
                }
                x.b0(parcel, F05);
                return new SafeParcelResponse(i14, parcel2, zanVar);
            case 5:
                int F06 = x.F0(parcel);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                boolean z5 = false;
                String str5 = null;
                ArrayList arrayList3 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                long j = 0;
                long j6 = 0;
                long j10 = 0;
                float f6 = 0.0f;
                while (parcel.dataPosition() < F06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            i15 = x.v0(parcel, readInt6);
                            break;
                        case 2:
                            j = x.x0(parcel, readInt6);
                            break;
                        case 3:
                        case 7:
                        case '\t':
                        default:
                            x.B0(parcel, readInt6);
                            break;
                        case 4:
                            str5 = x.S(parcel, readInt6);
                            break;
                        case 5:
                            i17 = x.v0(parcel, readInt6);
                            break;
                        case 6:
                            arrayList3 = x.U(parcel, readInt6);
                            break;
                        case '\b':
                            j6 = x.x0(parcel, readInt6);
                            break;
                        case '\n':
                            str7 = x.S(parcel, readInt6);
                            break;
                        case 11:
                            i16 = x.v0(parcel, readInt6);
                            break;
                        case '\f':
                            str6 = x.S(parcel, readInt6);
                            break;
                        case '\r':
                            str8 = x.S(parcel, readInt6);
                            break;
                        case 14:
                            i18 = x.v0(parcel, readInt6);
                            break;
                        case 15:
                            f6 = x.t0(parcel, readInt6);
                            break;
                        case 16:
                            j10 = x.x0(parcel, readInt6);
                            break;
                        case 17:
                            str9 = x.S(parcel, readInt6);
                            break;
                        case 18:
                            z5 = x.r0(parcel, readInt6);
                            break;
                    }
                }
                x.b0(parcel, F06);
                return new WakeLockEvent(i15, j, i16, str5, i17, arrayList3, str6, j6, i18, str7, str8, f6, j10, str9, z5);
            case 6:
                int F07 = x.F0(parcel);
                ClientIdentity clientIdentity = null;
                int i19 = 0;
                boolean z7 = false;
                long j11 = Long.MAX_VALUE;
                while (parcel.dataPosition() < F07) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 == 1) {
                        j11 = x.x0(parcel, readInt7);
                    } else if (c13 == 2) {
                        i19 = x.v0(parcel, readInt7);
                    } else if (c13 == 3) {
                        z7 = x.r0(parcel, readInt7);
                    } else if (c13 != 5) {
                        x.B0(parcel, readInt7);
                    } else {
                        clientIdentity = (ClientIdentity) x.P(parcel, readInt7, ClientIdentity.CREATOR);
                    }
                }
                x.b0(parcel, F07);
                return new LastLocationRequest(j11, i19, z7, clientIdentity);
            case 7:
                int F08 = x.F0(parcel);
                zzal[] zzalVarArr = null;
                long j12 = 0;
                int i20 = 1;
                int i21 = 1;
                int i22 = 1000;
                while (parcel.dataPosition() < F08) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i20 = x.v0(parcel, readInt8);
                            break;
                        case 2:
                            i21 = x.v0(parcel, readInt8);
                            break;
                        case 3:
                            j12 = x.x0(parcel, readInt8);
                            break;
                        case 4:
                            i22 = x.v0(parcel, readInt8);
                            break;
                        case 5:
                            zzalVarArr = (zzal[]) x.V(parcel, readInt8, zzal.CREATOR);
                            break;
                        case 6:
                            x.r0(parcel, readInt8);
                            break;
                        default:
                            x.B0(parcel, readInt8);
                            break;
                    }
                }
                x.b0(parcel, F08);
                return new LocationAvailability(i22, i20, i21, j12, zzalVarArr);
            case 8:
                int F09 = x.F0(parcel);
                ClientIdentity clientIdentity2 = null;
                boolean z10 = false;
                while (parcel.dataPosition() < F09) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 == 1) {
                        z10 = x.r0(parcel, readInt9);
                    } else if (c14 != 2) {
                        x.B0(parcel, readInt9);
                    } else {
                        clientIdentity2 = (ClientIdentity) x.P(parcel, readInt9, ClientIdentity.CREATOR);
                    }
                }
                x.b0(parcel, F09);
                return new zzad(z10, clientIdentity2);
            case 9:
                int F010 = x.F0(parcel);
                WorkSource workSource = new WorkSource();
                ClientIdentity clientIdentity3 = null;
                boolean z11 = false;
                int i23 = 0;
                int i24 = 0;
                boolean z12 = false;
                long j13 = -1;
                float f10 = 0.0f;
                int i25 = Integer.MAX_VALUE;
                long j14 = Long.MAX_VALUE;
                long j15 = Long.MAX_VALUE;
                long j16 = 0;
                long j17 = 600000;
                long j18 = 3600000;
                int i26 = 102;
                while (parcel.dataPosition() < F010) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            i26 = x.v0(parcel, readInt10);
                            break;
                        case 2:
                            j18 = x.x0(parcel, readInt10);
                            break;
                        case 3:
                            j17 = x.x0(parcel, readInt10);
                            break;
                        case 4:
                        case 14:
                        default:
                            x.B0(parcel, readInt10);
                            break;
                        case 5:
                            j14 = x.x0(parcel, readInt10);
                            break;
                        case 6:
                            i25 = x.v0(parcel, readInt10);
                            break;
                        case 7:
                            f10 = x.t0(parcel, readInt10);
                            break;
                        case '\b':
                            j16 = x.x0(parcel, readInt10);
                            break;
                        case '\t':
                            z11 = x.r0(parcel, readInt10);
                            break;
                        case '\n':
                            j15 = x.x0(parcel, readInt10);
                            break;
                        case 11:
                            j13 = x.x0(parcel, readInt10);
                            break;
                        case '\f':
                            i23 = x.v0(parcel, readInt10);
                            break;
                        case '\r':
                            i24 = x.v0(parcel, readInt10);
                            break;
                        case 15:
                            z12 = x.r0(parcel, readInt10);
                            break;
                        case 16:
                            workSource = (WorkSource) x.P(parcel, readInt10, WorkSource.CREATOR);
                            break;
                        case 17:
                            clientIdentity3 = (ClientIdentity) x.P(parcel, readInt10, ClientIdentity.CREATOR);
                            break;
                    }
                }
                x.b0(parcel, F010);
                return new LocationRequest(i26, j18, j17, j16, j14, j15, i25, f10, z11, j13, i23, i24, z12, workSource, clientIdentity3);
            case 10:
                int F011 = x.F0(parcel);
                List list = LocationResult.f5727b;
                while (parcel.dataPosition() < F011) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        x.B0(parcel, readInt11);
                    } else {
                        list = x.W(parcel, readInt11, Location.CREATOR);
                    }
                }
                x.b0(parcel, F011);
                return new LocationResult(list);
            case 11:
                int F012 = x.F0(parcel);
                boolean z13 = false;
                ArrayList arrayList4 = null;
                boolean z14 = false;
                while (parcel.dataPosition() < F012) {
                    int readInt12 = parcel.readInt();
                    char c15 = (char) readInt12;
                    if (c15 == 1) {
                        arrayList4 = x.W(parcel, readInt12, LocationRequest.CREATOR);
                    } else if (c15 == 2) {
                        z13 = x.r0(parcel, readInt12);
                    } else if (c15 != 3) {
                        x.B0(parcel, readInt12);
                    } else {
                        z14 = x.r0(parcel, readInt12);
                    }
                }
                x.b0(parcel, F012);
                return new LocationSettingsRequest(arrayList4, z13, z14);
            case 12:
                int F013 = x.F0(parcel);
                Status status = null;
                LocationSettingsStates locationSettingsStates = null;
                while (parcel.dataPosition() < F013) {
                    int readInt13 = parcel.readInt();
                    char c16 = (char) readInt13;
                    if (c16 == 1) {
                        status = (Status) x.P(parcel, readInt13, Status.CREATOR);
                    } else if (c16 != 2) {
                        x.B0(parcel, readInt13);
                    } else {
                        locationSettingsStates = (LocationSettingsStates) x.P(parcel, readInt13, LocationSettingsStates.CREATOR);
                    }
                }
                x.b0(parcel, F013);
                return new LocationSettingsResult(status, locationSettingsStates);
            case 13:
                int F014 = x.F0(parcel);
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                boolean z19 = false;
                boolean z20 = false;
                while (parcel.dataPosition() < F014) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            z15 = x.r0(parcel, readInt14);
                            break;
                        case 2:
                            z16 = x.r0(parcel, readInt14);
                            break;
                        case 3:
                            z17 = x.r0(parcel, readInt14);
                            break;
                        case 4:
                            z18 = x.r0(parcel, readInt14);
                            break;
                        case 5:
                            z19 = x.r0(parcel, readInt14);
                            break;
                        case 6:
                            z20 = x.r0(parcel, readInt14);
                            break;
                        default:
                            x.B0(parcel, readInt14);
                            break;
                    }
                }
                x.b0(parcel, F014);
                return new LocationSettingsStates(z15, z16, z17, z18, z19, z20);
            case 14:
                int F015 = x.F0(parcel);
                long j19 = -1;
                long j20 = -1;
                int i27 = 1;
                int i28 = 1;
                while (parcel.dataPosition() < F015) {
                    int readInt15 = parcel.readInt();
                    char c17 = (char) readInt15;
                    if (c17 == 1) {
                        i27 = x.v0(parcel, readInt15);
                    } else if (c17 == 2) {
                        i28 = x.v0(parcel, readInt15);
                    } else if (c17 == 3) {
                        j19 = x.x0(parcel, readInt15);
                    } else if (c17 != 4) {
                        x.B0(parcel, readInt15);
                    } else {
                        j20 = x.x0(parcel, readInt15);
                    }
                }
                x.b0(parcel, F015);
                return new zzal(i27, i28, j19, j20);
            case 15:
                int F016 = x.F0(parcel);
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                boolean z21 = false;
                int i36 = 0;
                while (parcel.dataPosition() < F016) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            i29 = x.v0(parcel, readInt16);
                            break;
                        case 2:
                            i30 = x.v0(parcel, readInt16);
                            break;
                        case 3:
                            i31 = x.v0(parcel, readInt16);
                            break;
                        case 4:
                            i32 = x.v0(parcel, readInt16);
                            break;
                        case 5:
                            i33 = x.v0(parcel, readInt16);
                            break;
                        case 6:
                            i34 = x.v0(parcel, readInt16);
                            break;
                        case 7:
                            i35 = x.v0(parcel, readInt16);
                            break;
                        case '\b':
                            z21 = x.r0(parcel, readInt16);
                            break;
                        case '\t':
                            i36 = x.v0(parcel, readInt16);
                            break;
                        default:
                            x.B0(parcel, readInt16);
                            break;
                    }
                }
                x.b0(parcel, F016);
                return new SleepClassifyEvent(i29, i30, i31, i32, i33, i34, i35, z21, i36);
            case 16:
                int F017 = x.F0(parcel);
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                long j21 = 0;
                long j22 = 0;
                while (parcel.dataPosition() < F017) {
                    int readInt17 = parcel.readInt();
                    char c18 = (char) readInt17;
                    if (c18 == 1) {
                        j21 = x.x0(parcel, readInt17);
                    } else if (c18 == 2) {
                        j22 = x.x0(parcel, readInt17);
                    } else if (c18 == 3) {
                        i37 = x.v0(parcel, readInt17);
                    } else if (c18 == 4) {
                        i38 = x.v0(parcel, readInt17);
                    } else if (c18 != 5) {
                        x.B0(parcel, readInt17);
                    } else {
                        i39 = x.v0(parcel, readInt17);
                    }
                }
                x.b0(parcel, F017);
                return new SleepSegmentEvent(i37, i38, i39, j21, j22);
            case 17:
                int F018 = x.F0(parcel);
                int i40 = 0;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < F018) {
                    int readInt18 = parcel.readInt();
                    char c19 = (char) readInt18;
                    if (c19 == 1) {
                        arrayList5 = x.W(parcel, readInt18, zzas.CREATOR);
                    } else if (c19 != 2) {
                        x.B0(parcel, readInt18);
                    } else {
                        i40 = x.v0(parcel, readInt18);
                    }
                }
                x.b0(parcel, F018);
                return new SleepSegmentRequest(arrayList5, i40);
            case 18:
                int F019 = x.F0(parcel);
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                while (parcel.dataPosition() < F019) {
                    int readInt19 = parcel.readInt();
                    char c20 = (char) readInt19;
                    if (c20 == 1) {
                        i41 = x.v0(parcel, readInt19);
                    } else if (c20 == 2) {
                        i42 = x.v0(parcel, readInt19);
                    } else if (c20 == 3) {
                        i43 = x.v0(parcel, readInt19);
                    } else if (c20 != 4) {
                        x.B0(parcel, readInt19);
                    } else {
                        i44 = x.v0(parcel, readInt19);
                    }
                }
                x.b0(parcel, F019);
                return new zzas(i41, i42, i43, i44);
            case 19:
                int F020 = x.F0(parcel);
                WorkSource workSource2 = null;
                String str10 = null;
                int[] iArr = null;
                String str11 = null;
                String str12 = null;
                long j23 = 0;
                long j24 = 0;
                boolean z22 = false;
                boolean z23 = false;
                while (parcel.dataPosition() < F020) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            j23 = x.x0(parcel, readInt20);
                            break;
                        case 2:
                            z22 = x.r0(parcel, readInt20);
                            break;
                        case 3:
                            workSource2 = (WorkSource) x.P(parcel, readInt20, WorkSource.CREATOR);
                            break;
                        case 4:
                            str10 = x.S(parcel, readInt20);
                            break;
                        case 5:
                            iArr = x.O(parcel, readInt20);
                            break;
                        case 6:
                            z23 = x.r0(parcel, readInt20);
                            break;
                        case 7:
                            str11 = x.S(parcel, readInt20);
                            break;
                        case '\b':
                            j24 = x.x0(parcel, readInt20);
                            break;
                        case '\t':
                            str12 = x.S(parcel, readInt20);
                            break;
                        default:
                            x.B0(parcel, readInt20);
                            break;
                    }
                }
                x.b0(parcel, F020);
                return new zzb(j23, z22, workSource2, str10, iArr, z23, str11, j24, str12);
            case 20:
                int F021 = x.F0(parcel);
                ArrayList arrayList6 = null;
                boolean z24 = false;
                Bundle bundle = null;
                int i45 = 0;
                long j25 = 0;
                long j26 = 0;
                while (parcel.dataPosition() < F021) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        arrayList6 = x.W(parcel, readInt21, DetectedActivity.CREATOR);
                    } else if (c21 == 2) {
                        j25 = x.x0(parcel, readInt21);
                    } else if (c21 == 3) {
                        j26 = x.x0(parcel, readInt21);
                    } else if (c21 == 4) {
                        i45 = x.v0(parcel, readInt21);
                    } else if (c21 != 5) {
                        x.B0(parcel, readInt21);
                    } else {
                        bundle = x.M(parcel, readInt21);
                    }
                }
                x.b0(parcel, F021);
                ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult();
                v.a("Must have at least 1 detected activity", (arrayList6 == null || arrayList6.isEmpty()) ? false : true);
                if (j25 > 0 && j26 > 0) {
                    z24 = true;
                }
                v.a("Must set times", z24);
                activityRecognitionResult.f5666a = arrayList6;
                activityRecognitionResult.f5667b = j25;
                activityRecognitionResult.f5668c = j26;
                activityRecognitionResult.f5669d = i45;
                activityRecognitionResult.f5670e = bundle;
                return activityRecognitionResult;
            case 21:
                int F022 = x.F0(parcel);
                int i46 = 0;
                int i47 = 0;
                while (parcel.dataPosition() < F022) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 1) {
                        i46 = x.v0(parcel, readInt22);
                    } else if (c22 != 2) {
                        x.B0(parcel, readInt22);
                    } else {
                        i47 = x.v0(parcel, readInt22);
                    }
                }
                x.b0(parcel, F022);
                return new ActivityTransition(i46, i47);
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                int F023 = x.F0(parcel);
                long j27 = 0;
                int i48 = 0;
                int i49 = 0;
                while (parcel.dataPosition() < F023) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 1) {
                        i48 = x.v0(parcel, readInt23);
                    } else if (c23 == 2) {
                        i49 = x.v0(parcel, readInt23);
                    } else if (c23 != 3) {
                        x.B0(parcel, readInt23);
                    } else {
                        j27 = x.x0(parcel, readInt23);
                    }
                }
                x.b0(parcel, F023);
                return new ActivityTransitionEvent(i48, i49, j27);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                int F024 = x.F0(parcel);
                ArrayList arrayList7 = null;
                String str13 = null;
                ArrayList arrayList8 = null;
                String str14 = null;
                while (parcel.dataPosition() < F024) {
                    int readInt24 = parcel.readInt();
                    char c24 = (char) readInt24;
                    if (c24 == 1) {
                        arrayList7 = x.W(parcel, readInt24, ActivityTransition.CREATOR);
                    } else if (c24 == 2) {
                        str13 = x.S(parcel, readInt24);
                    } else if (c24 == 3) {
                        arrayList8 = x.W(parcel, readInt24, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
                    } else if (c24 != 4) {
                        x.B0(parcel, readInt24);
                    } else {
                        str14 = x.S(parcel, readInt24);
                    }
                }
                x.b0(parcel, F024);
                return new ActivityTransitionRequest(arrayList7, str13, arrayList8, str14);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                int F025 = x.F0(parcel);
                ArrayList arrayList9 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < F025) {
                    int readInt25 = parcel.readInt();
                    char c25 = (char) readInt25;
                    if (c25 == 1) {
                        arrayList9 = x.W(parcel, readInt25, ActivityTransitionEvent.CREATOR);
                    } else if (c25 != 2) {
                        x.B0(parcel, readInt25);
                    } else {
                        bundle2 = x.M(parcel, readInt25);
                    }
                }
                x.b0(parcel, F025);
                return new ActivityTransitionResult(bundle2, arrayList9);
            case C0122e9.F /* 25 */:
                int F026 = x.F0(parcel);
                WorkSource workSource3 = new WorkSource();
                ClientIdentity clientIdentity4 = null;
                int i50 = 0;
                boolean z25 = false;
                int i51 = 0;
                long j28 = Long.MAX_VALUE;
                long j29 = Long.MAX_VALUE;
                int i52 = 102;
                while (parcel.dataPosition() < F026) {
                    int readInt26 = parcel.readInt();
                    switch ((char) readInt26) {
                        case 1:
                            j28 = x.x0(parcel, readInt26);
                            break;
                        case 2:
                            i50 = x.v0(parcel, readInt26);
                            break;
                        case 3:
                            i52 = x.v0(parcel, readInt26);
                            break;
                        case 4:
                            j29 = x.x0(parcel, readInt26);
                            break;
                        case 5:
                            z25 = x.r0(parcel, readInt26);
                            break;
                        case 6:
                            workSource3 = (WorkSource) x.P(parcel, readInt26, WorkSource.CREATOR);
                            break;
                        case 7:
                            i51 = x.v0(parcel, readInt26);
                            break;
                        case '\b':
                        default:
                            x.B0(parcel, readInt26);
                            break;
                        case '\t':
                            clientIdentity4 = (ClientIdentity) x.P(parcel, readInt26, ClientIdentity.CREATOR);
                            break;
                    }
                }
                x.b0(parcel, F026);
                return new CurrentLocationRequest(j28, i50, i52, j29, z25, i51, workSource3, clientIdentity4);
            case C0122e9.G /* 26 */:
                int F027 = x.F0(parcel);
                int i53 = 0;
                int i54 = 0;
                while (parcel.dataPosition() < F027) {
                    int readInt27 = parcel.readInt();
                    char c26 = (char) readInt27;
                    if (c26 == 1) {
                        i53 = x.v0(parcel, readInt27);
                    } else if (c26 != 2) {
                        x.B0(parcel, readInt27);
                    } else {
                        i54 = x.v0(parcel, readInt27);
                    }
                }
                x.b0(parcel, F027);
                return new DetectedActivity(i53, i54);
            case C0122e9.H /* 27 */:
                int F028 = x.F0(parcel);
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = 0.0f;
                byte b10 = 0;
                long j30 = 0;
                while (true) {
                    float[] fArr = null;
                    while (parcel.dataPosition() < F028) {
                        int readInt28 = parcel.readInt();
                        char c27 = (char) readInt28;
                        if (c27 != 1) {
                            switch (c27) {
                                case 4:
                                    f11 = x.t0(parcel, readInt28);
                                    break;
                                case 5:
                                    f12 = x.t0(parcel, readInt28);
                                    break;
                                case 6:
                                    j30 = x.x0(parcel, readInt28);
                                    break;
                                case 7:
                                    x.G0(parcel, readInt28, 4);
                                    b10 = (byte) parcel.readInt();
                                    break;
                                case '\b':
                                    f13 = x.t0(parcel, readInt28);
                                    break;
                                case '\t':
                                    f14 = x.t0(parcel, readInt28);
                                    break;
                                default:
                                    x.B0(parcel, readInt28);
                                    break;
                            }
                        } else {
                            int z02 = x.z0(parcel, readInt28);
                            int dataPosition2 = parcel.dataPosition();
                            if (z02 == 0) {
                                break;
                            }
                            float[] createFloatArray = parcel.createFloatArray();
                            parcel.setDataPosition(dataPosition2 + z02);
                            fArr = createFloatArray;
                        }
                    }
                    x.b0(parcel, F028);
                    return new DeviceOrientation(fArr, f11, f12, j30, b10, f13, f14);
                    break;
                }
            case 28:
                int F029 = x.F0(parcel);
                boolean z26 = false;
                long j31 = 0;
                while (parcel.dataPosition() < F029) {
                    int readInt29 = parcel.readInt();
                    char c28 = (char) readInt29;
                    if (c28 == 2) {
                        j31 = x.x0(parcel, readInt29);
                    } else if (c28 != 6) {
                        x.B0(parcel, readInt29);
                    } else {
                        z26 = x.r0(parcel, readInt29);
                    }
                }
                x.b0(parcel, F029);
                return new DeviceOrientationRequest(z26, j31);
            default:
                int F030 = x.F0(parcel);
                ArrayList arrayList10 = null;
                int i55 = 0;
                String str15 = null;
                while (parcel.dataPosition() < F030) {
                    int readInt30 = parcel.readInt();
                    char c29 = (char) readInt30;
                    if (c29 == 1) {
                        arrayList10 = x.W(parcel, readInt30, zzek.CREATOR);
                    } else if (c29 == 2) {
                        i55 = x.v0(parcel, readInt30);
                    } else if (c29 != 4) {
                        x.B0(parcel, readInt30);
                    } else {
                        str15 = x.S(parcel, readInt30);
                    }
                }
                x.b0(parcel, F030);
                return new GeofencingRequest(i55, str15, arrayList10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f20859a) {
            case 0:
                return new zac[i5];
            case 1:
                return new zam[i5];
            case 2:
                return new zan[i5];
            case 3:
                return new zal[i5];
            case 4:
                return new SafeParcelResponse[i5];
            case 5:
                return new WakeLockEvent[i5];
            case 6:
                return new LastLocationRequest[i5];
            case 7:
                return new LocationAvailability[i5];
            case 8:
                return new zzad[i5];
            case 9:
                return new LocationRequest[i5];
            case 10:
                return new LocationResult[i5];
            case 11:
                return new LocationSettingsRequest[i5];
            case 12:
                return new LocationSettingsResult[i5];
            case 13:
                return new LocationSettingsStates[i5];
            case 14:
                return new zzal[i5];
            case 15:
                return new SleepClassifyEvent[i5];
            case 16:
                return new SleepSegmentEvent[i5];
            case 17:
                return new SleepSegmentRequest[i5];
            case 18:
                return new zzas[i5];
            case 19:
                return new zzb[i5];
            case 20:
                return new ActivityRecognitionResult[i5];
            case 21:
                return new ActivityTransition[i5];
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new ActivityTransitionEvent[i5];
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new ActivityTransitionRequest[i5];
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new ActivityTransitionResult[i5];
            case C0122e9.F /* 25 */:
                return new CurrentLocationRequest[i5];
            case C0122e9.G /* 26 */:
                return new DetectedActivity[i5];
            case C0122e9.H /* 27 */:
                return new DeviceOrientation[i5];
            case 28:
                return new DeviceOrientationRequest[i5];
            default:
                return new GeofencingRequest[i5];
        }
    }
}
