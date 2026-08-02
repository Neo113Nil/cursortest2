package Y9;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.maps.zzaj;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final zzaj f14100a;

    public e(zzaj zzajVar) {
        this.f14100a = (zzaj) AbstractC3191o.m(zzajVar);
    }

    public void a(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.f14100a.zzw(latLng);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.f14100a.zzE(((e) obj).f14100a);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f14100a.zzg();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
