package ru.ozon.app.android.session.flashcall.core;

import Pc.a;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.session.flashcall.di.RequestPhoneAccessComponent;
import ru.ozon.app.android.session.flashcall.presentation.RequestPhoneAccessViewModel;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0014J-\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/session/flashcall/core/RequestPhoneAccessConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "requestPhoneAccessViewModel", "Lru/ozon/app/android/session/flashcall/presentation/RequestPhoneAccessViewModel;", "onComposerInitialized", "", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RequestPhoneAccessConfigurator extends ComposerScreenConfig.PageConfigurator {
    private RequestPhoneAccessViewModel requestPhoneAccessViewModel;
    public static final int $stable = 8;

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        final a<RequestPhoneAccessViewModel> widgetViewModelProvider;
        C7475g composerWidgetComponentStorage;
        ConfiguratorReferences references = getReferences();
        RequestPhoneAccessComponent requestPhoneAccessComponent = (RequestPhoneAccessComponent) ((references == null || (composerWidgetComponentStorage = references.getComposerWidgetComponentStorage()) == null) ? null : composerWidgetComponentStorage.getComponent(RequestPhoneAccessComponent.class));
        if (requestPhoneAccessComponent == null || (widgetViewModelProvider = requestPhoneAccessComponent.getWidgetViewModelProvider()) == null) {
            return;
        }
        ConfiguratorReferences references2 = getReferences();
        Intrinsics.f(references2);
        this.requestPhoneAccessViewModel = (RequestPhoneAccessViewModel) new z0(references2.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.session.flashcall.core.RequestPhoneAccessConfigurator$onComposerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                RequestPhoneAccessViewModel requestPhoneAccessViewModel = (RequestPhoneAccessViewModel) a.this.get();
                Intrinsics.g(requestPhoneAccessViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return requestPhoneAccessViewModel;
            }
        }).a(RequestPhoneAccessViewModel.class);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode != 123456) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
            return;
        }
        RequestPhoneAccessViewModel requestPhoneAccessViewModel = this.requestPhoneAccessViewModel;
        if (requestPhoneAccessViewModel == null) {
            LoggerExtKt.sendLog$default("RequestPhoneAccessViewModel not initialised", null, 2, null);
            return;
        }
        r a11 = getContainer().a();
        int M11 = C7705l.M(permissions, "android.permission.READ_CALL_LOG");
        int M12 = C7705l.M(permissions, "android.permission.READ_PHONE_STATE");
        Integer J11 = C7705l.J(grantResults, M11);
        boolean z11 = false;
        boolean z12 = J11 != null && J11.intValue() == 0;
        Integer J12 = C7705l.J(grantResults, M12);
        boolean z13 = J12 != null && J12.intValue() == 0;
        boolean z14 = a11 != null && a11.shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG");
        if (a11 != null && a11.shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
            z11 = true;
        }
        requestPhoneAccessViewModel.onRequestPermissionsResult(z12, z14, z13, z11);
    }
}
