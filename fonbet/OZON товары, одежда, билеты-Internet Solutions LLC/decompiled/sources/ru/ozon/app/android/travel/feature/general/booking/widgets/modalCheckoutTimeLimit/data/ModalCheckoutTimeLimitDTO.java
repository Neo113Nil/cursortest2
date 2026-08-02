package ru.ozon.app.android.travel.feature.general.booking.widgets.modalCheckoutTimeLimit.data;

import D3.g;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JT\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "timeToPayText", "timeToPay", "", "timeOutAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimeToPayText", "getTimeToPay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeOutAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/booking/widgets/modalCheckoutTimeLimit/data/ModalCheckoutTimeLimitDTO;", "equals", "", "other", "hashCode", "toString", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ModalCheckoutTimeLimitDTO {
    private final AtomActionDTO timeOutAction;
    private final Integer timeToPay;
    private final TextDTO timeToPayText;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ModalCheckoutTimeLimitDTO(@NotNull TextDTO title, TextDTO textDTO, Integer num, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.timeToPayText = textDTO;
        this.timeToPay = num;
        this.timeOutAction = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ModalCheckoutTimeLimitDTO copy$default(ModalCheckoutTimeLimitDTO modalCheckoutTimeLimitDTO, TextDTO textDTO, TextDTO textDTO2, Integer num, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = modalCheckoutTimeLimitDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = modalCheckoutTimeLimitDTO.timeToPayText;
        }
        if ((i11 & 4) != 0) {
            num = modalCheckoutTimeLimitDTO.timeToPay;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = modalCheckoutTimeLimitDTO.timeOutAction;
        }
        if ((i11 & 16) != 0) {
            map = modalCheckoutTimeLimitDTO.trackingInfo;
        }
        Map map2 = map;
        Integer num2 = num;
        return modalCheckoutTimeLimitDTO.copy(textDTO, textDTO2, num2, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTimeToPayText() {
        return this.timeToPayText;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTimeToPay() {
        return this.timeToPay;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getTimeOutAction() {
        return this.timeOutAction;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ModalCheckoutTimeLimitDTO copy(@NotNull TextDTO title, TextDTO timeToPayText, Integer timeToPay, AtomActionDTO timeOutAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ModalCheckoutTimeLimitDTO(title, timeToPayText, timeToPay, timeOutAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalCheckoutTimeLimitDTO)) {
            return false;
        }
        ModalCheckoutTimeLimitDTO modalCheckoutTimeLimitDTO = (ModalCheckoutTimeLimitDTO) other;
        return Intrinsics.d(this.title, modalCheckoutTimeLimitDTO.title) && Intrinsics.d(this.timeToPayText, modalCheckoutTimeLimitDTO.timeToPayText) && Intrinsics.d(this.timeToPay, modalCheckoutTimeLimitDTO.timeToPay) && Intrinsics.d(this.timeOutAction, modalCheckoutTimeLimitDTO.timeOutAction) && Intrinsics.d(this.trackingInfo, modalCheckoutTimeLimitDTO.trackingInfo);
    }

    public final AtomActionDTO getTimeOutAction() {
        return this.timeOutAction;
    }

    public final Integer getTimeToPay() {
        return this.timeToPay;
    }

    public final TextDTO getTimeToPayText() {
        return this.timeToPayText;
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
        TextDTO textDTO = this.timeToPayText;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Integer num = this.timeToPay;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.timeOutAction;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.timeToPayText;
        Integer num = this.timeToPay;
        AtomActionDTO atomActionDTO = this.timeOutAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("ModalCheckoutTimeLimitDTO(title=", textDTO, ", timeToPayText=", textDTO2, ", timeToPay=");
        g10.append(num);
        g10.append(", timeOutAction=");
        g10.append(atomActionDTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
