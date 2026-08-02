package ru.ozon.app.android.returns.creation.widgets.selectedItems.data;

import D3.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/ReasonInfoDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "images", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getImages", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReasonInfoDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO button;
    private final List<IconDTO> images;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    public ReasonInfoDTO(@NotNull TextDTO title, TextDTO textDTO, List<IconDTO> list, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = textDTO;
        this.images = list;
        this.button = buttonV3DTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReasonInfoDTO copy$default(ReasonInfoDTO reasonInfoDTO, TextDTO textDTO, TextDTO textDTO2, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = reasonInfoDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = reasonInfoDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            list = reasonInfoDTO.images;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = reasonInfoDTO.button;
        }
        return reasonInfoDTO.copy(textDTO, textDTO2, list, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public final List<IconDTO> component3() {
        return this.images;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final ReasonInfoDTO copy(@NotNull TextDTO title, TextDTO subtitle, List<IconDTO> images, ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ReasonInfoDTO(title, subtitle, images, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReasonInfoDTO)) {
            return false;
        }
        ReasonInfoDTO reasonInfoDTO = (ReasonInfoDTO) other;
        return Intrinsics.d(this.title, reasonInfoDTO.title) && Intrinsics.d(this.subtitle, reasonInfoDTO.subtitle) && Intrinsics.d(this.images, reasonInfoDTO.images) && Intrinsics.d(this.button, reasonInfoDTO.button);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final List<IconDTO> getImages() {
        return this.images;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        List<IconDTO> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        return hashCode3 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<IconDTO> list = this.images;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder g10 = g.g("ReasonInfoDTO(title=", textDTO, ", subtitle=", textDTO2, ", images=");
        g10.append(list);
        g10.append(", button=");
        g10.append(buttonV3DTO);
        g10.append(")");
        return g10.toString();
    }
}
