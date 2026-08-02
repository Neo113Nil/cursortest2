package ru.ozon.android.messenger.framework.data.remote.websocket;

import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.WebSocketMock$1", f = "WebSocketMock.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class Q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87953d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ S f87954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q(S s11, kotlin.coroutines.d<? super Q> dVar) {
        super(2, dVar);
        this.f87954e = s11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Q(this.f87954e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87953d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f87953d = 1;
            if (Y.b(150L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        S s11 = this.f87954e;
        S.f(s11);
        S.e(s11);
        return Unit.f71690a;
    }
}
