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
public final class o extends g6.f {
    public final Bundle B;

    public o(Context context, Looper looper, a0 a0Var, e6.p pVar, e6.p pVar2) {
        super(context, looper, 223, a0Var, pVar, pVar2, 0);
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new p(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 2);
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
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
