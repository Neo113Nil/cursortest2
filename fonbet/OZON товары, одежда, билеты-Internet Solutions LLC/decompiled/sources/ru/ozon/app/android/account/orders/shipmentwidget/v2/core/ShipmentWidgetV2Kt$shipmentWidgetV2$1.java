package ru.ozon.app.android.account.orders.shipmentwidget.v2.core;

import d00.C6018d;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import ru.ozon.app.android.account.orders.common.shipmentwidget.ShipmentWidgetV2Parser;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementViewMapperKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsViewMapperKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesViewMapperKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsViewMapperKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.SeparatorViewMapperKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.mappers.TextIconViewMapperKt;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListWidgetComponent;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeViewMapperKt;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.separator.di.SeparatorComponent;
import ru.ozon.composer.compose.widget.config.b;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ShipmentWidgetV2Kt$shipmentWidgetV2$1 extends AbstractC7737t implements Function1<C6018d<Object>, Unit> {
    public static final ShipmentWidgetV2Kt$shipmentWidgetV2$1 INSTANCE = new ShipmentWidgetV2Kt$shipmentWidgetV2$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.core.ShipmentWidgetV2Kt$shipmentWidgetV2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<Object>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj20/b;", "state", "", "", "invoke", "(Lj20/b;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.core.ShipmentWidgetV2Kt$shipmentWidgetV2$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, List<? extends Object>> {
            final /* synthetic */ ShipmentWidgetV2Parser $parser;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ShipmentWidgetV2Parser shipmentWidgetV2Parser) {
                super(1);
                this.$parser = shipmentWidgetV2Parser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final List<Object> invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return this.$parser.invoke((String) null, state.b());
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<Object> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<Object> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.h(config, null, new AnonymousClass1(((ShipmentWidgetV2ComponentV2) config.getWidgetComponentStorage().getComponent(ShipmentWidgetV2ComponentV2.class)).getParser()), 1, null);
        }
    }

    ShipmentWidgetV2Kt$shipmentWidgetV2$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<Object> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<Object> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.core.ShipmentWidgetV2Kt$shipmentWidgetV2$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ShipmentWidgetV2ComponentV2.INSTANCE.create(it);
            }
        });
        ComposeWidget.a(AnonymousClass2.INSTANCE);
        final ViewMapper2 viewMapper2 = new ViewMapper2[]{new CellListV2ViewMapper()}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.core.ShipmentWidgetV2Kt$shipmentWidgetV2$1$invoke$$inlined$rawComponentMappers$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(CellListWidgetComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        final ViewMapper2 viewMapper22 = new ViewMapper2[]{new SeparatorViewMapper()}[0];
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.core.ShipmentWidgetV2Kt$shipmentWidgetV2$1$invoke$$inlined$rawComponentMappers$2
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ViewMapper2.this.setComponent(it.getComponent(SeparatorComponent.class));
                Intrinsics.g(ViewMapper2.this, "null cannot be cast to non-null type ru.ozon.composer.widget.mapper.ViewItemMapper<S of ru.ozon.app.android.pdp.ui.configurators.ComposeWidgetExtKt.rawComponentMappers, ru.ozon.composer.widget.item.ViewItem>");
                return ViewMapper2.this;
            }
        });
        ComposeWidgetExtKt.rawViewMappers(ComposeWidget, new CommonIslandSeparatorViewMapper2());
        TextIconViewMapperKt.textIconViewMapper(ComposeWidget);
        SeparatorViewMapperKt.separatorViewMapper(ComposeWidget);
        ButtonsViewMapperKt.buttonsViewMapper(ComposeWidget);
        ImagesViewMapperKt.imagesViewMapper(ComposeWidget);
        AtomElementViewMapperKt.atomElementsViewMapper(ComposeWidget);
        ProductsViewMapperKt.productsViewMapper(ComposeWidget);
        CodeComposeViewMapperKt.codeComposeViewMapper(ComposeWidget);
    }
}
