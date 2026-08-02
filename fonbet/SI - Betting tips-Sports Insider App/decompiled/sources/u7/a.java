package u7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import d6.h;
import d6.i;
import g6.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends f implements d6.c {
    public final boolean B;
    public final a0 C;
    public final Bundle D;
    public final Integer E;

    public a(Context context, Looper looper, a0 a0Var, Bundle bundle, h hVar, i iVar) {
        super(context, looper, 44, a0Var, hVar, iVar, 0);
        this.B = true;
        this.C = a0Var;
        this.D = bundle;
        this.E = (Integer) a0Var.f685g;
    }

    @Override // g6.e, d6.c
    public final int a() {
        return 12451000;
    }

    @Override // g6.e, d6.c
    public final boolean b() {
        return this.B;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 3);
    }

    @Override // g6.e
    public final Bundle j() {
        a0 a0Var = this.C;
        boolean equals = this.f9806c.getPackageName().equals((String) a0Var.f682d);
        Bundle bundle = this.D;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) a0Var.f682d);
        }
        return bundle;
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.signin.service.START";
    }
}
