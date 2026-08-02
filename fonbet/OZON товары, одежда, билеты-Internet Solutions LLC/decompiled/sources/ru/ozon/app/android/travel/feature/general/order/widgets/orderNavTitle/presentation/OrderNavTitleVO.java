package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import Ns.b;
import TY.a;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b$\u0010\"R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;", "titleColors", "subtitle", "subtitleColors", "", "textColorAlpha", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;", "getTitleColors", "()Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;", "getSubtitle", "getSubtitleColors", "F", "getTextColorAlpha", "()F", "setTextColorAlpha", "(F)V", "TextColors", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OrderNavTitleVO implements c {
    private final long id;
    private final TextDTO subtitle;
    private final TextColors subtitleColors;
    private float textColorAlpha;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final TextColors titleColors;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavTitle/presentation/OrderNavTitleVO$TextColors;", "", "", NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, "collapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExpanded", "getCollapsed", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextColors {

        @NotNull
        private final String collapsed;

        @NotNull
        private final String expanded;

        public TextColors(@NotNull String expanded, @NotNull String collapsed) {
            Intrinsics.checkNotNullParameter(expanded, "expanded");
            Intrinsics.checkNotNullParameter(collapsed, "collapsed");
            this.expanded = expanded;
            this.collapsed = collapsed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextColors)) {
                return false;
            }
            TextColors textColors = (TextColors) other;
            return Intrinsics.d(this.expanded, textColors.expanded) && Intrinsics.d(this.collapsed, textColors.collapsed);
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
            return e.a("TextColors(expanded=", this.expanded, ", collapsed=", this.collapsed, ")");
        }
    }

    public OrderNavTitleVO(long j11, @NotNull TextDTO title, @NotNull TextColors titleColors, TextDTO textDTO, TextColors textColors, float f7) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(titleColors, "titleColors");
        this.id = j11;
        this.title = title;
        this.titleColors = titleColors;
        this.subtitle = textDTO;
        this.subtitleColors = textColors;
        this.textColorAlpha = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderNavTitleVO)) {
            return false;
        }
        OrderNavTitleVO orderNavTitleVO = (OrderNavTitleVO) other;
        return this.id == orderNavTitleVO.id && Intrinsics.d(this.title, orderNavTitleVO.title) && Intrinsics.d(this.titleColors, orderNavTitleVO.titleColors) && Intrinsics.d(this.subtitle, orderNavTitleVO.subtitle) && Intrinsics.d(this.subtitleColors, orderNavTitleVO.subtitleColors) && Float.compare(this.textColorAlpha, orderNavTitleVO.textColorAlpha) == 0;
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

    public final TextColors getSubtitleColors() {
        return this.subtitleColors;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final TextColors getTitleColors() {
        return this.titleColors;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.titleColors.hashCode() + b.a(this.title, Long.hashCode(this.id) * 31, 31)) * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextColors textColors = this.subtitleColors;
        return Float.hashCode(this.textColorAlpha) + ((hashCode2 + (textColors != null ? textColors.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextColors textColors = this.titleColors;
        TextDTO textDTO2 = this.subtitle;
        TextColors textColors2 = this.subtitleColors;
        float f7 = this.textColorAlpha;
        StringBuilder b11 = a.b("OrderNavTitleVO(id=", j11, ", title=", textDTO);
        b11.append(", titleColors=");
        b11.append(textColors);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", subtitleColors=");
        b11.append(textColors2);
        b11.append(", textColorAlpha=");
        b11.append(f7);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ OrderNavTitleVO(long j11, TextDTO textDTO, TextColors textColors, TextDTO textDTO2, TextColors textColors2, float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textDTO, textColors, textDTO2, textColors2, (i11 & 32) != 0 ? 1.0f : f7);
    }
}
