package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data;

import B0.C2454a;
import Cm.e;
import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,Bk\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0003Jz\u0010&\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\rHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListDTO;", "", "items", "", "requiredLastBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "horizontalScrollEnabled", "", "maxLines", "", "isUpdateRequired", "asyncParameters", "", "", "trackingInfo", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;IZLjava/util/Map;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getRequiredLastBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getHorizontalScrollEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxLines", "()I", "()Z", "getAsyncParameters", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;IZLjava/util/Map;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListDTO;", "equals", "other", "hashCode", "toString", "Skeleton", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BadgeListDTO {
    public static final int $stable = 8;
    private final Map<String, Object> asyncParameters;
    private final Boolean horizontalScrollEnabled;
    private final boolean isUpdateRequired;

    @NotNull
    private final List<Object> items;
    private final int maxLines;
    private final BadgeDTO requiredLastBadge;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListDTO$Skeleton;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Skeleton {
        public static final int $stable = 0;
        private final int height;
        private final int width;

        public Skeleton(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }

        public static /* synthetic */ Skeleton copy$default(Skeleton skeleton, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = skeleton.width;
            }
            if ((i13 & 2) != 0) {
                i12 = skeleton.height;
            }
            return skeleton.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final Skeleton copy(int width, int height) {
            return new Skeleton(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Skeleton)) {
                return false;
            }
            Skeleton skeleton = (Skeleton) other;
            return this.width == skeleton.width && this.height == skeleton.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("Skeleton(width=", this.width, ", height=", ")", this.height);
        }
    }

    public BadgeListDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "skeleton", type = Skeleton.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, BadgeDTO badgeDTO, Boolean bool, int i11, boolean z11, Map<String, ? extends Object> map, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.requiredLastBadge = badgeDTO;
        this.horizontalScrollEnabled = bool;
        this.maxLines = i11;
        this.isUpdateRequired = z11;
        this.asyncParameters = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ BadgeListDTO copy$default(BadgeListDTO badgeListDTO, List list, BadgeDTO badgeDTO, Boolean bool, int i11, boolean z11, Map map, Map map2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = badgeListDTO.items;
        }
        if ((i12 & 2) != 0) {
            badgeDTO = badgeListDTO.requiredLastBadge;
        }
        if ((i12 & 4) != 0) {
            bool = badgeListDTO.horizontalScrollEnabled;
        }
        if ((i12 & 8) != 0) {
            i11 = badgeListDTO.maxLines;
        }
        if ((i12 & 16) != 0) {
            z11 = badgeListDTO.isUpdateRequired;
        }
        if ((i12 & 32) != 0) {
            map = badgeListDTO.asyncParameters;
        }
        if ((i12 & 64) != 0) {
            map2 = badgeListDTO.trackingInfo;
        }
        Map map3 = map;
        Map map4 = map2;
        boolean z12 = z11;
        Boolean bool2 = bool;
        return badgeListDTO.copy(list, badgeDTO, bool2, i11, z12, map3, map4);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getRequiredLastBadge() {
        return this.requiredLastBadge;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getHorizontalScrollEnabled() {
        return this.horizontalScrollEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsUpdateRequired() {
        return this.isUpdateRequired;
    }

    public final Map<String, Object> component6() {
        return this.asyncParameters;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final BadgeListDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "badge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "skeleton", type = Skeleton.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, BadgeDTO requiredLastBadge, Boolean horizontalScrollEnabled, int maxLines, boolean isUpdateRequired, Map<String, ? extends Object> asyncParameters, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new BadgeListDTO(items, requiredLastBadge, horizontalScrollEnabled, maxLines, isUpdateRequired, asyncParameters, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListDTO)) {
            return false;
        }
        BadgeListDTO badgeListDTO = (BadgeListDTO) other;
        return Intrinsics.d(this.items, badgeListDTO.items) && Intrinsics.d(this.requiredLastBadge, badgeListDTO.requiredLastBadge) && Intrinsics.d(this.horizontalScrollEnabled, badgeListDTO.horizontalScrollEnabled) && this.maxLines == badgeListDTO.maxLines && this.isUpdateRequired == badgeListDTO.isUpdateRequired && Intrinsics.d(this.asyncParameters, badgeListDTO.asyncParameters) && Intrinsics.d(this.trackingInfo, badgeListDTO.trackingInfo);
    }

    public final Map<String, Object> getAsyncParameters() {
        return this.asyncParameters;
    }

    public final Boolean getHorizontalScrollEnabled() {
        return this.horizontalScrollEnabled;
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final BadgeDTO getRequiredLastBadge() {
        return this.requiredLastBadge;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        BadgeDTO badgeDTO = this.requiredLastBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Boolean bool = this.horizontalScrollEnabled;
        int a11 = C3532b.a(C2454a.a(this.maxLines, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31, this.isUpdateRequired);
        Map<String, Object> map = this.asyncParameters;
        int hashCode3 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isUpdateRequired() {
        return this.isUpdateRequired;
    }

    @NotNull
    public String toString() {
        List<Object> list = this.items;
        BadgeDTO badgeDTO = this.requiredLastBadge;
        Boolean bool = this.horizontalScrollEnabled;
        int i11 = this.maxLines;
        boolean z11 = this.isUpdateRequired;
        Map<String, Object> map = this.asyncParameters;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("BadgeListDTO(items=");
        sb2.append(list);
        sb2.append(", requiredLastBadge=");
        sb2.append(badgeDTO);
        sb2.append(", horizontalScrollEnabled=");
        sb2.append(bool);
        sb2.append(", maxLines=");
        sb2.append(i11);
        sb2.append(", isUpdateRequired=");
        sb2.append(z11);
        sb2.append(", asyncParameters=");
        sb2.append(map);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BadgeListDTO(List list, BadgeDTO badgeDTO, Boolean bool, int i11, boolean z11, Map map, Map map2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, badgeDTO, bool, i11, r7, r8, r9);
        Map map3;
        Map map4;
        boolean z12;
        i11 = (i12 & 8) != 0 ? 0 : i11;
        if ((i12 & 16) != 0) {
            map3 = map2;
            map4 = map;
            z12 = false;
        } else {
            map3 = map2;
            map4 = map;
            z12 = z11;
        }
    }
}
