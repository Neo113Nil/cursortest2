package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core;

import S0.InterfaceC3967k;
import Tg.a;
import Vg.c;
import Vg.e;
import WZ.l;
import WZ.t;
import a1.C4912a;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import d00.C6018d;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import j20.C7244b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackVO;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.ButtonStackKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.StickyButtonStackKt;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ButtonStackConfigKt$commonButtonStackWidget$2 extends AbstractC7737t implements Function1<C6018d<ButtonStackDTO>, Unit> {
    final /* synthetic */ Function1<C7475g, a> $actionNavigator;
    final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
    final /* synthetic */ JsonParser $deserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ButtonStackDTO>, Unit> {
        final /* synthetic */ JsonParser $deserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "invoke", "(Lj20/b;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C14331 extends AbstractC7737t implements Function1<C7244b, ButtonStackDTO> {
            final /* synthetic */ JsonParser $deserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C14331(JsonParser jsonParser) {
                super(1);
                this.$deserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ButtonStackDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ButtonStackDTO) this.$deserializer.fromJson(it.b(), ButtonStackDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$deserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ButtonStackDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ButtonStackDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C14331(this.$deserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<ButtonStackDTO, ButtonStackVO>, Unit> {
        final /* synthetic */ Function1<C7475g, a> $actionNavigator;
        final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$2$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof ButtonStackDTO) {
                    ButtonStackDTO buttonStackDTO = (ButtonStackDTO) obj;
                    if (!buttonStackDTO.isSticky()) {
                        if (buttonStackDTO.getOrientation() == ButtonStackDTO.ButtonsOrientation.ORIENTATION_VERTICAL) {
                            List<ButtonStackDTO.WidgetButtons> buttons = buttonStackDTO.getButtons();
                            if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
                                Iterator<T> it = buttons.iterator();
                                while (it.hasNext()) {
                                    if (!(((ButtonStackDTO.WidgetButtons) it.next()).getButton() instanceof IconButtonV3DTO)) {
                                    }
                                }
                            }
                        }
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "state", "Ll20/d;", "info", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "invoke", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C14342 extends AbstractC7737t implements Function2<ButtonStackDTO, d, ButtonStackVO> {
            public static final C14342 INSTANCE = new C14342();

            C14342() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final ButtonStackVO invoke(ButtonStackDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return ButtonStackMapperKt.toVO(state, info.d().hashCode());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$2$3, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass3 extends AbstractC7737t implements Function1<k<ButtonStackVO>, Unit> {
            final /* synthetic */ Function1<C7475g, a> $actionNavigator;
            final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
            final /* synthetic */ j<ButtonStackDTO, ButtonStackVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$2$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ButtonStackVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ Function1<C7475g, a> $actionNavigator;
                final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
                final /* synthetic */ j<ButtonStackDTO, ButtonStackVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(j<ButtonStackDTO, ButtonStackVO> jVar, Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$actionNavigator = function1;
                    this.$customActionHandlersStore = function12;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ButtonStackVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ButtonStackVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    t tokenizedEvent = content.b().getTokenizedEvent();
                    interfaceC3967k.o(120883702);
                    if (tokenizedEvent != null) {
                        AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                        interfaceC3967k.o(-537415207);
                        boolean F11 = interfaceC3967k.F(lVar) | interfaceC3967k.F(tokenizedEvent);
                        Object C11 = interfaceC3967k.C();
                        if (F11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new ButtonStackConfigKt$commonButtonStackWidget$2$2$3$1$1$1$1(lVar, tokenizedEvent);
                            interfaceC3967k.x(C11);
                        }
                        interfaceC3967k.k();
                        e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
                        Unit unit = Unit.f71690a;
                    }
                    interfaceC3967k.k();
                    e.a a11 = Xg.b.a(content, this.$this_viewMapper.getWidgetComponentStorage(), this.$actionNavigator.invoke(this.$this_viewMapper.getWidgetComponentStorage()), interfaceC3967k);
                    Function1<C7475g, c> function1 = this.$customActionHandlersStore;
                    j<ButtonStackDTO, ButtonStackVO> jVar = this.$this_viewMapper;
                    if (function1 != null) {
                        a11.c(function1.invoke(jVar.getWidgetComponentStorage()));
                    }
                    ButtonStackKt.ButtonStack(content.b(), a11.b(), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(j<ButtonStackDTO, ButtonStackVO> jVar, Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$actionNavigator = function1;
                this.$customActionHandlersStore = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ButtonStackVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ButtonStackVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1329309562, new AnonymousClass1(this.$this_viewMapper, this.$actionNavigator, this.$customActionHandlersStore)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
            super(1);
            this.$actionNavigator = function1;
            this.$customActionHandlersStore = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ButtonStackDTO, ButtonStackVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ButtonStackDTO, ButtonStackVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            viewMapper.k(AnonymousClass1.INSTANCE, C14342.INSTANCE);
            viewMapper.G(new AnonymousClass3(viewMapper, this.$actionNavigator, this.$customActionHandlersStore));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO>, Unit> {
        final /* synthetic */ Function1<C7475g, a> $actionNavigator;
        final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$3$1, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                boolean z11;
                if (obj instanceof ButtonStackDTO) {
                    ButtonStackDTO buttonStackDTO = (ButtonStackDTO) obj;
                    if (buttonStackDTO.isSticky()) {
                        if (buttonStackDTO.getOrientation() != ButtonStackDTO.ButtonsOrientation.ORIENTATION_HORIZONTAL) {
                            if (buttonStackDTO.getOrientation() == ButtonStackDTO.ButtonsOrientation.ORIENTATION_VERTICAL) {
                                List<ButtonStackDTO.WidgetButtons> buttons = buttonStackDTO.getButtons();
                                if (!(buttons instanceof Collection) || !buttons.isEmpty()) {
                                    Iterator<T> it = buttons.iterator();
                                    while (it.hasNext()) {
                                        if (!(((ButtonStackDTO.WidgetButtons) it.next()).getButton() instanceof IconButtonV3DTO)) {
                                        }
                                    }
                                }
                            }
                        }
                        z11 = true;
                        return Boolean.valueOf(z11);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;", "state", "Ll20/d;", "info", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "invoke", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO;Ll20/d;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$3$2, reason: invalid class name */
        /* loaded from: classes10.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<ButtonStackDTO, d, ButtonStackVO> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final ButtonStackVO invoke(ButtonStackDTO state, d info) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                return ButtonStackMapperKt.toVO(state, info.d().hashCode());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes10.dex */
        static final class C14353 extends AbstractC7737t implements Function1<ru.ozon.composer.compose.widget.overlay.f<ButtonStackVO>, Unit> {
            final /* synthetic */ Function1<C7475g, a> $actionNavigator;
            final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
            final /* synthetic */ ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt$commonButtonStackWidget$2$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<ButtonStackVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ Function1<C7475g, a> $actionNavigator;
                final /* synthetic */ Function1<C7475g, c> $customActionHandlersStore;
                final /* synthetic */ ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> eVar, Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$actionNavigator = function1;
                    this.$customActionHandlersStore = function12;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<ButtonStackVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ButtonStackVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                        return;
                    }
                    l lVar = (l) interfaceC3967k.m(f.e());
                    t tokenizedEvent = content.b().getTokenizedEvent();
                    interfaceC3967k.o(120931446);
                    if (tokenizedEvent != null) {
                        AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                        interfaceC3967k.o(-537367463);
                        boolean F11 = interfaceC3967k.F(lVar) | interfaceC3967k.F(tokenizedEvent);
                        Object C11 = interfaceC3967k.C();
                        if (F11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new ButtonStackConfigKt$commonButtonStackWidget$2$3$3$1$1$1$1(lVar, tokenizedEvent);
                            interfaceC3967k.x(C11);
                        }
                        interfaceC3967k.k();
                        e3.i.a(aVar, null, (Function0) C11, interfaceC3967k, 6);
                        Unit unit = Unit.f71690a;
                    }
                    interfaceC3967k.k();
                    e.a a11 = Xg.b.a(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), this.$actionNavigator.invoke(this.$this_overlayViewMapper.getWidgetComponentStorage()), interfaceC3967k);
                    Function1<C7475g, c> function1 = this.$customActionHandlersStore;
                    ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> eVar = this.$this_overlayViewMapper;
                    if (function1 != null) {
                        a11.c(function1.invoke(eVar.getWidgetComponentStorage()));
                    }
                    StickyButtonStackKt.StickyButtonStack(content.b(), a11.b(), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C14353(ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> eVar, Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$actionNavigator = function1;
                this.$customActionHandlersStore = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ru.ozon.composer.compose.widget.overlay.f<ButtonStackVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ru.ozon.composer.compose.widget.overlay.f<ButtonStackVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 2071033798, new AnonymousClass1(this.$this_overlayViewMapper, this.$actionNavigator, this.$customActionHandlersStore)));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
            super(1);
            this.$actionNavigator = function1;
            this.$customActionHandlersStore = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ru.ozon.composer.compose.widget.overlay.e<ButtonStackDTO, ButtonStackVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            overlayViewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            overlayViewMapper.s(d.a.f94674b, new C14353(overlayViewMapper, this.$actionNavigator, this.$customActionHandlersStore));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ButtonStackConfigKt$commonButtonStackWidget$2(JsonParser jsonParser, Function1<? super C7475g, ? extends a> function1, Function1<? super C7475g, ? extends c> function12) {
        super(1);
        this.$deserializer = jsonParser;
        this.$actionNavigator = function1;
        this.$customActionHandlersStore = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ButtonStackDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ButtonStackDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$deserializer));
        ComposeWidget.p(new AnonymousClass2(this.$actionNavigator, this.$customActionHandlersStore));
        ComposeWidget.l(new AnonymousClass3(this.$actionNavigator, this.$customActionHandlersStore));
    }
}
