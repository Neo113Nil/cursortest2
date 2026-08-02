package ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation;

import De.C2859b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "SummaryVO", "HeaderVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalExpandedVO implements c {

    @NotNull
    private final ButtonV3DTO button;
    private final long id;

    @NotNull
    private final SummaryVO summary;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderVO {
        private final TextDTO title;

        public HeaderVO(TextDTO textDTO) {
            this.title = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderVO) && Intrinsics.d(this.title, ((HeaderVO) other).title);
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            if (textDTO == null) {
                return 0;
            }
            return textDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return "HeaderVO(title=" + this.title + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$SummaryVO;", "", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "totalItems", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO$HeaderVO;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "getTotalItems", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SummaryVO {
        private final HeaderVO header;
        private final CheckoutCellListDTO totalItems;

        public SummaryVO(HeaderVO headerVO, CheckoutCellListDTO checkoutCellListDTO) {
            this.header = headerVO;
            this.totalItems = checkoutCellListDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryVO)) {
                return false;
            }
            SummaryVO summaryVO = (SummaryVO) other;
            return Intrinsics.d(this.header, summaryVO.header) && Intrinsics.d(this.totalItems, summaryVO.totalItems);
        }

        public final HeaderVO getHeader() {
            return this.header;
        }

        public final CheckoutCellListDTO getTotalItems() {
            return this.totalItems;
        }

        public int hashCode() {
            HeaderVO headerVO = this.header;
            int hashCode = (headerVO == null ? 0 : headerVO.hashCode()) * 31;
            CheckoutCellListDTO checkoutCellListDTO = this.totalItems;
            return hashCode + (checkoutCellListDTO != null ? checkoutCellListDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SummaryVO(header=" + this.header + ", totalItems=" + this.totalItems + ")";
        }
    }

    public TotalExpandedVO(long j11, @NotNull SummaryVO summary, @NotNull ButtonV3DTO button, t tVar) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.summary = summary;
        this.button = button;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalExpandedVO)) {
            return false;
        }
        TotalExpandedVO totalExpandedVO = (TotalExpandedVO) other;
        return this.id == totalExpandedVO.id && Intrinsics.d(this.summary, totalExpandedVO.summary) && Intrinsics.d(this.button, totalExpandedVO.button) && Intrinsics.d(this.tokenizedEvent, totalExpandedVO.tokenizedEvent);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
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
    public final SummaryVO getSummary() {
        return this.summary;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, (this.summary.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        return c11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "TotalExpandedVO(id=" + this.id + ", summary=" + this.summary + ", button=" + this.button + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}
