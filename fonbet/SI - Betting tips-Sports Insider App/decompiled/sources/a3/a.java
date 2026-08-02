package a3;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;
import com.google.android.gms.identitycredentials.ClearRegistryRequest;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationRequest;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.auth.zzbw;
import com.google.firebase.messaging.RemoteMessage;
import f3.x;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66a;

    public /* synthetic */ a(int i5) {
        this.f66a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z5 = false;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z7 = false;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Bundle bundle = null;
        Uri uri = null;
        String str8 = null;
        c.b bVar = null;
        PendingIntent pendingIntent = null;
        PendingIntent pendingIntent2 = null;
        Credential credential = null;
        ArrayList arrayList = null;
        switch (this.f66a) {
            case 0:
                return new ParcelImpl(parcel);
            case 1:
                int F0 = x.F0(parcel);
                while (parcel.dataPosition() < F0) {
                    x.B0(parcel, parcel.readInt());
                }
                x.b0(parcel, F0);
                return new ClearRegistryRequest();
            case 2:
                int F02 = x.F0(parcel);
                while (parcel.dataPosition() < F02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        x.B0(parcel, readInt);
                    } else {
                        z5 = x.r0(parcel, readInt);
                    }
                }
                x.b0(parcel, F02);
                return new ClearRegistryResponse(z5);
            case 3:
                int F03 = x.F0(parcel);
                Bundle bundle2 = null;
                while (parcel.dataPosition() < F03) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        str = x.S(parcel, readInt2);
                    } else if (c2 != 2) {
                        x.B0(parcel, readInt2);
                    } else {
                        bundle2 = x.M(parcel, readInt2);
                    }
                }
                x.b0(parcel, F03);
                return new Credential(bundle2, str);
            case 4:
                int F04 = x.F0(parcel);
                String str9 = "";
                String str10 = str9;
                String str11 = str10;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                String str12 = null;
                while (parcel.dataPosition() < F04) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            str9 = x.S(parcel, readInt3);
                            break;
                        case 2:
                            bundle3 = x.M(parcel, readInt3);
                            break;
                        case 3:
                            bundle4 = x.M(parcel, readInt3);
                            break;
                        case 4:
                            str12 = x.S(parcel, readInt3);
                            break;
                        case 5:
                            str10 = x.S(parcel, readInt3);
                            break;
                        case 6:
                            str11 = x.S(parcel, readInt3);
                            break;
                        default:
                            x.B0(parcel, readInt3);
                            break;
                    }
                }
                x.b0(parcel, F04);
                return new CredentialOption(str9, bundle3, bundle4, str12, str10, str11);
            case 5:
                int F05 = x.F0(parcel);
                Bundle bundle5 = null;
                String str13 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < F05) {
                    int readInt4 = parcel.readInt();
                    char c8 = (char) readInt4;
                    if (c8 == 1) {
                        arrayList = x.W(parcel, readInt4, CredentialOption.CREATOR);
                    } else if (c8 == 2) {
                        bundle5 = x.M(parcel, readInt4);
                    } else if (c8 == 3) {
                        str13 = x.S(parcel, readInt4);
                    } else if (c8 != 4) {
                        x.B0(parcel, readInt4);
                    } else {
                        resultReceiver = (ResultReceiver) x.P(parcel, readInt4, ResultReceiver.CREATOR);
                    }
                }
                x.b0(parcel, F05);
                return new GetCredentialRequest(arrayList, bundle5, str13, resultReceiver);
            case 6:
                int F06 = x.F0(parcel);
                while (parcel.dataPosition() < F06) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        x.B0(parcel, readInt5);
                    } else {
                        credential = (Credential) x.P(parcel, readInt5, Credential.CREATOR);
                    }
                }
                x.b0(parcel, F06);
                return new GetCredentialResponse(credential);
            case 7:
                int F07 = x.F0(parcel);
                while (parcel.dataPosition() < F07) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        x.B0(parcel, readInt6);
                    } else {
                        pendingIntent2 = (PendingIntent) x.P(parcel, readInt6, PendingIntent.CREATOR);
                    }
                }
                x.b0(parcel, F07);
                return new PendingGetCredentialHandle(pendingIntent2);
            case 8:
                int F08 = x.F0(parcel);
                while (parcel.dataPosition() < F08) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 1) {
                        x.B0(parcel, readInt7);
                    } else {
                        pendingIntent = (PendingIntent) x.P(parcel, readInt7, PendingIntent.CREATOR);
                    }
                }
                x.b0(parcel, F08);
                return new PendingImportCredentialsHandle(pendingIntent);
            case 9:
                int F09 = x.F0(parcel);
                while (parcel.dataPosition() < F09) {
                    x.B0(parcel, parcel.readInt());
                }
                x.b0(parcel, F09);
                return new RegisterExportResponse();
            case 10:
                int F010 = x.F0(parcel);
                String str14 = "";
                String str15 = str14;
                List list = Collections.EMPTY_LIST;
                byte[] bArr = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < F010) {
                    int readInt8 = parcel.readInt();
                    char c10 = (char) readInt8;
                    if (c10 == 1) {
                        bArr = x.N(parcel, readInt8);
                    } else if (c10 == 2) {
                        bArr2 = x.N(parcel, readInt8);
                    } else if (c10 == 3) {
                        str14 = x.S(parcel, readInt8);
                    } else if (c10 == 4) {
                        str15 = x.S(parcel, readInt8);
                    } else if (c10 != 5) {
                        x.B0(parcel, readInt8);
                    } else {
                        list = x.U(parcel, readInt8);
                    }
                }
                x.b0(parcel, F010);
                return new RegistrationRequest(bArr, bArr2, str14, str15, list);
            case 11:
                int F011 = x.F0(parcel);
                while (parcel.dataPosition() < F011) {
                    x.B0(parcel, parcel.readInt());
                }
                x.b0(parcel, F011);
                return new RegistrationResponse();
            case 12:
                android.support.v4.os.ResultReceiver resultReceiver2 = new android.support.v4.os.ResultReceiver();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i13 = c.c.f3229f;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(c.b.f3228c);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.f3227a = readStrongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) queryLocalInterface;
                    }
                }
                resultReceiver2.f193a = bVar;
                return resultReceiver2;
            case 13:
                int F012 = x.F0(parcel);
                int i14 = 0;
                int i15 = 0;
                PendingIntent pendingIntent3 = null;
                String str16 = null;
                Integer num = null;
                while (parcel.dataPosition() < F012) {
                    int readInt9 = parcel.readInt();
                    char c11 = (char) readInt9;
                    if (c11 == 1) {
                        i14 = x.v0(parcel, readInt9);
                    } else if (c11 == 2) {
                        i15 = x.v0(parcel, readInt9);
                    } else if (c11 == 3) {
                        pendingIntent3 = (PendingIntent) x.P(parcel, readInt9, PendingIntent.CREATOR);
                    } else if (c11 == 4) {
                        str16 = x.S(parcel, readInt9);
                    } else if (c11 != 5) {
                        x.B0(parcel, readInt9);
                    } else {
                        num = x.w0(parcel, readInt9);
                    }
                }
                x.b0(parcel, F012);
                return new ConnectionResult(i14, i15, pendingIntent3, str16, num);
            case 14:
                int F013 = x.F0(parcel);
                long j = -1;
                int i16 = 0;
                boolean z10 = false;
                String str17 = null;
                while (parcel.dataPosition() < F013) {
                    int readInt10 = parcel.readInt();
                    char c12 = (char) readInt10;
                    if (c12 == 1) {
                        str17 = x.S(parcel, readInt10);
                    } else if (c12 == 2) {
                        i16 = x.v0(parcel, readInt10);
                    } else if (c12 == 3) {
                        j = x.x0(parcel, readInt10);
                    } else if (c12 != 4) {
                        x.B0(parcel, readInt10);
                    } else {
                        z10 = x.r0(parcel, readInt10);
                    }
                }
                x.b0(parcel, F013);
                return new Feature(str17, i16, j, z10);
            case 15:
                int F014 = x.F0(parcel);
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                String str18 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < F014) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str18 = x.S(parcel, readInt11);
                            break;
                        case 2:
                            z11 = x.r0(parcel, readInt11);
                            break;
                        case 3:
                            z12 = x.r0(parcel, readInt11);
                            break;
                        case 4:
                            iBinder = x.u0(parcel, readInt11);
                            break;
                        case 5:
                            z13 = x.r0(parcel, readInt11);
                            break;
                        case 6:
                            z14 = x.r0(parcel, readInt11);
                            break;
                        case 7:
                        default:
                            x.B0(parcel, readInt11);
                            break;
                        case '\b':
                            z15 = x.r0(parcel, readInt11);
                            break;
                    }
                }
                x.b0(parcel, F014);
                return new zzp(str18, z11, z12, iBinder, z13, z14, z15);
            case 16:
                int F015 = x.F0(parcel);
                long j6 = -1;
                int i17 = 0;
                int i18 = 0;
                boolean z16 = false;
                String str19 = null;
                while (parcel.dataPosition() < F015) {
                    int readInt12 = parcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 == 1) {
                        z16 = x.r0(parcel, readInt12);
                    } else if (c13 == 2) {
                        str19 = x.S(parcel, readInt12);
                    } else if (c13 == 3) {
                        i17 = x.v0(parcel, readInt12);
                    } else if (c13 == 4) {
                        i18 = x.v0(parcel, readInt12);
                    } else if (c13 != 5) {
                        x.B0(parcel, readInt12);
                    } else {
                        j6 = x.x0(parcel, readInt12);
                    }
                }
                x.b0(parcel, F015);
                return new zzr(i17, i18, j6, str19, z16);
            case 17:
                int F016 = x.F0(parcel);
                boolean z17 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < F016) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 1) {
                        str8 = x.S(parcel, readInt13);
                    } else if (c14 == 2) {
                        iBinder2 = x.u0(parcel, readInt13);
                    } else if (c14 == 3) {
                        z7 = x.r0(parcel, readInt13);
                    } else if (c14 != 4) {
                        x.B0(parcel, readInt13);
                    } else {
                        z17 = x.r0(parcel, readInt13);
                    }
                }
                x.b0(parcel, F016);
                return new zzt(str8, iBinder2, z7, z17);
            case 18:
                int F017 = x.F0(parcel);
                int i19 = 0;
                int i20 = 0;
                while (parcel.dataPosition() < F017) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 1) {
                        i12 = x.v0(parcel, readInt14);
                    } else if (c15 == 2) {
                        uri = (Uri) x.P(parcel, readInt14, Uri.CREATOR);
                    } else if (c15 == 3) {
                        i19 = x.v0(parcel, readInt14);
                    } else if (c15 != 4) {
                        x.B0(parcel, readInt14);
                    } else {
                        i20 = x.v0(parcel, readInt14);
                    }
                }
                x.b0(parcel, F017);
                return new WebImage(i12, uri, i19, i20);
            case 19:
                int F018 = x.F0(parcel);
                while (parcel.dataPosition() < F018) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 2) {
                        x.B0(parcel, readInt15);
                    } else {
                        bundle = x.M(parcel, readInt15);
                    }
                }
                x.b0(parcel, F018);
                return new RemoteMessage(bundle);
            case 20:
                int F019 = x.F0(parcel);
                while (parcel.dataPosition() < F019) {
                    int readInt16 = parcel.readInt();
                    char c16 = (char) readInt16;
                    if (c16 == 1) {
                        x.v0(parcel, readInt16);
                    } else if (c16 != 2) {
                        x.B0(parcel, readInt16);
                    } else {
                        str7 = x.S(parcel, readInt16);
                    }
                }
                x.b0(parcel, F019);
                return new zzaq(str7);
            case 21:
                int F020 = x.F0(parcel);
                while (parcel.dataPosition() < F020) {
                    int readInt17 = parcel.readInt();
                    char c17 = (char) readInt17;
                    if (c17 == 1) {
                        x.v0(parcel, readInt17);
                    } else if (c17 == 2) {
                        str6 = x.S(parcel, readInt17);
                    } else if (c17 != 3) {
                        x.B0(parcel, readInt17);
                    } else {
                        i11 = x.v0(parcel, readInt17);
                    }
                }
                x.b0(parcel, F020);
                return new zzav(str6, i11);
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                int F021 = x.F0(parcel);
                while (parcel.dataPosition() < F021) {
                    int readInt18 = parcel.readInt();
                    char c18 = (char) readInt18;
                    if (c18 == 1) {
                        x.v0(parcel, readInt18);
                    } else if (c18 != 2) {
                        x.B0(parcel, readInt18);
                    } else {
                        str5 = x.S(parcel, readInt18);
                    }
                }
                x.b0(parcel, F021);
                return new zzax(str5);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                int F022 = x.F0(parcel);
                byte[] bArr3 = null;
                while (parcel.dataPosition() < F022) {
                    int readInt19 = parcel.readInt();
                    char c19 = (char) readInt19;
                    if (c19 == 1) {
                        x.v0(parcel, readInt19);
                    } else if (c19 == 2) {
                        str4 = x.S(parcel, readInt19);
                    } else if (c19 != 3) {
                        x.B0(parcel, readInt19);
                    } else {
                        bArr3 = x.N(parcel, readInt19);
                    }
                }
                x.b0(parcel, F022);
                return new zzaz(str4, bArr3);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                int F023 = x.F0(parcel);
                PendingIntent pendingIntent4 = null;
                while (parcel.dataPosition() < F023) {
                    int readInt20 = parcel.readInt();
                    char c20 = (char) readInt20;
                    if (c20 == 1) {
                        x.v0(parcel, readInt20);
                    } else if (c20 == 2) {
                        str3 = x.S(parcel, readInt20);
                    } else if (c20 != 3) {
                        x.B0(parcel, readInt20);
                    } else {
                        pendingIntent4 = (PendingIntent) x.P(parcel, readInt20, PendingIntent.CREATOR);
                    }
                }
                x.b0(parcel, F023);
                return new zzbb(str3, pendingIntent4);
            case C0122e9.F /* 25 */:
                int F024 = x.F0(parcel);
                while (parcel.dataPosition() < F024) {
                    int readInt21 = parcel.readInt();
                    char c21 = (char) readInt21;
                    if (c21 == 1) {
                        i10 = x.v0(parcel, readInt21);
                    } else if (c21 != 2) {
                        x.B0(parcel, readInt21);
                    } else {
                        str2 = x.S(parcel, readInt21);
                    }
                }
                x.b0(parcel, F024);
                return new zzbw(i10, str2);
            case C0122e9.G /* 26 */:
                int F025 = x.F0(parcel);
                int i21 = 0;
                while (parcel.dataPosition() < F025) {
                    int readInt22 = parcel.readInt();
                    char c22 = (char) readInt22;
                    if (c22 == 1) {
                        i5 = x.v0(parcel, readInt22);
                    } else if (c22 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) x.P(parcel, readInt22, ParcelFileDescriptor.CREATOR);
                    } else if (c22 != 3) {
                        x.B0(parcel, readInt22);
                    } else {
                        i21 = x.v0(parcel, readInt22);
                    }
                }
                x.b0(parcel, F025);
                return new BitmapTeleporter(i5, parcelFileDescriptor, i21);
            case C0122e9.H /* 27 */:
                int F026 = x.F0(parcel);
                int i22 = 0;
                int i23 = 0;
                String[] strArr = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundle6 = null;
                while (parcel.dataPosition() < F026) {
                    int readInt23 = parcel.readInt();
                    char c23 = (char) readInt23;
                    if (c23 == 1) {
                        strArr = x.T(parcel, readInt23);
                    } else if (c23 == 2) {
                        cursorWindowArr = (CursorWindow[]) x.V(parcel, readInt23, CursorWindow.CREATOR);
                    } else if (c23 == 3) {
                        i23 = x.v0(parcel, readInt23);
                    } else if (c23 == 4) {
                        bundle6 = x.M(parcel, readInt23);
                    } else if (c23 != 1000) {
                        x.B0(parcel, readInt23);
                    } else {
                        i22 = x.v0(parcel, readInt23);
                    }
                }
                x.b0(parcel, F026);
                DataHolder dataHolder = new DataHolder(i22, strArr, cursorWindowArr, i23, bundle6);
                dataHolder.f4484c = new Bundle();
                int i24 = 0;
                while (true) {
                    String[] strArr2 = dataHolder.f4483b;
                    if (i24 >= strArr2.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.f4485d;
                        dataHolder.f4488g = new int[cursorWindowArr2.length];
                        int i25 = 0;
                        for (int i26 = 0; i26 < cursorWindowArr2.length; i26++) {
                            dataHolder.f4488g[i26] = i25;
                            i25 += cursorWindowArr2[i26].getNumRows() - (i25 - cursorWindowArr2[i26].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.f4484c.putInt(strArr2[i24], i24);
                    i24++;
                }
            case 28:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivityResult(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            default:
                Intrinsics.checkNotNullParameter(parcel, "inParcel");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                return new IntentSenderRequest((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i5) {
        switch (this.f66a) {
            case 0:
                return new ParcelImpl[i5];
            case 1:
                return new ClearRegistryRequest[i5];
            case 2:
                return new ClearRegistryResponse[i5];
            case 3:
                return new Credential[i5];
            case 4:
                return new CredentialOption[i5];
            case 5:
                return new GetCredentialRequest[i5];
            case 6:
                return new GetCredentialResponse[i5];
            case 7:
                return new PendingGetCredentialHandle[i5];
            case 8:
                return new PendingImportCredentialsHandle[i5];
            case 9:
                return new RegisterExportResponse[i5];
            case 10:
                return new RegistrationRequest[i5];
            case 11:
                return new RegistrationResponse[i5];
            case 12:
                return new android.support.v4.os.ResultReceiver[i5];
            case 13:
                return new ConnectionResult[i5];
            case 14:
                return new Feature[i5];
            case 15:
                return new zzp[i5];
            case 16:
                return new zzr[i5];
            case 17:
                return new zzt[i5];
            case 18:
                return new WebImage[i5];
            case 19:
                return new RemoteMessage[i5];
            case 20:
                return new zzaq[i5];
            case 21:
                return new zzav[i5];
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new zzax[i5];
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new zzaz[i5];
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new zzbb[i5];
            case C0122e9.F /* 25 */:
                return new zzbw[i5];
            case C0122e9.G /* 26 */:
                return new BitmapTeleporter[i5];
            case C0122e9.H /* 27 */:
                return new DataHolder[i5];
            case 28:
                return new ActivityResult[i5];
            default:
                return new IntentSenderRequest[i5];
        }
    }
}
