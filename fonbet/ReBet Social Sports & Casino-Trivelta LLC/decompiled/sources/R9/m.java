package R9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        byte[] bArr = null;
        Double d10 = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long l10 = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    bArr = E9.a.g(parcel, E10);
                    break;
                case 3:
                    d10 = E9.a.B(parcel, E10);
                    break;
                case 4:
                    str = E9.a.q(parcel, E10);
                    break;
                case 5:
                    arrayList = E9.a.u(parcel, E10, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    num = E9.a.H(parcel, E10);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) E9.a.p(parcel, E10, TokenBinding.CREATOR);
                    break;
                case 8:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    authenticationExtensions = (AuthenticationExtensions) E9.a.p(parcel, E10, AuthenticationExtensions.CREATOR);
                    break;
                case 10:
                    l10 = E9.a.J(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new PublicKeyCredentialRequestOptions(bArr, d10, str, arrayList, num, tokenBinding, str2, authenticationExtensions, l10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialRequestOptions[i10];
    }
}
