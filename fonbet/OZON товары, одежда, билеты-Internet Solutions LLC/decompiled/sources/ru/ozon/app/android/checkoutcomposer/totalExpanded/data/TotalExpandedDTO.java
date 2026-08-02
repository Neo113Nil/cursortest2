package ru.ozon.app.android.checkoutcomposer.totalExpanded.data;

import De.C2859b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO;", "", FormPageDTO.Field.FIELD_TYPE_SUMMARY, "Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$SummaryDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$SummaryDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getSummary", "()Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$SummaryDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SummaryDTO", "HeaderDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TotalExpandedDTO {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final SummaryDTO summary;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$HeaderDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        public static final int $stable = 0;
        private final TextDTO title;

        public HeaderDTO(TextDTO textDTO) {
            this.title = textDTO;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = headerDTO.title;
            }
            return headerDTO.copy(textDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final HeaderDTO copy(TextDTO title) {
            return new HeaderDTO(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderDTO) && Intrinsics.d(this.title, ((HeaderDTO) other).title);
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
            return "HeaderDTO(title=" + this.title + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$SummaryDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$HeaderDTO;", "totalItems", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$HeaderDTO;Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)V", "getHeader", "()Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO$HeaderDTO;", "getTotalItems", "()Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SummaryDTO {
        public static final int $stable = 8;
        private final HeaderDTO header;
        private final CheckoutCellListDTO totalItems;

        public SummaryDTO(HeaderDTO headerDTO, CheckoutCellListDTO checkoutCellListDTO) {
            this.header = headerDTO;
            this.totalItems = checkoutCellListDTO;
        }

        public static /* synthetic */ SummaryDTO copy$default(SummaryDTO summaryDTO, HeaderDTO headerDTO, CheckoutCellListDTO checkoutCellListDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                headerDTO = summaryDTO.header;
            }
            if ((i11 & 2) != 0) {
                checkoutCellListDTO = summaryDTO.totalItems;
            }
            return summaryDTO.copy(headerDTO, checkoutCellListDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final HeaderDTO getHeader() {
            return this.header;
        }

        /* renamed from: component2, reason: from getter */
        public final CheckoutCellListDTO getTotalItems() {
            return this.totalItems;
        }

        @NotNull
        public final SummaryDTO copy(HeaderDTO header, CheckoutCellListDTO totalItems) {
            return new SummaryDTO(header, totalItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryDTO)) {
                return false;
            }
            SummaryDTO summaryDTO = (SummaryDTO) other;
            return Intrinsics.d(this.header, summaryDTO.header) && Intrinsics.d(this.totalItems, summaryDTO.totalItems);
        }

        public final HeaderDTO getHeader() {
            return this.header;
        }

        public final CheckoutCellListDTO getTotalItems() {
            return this.totalItems;
        }

        public int hashCode() {
            HeaderDTO headerDTO = this.header;
            int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
            CheckoutCellListDTO checkoutCellListDTO = this.totalItems;
            return hashCode + (checkoutCellListDTO != null ? checkoutCellListDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SummaryDTO(header=" + this.header + ", totalItems=" + this.totalItems + ")";
        }
    }

    public TotalExpandedDTO(@NotNull SummaryDTO summary, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        this.summary = summary;
        this.button = button;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TotalExpandedDTO copy$default(TotalExpandedDTO totalExpandedDTO, SummaryDTO summaryDTO, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            summaryDTO = totalExpandedDTO.summary;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = totalExpandedDTO.button;
        }
        if ((i11 & 4) != 0) {
            map = totalExpandedDTO.trackingInfo;
        }
        return totalExpandedDTO.copy(summaryDTO, buttonV3DTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SummaryDTO getSummary() {
        return this.summary;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final TotalExpandedDTO copy(@NotNull SummaryDTO summary, @NotNull ButtonV3DTO button, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(button, "button");
        return new TotalExpandedDTO(summary, button, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalExpandedDTO)) {
            return false;
        }
        TotalExpandedDTO totalExpandedDTO = (TotalExpandedDTO) other;
        return Intrinsics.d(this.summary, totalExpandedDTO.summary) && Intrinsics.d(this.button, totalExpandedDTO.button) && Intrinsics.d(this.trackingInfo, totalExpandedDTO.trackingInfo);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final SummaryDTO getSummary() {
        return this.summary;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C2859b.c(this.button, this.summary.hashCode() * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        SummaryDTO summaryDTO = this.summary;
        ButtonV3DTO buttonV3DTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("TotalExpandedDTO(summary=");
        sb2.append(summaryDTO);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
