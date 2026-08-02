package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.data;

import Bk.C2638a;
import C.o0;
import Cm.e;
import N3.C3660k;
import Sc.InterfaceC3999a;
import Sh.b;
import T7.P;
import Ul.C4070a;
import Xc.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\tQRSTUVWXYB¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010;\u001a\u00020\u0019J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0017\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u0010\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010I\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00108JÈ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00192\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020OHÖ\u0001J\t\u0010P\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010&\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u00109\u001a\u0004\b:\u00108¨\u0006Z"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;", "", "ordinaryPrice", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "ozonCardPrice", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "vatPrice", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "multiplicityInfo", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "bonusInfo", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;", "cheaperInfo", "dutyOnGoods", "cheaperInfoOnBoarding", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "infoCards", "", "innerBackgroundColor", "", "outerBackgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "showBottomSeparator", "", "showBottomRounding", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getOrdinaryPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "getOzonCardPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "getVatPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "getMultiplicityInfo", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBonusInfo$annotations", "()V", "getBonusInfo", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;", "getCheaperInfo$annotations", "getCheaperInfo", "getDutyOnGoods$annotations", "getDutyOnGoods", "getCheaperInfoOnBoarding$annotations", "getCheaperInfoOnBoarding", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "getInfoCards", "()Ljava/util/List;", "getInnerBackgroundColor", "()Ljava/lang/String;", "getOuterBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "getShowBottomSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowBottomRounding", "infoCardsIsEmpty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO;", "equals", "other", "hashCode", "", "toString", "Price", "PriceComponent", "PriceContainer", "Icon", "OzonCardPrice", "VATPrice", "AccentPrice", "Gradient", "BonusInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceV2DTO {
    public static final int $stable = 8;
    private final BonusInfo bonusInfo;
    private final BonusInfo cheaperInfo;
    private final PDPOnBoardingDTO cheaperInfoOnBoarding;
    private final BonusInfo dutyOnGoods;
    private final List<BonusInfo> infoCards;
    private final String innerBackgroundColor;
    private final TextAtom multiplicityInfo;
    private final PriceContainer ordinaryPrice;
    private final String outerBackgroundColor;
    private final OzonCardPrice ozonCardPrice;
    private final Boolean showBottomRounding;
    private final Boolean showBottomSeparator;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final VATPrice vatPrice;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;", "", "price", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "gradientBackground", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient;", "solidBackground", "", "disclosureTintColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getGradientBackground", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient;", "getSolidBackground", "()Ljava/lang/String;", "getDisclosureTintColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccentPrice {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String disclosureTintColor;
        private final Gradient gradientBackground;

        @NotNull
        private final PriceContainer price;
        private final String solidBackground;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public AccentPrice(@NotNull PriceContainer price, AtomActionDTO atomActionDTO, Gradient gradient, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.action = atomActionDTO;
            this.gradientBackground = gradient;
            this.solidBackground = str;
            this.disclosureTintColor = str2;
            this.trackingInfo = map;
        }

        public static /* synthetic */ AccentPrice copy$default(AccentPrice accentPrice, PriceContainer priceContainer, AtomActionDTO atomActionDTO, Gradient gradient, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceContainer = accentPrice.price;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = accentPrice.action;
            }
            if ((i11 & 4) != 0) {
                gradient = accentPrice.gradientBackground;
            }
            if ((i11 & 8) != 0) {
                str = accentPrice.solidBackground;
            }
            if ((i11 & 16) != 0) {
                str2 = accentPrice.disclosureTintColor;
            }
            if ((i11 & 32) != 0) {
                map = accentPrice.trackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            return accentPrice.copy(priceContainer, atomActionDTO, gradient, str, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceContainer getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final Gradient getGradientBackground() {
            return this.gradientBackground;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSolidBackground() {
            return this.solidBackground;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDisclosureTintColor() {
            return this.disclosureTintColor;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final AccentPrice copy(@NotNull PriceContainer price, AtomActionDTO action, Gradient gradientBackground, String solidBackground, String disclosureTintColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new AccentPrice(price, action, gradientBackground, solidBackground, disclosureTintColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccentPrice)) {
                return false;
            }
            AccentPrice accentPrice = (AccentPrice) other;
            return Intrinsics.d(this.price, accentPrice.price) && Intrinsics.d(this.action, accentPrice.action) && Intrinsics.d(this.gradientBackground, accentPrice.gradientBackground) && Intrinsics.d(this.solidBackground, accentPrice.solidBackground) && Intrinsics.d(this.disclosureTintColor, accentPrice.disclosureTintColor) && Intrinsics.d(this.trackingInfo, accentPrice.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getDisclosureTintColor() {
            return this.disclosureTintColor;
        }

        public final Gradient getGradientBackground() {
            return this.gradientBackground;
        }

        @NotNull
        public final PriceContainer getPrice() {
            return this.price;
        }

        public final String getSolidBackground() {
            return this.solidBackground;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Gradient gradient = this.gradientBackground;
            int hashCode3 = (hashCode2 + (gradient == null ? 0 : gradient.hashCode())) * 31;
            String str = this.solidBackground;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.disclosureTintColor;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PriceContainer priceContainer = this.price;
            AtomActionDTO atomActionDTO = this.action;
            Gradient gradient = this.gradientBackground;
            String str = this.solidBackground;
            String str2 = this.disclosureTintColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("AccentPrice(price=");
            sb2.append(priceContainer);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", gradientBackground=");
            sb2.append(gradient);
            sb2.append(", solidBackground=");
            sb2.append(str);
            sb2.append(", disclosureTintColor=");
            return C4070a.a(sb2, str2, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$BonusInfo;", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboarding", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "commonOnboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getOnboarding$annotations", "()V", "getOnboarding", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingDTO;", "getCommonOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BonusInfo {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final OnBoardingDTO commonOnboarding;
        private final ru.ozon.uni.atoms.data.button.Icon icon;
        private final PDPOnBoardingDTO onboarding;

        @NotNull
        private final TextAtom text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public BonusInfo(@NotNull TextAtom text, ru.ozon.uni.atoms.data.button.Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, PDPOnBoardingDTO pDPOnBoardingDTO, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.icon = icon;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.onboarding = pDPOnBoardingDTO;
            this.commonOnboarding = onBoardingDTO;
        }

        public static /* synthetic */ BonusInfo copy$default(BonusInfo bonusInfo, TextAtom textAtom, ru.ozon.uni.atoms.data.button.Icon icon, AtomActionDTO atomActionDTO, Map map, PDPOnBoardingDTO pDPOnBoardingDTO, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = bonusInfo.text;
            }
            if ((i11 & 2) != 0) {
                icon = bonusInfo.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = bonusInfo.action;
            }
            if ((i11 & 8) != 0) {
                map = bonusInfo.trackingInfo;
            }
            if ((i11 & 16) != 0) {
                pDPOnBoardingDTO = bonusInfo.onboarding;
            }
            if ((i11 & 32) != 0) {
                onBoardingDTO = bonusInfo.commonOnboarding;
            }
            PDPOnBoardingDTO pDPOnBoardingDTO2 = pDPOnBoardingDTO;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            return bonusInfo.copy(textAtom, icon, atomActionDTO, map, pDPOnBoardingDTO2, onBoardingDTO2);
        }

        @InterfaceC3999a
        public static /* synthetic */ void getOnboarding$annotations() {
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ru.ozon.uni.atoms.data.button.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final PDPOnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        /* renamed from: component6, reason: from getter */
        public final OnBoardingDTO getCommonOnboarding() {
            return this.commonOnboarding;
        }

        @NotNull
        public final BonusInfo copy(@NotNull TextAtom text, ru.ozon.uni.atoms.data.button.Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, PDPOnBoardingDTO onboarding, OnBoardingDTO commonOnboarding) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new BonusInfo(text, icon, action, trackingInfo, onboarding, commonOnboarding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BonusInfo)) {
                return false;
            }
            BonusInfo bonusInfo = (BonusInfo) other;
            return Intrinsics.d(this.text, bonusInfo.text) && Intrinsics.d(this.icon, bonusInfo.icon) && Intrinsics.d(this.action, bonusInfo.action) && Intrinsics.d(this.trackingInfo, bonusInfo.trackingInfo) && Intrinsics.d(this.onboarding, bonusInfo.onboarding) && Intrinsics.d(this.commonOnboarding, bonusInfo.commonOnboarding);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final OnBoardingDTO getCommonOnboarding() {
            return this.commonOnboarding;
        }

        public final ru.ozon.uni.atoms.data.button.Icon getIcon() {
            return this.icon;
        }

        public final PDPOnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final TextAtom getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ru.ozon.uni.atoms.data.button.Icon icon = this.icon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
            int hashCode5 = (hashCode4 + (pDPOnBoardingDTO == null ? 0 : pDPOnBoardingDTO.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.commonOnboarding;
            return hashCode5 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.text;
            ru.ozon.uni.atoms.data.button.Icon icon = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            PDPOnBoardingDTO pDPOnBoardingDTO = this.onboarding;
            OnBoardingDTO onBoardingDTO = this.commonOnboarding;
            StringBuilder sb2 = new StringBuilder("BonusInfo(text=");
            sb2.append(textAtom);
            sb2.append(", icon=");
            sb2.append(icon);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", onboarding=");
            sb2.append(pDPOnBoardingDTO);
            sb2.append(", commonOnboarding=");
            sb2.append(onBoardingDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient;", "", "colors", "", "", "style", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient$Style;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient$Style;)V", "getColors", "()Ljava/util/List;", "getStyle", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient$Style;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Style", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Gradient {
        public static final int $stable = 8;

        @NotNull
        private final List<String> colors;
        private final Style style;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Gradient$Style;", "", "<init>", "(Ljava/lang/String;I)V", "GRADIENT_STYLE_TYPE_INVALID", "GRADIENT_STYLE_TYPE_LEFT_RIGHT", "GRADIENT_STYLE_TYPE_TOP_BOTTOM", "GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM", "GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Style {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style GRADIENT_STYLE_TYPE_INVALID = new Style("GRADIENT_STYLE_TYPE_INVALID", 0);
            public static final Style GRADIENT_STYLE_TYPE_LEFT_RIGHT = new Style("GRADIENT_STYLE_TYPE_LEFT_RIGHT", 1);
            public static final Style GRADIENT_STYLE_TYPE_TOP_BOTTOM = new Style("GRADIENT_STYLE_TYPE_TOP_BOTTOM", 2);
            public static final Style GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM = new Style("GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM", 3);
            public static final Style GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM = new Style("GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM", 4);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{GRADIENT_STYLE_TYPE_INVALID, GRADIENT_STYLE_TYPE_LEFT_RIGHT, GRADIENT_STYLE_TYPE_TOP_BOTTOM, GRADIENT_STYLE_TYPE_TOP_LEFT_RIGHT_BOTTOM, GRADIENT_STYLE_TYPE_TOP_RIGHT_LEFT_BOTTOM};
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private Style(String str, int i11) {
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }

        public Gradient(@NotNull List<String> colors, Style style) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.colors = colors;
            this.style = style;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, Style style, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = gradient.colors;
            }
            if ((i11 & 2) != 0) {
                style = gradient.style;
            }
            return gradient.copy(list, style);
        }

        @NotNull
        public final List<String> component1() {
            return this.colors;
        }

        /* renamed from: component2, reason: from getter */
        public final Style getStyle() {
            return this.style;
        }

        @NotNull
        public final Gradient copy(@NotNull List<String> colors, Style style) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new Gradient(colors, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.colors, gradient.colors) && this.style == gradient.style;
        }

        @NotNull
        public final List<String> getColors() {
            return this.colors;
        }

        public final Style getStyle() {
            return this.style;
        }

        public int hashCode() {
            int hashCode = this.colors.hashCode() * 31;
            Style style = this.style;
            return hashCode + (style == null ? 0 : style.hashCode());
        }

        @NotNull
        public String toString() {
            return "Gradient(colors=" + this.colors + ", style=" + this.style + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "position", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon$Position;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon$Position;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getPosition", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon$Position;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Position", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Icon {
        public static final int $stable = ru.ozon.uni.atoms.data.button.Icon.$stable;

        @NotNull
        private final ru.ozon.uni.atoms.data.button.Icon icon;
        private final Position position;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon$Position;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "AFTER_PRICE", "AFTER_DESCRIPTION", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Position {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;

            @i(name = "invalid")
            public static final Position INVALID = new Position("INVALID", 0);

            @i(name = "afterPrice")
            public static final Position AFTER_PRICE = new Position("AFTER_PRICE", 1);

            @i(name = "afterDescription")
            public static final Position AFTER_DESCRIPTION = new Position("AFTER_DESCRIPTION", 2);

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{INVALID, AFTER_PRICE, AFTER_DESCRIPTION};
            }

            static {
                Position[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private Position(String str, int i11) {
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }

        public Icon(@NotNull ru.ozon.uni.atoms.data.button.Icon icon, Position position) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.position = position;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, ru.ozon.uni.atoms.data.button.Icon icon2, Position position, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon2 = icon.icon;
            }
            if ((i11 & 2) != 0) {
                position = icon.position;
            }
            return icon.copy(icon2, position);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ru.ozon.uni.atoms.data.button.Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        @NotNull
        public final Icon copy(@NotNull ru.ozon.uni.atoms.data.button.Icon icon, Position position) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new Icon(icon, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return Intrinsics.d(this.icon, icon.icon) && this.position == icon.position;
        }

        @NotNull
        public final ru.ozon.uni.atoms.data.button.Icon getIcon() {
            return this.icon;
        }

        public final Position getPosition() {
            return this.position;
        }

        public int hashCode() {
            int hashCode = this.icon.hashCode() * 31;
            Position position = this.position;
            return hashCode + (position == null ? 0 : position.hashCode());
        }

        @NotNull
        public String toString() {
            return "Icon(icon=" + this.icon + ", position=" + this.position + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$OzonCardPrice;", "", "price", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "accentPrice", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;)V", "getPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "getAccentPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$AccentPrice;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonCardPrice {
        public static final int $stable = 8;

        @NotNull
        private final AccentPrice accentPrice;

        @NotNull
        private final PriceContainer price;

        public OzonCardPrice(@NotNull PriceContainer price, @NotNull AccentPrice accentPrice) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(accentPrice, "accentPrice");
            this.price = price;
            this.accentPrice = accentPrice;
        }

        public static /* synthetic */ OzonCardPrice copy$default(OzonCardPrice ozonCardPrice, PriceContainer priceContainer, AccentPrice accentPrice, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceContainer = ozonCardPrice.price;
            }
            if ((i11 & 2) != 0) {
                accentPrice = ozonCardPrice.accentPrice;
            }
            return ozonCardPrice.copy(priceContainer, accentPrice);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceContainer getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AccentPrice getAccentPrice() {
            return this.accentPrice;
        }

        @NotNull
        public final OzonCardPrice copy(@NotNull PriceContainer price, @NotNull AccentPrice accentPrice) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(accentPrice, "accentPrice");
            return new OzonCardPrice(price, accentPrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OzonCardPrice)) {
                return false;
            }
            OzonCardPrice ozonCardPrice = (OzonCardPrice) other;
            return Intrinsics.d(this.price, ozonCardPrice.price) && Intrinsics.d(this.accentPrice, ozonCardPrice.accentPrice);
        }

        @NotNull
        public final AccentPrice getAccentPrice() {
            return this.accentPrice;
        }

        @NotNull
        public final PriceContainer getPrice() {
            return this.price;
        }

        public int hashCode() {
            return this.accentPrice.hashCode() + (this.price.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OzonCardPrice(price=" + this.price + ", accentPrice=" + this.accentPrice + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;", "", "price", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;", "priceDescription", "originalPrice", "strikethroughColor", "", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;Ljava/lang/String;)V", "getPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;", "getPriceDescription", "getOriginalPrice", "getStrikethroughColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price {
        public static final int $stable = 0;
        private final PriceComponent originalPrice;

        @NotNull
        private final PriceComponent price;
        private final PriceComponent priceDescription;
        private final String strikethroughColor;

        public Price(@NotNull PriceComponent price, PriceComponent priceComponent, PriceComponent priceComponent2, String str) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.priceDescription = priceComponent;
            this.originalPrice = priceComponent2;
            this.strikethroughColor = str;
        }

        public static /* synthetic */ Price copy$default(Price price, PriceComponent priceComponent, PriceComponent priceComponent2, PriceComponent priceComponent3, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceComponent = price.price;
            }
            if ((i11 & 2) != 0) {
                priceComponent2 = price.priceDescription;
            }
            if ((i11 & 4) != 0) {
                priceComponent3 = price.originalPrice;
            }
            if ((i11 & 8) != 0) {
                str = price.strikethroughColor;
            }
            return price.copy(priceComponent, priceComponent2, priceComponent3, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PriceComponent getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceComponent getPriceDescription() {
            return this.priceDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final PriceComponent getOriginalPrice() {
            return this.originalPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStrikethroughColor() {
            return this.strikethroughColor;
        }

        @NotNull
        public final Price copy(@NotNull PriceComponent price, PriceComponent priceDescription, PriceComponent originalPrice, String strikethroughColor) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new Price(price, priceDescription, originalPrice, strikethroughColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.d(this.price, price.price) && Intrinsics.d(this.priceDescription, price.priceDescription) && Intrinsics.d(this.originalPrice, price.originalPrice) && Intrinsics.d(this.strikethroughColor, price.strikethroughColor);
        }

        public final PriceComponent getOriginalPrice() {
            return this.originalPrice;
        }

        @NotNull
        public final PriceComponent getPrice() {
            return this.price;
        }

        public final PriceComponent getPriceDescription() {
            return this.priceDescription;
        }

        public final String getStrikethroughColor() {
            return this.strikethroughColor;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            PriceComponent priceComponent = this.priceDescription;
            int hashCode2 = (hashCode + (priceComponent == null ? 0 : priceComponent.hashCode())) * 31;
            PriceComponent priceComponent2 = this.originalPrice;
            int hashCode3 = (hashCode2 + (priceComponent2 == null ? 0 : priceComponent2.hashCode())) * 31;
            String str = this.strikethroughColor;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Price(price=" + this.price + ", priceDescription=" + this.priceDescription + ", originalPrice=" + this.originalPrice + ", strikethroughColor=" + this.strikethroughColor + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceComponent;", "", "text", "", "color", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getColor", "getStyle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceComponent {
        public static final int $stable = 0;
        private final String color;
        private final String style;

        @NotNull
        private final String text;

        public PriceComponent(@NotNull String text, String str, String str2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.color = str;
            this.style = str2;
        }

        public static /* synthetic */ PriceComponent copy$default(PriceComponent priceComponent, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = priceComponent.text;
            }
            if ((i11 & 2) != 0) {
                str2 = priceComponent.color;
            }
            if ((i11 & 4) != 0) {
                str3 = priceComponent.style;
            }
            return priceComponent.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @NotNull
        public final PriceComponent copy(@NotNull String text, String color, String style) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new PriceComponent(text, color, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceComponent)) {
                return false;
            }
            PriceComponent priceComponent = (PriceComponent) other;
            return Intrinsics.d(this.text, priceComponent.text) && Intrinsics.d(this.color, priceComponent.color) && Intrinsics.d(this.style, priceComponent.style);
        }

        public final String getColor() {
            return this.color;
        }

        public final String getStyle() {
            return this.style;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.style;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.text;
            String str2 = this.color;
            return o0.c(C3660k.d("PriceComponent(text=", str, ", color=", str2, ", style="), this.style, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "", "price", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getPrice", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Price;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceContainer {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final TextAtom description;
        private final Icon icon;

        @NotNull
        private final Price price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PriceContainer(@NotNull Price price, TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            this.price = price;
            this.description = textAtom;
            this.icon = icon;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PriceContainer copy$default(PriceContainer priceContainer, Price price, TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                price = priceContainer.price;
            }
            if ((i11 & 2) != 0) {
                textAtom = priceContainer.description;
            }
            if ((i11 & 4) != 0) {
                icon = priceContainer.icon;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = priceContainer.action;
            }
            if ((i11 & 16) != 0) {
                map = priceContainer.trackingInfo;
            }
            Map map2 = map;
            Icon icon2 = icon;
            return priceContainer.copy(price, textAtom, icon2, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final PriceContainer copy(@NotNull Price price, TextAtom description, Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(price, "price");
            return new PriceContainer(price, description, icon, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceContainer)) {
                return false;
            }
            PriceContainer priceContainer = (PriceContainer) other;
            return Intrinsics.d(this.price, priceContainer.price) && Intrinsics.d(this.description, priceContainer.description) && Intrinsics.d(this.icon, priceContainer.icon) && Intrinsics.d(this.action, priceContainer.action) && Intrinsics.d(this.trackingInfo, priceContainer.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final TextAtom getDescription() {
            return this.description;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.price.hashCode() * 31;
            TextAtom textAtom = this.description;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Icon icon = this.icon;
            int hashCode3 = (hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Price price = this.price;
            TextAtom textAtom = this.description;
            Icon icon = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PriceContainer(price=");
            sb2.append(price);
            sb2.append(", description=");
            sb2.append(textAtom);
            sb2.append(", icon=");
            sb2.append(icon);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$VATPrice;", "", "priceWithVAT", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "priceWithoutVAT", "<init>", "(Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;)V", "getPriceWithVAT", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/data/PriceV2DTO$PriceContainer;", "getPriceWithoutVAT", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VATPrice {
        public static final int $stable = 8;
        private final PriceContainer priceWithVAT;
        private final PriceContainer priceWithoutVAT;

        public VATPrice(PriceContainer priceContainer, PriceContainer priceContainer2) {
            this.priceWithVAT = priceContainer;
            this.priceWithoutVAT = priceContainer2;
        }

        public static /* synthetic */ VATPrice copy$default(VATPrice vATPrice, PriceContainer priceContainer, PriceContainer priceContainer2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                priceContainer = vATPrice.priceWithVAT;
            }
            if ((i11 & 2) != 0) {
                priceContainer2 = vATPrice.priceWithoutVAT;
            }
            return vATPrice.copy(priceContainer, priceContainer2);
        }

        /* renamed from: component1, reason: from getter */
        public final PriceContainer getPriceWithVAT() {
            return this.priceWithVAT;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceContainer getPriceWithoutVAT() {
            return this.priceWithoutVAT;
        }

        @NotNull
        public final VATPrice copy(PriceContainer priceWithVAT, PriceContainer priceWithoutVAT) {
            return new VATPrice(priceWithVAT, priceWithoutVAT);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VATPrice)) {
                return false;
            }
            VATPrice vATPrice = (VATPrice) other;
            return Intrinsics.d(this.priceWithVAT, vATPrice.priceWithVAT) && Intrinsics.d(this.priceWithoutVAT, vATPrice.priceWithoutVAT);
        }

        public final PriceContainer getPriceWithVAT() {
            return this.priceWithVAT;
        }

        public final PriceContainer getPriceWithoutVAT() {
            return this.priceWithoutVAT;
        }

        public int hashCode() {
            PriceContainer priceContainer = this.priceWithVAT;
            int hashCode = (priceContainer == null ? 0 : priceContainer.hashCode()) * 31;
            PriceContainer priceContainer2 = this.priceWithoutVAT;
            return hashCode + (priceContainer2 != null ? priceContainer2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VATPrice(priceWithVAT=" + this.priceWithVAT + ", priceWithoutVAT=" + this.priceWithoutVAT + ")";
        }
    }

    public PriceV2DTO(PriceContainer priceContainer, OzonCardPrice ozonCardPrice, VATPrice vATPrice, TextAtom textAtom, BonusInfo bonusInfo, BonusInfo bonusInfo2, BonusInfo bonusInfo3, PDPOnBoardingDTO pDPOnBoardingDTO, List<BonusInfo> list, String str, String str2, Map<String, TokenizedTrackingInfo> map, Boolean bool, Boolean bool2) {
        this.ordinaryPrice = priceContainer;
        this.ozonCardPrice = ozonCardPrice;
        this.vatPrice = vATPrice;
        this.multiplicityInfo = textAtom;
        this.bonusInfo = bonusInfo;
        this.cheaperInfo = bonusInfo2;
        this.dutyOnGoods = bonusInfo3;
        this.cheaperInfoOnBoarding = pDPOnBoardingDTO;
        this.infoCards = list;
        this.innerBackgroundColor = str;
        this.outerBackgroundColor = str2;
        this.trackingInfo = map;
        this.showBottomSeparator = bool;
        this.showBottomRounding = bool2;
    }

    @InterfaceC3999a
    public static /* synthetic */ void getBonusInfo$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getCheaperInfo$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getCheaperInfoOnBoarding$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getDutyOnGoods$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final PriceContainer getOrdinaryPrice() {
        return this.ordinaryPrice;
    }

    /* renamed from: component10, reason: from getter */
    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    /* renamed from: component11, reason: from getter */
    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getShowBottomSeparator() {
        return this.showBottomSeparator;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getShowBottomRounding() {
        return this.showBottomRounding;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonCardPrice getOzonCardPrice() {
        return this.ozonCardPrice;
    }

    /* renamed from: component3, reason: from getter */
    public final VATPrice getVatPrice() {
        return this.vatPrice;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getMultiplicityInfo() {
        return this.multiplicityInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final BonusInfo getBonusInfo() {
        return this.bonusInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final BonusInfo getCheaperInfo() {
        return this.cheaperInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final BonusInfo getDutyOnGoods() {
        return this.dutyOnGoods;
    }

    /* renamed from: component8, reason: from getter */
    public final PDPOnBoardingDTO getCheaperInfoOnBoarding() {
        return this.cheaperInfoOnBoarding;
    }

    public final List<BonusInfo> component9() {
        return this.infoCards;
    }

    @NotNull
    public final PriceV2DTO copy(PriceContainer ordinaryPrice, OzonCardPrice ozonCardPrice, VATPrice vatPrice, TextAtom multiplicityInfo, BonusInfo bonusInfo, BonusInfo cheaperInfo, BonusInfo dutyOnGoods, PDPOnBoardingDTO cheaperInfoOnBoarding, List<BonusInfo> infoCards, String innerBackgroundColor, String outerBackgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean showBottomSeparator, Boolean showBottomRounding) {
        return new PriceV2DTO(ordinaryPrice, ozonCardPrice, vatPrice, multiplicityInfo, bonusInfo, cheaperInfo, dutyOnGoods, cheaperInfoOnBoarding, infoCards, innerBackgroundColor, outerBackgroundColor, trackingInfo, showBottomSeparator, showBottomRounding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceV2DTO)) {
            return false;
        }
        PriceV2DTO priceV2DTO = (PriceV2DTO) other;
        return Intrinsics.d(this.ordinaryPrice, priceV2DTO.ordinaryPrice) && Intrinsics.d(this.ozonCardPrice, priceV2DTO.ozonCardPrice) && Intrinsics.d(this.vatPrice, priceV2DTO.vatPrice) && Intrinsics.d(this.multiplicityInfo, priceV2DTO.multiplicityInfo) && Intrinsics.d(this.bonusInfo, priceV2DTO.bonusInfo) && Intrinsics.d(this.cheaperInfo, priceV2DTO.cheaperInfo) && Intrinsics.d(this.dutyOnGoods, priceV2DTO.dutyOnGoods) && Intrinsics.d(this.cheaperInfoOnBoarding, priceV2DTO.cheaperInfoOnBoarding) && Intrinsics.d(this.infoCards, priceV2DTO.infoCards) && Intrinsics.d(this.innerBackgroundColor, priceV2DTO.innerBackgroundColor) && Intrinsics.d(this.outerBackgroundColor, priceV2DTO.outerBackgroundColor) && Intrinsics.d(this.trackingInfo, priceV2DTO.trackingInfo) && Intrinsics.d(this.showBottomSeparator, priceV2DTO.showBottomSeparator) && Intrinsics.d(this.showBottomRounding, priceV2DTO.showBottomRounding);
    }

    public final BonusInfo getBonusInfo() {
        return this.bonusInfo;
    }

    public final BonusInfo getCheaperInfo() {
        return this.cheaperInfo;
    }

    public final PDPOnBoardingDTO getCheaperInfoOnBoarding() {
        return this.cheaperInfoOnBoarding;
    }

    public final BonusInfo getDutyOnGoods() {
        return this.dutyOnGoods;
    }

    public final List<BonusInfo> getInfoCards() {
        return this.infoCards;
    }

    public final String getInnerBackgroundColor() {
        return this.innerBackgroundColor;
    }

    public final TextAtom getMultiplicityInfo() {
        return this.multiplicityInfo;
    }

    public final PriceContainer getOrdinaryPrice() {
        return this.ordinaryPrice;
    }

    public final String getOuterBackgroundColor() {
        return this.outerBackgroundColor;
    }

    public final OzonCardPrice getOzonCardPrice() {
        return this.ozonCardPrice;
    }

    public final Boolean getShowBottomRounding() {
        return this.showBottomRounding;
    }

    public final Boolean getShowBottomSeparator() {
        return this.showBottomSeparator;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final VATPrice getVatPrice() {
        return this.vatPrice;
    }

    public int hashCode() {
        PriceContainer priceContainer = this.ordinaryPrice;
        int hashCode = (priceContainer == null ? 0 : priceContainer.hashCode()) * 31;
        OzonCardPrice ozonCardPrice = this.ozonCardPrice;
        int hashCode2 = (hashCode + (ozonCardPrice == null ? 0 : ozonCardPrice.hashCode())) * 31;
        VATPrice vATPrice = this.vatPrice;
        int hashCode3 = (hashCode2 + (vATPrice == null ? 0 : vATPrice.hashCode())) * 31;
        TextAtom textAtom = this.multiplicityInfo;
        int hashCode4 = (hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        BonusInfo bonusInfo = this.bonusInfo;
        int hashCode5 = (hashCode4 + (bonusInfo == null ? 0 : bonusInfo.hashCode())) * 31;
        BonusInfo bonusInfo2 = this.cheaperInfo;
        int hashCode6 = (hashCode5 + (bonusInfo2 == null ? 0 : bonusInfo2.hashCode())) * 31;
        BonusInfo bonusInfo3 = this.dutyOnGoods;
        int hashCode7 = (hashCode6 + (bonusInfo3 == null ? 0 : bonusInfo3.hashCode())) * 31;
        PDPOnBoardingDTO pDPOnBoardingDTO = this.cheaperInfoOnBoarding;
        int hashCode8 = (hashCode7 + (pDPOnBoardingDTO == null ? 0 : pDPOnBoardingDTO.hashCode())) * 31;
        List<BonusInfo> list = this.infoCards;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.innerBackgroundColor;
        int hashCode10 = (hashCode9 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.outerBackgroundColor;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.showBottomSeparator;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showBottomRounding;
        return hashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean infoCardsIsEmpty() {
        List<BonusInfo> list = this.infoCards;
        return (list == null || list.isEmpty()) && this.bonusInfo == null && this.cheaperInfo == null && this.dutyOnGoods == null;
    }

    @NotNull
    public String toString() {
        PriceContainer priceContainer = this.ordinaryPrice;
        OzonCardPrice ozonCardPrice = this.ozonCardPrice;
        VATPrice vATPrice = this.vatPrice;
        TextAtom textAtom = this.multiplicityInfo;
        BonusInfo bonusInfo = this.bonusInfo;
        BonusInfo bonusInfo2 = this.cheaperInfo;
        BonusInfo bonusInfo3 = this.dutyOnGoods;
        PDPOnBoardingDTO pDPOnBoardingDTO = this.cheaperInfoOnBoarding;
        List<BonusInfo> list = this.infoCards;
        String str = this.innerBackgroundColor;
        String str2 = this.outerBackgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Boolean bool = this.showBottomSeparator;
        Boolean bool2 = this.showBottomRounding;
        StringBuilder sb2 = new StringBuilder("PriceV2DTO(ordinaryPrice=");
        sb2.append(priceContainer);
        sb2.append(", ozonCardPrice=");
        sb2.append(ozonCardPrice);
        sb2.append(", vatPrice=");
        sb2.append(vATPrice);
        sb2.append(", multiplicityInfo=");
        sb2.append(textAtom);
        sb2.append(", bonusInfo=");
        sb2.append(bonusInfo);
        sb2.append(", cheaperInfo=");
        sb2.append(bonusInfo2);
        sb2.append(", dutyOnGoods=");
        sb2.append(bonusInfo3);
        sb2.append(", cheaperInfoOnBoarding=");
        sb2.append(pDPOnBoardingDTO);
        sb2.append(", infoCards=");
        e.i(", innerBackgroundColor=", str, ", outerBackgroundColor=", sb2, list);
        C2638a.e(sb2, str2, ", trackingInfo=", map, ", showBottomSeparator=");
        sb2.append(bool);
        sb2.append(", showBottomRounding=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }
}
