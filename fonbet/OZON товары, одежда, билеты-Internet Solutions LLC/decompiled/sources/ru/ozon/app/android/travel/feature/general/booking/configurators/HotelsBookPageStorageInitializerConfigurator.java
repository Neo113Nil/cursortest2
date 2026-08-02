package ru.ozon.app.android.travel.feature.general.booking.configurators;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.w0;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.travel.data.storage.TravelStorageManagerHolder;
import ru.ozon.app.android.travel.data.storage.initializer.TravelPageStorageInitializerConfigurator;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKey;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.general.booking.actionHandlers.hotelsBookSuccessValidation.HotelsBookEventFlow;
import ru.ozon.app.android.travel.utils.FlowUtilsKt;
import ru.ozon.app.android.travel.utils.timeoutAndAction.TimeoutAndActionV2StartPollingUpdate;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/configurators/HotelsBookPageStorageInitializerConfigurator;", "Lru/ozon/app/android/travel/data/storage/initializer/TravelPageStorageInitializerConfigurator;", "storageManagerHolder", "Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;", "<init>", "(Lru/ozon/app/android/travel/data/storage/TravelStorageManagerHolder;)V", "onPageStorageInitialized", "", "pageStorage", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "handleEvent", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsBookPageStorageInitializerConfigurator extends TravelPageStorageInitializerConfigurator {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookPageStorageInitializerConfigurator(@NotNull TravelStorageManagerHolder storageManagerHolder) {
        super(storageManagerHolder, TravelPageKey.HOTELS_BOOK, true);
        Intrinsics.checkNotNullParameter(storageManagerHolder, "storageManagerHolder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent() {
        InterfaceC7851b controller;
        ConfiguratorReferences references = getReferences();
        if (references == null || (controller = references.getController()) == null) {
            return;
        }
        controller.update(new TimeoutAndActionV2StartPollingUpdate());
    }

    @Override // ru.ozon.app.android.travel.data.storage.initializer.TravelPageStorageInitializerConfigurator
    protected void onPageStorageInitialized(@NotNull TravelPageKeyValueStorage pageStorage) {
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        String name = HotelsBookEventFlow.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Object obj = pageStorage.get(name);
        if (!(obj instanceof HotelsBookEventFlow)) {
            obj = null;
        }
        HotelsBookEventFlow hotelsBookEventFlow = (HotelsBookEventFlow) obj;
        w0<Unit> flow = hotelsBookEventFlow != null ? hotelsBookEventFlow.getFlow() : null;
        if (flow == null) {
            flow = HotelsBookEventFlow.m1090constructorimpl(FlowUtilsKt.SingleEventsFlow());
        }
        C2399j.C(new C2408n0(HotelsBookEventFlow.m1088boximpl(flow), new HotelsBookPageStorageInitializerConfigurator$onPageStorageInitialized$1(this, null)), K.a(getOwner()));
        HotelsBookEventFlow m1088boximpl = HotelsBookEventFlow.m1088boximpl(flow);
        String name2 = HotelsBookEventFlow.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        if (pageStorage.get(name2) != null) {
            return;
        }
        String name3 = HotelsBookEventFlow.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        pageStorage.put(name3, m1088boximpl);
    }
}
