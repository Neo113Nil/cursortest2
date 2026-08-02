package x5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.widget.a0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import e6.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends g6.f {
    public final GoogleSignInOptions B;

    public d(Context context, Looper looper, a0 a0Var, GoogleSignInOptions googleSignInOptions, p pVar, p pVar2) {
        super(context, looper, 91, a0Var, pVar, pVar2, 0);
        Set<Scope> set = (Set) a0Var.f681c;
        w5.a aVar = googleSignInOptions != null ? new w5.a(googleSignInOptions) : new w5.a();
        aVar.f24976i = f7.f.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = aVar.f24968a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f4401o;
        HashSet hashSet2 = aVar.f24968a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f4400n;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (aVar.f24971d && (aVar.f24973f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.f4399m);
        }
        this.B = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar.f24973f, aVar.f24971d, aVar.f24969b, aVar.f24970c, aVar.f24972e, aVar.f24974g, aVar.f24975h, aVar.f24976i);
    }

    @Override // g6.e, d6.c
    public final int a() {
        return 12451000;
    }

    @Override // g6.e
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof j ? (j) queryLocalInterface : new j(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 2);
    }

    @Override // g6.e
    public final String n() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // g6.e
    public final String o() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
