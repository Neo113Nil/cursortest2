package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.cell;

import Ak.C2436a;
import Bi.b;
import D3.h;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014Jn\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b\f\u0010-R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b\r\u0010-R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b\u000e\u0010-R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;", "inputSettings", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "optionType", "", "isFirstCell", "isLastCell", "isSelected", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;ZZZLjava/util/Map;)V", "copy", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;ZZZLjava/util/Map;)Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/cell/FeedbackCellVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;", "getInputSettings", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "getOptionType", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackCellVO implements c {

    @NotNull
    private final CellDTO cell;
    private final long id;

    @NotNull
    private final FeedbackFormDTO.OptionDTO.InputDTO inputSettings;
    private final boolean isFirstCell;
    private final boolean isLastCell;
    private final boolean isSelected;

    @NotNull
    private final FeedbackFormDTO.OptionDTO.OptionType optionType;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public FeedbackCellVO(long j11, @NotNull CellDTO cell, @NotNull FeedbackFormDTO.OptionDTO.InputDTO inputSettings, @NotNull FeedbackFormDTO.OptionDTO.OptionType optionType, boolean z11, boolean z12, boolean z13, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(inputSettings, "inputSettings");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.id = j11;
        this.cell = cell;
        this.inputSettings = inputSettings;
        this.optionType = optionType;
        this.isFirstCell = z11;
        this.isLastCell = z12;
        this.isSelected = z13;
        this.trackingInfo = map;
    }

    public static /* synthetic */ FeedbackCellVO copy$default(FeedbackCellVO feedbackCellVO, long j11, CellDTO cellDTO, FeedbackFormDTO.OptionDTO.InputDTO inputDTO, FeedbackFormDTO.OptionDTO.OptionType optionType, boolean z11, boolean z12, boolean z13, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = feedbackCellVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            cellDTO = feedbackCellVO.cell;
        }
        CellDTO cellDTO2 = cellDTO;
        if ((i11 & 4) != 0) {
            inputDTO = feedbackCellVO.inputSettings;
        }
        FeedbackFormDTO.OptionDTO.InputDTO inputDTO2 = inputDTO;
        if ((i11 & 8) != 0) {
            optionType = feedbackCellVO.optionType;
        }
        return feedbackCellVO.copy(j12, cellDTO2, inputDTO2, optionType, (i11 & 16) != 0 ? feedbackCellVO.isFirstCell : z11, (i11 & 32) != 0 ? feedbackCellVO.isLastCell : z12, (i11 & 64) != 0 ? feedbackCellVO.isSelected : z13, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? feedbackCellVO.trackingInfo : map);
    }

    @NotNull
    public final FeedbackCellVO copy(long id2, @NotNull CellDTO cell, @NotNull FeedbackFormDTO.OptionDTO.InputDTO inputSettings, @NotNull FeedbackFormDTO.OptionDTO.OptionType optionType, boolean isFirstCell, boolean isLastCell, boolean isSelected, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(inputSettings, "inputSettings");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        return new FeedbackCellVO(id2, cell, inputSettings, optionType, isFirstCell, isLastCell, isSelected, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackCellVO)) {
            return false;
        }
        FeedbackCellVO feedbackCellVO = (FeedbackCellVO) other;
        return this.id == feedbackCellVO.id && Intrinsics.d(this.cell, feedbackCellVO.cell) && Intrinsics.d(this.inputSettings, feedbackCellVO.inputSettings) && this.optionType == feedbackCellVO.optionType && this.isFirstCell == feedbackCellVO.isFirstCell && this.isLastCell == feedbackCellVO.isLastCell && this.isSelected == feedbackCellVO.isSelected && Intrinsics.d(this.trackingInfo, feedbackCellVO.trackingInfo);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final FeedbackFormDTO.OptionDTO.InputDTO getInputSettings() {
        return this.inputSettings;
    }

    @NotNull
    public final FeedbackFormDTO.OptionDTO.OptionType getOptionType() {
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
        int a11 = C3532b.a(C3532b.a(C3532b.a((this.optionType.hashCode() + ((this.inputSettings.hashCode() + b.c(this.cell, Long.hashCode(this.id) * 31, 31)) * 31)) * 31, 31, this.isFirstCell), 31, this.isLastCell), 31, this.isSelected);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a11 + (map == null ? 0 : map.hashCode());
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
        FeedbackFormDTO.OptionDTO.InputDTO inputDTO = this.inputSettings;
        FeedbackFormDTO.OptionDTO.OptionType optionType = this.optionType;
        boolean z11 = this.isFirstCell;
        boolean z12 = this.isLastCell;
        boolean z13 = this.isSelected;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = h.e("FeedbackCellVO(id=", j11, ", cell=", cellDTO);
        e11.append(", inputSettings=");
        e11.append(inputDTO);
        e11.append(", optionType=");
        e11.append(optionType);
        C2436a.e(", isFirstCell=", ", isLastCell=", e11, z11, z12);
        e11.append(", isSelected=");
        e11.append(z13);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }
}
