package ca;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c0;
import com.miui.referrer.IGetAppsReferrerService;
import com.miui.referrer.api.GetAppsReferrerClientImpl;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import com.miui.referrer.commons.LogUtils;
import j$.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import s7.d1;
import s7.f1;
import s7.n0;
import s7.w0;
import s7.x0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3717a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3719c;

    public a(x0 x0Var, String str) {
        Objects.requireNonNull(x0Var);
        this.f3719c = x0Var;
        this.f3718b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i5 = this.f3717a;
        Object obj = this.f3719c;
        switch (i5) {
            case 0:
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                Intrinsics.checkNotNullParameter(iBinder, "iBinder");
                LogUtils.logVerbose(GetAppsReferrerClientImpl.TAG, "GetApps Referrer service connected.");
                GetAppsReferrerClientImpl getAppsReferrerClientImpl = (GetAppsReferrerClientImpl) obj;
                getAppsReferrerClientImpl.service = IGetAppsReferrerService.Stub.asInterface(iBinder);
                getAppsReferrerClientImpl.clientState = 2;
                ((GetAppsReferrerStateListener) this.f3718b).onGetAppsReferrerSetupFinished(0);
                break;
            default:
                x0 x0Var = (x0) obj;
                if (iBinder == null) {
                    n0 n0Var = x0Var.f23230b.f22745f;
                    f1.m(n0Var);
                    n0Var.f22906i.a("Install Referrer connection returned with null binder");
                    break;
                } else {
                    try {
                        int i10 = b0.f4928a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        c0 a0Var = queryLocalInterface instanceof c0 ? (c0) queryLocalInterface : new a0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
                        f1 f1Var = x0Var.f23230b;
                        n0 n0Var2 = f1Var.f22745f;
                        f1.m(n0Var2);
                        n0Var2.f22910n.a("Install Referrer Service connected");
                        d1 d1Var = f1Var.f22746g;
                        f1.m(d1Var);
                        d1Var.s(new w0(this, a0Var, this));
                        break;
                    } catch (RuntimeException e7) {
                        n0 n0Var3 = x0Var.f23230b.f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22906i.b(e7, "Exception occurred while calling Install Referrer API");
                        return;
                    }
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f3717a) {
            case 0:
                Intrinsics.checkNotNullParameter(componentName, "componentName");
                LogUtils.logWarn(GetAppsReferrerClientImpl.TAG, "GetApps Referrer service disconnected.");
                GetAppsReferrerClientImpl getAppsReferrerClientImpl = (GetAppsReferrerClientImpl) this.f3719c;
                getAppsReferrerClientImpl.service = null;
                getAppsReferrerClientImpl.clientState = 0;
                ((GetAppsReferrerStateListener) this.f3718b).onGetAppsServiceDisconnected();
                break;
            default:
                n0 n0Var = ((x0) this.f3719c).f23230b.f22745f;
                f1.m(n0Var);
                n0Var.f22910n.a("Install Referrer Service disconnected");
                break;
        }
    }

    public a(GetAppsReferrerClientImpl this$0, GetAppsReferrerStateListener stateListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        this.f3719c = this$0;
        this.f3718b = stateListener;
    }
}
