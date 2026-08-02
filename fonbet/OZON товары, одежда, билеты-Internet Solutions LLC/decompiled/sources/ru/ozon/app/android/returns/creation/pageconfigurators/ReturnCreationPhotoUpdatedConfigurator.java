package ru.ozon.app.android.returns.creation.pageconfigurators;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEvent;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lru/ozon/app/android/returns/creation/pageconfigurators/ReturnCreationPhotoUpdatedConfigurator;", "Lru/ozon/app/android/returns/creation/pageconfigurators/BaseReturnCreationEventsManagerConfigurator;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEvent$PhotoUpdated;", "returnCreationEventManager", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "<init>", "(Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;)V", "handleEvent", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationPhotoUpdatedConfigurator extends BaseReturnCreationEventsManagerConfigurator<ReturnCreationEvent.PhotoUpdated> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCreationPhotoUpdatedConfigurator(@NotNull ReturnCreationEventManager returnCreationEventManager) {
        super(returnCreationEventManager, N.b(ReturnCreationEvent.PhotoUpdated.class));
        Intrinsics.checkNotNullParameter(returnCreationEventManager, "returnCreationEventManager");
    }

    @Override // ru.ozon.app.android.returns.creation.pageconfigurators.BaseReturnCreationEventsManagerConfigurator
    public void handleEvent() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, null, null, null, 7);
    }
}
