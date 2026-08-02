package k00;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xb0.InterfaceC10696a;
import xe.M;
import zb0.AbstractC11016a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.cookie.X03ComposerDebugTokenCookieDelegate$removeCookie$clientCookiesInteractor$1", f = "X03ComposerDebugTokenCookieDelegate.kt", l = {}, m = "invokeSuspend")
/* renamed from: k00.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7450c extends j implements Function2<M, kotlin.coroutines.d<? super AbstractC11016a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7451d f70254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7450c(C7451d c7451d, kotlin.coroutines.d<? super C7450c> dVar) {
        super(2, dVar);
        this.f70254d = c7451d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7450c(this.f70254d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super AbstractC11016a> dVar) {
        return ((C7450c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Pc.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        aVar = this.f70254d.f70256b;
        InterfaceC10696a interfaceC10696a = (InterfaceC10696a) aVar.get();
        if (interfaceC10696a != null) {
            return interfaceC10696a.M();
        }
        return null;
    }
}
