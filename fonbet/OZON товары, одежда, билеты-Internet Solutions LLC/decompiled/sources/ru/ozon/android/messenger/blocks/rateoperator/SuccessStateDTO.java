package ru.ozon.android.messenger.blocks.rateoperator;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.Icon;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/messenger/blocks/rateoperator/SuccessStateDTO;", "", "text", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/Icon;)V", "getText", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SuccessStateDTO {
    public static final int $stable = Icon.$stable;
    private final Icon icon;

    @NotNull
    private final String text;

    public SuccessStateDTO(@NotNull String text, Icon icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.icon = icon;
    }

    public static /* synthetic */ SuccessStateDTO copy$default(SuccessStateDTO successStateDTO, String str, Icon icon, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = successStateDTO.text;
        }
        if ((i11 & 2) != 0) {
            icon = successStateDTO.icon;
        }
        return successStateDTO.copy(str, icon);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final SuccessStateDTO copy(@NotNull String text, Icon icon) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new SuccessStateDTO(text, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessStateDTO)) {
            return false;
        }
        SuccessStateDTO successStateDTO = (SuccessStateDTO) other;
        return Intrinsics.d(this.text, successStateDTO.text) && Intrinsics.d(this.icon, successStateDTO.icon);
    }

    public final Icon getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        Icon icon = this.icon;
        return hashCode + (icon == null ? 0 : icon.hashCode());
    }

    @NotNull
    public String toString() {
        return "SuccessStateDTO(text=" + this.text + ", icon=" + this.icon + ")";
    }
}
