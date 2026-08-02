package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data;

import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;", "", "checkbox", "Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getCheckbox", "()Lru/ozon/app/android/returns/ui/molecules/checkbox/RmsCheckbox;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DeliveryGroupTitleDTO {
    public static final int $stable = 8;

    @NotNull
    private final RmsCheckbox checkbox;
    private final CommonControlSettings common;

    @NotNull
    private final TextDTO title;

    public DeliveryGroupTitleDTO(@NotNull RmsCheckbox checkbox, @NotNull TextDTO title, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(title, "title");
        this.checkbox = checkbox;
        this.title = title;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ DeliveryGroupTitleDTO copy$default(DeliveryGroupTitleDTO deliveryGroupTitleDTO, RmsCheckbox rmsCheckbox, TextDTO textDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rmsCheckbox = deliveryGroupTitleDTO.checkbox;
        }
        if ((i11 & 2) != 0) {
            textDTO = deliveryGroupTitleDTO.title;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = deliveryGroupTitleDTO.common;
        }
        return deliveryGroupTitleDTO.copy(rmsCheckbox, textDTO, commonControlSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RmsCheckbox getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final DeliveryGroupTitleDTO copy(@NotNull RmsCheckbox checkbox, @NotNull TextDTO title, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(checkbox, "checkbox");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DeliveryGroupTitleDTO(checkbox, title, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryGroupTitleDTO)) {
            return false;
        }
        DeliveryGroupTitleDTO deliveryGroupTitleDTO = (DeliveryGroupTitleDTO) other;
        return Intrinsics.d(this.checkbox, deliveryGroupTitleDTO.checkbox) && Intrinsics.d(this.title, deliveryGroupTitleDTO.title) && Intrinsics.d(this.common, deliveryGroupTitleDTO.common);
    }

    @NotNull
    public final RmsCheckbox getCheckbox() {
        return this.checkbox;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = b.a(this.title, this.checkbox.hashCode() * 31, 31);
        CommonControlSettings commonControlSettings = this.common;
        return a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
    }

    @NotNull
    public String toString() {
        RmsCheckbox rmsCheckbox = this.checkbox;
        TextDTO textDTO = this.title;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("DeliveryGroupTitleDTO(checkbox=");
        sb2.append(rmsCheckbox);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", common=");
        return Ak.b.g(sb2, commonControlSettings, ")");
    }
}
