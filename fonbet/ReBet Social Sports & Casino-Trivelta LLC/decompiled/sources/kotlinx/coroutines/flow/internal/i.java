package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;

/* loaded from: classes5.dex */
public final class i extends h {
    public /* synthetic */ i(InterfaceC5321f interfaceC5321f, CoroutineContext coroutineContext, int i10, Rh.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5321f, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? Rh.d.f10307a : dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public e i(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return new i(this.f54734d, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public InterfaceC5321f j() {
        return this.f54734d;
    }

    @Override // kotlinx.coroutines.flow.internal.h
    public Object q(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        Object collect = this.f54734d.collect(interfaceC5322g, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public i(InterfaceC5321f interfaceC5321f, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        super(interfaceC5321f, coroutineContext, i10, dVar);
    }
}
