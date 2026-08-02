package ru.ozon.app.android.orderdetails.orderSmartAddress;

import S0.InterfaceC3967k;
import WZ.l;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.actionHandlers.CopyTextActionHandler;
import ru.ozon.app.android.orderdetails.orderSmartAddress.data.OrderSmartAddressDTO;
import ru.ozon.app.android.orderdetails.orderSmartAddress.data.OrderSmartAddressMapper;
import ru.ozon.app.android.orderdetails.orderSmartAddress.di.OrderSmartAddressComponent;
import ru.ozon.app.android.orderdetails.orderSmartAddress.presentation.OrderSmartAddressComposableKt;
import ru.ozon.app.android.orderdetails.orderSmartAddress.viewObject.OrderSmartAddressVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1 extends AbstractC7737t implements Function1<C6018d<OrderSmartAddressDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<OrderSmartAddressDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, OrderSmartAddressDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final OrderSmartAddressDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (OrderSmartAddressDTO) this.$jsonDeserializer.fromJson(it.b(), OrderSmartAddressDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<OrderSmartAddressDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<OrderSmartAddressDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<OrderSmartAddressDTO, OrderSmartAddressVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        /* synthetic */ class AnonymousClass1 extends C7735q implements Function2<OrderSmartAddressDTO, d, OrderSmartAddressVO> {
            AnonymousClass1(Object obj) {
                super(2, obj, OrderSmartAddressMapper.class, "map", "map(Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressDTO;Lru/ozon/composer/widget/item/WidgetInfo;)Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final OrderSmartAddressVO invoke(OrderSmartAddressDTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((OrderSmartAddressMapper) this.receiver).map(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<OrderSmartAddressVO>, Unit> {
            final /* synthetic */ j<OrderSmartAddressDTO, OrderSmartAddressVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/viewObject/OrderSmartAddressVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<OrderSmartAddressVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<OrderSmartAddressDTO, OrderSmartAddressVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<OrderSmartAddressDTO, OrderSmartAddressVO> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<OrderSmartAddressVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<OrderSmartAddressVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), ((OrderSmartAddressComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(OrderSmartAddressComponent.class)).getCustomActionHandlersStoreFactory().create(CopyTextActionHandler.class)));
                    l lVar = (l) interfaceC3967k.m(f.e());
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    interfaceC3967k.o(1659456682);
                    boolean F11 = (i12 == 4) | interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$3$2$1$1$1(content, lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
                    OrderSmartAddressComposableKt.OrderSmartAddressComposable(content.b(), m470buildHandlerimpl, interfaceC3967k, CellDTO.$stable);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<OrderSmartAddressDTO, OrderSmartAddressVO> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<OrderSmartAddressVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<OrderSmartAddressVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1104641492, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<OrderSmartAddressDTO, OrderSmartAddressVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<OrderSmartAddressDTO, OrderSmartAddressVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, new AnonymousClass1(((OrderSmartAddressComponent) viewMapper.getWidgetComponentStorage().getComponent(OrderSmartAddressComponent.class)).getMapper()), 1, null);
            viewMapper.G(new AnonymousClass2(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<OrderSmartAddressDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<OrderSmartAddressDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(OrderSmartAddressComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.orderdetails.orderSmartAddress.OrderSmartAddressWidgetKt$OrderSmartAddressWidget$1$1$1
                    @Override // k20.InterfaceC7469a
                    public final OrderSmartAddressComponent component() {
                        return OrderSmartAddressComponent.INSTANCE.create(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
