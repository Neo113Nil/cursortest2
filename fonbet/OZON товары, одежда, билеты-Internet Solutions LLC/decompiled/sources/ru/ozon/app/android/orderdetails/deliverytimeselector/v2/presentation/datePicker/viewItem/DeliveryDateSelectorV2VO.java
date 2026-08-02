package ru.ozon.app.android.orderdetails.deliverytimeselector.v2.presentation.datePicker.viewItem;

import Ns.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO$DeliveryDateVO;", "deliveryDates", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getDeliveryDates", "()Ljava/util/List;", "DeliveryDateVO", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryDateSelectorV2VO implements c {

    @NotNull
    private final List<DeliveryDateVO> deliveryDates;
    private final long id;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/orderdetails/deliverytimeselector/v2/presentation/datePicker/viewItem/DeliveryDateSelectorV2VO$DeliveryDateVO;", "", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "wrapper", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getWrapper", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryDateVO {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final AspectDTO wrapper;

        public DeliveryDateVO(@NotNull AspectDTO wrapper, @NotNull TextDTO title, @NotNull TextDTO subtitle) {
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.wrapper = wrapper;
            this.title = title;
            this.subtitle = subtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryDateVO)) {
                return false;
            }
            DeliveryDateVO deliveryDateVO = (DeliveryDateVO) other;
            return Intrinsics.d(this.wrapper, deliveryDateVO.wrapper) && Intrinsics.d(this.title, deliveryDateVO.title) && Intrinsics.d(this.subtitle, deliveryDateVO.subtitle);
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final AspectDTO getWrapper() {
            return this.wrapper;
        }

        public int hashCode() {
            return this.subtitle.hashCode() + b.a(this.title, this.wrapper.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            AspectDTO aspectDTO = this.wrapper;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("DeliveryDateVO(wrapper=");
            sb2.append(aspectDTO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            return Tl.b.e(sb2, textDTO2, ")");
        }
    }

    public DeliveryDateSelectorV2VO(long j11, @NotNull List<DeliveryDateVO> deliveryDates) {
        Intrinsics.checkNotNullParameter(deliveryDates, "deliveryDates");
        this.id = j11;
        this.deliveryDates = deliveryDates;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDateSelectorV2VO)) {
            return false;
        }
        DeliveryDateSelectorV2VO deliveryDateSelectorV2VO = (DeliveryDateSelectorV2VO) other;
        return this.id == deliveryDateSelectorV2VO.id && Intrinsics.d(this.deliveryDates, deliveryDateSelectorV2VO.deliveryDates);
    }

    @NotNull
    public final List<DeliveryDateVO> getDeliveryDates() {
        return this.deliveryDates;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.deliveryDates.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Lh.b.b(this.id, "DeliveryDateSelectorV2VO(id=", ", deliveryDates=", this.deliveryDates);
        b11.append(")");
        return b11.toString();
    }
}
