package ru.ozon.app.android.platform.bundle.state;

import Sc.s;
import Wc.a;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegateAsyncExecutor$saveState$1", f = "ManualStateBundleDelegateAsyncExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ManualStateBundleDelegateAsyncExecutor$saveState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $guid;
    final /* synthetic */ Bundle $outState;
    final /* synthetic */ String $screenGuid;
    int label;
    final /* synthetic */ ManualStateBundleDelegateAsyncExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManualStateBundleDelegateAsyncExecutor$saveState$1(ManualStateBundleDelegateAsyncExecutor manualStateBundleDelegateAsyncExecutor, Bundle bundle, String str, String str2, d<? super ManualStateBundleDelegateAsyncExecutor$saveState$1> dVar) {
        super(2, dVar);
        this.this$0 = manualStateBundleDelegateAsyncExecutor;
        this.$outState = bundle;
        this.$guid = str;
        this.$screenGuid = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ManualStateBundleDelegateAsyncExecutor$saveState$1(this.this$0, this.$outState, this.$guid, this.$screenGuid, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ManualSaveRestoreStateDelegate manualSaveRestoreStateDelegate;
        ManualSaveRestoreStateDelegate manualSaveRestoreStateDelegate2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        manualSaveRestoreStateDelegate = this.this$0.delegate;
        manualSaveRestoreStateDelegate.save(this.$outState, this.$guid, this.$screenGuid);
        manualSaveRestoreStateDelegate2 = this.this$0.delegate;
        manualSaveRestoreStateDelegate2.deleteRecordsForScreenWithoutNewest(this.$guid, this.$screenGuid);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ManualStateBundleDelegateAsyncExecutor$saveState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
