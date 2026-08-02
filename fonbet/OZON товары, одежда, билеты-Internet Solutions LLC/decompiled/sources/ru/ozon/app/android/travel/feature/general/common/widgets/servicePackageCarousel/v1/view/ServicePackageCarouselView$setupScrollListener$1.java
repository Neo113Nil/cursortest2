package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import E.RunnableC2901q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards.ServicePackageCarouselCardsAdapter;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselView$setupScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselView$setupScrollListener$1 extends RecyclerView.t {
    final /* synthetic */ ServicePackageCarouselView this$0;

    ServicePackageCarouselView$setupScrollListener$1(ServicePackageCarouselView servicePackageCarouselView) {
        this.this$0 = servicePackageCarouselView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScrollStateChanged$lambda$0(ServicePackageCarouselView servicePackageCarouselView) {
        RecyclerView recyclerView;
        x xVar;
        Function2 function2;
        ServicePackageCarouselCardsAdapter servicePackageCarouselCardsAdapter;
        recyclerView = servicePackageCarouselView.cardsList;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        xVar = servicePackageCarouselView.snapHelper;
        View findSnapView = xVar.findSnapView(layoutManager);
        if (findSnapView == null) {
            return;
        }
        int position = layoutManager.getPosition(findSnapView);
        function2 = servicePackageCarouselView.cardRequestFocusCallback;
        if (function2 != null) {
            Integer valueOf = Integer.valueOf(position);
            servicePackageCarouselCardsAdapter = servicePackageCarouselView.cardsAdapter;
            List<ServicePackageCarouselVO.ServicePackageCarouselCardVO> currentList = servicePackageCarouselCardsAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            function2.invoke(valueOf, currentList);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, newState);
        if (newState == 0) {
            recyclerView.post(new RunnableC2901q(this.this$0, 5));
        }
    }
}
