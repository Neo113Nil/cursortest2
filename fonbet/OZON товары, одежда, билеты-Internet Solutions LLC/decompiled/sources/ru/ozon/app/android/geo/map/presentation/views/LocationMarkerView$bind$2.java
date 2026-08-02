package ru.ozon.app.android.geo.map.presentation.views;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.databinding.MapLocationMarkerBinding;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LocationMarkerView$bind$2 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $doOnIconLoaded;
    final /* synthetic */ AddressEditMapVO.LocationMarker $marker;
    final /* synthetic */ LocationMarkerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LocationMarkerView$bind$2(LocationMarkerView locationMarkerView, Function1<? super Boolean, Unit> function1, AddressEditMapVO.LocationMarker locationMarker) {
        super(1);
        this.this$0 = locationMarkerView;
        this.$doOnIconLoaded = function1;
        this.$marker = locationMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap it) {
        MapLocationMarkerBinding mapLocationMarkerBinding;
        Intrinsics.checkNotNullParameter(it, "it");
        mapLocationMarkerBinding = this.this$0.binding;
        mapLocationMarkerBinding.iconIV.setImageBitmap(it);
        this.$doOnIconLoaded.invoke(Boolean.valueOf(this.$marker.getTooltip() != null));
    }
}
