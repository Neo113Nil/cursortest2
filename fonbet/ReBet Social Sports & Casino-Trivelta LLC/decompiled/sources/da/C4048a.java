package da;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ca.InterfaceC2905e;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.common.internal.InterfaceC3184h;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* renamed from: da.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4048a extends AbstractC3181e implements InterfaceC2905e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f45162e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f45163a;

    /* renamed from: b, reason: collision with root package name */
    public final C3180d f45164b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f45165c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f45166d;

    public C4048a(Context context, Looper looper, boolean z10, C3180d c3180d, Bundle bundle, f.b bVar, f.c cVar) {
        super(context, looper, 44, c3180d, bVar, cVar);
        this.f45163a = true;
        this.f45164b = c3180d;
        this.f45165c = bundle;
        this.f45166d = c3180d.i();
    }

    public static Bundle g(C3180d c3180d) {
        c3180d.h();
        Integer i10 = c3180d.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3180d.a());
        if (i10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // ca.InterfaceC2905e
    public final void a() {
        try {
            ((f) getService()).c(((Integer) AbstractC3191o.m(this.f45166d)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // ca.InterfaceC2905e
    public final void b() {
        connect(new AbstractC3179c.d(this));
    }

    @Override // ca.InterfaceC2905e
    public final void c(e eVar) {
        AbstractC3191o.n(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c10 = this.f45164b.c();
            ((f) getService()).i(new zai(1, new zat(c10, ((Integer) AbstractC3191o.m(this.f45166d)).intValue(), AbstractC3179c.DEFAULT_ACCOUNT.equals(c10.name) ? Storage.getInstance(getContext()).getSavedDefaultGoogleSignInAccount() : null)), eVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.s(new zak(1, new ConnectionResult(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // ca.InterfaceC2905e
    public final void d(InterfaceC3184h interfaceC3184h, boolean z10) {
        try {
            ((f) getService()).g(interfaceC3184h, ((Integer) AbstractC3191o.m(this.f45166d)).intValue(), z10);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f45164b.f())) {
            this.f45165c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f45164b.f());
        }
        return this.f45165c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return AbstractC3175h.f32612a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final boolean requiresSignIn() {
        return this.f45163a;
    }
}
