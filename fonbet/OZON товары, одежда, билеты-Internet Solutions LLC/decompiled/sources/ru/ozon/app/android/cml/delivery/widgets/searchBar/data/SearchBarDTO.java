package ru.ozon.app.android.cml.delivery.widgets.searchBar.data;

import B0.C2454a;
import Bi.a;
import C.o0;
import El.C2971a;
import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarDTO;", "", "backgroundColor", "", "bar", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarDTO$Bar;", "scrollDistanceToShow", "", "commonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "topPatchColor", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarDTO$Bar;ILru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBar", "()Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarDTO$Bar;", "getScrollDistanceToShow", "()I", "getCommonControlSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTopPatchColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Bar", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchBarDTO {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Bar bar;

    @NotNull
    private final CommonControlSettings commonControlSettings;
    private final int scrollDistanceToShow;
    private final String topPatchColor;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/data/SearchBarDTO$Bar;", "", "backgroundColor", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bar {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO placeholder;

        public Bar(@NotNull String backgroundColor, @NotNull IconDTO icon, @NotNull TextDTO placeholder) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            this.backgroundColor = backgroundColor;
            this.icon = icon;
            this.placeholder = placeholder;
        }

        public static /* synthetic */ Bar copy$default(Bar bar, String str, IconDTO iconDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bar.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                iconDTO = bar.icon;
            }
            if ((i11 & 4) != 0) {
                textDTO = bar.placeholder;
            }
            return bar.copy(str, iconDTO, textDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final Bar copy(@NotNull String backgroundColor, @NotNull IconDTO icon, @NotNull TextDTO placeholder) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            return new Bar(backgroundColor, icon, placeholder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bar)) {
                return false;
            }
            Bar bar = (Bar) other;
            return Intrinsics.d(this.backgroundColor, bar.backgroundColor) && Intrinsics.d(this.icon, bar.icon) && Intrinsics.d(this.placeholder, bar.placeholder);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.placeholder.hashCode() + C2971a.a(this.icon, this.backgroundColor.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColor;
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.placeholder;
            StringBuilder sb2 = new StringBuilder("Bar(backgroundColor=");
            sb2.append(str);
            sb2.append(", icon=");
            sb2.append(iconDTO);
            sb2.append(", placeholder=");
            return b.e(sb2, textDTO, ")");
        }
    }

    public SearchBarDTO(@NotNull String backgroundColor, @NotNull Bar bar, int i11, @NotNull CommonControlSettings commonControlSettings, String str) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(bar, "bar");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        this.backgroundColor = backgroundColor;
        this.bar = bar;
        this.scrollDistanceToShow = i11;
        this.commonControlSettings = commonControlSettings;
        this.topPatchColor = str;
    }

    public static /* synthetic */ SearchBarDTO copy$default(SearchBarDTO searchBarDTO, String str, Bar bar, int i11, CommonControlSettings commonControlSettings, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = searchBarDTO.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            bar = searchBarDTO.bar;
        }
        if ((i12 & 4) != 0) {
            i11 = searchBarDTO.scrollDistanceToShow;
        }
        if ((i12 & 8) != 0) {
            commonControlSettings = searchBarDTO.commonControlSettings;
        }
        if ((i12 & 16) != 0) {
            str2 = searchBarDTO.topPatchColor;
        }
        String str3 = str2;
        int i13 = i11;
        return searchBarDTO.copy(str, bar, i13, commonControlSettings, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Bar getBar() {
        return this.bar;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScrollDistanceToShow() {
        return this.scrollDistanceToShow;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTopPatchColor() {
        return this.topPatchColor;
    }

    @NotNull
    public final SearchBarDTO copy(@NotNull String backgroundColor, @NotNull Bar bar, int scrollDistanceToShow, @NotNull CommonControlSettings commonControlSettings, String topPatchColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(bar, "bar");
        Intrinsics.checkNotNullParameter(commonControlSettings, "commonControlSettings");
        return new SearchBarDTO(backgroundColor, bar, scrollDistanceToShow, commonControlSettings, topPatchColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBarDTO)) {
            return false;
        }
        SearchBarDTO searchBarDTO = (SearchBarDTO) other;
        return Intrinsics.d(this.backgroundColor, searchBarDTO.backgroundColor) && Intrinsics.d(this.bar, searchBarDTO.bar) && this.scrollDistanceToShow == searchBarDTO.scrollDistanceToShow && Intrinsics.d(this.commonControlSettings, searchBarDTO.commonControlSettings) && Intrinsics.d(this.topPatchColor, searchBarDTO.topPatchColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Bar getBar() {
        return this.bar;
    }

    @NotNull
    public final CommonControlSettings getCommonControlSettings() {
        return this.commonControlSettings;
    }

    public final int getScrollDistanceToShow() {
        return this.scrollDistanceToShow;
    }

    public final String getTopPatchColor() {
        return this.topPatchColor;
    }

    public int hashCode() {
        int a11 = a.a(this.commonControlSettings, C2454a.a(this.scrollDistanceToShow, (this.bar.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31, 31), 31);
        String str = this.topPatchColor;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        Bar bar = this.bar;
        int i11 = this.scrollDistanceToShow;
        CommonControlSettings commonControlSettings = this.commonControlSettings;
        String str2 = this.topPatchColor;
        StringBuilder sb2 = new StringBuilder("SearchBarDTO(backgroundColor=");
        sb2.append(str);
        sb2.append(", bar=");
        sb2.append(bar);
        sb2.append(", scrollDistanceToShow=");
        sb2.append(i11);
        sb2.append(", commonControlSettings=");
        sb2.append(commonControlSettings);
        sb2.append(", topPatchColor=");
        return o0.c(sb2, str2, ")");
    }
}
