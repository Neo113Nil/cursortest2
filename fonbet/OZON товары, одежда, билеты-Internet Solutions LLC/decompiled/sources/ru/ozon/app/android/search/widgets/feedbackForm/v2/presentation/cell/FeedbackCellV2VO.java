package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.cell;

import Ak.C2436a;
import Bi.b;
import D3.h;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.FeedbackFormV2DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010JX\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b\f\u0010*R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b\u000e\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "inputSettings", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "optionType", "", "isFirstCell", "isLastCell", "isSelected", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;ZZZ)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;ZZZ)Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/cell/FeedbackCellV2VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "getInputSettings", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$InputDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "getOptionType", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/FeedbackFormV2DTO$OptionDTO$OptionType;", "Z", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackCellV2VO implements c {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final long id;
    private final FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings;
    private final boolean isFirstCell;
    private final boolean isLastCell;
    private final boolean isSelected;

    @NotNull
    private final FeedbackFormV2DTO.OptionDTO.OptionType optionType;

    public FeedbackCellV2VO(long j11, @NotNull CellDTO cell, FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO, @NotNull FeedbackFormV2DTO.OptionDTO.OptionType optionType, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.id = j11;
        this.cell = cell;
        this.inputSettings = inputDTO;
        this.optionType = optionType;
        this.isFirstCell = z11;
        this.isLastCell = z12;
        this.isSelected = z13;
    }

    public static /* synthetic */ FeedbackCellV2VO copy$default(FeedbackCellV2VO feedbackCellV2VO, long j11, CellDTO cellDTO, FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO, FeedbackFormV2DTO.OptionDTO.OptionType optionType, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = feedbackCellV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cellDTO = feedbackCellV2VO.cell;
        }
        CellDTO cellDTO2 = cellDTO;
        if ((i11 & 4) != 0) {
            inputDTO = feedbackCellV2VO.inputSettings;
        }
        FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO2 = inputDTO;
        if ((i11 & 8) != 0) {
            optionType = feedbackCellV2VO.optionType;
        }
        FeedbackFormV2DTO.OptionDTO.OptionType optionType2 = optionType;
        if ((i11 & 16) != 0) {
            z11 = feedbackCellV2VO.isFirstCell;
        }
        return feedbackCellV2VO.copy(j12, cellDTO2, inputDTO2, optionType2, z11, (i11 & 32) != 0 ? feedbackCellV2VO.isLastCell : z12, (i11 & 64) != 0 ? feedbackCellV2VO.isSelected : z13);
    }

    @NotNull
    public final FeedbackCellV2VO copy(long id2, @NotNull CellDTO cell, FeedbackFormV2DTO.OptionDTO.InputDTO inputSettings, @NotNull FeedbackFormV2DTO.OptionDTO.OptionType optionType, boolean isFirstCell, boolean isLastCell, boolean isSelected) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        return new FeedbackCellV2VO(id2, cell, inputSettings, optionType, isFirstCell, isLastCell, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackCellV2VO)) {
            return false;
        }
        FeedbackCellV2VO feedbackCellV2VO = (FeedbackCellV2VO) other;
        return this.id == feedbackCellV2VO.id && Intrinsics.d(this.cell, feedbackCellV2VO.cell) && Intrinsics.d(this.inputSettings, feedbackCellV2VO.inputSettings) && this.optionType == feedbackCellV2VO.optionType && this.isFirstCell == feedbackCellV2VO.isFirstCell && this.isLastCell == feedbackCellV2VO.isLastCell && this.isSelected == feedbackCellV2VO.isSelected;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final FeedbackFormV2DTO.OptionDTO.InputDTO getInputSettings() {
        return this.inputSettings;
    }

    @NotNull
    public final FeedbackFormV2DTO.OptionDTO.OptionType getOptionType() {
        return this.optionType;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = b.c(this.cell, Long.hashCode(this.id) * 31, 31);
        FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO = this.inputSettings;
        return Boolean.hashCode(this.isSelected) + C3532b.a(C3532b.a((this.optionType.hashCode() + ((c11 + (inputDTO == null ? 0 : inputDTO.hashCode())) * 31)) * 31, 31, this.isFirstCell), 31, this.isLastCell);
    }

    /* renamed from: isFirstCell, reason: from getter */
    public final boolean getIsFirstCell() {
        return this.isFirstCell;
    }

    /* renamed from: isLastCell, reason: from getter */
    public final boolean getIsLastCell() {
        return this.isLastCell;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        FeedbackFormV2DTO.OptionDTO.InputDTO inputDTO = this.inputSettings;
        FeedbackFormV2DTO.OptionDTO.OptionType optionType = this.optionType;
        boolean z11 = this.isFirstCell;
        boolean z12 = this.isLastCell;
        boolean z13 = this.isSelected;
        StringBuilder e11 = h.e("FeedbackCellV2VO(id=", j11, ", cell=", cellDTO);
        e11.append(", inputSettings=");
        e11.append(inputDTO);
        e11.append(", optionType=");
        e11.append(optionType);
        C2436a.e(", isFirstCell=", ", isLastCell=", e11, z11, z12);
        return b.f(e11, ", isSelected=", z13, ")");
    }
}
