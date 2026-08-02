package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation;

import Ak.C2436a;
import B90.C2619v;
import G.g;
import Lh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusVO;", "Ll20/c;", "", "id", "", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;", DynamicElementDTO.TIMER, "", "isProcessing", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;Ljava/lang/Boolean;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getSubtitle", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;", "getTimer", "()Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/Timer;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDonePaymentStatusVO implements c {
    private final String icon;
    private final long id;
    private final Boolean isProcessing;

    @NotNull
    private final List<TextAtom> subtitle;
    private final Timer timer;

    @NotNull
    private final TextAtom title;
    private final t tokenizedEvent;

    public OrderDonePaymentStatusVO(long j11, String str, @NotNull TextAtom title, @NotNull List<TextAtom> subtitle, Timer timer, Boolean bool, t tVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.id = j11;
        this.icon = str;
        this.title = title;
        this.subtitle = subtitle;
        this.timer = timer;
        this.isProcessing = bool;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDonePaymentStatusVO)) {
            return false;
        }
        OrderDonePaymentStatusVO orderDonePaymentStatusVO = (OrderDonePaymentStatusVO) other;
        return this.id == orderDonePaymentStatusVO.id && Intrinsics.d(this.icon, orderDonePaymentStatusVO.icon) && Intrinsics.d(this.title, orderDonePaymentStatusVO.title) && Intrinsics.d(this.subtitle, orderDonePaymentStatusVO.subtitle) && Intrinsics.d(this.timer, orderDonePaymentStatusVO.timer) && Intrinsics.d(this.isProcessing, orderDonePaymentStatusVO.isProcessing) && Intrinsics.d(this.tokenizedEvent, orderDonePaymentStatusVO.tokenizedEvent);
    }

    public final String getIcon() {
        return this.icon;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TextAtom> getSubtitle() {
        return this.subtitle;
    }

    public final Timer getTimer() {
        return this.timer;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.icon;
        int b11 = g.b(C2619v.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.subtitle);
        Timer timer = this.timer;
        int hashCode2 = (b11 + (timer == null ? 0 : timer.hashCode())) * 31;
        Boolean bool = this.isProcessing;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isProcessing, reason: from getter */
    public final Boolean getIsProcessing() {
        return this.isProcessing;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.icon;
        TextAtom textAtom = this.title;
        List<TextAtom> list = this.subtitle;
        Timer timer = this.timer;
        Boolean bool = this.isProcessing;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "OrderDonePaymentStatusVO(id=", ", icon=", str);
        c11.append(", title=");
        c11.append(textAtom);
        c11.append(", subtitle=");
        c11.append(list);
        c11.append(", timer=");
        c11.append(timer);
        c11.append(", isProcessing=");
        c11.append(bool);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
