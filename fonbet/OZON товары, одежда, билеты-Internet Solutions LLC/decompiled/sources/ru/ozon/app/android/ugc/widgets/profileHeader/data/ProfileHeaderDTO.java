package ru.ozon.app.android.ugc.widgets.profileHeader.data;

import D3.g;
import D40.a;
import De.C2859b;
import Kk.C3532b;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001=B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\t\u00104\u001a\u00020\u0014HÆ\u0003J\t\u00105\u001a\u00020\u0014HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J¡\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u00108\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010&R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001e¨\u0006>"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO;", "", "avatar", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "avatarAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "avatarTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "leftCount", "Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;", "middleCount", "rightCount", "shareButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "settingsButton", "isActionPositive", "", "positiveActionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "negativeActionButton", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getAvatarAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAvatarTrackingInfo", "()Ljava/util/Map;", "getLeftCount", "()Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;", "getMiddleCount", "getRightCount", "getShareButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSettingsButton", "()Z", "getPositiveActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNegativeActionButton", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "ProfileHeaderStatDTO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileHeaderDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconDTO avatar;
    private final AtomActionDTO avatarAction;
    private final Map<String, TokenizedTrackingInfo> avatarTrackingInfo;
    private final boolean isActionPositive;

    @NotNull
    private final ProfileHeaderStatDTO leftCount;

    @NotNull
    private final ProfileHeaderStatDTO middleCount;

    @NotNull
    private final ButtonV3DTO negativeActionButton;

    @NotNull
    private final ButtonV3DTO positiveActionButton;

    @NotNull
    private final ProfileHeaderStatDTO rightCount;
    private final IconButtonV3DTO settingsButton;

    @NotNull
    private final IconButtonV3DTO shareButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/data/ProfileHeaderDTO$ProfileHeaderStatDTO;", "", "blockNumber", "Lru/ozon/uni/atoms/data/text/TextDTO;", "blockTitle", "blockAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBlockNumber", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBlockTitle", "getBlockAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfileHeaderStatDTO {
        public static final int $stable = 8;
        private final AtomActionDTO blockAction;

        @NotNull
        private final TextDTO blockNumber;

        @NotNull
        private final TextDTO blockTitle;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProfileHeaderStatDTO(@NotNull TextDTO blockNumber, @NotNull TextDTO blockTitle, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(blockNumber, "blockNumber");
            Intrinsics.checkNotNullParameter(blockTitle, "blockTitle");
            this.blockNumber = blockNumber;
            this.blockTitle = blockTitle;
            this.blockAction = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProfileHeaderStatDTO copy$default(ProfileHeaderStatDTO profileHeaderStatDTO, TextDTO textDTO, TextDTO textDTO2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = profileHeaderStatDTO.blockNumber;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = profileHeaderStatDTO.blockTitle;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = profileHeaderStatDTO.blockAction;
            }
            if ((i11 & 8) != 0) {
                map = profileHeaderStatDTO.trackingInfo;
            }
            return profileHeaderStatDTO.copy(textDTO, textDTO2, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getBlockNumber() {
            return this.blockNumber;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getBlockTitle() {
            return this.blockTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getBlockAction() {
            return this.blockAction;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProfileHeaderStatDTO copy(@NotNull TextDTO blockNumber, @NotNull TextDTO blockTitle, AtomActionDTO blockAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(blockNumber, "blockNumber");
            Intrinsics.checkNotNullParameter(blockTitle, "blockTitle");
            return new ProfileHeaderStatDTO(blockNumber, blockTitle, blockAction, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileHeaderStatDTO)) {
                return false;
            }
            ProfileHeaderStatDTO profileHeaderStatDTO = (ProfileHeaderStatDTO) other;
            return Intrinsics.d(this.blockNumber, profileHeaderStatDTO.blockNumber) && Intrinsics.d(this.blockTitle, profileHeaderStatDTO.blockTitle) && Intrinsics.d(this.blockAction, profileHeaderStatDTO.blockAction) && Intrinsics.d(this.trackingInfo, profileHeaderStatDTO.trackingInfo);
        }

        public final AtomActionDTO getBlockAction() {
            return this.blockAction;
        }

        @NotNull
        public final TextDTO getBlockNumber() {
            return this.blockNumber;
        }

        @NotNull
        public final TextDTO getBlockTitle() {
            return this.blockTitle;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = b.a(this.blockTitle, this.blockNumber.hashCode() * 31, 31);
            AtomActionDTO atomActionDTO = this.blockAction;
            int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.blockNumber;
            TextDTO textDTO2 = this.blockTitle;
            return a.d(g.g("ProfileHeaderStatDTO(blockNumber=", textDTO, ", blockTitle=", textDTO2, ", blockAction="), this.blockAction, ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    public ProfileHeaderDTO(@NotNull IconDTO avatar, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, @NotNull ProfileHeaderStatDTO leftCount, @NotNull ProfileHeaderStatDTO middleCount, @NotNull ProfileHeaderStatDTO rightCount, @NotNull IconButtonV3DTO shareButton, IconButtonV3DTO iconButtonV3DTO, boolean z11, @NotNull ButtonV3DTO positiveActionButton, @NotNull ButtonV3DTO negativeActionButton, Map<String, TokenizedTrackingInfo> map2) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(leftCount, "leftCount");
        Intrinsics.checkNotNullParameter(middleCount, "middleCount");
        Intrinsics.checkNotNullParameter(rightCount, "rightCount");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        Intrinsics.checkNotNullParameter(positiveActionButton, "positiveActionButton");
        Intrinsics.checkNotNullParameter(negativeActionButton, "negativeActionButton");
        this.avatar = avatar;
        this.avatarAction = atomActionDTO;
        this.avatarTrackingInfo = map;
        this.leftCount = leftCount;
        this.middleCount = middleCount;
        this.rightCount = rightCount;
        this.shareButton = shareButton;
        this.settingsButton = iconButtonV3DTO;
        this.isActionPositive = z11;
        this.positiveActionButton = positiveActionButton;
        this.negativeActionButton = negativeActionButton;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ ProfileHeaderDTO copy$default(ProfileHeaderDTO profileHeaderDTO, IconDTO iconDTO, AtomActionDTO atomActionDTO, Map map, ProfileHeaderStatDTO profileHeaderStatDTO, ProfileHeaderStatDTO profileHeaderStatDTO2, ProfileHeaderStatDTO profileHeaderStatDTO3, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, boolean z11, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = profileHeaderDTO.avatar;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = profileHeaderDTO.avatarAction;
        }
        if ((i11 & 4) != 0) {
            map = profileHeaderDTO.avatarTrackingInfo;
        }
        if ((i11 & 8) != 0) {
            profileHeaderStatDTO = profileHeaderDTO.leftCount;
        }
        if ((i11 & 16) != 0) {
            profileHeaderStatDTO2 = profileHeaderDTO.middleCount;
        }
        if ((i11 & 32) != 0) {
            profileHeaderStatDTO3 = profileHeaderDTO.rightCount;
        }
        if ((i11 & 64) != 0) {
            iconButtonV3DTO = profileHeaderDTO.shareButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            iconButtonV3DTO2 = profileHeaderDTO.settingsButton;
        }
        if ((i11 & 256) != 0) {
            z11 = profileHeaderDTO.isActionPositive;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            buttonV3DTO = profileHeaderDTO.positiveActionButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            buttonV3DTO2 = profileHeaderDTO.negativeActionButton;
        }
        if ((i11 & 2048) != 0) {
            map2 = profileHeaderDTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        Map map3 = map2;
        boolean z12 = z11;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        IconButtonV3DTO iconButtonV3DTO4 = iconButtonV3DTO2;
        ProfileHeaderStatDTO profileHeaderStatDTO4 = profileHeaderStatDTO2;
        ProfileHeaderStatDTO profileHeaderStatDTO5 = profileHeaderStatDTO3;
        return profileHeaderDTO.copy(iconDTO, atomActionDTO, map, profileHeaderStatDTO, profileHeaderStatDTO4, profileHeaderStatDTO5, iconButtonV3DTO3, iconButtonV3DTO4, z12, buttonV3DTO4, buttonV3DTO3, map3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ButtonV3DTO getPositiveActionButton() {
        return this.positiveActionButton;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final ButtonV3DTO getNegativeActionButton() {
        return this.negativeActionButton;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAvatarAction() {
        return this.avatarAction;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.avatarTrackingInfo;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ProfileHeaderStatDTO getLeftCount() {
        return this.leftCount;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ProfileHeaderStatDTO getMiddleCount() {
        return this.middleCount;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ProfileHeaderStatDTO getRightCount() {
        return this.rightCount;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final IconButtonV3DTO getShareButton() {
        return this.shareButton;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getSettingsButton() {
        return this.settingsButton;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsActionPositive() {
        return this.isActionPositive;
    }

    @NotNull
    public final ProfileHeaderDTO copy(@NotNull IconDTO avatar, AtomActionDTO avatarAction, Map<String, TokenizedTrackingInfo> avatarTrackingInfo, @NotNull ProfileHeaderStatDTO leftCount, @NotNull ProfileHeaderStatDTO middleCount, @NotNull ProfileHeaderStatDTO rightCount, @NotNull IconButtonV3DTO shareButton, IconButtonV3DTO settingsButton, boolean isActionPositive, @NotNull ButtonV3DTO positiveActionButton, @NotNull ButtonV3DTO negativeActionButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(leftCount, "leftCount");
        Intrinsics.checkNotNullParameter(middleCount, "middleCount");
        Intrinsics.checkNotNullParameter(rightCount, "rightCount");
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        Intrinsics.checkNotNullParameter(positiveActionButton, "positiveActionButton");
        Intrinsics.checkNotNullParameter(negativeActionButton, "negativeActionButton");
        return new ProfileHeaderDTO(avatar, avatarAction, avatarTrackingInfo, leftCount, middleCount, rightCount, shareButton, settingsButton, isActionPositive, positiveActionButton, negativeActionButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileHeaderDTO)) {
            return false;
        }
        ProfileHeaderDTO profileHeaderDTO = (ProfileHeaderDTO) other;
        return Intrinsics.d(this.avatar, profileHeaderDTO.avatar) && Intrinsics.d(this.avatarAction, profileHeaderDTO.avatarAction) && Intrinsics.d(this.avatarTrackingInfo, profileHeaderDTO.avatarTrackingInfo) && Intrinsics.d(this.leftCount, profileHeaderDTO.leftCount) && Intrinsics.d(this.middleCount, profileHeaderDTO.middleCount) && Intrinsics.d(this.rightCount, profileHeaderDTO.rightCount) && Intrinsics.d(this.shareButton, profileHeaderDTO.shareButton) && Intrinsics.d(this.settingsButton, profileHeaderDTO.settingsButton) && this.isActionPositive == profileHeaderDTO.isActionPositive && Intrinsics.d(this.positiveActionButton, profileHeaderDTO.positiveActionButton) && Intrinsics.d(this.negativeActionButton, profileHeaderDTO.negativeActionButton) && Intrinsics.d(this.trackingInfo, profileHeaderDTO.trackingInfo);
    }

    @NotNull
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    public final AtomActionDTO getAvatarAction() {
        return this.avatarAction;
    }

    public final Map<String, TokenizedTrackingInfo> getAvatarTrackingInfo() {
        return this.avatarTrackingInfo;
    }

    @NotNull
    public final ProfileHeaderStatDTO getLeftCount() {
        return this.leftCount;
    }

    @NotNull
    public final ProfileHeaderStatDTO getMiddleCount() {
        return this.middleCount;
    }

    @NotNull
    public final ButtonV3DTO getNegativeActionButton() {
        return this.negativeActionButton;
    }

    @NotNull
    public final ButtonV3DTO getPositiveActionButton() {
        return this.positiveActionButton;
    }

    @NotNull
    public final ProfileHeaderStatDTO getRightCount() {
        return this.rightCount;
    }

    public final IconButtonV3DTO getSettingsButton() {
        return this.settingsButton;
    }

    @NotNull
    public final IconButtonV3DTO getShareButton() {
        return this.shareButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.avatar.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.avatarAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.avatarTrackingInfo;
        int c11 = GR.b.c(this.shareButton, (this.rightCount.hashCode() + ((this.middleCount.hashCode() + ((this.leftCount.hashCode() + ((hashCode2 + (map == null ? 0 : map.hashCode())) * 31)) * 31)) * 31)) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.settingsButton;
        int c12 = C2859b.c(this.negativeActionButton, C2859b.c(this.positiveActionButton, C3532b.a((c11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.isActionPositive), 31), 31);
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return c12 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean isActionPositive() {
        return this.isActionPositive;
    }

    @NotNull
    public String toString() {
        return "ProfileHeaderDTO(avatar=" + this.avatar + ", avatarAction=" + this.avatarAction + ", avatarTrackingInfo=" + this.avatarTrackingInfo + ", leftCount=" + this.leftCount + ", middleCount=" + this.middleCount + ", rightCount=" + this.rightCount + ", shareButton=" + this.shareButton + ", settingsButton=" + this.settingsButton + ", isActionPositive=" + this.isActionPositive + ", positiveActionButton=" + this.positiveActionButton + ", negativeActionButton=" + this.negativeActionButton + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
