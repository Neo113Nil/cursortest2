package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yl0.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10930o extends AbstractC7737t implements Function1<C10917b<Object>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10923h<Object> f106792b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f106793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10930o(C10923h<Object> c10923h, Object obj) {
        super(1);
        this.f106792b = c10923h;
        this.f106793c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10917b<Object> c10917b) {
        C10917b<Object> listenerHandler = c10917b;
        Intrinsics.checkNotNullParameter(listenerHandler, "listenerHandler");
        InterfaceC10920e<Object> b11 = listenerHandler.b();
        if (b11 != null) {
            C10923h.a(this.f106792b, null, new C10929n(b11, this.f106793c));
        }
        return Unit.f71690a;
    }
}
