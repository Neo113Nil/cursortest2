package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data;

import B0.C2454a;
import B90.C2616s;
import B90.C2618u;
import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003Ju\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "currentValue", "", "minValue", "maxValue", "tags", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO$RuleTag;", "dependsOn", "sumDependsOn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getCurrentValue", "()I", "getMinValue", "getMaxValue", "getTags", "()Ljava/util/List;", "getDependsOn", "getSumDependsOn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "RuleTag", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelQuantityCellDTO {
    public static final int $stable = 8;
    private final int currentValue;

    @NotNull
    private final List<RuleTag> dependsOn;

    @NotNull
    private final String id;
    private final int maxValue;
    private final int minValue;

    @NotNull
    private final String subtitle;

    @NotNull
    private final List<RuleTag> sumDependsOn;

    @NotNull
    private final List<RuleTag> tags;

    @NotNull
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO$RuleTag;", "", "<init>", "(Ljava/lang/String;I)V", "RULE_TAG_INVALID", "RULE_TAG_WITH_PLACES", "RULE_TAG_WITHOUT_PLACES", "RULE_TAG_ADULTS", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RuleTag {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RuleTag[] $VALUES;

        @i(name = "RULE_TAG_INVALID")
        public static final RuleTag RULE_TAG_INVALID = new RuleTag("RULE_TAG_INVALID", 0);

        @i(name = "RULE_TAG_WITH_PLACES")
        public static final RuleTag RULE_TAG_WITH_PLACES = new RuleTag("RULE_TAG_WITH_PLACES", 1);

        @i(name = "RULE_TAG_WITHOUT_PLACES")
        public static final RuleTag RULE_TAG_WITHOUT_PLACES = new RuleTag("RULE_TAG_WITHOUT_PLACES", 2);

        @i(name = "RULE_TAG_ADULTS")
        public static final RuleTag RULE_TAG_ADULTS = new RuleTag("RULE_TAG_ADULTS", 3);

        private static final /* synthetic */ RuleTag[] $values() {
            return new RuleTag[]{RULE_TAG_INVALID, RULE_TAG_WITH_PLACES, RULE_TAG_WITHOUT_PLACES, RULE_TAG_ADULTS};
        }

        static {
            RuleTag[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RuleTag(String str, int i11) {
        }

        public static RuleTag valueOf(String str) {
            return (RuleTag) Enum.valueOf(RuleTag.class, str);
        }

        public static RuleTag[] values() {
            return (RuleTag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelQuantityCellDTO(@NotNull String id2, @NotNull String title, @NotNull String subtitle, int i11, int i12, int i13, @NotNull List<? extends RuleTag> tags, @NotNull List<? extends RuleTag> dependsOn, @NotNull List<? extends RuleTag> sumDependsOn) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(dependsOn, "dependsOn");
        Intrinsics.checkNotNullParameter(sumDependsOn, "sumDependsOn");
        this.id = id2;
        this.title = title;
        this.subtitle = subtitle;
        this.currentValue = i11;
        this.minValue = i12;
        this.maxValue = i13;
        this.tags = tags;
        this.dependsOn = dependsOn;
        this.sumDependsOn = sumDependsOn;
    }

    public static /* synthetic */ TravelQuantityCellDTO copy$default(TravelQuantityCellDTO travelQuantityCellDTO, String str, String str2, String str3, int i11, int i12, int i13, List list, List list2, List list3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = travelQuantityCellDTO.id;
        }
        if ((i14 & 2) != 0) {
            str2 = travelQuantityCellDTO.title;
        }
        if ((i14 & 4) != 0) {
            str3 = travelQuantityCellDTO.subtitle;
        }
        if ((i14 & 8) != 0) {
            i11 = travelQuantityCellDTO.currentValue;
        }
        if ((i14 & 16) != 0) {
            i12 = travelQuantityCellDTO.minValue;
        }
        if ((i14 & 32) != 0) {
            i13 = travelQuantityCellDTO.maxValue;
        }
        if ((i14 & 64) != 0) {
            list = travelQuantityCellDTO.tags;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list2 = travelQuantityCellDTO.dependsOn;
        }
        if ((i14 & 256) != 0) {
            list3 = travelQuantityCellDTO.sumDependsOn;
        }
        List list4 = list2;
        List list5 = list3;
        int i15 = i13;
        List list6 = list;
        int i16 = i12;
        String str4 = str3;
        return travelQuantityCellDTO.copy(str, str2, str4, i11, i16, i15, list6, list4, list5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrentValue() {
        return this.currentValue;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    @NotNull
    public final List<RuleTag> component7() {
        return this.tags;
    }

    @NotNull
    public final List<RuleTag> component8() {
        return this.dependsOn;
    }

    @NotNull
    public final List<RuleTag> component9() {
        return this.sumDependsOn;
    }

    @NotNull
    public final TravelQuantityCellDTO copy(@NotNull String id2, @NotNull String title, @NotNull String subtitle, int currentValue, int minValue, int maxValue, @NotNull List<? extends RuleTag> tags, @NotNull List<? extends RuleTag> dependsOn, @NotNull List<? extends RuleTag> sumDependsOn) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(dependsOn, "dependsOn");
        Intrinsics.checkNotNullParameter(sumDependsOn, "sumDependsOn");
        return new TravelQuantityCellDTO(id2, title, subtitle, currentValue, minValue, maxValue, tags, dependsOn, sumDependsOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelQuantityCellDTO)) {
            return false;
        }
        TravelQuantityCellDTO travelQuantityCellDTO = (TravelQuantityCellDTO) other;
        return Intrinsics.d(this.id, travelQuantityCellDTO.id) && Intrinsics.d(this.title, travelQuantityCellDTO.title) && Intrinsics.d(this.subtitle, travelQuantityCellDTO.subtitle) && this.currentValue == travelQuantityCellDTO.currentValue && this.minValue == travelQuantityCellDTO.minValue && this.maxValue == travelQuantityCellDTO.maxValue && Intrinsics.d(this.tags, travelQuantityCellDTO.tags) && Intrinsics.d(this.dependsOn, travelQuantityCellDTO.dependsOn) && Intrinsics.d(this.sumDependsOn, travelQuantityCellDTO.sumDependsOn);
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    @NotNull
    public final List<RuleTag> getDependsOn() {
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<RuleTag> getSumDependsOn() {
        return this.sumDependsOn;
    }

    @NotNull
    public final List<RuleTag> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sumDependsOn.hashCode() + g.b(g.b(C2454a.a(this.maxValue, C2454a.a(this.minValue, C2454a.a(this.currentValue, g.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.subtitle), 31), 31), 31), 31, this.tags), 31, this.dependsOn);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        int i11 = this.currentValue;
        int i12 = this.minValue;
        int i13 = this.maxValue;
        List<RuleTag> list = this.tags;
        List<RuleTag> list2 = this.dependsOn;
        List<RuleTag> list3 = this.sumDependsOn;
        StringBuilder d11 = C3660k.d("TravelQuantityCellDTO(id=", str, ", title=", str2, ", subtitle=");
        Pk0.g.d(i11, str3, ", currentValue=", ", minValue=", d11);
        Ek.a.f(i12, i13, ", maxValue=", ", tags=", d11);
        C2616s.g(", dependsOn=", ", sumDependsOn=", d11, list, list2);
        return C2618u.h(d11, list3, ")");
    }

    public TravelQuantityCellDTO(String str, String str2, String str3, int i11, int i12, int i13, List list, List list2, List list3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i11, i12, i13, list, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? K.f71697a : list2, (i14 & 256) != 0 ? K.f71697a : list3);
    }
}
