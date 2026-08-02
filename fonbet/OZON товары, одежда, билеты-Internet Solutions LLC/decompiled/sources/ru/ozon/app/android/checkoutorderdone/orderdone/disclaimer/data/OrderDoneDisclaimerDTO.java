package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.data;

import B90.C2619v;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jk\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/OrderDoneDisclaimerDTO;", "", "icon", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Icon;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "backgroundColor", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Timer;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Icon;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Timer;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Icon;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "getTimer", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/data/Timer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDoneDisclaimerDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final List<ButtonDTO> buttons;

    @NotNull
    private final Icon icon;

    @NotNull
    private final TextAtom subtitle;
    private final Timer timer;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderDoneDisclaimerDTO(@NotNull Icon icon, TextAtom textAtom, @NotNull TextAtom subtitle, String str, List<ButtonDTO> list, Timer timer, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.icon = icon;
        this.title = textAtom;
        this.subtitle = subtitle;
        this.backgroundColor = str;
        this.buttons = list;
        this.timer = timer;
        this.trackingInfo = map;
    }

    public static /* synthetic */ OrderDoneDisclaimerDTO copy$default(OrderDoneDisclaimerDTO orderDoneDisclaimerDTO, Icon icon, TextAtom textAtom, TextAtom textAtom2, String str, List list, Timer timer, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            icon = orderDoneDisclaimerDTO.icon;
        }
        if ((i11 & 2) != 0) {
            textAtom = orderDoneDisclaimerDTO.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = orderDoneDisclaimerDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            str = orderDoneDisclaimerDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            list = orderDoneDisclaimerDTO.buttons;
        }
        if ((i11 & 32) != 0) {
            timer = orderDoneDisclaimerDTO.timer;
        }
        if ((i11 & 64) != 0) {
            map = orderDoneDisclaimerDTO.trackingInfo;
        }
        Timer timer2 = timer;
        Map map2 = map;
        List list2 = list;
        TextAtom textAtom3 = textAtom2;
        return orderDoneDisclaimerDTO.copy(icon, textAtom, textAtom3, str, list2, timer2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonDTO> component5() {
        return this.buttons;
    }

    /* renamed from: component6, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final OrderDoneDisclaimerDTO copy(@NotNull Icon icon, TextAtom title, @NotNull TextAtom subtitle, String backgroundColor, List<ButtonDTO> buttons, Timer timer, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new OrderDoneDisclaimerDTO(icon, title, subtitle, backgroundColor, buttons, timer, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDoneDisclaimerDTO)) {
            return false;
        }
        OrderDoneDisclaimerDTO orderDoneDisclaimerDTO = (OrderDoneDisclaimerDTO) other;
        return Intrinsics.d(this.icon, orderDoneDisclaimerDTO.icon) && Intrinsics.d(this.title, orderDoneDisclaimerDTO.title) && Intrinsics.d(this.subtitle, orderDoneDisclaimerDTO.subtitle) && Intrinsics.d(this.backgroundColor, orderDoneDisclaimerDTO.backgroundColor) && Intrinsics.d(this.buttons, orderDoneDisclaimerDTO.buttons) && Intrinsics.d(this.timer, orderDoneDisclaimerDTO.timer) && Intrinsics.d(this.trackingInfo, orderDoneDisclaimerDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        TextAtom textAtom = this.title;
        int b11 = C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.subtitle);
        String str = this.backgroundColor;
        int hashCode2 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        List<ButtonDTO> list = this.buttons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Timer timer = this.timer;
        int hashCode4 = (hashCode3 + (timer == null ? 0 : timer.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Icon icon = this.icon;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        String str = this.backgroundColor;
        List<ButtonDTO> list = this.buttons;
        Timer timer = this.timer;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("OrderDoneDisclaimerDTO(icon=");
        sb2.append(icon);
        sb2.append(", title=");
        sb2.append(textAtom);
        sb2.append(", subtitle=");
        sb2.append(textAtom2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", buttons=");
        sb2.append(list);
        sb2.append(", timer=");
        sb2.append(timer);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
