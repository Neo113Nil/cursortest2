package ru.ozon.app.android.checkoutgeo.location;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.api.ComposerLocationResponse;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerLocationRepositoryImpl$initLocation$2 extends AbstractC7737t implements Function1<ComposerLocationResponse.Location, Unit> {
    final /* synthetic */ ComposerLocationRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerLocationRepositoryImpl$initLocation$2(ComposerLocationRepositoryImpl composerLocationRepositoryImpl) {
        super(1);
        this.this$0 = composerLocationRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ComposerLocationResponse.Location location) {
        invoke2(location);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposerLocationResponse.Location location) {
        AreaLocalStore areaLocalStore;
        AreaLocalStore areaLocalStore2;
        ComposerLocationRepositoryImpl composerLocationRepositoryImpl = this.this$0;
        areaLocalStore = composerLocationRepositoryImpl.areaLocalStore;
        composerLocationRepositoryImpl.fetchGeoProvider(areaLocalStore.getLocationUid(), location != null ? location.getUid() : null);
        areaLocalStore2 = this.this$0.areaLocalStore;
        areaLocalStore2.saveLocation(location);
    }
}
