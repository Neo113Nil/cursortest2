package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import H3.c;
import T7.E;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "priceList", type = PriceList.class), @ProtoOneOfSignature(name = "verticalSpacer", type = VerticalSpacer.class), @ProtoOneOfSignature(name = "badges", type = Badges.class), @ProtoOneOfSignature(name = "annotation", type = DisclaimerAtom.class), @ProtoOneOfSignature(name = "cell", type = CellDTO.class), @ProtoOneOfSignature(name = "progressiveText", type = ProgressiveTextWidgetDTO.ProgressiveTextDTO.class)})
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "", "<init>", "()V", "Companion", "VerticalSpacer", "Badges", "PriceList", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$Badges;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$PriceList;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$VerticalSpacer;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes6.dex */
public abstract class DynamicElementDTOV2 {
    public static final int $stable = 0;

    @NotNull
    public static final String ANNOTATION = "annotation";

    @NotNull
    public static final String BADGES = "badges";

    @NotNull
    public static final String CELL = "cell";

    @NotNull
    public static final String PRICE = "price";

    @NotNull
    public static final String PRICE_LIST = "priceList";

    @NotNull
    public static final String PROGRESSIVE_TEXT = "progressiveText";

    @NotNull
    public static final String TEXT = "text";

    @NotNull
    public static final String VERTICAL_SPACER = "verticalSpacer";

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$Badges;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "elements", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/util/List;)V", "getElements", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Badges extends DynamicElementDTOV2 {
        public static final int $stable = 8;

        @NotNull
        private final List<BadgeDTO> elements;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Badges(@NotNull List<BadgeDTO> elements) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.elements = elements;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Badges copy$default(Badges badges, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = badges.elements;
            }
            return badges.copy(list);
        }

        @NotNull
        public final List<BadgeDTO> component1() {
            return this.elements;
        }

        @NotNull
        public final Badges copy(@NotNull List<BadgeDTO> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return new Badges(elements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Badges) && Intrinsics.d(this.elements, ((Badges) other).elements);
        }

        @NotNull
        public final List<BadgeDTO> getElements() {
            return this.elements;
        }

        public int hashCode() {
            return this.elements.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("Badges(elements=", ")", this.elements);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ*\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$PriceList;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "list", "", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "isFlexModeEnabled", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getList", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$PriceList;", "equals", "other", "", "hashCode", "", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceList extends DynamicElementDTOV2 {
        public static final int $stable = 8;
        private final Boolean isFlexModeEnabled;

        @NotNull
        private final List<PriceDTO> list;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PriceList(@NotNull List<PriceDTO> list, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.isFlexModeEnabled = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PriceList copy$default(PriceList priceList, List list, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = priceList.list;
            }
            if ((i11 & 2) != 0) {
                bool = priceList.isFlexModeEnabled;
            }
            return priceList.copy(list, bool);
        }

        @NotNull
        public final List<PriceDTO> component1() {
            return this.list;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsFlexModeEnabled() {
            return this.isFlexModeEnabled;
        }

        @NotNull
        public final PriceList copy(@NotNull List<PriceDTO> list, Boolean isFlexModeEnabled) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new PriceList(list, isFlexModeEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceList)) {
                return false;
            }
            PriceList priceList = (PriceList) other;
            return Intrinsics.d(this.list, priceList.list) && Intrinsics.d(this.isFlexModeEnabled, priceList.isFlexModeEnabled);
        }

        @NotNull
        public final List<PriceDTO> getList() {
            return this.list;
        }

        public int hashCode() {
            int hashCode = this.list.hashCode() * 31;
            Boolean bool = this.isFlexModeEnabled;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final Boolean isFlexModeEnabled() {
            return this.isFlexModeEnabled;
        }

        @NotNull
        public String toString() {
            return "PriceList(list=" + this.list + ", isFlexModeEnabled=" + this.isFlexModeEnabled + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2$VerticalSpacer;", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementDTOV2;", "spacing", "", "<init>", "(I)V", "getSpacing", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VerticalSpacer extends DynamicElementDTOV2 {
        public static final int $stable = 0;
        private final int spacing;

        public VerticalSpacer(int i11) {
            super(null);
            this.spacing = i11;
        }

        public static /* synthetic */ VerticalSpacer copy$default(VerticalSpacer verticalSpacer, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = verticalSpacer.spacing;
            }
            return verticalSpacer.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSpacing() {
            return this.spacing;
        }

        @NotNull
        public final VerticalSpacer copy(int spacing) {
            return new VerticalSpacer(spacing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerticalSpacer) && this.spacing == ((VerticalSpacer) other).spacing;
        }

        public final int getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            return Integer.hashCode(this.spacing);
        }

        @NotNull
        public String toString() {
            return E.a(this.spacing, "VerticalSpacer(spacing=", ")");
        }
    }

    public /* synthetic */ DynamicElementDTOV2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DynamicElementDTOV2() {
    }
}
