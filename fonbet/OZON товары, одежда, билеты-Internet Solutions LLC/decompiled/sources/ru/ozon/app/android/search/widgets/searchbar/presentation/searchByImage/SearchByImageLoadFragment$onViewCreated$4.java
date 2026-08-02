package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageLoadFragment$onViewCreated$4", f = "SearchByImageLoadFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchByImageLoadFragment$onViewCreated$4 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchByImageLoadFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchByImageLoadFragment$onViewCreated$4(SearchByImageLoadFragment searchByImageLoadFragment, d<? super SearchByImageLoadFragment$onViewCreated$4> dVar) {
        super(2, dVar);
        this.this$0 = searchByImageLoadFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchByImageLoadFragment$onViewCreated$4(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerNavigator composerNavigator;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        composerNavigator = this.this$0.navigator;
        if (composerNavigator != null) {
            composerNavigator.popBackStack();
            return Unit.f71690a;
        }
        Intrinsics.n("navigator");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((SearchByImageLoadFragment$onViewCreated$4) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
