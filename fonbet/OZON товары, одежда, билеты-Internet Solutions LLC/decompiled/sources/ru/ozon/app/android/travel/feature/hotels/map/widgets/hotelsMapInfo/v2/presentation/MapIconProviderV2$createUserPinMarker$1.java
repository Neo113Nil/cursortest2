package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.BitmapContainer;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DescriptorCache;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2VO;
import ve0.b;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MapIconProviderV2$createUserPinMarker$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ b $mapController;
    final /* synthetic */ HotelsMapInfoV2VO.Pin.UserPin $pin;
    final /* synthetic */ MapIconProviderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapIconProviderV2$createUserPinMarker$1(MapIconProviderV2 mapIconProviderV2, HotelsMapInfoV2VO.Pin.UserPin userPin, b bVar) {
        super(1);
        this.this$0 = mapIconProviderV2;
        this.$pin = userPin;
        this.$mapController = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        DescriptorCache descriptorCache;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        descriptorCache = this.this$0.cache;
        descriptorCache.put(new BitmapContainer(bitmap), this.$pin.getCacheHash());
        MapIconProviderV2.addPin$default(this.this$0, bitmap, this.$pin, this.$mapController, null, 8, null);
    }
}
