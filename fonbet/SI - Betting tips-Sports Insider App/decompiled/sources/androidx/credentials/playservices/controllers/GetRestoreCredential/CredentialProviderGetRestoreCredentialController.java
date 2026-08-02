package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialResponse;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import d6.e;
import e6.m;
import e6.y;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.i;
import t0.j;
import t0.p;
import t0.q;
import u0.f;
import u0.g;
import w7.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lt0/p;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;", "Lt0/q;", "Lu0/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lt0/i;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Lt0/p;Lt0/i;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lt0/p;)Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;)Lt0/q;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<p, GetRestoreCredentialRequest, GetRestoreCredentialResponse, q, f> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, u0.g] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, u0.g] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, u0.g] */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, i iVar, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new g("Get restore credential failed for unknown reason, failure: " + e7.getMessage());
        if (e7 instanceof e) {
            Status status = ((e) e7).f8245a;
            if (status.f4466a == 40201) {
                objectRef.element = new g("The restore credential internal service had a failure, failure: " + e7.getMessage());
            } else {
                objectRef.element = new g("The restore credential service failed with unsupported status code, failure: " + e7.getMessage() + ", status code: " + status.f4466a);
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1(executor, iVar, objectRef));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetRestoreCredentialRequest convertRequestToPlayServices(@NotNull p request) {
        Intrinsics.checkNotNullParameter(request, "request");
        for (j jVar : request.f23734a) {
        }
        Intrinsics.throwUninitializedPropertyAccessException("credentialOption");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public q convertResponseToCredentialManager(@NotNull GetRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new q(rh.g.f(response.f4436a, "androidx.credentials.TYPE_RESTORE_CREDENTIAL"));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull p request, @NotNull final i callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        GetRestoreCredentialRequest request2 = convertRequestToPlayServices(request);
        a6.f u10 = rh.g.u(this.context);
        Intrinsics.checkNotNullParameter(request2, "request");
        m a7 = y.a();
        a7.f8725d = new Feature[]{g7.a.f9882c};
        h9.c cVar = new h9.c(3, false);
        cVar.f10430b = request2;
        a7.f8722a = cVar;
        a7.f8726e = 1695;
        w7.m c2 = u10.c(0, a7.a());
        Intrinsics.checkNotNullExpressionValue(c2, "doRead(...)");
        a aVar = new a(new Function1<GetRestoreCredentialResponse, Unit>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1

            /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                final /* synthetic */ i $callback;
                final /* synthetic */ Executor $executor;
                final /* synthetic */ q $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Executor executor, i iVar, q qVar) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = iVar;
                    this.$response = qVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m55invoke();
                    return Unit.f19194a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m55invoke() {
                    this.$executor.execute(new d(2, this.$callback, this.$response));
                }
            }

            /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
                final /* synthetic */ i $callback;
                final /* synthetic */ Exception $e;
                final /* synthetic */ Executor $executor;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Executor executor, i iVar, Exception exc) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = iVar;
                    this.$e = exc;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$0(i iVar, Exception exc) {
                    iVar.a(exc instanceof u0.i ? (f) exc : new g(exc.getMessage()));
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m56invoke();
                    return Unit.f19194a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m56invoke() {
                    this.$executor.execute(new d(3, this.$callback, this.$e));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GetRestoreCredentialResponse) obj);
                return Unit.f19194a;
            }

            public final void invoke(GetRestoreCredentialResponse getRestoreCredentialResponse) {
                try {
                    CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController = CredentialProviderGetRestoreCredentialController.this;
                    Intrinsics.checkNotNull(getRestoreCredentialResponse);
                    q convertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(getRestoreCredentialResponse);
                    CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, callback, convertResponseToCredentialManager));
                } catch (Exception e7) {
                    CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(executor, callback, e7));
                }
            }
        }, 1);
        c2.getClass();
        c2.e(h.f24980a, aVar);
        c2.d(new androidx.credentials.playservices.b(cancellationSignal, executor, callback, 2));
    }
}
