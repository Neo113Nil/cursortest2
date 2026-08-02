package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation;

import Ie0.c;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.travel.feature.hotels.map.databinding.WidgetHotelsMapInfoBinding;
import ru.ozon.app.android.travel.feature.hotels.map.shared.data.MapExtKt;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import ru.ozon.mapsdk.OzonMapView;
import ve0.b;
import we0.m;
import we0.y;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v2.presentation.HotelsMapInfoV2WidgetHolder$bind$1", f = "HotelsMapInfoV2WidgetHolder.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV2WidgetHolder$bind$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HotelsMapInfoV2VO $item;
    int label;
    final /* synthetic */ HotelsMapInfoV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV2WidgetHolder$bind$1(HotelsMapInfoV2WidgetHolder hotelsMapInfoV2WidgetHolder, HotelsMapInfoV2VO hotelsMapInfoV2VO, d<? super HotelsMapInfoV2WidgetHolder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV2WidgetHolder;
        this.$item = hotelsMapInfoV2VO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV2WidgetHolder$bind$1(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetHotelsMapInfoBinding binding;
        TravelGeoProvidersStorage travelGeoProvidersStorage;
        i iVar;
        String str;
        HotelsMapInfoV2WidgetHolder$bind$1 hotelsMapInfoV2WidgetHolder$bind$1;
        HotelsMapInfoV2Binder hotelsMapInfoV2Binder;
        InterfaceC7851b interfaceC7851b;
        WidgetHotelsMapInfoBinding binding2;
        ComponentCallbacksC5392m componentCallbacksC5392m;
        boolean z11;
        c h11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            binding = this.this$0.getBinding();
            OzonMapView hotelsMapInfoMap = binding.hotelsMapInfoMap;
            Intrinsics.checkNotNullExpressionValue(hotelsMapInfoMap, "hotelsMapInfoMap");
            travelGeoProvidersStorage = this.this$0.geoProvidersStorage;
            m locationPoint = this.$item.getLocationPoint();
            iVar = this.this$0.container;
            Context L11 = iVar.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            str = this.this$0.miniAppName;
            this.label = 1;
            hotelsMapInfoV2WidgetHolder$bind$1 = this;
            if (MapExtKt.initMapForTravel$default(hotelsMapInfoMap, travelGeoProvidersStorage, locationPoint, L11, str, null, hotelsMapInfoV2WidgetHolder$bind$1, 16, null) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            hotelsMapInfoV2WidgetHolder$bind$1 = this;
        }
        hotelsMapInfoV2Binder = hotelsMapInfoV2WidgetHolder$bind$1.this$0.binder;
        if (hotelsMapInfoV2Binder != null) {
            hotelsMapInfoV2Binder.setupMap(new HotelsMapInfoV2WidgetHolder$bind$1$1$1(hotelsMapInfoV2Binder, hotelsMapInfoV2WidgetHolder$bind$1.$item));
        }
        hotelsMapInfoV2WidgetHolder$bind$1.this$0.isMapInited = true;
        interfaceC7851b = hotelsMapInfoV2WidgetHolder$bind$1.this$0.composerController;
        interfaceC7851b.hideLoader();
        HotelsMapInfoV2WidgetHolder hotelsMapInfoV2WidgetHolder = hotelsMapInfoV2WidgetHolder$bind$1.this$0;
        binding2 = hotelsMapInfoV2WidgetHolder.getBinding();
        b value = binding2.hotelsMapInfoMap.h().getValue();
        hotelsMapInfoV2WidgetHolder.isDarkThemeActive = ((value == null || (h11 = value.h()) == null) ? null : h11.a()) == y.DARK;
        HotelsMapInfoV2WidgetHolder hotelsMapInfoV2WidgetHolder2 = hotelsMapInfoV2WidgetHolder$bind$1.this$0;
        componentCallbacksC5392m = hotelsMapInfoV2WidgetHolder2.fragment;
        z11 = hotelsMapInfoV2WidgetHolder$bind$1.this$0.isDarkThemeActive;
        hotelsMapInfoV2WidgetHolder2.changeStatusBarState(componentCallbacksC5392m, z11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV2WidgetHolder$bind$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
