package ru.ozon.app.android.ugc.core.widgets.textIconWidget.core;

import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import d00.C6018d;
import fd.InterfaceC6512o;
import hi.InterfaceC6958a;
import j20.C7244b;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
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
import ru.ozon.app.android.ugc.core.widgets.textIconWidget.data.TextIconWidgetDTO;
import ru.ozon.app.android.ugc.core.widgets.textIconWidget.di.TextIconWidgetComponent;
import ru.ozon.app.android.ugc.core.widgets.textIconWidget.presentation.TextIconWidgetKt;
import ru.ozon.app.android.ugc.core.widgets.textIconWidget.presentation.TextIconWidgetVO;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TextIconWidgetComposeWidgetKt$TextIconWidget$1 extends AbstractC7737t implements Function1<C6018d<TextIconWidgetDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<TextIconWidgetDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C19541 extends AbstractC7737t implements Function1<C7244b, TextIconWidgetDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C19541(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final TextIconWidgetDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (TextIconWidgetDTO) this.$jsonDeserializer.fromJson(it.b(), TextIconWidgetDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<TextIconWidgetDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<TextIconWidgetDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C19541(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<TextIconWidgetDTO, TextIconWidgetVO>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/textIconWidget/data/TextIconWidgetDTO;Ll20/d;)Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<TextIconWidgetDTO, d, TextIconWidgetVO> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$3$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TextIconWidgetDTO.Alignment.values().length];
                    try {
                        iArr[TextIconWidgetDTO.Alignment.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TextIconWidgetDTO.Alignment.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TextIconWidgetDTO.Alignment.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final TextIconWidgetVO invoke(TextIconWidgetDTO state, d info) {
                Paddings paddings;
                Paddings paddings2;
                Paddings paddings3;
                Paddings paddings4;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                Tc.b builder = C7714v.B();
                if (state.getIconPosition() == TextIconWidgetDTO.IconPosition.END) {
                    builder.add(state.getText());
                    IconDTO icon = state.getIcon();
                    if (icon != null) {
                        builder.add(icon);
                    }
                } else {
                    IconDTO icon2 = state.getIcon();
                    if (icon2 != null) {
                        builder.add(icon2);
                    }
                    builder.add(state.getText());
                }
                Unit unit = Unit.f71690a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                Tc.b B11 = builder.B();
                AtomActionDTO action = state.getAction();
                AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTracking()) : null;
                TextIconWidgetDTO.Alignment alignment = state.getAlignment();
                int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
                C5179b.e f7 = i11 != 1 ? i11 != 2 ? i11 != 3 ? C5179b.f() : C5179b.c() : C5179b.b() : C5179b.f();
                TextIconWidgetDTO.LayoutPaddings paddings5 = state.getPaddings();
                if (paddings5 == null || (paddings = paddings5.getLeftPadding()) == null) {
                    paddings = Paddings.NONE;
                }
                TextIconWidgetDTO.LayoutPaddings paddings6 = state.getPaddings();
                if (paddings6 == null || (paddings2 = paddings6.getRightPadding()) == null) {
                    paddings2 = Paddings.NONE;
                }
                TextIconWidgetDTO.LayoutPaddings paddings7 = state.getPaddings();
                if (paddings7 == null || (paddings3 = paddings7.getTopPadding()) == null) {
                    paddings3 = Paddings.NONE;
                }
                TextIconWidgetDTO.LayoutPaddings paddings8 = state.getPaddings();
                if (paddings8 == null || (paddings4 = paddings8.getBottomPadding()) == null) {
                    paddings4 = Paddings.NONE;
                }
                TextIconWidgetVO.LayoutPaddingsVO layoutPaddingsVO = new TextIconWidgetVO.LayoutPaddingsVO(paddings3, paddings4, paddings, paddings2);
                String backgroundColor = state.getBackgroundColor();
                Map<String, TokenizedTrackingInfo> tracking = state.getTracking();
                return new TextIconWidgetVO(hashCode, B11, atomAction, f7, layoutPaddingsVO, backgroundColor, tracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(tracking, Long.valueOf(hashCode), null, 2, null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<TextIconWidgetVO>, Unit> {
            final /* synthetic */ j<TextIconWidgetDTO, TextIconWidgetVO> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/ugc/core/widgets/textIconWidget/presentation/TextIconWidgetVO;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<TextIconWidgetVO>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<TextIconWidgetDTO, TextIconWidgetVO> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<TextIconWidgetDTO, TextIconWidgetVO> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<TextIconWidgetVO> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<TextIconWidgetVO> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        TextIconWidgetKt.TextIconWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<TextIconWidgetDTO, TextIconWidgetVO> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<TextIconWidgetVO> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<TextIconWidgetVO> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -997204833, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<TextIconWidgetDTO, TextIconWidgetVO> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<TextIconWidgetDTO, TextIconWidgetVO> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new AnonymousClass2(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextIconWidgetComposeWidgetKt$TextIconWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<TextIconWidgetDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<TextIconWidgetDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.ugc.core.widgets.textIconWidget.core.TextIconWidgetComposeWidgetKt$TextIconWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TextIconWidgetComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
