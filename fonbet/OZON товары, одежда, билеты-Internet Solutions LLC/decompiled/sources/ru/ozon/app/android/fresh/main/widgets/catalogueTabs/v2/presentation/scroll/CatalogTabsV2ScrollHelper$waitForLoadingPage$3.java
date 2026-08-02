package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll;

import Sc.s;
import i10.C6997c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li10/c;", "Lru/ozon/composer/ui/widget/l;", "it", "", "<anonymous>", "(Li10/c;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadingPage$3", f = "CatalogTabsV2ScrollHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogTabsV2ScrollHelper$waitForLoadingPage$3 extends j implements Function2<C6997c<l>, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    CatalogTabsV2ScrollHelper$waitForLoadingPage$3(d<? super CatalogTabsV2ScrollHelper$waitForLoadingPage$3> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CatalogTabsV2ScrollHelper$waitForLoadingPage$3 catalogTabsV2ScrollHelper$waitForLoadingPage$3 = new CatalogTabsV2ScrollHelper$waitForLoadingPage$3(dVar);
        catalogTabsV2ScrollHelper$waitForLoadingPage$3.L$0 = obj;
        return catalogTabsV2ScrollHelper$waitForLoadingPage$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C6997c<l> c6997c, d<? super Boolean> dVar) {
        return ((CatalogTabsV2ScrollHelper$waitForLoadingPage$3) create(c6997c, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Boolean.valueOf(!((C6997c) this.L$0).r());
    }
}
