package ru.ozon.app.android.storefront.widgets.appOnboarding.core;

import S0.InterfaceC3967k;
import WZ.l;
import a00.C4911f;
import a1.C4912a;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6511n;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.storefront.onboardingscreen.onboardingv2.OnboardingActionHandler;
import ru.ozon.app.android.storefront.widgets.appOnboarding.data.AppOnboardingDTO;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingWidgetComponent;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingViewModel;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingWidgetKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class AppOnboardingComposeWidgetKt$appOnboardingWidget$1 extends AbstractC7737t implements Function1<C6018d<AppOnboardingDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<AppOnboardingDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18701 extends AbstractC7737t implements Function1<C7244b, AppOnboardingDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18701(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final AppOnboardingDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (AppOnboardingDTO) this.$jsonDeserializer.fromJson(it.b(), AppOnboardingDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<AppOnboardingDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<AppOnboardingDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18701(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<AppOnboardingDTO, AppOnboardingVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "invoke", "(Lru/ozon/app/android/storefront/widgets/appOnboarding/data/AppOnboardingDTO;Ll20/d;)Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<AppOnboardingDTO, d, AppOnboardingVI> {
            final /* synthetic */ AppOnboardingWidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AppOnboardingWidgetComponent appOnboardingWidgetComponent) {
                super(2);
                this.$component = appOnboardingWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final AppOnboardingVI invoke(AppOnboardingDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<AppOnboardingVI>, Unit> {
            final /* synthetic */ AppOnboardingWidgetComponent $component;
            final /* synthetic */ j<AppOnboardingDTO, AppOnboardingVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/appOnboarding/presentation/AppOnboardingVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<AppOnboardingVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ AppOnboardingWidgetComponent $component;
                final /* synthetic */ j<AppOnboardingDTO, AppOnboardingVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<AppOnboardingDTO, AppOnboardingVI> jVar, AppOnboardingWidgetComponent appOnboardingWidgetComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = appOnboardingWidgetComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<AppOnboardingVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<AppOnboardingVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    int i12;
                    AppOnboardingViewModel appOnboardingViewModel;
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
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    l lVar = (l) interfaceC3967k.m(f.e());
                    int i13 = i12 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14), this.$component.getCustomActionHandlersStoreFactory().create(OnboardingActionHandler.class)));
                    AppOnboardingVI b11 = content.b();
                    r a11 = c4911f.a();
                    if (a11 != null) {
                        final AppOnboardingWidgetComponent appOnboardingWidgetComponent = this.$component;
                        appOnboardingViewModel = (AppOnboardingViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$invoke$$inlined$viewModel$1
                            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                            public <T extends w0> T create(Class<T> modelClass) {
                                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                                AppOnboardingViewModel appOnboardingViewModel2 = AppOnboardingWidgetComponent.this.getAppOnboardingViewModel();
                                Intrinsics.g(appOnboardingViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                                return appOnboardingViewModel2;
                            }
                        }).a(AppOnboardingViewModel.class);
                    } else {
                        appOnboardingViewModel = null;
                    }
                    interfaceC3967k.o(173504330);
                    boolean n11 = interfaceC3967k.n(m470buildHandlerimpl) | (i13 == 4) | interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$2$1(m470buildHandlerimpl, content, lVar);
                        interfaceC3967k.x(C11);
                    }
                    InterfaceC6511n interfaceC6511n = (InterfaceC6511n) C11;
                    interfaceC3967k.k();
                    interfaceC3967k.o(173474090);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$3$1(lVar);
                        interfaceC3967k.x(C12);
                    }
                    Function1 function1 = (Function1) C12;
                    interfaceC3967k.k();
                    interfaceC3967k.o(173489098);
                    boolean F12 = interfaceC3967k.F(lVar);
                    Object C13 = interfaceC3967k.C();
                    if (F12 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$4$1(lVar);
                        interfaceC3967k.x(C13);
                    }
                    Function1 function12 = (Function1) C13;
                    interfaceC3967k.k();
                    interfaceC3967k.o(173531581);
                    boolean F13 = interfaceC3967k.F(c4911f);
                    Object C14 = interfaceC3967k.C();
                    if (F13 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$5$1(c4911f);
                        interfaceC3967k.x(C14);
                    }
                    Function0 function0 = (Function0) C14;
                    interfaceC3967k.k();
                    interfaceC3967k.o(173534494);
                    boolean F14 = interfaceC3967k.F(this.$component);
                    AppOnboardingWidgetComponent appOnboardingWidgetComponent2 = this.$component;
                    Object C15 = interfaceC3967k.C();
                    if (F14 || C15 == InterfaceC3967k.a.a()) {
                        C15 = new AppOnboardingComposeWidgetKt$appOnboardingWidget$1$3$2$1$6$1(appOnboardingWidgetComponent2);
                        interfaceC3967k.x(C15);
                    }
                    interfaceC3967k.k();
                    AppOnboardingWidgetKt.AppOnboardingWidget(b11, appOnboardingViewModel, interfaceC6511n, function1, function12, m470buildHandlerimpl, function0, (Function2) C15, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<AppOnboardingDTO, AppOnboardingVI> jVar, AppOnboardingWidgetComponent appOnboardingWidgetComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = appOnboardingWidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<AppOnboardingVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<AppOnboardingVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 490376033, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<AppOnboardingDTO, AppOnboardingVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<AppOnboardingDTO, AppOnboardingVI> jVar) {
            AppOnboardingWidgetComponent appOnboardingWidgetComponent = (AppOnboardingWidgetComponent) Ek.a.c(jVar, "$this$viewMapper", AppOnboardingWidgetComponent.class);
            c.l(jVar, null, new AnonymousClass1(appOnboardingWidgetComponent), 1, null);
            jVar.G(new AnonymousClass2(jVar, appOnboardingWidgetComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppOnboardingComposeWidgetKt$appOnboardingWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<AppOnboardingDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<AppOnboardingDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(AppOnboardingWidgetComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.storefront.widgets.appOnboarding.core.AppOnboardingComposeWidgetKt$appOnboardingWidget$1$2$1
                    @Override // k20.InterfaceC7469a
                    public final AppOnboardingWidgetComponent component() {
                        return new AppOnboardingWidgetComponent(C7475g.this);
                    }
                });
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
