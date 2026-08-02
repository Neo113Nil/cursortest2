package ru.ozon.app.android.regulardraw.widgets.lotteryResult.core;

import S0.InterfaceC3967k;
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
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.joda.time.DateTime;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.regulardraw.ui.FixComposerWidgetBackgroundKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.data.LotteryResultDTO;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.di.LotteryResultWidgetComponent;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation.LotteryResultVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class LotteryResultWidgetKt$LotteryResultWidget$1 extends AbstractC7737t implements Function1<C6018d<LotteryResultDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<LotteryResultDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18411 extends AbstractC7737t implements Function1<C7244b, LotteryResultDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18411(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final LotteryResultDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (LotteryResultDTO) this.$jsonDeserializer.fromJson(it.b(), LotteryResultDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<LotteryResultDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<LotteryResultDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18411(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<j<LotteryResultDTO, LotteryResultVI>, Unit> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "invoke", "(Lru/ozon/app/android/regulardraw/widgets/lotteryResult/data/LotteryResultDTO;Ll20/d;)Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$3$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<LotteryResultDTO, d, LotteryResultVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final LotteryResultVI invoke(LotteryResultDTO state, d info) {
                LotteryResultVI.Values values;
                LotteryResultVI.DrawStatus drawStatus;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long hashCode = info.d().hashCode();
                StableDateTime stableDateTime = new StableDateTime(state.getDate());
                TextDTO title = state.getTitle();
                IconButtonV3DTO rightIcon = state.getRightIcon();
                BadgeDTO winStatusBadge = state.getWinStatusBadge();
                LotteryResultDTO.Values values2 = state.getValues();
                if (values2 != null) {
                    List<String> leftValues = values2.getLeftValues();
                    if (leftValues == null) {
                        leftValues = K.f71697a;
                    }
                    List<String> rightValues = values2.getRightValues();
                    if (rightValues == null) {
                        rightValues = K.f71697a;
                    }
                    values = new LotteryResultVI.Values(leftValues, rightValues);
                } else {
                    values = null;
                }
                BadgeDTO drawStatusBadge = state.getDrawStatusBadge();
                if (drawStatusBadge != null) {
                    String drawStatusBadgeColor = state.getDrawStatusBadgeColor();
                    DateTime broadcastDate = state.getBroadcastDate();
                    StableDateTime stableDateTime2 = broadcastDate != null ? new StableDateTime(broadcastDate) : null;
                    AtomActionDTO action = state.getAction();
                    drawStatus = new LotteryResultVI.DrawStatus(drawStatusBadge, drawStatusBadgeColor, stableDateTime2, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
                } else {
                    drawStatus = null;
                }
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return new LotteryResultVI(hashCode, stableDateTime, title, rightIcon, winStatusBadge, values, drawStatus, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$3$2, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass2 extends AbstractC7737t implements Function1<k<LotteryResultVI>, Unit> {
            final /* synthetic */ j<LotteryResultDTO, LotteryResultVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$3$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<LotteryResultVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<LotteryResultDTO, LotteryResultVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<LotteryResultDTO, LotteryResultVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<LotteryResultVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<LotteryResultVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
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
                    interfaceC3967k.o(-1500273763);
                    boolean z11 = (i11 & 14) == 4;
                    Object C11 = interfaceC3967k.C();
                    if (z11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new LotteryResultWidgetKt$LotteryResultWidget$1$3$2$1$actionHandler$1$1(content);
                        interfaceC3967k.x(C11);
                    }
                    interfaceC3967k.k();
                    ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation.LotteryResultWidgetKt.LotteryResultWidget(content.b(), new e.a(c4911f, hVar, (Function0) C11, ((LotteryResultWidgetComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(LotteryResultWidgetComponent.class)).getActionHandlerComponentApi()).b(), interfaceC3967k, 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(j<LotteryResultDTO, LotteryResultVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<LotteryResultVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<LotteryResultVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, 1509607241, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<LotteryResultDTO, LotteryResultVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<LotteryResultDTO, LotteryResultVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new AnonymousClass2(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryResultWidgetKt$LotteryResultWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<LotteryResultDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<LotteryResultDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.j().add(new C6018d.a() { // from class: ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt$LotteryResultWidget$1$invoke$$inlined$widgetComponent$1
            @Override // d00.C6018d.a
            public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return LotteryResultWidgetComponent.INSTANCE.getInstance(it);
            }
        });
        ComposeWidget.p(AnonymousClass3.INSTANCE);
    }
}
