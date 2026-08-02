package ru.ozon.app.android.search.widgets.history.common.data;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepositoryImpl", f = "SearchHistoryRepository.kt", l = {24}, m = "removeTagFromSearchHistory-0E7RQCE")
/* loaded from: classes13.dex */
final class SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchHistoryRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1(SearchHistoryRepositoryImpl searchHistoryRepositoryImpl, d<? super SearchHistoryRepositoryImpl$removeTagFromSearchHistory$1> dVar) {
        super(dVar);
        this.this$0 = searchHistoryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo975removeTagFromSearchHistory0E7RQCE = this.this$0.mo975removeTagFromSearchHistory0E7RQCE(null, null, this);
        return mo975removeTagFromSearchHistory0E7RQCE == a.COROUTINE_SUSPENDED ? mo975removeTagFromSearchHistory0E7RQCE : r.a(mo975removeTagFromSearchHistory0E7RQCE);
    }
}
