package ru.ozon.android.messenger.blocks.order;

import D3.g;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.utils.view.LabeledIconMetaDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/android/messenger/blocks/order/OrderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "labeledIcon", "Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "productMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getLabeledIcon", "()Lru/ozon/android/messenger/utils/view/LabeledIconMetaDTO;", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OrderDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final LabeledIconMetaDTO labeledIcon;

    @NotNull
    private final ProductMediaDTO productMedia;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public OrderDTO(@NotNull TextDTO title, TextDTO textDTO, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map, LabeledIconMetaDTO labeledIconMetaDTO, @NotNull ProductMediaDTO productMedia) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        this.title = title;
        this.subtitle = textDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.labeledIcon = labeledIconMetaDTO;
        this.productMedia = productMedia;
    }

    public static /* synthetic */ OrderDTO copy$default(OrderDTO orderDTO, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, Map map, LabeledIconMetaDTO labeledIconMetaDTO, ProductMediaDTO productMediaDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = orderDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = orderDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = orderDTO.action;
        }
        if ((i11 & 8) != 0) {
            map = orderDTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            labeledIconMetaDTO = orderDTO.labeledIcon;
        }
        if ((i11 & 32) != 0) {
            productMediaDTO = orderDTO.productMedia;
        }
        LabeledIconMetaDTO labeledIconMetaDTO2 = labeledIconMetaDTO;
        ProductMediaDTO productMediaDTO2 = productMediaDTO;
        return orderDTO.copy(textDTO, textDTO2, atomActionDTO, map, labeledIconMetaDTO2, productMediaDTO2);
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

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, MessengerTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final LabeledIconMetaDTO getLabeledIcon() {
        return this.labeledIcon;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    @NotNull
    public final OrderDTO copy(@NotNull TextDTO title, TextDTO subtitle, AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo, LabeledIconMetaDTO labeledIcon, @NotNull ProductMediaDTO productMedia) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        return new OrderDTO(title, subtitle, action, trackingInfo, labeledIcon, productMedia);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDTO)) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) other;
        return Intrinsics.d(this.title, orderDTO.title) && Intrinsics.d(this.subtitle, orderDTO.subtitle) && Intrinsics.d(this.action, orderDTO.action) && Intrinsics.d(this.trackingInfo, orderDTO.trackingInfo) && Intrinsics.d(this.labeledIcon, orderDTO.labeledIcon) && Intrinsics.d(this.productMedia, orderDTO.productMedia);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final LabeledIconMetaDTO getLabeledIcon() {
        return this.labeledIcon;
    }

    @NotNull
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        LabeledIconMetaDTO labeledIconMetaDTO = this.labeledIcon;
        return this.productMedia.hashCode() + ((hashCode4 + (labeledIconMetaDTO != null ? labeledIconMetaDTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        LabeledIconMetaDTO labeledIconMetaDTO = this.labeledIcon;
        ProductMediaDTO productMediaDTO = this.productMedia;
        StringBuilder g10 = g.g("OrderDTO(title=", textDTO, ", subtitle=", textDTO2, ", action=");
        Sh.b.f(g10, atomActionDTO, ", trackingInfo=", map, ", labeledIcon=");
        g10.append(labeledIconMetaDTO);
        g10.append(", productMedia=");
        g10.append(productMediaDTO);
        g10.append(")");
        return g10.toString();
    }
}
