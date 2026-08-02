package m7;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends com.google.android.gms.internal.play_billing.e implements p7.j {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f20458g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final g4 f20459f;

    public h(g4 g4Var) {
        super("com.google.android.gms.location.ILocationCallback", 7);
        this.f20459f = g4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean T(Parcel parcel, int i5) {
        g4 g4Var = this.f20459f;
        if (i5 == 1) {
            LocationResult locationResult = (LocationResult) c.a(parcel, LocationResult.CREATOR);
            c.b(parcel);
            g4Var.c().b(new i2.d(19, locationResult));
            return true;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                return false;
            }
            W();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) c.a(parcel, LocationAvailability.CREATOR);
        c.b(parcel);
        g4Var.c().b(new i2.d(20, locationAvailability));
        return true;
    }

    public final void V(e6.j jVar) {
        g4 g4Var = this.f20459f;
        synchronized (g4Var) {
            e6.j jVar2 = (e6.j) g4Var.f5058b;
            if (jVar2 != jVar) {
                jVar2.f8719b = null;
                g4Var.f5058b = jVar;
            }
        }
    }

    public final void W() {
        this.f20459f.c().b(new i2.d(21, this));
    }
}
