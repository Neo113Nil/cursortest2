package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import f3.x;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int F0 = x.F0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str4 = null;
        boolean z5 = false;
        boolean z7 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < F0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z5 = x.r0(parcel, readInt);
                    break;
                case 2:
                    str = x.S(parcel, readInt);
                    break;
                case 3:
                    str2 = x.S(parcel, readInt);
                    break;
                case 4:
                    z7 = x.r0(parcel, readInt);
                    break;
                case 5:
                    str3 = x.S(parcel, readInt);
                    break;
                case 6:
                    arrayList = x.U(parcel, readInt);
                    break;
                case 7:
                    z10 = x.r0(parcel, readInt);
                    break;
                case '\b':
                    arrayList2 = x.W(parcel, readInt, zbf.CREATOR);
                    break;
                case '\t':
                    str4 = x.S(parcel, readInt);
                    break;
                default:
                    x.B0(parcel, readInt);
                    break;
            }
        }
        x.b0(parcel, F0);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z5, str, str2, z7, str3, arrayList, z10, arrayList2, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i5];
    }
}
