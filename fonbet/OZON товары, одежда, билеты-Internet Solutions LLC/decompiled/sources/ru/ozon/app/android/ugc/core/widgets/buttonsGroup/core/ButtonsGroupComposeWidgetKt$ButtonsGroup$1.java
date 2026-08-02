package ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core;

import A00.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import d00.C6018d;
import e1.InterfaceC6250b;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.List;
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
import ru.ozon.app.android.common.actionHandlers.shareLink.ShareLinkActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.SubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.actionHandlers.UnsubscribeAuthorActionHandler;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.data.ButtonsGroupDTO;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.di.ButtonsGroupComponent;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation.ButtonsGroupKt;
import ru.ozon.app.android.ugc.core.widgets.buttonsGroup.presentation.ButtonsGroupVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ButtonsGroupComposeWidgetKt$ButtonsGroup$1 extends AbstractC7737t implements Function1<C6018d<ButtonsGroupDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<ButtonsGroupDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19401 extends AbstractC7737t implements Function1<C7244b, ButtonsGroupDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19401(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ButtonsGroupDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (ButtonsGroupDTO) this.$jsonDeserializer.fromJson(it.b(), ButtonsGroupDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<ButtonsGroupDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<ButtonsGroupDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19401(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<ButtonsGroupDTO, ButtonsGroupVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/data/ButtonsGroupDTO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<ButtonsGroupDTO, d, ButtonsGroupVO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ButtonsGroupDTO.Alignment.values().length];
                    try {
                        iArr[ButtonsGroupDTO.Alignment.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ButtonsGroupDTO.Alignment.RIGHT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final ButtonsGroupVO invoke(ButtonsGroupDTO state, d info) {
                Paddings paddings;
                Paddings paddings2;
                Paddings paddings3;
                Paddings paddings4;
                C5179b.i o11;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                Paddings itemsPadding = state.getItemsPadding();
                if (itemsPadding == null) {
                    itemsPadding = Paddings.PADDING_300;
                }
                Paddings paddings5 = itemsPadding;
                List<ButtonsGroupVO.ButtonItem> buttonItem = ButtonsGroupComposeWidgetKt.toButtonItem(state.getButtons());
                ButtonsGroupDTO.LayoutPaddings paddings6 = state.getPaddings();
                if (paddings6 == null || (paddings = paddings6.getLeftPadding()) == null) {
                    paddings = Paddings.NONE;
                }
                ButtonsGroupDTO.LayoutPaddings paddings7 = state.getPaddings();
                if (paddings7 == null || (paddings2 = paddings7.getRightPadding()) == null) {
                    paddings2 = Paddings.NONE;
                }
                ButtonsGroupDTO.LayoutPaddings paddings8 = state.getPaddings();
                if (paddings8 == null || (paddings3 = paddings8.getTopPadding()) == null) {
                    paddings3 = Paddings.NONE;
                }
                ButtonsGroupDTO.LayoutPaddings paddings9 = state.getPaddings();
                if (paddings9 == null || (paddings4 = paddings9.getBottomPadding()) == null) {
                    paddings4 = Paddings.NONE;
                }
                ButtonsGroupVO.LayoutPaddingsVO layoutPaddingsVO = new ButtonsGroupVO.LayoutPaddingsVO(paddings3, paddings4, paddings, paddings2);
                ButtonsGroupDTO.Alignment alignment = state.getAlignment();
                int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                if (i11 == 1) {
                    int i12 = C5179b.f39454h;
                    o11 = C5179b.o(paddings5.m1867getDpD9Ej5fM(), InterfaceC6250b.a.k());
                } else if (i11 != 2) {
                    int i13 = C5179b.f39454h;
                    o11 = C5179b.o(paddings5.m1867getDpD9Ej5fM(), InterfaceC6250b.a.g());
                } else {
                    int i14 = C5179b.f39454h;
                    o11 = C5179b.o(paddings5.m1867getDpD9Ej5fM(), InterfaceC6250b.a.j());
                }
                C5179b.i iVar = o11;
                String backgroundColor = state.getBackgroundColor();
                Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
                return new ButtonsGroupVO(hashCode, buttonItem, paddings5, layoutPaddingsVO, iVar, backgroundColor, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<k<ButtonsGroupVO>, Unit> {
            final /* synthetic */ j<ButtonsGroupDTO, ButtonsGroupVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/buttonsGroup/presentation/ButtonsGroupVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<ButtonsGroupVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<ButtonsGroupDTO, ButtonsGroupVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<ButtonsGroupDTO, ButtonsGroupVO> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<ButtonsGroupVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<ButtonsGroupVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        ButtonsGroupKt.ButtonsGroup(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), ((ButtonsGroupComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(ButtonsGroupComponent.class)).getCustomActionHandlersStoreFactory().create(SubscribeAuthorActionHandler.class, UnsubscribeAuthorActionHandler.class, ShareLinkActionHandler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(j<ButtonsGroupDTO, ButtonsGroupVO> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<ButtonsGroupVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<ButtonsGroupVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1738680691, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<ButtonsGroupDTO, ButtonsGroupVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<ButtonsGroupDTO, ButtonsGroupVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.c().put(SubscribeAuthorUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    ButtonsGroupVO updateButtonSelectorForAuthor;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updateButtonSelectorForAuthor = ButtonsGroupComposeWidgetKt.updateButtonSelectorForAuthor((ButtonsGroupVO) old, ((SubscribeAuthorUpdateKey) update).getAuthorId(), true);
                    return updateButtonSelectorForAuthor;
                }
            });
            viewMapper.c().put(UnsubscribeAuthorUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$3$invoke$$inlined$update$2
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    ButtonsGroupVO updateButtonSelectorForAuthor;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    updateButtonSelectorForAuthor = ButtonsGroupComposeWidgetKt.updateButtonSelectorForAuthor((ButtonsGroupVO) old, ((UnsubscribeAuthorUpdateKey) update).getAuthorId(), false);
                    return updateButtonSelectorForAuthor;
                }
            });
            viewMapper.G(new AnonymousClass4(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonsGroupComposeWidgetKt$ButtonsGroup$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<ButtonsGroupDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<ButtonsGroupDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.buttonsGroup.core.ButtonsGroupComposeWidgetKt$ButtonsGroup$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ButtonsGroupComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
