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
@e(c = "ru.ozon.app.android.action.v2.ActionV2RepositoryImpl", f = "ActionV2Repository.kt", l = {162}, m = "requestActionResultWithTracking-BWLJW6A")
/* loaded from: classes11.dex */
final class ActionV2RepositoryImpl$requestActionResultWithTracking$1<D> extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ActionV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActionV2RepositoryImpl$requestActionResultWithTracking$1(ActionV2RepositoryImpl actionV2RepositoryImpl, d<? super ActionV2RepositoryImpl$requestActionResultWithTracking$1> dVar) {
        super(dVar);
        this.this$0 = actionV2RepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        Object mo480requestActionResultWithTrackingBWLJW6A = this.this$0.mo480requestActionResultWithTrackingBWLJW6A(null, null, null, this);
        return mo480requestActionResultWithTrackingBWLJW6A == a.COROUTINE_SUSPENDED ? mo480requestActionResultWithTrackingBWLJW6A : r.a(mo480requestActionResultWithTrackingBWLJW6A);
    }
}
