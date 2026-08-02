package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data;

import B0.C2454a;
import G.g;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.travel.molecules.dto.tabsSelector.TabSelectorDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002*+BS\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u000fHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;", "", "cells", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;", "maxSumValue", "", "alerts", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO;", "travelClassSelector", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;", "applyButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "additionalClassInfo", "", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;ILjava/util/List;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;)V", "getCells", "()Ljava/util/List;", "getMaxSumValue", "()I", "getAlerts", "getTravelClassSelector", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAdditionalClassInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "AlertDTO", "TravelClassSelectorDTO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPassengersCountSelectorDTO {
    public static final int $stable = 8;
    private final Map<String, TextDTO> additionalClassInfo;

    @NotNull
    private final List<AlertDTO> alerts;

    @NotNull
    private final ButtonV3Atom.LargeButton applyButton;

    @NotNull
    private final List<TravelQuantityCellDTO> cells;
    private final int maxSumValue;
    private final TravelClassSelectorDTO travelClassSelector;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO;", "", "brokenRule", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO$BrokenRule;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/model/Restriction;", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO$BrokenRule;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "getBrokenRule", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO$BrokenRule;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BrokenRule", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AlertDTO {
        public static final int $stable = Restriction.$stable;

        @NotNull
        private final BrokenRule brokenRule;

        @NotNull
        private final Restriction restriction;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO$BrokenRule;", "", "<init>", "(Ljava/lang/String;I)V", "BROKEN_RULE_INVALID", "BROKEN_RULE_DEPENDS_ON", "BROKEN_RULE_SUM_DEPENDS_ON", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BrokenRule {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ BrokenRule[] $VALUES;

            @i(name = "BROKEN_RULE_INVALID")
            public static final BrokenRule BROKEN_RULE_INVALID = new BrokenRule("BROKEN_RULE_INVALID", 0);

            @i(name = "BROKEN_RULE_DEPENDS_ON")
            public static final BrokenRule BROKEN_RULE_DEPENDS_ON = new BrokenRule("BROKEN_RULE_DEPENDS_ON", 1);

            @i(name = "BROKEN_RULE_SUM_DEPENDS_ON")
            public static final BrokenRule BROKEN_RULE_SUM_DEPENDS_ON = new BrokenRule("BROKEN_RULE_SUM_DEPENDS_ON", 2);

            private static final /* synthetic */ BrokenRule[] $values() {
                return new BrokenRule[]{BROKEN_RULE_INVALID, BROKEN_RULE_DEPENDS_ON, BROKEN_RULE_SUM_DEPENDS_ON};
            }

            static {
                BrokenRule[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private BrokenRule(String str, int i11) {
            }

            public static BrokenRule valueOf(String str) {
                return (BrokenRule) Enum.valueOf(BrokenRule.class, str);
            }

            public static BrokenRule[] values() {
                return (BrokenRule[]) $VALUES.clone();
            }
        }

        public AlertDTO(@NotNull BrokenRule brokenRule, @NotNull Restriction restriction) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.brokenRule = brokenRule;
            this.restriction = restriction;
        }

        public static /* synthetic */ AlertDTO copy$default(AlertDTO alertDTO, BrokenRule brokenRule, Restriction restriction, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                brokenRule = alertDTO.brokenRule;
            }
            if ((i11 & 2) != 0) {
                restriction = alertDTO.restriction;
            }
            return alertDTO.copy(brokenRule, restriction);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BrokenRule getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Restriction getRestriction() {
            return this.restriction;
        }

        @NotNull
        public final AlertDTO copy(@NotNull BrokenRule brokenRule, @NotNull Restriction restriction) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            return new AlertDTO(brokenRule, restriction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertDTO)) {
                return false;
            }
            AlertDTO alertDTO = (AlertDTO) other;
            return this.brokenRule == alertDTO.brokenRule && Intrinsics.d(this.restriction, alertDTO.restriction);
        }

        @NotNull
        public final BrokenRule getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        public int hashCode() {
            return this.restriction.hashCode() + (this.brokenRule.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AlertDTO(brokenRule=" + this.brokenRule + ", restriction=" + this.restriction + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;", "", "tabSelector", "Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;)V", "getTabSelector", "()Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TravelClassSelectorDTO {
        public static final int $stable = 8;

        @NotNull
        private final TabSelectorDTO tabSelector;

        public TravelClassSelectorDTO(@NotNull TabSelectorDTO tabSelector) {
            Intrinsics.checkNotNullParameter(tabSelector, "tabSelector");
            this.tabSelector = tabSelector;
        }

        public static /* synthetic */ TravelClassSelectorDTO copy$default(TravelClassSelectorDTO travelClassSelectorDTO, TabSelectorDTO tabSelectorDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tabSelectorDTO = travelClassSelectorDTO.tabSelector;
            }
            return travelClassSelectorDTO.copy(tabSelectorDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TabSelectorDTO getTabSelector() {
            return this.tabSelector;
        }

        @NotNull
        public final TravelClassSelectorDTO copy(@NotNull TabSelectorDTO tabSelector) {
            Intrinsics.checkNotNullParameter(tabSelector, "tabSelector");
            return new TravelClassSelectorDTO(tabSelector);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TravelClassSelectorDTO) && Intrinsics.d(this.tabSelector, ((TravelClassSelectorDTO) other).tabSelector);
        }

        @NotNull
        public final TabSelectorDTO getTabSelector() {
            return this.tabSelector;
        }

        public int hashCode() {
            return this.tabSelector.hashCode();
        }

        @NotNull
        public String toString() {
            return "TravelClassSelectorDTO(tabSelector=" + this.tabSelector + ")";
        }
    }

    public TravelPassengersCountSelectorDTO(@NotNull List<TravelQuantityCellDTO> cells, int i11, @NotNull List<AlertDTO> alerts, TravelClassSelectorDTO travelClassSelectorDTO, @NotNull ButtonV3Atom.LargeButton applyButton, Map<String, TextDTO> map) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        this.cells = cells;
        this.maxSumValue = i11;
        this.alerts = alerts;
        this.travelClassSelector = travelClassSelectorDTO;
        this.applyButton = applyButton;
        this.additionalClassInfo = map;
    }

    public static /* synthetic */ TravelPassengersCountSelectorDTO copy$default(TravelPassengersCountSelectorDTO travelPassengersCountSelectorDTO, List list, int i11, List list2, TravelClassSelectorDTO travelClassSelectorDTO, ButtonV3Atom.LargeButton largeButton, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = travelPassengersCountSelectorDTO.cells;
        }
        if ((i12 & 2) != 0) {
            i11 = travelPassengersCountSelectorDTO.maxSumValue;
        }
        if ((i12 & 4) != 0) {
            list2 = travelPassengersCountSelectorDTO.alerts;
        }
        if ((i12 & 8) != 0) {
            travelClassSelectorDTO = travelPassengersCountSelectorDTO.travelClassSelector;
        }
        if ((i12 & 16) != 0) {
            largeButton = travelPassengersCountSelectorDTO.applyButton;
        }
        if ((i12 & 32) != 0) {
            map = travelPassengersCountSelectorDTO.additionalClassInfo;
        }
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        Map map2 = map;
        return travelPassengersCountSelectorDTO.copy(list, i11, list2, travelClassSelectorDTO, largeButton2, map2);
    }

    @NotNull
    public final List<TravelQuantityCellDTO> component1() {
        return this.cells;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxSumValue() {
        return this.maxSumValue;
    }

    @NotNull
    public final List<AlertDTO> component3() {
        return this.alerts;
    }

    /* renamed from: component4, reason: from getter */
    public final TravelClassSelectorDTO getTravelClassSelector() {
        return this.travelClassSelector;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    public final Map<String, TextDTO> component6() {
        return this.additionalClassInfo;
    }

    @NotNull
    public final TravelPassengersCountSelectorDTO copy(@NotNull List<TravelQuantityCellDTO> cells, int maxSumValue, @NotNull List<AlertDTO> alerts, TravelClassSelectorDTO travelClassSelector, @NotNull ButtonV3Atom.LargeButton applyButton, Map<String, TextDTO> additionalClassInfo) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        return new TravelPassengersCountSelectorDTO(cells, maxSumValue, alerts, travelClassSelector, applyButton, additionalClassInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPassengersCountSelectorDTO)) {
            return false;
        }
        TravelPassengersCountSelectorDTO travelPassengersCountSelectorDTO = (TravelPassengersCountSelectorDTO) other;
        return Intrinsics.d(this.cells, travelPassengersCountSelectorDTO.cells) && this.maxSumValue == travelPassengersCountSelectorDTO.maxSumValue && Intrinsics.d(this.alerts, travelPassengersCountSelectorDTO.alerts) && Intrinsics.d(this.travelClassSelector, travelPassengersCountSelectorDTO.travelClassSelector) && Intrinsics.d(this.applyButton, travelPassengersCountSelectorDTO.applyButton) && Intrinsics.d(this.additionalClassInfo, travelPassengersCountSelectorDTO.additionalClassInfo);
    }

    public final Map<String, TextDTO> getAdditionalClassInfo() {
        return this.additionalClassInfo;
    }

    @NotNull
    public final List<AlertDTO> getAlerts() {
        return this.alerts;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final List<TravelQuantityCellDTO> getCells() {
        return this.cells;
    }

    public final int getMaxSumValue() {
        return this.maxSumValue;
    }

    public final TravelClassSelectorDTO getTravelClassSelector() {
        return this.travelClassSelector;
    }

    public int hashCode() {
        int b11 = g.b(C2454a.a(this.maxSumValue, this.cells.hashCode() * 31, 31), 31, this.alerts);
        TravelClassSelectorDTO travelClassSelectorDTO = this.travelClassSelector;
        int a11 = Tl.b.a(this.applyButton, (b11 + (travelClassSelectorDTO == null ? 0 : travelClassSelectorDTO.hashCode())) * 31, 31);
        Map<String, TextDTO> map = this.additionalClassInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TravelPassengersCountSelectorDTO(cells=" + this.cells + ", maxSumValue=" + this.maxSumValue + ", alerts=" + this.alerts + ", travelClassSelector=" + this.travelClassSelector + ", applyButton=" + this.applyButton + ", additionalClassInfo=" + this.additionalClassInfo + ")";
    }
}
