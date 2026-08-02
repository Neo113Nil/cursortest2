package ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation;

import EZ.h;
import GZ.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.g;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ThemeResIdProvider;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di.DaggerProductSelectorComponent;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.di.ProductSelectorComponent;
import ru.ozon.app.android.uikit.R$style;
import yZ.f;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorActivity;", "Landroidx/appcompat/app/g;", "LyZ/f;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "handleRedirect", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "onSupportNavigateUp", "()Z", "onNewIntent", "onBackPressed", "LEZ/h;", "navigatorHolder", "LEZ/h;", "getNavigatorHolder", "()LEZ/h;", "setNavigatorHolder", "(LEZ/h;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;", "navigator", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;", "getNavigator$search_prodGoogleAllVendorsRelease", "()Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;", "setNavigator$search_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorNavigator;)V", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProductSelectorActivity extends g implements f {
    public ProductSelectorNavigator navigator;
    public h navigatorHolder;
    public GZ.g router;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/navigation/ProductSelectorActivity$Companion;", "", "<init>", "()V", "EXTRA_DEEPLINK", "", "EXTRA_THEME_ID", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "deeplink", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intent intent = new Intent(context, (Class<?>) ProductSelectorActivity.class);
            intent.putExtra("ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.EXTRA_DEEPLINK", deeplink);
            if (context instanceof ThemeResIdProvider) {
                intent.putExtra("ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.EXTRA_THEME_ID", ((ThemeResIdProvider) context).getThemeId());
            }
            return intent;
        }

        private Companion() {
        }
    }

    private final void handleRedirect(Intent intent) {
        String stringExtra = intent != null ? intent.getStringExtra("ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.EXTRA_DEEPLINK") : null;
        if (stringExtra != null) {
            g.a.a(getRouter(), stringExtra, null, null, 6);
        }
        if (intent != null) {
            intent.removeExtra("ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.EXTRA_DEEPLINK");
        }
    }

    @NotNull
    public final ProductSelectorNavigator getNavigator$search_prodGoogleAllVendorsRelease() {
        ProductSelectorNavigator productSelectorNavigator = this.navigator;
        if (productSelectorNavigator != null) {
            return productSelectorNavigator;
        }
        Intrinsics.n("navigator");
        throw null;
    }

    @NotNull
    public final h getNavigatorHolder() {
        h hVar = this.navigatorHolder;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.n("navigatorHolder");
        throw null;
    }

    @NotNull
    public final GZ.g getRouter() {
        GZ.g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (getSupportFragmentManager().l0() == 0) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        ProductSelectorComponent.Factory factory = DaggerProductSelectorComponent.factory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class), this).inject(this);
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
        }
        setTheme(getIntent().getIntExtra("ru.ozon.app.android.search.catalog.components.productselectormobiledata.navigation.EXTRA_THEME_ID", R$style.OzonTheme));
        setContentView(R$layout.product_selector_activity);
        yZ.h.a(getNavigator$search_prodGoogleAllVendorsRelease(), getNavigatorHolder(), this);
        handleRedirect(getIntent());
    }

    @Override // androidx.activity.ActivityC5043j, android.app.Activity
    protected void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        handleRedirect(intent);
    }

    @Override // androidx.appcompat.app.g
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
