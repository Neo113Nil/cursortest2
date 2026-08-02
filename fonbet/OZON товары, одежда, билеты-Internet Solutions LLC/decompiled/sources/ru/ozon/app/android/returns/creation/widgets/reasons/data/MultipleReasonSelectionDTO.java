package ru.ozon.app.android.returns.creation.widgets.reasons.data;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.opencloud.data.OpenCloudDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/data/MultipleReasonSelectionDTO;", "", "openCloudDTO", "Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;", "itemWithReasons", "", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/ItemWithReasonDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getOpenCloudDTO", "()Lru/ozon/app/android/returns/ui/molecules/opencloud/data/OpenCloudDTO;", "getItemWithReasons", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MultipleReasonSelectionDTO {
    public static final int $stable = 8;
    private final ButtonV3DTO button;

    @NotNull
    private final List<ItemWithReasonDTO> itemWithReasons;
    private final OpenCloudDTO openCloudDTO;

    public MultipleReasonSelectionDTO(OpenCloudDTO openCloudDTO, @NotNull List<ItemWithReasonDTO> itemWithReasons, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(itemWithReasons, "itemWithReasons");
        this.openCloudDTO = openCloudDTO;
        this.itemWithReasons = itemWithReasons;
        this.button = buttonV3DTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultipleReasonSelectionDTO copy$default(MultipleReasonSelectionDTO multipleReasonSelectionDTO, OpenCloudDTO openCloudDTO, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            openCloudDTO = multipleReasonSelectionDTO.openCloudDTO;
        }
        if ((i11 & 2) != 0) {
            list = multipleReasonSelectionDTO.itemWithReasons;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = multipleReasonSelectionDTO.button;
        }
        return multipleReasonSelectionDTO.copy(openCloudDTO, list, buttonV3DTO);
    }

    /* renamed from: component1, reason: from getter */
    public final OpenCloudDTO getOpenCloudDTO() {
        return this.openCloudDTO;
    }

    @NotNull
    public final List<ItemWithReasonDTO> component2() {
        return this.itemWithReasons;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final MultipleReasonSelectionDTO copy(OpenCloudDTO openCloudDTO, @NotNull List<ItemWithReasonDTO> itemWithReasons, ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(itemWithReasons, "itemWithReasons");
        return new MultipleReasonSelectionDTO(openCloudDTO, itemWithReasons, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleReasonSelectionDTO)) {
            return false;
        }
        MultipleReasonSelectionDTO multipleReasonSelectionDTO = (MultipleReasonSelectionDTO) other;
        return Intrinsics.d(this.openCloudDTO, multipleReasonSelectionDTO.openCloudDTO) && Intrinsics.d(this.itemWithReasons, multipleReasonSelectionDTO.itemWithReasons) && Intrinsics.d(this.button, multipleReasonSelectionDTO.button);
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<ItemWithReasonDTO> getItemWithReasons() {
        return this.itemWithReasons;
    }

    public final OpenCloudDTO getOpenCloudDTO() {
        return this.openCloudDTO;
    }

    public int hashCode() {
        OpenCloudDTO openCloudDTO = this.openCloudDTO;
        int b11 = g.b((openCloudDTO == null ? 0 : openCloudDTO.hashCode()) * 31, 31, this.itemWithReasons);
        ButtonV3DTO buttonV3DTO = this.button;
        return b11 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultipleReasonSelectionDTO(openCloudDTO=" + this.openCloudDTO + ", itemWithReasons=" + this.itemWithReasons + ", button=" + this.button + ")";
    }
}
