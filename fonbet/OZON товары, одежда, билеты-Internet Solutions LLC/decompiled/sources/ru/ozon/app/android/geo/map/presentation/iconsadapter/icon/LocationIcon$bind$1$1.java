package ru.ozon.app.android.geo.map.presentation.iconsadapter.icon;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LocationIcon$bind$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AddressEditMapVO.MapIcon.LocationIcon $item;
    final /* synthetic */ LocationIcon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationIcon$bind$1$1(AddressEditMapVO.MapIcon.LocationIcon locationIcon, LocationIcon locationIcon2) {
        super(1);
        this.$item = locationIcon;
        this.this$0 = locationIcon2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(it, "it");
        AddressEditMapVO.MapIcon.LocationIcon locationIcon = this.$item;
        function1 = this.this$0.onAction;
        function1.invoke(locationIcon.getEvent());
    }
}
