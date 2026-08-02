package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import B0.C2454a;
import G.g;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellVO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002:;Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u008a\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010\u001b¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "quantityCells", "", "maxSumValue", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO;", "alerts", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "travelClassSelector", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "applyButton", "", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "additionalClassInfo", "sampleText", "pageUrl", "<init>", "(JLjava/util/List;ILjava/util/List;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)V", "copy", "(JLjava/util/List;ILjava/util/List;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/Map;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getQuantityCells", "()Ljava/util/List;", "I", "getMaxSumValue", "getAlerts", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "getTravelClassSelector", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Ljava/util/Map;", "getAdditionalClassInfo", "()Ljava/util/Map;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSampleText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getPageUrl", "AlertVO", "TravelClassSelectorVO", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelPassengersCountSelectorVO implements c {
    private final Map<String, TextDTO> additionalClassInfo;

    @NotNull
    private final List<AlertVO> alerts;

    @NotNull
    private final ButtonV3Atom.LargeButton applyButton;
    private final long id;
    private final int maxSumValue;
    private final String pageUrl;

    @NotNull
    private final List<TravelQuantityCellVO> quantityCells;
    private final TextDTO sampleText;
    private final TravelClassSelectorVO travelClassSelector;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO$RestrictionCase;", "restrictionCase", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO$RestrictionCase;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO$RestrictionCase;", "getRestrictionCase", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO$RestrictionCase;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "RestrictionCase", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlertVO {
        public static final int $stable = Restriction.$stable;

        @NotNull
        private final Restriction restriction;

        @NotNull
        private final RestrictionCase restrictionCase;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO$RestrictionCase;", "", "<init>", "(Ljava/lang/String;I)V", "DEPENDING_RELATION_SATISFIED", "SUM_DEPENDING_RELATION_SATISFIED", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RestrictionCase {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ RestrictionCase[] $VALUES;
            public static final RestrictionCase DEPENDING_RELATION_SATISFIED = new RestrictionCase("DEPENDING_RELATION_SATISFIED", 0);
            public static final RestrictionCase SUM_DEPENDING_RELATION_SATISFIED = new RestrictionCase("SUM_DEPENDING_RELATION_SATISFIED", 1);

            private static final /* synthetic */ RestrictionCase[] $values() {
                return new RestrictionCase[]{DEPENDING_RELATION_SATISFIED, SUM_DEPENDING_RELATION_SATISFIED};
            }

            static {
                RestrictionCase[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private RestrictionCase(String str, int i11) {
            }

            public static RestrictionCase valueOf(String str) {
                return (RestrictionCase) Enum.valueOf(RestrictionCase.class, str);
            }

            public static RestrictionCase[] values() {
                return (RestrictionCase[]) $VALUES.clone();
            }
        }

        public AlertVO(@NotNull RestrictionCase restrictionCase, @NotNull Restriction restriction) {
            Intrinsics.checkNotNullParameter(restrictionCase, "restrictionCase");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.restrictionCase = restrictionCase;
            this.restriction = restriction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertVO)) {
                return false;
            }
            AlertVO alertVO = (AlertVO) other;
            return this.restrictionCase == alertVO.restrictionCase && Intrinsics.d(this.restriction, alertVO.restriction);
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        @NotNull
        public final RestrictionCase getRestrictionCase() {
            return this.restrictionCase;
        }

        public int hashCode() {
            return this.restriction.hashCode() + (this.restrictionCase.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AlertVO(restrictionCase=" + this.restrictionCase + ", restriction=" + this.restriction + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "chips", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChips", "()Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TravelClassSelectorVO {

        @NotNull
        private final List<ChipDTO> chips;

        public TravelClassSelectorVO(@NotNull List<ChipDTO> chips) {
            Intrinsics.checkNotNullParameter(chips, "chips");
            this.chips = chips;
        }

        @NotNull
        public final TravelClassSelectorVO copy(@NotNull List<ChipDTO> chips) {
            Intrinsics.checkNotNullParameter(chips, "chips");
            return new TravelClassSelectorVO(chips);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TravelClassSelectorVO) && Intrinsics.d(this.chips, ((TravelClassSelectorVO) other).chips);
        }

        @NotNull
        public final List<ChipDTO> getChips() {
            return this.chips;
        }

        public int hashCode() {
            return this.chips.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("TravelClassSelectorVO(chips=", ")", this.chips);
        }
    }

    public TravelPassengersCountSelectorVO(long j11, @NotNull List<TravelQuantityCellVO> quantityCells, int i11, @NotNull List<AlertVO> alerts, TravelClassSelectorVO travelClassSelectorVO, @NotNull ButtonV3Atom.LargeButton applyButton, Map<String, TextDTO> map, TextDTO textDTO, String str) {
        Intrinsics.checkNotNullParameter(quantityCells, "quantityCells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        this.id = j11;
        this.quantityCells = quantityCells;
        this.maxSumValue = i11;
        this.alerts = alerts;
        this.travelClassSelector = travelClassSelectorVO;
        this.applyButton = applyButton;
        this.additionalClassInfo = map;
        this.sampleText = textDTO;
        this.pageUrl = str;
    }

    public static /* synthetic */ TravelPassengersCountSelectorVO copy$default(TravelPassengersCountSelectorVO travelPassengersCountSelectorVO, long j11, List list, int i11, List list2, TravelClassSelectorVO travelClassSelectorVO, ButtonV3Atom.LargeButton largeButton, Map map, TextDTO textDTO, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = travelPassengersCountSelectorVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = travelPassengersCountSelectorVO.quantityCells;
        }
        List list3 = list;
        if ((i12 & 4) != 0) {
            i11 = travelPassengersCountSelectorVO.maxSumValue;
        }
        return travelPassengersCountSelectorVO.copy(j12, list3, i11, (i12 & 8) != 0 ? travelPassengersCountSelectorVO.alerts : list2, (i12 & 16) != 0 ? travelPassengersCountSelectorVO.travelClassSelector : travelClassSelectorVO, (i12 & 32) != 0 ? travelPassengersCountSelectorVO.applyButton : largeButton, (i12 & 64) != 0 ? travelPassengersCountSelectorVO.additionalClassInfo : map, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? travelPassengersCountSelectorVO.sampleText : textDTO, (i12 & 256) != 0 ? travelPassengersCountSelectorVO.pageUrl : str);
    }

    @NotNull
    public final TravelPassengersCountSelectorVO copy(long id2, @NotNull List<TravelQuantityCellVO> quantityCells, int maxSumValue, @NotNull List<AlertVO> alerts, TravelClassSelectorVO travelClassSelector, @NotNull ButtonV3Atom.LargeButton applyButton, Map<String, TextDTO> additionalClassInfo, TextDTO sampleText, String pageUrl) {
        Intrinsics.checkNotNullParameter(quantityCells, "quantityCells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        return new TravelPassengersCountSelectorVO(id2, quantityCells, maxSumValue, alerts, travelClassSelector, applyButton, additionalClassInfo, sampleText, pageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelPassengersCountSelectorVO)) {
            return false;
        }
        TravelPassengersCountSelectorVO travelPassengersCountSelectorVO = (TravelPassengersCountSelectorVO) other;
        return this.id == travelPassengersCountSelectorVO.id && Intrinsics.d(this.quantityCells, travelPassengersCountSelectorVO.quantityCells) && this.maxSumValue == travelPassengersCountSelectorVO.maxSumValue && Intrinsics.d(this.alerts, travelPassengersCountSelectorVO.alerts) && Intrinsics.d(this.travelClassSelector, travelPassengersCountSelectorVO.travelClassSelector) && Intrinsics.d(this.applyButton, travelPassengersCountSelectorVO.applyButton) && Intrinsics.d(this.additionalClassInfo, travelPassengersCountSelectorVO.additionalClassInfo) && Intrinsics.d(this.sampleText, travelPassengersCountSelectorVO.sampleText) && Intrinsics.d(this.pageUrl, travelPassengersCountSelectorVO.pageUrl);
    }

    public final Map<String, TextDTO> getAdditionalClassInfo() {
        return this.additionalClassInfo;
    }

    @NotNull
    public final List<AlertVO> getAlerts() {
        return this.alerts;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxSumValue() {
        return this.maxSumValue;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    @NotNull
    public final List<TravelQuantityCellVO> getQuantityCells() {
        return this.quantityCells;
    }

    public final TextDTO getSampleText() {
        return this.sampleText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TravelClassSelectorVO getTravelClassSelector() {
        return this.travelClassSelector;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(C2454a.a(this.maxSumValue, g.b(Long.hashCode(this.id) * 31, 31, this.quantityCells), 31), 31, this.alerts);
        TravelClassSelectorVO travelClassSelectorVO = this.travelClassSelector;
        int a11 = Tl.b.a(this.applyButton, (b11 + (travelClassSelectorVO == null ? 0 : travelClassSelectorVO.hashCode())) * 31, 31);
        Map<String, TextDTO> map = this.additionalClassInfo;
        int hashCode = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        TextDTO textDTO = this.sampleText;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.pageUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TravelQuantityCellVO> list = this.quantityCells;
        int i11 = this.maxSumValue;
        List<AlertVO> list2 = this.alerts;
        TravelClassSelectorVO travelClassSelectorVO = this.travelClassSelector;
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        Map<String, TextDTO> map = this.additionalClassInfo;
        TextDTO textDTO = this.sampleText;
        String str = this.pageUrl;
        StringBuilder b11 = Lh.b.b(j11, "TravelPassengersCountSelectorVO(id=", ", quantityCells=", list);
        b11.append(", maxSumValue=");
        b11.append(i11);
        b11.append(", alerts=");
        b11.append(list2);
        b11.append(", travelClassSelector=");
        b11.append(travelClassSelectorVO);
        b11.append(", applyButton=");
        b11.append(largeButton);
        b11.append(", additionalClassInfo=");
        b11.append(map);
        b11.append(", sampleText=");
        b11.append(textDTO);
        return C6594f.a(", pageUrl=", str, ")", b11);
    }
}
