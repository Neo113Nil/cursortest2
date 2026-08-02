package com.vk.id;

import Sc.o;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.VKIDAuthFail;
import com.vk.id.auth.AuthCodeData;
import com.vk.id.auth.VKIDAuthCallback;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.AuthCallbacksHolder;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.store.InternalVKIDPrefsStore;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import com.vk.id.logout.VKIDLoggerOut;
import com.vk.id.storage.InternalVKIDTokenStorage;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b&\u0010'J&\u0010+\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0080@¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/vk/id/AuthResultHandler;", "", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "callbacksHolder", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "prefsStore", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/TokensHandler;", "tokensHandler", "Lcom/vk/id/logout/VKIDLoggerOut;", "loggerOut", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "<init>", "(Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/internal/auth/AuthCallbacksHolder;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/store/InternalVKIDPrefsStore;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/TokensHandler;Lcom/vk/id/logout/VKIDLoggerOut;Lcom/vk/id/storage/InternalVKIDTokenStorage;)V", "Lcom/vk/id/internal/auth/AuthResult$Success;", "oauth", "Lkotlin/Function0;", "", "onFail", "handleOauth", "(Lcom/vk/id/internal/auth/AuthResult$Success;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/internal/auth/AuthResult;", "Lcom/vk/id/VKIDAuthFail;", "toVKIDAuthFail", "(Lcom/vk/id/internal/auth/AuthResult;)Lcom/vk/id/VKIDAuthFail;", "Lcom/vk/id/AccessToken;", "token", "emitAuthSuccess", "(Lcom/vk/id/AccessToken;)V", "fail", "emitAuthFail", "(Lcom/vk/id/VKIDAuthFail;Lkotlin/jvm/functions/Function0;)V", "authResult", "handle$vkid_release", "(Lcom/vk/id/internal/auth/AuthResult;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "handle", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/auth/AuthCallbacksHolder;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/store/InternalVKIDPrefsStore;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/TokensHandler;", "Lcom/vk/id/logout/VKIDLoggerOut;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthResultHandler {

    @NotNull
    private final VKIDApiService api;

    @NotNull
    private final AuthCallbacksHolder callbacksHolder;

    @NotNull
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final VKIDLoggerOut loggerOut;

    @NotNull
    private final InternalVKIDPrefsStore prefsStore;

    @NotNull
    private final ServiceCredentials serviceCredentials;

    @NotNull
    private final InternalVKIDTokenStorage tokenStorage;

    @NotNull
    private final TokensHandler tokensHandler;

    public AuthResultHandler(@NotNull VKIDCoroutinesDispatchers dispatchers, @NotNull AuthCallbacksHolder callbacksHolder, @NotNull InternalVKIDDeviceIdProvider deviceIdProvider, @NotNull InternalVKIDPrefsStore prefsStore, @NotNull ServiceCredentials serviceCredentials, @NotNull VKIDApiService api, @NotNull TokensHandler tokensHandler, @NotNull VKIDLoggerOut loggerOut, @NotNull InternalVKIDTokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(callbacksHolder, "callbacksHolder");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(prefsStore, "prefsStore");
        Intrinsics.checkNotNullParameter(serviceCredentials, "serviceCredentials");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(tokensHandler, "tokensHandler");
        Intrinsics.checkNotNullParameter(loggerOut, "loggerOut");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        this.dispatchers = dispatchers;
        this.callbacksHolder = callbacksHolder;
        this.deviceIdProvider = deviceIdProvider;
        this.prefsStore = prefsStore;
        this.serviceCredentials = serviceCredentials;
        this.api = api;
        this.tokensHandler = tokensHandler;
        this.loggerOut = loggerOut;
        this.tokenStorage = tokenStorage;
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("AuthResultHandler", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("AuthResultHandler");
    }

    private final void emitAuthFail(VKIDAuthFail fail, Function0<Unit> onFail) {
        Iterator<T> it = this.callbacksHolder.getAll().iterator();
        while (it.hasNext()) {
            ((VKIDAuthCallback) it.next()).onFail(fail);
        }
        onFail.invoke();
        this.callbacksHolder.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitAuthSuccess(AccessToken token) {
        Iterator<T> it = this.callbacksHolder.getAll().iterator();
        while (it.hasNext()) {
            ((VKIDAuthCallback) it.next()).onAuth(token);
        }
        this.callbacksHolder.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x019f, code lost:
    
        if (com.vk.id.TokensHandler.handle$default(r3, (com.vk.id.internal.auth.VKIDTokenPayload) r1, r8, r8, false, r10, 8, null) == r4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (r2 == r4) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleOauth(AuthResult.Success success, Function0<Unit> function0, d<? super Unit> dVar) {
        AuthResultHandler$handleOauth$1 authResultHandler$handleOauth$1;
        int i11;
        AuthResultHandler authResultHandler;
        AuthResult.Success success2;
        Function0<Unit> function02;
        String str;
        AuthResult.OAuth oauth;
        Function0<Unit> function03;
        Object f26106a;
        AuthResultHandler authResultHandler2;
        if (dVar instanceof AuthResultHandler$handleOauth$1) {
            authResultHandler$handleOauth$1 = (AuthResultHandler$handleOauth$1) dVar;
            int i12 = authResultHandler$handleOauth$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                authResultHandler$handleOauth$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                AuthResultHandler$handleOauth$1 authResultHandler$handleOauth$12 = authResultHandler$handleOauth$1;
                Object obj = authResultHandler$handleOauth$12.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = authResultHandler$handleOauth$12.label;
                if (i11 != 0) {
                    s.b(obj);
                    I io2 = this.dispatchers.getIo();
                    AuthResultHandler$handleOauth$2 authResultHandler$handleOauth$2 = new AuthResultHandler$handleOauth$2(this, success, null);
                    authResultHandler$handleOauth$12.L$0 = this;
                    authResultHandler$handleOauth$12.L$1 = success;
                    authResultHandler$handleOauth$12.L$2 = function0;
                    authResultHandler$handleOauth$12.label = 1;
                    obj = C10727i.f(io2, authResultHandler$handleOauth$2, authResultHandler$handleOauth$12);
                    if (obj != aVar) {
                        authResultHandler = this;
                        success2 = success;
                        function02 = function0;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        f26106a = authResultHandler$handleOauth$12.L$2;
                        function03 = (Function0) authResultHandler$handleOauth$12.L$1;
                        authResultHandler2 = (AuthResultHandler) authResultHandler$handleOauth$12.L$0;
                        s.b(obj);
                        AccessToken accessToken = (AccessToken) obj;
                        r.Companion companion = r.INSTANCE;
                        if (!(f26106a instanceof r.b)) {
                            TokensHandler tokensHandler = authResultHandler2.tokensHandler;
                            AuthResultHandler$handleOauth$5$1 authResultHandler$handleOauth$5$1 = new AuthResultHandler$handleOauth$5$1(accessToken, authResultHandler2, null);
                            A30.d dVar2 = new A30.d(authResultHandler2, function03, 1);
                            authResultHandler$handleOauth$12.L$0 = f26106a;
                            authResultHandler$handleOauth$12.L$1 = null;
                            authResultHandler$handleOauth$12.L$2 = null;
                            authResultHandler$handleOauth$12.label = 4;
                        }
                        return Unit.f71690a;
                    }
                    function02 = (Function0) authResultHandler$handleOauth$12.L$1;
                    AuthResultHandler authResultHandler3 = (AuthResultHandler) authResultHandler$handleOauth$12.L$0;
                    s.b(obj);
                    authResultHandler = authResultHandler3;
                    function03 = function02;
                    f26106a = ((r) obj).getF26106a();
                    Throwable b11 = r.b(f26106a);
                    if (b11 != null) {
                        authResultHandler.emitAuthFail(new VKIDAuthFail.FailedApiCall(Nk.a.b("Failed code to token exchange api call: ", b11.getMessage()), b11), function03);
                    }
                    I io3 = authResultHandler.dispatchers.getIo();
                    AuthResultHandler$handleOauth$accessToken$1 authResultHandler$handleOauth$accessToken$1 = new AuthResultHandler$handleOauth$accessToken$1(authResultHandler, null);
                    authResultHandler$handleOauth$12.L$0 = authResultHandler;
                    authResultHandler$handleOauth$12.L$1 = function03;
                    authResultHandler$handleOauth$12.L$2 = f26106a;
                    authResultHandler$handleOauth$12.label = 3;
                    obj = C10727i.f(io3, authResultHandler$handleOauth$accessToken$1, authResultHandler$handleOauth$12);
                    if (obj != aVar) {
                        authResultHandler2 = authResultHandler;
                        AccessToken accessToken2 = (AccessToken) obj;
                        r.Companion companion2 = r.INSTANCE;
                        if (!(f26106a instanceof r.b)) {
                        }
                        return Unit.f71690a;
                    }
                    return aVar;
                }
                function02 = (Function0) authResultHandler$handleOauth$12.L$2;
                AuthResult.Success success3 = (AuthResult.Success) authResultHandler$handleOauth$12.L$1;
                AuthResultHandler authResultHandler4 = (AuthResultHandler) authResultHandler$handleOauth$12.L$0;
                s.b(obj);
                success2 = success3;
                authResultHandler = authResultHandler4;
                Pair pair = (Pair) obj;
                str = (String) pair.a();
                String str2 = (String) pair.b();
                oauth = success2.getOauth();
                if (Intrinsics.d(str, oauth == null ? oauth.getState() : null)) {
                    InternalVKIDLogger internalVKIDLogger = authResultHandler.logger;
                    AuthResult.OAuth oauth2 = success2.getOauth();
                    internalVKIDLogger.error(Sh.b.c("Invalid oauth state, want ", str, " but received ", oauth2 != null ? oauth2.getState() : null), null);
                    authResultHandler.emitAuthFail(new VKIDAuthFail.FailedOAuthState("Invalid state"), function02);
                    return Unit.f71690a;
                }
                Iterator<T> it = authResultHandler.callbacksHolder.getAll().iterator();
                while (it.hasNext()) {
                    ((VKIDAuthCallback) it.next()).onAuthCode(new AuthCodeData(success2.getOauth().getCode(), success2.getDeviceId()), h.K(str2));
                }
                if (h.K(str2)) {
                    authResultHandler.callbacksHolder.clear();
                    return Unit.f71690a;
                }
                I io4 = authResultHandler.dispatchers.getIo();
                AuthResultHandler$handleOauth$callResult$1 authResultHandler$handleOauth$callResult$1 = new AuthResultHandler$handleOauth$callResult$1(authResultHandler, success2, str2, str, null);
                authResultHandler$handleOauth$12.L$0 = authResultHandler;
                authResultHandler$handleOauth$12.L$1 = function02;
                authResultHandler$handleOauth$12.L$2 = null;
                authResultHandler$handleOauth$12.label = 2;
                obj = C10727i.f(io4, authResultHandler$handleOauth$callResult$1, authResultHandler$handleOauth$12);
            }
        }
        authResultHandler$handleOauth$1 = new AuthResultHandler$handleOauth$1(this, dVar);
        AuthResultHandler$handleOauth$1 authResultHandler$handleOauth$122 = authResultHandler$handleOauth$1;
        Object obj2 = authResultHandler$handleOauth$122.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = authResultHandler$handleOauth$122.label;
        if (i11 != 0) {
        }
        Pair pair2 = (Pair) obj2;
        str = (String) pair2.a();
        String str22 = (String) pair2.b();
        oauth = success2.getOauth();
        if (Intrinsics.d(str, oauth == null ? oauth.getState() : null)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleOauth$lambda$3$lambda$2(AuthResultHandler authResultHandler, Function0 function0, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        authResultHandler.emitAuthFail(new VKIDAuthFail.FailedApiCall("Failed to fetch user data", it), function0);
        return Unit.f71690a;
    }

    private final VKIDAuthFail toVKIDAuthFail(AuthResult authResult) {
        if (authResult instanceof AuthResult.Canceled) {
            return new VKIDAuthFail.Canceled(((AuthResult.Canceled) authResult).getMessage());
        }
        if (authResult instanceof AuthResult.NoBrowserAvailable) {
            AuthResult.NoBrowserAvailable noBrowserAvailable = (AuthResult.NoBrowserAvailable) authResult;
            return new VKIDAuthFail.NoBrowserAvailable(noBrowserAvailable.getMessage(), noBrowserAvailable.getError());
        }
        if (authResult instanceof AuthResult.AuthActiviyResultFailed) {
            AuthResult.AuthActiviyResultFailed authActiviyResultFailed = (AuthResult.AuthActiviyResultFailed) authResult;
            return new VKIDAuthFail.FailedRedirectActivity(authActiviyResultFailed.getMessage(), authActiviyResultFailed.getError());
        }
        if (authResult instanceof AuthResult.Success) {
            throw new IllegalStateException("AuthResult is Success and cannot be converted to fail!");
        }
        throw new o();
    }

    public final Object handle$vkid_release(@NotNull AuthResult authResult, @NotNull Function0<Unit> function0, @NotNull d<? super Unit> dVar) {
        if (this.callbacksHolder.isEmpty()) {
            return Unit.f71690a;
        }
        if (!(authResult instanceof AuthResult.Success)) {
            emitAuthFail(toVKIDAuthFail(authResult), function0);
            this.prefsStore.clear();
            return Unit.f71690a;
        }
        AuthResult.Success success = (AuthResult.Success) authResult;
        if (success.getOauth() != null) {
            Object handleOauth = handleOauth(success, function0, dVar);
            return handleOauth == Wc.a.COROUTINE_SUSPENDED ? handleOauth : Unit.f71690a;
        }
        emitAuthFail(new VKIDAuthFail.FailedOAuth("OAuth provider response does not have necessary OAuth data."), function0);
        return Unit.f71690a;
    }
}
