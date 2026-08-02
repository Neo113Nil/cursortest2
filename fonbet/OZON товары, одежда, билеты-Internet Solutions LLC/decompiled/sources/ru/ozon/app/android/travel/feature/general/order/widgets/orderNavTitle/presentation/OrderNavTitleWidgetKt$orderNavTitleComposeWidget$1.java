package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import S0.A1;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import Sc.InterfaceC4008j;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import android.animation.ArgbEvaluator;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import k20.InterfaceC7469a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l1.C7807Z;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarViewModel;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.data.OrderNavTitleConfig;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.data.OrderNavTitleDTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.di.OrderNavTitleComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleVO;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<OrderNavTitleDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<OrderNavTitleDTO, OrderNavTitleVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof OrderNavTitleDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C19232 extends AbstractC7737t implements Function2<OrderNavTitleDTO, d, List<? extends OrderNavTitleVO>> {
            final /* synthetic */ InterfaceC4008j<OrderNavTitleComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19232(InterfaceC4008j<OrderNavTitleComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<OrderNavTitleVO> invoke(OrderNavTitleDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass2.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<OrderNavTitleVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<OrderNavTitleComponent> $component$delegate;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<OrderNavTitleVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<OrderNavTitleComponent> $component$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InterfaceC4008j<OrderNavTitleComponent> interfaceC4008j) {
                    super(4);
                    this.$component$delegate = interfaceC4008j;
                }

                private static final C7807Z invoke$lambda$11(A1<C7807Z> a12) {
                    return a12.getValue();
                }

                private static final C7807Z invoke$lambda$13(A1<C7807Z> a12) {
                    return a12.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final float invoke$lambda$2(InterfaceC3978p0<Float> interfaceC3978p0) {
                    return interfaceC3978p0.getValue().floatValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$3(InterfaceC3978p0<Float> interfaceC3978p0, float f7) {
                    interfaceC3978p0.setValue(Float.valueOf(f7));
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<OrderNavTitleVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<OrderNavTitleVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
                    AbstractC5434v lifecycle = ((C4911f) interfaceC3967k.m(f.d())).g().getLifecycle();
                    h hVar = (h) interfaceC3967k.m(f.f());
                    interfaceC3967k.o(-453225546);
                    boolean F11 = interfaceC3967k.F(this.$component$delegate);
                    InterfaceC4008j<OrderNavTitleComponent> interfaceC4008j = this.$component$delegate;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$orderNavBarViewModel$1$1(interfaceC4008j);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    OrderNavBarViewModel orderNavBarViewModel = (OrderNavBarViewModel) ((w0) a00.j.a(hVar.a(), N.b(OrderNavBarViewModel.class), (Function0) C11).getValue());
                    interfaceC3967k.o(-453223061);
                    Object C12 = interfaceC3967k.C();
                    if (C12 == InterfaceC3967k.a.a()) {
                        C12 = n1.f(Float.valueOf(1.0f), D1.f25195a);
                        interfaceC3967k.x(C12);
                    }
                    InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
                    interfaceC3967k.k();
                    Unit unit = Unit.f71690a;
                    interfaceC3967k.o(-453220475);
                    boolean F12 = interfaceC3967k.F(orderNavBarViewModel) | interfaceC3967k.F(lifecycle);
                    Object C13 = interfaceC3967k.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1(orderNavBarViewModel, lifecycle, interfaceC3978p0, null);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C13);
                    interfaceC3967k.o(-453207544);
                    Object C14 = interfaceC3967k.C();
                    if (C14 == InterfaceC3967k.a.a()) {
                        C14 = new ArgbEvaluator();
                        interfaceC3967k.x(C14);
                    }
                    ArgbEvaluator argbEvaluator = (ArgbEvaluator) C14;
                    interfaceC3967k.k();
                    OrderNavTitleVO b11 = content.b();
                    Intrinsics.g(b11, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleVO");
                    OrderNavTitleVO orderNavTitleVO = b11;
                    interfaceC3967k.o(-453203561);
                    Object C15 = interfaceC3967k.C();
                    if (C15 == InterfaceC3967k.a.a()) {
                        C15 = Integer.valueOf(StyleParser.INSTANCE.parseColorInt(context, orderNavTitleVO.getTitleColors().getCollapsed(), UniColors.TEXT_PRIMARY.getResId()));
                        interfaceC3967k.x(C15);
                    }
                    int intValue = ((Number) C15).intValue();
                    interfaceC3967k.k();
                    interfaceC3967k.o(-453197762);
                    Object C16 = interfaceC3967k.C();
                    if (C16 == InterfaceC3967k.a.a()) {
                        C16 = Integer.valueOf(StyleParser.INSTANCE.parseColorInt(context, orderNavTitleVO.getTitleColors().getExpanded(), UniColors.TEXT_PRIMARY_ON_DARK.getResId()));
                        interfaceC3967k.x(C16);
                    }
                    int intValue2 = ((Number) C16).intValue();
                    interfaceC3967k.k();
                    interfaceC3967k.o(-453191619);
                    Object C17 = interfaceC3967k.C();
                    if (C17 == InterfaceC3967k.a.a()) {
                        StyleParser styleParser = StyleParser.INSTANCE;
                        OrderNavTitleVO.TextColors subtitleColors = orderNavTitleVO.getSubtitleColors();
                        C17 = Integer.valueOf(styleParser.parseColorInt(context, subtitleColors != null ? subtitleColors.getCollapsed() : null, UniColors.TEXT_SECONDARY.getResId()));
                        interfaceC3967k.x(C17);
                    }
                    int intValue3 = ((Number) C17).intValue();
                    interfaceC3967k.k();
                    interfaceC3967k.o(-453185532);
                    Object C18 = interfaceC3967k.C();
                    if (C18 == InterfaceC3967k.a.a()) {
                        StyleParser styleParser2 = StyleParser.INSTANCE;
                        OrderNavTitleVO.TextColors subtitleColors2 = orderNavTitleVO.getSubtitleColors();
                        C18 = Integer.valueOf(styleParser2.parseColorInt(context, subtitleColors2 != null ? subtitleColors2.getExpanded() : null, UniColors.TEXT_SECONDARY_ON_DARK.getResId()));
                        interfaceC3967k.x(C18);
                    }
                    int intValue4 = ((Number) C18).intValue();
                    interfaceC3967k.k();
                    interfaceC3967k.o(-453179292);
                    Object C19 = interfaceC3967k.C();
                    if (C19 == InterfaceC3967k.a.a()) {
                        C19 = n1.e(new OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$titleColor$2$1(argbEvaluator, intValue, intValue2, interfaceC3978p0));
                        interfaceC3967k.x(C19);
                    }
                    A1 a12 = (A1) C19;
                    interfaceC3967k.k();
                    interfaceC3967k.o(-453166007);
                    Object C21 = interfaceC3967k.C();
                    if (C21 == InterfaceC3967k.a.a()) {
                        C21 = n1.e(new OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$subtitleColor$2$1(argbEvaluator, intValue3, intValue4, interfaceC3978p0));
                        interfaceC3967k.x(C21);
                    }
                    interfaceC3967k.k();
                    OrderNavTitleContentKt.m1309OrderNavTitleContenthtJMNJ8(content.b(), invoke$lambda$11(a12), invoke$lambda$13((A1) C21), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(InterfaceC4008j<OrderNavTitleComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<OrderNavTitleVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<OrderNavTitleVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1418025087, new AnonymousClass1(this.$component$delegate)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OrderNavTitleComponent invoke$lambda$0(InterfaceC4008j<OrderNavTitleComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<OrderNavTitleDTO, OrderNavTitleVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<OrderNavTitleDTO, OrderNavTitleVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new C19232(b11));
            viewMapper.G(new AnonymousClass3(b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<OrderNavTitleDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<OrderNavTitleDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new OrderNavTitleConfig(JsonParser.this);
            }
        });
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(OrderNavTitleComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$3$1
                    @Override // k20.InterfaceC7469a
                    public final OrderNavTitleComponent component() {
                        return new OrderNavTitleComponent();
                    }
                });
            }
        });
    }
}
