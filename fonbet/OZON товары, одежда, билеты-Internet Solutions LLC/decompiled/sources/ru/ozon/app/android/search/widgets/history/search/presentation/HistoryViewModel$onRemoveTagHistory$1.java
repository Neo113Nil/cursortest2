package ru.ozon.app.android.search.widgets.history.search.presentation;

import Lm0.a;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewModel$onRemoveTagHistory$1", f = "HistoryViewModel.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class HistoryViewModel$onRemoveTagHistory$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<HistoryItem> $historyItems;
    final /* synthetic */ Long $id;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $removeQueryActionName;
    int label;
    final /* synthetic */ HistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HistoryViewModel$onRemoveTagHistory$1(HistoryViewModel historyViewModel, Map<String, String> map, String str, List<? extends HistoryItem> list, Long l11, d<? super HistoryViewModel$onRemoveTagHistory$1> dVar) {
        super(2, dVar);
        this.this$0 = historyViewModel;
        this.$params = map;
        this.$removeQueryActionName = str;
        this.$historyItems = list;
        this.$id = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HistoryViewModel$onRemoveTagHistory$1(this.this$0, this.$params, this.$removeQueryActionName, this.$historyItems, this.$id, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SearchHistoryRepository searchHistoryRepository;
        Object mo975removeTagFromSearchHistory0E7RQCE;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            searchHistoryRepository = this.this$0.searchHistoryRepository;
            Map<String, String> map = this.$params;
            String str = this.$removeQueryActionName;
            this.label = 1;
            mo975removeTagFromSearchHistory0E7RQCE = searchHistoryRepository.mo975removeTagFromSearchHistory0E7RQCE(map, str, this);
            if (mo975removeTagFromSearchHistory0E7RQCE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            mo975removeTagFromSearchHistory0E7RQCE = ((r) obj).getF26106a();
        }
        HistoryViewModel historyViewModel = this.this$0;
        Map<String, String> map2 = this.$params;
        List<HistoryItem> list = this.$historyItems;
        Long l11 = this.$id;
        r.Companion companion = r.INSTANCE;
        if (!(mo975removeTagFromSearchHistory0E7RQCE instanceof r.b)) {
            historyViewModel.removeHistoryItem(map2, list, l11);
        }
        a.b bVar = Lm0.a.f17149a;
        Throwable b11 = r.b(mo975removeTagFromSearchHistory0E7RQCE);
        if (b11 != null) {
            bVar.e(b11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HistoryViewModel$onRemoveTagHistory$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
