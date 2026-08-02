package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.data;

import Ak.C2436a;
import B90.C2619v;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jf\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\n\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/data/OrderDonePaymentStatusDTO;", "", "icon", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "", "timeLeft", "", "isProcessing", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;)V", "getIcon", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "()Ljava/util/List;", "getTimeLeft", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/data/OrderDonePaymentStatusDTO;", "equals", "other", "hashCode", "", "toString", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDonePaymentStatusDTO {
    public static final int $stable = 8;
    private final String icon;
    private final Boolean isProcessing;
    private final List<TextAtom> subtitle;
    private final Long timeLeft;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderDonePaymentStatusDTO(String str, @NotNull TextAtom title, List<TextAtom> list, Long l11, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.icon = str;
        this.title = title;
        this.subtitle = list;
        this.timeLeft = l11;
        this.isProcessing = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ OrderDonePaymentStatusDTO copy$default(OrderDonePaymentStatusDTO orderDonePaymentStatusDTO, String str, TextAtom textAtom, List list, Long l11, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderDonePaymentStatusDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textAtom = orderDonePaymentStatusDTO.title;
        }
        if ((i11 & 4) != 0) {
            list = orderDonePaymentStatusDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            l11 = orderDonePaymentStatusDTO.timeLeft;
        }
        if ((i11 & 16) != 0) {
            bool = orderDonePaymentStatusDTO.isProcessing;
        }
        if ((i11 & 32) != 0) {
            map = orderDonePaymentStatusDTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        return orderDonePaymentStatusDTO.copy(str, textAtom, list, l11, bool2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    public final List<TextAtom> component3() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsProcessing() {
        return this.isProcessing;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderDonePaymentStatusDTO copy(String icon, @NotNull TextAtom title, List<TextAtom> subtitle, Long timeLeft, Boolean isProcessing, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OrderDonePaymentStatusDTO(icon, title, subtitle, timeLeft, isProcessing, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDonePaymentStatusDTO)) {
            return false;
        }
        OrderDonePaymentStatusDTO orderDonePaymentStatusDTO = (OrderDonePaymentStatusDTO) other;
        return Intrinsics.d(this.icon, orderDonePaymentStatusDTO.icon) && Intrinsics.d(this.title, orderDonePaymentStatusDTO.title) && Intrinsics.d(this.subtitle, orderDonePaymentStatusDTO.subtitle) && Intrinsics.d(this.timeLeft, orderDonePaymentStatusDTO.timeLeft) && Intrinsics.d(this.isProcessing, orderDonePaymentStatusDTO.isProcessing) && Intrinsics.d(this.trackingInfo, orderDonePaymentStatusDTO.trackingInfo);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final List<TextAtom> getSubtitle() {
        return this.subtitle;
    }

    public final Long getTimeLeft() {
        return this.timeLeft;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.icon;
        int b11 = C2619v.b((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        List<TextAtom> list = this.subtitle;
        int hashCode = (b11 + (list == null ? 0 : list.hashCode())) * 31;
        Long l11 = this.timeLeft;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.isProcessing;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isProcessing() {
        return this.isProcessing;
    }

    @NotNull
    public String toString() {
        String str = this.icon;
        TextAtom textAtom = this.title;
        List<TextAtom> list = this.subtitle;
        Long l11 = this.timeLeft;
        Boolean bool = this.isProcessing;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C2436a.d("OrderDonePaymentStatusDTO(icon=", str, ", title=", ", subtitle=", textAtom);
        d11.append(list);
        d11.append(", timeLeft=");
        d11.append(l11);
        d11.append(", isProcessing=");
        d11.append(bool);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
