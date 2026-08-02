package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Ae.x0;
import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
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
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel$onRemoveAllHistory$1", f = "ActiveSearchBarViewModel.kt", l = {127, 132}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ActiveSearchBarViewModel$onRemoveAllHistory$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $removeQueryActionName;
    Object L$0;
    int label;
    final /* synthetic */ ActiveSearchBarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewModel$onRemoveAllHistory$1(ActiveSearchBarViewModel activeSearchBarViewModel, Map<String, String> map, String str, d<? super ActiveSearchBarViewModel$onRemoveAllHistory$1> dVar) {
        super(2, dVar);
        this.this$0 = activeSearchBarViewModel;
        this.$params = map;
        this.$removeQueryActionName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActiveSearchBarViewModel$onRemoveAllHistory$1(this.this$0, this.$params, this.$removeQueryActionName, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SearchHistoryRepository searchHistoryRepository;
        Object mo975removeTagFromSearchHistory0E7RQCE;
        x0 x0Var;
        Object obj2;
        Throwable b11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            searchHistoryRepository = this.this$0.searchHistoryRepository;
            Map<String, String> map = this.$params;
            String str = this.$removeQueryActionName;
            this.label = 1;
            mo975removeTagFromSearchHistory0E7RQCE = searchHistoryRepository.mo975removeTagFromSearchHistory0E7RQCE(map, str, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                s.b(obj);
                mo975removeTagFromSearchHistory0E7RQCE = obj2;
                a.b bVar = Lm0.a.f17149a;
                b11 = r.b(mo975removeTagFromSearchHistory0E7RQCE);
                if (b11 != null) {
                    bVar.e(b11);
                }
                return Unit.f71690a;
            }
            s.b(obj);
            mo975removeTagFromSearchHistory0E7RQCE = ((r) obj).getF26106a();
        }
        ActiveSearchBarViewModel activeSearchBarViewModel = this.this$0;
        r.Companion companion = r.INSTANCE;
        if (!(mo975removeTagFromSearchHistory0E7RQCE instanceof r.b)) {
            x0Var = activeSearchBarViewModel._actionFlow;
            ActiveSearchBarViewModel.Action.SilentRefresh silentRefresh = new ActiveSearchBarViewModel.Action.SilentRefresh(null, 1, null);
            this.L$0 = mo975removeTagFromSearchHistory0E7RQCE;
            this.label = 2;
            if (x0Var.emit(silentRefresh, this) != aVar) {
                obj2 = mo975removeTagFromSearchHistory0E7RQCE;
                mo975removeTagFromSearchHistory0E7RQCE = obj2;
            }
            return aVar;
        }
        a.b bVar2 = Lm0.a.f17149a;
        b11 = r.b(mo975removeTagFromSearchHistory0E7RQCE);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActiveSearchBarViewModel$onRemoveAllHistory$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
