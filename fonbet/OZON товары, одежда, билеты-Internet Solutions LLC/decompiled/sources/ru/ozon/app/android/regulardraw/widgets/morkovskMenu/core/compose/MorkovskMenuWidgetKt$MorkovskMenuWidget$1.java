package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
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
import ru.ozon.app.android.regulardraw.flags.ModalMenuComposeFlag;
import ru.ozon.app.android.regulardraw.ui.FixComposerWidgetBackgroundKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.MorkovskMenuConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.MorkovskMenuViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.di.MorkovskMenuComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.compose.MorkovskMenuWidgetComposableKt;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class MorkovskMenuWidgetKt$MorkovskMenuWidget$1 extends AbstractC7737t implements Function1<C6018d<MorkovskMenuDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<MorkovskMenuDTO, MorkovskMenuVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "state", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            final /* synthetic */ InterfaceC4008j<MorkovskMenuComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(InterfaceC4008j<? extends MorkovskMenuComponent> interfaceC4008j) {
                super(1);
                this.$component$delegate = interfaceC4008j;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf((obj instanceof MorkovskMenuDTO) && AnonymousClass3.invoke$lambda$0(this.$component$delegate).getFeatureChecker().isEnabled(ModalMenuComposeFlag.INSTANCE));
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<MorkovskMenuDTO, d, List<? extends MorkovskMenuVO>> {
            final /* synthetic */ InterfaceC4008j<MorkovskMenuComponent> $component$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(InterfaceC4008j<? extends MorkovskMenuComponent> interfaceC4008j) {
                super(2);
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function2
            public final List<MorkovskMenuVO> invoke(MorkovskMenuDTO state, d widgetInfo) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
                return AnonymousClass3.invoke$lambda$0(this.$component$delegate).getMapper().invoke(state, widgetInfo);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$3, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18433 extends AbstractC7737t implements Function1<k<MorkovskMenuVO>, Unit> {
            final /* synthetic */ InterfaceC4008j<MorkovskMenuComponent> $component$delegate;
            final /* synthetic */ j<MorkovskMenuDTO, MorkovskMenuVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<MorkovskMenuVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ InterfaceC4008j<MorkovskMenuComponent> $component$delegate;
                final /* synthetic */ j<MorkovskMenuDTO, MorkovskMenuVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(j<MorkovskMenuDTO, MorkovskMenuVO> jVar, InterfaceC4008j<? extends MorkovskMenuComponent> interfaceC4008j) {
                    super(4);
                    this.$this_viewMapper = jVar;
                    this.$component$delegate = interfaceC4008j;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<MorkovskMenuVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<MorkovskMenuVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        FixComposerWidgetBackgroundKt.FixComposerWidgetBackground(interfaceC3967k, 0);
                        MorkovskMenuWidgetComposableKt.MorkovskMenuWidgetComposable(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), AnonymousClass3.invoke$lambda$0(this.$component$delegate).getDefaultActionHandlers())), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C18433(j<MorkovskMenuDTO, MorkovskMenuVO> jVar, InterfaceC4008j<? extends MorkovskMenuComponent> interfaceC4008j) {
                super(1);
                this.$this_viewMapper = jVar;
                this.$component$delegate = interfaceC4008j;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<MorkovskMenuVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<MorkovskMenuVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1893230816, new AnonymousClass1(this.$this_viewMapper, this.$component$delegate)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MorkovskMenuComponent invoke$lambda$0(InterfaceC4008j<? extends MorkovskMenuComponent> interfaceC4008j) {
            return interfaceC4008j.getValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<MorkovskMenuDTO, MorkovskMenuVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<MorkovskMenuDTO, MorkovskMenuVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            InterfaceC4008j b11 = Sc.k.b(new MorkovskMenuWidgetKt$MorkovskMenuWidget$1$3$component$2(viewMapper));
            viewMapper.i(new AnonymousClass1(b11), new AnonymousClass2(b11));
            viewMapper.G(new C18433(viewMapper, b11));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskMenuWidgetKt$MorkovskMenuWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<MorkovskMenuDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<MorkovskMenuDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        final JsonParser jsonParser = this.$jsonDeserializer;
        ComposeWidget.o(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$invoke$$inlined$rawConfig$1
            @Override // d00.C6018d.a
            public final InterfaceC7243a<? extends Object> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new MorkovskMenuConfig(JsonParser.this);
            }
        });
        ComposeWidget.g().add(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$invoke$$inlined$rawViewMapper$1
            @Override // d00.C6018d.a
            public final InterfaceC8046a<? extends Object, ? extends c> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new MorkovskMenuViewMapper((MorkovskMenuComponent) it.getComponent(MorkovskMenuComponent.class));
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt$MorkovskMenuWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MorkovskMenuComponent.INSTANCE.create(it);
            }
        });
    }
}
