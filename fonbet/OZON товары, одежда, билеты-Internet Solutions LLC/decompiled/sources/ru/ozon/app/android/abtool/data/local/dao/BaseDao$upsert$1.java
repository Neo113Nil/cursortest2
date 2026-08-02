package ru.ozon.app.android.abtool.data.local.dao;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.abtool.data.local.dao.BaseDao", f = "BaseDao.kt", l = {56, 58}, m = "upsert$suspendImpl")
/* loaded from: classes6.dex */
final class BaseDao$upsert$1<T> extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseDao<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDao$upsert$1(BaseDao<T> baseDao, d<? super BaseDao$upsert$1> dVar) {
        super(dVar);
        this.this$0 = baseDao;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return BaseDao.upsert$suspendImpl(this.this$0, (Object) null, this);
    }
}
