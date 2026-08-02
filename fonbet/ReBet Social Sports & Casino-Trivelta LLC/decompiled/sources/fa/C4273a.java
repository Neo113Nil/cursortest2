package fa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.button.zzc;

/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4273a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    str = E9.a.q(parcel, E10);
                    break;
                case 2:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 4:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 5:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    str4 = E9.a.q(parcel, E10);
                    break;
                case 7:
                    str5 = E9.a.q(parcel, E10);
                    break;
                case 8:
                    str6 = E9.a.q(parcel, E10);
                    break;
                case 9:
                    str7 = E9.a.q(parcel, E10);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new zzc(str, i10, z10, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzc[i10];
    }
}
