package f7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.widget.a0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends g6.f {
    public final s5.b B;

    public m(Context context, Looper looper, a0 a0Var, s5.b bVar, e6.p pVar, e6.p pVar2) {
        super(context, looper, 68, a0Var, pVar, pVar2, 0);
        bVar = bVar == null ? s5.b.f22624c : bVar;
        d7.e eVar = new d7.e(14);
        eVar.f8268b = Boolean.FALSE;
        eVar.f8268b = Boolean.valueOf(bVar.f22625a);
        eVar.f8269c = bVar.f22626b;
        eVar.f8269c = f.a();
        this.B = new s5.b(eVar);
    }

    @Override // g6.e, d6.c
    public final int a() {
        return 12800000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 2);
    }

    @Override // g6.e
    public final Bundle j() {
        s5.b bVar = this.B;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f22625a);
        bundle.putString("log_session_id", bVar.f22626b);
        return bundle;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
