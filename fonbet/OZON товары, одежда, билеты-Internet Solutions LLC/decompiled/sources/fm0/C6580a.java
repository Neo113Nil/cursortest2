package fm0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$clear$2", f = "DataStorePushStorage.kt", l = {}, m = "invokeSuspend")
/* renamed from: fm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6580a extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f63629d;

    public C6580a() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6580a c6580a = new C6580a(2, dVar);
        c6580a.f63629d = obj;
        return c6580a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        C6580a c6580a = new C6580a(2, dVar);
        c6580a.f63629d = bVar;
        return c6580a.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ((W2.b) this.f63629d).f();
        return Unit.f71690a;
    }
}
