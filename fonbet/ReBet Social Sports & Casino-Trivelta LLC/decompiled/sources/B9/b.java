package B9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j10 = 0;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                str = E9.a.q(parcel, E10);
            } else if (w10 == 2) {
                i11 = E9.a.G(parcel, E10);
            } else if (w10 == 3) {
                j10 = E9.a.I(parcel, E10);
            } else if (w10 == 4) {
                bArr = E9.a.g(parcel, E10);
            } else if (w10 == 5) {
                bundle = E9.a.f(parcel, E10);
            } else if (w10 != 1000) {
                E9.a.M(parcel, E10);
            } else {
                i10 = E9.a.G(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new ProxyRequest(i10, str, i11, j10, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ProxyRequest[i10];
    }
}
