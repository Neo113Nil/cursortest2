package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject;

import B90.C2616s;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b,\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/SectionVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/badge/Badge;", "status", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "description", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProductVO;", "products", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;", "statusProvider", "buttons", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;", "paymentInfo", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/TimerVO;", DynamicElementDTO.TIMER, "", "showTimer", "Lru/ozon/uni/atoms/data/text/TextDTO;", "deliveryInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;Ljava/util/List;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/TimerVO;ZLru/ozon/uni/atoms/data/text/TextDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/uni/atoms/data/badge/Badge;", "getStatus", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Ljava/util/List;", "getDescription", "()Ljava/util/List;", "getProducts", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;", "getStatusProvider", "()Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;", "getButtons", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;", "getPaymentInfo", "()Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/TimerVO;", "getTimer", "()Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/TimerVO;", "Z", "getShowTimer", "()Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeliveryInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SectionVO {
    private final List<AtomDTO> buttons;
    private final TextDTO deliveryInfo;
    private final List<AtomDTO> description;
    private final PaymentVO paymentInfo;
    private final List<ProductVO> products;
    private final boolean showTimer;
    private final Badge status;
    private final StatusProviderVO statusProvider;
    private final TimerVO timer;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public SectionVO(String str, Badge badge, List<? extends AtomDTO> list, List<ProductVO> list2, StatusProviderVO statusProviderVO, List<? extends AtomDTO> list3, PaymentVO paymentVO, TimerVO timerVO, boolean z11, TextDTO textDTO) {
        this.title = str;
        this.status = badge;
        this.description = list;
        this.products = list2;
        this.statusProvider = statusProviderVO;
        this.buttons = list3;
        this.paymentInfo = paymentVO;
        this.timer = timerVO;
        this.showTimer = z11;
        this.deliveryInfo = textDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionVO)) {
            return false;
        }
        SectionVO sectionVO = (SectionVO) other;
        return Intrinsics.d(this.title, sectionVO.title) && Intrinsics.d(this.status, sectionVO.status) && Intrinsics.d(this.description, sectionVO.description) && Intrinsics.d(this.products, sectionVO.products) && Intrinsics.d(this.statusProvider, sectionVO.statusProvider) && Intrinsics.d(this.buttons, sectionVO.buttons) && Intrinsics.d(this.paymentInfo, sectionVO.paymentInfo) && Intrinsics.d(this.timer, sectionVO.timer) && this.showTimer == sectionVO.showTimer && Intrinsics.d(this.deliveryInfo, sectionVO.deliveryInfo);
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public final TextDTO getDeliveryInfo() {
        return this.deliveryInfo;
    }

    public final List<AtomDTO> getDescription() {
        return this.description;
    }

    public final PaymentVO getPaymentInfo() {
        return this.paymentInfo;
    }

    public final List<ProductVO> getProducts() {
        return this.products;
    }

    public final boolean getShowTimer() {
        return this.showTimer;
    }

    public final Badge getStatus() {
        return this.status;
    }

    public final StatusProviderVO getStatusProvider() {
        return this.statusProvider;
    }

    public final TimerVO getTimer() {
        return this.timer;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Badge badge = this.status;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        List<AtomDTO> list = this.description;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProductVO> list2 = this.products;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        StatusProviderVO statusProviderVO = this.statusProvider;
        int hashCode5 = (hashCode4 + (statusProviderVO == null ? 0 : statusProviderVO.hashCode())) * 31;
        List<AtomDTO> list3 = this.buttons;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        PaymentVO paymentVO = this.paymentInfo;
        int hashCode7 = (hashCode6 + (paymentVO == null ? 0 : paymentVO.hashCode())) * 31;
        TimerVO timerVO = this.timer;
        int a11 = C3532b.a((hashCode7 + (timerVO == null ? 0 : timerVO.hashCode())) * 31, 31, this.showTimer);
        TextDTO textDTO = this.deliveryInfo;
        return a11 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        Badge badge = this.status;
        List<AtomDTO> list = this.description;
        List<ProductVO> list2 = this.products;
        StatusProviderVO statusProviderVO = this.statusProvider;
        List<AtomDTO> list3 = this.buttons;
        PaymentVO paymentVO = this.paymentInfo;
        TimerVO timerVO = this.timer;
        boolean z11 = this.showTimer;
        TextDTO textDTO = this.deliveryInfo;
        StringBuilder sb2 = new StringBuilder("SectionVO(title=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(badge);
        sb2.append(", description=");
        C2616s.g(", products=", ", statusProvider=", sb2, list, list2);
        sb2.append(statusProviderVO);
        sb2.append(", buttons=");
        sb2.append(list3);
        sb2.append(", paymentInfo=");
        sb2.append(paymentVO);
        sb2.append(", timer=");
        sb2.append(timerVO);
        sb2.append(", showTimer=");
        sb2.append(z11);
        sb2.append(", deliveryInfo=");
        sb2.append(textDTO);
        sb2.append(")");
        return sb2.toString();
    }
}
