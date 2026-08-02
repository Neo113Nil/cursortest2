package ru.ozon.app.android.account.orders.buttonv2.data;

import Kk.C3532b;
import T7.P;
import Ve.C4636t5;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/data/ActionButtonV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isEnabled", "", "deeplink", "action", "Lru/ozon/app/android/account/orders/buttonv2/data/ActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/account/orders/buttonv2/data/ActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "()Z", "getDeeplink", "getAction", "()Lru/ozon/app/android/account/orders/buttonv2/data/ActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionButtonV2DTO {
    public static final int $stable = 8;
    private final ActionDTO action;
    private final String deeplink;
    private final boolean isEnabled;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ActionButtonV2DTO(@NotNull String title, boolean z11, String str, ActionDTO actionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.isEnabled = z11;
        this.deeplink = str;
        this.action = actionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ActionButtonV2DTO copy$default(ActionButtonV2DTO actionButtonV2DTO, String str, boolean z11, String str2, ActionDTO actionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionButtonV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            z11 = actionButtonV2DTO.isEnabled;
        }
        if ((i11 & 4) != 0) {
            str2 = actionButtonV2DTO.deeplink;
        }
        if ((i11 & 8) != 0) {
            actionDTO = actionButtonV2DTO.action;
        }
        if ((i11 & 16) != 0) {
            map = actionButtonV2DTO.trackingInfo;
        }
        Map map2 = map;
        String str3 = str2;
        return actionButtonV2DTO.copy(str, z11, str3, actionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final ActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ActionButtonV2DTO copy(@NotNull String title, boolean isEnabled, String deeplink, ActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ActionButtonV2DTO(title, isEnabled, deeplink, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionButtonV2DTO)) {
            return false;
        }
        ActionButtonV2DTO actionButtonV2DTO = (ActionButtonV2DTO) other;
        return Intrinsics.d(this.title, actionButtonV2DTO.title) && this.isEnabled == actionButtonV2DTO.isEnabled && Intrinsics.d(this.deeplink, actionButtonV2DTO.deeplink) && Intrinsics.d(this.action, actionButtonV2DTO.action) && Intrinsics.d(this.trackingInfo, actionButtonV2DTO.trackingInfo);
    }

    public final ActionDTO getAction() {
        return this.action;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.title.hashCode() * 31, 31, this.isEnabled);
        String str = this.deeplink;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        ActionDTO actionDTO = this.action;
        int hashCode2 = (hashCode + (actionDTO == null ? 0 : actionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        boolean z11 = this.isEnabled;
        String str2 = this.deeplink;
        ActionDTO actionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = C4636t5.b("ActionButtonV2DTO(title=", str, ", isEnabled=", ", deeplink=", z11);
        b11.append(str2);
        b11.append(", action=");
        b11.append(actionDTO);
        b11.append(", trackingInfo=");
        return P.f(b11, map, ")");
    }

    public /* synthetic */ ActionButtonV2DTO(String str, boolean z11, String str2, ActionDTO actionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, str2, actionDTO, (i11 & 16) != 0 ? null : map);
    }
}
