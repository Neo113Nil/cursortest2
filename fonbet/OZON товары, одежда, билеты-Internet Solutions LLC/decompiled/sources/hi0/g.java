package hi0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import fi0.q;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.E0;
import xe.Y;

/* loaded from: classes7.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.coroutines.TimerFlowKt$timerFlow$1", f = "TimerFlow.kt", l = {18, 19, 19}, m = "invokeSuspend")
    static final class a<T> extends j implements Function2<InterfaceC2397i<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC2397i f65562d;

        /* renamed from: e, reason: collision with root package name */
        int f65563e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f65564f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<kotlin.time.b> f65565g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<kotlin.coroutines.d<? super T>, Object> f65566h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q<kotlin.time.b> qVar, Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f65565g = qVar;
            this.f65566h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f65565g, this.f65566h, dVar);
            aVar.f65564f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create((InterfaceC2397i) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0076 -> B:7:0x0039). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2397i interfaceC2397i;
            InterfaceC2397i interfaceC2397i2;
            InterfaceC2397i interfaceC2397i3;
            InterfaceC2397i interfaceC2397i4;
            Object obj2 = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65563e;
            if (i11 == 0) {
                s.b(obj);
                interfaceC2397i = (InterfaceC2397i) this.f65564f;
            } else {
                if (i11 == 1) {
                    InterfaceC2397i interfaceC2397i5 = (InterfaceC2397i) this.f65564f;
                    s.b(obj);
                    interfaceC2397i4 = interfaceC2397i5;
                    this.f65564f = interfaceC2397i4;
                    this.f65562d = interfaceC2397i4;
                    this.f65563e = 2;
                    obj = this.f65566h.invoke(this);
                    if (obj != obj2) {
                        interfaceC2397i2 = interfaceC2397i4;
                        interfaceC2397i3 = interfaceC2397i4;
                        this.f65564f = interfaceC2397i2;
                        this.f65562d = null;
                        this.f65563e = 3;
                        if (interfaceC2397i3.emit(obj, this) != obj2) {
                        }
                    }
                    return obj2;
                }
                if (i11 == 2) {
                    InterfaceC2397i interfaceC2397i6 = this.f65562d;
                    interfaceC2397i2 = (InterfaceC2397i) this.f65564f;
                    s.b(obj);
                    interfaceC2397i3 = interfaceC2397i6;
                    this.f65564f = interfaceC2397i2;
                    this.f65562d = null;
                    this.f65563e = 3;
                    if (interfaceC2397i3.emit(obj, this) != obj2) {
                        interfaceC2397i = interfaceC2397i2;
                    }
                    return obj2;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC2397i interfaceC2397i7 = (InterfaceC2397i) this.f65564f;
                s.b(obj);
                interfaceC2397i = interfaceC2397i7;
            }
            E0.f(getContext());
            long f71985a = this.f65565g.getValue().getF71985a();
            this.f65564f = interfaceC2397i;
            this.f65563e = 1;
            if (Y.c(f71985a, this) != obj2) {
                interfaceC2397i4 = interfaceC2397i;
                this.f65564f = interfaceC2397i4;
                this.f65562d = interfaceC2397i4;
                this.f65563e = 2;
                obj = this.f65566h.invoke(this);
                if (obj != obj2) {
                }
            }
            return obj2;
        }
    }

    @NotNull
    public static final <T> InterfaceC2395h<T> a(@NotNull q<kotlin.time.b> durationProvider, @NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(durationProvider, "durationProvider");
        Intrinsics.checkNotNullParameter(block, "block");
        return C2399j.A(new a(durationProvider, block, null));
    }
}
