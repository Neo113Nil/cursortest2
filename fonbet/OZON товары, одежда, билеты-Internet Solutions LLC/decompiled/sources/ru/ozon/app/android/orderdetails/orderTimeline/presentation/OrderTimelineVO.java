package ru.ozon.app.android.orderdetails.orderTimeline.presentation;

import B0.C2454a;
import B90.C2619v;
import Bl.C2639a;
import Nh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTimeline/presentation/OrderTimelineVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "", "dotRes", "Lru/ozon/uni/core/UniColors;", "lineColor", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;ILru/ozon/uni/core/UniColors;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getSubtitle", "getAddress", "I", "getDotRes", "Lru/ozon/uni/core/UniColors;", "getLineColor", "()Lru/ozon/uni/core/UniColors;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderTimelineVO implements c {
    public static final int $stable = TextAtom.$stable;
    private final String address;
    private final int dotRes;
    private final long id;

    @NotNull
    private final UniColors lineColor;
    private final String subtitle;

    @NotNull
    private final TextAtom title;

    public OrderTimelineVO(long j11, @NotNull TextAtom title, String str, String str2, int i11, @NotNull UniColors lineColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(lineColor, "lineColor");
        this.id = j11;
        this.title = title;
        this.subtitle = str;
        this.address = str2;
        this.dotRes = i11;
        this.lineColor = lineColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderTimelineVO)) {
            return false;
        }
        OrderTimelineVO orderTimelineVO = (OrderTimelineVO) other;
        return this.id == orderTimelineVO.id && Intrinsics.d(this.title, orderTimelineVO.title) && Intrinsics.d(this.subtitle, orderTimelineVO.subtitle) && Intrinsics.d(this.address, orderTimelineVO.address) && this.dotRes == orderTimelineVO.dotRes && this.lineColor == orderTimelineVO.lineColor;
    }

    public final String getAddress() {
        return this.address;
    }

    public final int getDotRes() {
        return this.dotRes;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final UniColors getLineColor() {
        return this.lineColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        return this.lineColor.hashCode() + C2454a.a(this.dotRes, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.title;
        String str = this.subtitle;
        String str2 = this.address;
        int i11 = this.dotRes;
        UniColors uniColors = this.lineColor;
        StringBuilder c11 = C2639a.c("OrderTimelineVO(id=", j11, ", title=", textAtom);
        a.h(c11, ", subtitle=", str, ", address=", str2);
        c11.append(", dotRes=");
        c11.append(i11);
        c11.append(", lineColor=");
        c11.append(uniColors);
        c11.append(")");
        return c11.toString();
    }
}
