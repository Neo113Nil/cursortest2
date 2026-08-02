package R9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

/* loaded from: classes2.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) E9.a.p(parcel, E10, PublicKeyCredentialRequestOptions.CREATOR);
            } else if (w10 == 3) {
                uri = (Uri) E9.a.p(parcel, E10, Uri.CREATOR);
            } else if (w10 != 4) {
                E9.a.M(parcel, E10);
            } else {
                bArr = E9.a.g(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BrowserPublicKeyCredentialRequestOptions[i10];
    }
}
