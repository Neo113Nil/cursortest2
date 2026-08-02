package ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core;

import S0.InterfaceC3967k;
import S0.Q;
import Vg.e;
import a00.C4911f;
import a00.h;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import d00.C6018d;
import e3.r;
import fd.InterfaceC6511n;
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
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.data.LotteryOnboardingInfoDTO;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.di.LotteryOnboardingInfoComponent;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.presentation.LotteryOnboardingInfoVI;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1 extends AbstractC7737t implements Function1<C6018d<LotteryOnboardingInfoDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<LotteryOnboardingInfoDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18471 extends AbstractC7737t implements Function1<C7244b, LotteryOnboardingInfoDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18471(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final LotteryOnboardingInfoDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (LotteryOnboardingInfoDTO) this.$jsonDeserializer.fromJson(it.b(), LotteryOnboardingInfoDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<LotteryOnboardingInfoDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<LotteryOnboardingInfoDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18471(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<LotteryOnboardingInfoDTO, LotteryOnboardingInfoVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                List<LotteryOnboardingInfoDTO.OnboardingItem> onboardingItems;
                return Boolean.valueOf((!(obj instanceof LotteryOnboardingInfoDTO) || (onboardingItems = ((LotteryOnboardingInfoDTO) obj).getOnboardingItems()) == null || onboardingItems.isEmpty()) ? false : true);
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/data/LotteryOnboardingInfoDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<LotteryOnboardingInfoDTO, d, List<? extends LotteryOnboardingInfoVI>> {
            final /* synthetic */ LotteryOnboardingInfoComponent $component;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent) {
                super(2);
                this.$component = lotteryOnboardingInfoComponent;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<LotteryOnboardingInfoVI> invoke(LotteryOnboardingInfoDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return this.$component.getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18483 extends AbstractC7737t implements Function1<f<LotteryOnboardingInfoVI>, Unit> {
            final /* synthetic */ LotteryOnboardingInfoComponent $component;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v2/presentation/LotteryOnboardingInfoVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<LotteryOnboardingInfoVI>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ LotteryOnboardingInfoComponent $component;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent) {
                    super(3);
                    this.$component = lotteryOnboardingInfoComponent;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<LotteryOnboardingInfoVI> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<LotteryOnboardingInfoVI> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    C4911f c4911f = (C4911f) interfaceC3967k.m(b00.f.d());
                    h hVar = (h) interfaceC3967k.m(b00.f.f());
                    interfaceC3967k.o(-322891986);
                    boolean z11 = (i11 & 14) == 4;
                    Object C11 = interfaceC3967k.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    Function1<Tg.b, Unit> b11 = new e.a(c4911f, hVar, (Function0) C11, this.$component.getActionHandlerComponentApi()).b();
                    MorkovskOnboardingDelegate onboardingDelegate = this.$component.getOnboardingDelegate();
                    LotteryOnboardingInfoVI b12 = content.b();
                    J j11 = (J) interfaceC3967k.m(r.a());
                    AbstractC5434v lifecycle = j11.getLifecycle();
                    interfaceC3967k.o(-322877538);
                    boolean F11 = interfaceC3967k.F(this.$component) | interfaceC3967k.F(b12) | interfaceC3967k.F(j11) | interfaceC3967k.F(lifecycle) | interfaceC3967k.F(onboardingDelegate) | interfaceC3967k.n(b11);
                    LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent = this.$component;
                    Object C12 = interfaceC3967k.C();
                    if (F11 || C12 == InterfaceC3967k.a.a()) {
                        Object lotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1 = new LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1(lotteryOnboardingInfoComponent, b12, j11, lifecycle, onboardingDelegate, b11);
                        interfaceC3967k.x(lotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1);
                        C12 = lotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$3$3$1$1$1;
                    }
                    interfaceC3967k.k();
                    Q.c(lifecycle, (Function1) C12, interfaceC3967k);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18483(LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent) {
                super(1);
                this.$component = lotteryOnboardingInfoComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<LotteryOnboardingInfoVI> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<LotteryOnboardingInfoVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1042947458, new AnonymousClass1(this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ru.ozon.composer.compose.widget.overlay.e<LotteryOnboardingInfoDTO, LotteryOnboardingInfoVI> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ru.ozon.composer.compose.widget.overlay.e<LotteryOnboardingInfoDTO, LotteryOnboardingInfoVI> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            LotteryOnboardingInfoComponent lotteryOnboardingInfoComponent = (LotteryOnboardingInfoComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(LotteryOnboardingInfoComponent.class);
            overlayViewMapper.i(AnonymousClass1.INSTANCE, new AnonymousClass2(lotteryOnboardingInfoComponent));
            int i11 = 0;
            overlayViewMapper.s(new d.b(i11, i11, 3, null), new C18483(lotteryOnboardingInfoComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<LotteryOnboardingInfoDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<LotteryOnboardingInfoDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt$LotteryOnboardingInfoWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return LotteryOnboardingInfoComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
