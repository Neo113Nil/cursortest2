package coil.compose;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import hd.C6915b;
import k1.C7464j;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;
import w5.C10435g;
import w5.InterfaceC10436h;

/* loaded from: classes8.dex */
final class f implements InterfaceC10436h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AsyncImagePainter f57277a;

    public static final class a implements InterfaceC2395h<C10435g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f57278a;

        /* renamed from: coil.compose.f$a$a, reason: collision with other inner class name */
        public static final class C0871a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f57279a;

            @kotlin.coroutines.jvm.internal.e(c = "coil.compose.AsyncImagePainter$updateRequest$2$1$size$$inlined$mapNotNull$1$2", f = "AsyncImagePainter.kt", l = {225}, m = "emit")
            /* renamed from: coil.compose.f$a$a$a, reason: collision with other inner class name */
            public static final class C0872a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f57280d;

                /* renamed from: e, reason: collision with root package name */
                int f57281e;

                public C0872a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f57280d = obj;
                    this.f57281e |= LinearLayoutManager.INVALID_OFFSET;
                    return C0871a.this.emit(null, this);
                }
            }

            public C0871a(InterfaceC2397i interfaceC2397i) {
                this.f57279a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0872a c0872a;
                int i11;
                C10435g c10435g;
                if (dVar instanceof C0872a) {
                    c0872a = (C0872a) dVar;
                    int i12 = c0872a.f57281e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0872a.f57281e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0872a.f57280d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0872a.f57281e;
                        if (i11 != 0) {
                            s.b(obj2);
                            long i13 = ((C7464j) obj).i();
                            if (i13 == 9205357640488583168L) {
                                c10435g = C10435g.f103580c;
                            } else if (C7464j.f(i13) < 0.5d || C7464j.d(i13) < 0.5d) {
                                c10435g = null;
                            } else {
                                float f7 = C7464j.f(i13);
                                AbstractC10429a c2245a = (Float.isInfinite(f7) || Float.isNaN(f7)) ? AbstractC10429a.b.f103576a : new AbstractC10429a.C2245a(C6915b.c(C7464j.f(i13)));
                                float d11 = C7464j.d(i13);
                                c10435g = new C10435g(c2245a, (Float.isInfinite(d11) || Float.isNaN(d11)) ? AbstractC10429a.b.f103576a : new AbstractC10429a.C2245a(C6915b.c(C7464j.d(i13))));
                            }
                            if (c10435g != null) {
                                c0872a.f57281e = 1;
                                if (this.f57279a.emit(c10435g, c0872a) == aVar) {
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
                c0872a = new C0872a(dVar);
                Object obj22 = c0872a.f57280d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0872a.f57281e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public a(InterfaceC2395h interfaceC2395h) {
            this.f57278a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super C10435g> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f57278a.collect(new C0871a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    f(AsyncImagePainter asyncImagePainter) {
        this.f57277a = asyncImagePainter;
    }

    @Override // w5.InterfaceC10436h
    public final Object a(@NotNull kotlin.coroutines.d<? super C10435g> dVar) {
        x0 x0Var;
        x0Var = this.f57277a.f57214b;
        return C2399j.u(new a(x0Var), dVar);
    }
}
