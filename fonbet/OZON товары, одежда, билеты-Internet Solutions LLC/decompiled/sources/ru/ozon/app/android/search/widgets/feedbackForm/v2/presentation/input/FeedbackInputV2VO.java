package ru.ozon.app.android.search.widgets.feedbackForm.v2.presentation.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.feedbackForm.v2.data.model.InputV2Model;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "input", "<init>", "(JLru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;)V", "copy", "(JLru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;)Lru/ozon/app/android/search/widgets/feedbackForm/v2/presentation/input/FeedbackInputV2VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "getInput", "()Lru/ozon/app/android/search/widgets/feedbackForm/v2/data/model/InputV2Model;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeedbackInputV2VO implements c {
    private final long id;

    @NotNull
    private final InputV2Model input;

    public FeedbackInputV2VO(long j11, @NotNull InputV2Model input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.id = j11;
        this.input = input;
    }

    public static /* synthetic */ FeedbackInputV2VO copy$default(FeedbackInputV2VO feedbackInputV2VO, long j11, InputV2Model inputV2Model, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = feedbackInputV2VO.id;
        }
        if ((i11 & 2) != 0) {
            inputV2Model = feedbackInputV2VO.input;
        }
        return feedbackInputV2VO.copy(j11, inputV2Model);
    }

    @NotNull
    public final FeedbackInputV2VO copy(long id2, @NotNull InputV2Model input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new FeedbackInputV2VO(id2, input);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackInputV2VO)) {
            return false;
        }
        FeedbackInputV2VO feedbackInputV2VO = (FeedbackInputV2VO) other;
        return this.id == feedbackInputV2VO.id && Intrinsics.d(this.input, feedbackInputV2VO.input);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final InputV2Model getInput() {
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
        return "FeedbackInputV2VO(id=" + this.id + ", input=" + this.input + ")";
    }
}
