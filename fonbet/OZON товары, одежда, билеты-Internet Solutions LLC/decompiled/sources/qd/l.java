package qd;

import ce.AbstractC5814a;
import kotlin.jvm.functions.Function1;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* loaded from: classes.dex */
final class l implements Function1<Sd.f, InterfaceC9839e> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f81836a;

    l(m mVar) {
        this.f81836a = mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC9839e invoke(Sd.f fVar) {
        Sd.f fVar2 = fVar;
        InterfaceC9842h d11 = ((AbstractC5814a) this.f81836a.r()).d(fVar2, Bd.c.FROM_BUILTINS);
        if (d11 == null) {
            throw new AssertionError("Built-in class " + s.f81865l.c(fVar2) + " is not found");
        }
        if (d11 instanceof InterfaceC9839e) {
            return (InterfaceC9839e) d11;
        }
        throw new AssertionError("Must be a class descriptor " + fVar2 + ", but was " + d11);
    }
}
