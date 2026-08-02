package ru.ozon.app.android.returns.list.configurator;

import A00.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.H;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.returns.ui.domain.ReturnUpdateInteractor;
import xe.C10727i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/list/configurator/ReturnListUpdateConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LoZ/a;", "Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;", "interactor", "<init>", "(Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;)V", "", "onComposerInitialized", "()V", "", "deeplink", "", "refresh", "onAnchorReturn", "(Ljava/lang/String;Z)V", "Lru/ozon/app/android/returns/ui/domain/ReturnUpdateInteractor;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnListUpdateConfigurator extends ComposerScreenConfig.PageConfigurator implements InterfaceC8677a {

    @NotNull
    private final ReturnUpdateInteractor interactor;

    public ReturnListUpdateConfigurator(@NotNull ReturnUpdateInteractor interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.interactor = interactor;
    }

    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, deeplink, null, null, new h.b(new a.C.C0000a(), null, 2), 6);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        super.onComposerInitialized();
        AbstractC5434v lifecycle = getOwner().getLifecycle();
        C10727i.c(H.a(lifecycle), null, null, new ReturnListUpdateConfigurator$onComposerInitialized$1(lifecycle, this, null), 3);
    }
}
