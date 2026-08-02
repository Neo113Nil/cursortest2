package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers;

import Ek.a;
import S0.InterfaceC3967k;
import WZ.l;
import WZ.t;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegate;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ProductsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.composable.ProductsComposableKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductsVO;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ProductsViewMapperKt$productsViewMapper$2 extends AbstractC7737t implements Function1<j<Object, ProductsVO>, Unit> {
    public static final ProductsViewMapperKt$productsViewMapper$2 INSTANCE = new ProductsViewMapperKt$productsViewMapper$2();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsViewMapperKt$productsViewMapper$2$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ProductsDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsViewMapperKt$productsViewMapper$2$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, List<? extends ProductsVO>> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
            super(2);
            this.$component = shipmentWidgetV2ComponentV2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<ProductsVO> invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return this.$component.getProductsMapper().invoke((ProductsDTO) state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsViewMapperKt$productsViewMapper$2$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<ProductsVO>, Unit> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;
        final /* synthetic */ j<Object, ProductsVO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsViewMapperKt$productsViewMapper$2$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ProductsVO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;
            final /* synthetic */ j<Object, ProductsVO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2, j<Object, ProductsVO> jVar) {
                super(4);
                this.$component = shipmentWidgetV2ComponentV2;
                this.$this_viewMapper = jVar;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<ProductsVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<ProductsVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i11 |= interfaceC3967k.n(content) ? 4 : 2;
                }
                if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                l lVar = (l) interfaceC3967k.m(f.e());
                t tokenizedEvent = content.b().getTokenizedEvent();
                interfaceC3967k.o(980402962);
                if (tokenizedEvent != null) {
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    interfaceC3967k.o(-1113825035);
                    boolean F11 = interfaceC3967k.F(lVar) | interfaceC3967k.F(tokenizedEvent);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ProductsViewMapperKt$productsViewMapper$2$3$1$1$1$1(lVar, tokenizedEvent);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
                    Unit unit = Unit.f71690a;
                }
                interfaceC3967k.k();
                AdultListDelegate adultListDelegate = this.$component.getAdultListDelegateProvider().get();
                adultListDelegate.bindItems(content.b().getProducts());
                ProductsComposableKt.ProductsComposable(content.b(), adultListDelegate, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(e0.h(ComposerActionWithActionHandler.class)))), interfaceC3967k, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2, j<Object, ProductsVO> jVar) {
            super(1);
            this.$component = shipmentWidgetV2ComponentV2;
            this.$this_viewMapper = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<ProductsVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<ProductsVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, -1533557542, new AnonymousClass1(this.$component, this.$this_viewMapper)));
        }
    }

    ProductsViewMapperKt$productsViewMapper$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, ProductsVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, ProductsVO> jVar) {
        ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2 = (ShipmentWidgetV2ComponentV2) a.c(jVar, "$this$viewMapper", ShipmentWidgetV2ComponentV2.class);
        jVar.i(AnonymousClass1.INSTANCE, new AnonymousClass2(shipmentWidgetV2ComponentV2));
        jVar.G(new AnonymousClass3(shipmentWidgetV2ComponentV2, jVar));
    }
}
