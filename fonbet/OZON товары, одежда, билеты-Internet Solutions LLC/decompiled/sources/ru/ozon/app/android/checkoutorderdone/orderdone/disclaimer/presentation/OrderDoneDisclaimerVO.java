package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimer.presentation;

import Ak.b;
import B90.C2619v;
import Bl.C2639a;
import G.g;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/OrderDoneDisclaimerVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/IconVO;", "icon", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "backgroundColor", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", DynamicElementDTO.TIMER, "", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "buttons", "LWZ/t;", "trackingEvent", "<init>", "(JLru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/IconVO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;Ljava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/IconVO;", "getIcon", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/IconVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", "getTimer", "()Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimer/presentation/TimerVO;", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "LWZ/t;", "getTrackingEvent", "()LWZ/t;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OrderDoneDisclaimerVO implements c {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<ButtonDTO> buttons;

    @NotNull
    private final IconVO icon;
    private final long id;

    @NotNull
    private final TextAtom subtitle;
    private final TimerVO timer;
    private final TextAtom title;
    private final t trackingEvent;

    public OrderDoneDisclaimerVO(long j11, @NotNull IconVO icon, TextAtom textAtom, @NotNull TextAtom subtitle, @NotNull String backgroundColor, TimerVO timerVO, @NotNull List<ButtonDTO> buttons, t tVar) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.icon = icon;
        this.title = textAtom;
        this.subtitle = subtitle;
        this.backgroundColor = backgroundColor;
        this.timer = timerVO;
        this.buttons = buttons;
        this.trackingEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDoneDisclaimerVO)) {
            return false;
        }
        OrderDoneDisclaimerVO orderDoneDisclaimerVO = (OrderDoneDisclaimerVO) other;
        return this.id == orderDoneDisclaimerVO.id && Intrinsics.d(this.icon, orderDoneDisclaimerVO.icon) && Intrinsics.d(this.title, orderDoneDisclaimerVO.title) && Intrinsics.d(this.subtitle, orderDoneDisclaimerVO.subtitle) && Intrinsics.d(this.backgroundColor, orderDoneDisclaimerVO.backgroundColor) && Intrinsics.d(this.timer, orderDoneDisclaimerVO.timer) && Intrinsics.d(this.buttons, orderDoneDisclaimerVO.buttons) && Intrinsics.d(this.trackingEvent, orderDoneDisclaimerVO.trackingEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<ButtonDTO> getButtons() {
        return this.buttons;
    }

    @NotNull
    public final IconVO getIcon() {
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
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TimerVO getTimer() {
        return this.timer;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final t getTrackingEvent() {
        return this.trackingEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.icon.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TextAtom textAtom = this.title;
        int a11 = g.a(C2619v.b((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.subtitle), 31, this.backgroundColor);
        TimerVO timerVO = this.timer;
        int b11 = g.b((a11 + (timerVO == null ? 0 : timerVO.hashCode())) * 31, 31, this.buttons);
        t tVar = this.trackingEvent;
        return b11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconVO iconVO = this.icon;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        String str = this.backgroundColor;
        TimerVO timerVO = this.timer;
        List<ButtonDTO> list = this.buttons;
        t tVar = this.trackingEvent;
        StringBuilder sb2 = new StringBuilder("OrderDoneDisclaimerVO(id=");
        sb2.append(j11);
        sb2.append(", icon=");
        sb2.append(iconVO);
        C2639a.e(", title=", ", subtitle=", sb2, textAtom, textAtom2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", timer=");
        sb2.append(timerVO);
        b.h(sb2, ", buttons=", list, ", trackingEvent=", tVar);
        sb2.append(")");
        return sb2.toString();
    }
}
