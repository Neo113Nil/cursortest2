package yl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yl0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10928m extends AbstractC7737t implements Function1<C10916a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10923h<Object> f106788b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Throwable f106789c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10928m(C10923h<Object> c10923h, Throwable th2) {
        super(1);
        this.f106788b = c10923h;
        this.f106789c = th2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10916a c10916a) {
        C10916a completionListenerHandler = c10916a;
        Intrinsics.checkNotNullParameter(completionListenerHandler, "completionListenerHandler");
        C10923h.a(this.f106788b, completionListenerHandler.a(), new C10927l(completionListenerHandler, this.f106789c));
        return Unit.f71690a;
    }
}
