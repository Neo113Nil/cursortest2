package androidx.credentials.playservices;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential;
import com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient;
import com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient$$ExternalSyntheticLambda0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.identitycredentials.ClearCredentialStateRequest;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.IdentityCredentialManager;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.internal.p000authapi.zbas;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.a6f;
import defpackage.az3;
import defpackage.bz3;
import defpackage.cx8;
import defpackage.dx8;
import defpackage.ewm;
import defpackage.ey3;
import defpackage.fsf;
import defpackage.fw2;
import defpackage.fx8;
import defpackage.fy3;
import defpackage.fz3;
import defpackage.gmo;
import defpackage.gw2;
import defpackage.hi3;
import defpackage.ix8;
import defpackage.j3n;
import defpackage.k13;
import defpackage.kt4;
import defpackage.l1;
import defpackage.l50;
import defpackage.li3;
import defpackage.mc3;
import defpackage.mi;
import defpackage.oy3;
import defpackage.px8;
import defpackage.qy3;
import defpackage.ty3;
import defpackage.vgh;
import defpackage.w01;
import defpackage.yy3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ?\u0010!\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0016¢\u0006\u0004\b!\u0010\"J3\u0010%\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020$0\fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J?\u0010)\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\fH\u0002¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R(\u0010,\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b,\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00066"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "Lqy3;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lfx8;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "Loy3;", "Lgx8;", "Lex8;", "callback", "", "onGetCredential", "(Landroid/content/Context;Lfx8;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Loy3;)V", "Lfy3;", "", "Ldy3;", "onCreateCredential", "(Landroid/content/Context;Lfy3;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Loy3;)V", "", "isAvailableOnDevice", "()Z", "", "minApkVersion", "(I)Z", "Lgw2;", "Ljava/lang/Void;", "Lfw2;", "onClearCredential", "(Lgw2;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Loy3;)V", "Lvgh;", "Lwo0;", "onSignalCredentialState", "(Lvgh;Ljava/util/concurrent/Executor;Loy3;)V", "isGooglePlayServicesAvailable", "(Landroid/content/Context;I)I", "runFallbackClearCredFlow", "Landroid/content/Context;", "Lcom/google/android/gms/common/GoogleApiAvailability;", "googleApiAvailability", "Lcom/google/android/gms/common/GoogleApiAvailability;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/GoogleApiAvailability;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/GoogleApiAvailability;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "fz3", "credentials-play-services-auth"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements qy3 {

    @NotNull
    public static final fz3 Companion = new fz3();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;

    @NotNull
    private static final String TAG = "PlayServicesImpl";

    @NotNull
    private final Context context;

    @NotNull
    private GoogleApiAvailability googleApiAvailability;

    public CredentialProviderPlayServicesImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.e;
        googleApiAvailability.getClass();
        this.googleApiAvailability = googleApiAvailability;
    }

    private final int isGooglePlayServicesAvailable(Context context, int minApkVersion) {
        return this.googleApiAvailability.b(context, minApkVersion);
    }

    private static final Unit onClearCredential$lambda$0(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 0));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(oy3 oy3Var) {
        oy3Var.c(new fw2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var, Boolean bool) {
        fz3 fz3Var = Companion;
        bz3 bz3Var = new bz3(executor, oy3Var, 2);
        fz3Var.getClass();
        fz3.b(cancellationSignal, bz3Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$1$0(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 5));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var, Exception exc) {
        exc.getClass();
        fsf fsfVar = new fsf();
        fsfVar.a = new fw2("Clear restore credential failed for unknown reason.");
        if ((exc instanceof ApiException) && ((ApiException) exc).a.a == 40201) {
            fsfVar.a = new fw2("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$3$0(executor, oy3Var, fsfVar);
    }

    private static final Unit onClearCredential$lambda$3$0(Executor executor, oy3 oy3Var, fsf fsfVar) {
        executor.execute(new mc3(14, oy3Var, fsfVar));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(oy3 oy3Var, fsf fsfVar) {
        oy3Var.c(fsfVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var, ClearCredentialStateResponse clearCredentialStateResponse) {
        fz3 fz3Var = Companion;
        bz3 bz3Var = new bz3(executor, oy3Var, 0);
        fz3Var.getClass();
        fz3.b(cancellationSignal, bz3Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$4$0(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 3));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, gw2 gw2Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var, Exception exc) {
        exc.getClass();
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(gw2Var, cancellationSignal, executor, oy3Var);
    }

    private static final Unit onCreateCredential$lambda$0(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 4));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(oy3 oy3Var) {
        oy3Var.c(new ey3("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final Unit onGetCredential$lambda$0(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 2));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(oy3 oy3Var) {
        oy3Var.c(new dx8("this device requires a Google Play Services update for the given feature to be supported", 2));
    }

    private static final Unit onGetCredential$lambda$1(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(oy3 oy3Var) {
        oy3Var.c(new dx8("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", 2));
    }

    private final void runFallbackClearCredFlow(gw2 request, final CancellationSignal cancellationSignal, final Executor executor, final oy3 callback) {
        final zbaq a = Identity.a(this.context);
        a.a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = GoogleApiClient.a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((GoogleApiClient) it.next()).e();
        }
        GoogleApiManager.a();
        TaskApiCall.Builder a2 = TaskApiCall.a();
        a2.c = new Feature[]{zbas.a};
        a2.a = new RemoteCall() { // from class: com.google.android.gms.internal.auth-api.zbai
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                j3n j3nVar = new j3n(taskCompletionSource);
                zbw zbwVar = (zbw) ((zbar) anyClient).getService();
                String str = zbaq.this.l;
                Parcel J = zbwVar.J();
                int i = zbc.a;
                J.writeStrongBinder(j3nVar);
                J.writeString(str);
                zbwVar.S1(J, 2);
            }
        };
        a2.b = false;
        a2.d = 1554;
        a.h(1, a2.a()).addOnSuccessListener(new l1(new Function1() { // from class: cz3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit runFallbackClearCredFlow$lambda$0;
                runFallbackClearCredFlow$lambda$0 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, callback, (Void) obj);
                return runFallbackClearCredFlow$lambda$0;
            }
        }, 21)).addOnFailureListener(new w01(this, cancellationSignal, executor, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var, Void r5) {
        fz3 fz3Var = Companion;
        bz3 bz3Var = new bz3(executor, oy3Var, 1);
        fz3Var.getClass();
        fz3.b(cancellationSignal, bz3Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$0$0(Executor executor, oy3 oy3Var) {
        executor.execute(new az3(oy3Var, 6));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var, Exception exc) {
        exc.getClass();
        fz3 fz3Var = Companion;
        mi miVar = new mi(17, exc, executor, oy3Var);
        fz3Var.getClass();
        fz3.b(cancellationSignal, miVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, oy3 oy3Var) {
        Objects.toString(exc);
        executor.execute(new mc3(13, oy3Var, exc));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(oy3 oy3Var, Exception exc) {
        oy3Var.c(new fw2(exc.getMessage()));
    }

    @NotNull
    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final boolean isAvailableOnDevice(int minApkVersion) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, minApkVersion);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            new ConnectionResult(isGooglePlayServicesAvailable, null, null).toString();
        }
        return z;
    }

    @Override // defpackage.qy3
    public void onClearCredential(@NotNull gw2 request, @Nullable final CancellationSignal cancellationSignal, @NotNull final Executor executor, @NotNull final oy3 callback) {
        request.getClass();
        executor.getClass();
        callback.getClass();
        Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return;
        }
        if (!request.a.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                runFallbackClearCredFlow(request, cancellationSignal, executor, callback);
                return;
            }
            IdentityCredentialManager.Companion companion = IdentityCredentialManager.a;
            Context context = this.context;
            companion.getClass();
            InternalIdentityCredentialClient a = IdentityCredentialManager.Companion.a(context);
            ClearCredentialStateRequest clearCredentialStateRequest = new ClearCredentialStateRequest();
            TaskApiCall.Builder a2 = TaskApiCall.a();
            a2.c = new Feature[]{zze.b};
            a2.a = new ewm(clearCredentialStateRequest, 29);
            a2.d = 32708;
            Task h = a.h(1, a2.a());
            h.getClass();
            h.addOnSuccessListener(new l1(new Function1() { // from class: ez3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onClearCredential$lambda$4;
                    onClearCredential$lambda$4 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(cancellationSignal, executor, callback, (ClearCredentialStateResponse) obj);
                    return onClearCredential$lambda$4;
                }
            }, 23)).addOnFailureListener(new hi3(this, request, cancellationSignal, executor, callback, 1)).getClass();
            return;
        }
        if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            if (fz3.a(cancellationSignal)) {
                return;
            }
            onClearCredential$lambda$0(executor, callback);
            return;
        }
        Context context2 = this.context;
        int i = RestoreCredential.a;
        context2.getClass();
        InternalRestoreCredentialClient internalRestoreCredentialClient = new InternalRestoreCredentialClient(context2, InternalRestoreCredentialClient.l, Api.ApiOptions.E7, GoogleApi.Settings.c);
        ClearRestoreCredentialRequest clearRestoreCredentialRequest = new ClearRestoreCredentialRequest(request.b);
        TaskApiCall.Builder a3 = TaskApiCall.a();
        a3.c = new Feature[]{zzab.a};
        InternalRestoreCredentialClient$$ExternalSyntheticLambda0 internalRestoreCredentialClient$$ExternalSyntheticLambda0 = new InternalRestoreCredentialClient$$ExternalSyntheticLambda0();
        internalRestoreCredentialClient$$ExternalSyntheticLambda0.a = clearRestoreCredentialRequest;
        a3.a = internalRestoreCredentialClient$$ExternalSyntheticLambda0;
        a3.d = 1694;
        Task h2 = internalRestoreCredentialClient.h(0, a3.a());
        h2.getClass();
        h2.addOnSuccessListener(new l1(new Function1() { // from class: dz3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onClearCredential$lambda$1;
                onClearCredential$lambda$1 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, callback, (Boolean) obj);
                return onClearCredential$lambda$1;
            }
        }, 22)).addOnFailureListener(new li3(2, cancellationSignal, executor, callback)).getClass();
    }

    public void onCreateCredential(@NotNull Context context, @NotNull fy3 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull oy3 callback) {
        context.getClass();
        throw null;
    }

    @Override // defpackage.qy3
    public void onGetCredential(@NotNull Context context, @NotNull fx8 request, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull oy3 callback) {
        context.getClass();
        request.getClass();
        List<ix8> list = request.a;
        executor.getClass();
        callback.getClass();
        Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return;
        }
        for (ix8 ix8Var : list) {
        }
        Companion.getClass();
        for (ix8 ix8Var2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ix8) it.next()) instanceof px8) {
                    new yy3(context).g(request, cancellationSignal, executor, callback);
                    return;
                }
            }
            new ty3(context).f(request, cancellationSignal, executor, callback);
            return;
        }
        cx8 cx8Var = new cx8(context);
        cx8Var.i = cancellationSignal;
        cx8Var.g = callback;
        cx8Var.h = executor;
        Companion.getClass();
        if (fz3.a(cancellationSignal)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (ix8 ix8Var3 : list) {
            ix8Var3.getClass();
            arrayList.add(new CredentialOption("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", ix8Var3.a, ix8Var3.b, "", "", ""));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
        IdentityCredentialManager.a.getClass();
        InternalIdentityCredentialClient a = IdentityCredentialManager.Companion.a(cx8Var.f);
        TaskApiCall.Builder a2 = TaskApiCall.a();
        a2.c = new Feature[]{zze.a};
        a2.a = new gmo(getCredentialRequest, 3);
        a2.d = 32701;
        Task h = a.h(0, a2.a());
        h.getClass();
        h.addOnSuccessListener(new kt4(new l50(cancellationSignal, cx8Var, executor, callback, 26), 27)).addOnFailureListener(new hi3(request, cx8Var, callback, executor, cancellationSignal, 2));
    }

    public void onPrepareCredential(@NotNull fx8 fx8Var, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull oy3 oy3Var) {
        fx8Var.getClass();
        executor.getClass();
        oy3Var.getClass();
    }

    public void onSignalCredentialState(@NotNull vgh request, @NotNull Executor executor, @NotNull oy3 callback) {
        throw null;
    }

    public final void setGoogleApiAvailability(@NotNull GoogleApiAvailability googleApiAvailability) {
        googleApiAvailability.getClass();
        this.googleApiAvailability = googleApiAvailability;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    @Override // defpackage.qy3
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public void onGetCredential(@NotNull Context context, @NotNull a6f a6fVar, @Nullable CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull oy3 oy3Var) {
        context.getClass();
        throw null;
    }
}
