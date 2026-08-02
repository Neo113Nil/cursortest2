package ru.ozon.app.android.account.authEvents;

import GZ.g;
import Gb0.d;
import Ib0.h;
import Ib0.i;
import Ob0.a;
import Sc.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.authEvents.data.AuthStatusRepository;
import ru.ozon.app.android.navigation.newrouter.RouterExtKt;
import ru.ozon.app.android.network.auth.AuthNetworkService;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u0010*\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/account/authEvents/AuthEventsCollectorImpl;", "Lru/ozon/app/android/account/authEvents/AuthEventsCollector;", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "alreadyAuthEvents", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "authNetworkService", "LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "authStatusRepository", "<init>", "(LGZ/g;Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;Lru/ozon/app/android/network/auth/AuthNetworkService;LOb0/a;Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;)V", "LIb0/i;", "signInResult", "", "onSignIn", "(LIb0/i;)V", "LIb0/h;", "logoutResult", "onLogout", "(LIb0/h;)V", "Lru/ozon/app/android/account/authEvents/AuthResultActions;", "redirectIfNeed", "(Lru/ozon/app/android/account/authEvents/AuthResultActions;LIb0/i;)V", "callActions", "collect", "()V", "LGZ/g;", "Lru/ozon/app/android/account/authEvents/AlreadyAuthEvents;", "Lru/ozon/app/android/network/auth/AuthNetworkService;", "LOb0/a;", "Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "authResultActions", "Lru/ozon/app/android/account/authEvents/AuthResultActions;", "getAuthResultActions", "()Lru/ozon/app/android/account/authEvents/AuthResultActions;", "setAuthResultActions", "(Lru/ozon/app/android/account/authEvents/AuthResultActions;)V", "Lxe/M;", "scope", "Lxe/M;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthEventsCollectorImpl implements AuthEventsCollector {

    @NotNull
    private final AlreadyAuthEvents alreadyAuthEvents;

    @NotNull
    private final AuthNetworkService authNetworkService;
    private AuthResultActions authResultActions;

    @NotNull
    private final AuthStatusRepository authStatusRepository;

    @NotNull
    private final a ozonIdAppApi;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final M scope;

    public AuthEventsCollectorImpl(@NotNull g ozonRouter, @NotNull AlreadyAuthEvents alreadyAuthEvents, @NotNull AuthNetworkService authNetworkService, @NotNull a ozonIdAppApi, @NotNull AuthStatusRepository authStatusRepository) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(alreadyAuthEvents, "alreadyAuthEvents");
        Intrinsics.checkNotNullParameter(authNetworkService, "authNetworkService");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        Intrinsics.checkNotNullParameter(authStatusRepository, "authStatusRepository");
        this.ozonRouter = ozonRouter;
        this.alreadyAuthEvents = alreadyAuthEvents;
        this.authNetworkService = authNetworkService;
        this.ozonIdAppApi = ozonIdAppApi;
        this.authStatusRepository = authStatusRepository;
        this.scope = CoroutineUtilsKt.getSafeScope();
    }

    private final void callActions(AuthResultActions authResultActions, i iVar) {
        if (iVar instanceof i.a) {
            this.alreadyAuthEvents.emit(authResultActions.getStartDeeplink(), authResultActions.getSuccessRedirectDeeplink());
        } else if (iVar instanceof i.c) {
            if (iVar.a() == d.CROSS_APP || iVar.a() == d.INSTANT_LOGIN) {
                RouterExtKt.clearBackStack(this.ozonRouter);
            }
            Function0<Unit> onSuccess = authResultActions.getOnSuccess();
            if (onSuccess != null) {
                onSuccess.invoke();
            }
        } else {
            if (!(iVar instanceof i.b)) {
                throw new o();
            }
            Function0<Unit> onCancel = authResultActions.getOnCancel();
            if (onCancel != null) {
                onCancel.invoke();
            }
        }
        Function0<Unit> onFinal = authResultActions.getOnFinal();
        if (onFinal != null) {
            onFinal.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLogout(h logoutResult) {
        Function0<Unit> onFinal;
        Function0<Unit> onSuccess;
        if ((logoutResult instanceof h.a) || (logoutResult instanceof h.b)) {
            return;
        }
        if (!(logoutResult instanceof h.c)) {
            throw new o();
        }
        this.authNetworkService.clearUserDataOnLogout(true);
        AuthResultActions authResultActions = getAuthResultActions();
        if (authResultActions != null && (onSuccess = authResultActions.getOnSuccess()) != null) {
            onSuccess.invoke();
        }
        AuthResultActions authResultActions2 = getAuthResultActions();
        if (authResultActions2 != null && (onFinal = authResultActions2.getOnFinal()) != null) {
            onFinal.invoke();
        }
        setAuthResultActions(null);
        C10727i.c(this.scope, null, null, new AuthEventsCollectorImpl$onLogout$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSignIn(i signInResult) {
        AuthResultActions authResultActions = getAuthResultActions();
        if (authResultActions != null) {
            callActions(authResultActions, signInResult);
        }
        AuthResultActions authResultActions2 = getAuthResultActions();
        if (authResultActions2 != null) {
            redirectIfNeed(authResultActions2, signInResult);
        }
        setAuthResultActions(null);
        C10727i.c(this.scope, null, null, new AuthEventsCollectorImpl$onSignIn$1(this, null), 3);
    }

    private final void redirectIfNeed(AuthResultActions authResultActions, i iVar) {
        String b11;
        Map<String, Object> successRedirectProperties;
        if (iVar instanceof i.a) {
            b11 = authResultActions.getSuccessRedirectDeeplink();
            successRedirectProperties = authResultActions.getSuccessRedirectProperties();
        } else if (iVar instanceof i.b) {
            b11 = authResultActions.getFailureRedirectDeeplink();
            successRedirectProperties = null;
        } else {
            if (!(iVar instanceof i.c)) {
                throw new o();
            }
            b11 = ((i.c) iVar).b();
            if (b11 == null) {
                b11 = authResultActions.getSuccessRedirectDeeplink();
            }
            successRedirectProperties = authResultActions.getSuccessRedirectProperties();
        }
        g gVar = this.ozonRouter;
        if (b11 == null) {
            return;
        }
        if (successRedirectProperties == null) {
            successRedirectProperties = U.c();
        }
        g.a.a(gVar, b11, successRedirectProperties, null, 4);
    }

    @Override // ru.ozon.app.android.account.authEvents.AuthEventsCollector
    public void collect() {
        C10727i.c(this.scope, null, null, new AuthEventsCollectorImpl$collect$1(this, null), 3);
        C10727i.c(this.scope, null, null, new AuthEventsCollectorImpl$collect$2(this, null), 3);
    }

    public AuthResultActions getAuthResultActions() {
        return this.authResultActions;
    }

    @Override // ru.ozon.app.android.account.authEvents.AuthEventsCollector
    public void setAuthResultActions(AuthResultActions authResultActions) {
        this.authResultActions = authResultActions;
    }
}
