package B9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                pendingIntent = (PendingIntent) E9.a.p(parcel, E10, PendingIntent.CREATOR);
            } else if (w10 == 3) {
                i12 = E9.a.G(parcel, E10);
            } else if (w10 == 4) {
                bundle = E9.a.f(parcel, E10);
            } else if (w10 == 5) {
                bArr = E9.a.g(parcel, E10);
            } else if (w10 != 1000) {
                E9.a.M(parcel, E10);
            } else {
                i10 = E9.a.G(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new ProxyResponse(i10, i11, pendingIntent, i12, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProxyResponse[i10];
    }
}
