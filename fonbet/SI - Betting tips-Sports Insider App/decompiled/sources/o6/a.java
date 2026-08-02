package o6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import f3.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int F0 = x.F0(parcel);
        String str = null;
        String str2 = null;
        zaa zaaVar = null;
        int i5 = 0;
        int i10 = 0;
        boolean z5 = false;
        int i11 = 0;
        boolean z7 = false;
        int i12 = 0;
        while (parcel.dataPosition() < F0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i5 = x.v0(parcel, readInt);
                    break;
                case 2:
                    i10 = x.v0(parcel, readInt);
                    break;
                case 3:
                    z5 = x.r0(parcel, readInt);
                    break;
                case 4:
                    i11 = x.v0(parcel, readInt);
                    break;
                case 5:
                    z7 = x.r0(parcel, readInt);
                    break;
                case 6:
                    str = x.S(parcel, readInt);
                    break;
                case 7:
                    i12 = x.v0(parcel, readInt);
                    break;
                case '\b':
                    str2 = x.S(parcel, readInt);
                    break;
                case '\t':
                    zaaVar = (zaa) x.P(parcel, readInt, zaa.CREATOR);
                    break;
                default:
                    x.B0(parcel, readInt);
                    break;
            }
        }
        x.b0(parcel, F0);
        return new FastJsonResponse$Field(i5, i10, z5, i11, z7, str, i12, str2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new FastJsonResponse$Field[i5];
    }
}
