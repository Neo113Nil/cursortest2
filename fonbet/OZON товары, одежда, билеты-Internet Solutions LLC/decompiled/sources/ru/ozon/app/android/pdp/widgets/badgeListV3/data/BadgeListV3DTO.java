package ru.ozon.app.android.pdp.widgets.badgeListV3.data;

import GR.b;
import Pk0.h;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.saleBadge.data.SaleBadgeDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeListV3/data/BadgeListV3DTO;", "", "badges", "", "spacedBy", "Lru/ozon/uni/atoms/data/common/Paddings;", "inset", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBadges", "()Ljava/util/List;", "getSpacedBy", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getInset", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeListV3DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<Object> badges;

    @NotNull
    private final Paddings inset;

    @NotNull
    private final Paddings spacedBy;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BadgeListV3DTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "dsBadge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "saleBadge", type = SaleBadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> badges, @NotNull Paddings spacedBy, @NotNull Paddings inset, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(spacedBy, "spacedBy");
        Intrinsics.checkNotNullParameter(inset, "inset");
        this.badges = badges;
        this.spacedBy = spacedBy;
        this.inset = inset;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ BadgeListV3DTO copy$default(BadgeListV3DTO badgeListV3DTO, List list, Paddings paddings, Paddings paddings2, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = badgeListV3DTO.badges;
        }
        if ((i11 & 2) != 0) {
            paddings = badgeListV3DTO.spacedBy;
        }
        if ((i11 & 4) != 0) {
            paddings2 = badgeListV3DTO.inset;
        }
        if ((i11 & 8) != 0) {
            map = badgeListV3DTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            testInfo = badgeListV3DTO.testInfo;
        }
        TestInfo testInfo2 = testInfo;
        Paddings paddings3 = paddings2;
        return badgeListV3DTO.copy(list, paddings, paddings3, map, testInfo2);
    }

    @NotNull
    public final List<Object> component1() {
        return this.badges;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getSpacedBy() {
        return this.spacedBy;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Paddings getInset() {
        return this.inset;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final BadgeListV3DTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "dsBadge", type = BadgeDTO.class), @ProtoOneOfSignature(name = "saleBadge", type = SaleBadgeDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> badges, @NotNull Paddings spacedBy, @NotNull Paddings inset, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(spacedBy, "spacedBy");
        Intrinsics.checkNotNullParameter(inset, "inset");
        return new BadgeListV3DTO(badges, spacedBy, inset, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeListV3DTO)) {
            return false;
        }
        BadgeListV3DTO badgeListV3DTO = (BadgeListV3DTO) other;
        return Intrinsics.d(this.badges, badgeListV3DTO.badges) && this.spacedBy == badgeListV3DTO.spacedBy && this.inset == badgeListV3DTO.inset && Intrinsics.d(this.trackingInfo, badgeListV3DTO.trackingInfo) && Intrinsics.d(this.testInfo, badgeListV3DTO.testInfo);
    }

    @NotNull
    public final List<Object> getBadges() {
        return this.badges;
    }

    @NotNull
    public final Paddings getInset() {
        return this.inset;
    }

    @NotNull
    public final Paddings getSpacedBy() {
        return this.spacedBy;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = b.b(this.inset, b.b(this.spacedBy, this.badges.hashCode() * 31, 31), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (b11 + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Object> list = this.badges;
        Paddings paddings = this.spacedBy;
        Paddings paddings2 = this.inset;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("BadgeListV3DTO(badges=");
        sb2.append(list);
        sb2.append(", spacedBy=");
        sb2.append(paddings);
        sb2.append(", inset=");
        sb2.append(paddings2);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        return h.c(sb2, testInfo, ")");
    }

    public /* synthetic */ BadgeListV3DTO(List list, Paddings paddings, Paddings paddings2, Map map, TestInfo testInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? Paddings.PADDING_200 : paddings, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings2, map, testInfo);
    }
}
