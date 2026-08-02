package ru.ozon.app.android.travel.molecules.dto.tabsSelector;

import G.g;
import H3.c;
import Kk.C3532b;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO$TabDTO;", "<init>", "(Ljava/util/List;)V", "getTabs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TabDTO", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TabSelectorDTO {

    @NotNull
    private final List<TabDTO> tabs;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO$TabDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabDTO {
        private final AtomActionDTO action;
        private final Badge badge;

        @NotNull
        private final String id;
        private final boolean isSelected;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TabDTO(@NotNull String id2, @NotNull String title, boolean z11, AtomActionDTO atomActionDTO, Badge badge, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = id2;
            this.title = title;
            this.isSelected = z11;
            this.action = atomActionDTO;
            this.badge = badge;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TabDTO copy$default(TabDTO tabDTO, String str, String str2, boolean z11, AtomActionDTO atomActionDTO, Badge badge, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tabDTO.id;
            }
            if ((i11 & 2) != 0) {
                str2 = tabDTO.title;
            }
            if ((i11 & 4) != 0) {
                z11 = tabDTO.isSelected;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = tabDTO.action;
            }
            if ((i11 & 16) != 0) {
                badge = tabDTO.badge;
            }
            if ((i11 & 32) != 0) {
                map = tabDTO.trackingInfo;
            }
            Badge badge2 = badge;
            Map map2 = map;
            return tabDTO.copy(str, str2, z11, atomActionDTO, badge2, map2);
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

        /* renamed from: component3, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final TabDTO copy(@NotNull String id2, @NotNull String title, boolean isSelected, AtomActionDTO action, Badge badge, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            return new TabDTO(id2, title, isSelected, action, badge, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabDTO)) {
                return false;
            }
            TabDTO tabDTO = (TabDTO) other;
            return Intrinsics.d(this.id, tabDTO.id) && Intrinsics.d(this.title, tabDTO.title) && this.isSelected == tabDTO.isSelected && Intrinsics.d(this.action, tabDTO.action) && Intrinsics.d(this.badge, tabDTO.badge) && Intrinsics.d(this.trackingInfo, tabDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.id.hashCode() * 31, 31, this.title), 31, this.isSelected);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Badge badge = this.badge;
            int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.title;
            boolean z11 = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            Badge badge = this.badge;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("TabDTO(id=", str, ", title=", str2, ", isSelected=");
            d11.append(z11);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", badge=");
            d11.append(badge);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }
    }

    public TabSelectorDTO(@NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabSelectorDTO copy$default(TabSelectorDTO tabSelectorDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tabSelectorDTO.tabs;
        }
        return tabSelectorDTO.copy(list);
    }

    @NotNull
    public final List<TabDTO> component1() {
        return this.tabs;
    }

    @NotNull
    public final TabSelectorDTO copy(@NotNull List<TabDTO> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new TabSelectorDTO(tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TabSelectorDTO) && Intrinsics.d(this.tabs, ((TabSelectorDTO) other).tabs);
    }

    @NotNull
    public final List<TabDTO> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        return this.tabs.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TabSelectorDTO(tabs=", ")", this.tabs);
    }
}
