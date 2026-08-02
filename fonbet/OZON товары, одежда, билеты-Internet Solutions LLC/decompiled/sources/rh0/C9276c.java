package rh0;

import Sc.s;
import bh0.InterfaceC5666b;
import ch0.C5835a;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.liveactivity.domain.LiveActivityInteractorImpl$handleLiveActivityMessage$1", f = "LiveActivityInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: rh0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9276c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9277d f83511d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ LiveActivitySelector f83512e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5835a f83513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9276c(C9277d c9277d, LiveActivitySelector liveActivitySelector, C5835a c5835a, kotlin.coroutines.d<? super C9276c> dVar) {
        super(2, dVar);
        this.f83511d = c9277d;
        this.f83512e = liveActivitySelector;
        this.f83513f = c5835a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9276c(this.f83511d, this.f83512e, this.f83513f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9276c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Iterator it = this.f83511d.f83519f.iterator();
        while (it.hasNext()) {
            ((InterfaceC5666b) it.next()).onNewMessage(this.f83512e, this.f83513f);
        }
        return Unit.f71690a;
    }
}
