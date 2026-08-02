package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.core.view.h0;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.IdentityCredentialApiHiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.Feature;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import d6.e;
import e6.m;
import e6.y;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0006*\u00016\b\u0001\u0018\u0000 :2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001:B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00022\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R4\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00198\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001a\u0010'\u0012\u0004\b,\u0010-\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R(\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001c\u0010.\u0012\u0004\b3\u0010-\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u001e\u00104\u0012\u0004\b5\u0010-R\u001a\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\f\n\u0004\b7\u00108\u0012\u0004\b9\u0010-¨\u0006;"}, d2 = {"Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "Lt0/p;", "Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lcom/google/android/gms/identitycredentials/GetCredentialResponse;", "Lt0/q;", "Lu0/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "e", "fromGmsException", "(Ljava/lang/Throwable;)Lu0/f;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "request", "Lt0/i;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(Lt0/p;Lt0/i;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Lt0/p;)Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/identitycredentials/GetCredentialResponse;)Lt0/q;", "Landroid/content/Context;", "Lt0/i;", "getCallback", "()Lt0/i;", "setCallback", "(Lt0/i;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$resultReceiver$1;", "getResultReceiver$annotations", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController extends CredentialProviderController<p, GetCredentialRequest, GetCredentialResponse, q, f> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "DigitalCredentialClient";
    public i callback;

    @Nullable
    private CancellationSignal cancellationSignal;

    @NotNull
    private final Context context;
    public Executor executor;

    @NotNull
    private final CredentialProviderGetDigitalCredentialController$resultReceiver$1 resultReceiver;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/credentials/playservices/controllers/GetRestoreCredential/CredentialProviderGetDigitalCredentialController$Companion;", "", "()V", "TAG", "", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = CredentialProviderGetDigitalCredentialController.this;
                CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
                Executor executor = CredentialProviderGetDigitalCredentialController.this.getExecutor();
                i callback = CredentialProviderGetDigitalCredentialController.this.getCallback();
                cancellationSignal = CredentialProviderGetDigitalCredentialController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderGetDigitalCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderGetDigitalCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final f fromGmsException(Throwable e7) {
        if (!(e7 instanceof e)) {
            return new g("Get digital credential failed, failure: " + e7);
        }
        int i5 = ((e) e7).f8245a.f4466a;
        if (i5 == 16) {
            return new u0.d(e7.getMessage());
        }
        if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(i5))) {
            return new u0.e(1, e7.getMessage());
        }
        return new g("Get digital credential failed, failure: " + e7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, Executor executor, i iVar, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1(executor, iVar, credentialProviderGetDigitalCredentialController.fromGmsException(e7)));
    }

    @NotNull
    public final i getCallback() {
        i iVar = this.callback;
        if (iVar != null) {
            return iVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        return null;
    }

    @NotNull
    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("executor");
        return null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, @Nullable Intent data) {
        q qVar;
        Bundle bundle;
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.INSTANCE;
        if (uniqueRequestCode != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            w0.m(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(resultCode, new Function2<CancellationSignal, Function0<? extends Unit>, Unit>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$handleResponse$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((CancellationSignal) obj, (Function0<Unit>) obj2);
                return Unit.f19194a;
            }

            public final void invoke(CancellationSignal cancellationSignal, Function0<Unit> f6) {
                Intrinsics.checkNotNullParameter(f6, "f");
                CredentialProviderController.Companion companion2 = CredentialProviderController.INSTANCE;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f6);
            }
        }, new CredentialProviderGetDigitalCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (data == null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$3(this));
            return;
        }
        Intrinsics.checkNotNullParameter(data, "intent");
        int i5 = Build.VERSION.SDK_INT;
        f fVar = null;
        if (i5 >= 34) {
            qVar = h0.b(data);
        } else {
            Intrinsics.checkNotNullParameter(data, "intent");
            Bundle bundle2 = data.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
            if (bundle2 != null) {
                Intrinsics.checkNotNullParameter(bundle2, "bundle");
                String string = bundle2.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE");
                if (string != null && (bundle = bundle2.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) != null) {
                    qVar = new q(rh.g.f(bundle, string));
                }
            }
            qVar = null;
        }
        if (qVar != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$4(this, qVar));
            return;
        }
        Intrinsics.checkNotNullParameter(data, "intent");
        if (i5 >= 34) {
            fVar = h0.a(data);
        } else {
            Intrinsics.checkNotNullParameter(data, "intent");
            int i10 = f.f24009a;
            Bundle bundle3 = data.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
            if (bundle3 != null) {
                Intrinsics.checkNotNullParameter(bundle3, "bundle");
                String string2 = bundle3.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                if (string2 == null) {
                    throw new IllegalArgumentException("Bundle was missing exception type.");
                }
                fVar = m4.g.A(bundle3.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
            }
        }
        CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$5(this, fVar));
    }

    public final void setCallback(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.callback = iVar;
    }

    public final void setExecutor(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public GetCredentialRequest convertRequestToPlayServices(@NotNull p request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        for (j jVar : request.f23734a) {
        }
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        return new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    @NotNull
    public q convertResponseToCredentialManager(@NotNull GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new q(rh.g.f(response.f4844a.f4833b, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(@NotNull p request, @NotNull i callback, @NotNull Executor executor, @Nullable final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        GetCredentialRequest request2 = convertRequestToPlayServices(request);
        Context context = this.context;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        b7.f fVar = new b7.f(context, null, b7.g.f3089a, d6.b.f8244d0, d6.f.f8246c);
        Intrinsics.checkNotNullParameter(request2, "request");
        m a7 = y.a();
        a7.f8725d = new Feature[]{l7.b.f19392a};
        h9.c cVar = new h9.c(13, false);
        cVar.f10430b = request2;
        a7.f8722a = cVar;
        a7.f8726e = 32701;
        w7.m c2 = fVar.c(0, a7.a());
        Intrinsics.checkNotNullExpressionValue(c2, "doRead(...)");
        a aVar = new a(new Function1<PendingGetCredentialHandle, Unit>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$invokePlayServices$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((PendingGetCredentialHandle) obj);
                return Unit.f19194a;
            }

            public final void invoke(PendingGetCredentialHandle pendingGetCredentialHandle) {
                Context context2;
                CredentialProviderGetDigitalCredentialController$resultReceiver$1 credentialProviderGetDigitalCredentialController$resultReceiver$1;
                Context context3;
                if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                    return;
                }
                context2 = this.context;
                Intent intent = new Intent(context2, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                intent.setFlags(65536);
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this;
                credentialProviderGetDigitalCredentialController$resultReceiver$1 = credentialProviderGetDigitalCredentialController.resultReceiver;
                intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController$resultReceiver$1));
                intent.putExtra(CredentialProviderBaseController.EXTRA_GET_CREDENTIAL_INTENT, pendingGetCredentialHandle.f4845a);
                context3 = this.context;
                context3.startActivity(intent);
            }
        }, 0 == true ? 1 : 0);
        c2.getClass();
        c2.e(h.f24980a, aVar);
        c2.d(new androidx.credentials.playservices.c(1, this, cancellationSignal, executor, callback));
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }
}
