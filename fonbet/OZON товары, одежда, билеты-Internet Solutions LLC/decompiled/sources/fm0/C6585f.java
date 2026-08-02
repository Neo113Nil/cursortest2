package fm0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$setPushTokenDeliveredToClientApp$2", f = "DataStorePushStorage.kt", l = {}, m = "invokeSuspend")
/* renamed from: fm0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6585f extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f63646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C6583d f63647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6585f(C6583d c6583d, kotlin.coroutines.d<? super C6585f> dVar) {
        super(2, dVar);
        this.f63647e = c6583d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6585f c6585f = new C6585f(this.f63647e, dVar);
        c6585f.f63646d = obj;
        return c6585f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        C6585f c6585f = new C6585f(this.f63647e, dVar);
        c6585f.f63646d = bVar;
        return c6585f.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ((W2.b) this.f63646d).i(this.f63647e.f63638c, Boolean.TRUE);
        return Unit.f71690a;
    }
}
