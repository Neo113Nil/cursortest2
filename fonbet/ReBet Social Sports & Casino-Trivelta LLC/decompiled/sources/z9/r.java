package z9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* loaded from: classes2.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    str = E9.a.q(parcel, E10);
                    break;
                case 2:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    str4 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    uri = (Uri) E9.a.p(parcel, E10, Uri.CREATOR);
                    break;
                case 6:
                    str5 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str6 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    str7 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) E9.a.p(parcel, E10, PublicKeyCredential.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new SignInCredential(str, str2, str3, str4, uri, str5, str6, str7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInCredential[i10];
    }
}
