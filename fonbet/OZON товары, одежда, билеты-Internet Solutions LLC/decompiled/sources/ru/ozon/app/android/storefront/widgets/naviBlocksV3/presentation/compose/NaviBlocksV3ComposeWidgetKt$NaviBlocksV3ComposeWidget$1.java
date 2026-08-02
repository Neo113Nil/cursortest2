package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose;

import S0.InterfaceC3967k;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.domain.flags.NaviBlocksV3ComposeEnabledFlag;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.core.NaviBlocksV3Config;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.core.NaviBlocksV3ViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.data.NaviBlocksV3DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.di.NaviBlocksV3WidgetComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3VO;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<NaviBlocksV3DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<j<NaviBlocksV3DTO, NaviBlocksV3VO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ NaviBlocksV3WidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NaviBlocksV3WidgetComponent naviBlocksV3WidgetComponent) {
                super(1);
                this.$component = naviBlocksV3WidgetComponent;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof NaviBlocksV3DTO) && this.$component.getFeatureChecker().isEnabled(NaviBlocksV3ComposeEnabledFlag.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<NaviBlocksV3DTO, d, List<? extends NaviBlocksV3VO>> {
            final /* synthetic */ NaviBlocksV3WidgetComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(NaviBlocksV3WidgetComponent naviBlocksV3WidgetComponent) {
                super(2);
                this.$component = naviBlocksV3WidgetComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<NaviBlocksV3VO> invoke(NaviBlocksV3DTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return this.$component.getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<NaviBlocksV3VO>, Unit> {
            final /* synthetic */ C7475g $storage;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<NaviBlocksV3VO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ C7475g $storage;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C7475g c7475g) {
                    super(4);
                    this.$storage = c7475g;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<NaviBlocksV3VO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<NaviBlocksV3VO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        NaviBlocksV3ComposableKt.NaviBlocksV3Composable(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$storage, null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(C7475g c7475g) {
                super(1);
                this.$storage = c7475g;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<NaviBlocksV3VO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<NaviBlocksV3VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1060383981, new AnonymousClass1(this.$storage)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<NaviBlocksV3DTO, NaviBlocksV3VO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<NaviBlocksV3DTO, NaviBlocksV3VO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            C7475g widgetComponentStorage = viewMapper.getWidgetComponentStorage();
            NaviBlocksV3WidgetComponent naviBlocksV3WidgetComponent = (NaviBlocksV3WidgetComponent) viewMapper.getWidgetComponentStorage().getComponent(NaviBlocksV3WidgetComponent.class);
            viewMapper.i(new AnonymousClass1(naviBlocksV3WidgetComponent), new AnonymousClass2(naviBlocksV3WidgetComponent));
            viewMapper.G(new AnonymousClass3(widgetComponentStorage));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<NaviBlocksV3DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<NaviBlocksV3DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new NaviBlocksV3Config(JsonParser.this);
            }
        });
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return NaviBlocksV3WidgetComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose.NaviBlocksV3ComposeWidgetKt$NaviBlocksV3ComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new NaviBlocksV3ViewMapper((NaviBlocksV3WidgetComponent) it.getComponent(NaviBlocksV3WidgetComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass4.INSTANCE);
    }
}
