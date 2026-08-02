package k7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k1 extends g6.f {
    @Override // g6.e, d6.c
    public final int a() {
        return 13000000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return queryLocalInterface instanceof l1 ? (l1) queryLocalInterface : new l1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override // g6.e
    public final Feature[] h() {
        return new Feature[]{v6.a.f24434b, v6.a.f24433a};
    }

    @Override // g6.e
    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // g6.e
    public final boolean t() {
        return true;
    }
}
