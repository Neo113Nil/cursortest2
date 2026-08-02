package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data;

import D3.g;
import El.C2971a;
import F3.G;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;", "", "miniappTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "timeDeliveryTitle", "addressTitle", "miniappIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "timeDeliveryIcon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getMiniappTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTimeDeliveryTitle", "getAddressTitle", "getMiniappIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getTimeDeliveryIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshMiniappHeaderDTO {
    private final AtomActionDTO action;

    @NotNull
    private final TextDTO addressTitle;

    @NotNull
    private final IconDTO miniappIcon;

    @NotNull
    private final TextDTO miniappTitle;
    private final IconDTO timeDeliveryIcon;

    @NotNull
    private final TextDTO timeDeliveryTitle;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public FreshMiniappHeaderDTO(@NotNull TextDTO miniappTitle, @NotNull TextDTO timeDeliveryTitle, @NotNull TextDTO addressTitle, @NotNull IconDTO miniappIcon, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(miniappTitle, "miniappTitle");
        Intrinsics.checkNotNullParameter(timeDeliveryTitle, "timeDeliveryTitle");
        Intrinsics.checkNotNullParameter(addressTitle, "addressTitle");
        Intrinsics.checkNotNullParameter(miniappIcon, "miniappIcon");
        this.miniappTitle = miniappTitle;
        this.timeDeliveryTitle = timeDeliveryTitle;
        this.addressTitle = addressTitle;
        this.miniappIcon = miniappIcon;
        this.timeDeliveryIcon = iconDTO;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FreshMiniappHeaderDTO copy$default(FreshMiniappHeaderDTO freshMiniappHeaderDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, IconDTO iconDTO, IconDTO iconDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = freshMiniappHeaderDTO.miniappTitle;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = freshMiniappHeaderDTO.timeDeliveryTitle;
        }
        if ((i11 & 4) != 0) {
            textDTO3 = freshMiniappHeaderDTO.addressTitle;
        }
        if ((i11 & 8) != 0) {
            iconDTO = freshMiniappHeaderDTO.miniappIcon;
        }
        if ((i11 & 16) != 0) {
            iconDTO2 = freshMiniappHeaderDTO.timeDeliveryIcon;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = freshMiniappHeaderDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = freshMiniappHeaderDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        IconDTO iconDTO3 = iconDTO2;
        TextDTO textDTO4 = textDTO3;
        return freshMiniappHeaderDTO.copy(textDTO, textDTO2, textDTO4, iconDTO, iconDTO3, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getMiniappTitle() {
        return this.miniappTitle;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTimeDeliveryTitle() {
        return this.timeDeliveryTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getAddressTitle() {
        return this.addressTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final IconDTO getMiniappIcon() {
        return this.miniappIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final IconDTO getTimeDeliveryIcon() {
        return this.timeDeliveryIcon;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final FreshMiniappHeaderDTO copy(@NotNull TextDTO miniappTitle, @NotNull TextDTO timeDeliveryTitle, @NotNull TextDTO addressTitle, @NotNull IconDTO miniappIcon, IconDTO timeDeliveryIcon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(miniappTitle, "miniappTitle");
        Intrinsics.checkNotNullParameter(timeDeliveryTitle, "timeDeliveryTitle");
        Intrinsics.checkNotNullParameter(addressTitle, "addressTitle");
        Intrinsics.checkNotNullParameter(miniappIcon, "miniappIcon");
        return new FreshMiniappHeaderDTO(miniappTitle, timeDeliveryTitle, addressTitle, miniappIcon, timeDeliveryIcon, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshMiniappHeaderDTO)) {
            return false;
        }
        FreshMiniappHeaderDTO freshMiniappHeaderDTO = (FreshMiniappHeaderDTO) other;
        return Intrinsics.d(this.miniappTitle, freshMiniappHeaderDTO.miniappTitle) && Intrinsics.d(this.timeDeliveryTitle, freshMiniappHeaderDTO.timeDeliveryTitle) && Intrinsics.d(this.addressTitle, freshMiniappHeaderDTO.addressTitle) && Intrinsics.d(this.miniappIcon, freshMiniappHeaderDTO.miniappIcon) && Intrinsics.d(this.timeDeliveryIcon, freshMiniappHeaderDTO.timeDeliveryIcon) && Intrinsics.d(this.action, freshMiniappHeaderDTO.action) && Intrinsics.d(this.trackingInfo, freshMiniappHeaderDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TextDTO getAddressTitle() {
        return this.addressTitle;
    }

    @NotNull
    public final IconDTO getMiniappIcon() {
        return this.miniappIcon;
    }

    @NotNull
    public final TextDTO getMiniappTitle() {
        return this.miniappTitle;
    }

    public final IconDTO getTimeDeliveryIcon() {
        return this.timeDeliveryIcon;
    }

    @NotNull
    public final TextDTO getTimeDeliveryTitle() {
        return this.timeDeliveryTitle;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C2971a.a(this.miniappIcon, b.a(this.addressTitle, b.a(this.timeDeliveryTitle, this.miniappTitle.hashCode() * 31, 31), 31), 31);
        IconDTO iconDTO = this.timeDeliveryIcon;
        int hashCode = (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.miniappTitle;
        TextDTO textDTO2 = this.timeDeliveryTitle;
        TextDTO textDTO3 = this.addressTitle;
        IconDTO iconDTO = this.miniappIcon;
        IconDTO iconDTO2 = this.timeDeliveryIcon;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = g.g("FreshMiniappHeaderDTO(miniappTitle=", textDTO, ", timeDeliveryTitle=", textDTO2, ", addressTitle=");
        G.f(g10, textDTO3, ", miniappIcon=", iconDTO, ", timeDeliveryIcon=");
        g10.append(iconDTO2);
        g10.append(", action=");
        g10.append(atomActionDTO);
        g10.append(", trackingInfo=");
        return P.f(g10, map, ")");
    }
}
