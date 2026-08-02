package d7;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends g6.f {
    @Override // g6.e, d6.c
    public final int a() {
        return 212800000;
    }

    @Override // g6.e
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }

    @Override // g6.e
    public final Feature[] h() {
        return q5.c.f22038b;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // g6.e
    public final boolean p() {
        return true;
    }

    @Override // g6.e
    public final boolean t() {
        return true;
    }
}
