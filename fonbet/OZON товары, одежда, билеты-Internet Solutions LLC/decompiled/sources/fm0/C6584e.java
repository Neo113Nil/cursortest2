package fm0;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage$savePushToken$2", f = "DataStorePushStorage.kt", l = {}, m = "invokeSuspend")
/* renamed from: fm0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6584e extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f63643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C6583d f63644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f63645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6584e(C6583d c6583d, String str, kotlin.coroutines.d<? super C6584e> dVar) {
        super(2, dVar);
        this.f63644e = c6583d;
        this.f63645f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6584e c6584e = new C6584e(this.f63644e, this.f63645f, dVar);
        c6584e.f63643d = obj;
        return c6584e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6584e) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        ((W2.b) this.f63643d).i(this.f63644e.f63637b, this.f63645f);
        return Unit.f71690a;
    }
}
