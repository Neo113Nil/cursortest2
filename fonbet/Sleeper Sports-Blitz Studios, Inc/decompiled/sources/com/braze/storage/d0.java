package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class d0 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f693a;
    public final /* synthetic */ Preferences.Key b;
    public final /* synthetic */ Object c;

    public d0(FlowCollector flowCollector, Preferences.Key key, Object obj) {
        this.f693a = flowCollector;
        this.b = key;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        c0 c0Var;
        int i;
        if (continuation instanceof c0) {
            c0Var = (c0) continuation;
            int i2 = c0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = c0Var.f692a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c0Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.f693a;
                    Object obj3 = ((Preferences) obj).get(this.b);
                    if (obj3 == null) {
                        obj3 = this.c;
                    }
                    c0Var.b = 1;
                    if (flowCollector.emit(obj3, c0Var) == coroutine_suspended) {
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
        c0Var = new c0(this, continuation);
        Object obj22 = c0Var.f692a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c0Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
