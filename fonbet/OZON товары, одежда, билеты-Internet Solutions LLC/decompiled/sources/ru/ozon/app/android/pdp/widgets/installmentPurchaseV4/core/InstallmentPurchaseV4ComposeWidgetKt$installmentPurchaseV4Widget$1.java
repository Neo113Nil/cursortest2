package ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core;

import S0.InterfaceC3967k;
import WZ.t;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import j20.C7244b;
import java.util.Map;
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
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.data.InstallmentPurchaseV4DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation.InstallmentPurchaseV4VI;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.presentation.InstallmentPurchaseWidgetKt;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1 extends AbstractC7737t implements Function1<C6018d<InstallmentPurchaseV4DTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core.InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<InstallmentPurchaseV4DTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core.InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18191 extends AbstractC7737t implements Function1<C7244b, InstallmentPurchaseV4DTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18191(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final InstallmentPurchaseV4DTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (InstallmentPurchaseV4DTO) this.$jsonDeserializer.fromJson(it.b(), InstallmentPurchaseV4DTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<InstallmentPurchaseV4DTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<InstallmentPurchaseV4DTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18191(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core.InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "invoke", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/data/InstallmentPurchaseV4DTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core.InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<InstallmentPurchaseV4DTO, d, InstallmentPurchaseV4VI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final InstallmentPurchaseV4VI invoke(InstallmentPurchaseV4DTO state, d info) {
                Map<String, TokenizedTrackingInfo> trackingInfo;
                AtomActionDTO action;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long widgetId = MapperExtKt.widgetId(info);
                BadgeDTO badge = state.getBadge();
                TextDTO text = state.getText();
                IconDTO icon = state.getIcon();
                String backgroundColor = state.getBackgroundColor();
                InstallmentPurchaseV4DTO.ControlSettings common = state.getCommon();
                AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getCommon().getTrackingInfo());
                InstallmentPurchaseV4DTO.ControlSettings common2 = state.getCommon();
                t tokenizedEvent$default = (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null);
                InstallmentPurchaseV4DTO.ControlSettings common3 = state.getCommon();
                TestInfo testInfo = common3 != null ? common3.getTestInfo() : null;
                InstallmentPurchaseV4DTO.GradientBadge gradientBadge = state.getGradientBadge();
                return new InstallmentPurchaseV4VI(widgetId, badge, text, icon, backgroundColor, atomAction, tokenizedEvent$default, testInfo, gradientBadge != null ? InstallmentPurchaseV4ComposeWidgetKt.toVI(gradientBadge, widgetId) : null, state.getImage());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core.InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18202 extends AbstractC7737t implements Function1<k<InstallmentPurchaseV4VI>, Unit> {
            final /* synthetic */ j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV4/presentation/InstallmentPurchaseV4VI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.installmentPurchaseV4.core.InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<InstallmentPurchaseV4VI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<InstallmentPurchaseV4VI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<InstallmentPurchaseV4VI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        InstallmentPurchaseWidgetKt.InstallmentPurchaseWidget(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18202(j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<InstallmentPurchaseV4VI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<InstallmentPurchaseV4VI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -310857895, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<InstallmentPurchaseV4DTO, InstallmentPurchaseV4VI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new C18202(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseV4ComposeWidgetKt$installmentPurchaseV4Widget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<InstallmentPurchaseV4DTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<InstallmentPurchaseV4DTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
    }
}
