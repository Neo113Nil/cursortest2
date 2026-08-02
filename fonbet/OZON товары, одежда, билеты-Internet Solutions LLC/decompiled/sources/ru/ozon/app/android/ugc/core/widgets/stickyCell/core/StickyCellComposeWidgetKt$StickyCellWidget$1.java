package ru.ozon.app.android.ugc.core.widgets.stickyCell.core;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import d00.C6018d;
import e3.C6285b;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
import g3.C6617b;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.Map;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.data.StickyCellDTO;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.di.StickyCellComponent;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.di.StickyCellViewModelFactory;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.HideStickyCellActionHandler;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.StickyCellKt;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.StickyCellVO;
import ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation.StickyCellViewModel;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class StickyCellComposeWidgetKt$StickyCellWidget$1 extends AbstractC7737t implements Function1<C6018d<StickyCellDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<StickyCellDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19521 extends AbstractC7737t implements Function1<C7244b, StickyCellDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19521(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final StickyCellDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (StickyCellDTO) this.$jsonDeserializer.fromJson(it.b(), StickyCellDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<StickyCellDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<StickyCellDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19521(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<StickyCellDTO, StickyCellVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ e<StickyCellDTO, StickyCellVO> $this_overlayViewMapper;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(e<StickyCellDTO, StickyCellVO> eVar) {
                super(1);
                this.$this_overlayViewMapper = eVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if ((obj instanceof StickyCellDTO) && !StickyCellViewModel.INSTANCE.isShown()) {
                    e<StickyCellDTO, StickyCellVO> eVar = this.$this_overlayViewMapper;
                    String shownKey = ((StickyCellDTO) obj).getShownKey();
                    if (shownKey == null || !((StickyCellComponent) eVar.getWidgetComponentStorage().getComponent(StickyCellComponent.class)).getSharedPreferences().contains("stickyCell".concat(shownKey))) {
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/stickyCell/data/StickyCellDTO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<StickyCellDTO, d, StickyCellVO> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final StickyCellVO invoke(StickyCellDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                CellDTO cell = state.getCell();
                String shownKey = state.getShownKey();
                CornerRadius cornerRadius = state.getCornerRadius();
                String backgroundColor = state.getBackgroundColor();
                String strokeColor = state.getStrokeColor();
                Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
                return new StickyCellVO(hashCode, cell, shownKey, cornerRadius, backgroundColor, strokeColor, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19533 extends AbstractC7737t implements Function1<f<StickyCellVO>, Unit> {
            final /* synthetic */ e<StickyCellDTO, StickyCellVO> $this_overlayViewMapper;
            final /* synthetic */ StickyCellComponent $widgetComponent;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<StickyCellVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ e<StickyCellDTO, StickyCellVO> $this_overlayViewMapper;
                final /* synthetic */ StickyCellComponent $widgetComponent;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<StickyCellDTO, StickyCellVO> eVar, StickyCellComponent stickyCellComponent) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$widgetComponent = stickyCellComponent;
                }

                private static final boolean invoke$lambda$0(A1<Boolean> a12) {
                    return a12.getValue().booleanValue();
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<StickyCellVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<StickyCellVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), this.$widgetComponent.getCustomActionHandlersStoreFactory().create(HideStickyCellActionHandler.class)));
                    B0 a11 = ((h) interfaceC3967k.m(b00.f.f())).a();
                    StickyCellViewModelFactory viewModelFactory = this.$widgetComponent.getViewModelFactory();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(StickyCellViewModel.class), a11, null, viewModelFactory, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    StickyCellViewModel stickyCellViewModel = (StickyCellViewModel) a12;
                    InterfaceC3978p0 c11 = C6285b.c(stickyCellViewModel.isVisible(), interfaceC3967k, 0);
                    StickyCellVO b11 = content.b();
                    boolean invoke$lambda$0 = invoke$lambda$0(c11);
                    interfaceC3967k.o(-883799404);
                    boolean F11 = interfaceC3967k.F(stickyCellViewModel) | (i12 == 4);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new StickyCellComposeWidgetKt$StickyCellWidget$1$3$3$1$1$1(content, stickyCellViewModel);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    StickyCellKt.StickyCell(b11, invoke$lambda$0, m470buildHandlerimpl, (Function1) C11, interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19533(e<StickyCellDTO, StickyCellVO> eVar, StickyCellComponent stickyCellComponent) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$widgetComponent = stickyCellComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<StickyCellVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<StickyCellVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1763230576, new AnonymousClass1(this.$this_overlayViewMapper, this.$widgetComponent)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<StickyCellDTO, StickyCellVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<StickyCellDTO, StickyCellVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            StickyCellComponent stickyCellComponent = (StickyCellComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(StickyCellComponent.class);
            overlayViewMapper.k(new AnonymousClass1(overlayViewMapper), AnonymousClass2.INSTANCE);
            overlayViewMapper.s(d.a.f94674b, new C19533(overlayViewMapper, stickyCellComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyCellComposeWidgetKt$StickyCellWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<StickyCellDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<StickyCellDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.stickyCell.core.StickyCellComposeWidgetKt$StickyCellWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StickyCellComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
