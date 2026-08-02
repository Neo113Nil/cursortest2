package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import internal.J.N;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

/* loaded from: classes10.dex */
public final class HttpNegotiateAuthenticator {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f78614a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78615b;

    class a implements AccountManagerCallback<Account[]> {

        /* renamed from: a, reason: collision with root package name */
        private final c f78616a;

        public a(c cVar) {
            this.f78616a = cVar;
        }

        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture<Account[]> accountManagerFuture) {
            c cVar = this.f78616a;
            long j11 = cVar.f78622a;
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = HttpNegotiateAuthenticator.this;
            try {
                Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    Log.w(org.chromium.base.j.c("net_auth"), "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                    new l();
                    N.M0s8NeYn(j11, httpNegotiateAuthenticator, -341, null);
                    return;
                }
                if (result.length <= 1) {
                    Account account = result[0];
                    cVar.f78626e = account;
                    cVar.f78623b.getAuthToken(account, cVar.f78625d, cVar.f78624c, true, (AccountManagerCallback<Bundle>) httpNegotiateAuthenticator.new b(cVar), new Handler(ThreadUtils.a().getLooper()));
                    return;
                }
                int length = result.length;
                String c11 = org.chromium.base.j.c("net_auth");
                Locale locale = Locale.US;
                Log.w(c11, "ERR_MISSING_AUTH_CREDENTIALS: Found " + length + " accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.");
                new l();
                N.M0s8NeYn(j11, httpNegotiateAuthenticator, -341, null);
            } catch (AuthenticatorException | OperationCanceledException | IOException e11) {
                Log.w(org.chromium.base.j.c("net_auth"), "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e11);
                new l();
                N.M0s8NeYn(j11, httpNegotiateAuthenticator, -9, null);
            }
        }
    }

    class b implements AccountManagerCallback<Bundle> {

        /* renamed from: a, reason: collision with root package name */
        private final c f78618a;

        final class a extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f78620a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f78621b;

            a(b bVar, Context context) {
                this.f78620a = context;
                this.f78621b = bVar;
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                this.f78620a.unregisterReceiver(this);
                b bVar = this.f78621b;
                bVar.f78618a.f78623b.getAuthToken(bVar.f78618a.f78626e, bVar.f78618a.f78625d, bVar.f78618a.f78624c, true, (AccountManagerCallback<Bundle>) HttpNegotiateAuthenticator.this.new b(bVar.f78618a), (Handler) null);
            }
        }

        public b(c cVar) {
            this.f78618a = cVar;
        }

        @Override // android.accounts.AccountManagerCallback
        public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
            c cVar = this.f78618a;
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = HttpNegotiateAuthenticator.this;
            try {
                Bundle result = accountManagerFuture.getResult();
                if (!result.containsKey("intent")) {
                    HttpNegotiateAuthenticator.a(httpNegotiateAuthenticator, result, cVar);
                } else {
                    Context b11 = org.chromium.base.e.b();
                    org.chromium.base.e.d(b11, new a(this, b11), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e11) {
                Log.w(org.chromium.base.j.c("net_auth"), "ERR_UNEXPECTED: Error while attempting to obtain a token.", e11);
                new l();
                N.M0s8NeYn(cVar.f78622a, httpNegotiateAuthenticator, -9, null);
            }
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f78622a;

        /* renamed from: b, reason: collision with root package name */
        public final AccountManager f78623b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f78624c;

        /* renamed from: d, reason: collision with root package name */
        public final String f78625d;

        /* renamed from: e, reason: collision with root package name */
        public Account f78626e;

        c(long j11, AccountManager accountManager, Bundle bundle, String str) {
            this.f78622a = j11;
            this.f78623b = accountManager;
            this.f78624c = bundle;
            this.f78625d = str;
        }
    }

    protected HttpNegotiateAuthenticator(String str) {
        this.f78615b = str;
    }

    static void a(HttpNegotiateAuthenticator httpNegotiateAuthenticator, Bundle bundle, c cVar) {
        int i11;
        httpNegotiateAuthenticator.f78614a = bundle.getBundle("spnegoContext");
        int i12 = bundle.getInt("spnegoResult", 1);
        if (i12 != 0) {
            switch (i12) {
                case 2:
                    i11 = -3;
                    break;
                case 3:
                    i11 = -342;
                    break;
                case 4:
                    i11 = -320;
                    break;
                case 5:
                    i11 = -338;
                    break;
                case 6:
                    i11 = -339;
                    break;
                case 7:
                    i11 = -341;
                    break;
                case 8:
                    i11 = -344;
                    break;
                case 9:
                    i11 = -329;
                    break;
                default:
                    i11 = -9;
                    break;
            }
        } else {
            i11 = 0;
        }
        new l();
        N.M0s8NeYn(cVar.f78622a, httpNegotiateAuthenticator, i11, bundle.getString("authtoken"));
    }

    @CalledByNative
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    @CalledByNative
    final void getNextAuthToken(long j11, String str, String str2, boolean z11) {
        Context b11 = org.chromium.base.e.b();
        String[] strArr = {"SPNEGO"};
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("incomingAuthToken", str2);
        }
        Bundle bundle2 = this.f78614a;
        if (bundle2 != null) {
            bundle.putBundle("spnegoContext", bundle2);
        }
        bundle.putBoolean("canDelegate", z11);
        AccountManager accountManager = AccountManager.get(b11);
        c cVar = new c(j11, accountManager, bundle, Nk.a.b("SPNEGO:HOSTBASED:", str));
        Map<Activity, Integer> map = ApplicationStatus.f78454b;
        accountManager.getAccountsByTypeAndFeatures(this.f78615b, strArr, new a(cVar), new Handler(ThreadUtils.a().getLooper()));
    }
}
