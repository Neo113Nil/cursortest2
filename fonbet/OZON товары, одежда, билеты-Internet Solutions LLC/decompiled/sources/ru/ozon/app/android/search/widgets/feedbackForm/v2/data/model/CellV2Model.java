package ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model;

import Kk.C3532b;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010 R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/CellV2Model;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "inputSettings", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "optionType", "", "isFirstCell", "isLastCell", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "getInputSettings", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "getOptionType", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "Z", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CellV2Model {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings;
    private final boolean isFirstCell;
    private final boolean isLastCell;

    @NotNull
    private final FeedbackFormV2DTO.OptionDTO.OptionType optionType;

    public CellV2Model(@NotNull CellDTO cell, FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO, @NotNull FeedbackFormV2DTO.OptionDTO.OptionType optionType, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.cell = cell;
        this.inputSettings = inputDTO;
        this.optionType = optionType;
        this.isFirstCell = z11;
        this.isLastCell = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellV2Model)) {
            return false;
        }
        CellV2Model cellV2Model = (CellV2Model) other;
        return Intrinsics.d(this.cell, cellV2Model.cell) && Intrinsics.d(this.inputSettings, cellV2Model.inputSettings) && this.optionType == cellV2Model.optionType && this.isFirstCell == cellV2Model.isFirstCell && this.isLastCell == cellV2Model.isLastCell;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final FeedbackFormV2DTO.OptionDTO.InputDTO getInputSettings() {
        return this.inputSettings;
    }

    @NotNull
    public final FeedbackFormV2DTO.OptionDTO.OptionType getOptionType() {
        return this.optionType;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO = this.inputSettings;
        return Boolean.hashCode(this.isLastCell) + C3532b.a((this.optionType.hashCode() + ((hashCode + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31)) * 31, 31, this.isFirstCell);
    }

    /* renamed from: isFirstCell, reason: from getter */
    public final boolean getIsFirstCell() {
        return this.isFirstCell;
    }

    /* renamed from: isLastCell, reason: from getter */
    public final boolean getIsLastCell() {
        return this.isLastCell;
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO = this.inputSettings;
        FeedbackFormV2DTO.OptionDTO.OptionType optionType = this.optionType;
        boolean z11 = this.isFirstCell;
        boolean z12 = this.isLastCell;
        StringBuilder sb2 = new StringBuilder("CellV2Model(cell=");
        sb2.append(cellDTO);
        sb2.append(", inputSettings=");
        sb2.append(inputDTO);
        sb2.append(", optionType=");
        sb2.append(optionType);
        sb2.append(", isFirstCell=");
        sb2.append(z11);
        sb2.append(", isLastCell=");
        return a.a(")", sb2, z12);
    }
}
