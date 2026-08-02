package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation;

import Ek.a;
import S0.InterfaceC3967k;
import a1.C4912a;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data.InsuranceUpgradeBannerConfig;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data.InsuranceUpgradeBannerDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.di.InsuranceUpgradeBannerComponent;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<InsuranceUpgradeBannerDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof InsuranceUpgradeBannerDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes11.dex */
        static final class C18912 extends AbstractC7737t implements Function2<InsuranceUpgradeBannerDTO, d, List<? extends InsuranceUpgradeBannerComposeVI>> {
            final /* synthetic */ InsuranceUpgradeBannerComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18912(InsuranceUpgradeBannerComponent insuranceUpgradeBannerComponent) {
                super(2);
                this.$component = insuranceUpgradeBannerComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<InsuranceUpgradeBannerComposeVI> invoke(InsuranceUpgradeBannerDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return this.$component.getInsuranceUpgradeBannerMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$2$3, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<InsuranceUpgradeBannerComposeVI>, Unit> {
            final /* synthetic */ InsuranceUpgradeBannerComponent $component;
            final /* synthetic */ j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/presentation/InsuranceUpgradeBannerComposeVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<InsuranceUpgradeBannerComposeVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InsuranceUpgradeBannerComponent $component;
                final /* synthetic */ j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI> jVar, InsuranceUpgradeBannerComponent insuranceUpgradeBannerComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = insuranceUpgradeBannerComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<InsuranceUpgradeBannerComposeVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<InsuranceUpgradeBannerComposeVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        InsuranceUpgradeBannerComposeWidgetKt.InsuranceUpgradeBannerComposeWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionHandler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI> jVar, InsuranceUpgradeBannerComponent insuranceUpgradeBannerComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = insuranceUpgradeBannerComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<InsuranceUpgradeBannerComposeVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<InsuranceUpgradeBannerComposeVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1253609265, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<InsuranceUpgradeBannerDTO, InsuranceUpgradeBannerComposeVI> jVar) {
            InsuranceUpgradeBannerComponent insuranceUpgradeBannerComponent = (InsuranceUpgradeBannerComponent) a.c(jVar, "$this$viewMapper", InsuranceUpgradeBannerComponent.class);
            jVar.i(AnonymousClass1.INSTANCE, new C18912(insuranceUpgradeBannerComponent));
            jVar.G(new AnonymousClass3(jVar, insuranceUpgradeBannerComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<InsuranceUpgradeBannerDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<InsuranceUpgradeBannerDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new InsuranceUpgradeBannerConfig(JsonParser.this);
            }
        });
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(InsuranceUpgradeBannerComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.presentation.InsuranceUpgradeBannerWidgetKt$insuranceUpgradeBannerWidgetFactory$1$3$1
                    @Override // k20.InterfaceC7469a
                    public final InsuranceUpgradeBannerComponent component() {
                        return new InsuranceUpgradeBannerComponent(C7475g.this);
                    }
                });
            }
        });
    }
}
