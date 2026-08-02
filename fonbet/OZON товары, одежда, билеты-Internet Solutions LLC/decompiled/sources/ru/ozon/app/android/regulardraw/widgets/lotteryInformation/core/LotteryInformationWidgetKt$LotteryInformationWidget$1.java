package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import Vg.e;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.regulardraw.ui.FixComposerWidgetBackgroundKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.data.LotteryInformationDTO;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.di.LotteryInformationWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationVI;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class LotteryInformationWidgetKt$LotteryInformationWidget$1 extends AbstractC7737t implements Function1<C6018d<LotteryInformationDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<LotteryInformationDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18391 extends AbstractC7737t implements Function1<C7244b, LotteryInformationDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18391(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final LotteryInformationDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (LotteryInformationDTO) this.$jsonDeserializer.fromJson(it.b(), LotteryInformationDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<LotteryInformationDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<LotteryInformationDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18391(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<LotteryInformationDTO, LotteryInformationVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.TRUE;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;", "state", "Ll20/d;", "info", "", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/data/LotteryInformationDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<LotteryInformationDTO, d, List<? extends LotteryInformationVI>> {
            final /* synthetic */ InterfaceC4008j<LotteryInformationWidgetComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InterfaceC4008j<LotteryInformationWidgetComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<LotteryInformationVI> invoke(LotteryInformationDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return AnonymousClass3.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, info);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18403 extends AbstractC7737t implements Function1<k<LotteryInformationVI>, Unit> {
            final /* synthetic */ InterfaceC4008j<LotteryInformationWidgetComponent> $component$delegate;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<LotteryInformationVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<LotteryInformationWidgetComponent> $component$delegate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(InterfaceC4008j<LotteryInformationWidgetComponent> interfaceC4008j) {
                    super(4);
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<LotteryInformationVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<LotteryInformationVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(interfaceC3967k, 0);
                    C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
                    h hVar = (h) interfaceC3967k.m(f.f());
                    interfaceC3967k.o(-1162687355);
                    boolean z11 = (i11 & 14) == 4;
                    Object C11 = interfaceC3967k.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new LotteryInformationWidgetKt$LotteryInformationWidget$1$3$3$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    e.a aVar = new e.a(c4911f, hVar, (Function0) C11, AnonymousClass3.invoke$lambda$0(this.$component$delegate).getActionHandlerComponent());
                    aVar.c(AnonymousClass3.invoke$lambda$0(this.$component$delegate).getCustomActionHandlersStore());
                    ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation.LotteryInformationWidgetKt.LotteryInformationWidget(content.b(), aVar.b(), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18403(InterfaceC4008j<LotteryInformationWidgetComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<LotteryInformationVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<LotteryInformationVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1798505970, new AnonymousClass1(this.$component$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LotteryInformationWidgetComponent invoke$lambda$0(InterfaceC4008j<LotteryInformationWidgetComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<LotteryInformationDTO, LotteryInformationVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<LotteryInformationDTO, LotteryInformationVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new LotteryInformationWidgetKt$LotteryInformationWidget$1$3$component$2(viewMapper));
            viewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(b11));
            viewMapper.G(new C18403(b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryInformationWidgetKt$LotteryInformationWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<LotteryInformationDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<LotteryInformationDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt$LotteryInformationWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return LotteryInformationWidgetComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
