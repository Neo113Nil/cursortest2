package b7;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends g6.f {
    @Override // g6.e, d6.c
    public final int a() {
        return 17895000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        Intrinsics.checkNotNullParameter(iBinder, "iBinder");
        int i5 = b.f3086f;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }

    @Override // g6.e
    public final Feature[] h() {
        Feature[] ALL_FEATURES = l7.b.f19393b;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.identitycredentials.internal.IIdentityCredentialService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.identitycredentials.service.START";
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
