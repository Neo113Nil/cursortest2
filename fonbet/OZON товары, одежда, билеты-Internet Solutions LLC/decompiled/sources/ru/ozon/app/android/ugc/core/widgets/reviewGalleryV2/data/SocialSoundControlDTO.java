package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import J0.C3349u1;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "", "isSoundMuted", "", "muteButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "unmuteButton", "<init>", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMuteButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getUnmuteButton", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/SocialSoundControlDTO;", "equals", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SocialSoundControlDTO {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;
    private final Boolean isSoundMuted;

    @NotNull
    private final ButtonV3Atom.SmallIconButton muteButton;

    @NotNull
    private final ButtonV3Atom.SmallIconButton unmuteButton;

    public SocialSoundControlDTO(Boolean bool, @NotNull ButtonV3Atom.SmallIconButton muteButton, @NotNull ButtonV3Atom.SmallIconButton unmuteButton) {
        Intrinsics.checkNotNullParameter(muteButton, "muteButton");
        Intrinsics.checkNotNullParameter(unmuteButton, "unmuteButton");
        this.isSoundMuted = bool;
        this.muteButton = muteButton;
        this.unmuteButton = unmuteButton;
    }

    public static /* synthetic */ SocialSoundControlDTO copy$default(SocialSoundControlDTO socialSoundControlDTO, Boolean bool, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = socialSoundControlDTO.isSoundMuted;
        }
        if ((i11 & 2) != 0) {
            smallIconButton = socialSoundControlDTO.muteButton;
        }
        if ((i11 & 4) != 0) {
            smallIconButton2 = socialSoundControlDTO.unmuteButton;
        }
        return socialSoundControlDTO.copy(bool, smallIconButton, smallIconButton2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSoundMuted() {
        return this.isSoundMuted;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getMuteButton() {
        return this.muteButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getUnmuteButton() {
        return this.unmuteButton;
    }

    @NotNull
    public final SocialSoundControlDTO copy(Boolean isSoundMuted, @NotNull ButtonV3Atom.SmallIconButton muteButton, @NotNull ButtonV3Atom.SmallIconButton unmuteButton) {
        Intrinsics.checkNotNullParameter(muteButton, "muteButton");
        Intrinsics.checkNotNullParameter(unmuteButton, "unmuteButton");
        return new SocialSoundControlDTO(isSoundMuted, muteButton, unmuteButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSoundControlDTO)) {
            return false;
        }
        SocialSoundControlDTO socialSoundControlDTO = (SocialSoundControlDTO) other;
        return Intrinsics.d(this.isSoundMuted, socialSoundControlDTO.isSoundMuted) && Intrinsics.d(this.muteButton, socialSoundControlDTO.muteButton) && Intrinsics.d(this.unmuteButton, socialSoundControlDTO.unmuteButton);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getMuteButton() {
        return this.muteButton;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getUnmuteButton() {
        return this.unmuteButton;
    }

    public int hashCode() {
        Boolean bool = this.isSoundMuted;
        return this.unmuteButton.hashCode() + C3349u1.d(this.muteButton, (bool == null ? 0 : bool.hashCode()) * 31, 31);
    }

    public final Boolean isSoundMuted() {
        return this.isSoundMuted;
    }

    @NotNull
    public String toString() {
        return "SocialSoundControlDTO(isSoundMuted=" + this.isSoundMuted + ", muteButton=" + this.muteButton + ", unmuteButton=" + this.unmuteButton + ")";
    }

    public /* synthetic */ SocialSoundControlDTO(Boolean bool, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, smallIconButton, smallIconButton2);
    }
}
