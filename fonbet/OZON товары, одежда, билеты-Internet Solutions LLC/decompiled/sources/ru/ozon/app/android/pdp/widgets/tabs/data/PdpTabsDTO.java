package ru.ozon.app.android.pdp.widgets.tabs.data;

import Bl.b;
import G.g;
import T7.P;
import Tz.C4055a;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002-.BW\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jl\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\fHÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$Tab;", "backgroundColor", "", "selectedTabGroupId", "tabTheme", "Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;", "tabSelectedTheme", "tabBorderRadius", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;Ljava/lang/Integer;Ljava/util/Map;)V", "getTabs", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "getSelectedTabGroupId", "getTabTheme", "()Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;", "getTabSelectedTheme", "getTabBorderRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO;", "equals", "", "other", "hashCode", "toString", "Tab", "TabTheme", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PdpTabsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final String selectedTabGroupId;
    private final Integer tabBorderRadius;

    @NotNull
    private final TabTheme tabSelectedTheme;

    @NotNull
    private final TabTheme tabTheme;

    @NotNull
    private final List<Tab> tabs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$TabTheme;", "", "textColor", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTextColor", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabTheme {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String textColor;

        public TabTheme(@NotNull String textColor, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.textColor = textColor;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ TabTheme copy$default(TabTheme tabTheme, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabTheme.textColor;
            }
            if ((i11 & 2) != 0) {
                str2 = tabTheme.backgroundColor;
            }
            return tabTheme.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TabTheme copy(@NotNull String textColor, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new TabTheme(textColor, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabTheme)) {
                return false;
            }
            TabTheme tabTheme = (TabTheme) other;
            return Intrinsics.d(this.textColor, tabTheme.textColor) && Intrinsics.d(this.backgroundColor, tabTheme.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.textColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("TabTheme(textColor=", this.textColor, ", backgroundColor=", this.backgroundColor, ")");
        }
    }

    public PdpTabsDTO(@NotNull List<Tab> tabs, String str, @NotNull String selectedTabGroupId, @NotNull TabTheme tabTheme, @NotNull TabTheme tabSelectedTheme, Integer num, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabGroupId, "selectedTabGroupId");
        Intrinsics.checkNotNullParameter(tabTheme, "tabTheme");
        Intrinsics.checkNotNullParameter(tabSelectedTheme, "tabSelectedTheme");
        this.tabs = tabs;
        this.backgroundColor = str;
        this.selectedTabGroupId = selectedTabGroupId;
        this.tabTheme = tabTheme;
        this.tabSelectedTheme = tabSelectedTheme;
        this.tabBorderRadius = num;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PdpTabsDTO copy$default(PdpTabsDTO pdpTabsDTO, List list, String str, String str2, TabTheme tabTheme, TabTheme tabTheme2, Integer num, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pdpTabsDTO.tabs;
        }
        if ((i11 & 2) != 0) {
            str = pdpTabsDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            str2 = pdpTabsDTO.selectedTabGroupId;
        }
        if ((i11 & 8) != 0) {
            tabTheme = pdpTabsDTO.tabTheme;
        }
        if ((i11 & 16) != 0) {
            tabTheme2 = pdpTabsDTO.tabSelectedTheme;
        }
        if ((i11 & 32) != 0) {
            num = pdpTabsDTO.tabBorderRadius;
        }
        if ((i11 & 64) != 0) {
            map = pdpTabsDTO.trackingInfo;
        }
        Integer num2 = num;
        Map map2 = map;
        TabTheme tabTheme3 = tabTheme2;
        String str3 = str2;
        return pdpTabsDTO.copy(list, str, str3, tabTheme, tabTheme3, num2, map2);
    }

    @NotNull
    public final List<Tab> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSelectedTabGroupId() {
        return this.selectedTabGroupId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TabTheme getTabTheme() {
        return this.tabTheme;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TabTheme getTabSelectedTheme() {
        return this.tabSelectedTheme;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getTabBorderRadius() {
        return this.tabBorderRadius;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final PdpTabsDTO copy(@NotNull List<Tab> tabs, String backgroundColor, @NotNull String selectedTabGroupId, @NotNull TabTheme tabTheme, @NotNull TabTheme tabSelectedTheme, Integer tabBorderRadius, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedTabGroupId, "selectedTabGroupId");
        Intrinsics.checkNotNullParameter(tabTheme, "tabTheme");
        Intrinsics.checkNotNullParameter(tabSelectedTheme, "tabSelectedTheme");
        return new PdpTabsDTO(tabs, backgroundColor, selectedTabGroupId, tabTheme, tabSelectedTheme, tabBorderRadius, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpTabsDTO)) {
            return false;
        }
        PdpTabsDTO pdpTabsDTO = (PdpTabsDTO) other;
        return Intrinsics.d(this.tabs, pdpTabsDTO.tabs) && Intrinsics.d(this.backgroundColor, pdpTabsDTO.backgroundColor) && Intrinsics.d(this.selectedTabGroupId, pdpTabsDTO.selectedTabGroupId) && Intrinsics.d(this.tabTheme, pdpTabsDTO.tabTheme) && Intrinsics.d(this.tabSelectedTheme, pdpTabsDTO.tabSelectedTheme) && Intrinsics.d(this.tabBorderRadius, pdpTabsDTO.tabBorderRadius) && Intrinsics.d(this.trackingInfo, pdpTabsDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getSelectedTabGroupId() {
        return this.selectedTabGroupId;
    }

    public final Integer getTabBorderRadius() {
        return this.tabBorderRadius;
    }

    @NotNull
    public final TabTheme getTabSelectedTheme() {
        return this.tabSelectedTheme;
    }

    @NotNull
    public final TabTheme getTabTheme() {
        return this.tabTheme;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.tabs.hashCode() * 31;
        String str = this.backgroundColor;
        int hashCode2 = (this.tabSelectedTheme.hashCode() + ((this.tabTheme.hashCode() + g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.selectedTabGroupId)) * 31)) * 31;
        Integer num = this.tabBorderRadius;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Tab> list = this.tabs;
        String str = this.backgroundColor;
        String str2 = this.selectedTabGroupId;
        TabTheme tabTheme = this.tabTheme;
        TabTheme tabTheme2 = this.tabSelectedTheme;
        Integer num = this.tabBorderRadius;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = C4055a.a("PdpTabsDTO(tabs=", ", backgroundColor=", str, ", selectedTabGroupId=", list);
        a11.append(str2);
        a11.append(", tabTheme=");
        a11.append(tabTheme);
        a11.append(", tabSelectedTheme=");
        a11.append(tabTheme2);
        a11.append(", tabBorderRadius=");
        a11.append(num);
        a11.append(", trackingInfo=");
        return P.f(a11, map, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/tabs/data/PdpTabsDTO$Tab;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "tabGroupId", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isInitiallyHidden", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/Map;Z)V", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTabGroupId", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = 8;
        private final boolean isInitiallyHidden;

        @NotNull
        private final TextAtom name;

        @NotNull
        private final String tabGroupId;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Tab(@NotNull TextAtom name, @NotNull String tabGroupId, Map<String, TokenizedTrackingInfo> map, boolean z11) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tabGroupId, "tabGroupId");
            this.name = name;
            this.tabGroupId = tabGroupId;
            this.trackingInfo = map;
            this.isInitiallyHidden = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Tab copy$default(Tab tab, TextAtom textAtom, String str, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = tab.name;
            }
            if ((i11 & 2) != 0) {
                str = tab.tabGroupId;
            }
            if ((i11 & 4) != 0) {
                map = tab.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                z11 = tab.isInitiallyHidden;
            }
            return tab.copy(textAtom, str, map, z11);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTabGroupId() {
            return this.tabGroupId;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsInitiallyHidden() {
            return this.isInitiallyHidden;
        }

        @NotNull
        public final Tab copy(@NotNull TextAtom name, @NotNull String tabGroupId, Map<String, TokenizedTrackingInfo> trackingInfo, boolean isInitiallyHidden) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tabGroupId, "tabGroupId");
            return new Tab(name, tabGroupId, trackingInfo, isInitiallyHidden);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.name, tab.name) && Intrinsics.d(this.tabGroupId, tab.tabGroupId) && Intrinsics.d(this.trackingInfo, tab.trackingInfo) && this.isInitiallyHidden == tab.isInitiallyHidden;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        public final String getTabGroupId() {
            return this.tabGroupId;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.name.hashCode() * 31, 31, this.tabGroupId);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return Boolean.hashCode(this.isInitiallyHidden) + ((a11 + (map == null ? 0 : map.hashCode())) * 31);
        }

        public final boolean isInitiallyHidden() {
            return this.isInitiallyHidden;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.name;
            String str = this.tabGroupId;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            boolean z11 = this.isInitiallyHidden;
            StringBuilder d11 = b.d("Tab(name=", ", tabGroupId=", str, ", trackingInfo=", textAtom);
            d11.append(map);
            d11.append(", isInitiallyHidden=");
            d11.append(z11);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ Tab(TextAtom textAtom, String str, Map map, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, str, map, (i11 & 8) != 0 ? false : z11);
        }
    }
}
