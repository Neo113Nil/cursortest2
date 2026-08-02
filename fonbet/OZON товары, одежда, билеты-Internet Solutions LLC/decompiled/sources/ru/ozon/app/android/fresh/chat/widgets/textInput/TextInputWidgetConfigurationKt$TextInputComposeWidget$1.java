package ru.ozon.app.android.fresh.chat.widgets.textInput;

import S0.A1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import Sc.InterfaceC4008j;
import WZ.l;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import d00.C6018d;
import f3.AbstractC6409a;
import fd.InterfaceC6511n;
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
import ru.ozon.app.android.fresh.chat.viewModels.FreshAISharedViewModel;
import ru.ozon.app.android.fresh.chat.widgets.textInput.data.TextInputDTO;
import ru.ozon.app.android.fresh.chat.widgets.textInput.data.TextInputMapperKt;
import ru.ozon.app.android.fresh.chat.widgets.textInput.di.TextInputDIComponent;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputVO;
import ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputWidgetHolderKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class TextInputWidgetConfigurationKt$TextInputComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<TextInputDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<TextInputDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes12.dex */
        static final class C17701 extends AbstractC7737t implements Function1<C7244b, TextInputDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17701(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TextInputDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (TextInputDTO) this.$jsonDeserializer.fromJson(it.b(), TextInputDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<TextInputDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<TextInputDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C17701(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<TextInputDTO, TextInputVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "invoke", "(Lru/ozon/app/android/fresh/chat/widgets/textInput/data/TextInputDTO;Ll20/d;)Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<TextInputDTO, d, TextInputVO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final TextInputVO invoke(TextInputDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return TextInputMapperKt.toVO(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes12.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<f<TextInputVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<TextInputDIComponent> $diComponent$delegate;
            final /* synthetic */ e<TextInputDTO, TextInputVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/TextInputVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<TextInputVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<TextInputDIComponent> $diComponent$delegate;
                final /* synthetic */ e<TextInputDTO, TextInputVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(e<TextInputDTO, TextInputVO> eVar, InterfaceC4008j<? extends TextInputDIComponent> interfaceC4008j) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$diComponent$delegate = interfaceC4008j;
                }

                private static final String invoke$lambda$0(A1<String> a12) {
                    return a12.getValue();
                }

                private static final boolean invoke$lambda$1(A1<Boolean> a12) {
                    return a12.getValue().booleanValue();
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<TextInputVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TextInputVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    int i12;
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i12 = i11 | (interfaceC3967k.n(content) ? 4 : 2);
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    B0 a11 = ((h) interfaceC3967k.m(b00.f.f())).a();
                    interfaceC3967k.B(1729797275);
                    w0 a12 = C6617b.a(N.b(FreshAISharedViewModel.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, interfaceC3967k);
                    interfaceC3967k.K();
                    FreshAISharedViewModel freshAISharedViewModel = (FreshAISharedViewModel) a12;
                    Function1<Tg.b, Unit> m470buildHandlerimpl = WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i12 & 14, 14), AnonymousClass3.invoke$lambda$0(this.$diComponent$delegate).getCustomActionHandlersStore()));
                    InterfaceC3978p0 b11 = n1.b(freshAISharedViewModel.getCurrentTextStateFlow(), interfaceC3967k);
                    InterfaceC3978p0 b12 = n1.b(freshAISharedViewModel.getLoadingStateFlow(), interfaceC3967k);
                    Unit unit = Unit.f71690a;
                    interfaceC3967k.o(-370497122);
                    boolean F11 = interfaceC3967k.F(this.$diComponent$delegate) | interfaceC3967k.F(freshAISharedViewModel);
                    InterfaceC4008j<TextInputDIComponent> interfaceC4008j = this.$diComponent$delegate;
                    Object C11 = interfaceC3967k.C();
                    if (F11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$1$1(interfaceC4008j, freshAISharedViewModel, null);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Q.e(interfaceC3967k, unit, (Function2) C11);
                    TextInputVO b13 = content.b();
                    l tokenizedAnalytics = AnonymousClass3.invoke$lambda$0(this.$diComponent$delegate).getTokenizedAnalytics();
                    String invoke$lambda$0 = invoke$lambda$0(b11);
                    interfaceC3967k.o(-370476946);
                    boolean F12 = interfaceC3967k.F(freshAISharedViewModel);
                    Object C12 = interfaceC3967k.C();
                    if (F12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$2$1$2$1(freshAISharedViewModel);
                        interfaceC3967k.x(C12);
                    }
                    interfaceC3967k.k();
                    TextInputWidgetHolderKt.m710TextInputWidgetHolderOw1X5yo(b13, tokenizedAnalytics, invoke$lambda$0, (Function1) ((kotlin.reflect.h) C12), invoke$lambda$1(b12), m470buildHandlerimpl, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, null, null, interfaceC3967k, 0, 0, 32704);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(e<TextInputDTO, TextInputVO> eVar, InterfaceC4008j<? extends TextInputDIComponent> interfaceC4008j) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$diComponent$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<TextInputVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<TextInputVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1554739666, new AnonymousClass1(this.$this_overlayViewMapper, this.$diComponent$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TextInputDIComponent invoke$lambda$0(InterfaceC4008j<? extends TextInputDIComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<TextInputDTO, TextInputVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<TextInputDTO, TextInputVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            InterfaceC4008j unsafeLazy = LazyUtilsKt.unsafeLazy(new TextInputWidgetConfigurationKt$TextInputComposeWidget$1$3$diComponent$2(overlayViewMapper));
            c.l(overlayViewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass2(overlayViewMapper, unsafeLazy));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputWidgetConfigurationKt$TextInputComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<TextInputDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<TextInputDTO> FreshComposeWidget) {
        Intrinsics.checkNotNullParameter(FreshComposeWidget, "$this$FreshComposeWidget");
        FreshComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        FreshComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.fresh.chat.widgets.textInput.TextInputWidgetConfigurationKt$TextInputComposeWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TextInputDIComponent.INSTANCE.create(it);
            }
        });
        FreshComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
