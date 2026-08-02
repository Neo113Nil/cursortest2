package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.TravelResultActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.di.BannerWithActionComponent;
import ru.ozon.app.android.travel.utils.compose.FixComposerWidgetBackgroundKt;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class BannerWithActionWidgetKt$bannerWithActionWidget$1 extends AbstractC7737t implements Function1<C6018d<BannerWithActionDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<BannerWithActionDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C19061 extends AbstractC7737t implements Function1<C7244b, BannerWithActionDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19061(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final BannerWithActionDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (BannerWithActionDTO) this.$jsonDeserializer.fromJson(it.b(), BannerWithActionDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<BannerWithActionDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<BannerWithActionDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19061(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<BannerWithActionDTO, BannerWithActionVO>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof BannerWithActionDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C19072 extends AbstractC7737t implements Function2<BannerWithActionDTO, d, List<? extends BannerWithActionVO>> {
            final /* synthetic */ InterfaceC4008j<BannerWithActionComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C19072(InterfaceC4008j<? extends BannerWithActionComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<BannerWithActionVO> invoke(BannerWithActionDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass2.invoke$lambda$0(this.$component$delegate).getBannerWithActionMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$2$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<BannerWithActionVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<BannerWithActionComponent> $component$delegate;
            final /* synthetic */ j<BannerWithActionDTO, BannerWithActionVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/presentation/BannerWithActionVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<BannerWithActionVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<BannerWithActionComponent> $component$delegate;
                final /* synthetic */ j<BannerWithActionDTO, BannerWithActionVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(j<BannerWithActionDTO, BannerWithActionVO> jVar, InterfaceC4008j<? extends BannerWithActionComponent> interfaceC4008j) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<BannerWithActionVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<BannerWithActionVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(interfaceC3967k, 0);
                        BannerWithActionWidgetContentKt.BannerWithActionWidgetContent(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), AnonymousClass2.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStoreFactory().create(TravelResultActionHandler.class, TravelForceRedirectActionHandler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(j<BannerWithActionDTO, BannerWithActionVO> jVar, InterfaceC4008j<? extends BannerWithActionComponent> interfaceC4008j) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<BannerWithActionVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<BannerWithActionVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 121773616, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BannerWithActionComponent invoke$lambda$0(InterfaceC4008j<? extends BannerWithActionComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<BannerWithActionDTO, BannerWithActionVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<BannerWithActionDTO, BannerWithActionVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new BannerWithActionWidgetKt$bannerWithActionWidget$1$2$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new C19072(b11));
            viewMapper.G(new AnonymousClass3(viewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerWithActionWidgetKt$bannerWithActionWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<BannerWithActionDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<BannerWithActionDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
        final BannerWithActionComponent.Companion companion = BannerWithActionComponent.INSTANCE;
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.presentation.BannerWithActionWidgetKt$bannerWithActionWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return BannerWithActionComponent.Companion.this.create(it);
            }
        });
    }
}
