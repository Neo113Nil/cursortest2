package ru.ozon.android.messenger.blocks.ai.input.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/android/messenger/blocks/ai/input/data/AiInputButton;", "", "Lru/ozon/android/messenger/blocks/ai/input/data/a;", "mode", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "<init>", "(Lru/ozon/android/messenger/blocks/ai/input/data/a;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "component1", "()Lru/ozon/android/messenger/blocks/ai/input/data/a;", "component2", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "copy", "(Lru/ozon/android/messenger/blocks/ai/input/data/a;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Lru/ozon/android/messenger/blocks/ai/input/data/AiInputButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/blocks/ai/input/data/a;", "getMode", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AiInputButton {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;

    @NotNull
    private final a mode;

    public AiInputButton(@NotNull a mode, @NotNull IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.mode = mode;
        this.iconButton = iconButton;
    }

    public static /* synthetic */ AiInputButton copy$default(AiInputButton aiInputButton, a aVar, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = aiInputButton.mode;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = aiInputButton.iconButton;
        }
        return aiInputButton.copy(aVar, iconButtonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final a getMode() {
        return this.mode;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final AiInputButton copy(@NotNull a mode, @NotNull IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new AiInputButton(mode, iconButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInputButton)) {
            return false;
        }
        AiInputButton aiInputButton = (AiInputButton) other;
        return this.mode == aiInputButton.mode && Intrinsics.d(this.iconButton, aiInputButton.iconButton);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final a getMode() {
        return this.mode;
    }

    public int hashCode() {
        return this.iconButton.hashCode() + (this.mode.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AiInputButton(mode=" + this.mode + ", iconButton=" + this.iconButton + ")";
    }
}
