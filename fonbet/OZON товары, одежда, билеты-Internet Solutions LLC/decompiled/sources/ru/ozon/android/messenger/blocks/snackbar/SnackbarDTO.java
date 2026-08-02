package ru.ozon.android.messenger.blocks.snackbar;

import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0015\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u008e\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006<"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/SnackbarDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "ttl", "", "hideAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tapAction", "leftIcon", "Lru/ozon/android/messenger/blocks/snackbar/IconContainerDTO;", DynamicElementDTO.TIMER, "Lru/ozon/android/messenger/blocks/snackbar/TimerViewDTO;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "rightIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "trackingInfo", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/android/messenger/blocks/snackbar/IconContainerDTO;Lru/ozon/android/messenger/blocks/snackbar/TimerViewDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getTtl", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHideAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTapAction", "getLeftIcon", "()Lru/ozon/android/messenger/blocks/snackbar/IconContainerDTO;", "getTimer", "()Lru/ozon/android/messenger/blocks/snackbar/TimerViewDTO;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getRightIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/android/messenger/blocks/snackbar/IconContainerDTO;Lru/ozon/android/messenger/blocks/snackbar/TimerViewDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/snackbar/SnackbarDTO;", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SnackbarDTO {
    public static final int $stable = 8;
    private final ButtonV3Atom.SmallButton button;
    private final String description;
    private final AtomActionDTO hideAction;
    private final IconContainerDTO leftIcon;
    private final Icon rightIcon;
    private final AtomActionDTO tapAction;
    private final TimerViewDTO timer;

    @NotNull
    private final String title;

    @NotNull
    private final Map<String, MessengerTrackingInfo> trackingInfo;
    private final Long ttl;

    public SnackbarDTO(@NotNull String title, String str, Long l11, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, IconContainerDTO iconContainerDTO, TimerViewDTO timerViewDTO, ButtonV3Atom.SmallButton smallButton, Icon icon, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        this.title = title;
        this.description = str;
        this.ttl = l11;
        this.hideAction = atomActionDTO;
        this.tapAction = atomActionDTO2;
        this.leftIcon = iconContainerDTO;
        this.timer = timerViewDTO;
        this.button = smallButton;
        this.rightIcon = icon;
        this.trackingInfo = trackingInfo;
    }

    public static /* synthetic */ SnackbarDTO copy$default(SnackbarDTO snackbarDTO, String str, String str2, Long l11, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, IconContainerDTO iconContainerDTO, TimerViewDTO timerViewDTO, ButtonV3Atom.SmallButton smallButton, Icon icon, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = snackbarDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = snackbarDTO.description;
        }
        if ((i11 & 4) != 0) {
            l11 = snackbarDTO.ttl;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = snackbarDTO.hideAction;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO2 = snackbarDTO.tapAction;
        }
        if ((i11 & 32) != 0) {
            iconContainerDTO = snackbarDTO.leftIcon;
        }
        if ((i11 & 64) != 0) {
            timerViewDTO = snackbarDTO.timer;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            smallButton = snackbarDTO.button;
        }
        if ((i11 & 256) != 0) {
            icon = snackbarDTO.rightIcon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = snackbarDTO.trackingInfo;
        }
        Icon icon2 = icon;
        Map map2 = map;
        TimerViewDTO timerViewDTO2 = timerViewDTO;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        IconContainerDTO iconContainerDTO2 = iconContainerDTO;
        return snackbarDTO.copy(str, str2, l11, atomActionDTO, atomActionDTO3, iconContainerDTO2, timerViewDTO2, smallButton2, icon2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Map<String, MessengerTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getTtl() {
        return this.ttl;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getHideAction() {
        return this.hideAction;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getTapAction() {
        return this.tapAction;
    }

    /* renamed from: component6, reason: from getter */
    public final IconContainerDTO getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component7, reason: from getter */
    public final TimerViewDTO getTimer() {
        return this.timer;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    /* renamed from: component9, reason: from getter */
    public final Icon getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final SnackbarDTO copy(@NotNull String title, String description, Long ttl, AtomActionDTO hideAction, AtomActionDTO tapAction, IconContainerDTO leftIcon, TimerViewDTO timer, ButtonV3Atom.SmallButton button, Icon rightIcon, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        return new SnackbarDTO(title, description, ttl, hideAction, tapAction, leftIcon, timer, button, rightIcon, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnackbarDTO)) {
            return false;
        }
        SnackbarDTO snackbarDTO = (SnackbarDTO) other;
        return Intrinsics.d(this.title, snackbarDTO.title) && Intrinsics.d(this.description, snackbarDTO.description) && Intrinsics.d(this.ttl, snackbarDTO.ttl) && Intrinsics.d(this.hideAction, snackbarDTO.hideAction) && Intrinsics.d(this.tapAction, snackbarDTO.tapAction) && Intrinsics.d(this.leftIcon, snackbarDTO.leftIcon) && Intrinsics.d(this.timer, snackbarDTO.timer) && Intrinsics.d(this.button, snackbarDTO.button) && Intrinsics.d(this.rightIcon, snackbarDTO.rightIcon) && Intrinsics.d(this.trackingInfo, snackbarDTO.trackingInfo);
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AtomActionDTO getHideAction() {
        return this.hideAction;
    }

    public final IconContainerDTO getLeftIcon() {
        return this.leftIcon;
    }

    public final Icon getRightIcon() {
        return this.rightIcon;
    }

    public final AtomActionDTO getTapAction() {
        return this.tapAction;
    }

    public final TimerViewDTO getTimer() {
        return this.timer;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Long getTtl() {
        return this.ttl;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.ttl;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.hideAction;
        int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.tapAction;
        int hashCode5 = (hashCode4 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        IconContainerDTO iconContainerDTO = this.leftIcon;
        int hashCode6 = (hashCode5 + (iconContainerDTO == null ? 0 : iconContainerDTO.hashCode())) * 31;
        TimerViewDTO timerViewDTO = this.timer;
        int hashCode7 = (hashCode6 + (timerViewDTO == null ? 0 : timerViewDTO.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode8 = (hashCode7 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        Icon icon = this.rightIcon;
        return this.trackingInfo.hashCode() + ((hashCode8 + (icon != null ? icon.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        Long l11 = this.ttl;
        AtomActionDTO atomActionDTO = this.hideAction;
        AtomActionDTO atomActionDTO2 = this.tapAction;
        IconContainerDTO iconContainerDTO = this.leftIcon;
        TimerViewDTO timerViewDTO = this.timer;
        ButtonV3Atom.SmallButton smallButton = this.button;
        Icon icon = this.rightIcon;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("SnackbarDTO(title=", str, ", description=", str2, ", ttl=");
        d11.append(l11);
        d11.append(", hideAction=");
        d11.append(atomActionDTO);
        d11.append(", tapAction=");
        d11.append(atomActionDTO2);
        d11.append(", leftIcon=");
        d11.append(iconContainerDTO);
        d11.append(", timer=");
        d11.append(timerViewDTO);
        d11.append(", button=");
        d11.append(smallButton);
        d11.append(", rightIcon=");
        d11.append(icon);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
