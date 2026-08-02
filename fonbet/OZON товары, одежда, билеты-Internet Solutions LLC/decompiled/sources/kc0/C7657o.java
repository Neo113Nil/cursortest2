package kc0;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$lambda$10$$inlined$collectFlow$5", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7657o extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71364d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Be.n f71365e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7645c f71366f;

    /* renamed from: kc0.o$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7645c f71367a;

        public a(C7645c c7645c) {
            this.f71367a = c7645c;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C7645c.B(this.f71367a, (InterfaceC7643a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7657o(Be.n nVar, kotlin.coroutines.d dVar, C7645c c7645c) {
        super(2, dVar);
        this.f71365e = nVar;
        this.f71366f = c7645c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7657o(this.f71365e, dVar, this.f71366f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7657o) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71364d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71366f);
            this.f71364d = 1;
            if (this.f71365e.collect(aVar2, this) == aVar) {
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
