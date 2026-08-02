package ru.ozon.app.android.search.widgets.feedbackForm.v1.data;

import A00.a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.InputModel;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/OptionSelected;", "LA00/a$J$a;", "", "isCellSelected", "isButtonShow", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "inputSettings", "<init>", "(ZZLru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "getInputSettings", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OptionSelected implements a.J.InterfaceC0007a {

    @NotNull
    private final InputModel inputSettings;
    private final boolean isButtonShow;
    private final boolean isCellSelected;

    public OptionSelected(boolean z11, boolean z12, @NotNull InputModel inputSettings) {
        Intrinsics.checkNotNullParameter(inputSettings, "inputSettings");
        this.isCellSelected = z11;
        this.isButtonShow = z12;
        this.inputSettings = inputSettings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSelected)) {
            return false;
        }
        OptionSelected optionSelected = (OptionSelected) other;
        return this.isCellSelected == optionSelected.isCellSelected && this.isButtonShow == optionSelected.isButtonShow && Intrinsics.d(this.inputSettings, optionSelected.inputSettings);
    }

    @NotNull
    public final InputModel getInputSettings() {
        return this.inputSettings;
    }

    public int hashCode() {
        return this.inputSettings.hashCode() + C3532b.a(Boolean.hashCode(this.isCellSelected) * 31, 31, this.isButtonShow);
    }

    /* renamed from: isButtonShow, reason: from getter */
    public final boolean getIsButtonShow() {
        return this.isButtonShow;
    }

    /* renamed from: isCellSelected, reason: from getter */
    public final boolean getIsCellSelected() {
        return this.isCellSelected;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isCellSelected;
        boolean z12 = this.isButtonShow;
        InputModel inputModel = this.inputSettings;
        StringBuilder d11 = Lh.a.d("OptionSelected(isCellSelected=", ", isButtonShow=", ", inputSettings=", z11, z12);
        d11.append(inputModel);
        d11.append(")");
        return d11.toString();
    }
}
