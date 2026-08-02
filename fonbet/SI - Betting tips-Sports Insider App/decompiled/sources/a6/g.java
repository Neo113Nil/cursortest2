package a6;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends g6.f {
    @Override // g6.e, d6.c
    public final int a() {
        return 17895000;
    }

    @Override // g6.e
    public final IInterface d(IBinder binder) {
        c aVar;
        Intrinsics.checkNotNullParameter(binder, "binder");
        int i5 = b.f79f;
        if (binder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService");
            aVar = queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(binder);
        }
        Intrinsics.checkNotNullExpressionValue(aVar, "asInterface(...)");
        return aVar;
    }

    @Override // g6.e
    public final Feature[] h() {
        Feature[] ALL_FEATURES = g7.a.f9883d;
        Intrinsics.checkNotNullExpressionValue(ALL_FEATURES, "ALL_FEATURES");
        return ALL_FEATURES;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.auth.blockstore.restorecredential.internal.IRestoreCredentialService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED";
    }

    @Override // g6.e
    public final boolean p() {
        return true;
    }
}
