package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonetotal.presentation;

import B0.C2454a;
import Ns.b;
import TY.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b,\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b0\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010\u001dR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b;\u0010\u001dR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b?\u0010>R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\b@\u0010\u001b¨\u0006A"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/OrderDoneTotalElement;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;", "titleTooltip", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "atomPrice", "subtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "button", "", "separatorColor", "", "paddingLeft", "titlePaddingTop", "subtitlePaddingTop", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topCornerRadius", "bottomCornerRadius", "backgroundColor", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Ljava/lang/String;Ljava/lang/Integer;IILru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;", "getTitleTooltip", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonetotal/presentation/TooltipVO;", "getPrice", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getAtomPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "Ljava/lang/String;", "getSeparatorColor", "Ljava/lang/Integer;", "getPaddingLeft", "()Ljava/lang/Integer;", "I", "getTitlePaddingTop", "getSubtitlePaddingTop", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottomCornerRadius", "getBackgroundColor", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDoneTotalElement implements c {
    private final PriceDTO atomPrice;
    private final String backgroundColor;

    @NotNull
    private final CornerRadius bottomCornerRadius;
    private final ButtonDTO button;
    private final long id;
    private final Integer paddingLeft;
    private final TextDTO price;
    private final String separatorColor;
    private final TextDTO subtitle;
    private final int subtitlePaddingTop;

    @NotNull
    private final TextDTO title;
    private final int titlePaddingTop;
    private final TooltipVO titleTooltip;

    @NotNull
    private final CornerRadius topCornerRadius;

    public OrderDoneTotalElement(long j11, @NotNull TextDTO title, TooltipVO tooltipVO, TextDTO textDTO, PriceDTO priceDTO, TextDTO textDTO2, ButtonDTO buttonDTO, String str, Integer num, int i11, int i12, @NotNull CornerRadius topCornerRadius, @NotNull CornerRadius bottomCornerRadius, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(bottomCornerRadius, "bottomCornerRadius");
        this.id = j11;
        this.title = title;
        this.titleTooltip = tooltipVO;
        this.price = textDTO;
        this.atomPrice = priceDTO;
        this.subtitle = textDTO2;
        this.button = buttonDTO;
        this.separatorColor = str;
        this.paddingLeft = num;
        this.titlePaddingTop = i11;
        this.subtitlePaddingTop = i12;
        this.topCornerRadius = topCornerRadius;
        this.bottomCornerRadius = bottomCornerRadius;
        this.backgroundColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDoneTotalElement)) {
            return false;
        }
        OrderDoneTotalElement orderDoneTotalElement = (OrderDoneTotalElement) other;
        return this.id == orderDoneTotalElement.id && Intrinsics.d(this.title, orderDoneTotalElement.title) && Intrinsics.d(this.titleTooltip, orderDoneTotalElement.titleTooltip) && Intrinsics.d(this.price, orderDoneTotalElement.price) && Intrinsics.d(this.atomPrice, orderDoneTotalElement.atomPrice) && Intrinsics.d(this.subtitle, orderDoneTotalElement.subtitle) && Intrinsics.d(this.button, orderDoneTotalElement.button) && Intrinsics.d(this.separatorColor, orderDoneTotalElement.separatorColor) && Intrinsics.d(this.paddingLeft, orderDoneTotalElement.paddingLeft) && this.titlePaddingTop == orderDoneTotalElement.titlePaddingTop && this.subtitlePaddingTop == orderDoneTotalElement.subtitlePaddingTop && this.topCornerRadius == orderDoneTotalElement.topCornerRadius && this.bottomCornerRadius == orderDoneTotalElement.bottomCornerRadius && Intrinsics.d(this.backgroundColor, orderDoneTotalElement.backgroundColor);
    }

    public final PriceDTO getAtomPrice() {
        return this.atomPrice;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getBottomCornerRadius() {
        return this.bottomCornerRadius;
    }

    public final ButtonDTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Integer getPaddingLeft() {
        return this.paddingLeft;
    }

    public final TextDTO getPrice() {
        return this.price;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final int getSubtitlePaddingTop() {
        return this.subtitlePaddingTop;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final int getTitlePaddingTop() {
        return this.titlePaddingTop;
    }

    public final TooltipVO getTitleTooltip() {
        return this.titleTooltip;
    }

    @NotNull
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        TooltipVO tooltipVO = this.titleTooltip;
        int hashCode = (a11 + (tooltipVO == null ? 0 : tooltipVO.hashCode())) * 31;
        TextDTO textDTO = this.price;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        PriceDTO priceDTO = this.atomPrice;
        int hashCode3 = (hashCode2 + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
        TextDTO textDTO2 = this.subtitle;
        int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        ButtonDTO buttonDTO = this.button;
        int hashCode5 = (hashCode4 + (buttonDTO == null ? 0 : buttonDTO.hashCode())) * 31;
        String str = this.separatorColor;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.paddingLeft;
        int b11 = Tl.b.b(this.bottomCornerRadius, Tl.b.b(this.topCornerRadius, C2454a.a(this.subtitlePaddingTop, C2454a.a(this.titlePaddingTop, (hashCode6 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        String str2 = this.backgroundColor;
        return b11 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TooltipVO tooltipVO = this.titleTooltip;
        TextDTO textDTO2 = this.price;
        PriceDTO priceDTO = this.atomPrice;
        TextDTO textDTO3 = this.subtitle;
        ButtonDTO buttonDTO = this.button;
        String str = this.separatorColor;
        Integer num = this.paddingLeft;
        int i11 = this.titlePaddingTop;
        int i12 = this.subtitlePaddingTop;
        CornerRadius cornerRadius = this.topCornerRadius;
        CornerRadius cornerRadius2 = this.bottomCornerRadius;
        String str2 = this.backgroundColor;
        StringBuilder b11 = a.b("OrderDoneTotalElement(id=", j11, ", title=", textDTO);
        b11.append(", titleTooltip=");
        b11.append(tooltipVO);
        b11.append(", price=");
        b11.append(textDTO2);
        b11.append(", atomPrice=");
        b11.append(priceDTO);
        b11.append(", subtitle=");
        b11.append(textDTO3);
        b11.append(", button=");
        b11.append(buttonDTO);
        b11.append(", separatorColor=");
        b11.append(str);
        b11.append(", paddingLeft=");
        b11.append(num);
        b11.append(", titlePaddingTop=");
        b11.append(i11);
        b11.append(", subtitlePaddingTop=");
        b11.append(i12);
        b11.append(", topCornerRadius=");
        b11.append(cornerRadius);
        b11.append(", bottomCornerRadius=");
        b11.append(cornerRadius2);
        b11.append(", backgroundColor=");
        b11.append(str2);
        b11.append(")");
        return b11.toString();
    }
}
