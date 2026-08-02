package ru.ozon.app.android.action.v2;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.action.v2.ActionV2RepositoryImpl", f = "ActionV2Repository.kt", l = {127}, m = "callActionSuspend")
/* loaded from: classes11.dex */
final class ActionV2RepositoryImpl$callActionSuspend$1<D> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActionV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionV2RepositoryImpl$callActionSuspend$1(ActionV2RepositoryImpl actionV2RepositoryImpl, d<? super ActionV2RepositoryImpl$callActionSuspend$1> dVar) {
        super(dVar);
        this.this$0 = actionV2RepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.callActionSuspend(null, null, this);
    }
}
