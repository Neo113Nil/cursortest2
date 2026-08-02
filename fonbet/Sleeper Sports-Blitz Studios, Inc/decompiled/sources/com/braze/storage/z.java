package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class z implements Flow {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f769a;
    public final /* synthetic */ Preferences.Key b;

    public z(Flow flow, Preferences.Key key) {
        this.f769a = flow;
        this.b = key;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f769a.collect(new y(flowCollector, this.b), continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }
}
