package e6;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f extends com.google.android.gms.internal.play_billing.e implements g {
    public f() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 4);
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean Q(int i5, Parcel parcel, Parcel parcel2) {
        if (i5 != 1) {
            return false;
        }
        Status status = (Status) h7.a.a(parcel, Status.CREATOR);
        h7.a.b(parcel);
        l(status);
        return true;
    }
}
