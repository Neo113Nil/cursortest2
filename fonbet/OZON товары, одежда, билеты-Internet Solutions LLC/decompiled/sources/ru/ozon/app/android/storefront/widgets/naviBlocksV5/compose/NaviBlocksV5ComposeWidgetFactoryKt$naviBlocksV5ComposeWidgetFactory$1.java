package ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
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
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.domain.flags.NaviBlocksV5ComposeEnabledFlag;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.core.NaviBlocksV5Config;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.core.NaviBlocksV5Mapper;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.core.NaviBlocksV5ViewMapper;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.data.NaviBlocksV5DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.di.NaviBlocksV5WidgetComponent;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5VO;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1 extends AbstractC7737t implements Function1<C6018d<NaviBlocksV5DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<NaviBlocksV5DTO, NaviBlocksV5VO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ InterfaceC4008j<NaviBlocksV5WidgetComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends NaviBlocksV5WidgetComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof NaviBlocksV5DTO) && AnonymousClass3.invoke$lambda$0(this.$component$delegate).getFeatureChecker().isEnabled(NaviBlocksV5ComposeEnabledFlag.INSTANCE));
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        /* synthetic */ class AnonymousClass2 extends C7735q implements Function2<NaviBlocksV5DTO, d, List<? extends NaviBlocksV5VO>> {
            AnonymousClass2(Object obj) {
                super(2, obj, NaviBlocksV5Mapper.class, "invoke", "invoke(Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;Lru/ozon/composer/widget/item/WidgetInfo;)Ljava/util/List;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<NaviBlocksV5VO> invoke(NaviBlocksV5DTO p02, d p12) {
                Intrinsics.checkNotNullParameter(p02, "p0");
                Intrinsics.checkNotNullParameter(p12, "p1");
                return ((NaviBlocksV5Mapper) this.receiver).invoke(p02, p12);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18753 extends AbstractC7737t implements Function1<k<NaviBlocksV5VO>, Unit> {
            final /* synthetic */ C7475g $storage;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<NaviBlocksV5VO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ C7475g $storage;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(C7475g c7475g) {
                    super(4);
                    this.$storage = c7475g;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<NaviBlocksV5VO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<NaviBlocksV5VO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        NaviBlocksV5ComposeWidgetKt.NaviBlocksV5ComposeWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$storage, null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18753(C7475g c7475g) {
                super(1);
                this.$storage = c7475g;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<NaviBlocksV5VO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<NaviBlocksV5VO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -723441065, new AnonymousClass1(this.$storage)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NaviBlocksV5WidgetComponent invoke$lambda$0(InterfaceC4008j<? extends NaviBlocksV5WidgetComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<NaviBlocksV5DTO, NaviBlocksV5VO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<NaviBlocksV5DTO, NaviBlocksV5VO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            C7475g widgetComponentStorage = viewMapper.getWidgetComponentStorage();
            InterfaceC4008j b11 = Sc.k.b(new NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$3$component$2(widgetComponentStorage));
            viewMapper.i(new AnonymousClass1(b11), new AnonymousClass2(invoke$lambda$0(b11).getMapper()));
            viewMapper.G(new C18753(widgetComponentStorage));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<NaviBlocksV5DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<NaviBlocksV5DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new NaviBlocksV5Config(JsonParser.this);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new NaviBlocksV5ViewMapper((NaviBlocksV5WidgetComponent) it.getComponent(NaviBlocksV5WidgetComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        final NaviBlocksV5WidgetComponent.Companion companion = NaviBlocksV5WidgetComponent.INSTANCE;
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV5.compose.NaviBlocksV5ComposeWidgetFactoryKt$naviBlocksV5ComposeWidgetFactory$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return NaviBlocksV5WidgetComponent.Companion.this.create(it);
            }
        });
    }
}
