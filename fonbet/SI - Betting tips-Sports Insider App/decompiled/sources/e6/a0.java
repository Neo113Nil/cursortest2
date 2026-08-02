package e6;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import com.android.billingclient.api.x0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import io.sentry.android.core.w0;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 extends u7.b implements d6.h, d6.i {

    /* renamed from: m, reason: collision with root package name */
    public static final a6.d f8671m = t7.b.f23752a;

    /* renamed from: f, reason: collision with root package name */
    public final Context f8672f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f8673g;

    /* renamed from: h, reason: collision with root package name */
    public final a6.d f8674h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f8675i;
    public final androidx.appcompat.widget.a0 j;

    /* renamed from: k, reason: collision with root package name */
    public u7.a f8676k;

    /* renamed from: l, reason: collision with root package name */
    public x0 f8677l;

    public a0(Context context, com.google.android.gms.internal.measurement.h0 h0Var, androidx.appcompat.widget.a0 a0Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 4);
        this.f8672f = context;
        this.f8673g = h0Var;
        this.j = a0Var;
        this.f8675i = (Set) a0Var.f680b;
        this.f8674h = f8671m;
    }

    @Override // d6.h
    public final void a(int i5) {
        x0 x0Var = this.f8677l;
        p pVar = (p) ((e) x0Var.f4120f).j.get((a) x0Var.f4117c);
        if (pVar != null) {
            if (pVar.f8742m) {
                pVar.m(new ConnectionResult(17, null, null));
            } else {
                pVar.a(i5);
            }
        }
    }

    @Override // d6.h
    public final void e() {
        u7.a aVar = this.f8676k;
        aVar.getClass();
        boolean z5 = false;
        try {
            aVar.C.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount b10 = "<<default account>>".equals(account.name) ? x5.a.a(aVar.f9806c).b() : null;
            Integer num = aVar.E;
            g6.v.h(num);
            zay zayVar = new zay(2, account, num.intValue(), b10);
            u7.c cVar = (u7.c) aVar.m();
            zai zaiVar = new zai(1, zayVar);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(cVar.f5344g);
            int i5 = h7.a.f10385a;
            obtain.writeInt(1);
            zaiVar.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(this);
            Parcel obtain2 = Parcel.obtain();
            try {
                cVar.f5343f.transact(12, obtain, obtain2, 0);
                obtain2.readException();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        } catch (RemoteException e7) {
            w0.m("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f8673g.post(new g8.a(17, this, new zak(1, new ConnectionResult(8, null, null), null), z5));
            } catch (RemoteException unused) {
                w0.o("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // d6.i
    public final void f(ConnectionResult connectionResult) {
        this.f8677l.z(connectionResult);
    }
}
