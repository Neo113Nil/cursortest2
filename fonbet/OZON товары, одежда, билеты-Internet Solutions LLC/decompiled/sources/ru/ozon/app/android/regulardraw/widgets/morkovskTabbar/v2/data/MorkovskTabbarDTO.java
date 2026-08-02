package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.data;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Tab;", "behavior", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Behavior;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Behavior;)V", "getTabs", "()Ljava/util/List;", "getBehavior", "()Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Behavior;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tab", "IndicatorStyle", "Behavior", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskTabbarDTO {
    public static final int $stable = 8;
    private final Behavior behavior;

    @NotNull
    private final List<Tab> tabs;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Behavior;", "", "<init>", "(Ljava/lang/String;I)V", "BEHAVIOR_SCROLLABLE", "BEHAVIOR_STICKY_FIXED", "BEHAVIOR_STICKY_COLLAPSIBLE", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Behavior {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Behavior[] $VALUES;
        public static final Behavior BEHAVIOR_SCROLLABLE = new Behavior("BEHAVIOR_SCROLLABLE", 0);
        public static final Behavior BEHAVIOR_STICKY_FIXED = new Behavior("BEHAVIOR_STICKY_FIXED", 1);
        public static final Behavior BEHAVIOR_STICKY_COLLAPSIBLE = new Behavior("BEHAVIOR_STICKY_COLLAPSIBLE", 2);

        private static final /* synthetic */ Behavior[] $values() {
            return new Behavior[]{BEHAVIOR_SCROLLABLE, BEHAVIOR_STICKY_FIXED, BEHAVIOR_STICKY_COLLAPSIBLE};
        }

        static {
            Behavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Behavior(String str, int i11) {
        }

        public static Behavior valueOf(String str) {
            return (Behavior) Enum.valueOf(Behavior.class, str);
        }

        public static Behavior[] values() {
            return (Behavior[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$IndicatorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "INDICATOR_STYLE_INVALID", "INDICATOR_STYLE_PIN", "INDICATOR_STYLE_BADGE", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndicatorStyle {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IndicatorStyle[] $VALUES;
        public static final IndicatorStyle INDICATOR_STYLE_INVALID = new IndicatorStyle("INDICATOR_STYLE_INVALID", 0);
        public static final IndicatorStyle INDICATOR_STYLE_PIN = new IndicatorStyle("INDICATOR_STYLE_PIN", 1);
        public static final IndicatorStyle INDICATOR_STYLE_BADGE = new IndicatorStyle("INDICATOR_STYLE_BADGE", 2);

        private static final /* synthetic */ IndicatorStyle[] $values() {
            return new IndicatorStyle[]{INDICATOR_STYLE_INVALID, INDICATOR_STYLE_PIN, INDICATOR_STYLE_BADGE};
        }

        static {
            IndicatorStyle[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private IndicatorStyle(String str, int i11) {
        }

        public static IndicatorStyle valueOf(String str) {
            return (IndicatorStyle) Enum.valueOf(IndicatorStyle.class, str);
        }

        public static IndicatorStyle[] values() {
            return (IndicatorStyle[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00060"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Tab;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "imagePath", "isBigItem", "", "indicator", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "indicatorStyle", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$IndicatorStyle;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$IndicatorStyle;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getTitle", "()Ljava/lang/String;", "getImagePath", "()Z", "getIndicator", "()Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "getIndicatorStyle", "()Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$IndicatorStyle;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String imagePath;
        private final IndicatorAtomDTO indicator;
        private final IndicatorStyle indicatorStyle;
        private final boolean isBigItem;
        private final TestInfo testInfo;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Tab(@NotNull String title, @NotNull String imagePath, boolean z11, IndicatorAtomDTO indicatorAtomDTO, IndicatorStyle indicatorStyle, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.imagePath = imagePath;
            this.isBigItem = z11;
            this.indicator = indicatorAtomDTO;
            this.indicatorStyle = indicatorStyle;
            this.action = action;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, String str, String str2, boolean z11, IndicatorAtomDTO indicatorAtomDTO, IndicatorStyle indicatorStyle, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tab.title;
            }
            if ((i11 & 2) != 0) {
                str2 = tab.imagePath;
            }
            if ((i11 & 4) != 0) {
                z11 = tab.isBigItem;
            }
            if ((i11 & 8) != 0) {
                indicatorAtomDTO = tab.indicator;
            }
            if ((i11 & 16) != 0) {
                indicatorStyle = tab.indicatorStyle;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = tab.action;
            }
            if ((i11 & 64) != 0) {
                map = tab.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                testInfo = tab.testInfo;
            }
            Map map2 = map;
            TestInfo testInfo2 = testInfo;
            IndicatorStyle indicatorStyle2 = indicatorStyle;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return tab.copy(str, str2, z11, indicatorAtomDTO, indicatorStyle2, atomActionDTO2, map2, testInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBigItem() {
            return this.isBigItem;
        }

        /* renamed from: component4, reason: from getter */
        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        /* renamed from: component5, reason: from getter */
        public final IndicatorStyle getIndicatorStyle() {
            return this.indicatorStyle;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        /* renamed from: component8, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final Tab copy(@NotNull String title, @NotNull String imagePath, boolean isBigItem, IndicatorAtomDTO indicator, IndicatorStyle indicatorStyle, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(action, "action");
            return new Tab(title, imagePath, isBigItem, indicator, indicatorStyle, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.title, tab.title) && Intrinsics.d(this.imagePath, tab.imagePath) && this.isBigItem == tab.isBigItem && Intrinsics.d(this.indicator, tab.indicator) && this.indicatorStyle == tab.indicatorStyle && Intrinsics.d(this.action, tab.action) && Intrinsics.d(this.trackingInfo, tab.trackingInfo) && Intrinsics.d(this.testInfo, tab.testInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getImagePath() {
            return this.imagePath;
        }

        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        public final IndicatorStyle getIndicatorStyle() {
            return this.indicatorStyle;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.title.hashCode() * 31, 31, this.imagePath), 31, this.isBigItem);
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            int hashCode = (a11 + (indicatorAtomDTO == null ? 0 : indicatorAtomDTO.hashCode())) * 31;
            IndicatorStyle indicatorStyle = this.indicatorStyle;
            int b11 = Ih.a.b(this.action, (hashCode + (indicatorStyle == null ? 0 : indicatorStyle.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode2 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        public final boolean isBigItem() {
            return this.isBigItem;
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.imagePath;
            boolean z11 = this.isBigItem;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            IndicatorStyle indicatorStyle = this.indicatorStyle;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("Tab(title=", str, ", imagePath=", str2, ", isBigItem=");
            d11.append(z11);
            d11.append(", indicator=");
            d11.append(indicatorAtomDTO);
            d11.append(", indicatorStyle=");
            d11.append(indicatorStyle);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            return Ns.b.b(", testInfo=", ")", d11, map, testInfo);
        }
    }

    public MorkovskTabbarDTO(@NotNull List<Tab> tabs, Behavior behavior) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.behavior = behavior;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MorkovskTabbarDTO copy$default(MorkovskTabbarDTO morkovskTabbarDTO, List list, Behavior behavior, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = morkovskTabbarDTO.tabs;
        }
        if ((i11 & 2) != 0) {
            behavior = morkovskTabbarDTO.behavior;
        }
        return morkovskTabbarDTO.copy(list, behavior);
    }

    @NotNull
    public final List<Tab> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final Behavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final MorkovskTabbarDTO copy(@NotNull List<Tab> tabs, Behavior behavior) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new MorkovskTabbarDTO(tabs, behavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskTabbarDTO)) {
            return false;
        }
        MorkovskTabbarDTO morkovskTabbarDTO = (MorkovskTabbarDTO) other;
        return Intrinsics.d(this.tabs, morkovskTabbarDTO.tabs) && this.behavior == morkovskTabbarDTO.behavior;
    }

    public final Behavior getBehavior() {
        return this.behavior;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        int hashCode = this.tabs.hashCode() * 31;
        Behavior behavior = this.behavior;
        return hashCode + (behavior == null ? 0 : behavior.hashCode());
    }

    @NotNull
    public String toString() {
        return "MorkovskTabbarDTO(tabs=" + this.tabs + ", behavior=" + this.behavior + ")";
    }
}
