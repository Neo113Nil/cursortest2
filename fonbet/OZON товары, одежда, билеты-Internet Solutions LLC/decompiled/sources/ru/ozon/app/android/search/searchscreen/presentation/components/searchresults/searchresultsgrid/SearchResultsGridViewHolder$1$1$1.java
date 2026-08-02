package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7719a;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class SearchResultsGridViewHolder$1$1$1 extends C7719a implements Function0<Unit> {
    SearchResultsGridViewHolder$1$1$1(Object obj) {
        super(0, obj, View.class, "performClick", "performClick()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((View) this.receiver).performClick();
    }
}
