package Y9;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.maps.zzn;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final zzn f14099a;

    public d(zzn zznVar) {
        this.f14099a = (zzn) AbstractC3191o.m(zznVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            return this.f14099a.zzy(((d) obj).f14099a);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f14099a.zzi();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
