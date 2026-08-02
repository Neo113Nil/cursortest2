package R9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;

/* loaded from: classes2.dex */
public final class E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) E9.a.p(parcel, E10, PublicKeyCredentialCreationOptions.CREATOR);
            } else if (w10 == 3) {
                uri = (Uri) E9.a.p(parcel, E10, Uri.CREATOR);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                bArr = E9.a.g(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BrowserPublicKeyCredentialCreationOptions[i10];
    }
}
