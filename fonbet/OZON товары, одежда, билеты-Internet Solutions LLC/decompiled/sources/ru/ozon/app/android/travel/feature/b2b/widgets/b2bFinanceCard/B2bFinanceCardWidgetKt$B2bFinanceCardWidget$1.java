package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard;

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
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.data.B2bFinanceCardDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.data.B2bFinanceCardMapperKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.di.B2bFinanceCardComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.presentation.B2bFinanceCardContentKt;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.presentation.B2bFinanceCardVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1 extends AbstractC7737t implements Function1<C6018d<B2bFinanceCardDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<B2bFinanceCardDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C18951 extends AbstractC7737t implements Function1<C7244b, B2bFinanceCardDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18951(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final B2bFinanceCardDTO invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return (B2bFinanceCardDTO) this.$jsonDeserializer.fromJson(state.b(), B2bFinanceCardDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<B2bFinanceCardDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<B2bFinanceCardDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18951(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<B2bFinanceCardDTO, B2bFinanceCardVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/data/B2bFinanceCardDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<B2bFinanceCardDTO, d, B2bFinanceCardVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final B2bFinanceCardVI invoke(B2bFinanceCardDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return B2bFinanceCardMapperKt.toVI(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C18962 extends AbstractC7737t implements Function1<k<B2bFinanceCardVI>, Unit> {
            final /* synthetic */ B2bFinanceCardComponent $component;
            final /* synthetic */ j<B2bFinanceCardDTO, B2bFinanceCardVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceCard/presentation/B2bFinanceCardVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<B2bFinanceCardVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ B2bFinanceCardComponent $component;
                final /* synthetic */ j<B2bFinanceCardDTO, B2bFinanceCardVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<B2bFinanceCardDTO, B2bFinanceCardVI> jVar, B2bFinanceCardComponent b2bFinanceCardComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = b2bFinanceCardComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<B2bFinanceCardVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<B2bFinanceCardVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        B2bFinanceCardContentKt.B2bFinanceCardContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18962(j<B2bFinanceCardDTO, B2bFinanceCardVI> jVar, B2bFinanceCardComponent b2bFinanceCardComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = b2bFinanceCardComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<B2bFinanceCardVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<B2bFinanceCardVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 531434572, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<B2bFinanceCardDTO, B2bFinanceCardVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<B2bFinanceCardDTO, B2bFinanceCardVI> jVar) {
            B2bFinanceCardComponent b2bFinanceCardComponent = (B2bFinanceCardComponent) a.c(jVar, "$this$viewMapper", B2bFinanceCardComponent.class);
            c.l(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.G(new C18962(jVar, b2bFinanceCardComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<B2bFinanceCardDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<B2bFinanceCardDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(B2bFinanceCardComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceCard.B2bFinanceCardWidgetKt$B2bFinanceCardWidget$1$3$1
                    @Override // k20.InterfaceC7469a
                    public final B2bFinanceCardComponent component() {
                        return new B2bFinanceCardComponent(C7475g.this);
                    }
                });
            }
        });
    }
}
