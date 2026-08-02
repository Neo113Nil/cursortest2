package ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model;

import De.C2860c;
import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.FeedbackFormDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "", "", "label", "", "maxLength", "rows", "", "resize", "scrollBar", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "optionType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "getRows", "Ljava/lang/Boolean;", "getResize", "()Ljava/lang/Boolean;", "getScrollBar", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "getOptionType", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/FeedbackFormDTO$OptionDTO$OptionType;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InputModel {
    private final String label;
    private final Integer maxLength;

    @NotNull
    private final FeedbackFormDTO.OptionDTO.OptionType optionType;
    private final Boolean resize;
    private final Integer rows;
    private final Boolean scrollBar;

    public InputModel(String str, Integer num, Integer num2, Boolean bool, Boolean bool2, @NotNull FeedbackFormDTO.OptionDTO.OptionType optionType) {
        Intrinsics.checkNotNullParameter(optionType, "optionType");
        this.label = str;
        this.maxLength = num;
        this.rows = num2;
        this.resize = bool;
        this.scrollBar = bool2;
        this.optionType = optionType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputModel)) {
            return false;
        }
        InputModel inputModel = (InputModel) other;
        return Intrinsics.d(this.label, inputModel.label) && Intrinsics.d(this.maxLength, inputModel.maxLength) && Intrinsics.d(this.rows, inputModel.rows) && Intrinsics.d(this.resize, inputModel.resize) && Intrinsics.d(this.scrollBar, inputModel.scrollBar) && this.optionType == inputModel.optionType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @NotNull
    public final FeedbackFormDTO.OptionDTO.OptionType getOptionType() {
        return this.optionType;
    }

    public final Integer getRows() {
        return this.rows;
    }

    public final Boolean getScrollBar() {
        return this.scrollBar;
    }

    public int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxLength;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.rows;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.resize;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.scrollBar;
        return this.optionType.hashCode() + ((hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.label;
        Integer num = this.maxLength;
        Integer num2 = this.rows;
        Boolean bool = this.resize;
        Boolean bool2 = this.scrollBar;
        FeedbackFormDTO.OptionDTO.OptionType optionType = this.optionType;
        StringBuilder b11 = P.b("InputModel(label=", str, num, ", maxLength=", ", rows=");
        C2860c.f(bool, num2, ", resize=", ", scrollBar=", b11);
        b11.append(bool2);
        b11.append(", optionType=");
        b11.append(optionType);
        b11.append(")");
        return b11.toString();
    }
}
