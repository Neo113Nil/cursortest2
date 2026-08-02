package R9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* renamed from: R9.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1558i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d10 = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) E9.a.p(parcel, E10, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) E9.a.p(parcel, E10, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = E9.a.g(parcel, E10);
                    break;
                case 5:
                    arrayList = E9.a.u(parcel, E10, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d10 = E9.a.B(parcel, E10);
                    break;
                case 7:
                    arrayList2 = E9.a.u(parcel, E10, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) E9.a.p(parcel, E10, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    num = E9.a.H(parcel, E10);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) E9.a.p(parcel, E10, TokenBinding.CREATOR);
                    break;
                case 11:
                    str = E9.a.q(parcel, E10);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) E9.a.p(parcel, E10, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d10, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PublicKeyCredentialCreationOptions[i10];
    }
}
