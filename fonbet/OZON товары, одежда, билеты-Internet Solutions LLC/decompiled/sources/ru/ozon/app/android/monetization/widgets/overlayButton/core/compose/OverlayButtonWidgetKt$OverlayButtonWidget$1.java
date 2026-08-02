package ru.ozon.app.android.monetization.widgets.overlayButton.core.compose;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6511n;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import m20.InterfaceC8046a;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.WidgetActionHandlerBuilder;
import ru.ozon.app.android.action.WidgetActionHandlerKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.monetization.flags.OverlayButtonComposeFlag;
import ru.ozon.app.android.monetization.widgets.overlayButton.core.OverlayButtonConfig;
import ru.ozon.app.android.monetization.widgets.overlayButton.core.OverlayButtonViewMapper;
import ru.ozon.app.android.monetization.widgets.overlayButton.data.OverlayButtonDTO;
import ru.ozon.app.android.monetization.widgets.overlayButton.di.OverlayButtonComponent;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonVO;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.compose.OverlayButtonComposableKt;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OverlayButtonWidgetKt$OverlayButtonWidget$1 extends AbstractC7737t implements Function1<C6018d<OverlayButtonDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<OverlayButtonDTO, OverlayButtonVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ InterfaceC4008j<OverlayButtonComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends OverlayButtonComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof OverlayButtonDTO) {
                    OverlayButtonDTO overlayButtonDTO = (OverlayButtonDTO) obj;
                    if (((overlayButtonDTO.getContent() instanceof ButtonV3DTO) || (overlayButtonDTO.getContent() instanceof OverlayButtonDTO.DoubleButton)) && AnonymousClass3.invoke$lambda$0(this.$component$delegate).getFeatureChecker().isEnabled(OverlayButtonComposeFlag.INSTANCE)) {
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;", "state", "Ll20/d;", "widgetInfo", "", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "invoke", "(Lru/ozon/app/android/monetization/widgets/overlayButton/data/OverlayButtonDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<OverlayButtonDTO, d, List<? extends OverlayButtonVO>> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<OverlayButtonVO> invoke(OverlayButtonDTO state, d widgetInfo) {
                OverlayButtonVO.ButtonWrapper doubleButton;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                long hashCode = widgetInfo.d().hashCode();
                Object content = state.getContent();
                if (content instanceof ButtonV3DTO) {
                    doubleButton = new OverlayButtonVO.ButtonWrapper.SingleButton((ButtonV3DTO) content);
                } else {
                    if (!(content instanceof OverlayButtonDTO.DoubleButton)) {
                        return K.f71697a;
                    }
                    OverlayButtonDTO.DoubleButton doubleButton2 = (OverlayButtonDTO.DoubleButton) content;
                    doubleButton = new OverlayButtonVO.ButtonWrapper.DoubleButton(doubleButton2.getFirstButton(), doubleButton2.getSecondButton());
                }
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new OverlayButtonVO(hashCode, doubleButton, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTestInfo()));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17943 extends AbstractC7737t implements Function1<f<OverlayButtonVO>, Unit> {
            final /* synthetic */ e<OverlayButtonDTO, OverlayButtonVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<OverlayButtonVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ e<OverlayButtonDTO, OverlayButtonVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<OverlayButtonDTO, OverlayButtonVO> eVar) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<OverlayButtonVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<OverlayButtonVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(b00.f.e());
                    OverlayButtonVO b11 = content.b();
                    interfaceC3967k.o(-425191799);
                    boolean F11 = interfaceC3967k.F(lVar);
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new OverlayButtonWidgetKt$OverlayButtonWidget$1$3$3$1$1$1(lVar);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    OverlayButtonComposableKt.OverlayButtonComposable(b11, (Function2) C11, WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17943(e<OverlayButtonDTO, OverlayButtonVO> eVar) {
                super(1);
                this.$this_overlayViewMapper = eVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<OverlayButtonVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<OverlayButtonVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -710366320, new AnonymousClass1(this.$this_overlayViewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OverlayButtonComponent invoke$lambda$0(InterfaceC4008j<? extends OverlayButtonComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<OverlayButtonDTO, OverlayButtonVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<OverlayButtonDTO, OverlayButtonVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            overlayViewMapper.i(new AnonymousClass1(k.b(new OverlayButtonWidgetKt$OverlayButtonWidget$1$3$component$2(overlayViewMapper))), AnonymousClass2.INSTANCE);
            overlayViewMapper.s(d.a.f94674b, new C17943(overlayViewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OverlayButtonWidgetKt$OverlayButtonWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<OverlayButtonDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<OverlayButtonDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new OverlayButtonConfig(JsonParser.this);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new OverlayButtonViewMapper((OverlayButtonComponent) it.getComponent(OverlayButtonComponent.class));
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.monetization.widgets.overlayButton.core.compose.OverlayButtonWidgetKt$OverlayButtonWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return OverlayButtonComponent.INSTANCE.create(it);
            }
        });
    }
}
