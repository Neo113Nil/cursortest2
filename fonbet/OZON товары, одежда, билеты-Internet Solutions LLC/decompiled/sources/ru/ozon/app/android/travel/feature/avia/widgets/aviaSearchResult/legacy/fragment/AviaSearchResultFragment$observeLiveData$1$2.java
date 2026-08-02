package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$observeLiveData$1$2 extends C7735q implements Function1<ErrorStateVO, Unit> {
    AviaSearchResultFragment$observeLiveData$1$2(Object obj) {
        super(1, obj, AviaSearchResultFragment.class, "showError", "showError(Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ErrorStateVO errorStateVO) {
        invoke2(errorStateVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ErrorStateVO errorStateVO) {
        ((AviaSearchResultFragment) this.receiver).showError(errorStateVO);
    }
}
