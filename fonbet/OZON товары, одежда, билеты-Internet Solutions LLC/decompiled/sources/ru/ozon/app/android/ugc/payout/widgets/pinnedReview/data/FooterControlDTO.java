package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/data/FooterControlDTO;", "", "isSelected", "", "normal", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "selected", "<init>", "(ZLru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;)V", "()Z", "getNormal", "()Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "getSelected", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FooterControlDTO {
    private final boolean isSelected;

    @NotNull
    private final UncontainedIconLabelButtonDTO normal;

    @NotNull
    private final UncontainedIconLabelButtonDTO selected;

    public FooterControlDTO(boolean z11, @NotNull UncontainedIconLabelButtonDTO normal, @NotNull UncontainedIconLabelButtonDTO selected) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.isSelected = z11;
        this.normal = normal;
        this.selected = selected;
    }

    public static /* synthetic */ FooterControlDTO copy$default(FooterControlDTO footerControlDTO, boolean z11, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO, UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = footerControlDTO.isSelected;
        }
        if ((i11 & 2) != 0) {
            uncontainedIconLabelButtonDTO = footerControlDTO.normal;
        }
        if ((i11 & 4) != 0) {
            uncontainedIconLabelButtonDTO2 = footerControlDTO.selected;
        }
        return footerControlDTO.copy(z11, uncontainedIconLabelButtonDTO, uncontainedIconLabelButtonDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final UncontainedIconLabelButtonDTO getNormal() {
        return this.normal;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final UncontainedIconLabelButtonDTO getSelected() {
        return this.selected;
    }

    @NotNull
    public final FooterControlDTO copy(boolean isSelected, @NotNull UncontainedIconLabelButtonDTO normal, @NotNull UncontainedIconLabelButtonDTO selected) {
        Intrinsics.checkNotNullParameter(normal, "normal");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new FooterControlDTO(isSelected, normal, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterControlDTO)) {
            return false;
        }
        FooterControlDTO footerControlDTO = (FooterControlDTO) other;
        return this.isSelected == footerControlDTO.isSelected && Intrinsics.d(this.normal, footerControlDTO.normal) && Intrinsics.d(this.selected, footerControlDTO.selected);
    }

    @NotNull
    public final UncontainedIconLabelButtonDTO getNormal() {
        return this.normal;
    }

    @NotNull
    public final UncontainedIconLabelButtonDTO getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return this.selected.hashCode() + ((this.normal.hashCode() + (Boolean.hashCode(this.isSelected) * 31)) * 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        return "FooterControlDTO(isSelected=" + this.isSelected + ", normal=" + this.normal + ", selected=" + this.selected + ")";
    }
}
