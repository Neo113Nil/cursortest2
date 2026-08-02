package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.presentation;

import B0.C2454a;
import D3.h;
import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001.BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0017R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010\u0015¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO$Tab;", DynamicElementDTO.TABS, "", "tabsSpace", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILWZ/t;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "I", "getTabsSpace", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Ljava/lang/String;", "getBackgroundColor", "Tab", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MainTabsVO implements c {
    private final String backgroundColor;
    private final long id;
    private final TextDTO subtitle;

    @NotNull
    private final List<Tab> tabs;
    private final int tabsSpace;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0012¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/presentation/MainTabsVO$Tab;", "", "", "id", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "topImage", "", "tabHorizontalPadding", "<init>", "(JLru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTopImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "I", "getTabHorizontalPadding", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO iconButton;
        private final long id;

        @NotNull
        private final TextDTO subtitle;
        private final int tabHorizontalPadding;
        private final ImageDTO topImage;

        public Tab(long j11, @NotNull IconButtonV3DTO iconButton, @NotNull TextDTO subtitle, ImageDTO imageDTO, int i11) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.id = j11;
            this.iconButton = iconButton;
            this.subtitle = subtitle;
            this.topImage = imageDTO;
            this.tabHorizontalPadding = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return this.id == tab.id && Intrinsics.d(this.iconButton, tab.iconButton) && Intrinsics.d(this.subtitle, tab.subtitle) && Intrinsics.d(this.topImage, tab.topImage) && this.tabHorizontalPadding == tab.tabHorizontalPadding;
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final int getTabHorizontalPadding() {
            return this.tabHorizontalPadding;
        }

        public final ImageDTO getTopImage() {
            return this.topImage;
        }

        public int hashCode() {
            int a11 = b.a(this.subtitle, GR.b.c(this.iconButton, Long.hashCode(this.id) * 31, 31), 31);
            ImageDTO imageDTO = this.topImage;
            return Integer.hashCode(this.tabHorizontalPadding) + ((a11 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            TextDTO textDTO = this.subtitle;
            ImageDTO imageDTO = this.topImage;
            int i11 = this.tabHorizontalPadding;
            StringBuilder sb2 = new StringBuilder("Tab(id=");
            sb2.append(j11);
            sb2.append(", iconButton=");
            sb2.append(iconButtonV3DTO);
            sb2.append(", subtitle=");
            sb2.append(textDTO);
            sb2.append(", topImage=");
            sb2.append(imageDTO);
            return h.b(sb2, ", tabHorizontalPadding=", i11, ")");
        }
    }

    public MainTabsVO(long j11, @NotNull TextDTO title, TextDTO textDTO, @NotNull List<Tab> tabs, int i11, t tVar, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.title = title;
        this.subtitle = textDTO;
        this.tabs = tabs;
        this.tabsSpace = i11;
        this.viewEvent = tVar;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainTabsVO)) {
            return false;
        }
        MainTabsVO mainTabsVO = (MainTabsVO) other;
        return this.id == mainTabsVO.id && Intrinsics.d(this.title, mainTabsVO.title) && Intrinsics.d(this.subtitle, mainTabsVO.subtitle) && Intrinsics.d(this.tabs, mainTabsVO.tabs) && this.tabsSpace == mainTabsVO.tabsSpace && Intrinsics.d(this.viewEvent, mainTabsVO.viewEvent) && Intrinsics.d(this.backgroundColor, mainTabsVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final int getTabsSpace() {
        return this.tabsSpace;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.subtitle;
        int a12 = C2454a.a(this.tabsSpace, g.b((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.tabs), 31);
        t tVar = this.viewEvent;
        int hashCode = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<Tab> list = this.tabs;
        int i11 = this.tabsSpace;
        t tVar = this.viewEvent;
        String str = this.backgroundColor;
        StringBuilder b11 = a.b("MainTabsVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", tabs=");
        b11.append(list);
        b11.append(", tabsSpace=");
        b11.append(i11);
        b11.append(", viewEvent=");
        b11.append(tVar);
        return C6594f.a(", backgroundColor=", str, ")", b11);
    }
}
