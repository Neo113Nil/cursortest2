package ru.ozon.app.android.search.widgets.feedbackForm.v1.presentation.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v1.data.model.InputModel;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/input/FeedbackInputVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "input", "<init>", "(JLru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;)V", "copy", "(JLru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;)Lru/ozon/app/android/search/widgets/feedbackForm/v1/presentation/input/FeedbackInputVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "getInput", "()Lru/ozon/app/android/search/widgets/feedbackForm/v1/data/model/InputModel;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackInputVO implements c {
    private final long id;

    @NotNull
    private final InputModel input;

    public FeedbackInputVO(long j11, @NotNull InputModel input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.id = j11;
        this.input = input;
    }

    public static /* synthetic */ FeedbackInputVO copy$default(FeedbackInputVO feedbackInputVO, long j11, InputModel inputModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = feedbackInputVO.id;
        }
        if ((i11 & 2) != 0) {
            inputModel = feedbackInputVO.input;
        }
        return feedbackInputVO.copy(j11, inputModel);
    }

    @NotNull
    public final FeedbackInputVO copy(long id2, @NotNull InputModel input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new FeedbackInputVO(id2, input);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackInputVO)) {
            return false;
        }
        FeedbackInputVO feedbackInputVO = (FeedbackInputVO) other;
        return this.id == feedbackInputVO.id && Intrinsics.d(this.input, feedbackInputVO.input);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputModel getInput() {
        return this.input;
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
        return this.input.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "FeedbackInputVO(id=" + this.id + ", input=" + this.input + ")";
    }
}
