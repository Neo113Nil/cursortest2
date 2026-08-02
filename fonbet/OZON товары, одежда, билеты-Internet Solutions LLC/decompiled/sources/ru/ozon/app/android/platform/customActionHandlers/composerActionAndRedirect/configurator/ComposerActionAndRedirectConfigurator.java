package ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.configurator;

import Pc.a;
import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ComposerActionAndRedirectState;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ComposerActionAndRedirectViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.ResponseRedirectAction;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.factory.RestrictionsFactory;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/configurator/ComposerActionAndRedirectConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectViewModel;", "provider", "<init>", "(LPc/a;)V", "Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;", "state", "Lru/ozon/app/android/composer/ConfiguratorReferences;", "refs", "", "observeState", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionAndRedirect/ComposerActionAndRedirectState;Lru/ozon/app/android/composer/ConfiguratorReferences;)V", "Lru/ozon/uni/android/flashbar/model/Restriction;", "message", "showRestriction", "(Lru/ozon/uni/android/flashbar/model/Restriction;)V", "showError", "()V", "onComposerInitialized", "LPc/a;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComposerActionAndRedirectConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<ComposerActionAndRedirectViewModel> provider;

    public ComposerActionAndRedirectConfigurator(@NotNull a<ComposerActionAndRedirectViewModel> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeState(ComposerActionAndRedirectState state, ConfiguratorReferences refs) {
        if (!(state instanceof ComposerActionAndRedirectState.Success)) {
            if (!(state instanceof ComposerActionAndRedirectState.Fail)) {
                throw new o();
            }
            showError();
            return;
        }
        ResponseRedirectAction action = ((ComposerActionAndRedirectState.Success) state).getAction();
        if (action != null) {
            showRestriction(action.getMessage());
            String redirectLink = action.getRedirectLink();
            if (redirectLink != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(refs.getNavigator(), redirectLink, null, 2, null);
            }
        }
    }

    private final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = getContainer().c();
        if ((c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) && (rootView = ContextExtKt.getRootView(getContainer().a())) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, getContainer().g(), 62, null).show();
    }

    private final void showRestriction(Restriction message) {
        ViewGroup rootView;
        if (message == null || (rootView = ContextExtKt.getRootView(getContainer().a())) == null) {
            return;
        }
        RestrictionsFactory.create$default(RestrictionsFactory.INSTANCE, rootView, C7714v.m0(message), getContainer().g(), null, null, null, null, null, 248, null);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            return;
        }
        ((ComposerActionAndRedirectViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.configurator.ComposerActionAndRedirectConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ComposerActionAndRedirectConfigurator.this.provider;
                ComposerActionAndRedirectViewModel composerActionAndRedirectViewModel = (ComposerActionAndRedirectViewModel) aVar.get();
                Intrinsics.g(composerActionAndRedirectViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return composerActionAndRedirectViewModel;
            }
        }).a(ComposerActionAndRedirectViewModel.class)).getState().observe(references.getOwnerContainer().f(), new ComposerActionAndRedirectConfigurator$sam$androidx_lifecycle_Observer$0(new ComposerActionAndRedirectConfigurator$onComposerInitialized$2(this, references)));
    }
}
