package ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation;

import G.g;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002=>B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b6\u00101R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "headerButton", "rightHeaderText", "Lru/ozon/uni/atoms/af/AtomAction;", "rightHeaderTextAction", "", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "items", "orderInfoAction", "productsListAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;", "alignmentType", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getHeaderButton", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getRightHeaderText", "Lru/ozon/uni/atoms/af/AtomAction;", "getRightHeaderTextAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getOrderInfoAction", "getProductsListAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;", "getAlignmentType", "()Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;", "OrderProduct", "AlignmentType", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderInfoVO implements c {

    @NotNull
    private final AlignmentType alignmentType;
    private final BadgeDTO headerButton;
    private final long id;

    @NotNull
    private final List<OrderProduct> items;
    private final AtomAction orderInfoAction;
    private final AtomAction productsListAction;
    private final TextDTO rightHeaderText;
    private final AtomAction rightHeaderTextAction;
    private final TextDTO subtitle;
    private final TextDTO title;
    private final t tokenizedEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$AlignmentType;", "", "<init>", "(Ljava/lang/String;I)V", "ALL_VISIBLE", "ONLY_SUBTITLE", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlignmentType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AlignmentType[] $VALUES;
        public static final AlignmentType ALL_VISIBLE = new AlignmentType("ALL_VISIBLE", 0);
        public static final AlignmentType ONLY_SUBTITLE = new AlignmentType("ONLY_SUBTITLE", 1);

        private static final /* synthetic */ AlignmentType[] $values() {
            return new AlignmentType[]{ALL_VISIBLE, ONLY_SUBTITLE};
        }

        static {
            AlignmentType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AlignmentType(String str, int i11) {
        }

        public static AlignmentType valueOf(String str) {
            return (AlignmentType) Enum.valueOf(AlignmentType.class, str);
        }

        public static AlignmentType[] values() {
            return (AlignmentType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoVO$OrderProduct;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderProduct {
        private final AtomAction action;

        @NotNull
        private final ImageDTO image;

        public OrderProduct(@NotNull ImageDTO image, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderProduct)) {
                return false;
            }
            OrderProduct orderProduct = (OrderProduct) other;
            return Intrinsics.d(this.image, orderProduct.image) && Intrinsics.d(this.action, orderProduct.action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            AtomAction atomAction = this.action;
            return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
        }

        @NotNull
        public String toString() {
            return "OrderProduct(image=" + this.image + ", action=" + this.action + ")";
        }
    }

    public OrderInfoVO(long j11, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, TextDTO textDTO3, AtomAction atomAction, @NotNull List<OrderProduct> items, AtomAction atomAction2, AtomAction atomAction3, t tVar, @NotNull AlignmentType alignmentType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(alignmentType, "alignmentType");
        this.id = j11;
        this.title = textDTO;
        this.subtitle = textDTO2;
        this.headerButton = badgeDTO;
        this.rightHeaderText = textDTO3;
        this.rightHeaderTextAction = atomAction;
        this.items = items;
        this.orderInfoAction = atomAction2;
        this.productsListAction = atomAction3;
        this.tokenizedEvent = tVar;
        this.alignmentType = alignmentType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderInfoVO)) {
            return false;
        }
        OrderInfoVO orderInfoVO = (OrderInfoVO) other;
        return this.id == orderInfoVO.id && Intrinsics.d(this.title, orderInfoVO.title) && Intrinsics.d(this.subtitle, orderInfoVO.subtitle) && Intrinsics.d(this.headerButton, orderInfoVO.headerButton) && Intrinsics.d(this.rightHeaderText, orderInfoVO.rightHeaderText) && Intrinsics.d(this.rightHeaderTextAction, orderInfoVO.rightHeaderTextAction) && Intrinsics.d(this.items, orderInfoVO.items) && Intrinsics.d(this.orderInfoAction, orderInfoVO.orderInfoAction) && Intrinsics.d(this.productsListAction, orderInfoVO.productsListAction) && Intrinsics.d(this.tokenizedEvent, orderInfoVO.tokenizedEvent) && this.alignmentType == orderInfoVO.alignmentType;
    }

    @NotNull
    public final AlignmentType getAlignmentType() {
        return this.alignmentType;
    }

    public final BadgeDTO getHeaderButton() {
        return this.headerButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<OrderProduct> getItems() {
        return this.items;
    }

    public final AtomAction getOrderInfoAction() {
        return this.orderInfoAction;
    }

    public final AtomAction getProductsListAction() {
        return this.productsListAction;
    }

    public final TextDTO getRightHeaderText() {
        return this.rightHeaderText;
    }

    public final AtomAction getRightHeaderTextAction() {
        return this.rightHeaderTextAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.headerButton;
        int hashCode4 = (hashCode3 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        TextDTO textDTO3 = this.rightHeaderText;
        int hashCode5 = (hashCode4 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
        AtomAction atomAction = this.rightHeaderTextAction;
        int b11 = g.b((hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31, 31, this.items);
        AtomAction atomAction2 = this.orderInfoAction;
        int hashCode6 = (b11 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
        AtomAction atomAction3 = this.productsListAction;
        int hashCode7 = (hashCode6 + (atomAction3 == null ? 0 : atomAction3.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return this.alignmentType.hashCode() + ((hashCode7 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        BadgeDTO badgeDTO = this.headerButton;
        TextDTO textDTO3 = this.rightHeaderText;
        AtomAction atomAction = this.rightHeaderTextAction;
        List<OrderProduct> list = this.items;
        AtomAction atomAction2 = this.orderInfoAction;
        AtomAction atomAction3 = this.productsListAction;
        t tVar = this.tokenizedEvent;
        AlignmentType alignmentType = this.alignmentType;
        StringBuilder b11 = TY.a.b("OrderInfoVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", headerButton=");
        b11.append(badgeDTO);
        b11.append(", rightHeaderText=");
        b11.append(textDTO3);
        b11.append(", rightHeaderTextAction=");
        b11.append(atomAction);
        b11.append(", items=");
        b11.append(list);
        b11.append(", orderInfoAction=");
        b11.append(atomAction2);
        Fj.c.e(tVar, ", productsListAction=", ", tokenizedEvent=", b11, atomAction3);
        b11.append(", alignmentType=");
        b11.append(alignmentType);
        b11.append(")");
        return b11.toString();
    }
}
