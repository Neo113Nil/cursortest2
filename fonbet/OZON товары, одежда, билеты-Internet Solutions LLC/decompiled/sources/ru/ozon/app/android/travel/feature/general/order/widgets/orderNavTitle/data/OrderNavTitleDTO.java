package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.data;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextElementDTO;", "subtitle", "<init>", "(Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextElementDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextElementDTO;)V", "getTitle", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextElementDTO;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TextElementDTO", "TextColorsDTO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderNavTitleDTO {
    public static final int $stable = 0;
    private final TextElementDTO subtitle;

    @NotNull
    private final TextElementDTO title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextColorsDTO;", "", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "", "collapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExpanded", "()Ljava/lang/String;", "getCollapsed", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextColorsDTO {
        public static final int $stable = 0;

        @NotNull
        private final String collapsed;

        @NotNull
        private final String expanded;

        public TextColorsDTO(@NotNull String expanded, @NotNull String collapsed) {
            Intrinsics.checkNotNullParameter(expanded, "expanded");
            Intrinsics.checkNotNullParameter(collapsed, "collapsed");
            this.expanded = expanded;
            this.collapsed = collapsed;
        }

        public static /* synthetic */ TextColorsDTO copy$default(TextColorsDTO textColorsDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textColorsDTO.expanded;
            }
            if ((i11 & 2) != 0) {
                str2 = textColorsDTO.collapsed;
            }
            return textColorsDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getExpanded() {
            return this.expanded;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCollapsed() {
            return this.collapsed;
        }

        @NotNull
        public final TextColorsDTO copy(@NotNull String expanded, @NotNull String collapsed) {
            Intrinsics.checkNotNullParameter(expanded, "expanded");
            Intrinsics.checkNotNullParameter(collapsed, "collapsed");
            return new TextColorsDTO(expanded, collapsed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextColorsDTO)) {
                return false;
            }
            TextColorsDTO textColorsDTO = (TextColorsDTO) other;
            return Intrinsics.d(this.expanded, textColorsDTO.expanded) && Intrinsics.d(this.collapsed, textColorsDTO.collapsed);
        }

        @NotNull
        public final String getCollapsed() {
            return this.collapsed;
        }

        @NotNull
        public final String getExpanded() {
            return this.expanded;
        }

        public int hashCode() {
            return this.collapsed.hashCode() + (this.expanded.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("TextColorsDTO(expanded=", this.expanded, ", collapsed=", this.collapsed, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextElementDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "colors", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextColorsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextColorsDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getColors", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/data/OrderNavTitleDTO$TextColorsDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextElementDTO {
        public static final int $stable = 0;

        @NotNull
        private final TextColorsDTO colors;

        @NotNull
        private final TextDTO text;

        public TextElementDTO(@NotNull TextDTO text, @NotNull TextColorsDTO colors) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(colors, "colors");
            this.text = text;
            this.colors = colors;
        }

        public static /* synthetic */ TextElementDTO copy$default(TextElementDTO textElementDTO, TextDTO textDTO, TextColorsDTO textColorsDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = textElementDTO.text;
            }
            if ((i11 & 2) != 0) {
                textColorsDTO = textElementDTO.colors;
            }
            return textElementDTO.copy(textDTO, textColorsDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextColorsDTO getColors() {
            return this.colors;
        }

        @NotNull
        public final TextElementDTO copy(@NotNull TextDTO text, @NotNull TextColorsDTO colors) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new TextElementDTO(text, colors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextElementDTO)) {
                return false;
            }
            TextElementDTO textElementDTO = (TextElementDTO) other;
            return Intrinsics.d(this.text, textElementDTO.text) && Intrinsics.d(this.colors, textElementDTO.colors);
        }

        @NotNull
        public final TextColorsDTO getColors() {
            return this.colors;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            return this.colors.hashCode() + (this.text.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TextElementDTO(text=" + this.text + ", colors=" + this.colors + ")";
        }
    }

    public OrderNavTitleDTO(@NotNull TextElementDTO title, TextElementDTO textElementDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textElementDTO;
    }

    public static /* synthetic */ OrderNavTitleDTO copy$default(OrderNavTitleDTO orderNavTitleDTO, TextElementDTO textElementDTO, TextElementDTO textElementDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textElementDTO = orderNavTitleDTO.title;
        }
        if ((i11 & 2) != 0) {
            textElementDTO2 = orderNavTitleDTO.subtitle;
        }
        return orderNavTitleDTO.copy(textElementDTO, textElementDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextElementDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextElementDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final OrderNavTitleDTO copy(@NotNull TextElementDTO title, TextElementDTO subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OrderNavTitleDTO(title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderNavTitleDTO)) {
            return false;
        }
        OrderNavTitleDTO orderNavTitleDTO = (OrderNavTitleDTO) other;
        return Intrinsics.d(this.title, orderNavTitleDTO.title) && Intrinsics.d(this.subtitle, orderNavTitleDTO.subtitle);
    }

    public final TextElementDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextElementDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextElementDTO textElementDTO = this.subtitle;
        return hashCode + (textElementDTO == null ? 0 : textElementDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrderNavTitleDTO(title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }
}
