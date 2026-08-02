package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.data;

import Ul.C4070a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/data/ProfileAvatarDTO;", "", "avatar", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "edit", "notification", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "label", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundImage", "", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAvatar", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getEdit", "getNotification", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getLabel", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundImage", "()Ljava/lang/String;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProfileAvatarDTO {
    public static final int $stable = 8;

    @NotNull
    private final IconDTO avatar;
    private final String backgroundColor;
    private final String backgroundImage;
    private final IconDTO edit;
    private final IndicatorDTO label;
    private final IconButtonV3DTO notification;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ProfileAvatarDTO(@NotNull IconDTO avatar, IconDTO iconDTO, IconButtonV3DTO iconButtonV3DTO, IndicatorDTO indicatorDTO, TextDTO textDTO, String str, String str2, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.avatar = avatar;
        this.edit = iconDTO;
        this.notification = iconButtonV3DTO;
        this.label = indicatorDTO;
        this.title = textDTO;
        this.backgroundImage = str;
        this.backgroundColor = str2;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ProfileAvatarDTO copy$default(ProfileAvatarDTO profileAvatarDTO, IconDTO iconDTO, IconDTO iconDTO2, IconButtonV3DTO iconButtonV3DTO, IndicatorDTO indicatorDTO, TextDTO textDTO, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = profileAvatarDTO.avatar;
        }
        if ((i11 & 2) != 0) {
            iconDTO2 = profileAvatarDTO.edit;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = profileAvatarDTO.notification;
        }
        if ((i11 & 8) != 0) {
            indicatorDTO = profileAvatarDTO.label;
        }
        if ((i11 & 16) != 0) {
            textDTO = profileAvatarDTO.title;
        }
        if ((i11 & 32) != 0) {
            str = profileAvatarDTO.backgroundImage;
        }
        if ((i11 & 64) != 0) {
            str2 = profileAvatarDTO.backgroundColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = profileAvatarDTO.trackingInfo;
        }
        String str3 = str2;
        Map map2 = map;
        TextDTO textDTO2 = textDTO;
        String str4 = str;
        return profileAvatarDTO.copy(iconDTO, iconDTO2, iconButtonV3DTO, indicatorDTO, textDTO2, str4, str3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getEdit() {
        return this.edit;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getNotification() {
        return this.notification;
    }

    /* renamed from: component4, reason: from getter */
    public final IndicatorDTO getLabel() {
        return this.label;
    }

    /* renamed from: component5, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final ProfileAvatarDTO copy(@NotNull IconDTO avatar, IconDTO edit, IconButtonV3DTO notification, IndicatorDTO label, TextDTO title, String backgroundImage, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new ProfileAvatarDTO(avatar, edit, notification, label, title, backgroundImage, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileAvatarDTO)) {
            return false;
        }
        ProfileAvatarDTO profileAvatarDTO = (ProfileAvatarDTO) other;
        return Intrinsics.d(this.avatar, profileAvatarDTO.avatar) && Intrinsics.d(this.edit, profileAvatarDTO.edit) && Intrinsics.d(this.notification, profileAvatarDTO.notification) && Intrinsics.d(this.label, profileAvatarDTO.label) && Intrinsics.d(this.title, profileAvatarDTO.title) && Intrinsics.d(this.backgroundImage, profileAvatarDTO.backgroundImage) && Intrinsics.d(this.backgroundColor, profileAvatarDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, profileAvatarDTO.trackingInfo);
    }

    @NotNull
    public final IconDTO getAvatar() {
        return this.avatar;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final IconDTO getEdit() {
        return this.edit;
    }

    public final IndicatorDTO getLabel() {
        return this.label;
    }

    public final IconButtonV3DTO getNotification() {
        return this.notification;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.avatar.hashCode() * 31;
        IconDTO iconDTO = this.edit;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.notification;
        int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.label;
        int hashCode4 = (hashCode3 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int hashCode5 = (hashCode4 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        String str = this.backgroundImage;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconDTO iconDTO = this.avatar;
        IconDTO iconDTO2 = this.edit;
        IconButtonV3DTO iconButtonV3DTO = this.notification;
        IndicatorDTO indicatorDTO = this.label;
        TextDTO textDTO = this.title;
        String str = this.backgroundImage;
        String str2 = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("ProfileAvatarDTO(avatar=");
        sb2.append(iconDTO);
        sb2.append(", edit=");
        sb2.append(iconDTO2);
        sb2.append(", notification=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", label=");
        sb2.append(indicatorDTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", backgroundImage=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        return C4070a.a(sb2, str2, ", trackingInfo=", map, ")");
    }
}
