package kc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$lambda$10$$inlined$collectFlow$2", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7654l extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71346d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f71347e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7645c f71348f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.m f71349g;

    /* renamed from: kc0.l$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7645c f71350a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.m f71351b;

        public a(C7645c c7645c, Jb0.m mVar) {
            this.f71350a = c7645c;
            this.f71351b = mVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C7645c.y(this.f71350a, this.f71351b, (CharSequence) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7654l(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C7645c c7645c, Jb0.m mVar) {
        super(2, dVar);
        this.f71347e = interfaceC2395h;
        this.f71348f = c7645c;
        this.f71349g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7654l(this.f71347e, dVar, this.f71348f, this.f71349g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7654l) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71346d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71348f, this.f71349g);
            this.f71346d = 1;
            if (this.f71347e.collect(aVar2, this) == aVar) {
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
