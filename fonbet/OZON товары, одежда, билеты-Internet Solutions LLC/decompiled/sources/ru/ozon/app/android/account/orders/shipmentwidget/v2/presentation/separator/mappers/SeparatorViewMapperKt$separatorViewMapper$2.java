package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers;

import Ek.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.SeparatorDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.viewItem.SeparatorVO;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/viewItem/SeparatorVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class SeparatorViewMapperKt$separatorViewMapper$2 extends AbstractC7737t implements Function1<j<Object, SeparatorVO>, Unit> {
    public static final SeparatorViewMapperKt$separatorViewMapper$2 INSTANCE = new SeparatorViewMapperKt$separatorViewMapper$2();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.SeparatorViewMapperKt$separatorViewMapper$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof SeparatorDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/viewItem/SeparatorVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.SeparatorViewMapperKt$separatorViewMapper$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, List<? extends SeparatorVO>> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
            super(2);
            this.$component = shipmentWidgetV2ComponentV2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<SeparatorVO> invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return this.$component.getSeparatorMapper().invoke((SeparatorDTO) state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/viewItem/SeparatorVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.SeparatorViewMapperKt$separatorViewMapper$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<SeparatorVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<SeparatorVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<SeparatorVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(ComposableSingletons$SeparatorViewMapperKt.INSTANCE.m467getLambda1$cs_orders_prodGoogleAllVendorsRelease());
        }
    }

    SeparatorViewMapperKt$separatorViewMapper$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, SeparatorVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, SeparatorVO> jVar) {
        jVar.i(AnonymousClass1.INSTANCE, new AnonymousClass2((ShipmentWidgetV2ComponentV2) a.c(jVar, "$this$viewMapper", ShipmentWidgetV2ComponentV2.class)));
        jVar.G(AnonymousClass3.INSTANCE);
    }
}
