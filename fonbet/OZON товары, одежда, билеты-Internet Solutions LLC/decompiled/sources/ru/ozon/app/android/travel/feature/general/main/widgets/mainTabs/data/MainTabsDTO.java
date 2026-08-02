package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.data;

import C.o0;
import Ef0.c;
import G.g;
import Ns.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001-B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\rHÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO$Tab;", "tabsSpace", "", "tabsHorizontalPadding", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "getTabs", "()Ljava/util/List;", "getTabsSpace", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTabsHorizontalPadding", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO;", "equals", "", "other", "hashCode", "toString", "Tab", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MainTabsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final TextDTO subtitle;

    @NotNull
    private final List<Tab> tabs;
    private final Integer tabsHorizontalPadding;
    private final Integer tabsSpace;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsDTO$Tab;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "subtitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "topImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTopImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO subtitle;
        private final ImageDTO topImage;

        public Tab(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO subtitle, ImageDTO imageDTO) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.iconButton = iconButton;
            this.subtitle = subtitle;
            this.topImage = imageDTO;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, ImageDTO imageDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = tab.iconButton;
            }
            if ((i11 & 2) != 0) {
                textDTO = tab.subtitle;
            }
            if ((i11 & 4) != 0) {
                imageDTO = tab.topImage;
            }
            return tab.copy(iconButtonV3DTO, textDTO, imageDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final ImageDTO getTopImage() {
            return this.topImage;
        }

        @NotNull
        public final Tab copy(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO subtitle, ImageDTO topImage) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new Tab(iconButton, subtitle, topImage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.iconButton, tab.iconButton) && Intrinsics.d(this.subtitle, tab.subtitle) && Intrinsics.d(this.topImage, tab.topImage);
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final ImageDTO getTopImage() {
            return this.topImage;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, this.iconButton.hashCode() * 31, 31);
            ImageDTO imageDTO = this.topImage;
            return a11 + (imageDTO == null ? 0 : imageDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "Tab(iconButton=" + this.iconButton + ", subtitle=" + this.subtitle + ", topImage=" + this.topImage + ")";
        }
    }

    public MainTabsDTO(@NotNull TextDTO title, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map, @NotNull List<Tab> tabs, Integer num, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.title = title;
        this.subtitle = textDTO;
        this.trackingInfo = map;
        this.tabs = tabs;
        this.tabsSpace = num;
        this.tabsHorizontalPadding = num2;
        this.backgroundColor = str;
    }

    public static /* synthetic */ MainTabsDTO copy$default(MainTabsDTO mainTabsDTO, TextDTO textDTO, TextDTO textDTO2, Map map, List list, Integer num, Integer num2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = mainTabsDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = mainTabsDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            map = mainTabsDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            list = mainTabsDTO.tabs;
        }
        if ((i11 & 16) != 0) {
            num = mainTabsDTO.tabsSpace;
        }
        if ((i11 & 32) != 0) {
            num2 = mainTabsDTO.tabsHorizontalPadding;
        }
        if ((i11 & 64) != 0) {
            str = mainTabsDTO.backgroundColor;
        }
        Integer num3 = num2;
        String str2 = str;
        Integer num4 = num;
        Map map2 = map;
        return mainTabsDTO.copy(textDTO, textDTO2, map2, list, num4, num3, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<Tab> component4() {
        return this.tabs;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTabsSpace() {
        return this.tabsSpace;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getTabsHorizontalPadding() {
        return this.tabsHorizontalPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final MainTabsDTO copy(@NotNull TextDTO title, TextDTO subtitle, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<Tab> tabs, Integer tabsSpace, Integer tabsHorizontalPadding, String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new MainTabsDTO(title, subtitle, trackingInfo, tabs, tabsSpace, tabsHorizontalPadding, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainTabsDTO)) {
            return false;
        }
        MainTabsDTO mainTabsDTO = (MainTabsDTO) other;
        return Intrinsics.d(this.title, mainTabsDTO.title) && Intrinsics.d(this.subtitle, mainTabsDTO.subtitle) && Intrinsics.d(this.trackingInfo, mainTabsDTO.trackingInfo) && Intrinsics.d(this.tabs, mainTabsDTO.tabs) && Intrinsics.d(this.tabsSpace, mainTabsDTO.tabsSpace) && Intrinsics.d(this.tabsHorizontalPadding, mainTabsDTO.tabsHorizontalPadding) && Intrinsics.d(this.backgroundColor, mainTabsDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final Integer getTabsHorizontalPadding() {
        return this.tabsHorizontalPadding;
    }

    public final Integer getTabsSpace() {
        return this.tabsSpace;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int b11 = g.b((hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31, this.tabs);
        Integer num = this.tabsSpace;
        int hashCode3 = (b11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.tabsHorizontalPadding;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<Tab> list = this.tabs;
        Integer num = this.tabsSpace;
        Integer num2 = this.tabsHorizontalPadding;
        String str = this.backgroundColor;
        StringBuilder g10 = D3.g.g("MainTabsDTO(title=", textDTO, ", subtitle=", textDTO2, ", trackingInfo=");
        g10.append(map);
        g10.append(", tabs=");
        g10.append(list);
        g10.append(", tabsSpace=");
        c.e(g10, num, ", tabsHorizontalPadding=", num2, ", backgroundColor=");
        return o0.c(g10, str, ")");
    }

    public MainTabsDTO(TextDTO textDTO, TextDTO textDTO2, Map map, List list, Integer num, Integer num2, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, map, (i11 & 8) != 0 ? K.f71697a : list, num, num2, str);
    }
}
