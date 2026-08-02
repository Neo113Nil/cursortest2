package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: kotlinx.coroutines.flow.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5318c extends kotlinx.coroutines.flow.internal.e {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f54676f = AtomicIntegerFieldUpdater.newUpdater(C5318c.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final Rh.A f54677d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f54678e;

    public /* synthetic */ C5318c(Rh.A a10, boolean z10, CoroutineContext coroutineContext, int i10, Rh.d dVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(a10, z10, (i11 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? Rh.d.f10307a : dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public String c() {
        return "channel=" + this.f54677d;
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        if (this.f54710b != -3) {
            Object collect = super.collect(interfaceC5322g, continuation);
            return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
        }
        o();
        Object d10 = AbstractC5328j.d(interfaceC5322g, this.f54677d, this.f54678e, continuation);
        return d10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d10 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public Object f(Rh.y yVar, Continuation continuation) {
        Object d10 = AbstractC5328j.d(new kotlinx.coroutines.flow.internal.z(yVar), this.f54677d, this.f54678e, continuation);
        return d10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d10 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public kotlinx.coroutines.flow.internal.e i(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return new C5318c(this.f54677d, this.f54678e, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public InterfaceC5321f j() {
        return new C5318c(this.f54677d, this.f54678e, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    public Rh.A m(Ph.P p10) {
        o();
        return this.f54710b == -3 ? this.f54677d : super.m(p10);
    }

    public final void o() {
        if (this.f54678e && f54676f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    public C5318c(Rh.A a10, boolean z10, CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        super(coroutineContext, i10, dVar);
        this.f54677d = a10;
        this.f54678e = z10;
    }
}
