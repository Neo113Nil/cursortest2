package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Ae.x0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel$onRemoveHistory$1", f = "ActiveSearchBarViewModel.kt", l = {112, 118}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ActiveSearchBarViewModel$onRemoveHistory$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $removeQueryActionName;
    final /* synthetic */ String $title;
    Object L$0;
    int label;
    final /* synthetic */ ActiveSearchBarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewModel$onRemoveHistory$1(ActiveSearchBarViewModel activeSearchBarViewModel, String str, String str2, d<? super ActiveSearchBarViewModel$onRemoveHistory$1> dVar) {
        super(2, dVar);
        this.this$0 = activeSearchBarViewModel;
        this.$title = str;
        this.$removeQueryActionName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActiveSearchBarViewModel$onRemoveHistory$1(this.this$0, this.$title, this.$removeQueryActionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SearchHistoryRepository searchHistoryRepository;
        ActiveSearchBarVO activeSearchBarVO;
        Object mo974removeQueryFromSearchHistoryBWLJW6A;
        x0 x0Var;
        Object obj2;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            searchHistoryRepository = this.this$0.searchHistoryRepository;
            String str = this.$title;
            activeSearchBarVO = this.this$0.searchModel;
            String link = activeSearchBarVO != null ? activeSearchBarVO.getLink() : null;
            if (link == null) {
                link = "";
            }
            String str2 = this.$removeQueryActionName;
            this.label = 1;
            mo974removeQueryFromSearchHistoryBWLJW6A = searchHistoryRepository.mo974removeQueryFromSearchHistoryBWLJW6A(str, link, str2, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                mo974removeQueryFromSearchHistoryBWLJW6A = obj2;
                a.b bVar = Lm0.a.f17149a;
                b11 = r.b(mo974removeQueryFromSearchHistoryBWLJW6A);
                if (b11 != null) {
                    bVar.e(b11);
                }
                return Unit.f71690a;
            }
            s.b(obj);
            mo974removeQueryFromSearchHistoryBWLJW6A = ((r) obj).getF26106a();
        }
        ActiveSearchBarViewModel activeSearchBarViewModel = this.this$0;
        r.Companion companion = r.INSTANCE;
        if (!(mo974removeQueryFromSearchHistoryBWLJW6A instanceof r.b)) {
            x0Var = activeSearchBarViewModel._actionFlow;
            ActiveSearchBarViewModel.Action.SilentRefresh silentRefresh = new ActiveSearchBarViewModel.Action.SilentRefresh(null, 1, null);
            this.L$0 = mo974removeQueryFromSearchHistoryBWLJW6A;
            this.label = 2;
            if (x0Var.emit(silentRefresh, this) != aVar) {
                obj2 = mo974removeQueryFromSearchHistoryBWLJW6A;
                mo974removeQueryFromSearchHistoryBWLJW6A = obj2;
            }
            return aVar;
        }
        a.b bVar2 = Lm0.a.f17149a;
        b11 = r.b(mo974removeQueryFromSearchHistoryBWLJW6A);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActiveSearchBarViewModel$onRemoveHistory$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
