package ru.ozon.app.android.commonwidgets.widgets.tabs.data;

import G.g;
import Nh.a;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J6\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0005\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO$TabsItemDTO;", "isScrollable", "", "scrollableMinWidth", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getTabs", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollableMinWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO;", "equals", "other", "hashCode", "toString", "", "TabsItemDTO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabsDTO {
    private final Boolean isScrollable;
    private final Integer scrollableMinWidth;

    @NotNull
    private final List<TabsItemDTO> tabs;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J`\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO$TabsItemDTO;", "", "isSelected", "", "badge", "", "badgeColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBadge", "()Ljava/lang/String;", "getBadgeColor", "getTitle", "getDeeplink", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/commonwidgets/widgets/tabs/data/TabsDTO$TabsItemDTO;", "equals", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabsItemDTO {
        private final String badge;
        private final String badgeColor;
        private final String deeplink;
        private final Boolean isSelected;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TabsItemDTO(Boolean bool, String str, String str2, @NotNull String title, String str3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.isSelected = bool;
            this.badge = str;
            this.badgeColor = str2;
            this.title = title;
            this.deeplink = str3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TabsItemDTO copy$default(TabsItemDTO tabsItemDTO, Boolean bool, String str, String str2, String str3, String str4, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = tabsItemDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = tabsItemDTO.badge;
            }
            if ((i11 & 4) != 0) {
                str2 = tabsItemDTO.badgeColor;
            }
            if ((i11 & 8) != 0) {
                str3 = tabsItemDTO.title;
            }
            if ((i11 & 16) != 0) {
                str4 = tabsItemDTO.deeplink;
            }
            if ((i11 & 32) != 0) {
                map = tabsItemDTO.trackingInfo;
            }
            String str5 = str4;
            Map map2 = map;
            return tabsItemDTO.copy(bool, str, str2, str3, str5, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBadge() {
            return this.badge;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBadgeColor() {
            return this.badgeColor;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final TabsItemDTO copy(Boolean isSelected, String badge, String badgeColor, @NotNull String title, String deeplink, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new TabsItemDTO(isSelected, badge, badgeColor, title, deeplink, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabsItemDTO)) {
                return false;
            }
            TabsItemDTO tabsItemDTO = (TabsItemDTO) other;
            return Intrinsics.d(this.isSelected, tabsItemDTO.isSelected) && Intrinsics.d(this.badge, tabsItemDTO.badge) && Intrinsics.d(this.badgeColor, tabsItemDTO.badgeColor) && Intrinsics.d(this.title, tabsItemDTO.title) && Intrinsics.d(this.deeplink, tabsItemDTO.deeplink) && Intrinsics.d(this.trackingInfo, tabsItemDTO.trackingInfo);
        }

        public final String getBadge() {
            return this.badge;
        }

        public final String getBadgeColor() {
            return this.badgeColor;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Boolean bool = this.isSelected;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.badge;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.badgeColor;
            int a11 = g.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
            String str3 = this.deeplink;
            int hashCode3 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Boolean bool = this.isSelected;
            String str = this.badge;
            String str2 = this.badgeColor;
            String str3 = this.title;
            String str4 = this.deeplink;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder e11 = D3.g.e("TabsItemDTO(isSelected=", bool, ", badge=", str, ", badgeColor=");
            a.h(e11, str2, ", title=", str3, ", deeplink=");
            return C4070a.a(e11, str4, ", trackingInfo=", map, ")");
        }
    }

    public TabsDTO(@NotNull List<TabsItemDTO> tabs, Boolean bool, Integer num) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.isScrollable = bool;
        this.scrollableMinWidth = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabsDTO copy$default(TabsDTO tabsDTO, List list, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tabsDTO.tabs;
        }
        if ((i11 & 2) != 0) {
            bool = tabsDTO.isScrollable;
        }
        if ((i11 & 4) != 0) {
            num = tabsDTO.scrollableMinWidth;
        }
        return tabsDTO.copy(list, bool, num);
    }

    @NotNull
    public final List<TabsItemDTO> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsScrollable() {
        return this.isScrollable;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getScrollableMinWidth() {
        return this.scrollableMinWidth;
    }

    @NotNull
    public final TabsDTO copy(@NotNull List<TabsItemDTO> tabs, Boolean isScrollable, Integer scrollableMinWidth) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new TabsDTO(tabs, isScrollable, scrollableMinWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsDTO)) {
            return false;
        }
        TabsDTO tabsDTO = (TabsDTO) other;
        return Intrinsics.d(this.tabs, tabsDTO.tabs) && Intrinsics.d(this.isScrollable, tabsDTO.isScrollable) && Intrinsics.d(this.scrollableMinWidth, tabsDTO.scrollableMinWidth);
    }

    public final Integer getScrollableMinWidth() {
        return this.scrollableMinWidth;
    }

    @NotNull
    public final List<TabsItemDTO> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        int hashCode = this.tabs.hashCode() * 31;
        Boolean bool = this.isScrollable;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.scrollableMinWidth;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final Boolean isScrollable() {
        return this.isScrollable;
    }

    @NotNull
    public String toString() {
        List<TabsItemDTO> list = this.tabs;
        Boolean bool = this.isScrollable;
        Integer num = this.scrollableMinWidth;
        StringBuilder sb2 = new StringBuilder("TabsDTO(tabs=");
        sb2.append(list);
        sb2.append(", isScrollable=");
        sb2.append(bool);
        sb2.append(", scrollableMinWidth=");
        return Ep.a.c(sb2, num, ")");
    }
}
