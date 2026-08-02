package ru.ozon.app.android.storefront.widgets.naviBlocksV3.data;

import G.g;
import Nh.a;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jo\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockV3DTO;", "", "icon", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getIcon", "()Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/BlockIconV3DTO;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlockV3DTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final CornerRadius cornerRadius;

    @NotNull
    private final BlockIconV3DTO icon;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public BlockV3DTO(@NotNull BlockIconV3DTO icon, @NotNull String title, @NotNull String subtitle, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, OnBoardingDTO onBoardingDTO, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.backgroundColor = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.onboarding = onBoardingDTO;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ BlockV3DTO copy$default(BlockV3DTO blockV3DTO, BlockIconV3DTO blockIconV3DTO, String str, String str2, String str3, AtomActionDTO atomActionDTO, Map map, OnBoardingDTO onBoardingDTO, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            blockIconV3DTO = blockV3DTO.icon;
        }
        if ((i11 & 2) != 0) {
            str = blockV3DTO.title;
        }
        if ((i11 & 4) != 0) {
            str2 = blockV3DTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            str3 = blockV3DTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = blockV3DTO.action;
        }
        if ((i11 & 32) != 0) {
            map = blockV3DTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            onBoardingDTO = blockV3DTO.onboarding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cornerRadius = blockV3DTO.cornerRadius;
        }
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        CornerRadius cornerRadius2 = cornerRadius;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return blockV3DTO.copy(blockIconV3DTO, str, str2, str3, atomActionDTO2, map2, onBoardingDTO2, cornerRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlockIconV3DTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component8, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final BlockV3DTO copy(@NotNull BlockIconV3DTO icon, @NotNull String title, @NotNull String subtitle, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, OnBoardingDTO onboarding, CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new BlockV3DTO(icon, title, subtitle, backgroundColor, action, trackingInfo, onboarding, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockV3DTO)) {
            return false;
        }
        BlockV3DTO blockV3DTO = (BlockV3DTO) other;
        return Intrinsics.d(this.icon, blockV3DTO.icon) && Intrinsics.d(this.title, blockV3DTO.title) && Intrinsics.d(this.subtitle, blockV3DTO.subtitle) && Intrinsics.d(this.backgroundColor, blockV3DTO.backgroundColor) && Intrinsics.d(this.action, blockV3DTO.action) && Intrinsics.d(this.trackingInfo, blockV3DTO.trackingInfo) && Intrinsics.d(this.onboarding, blockV3DTO.onboarding) && this.cornerRadius == blockV3DTO.cornerRadius;
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final BlockIconV3DTO getIcon() {
        return this.icon;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode4 = (hashCode3 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        return hashCode4 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BlockIconV3DTO blockIconV3DTO = this.icon;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder sb2 = new StringBuilder("BlockV3DTO(icon=");
        sb2.append(blockIconV3DTO);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        a.h(sb2, str2, ", backgroundColor=", str3, ", action=");
        b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(")");
        return sb2.toString();
    }
}
