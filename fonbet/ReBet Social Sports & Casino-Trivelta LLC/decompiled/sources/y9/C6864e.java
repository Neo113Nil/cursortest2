package y9;

import E9.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import java.util.HashSet;

/* renamed from: y9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6864e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    hashSet.add(1);
                    break;
                case 2:
                    str = E9.a.q(parcel, E10);
                    hashSet.add(2);
                    break;
                case 3:
                    i11 = E9.a.G(parcel, E10);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = E9.a.g(parcel, E10);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) E9.a.p(parcel, E10, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) E9.a.p(parcel, E10, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        if (parcel.dataPosition() == N10) {
            return new zzw(hashSet, i10, str, i11, bArr, pendingIntent, deviceMetaData);
        }
        throw new a.C0068a("Overread allowed size end=" + N10, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzw[i10];
    }
}
