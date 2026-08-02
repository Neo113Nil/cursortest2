package m7;

import android.os.Parcel;
import com.google.android.gms.libs.identity.zzl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q extends com.google.android.gms.internal.play_billing.e implements r {
    public q() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 7);
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean T(Parcel parcel, int i5) {
        if (i5 != 1) {
            if (i5 != 2) {
                return false;
            }
            c();
            return true;
        }
        zzl zzlVar = (zzl) c.a(parcel, zzl.CREATOR);
        c.b(parcel);
        p(zzlVar);
        return true;
    }
}
