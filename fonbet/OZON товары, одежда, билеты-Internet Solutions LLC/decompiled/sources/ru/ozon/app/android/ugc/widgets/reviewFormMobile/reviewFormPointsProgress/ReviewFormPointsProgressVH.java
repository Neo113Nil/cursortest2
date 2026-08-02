package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.HigherPointsTerms;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressDTO;
import xe.C10727i;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressVH;", "Ld20/a;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressVO;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;Ld20/e;)V", "", "observePointsEvent", "()V", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressVO;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressView;", "pointsView", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormPointsProgress/ReviewFormPointsProgressView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormPointsProgressVH extends AbstractC6064a<ReviewFormPointsProgressVO> {

    @NotNull
    private final ReviewFormViewModel formViewModel;

    @NotNull
    private final ReviewFormPointsProgressView pointsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormPointsProgressVH(@NotNull i container, @NotNull ReviewFormViewModel formViewModel, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.formViewModel = formViewModel;
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormPointsProgress.ReviewFormPointsProgressView");
        this.pointsView = (ReviewFormPointsProgressView) view;
        observePointsEvent();
    }

    private final void observePointsEvent() {
        C10727i.c(K.a(this), null, null, new ReviewFormPointsProgressVH$observePointsEvent$1(this, null), 3);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ReviewFormPointsProgressVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.pointsView.setMax(item.getMaxPoints());
        this.pointsView.setCell(item.getPointsCell(), item.getProgressBarColor());
        ReviewFormViewModel reviewFormViewModel = this.formViewModel;
        Map<ReviewFormPointsProgressDTO.FieldType, Integer> pointsMap = item.getPointsMap();
        HigherPointsTerms higherPointsTerms = item.getHigherPointsTerms();
        Integer detailedReviewCommentLength = higherPointsTerms != null ? higherPointsTerms.getDetailedReviewCommentLength() : null;
        HigherPointsTerms higherPointsTerms2 = item.getHigherPointsTerms();
        reviewFormViewModel.onViewIntent(new ViewIntent.PointsProgressInitialized(pointsMap, new HigherPointsTerms(higherPointsTerms2 != null ? higherPointsTerms2.getDetailedReviewMediaCount() : null, detailedReviewCommentLength)));
    }
}
