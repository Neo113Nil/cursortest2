package ru.ozon.app.android.ugc.core.widgets.selectionReactions.core;

import A00.a;
import S0.InterfaceC3967k;
import a1.C4912a;
import d00.C6018d;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.data.SelectionReactionsDTO;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.di.SelectionReactionsComponent;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsKt;
import ru.ozon.app.android.ugc.core.widgets.selectionReactions.presentation.SelectionReactionsVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterLikeActionHandler;
import ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter.ActionsFooterStateUpdateKey;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.overlay.d;
import ru.ozon.composer.compose.widget.overlay.e;
import ru.ozon.composer.compose.widget.overlay.f;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1 extends AbstractC7737t implements Function1<C6018d<SelectionReactionsDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<SelectionReactionsDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19511 extends AbstractC7737t implements Function1<C7244b, SelectionReactionsDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19511(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final SelectionReactionsDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (SelectionReactionsDTO) this.$jsonDeserializer.fromJson(it.b(), SelectionReactionsDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<SelectionReactionsDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<SelectionReactionsDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19511(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/e;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<e<SelectionReactionsDTO, SelectionReactionsVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function1<Object, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof SelectionReactionsDTO);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/selectionReactions/data/SelectionReactionsDTO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function2<SelectionReactionsDTO, d, SelectionReactionsVO> {
            public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

            AnonymousClass2() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final SelectionReactionsVO invoke(SelectionReactionsDTO state, d info) {
                SelectionReactionsVO.ReactionsVO vo;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                vo = SelectionReactionsComposeWidgetKt.toVO(state.getReactions(), hashCode);
                CornerRadius cornerRadius = state.getCornerRadius();
                String backgroundColor = state.getBackgroundColor();
                String strokeColor = state.getStrokeColor();
                String scrollGradientColor = state.getScrollGradientColor();
                Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
                return new SelectionReactionsVO(hashCode, vo, cornerRadius, backgroundColor, strokeColor, scrollGradientColor, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/f;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/overlay/f;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$3$4, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass4 extends AbstractC7737t implements Function1<f<SelectionReactionsVO>, Unit> {
            final /* synthetic */ SelectionReactionsComponent $component;
            final /* synthetic */ e<SelectionReactionsDTO, SelectionReactionsVO> $this_overlayViewMapper;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/selectionReactions/presentation/SelectionReactionsVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/i;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$3$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<i<SelectionReactionsVO>, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ SelectionReactionsComponent $component;
                final /* synthetic */ e<SelectionReactionsDTO, SelectionReactionsVO> $this_overlayViewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(e<SelectionReactionsDTO, SelectionReactionsVO> eVar, SelectionReactionsComponent selectionReactionsComponent) {
                    super(3);
                    this.$this_overlayViewMapper = eVar;
                    this.$component = selectionReactionsComponent;
                }

                @Override // fd.InterfaceC6511n
                public /* bridge */ /* synthetic */ Unit invoke(i<SelectionReactionsVO> iVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<SelectionReactionsVO> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 19) == 18 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        SelectionReactionsKt.SelectionReactions(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerBuilder.m473handlersStoreDnHbjWo(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_overlayViewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14), this.$component.getCustomActionHandlersStoreFactory().create(ActionsFooterLikeActionHandler.class))), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(e<SelectionReactionsDTO, SelectionReactionsVO> eVar, SelectionReactionsComponent selectionReactionsComponent) {
                super(1);
                this.$this_overlayViewMapper = eVar;
                this.$component = selectionReactionsComponent;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f<SelectionReactionsVO> fVar) {
                invoke2(fVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(f<SelectionReactionsVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1637430109, new AnonymousClass1(this.$this_overlayViewMapper, this.$component)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e<SelectionReactionsDTO, SelectionReactionsVO> eVar) {
            invoke2(eVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(e<SelectionReactionsDTO, SelectionReactionsVO> overlayViewMapper) {
            Intrinsics.checkNotNullParameter(overlayViewMapper, "$this$overlayViewMapper");
            SelectionReactionsComponent selectionReactionsComponent = (SelectionReactionsComponent) overlayViewMapper.getWidgetComponentStorage().getComponent(SelectionReactionsComponent.class);
            overlayViewMapper.k(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
            overlayViewMapper.c().put(ActionsFooterStateUpdateKey.class, new c.a() { // from class: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$3$invoke$$inlined$update$1
                @Override // ru.ozon.composer.compose.widget.c.a
                public final I handle(a.J.InterfaceC0007a update, I old) {
                    SelectionReactionsVO switchActionState;
                    Intrinsics.checkNotNullParameter(update, "update");
                    Intrinsics.checkNotNullParameter(old, "old");
                    ActionsFooterStateUpdateKey actionsFooterStateUpdateKey = (ActionsFooterStateUpdateKey) update;
                    switchActionState = SelectionReactionsComposeWidgetKt.switchActionState((SelectionReactionsVO) old, Boolean.valueOf(actionsFooterStateUpdateKey.getIsSelected()), actionsFooterStateUpdateKey.getActionId());
                    return switchActionState;
                }
            });
            overlayViewMapper.s(d.a.f94674b, new AnonymousClass4(overlayViewMapper, selectionReactionsComponent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<SelectionReactionsDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<SelectionReactionsDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.selectionReactions.core.SelectionReactionsComposeWidgetKt$SelectionReactionsWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SelectionReactionsComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.l(AnonymousClass3.INSTANCE);
    }
}
