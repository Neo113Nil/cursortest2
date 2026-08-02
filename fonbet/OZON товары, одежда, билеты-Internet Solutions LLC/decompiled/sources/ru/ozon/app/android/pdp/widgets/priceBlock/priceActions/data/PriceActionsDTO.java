package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.data;

import Ak.C2436a;
import B0.A0;
import B90.C2619v;
import Sh.b;
import T7.P;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO;", "", "actions", "", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$PriceAction;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "getActions", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PriceAction", "Disclosure", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PriceActionsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<PriceAction> actions;
    private final String backgroundColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;", "", "tintColor", "", "<init>", "(Ljava/lang/String;)V", "getTintColor", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Disclosure {
        public static final int $stable = 0;
        private final String tintColor;

        public Disclosure(String str) {
            this.tintColor = str;
        }

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = disclosure.tintColor;
            }
            return disclosure.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTintColor() {
            return this.tintColor;
        }

        @NotNull
        public final Disclosure copy(String tintColor) {
            return new Disclosure(tintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && Intrinsics.d(this.tintColor, ((Disclosure) other).tintColor);
        }

        public final String getTintColor() {
            return this.tintColor;
        }

        public int hashCode() {
            String str = this.tintColor;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Disclosure(tintColor=", this.tintColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0090\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0010HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$PriceAction;", "", "backgroundColor", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "disclosure", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "animationTimer", "", "animationTrackingInfo", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getDisclosure", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getAnimationTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnimationTrackingInfo", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$Disclosure;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Integer;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/data/PriceActionsDTO$PriceAction;", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceAction {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Integer animationTimer;
        private final Map<String, TokenizedTrackingInfo> animationTrackingInfo;
        private final String backgroundColor;
        private final Disclosure disclosure;
        private final Icon icon;
        private final OnBoardingDTO onboarding;

        @NotNull
        private final TextAtom text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PriceAction(String str, @NotNull TextAtom text, Icon icon, Disclosure disclosure, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Integer num, Map<String, TokenizedTrackingInfo> map2, OnBoardingDTO onBoardingDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.backgroundColor = str;
            this.text = text;
            this.icon = icon;
            this.disclosure = disclosure;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.animationTimer = num;
            this.animationTrackingInfo = map2;
            this.onboarding = onBoardingDTO;
        }

        public static /* synthetic */ PriceAction copy$default(PriceAction priceAction, String str, TextAtom textAtom, Icon icon, Disclosure disclosure, AtomActionDTO atomActionDTO, Map map, Integer num, Map map2, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = priceAction.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                textAtom = priceAction.text;
            }
            if ((i11 & 4) != 0) {
                icon = priceAction.icon;
            }
            if ((i11 & 8) != 0) {
                disclosure = priceAction.disclosure;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = priceAction.action;
            }
            if ((i11 & 32) != 0) {
                map = priceAction.trackingInfo;
            }
            if ((i11 & 64) != 0) {
                num = priceAction.animationTimer;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map2 = priceAction.animationTrackingInfo;
            }
            if ((i11 & 256) != 0) {
                onBoardingDTO = priceAction.onboarding;
            }
            Map map3 = map2;
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            Map map4 = map;
            Integer num2 = num;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Icon icon2 = icon;
            return priceAction.copy(str, textAtom, icon2, disclosure, atomActionDTO2, map4, num2, map3, onBoardingDTO2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final Disclosure getDisclosure() {
            return this.disclosure;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.animationTrackingInfo;
        }

        /* renamed from: component9, reason: from getter */
        public final OnBoardingDTO getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final PriceAction copy(String backgroundColor, @NotNull TextAtom text, Icon icon, Disclosure disclosure, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Integer animationTimer, Map<String, TokenizedTrackingInfo> animationTrackingInfo, OnBoardingDTO onboarding) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new PriceAction(backgroundColor, text, icon, disclosure, action, trackingInfo, animationTimer, animationTrackingInfo, onboarding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceAction)) {
                return false;
            }
            PriceAction priceAction = (PriceAction) other;
            return Intrinsics.d(this.backgroundColor, priceAction.backgroundColor) && Intrinsics.d(this.text, priceAction.text) && Intrinsics.d(this.icon, priceAction.icon) && Intrinsics.d(this.disclosure, priceAction.disclosure) && Intrinsics.d(this.action, priceAction.action) && Intrinsics.d(this.trackingInfo, priceAction.trackingInfo) && Intrinsics.d(this.animationTimer, priceAction.animationTimer) && Intrinsics.d(this.animationTrackingInfo, priceAction.animationTrackingInfo) && Intrinsics.d(this.onboarding, priceAction.onboarding);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Integer getAnimationTimer() {
            return this.animationTimer;
        }

        public final Map<String, TokenizedTrackingInfo> getAnimationTrackingInfo() {
            return this.animationTrackingInfo;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Disclosure getDisclosure() {
            return this.disclosure;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final OnBoardingDTO getOnboarding() {
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
            String str = this.backgroundColor;
            int b11 = C2619v.b((str == null ? 0 : str.hashCode()) * 31, 31, this.text);
            Icon icon = this.icon;
            int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
            Disclosure disclosure = this.disclosure;
            int hashCode2 = (hashCode + (disclosure == null ? 0 : disclosure.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            Integer num = this.animationTimer;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.animationTrackingInfo;
            int hashCode6 = (hashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            return hashCode6 + (onBoardingDTO != null ? onBoardingDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            TextAtom textAtom = this.text;
            Icon icon = this.icon;
            Disclosure disclosure = this.disclosure;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Integer num = this.animationTimer;
            Map<String, TokenizedTrackingInfo> map2 = this.animationTrackingInfo;
            OnBoardingDTO onBoardingDTO = this.onboarding;
            StringBuilder d11 = C2436a.d("PriceAction(backgroundColor=", str, ", text=", ", icon=", textAtom);
            d11.append(icon);
            d11.append(", disclosure=");
            d11.append(disclosure);
            d11.append(", action=");
            b.f(d11, atomActionDTO, ", trackingInfo=", map, ", animationTimer=");
            d11.append(num);
            d11.append(", animationTrackingInfo=");
            d11.append(map2);
            d11.append(", onboarding=");
            d11.append(onBoardingDTO);
            d11.append(")");
            return d11.toString();
        }
    }

    public PriceActionsDTO(@NotNull List<PriceAction> actions, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.actions = actions;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceActionsDTO copy$default(PriceActionsDTO priceActionsDTO, List list, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = priceActionsDTO.actions;
        }
        if ((i11 & 2) != 0) {
            str = priceActionsDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            map = priceActionsDTO.trackingInfo;
        }
        return priceActionsDTO.copy(list, str, map);
    }

    @NotNull
    public final List<PriceAction> component1() {
        return this.actions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final PriceActionsDTO copy(@NotNull List<PriceAction> actions, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new PriceActionsDTO(actions, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceActionsDTO)) {
            return false;
        }
        PriceActionsDTO priceActionsDTO = (PriceActionsDTO) other;
        return Intrinsics.d(this.actions, priceActionsDTO.actions) && Intrinsics.d(this.backgroundColor, priceActionsDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, priceActionsDTO.trackingInfo);
    }

    @NotNull
    public final List<PriceAction> getActions() {
        return this.actions;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.actions.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PriceAction> list = this.actions;
        String str = this.backgroundColor;
        return P.f(C4055a.a("PriceActionsDTO(actions=", ", backgroundColor=", str, ", trackingInfo=", list), this.trackingInfo, ")");
    }
}
