package ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo;

import A00.a;
import androidx.lifecycle.K;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/RefreshByStatusEdoConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "statusEdoState", "Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoState;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoState;)V", "lastEdoStateEvent", "", "Lkotlin/Unit;", "onComposerInitialized", "refreshPage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshByStatusEdoConfigurator extends ComposerScreenConfig.PageConfigurator {
    private Unit lastEdoStateEvent;

    @NotNull
    private final StatusEdoState statusEdoState;

    public RefreshByStatusEdoConfigurator(@NotNull StatusEdoState statusEdoState) {
        Intrinsics.checkNotNullParameter(statusEdoState, "statusEdoState");
        this.statusEdoState = statusEdoState;
        this.lastEdoStateEvent = statusEdoState.getLast();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPage() {
        InterfaceC7851b controller;
        h.b bVar = new h.b(new a.C.C0000a(), null, 2);
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.a(controller, null, null, null, bVar, 7);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        C10727i.c(K.a(getOwner()), C10720e0.a(), null, new RefreshByStatusEdoConfigurator$onComposerInitialized$1(this, null), 2);
    }
}
