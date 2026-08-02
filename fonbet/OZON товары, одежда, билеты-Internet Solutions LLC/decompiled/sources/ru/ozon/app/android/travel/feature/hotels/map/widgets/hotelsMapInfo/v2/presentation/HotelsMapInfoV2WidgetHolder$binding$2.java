package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import android.view.LayoutInflater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.WidgetHotelsMapInfoBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/map/databinding/WidgetHotelsMapInfoBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV2WidgetHolder$binding$2 extends AbstractC7737t implements Function0<WidgetHotelsMapInfoBinding> {
    final /* synthetic */ HotelsMapInfoV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV2WidgetHolder$binding$2(HotelsMapInfoV2WidgetHolder hotelsMapInfoV2WidgetHolder) {
        super(0);
        this.this$0 = hotelsMapInfoV2WidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WidgetHotelsMapInfoBinding invoke() {
        i iVar;
        i iVar2;
        iVar = this.this$0.container;
        LayoutInflater from = LayoutInflater.from(iVar.L());
        iVar2 = this.this$0.container;
        WidgetHotelsMapInfoBinding inflate = WidgetHotelsMapInfoBinding.inflate(from, iVar2.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
