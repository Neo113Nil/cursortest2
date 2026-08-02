package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.domain;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import G.g;
import K00.b;
import WZ.t;
import Xc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u001b\u001c\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;", "tiles", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTiles", "()Ljava/util/List;", "TileItem", "TitleVO", "SubtitleVO", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DetailedCheckoutProductsVO implements c {
    private final long id;

    @NotNull
    private final List<TileItem> tiles;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "", "TextAtom", "Badge", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO$Badge;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO$TextAtom;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SubtitleVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO$Badge;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Badge implements SubtitleVO {

            @NotNull
            private final BadgeDTO badge;

            public Badge(@NotNull BadgeDTO badge) {
                Intrinsics.checkNotNullParameter(badge, "badge");
                this.badge = badge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Badge) && Intrinsics.d(this.badge, ((Badge) other).badge);
            }

            @NotNull
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public int hashCode() {
                return this.badge.hashCode();
            }

            @NotNull
            public String toString() {
                return "Badge(badge=" + this.badge + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO$TextAtom;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextAtom implements SubtitleVO {

            @NotNull
            private final TextDTO text;

            public TextAtom(@NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextAtom) && Intrinsics.d(this.text, ((TextAtom) other).text);
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return "TextAtom(text=" + this.text + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001:\u0002HIB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b>\u0010\u001eR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;", "", "", "widgetId", "", "image", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "productQuantity", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "subtitle", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "", "radius", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "spacers", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "separator", "backgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;", "textBoxType", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;Lru/ozon/uni/atoms/data/price/PriceDTO;ILru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "getTitle", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "getSubtitle", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "I", "getRadius", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "getSeparator", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Separator;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;", "getTextBoxType", "()Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Spacers", "TextBoxType", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileItem {
        private final String backgroundColor;
        private final IconDTO icon;

        @NotNull
        private final String image;
        private final PriceDTO price;
        private final TextDTO productQuantity;
        private final int radius;
        private final DetailedCheckoutProductsDTO.TileItem.Separator separator;

        @NotNull
        private final Spacers spacers;
        private final SubtitleVO subtitle;

        @NotNull
        private final TextBoxType textBoxType;

        @NotNull
        private final TitleVO title;
        private final t tokenizedEvent;
        private final long widgetId;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "", "", "vertical", "horizontal", "between", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVertical", "getHorizontal", "getBetween", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            private final int between;
            private final int horizontal;
            private final int vertical;

            public Spacers(int i11, int i12, int i13) {
                this.vertical = i11;
                this.horizontal = i12;
                this.between = i13;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.vertical == spacers.vertical && this.horizontal == spacers.horizontal && this.between == spacers.between;
            }

            public final int getBetween() {
                return this.between;
            }

            public final int getHorizontal() {
                return this.horizontal;
            }

            public final int getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return Integer.hashCode(this.between) + C2454a.a(this.horizontal, Integer.hashCode(this.vertical) * 31, 31);
            }

            @NotNull
            public String toString() {
                return b.e(this.between, ")", C2438a.a("Spacers(vertical=", this.vertical, ", horizontal=", ", between=", this.horizontal));
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$TextBoxType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE_TEXT", "PRICE_TEXT", "TITLE_SUBTITLE", "FULL_INFO_TEXT", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class TextBoxType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ TextBoxType[] $VALUES;
            public static final TextBoxType SINGLE_TEXT = new TextBoxType("SINGLE_TEXT", 0);
            public static final TextBoxType PRICE_TEXT = new TextBoxType("PRICE_TEXT", 1);
            public static final TextBoxType TITLE_SUBTITLE = new TextBoxType("TITLE_SUBTITLE", 2);
            public static final TextBoxType FULL_INFO_TEXT = new TextBoxType("FULL_INFO_TEXT", 3);

            private static final /* synthetic */ TextBoxType[] $values() {
                return new TextBoxType[]{SINGLE_TEXT, PRICE_TEXT, TITLE_SUBTITLE, FULL_INFO_TEXT};
            }

            static {
                TextBoxType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private TextBoxType(String str, int i11) {
            }

            public static TextBoxType valueOf(String str) {
                return (TextBoxType) Enum.valueOf(TextBoxType.class, str);
            }

            public static TextBoxType[] values() {
                return (TextBoxType[]) $VALUES.clone();
            }
        }

        public TileItem(long j11, @NotNull String image, @NotNull TitleVO title, TextDTO textDTO, SubtitleVO subtitleVO, PriceDTO priceDTO, int i11, @NotNull Spacers spacers, DetailedCheckoutProductsDTO.TileItem.Separator separator, String str, IconDTO iconDTO, @NotNull TextBoxType textBoxType, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            Intrinsics.checkNotNullParameter(textBoxType, "textBoxType");
            this.widgetId = j11;
            this.image = image;
            this.title = title;
            this.productQuantity = textDTO;
            this.subtitle = subtitleVO;
            this.price = priceDTO;
            this.radius = i11;
            this.spacers = spacers;
            this.separator = separator;
            this.backgroundColor = str;
            this.icon = iconDTO;
            this.textBoxType = textBoxType;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return this.widgetId == tileItem.widgetId && Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.title, tileItem.title) && Intrinsics.d(this.productQuantity, tileItem.productQuantity) && Intrinsics.d(this.subtitle, tileItem.subtitle) && Intrinsics.d(this.price, tileItem.price) && this.radius == tileItem.radius && Intrinsics.d(this.spacers, tileItem.spacers) && Intrinsics.d(this.separator, tileItem.separator) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && Intrinsics.d(this.icon, tileItem.icon) && this.textBoxType == tileItem.textBoxType && Intrinsics.d(this.tokenizedEvent, tileItem.tokenizedEvent);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final TextDTO getProductQuantity() {
            return this.productQuantity;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final DetailedCheckoutProductsDTO.TileItem.Separator getSeparator() {
            return this.separator;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final SubtitleVO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextBoxType getTextBoxType() {
            return this.textBoxType;
        }

        @NotNull
        public final TitleVO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = (this.title.hashCode() + g.a(Long.hashCode(this.widgetId) * 31, 31, this.image)) * 31;
            TextDTO textDTO = this.productQuantity;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            SubtitleVO subtitleVO = this.subtitle;
            int hashCode3 = (hashCode2 + (subtitleVO == null ? 0 : subtitleVO.hashCode())) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode4 = (this.spacers.hashCode() + C2454a.a(this.radius, (hashCode3 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31)) * 31;
            DetailedCheckoutProductsDTO.TileItem.Separator separator = this.separator;
            int hashCode5 = (hashCode4 + (separator == null ? 0 : separator.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            IconDTO iconDTO = this.icon;
            int hashCode7 = (this.textBoxType.hashCode() + ((hashCode6 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31)) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode7 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.widgetId;
            String str = this.image;
            TitleVO titleVO = this.title;
            TextDTO textDTO = this.productQuantity;
            SubtitleVO subtitleVO = this.subtitle;
            PriceDTO priceDTO = this.price;
            int i11 = this.radius;
            Spacers spacers = this.spacers;
            DetailedCheckoutProductsDTO.TileItem.Separator separator = this.separator;
            String str2 = this.backgroundColor;
            IconDTO iconDTO = this.icon;
            TextBoxType textBoxType = this.textBoxType;
            t tVar = this.tokenizedEvent;
            StringBuilder c11 = C2436a.c(j11, "TileItem(widgetId=", ", image=", str);
            c11.append(", title=");
            c11.append(titleVO);
            c11.append(", productQuantity=");
            c11.append(textDTO);
            c11.append(", subtitle=");
            c11.append(subtitleVO);
            c11.append(", price=");
            c11.append(priceDTO);
            c11.append(", radius=");
            c11.append(i11);
            c11.append(", spacers=");
            c11.append(spacers);
            c11.append(", separator=");
            c11.append(separator);
            c11.append(", backgroundColor=");
            c11.append(str2);
            c11.append(", icon=");
            c11.append(iconDTO);
            c11.append(", textBoxType=");
            c11.append(textBoxType);
            return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "", "TextAtom", "TextPair", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO$TextAtom;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO$TextPair;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TitleVO {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO$TextAtom;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextAtom implements TitleVO {

            @NotNull
            private final TextDTO text;

            public TextAtom(@NotNull TextDTO text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextAtom) && Intrinsics.d(this.text, ((TextAtom) other).text);
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return "TextAtom(text=" + this.text + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO$TextPair;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "textPair", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "getTextPair", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextPair implements TitleVO {

            @NotNull
            private final FreshTextPairDTO textPair;

            public TextPair(@NotNull FreshTextPairDTO textPair) {
                Intrinsics.checkNotNullParameter(textPair, "textPair");
                this.textPair = textPair;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextPair) && Intrinsics.d(this.textPair, ((TextPair) other).textPair);
            }

            @NotNull
            public final FreshTextPairDTO getTextPair() {
                return this.textPair;
            }

            public int hashCode() {
                return this.textPair.hashCode();
            }

            @NotNull
            public String toString() {
                return "TextPair(textPair=" + this.textPair + ")";
            }
        }
    }

    public DetailedCheckoutProductsVO(long j11, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.id = j11;
        this.tiles = tiles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailedCheckoutProductsVO)) {
            return false;
        }
        DetailedCheckoutProductsVO detailedCheckoutProductsVO = (DetailedCheckoutProductsVO) other;
        return this.id == detailedCheckoutProductsVO.id && Intrinsics.d(this.tiles, detailedCheckoutProductsVO.tiles);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TileItem> getTiles() {
        return this.tiles;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.tiles.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Lh.b.b(this.id, "DetailedCheckoutProductsVO(id=", ", tiles=", this.tiles);
        b11.append(")");
        return b11.toString();
    }
}
