package b6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import f3.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3041a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3041a) {
            case 0:
                int F0 = x.F0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < F0) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        x.B0(parcel, readInt);
                    } else {
                        intent = (Intent) x.P(parcel, readInt, Intent.CREATOR);
                    }
                }
                x.b0(parcel, F0);
                return new CloudMessage(intent);
            default:
                return new zzd(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        switch (this.f3041a) {
            case 0:
                return new CloudMessage[i5];
            default:
                return new zzd[i5];
        }
    }
}
