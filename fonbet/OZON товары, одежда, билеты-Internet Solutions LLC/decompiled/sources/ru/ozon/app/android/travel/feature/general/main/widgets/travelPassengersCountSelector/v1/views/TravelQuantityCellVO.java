package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views;

import B0.C2454a;
import B90.C2616s;
import B90.C2618u;
import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001:\u0001/Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0090\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b.\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "", "", "id", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "currentValue", "minValue", "maxValue", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "minusButton", "plusButton", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO$CellRule;", "tags", "dependsOn", "sumDependsOn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "I", "getCurrentValue", "getMinValue", "getMaxValue", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getMinusButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getPlusButton", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "getDependsOn", "getSumDependsOn", "CellRule", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelQuantityCellVO {
    private final int currentValue;

    @NotNull
    private final List<CellRule> dependsOn;

    @NotNull
    private final String id;
    private final int maxValue;
    private final int minValue;

    @NotNull
    private final IconButtonV3DTO minusButton;

    @NotNull
    private final IconButtonV3DTO plusButton;

    @NotNull
    private final String subtitle;

    @NotNull
    private final List<CellRule> sumDependsOn;

    @NotNull
    private final List<CellRule> tags;

    @NotNull
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO$CellRule;", "", "<init>", "(Ljava/lang/String;I)V", "WITH_PLACES", "WITHOUT_PLACES", "ADULTS", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CellRule {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CellRule[] $VALUES;
        public static final CellRule WITH_PLACES = new CellRule("WITH_PLACES", 0);
        public static final CellRule WITHOUT_PLACES = new CellRule("WITHOUT_PLACES", 1);
        public static final CellRule ADULTS = new CellRule("ADULTS", 2);

        private static final /* synthetic */ CellRule[] $values() {
            return new CellRule[]{WITH_PLACES, WITHOUT_PLACES, ADULTS};
        }

        static {
            CellRule[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CellRule(String str, int i11) {
        }

        public static CellRule valueOf(String str) {
            return (CellRule) Enum.valueOf(CellRule.class, str);
        }

        public static CellRule[] values() {
            return (CellRule[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelQuantityCellVO(@NotNull String id2, @NotNull String title, @NotNull String subtitle, int i11, int i12, int i13, @NotNull IconButtonV3DTO minusButton, @NotNull IconButtonV3DTO plusButton, @NotNull List<? extends CellRule> tags, @NotNull List<? extends CellRule> dependsOn, @NotNull List<? extends CellRule> sumDependsOn) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(minusButton, "minusButton");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(dependsOn, "dependsOn");
        Intrinsics.checkNotNullParameter(sumDependsOn, "sumDependsOn");
        this.id = id2;
        this.title = title;
        this.subtitle = subtitle;
        this.currentValue = i11;
        this.minValue = i12;
        this.maxValue = i13;
        this.minusButton = minusButton;
        this.plusButton = plusButton;
        this.tags = tags;
        this.dependsOn = dependsOn;
        this.sumDependsOn = sumDependsOn;
    }

    public static /* synthetic */ TravelQuantityCellVO copy$default(TravelQuantityCellVO travelQuantityCellVO, String str, String str2, String str3, int i11, int i12, int i13, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, List list, List list2, List list3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = travelQuantityCellVO.id;
        }
        if ((i14 & 2) != 0) {
            str2 = travelQuantityCellVO.title;
        }
        if ((i14 & 4) != 0) {
            str3 = travelQuantityCellVO.subtitle;
        }
        if ((i14 & 8) != 0) {
            i11 = travelQuantityCellVO.currentValue;
        }
        if ((i14 & 16) != 0) {
            i12 = travelQuantityCellVO.minValue;
        }
        if ((i14 & 32) != 0) {
            i13 = travelQuantityCellVO.maxValue;
        }
        if ((i14 & 64) != 0) {
            iconButtonV3DTO = travelQuantityCellVO.minusButton;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO2 = travelQuantityCellVO.plusButton;
        }
        if ((i14 & 256) != 0) {
            list = travelQuantityCellVO.tags;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            list2 = travelQuantityCellVO.dependsOn;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list3 = travelQuantityCellVO.sumDependsOn;
        }
        List list4 = list2;
        List list5 = list3;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO2;
        List list6 = list;
        int i15 = i13;
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO;
        int i16 = i12;
        String str4 = str3;
        return travelQuantityCellVO.copy(str, str2, str4, i11, i16, i15, iconButtonV3DTO4, iconButtonV3DTO3, list6, list4, list5);
    }

    @NotNull
    public final TravelQuantityCellVO copy(@NotNull String id2, @NotNull String title, @NotNull String subtitle, int currentValue, int minValue, int maxValue, @NotNull IconButtonV3DTO minusButton, @NotNull IconButtonV3DTO plusButton, @NotNull List<? extends CellRule> tags, @NotNull List<? extends CellRule> dependsOn, @NotNull List<? extends CellRule> sumDependsOn) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(minusButton, "minusButton");
        Intrinsics.checkNotNullParameter(plusButton, "plusButton");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(dependsOn, "dependsOn");
        Intrinsics.checkNotNullParameter(sumDependsOn, "sumDependsOn");
        return new TravelQuantityCellVO(id2, title, subtitle, currentValue, minValue, maxValue, minusButton, plusButton, tags, dependsOn, sumDependsOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelQuantityCellVO)) {
            return false;
        }
        TravelQuantityCellVO travelQuantityCellVO = (TravelQuantityCellVO) other;
        return Intrinsics.d(this.id, travelQuantityCellVO.id) && Intrinsics.d(this.title, travelQuantityCellVO.title) && Intrinsics.d(this.subtitle, travelQuantityCellVO.subtitle) && this.currentValue == travelQuantityCellVO.currentValue && this.minValue == travelQuantityCellVO.minValue && this.maxValue == travelQuantityCellVO.maxValue && Intrinsics.d(this.minusButton, travelQuantityCellVO.minusButton) && Intrinsics.d(this.plusButton, travelQuantityCellVO.plusButton) && Intrinsics.d(this.tags, travelQuantityCellVO.tags) && Intrinsics.d(this.dependsOn, travelQuantityCellVO.dependsOn) && Intrinsics.d(this.sumDependsOn, travelQuantityCellVO.sumDependsOn);
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    @NotNull
    public final List<CellRule> getDependsOn() {
        return this.dependsOn;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final IconButtonV3DTO getMinusButton() {
        return this.minusButton;
    }

    @NotNull
    public final IconButtonV3DTO getPlusButton() {
        return this.plusButton;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<CellRule> getSumDependsOn() {
        return this.sumDependsOn;
    }

    @NotNull
    public final List<CellRule> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sumDependsOn.hashCode() + g.b(g.b(GR.b.c(this.plusButton, GR.b.c(this.minusButton, C2454a.a(this.maxValue, C2454a.a(this.minValue, C2454a.a(this.currentValue, g.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle), 31), 31), 31), 31), 31), 31, this.tags), 31, this.dependsOn);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        int i11 = this.currentValue;
        int i12 = this.minValue;
        int i13 = this.maxValue;
        IconButtonV3DTO iconButtonV3DTO = this.minusButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.plusButton;
        List<CellRule> list = this.tags;
        List<CellRule> list2 = this.dependsOn;
        List<CellRule> list3 = this.sumDependsOn;
        StringBuilder d11 = C3660k.d("TravelQuantityCellVO(id=", str, ", title=", str2, ", subtitle=");
        Pk0.g.d(i11, str3, ", currentValue=", ", minValue=", d11);
        Ek.a.f(i12, i13, ", maxValue=", ", minusButton=", d11);
        d11.append(iconButtonV3DTO);
        d11.append(", plusButton=");
        d11.append(iconButtonV3DTO2);
        d11.append(", tags=");
        C2616s.g(", dependsOn=", ", sumDependsOn=", d11, list, list2);
        return C2618u.h(d11, list3, ")");
    }
}
