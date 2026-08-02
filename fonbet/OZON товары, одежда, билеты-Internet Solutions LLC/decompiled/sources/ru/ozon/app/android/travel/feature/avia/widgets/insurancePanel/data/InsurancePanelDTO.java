package ru.ozon.app.android.travel.feature.avia.widgets.insurancePanel.data;

import B90.C2619v;
import Bi.b;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002!\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "moreInfoButton", "Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "insurances", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;", "cancelButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getMoreInfoButton", "()Lru/ozon/app/android/travel/molecules/dto/linkButton/LinkButtonDTO;", "getInsurances", "()Ljava/util/List;", "getCancelButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Insurance", "Benefit", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InsurancePanelDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3Atom.LargeBorderlessButton cancelButton;

    @NotNull
    private final List<Insurance> insurances;
    private final LinkButtonDTO moreInfoButton;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Benefit;", "", "statusIcon", "Lru/ozon/uni/atoms/data/button/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "getStatusIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Benefit {
        public static final int $stable = TextAtom.$stable | Icon.$stable;

        @NotNull
        private final Icon statusIcon;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public Benefit(@NotNull Icon statusIcon, @NotNull TextAtom title, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.statusIcon = statusIcon;
            this.title = title;
            this.subtitle = textAtom;
        }

        public static /* synthetic */ Benefit copy$default(Benefit benefit, Icon icon, TextAtom textAtom, TextAtom textAtom2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = benefit.statusIcon;
            }
            if ((i11 & 2) != 0) {
                textAtom = benefit.title;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = benefit.subtitle;
            }
            return benefit.copy(icon, textAtom, textAtom2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Icon getStatusIcon() {
            return this.statusIcon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final Benefit copy(@NotNull Icon statusIcon, @NotNull TextAtom title, TextAtom subtitle) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Benefit(statusIcon, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) other;
            return Intrinsics.d(this.statusIcon, benefit.statusIcon) && Intrinsics.d(this.title, benefit.title) && Intrinsics.d(this.subtitle, benefit.subtitle);
        }

        @NotNull
        public final Icon getStatusIcon() {
            return this.statusIcon;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int b11 = C2619v.b(this.statusIcon.hashCode() * 31, 31, this.title);
            TextAtom textAtom = this.subtitle;
            return b11 + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            Icon icon = this.statusIcon;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("Benefit(statusIcon=");
            sb2.append(icon);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", subtitle=");
            return b.g(sb2, textAtom2, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00102\u001a\u00020\u0011HÆ\u0003J\u0017\u00103\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0089\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00106\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010&R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Insurance;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "subtitle", "logoLink", "", "selectButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "benefits", "", "Lru/ozon/app/android/travel/feature/avia/widgets/insurancePanel/data/InsurancePanelDTO$Benefit;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "isSelected", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "detailedConditionsButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Lru/ozon/uni/atoms/data/badge/Badge;ZLjava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getSubtitle", "getLogoLink", "()Ljava/lang/String;", "getSelectButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getBenefits", "()Ljava/util/List;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "()Z", "getTrackingInfo", "()Ljava/util/Map;", "getDetailedConditionsButton", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Insurance {
        public static final int $stable = 8;
        private final Badge badge;

        @NotNull
        private final List<Benefit> benefits;
        private final BadgeDTO detailedConditionsButton;
        private final boolean isSelected;
        private final String logoLink;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.LargeButton selectButton;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Insurance(@NotNull TextAtom title, @NotNull Price price, TextAtom textAtom, String str, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull List<Benefit> benefits, Badge badge, boolean z11, Map<String, TokenizedTrackingInfo> map, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(selectButton, "selectButton");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.title = title;
            this.price = price;
            this.subtitle = textAtom;
            this.logoLink = str;
            this.selectButton = selectButton;
            this.benefits = benefits;
            this.badge = badge;
            this.isSelected = z11;
            this.trackingInfo = map;
            this.detailedConditionsButton = badgeDTO;
        }

        public static /* synthetic */ Insurance copy$default(Insurance insurance, TextAtom textAtom, Price price, TextAtom textAtom2, String str, ButtonV3Atom.LargeButton largeButton, List list, Badge badge, boolean z11, Map map, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = insurance.title;
            }
            if ((i11 & 2) != 0) {
                price = insurance.price;
            }
            if ((i11 & 4) != 0) {
                textAtom2 = insurance.subtitle;
            }
            if ((i11 & 8) != 0) {
                str = insurance.logoLink;
            }
            if ((i11 & 16) != 0) {
                largeButton = insurance.selectButton;
            }
            if ((i11 & 32) != 0) {
                list = insurance.benefits;
            }
            if ((i11 & 64) != 0) {
                badge = insurance.badge;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z11 = insurance.isSelected;
            }
            if ((i11 & 256) != 0) {
                map = insurance.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                badgeDTO = insurance.detailedConditionsButton;
            }
            Map map2 = map;
            BadgeDTO badgeDTO2 = badgeDTO;
            Badge badge2 = badge;
            boolean z12 = z11;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            List list2 = list;
            return insurance.copy(textAtom, price, textAtom2, str, largeButton2, list2, badge2, z12, map2, badgeDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component10, reason: from getter */
        public final BadgeDTO getDetailedConditionsButton() {
            return this.detailedConditionsButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLogoLink() {
            return this.logoLink;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.LargeButton getSelectButton() {
            return this.selectButton;
        }

        @NotNull
        public final List<Benefit> component6() {
            return this.benefits;
        }

        /* renamed from: component7, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final Insurance copy(@NotNull TextAtom title, @NotNull Price price, TextAtom subtitle, String logoLink, @NotNull ButtonV3Atom.LargeButton selectButton, @NotNull List<Benefit> benefits, Badge badge, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo, BadgeDTO detailedConditionsButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(selectButton, "selectButton");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            return new Insurance(title, price, subtitle, logoLink, selectButton, benefits, badge, isSelected, trackingInfo, detailedConditionsButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insurance)) {
                return false;
            }
            Insurance insurance = (Insurance) other;
            return Intrinsics.d(this.title, insurance.title) && Intrinsics.d(this.price, insurance.price) && Intrinsics.d(this.subtitle, insurance.subtitle) && Intrinsics.d(this.logoLink, insurance.logoLink) && Intrinsics.d(this.selectButton, insurance.selectButton) && Intrinsics.d(this.benefits, insurance.benefits) && Intrinsics.d(this.badge, insurance.badge) && this.isSelected == insurance.isSelected && Intrinsics.d(this.trackingInfo, insurance.trackingInfo) && Intrinsics.d(this.detailedConditionsButton, insurance.detailedConditionsButton);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final List<Benefit> getBenefits() {
            return this.benefits;
        }

        public final BadgeDTO getDetailedConditionsButton() {
            return this.detailedConditionsButton;
        }

        public final String getLogoLink() {
            return this.logoLink;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSelectButton() {
            return this.selectButton;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3051a.a(this.price, this.title.hashCode() * 31, 31);
            TextAtom textAtom = this.subtitle;
            int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            String str = this.logoLink;
            int b11 = g.b(Tl.b.a(this.selectButton, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.benefits);
            Badge badge = this.badge;
            int a12 = C3532b.a((b11 + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.isSelected);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
            BadgeDTO badgeDTO = this.detailedConditionsButton;
            return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            return "Insurance(title=" + this.title + ", price=" + this.price + ", subtitle=" + this.subtitle + ", logoLink=" + this.logoLink + ", selectButton=" + this.selectButton + ", benefits=" + this.benefits + ", badge=" + this.badge + ", isSelected=" + this.isSelected + ", trackingInfo=" + this.trackingInfo + ", detailedConditionsButton=" + this.detailedConditionsButton + ")";
        }
    }

    public InsurancePanelDTO(@NotNull TextAtom title, LinkButtonDTO linkButtonDTO, @NotNull List<Insurance> insurances, @NotNull ButtonV3Atom.LargeBorderlessButton cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        this.title = title;
        this.moreInfoButton = linkButtonDTO;
        this.insurances = insurances;
        this.cancelButton = cancelButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsurancePanelDTO copy$default(InsurancePanelDTO insurancePanelDTO, TextAtom textAtom, LinkButtonDTO linkButtonDTO, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = insurancePanelDTO.title;
        }
        if ((i11 & 2) != 0) {
            linkButtonDTO = insurancePanelDTO.moreInfoButton;
        }
        if ((i11 & 4) != 0) {
            list = insurancePanelDTO.insurances;
        }
        if ((i11 & 8) != 0) {
            largeBorderlessButton = insurancePanelDTO.cancelButton;
        }
        return insurancePanelDTO.copy(textAtom, linkButtonDTO, list, largeBorderlessButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkButtonDTO getMoreInfoButton() {
        return this.moreInfoButton;
    }

    @NotNull
    public final List<Insurance> component3() {
        return this.insurances;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final InsurancePanelDTO copy(@NotNull TextAtom title, LinkButtonDTO moreInfoButton, @NotNull List<Insurance> insurances, @NotNull ButtonV3Atom.LargeBorderlessButton cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(insurances, "insurances");
        Intrinsics.checkNotNullParameter(cancelButton, "cancelButton");
        return new InsurancePanelDTO(title, moreInfoButton, insurances, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsurancePanelDTO)) {
            return false;
        }
        InsurancePanelDTO insurancePanelDTO = (InsurancePanelDTO) other;
        return Intrinsics.d(this.title, insurancePanelDTO.title) && Intrinsics.d(this.moreInfoButton, insurancePanelDTO.moreInfoButton) && Intrinsics.d(this.insurances, insurancePanelDTO.insurances) && Intrinsics.d(this.cancelButton, insurancePanelDTO.cancelButton);
    }

    @NotNull
    public final ButtonV3Atom.LargeBorderlessButton getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final List<Insurance> getInsurances() {
        return this.insurances;
    }

    public final LinkButtonDTO getMoreInfoButton() {
        return this.moreInfoButton;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        LinkButtonDTO linkButtonDTO = this.moreInfoButton;
        return this.cancelButton.hashCode() + g.b((hashCode + (linkButtonDTO == null ? 0 : linkButtonDTO.hashCode())) * 31, 31, this.insurances);
    }

    @NotNull
    public String toString() {
        return "InsurancePanelDTO(title=" + this.title + ", moreInfoButton=" + this.moreInfoButton + ", insurances=" + this.insurances + ", cancelButton=" + this.cancelButton + ")";
    }
}
