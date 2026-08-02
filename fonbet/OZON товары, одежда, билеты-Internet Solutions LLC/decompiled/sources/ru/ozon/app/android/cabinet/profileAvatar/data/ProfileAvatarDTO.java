package ru.ozon.app.android.cabinet.profileAvatar.data;

import D40.a;
import Kk.C3532b;
import Ns.b;
import c8.C5766e;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/cabinet/profileAvatar/data/ProfileAvatarDTO;", "", "avatarIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "actionTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "isDefaultPhoto", "", "backgroundColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAvatarIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getActionTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "()Z", "getBackgroundColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProfileAvatarDTO {
    private final AtomActionDTO action;

    @NotNull
    private final TextDTO actionTitle;

    @NotNull
    private final IconDTO avatarIcon;
    private final String backgroundColor;
    private final boolean isDefaultPhoto;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ProfileAvatarDTO(@NotNull IconDTO avatarIcon, @NotNull TextDTO actionTitle, boolean z11, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        this.avatarIcon = avatarIcon;
        this.actionTitle = actionTitle;
        this.isDefaultPhoto = z11;
        this.backgroundColor = str;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ProfileAvatarDTO copy$default(ProfileAvatarDTO profileAvatarDTO, IconDTO iconDTO, TextDTO textDTO, boolean z11, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = profileAvatarDTO.avatarIcon;
        }
        if ((i11 & 2) != 0) {
            textDTO = profileAvatarDTO.actionTitle;
        }
        if ((i11 & 4) != 0) {
            z11 = profileAvatarDTO.isDefaultPhoto;
        }
        if ((i11 & 8) != 0) {
            str = profileAvatarDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = profileAvatarDTO.action;
        }
        if ((i11 & 32) != 0) {
            map = profileAvatarDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        return profileAvatarDTO.copy(iconDTO, textDTO, z11, str, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getActionTitle() {
        return this.actionTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDefaultPhoto() {
        return this.isDefaultPhoto;
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

    @NotNull
    public final ProfileAvatarDTO copy(@NotNull IconDTO avatarIcon, @NotNull TextDTO actionTitle, boolean isDefaultPhoto, String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(avatarIcon, "avatarIcon");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        return new ProfileAvatarDTO(avatarIcon, actionTitle, isDefaultPhoto, backgroundColor, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileAvatarDTO)) {
            return false;
        }
        ProfileAvatarDTO profileAvatarDTO = (ProfileAvatarDTO) other;
        return Intrinsics.d(this.avatarIcon, profileAvatarDTO.avatarIcon) && Intrinsics.d(this.actionTitle, profileAvatarDTO.actionTitle) && this.isDefaultPhoto == profileAvatarDTO.isDefaultPhoto && Intrinsics.d(this.backgroundColor, profileAvatarDTO.backgroundColor) && Intrinsics.d(this.action, profileAvatarDTO.action) && Intrinsics.d(this.trackingInfo, profileAvatarDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final TextDTO getActionTitle() {
        return this.actionTitle;
    }

    @NotNull
    public final IconDTO getAvatarIcon() {
        return this.avatarIcon;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(b.a(this.actionTitle, this.avatarIcon.hashCode() * 31, 31), 31, this.isDefaultPhoto);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final boolean isDefaultPhoto() {
        return this.isDefaultPhoto;
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.avatarIcon;
        TextDTO textDTO = this.actionTitle;
        boolean z11 = this.isDefaultPhoto;
        String str = this.backgroundColor;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder i11 = Bi.b.i("ProfileAvatarDTO(avatarIcon=", ", actionTitle=", ", isDefaultPhoto=", iconDTO, textDTO);
        C5766e.a(", backgroundColor=", str, ", action=", i11, z11);
        return a.d(i11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
