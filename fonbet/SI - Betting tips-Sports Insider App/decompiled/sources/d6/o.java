package d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import f3.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {

    /* renamed from: b, reason: collision with root package name */
    public static final o f8262b = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8263a;

    public /* synthetic */ o(int i5) {
        this.f8263a = i5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8263a) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(dataPosition - 4);
                    return ApiMetadata.f4449d;
                }
                int F0 = x.F0(parcel);
                boolean z5 = false;
                ComplianceOptions complianceOptions = null;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 == 1) {
                        complianceOptions = (ComplianceOptions) x.P(parcel, readInt, ComplianceOptions.CREATOR);
                    } else if (c2 != 2) {
                        x.B0(parcel, readInt);
                    } else {
                        z5 = x.r0(parcel, readInt);
                    }
                }
                x.b0(parcel, F0);
                return new ApiMetadata(complianceOptions, z5);
            case 1:
                int F02 = x.F0(parcel);
                int i5 = 0;
                boolean z7 = true;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < F02) {
                    int readInt2 = parcel.readInt();
                    char c8 = (char) readInt2;
                    if (c8 == 1) {
                        i5 = x.v0(parcel, readInt2);
                    } else if (c8 == 2) {
                        i10 = x.v0(parcel, readInt2);
                    } else if (c8 == 3) {
                        i11 = x.v0(parcel, readInt2);
                    } else if (c8 != 4) {
                        x.B0(parcel, readInt2);
                    } else {
                        z7 = x.r0(parcel, readInt2);
                    }
                }
                x.b0(parcel, F02);
                return new ComplianceOptions(i5, i10, i11, z7);
            case 2:
                int F03 = x.F0(parcel);
                String str = null;
                int i12 = 0;
                while (parcel.dataPosition() < F03) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 == 1) {
                        i12 = x.v0(parcel, readInt3);
                    } else if (c10 != 2) {
                        x.B0(parcel, readInt3);
                    } else {
                        str = x.S(parcel, readInt3);
                    }
                }
                x.b0(parcel, F03);
                return new Scope(i12, str);
            default:
                int F04 = x.F0(parcel);
                String str2 = null;
                ConnectionResult connectionResult = null;
                int i13 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < F04) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 == 1) {
                        i13 = x.v0(parcel, readInt4);
                    } else if (c11 == 2) {
                        str2 = x.S(parcel, readInt4);
                    } else if (c11 == 3) {
                        pendingIntent = (PendingIntent) x.P(parcel, readInt4, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        x.B0(parcel, readInt4);
                    } else {
                        connectionResult = (ConnectionResult) x.P(parcel, readInt4, ConnectionResult.CREATOR);
                    }
                }
                x.b0(parcel, F04);
                return new Status(i13, str2, pendingIntent, connectionResult);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f8263a) {
            case 0:
                return new ApiMetadata[i5];
            case 1:
                return new ComplianceOptions[i5];
            case 2:
                return new Scope[i5];
            default:
                return new Status[i5];
        }
    }
}
