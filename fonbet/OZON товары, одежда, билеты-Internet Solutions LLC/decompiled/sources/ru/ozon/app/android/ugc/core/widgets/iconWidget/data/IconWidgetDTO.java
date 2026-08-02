package ru.ozon.app.android.ugc.core.widgets.iconWidget.data;

import C.o0;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001;B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u009c\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00132\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010'\u001a\u0004\b\u0012\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%¨\u0006<"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "alignment", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;", "backgroundColor", "isSticky", "", "scrollColor", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/util/Map;Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getTrackingInfo", "()Ljava/util/Map;", "getAlignment", "()Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;", "getBackgroundColor", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScrollColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/util/Map;Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO;", "equals", "other", "hashCode", "", "toString", "Alignment", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IconWidgetDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Alignment alignment;
    private final String backgroundColor;

    @EnumNullFallback
    private final Paddings bottomPadding;

    @NotNull
    private final IconDTO icon;
    private final Boolean isSticky;

    @EnumNullFallback
    private final Paddings leftPadding;

    @EnumNullFallback
    private final Paddings rightPadding;
    private final String scrollColor;

    @EnumNullFallback
    private final Paddings topPadding;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "CENTER", "LEFT", "RIGHT", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class Alignment {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment CENTER = new Alignment("CENTER", 0);
        public static final Alignment LEFT = new Alignment("LEFT", 1);
        public static final Alignment RIGHT = new Alignment("RIGHT", 2);

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{CENTER, LEFT, RIGHT};
        }

        static {
            Alignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Alignment(String str, int i11) {
        }

        @NotNull
        public static a<Alignment> getEntries() {
            return $ENTRIES;
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public IconWidgetDTO(@NotNull IconDTO icon, AtomActionDTO atomActionDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Map<String, TokenizedTrackingInfo> map, Alignment alignment, String str, Boolean bool, String str2) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.icon = icon;
        this.action = atomActionDTO;
        this.topPadding = paddings;
        this.bottomPadding = paddings2;
        this.leftPadding = paddings3;
        this.rightPadding = paddings4;
        this.trackingInfo = map;
        this.alignment = alignment;
        this.backgroundColor = str;
        this.isSticky = bool;
        this.scrollColor = str2;
    }

    public static /* synthetic */ IconWidgetDTO copy$default(IconWidgetDTO iconWidgetDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Map map, Alignment alignment, String str, Boolean bool, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = iconWidgetDTO.icon;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = iconWidgetDTO.action;
        }
        if ((i11 & 4) != 0) {
            paddings = iconWidgetDTO.topPadding;
        }
        if ((i11 & 8) != 0) {
            paddings2 = iconWidgetDTO.bottomPadding;
        }
        if ((i11 & 16) != 0) {
            paddings3 = iconWidgetDTO.leftPadding;
        }
        if ((i11 & 32) != 0) {
            paddings4 = iconWidgetDTO.rightPadding;
        }
        if ((i11 & 64) != 0) {
            map = iconWidgetDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            alignment = iconWidgetDTO.alignment;
        }
        if ((i11 & 256) != 0) {
            str = iconWidgetDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool = iconWidgetDTO.isSticky;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str2 = iconWidgetDTO.scrollColor;
        }
        Boolean bool2 = bool;
        String str3 = str2;
        Alignment alignment2 = alignment;
        String str4 = str;
        Paddings paddings5 = paddings4;
        Map map2 = map;
        Paddings paddings6 = paddings3;
        Paddings paddings7 = paddings;
        return iconWidgetDTO.copy(iconDTO, atomActionDTO, paddings7, paddings2, paddings6, paddings5, map2, alignment2, str4, bool2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component11, reason: from getter */
    public final String getScrollColor() {
        return this.scrollColor;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final IconWidgetDTO copy(@NotNull IconDTO icon, AtomActionDTO action, Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding, Map<String, TokenizedTrackingInfo> trackingInfo, Alignment alignment, String backgroundColor, Boolean isSticky, String scrollColor) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new IconWidgetDTO(icon, action, topPadding, bottomPadding, leftPadding, rightPadding, trackingInfo, alignment, backgroundColor, isSticky, scrollColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconWidgetDTO)) {
            return false;
        }
        IconWidgetDTO iconWidgetDTO = (IconWidgetDTO) other;
        return Intrinsics.d(this.icon, iconWidgetDTO.icon) && Intrinsics.d(this.action, iconWidgetDTO.action) && this.topPadding == iconWidgetDTO.topPadding && this.bottomPadding == iconWidgetDTO.bottomPadding && this.leftPadding == iconWidgetDTO.leftPadding && this.rightPadding == iconWidgetDTO.rightPadding && Intrinsics.d(this.trackingInfo, iconWidgetDTO.trackingInfo) && this.alignment == iconWidgetDTO.alignment && Intrinsics.d(this.backgroundColor, iconWidgetDTO.backgroundColor) && Intrinsics.d(this.isSticky, iconWidgetDTO.isSticky) && Intrinsics.d(this.scrollColor, iconWidgetDTO.scrollColor);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final String getScrollColor() {
        return this.scrollColor;
    }

    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Paddings paddings = this.topPadding;
        int hashCode3 = (hashCode2 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.bottomPadding;
        int hashCode4 = (hashCode3 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.leftPadding;
        int hashCode5 = (hashCode4 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.rightPadding;
        int hashCode6 = (hashCode5 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int hashCode8 = (hashCode7 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isSticky;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.scrollColor;
        return hashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        Paddings paddings3 = this.leftPadding;
        Paddings paddings4 = this.rightPadding;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Alignment alignment = this.alignment;
        String str = this.backgroundColor;
        Boolean bool = this.isSticky;
        String str2 = this.scrollColor;
        StringBuilder sb2 = new StringBuilder("IconWidgetDTO(icon=");
        sb2.append(iconDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", topPadding=");
        Lh.a.e(sb2, paddings, ", bottomPadding=", paddings2, ", leftPadding=");
        Lh.a.e(sb2, paddings3, ", rightPadding=", paddings4, ", trackingInfo=");
        sb2.append(map);
        sb2.append(", alignment=");
        sb2.append(alignment);
        sb2.append(", backgroundColor=");
        Sh.a.d(bool, str, ", isSticky=", ", scrollColor=", sb2);
        return o0.c(sb2, str2, ")");
    }

    public /* synthetic */ IconWidgetDTO(IconDTO iconDTO, AtomActionDTO atomActionDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Map map, Alignment alignment, String str, Boolean bool, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iconDTO, atomActionDTO, paddings, paddings2, paddings3, paddings4, map, alignment, str, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? Boolean.FALSE : bool, str2);
    }
}
