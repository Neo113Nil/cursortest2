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
@e(c = "ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepositoryImpl", f = "SearchHistoryRepository.kt", l = {17}, m = "removeQueryFromSearchHistory-BWLJW6A")
/* loaded from: classes13.dex */
final class SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchHistoryRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1(SearchHistoryRepositoryImpl searchHistoryRepositoryImpl, d<? super SearchHistoryRepositoryImpl$removeQueryFromSearchHistory$1> dVar) {
        super(dVar);
        this.this$0 = searchHistoryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo974removeQueryFromSearchHistoryBWLJW6A = this.this$0.mo974removeQueryFromSearchHistoryBWLJW6A(null, null, null, this);
        return mo974removeQueryFromSearchHistoryBWLJW6A == a.COROUTINE_SUSPENDED ? mo974removeQueryFromSearchHistoryBWLJW6A : r.a(mo974removeQueryFromSearchHistoryBWLJW6A);
    }
}
