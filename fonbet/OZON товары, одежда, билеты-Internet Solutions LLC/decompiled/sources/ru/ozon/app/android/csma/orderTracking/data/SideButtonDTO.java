package ru.ozon.app.android.csma.orderTracking.data;

import Ih.a;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/SideButtonDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SideButtonDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final IconDTO icon;
    private final TextDTO text;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SideButtonDTO(@NotNull IconDTO icon, @NotNull AtomActionDTO action, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.icon = icon;
        this.action = action;
        this.text = textDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SideButtonDTO copy$default(SideButtonDTO sideButtonDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, TextDTO textDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = sideButtonDTO.icon;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = sideButtonDTO.action;
        }
        if ((i11 & 4) != 0) {
            textDTO = sideButtonDTO.text;
        }
        if ((i11 & 8) != 0) {
            map = sideButtonDTO.trackingInfo;
        }
        return sideButtonDTO.copy(iconDTO, atomActionDTO, textDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final SideButtonDTO copy(@NotNull IconDTO icon, @NotNull AtomActionDTO action, TextDTO text, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        return new SideButtonDTO(icon, action, text, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SideButtonDTO)) {
            return false;
        }
        SideButtonDTO sideButtonDTO = (SideButtonDTO) other;
        return Intrinsics.d(this.icon, sideButtonDTO.icon) && Intrinsics.d(this.action, sideButtonDTO.action) && Intrinsics.d(this.text, sideButtonDTO.text) && Intrinsics.d(this.trackingInfo, sideButtonDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = a.b(this.action, this.icon.hashCode() * 31, 31);
        TextDTO textDTO = this.text;
        int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SideButtonDTO(icon=" + this.icon + ", action=" + this.action + ", text=" + this.text + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
