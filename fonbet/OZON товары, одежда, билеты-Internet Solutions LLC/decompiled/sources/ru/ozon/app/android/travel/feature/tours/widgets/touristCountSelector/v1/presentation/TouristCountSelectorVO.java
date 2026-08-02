package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import B0.C2454a;
import Cm.e;
import G.g;
import Kk.C3532b;
import Pk0.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO;
import ru.ozon.app.android.travel.molecules.view.quantityCell.QuantityCellVO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000289Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u008c\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b/\u0010(R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b0\u0010(R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b\u0015\u00105R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b7\u0010\u001c¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "cells", "", "maxSumValue", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AlertVO;", "alerts", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "applyButton", "", "ageCategories", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "ageSelectors", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "childrenAgeAnnotation", "", "isChildrenAgeAnnotationVisible", "ageSelectorPlaceholder", "<init>", "(JLjava/util/List;ILjava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;ZLjava/lang/String;)V", "copy", "(JLjava/util/List;ILjava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;ZLjava/lang/String;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "I", "getMaxSumValue", "getAlerts", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getApplyButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getAgeCategories", "getAgeSelectors", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getChildrenAgeAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Z", "()Z", "Ljava/lang/String;", "getAgeSelectorPlaceholder", "AlertVO", "AgeSelectorVO", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorVO implements c {

    @NotNull
    private final List<String> ageCategories;

    @NotNull
    private final String ageSelectorPlaceholder;

    @NotNull
    private final List<AgeSelectorVO> ageSelectors;

    @NotNull
    private final List<AlertVO> alerts;

    @NotNull
    private final ButtonV3Atom.LargeButton applyButton;

    @NotNull
    private final List<QuantityCellVO> cells;

    @NotNull
    private final DisclaimerAtom childrenAgeAnnotation;
    private final long id;
    private final boolean isChildrenAgeAnnotationVisible;
    private final int maxSumValue;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "", "", "index", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "error", "", "isErrorVisible", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/lang/String;", "getValue", "getError", "Z", "()Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgeSelectorVO {
        private final String error;
        private final int index;
        private final boolean isErrorVisible;
        private final String value;

        public AgeSelectorVO(int i11, String str, String str2, boolean z11) {
            this.index = i11;
            this.value = str;
            this.error = str2;
            this.isErrorVisible = z11;
        }

        public static /* synthetic */ AgeSelectorVO copy$default(AgeSelectorVO ageSelectorVO, int i11, String str, String str2, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = ageSelectorVO.index;
            }
            if ((i12 & 2) != 0) {
                str = ageSelectorVO.value;
            }
            if ((i12 & 4) != 0) {
                str2 = ageSelectorVO.error;
            }
            if ((i12 & 8) != 0) {
                z11 = ageSelectorVO.isErrorVisible;
            }
            return ageSelectorVO.copy(i11, str, str2, z11);
        }

        @NotNull
        public final AgeSelectorVO copy(int index, String value, String error, boolean isErrorVisible) {
            return new AgeSelectorVO(index, value, error, isErrorVisible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AgeSelectorVO)) {
                return false;
            }
            AgeSelectorVO ageSelectorVO = (AgeSelectorVO) other;
            return this.index == ageSelectorVO.index && Intrinsics.d(this.value, ageSelectorVO.value) && Intrinsics.d(this.error, ageSelectorVO.error) && this.isErrorVisible == ageSelectorVO.isErrorVisible;
        }

        public final String getError() {
            return this.error;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.index) * 31;
            String str = this.value;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.error;
            return Boolean.hashCode(this.isErrorVisible) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        /* renamed from: isErrorVisible, reason: from getter */
        public final boolean getIsErrorVisible() {
            return this.isErrorVisible;
        }

        @NotNull
        public String toString() {
            int i11 = this.index;
            String str = this.value;
            String str2 = this.error;
            boolean z11 = this.isErrorVisible;
            StringBuilder g10 = e.g(i11, "AgeSelectorVO(index=", ", value=", str, ", error=");
            g10.append(str2);
            g10.append(", isErrorVisible=");
            g10.append(z11);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AlertVO;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;", "brokenRule", "Lru/ozon/uni/android/flashbar/model/Restriction;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "", "showAlertNow", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;Lru/ozon/uni/android/flashbar/model/Restriction;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;", "getBrokenRule", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO$BrokenRuleDTO;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getRestriction", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "Z", "getShowAlertNow", "()Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AlertVO {
        public static final int $stable = Restriction.$stable;

        @NotNull
        private final TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO brokenRule;

        @NotNull
        private final Restriction restriction;
        private final boolean showAlertNow;

        public AlertVO(@NotNull TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO brokenRule, @NotNull Restriction restriction, boolean z11) {
            Intrinsics.checkNotNullParameter(brokenRule, "brokenRule");
            Intrinsics.checkNotNullParameter(restriction, "restriction");
            this.brokenRule = brokenRule;
            this.restriction = restriction;
            this.showAlertNow = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AlertVO)) {
                return false;
            }
            AlertVO alertVO = (AlertVO) other;
            return this.brokenRule == alertVO.brokenRule && Intrinsics.d(this.restriction, alertVO.restriction) && this.showAlertNow == alertVO.showAlertNow;
        }

        @NotNull
        public final TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO getBrokenRule() {
            return this.brokenRule;
        }

        @NotNull
        public final Restriction getRestriction() {
            return this.restriction;
        }

        public final boolean getShowAlertNow() {
            return this.showAlertNow;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showAlertNow) + ((this.restriction.hashCode() + (this.brokenRule.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            TouristCountSelectorDTO.AlertDTO.BrokenRuleDTO brokenRuleDTO = this.brokenRule;
            Restriction restriction = this.restriction;
            boolean z11 = this.showAlertNow;
            StringBuilder sb2 = new StringBuilder("AlertVO(brokenRule=");
            sb2.append(brokenRuleDTO);
            sb2.append(", restriction=");
            sb2.append(restriction);
            sb2.append(", showAlertNow=");
            return a.a(")", sb2, z11);
        }
    }

    public TouristCountSelectorVO(long j11, @NotNull List<QuantityCellVO> cells, int i11, @NotNull List<AlertVO> alerts, @NotNull ButtonV3Atom.LargeButton applyButton, @NotNull List<String> ageCategories, @NotNull List<AgeSelectorVO> ageSelectors, @NotNull DisclaimerAtom childrenAgeAnnotation, boolean z11, @NotNull String ageSelectorPlaceholder) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        Intrinsics.checkNotNullParameter(ageSelectors, "ageSelectors");
        Intrinsics.checkNotNullParameter(childrenAgeAnnotation, "childrenAgeAnnotation");
        Intrinsics.checkNotNullParameter(ageSelectorPlaceholder, "ageSelectorPlaceholder");
        this.id = j11;
        this.cells = cells;
        this.maxSumValue = i11;
        this.alerts = alerts;
        this.applyButton = applyButton;
        this.ageCategories = ageCategories;
        this.ageSelectors = ageSelectors;
        this.childrenAgeAnnotation = childrenAgeAnnotation;
        this.isChildrenAgeAnnotationVisible = z11;
        this.ageSelectorPlaceholder = ageSelectorPlaceholder;
    }

    public static /* synthetic */ TouristCountSelectorVO copy$default(TouristCountSelectorVO touristCountSelectorVO, long j11, List list, int i11, List list2, ButtonV3Atom.LargeButton largeButton, List list3, List list4, DisclaimerAtom disclaimerAtom, boolean z11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = touristCountSelectorVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            list = touristCountSelectorVO.cells;
        }
        return touristCountSelectorVO.copy(j12, list, (i12 & 4) != 0 ? touristCountSelectorVO.maxSumValue : i11, (i12 & 8) != 0 ? touristCountSelectorVO.alerts : list2, (i12 & 16) != 0 ? touristCountSelectorVO.applyButton : largeButton, (i12 & 32) != 0 ? touristCountSelectorVO.ageCategories : list3, (i12 & 64) != 0 ? touristCountSelectorVO.ageSelectors : list4, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? touristCountSelectorVO.childrenAgeAnnotation : disclaimerAtom, (i12 & 256) != 0 ? touristCountSelectorVO.isChildrenAgeAnnotationVisible : z11, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? touristCountSelectorVO.ageSelectorPlaceholder : str);
    }

    @NotNull
    public final TouristCountSelectorVO copy(long id2, @NotNull List<QuantityCellVO> cells, int maxSumValue, @NotNull List<AlertVO> alerts, @NotNull ButtonV3Atom.LargeButton applyButton, @NotNull List<String> ageCategories, @NotNull List<AgeSelectorVO> ageSelectors, @NotNull DisclaimerAtom childrenAgeAnnotation, boolean isChildrenAgeAnnotationVisible, @NotNull String ageSelectorPlaceholder) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        Intrinsics.checkNotNullParameter(applyButton, "applyButton");
        Intrinsics.checkNotNullParameter(ageCategories, "ageCategories");
        Intrinsics.checkNotNullParameter(ageSelectors, "ageSelectors");
        Intrinsics.checkNotNullParameter(childrenAgeAnnotation, "childrenAgeAnnotation");
        Intrinsics.checkNotNullParameter(ageSelectorPlaceholder, "ageSelectorPlaceholder");
        return new TouristCountSelectorVO(id2, cells, maxSumValue, alerts, applyButton, ageCategories, ageSelectors, childrenAgeAnnotation, isChildrenAgeAnnotationVisible, ageSelectorPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorVO)) {
            return false;
        }
        TouristCountSelectorVO touristCountSelectorVO = (TouristCountSelectorVO) other;
        return this.id == touristCountSelectorVO.id && Intrinsics.d(this.cells, touristCountSelectorVO.cells) && this.maxSumValue == touristCountSelectorVO.maxSumValue && Intrinsics.d(this.alerts, touristCountSelectorVO.alerts) && Intrinsics.d(this.applyButton, touristCountSelectorVO.applyButton) && Intrinsics.d(this.ageCategories, touristCountSelectorVO.ageCategories) && Intrinsics.d(this.ageSelectors, touristCountSelectorVO.ageSelectors) && Intrinsics.d(this.childrenAgeAnnotation, touristCountSelectorVO.childrenAgeAnnotation) && this.isChildrenAgeAnnotationVisible == touristCountSelectorVO.isChildrenAgeAnnotationVisible && Intrinsics.d(this.ageSelectorPlaceholder, touristCountSelectorVO.ageSelectorPlaceholder);
    }

    @NotNull
    public final List<String> getAgeCategories() {
        return this.ageCategories;
    }

    @NotNull
    public final String getAgeSelectorPlaceholder() {
        return this.ageSelectorPlaceholder;
    }

    @NotNull
    public final List<AgeSelectorVO> getAgeSelectors() {
        return this.ageSelectors;
    }

    @NotNull
    public final List<AlertVO> getAlerts() {
        return this.alerts;
    }

    @NotNull
    public final ButtonV3Atom.LargeButton getApplyButton() {
        return this.applyButton;
    }

    @NotNull
    public final List<QuantityCellVO> getCells() {
        return this.cells;
    }

    @NotNull
    public final DisclaimerAtom getChildrenAgeAnnotation() {
        return this.childrenAgeAnnotation;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMaxSumValue() {
        return this.maxSumValue;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.ageSelectorPlaceholder.hashCode() + C3532b.a((this.childrenAgeAnnotation.hashCode() + g.b(g.b(b.a(this.applyButton, g.b(C2454a.a(this.maxSumValue, g.b(Long.hashCode(this.id) * 31, 31, this.cells), 31), 31, this.alerts), 31), 31, this.ageCategories), 31, this.ageSelectors)) * 31, 31, this.isChildrenAgeAnnotationVisible);
    }

    /* renamed from: isChildrenAgeAnnotationVisible, reason: from getter */
    public final boolean getIsChildrenAgeAnnotationVisible() {
        return this.isChildrenAgeAnnotationVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<QuantityCellVO> list = this.cells;
        int i11 = this.maxSumValue;
        List<AlertVO> list2 = this.alerts;
        ButtonV3Atom.LargeButton largeButton = this.applyButton;
        List<String> list3 = this.ageCategories;
        List<AgeSelectorVO> list4 = this.ageSelectors;
        DisclaimerAtom disclaimerAtom = this.childrenAgeAnnotation;
        boolean z11 = this.isChildrenAgeAnnotationVisible;
        String str = this.ageSelectorPlaceholder;
        StringBuilder b11 = Lh.b.b(j11, "TouristCountSelectorVO(id=", ", cells=", list);
        b11.append(", maxSumValue=");
        b11.append(i11);
        b11.append(", alerts=");
        b11.append(list2);
        b11.append(", applyButton=");
        b11.append(largeButton);
        b11.append(", ageCategories=");
        b11.append(list3);
        b11.append(", ageSelectors=");
        b11.append(list4);
        b11.append(", childrenAgeAnnotation=");
        b11.append(disclaimerAtom);
        b11.append(", isChildrenAgeAnnotationVisible=");
        b11.append(z11);
        b11.append(", ageSelectorPlaceholder=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
