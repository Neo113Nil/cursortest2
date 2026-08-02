package ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.postRefreshWithScroll.PostRefreshWithScrollActionHandler", f = "PostRefreshWithScrollActionHandler.kt", l = {113, 114}, m = "doAsyncRefreshIfNeed")
/* loaded from: classes11.dex */
final class PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostRefreshWithScrollActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1(PostRefreshWithScrollActionHandler postRefreshWithScrollActionHandler, d<? super PostRefreshWithScrollActionHandler$doAsyncRefreshIfNeed$1> dVar) {
        super(dVar);
        this.this$0 = postRefreshWithScrollActionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object doAsyncRefreshIfNeed;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        doAsyncRefreshIfNeed = this.this$0.doAsyncRefreshIfNeed(null, null, this);
        return doAsyncRefreshIfNeed;
    }
}
