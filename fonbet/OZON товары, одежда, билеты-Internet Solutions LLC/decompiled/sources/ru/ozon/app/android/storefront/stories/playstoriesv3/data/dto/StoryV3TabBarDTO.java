package ru.ozon.app.android.storefront.stories.playstoriesv3.data.dto;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3TabBarDTO;", "", "shareButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "soundButtonDescription", "Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3SoundButtonDescriptionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3SoundButtonDescriptionDTO;)V", "getShareButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getSoundButtonDescription", "()Lru/ozon/app/android/storefront/stories/playstoriesv3/data/dto/StoryV3SoundButtonDescriptionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class StoryV3TabBarDTO {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallIconButton shareButton;
    private final StoryV3SoundButtonDescriptionDTO soundButtonDescription;

    public StoryV3TabBarDTO(@NotNull ButtonV3Atom.SmallIconButton shareButton, StoryV3SoundButtonDescriptionDTO storyV3SoundButtonDescriptionDTO) {
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        this.shareButton = shareButton;
        this.soundButtonDescription = storyV3SoundButtonDescriptionDTO;
    }

    public static /* synthetic */ StoryV3TabBarDTO copy$default(StoryV3TabBarDTO storyV3TabBarDTO, ButtonV3Atom.SmallIconButton smallIconButton, StoryV3SoundButtonDescriptionDTO storyV3SoundButtonDescriptionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = storyV3TabBarDTO.shareButton;
        }
        if ((i11 & 2) != 0) {
            storyV3SoundButtonDescriptionDTO = storyV3TabBarDTO.soundButtonDescription;
        }
        return storyV3TabBarDTO.copy(smallIconButton, storyV3SoundButtonDescriptionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getShareButton() {
        return this.shareButton;
    }

    /* renamed from: component2, reason: from getter */
    public final StoryV3SoundButtonDescriptionDTO getSoundButtonDescription() {
        return this.soundButtonDescription;
    }

    @NotNull
    public final StoryV3TabBarDTO copy(@NotNull ButtonV3Atom.SmallIconButton shareButton, StoryV3SoundButtonDescriptionDTO soundButtonDescription) {
        Intrinsics.checkNotNullParameter(shareButton, "shareButton");
        return new StoryV3TabBarDTO(shareButton, soundButtonDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryV3TabBarDTO)) {
            return false;
        }
        StoryV3TabBarDTO storyV3TabBarDTO = (StoryV3TabBarDTO) other;
        return Intrinsics.d(this.shareButton, storyV3TabBarDTO.shareButton) && Intrinsics.d(this.soundButtonDescription, storyV3TabBarDTO.soundButtonDescription);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getShareButton() {
        return this.shareButton;
    }

    public final StoryV3SoundButtonDescriptionDTO getSoundButtonDescription() {
        return this.soundButtonDescription;
    }

    public int hashCode() {
        int hashCode = this.shareButton.hashCode() * 31;
        StoryV3SoundButtonDescriptionDTO storyV3SoundButtonDescriptionDTO = this.soundButtonDescription;
        return hashCode + (storyV3SoundButtonDescriptionDTO == null ? 0 : storyV3SoundButtonDescriptionDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "StoryV3TabBarDTO(shareButton=" + this.shareButton + ", soundButtonDescription=" + this.soundButtonDescription + ")";
    }
}
