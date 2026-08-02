package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1;
import defpackage.a70;
import defpackage.az3;
import defpackage.bx8;
import defpackage.cx8;
import defpackage.dx8;
import defpackage.ex8;
import defpackage.fqj;
import defpackage.fsf;
import defpackage.fz3;
import defpackage.gjc;
import defpackage.gx8;
import defpackage.gz8;
import defpackage.o1j;
import defpackage.oy3;
import defpackage.p1;
import defpackage.q9;
import defpackage.ry3;
import defpackage.td4;
import defpackage.uy3;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cx8 extends uy3 {
    public final Context f;
    public oy3 g;
    public Executor h;
    public CancellationSignal i;
    public final GetCredentialController$resultReceiver$1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public cx8(Context context) {
        super(context);
        context.getClass();
        this.f = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.j = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                String string;
                Bundle bundle2;
                gx8 gx8Var;
                bundle.getClass();
                p1 p1Var = new p1(2, uy3.c, ry3.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 9);
                cx8 cx8Var = cx8.this;
                Executor executor = cx8Var.h;
                final ex8 ex8Var = null;
                if (executor == null) {
                    Intrinsics.i("executor");
                    throw null;
                }
                oy3 oy3Var = cx8Var.g;
                if (oy3Var == null) {
                    Intrinsics.i("callback");
                    throw null;
                }
                if (uy3.b(bundle, p1Var, executor, oy3Var, cx8Var.i)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) gz8.K(bundle, "RESULT_DATA", Intent.class);
                Executor executor2 = cx8Var.h;
                if (executor2 == null) {
                    Intrinsics.i("executor");
                    throw null;
                }
                final oy3 oy3Var2 = cx8Var.g;
                if (oy3Var2 == null) {
                    Intrinsics.i("callback");
                    throw null;
                }
                CancellationSignal cancellationSignal = cx8Var.i;
                if (i2 != uy3.e) {
                    return;
                }
                if (i != -1) {
                    fsf fsfVar = new fsf();
                    fsfVar.a = new dx8(fqj.u(i), 3);
                    if (i == 0) {
                        fsfVar.a = new bx8("activity is cancelled by the user.");
                    }
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!fz3.a(cancellationSignal)) {
                        final ex8 ex8Var2 = (ex8) fsfVar.a;
                        ex8Var2.getClass();
                        final int i3 = 0;
                        executor2.execute(new Runnable() { // from class: j2g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4 = i3;
                                Object obj = ex8Var2;
                                oy3 oy3Var3 = oy3Var2;
                                switch (i4) {
                                    case 0:
                                        oy3Var3.c(obj);
                                        break;
                                    default:
                                        if (obj == null) {
                                            obj = new dx8("No provider data returned", 3);
                                        }
                                        oy3Var3.c(obj);
                                        break;
                                }
                            }
                        });
                        Unit unit = Unit.a;
                    }
                    Unit unit2 = Unit.a;
                    return;
                }
                if (intent == null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal)) {
                        return;
                    }
                    executor2.execute(new az3(oy3Var2, 8));
                    Unit unit3 = Unit.a;
                    return;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    gx8Var = q9.e(intent);
                } else {
                    Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                    gx8Var = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle2 = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new gx8(o1j.v(bundle2, string));
                }
                if (gx8Var != null) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal)) {
                        return;
                    }
                    executor2.execute(new gjc(28, oy3Var2, gx8Var));
                    Unit unit4 = Unit.a;
                    return;
                }
                if (i4 >= 34) {
                    ex8Var = q9.d(intent);
                } else {
                    int i5 = ex8.a;
                    Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                    if (bundleExtra2 != null) {
                        String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                        if (string2 == null) {
                            a70.p("Bundle was missing exception type.");
                            return;
                        }
                        ex8Var = td4.x0(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                    }
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (fz3.a(cancellationSignal)) {
                    return;
                }
                final int i6 = 1;
                executor2.execute(new Runnable() { // from class: j2g
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i42 = i6;
                        Object obj = ex8Var;
                        oy3 oy3Var3 = oy3Var2;
                        switch (i42) {
                            case 0:
                                oy3Var3.c(obj);
                                break;
                            default:
                                if (obj == null) {
                                    obj = new dx8("No provider data returned", 3);
                                }
                                oy3Var3.c(obj);
                                break;
                        }
                    }
                });
                Unit unit5 = Unit.a;
            }
        };
    }
}
