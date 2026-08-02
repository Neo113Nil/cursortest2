package ru.ozon.android.messenger.blocks.travelOrders;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/android/messenger/blocks/travelOrders/TravelOrderDTO;", "", "productMedia", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TravelOrderDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final ProductMediaDTO productMedia;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public TravelOrderDTO(@NotNull ProductMediaDTO productMedia, @NotNull TextDTO title, TextDTO textDTO, AtomActionDTO atomActionDTO, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(title, "title");
        this.productMedia = productMedia;
        this.title = title;
        this.subtitle = textDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ TravelOrderDTO copy$default(TravelOrderDTO travelOrderDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productMediaDTO = travelOrderDTO.productMedia;
        }
        if ((i11 & 2) != 0) {
            textDTO = travelOrderDTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = travelOrderDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = travelOrderDTO.action;
        }
        if ((i11 & 16) != 0) {
            map = travelOrderDTO.trackingInfo;
        }
        Map map2 = map;
        TextDTO textDTO3 = textDTO2;
        return travelOrderDTO.copy(productMediaDTO, textDTO, textDTO3, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, MessengerTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final TravelOrderDTO copy(@NotNull ProductMediaDTO productMedia, @NotNull TextDTO title, TextDTO subtitle, AtomActionDTO action, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TravelOrderDTO(productMedia, title, subtitle, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelOrderDTO)) {
            return false;
        }
        TravelOrderDTO travelOrderDTO = (TravelOrderDTO) other;
        return Intrinsics.d(this.productMedia, travelOrderDTO.productMedia) && Intrinsics.d(this.title, travelOrderDTO.title) && Intrinsics.d(this.subtitle, travelOrderDTO.subtitle) && Intrinsics.d(this.action, travelOrderDTO.action) && Intrinsics.d(this.trackingInfo, travelOrderDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
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
        int a11 = Ns.b.a(this.title, this.productMedia.hashCode() * 31, 31);
        TextDTO textDTO = this.subtitle;
        int hashCode = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ProductMediaDTO productMediaDTO = this.productMedia;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TravelOrderDTO(productMedia=");
        sb2.append(productMediaDTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
