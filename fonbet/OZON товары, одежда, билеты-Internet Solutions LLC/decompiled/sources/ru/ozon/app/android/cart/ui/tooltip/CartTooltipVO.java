package ru.ozon.app.android.cart.ui.tooltip;

import B0.C2454a;
import D3.g;
import Kk.C3532b;
import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b\r\u0010/R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b0\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b6\u00107R\"\u00108\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u0010/\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b=\u0010/\"\u0004\b>\u0010;¨\u0006?"}, d2 = {"Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle;", "style", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "beakPosition", "", "minWidth", "maxWidth", "", "isExpanded", "leftMargin", "rightMargin", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle;Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;ILjava/lang/Integer;ZIILru/ozon/uni/atoms/data/TestInfo;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle;", "getStyle", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipStyle;", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "getBeakPosition", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipBeakPosition;", "I", "getMinWidth", "Ljava/lang/Integer;", "getMaxWidth", "()Ljava/lang/Integer;", "Z", "()Z", "getLeftMargin", "getRightMargin", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "needShow", "getNeedShow", "setNeedShow", "(Z)V", "hideByTouchOutside", "getHideByTouchOutside", "setHideByTouchOutside", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartTooltipVO {

    @NotNull
    private final CartTooltipBeakPosition beakPosition;
    private boolean hideByTouchOutside;
    private final boolean isExpanded;
    private final int leftMargin;
    private final Integer maxWidth;
    private final int minWidth;
    private boolean needShow;
    private final int rightMargin;

    @NotNull
    private final CartTooltipStyle style;
    private final TextDTO subtitle;
    private final TestInfo testInfo;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CartTooltipVO(@NotNull TextDTO title, TextDTO textDTO, @NotNull CartTooltipStyle style, @NotNull CartTooltipBeakPosition beakPosition, int i11, Integer num, boolean z11, int i12, int i13, TestInfo testInfo, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        this.title = title;
        this.subtitle = textDTO;
        this.style = style;
        this.beakPosition = beakPosition;
        this.minWidth = i11;
        this.maxWidth = num;
        this.isExpanded = z11;
        this.leftMargin = i12;
        this.rightMargin = i13;
        this.testInfo = testInfo;
        this.trackingInfo = map;
        this.needShow = true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTooltipVO)) {
            return false;
        }
        CartTooltipVO cartTooltipVO = (CartTooltipVO) other;
        return Intrinsics.d(this.title, cartTooltipVO.title) && Intrinsics.d(this.subtitle, cartTooltipVO.subtitle) && Intrinsics.d(this.style, cartTooltipVO.style) && Intrinsics.d(this.beakPosition, cartTooltipVO.beakPosition) && this.minWidth == cartTooltipVO.minWidth && Intrinsics.d(this.maxWidth, cartTooltipVO.maxWidth) && this.isExpanded == cartTooltipVO.isExpanded && this.leftMargin == cartTooltipVO.leftMargin && this.rightMargin == cartTooltipVO.rightMargin && Intrinsics.d(this.testInfo, cartTooltipVO.testInfo) && Intrinsics.d(this.trackingInfo, cartTooltipVO.trackingInfo);
    }

    @NotNull
    public final CartTooltipBeakPosition getBeakPosition() {
        return this.beakPosition;
    }

    public final boolean getHideByTouchOutside() {
        return this.hideByTouchOutside;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final boolean getNeedShow() {
        return this.needShow;
    }

    public final int getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    public final CartTooltipStyle getStyle() {
        return this.style;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
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
        int a11 = C2454a.a(this.minWidth, (this.beakPosition.hashCode() + ((this.style.hashCode() + ((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31)) * 31, 31);
        Integer num = this.maxWidth;
        int a12 = C2454a.a(this.rightMargin, C2454a.a(this.leftMargin, C3532b.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.isExpanded), 31), 31);
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (a12 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final void setHideByTouchOutside(boolean z11) {
        this.hideByTouchOutside = z11;
    }

    public final void setNeedShow(boolean z11) {
        this.needShow = z11;
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        CartTooltipStyle cartTooltipStyle = this.style;
        CartTooltipBeakPosition cartTooltipBeakPosition = this.beakPosition;
        int i11 = this.minWidth;
        Integer num = this.maxWidth;
        boolean z11 = this.isExpanded;
        int i12 = this.leftMargin;
        int i13 = this.rightMargin;
        TestInfo testInfo = this.testInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("CartTooltipVO(title=", textDTO, ", subtitle=", textDTO2, ", style=");
        g10.append(cartTooltipStyle);
        g10.append(", beakPosition=");
        g10.append(cartTooltipBeakPosition);
        g10.append(", minWidth=");
        g10.append(i11);
        g10.append(", maxWidth=");
        g10.append(num);
        g10.append(", isExpanded=");
        g10.append(z11);
        g10.append(", leftMargin=");
        g10.append(i12);
        g10.append(", rightMargin=");
        g10.append(i13);
        g10.append(", testInfo=");
        g10.append(testInfo);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
