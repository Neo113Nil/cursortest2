package ru.ozon.app.android.storefront.widgets.megaRaffle.data;

import G.g;
import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/storefront/widgets/megaRaffle/data/ActionProgressDTO;", "", "background", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "items", "", "Lru/ozon/app/android/storefront/widgets/megaRaffle/data/ProgressItemDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Ljava/util/Map;)V", "getBackground", "()Ljava/lang/String;", "getHeader", "()Lru/ozon/app/android/storefront/widgets/megaRaffle/data/HeaderDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActionProgressDTO {
    public static final int $stable = 8;

    @NotNull
    private final AtomActionDTO action;
    private final String background;
    private final HeaderDTO header;

    @NotNull
    private final List<ProgressItemDTO> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ActionProgressDTO(String str, HeaderDTO headerDTO, @NotNull AtomActionDTO action, @NotNull List<ProgressItemDTO> items, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(items, "items");
        this.background = str;
        this.header = headerDTO;
        this.action = action;
        this.items = items;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ActionProgressDTO copy$default(ActionProgressDTO actionProgressDTO, String str, HeaderDTO headerDTO, AtomActionDTO atomActionDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionProgressDTO.background;
        }
        if ((i11 & 2) != 0) {
            headerDTO = actionProgressDTO.header;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = actionProgressDTO.action;
        }
        if ((i11 & 8) != 0) {
            list = actionProgressDTO.items;
        }
        if ((i11 & 16) != 0) {
            map = actionProgressDTO.trackingInfo;
        }
        Map map2 = map;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return actionProgressDTO.copy(str, headerDTO, atomActionDTO2, list, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackground() {
        return this.background;
    }

    /* renamed from: component2, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<ProgressItemDTO> component4() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final ActionProgressDTO copy(String background, HeaderDTO header, @NotNull AtomActionDTO action, @NotNull List<ProgressItemDTO> items, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ActionProgressDTO(background, header, action, items, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionProgressDTO)) {
            return false;
        }
        ActionProgressDTO actionProgressDTO = (ActionProgressDTO) other;
        return Intrinsics.d(this.background, actionProgressDTO.background) && Intrinsics.d(this.header, actionProgressDTO.header) && Intrinsics.d(this.action, actionProgressDTO.action) && Intrinsics.d(this.items, actionProgressDTO.items) && Intrinsics.d(this.trackingInfo, actionProgressDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackground() {
        return this.background;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<ProgressItemDTO> getItems() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.background;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HeaderDTO headerDTO = this.header;
        int b11 = g.b(a.b(this.action, (hashCode + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31, 31), 31, this.items);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.background;
        HeaderDTO headerDTO = this.header;
        AtomActionDTO atomActionDTO = this.action;
        List<ProgressItemDTO> list = this.items;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ActionProgressDTO(background=");
        sb2.append(str);
        sb2.append(", header=");
        sb2.append(headerDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
