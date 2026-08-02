package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.bx8;
import defpackage.dx8;
import defpackage.ex8;
import defpackage.fqj;
import defpackage.fsf;
import defpackage.fz3;
import defpackage.gx8;
import defpackage.i3n;
import defpackage.ix1;
import defpackage.mc3;
import defpackage.ox1;
import defpackage.p1;
import defpackage.ry3;
import defpackage.sy3;
import defpackage.ty3;
import defpackage.uy3;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ty3 extends uy3 {
    public final Context f;
    public oy3 g;
    public Executor h;
    public CancellationSignal i;
    public final CredentialProviderBeginSignInController$resultReceiver$1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public ty3(Context context) {
        super(context);
        context.getClass();
        this.f = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.j = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, Bundle bundle) {
                boolean z;
                bundle.getClass();
                p1 p1Var = new p1(2, uy3.c, ry3.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 1);
                ty3 ty3Var = ty3.this;
                if (uy3.b(bundle, p1Var, ty3Var.e(), ty3Var.d(), ty3Var.i)) {
                    return;
                }
                int i2 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                if (i2 != uy3.e) {
                    return;
                }
                ox1 ox1Var = new ox1(ty3Var, 28);
                CancellationSignal cancellationSignal = ty3Var.i;
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
                    gx8 c = ty3Var.c(Identity.a(ty3Var.f).i(intent));
                    CancellationSignal cancellationSignal2 = ty3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal2)) {
                        return;
                    }
                    ty3Var.e().execute(new mc3(7, ty3Var, c));
                    Unit unit2 = Unit.a;
                } catch (ApiException e) {
                    fsf fsfVar2 = new fsf();
                    fsfVar2.a = new dx8(e.getMessage(), 3);
                    int i3 = e.a.a;
                    if (i3 == 16) {
                        fsfVar2.a = new bx8(e.getMessage());
                    } else if (uy3.d.contains(Integer.valueOf(i3))) {
                        fsfVar2.a = new dx8(e.getMessage(), 1);
                    }
                    CancellationSignal cancellationSignal3 = ty3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal3)) {
                        return;
                    }
                    ty3Var.e().execute(new mc3(5, ty3Var, fsfVar2));
                    Unit unit3 = Unit.a;
                } catch (ex8 e2) {
                    CancellationSignal cancellationSignal4 = ty3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal4)) {
                        return;
                    }
                    ty3Var.e().execute(new sy3(ty3Var, e2, 2));
                    Unit unit4 = Unit.a;
                } catch (Throwable th) {
                    dx8 dx8Var = new dx8(th.getMessage(), 3);
                    CancellationSignal cancellationSignal5 = ty3Var.i;
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (fz3.a(cancellationSignal5)) {
                        return;
                    }
                    ty3Var.e().execute(new mc3(6, ty3Var, dx8Var));
                    Unit unit5 = Unit.a;
                }
            }
        };
    }

    public final gx8 c(SignInCredential signInCredential) {
        x84 x84Var;
        String jSONObject;
        signInCredential.getClass();
        String str = signInCredential.f;
        PublicKeyCredential publicKeyCredential = signInCredential.i;
        String str2 = signInCredential.g;
        String str3 = signInCredential.a;
        if (str != null) {
            str3.getClass();
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            x84Var = new x84(str, 2, bundle);
        } else if (str2 != null) {
            str3.getClass();
            String str4 = signInCredential.b;
            String str5 = str4 != null ? str4 : null;
            String str6 = signInCredential.c;
            String str7 = str6 != null ? str6 : null;
            String str8 = signInCredential.d;
            String str9 = str8 != null ? str8 : null;
            String str10 = signInCredential.h;
            String str11 = str10 != null ? str10 : null;
            Uri uri = signInCredential.e;
            x84Var = new v09(str3, str2, str5, str9, str7, uri != null ? uri : null, str11);
        } else if (publicKeyCredential != null) {
            LinkedHashMap linkedHashMap = sgf.a;
            JSONObject jSONObject2 = new JSONObject();
            SafeParcelable safeParcelable = publicKeyCredential.d;
            if (safeParcelable == null && (safeParcelable = publicKeyCredential.e) == null && (safeParcelable = publicKeyCredential.f) == null) {
                a70.r("No response set.");
                return null;
            }
            if (safeParcelable instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
                ErrorCode errorCode = authenticatorErrorResponse.a;
                errorCode.getClass();
                String str12 = authenticatorErrorResponse.b;
                e0 e0Var = (e0) sgf.a.get(errorCode);
                if (e0Var == null) {
                    throw new nx8(new e0(26), dmi.q("unknown fido gms exception - ", str12));
                }
                if (errorCode == ErrorCode.NOT_ALLOWED_ERR && str12 != null && StringsKt.J(str12, "Unable to get sync account", false)) {
                    throw new bx8("Passkey retrieval was cancelled by the user.");
                }
                throw new nx8(e0Var, str12);
            }
            if (safeParcelable instanceof AuthenticatorAssertionResponse) {
                try {
                    jSONObject = publicKeyCredential.Y0().toString();
                    jSONObject.getClass();
                } catch (Throwable th) {
                    throw new dx8(bf3.o(new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: "), th), 3);
                }
            } else {
                jSONObject = jSONObject2.toString();
                jSONObject.getClass();
            }
            x84Var = new x84(jSONObject, 3, bf3.f("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject));
        } else {
            x84Var = null;
        }
        if (x84Var != null) {
            return new gx8(x84Var);
        }
        throw new dx8("When attempting to convert get response, null credential found", 3);
    }

    public final oy3 d() {
        oy3 oy3Var = this.g;
        if (oy3Var != null) {
            return oy3Var;
        }
        Intrinsics.i("callback");
        throw null;
    }

    public final Executor e() {
        Executor executor = this.h;
        if (executor != null) {
            return executor;
        }
        Intrinsics.i("executor");
        throw null;
    }

    public final void f(fx8 fx8Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var) {
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
        Context context = this.f;
        context.getClass();
        BeginSignInRequest.Builder builder = new BeginSignInRequest.Builder();
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        long j = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        for (ix8 ix8Var : fx8Var.a) {
            if (ix8Var instanceof jx8) {
                Parcelable.Creator<BeginSignInRequest.GoogleIdTokenRequestOptions> creator = BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR;
                BeginSignInRequest.GoogleIdTokenRequestOptions.Builder builder2 = new BeginSignInRequest.GoogleIdTokenRequestOptions.Builder();
                String str = ((jx8) ix8Var).d;
                Preconditions.f(str);
                builder2.b = str;
                builder2.a = true;
                builder.b = new BeginSignInRequest.GoogleIdTokenRequestOptions(builder2.a, builder2.b, null, true, null, null, false);
            }
        }
        if (j > 241217000) {
            builder.h = false;
        }
        builder.f = false;
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(builder.a, builder.b, builder.e, builder.f, builder.g, builder.c, builder.d, builder.h);
        final zbaq a = Identity.a(context);
        BeginSignInRequest.Builder builder3 = new BeginSignInRequest.Builder();
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.b;
        Preconditions.i(googleIdTokenRequestOptions);
        builder3.b = googleIdTokenRequestOptions;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.a;
        Preconditions.i(passwordRequestOptions);
        builder3.a = passwordRequestOptions;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f;
        Preconditions.i(passkeysRequestOptions);
        builder3.c = passkeysRequestOptions;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.g;
        Preconditions.i(passkeyJsonRequestOptions);
        builder3.d = passkeyJsonRequestOptions;
        builder3.f = beginSignInRequest.d;
        builder3.g = beginSignInRequest.e;
        builder3.h = beginSignInRequest.h;
        String str2 = beginSignInRequest.c;
        if (str2 != null) {
            builder3.e = str2;
        }
        builder3.e = a.l;
        final BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(builder3.a, builder3.b, builder3.e, builder3.f, builder3.g, builder3.c, builder3.d, builder3.h);
        TaskApiCall.Builder a2 = TaskApiCall.a();
        a2.c = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        a2.a = new RemoteCall(a, beginSignInRequest2) { // from class: com.google.android.gms.internal.auth-api.zbaj
            public final /* synthetic */ BeginSignInRequest a;

            {
                this.a = beginSignInRequest2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                i3n i3nVar = new i3n(taskCompletionSource);
                zbw zbwVar = (zbw) ((zbar) anyClient).getService();
                Parcel J = zbwVar.J();
                int i = zbc.a;
                J.writeStrongBinder(i3nVar);
                zbc.c(J, this.a);
                zbwVar.S1(J, 1);
            }
        };
        a2.b = false;
        a2.d = 1553;
        a.h(0, a2.a()).addOnSuccessListener(new l1(new r82(8, cancellationSignal, this), 19)).addOnFailureListener(new o3(9, this, cancellationSignal));
    }
}
