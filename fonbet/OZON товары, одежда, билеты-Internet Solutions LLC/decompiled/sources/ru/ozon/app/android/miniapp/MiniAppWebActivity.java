package ru.ozon.app.android.miniapp;

import B90.M;
import B90.N;
import DN.a;
import DN.b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.g;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.common.internal.ImagesContract;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.miniapp.data.MiniAppState;
import ru.ozon.app.android.miniapp.databinding.ActivityMiniAppWebBinding;
import ru.ozon.app.android.miniapp.di.DaggerMiniAppWebActivityComponent;
import ru.ozon.app.android.miniapp.di.MiniAppWebActivityComponent;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.storage.auth.AuthTokenDataSource;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.client.OzonWebViewUrlInterceptor;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u0003R\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020$8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/miniapp/MiniAppWebActivity;", "Landroidx/appcompat/app/g;", "<init>", "()V", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "webViewRendererProcessCrashHandler", "", "initWebView", "(Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;)V", "initNavBar", "", "host", "saveState", "(Ljava/lang/String;)V", ImagesContract.URL, "Landroid/util/SparseArray;", "Landroid/os/Parcelable;", "getState", "(Ljava/lang/String;)Landroid/util/SparseArray;", "loadInitialUrl", "", "getHeaders", "()Ljava/util/Map;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onStop", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "getDomainsInteractor", "()Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "setDomainsInteractor", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "authTokenDataSource", "Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "getAuthTokenDataSource", "()Lru/ozon/app/android/storage/auth/AuthTokenDataSource;", "setAuthTokenDataSource", "(Lru/ozon/app/android/storage/auth/AuthTokenDataSource;)V", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/version/AppVersionService;", "getAppVersionService", "()Lru/ozon/app/android/network/version/AppVersionService;", "setAppVersionService", "(Lru/ozon/app/android/network/version/AppVersionService;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "setFeatureChecker", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "ozonWebViewUrlInterceptor", "Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "getOzonWebViewUrlInterceptor", "()Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "setOzonWebViewUrlInterceptor", "(Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;)V", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "getWebViewErrorLogger", "()Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "setWebViewErrorLogger", "(Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "Ljava/lang/String;", "Lru/ozon/app/android/miniapp/databinding/ActivityMiniAppWebBinding;", "binding", "Lru/ozon/app/android/miniapp/databinding/ActivityMiniAppWebBinding;", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MiniAppWebActivity extends g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public AppVersionService appVersionService;
    public AuthTokenDataSource authTokenDataSource;
    private ActivityMiniAppWebBinding binding;
    public DomainsInteractor domainsInteractor;
    public FeatureChecker featureChecker;
    private String host;
    public OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor;
    public WebViewErrorLogger webViewErrorLogger;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/miniapp/MiniAppWebActivity$Companion;", "", "<init>", "()V", "EXTRA_KEY_URL", "", "startIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ImagesContract.URL, "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent startIntent(@NotNull Context context, @NotNull String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent(context, (Class<?>) MiniAppWebActivity.class);
            intent.putExtra("EXTRA_KEY_URL", url);
            return intent;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getHeaders() {
        return U.j(new Pair("User-Agent", getAppVersionService().getUserAgent()), new Pair("x-o3-app-name", getAppVersionService().getAppName()), new Pair("x-o3-app-version", getAppVersionService().getVersion()));
    }

    private final SparseArray<Parcelable> getState(String url) {
        String findUrlSubdomainInWebDomains = getDomainsInteractor().findUrlSubdomainInWebDomains(url);
        if (findUrlSubdomainInWebDomains == null) {
            return null;
        }
        Uri parse = Uri.parse(url);
        String query = parse.getQuery();
        if ((query == null || h.K(query)) && parse.getPathSegments().isEmpty()) {
            return MiniAppState.INSTANCE.get(findUrlSubdomainInWebDomains);
        }
        return null;
    }

    private final void initNavBar() {
        ActivityMiniAppWebBinding activityMiniAppWebBinding = this.binding;
        if (activityMiniAppWebBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityMiniAppWebBinding.webView.setOnPageStartListener(new MiniAppWebActivity$initNavBar$1$1(activityMiniAppWebBinding));
        activityMiniAppWebBinding.webView.setOnPageFinishedListener(new MiniAppWebActivity$initNavBar$1$2(activityMiniAppWebBinding, this));
        activityMiniAppWebBinding.closeMiniApp.setOnClickListener(new a(this, 13));
        activityMiniAppWebBinding.backMiniApp.setOnClickListener(new b(this, 20));
        activityMiniAppWebBinding.webView.setGoBackListener(new MiniAppWebActivity$initNavBar$1$5(activityMiniAppWebBinding));
    }

    private final void initWebView(WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler) {
        ActivityMiniAppWebBinding activityMiniAppWebBinding = this.binding;
        if (activityMiniAppWebBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityMiniAppWebBinding.webView.init(webViewRendererProcessCrashHandler, getOzonWebViewUrlInterceptor(), getWebViewErrorLogger());
        activityMiniAppWebBinding.webView.setFullscreen(true);
        activityMiniAppWebBinding.webView.setHeadersProvider(new MiniAppWebActivity$initWebView$1$1(this));
        activityMiniAppWebBinding.webView.setOnHideRefreshAnimationHandler(new MiniAppWebActivity$initWebView$1$2(activityMiniAppWebBinding));
        activityMiniAppWebBinding.webView.setHostsWhiteListChecker(getDomainsInteractor());
        activityMiniAppWebBinding.swipeRefreshLayout.setOnRefreshListener(new M(activityMiniAppWebBinding.webView, 7));
        activityMiniAppWebBinding.swipeRefreshLayout.setOnChildScrollUpCallback(new N(activityMiniAppWebBinding));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initWebView$lambda$1$lambda$0(ActivityMiniAppWebBinding activityMiniAppWebBinding, SwipeRefreshLayout swipeRefreshLayout, View view) {
        Intrinsics.checkNotNullParameter(swipeRefreshLayout, "<unused var>");
        Integer pageScrollY = activityMiniAppWebBinding.webView.getPageScrollY();
        return pageScrollY == null || pageScrollY.intValue() != 0;
    }

    private final void loadInitialUrl(String url) {
        if (!getDomainsInteractor().isUrlSubdomainOfWebDomains(url)) {
            Lm0.a.f17149a.e(new MiniAppNotAllowedUrlException(url));
            finish();
            return;
        }
        SparseArray<Parcelable> state = getState(url);
        if (state != null) {
            ActivityMiniAppWebBinding activityMiniAppWebBinding = this.binding;
            if (activityMiniAppWebBinding != null) {
                activityMiniAppWebBinding.swipeRefreshLayout.restoreHierarchyState(state);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        ActivityMiniAppWebBinding activityMiniAppWebBinding2 = this.binding;
        if (activityMiniAppWebBinding2 != null) {
            activityMiniAppWebBinding2.webView.loadUrl(url, Boolean.FALSE);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    private final void saveState(String host) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ActivityMiniAppWebBinding activityMiniAppWebBinding = this.binding;
        if (activityMiniAppWebBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        activityMiniAppWebBinding.swipeRefreshLayout.saveHierarchyState(sparseArray);
        MiniAppState.INSTANCE.put(host, sparseArray);
    }

    @NotNull
    public final AppVersionService getAppVersionService() {
        AppVersionService appVersionService = this.appVersionService;
        if (appVersionService != null) {
            return appVersionService;
        }
        Intrinsics.n("appVersionService");
        throw null;
    }

    @NotNull
    public final DomainsInteractor getDomainsInteractor() {
        DomainsInteractor domainsInteractor = this.domainsInteractor;
        if (domainsInteractor != null) {
            return domainsInteractor;
        }
        Intrinsics.n("domainsInteractor");
        throw null;
    }

    @NotNull
    public final OzonWebViewUrlInterceptor getOzonWebViewUrlInterceptor() {
        OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor = this.ozonWebViewUrlInterceptor;
        if (ozonWebViewUrlInterceptor != null) {
            return ozonWebViewUrlInterceptor;
        }
        Intrinsics.n("ozonWebViewUrlInterceptor");
        throw null;
    }

    @NotNull
    public final WebViewErrorLogger getWebViewErrorLogger() {
        WebViewErrorLogger webViewErrorLogger = this.webViewErrorLogger;
        if (webViewErrorLogger != null) {
            return webViewErrorLogger;
        }
        Intrinsics.n("webViewErrorLogger");
        throw null;
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void onBackPressed() {
        ActivityMiniAppWebBinding activityMiniAppWebBinding = this.binding;
        if (activityMiniAppWebBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (!activityMiniAppWebBinding.webView.canGoBack()) {
            super.onBackPressed();
            return;
        }
        ActivityMiniAppWebBinding activityMiniAppWebBinding2 = this.binding;
        if (activityMiniAppWebBinding2 != null) {
            activityMiniAppWebBinding2.webView.goBack();
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        MiniAppWebActivityComponent.Factory factory = DaggerMiniAppWebActivityComponent.factory();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage.b(StorageComponentApi.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class);
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, WhitelistComponentApi.class).getDependencyStorage();
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        WhitelistComponentApi whitelistComponentApi = (WhitelistComponentApi) dependencyStorage3.b(WhitelistComponentApi.class);
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(this, WebComponentApi.class).getDependencyStorage();
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        MiniAppWebActivityComponent create = factory.create(storageComponentApi, networkComponentApi, whitelistComponentApi, (WebComponentApi) dependencyStorage4.b(WebComponentApi.class));
        create.inject(this);
        setTheme(ru.ozon.app.android.uikit.R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        ActivityMiniAppWebBinding inflate = ActivityMiniAppWebBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(inflate.getConstraintLayout());
        initWebView(create.getWebViewRendererProcessCrashHandler());
        initNavBar();
        String stringExtra = getIntent().getStringExtra("EXTRA_KEY_URL");
        if (stringExtra == null) {
            throw new IllegalArgumentException("avoid open activity without url");
        }
        loadInitialUrl(stringExtra);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected void onStop() {
        super.onStop();
        String str = this.host;
        if (str != null) {
            saveState(str);
        }
    }
}
