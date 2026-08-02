package ru.ozon.app.android.ugc.core.widgets.timerButton.core;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import WZ.l;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import d00.C6018d;
import e3.C6285b;
import fd.InterfaceC6511n;
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
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.actionHandlers.ugc.dismissAndOpenGallery.DismissAndOpenGalleryActionHandler;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.timerButton.data.TimerButtonDTO;
import ru.ozon.app.android.ugc.core.widgets.timerButton.di.TimerButtonComponent;
import ru.ozon.app.android.ugc.core.widgets.timerButton.presentation.TimerButtonKt;
import ru.ozon.app.android.ugc.core.widgets.timerButton.presentation.TimerButtonVO;
import ru.ozon.app.android.ugc.core.widgets.timerButton.presentation.TimerButtonViewModel;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<TimerButtonDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<TimerButtonDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19551 extends AbstractC7737t implements Function1<C7244b, TimerButtonDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19551(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TimerButtonDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (TimerButtonDTO) this.$jsonDeserializer.fromJson(it.b(), TimerButtonDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<TimerButtonDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<TimerButtonDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19551(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<TimerButtonDTO, TimerButtonVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/timerButton/data/TimerButtonDTO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<TimerButtonDTO, d, TimerButtonVO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final TimerButtonVO invoke(TimerButtonDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                ButtonV3DTO initialState = state.getInitialState();
                ButtonV3DTO finalState = state.getFinalState();
                int secondsCountdown = state.getSecondsCountdown();
                String backgroundColor = state.getBackgroundColor();
                CornerRadius cornerRadius = state.getCornerRadius();
                Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
                return new TimerButtonVO(hashCode, initialState, finalState, secondsCountdown, backgroundColor, cornerRadius, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<TimerButtonVO>, Unit> {
            final /* synthetic */ TimerButtonComponent $component;
            final /* synthetic */ e<TimerButtonDTO, TimerButtonVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<TimerButtonVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ TimerButtonComponent $component;
                final /* synthetic */ e<TimerButtonDTO, TimerButtonVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<TimerButtonDTO, TimerButtonVO> eVar, TimerButtonComponent timerButtonComponent) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component = timerButtonComponent;
                }

                private static final int invoke$lambda$1(A1<Integer> a12) {
                    return a12.getValue().intValue();
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<TimerButtonVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TimerButtonVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    int i12 = i11 & 14;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12, 14), this.$component.getCustomActionHandlersStoreFactory().create(DismissAndOpenGalleryActionHandler.class)));
                    l lVar = (l) interfaceC3967k.m(b00.f.e());
                    h hVar = (h) interfaceC3967k.m(b00.f.f());
                    final TimerButtonComponent timerButtonComponent = this.$component;
                    TimerButtonViewModel timerButtonViewModel = (TimerButtonViewModel) new z0(hVar.a(), new z0.c() { // from class: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2$1$invoke$$inlined$viewModel$1
                        @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                        public <T extends w0> T create(Class<T> modelClass) {
                            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                            TimerButtonViewModel viewModel = TimerButtonComponent.this.getViewModel();
                            Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                            return viewModel;
                        }
                    }).a(TimerButtonViewModel.class);
                    Long valueOf = Long.valueOf(content.b().getId());
                    interfaceC3967k.o(300127701);
                    boolean F11 = interfaceC3967k.F(timerButtonViewModel) | (i12 == 4);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2$1$1$1(timerButtonViewModel, content, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, valueOf, (Function2) C11);
                    InterfaceC3978p0 c11 = C6285b.c(timerButtonViewModel.getSecondsLeft(), interfaceC3967k, 0);
                    TimerButtonVO b11 = content.b();
                    int invoke$lambda$1 = invoke$lambda$1(c11);
                    interfaceC3967k.o(300137518);
                    boolean F12 = interfaceC3967k.F(lVar);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$3$2$1$2$1(lVar);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    TimerButtonKt.TimerButton(b11, invoke$lambda$1, (Function2) C12, m470buildHandlerimpl, interfaceC3967k, 0, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(e<TimerButtonDTO, TimerButtonVO> eVar, TimerButtonComponent timerButtonComponent) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component = timerButtonComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<TimerButtonVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<TimerButtonVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1333850608, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<TimerButtonDTO, TimerButtonVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<TimerButtonDTO, TimerButtonVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            TimerButtonComponent timerButtonComponent = (TimerButtonComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(TimerButtonComponent.class);
            c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(overlayViewMapper, timerButtonComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<TimerButtonDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<TimerButtonDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.timerButton.core.TimerButtonComposeWidgetKt$TimerButtonComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TimerButtonComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
