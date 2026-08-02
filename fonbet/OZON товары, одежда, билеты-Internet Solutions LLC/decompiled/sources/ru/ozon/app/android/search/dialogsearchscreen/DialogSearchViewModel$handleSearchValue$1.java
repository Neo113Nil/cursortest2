package ru.ozon.app.android.search.dialogsearchscreen;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import xe.B0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$handleSearchValue$1", f = "DialogSearchViewModel.kt", l = {309}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$handleSearchValue$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$handleSearchValue$1(DialogSearchViewModel dialogSearchViewModel, d<? super DialogSearchViewModel$handleSearchValue$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DialogSearchViewModel$handleSearchValue$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B0 b02;
        B0 b03;
        DialogSearchBarVO dialogSearchBarVO;
        Object refreshPage;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            b02 = this.this$0.widgetRefreshJob;
            if (b02 != null) {
                b02.j(null);
            }
            b03 = this.this$0.pageRefreshJob;
            if (b03 != null) {
                b03.j(null);
            }
            this.this$0.lastRefreshedSText = null;
            DialogSearchViewModel dialogSearchViewModel = this.this$0;
            dialogSearchBarVO = dialogSearchViewModel.localSearchBarModel;
            String defaultStateLink = dialogSearchBarVO != null ? dialogSearchBarVO.getDefaultStateLink() : null;
            this.label = 1;
            refreshPage = dialogSearchViewModel.refreshPage(defaultStateLink, false, this);
            if (refreshPage == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((DialogSearchViewModel$handleSearchValue$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
