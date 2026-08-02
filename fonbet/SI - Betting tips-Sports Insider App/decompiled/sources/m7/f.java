package m7;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.y3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w7.g f20456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w7.g gVar) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", 7);
        this.f20456f = gVar;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean T(Parcel parcel, int i5) {
        if (i5 != 1) {
            return false;
        }
        Status status = (Status) c.a(parcel, Status.CREATOR);
        Location location = (Location) c.a(parcel, Location.CREATOR);
        c.b(parcel);
        y3.y(status, location, this.f20456f);
        return true;
    }
}
