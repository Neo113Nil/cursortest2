package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class AviaSearchResultFragment$observeLiveData$1$11 extends C7735q implements Function1<String, Unit> {
    AviaSearchResultFragment$observeLiveData$1$11(Object obj) {
        super(1, obj, SearchPreloaderView.class, "setTitle", "setTitle(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((SearchPreloaderView) this.receiver).setTitle(p02);
    }
}
