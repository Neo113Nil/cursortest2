package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core;

import Ae.M0;
import Ek.a;
import S0.InterfaceC3967k;
import S0.Q;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.e;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import b00.f;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6512o;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import k20.C7473e;
import k20.C7475g;
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
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableDTO;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushMapperKt;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.di.PromoPushEnableComponent;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.EnablePushNotificationsActionHandler;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableKt;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableVI;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModelFactory;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<PromoPushEnableDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<PromoPushEnableDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18671 extends AbstractC7737t implements Function1<C7244b, PromoPushEnableDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18671(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final PromoPushEnableDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (PromoPushEnableDTO) this.$jsonDeserializer.fromJson(it.b(), PromoPushEnableDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<PromoPushEnableDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<PromoPushEnableDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18671(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<PromoPushEnableDTO, PromoPushEnableVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "invoke", "(Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableDTO;Ll20/d;)Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<PromoPushEnableDTO, d, PromoPushEnableVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final PromoPushEnableVI invoke(PromoPushEnableDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return PromoPushMapperKt.toVI(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<PromoPushEnableVI>, Unit> {
            final /* synthetic */ PromoPushEnableComponent $component;
            final /* synthetic */ j<PromoPushEnableDTO, PromoPushEnableVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<PromoPushEnableVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ PromoPushEnableComponent $component;
                final /* synthetic */ j<PromoPushEnableDTO, PromoPushEnableVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<PromoPushEnableDTO, PromoPushEnableVI> jVar, PromoPushEnableComponent promoPushEnableComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = promoPushEnableComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<PromoPushEnableVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<PromoPushEnableVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
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
                    ComponentCallbacksC5392m j11 = ((C4911f) interfaceC3967k.m(f.d())).j();
                    int i13 = i12 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i13, 14), this.$component.getCustomActionHandlersStoreFactory().create(EnablePushNotificationsActionHandler.class)));
                    B0 a11 = ((h) interfaceC3967k.m(f.f())).a();
                    PromoPushEnableViewModelFactory viewModelFactory = this.$component.getViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(PromoPushEnableViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    PromoPushEnableViewModel promoPushEnableViewModel = (PromoPushEnableViewModel) a12;
                    e.a aVar = e.f40358c0;
                    DsSpacings dsSpacings = DsSpacings.INSTANCE;
                    e j12 = T.j(aVar, dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, dsSpacings.m1845getDp16D9Ej5fM(), dsSpacings.m1845getDp16D9Ej5fM(), 2);
                    M0<PromoPushEnableVI> widgetState = promoPushEnableViewModel.getWidgetState();
                    interfaceC3967k.o(-25867896);
                    boolean F11 = interfaceC3967k.F(promoPushEnableViewModel);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$1$1(promoPushEnableViewModel);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    PromoPushEnableKt.PromoPushEnable(j12, widgetState, m470buildHandlerimpl, (Function1) ((kotlin.reflect.h) C11), interfaceC3967k, 0, 0);
                    PromoPushEnableVI b11 = content.b();
                    interfaceC3967k.o(-25865384);
                    boolean F12 = interfaceC3967k.F(promoPushEnableViewModel) | (i13 == 4);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1(promoPushEnableViewModel, content, null);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, b11, (Function2) C12);
                    Unit unit = Unit.f71690a;
                    interfaceC3967k.o(-25861211);
                    boolean F13 = interfaceC3967k.F(promoPushEnableViewModel) | interfaceC3967k.F(j11);
                    Object C13 = interfaceC3967k.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$3$1(promoPushEnableViewModel, j11, null);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C13);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<PromoPushEnableDTO, PromoPushEnableVI> jVar, PromoPushEnableComponent promoPushEnableComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = promoPushEnableComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<PromoPushEnableVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<PromoPushEnableVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1653259609, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<PromoPushEnableDTO, PromoPushEnableVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<PromoPushEnableDTO, PromoPushEnableVI> jVar) {
            PromoPushEnableComponent promoPushEnableComponent = (PromoPushEnableComponent) a.c(jVar, "$this$viewMapper", PromoPushEnableComponent.class);
            c.l(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.G(new AnonymousClass2(jVar, promoPushEnableComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<PromoPushEnableDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<PromoPushEnableDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return PromoPushEnableComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
