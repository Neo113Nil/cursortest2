package kc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsViewModel$onOtpResponseToken$1", f = "EntryCredentialsViewModel.kt", l = {274}, m = "invokeSuspend")
/* renamed from: kc0.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7633G extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71285d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7629C f71286e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f71287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7633G(C7629C c7629c, String str, kotlin.coroutines.d<? super C7633G> dVar) {
        super(2, dVar);
        this.f71286e = c7629c;
        this.f71287f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7633G(this.f71286e, this.f71287f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7633G) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object P12;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71285d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C7629C c7629c = this.f71286e;
            String obj2 = c7629c.f71227P.getValue().toString();
            C7629C.Y0(c7629c).p();
            this.f71285d = 1;
            P12 = c7629c.P1(obj2, this.f71287f, this);
            if (P12 == aVar) {
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
