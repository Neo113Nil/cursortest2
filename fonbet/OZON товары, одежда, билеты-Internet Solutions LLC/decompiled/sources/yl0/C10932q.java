package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yl0.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10932q extends AbstractC7737t implements Function1<C10917b<Object>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10923h<Object> f106796b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f106797c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10932q(C10923h<Object> c10923h, Throwable th2) {
        super(1);
        this.f106796b = c10923h;
        this.f106797c = th2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10917b<Object> c10917b) {
        C10917b<Object> listener = c10917b;
        Intrinsics.checkNotNullParameter(listener, "listener");
        InterfaceC10919d a11 = listener.a();
        if (a11 != null) {
            C10923h.a(this.f106796b, null, new C10931p(a11, this.f106797c));
        }
        return Unit.f71690a;
    }
}
