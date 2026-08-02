package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers;

import Ek.a;
import S0.InterfaceC3967k;
import Vg.e;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ButtonsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.di.ShipmentWidgetV2ComponentV2;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.composable.ButtonsComposableKt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.viewItem.ButtonsVO;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.cscore.padding.HorizontalPadding;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ButtonsViewMapperKt$buttonsViewMapper$1 extends AbstractC7737t implements Function1<j<Object, ButtonsVO>, Unit> {
    public static final ButtonsViewMapperKt$buttonsViewMapper$1 INSTANCE = new ButtonsViewMapperKt$buttonsViewMapper$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsViewMapperKt$buttonsViewMapper$1$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof ButtonsDTO);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;", "invoke", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsViewMapperKt$buttonsViewMapper$1$2, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<Object, d, List<? extends ButtonsVO>> {
        final /* synthetic */ ShipmentWidgetV2ComponentV2 $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2) {
            super(2);
            this.$component = shipmentWidgetV2ComponentV2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<ButtonsVO> invoke(Object state, d info) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return this.$component.getButtonsMapper().invoke((ButtonsDTO) state, info);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsViewMapperKt$buttonsViewMapper$1$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<ButtonsVO>, Unit> {
        final /* synthetic */ j<Object, ButtonsVO> $this_viewMapper;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsViewMapperKt$buttonsViewMapper$1$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ButtonsVO>, g.a, InterfaceC3967k, Integer, Unit> {
            final /* synthetic */ j<Object, ButtonsVO> $this_viewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(j<Object, ButtonsVO> jVar) {
                super(4);
                this.$this_viewMapper = jVar;
            }

            @Override // fd.InterfaceC6512o
            public /* bridge */ /* synthetic */ Unit invoke(i<ButtonsVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                invoke(iVar, aVar, interfaceC3967k, num.intValue());
                return Unit.f71690a;
            }

            public final void invoke(i<ButtonsVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                int i12;
                Intrinsics.checkNotNullParameter(content, "$this$content");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i11 & 6) == 0) {
                    i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                } else {
                    i12 = i11;
                }
                if ((i12 & 131) == 130 && interfaceC3967k.b()) {
                    interfaceC3967k.j();
                    return;
                }
                final ShipmentWidgetV2ComponentV2 shipmentWidgetV2ComponentV2 = (ShipmentWidgetV2ComponentV2) this.$this_viewMapper.getWidgetComponentStorage().getComponent(ShipmentWidgetV2ComponentV2.class);
                CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(((h) interfaceC3967k.m(f.f())).a(), new z0.c() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsViewMapperKt$buttonsViewMapper$1$3$1$invoke$$inlined$viewModel$1
                    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                    public <T extends w0> T create(Class<T> modelClass) {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        CreateAndPayViewModel createAndPayViewModel2 = ShipmentWidgetV2ComponentV2.this.getCreateAndPayViewModelProvider().get();
                        Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                        return createAndPayViewModel2;
                    }
                }).a(CreateAndPayViewModel.class);
                ButtonsVO b11 = content.b();
                int i13 = i12 & 14;
                e.a widgetActionHandlerBuilder = WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14);
                Vg.d customActionHandlersStoreFactory = shipmentWidgetV2ComponentV2.getCustomActionHandlersStoreFactory();
                Class[] elements = {ComposerActionAndRedirectActionHandler.class, ComposerActionWithActionHandler.class};
                Intrinsics.checkNotNullParameter(elements, "elements");
                e.a m473handlersStoreDnHbjWo = WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(widgetActionHandlerBuilder, customActionHandlersStoreFactory.create(C7705l.j0(elements)));
                interfaceC3967k.o(471015038);
                boolean F11 = interfaceC3967k.F(createAndPayViewModel) | (i13 == 4);
                Object C11 = interfaceC3967k.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new ButtonsViewMapperKt$buttonsViewMapper$1$3$1$1$1(createAndPayViewModel, content);
                    interfaceC3967k.x(C11);
                }
                interfaceC3967k.k();
                ButtonsComposableKt.ButtonsComposable(b11, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(m473handlersStoreDnHbjWo, (Function1) C11)), interfaceC3967k, IconButtonV3DTO.$stable | HorizontalPadding.$stable);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(j<Object, ButtonsVO> jVar) {
            super(1);
            this.$this_viewMapper = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(k<ButtonsVO> kVar) {
            invoke2(kVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(k<ButtonsVO> widgetSpec) {
            Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
            widgetSpec.a(new C4912a(true, 862012093, new AnonymousClass1(this.$this_viewMapper)));
        }
    }

    ButtonsViewMapperKt$buttonsViewMapper$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(j<Object, ButtonsVO> jVar) {
        invoke2(jVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(j<Object, ButtonsVO> jVar) {
        jVar.i(AnonymousClass1.INSTANCE, new AnonymousClass2((ShipmentWidgetV2ComponentV2) a.c(jVar, "$this$viewMapper", ShipmentWidgetV2ComponentV2.class)));
        jVar.G(new AnonymousClass3(jVar));
    }
}
