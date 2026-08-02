package ru.ozon.app.android.pdp.widgets.curtainPrice.core;

import S0.InterfaceC3967k;
import WZ.x;
import a1.C4912a;
import d00.C6018d;
import fd.InterfaceC6512o;
import j20.C7244b;
import java.util.List;
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
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVOKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;
import ru.ozon.app.android.pdp.widgets.curtainPrice.presentation.CurtainPriceComposableKt;
import ru.ozon.app.android.pdp.widgets.curtainPrice.presentation.CurtainPriceVI;
import ru.ozon.composer.compose.widget.c;
import ru.ozon.composer.compose.widget.config.b;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.j;
import ru.ozon.composer.compose.widget.scrollable.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld00/d;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "", "invoke", "(Ld00/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1 extends AbstractC7737t implements Function1<C6018d<CurtainPriceDTO>, Unit> {
    final /* synthetic */ JsonParser $jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "", "invoke", "(Lru/ozon/composer/compose/widget/config/b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.curtainPrice.core.CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b<CurtainPriceDTO>, Unit> {
        final /* synthetic */ JsonParser $jsonDeserializer;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj20/b;", "it", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "invoke", "(Lj20/b;)Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.curtainPrice.core.CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18161 extends AbstractC7737t implements Function1<C7244b, CurtainPriceDTO> {
            final /* synthetic */ JsonParser $jsonDeserializer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18161(JsonParser jsonParser) {
                super(1);
                this.$jsonDeserializer = jsonParser;
            }

            @Override // kotlin.jvm.functions.Function1
            public final CurtainPriceDTO invoke(C7244b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (CurtainPriceDTO) this.$jsonDeserializer.fromJson(it.b(), CurtainPriceDTO.class);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonParser jsonParser) {
            super(1);
            this.$jsonDeserializer = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b<CurtainPriceDTO> bVar) {
            invoke2(bVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(b<CurtainPriceDTO> config) {
            Intrinsics.checkNotNullParameter(config, "$this$config");
            b.j(config, null, new C18161(this.$jsonDeserializer), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.pdp.widgets.curtainPrice.core.CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<j<CurtainPriceDTO, CurtainPriceVI>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "state", "Ll20/d;", "info", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "invoke", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;Ll20/d;)Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.curtainPrice.core.CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1$2$1, reason: invalid class name */
        /* loaded from: classes13.dex */
        static final class AnonymousClass1 extends AbstractC7737t implements Function2<CurtainPriceDTO, d, CurtainPriceVI> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final CurtainPriceVI invoke(CurtainPriceDTO state, d info) {
                CurtainPriceVI.Island island;
                List list;
                List vo;
                CurtainPriceVI.BankLogo bankLogo;
                CurtainPriceVI.BankLogo vo2;
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(info, "info");
                long widgetId = MapperExtKt.widgetId(info);
                CurtainPriceDTO.Island island2 = state.getIsland();
                if (island2 != null) {
                    CurtainPriceDTO.PriceWrapperDTO price = island2.getPrice();
                    Object banksInfo = island2.getBanksInfo();
                    CurtainPriceDTO.Island.BankLogoDTO bankLogoDTO = banksInfo instanceof CurtainPriceDTO.Island.BankLogoDTO ? (CurtainPriceDTO.Island.BankLogoDTO) banksInfo : null;
                    if (bankLogoDTO != null) {
                        vo2 = CurtainPriceComposeWidgetKt.toVO(bankLogoDTO, widgetId, island2.getAction());
                        bankLogo = vo2;
                    } else {
                        bankLogo = null;
                    }
                    Object banksInfo2 = island2.getBanksInfo();
                    PartnerBanksDTO partnerBanksDTO = banksInfo2 instanceof PartnerBanksDTO ? (PartnerBanksDTO) banksInfo2 : null;
                    PartnerBanksVO vo3 = partnerBanksDTO != null ? PartnerBanksVOKt.toVO(partnerBanksDTO, widgetId, island2.getAction()) : null;
                    List<TextDTO> priceDescription = island2.getPriceDescription();
                    String backgroundColor = island2.getBackgroundColor();
                    CornerRadius cornerRadius = island2.getCornerRadius();
                    AtomActionDTO action = island2.getAction();
                    island = new CurtainPriceVI.Island(price, bankLogo, vo3, priceDescription, backgroundColor, cornerRadius, action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null);
                } else {
                    island = null;
                }
                CurtainPriceDTO.PriceWrapperDTO regularPrice = state.getRegularPrice();
                List<CurtainPriceDTO.AdditionalInfoDTO> additionalInfo = state.getAdditionalInfo();
                if (additionalInfo != null) {
                    vo = CurtainPriceComposeWidgetKt.toVO(additionalInfo, widgetId);
                    list = vo;
                } else {
                    list = null;
                }
                CurtainPriceDTO.SettingsDTO settings = state.getSettings();
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return new CurtainPriceVI(widgetId, island, regularPrice, list, settings, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(widgetId), null) : null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/k;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "", "invoke", "(Lru/ozon/composer/compose/widget/scrollable/k;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: ru.ozon.app.android.pdp.widgets.curtainPrice.core.CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1$2$2, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes13.dex */
        static final class C18172 extends AbstractC7737t implements Function1<k<CurtainPriceVI>, Unit> {
            final /* synthetic */ j<CurtainPriceDTO, CurtainPriceVI> $this_viewMapper;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/ozon/composer/compose/widget/i;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "Lru/ozon/composer/compose/widget/g$a;", "it", "", "invoke", "(Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.pdp.widgets.curtainPrice.core.CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<i<CurtainPriceVI>, g.a, InterfaceC3967k, Integer, Unit> {
                final /* synthetic */ j<CurtainPriceDTO, CurtainPriceVI> $this_viewMapper;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(j<CurtainPriceDTO, CurtainPriceVI> jVar) {
                    super(4);
                    this.$this_viewMapper = jVar;
                }

                @Override // fd.InterfaceC6512o
                public /* bridge */ /* synthetic */ Unit invoke(i<CurtainPriceVI> iVar, g.a aVar, InterfaceC3967k interfaceC3967k, Integer num) {
                    invoke(iVar, aVar, interfaceC3967k, num.intValue());
                    return Unit.f71690a;
                }

                public final void invoke(i<CurtainPriceVI> content, g.a it, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "$this$content");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i11 & 6) == 0) {
                        i11 |= interfaceC3967k.n(content) ? 4 : 2;
                    }
                    if ((i11 & 131) == 130 && interfaceC3967k.b()) {
                        interfaceC3967k.j();
                    } else {
                        CurtainPriceComposableKt.CurtainPriceComposable(content.b(), WidgetActionHandlerBuilder.m470buildHandlerimpl(WidgetActionHandlerKt.widgetActionHandlerBuilder(content, this.$this_viewMapper.getWidgetComponentStorage(), null, null, null, interfaceC3967k, i11 & 14, 14)), interfaceC3967k, 0);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C18172(j<CurtainPriceDTO, CurtainPriceVI> jVar) {
                super(1);
                this.$this_viewMapper = jVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(k<CurtainPriceVI> kVar) {
                invoke2(kVar);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(k<CurtainPriceVI> widgetSpec) {
                Intrinsics.checkNotNullParameter(widgetSpec, "$this$widgetSpec");
                widgetSpec.a(new C4912a(true, -1152903420, new AnonymousClass1(this.$this_viewMapper)));
            }
        }

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(j<CurtainPriceDTO, CurtainPriceVI> jVar) {
            invoke2(jVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(j<CurtainPriceDTO, CurtainPriceVI> viewMapper) {
            Intrinsics.checkNotNullParameter(viewMapper, "$this$viewMapper");
            c.l(viewMapper, null, AnonymousClass1.INSTANCE, 1, null);
            viewMapper.G(new C18172(viewMapper));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainPriceComposeWidgetKt$CurtainPriceComposeWidget$1(JsonParser jsonParser) {
        super(1);
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C6018d<CurtainPriceDTO> c6018d) {
        invoke2(c6018d);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6018d<CurtainPriceDTO> ComposeWidget) {
        Intrinsics.checkNotNullParameter(ComposeWidget, "$this$ComposeWidget");
        ComposeWidget.a(new AnonymousClass1(this.$jsonDeserializer));
        ComposeWidget.p(AnonymousClass2.INSTANCE);
    }
}
