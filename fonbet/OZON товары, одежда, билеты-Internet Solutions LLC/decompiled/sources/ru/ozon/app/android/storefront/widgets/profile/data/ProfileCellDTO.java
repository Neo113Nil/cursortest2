package ru.ozon.app.android.storefront.widgets.profile.data;

import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/ozon/app/android/storefront/widgets/profile/data/ProfileCellDTO;", "", "dsCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingKey", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/lang/String;Ljava/util/Map;)V", "getDsCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboardingKey", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileCellDTO {
    public static final int $stable = 8;

    @NotNull
    private final CellDTO dsCell;
    private final OnBoardingDTO onboarding;
    private final String onboardingKey;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ProfileCellDTO(@NotNull CellDTO dsCell, OnBoardingDTO onBoardingDTO, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(dsCell, "dsCell");
        this.dsCell = dsCell;
        this.onboarding = onBoardingDTO;
        this.onboardingKey = str;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileCellDTO copy$default(ProfileCellDTO profileCellDTO, CellDTO cellDTO, OnBoardingDTO onBoardingDTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = profileCellDTO.dsCell;
        }
        if ((i11 & 2) != 0) {
            onBoardingDTO = profileCellDTO.onboarding;
        }
        if ((i11 & 4) != 0) {
            str = profileCellDTO.onboardingKey;
        }
        if ((i11 & 8) != 0) {
            map = profileCellDTO.trackingInfo;
        }
        return profileCellDTO.copy(cellDTO, onBoardingDTO, str, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getDsCell() {
        return this.dsCell;
    }

    /* renamed from: component2, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOnboardingKey() {
        return this.onboardingKey;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProfileCellDTO copy(@NotNull CellDTO dsCell, OnBoardingDTO onboarding, String onboardingKey, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(dsCell, "dsCell");
        return new ProfileCellDTO(dsCell, onboarding, onboardingKey, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileCellDTO)) {
            return false;
        }
        ProfileCellDTO profileCellDTO = (ProfileCellDTO) other;
        return Intrinsics.d(this.dsCell, profileCellDTO.dsCell) && Intrinsics.d(this.onboarding, profileCellDTO.onboarding) && Intrinsics.d(this.onboardingKey, profileCellDTO.onboardingKey) && Intrinsics.d(this.trackingInfo, profileCellDTO.trackingInfo);
    }

    @NotNull
    public final CellDTO getDsCell() {
        return this.dsCell;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public final String getOnboardingKey() {
        return this.onboardingKey;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.dsCell.hashCode() * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode2 = (hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        String str = this.onboardingKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.dsCell;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        String str = this.onboardingKey;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProfileCellDTO(dsCell=");
        sb2.append(cellDTO);
        sb2.append(", onboarding=");
        sb2.append(onBoardingDTO);
        sb2.append(", onboardingKey=");
        return C4070a.a(sb2, str, ", trackingInfo=", map, ")");
    }
}
