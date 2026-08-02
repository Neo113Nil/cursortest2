package ru.ozon.app.android.travel.feature.hotels.map.shared.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.HotelsMapInfoV4Mapper;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.PinMapperDelegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/HotelsMapInfoV4Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoComponent$hotelsMapInfoV4Mapper$2 extends AbstractC7737t implements Function0<HotelsMapInfoV4Mapper> {
    final /* synthetic */ HotelsMapInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoComponent$hotelsMapInfoV4Mapper$2(HotelsMapInfoComponent hotelsMapInfoComponent) {
        super(0);
        this.this$0 = hotelsMapInfoComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HotelsMapInfoV4Mapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        PinMapperDelegate pinMapperDelegate;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        pinMapperDelegate = this.this$0.getPinMapperDelegate();
        return new HotelsMapInfoV4Mapper(context, pinMapperDelegate);
    }
}
