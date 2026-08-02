package ru.ozon.app.android.travel.molecules.dto.travelFiltersButton;

import Ns.b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "label", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "countBadge", "Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO$CountBadge;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO$CountBadge;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getLabel", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCountBadge", "()Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO$CountBadge;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "CountBadge", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelFiltersButtonDTO {
    private final AtomActionDTO action;
    private final CountBadge countBadge;

    @NotNull
    private final Icon icon;
    private final TextAtom label;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO$CountBadge;", "", "textAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)V", "getTextAtom", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountBadge {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final TextAtom textAtom;

        public CountBadge(@NotNull TextAtom textAtom, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(textAtom, "textAtom");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.textAtom = textAtom;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ CountBadge copy$default(CountBadge countBadge, TextAtom textAtom, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = countBadge.textAtom;
            }
            if ((i11 & 2) != 0) {
                str = countBadge.backgroundColor;
            }
            return countBadge.copy(textAtom, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTextAtom() {
            return this.textAtom;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CountBadge copy(@NotNull TextAtom textAtom, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(textAtom, "textAtom");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new CountBadge(textAtom, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountBadge)) {
                return false;
            }
            CountBadge countBadge = (CountBadge) other;
            return Intrinsics.d(this.textAtom, countBadge.textAtom) && Intrinsics.d(this.backgroundColor, countBadge.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TextAtom getTextAtom() {
            return this.textAtom;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.textAtom.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CountBadge(textAtom=" + this.textAtom + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    public TravelFiltersButtonDTO(@NotNull Icon icon, TextAtom textAtom, CountBadge countBadge, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.icon = icon;
        this.label = textAtom;
        this.countBadge = countBadge;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ TravelFiltersButtonDTO copy$default(TravelFiltersButtonDTO travelFiltersButtonDTO, Icon icon, TextAtom textAtom, CountBadge countBadge, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            icon = travelFiltersButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textAtom = travelFiltersButtonDTO.label;
        }
        if ((i11 & 4) != 0) {
            countBadge = travelFiltersButtonDTO.countBadge;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = travelFiltersButtonDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = travelFiltersButtonDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            testInfo = travelFiltersButtonDTO.testInfo;
        }
        Map map2 = map;
        TestInfo testInfo2 = testInfo;
        return travelFiltersButtonDTO.copy(icon, textAtom, countBadge, atomActionDTO, map2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final CountBadge getCountBadge() {
        return this.countBadge;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final TravelFiltersButtonDTO copy(@NotNull Icon icon, TextAtom label, CountBadge countBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new TravelFiltersButtonDTO(icon, label, countBadge, action, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelFiltersButtonDTO)) {
            return false;
        }
        TravelFiltersButtonDTO travelFiltersButtonDTO = (TravelFiltersButtonDTO) other;
        return Intrinsics.d(this.icon, travelFiltersButtonDTO.icon) && Intrinsics.d(this.label, travelFiltersButtonDTO.label) && Intrinsics.d(this.countBadge, travelFiltersButtonDTO.countBadge) && Intrinsics.d(this.action, travelFiltersButtonDTO.action) && Intrinsics.d(this.trackingInfo, travelFiltersButtonDTO.trackingInfo) && Intrinsics.d(this.testInfo, travelFiltersButtonDTO.testInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final CountBadge getCountBadge() {
        return this.countBadge;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    public final TextAtom getLabel() {
        return this.label;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        TextAtom textAtom = this.label;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        CountBadge countBadge = this.countBadge;
        int hashCode3 = (hashCode2 + (countBadge == null ? 0 : countBadge.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode5 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Icon icon = this.icon;
        TextAtom textAtom = this.label;
        CountBadge countBadge = this.countBadge;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("TravelFiltersButtonDTO(icon=");
        sb2.append(icon);
        sb2.append(", label=");
        sb2.append(textAtom);
        sb2.append(", countBadge=");
        sb2.append(countBadge);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return b.b(", testInfo=", ")", sb2, map, testInfo);
    }
}
