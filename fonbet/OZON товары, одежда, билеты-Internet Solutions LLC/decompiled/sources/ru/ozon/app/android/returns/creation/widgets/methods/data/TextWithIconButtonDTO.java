package ru.ozon.app.android.returns.creation.widgets.methods.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/TextWithIconButtonDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TextWithIconButtonDTO {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final IconButtonV3DTO iconButton;

    @NotNull
    private final TextDTO text;

    public TextWithIconButtonDTO(@NotNull TextDTO text, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.iconButton = iconButtonV3DTO;
    }

    public static /* synthetic */ TextWithIconButtonDTO copy$default(TextWithIconButtonDTO textWithIconButtonDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = textWithIconButtonDTO.text;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = textWithIconButtonDTO.iconButton;
        }
        return textWithIconButtonDTO.copy(textDTO, iconButtonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final TextWithIconButtonDTO copy(@NotNull TextDTO text, IconButtonV3DTO iconButton) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new TextWithIconButtonDTO(text, iconButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextWithIconButtonDTO)) {
            return false;
        }
        TextWithIconButtonDTO textWithIconButtonDTO = (TextWithIconButtonDTO) other;
        return Intrinsics.d(this.text, textWithIconButtonDTO.text) && Intrinsics.d(this.iconButton, textWithIconButtonDTO.iconButton);
    }

    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        return hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TextWithIconButtonDTO(text=" + this.text + ", iconButton=" + this.iconButton + ")";
    }
}
