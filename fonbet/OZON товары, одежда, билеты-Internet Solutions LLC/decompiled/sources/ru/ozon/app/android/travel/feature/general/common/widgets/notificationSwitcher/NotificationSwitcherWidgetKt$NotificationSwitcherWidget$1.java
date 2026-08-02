package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher;

import Ek.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
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
import ru.ozon.app.android.travel.actionhandler.notificationAction.SwitchNotificationActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.data.NotificationSwitcherDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.data.NotificationSwitcherMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.di.NotificationSwitcherComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.presentation.NotificationSwitcherContentKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.presentation.NotificationSwitcherVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1 extends AbstractC7737t implements Function1<C6018d<NotificationSwitcherDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<NotificationSwitcherDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C19161 extends AbstractC7737t implements Function1<C7244b, NotificationSwitcherDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19161(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final NotificationSwitcherDTO invoke(C7244b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return (NotificationSwitcherDTO) this.$jsonDeserializer.fromJson(state.b(), NotificationSwitcherDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<NotificationSwitcherDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<NotificationSwitcherDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19161(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<NotificationSwitcherDTO, NotificationSwitcherVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/data/NotificationSwitcherDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes4.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<NotificationSwitcherDTO, d, NotificationSwitcherVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final NotificationSwitcherVI invoke(NotificationSwitcherDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return NotificationSwitcherMapperKt.toVI(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C19172 extends AbstractC7737t implements Function1<k<NotificationSwitcherVI>, Unit> {
            final /* synthetic */ NotificationSwitcherComponent $component;
            final /* synthetic */ j<NotificationSwitcherDTO, NotificationSwitcherVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSwitcher/presentation/NotificationSwitcherVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<NotificationSwitcherVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ NotificationSwitcherComponent $component;
                final /* synthetic */ j<NotificationSwitcherDTO, NotificationSwitcherVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<NotificationSwitcherDTO, NotificationSwitcherVI> jVar, NotificationSwitcherComponent notificationSwitcherComponent) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component = notificationSwitcherComponent;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<NotificationSwitcherVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<NotificationSwitcherVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
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
                    View view = parent instanceof View ? (View) parent : null;
                    if (view != null) {
                        view.setBackground(null);
                        view.setClickable(false);
                    }
                    NotificationSwitcherContentKt.NotificationSwitcherContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(TravelResultActionV2Handler.class, SwitchNotificationActionHandler.class))), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19172(j<NotificationSwitcherDTO, NotificationSwitcherVI> jVar, NotificationSwitcherComponent notificationSwitcherComponent) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component = notificationSwitcherComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<NotificationSwitcherVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<NotificationSwitcherVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1574547363, new AnonymousClass1(this.$this_viewMapper, this.$component)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<NotificationSwitcherDTO, NotificationSwitcherVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<NotificationSwitcherDTO, NotificationSwitcherVI> jVar) {
            NotificationSwitcherComponent notificationSwitcherComponent = (NotificationSwitcherComponent) a.c(jVar, "$this$viewMapper", NotificationSwitcherComponent.class);
            c.l(jVar, null, AnonymousClass1.INSTANCE, 1, null);
            jVar.G(new C19172(jVar, notificationSwitcherComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<NotificationSwitcherDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<NotificationSwitcherDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(final C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C7473e<>(N.b(NotificationSwitcherComponent.class), new InterfaceC7469a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt$NotificationSwitcherWidget$1$3$1
                    @Override // k20.InterfaceC7469a
                    public final NotificationSwitcherComponent component() {
                        return new NotificationSwitcherComponent(C7475g.this);
                    }
                });
            }
        });
    }
}
