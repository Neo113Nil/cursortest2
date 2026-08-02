package ru.ozon.pikazon.compose.painter;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.N;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rj.AbstractC9286a;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.pikazon.compose.painter.PikazonImagePainter$retryOnLostConnection$1", f = "PikazonImagePainter.kt", l = {297}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class d extends j implements Function2<PikazonImagePainter.State, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97668d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f97669e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ rj.b f97670f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ PikazonImagePainter f97671g;

    /* loaded from: classes3.dex */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PikazonImagePainter f97672a;

        a(PikazonImagePainter pikazonImagePainter) {
            this.f97672a = pikazonImagePainter;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            this.f97672a.j();
            return Unit.f71690a;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC2395h<AbstractC9286a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C2406m0 f97673a;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f97674a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.pikazon.compose.painter.PikazonImagePainter$retryOnLostConnection$1$invokeSuspend$$inlined$filter$1$2", f = "PikazonImagePainter.kt", l = {223}, m = "emit")
            /* renamed from: ru.ozon.pikazon.compose.painter.d$b$a$a, reason: collision with other inner class name */
            public static final class C2142a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f97675d;

                /* renamed from: e, reason: collision with root package name */
                int f97676e;

                public C2142a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f97675d = obj;
                    this.f97676e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i) {
                this.f97674a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C2142a c2142a;
                int i11;
                if (dVar instanceof C2142a) {
                    c2142a = (C2142a) dVar;
                    int i12 = c2142a.f97676e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c2142a.f97676e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c2142a.f97675d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c2142a.f97676e;
                        if (i11 != 0) {
                            s.b(obj2);
                            if (Intrinsics.d((AbstractC9286a) obj, AbstractC9286a.C1429a.f83578a)) {
                                c2142a.f97676e = 1;
                                if (this.f97674a.emit(obj, c2142a) == aVar) {
                                    return aVar;
                                }
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
                c2142a = new C2142a(dVar);
                Object obj22 = c2142a.f97675d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2142a.f97676e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public b(C2406m0 c2406m0) {
            this.f97673a = c2406m0;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super AbstractC9286a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f97673a.collect(new a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(rj.b bVar, PikazonImagePainter pikazonImagePainter, kotlin.coroutines.d<? super d> dVar) {
        super(2, dVar);
        this.f97670f = bVar;
        this.f97671g = pikazonImagePainter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        d dVar2 = new d(this.f97670f, this.f97671g, dVar);
        dVar2.f97669e = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PikazonImagePainter.State state, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(state, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97668d;
        if (i11 == 0) {
            s.b(obj);
            if (!(((PikazonImagePainter.State) this.f97669e) instanceof PikazonImagePainter.State.Fail)) {
                return Unit.f71690a;
            }
            rj.b bVar = this.f97670f;
            if (Intrinsics.d(bVar.e(), AbstractC9286a.C1429a.f83578a)) {
                return Unit.f71690a;
            }
            N O11 = C2399j.O(new b(bVar.f()), 1);
            a aVar2 = new a(this.f97671g);
            this.f97668d = 1;
            if (O11.collect(aVar2, this) == aVar) {
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
