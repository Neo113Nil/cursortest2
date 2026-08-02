package ru.ozon.app.android.action.v2;

import Sc.r;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.action.v2.ActionV2RepositoryImpl", f = "ActionV2Repository.kt", l = {150}, m = "requestActionResult-0E7RQCE")
/* loaded from: classes11.dex */
final class ActionV2RepositoryImpl$requestActionResult$1<D> extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActionV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionV2RepositoryImpl$requestActionResult$1(ActionV2RepositoryImpl actionV2RepositoryImpl, d<? super ActionV2RepositoryImpl$requestActionResult$1> dVar) {
        super(dVar);
        this.this$0 = actionV2RepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo479requestActionResult0E7RQCE = this.this$0.mo479requestActionResult0E7RQCE(null, null, this);
        return mo479requestActionResult0E7RQCE == a.COROUTINE_SUSPENDED ? mo479requestActionResult0E7RQCE : r.a(mo479requestActionResult0E7RQCE);
    }
}
