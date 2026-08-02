package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zaba;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.signin.internal.zak;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v1n extends e2n {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1n(x1n x1nVar, zaba zabaVar, ConnectionResult connectionResult) {
        super(zabaVar);
        this.c = connectionResult;
        this.d = x1nVar;
    }

    @Override // defpackage.e2n
    public final void a() {
        IAccountAccessor zztVar;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((x1n) obj).d.e((ConnectionResult) obj2);
                break;
            default:
                zaar zaarVar = (zaar) obj2;
                zak zakVar = (zak) obj;
                if (zaarVar.g(0)) {
                    ConnectionResult connectionResult = zakVar.b;
                    if (!connectionResult.Z0()) {
                        if (zaarVar.l && !connectionResult.Y0()) {
                            zaarVar.d();
                            zaarVar.a();
                            break;
                        } else {
                            zaarVar.e(connectionResult);
                            break;
                        }
                    } else {
                        zay zayVar = zakVar.c;
                        Preconditions.i(zayVar);
                        ConnectionResult connectionResult2 = zayVar.c;
                        if (!connectionResult2.Z0()) {
                            String valueOf = String.valueOf(connectionResult2);
                            new Exception();
                            "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                            zaarVar.e(connectionResult2);
                            break;
                        } else {
                            zaarVar.n = true;
                            IBinder iBinder = zayVar.b;
                            if (iBinder == null) {
                                zztVar = null;
                            } else {
                                int i2 = IAccountAccessor.Stub.a;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                zztVar = queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                            }
                            Preconditions.i(zztVar);
                            zaarVar.o = zztVar;
                            zaarVar.p = zayVar.d;
                            zaarVar.q = zayVar.e;
                            zaarVar.a();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1n(z1n z1nVar, zaar zaarVar, zaar zaarVar2, zak zakVar) {
        super(zaarVar);
        this.c = zaarVar2;
        this.d = zakVar;
    }
}
