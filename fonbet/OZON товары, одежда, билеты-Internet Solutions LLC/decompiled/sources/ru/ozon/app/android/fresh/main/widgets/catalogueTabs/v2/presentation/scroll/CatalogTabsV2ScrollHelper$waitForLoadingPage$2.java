package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll;

import Ae.InterfaceC2397i;
import An.C2439a;
import Sc.s;
import i10.C6997c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "Li10/c;", "Lru/ozon/composer/ui/widget/l;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadingPage$2", f = "CatalogTabsV2ScrollHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogTabsV2ScrollHelper$waitForLoadingPage$2 extends j implements Function2<InterfaceC2397i<? super C6997c<l>>, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $composerController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2ScrollHelper$waitForLoadingPage$2(InterfaceC7851b interfaceC7851b, d<? super CatalogTabsV2ScrollHelper$waitForLoadingPage$2> dVar) {
        super(2, dVar);
        this.$composerController = interfaceC7851b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogTabsV2ScrollHelper$waitForLoadingPage$2(this.$composerController, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super C6997c<l>> interfaceC2397i, d<? super Unit> dVar) {
        return ((CatalogTabsV2ScrollHelper$waitForLoadingPage$2) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C2439a.b(0L, null, 3, this.$composerController);
        this.$composerController.f(true);
        return Unit.f71690a;
    }
}
