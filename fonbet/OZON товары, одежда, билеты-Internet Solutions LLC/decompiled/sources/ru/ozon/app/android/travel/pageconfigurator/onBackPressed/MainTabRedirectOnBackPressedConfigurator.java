package ru.ozon.app.android.travel.pageconfigurator.onBackPressed;

import AU.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/onBackPressed/MainTabRedirectOnBackPressedConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "backPressedCallback", "ru/ozon/app/android/travel/pageconfigurator/onBackPressed/MainTabRedirectOnBackPressedConfigurator$backPressedCallback$1", "Lru/ozon/app/android/travel/pageconfigurator/onBackPressed/MainTabRedirectOnBackPressedConfigurator$backPressedCallback$1;", "onComposerInitialized", "", "openRootTab", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MainTabRedirectOnBackPressedConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final MainTabRedirectOnBackPressedConfigurator$backPressedCallback$1 backPressedCallback = new C() { // from class: ru.ozon.app.android.travel.pageconfigurator.onBackPressed.MainTabRedirectOnBackPressedConfigurator$backPressedCallback$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            MainTabRedirectOnBackPressedConfigurator.this.openRootTab();
            setEnabled(false);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComposerInitialized$lambda$1$lambda$0(MainTabRedirectOnBackPressedConfigurator mainTabRedirectOnBackPressedConfigurator, View view) {
        mainTabRedirectOnBackPressedConfigurator.backPressedCallback.remove();
        mainTabRedirectOnBackPressedConfigurator.openRootTab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openRootTab() {
        ComposerNavigator navigator;
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String builder = MiniAppExtKt.appendTravel(linkGenerator.travelMain()).toString();
        Intrinsics.checkNotNullExpressionValue(builder, "toString(...)");
        String uri = linkGenerator.clearToRootTab(builder).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ConfiguratorReferences references = getReferences();
        if (references == null || (navigator = references.getNavigator()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(navigator, uri, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        View findViewById;
        r a11 = getContainer().a();
        if (a11 != null) {
            ViewGroup rootView = ContextExtKt.getRootView(a11);
            if (rootView != null && (findViewById = rootView.findViewById(R.id.navigationBtn)) != null) {
                findViewById.setOnClickListener(new a(this, 0));
            }
            a11.getOnBackPressedDispatcher().h(getOwner(), this.backPressedCallback);
        }
    }
}
