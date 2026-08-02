package m7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzj;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends g6.f {
    public final s.n B;
    public final s.n C;
    public final s.n D;

    public i(Context context, Looper looper, a0 a0Var, e6.p pVar, e6.p pVar2) {
        super(context, looper, 23, a0Var, pVar, pVar2, 0);
        this.B = new s.n(0);
        this.C = new s.n(0);
        this.D = new s.n(0);
    }

    @Override // g6.e, d6.c
    public final int a() {
        return 11717000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof s ? (s) queryLocalInterface : new s(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 5);
    }

    @Override // g6.e
    public final Feature[] h() {
        return p7.e.f21528c;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // g6.e
    public final void s() {
        System.currentTimeMillis();
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
        synchronized (this.D) {
            this.D.clear();
        }
    }

    @Override // g6.e
    public final boolean t() {
        return true;
    }

    public final boolean y(Feature feature) {
        zzj zzjVar = this.f9824w;
        Feature feature2 = null;
        Feature[] featureArr = zzjVar == null ? null : zzjVar.f4554b;
        if (featureArr != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= featureArr.length) {
                    break;
                }
                Feature feature3 = featureArr[i5];
                if (feature.f4445a.equals(feature3.f4445a)) {
                    feature2 = feature3;
                    break;
                }
                i5++;
            }
            if (feature2 != null && feature2.c() >= feature.c()) {
                return true;
            }
        }
        return false;
    }
}
