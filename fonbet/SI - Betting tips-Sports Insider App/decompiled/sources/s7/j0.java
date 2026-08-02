package s7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends g6.e {
    @Override // g6.e, d6.c
    public final int a() {
        return 12451000;
    }

    @Override // g6.e
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof a0 ? (a0) queryLocalInterface : new y(iBinder);
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.measurement.START";
    }
}
