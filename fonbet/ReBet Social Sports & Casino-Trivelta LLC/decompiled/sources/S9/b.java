package S9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        byte[] bArr = null;
        ArrayList arrayList = null;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 == 2) {
                bArr = E9.a.g(parcel, E10);
            } else if (w10 == 3) {
                str = E9.a.q(parcel, E10);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                arrayList = E9.a.u(parcel, E10, Transport.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new KeyHandle(i10, bArr, str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new KeyHandle[i10];
    }
}
