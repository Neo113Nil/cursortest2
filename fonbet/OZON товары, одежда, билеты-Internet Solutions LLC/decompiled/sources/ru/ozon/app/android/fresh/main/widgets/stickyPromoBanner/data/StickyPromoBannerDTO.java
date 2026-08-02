package ru.ozon.app.android.fresh.main.widgets.stickyPromoBanner.data;

import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerDTO;", "", "animationURL", "", "position", "Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerDTO$Position;", "closeIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerDTO$Position;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAnimationURL", "()Ljava/lang/String;", "getPosition", "()Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerDTO$Position;", "getCloseIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Position", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StickyPromoBannerDTO {

    @NotNull
    private final String animationURL;
    private final AtomActionDTO clickAction;
    private final IconButtonV3DTO closeIconButton;

    @EnumNullFallback
    @NotNull
    private final Position position;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/stickyPromoBanner/data/StickyPromoBannerDTO$Position;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_LEFT", "POSITION_CENTER", "POSITION_RIGHT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Position {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;

        @i(name = "POSITION_LEFT")
        public static final Position POSITION_LEFT = new Position("POSITION_LEFT", 0);

        @i(name = "POSITION_CENTER")
        public static final Position POSITION_CENTER = new Position("POSITION_CENTER", 1);

        @i(name = "POSITION_RIGHT")
        public static final Position POSITION_RIGHT = new Position("POSITION_RIGHT", 2);

        private static final /* synthetic */ Position[] $values() {
            return new Position[]{POSITION_LEFT, POSITION_CENTER, POSITION_RIGHT};
        }

        static {
            Position[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Position(String str, int i11) {
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public StickyPromoBannerDTO(@NotNull String animationURL, @NotNull Position position, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(animationURL, "animationURL");
        Intrinsics.checkNotNullParameter(position, "position");
        this.animationURL = animationURL;
        this.position = position;
        this.closeIconButton = iconButtonV3DTO;
        this.clickAction = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ StickyPromoBannerDTO copy$default(StickyPromoBannerDTO stickyPromoBannerDTO, String str, Position position, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stickyPromoBannerDTO.animationURL;
        }
        if ((i11 & 2) != 0) {
            position = stickyPromoBannerDTO.position;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = stickyPromoBannerDTO.closeIconButton;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = stickyPromoBannerDTO.clickAction;
        }
        if ((i11 & 16) != 0) {
            map = stickyPromoBannerDTO.trackingInfo;
        }
        Map map2 = map;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        return stickyPromoBannerDTO.copy(str, position, iconButtonV3DTO2, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAnimationURL() {
        return this.animationURL;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Position getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getCloseIconButton() {
        return this.closeIconButton;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final StickyPromoBannerDTO copy(@NotNull String animationURL, @NotNull Position position, IconButtonV3DTO closeIconButton, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(animationURL, "animationURL");
        Intrinsics.checkNotNullParameter(position, "position");
        return new StickyPromoBannerDTO(animationURL, position, closeIconButton, clickAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyPromoBannerDTO)) {
            return false;
        }
        StickyPromoBannerDTO stickyPromoBannerDTO = (StickyPromoBannerDTO) other;
        return Intrinsics.d(this.animationURL, stickyPromoBannerDTO.animationURL) && this.position == stickyPromoBannerDTO.position && Intrinsics.d(this.closeIconButton, stickyPromoBannerDTO.closeIconButton) && Intrinsics.d(this.clickAction, stickyPromoBannerDTO.clickAction) && Intrinsics.d(this.trackingInfo, stickyPromoBannerDTO.trackingInfo);
    }

    @NotNull
    public final String getAnimationURL() {
        return this.animationURL;
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final IconButtonV3DTO getCloseIconButton() {
        return this.closeIconButton;
    }

    @NotNull
    public final Position getPosition() {
        return this.position;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.position.hashCode() + (this.animationURL.hashCode() * 31)) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeIconButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.animationURL;
        Position position = this.position;
        IconButtonV3DTO iconButtonV3DTO = this.closeIconButton;
        AtomActionDTO atomActionDTO = this.clickAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("StickyPromoBannerDTO(animationURL=");
        sb2.append(str);
        sb2.append(", position=");
        sb2.append(position);
        sb2.append(", closeIconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", clickAction=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ StickyPromoBannerDTO(String str, Position position, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? Position.POSITION_RIGHT : position, iconButtonV3DTO, atomActionDTO, map);
    }
}
