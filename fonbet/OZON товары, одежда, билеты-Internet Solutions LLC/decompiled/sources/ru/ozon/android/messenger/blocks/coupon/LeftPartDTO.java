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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/android/messenger/blocks/coupon/LeftPartDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "backgroundColor", "", "backgroundImage", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundImage", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class LeftPartDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;
    private final String backgroundImage;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, MessengerTrackingInfo> trackingInfo;

    public LeftPartDTO(@NotNull TextAtom title, TextAtom textAtom, AtomActionDTO atomActionDTO, @NotNull String backgroundColor, String str, Map<String, MessengerTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.title = title;
        this.subtitle = textAtom;
        this.action = atomActionDTO;
        this.backgroundColor = backgroundColor;
        this.backgroundImage = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ LeftPartDTO copy$default(LeftPartDTO leftPartDTO, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = leftPartDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = leftPartDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = leftPartDTO.action;
        }
        if ((i11 & 8) != 0) {
            str = leftPartDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            str2 = leftPartDTO.backgroundImage;
        }
        if ((i11 & 32) != 0) {
            map = leftPartDTO.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        return leftPartDTO.copy(textAtom, textAtom2, atomActionDTO, str, str3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Map<String, MessengerTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final LeftPartDTO copy(@NotNull TextAtom title, TextAtom subtitle, AtomActionDTO action, @NotNull String backgroundColor, String backgroundImage, Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new LeftPartDTO(title, subtitle, action, backgroundColor, backgroundImage, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeftPartDTO)) {
            return false;
        }
        LeftPartDTO leftPartDTO = (LeftPartDTO) other;
        return Intrinsics.d(this.title, leftPartDTO.title) && Intrinsics.d(this.subtitle, leftPartDTO.subtitle) && Intrinsics.d(this.action, leftPartDTO.action) && Intrinsics.d(this.backgroundColor, leftPartDTO.backgroundColor) && Intrinsics.d(this.backgroundImage, leftPartDTO.backgroundImage) && Intrinsics.d(this.trackingInfo, leftPartDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextAtom textAtom = this.subtitle;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int a11 = g.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.backgroundColor);
        String str = this.backgroundImage;
        int hashCode3 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.backgroundColor;
        String str2 = this.backgroundImage;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder a11 = HY.a.a("LeftPartDTO(title=", textAtom, ", subtitle=", textAtom2, ", action=");
        HY.b.d(", backgroundColor=", str, ", backgroundImage=", a11, atomActionDTO);
        return C4070a.a(a11, str2, ", trackingInfo=", map, ")");
    }
}
