package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation;

import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00130#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/FeedbackFormViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "optionType", "", "selectOption", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;)V", "", "containsOption", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Z", "isCellSelected", "()Z", "isCustomCell", "getSelectedCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "getOptionText", "()Ljava/lang/String;", "isActive", "updateButtonState", "(Z)V", "text", "saveInputText", "(Ljava/lang/String;)V", "getInputText", "optionText", "Ljava/lang/String;", "selectCell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "selectOptionType", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "", "", "inputOptions", "Ljava/util/Map;", "Landroidx/lifecycle/V;", "_buttonState", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "buttonState", "Landroidx/lifecycle/P;", "getButtonState", "()Landroidx/lifecycle/P;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackFormViewModel extends w0 {

    @NotNull
    private final V<Boolean> _buttonState;

    @NotNull
    private final P<Boolean> buttonState;
    private String optionText;
    private CellDTO selectCell;

    @NotNull
    private FeedbackFormDTO.OptionDTO.OptionType selectOptionType = FeedbackFormDTO.OptionDTO.OptionType.INVALID;

    @NotNull
    private final Map<Integer, String> inputOptions = new LinkedHashMap();

    public FeedbackFormViewModel() {
        V<Boolean> v11 = new V<>();
        this._buttonState = v11;
        this.buttonState = v11;
    }

    public final boolean containsOption(@NotNull CellDTO cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return Intrinsics.d(this.selectCell, cell);
    }

    @NotNull
    public final P<Boolean> getButtonState() {
        return this.buttonState;
    }

    public final String getInputText() {
        Map<Integer, String> map = this.inputOptions;
        CellDTO cellDTO = this.selectCell;
        return map.get(Integer.valueOf(cellDTO != null ? cellDTO.hashCode() : 0));
    }

    public final String getOptionText() {
        return this.optionText;
    }

    /* renamed from: getSelectedCell, reason: from getter */
    public final CellDTO getSelectCell() {
        return this.selectCell;
    }

    public final boolean isCellSelected() {
        return this.selectCell != null;
    }

    public final boolean isCustomCell() {
        return this.selectOptionType == FeedbackFormDTO.OptionDTO.OptionType.CUSTOM;
    }

    public final void saveInputText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.optionText = text;
        Map<Integer, String> map = this.inputOptions;
        CellDTO cellDTO = this.selectCell;
        map.put(Integer.valueOf(cellDTO != null ? cellDTO.hashCode() : 0), this.optionText);
    }

    public final void selectOption(@NotNull CellDTO cell, @NotNull FeedbackFormDTO.OptionDTO.OptionType optionType) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        if (Intrinsics.d(this.selectCell, cell)) {
            cell = null;
        }
        this.selectCell = cell;
        this.selectOptionType = optionType;
    }

    public final void updateButtonState(boolean isActive) {
        if (Intrinsics.d(this._buttonState.getValue(), Boolean.valueOf(isActive))) {
            return;
        }
        this._buttonState.setValue(Boolean.valueOf(isActive));
    }
}
