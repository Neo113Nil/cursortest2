package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation;

import WZ.t;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.DisabledButtonStyleDTO;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.TotalStickyV2DTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVOKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;Ll20/d;)Ljava/util/List;", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV2Mapper implements Function2<TotalStickyV2DTO, d, List<? extends TotalStickyV2VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2Mapper$Companion;", "", "<init>", "()V", "LEGACY_BACKGROUND_COLOR", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TotalStickyV2VO> invoke(@NotNull TotalStickyV2DTO dto, @NotNull d widgetInfo) {
        String str;
        TextAtom textAtom;
        t tVar;
        ButtonV3Atom.SmallButton smallButton;
        boolean z11;
        long j11;
        String backgroundColor;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.hashCode();
        Badge badgeInfo = dto.getBadgeInfo();
        PartnerBanksVO partnerBanksVO = null;
        if (badgeInfo == null || (backgroundColor = badgeInfo.getBackgroundColor()) == null) {
            str = null;
        } else {
            str = backgroundColor.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        }
        Badge copy$default = Intrinsics.d(str, "ozgray90") ? Badge.copy$default(dto.getBadgeInfo(), null, null, null, null, UniColors.BG_ACTIVE_PRIMARY.getToken(), null, null, null, null, null, null, null, null, 8175, null) : dto.getBadgeInfo();
        Price price = dto.getSummary().getPrice();
        TextAtom infoText = dto.getSummary().getInfoText();
        ButtonV3Atom.SmallButton button = dto.getButton();
        String a11 = widgetInfo.c().a();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        if (trackingInfo != null) {
            textAtom = infoText;
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
        } else {
            textAtom = infoText;
            tVar = null;
        }
        Boolean disableSeparator = dto.getDisableSeparator();
        if (disableSeparator != null) {
            smallButton = button;
            z11 = disableSeparator.booleanValue();
        } else {
            smallButton = button;
            z11 = false;
        }
        String backgroundColor2 = dto.getBackgroundColor();
        Boolean showIsland = dto.getShowIsland();
        boolean booleanValue = showIsland != null ? showIsland.booleanValue() : false;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        DisabledButtonStyleDTO disabledButtonStyle = dto.getDisabledButtonStyle();
        ButtonV3DTO newButton = dto.getNewButton();
        Price secondPrice = dto.getSummary().getSecondPrice();
        PartnerBanksDTO partnerBanksMolecule = dto.getSummary().getPartnerBanksMolecule();
        if (partnerBanksMolecule != null) {
            j11 = hashCode;
            partnerBanksVO = PartnerBanksVOKt.toVO$default(partnerBanksMolecule, j11, null, 2, null);
        } else {
            j11 = hashCode;
        }
        return C7714v.a0(new TotalStickyV2VO(j11, price, textAtom, smallButton2, copy$default, a11, tVar, z11, backgroundColor2, booleanValue, disabledButtonStyle, newButton, secondPrice, partnerBanksVO));
    }
}
