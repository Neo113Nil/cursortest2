package ru.ozon.app.android.fresh.chat.widgets.promptStatus.data;

import G.g;
import Ns.b;
import Pk0.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/promptStatus/data/PromptStatusDTO;", "", "loadingIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "loadingTitles", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textSwitchingTime", "", "errorIcon", "errorTitle", "refreshButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "checkStatusAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getLoadingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getLoadingTitles", "()Ljava/util/List;", "getTextSwitchingTime", "()J", "getErrorIcon", "getErrorTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getRefreshButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCheckStatusAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromptStatusDTO {
    public static final int $stable = 8;
    private final AtomActionDTO checkStatusAction;
    private final IconDTO errorIcon;

    @NotNull
    private final TextDTO errorTitle;

    @NotNull
    private final IconDTO loadingIcon;

    @NotNull
    private final List<TextDTO> loadingTitles;
    private final IconButtonV3DTO refreshButton;
    private final long textSwitchingTime;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PromptStatusDTO(@NotNull IconDTO loadingIcon, @NotNull List<TextDTO> loadingTitles, long j11, IconDTO iconDTO, @NotNull TextDTO errorTitle, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(loadingIcon, "loadingIcon");
        Intrinsics.checkNotNullParameter(loadingTitles, "loadingTitles");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        this.loadingIcon = loadingIcon;
        this.loadingTitles = loadingTitles;
        this.textSwitchingTime = j11;
        this.errorIcon = iconDTO;
        this.errorTitle = errorTitle;
        this.refreshButton = iconButtonV3DTO;
        this.checkStatusAction = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PromptStatusDTO copy$default(PromptStatusDTO promptStatusDTO, IconDTO iconDTO, List list, long j11, IconDTO iconDTO2, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconDTO = promptStatusDTO.loadingIcon;
        }
        if ((i11 & 2) != 0) {
            list = promptStatusDTO.loadingTitles;
        }
        if ((i11 & 4) != 0) {
            j11 = promptStatusDTO.textSwitchingTime;
        }
        if ((i11 & 8) != 0) {
            iconDTO2 = promptStatusDTO.errorIcon;
        }
        if ((i11 & 16) != 0) {
            textDTO = promptStatusDTO.errorTitle;
        }
        if ((i11 & 32) != 0) {
            iconButtonV3DTO = promptStatusDTO.refreshButton;
        }
        if ((i11 & 64) != 0) {
            atomActionDTO = promptStatusDTO.checkStatusAction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = promptStatusDTO.trackingInfo;
        }
        Map map2 = map;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        IconDTO iconDTO3 = iconDTO2;
        long j12 = j11;
        return promptStatusDTO.copy(iconDTO, list, j12, iconDTO3, textDTO, iconButtonV3DTO2, atomActionDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconDTO getLoadingIcon() {
        return this.loadingIcon;
    }

    @NotNull
    public final List<TextDTO> component2() {
        return this.loadingTitles;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTextSwitchingTime() {
        return this.textSwitchingTime;
    }

    /* renamed from: component4, reason: from getter */
    public final IconDTO getErrorIcon() {
        return this.errorIcon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextDTO getErrorTitle() {
        return this.errorTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final IconButtonV3DTO getRefreshButton() {
        return this.refreshButton;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getCheckStatusAction() {
        return this.checkStatusAction;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final PromptStatusDTO copy(@NotNull IconDTO loadingIcon, @NotNull List<TextDTO> loadingTitles, long textSwitchingTime, IconDTO errorIcon, @NotNull TextDTO errorTitle, IconButtonV3DTO refreshButton, AtomActionDTO checkStatusAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(loadingIcon, "loadingIcon");
        Intrinsics.checkNotNullParameter(loadingTitles, "loadingTitles");
        Intrinsics.checkNotNullParameter(errorTitle, "errorTitle");
        return new PromptStatusDTO(loadingIcon, loadingTitles, textSwitchingTime, errorIcon, errorTitle, refreshButton, checkStatusAction, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromptStatusDTO)) {
            return false;
        }
        PromptStatusDTO promptStatusDTO = (PromptStatusDTO) other;
        return Intrinsics.d(this.loadingIcon, promptStatusDTO.loadingIcon) && Intrinsics.d(this.loadingTitles, promptStatusDTO.loadingTitles) && this.textSwitchingTime == promptStatusDTO.textSwitchingTime && Intrinsics.d(this.errorIcon, promptStatusDTO.errorIcon) && Intrinsics.d(this.errorTitle, promptStatusDTO.errorTitle) && Intrinsics.d(this.refreshButton, promptStatusDTO.refreshButton) && Intrinsics.d(this.checkStatusAction, promptStatusDTO.checkStatusAction) && Intrinsics.d(this.trackingInfo, promptStatusDTO.trackingInfo);
    }

    public final AtomActionDTO getCheckStatusAction() {
        return this.checkStatusAction;
    }

    public final IconDTO getErrorIcon() {
        return this.errorIcon;
    }

    @NotNull
    public final TextDTO getErrorTitle() {
        return this.errorTitle;
    }

    @NotNull
    public final IconDTO getLoadingIcon() {
        return this.loadingIcon;
    }

    @NotNull
    public final List<TextDTO> getLoadingTitles() {
        return this.loadingTitles;
    }

    public final IconButtonV3DTO getRefreshButton() {
        return this.refreshButton;
    }

    public final long getTextSwitchingTime() {
        return this.textSwitchingTime;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = c.a(g.b(this.loadingIcon.hashCode() * 31, 31, this.loadingTitles), 31, this.textSwitchingTime);
        IconDTO iconDTO = this.errorIcon;
        int a12 = b.a(this.errorTitle, (a11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.refreshButton;
        int hashCode = (a12 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.checkStatusAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PromptStatusDTO(loadingIcon=" + this.loadingIcon + ", loadingTitles=" + this.loadingTitles + ", textSwitchingTime=" + this.textSwitchingTime + ", errorIcon=" + this.errorIcon + ", errorTitle=" + this.errorTitle + ", refreshButton=" + this.refreshButton + ", checkStatusAction=" + this.checkStatusAction + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
