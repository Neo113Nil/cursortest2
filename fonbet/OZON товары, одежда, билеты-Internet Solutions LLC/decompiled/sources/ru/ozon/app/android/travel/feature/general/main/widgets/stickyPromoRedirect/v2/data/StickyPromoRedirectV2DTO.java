package ru.ozon.app.android.travel.feature.general.main.widgets.stickyPromoRedirect.v2.data;

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
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001 B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO;", "", "animationURL", "", "position", "Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO$Position;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO$Position;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAnimationURL", "()Ljava/lang/String;", "getPosition", "()Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO$Position;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Position", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StickyPromoRedirectV2DTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;

    @NotNull
    private final String animationURL;

    @EnumNullFallback
    @NotNull
    private final Position position;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/stickyPromoRedirect/v2/data/StickyPromoRedirectV2DTO$Position;", "", "<init>", "(Ljava/lang/String;I)V", "POSITION_LEFT", "POSITION_CENTER", "POSITION_RIGHT", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public StickyPromoRedirectV2DTO(@NotNull String animationURL, @NotNull Position position, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(animationURL, "animationURL");
        Intrinsics.checkNotNullParameter(position, "position");
        this.animationURL = animationURL;
        this.position = position;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StickyPromoRedirectV2DTO copy$default(StickyPromoRedirectV2DTO stickyPromoRedirectV2DTO, String str, Position position, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = stickyPromoRedirectV2DTO.animationURL;
        }
        if ((i11 & 2) != 0) {
            position = stickyPromoRedirectV2DTO.position;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO = stickyPromoRedirectV2DTO.action;
        }
        if ((i11 & 8) != 0) {
            map = stickyPromoRedirectV2DTO.trackingInfo;
        }
        return stickyPromoRedirectV2DTO.copy(str, position, atomActionDTO, map);
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
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final StickyPromoRedirectV2DTO copy(@NotNull String animationURL, @NotNull Position position, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(animationURL, "animationURL");
        Intrinsics.checkNotNullParameter(position, "position");
        return new StickyPromoRedirectV2DTO(animationURL, position, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyPromoRedirectV2DTO)) {
            return false;
        }
        StickyPromoRedirectV2DTO stickyPromoRedirectV2DTO = (StickyPromoRedirectV2DTO) other;
        return Intrinsics.d(this.animationURL, stickyPromoRedirectV2DTO.animationURL) && this.position == stickyPromoRedirectV2DTO.position && Intrinsics.d(this.action, stickyPromoRedirectV2DTO.action) && Intrinsics.d(this.trackingInfo, stickyPromoRedirectV2DTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getAnimationURL() {
        return this.animationURL;
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
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.animationURL;
        Position position = this.position;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("StickyPromoRedirectV2DTO(animationURL=");
        sb2.append(str);
        sb2.append(", position=");
        sb2.append(position);
        sb2.append(", action=");
        return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
    }

    public /* synthetic */ StickyPromoRedirectV2DTO(String str, Position position, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? Position.POSITION_RIGHT : position, atomActionDTO, map);
    }
}
