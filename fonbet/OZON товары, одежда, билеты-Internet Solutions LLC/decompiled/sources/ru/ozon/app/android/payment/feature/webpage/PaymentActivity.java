package ru.ozon.app.android.payment.feature.webpage;

import AD.b;
import GZ.g;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.W;
import com.google.android.gms.common.internal.ImagesContract;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.locale.app.di.AppLocaleComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.flags.WebViewCacheFlag;
import ru.ozon.app.android.network.whitelist.di.WhitelistComponentApi;
import ru.ozon.app.android.payment.feature.databinding.ActivityPaymentBinding;
import ru.ozon.app.android.payment.feature.di.DaggerPaymentComponent;
import ru.ozon.app.android.payment.feature.di.PaymentComponent;
import ru.ozon.app.android.payment.feature.flags.FormVersionFlag;
import ru.ozon.app.android.payment.feature.webpage.PaymentActivity;
import ru.ozon.app.android.payment.feature.webpage.PaymentViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.web.OnReceiveTitleListener;
import ru.ozon.app.android.web.di.WebComponentApi;
import ru.ozon.app.android.web.webview.OzonWebView;
import ru.ozon.app.android.web.webview.cache.WebViewResourcesManager;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010?\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010F\u001a\u00020E8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentActivity;", "Landroidx/appcompat/app/g;", "Lru/ozon/app/android/composer/universalscreen/view/ThemeResIdProvider;", "<init>", "()V", "", "extractCancelLink", "()Ljava/lang/String;", "", "isStartedForResult", "()Z", "success", "deeplink", "shouldFinish", "", "goOut", "(ZLjava/lang/String;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onSupportNavigateUp", "onBackPressed", "", "themeResId", "()I", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "LPc/a;", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel$payment_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$payment_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/payment/feature/webpage/PaymentViewModel;", "viewModel", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "setFeatureChecker", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "setFeatureService", "(Lru/ozon/app/android/network/abtool/FeatureService;)V", "Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "webViewCacheManager", "Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "getWebViewCacheManager", "()Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "setWebViewCacheManager", "(Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;)V", "Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewClient;", "paymentWebViewClient", "Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewClient;", "getPaymentWebViewClient", "()Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewClient;", "setPaymentWebViewClient", "(Lru/ozon/app/android/payment/feature/webpage/PaymentWebViewClient;)V", "Lru/ozon/app/android/payment/feature/databinding/ActivityPaymentBinding;", "binding", "Lru/ozon/app/android/payment/feature/databinding/ActivityPaymentBinding;", "themeId", "I", "Lnc/a;", "compositeDisposable", "Lnc/a;", "Companion", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentActivity extends g implements ThemeResIdProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private ActivityPaymentBinding binding;
    public FeatureChecker featureChecker;
    public FeatureService featureService;
    public GZ.g ozonRouter;
    public a<PaymentViewModelImpl> pViewModel;
    public PaymentWebViewClient paymentWebViewClient;
    private int themeId;
    public WebViewResourcesManager webViewCacheManager;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new PaymentActivity$viewModel$2(this));

    @NotNull
    private final C8486a compositeDisposable = new C8486a();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/payment/feature/webpage/PaymentActivity$Companion;", "", "<init>", "()V", "PAYMENT_URL", "", "CANCEL_URL", "THEME_ID", "EMPTY_TITLE", "NEW_FORM_VERSION", "", "startIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ImagesContract.URL, "cancelLink", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Intent startIntent(@NotNull Context context, @NotNull String url, String cancelLink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            int themeId = context instanceof ThemeResIdProvider ? ((ThemeResIdProvider) context).getThemeId() : R$style.OzonTheme;
            Intent intent = new Intent(context, (Class<?>) PaymentActivity.class);
            intent.putExtra("payment_url", url);
            intent.putExtra("cancel_url", cancelLink);
            intent.putExtra("theme_id", themeId);
            return intent;
        }

        private Companion() {
        }
    }

    private final String extractCancelLink() {
        return getIntent().getStringExtra("cancel_url");
    }

    private final PaymentViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PaymentViewModel) value;
    }

    private final void goOut(boolean success, String deeplink, boolean shouldFinish) {
        if (!isStartedForResult()) {
            g.a.a(getOzonRouter(), deeplink, null, null, 6);
            if (shouldFinish) {
                finish();
                return;
            }
            return;
        }
        int i11 = success ? -1 : 0;
        Intent intent = new Intent();
        intent.putExtra("PAYMENT_RESULT_DEEPLINK", deeplink);
        Unit unit = Unit.f71690a;
        setResult(i11, intent);
        finish();
    }

    static /* synthetic */ void goOut$default(PaymentActivity paymentActivity, boolean z11, String str, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        paymentActivity.goOut(z11, str, z12);
    }

    private final boolean isStartedForResult() {
        return getCallingActivity() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$1(PaymentActivity paymentActivity, String str) {
        if (str == null) {
            return;
        }
        ActivityPaymentBinding activityPaymentBinding = paymentActivity.binding;
        if (activityPaymentBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextAtomV2View title = activityPaymentBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(str);
        String token = UniColors.BLACK.getToken();
        TextDTO.TextAlignment textAlignment = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        CommonCellSettings.LayoutPadding layoutPadding4 = null;
        TextHolderKt.bind$default(title, new TextDTO(ozonSpannableString, textAlignment, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, TextPreset.PRESET_CUSTOM, UniTextStyles.HEADLINE_400_SMALL.getToken(), token, null, null, null, null, false, null, null, null, null, null, 523838, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6$lambda$5(PaymentActivity paymentActivity, PaymentViewModel.Action action) {
        if (action != null) {
            if (!(action instanceof PaymentViewModel.Action.LoadPage)) {
                if (!(action instanceof PaymentViewModel.Action.OpenDeeplink)) {
                    throw new o();
                }
                PaymentViewModel.Action.OpenDeeplink openDeeplink = (PaymentViewModel.Action.OpenDeeplink) action;
                paymentActivity.goOut(false, openDeeplink.getDeeplink(), openDeeplink.getShouldFinish());
                return;
            }
            ActivityPaymentBinding activityPaymentBinding = paymentActivity.binding;
            if (activityPaymentBinding != null) {
                activityPaymentBinding.webView.loadUrl(((PaymentViewModel.Action.LoadPage) action).getUrl());
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @NotNull
    public final FeatureChecker getFeatureChecker() {
        FeatureChecker featureChecker = this.featureChecker;
        if (featureChecker != null) {
            return featureChecker;
        }
        Intrinsics.n("featureChecker");
        throw null;
    }

    @NotNull
    public final FeatureService getFeatureService() {
        FeatureService featureService = this.featureService;
        if (featureService != null) {
            return featureService;
        }
        Intrinsics.n("featureService");
        throw null;
    }

    @NotNull
    public final GZ.g getOzonRouter() {
        GZ.g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    @NotNull
    public final a<PaymentViewModelImpl> getPViewModel$payment_prodGoogleAllVendorsRelease() {
        a<PaymentViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @NotNull
    public final PaymentWebViewClient getPaymentWebViewClient() {
        PaymentWebViewClient paymentWebViewClient = this.paymentWebViewClient;
        if (paymentWebViewClient != null) {
            return paymentWebViewClient;
        }
        Intrinsics.n("paymentWebViewClient");
        throw null;
    }

    @NotNull
    public final WebViewResourcesManager getWebViewCacheManager() {
        WebViewResourcesManager webViewResourcesManager = this.webViewCacheManager;
        if (webViewResourcesManager != null) {
            return webViewResourcesManager;
        }
        Intrinsics.n("webViewCacheManager");
        throw null;
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void onBackPressed() {
        String extractCancelLink = extractCancelLink();
        if (extractCancelLink != null) {
            goOut$default(this, false, extractCancelLink, false, 4, null);
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        PaymentComponent.Factory factory = DaggerPaymentComponent.factory();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(this, WhitelistComponentApi.class).getDependencyStorage();
        if (WhitelistComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WhitelistComponentApi is not DiComponent");
        }
        WhitelistComponentApi whitelistComponentApi = (WhitelistComponentApi) dependencyStorage2.b(WhitelistComponentApi.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class);
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(this, AppLocaleComponentApi.class).getDependencyStorage();
        if (AppLocaleComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AppLocaleComponentApi is not DiComponent");
        }
        AppLocaleComponentApi appLocaleComponentApi = (AppLocaleComponentApi) dependencyStorage4.b(AppLocaleComponentApi.class);
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage5.b(StorageComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage6 = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage6.b(AnalyticsComponentApi.class);
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        C6740b dependencyStorage7 = C6739a.a(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage7.b(AccountComponentApi.class);
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        C6740b dependencyStorage8 = C6739a.a(this, WebComponentApi.class).getDependencyStorage();
        if (WebComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component WebComponentApi is not DiComponent");
        }
        WebComponentApi webComponentApi = (WebComponentApi) dependencyStorage8.b(WebComponentApi.class);
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        C6740b dependencyStorage9 = C6739a.a(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage9.b(ComposerComponentApi.class);
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        C6740b dependencyStorage10 = C6739a.a(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage10.b(ActionComponentApi.class);
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage11 = C6739a.a(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        factory.create(networkComponentApi, whitelistComponentApi, navigationComponentApi, appLocaleComponentApi, storageComponentApi, analyticsComponentApi, accountComponentApi, webComponentApi, composerComponentApi, actionComponentApi, (ContextComponentDependencies) dependencyStorage11.b(ContextComponentDependencies.class)).inject(this);
        int intExtra = getIntent().getIntExtra("theme_id", R$style.OzonTheme);
        this.themeId = intExtra;
        setTheme(intExtra);
        this.binding = ActivityPaymentBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        ActivityPaymentBinding activityPaymentBinding = this.binding;
        if (activityPaymentBinding == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(activityPaymentBinding.getConstraintLayout());
        String stringExtra = getIntent().getStringExtra("payment_url");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (getFeatureService().getIntKey(FormVersionFlag.INSTANCE) == 3) {
            ActivityPaymentBinding activityPaymentBinding2 = this.binding;
            if (activityPaymentBinding2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            FrameLayout titleContainer = activityPaymentBinding2.titleContainer;
            Intrinsics.checkNotNullExpressionValue(titleContainer, "titleContainer");
            titleContainer.setVisibility(0);
            ActivityPaymentBinding activityPaymentBinding3 = this.binding;
            if (activityPaymentBinding3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Toolbar toolbar = activityPaymentBinding3.toolbar;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            toolbar.setVisibility(8);
            getWindow().getDecorView().setSystemUiVisibility(8192);
            getWindow().setStatusBarColor(getResources().getColor(R$color.white));
            ActivityPaymentBinding activityPaymentBinding4 = this.binding;
            if (activityPaymentBinding4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            activityPaymentBinding4.close.setOnClickListener(new b(this, 8));
            ActivityPaymentBinding activityPaymentBinding5 = this.binding;
            if (activityPaymentBinding5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            activityPaymentBinding5.webView.setOnReceiveTitleListener(new OnReceiveTitleListener() { // from class: gC.a
                @Override // ru.ozon.app.android.web.OnReceiveTitleListener
                public final void receiveTitle(String str) {
                    PaymentActivity.onCreate$lambda$6$lambda$1(PaymentActivity.this, str);
                }
            });
        } else {
            ActivityPaymentBinding activityPaymentBinding6 = this.binding;
            if (activityPaymentBinding6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            setSupportActionBar(activityPaymentBinding6.toolbar);
            AbstractC5051a supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.m(true);
                supportActionBar.n();
                supportActionBar.s("");
                supportActionBar.p(R$drawable.ic_m_cross);
            }
        }
        boolean isEnabled = getFeatureChecker().isEnabled(WebViewCacheFlag.INSTANCE);
        if (isEnabled) {
            this.compositeDisposable.a(WebViewResourcesManager.DefaultImpls.actualizeCache$default(getWebViewCacheManager(), 0, 0, null, 7, null));
        }
        ActivityPaymentBinding activityPaymentBinding7 = this.binding;
        if (activityPaymentBinding7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        OzonWebView ozonWebView = activityPaymentBinding7.webView;
        ozonWebView.init(this);
        ozonWebView.setResourcesCacheEnabled(isEnabled);
        ozonWebView.setFullscreen(true);
        ozonWebView.setOzonWebViewClient(getPaymentWebViewClient());
        ozonWebView.setOnRedirectListener(new PaymentActivity$onCreate$1$4$1(getViewModel()));
        getViewModel().getActions().observe(this, new W() { // from class: gC.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                PaymentActivity.onCreate$lambda$6$lambda$5(PaymentActivity.this, (PaymentViewModel.Action) obj);
            }
        });
        getViewModel().init(stringExtra);
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.r, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.compositeDisposable.d();
    }

    @Override // androidx.appcompat.app.g
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider
    /* renamed from: themeResId, reason: from getter */
    public int getThemeId() {
        return this.themeId;
    }
}
