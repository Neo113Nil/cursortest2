package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6616a;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
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
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.data.InsuranceCarouselDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.di.InsuranceCarouselComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.view.InsuranceCarouselWidgetContentKt;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class InsuranceCarouselWidgetKt$insuranceCarouselWidget$1 extends AbstractC7737t implements Function1<C6018d<InsuranceCarouselDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<InsuranceCarouselDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C18891 extends AbstractC7737t implements Function1<C7244b, InsuranceCarouselDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18891(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InsuranceCarouselDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (InsuranceCarouselDTO) this.$jsonDeserializer.fromJson(it.b(), InsuranceCarouselDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<InsuranceCarouselDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<InsuranceCarouselDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18891(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<InsuranceCarouselDTO, InsuranceCarouselVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof InsuranceCarouselDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/data/InsuranceCarouselDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<InsuranceCarouselDTO, d, List<? extends InsuranceCarouselVI>> {
            final /* synthetic */ InterfaceC4008j<InsuranceCarouselComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InterfaceC4008j<InsuranceCarouselComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<InsuranceCarouselVI> invoke(InsuranceCarouselDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass3.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C18903 extends AbstractC7737t implements Function1<k<InsuranceCarouselVI>, Unit> {
            final /* synthetic */ InterfaceC4008j<InsuranceCarouselComponent> $component$delegate;
            final /* synthetic */ j<InsuranceCarouselDTO, InsuranceCarouselVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<InsuranceCarouselVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<InsuranceCarouselComponent> $component$delegate;
                final /* synthetic */ j<InsuranceCarouselDTO, InsuranceCarouselVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<InsuranceCarouselDTO, InsuranceCarouselVI> jVar, InterfaceC4008j<InsuranceCarouselComponent> interfaceC4008j) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<InsuranceCarouselVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<InsuranceCarouselVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    Object parent = ((View) interfaceC3967k.m(AndroidCompositionLocals_androidKt.h())).getParent();
                    Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                    View view = (View) parent;
                    view.setBackground(null);
                    view.setClickable(false);
                    interfaceC3967k.B(1729797275);
                    B0 a11 = C6616a.a(interfaceC3967k);
                    if (a11 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    w0 a12 = C6617b.a(N.b(InsuranceCarouselViewModel.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    InsuranceCarouselWidgetContentKt.InsuranceCarouselWidgetContent(content.b(), (InsuranceCarouselViewModel) a12, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), AnonymousClass3.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class))), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18903(j<InsuranceCarouselDTO, InsuranceCarouselVI> jVar, InterfaceC4008j<InsuranceCarouselComponent> interfaceC4008j) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<InsuranceCarouselVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<InsuranceCarouselVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 696252343, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InsuranceCarouselComponent invoke$lambda$0(InterfaceC4008j<InsuranceCarouselComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<InsuranceCarouselDTO, InsuranceCarouselVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<InsuranceCarouselDTO, InsuranceCarouselVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$3$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(b11));
            viewMapper.G(new C18903(viewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsuranceCarouselWidgetKt$insuranceCarouselWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<InsuranceCarouselDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<InsuranceCarouselDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(InsuranceCarouselComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselWidgetKt$insuranceCarouselWidget$1$2$1
                    @Override // k20.InterfaceC7469a
                    public final InsuranceCarouselComponent component() {
                        return new InsuranceCarouselComponent(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
