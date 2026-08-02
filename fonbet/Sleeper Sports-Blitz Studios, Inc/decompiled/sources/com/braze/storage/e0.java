package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class e0 implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f697a;
    public final /* synthetic */ Preferences.Key b;
    public final /* synthetic */ Object c;

    public e0(Flow flow, Preferences.Key key, Object obj) {
        this.f697a = flow;
        this.b = key;
        this.c = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f697a.collect(new d0(flowCollector, this.b, this.c), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
