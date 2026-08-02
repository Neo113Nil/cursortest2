package ru.ozon.android.messenger.blocks.dangerousText;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@com.squareup.moshi.j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/android/messenger/blocks/dangerousText/DangerousTextDTO;", "", "hasSeparator", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(ZLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getHasSeparator", "()Z", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DangerousTextDTO {
    public static final int $stable = IconDTO.$stable;
    private final ButtonV3DTO button;
    private final boolean hasSeparator;
    private final IconDTO icon;
    private final TextDTO text;

    public DangerousTextDTO(boolean z11, IconDTO iconDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO) {
        this.hasSeparator = z11;
        this.icon = iconDTO;
        this.text = textDTO;
        this.button = buttonV3DTO;
    }

    public static /* synthetic */ DangerousTextDTO copy$default(DangerousTextDTO dangerousTextDTO, boolean z11, IconDTO iconDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = dangerousTextDTO.hasSeparator;
        }
        if ((i11 & 2) != 0) {
            iconDTO = dangerousTextDTO.icon;
        }
        if ((i11 & 4) != 0) {
            textDTO = dangerousTextDTO.text;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = dangerousTextDTO.button;
        }
        return dangerousTextDTO.copy(z11, iconDTO, textDTO, buttonV3DTO);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasSeparator() {
        return this.hasSeparator;
    }

    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final DangerousTextDTO copy(boolean hasSeparator, IconDTO icon, TextDTO text, ButtonV3DTO button) {
        return new DangerousTextDTO(hasSeparator, icon, text, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DangerousTextDTO)) {
            return false;
        }
        DangerousTextDTO dangerousTextDTO = (DangerousTextDTO) other;
        return this.hasSeparator == dangerousTextDTO.hasSeparator && Intrinsics.d(this.icon, dangerousTextDTO.icon) && Intrinsics.d(this.text, dangerousTextDTO.text) && Intrinsics.d(this.button, dangerousTextDTO.button);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final boolean getHasSeparator() {
        return this.hasSeparator;
    }

    public final IconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.hasSeparator) * 31;
        IconDTO iconDTO = this.icon;
        int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        TextDTO textDTO = this.text;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        return hashCode3 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DangerousTextDTO(hasSeparator=" + this.hasSeparator + ", icon=" + this.icon + ", text=" + this.text + ", button=" + this.button + ")";
    }

    public /* synthetic */ DangerousTextDTO(boolean z11, IconDTO iconDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : iconDTO, (i11 & 4) != 0 ? null : textDTO, (i11 & 8) != 0 ? null : buttonV3DTO);
    }
}
