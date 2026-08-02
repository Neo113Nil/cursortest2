package j10;

import Ae.C0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l20.C7854a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.store.ComposerStoreImpl$1", f = "ComposerStore.kt", l = {118}, m = "invokeSuspend")
/* renamed from: j10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C7239b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f68750d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ d<C7854a> f68751e;

    /* renamed from: j10.b$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d<C7854a> f68752a;

        a(d<C7854a> dVar) {
            this.f68752a = dVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            this.f68752a.f().d((A00.a) obj);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7239b(d<C7854a> dVar, kotlin.coroutines.d<? super C7239b> dVar2) {
        super(2, dVar2);
        this.f68751e = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7239b(this.f68751e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7239b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f68750d;
        if (i11 == 0) {
            s.b(obj);
            d<C7854a> dVar = this.f68751e;
            C0 c02 = ((d) dVar).f68759b;
            a aVar2 = new a(dVar);
            this.f68750d = 1;
            if (c02.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        throw new C4005g();
    }
}
