package kc0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$observeViewModel$lambda$11$lambda$10$$inlined$collectFlow$1", f = "EntryCredentialsFragment.kt", l = {80}, m = "invokeSuspend")
/* renamed from: kc0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7653k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71340d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f71341e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7645c f71342f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.m f71343g;

    /* renamed from: kc0.k$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C7645c f71344a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.m f71345b;

        public a(C7645c c7645c, Jb0.m mVar) {
            this.f71344a = c7645c;
            this.f71345b = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C7645c.z(this.f71344a, this.f71345b, (ru.ozon.id.nativeauth.data.models.b) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7653k(C2406m0 c2406m0, kotlin.coroutines.d dVar, C7645c c7645c, Jb0.m mVar) {
        super(2, dVar);
        this.f71341e = c2406m0;
        this.f71342f = c7645c;
        this.f71343g = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7653k(this.f71341e, dVar, this.f71342f, this.f71343g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7653k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71340d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f71342f, this.f71343g);
            this.f71340d = 1;
            if (this.f71341e.collect(aVar2, this) == aVar) {
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
