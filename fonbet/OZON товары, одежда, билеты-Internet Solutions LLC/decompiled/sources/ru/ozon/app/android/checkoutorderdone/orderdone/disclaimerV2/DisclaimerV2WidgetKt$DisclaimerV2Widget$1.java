package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2;

import S0.InterfaceC3967k;
import Vg.e;
import WZ.l;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
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
import l10.InterfaceC7851b;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.DisclaimerV2DTO;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data.DisclaimerV2Mapper;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation.DisclaimerV2ComposableKt;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.presentation.DisclaimerV2VI;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class DisclaimerV2WidgetKt$DisclaimerV2Widget$1 extends AbstractC7737t implements Function1<C6018d<DisclaimerV2DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<b<DisclaimerV2DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$2$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<C7244b, DisclaimerV2DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisclaimerV2DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (DisclaimerV2DTO) this.$jsonDeserializer.fromJson(it.b(), DisclaimerV2DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<DisclaimerV2DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<DisclaimerV2DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new AnonymousClass1(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<DisclaimerV2DTO, DisclaimerV2VI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$1, reason: invalid class name */
        /* loaded from: classes11.dex */
        /* synthetic */ class AnonymousClass1 extends C7735q implements Function2<DisclaimerV2DTO, d, DisclaimerV2VI> {
            AnonymousClass1(Object obj) {
                super(2, obj, DisclaimerV2Mapper.class, "map", "map(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;Lru/ozon/composer/widget/item/WidgetInfo;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final DisclaimerV2VI invoke(DisclaimerV2DTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((DisclaimerV2Mapper) this.receiver).map(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2, reason: invalid class name */
        /* loaded from: classes11.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<DisclaimerV2VI>, Unit> {
            final /* synthetic */ j<DisclaimerV2DTO, DisclaimerV2VI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/presentation/DisclaimerV2VI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<DisclaimerV2VI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<DisclaimerV2DTO, DisclaimerV2VI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<DisclaimerV2DTO, DisclaimerV2VI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<DisclaimerV2VI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<DisclaimerV2VI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    final DisclaimerV2Component disclaimerV2Component = (DisclaimerV2Component) this.$this_viewMapper.getWidgetComponentStorage().getComponent(DisclaimerV2Component.class);
                    CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(((h) interfaceC3967k.m(f.f())).a(), new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            CreateAndPayViewModel createAndPayViewModel2 = DisclaimerV2Component.this.getCreateAndPayViewModel();
                            Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return createAndPayViewModel2;
                        }
                    }).a(CreateAndPayViewModel.class);
                    int i12 = i11 & 14;
                    e.a m473handlersStoreDnHbjWo = WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), disclaimerV2Component.getCustomActionHandlersStoreFactory().create(ComposerActionWithActionHandler.class, ShareLinkActionHandler.class));
                    interfaceC3967k.o(159501537);
                    boolean F11 = interfaceC3967k.F(createAndPayViewModel) | (i12 == 4);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$onAction$1$1(createAndPayViewModel, content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m476onPreProcessDnHbjWo(m473handlersStoreDnHbjWo, (Function1) C11));
                    l lVar = (l) interfaceC3967k.m(f.e());
                    AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                    interfaceC3967k.o(159532866);
                    boolean F12 = (i12 == 4) | interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$1$1(content, lVar);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    e3.i.a(aVar, null, (Function0) C12, interfaceC3967k, 6);
                    InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
                    DisclaimerV2VI b11 = content.b();
                    interfaceC3967k.o(159542524);
                    boolean F13 = interfaceC3967k.F(disclaimerV2Component) | interfaceC3967k.n(m470buildHandlerimpl);
                    Object C13 = interfaceC3967k.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$2$1(disclaimerV2Component, m470buildHandlerimpl);
                        interfaceC3967k.x(C13);
                    }
                    Function1 function1 = (Function1) C13;
                    interfaceC3967k.k();
                    interfaceC3967k.o(159547513);
                    boolean F14 = interfaceC3967k.F(interfaceC7851b);
                    Object C14 = interfaceC3967k.C();
                    if (F14 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$3$1(interfaceC7851b);
                        interfaceC3967k.x(C14);
                    }
                    interfaceC3967k.k();
                    DisclaimerV2ComposableKt.DisclaimerV2Composable(b11, function1, (Function0) C14, disclaimerV2Component.getStartupArgsService().getArgValue("STATIC_TIMERS"), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<DisclaimerV2DTO, DisclaimerV2VI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<DisclaimerV2VI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<DisclaimerV2VI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1246091888, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<DisclaimerV2DTO, DisclaimerV2VI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<DisclaimerV2DTO, DisclaimerV2VI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, new AnonymousClass1(((DisclaimerV2Component) viewMapper.getWidgetComponentStorage().getComponent(DisclaimerV2Component.class)).getMapper()), 1, null);
            viewMapper.G(new AnonymousClass2(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisclaimerV2WidgetKt$DisclaimerV2Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<DisclaimerV2DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<DisclaimerV2DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(DisclaimerV2Component.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$1$1
                    @Override // k20.InterfaceC7469a
                    public final DisclaimerV2Component component() {
                        return DisclaimerV2Component.INSTANCE.create(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.a(new AnonymousClass2(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
