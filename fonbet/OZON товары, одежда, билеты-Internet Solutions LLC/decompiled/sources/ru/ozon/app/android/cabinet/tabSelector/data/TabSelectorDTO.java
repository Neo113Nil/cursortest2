package ru.ozon.app.android.cabinet.tabSelector.data;

import C.o0;
import G.g;
import H3.c;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO$TabSelectorItemDTO;", "<init>", "(Ljava/util/List;)V", "getTabs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TabSelectorItemDTO", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TabSelectorDTO {

    @NotNull
    private final List<TabSelectorItemDTO> tabs;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cabinet/tabSelector/data/TabSelectorDTO$TabSelectorItemDTO;", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "deeplink", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getTitle", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabSelectorItemDTO {

        @NotNull
        private final String deeplink;
        private final boolean isSelected;

        @NotNull
        private final String title;

        public TabSelectorItemDTO(boolean z11, @NotNull String title, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.isSelected = z11;
            this.title = title;
            this.deeplink = deeplink;
        }

        public static /* synthetic */ TabSelectorItemDTO copy$default(TabSelectorItemDTO tabSelectorItemDTO, boolean z11, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = tabSelectorItemDTO.isSelected;
            }
            if ((i11 & 2) != 0) {
                str = tabSelectorItemDTO.title;
            }
            if ((i11 & 4) != 0) {
                str2 = tabSelectorItemDTO.deeplink;
            }
            return tabSelectorItemDTO.copy(z11, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final TabSelectorItemDTO copy(boolean isSelected, @NotNull String title, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new TabSelectorItemDTO(isSelected, title, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabSelectorItemDTO)) {
                return false;
            }
            TabSelectorItemDTO tabSelectorItemDTO = (TabSelectorItemDTO) other;
            return this.isSelected == tabSelectorItemDTO.isSelected && Intrinsics.d(this.title, tabSelectorItemDTO.title) && Intrinsics.d(this.deeplink, tabSelectorItemDTO.deeplink);
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deeplink.hashCode() + g.a(Boolean.hashCode(this.isSelected) * 31, 31, this.title);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isSelected;
            String str = this.title;
            return o0.c(G.d("TabSelectorItemDTO(isSelected=", ", title=", str, ", deeplink=", z11), this.deeplink, ")");
        }
    }

    public TabSelectorDTO(@NotNull List<TabSelectorItemDTO> tabs) {
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
    public final List<TabSelectorItemDTO> component1() {
        return this.tabs;
    }

    @NotNull
    public final TabSelectorDTO copy(@NotNull List<TabSelectorItemDTO> tabs) {
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
    public final List<TabSelectorItemDTO> getTabs() {
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
