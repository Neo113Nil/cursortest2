package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.cdk;
import xsna.ddk;
import xsna.izs;
import xsna.lq9;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;

/* compiled from: CredentialManager.kt */
@SuppressLint({"ObsoleteSdkInt"})
/* loaded from: classes.dex */
public interface CredentialManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: CredentialManager.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CredentialManager create(Context context) {
            return new CredentialManagerImpl(context);
        }
    }

    static Object clearCredentialState$suspendImpl(CredentialManager credentialManager, ClearCredentialStateRequest clearCredentialStateRequest, spj<? super s3q0> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        lq9Var.r(new izs<Throwable, s3q0>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.clearCredentialStateAsync(clearCredentialStateRequest, cancellationSignal, new cdk(), new CredentialManagerCallback<Void, ClearCredentialException>() { // from class: androidx.credentials.CredentialManager$clearCredentialState$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(ClearCredentialException clearCredentialException) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(new Result.Failure(clearCredentialException));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(Void r2) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(s3q0.a);
                }
            }
        });
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    static CredentialManager create(Context context) {
        return Companion.create(context);
    }

    static Object createCredential$suspendImpl(CredentialManager credentialManager, Context context, CreateCredentialRequest createCredentialRequest, spj<? super CreateCredentialResponse> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        lq9Var.r(new izs<Throwable, s3q0>() { // from class: androidx.credentials.CredentialManager$createCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.createCredentialAsync(context, createCredentialRequest, cancellationSignal, new cdk(), new CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException>() { // from class: androidx.credentials.CredentialManager$createCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(CreateCredentialException createCredentialException) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(new Result.Failure(createCredentialException));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(CreateCredentialResponse createCredentialResponse) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(createCredentialResponse);
                }
            }
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    static Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, GetCredentialRequest getCredentialRequest, spj<? super GetCredentialResponse> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        lq9Var.r(new izs<Throwable, s3q0>() { // from class: androidx.credentials.CredentialManager$getCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.getCredentialAsync(context, getCredentialRequest, cancellationSignal, new ddk(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException getCredentialException) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(new Result.Failure(getCredentialException));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(GetCredentialResponse getCredentialResponse) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(getCredentialResponse);
                }
            }
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    static Object prepareGetCredential$suspendImpl(CredentialManager credentialManager, GetCredentialRequest getCredentialRequest, spj<? super PrepareGetCredentialResponse> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        lq9Var.r(new izs<Throwable, s3q0>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.prepareGetCredentialAsync(getCredentialRequest, cancellationSignal, new cdk(), new CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$prepareGetCredential$2$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException getCredentialException) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(new Result.Failure(getCredentialException));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(PrepareGetCredentialResponse prepareGetCredentialResponse) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(prepareGetCredentialResponse);
                }
            }
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    default Object clearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, spj<? super s3q0> spjVar) {
        return clearCredentialState$suspendImpl(this, clearCredentialStateRequest, spjVar);
    }

    void clearCredentialStateAsync(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback);

    default Object createCredential(Context context, CreateCredentialRequest createCredentialRequest, spj<? super CreateCredentialResponse> spjVar) {
        return createCredential$suspendImpl(this, context, createCredentialRequest, spjVar);
    }

    void createCredentialAsync(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback);

    PendingIntent createSettingsPendingIntent();

    default Object getCredential(Context context, GetCredentialRequest getCredentialRequest, spj<? super GetCredentialResponse> spjVar) {
        return getCredential$suspendImpl(this, context, getCredentialRequest, spjVar);
    }

    void getCredentialAsync(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback);

    void getCredentialAsync(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback);

    default Object prepareGetCredential(GetCredentialRequest getCredentialRequest, spj<? super PrepareGetCredentialResponse> spjVar) {
        return prepareGetCredential$suspendImpl(this, getCredentialRequest, spjVar);
    }

    void prepareGetCredentialAsync(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback);

    default Object getCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, spj<? super GetCredentialResponse> spjVar) {
        return getCredential$suspendImpl(this, context, pendingGetCredentialHandle, spjVar);
    }

    static Object getCredential$suspendImpl(CredentialManager credentialManager, Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, spj<? super GetCredentialResponse> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        final CancellationSignal cancellationSignal = new CancellationSignal();
        lq9Var.r(new izs<Throwable, s3q0>() { // from class: androidx.credentials.CredentialManager$getCredential$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
                invoke2(th);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationSignal.cancel();
            }
        });
        credentialManager.getCredentialAsync(context, pendingGetCredentialHandle, cancellationSignal, new cdk(), new CredentialManagerCallback<GetCredentialResponse, GetCredentialException>() { // from class: androidx.credentials.CredentialManager$getCredential$4$callback$1
            @Override // androidx.credentials.CredentialManagerCallback
            public void onError(GetCredentialException getCredentialException) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(new Result.Failure(getCredentialException));
                }
            }

            @Override // androidx.credentials.CredentialManagerCallback
            public void onResult(GetCredentialResponse getCredentialResponse) {
                if (lq9Var.isActive()) {
                    lq9Var.resumeWith(getCredentialResponse);
                }
            }
        });
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
