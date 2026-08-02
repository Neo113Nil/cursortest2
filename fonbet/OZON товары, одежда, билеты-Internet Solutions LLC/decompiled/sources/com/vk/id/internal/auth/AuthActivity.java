package com.vk.id.internal.auth;

import A50.b;
import A60.a;
import Aa.C2374a;
import K1.G;
import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.c;
import com.vk.id.VKID;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.web.ContextUtils;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import k70.C7600a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import na.C8478a;
import na.C8479b;
import na.d;
import org.jetbrains.annotations.NotNull;
import s.C9556d;
import s.f;
import s.g;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u00011\b\u0001\u0018\u0000 42\u00020\u0001:\u00014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ*\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010\u001f\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0001¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\rR\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010#R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/vk/id/internal/auth/AuthActivity;", "Landroid/app/Activity;", "<init>", "()V", "", "onStop", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onPause", "outState", "onSaveInstanceState", "finish", "processIntent", "data", "onOauthResult", "Landroid/net/Uri;", "uri", "Lcom/vk/id/internal/auth/AuthResult;", "parseOAuthResult", "(Landroid/net/Uri;)Lcom/vk/id/internal/auth/AuthResult;", "handlePayload", "", "isIntentWithAuthRequest", "(Landroid/content/Intent;)Z", "isIntentWithAuthResult", "handleStartAuth", "launchAuth", "authWasStarted", "Z", "isWaitingForAuthResult", "authIntent", "Landroid/content/Intent;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "shouldReportCustomTabsPerformance", "Ls/f;", "customTabsServiceConnection", "Ls/f;", "Ls/g;", "customTabsSession", "Ls/g;", "com/vk/id/internal/auth/AuthActivity$callback$1", "callback", "Lcom/vk/id/internal/auth/AuthActivity$callback$1;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthActivity extends Activity {
    private Intent authIntent;
    private boolean authWasStarted;

    @NotNull
    private final AuthActivity$callback$1 callback;
    private f customTabsServiceConnection;
    private g customTabsSession;
    private boolean isWaitingForAuthResult;

    @NotNull
    private final InternalVKIDLogger logger;
    private boolean shouldReportCustomTabsPerformance;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vk/id/internal/auth/AuthActivity$Companion;", "", "<init>", "()V", "PERFORMANCE_KEY_CUSTOM_TABS", "", "KEY_AUTH_INTENT", "KEY_START_AUTH", "KEY_WAITING_FOR_AUTH_RESULT", "startForAuth", "", "context", "Landroid/content/Context;", "authIntent", "Landroid/content/Intent;", "startForAuth$vkid_release", "createRedirectUriHandlingIntent", "responseUri", "Landroid/net/Uri;", "createRedirectUriHandlingIntent$vkid_release", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createRedirectUriHandlingIntent$vkid_release(@NotNull Context context, @NotNull Uri responseUri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(responseUri, "responseUri");
            Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
            intent.setData(responseUri);
            intent.addFlags(0);
            return intent;
        }

        public final void startForAuth$vkid_release(@NotNull Context context, @NotNull Intent authIntent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(authIntent, "authIntent");
            Intent putExtra = new Intent(context, (Class<?>) AuthActivity.class).putExtra("KEY_AUTH_INTENT", authIntent).putExtra("KEY_START_AUTH", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
            ContextUtils.INSTANCE.addNewTaskFlag(putExtra, context);
            putExtra.addFlags(65536);
            context.startActivity(putExtra);
        }

        private Companion() {
        }
    }

    public AuthActivity() {
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("AuthActivity", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("AuthActivity");
        this.shouldReportCustomTabsPerformance = true;
        this.callback = new AuthActivity$callback$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finish$lambda$12(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit finish$lambda$13(AuthActivity authActivity) {
        authActivity.setResult(-1);
        authActivity.overridePendingTransition(0, 0);
        return Unit.f71690a;
    }

    private final AuthResult handlePayload(Uri uri) {
        String queryParameter = uri.getQueryParameter("code");
        String queryParameter2 = uri.getQueryParameter("state");
        String queryParameter3 = uri.getQueryParameter("device_id");
        AuthResult.OAuth oAuth = null;
        if (queryParameter3 == null) {
            return new AuthResult.AuthActiviyResultFailed("No device id", null);
        }
        if (queryParameter != null && queryParameter2 != null) {
            oAuth = new AuthResult.OAuth(queryParameter, queryParameter2);
        }
        return new AuthResult.Success(oAuth, queryParameter3);
    }

    private final boolean handleStartAuth(Intent intent) {
        Intent intent2;
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("KEY_AUTH_INTENT", Intent.class);
            intent2 = (Intent) parcelableExtra;
        } else {
            intent2 = (Intent) intent.getParcelableExtra("KEY_AUTH_INTENT");
        }
        this.authIntent = intent2;
        try {
            String b11 = C9556d.b(this);
            if (b11 != null) {
                Intent intent3 = this.authIntent;
                Intrinsics.f(intent3);
                if (Intrinsics.d(intent3.getPackage(), b11)) {
                    VKID.INSTANCE.getInstance().getPerformanceTracker().startTracking("CustomTabsAuth");
                    AuthActivity$handleStartAuth$1 authActivity$handleStartAuth$1 = new AuthActivity$handleStartAuth$1(this);
                    this.customTabsServiceConnection = authActivity$handleStartAuth$1;
                    C9556d.a(this, b11, authActivity$handleStartAuth$1);
                    return true;
                }
            }
            Intent intent4 = this.authIntent;
            Intrinsics.f(intent4);
            launchAuth(intent4);
            return true;
        } catch (ActivityNotFoundException e11) {
            this.logger.error("Can't start auth", e11);
            return false;
        }
    }

    private final boolean isIntentWithAuthRequest(Intent intent) {
        return intent != null && intent.getBooleanExtra("KEY_START_AUTH", false);
    }

    private final boolean isIntentWithAuthResult(Intent intent) {
        Uri data;
        return ((intent == null || (data = intent.getData()) == null) ? null : data.getScheme()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchAuth(Intent intent) {
        startActivity(intent, c.a(this, R.anim.fade_in, R.anim.fade_out).c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(AuthActivity authActivity, Bundle bundle) {
        Object parcelable;
        authActivity.shouldReportCustomTabsPerformance = true;
        Intent intent = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (bundle != null) {
                parcelable = bundle.getParcelable("KEY_AUTH_INTENT", Intent.class);
                intent = (Intent) parcelable;
            }
        } else if (bundle != null) {
            intent = (Intent) bundle.getParcelable("KEY_AUTH_INTENT");
        }
        authActivity.authIntent = intent;
        authActivity.isWaitingForAuthResult = bundle != null ? bundle.getBoolean("KEY_WAITING_FOR_AUTH_RESULT", false) : false;
        authActivity.processIntent(authActivity.getIntent());
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNewIntent$lambda$5(AuthActivity authActivity, Intent intent) {
        authActivity.processIntent(intent);
        return Unit.f71690a;
    }

    private final void onOauthResult(Intent data) {
        if (data == null) {
            return;
        }
        AuthEventBridge.INSTANCE.onAuthResult$vkid_release(parseOAuthResult(data.getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPause$lambda$8(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPause$lambda$9(AuthActivity authActivity) {
        authActivity.authWasStarted = false;
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(AuthActivity authActivity) {
        if (authActivity.isWaitingForAuthResult && !authActivity.authWasStarted) {
            AuthEventBridge.INSTANCE.onAuthResult$vkid_release(new AuthResult.Canceled("User returns to auth activity without auth"));
            authActivity.finish();
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveInstanceState$lambda$10(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveInstanceState$lambda$11(Bundle bundle, AuthActivity authActivity) {
        bundle.putBoolean("KEY_WAITING_FOR_AUTH_RESULT", authActivity.isWaitingForAuthResult);
        bundle.putParcelable("KEY_AUTH_INTENT", authActivity.authIntent);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$1(AuthActivity authActivity) {
        f fVar = authActivity.customTabsServiceConnection;
        if (fVar == null) {
            return Unit.f71690a;
        }
        Intrinsics.f(fVar);
        authActivity.unbindService(fVar);
        authActivity.customTabsServiceConnection = null;
        return Unit.f71690a;
    }

    private final AuthResult parseOAuthResult(Uri uri) {
        if (uri == null) {
            return new AuthResult.AuthActiviyResultFailed("AuthActivity opened with null uri", null);
        }
        try {
            return handlePayload(uri);
        } catch (UnsupportedOperationException e11) {
            return new AuthResult.AuthActiviyResultFailed(G.b(uri, "AuthActivity opened with invalid url: "), e11);
        }
    }

    private final void processIntent(Intent intent) {
        if (this.isWaitingForAuthResult || !isIntentWithAuthRequest(intent)) {
            if (isIntentWithAuthResult(intent)) {
                onOauthResult(intent);
                finish();
                this.isWaitingForAuthResult = false;
                return;
            }
            return;
        }
        if (!handleStartAuth(intent)) {
            finish();
        } else {
            this.isWaitingForAuthResult = true;
            this.authWasStarted = true;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C8478a(), new b(this, 3));
    }

    @Override // android.app.Activity
    protected void onCreate(final Bundle savedInstanceState) {
        overridePendingTransition(0, 0);
        super.onCreate(savedInstanceState);
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C8479b(0), new Function0() { // from class: na.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCreate$lambda$3;
                onCreate$lambda$3 = AuthActivity.onCreate$lambda$3(this, savedInstanceState);
                return onCreate$lambda$3;
            }
        });
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new c30.f(1), new a(this, intent, 1));
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new na.g(), new D90.b(this, 3));
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new C2374a(1), new D80.a(this, 3));
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(@NotNull final Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new d(0), new Function0() { // from class: na.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onSaveInstanceState$lambda$11;
                onSaveInstanceState$lambda$11 = AuthActivity.onSaveInstanceState$lambda$11(outState, this);
                return onSaveInstanceState$lambda$11;
            }
        });
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashes(new na.f(), new C7600a(this, 1));
    }
}
