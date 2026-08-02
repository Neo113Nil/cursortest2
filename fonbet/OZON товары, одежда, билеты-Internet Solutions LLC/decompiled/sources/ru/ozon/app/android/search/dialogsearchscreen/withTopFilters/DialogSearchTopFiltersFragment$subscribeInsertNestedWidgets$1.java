package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewItem", "", "<anonymous>", "(Lru/ozon/composer/ui/widget/l;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1", f = "DialogSearchTopFiltersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1 extends j implements Function2<l, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, d<? super DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1 dialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1 = new DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1(this.this$0, dVar);
        dialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1.L$0 = obj;
        return dialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CollapsingCoordinatorImpl collapsingCoordinatorImpl;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.parsePlaceholders((l) this.L$0);
        collapsingCoordinatorImpl = this.this$0.collapsingCoordinator;
        if (collapsingCoordinatorImpl != null) {
            collapsingCoordinatorImpl.restoreCollapsingUi();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l lVar, d<? super Unit> dVar) {
        return ((DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1) create(lVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
