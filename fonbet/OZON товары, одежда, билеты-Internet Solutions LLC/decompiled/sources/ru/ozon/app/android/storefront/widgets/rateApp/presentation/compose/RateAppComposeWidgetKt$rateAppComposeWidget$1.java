package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Sc.k;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6511n;
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
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.domain.flags.RateAppComposeEnabledFlag;
import ru.ozon.app.android.storefront.widgets.rateApp.CompositeCustomActionHandler;
import ru.ozon.app.android.storefront.widgets.rateApp.data.RateAppDTO;
import ru.ozon.app.android.storefront.widgets.rateApp.di.RateAppWidgetComponent;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppVO;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewMapper;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class RateAppComposeWidgetKt$rateAppComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<RateAppDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<RateAppDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C18801 extends AbstractC7737t implements Function1<C7244b, RateAppDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18801(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final RateAppDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (RateAppDTO) this.$jsonDeserializer.fromJson(it.b(), RateAppDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<RateAppDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<RateAppDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18801(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<e<RateAppDTO, RateAppVO>, Unit> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$4$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ InterfaceC4008j<RateAppWidgetComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends RateAppWidgetComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof RateAppDTO) && !RateAppComposeProperties.INSTANCE.isDismissed() && AnonymousClass4.invoke$lambda$0(this.$component$delegate).getFeatureChecker().isEnabled(RateAppComposeEnabledFlag.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "invoke", "(Lru/ozon/app/android/storefront/widgets/rateApp/data/RateAppDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$4$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<RateAppDTO, d, List<? extends RateAppVO>> {
            final /* synthetic */ InterfaceC4008j<RateAppWidgetComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InterfaceC4008j<? extends RateAppWidgetComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<RateAppVO> invoke(RateAppDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AnonymousClass4.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$4$3, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<f<RateAppVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<RateAppWidgetComponent> $component$delegate;
            final /* synthetic */ e<RateAppDTO, RateAppVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/storefront/widgets/rateApp/presentation/RateAppVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<RateAppVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<RateAppWidgetComponent> $component$delegate;
                final /* synthetic */ e<RateAppDTO, RateAppVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(e<RateAppDTO, RateAppVO> eVar, InterfaceC4008j<? extends RateAppWidgetComponent> interfaceC4008j) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<RateAppVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<RateAppVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        RateAppComposableKt.RateAppComposable(content.b(), AnonymousClass4.invoke$lambda$0(this.$component$delegate).getAppStoreInfoProvider().retrieveStoreName(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), AnonymousClass4.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStoreFactory().create(CompositeCustomActionHandler.class))), null, interfaceC3967k, RatingDTO.$stable | AtomAction.$stable, 8);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(e<RateAppDTO, RateAppVO> eVar, InterfaceC4008j<? extends RateAppWidgetComponent> interfaceC4008j) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<RateAppVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<RateAppVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1774747271, new AnonymousClass1(this.$this_overlayViewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass4() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RateAppWidgetComponent invoke$lambda$0(InterfaceC4008j<? extends RateAppWidgetComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<RateAppDTO, RateAppVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<RateAppDTO, RateAppVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            InterfaceC4008j b11 = k.b(new RateAppComposeWidgetKt$rateAppComposeWidget$1$4$component$2(overlayViewMapper));
            overlayViewMapper.i(new AnonymousClass1(b11), new AnonymousClass2(b11));
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass3(overlayViewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateAppComposeWidgetKt$rateAppComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<RateAppDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<RateAppDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RateAppWidgetComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose.RateAppComposeWidgetKt$rateAppComposeWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new RateAppViewMapper((RateAppWidgetComponent) it.getComponent(RateAppWidgetComponent.class));
            }
        });
        ComposeWidget.l(AnonymousClass4.INSTANCE);
    }
}
