package ru.ozon.android.messenger.blocks.coupon;

import G.g;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/android/messenger/blocks/coupon/RightPartDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RightPartDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;
    private final TextAtom title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public RightPartDTO(TextAtom textAtom, AtomActionDTO atomActionDTO, @NotNull String backgroundColor, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = textAtom;
        this.action = atomActionDTO;
        this.backgroundColor = backgroundColor;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RightPartDTO copy$default(RightPartDTO rightPartDTO, TextAtom textAtom, AtomActionDTO atomActionDTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = rightPartDTO.title;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = rightPartDTO.action;
        }
        if ((i11 & 4) != 0) {
            str = rightPartDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            map = rightPartDTO.trackingInfo;
        }
        return rightPartDTO.copy(textAtom, atomActionDTO, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, MessengerTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final RightPartDTO copy(TextAtom title, AtomActionDTO action, @NotNull String backgroundColor, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new RightPartDTO(title, action, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RightPartDTO)) {
            return false;
        }
        RightPartDTO rightPartDTO = (RightPartDTO) other;
        return Intrinsics.d(this.title, rightPartDTO.title) && Intrinsics.d(this.action, rightPartDTO.action) && Intrinsics.d(this.backgroundColor, rightPartDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, rightPartDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextAtom textAtom = this.title;
        int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int a11 = g.a((hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.backgroundColor);
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return a11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.backgroundColor;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("RightPartDTO(title=");
        sb2.append(textAtom);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
