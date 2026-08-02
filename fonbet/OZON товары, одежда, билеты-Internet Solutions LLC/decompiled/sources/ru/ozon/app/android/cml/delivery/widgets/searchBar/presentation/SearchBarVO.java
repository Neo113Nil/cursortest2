package ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation;

import B0.C2454a;
import El.C2971a;
import G.g;
import Tl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001'B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b#\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO$Bar;", "bar", "", "backgroundColor", "", "scrollDistanceToShow", "topPatchColor", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(JLru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO$Bar;Ljava/lang/String;ILjava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO$Bar;", "getBar", "()Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO$Bar;", "Ljava/lang/String;", "getBackgroundColor", "I", "getScrollDistanceToShow", "getTopPatchColor", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Bar", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchBarVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Bar bar;

    @NotNull
    private final CommonControlSettings common;
    private final long id;
    private final int scrollDistanceToShow;
    private final String topPatchColor;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO$Bar;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public SearchBarVO(long j11, @NotNull Bar bar, @NotNull String backgroundColor, int i11, String str, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(bar, "bar");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(common, "common");
        this.id = j11;
        this.bar = bar;
        this.backgroundColor = backgroundColor;
        this.scrollDistanceToShow = i11;
        this.topPatchColor = str;
        this.common = common;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBarVO)) {
            return false;
        }
        SearchBarVO searchBarVO = (SearchBarVO) other;
        return this.id == searchBarVO.id && Intrinsics.d(this.bar, searchBarVO.bar) && Intrinsics.d(this.backgroundColor, searchBarVO.backgroundColor) && this.scrollDistanceToShow == searchBarVO.scrollDistanceToShow && Intrinsics.d(this.topPatchColor, searchBarVO.topPatchColor) && Intrinsics.d(this.common, searchBarVO.common);
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
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getScrollDistanceToShow() {
        return this.scrollDistanceToShow;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getTopPatchColor() {
        return this.topPatchColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.scrollDistanceToShow, g.a((this.bar.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.backgroundColor), 31);
        String str = this.topPatchColor;
        return this.common.hashCode() + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "SearchBarVO(id=" + this.id + ", bar=" + this.bar + ", backgroundColor=" + this.backgroundColor + ", scrollDistanceToShow=" + this.scrollDistanceToShow + ", topPatchColor=" + this.topPatchColor + ", common=" + this.common + ")";
    }
}
