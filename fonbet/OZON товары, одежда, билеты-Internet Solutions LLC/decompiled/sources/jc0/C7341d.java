package jc0;

import Ae.C0;
import Sc.s;
import jc0.AbstractC7343f;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.common.FastEntryActionHandler$handleAgreementCurtain$1", f = "FastEntryActionHandler.kt", l = {117}, m = "invokeSuspend")
/* renamed from: jc0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7341d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f69702d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7340c f69703e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC7343f.a f69704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7341d(C7340c c7340c, AbstractC7343f.a aVar, kotlin.coroutines.d<? super C7341d> dVar) {
        super(2, dVar);
        this.f69703e = c7340c;
        this.f69704f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7341d(this.f69703e, this.f69704f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7341d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f69702d;
        if (i11 == 0) {
            s.b(obj);
            c02 = this.f69703e.f69686h;
            this.f69702d = 1;
            if (c02.emit(this.f69704f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
