package ru.ozon.app.android.monetization.widgets.matchShoppingCards.core;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d00.C6018d;
import e3.C6285b;
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
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.di.MatchShoppingCardsWidgetComponent;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewModel;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1 extends AbstractC7737t implements Function1<C6018d<MatchShoppingCardsDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<MatchShoppingCardsDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17931 extends AbstractC7737t implements Function1<C7244b, MatchShoppingCardsDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17931(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final MatchShoppingCardsDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (MatchShoppingCardsDTO) this.$jsonDeserializer.fromJson(it.b(), MatchShoppingCardsDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<MatchShoppingCardsDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<MatchShoppingCardsDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17931(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<MatchShoppingCardsDTO, MatchShoppingCardsVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "invoke", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<MatchShoppingCardsDTO, d, List<? extends MatchShoppingCardsVI>> {
            final /* synthetic */ InterfaceC4008j<MatchShoppingCardsWidgetComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InterfaceC4008j<MatchShoppingCardsWidgetComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<MatchShoppingCardsVI> invoke(MatchShoppingCardsDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AnonymousClass3.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<MatchShoppingCardsVI>, Unit> {
            final /* synthetic */ InterfaceC4008j<MatchShoppingCardsWidgetComponent> $component$delegate;
            final /* synthetic */ e<MatchShoppingCardsDTO, MatchShoppingCardsVI> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/presentation/MatchShoppingCardsVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<MatchShoppingCardsVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<MatchShoppingCardsWidgetComponent> $component$delegate;
                final /* synthetic */ e<MatchShoppingCardsDTO, MatchShoppingCardsVI> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<MatchShoppingCardsDTO, MatchShoppingCardsVI> eVar, InterfaceC4008j<MatchShoppingCardsWidgetComponent> interfaceC4008j) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<MatchShoppingCardsVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(final i<MatchShoppingCardsVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    C4911f c4911f = (C4911f) interfaceC3967k.m(b00.f.d());
                    l lVar = (l) interfaceC3967k.m(b00.f.e());
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), c4911f, null, null, interfaceC3967k, i12, 12), AnonymousClass3.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStoreFactory().create(ShareLinkActionHandler.class)));
                    interfaceC3967k.o(-1039427504);
                    boolean F11 = interfaceC3967k.F(c4911f) | interfaceC3967k.n(m470buildHandlerimpl);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$showNotification$1$1(c4911f, m470buildHandlerimpl);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    h hVar = (h) interfaceC3967k.m(b00.f.f());
                    final InterfaceC4008j<MatchShoppingCardsWidgetComponent> interfaceC4008j = this.$component$delegate;
                    MatchShoppingCardsViewModel matchShoppingCardsViewModel = (MatchShoppingCardsViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            return new MatchShoppingCardsViewModel((MatchShoppingCardsVI) i.this.b(), MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1.AnonymousClass3.invoke$lambda$0(interfaceC4008j).getMatchShoppingCardsInteractor(), MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1.AnonymousClass3.invoke$lambda$0(interfaceC4008j).getMatchShoppingCardsImagesPrefetcher(), MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1.AnonymousClass3.invoke$lambda$0(interfaceC4008j).getTeensModeStorage());
                        }
                    }).a(MatchShoppingCardsViewModel.class);
                    matchShoppingCardsViewModel.setOnAtomAction(m470buildHandlerimpl);
                    matchShoppingCardsViewModel.setOnNotificationRequested((Function1) C11);
                    MatchShoppingCardsVI b11 = content.b();
                    interfaceC3967k.o(-1039390985);
                    boolean F12 = interfaceC3967k.F(matchShoppingCardsViewModel) | (i12 == 4);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$1$1(matchShoppingCardsViewModel, content, null);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, b11, (Function2) C12);
                    InterfaceC3978p0 c11 = C6285b.c(matchShoppingCardsViewModel.getViewState(), interfaceC3967k, 0);
                    interfaceC3967k.o(-1039383517);
                    boolean F13 = interfaceC3967k.F(matchShoppingCardsViewModel);
                    Object C13 = interfaceC3967k.C();
                    if (F13 || C13 == InterfaceC3967k.a.a()) {
                        C13 = new MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$2$1(matchShoppingCardsViewModel);
                        interfaceC3967k.x(C13);
                    }
                    interfaceC3967k.k();
                    Function1 function1 = (Function1) ((kotlin.reflect.h) C13);
                    interfaceC3967k.o(-1039381477);
                    boolean F14 = interfaceC3967k.F(lVar) | (i12 == 4);
                    Object C14 = interfaceC3967k.C();
                    if (F14 || C14 == InterfaceC3967k.a.a()) {
                        C14 = new MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$3$1(lVar, content);
                        interfaceC3967k.x(C14);
                    }
                    interfaceC3967k.k();
                    MatchShoppingCardsViewKt.MatchShoppingCardsView(c11, function1, (Function1) C14, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(e<MatchShoppingCardsDTO, MatchShoppingCardsVI> eVar, InterfaceC4008j<MatchShoppingCardsWidgetComponent> interfaceC4008j) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<MatchShoppingCardsVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<MatchShoppingCardsVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 56724652, new AnonymousClass1(this.$this_overlayViewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchShoppingCardsWidgetComponent invoke$lambda$0(InterfaceC4008j<MatchShoppingCardsWidgetComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<MatchShoppingCardsDTO, MatchShoppingCardsVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<MatchShoppingCardsDTO, MatchShoppingCardsVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            InterfaceC4008j b11 = k.b(new MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$component$2(overlayViewMapper));
            c.j(overlayViewMapper, null, new AnonymousClass1(b11), 1, null);
            int i11 = 0;
            overlayViewMapper.s(new d.b(i11, i11, 3, null), new AnonymousClass2(overlayViewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<MatchShoppingCardsDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<MatchShoppingCardsDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MatchShoppingCardsWidgetComponent.INSTANCE.create(it);
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
