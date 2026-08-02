package ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/shiftedPreviewIcons/ShiftedPreviewIconsDTO;", "", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "hiddenIconsCount", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcons", "()Ljava/util/List;", "getHiddenIconsCount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShiftedPreviewIconsDTO {
    private final TextDTO hiddenIconsCount;

    @NotNull
    private final List<IconDTO> icons;

    public ShiftedPreviewIconsDTO(@NotNull List<IconDTO> icons, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.icons = icons;
        this.hiddenIconsCount = textDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShiftedPreviewIconsDTO copy$default(ShiftedPreviewIconsDTO shiftedPreviewIconsDTO, List list, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = shiftedPreviewIconsDTO.icons;
        }
        if ((i11 & 2) != 0) {
            textDTO = shiftedPreviewIconsDTO.hiddenIconsCount;
        }
        return shiftedPreviewIconsDTO.copy(list, textDTO);
    }

    @NotNull
    public final List<IconDTO> component1() {
        return this.icons;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getHiddenIconsCount() {
        return this.hiddenIconsCount;
    }

    @NotNull
    public final ShiftedPreviewIconsDTO copy(@NotNull List<IconDTO> icons, TextDTO hiddenIconsCount) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new ShiftedPreviewIconsDTO(icons, hiddenIconsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShiftedPreviewIconsDTO)) {
            return false;
        }
        ShiftedPreviewIconsDTO shiftedPreviewIconsDTO = (ShiftedPreviewIconsDTO) other;
        return Intrinsics.d(this.icons, shiftedPreviewIconsDTO.icons) && Intrinsics.d(this.hiddenIconsCount, shiftedPreviewIconsDTO.hiddenIconsCount);
    }

    public final TextDTO getHiddenIconsCount() {
        return this.hiddenIconsCount;
    }

    @NotNull
    public final List<IconDTO> getIcons() {
        return this.icons;
    }

    public int hashCode() {
        int hashCode = this.icons.hashCode() * 31;
        TextDTO textDTO = this.hiddenIconsCount;
        return hashCode + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "ShiftedPreviewIconsDTO(icons=" + this.icons + ", hiddenIconsCount=" + this.hiddenIconsCount + ")";
    }
}
