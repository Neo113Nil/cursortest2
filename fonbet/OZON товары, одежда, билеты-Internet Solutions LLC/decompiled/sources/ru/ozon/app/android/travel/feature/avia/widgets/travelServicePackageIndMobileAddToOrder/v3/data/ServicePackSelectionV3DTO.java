package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data;

import B90.C2619v;
import C.o0;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import Lc.a;
import T7.P;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004\u001f !\"B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "priceDescription", "options", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageOption;", "declineButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPriceDescription", "getOptions", "()Ljava/util/List;", "getDeclineButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PackageOption", "PackageTab", "PushSMS", "Benefit", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ServicePackSelectionV3DTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.LargeBorderlessButton declineButton;

    @NotNull
    private final List<PackageOption> options;

    @NotNull
    private final TextAtom priceDescription;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$Benefit;", "", "isSeparatorHidden", "", "statusIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "description", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "benefitIcon", "darkBenefitIcon", "<init>", "(ZLru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/button/Icon;)V", "()Z", "getStatusIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getDescription", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBenefitIcon", "getDarkBenefitIcon", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Benefit {
        public static final int $stable;
        private final Icon benefitIcon;
        private final Icon darkBenefitIcon;

        @NotNull
        private final TextAtom description;
        private final boolean isSeparatorHidden;

        @NotNull
        private final Icon statusIcon;

        static {
            int i11 = Icon.$stable;
            $stable = i11 | TextAtom.$stable | i11;
        }

        public Benefit(boolean z11, @NotNull Icon statusIcon, @NotNull TextAtom description, Icon icon, Icon icon2) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(description, "description");
            this.isSeparatorHidden = z11;
            this.statusIcon = statusIcon;
            this.description = description;
            this.benefitIcon = icon;
            this.darkBenefitIcon = icon2;
        }

        public static /* synthetic */ Benefit copy$default(Benefit benefit, boolean z11, Icon icon, TextAtom textAtom, Icon icon2, Icon icon3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = benefit.isSeparatorHidden;
            }
            if ((i11 & 2) != 0) {
                icon = benefit.statusIcon;
            }
            if ((i11 & 4) != 0) {
                textAtom = benefit.description;
            }
            if ((i11 & 8) != 0) {
                icon2 = benefit.benefitIcon;
            }
            if ((i11 & 16) != 0) {
                icon3 = benefit.darkBenefitIcon;
            }
            Icon icon4 = icon3;
            TextAtom textAtom2 = textAtom;
            return benefit.copy(z11, icon, textAtom2, icon2, icon4);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSeparatorHidden() {
            return this.isSeparatorHidden;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Icon getStatusIcon() {
            return this.statusIcon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        /* renamed from: component4, reason: from getter */
        public final Icon getBenefitIcon() {
            return this.benefitIcon;
        }

        /* renamed from: component5, reason: from getter */
        public final Icon getDarkBenefitIcon() {
            return this.darkBenefitIcon;
        }

        @NotNull
        public final Benefit copy(boolean isSeparatorHidden, @NotNull Icon statusIcon, @NotNull TextAtom description, Icon benefitIcon, Icon darkBenefitIcon) {
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            Intrinsics.checkNotNullParameter(description, "description");
            return new Benefit(isSeparatorHidden, statusIcon, description, benefitIcon, darkBenefitIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) other;
            return this.isSeparatorHidden == benefit.isSeparatorHidden && Intrinsics.d(this.statusIcon, benefit.statusIcon) && Intrinsics.d(this.description, benefit.description) && Intrinsics.d(this.benefitIcon, benefit.benefitIcon) && Intrinsics.d(this.darkBenefitIcon, benefit.darkBenefitIcon);
        }

        public final Icon getBenefitIcon() {
            return this.benefitIcon;
        }

        public final Icon getDarkBenefitIcon() {
            return this.darkBenefitIcon;
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        public final Icon getStatusIcon() {
            return this.statusIcon;
        }

        public int hashCode() {
            int b11 = C2619v.b(a.a(this.statusIcon, Boolean.hashCode(this.isSeparatorHidden) * 31, 31), 31, this.description);
            Icon icon = this.benefitIcon;
            int hashCode = (b11 + (icon == null ? 0 : icon.hashCode())) * 31;
            Icon icon2 = this.darkBenefitIcon;
            return hashCode + (icon2 != null ? icon2.hashCode() : 0);
        }

        public final boolean isSeparatorHidden() {
            return this.isSeparatorHidden;
        }

        @NotNull
        public String toString() {
            return "Benefit(isSeparatorHidden=" + this.isSeparatorHidden + ", statusIcon=" + this.statusIcon + ", description=" + this.description + ", benefitIcon=" + this.benefitIcon + ", darkBenefitIcon=" + this.darkBenefitIcon + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageOption;", "", "packageTab", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageTab;", "benefits", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$Benefit;", "smsBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PushSMS;", "selectButtonDefault", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageTab;Ljava/util/List;Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PushSMS;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getPackageTab", "()Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageTab;", "getBenefits", "()Ljava/util/List;", "getSmsBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PushSMS;", "getSelectButtonDefault", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackageOption {
        public static final int $stable = 8;

        @NotNull
        private final List<Benefit> benefits;

        @NotNull
        private final PackageTab packageTab;

        @NotNull
        private final ButtonV3Atom.LargeButton selectButtonDefault;
        private final PushSMS smsBlock;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public PackageOption(@NotNull PackageTab packageTab, @NotNull List<Benefit> benefits, PushSMS pushSMS, @NotNull ButtonV3Atom.LargeButton selectButtonDefault, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(packageTab, "packageTab");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(selectButtonDefault, "selectButtonDefault");
            this.packageTab = packageTab;
            this.benefits = benefits;
            this.smsBlock = pushSMS;
            this.selectButtonDefault = selectButtonDefault;
            this.trackingInfo = map;
        }

        public static /* synthetic */ PackageOption copy$default(PackageOption packageOption, PackageTab packageTab, List list, PushSMS pushSMS, ButtonV3Atom.LargeButton largeButton, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                packageTab = packageOption.packageTab;
            }
            if ((i11 & 2) != 0) {
                list = packageOption.benefits;
            }
            if ((i11 & 4) != 0) {
                pushSMS = packageOption.smsBlock;
            }
            if ((i11 & 8) != 0) {
                largeButton = packageOption.selectButtonDefault;
            }
            if ((i11 & 16) != 0) {
                map = packageOption.trackingInfo;
            }
            Map map2 = map;
            PushSMS pushSMS2 = pushSMS;
            return packageOption.copy(packageTab, list, pushSMS2, largeButton, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final PackageTab getPackageTab() {
            return this.packageTab;
        }

        @NotNull
        public final List<Benefit> component2() {
            return this.benefits;
        }

        /* renamed from: component3, reason: from getter */
        public final PushSMS getSmsBlock() {
            return this.smsBlock;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ButtonV3Atom.LargeButton getSelectButtonDefault() {
            return this.selectButtonDefault;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final PackageOption copy(@NotNull PackageTab packageTab, @NotNull List<Benefit> benefits, PushSMS smsBlock, @NotNull ButtonV3Atom.LargeButton selectButtonDefault, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(packageTab, "packageTab");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            Intrinsics.checkNotNullParameter(selectButtonDefault, "selectButtonDefault");
            return new PackageOption(packageTab, benefits, smsBlock, selectButtonDefault, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageOption)) {
                return false;
            }
            PackageOption packageOption = (PackageOption) other;
            return Intrinsics.d(this.packageTab, packageOption.packageTab) && Intrinsics.d(this.benefits, packageOption.benefits) && Intrinsics.d(this.smsBlock, packageOption.smsBlock) && Intrinsics.d(this.selectButtonDefault, packageOption.selectButtonDefault) && Intrinsics.d(this.trackingInfo, packageOption.trackingInfo);
        }

        @NotNull
        public final List<Benefit> getBenefits() {
            return this.benefits;
        }

        @NotNull
        public final PackageTab getPackageTab() {
            return this.packageTab;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSelectButtonDefault() {
            return this.selectButtonDefault;
        }

        public final PushSMS getSmsBlock() {
            return this.smsBlock;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(this.packageTab.hashCode() * 31, 31, this.benefits);
            PushSMS pushSMS = this.smsBlock;
            int a11 = b.a(this.selectButtonDefault, (b11 + (pushSMS == null ? 0 : pushSMS.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return a11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            PackageTab packageTab = this.packageTab;
            List<Benefit> list = this.benefits;
            PushSMS pushSMS = this.smsBlock;
            ButtonV3Atom.LargeButton largeButton = this.selectButtonDefault;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("PackageOption(packageTab=");
            sb2.append(packageTab);
            sb2.append(", benefits=");
            sb2.append(list);
            sb2.append(", smsBlock=");
            sb2.append(pushSMS);
            sb2.append(", selectButtonDefault=");
            sb2.append(largeButton);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageTab;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "isSelected", "", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "imageForPremiumUser", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;ZLru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "()Z", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getImageForPremiumUser", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PackageTab {
        public static final int $stable = (Badge.$stable | Price.$stable) | TextAtom.$stable;
        private final Badge badge;
        private final String imageForPremiumUser;
        private final boolean isSelected;
        private final Price price;

        @NotNull
        private final TextAtom title;

        public PackageTab(@NotNull TextAtom title, Price price, boolean z11, Badge badge, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.price = price;
            this.isSelected = z11;
            this.badge = badge;
            this.imageForPremiumUser = str;
        }

        public static /* synthetic */ PackageTab copy$default(PackageTab packageTab, TextAtom textAtom, Price price, boolean z11, Badge badge, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = packageTab.title;
            }
            if ((i11 & 2) != 0) {
                price = packageTab.price;
            }
            if ((i11 & 4) != 0) {
                z11 = packageTab.isSelected;
            }
            if ((i11 & 8) != 0) {
                badge = packageTab.badge;
            }
            if ((i11 & 16) != 0) {
                str = packageTab.imageForPremiumUser;
            }
            String str2 = str;
            boolean z12 = z11;
            return packageTab.copy(textAtom, price, z12, badge, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImageForPremiumUser() {
            return this.imageForPremiumUser;
        }

        @NotNull
        public final PackageTab copy(@NotNull TextAtom title, Price price, boolean isSelected, Badge badge, String imageForPremiumUser) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new PackageTab(title, price, isSelected, badge, imageForPremiumUser);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageTab)) {
                return false;
            }
            PackageTab packageTab = (PackageTab) other;
            return Intrinsics.d(this.title, packageTab.title) && Intrinsics.d(this.price, packageTab.price) && this.isSelected == packageTab.isSelected && Intrinsics.d(this.badge, packageTab.badge) && Intrinsics.d(this.imageForPremiumUser, packageTab.imageForPremiumUser);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        public final String getImageForPremiumUser() {
            return this.imageForPremiumUser;
        }

        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Price price = this.price;
            int a11 = C3532b.a((hashCode + (price == null ? 0 : price.hashCode())) * 31, 31, this.isSelected);
            Badge badge = this.badge;
            int hashCode2 = (a11 + (badge == null ? 0 : badge.hashCode())) * 31;
            String str = this.imageForPremiumUser;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            Price price = this.price;
            boolean z11 = this.isSelected;
            Badge badge = this.badge;
            String str = this.imageForPremiumUser;
            StringBuilder sb2 = new StringBuilder("PackageTab(title=");
            sb2.append(textAtom);
            sb2.append(", price=");
            sb2.append(price);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", badge=");
            sb2.append(badge);
            sb2.append(", imageForPremiumUser=");
            return o0.c(sb2, str, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J\u008f\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 ¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PushSMS;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "discountBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "description", "selectButtonSMS", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "isSMSSelected", "", "viewTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "setTrackingInfo", "unsetTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ZLjava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getDiscountBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getDescription", "getSelectButtonSMS", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "()Z", "getViewTrackingInfo", "()Ljava/util/Map;", "getSetTrackingInfo", "getUnsetTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PushSMS {
        public static final int $stable = 8;

        @NotNull
        private final TextAtom description;
        private final Badge discountBadge;
        private final boolean isSMSSelected;

        @NotNull
        private final Price price;

        @NotNull
        private final ButtonV3Atom.LargeButton selectButtonSMS;
        private final Map<String, TokenizedTrackingInfo> setTrackingInfo;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> unsetTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> viewTrackingInfo;

        public PushSMS(@NotNull TextAtom title, Badge badge, @NotNull Price price, @NotNull TextAtom description, @NotNull ButtonV3Atom.LargeButton selectButtonSMS, boolean z11, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(selectButtonSMS, "selectButtonSMS");
            this.title = title;
            this.discountBadge = badge;
            this.price = price;
            this.description = description;
            this.selectButtonSMS = selectButtonSMS;
            this.isSMSSelected = z11;
            this.viewTrackingInfo = map;
            this.setTrackingInfo = map2;
            this.unsetTrackingInfo = map3;
        }

        public static /* synthetic */ PushSMS copy$default(PushSMS pushSMS, TextAtom textAtom, Badge badge, Price price, TextAtom textAtom2, ButtonV3Atom.LargeButton largeButton, boolean z11, Map map, Map map2, Map map3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = pushSMS.title;
            }
            if ((i11 & 2) != 0) {
                badge = pushSMS.discountBadge;
            }
            if ((i11 & 4) != 0) {
                price = pushSMS.price;
            }
            if ((i11 & 8) != 0) {
                textAtom2 = pushSMS.description;
            }
            if ((i11 & 16) != 0) {
                largeButton = pushSMS.selectButtonSMS;
            }
            if ((i11 & 32) != 0) {
                z11 = pushSMS.isSMSSelected;
            }
            if ((i11 & 64) != 0) {
                map = pushSMS.viewTrackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map2 = pushSMS.setTrackingInfo;
            }
            if ((i11 & 256) != 0) {
                map3 = pushSMS.unsetTrackingInfo;
            }
            Map map4 = map2;
            Map map5 = map3;
            boolean z12 = z11;
            Map map6 = map;
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            Price price2 = price;
            return pushSMS.copy(textAtom, badge, price2, textAtom2, largeButton2, z12, map6, map4, map5);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final Badge getDiscountBadge() {
            return this.discountBadge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final TextAtom getDescription() {
            return this.description;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.LargeButton getSelectButtonSMS() {
            return this.selectButtonSMS;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsSMSSelected() {
            return this.isSMSSelected;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.viewTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.setTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.unsetTrackingInfo;
        }

        @NotNull
        public final PushSMS copy(@NotNull TextAtom title, Badge discountBadge, @NotNull Price price, @NotNull TextAtom description, @NotNull ButtonV3Atom.LargeButton selectButtonSMS, boolean isSMSSelected, Map<String, TokenizedTrackingInfo> viewTrackingInfo, Map<String, TokenizedTrackingInfo> setTrackingInfo, Map<String, TokenizedTrackingInfo> unsetTrackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(selectButtonSMS, "selectButtonSMS");
            return new PushSMS(title, discountBadge, price, description, selectButtonSMS, isSMSSelected, viewTrackingInfo, setTrackingInfo, unsetTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushSMS)) {
                return false;
            }
            PushSMS pushSMS = (PushSMS) other;
            return Intrinsics.d(this.title, pushSMS.title) && Intrinsics.d(this.discountBadge, pushSMS.discountBadge) && Intrinsics.d(this.price, pushSMS.price) && Intrinsics.d(this.description, pushSMS.description) && Intrinsics.d(this.selectButtonSMS, pushSMS.selectButtonSMS) && this.isSMSSelected == pushSMS.isSMSSelected && Intrinsics.d(this.viewTrackingInfo, pushSMS.viewTrackingInfo) && Intrinsics.d(this.setTrackingInfo, pushSMS.setTrackingInfo) && Intrinsics.d(this.unsetTrackingInfo, pushSMS.unsetTrackingInfo);
        }

        @NotNull
        public final TextAtom getDescription() {
            return this.description;
        }

        public final Badge getDiscountBadge() {
            return this.discountBadge;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSelectButtonSMS() {
            return this.selectButtonSMS;
        }

        public final Map<String, TokenizedTrackingInfo> getSetTrackingInfo() {
            return this.setTrackingInfo;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getUnsetTrackingInfo() {
            return this.unsetTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getViewTrackingInfo() {
            return this.viewTrackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Badge badge = this.discountBadge;
            int a11 = C3532b.a(b.a(this.selectButtonSMS, C2619v.b(C3051a.a(this.price, (hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31), 31, this.description), 31), 31, this.isSMSSelected);
            Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
            int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.setTrackingInfo;
            int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.unsetTrackingInfo;
            return hashCode3 + (map3 != null ? map3.hashCode() : 0);
        }

        public final boolean isSMSSelected() {
            return this.isSMSSelected;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            Badge badge = this.discountBadge;
            Price price = this.price;
            TextAtom textAtom2 = this.description;
            ButtonV3Atom.LargeButton largeButton = this.selectButtonSMS;
            boolean z11 = this.isSMSSelected;
            Map<String, TokenizedTrackingInfo> map = this.viewTrackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.setTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.unsetTrackingInfo;
            StringBuilder sb2 = new StringBuilder("PushSMS(title=");
            sb2.append(textAtom);
            sb2.append(", discountBadge=");
            sb2.append(badge);
            sb2.append(", price=");
            sb2.append(price);
            sb2.append(", description=");
            sb2.append(textAtom2);
            sb2.append(", selectButtonSMS=");
            sb2.append(largeButton);
            sb2.append(", isSMSSelected=");
            sb2.append(z11);
            sb2.append(", viewTrackingInfo=");
            b.g(sb2, map, ", setTrackingInfo=", map2, ", unsetTrackingInfo=");
            return P.f(sb2, map3, ")");
        }
    }

    public ServicePackSelectionV3DTO(@NotNull TextAtom title, @NotNull TextAtom priceDescription, @NotNull List<PackageOption> options, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(options, "options");
        this.title = title;
        this.priceDescription = priceDescription;
        this.options = options;
        this.declineButton = largeBorderlessButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicePackSelectionV3DTO copy$default(ServicePackSelectionV3DTO servicePackSelectionV3DTO, TextAtom textAtom, TextAtom textAtom2, List list, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = servicePackSelectionV3DTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = servicePackSelectionV3DTO.priceDescription;
        }
        if ((i11 & 4) != 0) {
            list = servicePackSelectionV3DTO.options;
        }
        if ((i11 & 8) != 0) {
            largeBorderlessButton = servicePackSelectionV3DTO.declineButton;
        }
        return servicePackSelectionV3DTO.copy(textAtom, textAtom2, list, largeBorderlessButton);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final List<PackageOption> component3() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.LargeBorderlessButton getDeclineButton() {
        return this.declineButton;
    }

    @NotNull
    public final ServicePackSelectionV3DTO copy(@NotNull TextAtom title, @NotNull TextAtom priceDescription, @NotNull List<PackageOption> options, ButtonV3Atom.LargeBorderlessButton declineButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(priceDescription, "priceDescription");
        Intrinsics.checkNotNullParameter(options, "options");
        return new ServicePackSelectionV3DTO(title, priceDescription, options, declineButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePackSelectionV3DTO)) {
            return false;
        }
        ServicePackSelectionV3DTO servicePackSelectionV3DTO = (ServicePackSelectionV3DTO) other;
        return Intrinsics.d(this.title, servicePackSelectionV3DTO.title) && Intrinsics.d(this.priceDescription, servicePackSelectionV3DTO.priceDescription) && Intrinsics.d(this.options, servicePackSelectionV3DTO.options) && Intrinsics.d(this.declineButton, servicePackSelectionV3DTO.declineButton);
    }

    public final ButtonV3Atom.LargeBorderlessButton getDeclineButton() {
        return this.declineButton;
    }

    @NotNull
    public final List<PackageOption> getOptions() {
        return this.options;
    }

    @NotNull
    public final TextAtom getPriceDescription() {
        return this.priceDescription;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b11 = g.b(C2619v.b(this.title.hashCode() * 31, 31, this.priceDescription), 31, this.options);
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.declineButton;
        return b11 + (largeBorderlessButton == null ? 0 : largeBorderlessButton.hashCode());
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.priceDescription;
        List<PackageOption> list = this.options;
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = this.declineButton;
        StringBuilder a11 = HY.a.a("ServicePackSelectionV3DTO(title=", textAtom, ", priceDescription=", textAtom2, ", options=");
        a11.append(list);
        a11.append(", declineButton=");
        a11.append(largeBorderlessButton);
        a11.append(")");
        return a11.toString();
    }
}
