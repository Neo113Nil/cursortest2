package ru.ozon.android.messenger.blocks.buttons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/blocks/buttons/Fixed;", "", "text", "", "Lru/ozon/android/messenger/blocks/buttons/ButtonTextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "images", "Lru/ozon/android/messenger/blocks/buttons/ImagesDTO;", "externalButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/android/messenger/blocks/buttons/ImagesDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;)V", "getText", "()Ljava/util/List;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getImages", "()Lru/ozon/android/messenger/blocks/buttons/ImagesDTO;", "getExternalButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Fixed {
    public static final int $stable = ButtonV3Atom.SmallBorderlessButton.$stable;

    @NotNull
    private final AtomActionDTO action;
    private final ButtonV3Atom.SmallBorderlessButton externalButton;
    private final ImagesDTO images;

    @NotNull
    private final List<ButtonTextDTO> text;

    public Fixed(@NotNull List<ButtonTextDTO> text, @NotNull AtomActionDTO action, ImagesDTO imagesDTO, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.text = text;
        this.action = action;
        this.images = imagesDTO;
        this.externalButton = smallBorderlessButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fixed copy$default(Fixed fixed, List list, AtomActionDTO atomActionDTO, ImagesDTO imagesDTO, ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = fixed.text;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = fixed.action;
        }
        if ((i11 & 4) != 0) {
            imagesDTO = fixed.images;
        }
        if ((i11 & 8) != 0) {
            smallBorderlessButton = fixed.externalButton;
        }
        return fixed.copy(list, atomActionDTO, imagesDTO, smallBorderlessButton);
    }

    @NotNull
    public final List<ButtonTextDTO> component1() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final ImagesDTO getImages() {
        return this.images;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallBorderlessButton getExternalButton() {
        return this.externalButton;
    }

    @NotNull
    public final Fixed copy(@NotNull List<ButtonTextDTO> text, @NotNull AtomActionDTO action, ImagesDTO images, ButtonV3Atom.SmallBorderlessButton externalButton) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        return new Fixed(text, action, images, externalButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fixed)) {
            return false;
        }
        Fixed fixed = (Fixed) other;
        return Intrinsics.d(this.text, fixed.text) && Intrinsics.d(this.action, fixed.action) && Intrinsics.d(this.images, fixed.images) && Intrinsics.d(this.externalButton, fixed.externalButton);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ButtonV3Atom.SmallBorderlessButton getExternalButton() {
        return this.externalButton;
    }

    public final ImagesDTO getImages() {
        return this.images;
    }

    @NotNull
    public final List<ButtonTextDTO> getText() {
        return this.text;
    }

    public int hashCode() {
        int b11 = Ih.a.b(this.action, this.text.hashCode() * 31, 31);
        ImagesDTO imagesDTO = this.images;
        int hashCode = (b11 + (imagesDTO == null ? 0 : imagesDTO.hashCode())) * 31;
        ButtonV3Atom.SmallBorderlessButton smallBorderlessButton = this.externalButton;
        return hashCode + (smallBorderlessButton != null ? smallBorderlessButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Fixed(text=" + this.text + ", action=" + this.action + ", images=" + this.images + ", externalButton=" + this.externalButton + ")";
    }
}
