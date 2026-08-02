package H9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        StringToIntConverter stringToIntConverter = null;
        int i10 = 0;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 1) {
                i10 = E9.a.G(parcel, E10);
            } else if (w10 != 2) {
                E9.a.M(parcel, E10);
            } else {
                stringToIntConverter = (StringToIntConverter) E9.a.p(parcel, E10, StringToIntConverter.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new zaa(i10, stringToIntConverter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zaa[i10];
    }
}
