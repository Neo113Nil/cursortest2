package R9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;

/* loaded from: classes2.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                bArr = E9.a.g(parcel, E10);
            } else if (w10 == 3) {
                bArr2 = E9.a.g(parcel, E10);
            } else if (w10 == 4) {
                bArr3 = E9.a.g(parcel, E10);
            } else if (w10 == 5) {
                bArr4 = E9.a.g(parcel, E10);
            } else if (w10 != 6) {
                E9.a.M(parcel, E10);
            } else {
                bArr5 = E9.a.g(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new AuthenticatorAssertionResponse(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthenticatorAssertionResponse[i10];
    }
}
