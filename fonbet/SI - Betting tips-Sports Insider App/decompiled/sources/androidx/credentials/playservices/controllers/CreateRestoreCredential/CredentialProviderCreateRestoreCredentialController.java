package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import a6.f;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
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
import org.json.JSONObject;
import t0.c;
import t0.g;
import t0.i;
import w7.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/credentials/playservices/controllers/CreateRestoreCredential/CredentialProviderCreateRestoreCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lt0/g;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "Lt0/c;", "Lu0/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "Lt0/i;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "invokePlayServices", "(Lt0/g;Lt0/i;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lt0/g;)Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)Lt0/c;", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<g, CreateRestoreCredentialRequest, CreateRestoreCredentialResponse, c, u0.c> {

    @NotNull
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, u0.b] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, u0.b] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, u0.c] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, u0.b] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, u0.c] */
    public static final void invokePlayServices$lambda$1(CancellationSignal cancellationSignal, Executor executor, i iVar, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new u0.b("Create restore credential failed for unknown reason, failure: " + e7.getMessage(), 3);
        if (e7 instanceof e) {
            Status status = ((e) e7).f8245a;
            switch (status.f4466a) {
                case 40201:
                    objectRef.element = new u0.b("The restore credential internal service had a failure, failure: " + e7.getMessage(), 3);
                    break;
                case 40202:
                    v0.a domError = new v0.a(3);
                    String errorMessage = "The request did not match the fido spec, failure: " + e7.getMessage();
                    Intrinsics.checkNotNullParameter(domError, "domError");
                    Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                    objectRef.element = new u0.b(errorMessage, "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR");
                    break;
                case 40203:
                    Intrinsics.checkNotNullParameter("E2ee is not available on the device. Check whether the backup and screen lock are enabled.", "errorMessage");
                    objectRef.element = new u0.b("E2ee is not available on the device. Check whether the backup and screen lock are enabled.", "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION");
                    break;
                default:
                    objectRef.element = new u0.b("The restore credential service failed with unsupported status code, failure: " + e7.getMessage() + ", status code: " + status.f4466a, 3);
                    break;
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1(executor, iVar, objectRef));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ CreateRestoreCredentialRequest convertRequestToPlayServices(g gVar) {
        if (gVar == null) {
            return convertRequestToPlayServices2((g) null);
        }
        throw new ClassCastException();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public c convertResponseToCredentialManager(@NotNull CreateRestoreCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Bundle data = response.f4434a;
        Intrinsics.checkNotNullParameter(data, "data");
        String jsonString = data.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE");
        if (jsonString == null) {
            throw new u0.b("The response bundle did not contain the response data. This should not happen.", 3);
        }
        t0.e eVar = new t0.e(data, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                return eVar;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(g gVar, i iVar, Executor executor, CancellationSignal cancellationSignal) {
        if (gVar != null) {
            throw new ClassCastException();
        }
        invokePlayServices2((g) null, iVar, executor, cancellationSignal);
    }

    @NotNull
    /* renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public CreateRestoreCredentialRequest convertRequestToPlayServices2(@NotNull g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(@NotNull g request, @NotNull final i callback, @NotNull final Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        CreateRestoreCredentialRequest request2 = convertRequestToPlayServices2(request);
        f u10 = rh.g.u(this.context);
        Intrinsics.checkNotNullParameter(request2, "request");
        m a7 = y.a();
        a7.f8725d = new Feature[]{g7.a.f9881b};
        h9.c cVar = new h9.c(2, false);
        cVar.f10430b = request2;
        a7.f8722a = cVar;
        a7.f8726e = 1693;
        w7.m c2 = u10.c(0, a7.a());
        Intrinsics.checkNotNullExpressionValue(c2, "doRead(...)");
        a aVar = new a((int) (0 == true ? 1 : 0), (Object) new Function1<CreateRestoreCredentialResponse, Unit>() { // from class: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1

            /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
                final /* synthetic */ i $callback;
                final /* synthetic */ Executor $executor;
                final /* synthetic */ c $response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(Executor executor, i iVar, c cVar) {
                    super(0);
                    this.$executor = executor;
                    this.$callback = iVar;
                    this.$response = cVar;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m38invoke();
                    return Unit.f19194a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m38invoke() {
                    this.$executor.execute(new b(this.$callback, this.$response, 0));
                }
            }

            /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1$2, reason: invalid class name */
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
                    iVar.a(new u0.b(exc.getMessage(), 3));
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m40invoke();
                    return Unit.f19194a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m40invoke() {
                    this.$executor.execute(new b(this.$callback, this.$e, 1));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CreateRestoreCredentialResponse) obj);
                return Unit.f19194a;
            }

            public final void invoke(CreateRestoreCredentialResponse createRestoreCredentialResponse) {
                try {
                    CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController = CredentialProviderCreateRestoreCredentialController.this;
                    Intrinsics.checkNotNull(createRestoreCredentialResponse);
                    c convertResponseToCredentialManager = credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(createRestoreCredentialResponse);
                    CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, callback, convertResponseToCredentialManager));
                } catch (Exception e7) {
                    CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
                    CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(executor, callback, e7));
                }
            }
        });
        c2.getClass();
        c2.e(h.f24980a, aVar);
        c2.d(new androidx.credentials.playservices.b(cancellationSignal, executor, callback, 1));
    }
}
