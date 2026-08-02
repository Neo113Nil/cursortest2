package D9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;

/* renamed from: D9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1135c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            if (E9.a.w(E10) != 1) {
                E9.a.M(parcel, E10);
            } else {
                intent = (Intent) E9.a.p(parcel, E10, Intent.CREATOR);
            }
        }
        E9.a.v(parcel, N10);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CloudMessage[i10];
    }
}
