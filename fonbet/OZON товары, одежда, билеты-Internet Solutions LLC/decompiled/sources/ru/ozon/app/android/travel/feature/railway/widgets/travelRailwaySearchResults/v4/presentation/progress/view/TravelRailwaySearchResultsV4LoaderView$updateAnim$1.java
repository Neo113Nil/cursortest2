package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySearchResults.v4.presentation.progress.view.TravelRailwaySearchResultsV4LoaderView", f = "TravelRailwaySearchResultsV4LoaderView.kt", l = {102}, m = "updateAnim")
/* loaded from: classes4.dex */
final class TravelRailwaySearchResultsV4LoaderView$updateAnim$1 extends c {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TravelRailwaySearchResultsV4LoaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySearchResultsV4LoaderView$updateAnim$1(TravelRailwaySearchResultsV4LoaderView travelRailwaySearchResultsV4LoaderView, d<? super TravelRailwaySearchResultsV4LoaderView$updateAnim$1> dVar) {
        super(dVar);
        this.this$0 = travelRailwaySearchResultsV4LoaderView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateAnim;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        updateAnim = this.this$0.updateAnim(this);
        return updateAnim;
    }
}
