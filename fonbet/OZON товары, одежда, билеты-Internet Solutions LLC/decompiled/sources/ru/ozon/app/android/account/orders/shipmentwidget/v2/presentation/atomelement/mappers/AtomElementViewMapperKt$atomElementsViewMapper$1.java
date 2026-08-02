package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers;

import Ek.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.AtomDTOHolder;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.composable.AtomElementComposableKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem.AtomElementVO;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AtomElementViewMapperKt$atomElementsViewMapper$1 extends AbstractC7737t implements Function1<j<Object, AtomElementVO>, Unit> {
    public static final AtomElementViewMapperKt$atomElementsViewMapper$1 INSTANCE = new AtomElementViewMapperKt$atomElementsViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementViewMapperKt$atomElementsViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AtomDTOHolder);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementViewMapperKt$atomElementsViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, List<? extends AtomElementVO>> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
            super(2);
            this.$component = shipmentWidgetV2ComponentV2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<AtomElementVO> invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return this.$component.getAtomElementMapper().invoke((AtomDTOHolder) state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementViewMapperKt$atomElementsViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<AtomElementVO>, Unit> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;
        final /* synthetic */ j<Object, AtomElementVO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/AtomElementVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementViewMapperKt$atomElementsViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<AtomElementVO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;
            final /* synthetic */ j<Object, AtomElementVO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2, j<Object, AtomElementVO> jVar) {
                super(4);
                this.$component = shipmentWidgetV2ComponentV2;
                this.$this_viewMapper = jVar;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<AtomElementVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<AtomElementVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i11 |= interfaceC3967k.n(content) ? 4 : 2;
                }
                if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                } else {
                    AtomElementComposableKt.AtomElementComposable(this.$component.getAppType(), content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(e0.h(ComposerActionWithActionHandler.class)))), interfaceC3967k, (AtomDTO.$stable | HorizontalPadding.$stable) << 3);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2, j<Object, AtomElementVO> jVar) {
            super(1);
            this.$component = shipmentWidgetV2ComponentV2;
            this.$this_viewMapper = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<AtomElementVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<AtomElementVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 1255388338, new AnonymousClass1(this.$component, this.$this_viewMapper)));
        }
    }

    AtomElementViewMapperKt$atomElementsViewMapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, AtomElementVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, AtomElementVO> jVar) {
        ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2 = (ShipmentWidgetV2ComponentV2) a.c(jVar, "$this$viewMapper", ShipmentWidgetV2ComponentV2.class);
        jVar.i(AnonymousClass1.INSTANCE, new AnonymousClass2(shipmentWidgetV2ComponentV2));
        jVar.G(new AnonymousClass3(shipmentWidgetV2ComponentV2, jVar));
    }
}
