package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CatalogueTabsViewModel$scrollState$2 extends C7735q implements Function2<CatalogTabsScrollState, d<? super Unit>, Object> {
    CatalogueTabsViewModel$scrollState$2(Object obj) {
        super(2, obj, CatalogueTabsViewModel.class, "sendScrollState", "sendScrollState(Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CatalogTabsScrollState catalogTabsScrollState, d<? super Unit> dVar) {
        return ((CatalogueTabsViewModel) this.receiver).sendScrollState(catalogTabsScrollState, dVar);
    }
}
