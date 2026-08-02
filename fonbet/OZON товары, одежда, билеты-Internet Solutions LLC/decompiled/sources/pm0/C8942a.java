package pm0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import rm0.C9318c;
import rm0.InterfaceC9317b;
import wm0.c;
import xe.C10720e0;
import xe.M;

@e(c = "ru.sber.platform.clickstream.clickstreamlite.internal.AnalyticsRepositoryImpl$subscribeToStorage$1", f = "AnalyticsRepositoryImpl.kt", l = {53}, m = "invokeSuspend")
/* renamed from: pm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8942a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f81257d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C8943b f81258e;

    @e(c = "ru.sber.platform.clickstream.clickstreamlite.internal.AnalyticsRepositoryImpl$subscribeToStorage$1$2", f = "AnalyticsRepositoryImpl.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: pm0.a$a, reason: collision with other inner class name */
    static final class C1367a extends j implements Function2<c, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f81259d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f81260e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C8943b f81261f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1367a(C8943b c8943b, d<? super C1367a> dVar) {
            super(2, dVar);
            this.f81261f = c8943b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
            C1367a c1367a = new C1367a(this.f81261f, dVar);
            c1367a.f81260e = obj;
            return c1367a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c cVar, d<? super Unit> dVar) {
            return ((C1367a) create(cVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            xm0.a aVar;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f81259d;
            if (i11 == 0) {
                s.b(obj);
                c cVar = (c) this.f81260e;
                aVar = this.f81261f.f81270b;
                this.f81259d = 1;
                if (((xm0.b) aVar).a(cVar) == aVar2) {
                    return aVar2;
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

    /* renamed from: pm0.a$b */
    public static final class b implements InterfaceC2395h<c> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f81262a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8943b f81263b;

        /* renamed from: pm0.a$b$a, reason: collision with other inner class name */
        public static final class C1368a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f81264a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8943b f81265b;

            @e(c = "ru.sber.platform.clickstream.clickstreamlite.internal.AnalyticsRepositoryImpl$subscribeToStorage$1$invokeSuspend$$inlined$map$1$2", f = "AnalyticsRepositoryImpl.kt", l = {223}, m = "emit")
            /* renamed from: pm0.a$b$a$a, reason: collision with other inner class name */
            public static final class C1369a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f81266d;

                /* renamed from: e, reason: collision with root package name */
                int f81267e;

                public C1369a(d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f81266d = obj;
                    this.f81267e |= LinearLayoutManager.INVALID_OFFSET;
                    return C1368a.this.emit(null, this);
                }
            }

            public C1368a(InterfaceC2397i interfaceC2397i, C8943b c8943b) {
                this.f81264a = interfaceC2397i;
                this.f81265b = c8943b;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull d dVar) {
                C1369a c1369a;
                int i11;
                sm0.b bVar;
                if (dVar instanceof C1369a) {
                    c1369a = (C1369a) dVar;
                    int i12 = c1369a.f81267e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1369a.f81267e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c1369a.f81266d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1369a.f81267e;
                        if (i11 != 0) {
                            s.b(obj2);
                            bVar = this.f81265b.f81271c;
                            c a11 = bVar.a((List) obj);
                            c1369a.f81267e = 1;
                            if (this.f81264a.emit(a11, c1369a) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c1369a = new C1369a(dVar);
                Object obj22 = c1369a.f81266d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1369a.f81267e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public b(InterfaceC2395h interfaceC2395h, C8943b c8943b) {
            this.f81262a = interfaceC2395h;
            this.f81263b = c8943b;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super c> interfaceC2397i, @NotNull d dVar) {
            Object collect = this.f81262a.collect(new C1368a(interfaceC2397i, this.f81263b), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8942a(C8943b c8943b, d<? super C8942a> dVar) {
        super(2, dVar);
        this.f81258e = c8943b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final d<Unit> create(Object obj, @NotNull d<?> dVar) {
        return new C8942a(this.f81258e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((C8942a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC9317b interfaceC9317b;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f81257d;
        if (i11 == 0) {
            s.b(obj);
            C8943b c8943b = this.f81258e;
            interfaceC9317b = c8943b.f81269a;
            C2408n0 c2408n0 = new C2408n0(C2399j.B(new b(((C9318c) interfaceC9317b).e(), c8943b), C10720e0.a()), new C1367a(c8943b, null));
            this.f81257d = 1;
            if (C2399j.g(c2408n0, this) == aVar) {
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
