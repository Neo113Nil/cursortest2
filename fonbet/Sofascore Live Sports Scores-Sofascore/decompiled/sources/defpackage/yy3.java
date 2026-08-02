package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.internal.p000authapi.zbas;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bx8;
import defpackage.dx8;
import defpackage.ex8;
import defpackage.fqj;
import defpackage.fsf;
import defpackage.fz3;
import defpackage.gx8;
import defpackage.ix1;
import defpackage.k3n;
import defpackage.mc3;
import defpackage.ox1;
import defpackage.p1;
import defpackage.ry3;
import defpackage.uy3;
import defpackage.xy3;
import defpackage.yy3;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yy3 extends uy3 {
    public final Context f;
    public oy3 g;
    public Executor h;
    public CancellationSignal i;
    public final CredentialProviderGetSignInIntentController$resultReceiver$1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public yy3(Context context) {
        super(context);
        context.getClass();
        this.f = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.j = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                boolean z;
                bundle.getClass();
                p1 p1Var = new p1(2, uy3.c, ry3.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 2);
                yy3 yy3Var = yy3.this;
                if (uy3.b(bundle, p1Var, yy3Var.f(), yy3Var.e(), yy3Var.i)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                if (i2 != uy3.e) {
                    return;
                }
                ox1 ox1Var = new ox1(yy3Var, 29);
                CancellationSignal cancellationSignal = yy3Var.i;
                int i3 = 1;
                if (i != -1) {
                    fsf fsfVar = new fsf();
                    fsfVar.a = new dx8(fqj.u(i), 3);
                    if (i == 0) {
                        fsfVar.a = new bx8("activity is cancelled by the user.");
                    }
                    ix1 ix1Var = new ix1(26, ox1Var, fsfVar);
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!fz3.a(cancellationSignal)) {
                        ix1Var.invoke();
                    }
                    Unit unit = Unit.a;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
                try {
                    gx8 d = yy3Var.d(Identity.a(yy3Var.f).i(intent));
                    CancellationSignal cancellationSignal2 = yy3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal2)) {
                        return;
                    }
                    yy3Var.f().execute(new mc3(10, yy3Var, d));
                    Unit unit2 = Unit.a;
                } catch (ApiException e) {
                    fsf fsfVar2 = new fsf();
                    fsfVar2.a = new dx8(e.getMessage(), 3);
                    int i4 = e.a.a;
                    if (i4 == 16) {
                        fsfVar2.a = new bx8(e.getMessage());
                    } else if (uy3.d.contains(Integer.valueOf(i4))) {
                        fsfVar2.a = new dx8(e.getMessage(), 1);
                    }
                    CancellationSignal cancellationSignal3 = yy3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal3)) {
                        return;
                    }
                    yy3Var.f().execute(new mc3(9, yy3Var, fsfVar2));
                    Unit unit3 = Unit.a;
                } catch (ex8 e2) {
                    CancellationSignal cancellationSignal4 = yy3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal4)) {
                        return;
                    }
                    yy3Var.f().execute(new xy3(yy3Var, e2, i3));
                    Unit unit4 = Unit.a;
                } catch (Throwable th) {
                    dx8 dx8Var = new dx8(th.getMessage(), 3);
                    CancellationSignal cancellationSignal5 = yy3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal5)) {
                        return;
                    }
                    yy3Var.f().execute(new mc3(12, yy3Var, dx8Var));
                    Unit unit5 = Unit.a;
                }
            }
        };
    }

    public static GetSignInIntentRequest c(fx8 fx8Var) {
        fx8Var.getClass();
        List list = fx8Var.a;
        if (list.size() != 1) {
            throw new hx8("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        Object obj = list.get(0);
        obj.getClass();
        Parcelable.Creator<GetSignInIntentRequest> creator = GetSignInIntentRequest.CREATOR;
        GetSignInIntentRequest.Builder builder = new GetSignInIntentRequest.Builder();
        String str = ((px8) obj).d;
        Preconditions.i(str);
        builder.a = str;
        builder.b = null;
        builder.d = null;
        return new GetSignInIntentRequest(builder.f, builder.a, builder.b, builder.c, builder.d, builder.e);
    }

    public final gx8 d(SignInCredential signInCredential) {
        signInCredential.getClass();
        String str = signInCredential.g;
        v09 v09Var = null;
        if (str != null) {
            String str2 = signInCredential.a;
            str2.getClass();
            try {
                str.getClass();
                String str3 = signInCredential.b;
                if (str3 == null) {
                    str3 = null;
                }
                String str4 = signInCredential.c;
                String str5 = str4 != null ? str4 : null;
                String str6 = signInCredential.d;
                if (str6 == null) {
                    str6 = null;
                }
                String str7 = signInCredential.h;
                String str8 = str7 != null ? str7 : null;
                Uri uri = signInCredential.e;
                v09Var = new v09(str2, str, str3, str6, str5, uri != null ? uri : null, str8);
            } catch (Exception unused) {
                throw new dx8("When attempting to convert get response, null Google ID Token found", 3);
            }
        }
        if (v09Var != null) {
            return new gx8(v09Var);
        }
        throw new dx8("When attempting to convert get response, null credential found", 3);
    }

    public final oy3 e() {
        oy3 oy3Var = this.g;
        if (oy3Var != null) {
            return oy3Var;
        }
        Intrinsics.i("callback");
        throw null;
    }

    public final Executor f() {
        Executor executor = this.h;
        if (executor != null) {
            return executor;
        }
        Intrinsics.i("executor");
        throw null;
    }

    public final void g(fx8 fx8Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var) {
        fx8Var.getClass();
        oy3Var.getClass();
        executor.getClass();
        this.i = cancellationSignal;
        this.g = oy3Var;
        this.h = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return;
        }
        try {
            GetSignInIntentRequest c = c(fx8Var);
            final zbaq a = Identity.a(this.f);
            GetSignInIntentRequest.Builder builder = new GetSignInIntentRequest.Builder();
            String str = c.a;
            Preconditions.i(str);
            builder.a = str;
            builder.d = c.d;
            builder.b = c.b;
            builder.e = c.e;
            builder.f = c.f;
            String str2 = c.c;
            if (str2 != null) {
                builder.c = str2;
            }
            builder.c = a.l;
            final GetSignInIntentRequest getSignInIntentRequest = new GetSignInIntentRequest(builder.f, builder.a, builder.b, builder.c, builder.d, builder.e);
            TaskApiCall.Builder a2 = TaskApiCall.a();
            a2.c = new Feature[]{zbas.b};
            a2.a = new RemoteCall(a, getSignInIntentRequest) { // from class: com.google.android.gms.internal.auth-api.zbak
                public final /* synthetic */ GetSignInIntentRequest a;

                {
                    this.a = getSignInIntentRequest;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                    k3n k3nVar = new k3n(taskCompletionSource);
                    zbw zbwVar = (zbw) ((zbar) anyClient).getService();
                    Parcel J = zbwVar.J();
                    int i = zbc.a;
                    J.writeStrongBinder(k3nVar);
                    zbc.c(J, this.a);
                    zbwVar.S1(J, 3);
                }
            };
            a2.d = 1555;
            a.h(0, a2.a()).addOnSuccessListener(new l1(new r82(9, cancellationSignal, this), 20)).addOnFailureListener(new o3(10, this, cancellationSignal));
        } catch (hx8 e) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (fz3.a(cancellationSignal)) {
                return;
            }
            f().execute(new mc3(11, this, e));
            Unit unit = Unit.a;
        }
    }
}
