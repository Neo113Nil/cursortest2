package ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model;

import Kk.C3532b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/CellModel;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;", "inputSettings", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "optionType", "", "isFirstCell", "isLastCell", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;ZZLjava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;", "getInputSettings", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$InputDTO;", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "getOptionType", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "Z", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CellModel {

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final FeedbackFormDTO.OptionDTO.InputDTO inputSettings;
    private final boolean isFirstCell;
    private final boolean isLastCell;

    @NotNull
    private final FeedbackFormDTO.OptionDTO.OptionType optionType;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CellModel(@NotNull CellDTO cell, @NotNull FeedbackFormDTO.OptionDTO.InputDTO inputSettings, @NotNull FeedbackFormDTO.OptionDTO.OptionType optionType, boolean z11, boolean z12, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(inputSettings, "inputSettings");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.cell = cell;
        this.inputSettings = inputSettings;
        this.optionType = optionType;
        this.isFirstCell = z11;
        this.isLastCell = z12;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellModel)) {
            return false;
        }
        CellModel cellModel = (CellModel) other;
        return Intrinsics.d(this.cell, cellModel.cell) && Intrinsics.d(this.inputSettings, cellModel.inputSettings) && this.optionType == cellModel.optionType && this.isFirstCell == cellModel.isFirstCell && this.isLastCell == cellModel.isLastCell && Intrinsics.d(this.trackingInfo, cellModel.trackingInfo);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final FeedbackFormDTO.OptionDTO.InputDTO getInputSettings() {
        return this.inputSettings;
    }

    @NotNull
    public final FeedbackFormDTO.OptionDTO.OptionType getOptionType() {
        return this.optionType;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(C3532b.a((this.optionType.hashCode() + ((this.inputSettings.hashCode() + (this.cell.hashCode() * 31)) * 31)) * 31, 31, this.isFirstCell), 31, this.isLastCell);
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

    @NotNull
    public String toString() {
        return "CellModel(cell=" + this.cell + ", inputSettings=" + this.inputSettings + ", optionType=" + this.optionType + ", isFirstCell=" + this.isFirstCell + ", isLastCell=" + this.isLastCell + ", trackingInfo=" + this.trackingInfo + ")";
    }
}
