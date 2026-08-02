package ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance;

import Ek.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
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
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.data.TripInsuranceDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.data.TripInsuranceMapperKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.di.TripInsuranceComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation.TripInsuranceContentKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.presentation.TripInsuranceVI;
import ru.ozon.app.android.travel.utils.compose.FixComposerWidgetBackgroundKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TripInsuranceConfigKt$TripInsurance$1 extends AbstractC7737t implements Function1<C6018d<TripInsuranceDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<TripInsuranceDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C19251 extends AbstractC7737t implements Function1<C7244b, TripInsuranceDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19251(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TripInsuranceDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (TripInsuranceDTO) this.$jsonDeserializer.fromJson(it.b(), TripInsuranceDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<TripInsuranceDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<TripInsuranceDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19251(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<TripInsuranceDTO, TripInsuranceVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/data/TripInsuranceDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$3$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<TripInsuranceDTO, d, TripInsuranceVI> {
            final /* synthetic */ TripInsuranceComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TripInsuranceComponent tripInsuranceComponent) {
                super(2);
                this.$component = tripInsuranceComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final TripInsuranceVI invoke(TripInsuranceDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return TripInsuranceMapperKt.toVI(state, info, this.$component.getContext());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$3$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<TripInsuranceVI>, Unit> {
            final /* synthetic */ TripInsuranceComponent $component;
            final /* synthetic */ j<TripInsuranceDTO, TripInsuranceVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/services/widgets/tripInsurance/presentation/TripInsuranceVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<TripInsuranceVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ TripInsuranceComponent $component;
                final /* synthetic */ j<TripInsuranceDTO, TripInsuranceVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<TripInsuranceDTO, TripInsuranceVI> jVar, TripInsuranceComponent tripInsuranceComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = tripInsuranceComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<TripInsuranceVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TripInsuranceVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(interfaceC3967k, 0);
                        TripInsuranceContentKt.TripInsuranceContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<TripInsuranceDTO, TripInsuranceVI> jVar, TripInsuranceComponent tripInsuranceComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = tripInsuranceComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TripInsuranceVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TripInsuranceVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1033706569, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<TripInsuranceDTO, TripInsuranceVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<TripInsuranceDTO, TripInsuranceVI> jVar) {
            TripInsuranceComponent tripInsuranceComponent = (TripInsuranceComponent) a.c(jVar, "$this$viewMapper", TripInsuranceComponent.class);
            c.l(jVar, null, new AnonymousClass1(tripInsuranceComponent), 1, null);
            jVar.G(new AnonymousClass2(jVar, tripInsuranceComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripInsuranceConfigKt$TripInsurance$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<TripInsuranceDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<TripInsuranceDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(TripInsuranceComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.tripInsurance.TripInsuranceConfigKt$TripInsurance$1$2$1
                    @Override // k20.InterfaceC7469a
                    public final TripInsuranceComponent component() {
                        return new TripInsuranceComponent(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
