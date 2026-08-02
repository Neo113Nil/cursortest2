package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import Sc.s;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.MapEvent;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.view.HotelsMapInfoV4View;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import we0.m;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4WidgetViewHolder$bind$1", f = "HotelsMapInfoV4WidgetViewHolder.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsMapInfoV4WidgetViewHolder$bind$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HotelsMapInfoV4VO $item;
    int label;
    final /* synthetic */ HotelsMapInfoV4WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation.HotelsMapInfoV4WidgetViewHolder$bind$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ HotelsMapInfoV4VO $item;
        final /* synthetic */ HotelsMapInfoV4WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsMapInfoV4WidgetViewHolder hotelsMapInfoV4WidgetViewHolder, HotelsMapInfoV4VO hotelsMapInfoV4VO) {
            super(0);
            this.this$0 = hotelsMapInfoV4WidgetViewHolder;
            this.$item = hotelsMapInfoV4VO;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HotelsMapInfoV4Wrapper hotelsMapInfoV4Wrapper;
            HotelsMapInfoV4WidgetViewHolder$viewObserver$1 hotelsMapInfoV4WidgetViewHolder$viewObserver$1;
            InterfaceC7851b interfaceC7851b;
            HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel;
            hotelsMapInfoV4Wrapper = this.this$0.mapWrapper;
            if (hotelsMapInfoV4Wrapper != null) {
                hotelsMapInfoV4Wrapper.observeActions();
            }
            AbstractC5434v lifecycle = this.this$0.getLifecycle();
            hotelsMapInfoV4WidgetViewHolder$viewObserver$1 = this.this$0.viewObserver;
            lifecycle.a(hotelsMapInfoV4WidgetViewHolder$viewObserver$1);
            this.this$0.isMapInited = true;
            interfaceC7851b = this.this$0.composerController;
            interfaceC7851b.hideLoader();
            hotelsMapInfoV4ViewModel = this.this$0.viewModel;
            hotelsMapInfoV4ViewModel.onEvent(new MapEvent.OnBind(this.$item));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4WidgetViewHolder$bind$1(HotelsMapInfoV4WidgetViewHolder hotelsMapInfoV4WidgetViewHolder, HotelsMapInfoV4VO hotelsMapInfoV4VO, d<? super HotelsMapInfoV4WidgetViewHolder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsMapInfoV4WidgetViewHolder;
        this.$item = hotelsMapInfoV4VO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsMapInfoV4WidgetViewHolder$bind$1(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsMapInfoV4View hotelsMapInfoV4View;
        TravelGeoProvidersStorage travelGeoProvidersStorage;
        Context context;
        String str;
        HotelsMapInfoV4WidgetViewHolder$bind$1 hotelsMapInfoV4WidgetViewHolder$bind$1;
        HotelsMapInfoV4View hotelsMapInfoV4View2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            hotelsMapInfoV4View = this.this$0.hotelsMapInfoView;
            travelGeoProvidersStorage = this.this$0.travelGeoProvidersStorage;
            m locationPoint = this.$item.getLocationPoint();
            context = this.this$0.context;
            Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
            str = this.this$0.miniAppName;
            this.label = 1;
            hotelsMapInfoV4WidgetViewHolder$bind$1 = this;
            if (hotelsMapInfoV4View.initMap(travelGeoProvidersStorage, locationPoint, context, str, hotelsMapInfoV4WidgetViewHolder$bind$1) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            hotelsMapInfoV4WidgetViewHolder$bind$1 = this;
        }
        hotelsMapInfoV4View2 = hotelsMapInfoV4WidgetViewHolder$bind$1.this$0.hotelsMapInfoView;
        hotelsMapInfoV4View2.setupMap(hotelsMapInfoV4WidgetViewHolder$bind$1.this$0.getLifecycle(), new AnonymousClass1(hotelsMapInfoV4WidgetViewHolder$bind$1.this$0, hotelsMapInfoV4WidgetViewHolder$bind$1.$item));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsMapInfoV4WidgetViewHolder$bind$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
