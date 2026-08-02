package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class y implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f767a;
    public final /* synthetic */ Preferences.Key b;

    public y(FlowCollector flowCollector, Preferences.Key key) {
        this.f767a = flowCollector;
        this.b = key;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        x xVar;
        int i;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i2 = xVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = xVar.f766a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = xVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f767a;
                    Object obj3 = ((Preferences) obj).get(this.b);
                    xVar.b = 1;
                    if (flowCollector.emit(obj3, xVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        xVar = new x(this, continuation);
        Object obj22 = xVar.f766a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = xVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
