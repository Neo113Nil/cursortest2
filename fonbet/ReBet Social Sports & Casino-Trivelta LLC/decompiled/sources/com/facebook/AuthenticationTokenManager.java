package com.facebook;

import T7.Y;
import a1.C1908a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g6.C4331C;
import g6.C4349i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class AuthenticationTokenManager {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30267d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static AuthenticationTokenManager f30268e;

    /* renamed from: a, reason: collision with root package name */
    public final C1908a f30269a;

    /* renamed from: b, reason: collision with root package name */
    public final C4349i f30270b;

    /* renamed from: c, reason: collision with root package name */
    public AuthenticationToken f30271c;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f30268e;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f30268e;
                if (authenticationTokenManager == null) {
                    C1908a b10 = C1908a.b(C4331C.l());
                    Intrinsics.checkNotNullExpressionValue(b10, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(b10, new C4349i());
                    AuthenticationTokenManager.f30268e = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }

        public a() {
        }
    }

    public AuthenticationTokenManager(C1908a localBroadcastManager, C4349i authenticationTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.f30269a = localBroadcastManager;
        this.f30270b = authenticationTokenCache;
    }

    public final AuthenticationToken c() {
        return this.f30271c;
    }

    public final void d(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        Intent intent = new Intent(C4331C.l(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken2);
        this.f30269a.d(intent);
    }

    public final void e(AuthenticationToken authenticationToken) {
        f(authenticationToken, true);
    }

    public final void f(AuthenticationToken authenticationToken, boolean z10) {
        AuthenticationToken c10 = c();
        this.f30271c = authenticationToken;
        if (z10) {
            if (authenticationToken != null) {
                this.f30270b.b(authenticationToken);
            } else {
                this.f30270b.a();
                Y y10 = Y.f11042a;
                Y.i(C4331C.l());
            }
        }
        if (Y.e(c10, authenticationToken)) {
            return;
        }
        d(c10, authenticationToken);
    }
}
