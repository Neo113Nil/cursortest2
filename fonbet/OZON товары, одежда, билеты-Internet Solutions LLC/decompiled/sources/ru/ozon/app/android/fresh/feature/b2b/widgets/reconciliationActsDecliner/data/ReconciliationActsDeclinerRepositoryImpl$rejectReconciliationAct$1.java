package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerRepositoryImpl", f = "ReconciliationActsDeclinerRepositoryImpl.kt", l = {38}, m = "rejectReconciliationAct")
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReconciliationActsDeclinerRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$1(ReconciliationActsDeclinerRepositoryImpl reconciliationActsDeclinerRepositoryImpl, d<? super ReconciliationActsDeclinerRepositoryImpl$rejectReconciliationAct$1> dVar) {
        super(dVar);
        this.this$0 = reconciliationActsDeclinerRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.rejectReconciliationAct(null, null, this);
    }
}
