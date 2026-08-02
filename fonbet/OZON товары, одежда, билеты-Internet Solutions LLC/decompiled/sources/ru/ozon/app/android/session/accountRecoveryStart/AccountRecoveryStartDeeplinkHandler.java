package ru.ozon.app.android.session.accountRecoveryStart;

import Fb0.b;
import GZ.g;
import GZ.j;
import IZ.a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/session/accountRecoveryStart/AccountRecoveryStartDeeplinkHandler;", "LIZ/a;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "LGZ/g;", "ozonRouter", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;LGZ/g;LOb0/a;)V", "Landroid/content/Context;", "context", "", "link", "LpZ/f;", "startFlowForSignInUser", "(Landroid/content/Context;Ljava/lang/String;)LpZ/f;", "startFlowForAnonymousUser", "", "collectAccountRecoveryFlowEvents", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "LGZ/g;", "LOb0/a;", "Lxe/M;", "scope", "Lxe/M;", "Lxe/B0;", "accountRecoveryFlowEventsJob", "Lxe/B0;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccountRecoveryStartDeeplinkHandler implements a {
    private B0 accountRecoveryFlowEventsJob;

    @NotNull
    private final AuthDestinationInterceptor authDestinationInterceptor;

    @NotNull
    private final Ob0.a ozonIdAppApi;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final M scope;

    public AccountRecoveryStartDeeplinkHandler(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull g ozonRouter, @NotNull Ob0.a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.authDestinationInterceptor = authDestinationInterceptor;
        this.ozonRouter = ozonRouter;
        this.ozonIdAppApi = ozonIdAppApi;
        this.scope = CoroutineUtilsKt.getSafeScope();
    }

    private final void collectAccountRecoveryFlowEvents() {
        if (this.accountRecoveryFlowEventsJob != null) {
            return;
        }
        this.accountRecoveryFlowEventsJob = C10727i.c(this.scope, null, null, new AccountRecoveryStartDeeplinkHandler$collectAccountRecoveryFlowEvents$1(this, null), 3);
    }

    private final f startFlowForAnonymousUser(Context context, final String link) {
        return AuthDestinationInterceptor.createAuthDestination$default(this.authDestinationInterceptor, context, null, null, null, new b.a(link) { // from class: ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$startFlowForAnonymousUser$1
            private final String url;

            {
                this.url = link;
            }

            @Override // Fb0.b.a
            public String getUrl() {
                return this.url;
            }
        }, 14, null);
    }

    private final f startFlowForSignInUser(Context context, String link) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            f.Companion.getClass();
            return f.b.a();
        }
        collectAccountRecoveryFlowEvents();
        return new C8880a(this.ozonIdAppApi.D(new AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1(activity, link)));
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getAuthority(), "ozonid") && b11.getPathSegments().size() == 1 && Intrinsics.d(b11.getLastPathSegment(), "account-recovery-start");
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String uri = route.d().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (this.ozonIdAppApi.I()) {
            return startFlowForSignInUser(context, uri);
        }
        f startFlowForAnonymousUser = startFlowForAnonymousUser(context, uri);
        if (startFlowForAnonymousUser != null) {
            return startFlowForAnonymousUser;
        }
        f.Companion.getClass();
        return f.b.a();
    }
}
