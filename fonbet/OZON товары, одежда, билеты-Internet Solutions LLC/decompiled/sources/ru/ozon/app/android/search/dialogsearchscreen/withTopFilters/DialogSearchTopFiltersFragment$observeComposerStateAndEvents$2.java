package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.PageRefreshState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2", f = "DialogSearchTopFiltersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2 extends j implements Function2<a, d<? super Unit>, Object> {
    final /* synthetic */ ComposerFragmentController $composer;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, ComposerFragmentController composerFragmentController, d<? super DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchTopFiltersFragment;
        this.$composer = composerFragmentController;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2 dialogSearchTopFiltersFragment$observeComposerStateAndEvents$2 = new DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2(this.this$0, this.$composer, dVar);
        dialogSearchTopFiltersFragment$observeComposerStateAndEvents$2.L$0 = obj;
        return dialogSearchTopFiltersFragment$observeComposerStateAndEvents$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DialogSearchViewModel dialogSearchViewModel;
        boolean z11;
        CollapsingCoordinatorImpl collapsingCoordinatorImpl;
        SkeletonCreator skeletonCreator;
        DialogSearchViewModel dialogSearchViewModel2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if (aVar2 instanceof a.u.b) {
            dialogSearchViewModel2 = this.this$0.viewModel;
            if (dialogSearchViewModel2 != null) {
                dialogSearchViewModel2.clearInteractions();
            }
        } else if (aVar2 instanceof a.p) {
            skeletonCreator = this.this$0.skeletonCreator;
            skeletonCreator.insertIslandSeparator(this.$composer);
        } else if (aVar2 instanceof a.C2370k) {
            z11 = this.this$0.isNeedToResetScroll;
            if (z11) {
                this.this$0.isNeedToResetScroll = false;
                collapsingCoordinatorImpl = this.this$0.collapsingCoordinator;
                if (collapsingCoordinatorImpl != null) {
                    collapsingCoordinatorImpl.resetScrollAfterRefresh();
                }
            }
        } else if (aVar2 instanceof a.u.C0013a) {
            this.this$0.handleComposerFirstLoadEvent();
        } else if (aVar2 instanceof a.u.c) {
            dialogSearchViewModel = this.this$0.viewModel;
            if (dialogSearchViewModel != null) {
                dialogSearchViewModel.clearInteractions();
            }
            DialogSearchTopFiltersFragment.refreshPage$default(this.this$0, new PageRefreshState(null, false, 2, null), false, 2, null);
        } else if (aVar2 instanceof a.J) {
            this.this$0.handleComposerUpdateEvent((a.J) aVar2);
        }
        return Unit.f71690a;
    }
}
