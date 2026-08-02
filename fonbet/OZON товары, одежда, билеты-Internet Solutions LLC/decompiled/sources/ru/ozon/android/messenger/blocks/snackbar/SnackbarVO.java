package ru.ozon.android.messenger.blocks.snackbar;

import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b+\u0010,J\u009a\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bA\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010*R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010,¨\u0006L"}, d2 = {"Lru/ozon/android/messenger/blocks/snackbar/SnackbarVO;", "Lru/ozon/android/messenger/framework/presentation/models/g;", "Lru/ozon/android/messenger/framework/presentation/models/c;", "blockId", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "", "ttl", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "hideAction", "tapAction", "Lru/ozon/android/messenger/blocks/snackbar/IconContainer;", "leftIcon", "Lru/ozon/android/messenger/blocks/snackbar/TimerViewVO;", DynamicElementDTO.TIMER, "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "Lru/ozon/uni/atoms/data/button/Icon;", "rightIcon", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/android/messenger/framework/presentation/models/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/android/messenger/blocks/snackbar/IconContainer;Lru/ozon/android/messenger/blocks/snackbar/TimerViewVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)V", "component1", "()Lru/ozon/android/messenger/framework/presentation/models/c;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component6", "component7", "()Lru/ozon/android/messenger/blocks/snackbar/IconContainer;", "component8", "()Lru/ozon/android/messenger/blocks/snackbar/TimerViewVO;", "component9", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "component10", "()Lru/ozon/uni/atoms/data/button/Icon;", "component11", "()Ljava/util/Map;", "copy", "(Lru/ozon/android/messenger/framework/presentation/models/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/android/messenger/blocks/snackbar/IconContainer;Lru/ozon/android/messenger/blocks/snackbar/TimerViewVO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/Icon;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/snackbar/SnackbarVO;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/framework/presentation/models/c;", "getBlockId", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/lang/Long;", "getTtl", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getHideAction", "getTapAction", "Lru/ozon/android/messenger/blocks/snackbar/IconContainer;", "getLeftIcon", "Lru/ozon/android/messenger/blocks/snackbar/TimerViewVO;", "getTimer", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "Lru/ozon/uni/atoms/data/button/Icon;", "getRightIcon", "Ljava/util/Map;", "getTrackingInfo", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SnackbarVO implements g {
    public static final int $stable = 8;

    @NotNull
    private final ru.ozon.android.messenger.framework.presentation.models.c blockId;
    private final ButtonV3Atom.SmallButton button;
    private final String description;
    private final AtomActionDTO hideAction;
    private final IconContainer leftIcon;
    private final Icon rightIcon;
    private final AtomActionDTO tapAction;
    private final TimerViewVO timer;

    @NotNull
    private final String title;

    @NotNull
    private final Map<String, MessengerTrackingInfo> trackingInfo;
    private final Long ttl;

    public SnackbarVO(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String title, String str, Long l11, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, IconContainer iconContainer, TimerViewVO timerViewVO, ButtonV3Atom.SmallButton smallButton, Icon icon, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        this.blockId = blockId;
        this.title = title;
        this.description = str;
        this.ttl = l11;
        this.hideAction = atomActionDTO;
        this.tapAction = atomActionDTO2;
        this.leftIcon = iconContainer;
        this.timer = timerViewVO;
        this.button = smallButton;
        this.rightIcon = icon;
        this.trackingInfo = trackingInfo;
    }

    public static /* synthetic */ SnackbarVO copy$default(SnackbarVO snackbarVO, ru.ozon.android.messenger.framework.presentation.models.c cVar, String str, String str2, Long l11, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, IconContainer iconContainer, TimerViewVO timerViewVO, ButtonV3Atom.SmallButton smallButton, Icon icon, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = snackbarVO.blockId;
        }
        if ((i11 & 2) != 0) {
            str = snackbarVO.title;
        }
        if ((i11 & 4) != 0) {
            str2 = snackbarVO.description;
        }
        if ((i11 & 8) != 0) {
            l11 = snackbarVO.ttl;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = snackbarVO.hideAction;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO2 = snackbarVO.tapAction;
        }
        if ((i11 & 64) != 0) {
            iconContainer = snackbarVO.leftIcon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            timerViewVO = snackbarVO.timer;
        }
        if ((i11 & 256) != 0) {
            smallButton = snackbarVO.button;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            icon = snackbarVO.rightIcon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = snackbarVO.trackingInfo;
        }
        Icon icon2 = icon;
        Map map2 = map;
        TimerViewVO timerViewVO2 = timerViewVO;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        AtomActionDTO atomActionDTO3 = atomActionDTO2;
        IconContainer iconContainer2 = iconContainer;
        AtomActionDTO atomActionDTO4 = atomActionDTO;
        String str3 = str2;
        return snackbarVO.copy(cVar, str, str3, l11, atomActionDTO4, atomActionDTO3, iconContainer2, timerViewVO2, smallButton2, icon2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.blockId;
    }

    /* renamed from: component10, reason: from getter */
    public final Icon getRightIcon() {
        return this.rightIcon;
    }

    @NotNull
    public final Map<String, MessengerTrackingInfo> component11() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTtl() {
        return this.ttl;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getHideAction() {
        return this.hideAction;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getTapAction() {
        return this.tapAction;
    }

    /* renamed from: component7, reason: from getter */
    public final IconContainer getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final TimerViewVO getTimer() {
        return this.timer;
    }

    /* renamed from: component9, reason: from getter */
    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    @NotNull
    public final SnackbarVO copy(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull String title, String description, Long ttl, AtomActionDTO hideAction, AtomActionDTO tapAction, IconContainer leftIcon, TimerViewVO timer, ButtonV3Atom.SmallButton button, Icon rightIcon, @NotNull Map<String, MessengerTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        return new SnackbarVO(blockId, title, description, ttl, hideAction, tapAction, leftIcon, timer, button, rightIcon, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnackbarVO)) {
            return false;
        }
        SnackbarVO snackbarVO = (SnackbarVO) other;
        return Intrinsics.d(this.blockId, snackbarVO.blockId) && Intrinsics.d(this.title, snackbarVO.title) && Intrinsics.d(this.description, snackbarVO.description) && Intrinsics.d(this.ttl, snackbarVO.ttl) && Intrinsics.d(this.hideAction, snackbarVO.hideAction) && Intrinsics.d(this.tapAction, snackbarVO.tapAction) && Intrinsics.d(this.leftIcon, snackbarVO.leftIcon) && Intrinsics.d(this.timer, snackbarVO.timer) && Intrinsics.d(this.button, snackbarVO.button) && Intrinsics.d(this.rightIcon, snackbarVO.rightIcon) && Intrinsics.d(this.trackingInfo, snackbarVO.trackingInfo);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.models.g
    @NotNull
    public ru.ozon.android.messenger.framework.presentation.models.c getBlockId() {
        return this.blockId;
    }

    public final ButtonV3Atom.SmallButton getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public boolean getHasOnHideActions() {
        return false;
    }

    public final AtomActionDTO getHideAction() {
        return this.hideAction;
    }

    public final IconContainer getLeftIcon() {
        return this.leftIcon;
    }

    public final Icon getRightIcon() {
        return this.rightIcon;
    }

    public final AtomActionDTO getTapAction() {
        return this.tapAction;
    }

    public final TimerViewVO getTimer() {
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
        int a11 = G.g.a(this.blockId.hashCode() * 31, 31, this.title);
        String str = this.description;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.ttl;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.hideAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.tapAction;
        int hashCode4 = (hashCode3 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        IconContainer iconContainer = this.leftIcon;
        int hashCode5 = (hashCode4 + (iconContainer == null ? 0 : iconContainer.hashCode())) * 31;
        TimerViewVO timerViewVO = this.timer;
        int hashCode6 = (hashCode5 + (timerViewVO == null ? 0 : timerViewVO.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.button;
        int hashCode7 = (hashCode6 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        Icon icon = this.rightIcon;
        return this.trackingInfo.hashCode() + ((hashCode7 + (icon != null ? icon.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        ru.ozon.android.messenger.framework.presentation.models.c cVar = this.blockId;
        String str = this.title;
        String str2 = this.description;
        Long l11 = this.ttl;
        AtomActionDTO atomActionDTO = this.hideAction;
        AtomActionDTO atomActionDTO2 = this.tapAction;
        IconContainer iconContainer = this.leftIcon;
        TimerViewVO timerViewVO = this.timer;
        ButtonV3Atom.SmallButton smallButton = this.button;
        Icon icon = this.rightIcon;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("SnackbarVO(blockId=");
        sb2.append(cVar);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        sb2.append(", ttl=");
        sb2.append(l11);
        sb2.append(", hideAction=");
        sb2.append(atomActionDTO);
        sb2.append(", tapAction=");
        sb2.append(atomActionDTO2);
        sb2.append(", leftIcon=");
        sb2.append(iconContainer);
        sb2.append(", timer=");
        sb2.append(timerViewVO);
        sb2.append(", button=");
        sb2.append(smallButton);
        sb2.append(", rightIcon=");
        sb2.append(icon);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
