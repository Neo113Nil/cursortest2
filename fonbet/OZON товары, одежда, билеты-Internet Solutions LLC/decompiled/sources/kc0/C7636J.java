package kc0;

import Ae.C0;
import Ae.w0;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onScreenLoaded$1", f = "EntryCredentialsViewModel.kt", l = {326}, m = "invokeSuspend")
/* renamed from: kc0.J, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7636J extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71289d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7629C f71290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7636J(C7629C c7629c, kotlin.coroutines.d<? super C7636J> dVar) {
        super(2, dVar);
        this.f71290e = c7629c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7636J(this.f71290e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7636J) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71289d;
        if (i11 == 0) {
            Sc.s.b(obj);
            w0 w0Var = this.f71290e.f71214C;
            InterfaceC7643a.e eVar = InterfaceC7643a.e.f71319a;
            this.f71289d = 1;
            if (((C0) w0Var).emit(eVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
