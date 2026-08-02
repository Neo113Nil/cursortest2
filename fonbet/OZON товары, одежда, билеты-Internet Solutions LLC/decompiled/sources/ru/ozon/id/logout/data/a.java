package ru.ozon.id.logout.data;

import Sc.InterfaceC4008j;
import Sc.s;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.ozon.id.logout.data.LogoutRepository$body$2$applicationId$1", f = "LogoutRepository.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97155d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f97156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(d dVar, kotlin.coroutines.d<? super a> dVar2) {
        super(2, dVar2);
        this.f97156e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f97156e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97155d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        interfaceC4008j = this.f97156e.f97166c;
        vc0.c cVar = (vc0.c) interfaceC4008j.getValue();
        this.f97155d = 1;
        Object b11 = cVar.b(this);
        return b11 == aVar ? aVar : b11;
    }
}
