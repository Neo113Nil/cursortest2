package Y9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;

/* loaded from: classes2.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        double d10 = 0.0d;
        StrokeStyle strokeStyle = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            int w10 = E9.a.w(E10);
            if (w10 == 2) {
                strokeStyle = (StrokeStyle) E9.a.p(parcel, E10, StrokeStyle.CREATOR);
            } else if (w10 != 3) {
                E9.a.M(parcel, E10);
            } else {
                d10 = E9.a.A(parcel, E10);
            }
        }
        E9.a.v(parcel, N10);
        return new StyleSpan(strokeStyle, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StyleSpan[i10];
    }
}
