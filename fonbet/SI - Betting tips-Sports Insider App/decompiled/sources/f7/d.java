package f7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends g6.f {
    public final Bundle B;

    public d(Context context, Looper looper, a0 a0Var, e6.p pVar, e6.p pVar2) {
        super(context, looper, 212, a0Var, pVar, pVar2, 0);
        this.B = new Bundle();
    }

    @Override // g6.e, d6.c
    public final int a() {
        return 17895000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof q ? (q) queryLocalInterface : new q(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 2);
    }

    @Override // g6.e
    public final Feature[] h() {
        return e.f9480d;
    }

    @Override // g6.e
    public final Bundle j() {
        return this.B;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
