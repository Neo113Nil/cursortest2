package ru.ozon.app.android.account.orders.selectPayment.data;

import C.o0;
import Ih.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003JR\u0010\u001c\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/data/PaymentsItemDTO;", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "icon", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "getTrackingInfo", "()Ljava/util/Map;", "getIcon", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)Lru/ozon/app/android/account/orders/selectPayment/data/PaymentsItemDTO;", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentsItemDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final String icon;
    private final Boolean isSelected;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PaymentsItemDTO(Map<String, TokenizedTrackingInfo> map, String str, Boolean bool, @NotNull AtomActionDTO action, @NotNull String title) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        this.trackingInfo = map;
        this.icon = str;
        this.isSelected = bool;
        this.action = action;
        this.title = title;
    }

    public static /* synthetic */ PaymentsItemDTO copy$default(PaymentsItemDTO paymentsItemDTO, Map map, String str, Boolean bool, AtomActionDTO atomActionDTO, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = paymentsItemDTO.trackingInfo;
        }
        if ((i11 & 2) != 0) {
            str = paymentsItemDTO.icon;
        }
        if ((i11 & 4) != 0) {
            bool = paymentsItemDTO.isSelected;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = paymentsItemDTO.action;
        }
        if ((i11 & 16) != 0) {
            str2 = paymentsItemDTO.title;
        }
        String str3 = str2;
        Boolean bool2 = bool;
        return paymentsItemDTO.copy(map, str, bool2, atomActionDTO, str3);
    }

    public final Map<String, TokenizedTrackingInfo> component1() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final PaymentsItemDTO copy(Map<String, TokenizedTrackingInfo> trackingInfo, String icon, Boolean isSelected, @NotNull AtomActionDTO action, @NotNull String title) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(title, "title");
        return new PaymentsItemDTO(trackingInfo, icon, isSelected, action, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsItemDTO)) {
            return false;
        }
        PaymentsItemDTO paymentsItemDTO = (PaymentsItemDTO) other;
        return Intrinsics.d(this.trackingInfo, paymentsItemDTO.trackingInfo) && Intrinsics.d(this.icon, paymentsItemDTO.icon) && Intrinsics.d(this.isSelected, paymentsItemDTO.isSelected) && Intrinsics.d(this.action, paymentsItemDTO.action) && Intrinsics.d(this.title, paymentsItemDTO.title);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSelected;
        return this.title.hashCode() + a.b(this.action, (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str = this.icon;
        Boolean bool = this.isSelected;
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.title;
        StringBuilder sb2 = new StringBuilder("PaymentsItemDTO(trackingInfo=");
        sb2.append(map);
        sb2.append(", icon=");
        sb2.append(str);
        sb2.append(", isSelected=");
        sb2.append(bool);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", title=");
        return o0.c(sb2, str2, ")");
    }
}
