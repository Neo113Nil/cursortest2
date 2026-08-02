package hj0;

import Sc.s;
import W2.f;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.repository.impl.ConfigurationRepositoryImpl$updateConfiguration$2$1", f = "ConfigurationRepositoryImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: hj0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6966f extends j implements Function2<W2.b, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f65621d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f.a<Object> f65622e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f65623f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6961a f65624g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6966f(f.a<Object> aVar, Object obj, C6961a c6961a, kotlin.coroutines.d<? super C6966f> dVar) {
        super(2, dVar);
        this.f65622e = aVar;
        this.f65623f = obj;
        this.f65624g = c6961a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6966f c6966f = new C6966f(this.f65622e, this.f65623f, this.f65624g, dVar);
        c6966f.f65621d = obj;
        return c6966f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(W2.b bVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6966f) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        W2.b bVar = (W2.b) this.f65621d;
        f.a<?> key = this.f65622e;
        Object c11 = bVar.c(key);
        Object obj2 = this.f65623f;
        if (!Intrinsics.d(c11, obj2)) {
            Intrinsics.checkNotNullParameter(key, "key");
            bVar.j(key, obj2);
            linkedHashMap = this.f65624g.f65574c;
            linkedHashMap.put(key.a(), Boolean.TRUE);
        }
        return Unit.f71690a;
    }
}
