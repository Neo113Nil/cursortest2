package ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.data;

import B3.p;
import G.g;
import GR.b;
import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "price", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Price;", "backgroundColor", "", "spacers", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Spacers;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Price;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Spacers;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getPrice", "()Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Price;", "getBackgroundColor", "()Ljava/lang/String;", "getSpacers", "()Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Spacers;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Price", "Spacers", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutButtonDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Price price;
    private final Spacers spacers;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Price;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "color", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Price {

        @NotNull
        private final String color;
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;

        public Price(@NotNull TextDTO text, @NotNull String color, IconDTO iconDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            this.text = text;
            this.color = color;
            this.icon = iconDTO;
        }

        public static /* synthetic */ Price copy$default(Price price, TextDTO textDTO, String str, IconDTO iconDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = price.text;
            }
            if ((i11 & 2) != 0) {
                str = price.color;
            }
            if ((i11 & 4) != 0) {
                iconDTO = price.icon;
            }
            return price.copy(textDTO, str, iconDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final Price copy(@NotNull TextDTO text, @NotNull String color, IconDTO icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(color, "color");
            return new Price(text, color, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.d(this.text, price.text) && Intrinsics.d(this.color, price.color) && Intrinsics.d(this.icon, price.icon);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int a11 = g.a(this.text.hashCode() * 31, 31, this.color);
            IconDTO iconDTO = this.icon;
            return a11 + (iconDTO == null ? 0 : iconDTO.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.text;
            String str = this.color;
            IconDTO iconDTO = this.icon;
            StringBuilder f7 = D3.g.f("Price(text=", textDTO, ", color=", str, ", icon=");
            f7.append(iconDTO);
            f7.append(")");
            return f7.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Spacers;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public Spacers() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.right;
            }
            return spacers.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Spacers copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new Spacers(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.top == spacers.top && this.bottom == spacers.bottom && this.left == spacers.left && this.right == spacers.right;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("Spacers(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }

        public Spacers(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.NONE : paddings, (i11 & 2) != 0 ? Paddings.NONE : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_400 : paddings4);
        }
    }

    public CheckoutButtonDTO(@NotNull TextDTO title, TextDTO textDTO, @NotNull Price price, @NotNull String backgroundColor, Spacers spacers, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        this.title = title;
        this.subtitle = textDTO;
        this.price = price;
        this.backgroundColor = backgroundColor;
        this.spacers = spacers;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CheckoutButtonDTO copy$default(CheckoutButtonDTO checkoutButtonDTO, TextDTO textDTO, TextDTO textDTO2, Price price, String str, Spacers spacers, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = checkoutButtonDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = checkoutButtonDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            price = checkoutButtonDTO.price;
        }
        if ((i11 & 8) != 0) {
            str = checkoutButtonDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            spacers = checkoutButtonDTO.spacers;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = checkoutButtonDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = checkoutButtonDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        Spacers spacers2 = spacers;
        Price price2 = price;
        return checkoutButtonDTO.copy(textDTO, textDTO2, price2, str, spacers2, atomActionDTO2, map2);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Price getPrice() {
        return this.price;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final CheckoutButtonDTO copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull Price price, @NotNull String backgroundColor, Spacers spacers, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CheckoutButtonDTO(title, subtitle, price, backgroundColor, spacers, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutButtonDTO)) {
            return false;
        }
        CheckoutButtonDTO checkoutButtonDTO = (CheckoutButtonDTO) other;
        return Intrinsics.d(this.title, checkoutButtonDTO.title) && Intrinsics.d(this.subtitle, checkoutButtonDTO.subtitle) && Intrinsics.d(this.price, checkoutButtonDTO.price) && Intrinsics.d(this.backgroundColor, checkoutButtonDTO.backgroundColor) && Intrinsics.d(this.spacers, checkoutButtonDTO.spacers) && Intrinsics.d(this.action, checkoutButtonDTO.action) && Intrinsics.d(this.trackingInfo, checkoutButtonDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
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
        int a11 = g.a((this.price.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31, 31, this.backgroundColor);
        Spacers spacers = this.spacers;
        int b11 = a.b(this.action, (a11 + (spacers == null ? 0 : spacers.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        Price price = this.price;
        String str = this.backgroundColor;
        Spacers spacers = this.spacers;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("CheckoutButtonDTO(title=", textDTO, ", subtitle=", textDTO2, ", price=");
        g10.append(price);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", spacers=");
        g10.append(spacers);
        g10.append(", action=");
        g10.append(atomActionDTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
