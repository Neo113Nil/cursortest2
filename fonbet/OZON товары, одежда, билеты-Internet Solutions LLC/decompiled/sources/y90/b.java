package y90;

import Ae.C2399j;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import E30.d;
import Sc.s;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import h3.C6788a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import v30.f;

/* loaded from: classes3.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v30.d f106365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f106366b;

    /* renamed from: c, reason: collision with root package name */
    private M0<String> f106367c;

    public static final class a implements InterfaceC2395h<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f106368a;

        /* renamed from: y90.b$a$a, reason: collision with other inner class name */
        public static final class C2294a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f106369a;

            @e(c = "ru.ozon.fintech.preferences.presentation.antifraud.AntifraudJsonViewModel$onCreate$$inlined$map$1$2", f = "AntifraudJsonViewModel.kt", l = {223}, m = "emit")
            /* renamed from: y90.b$a$a$a, reason: collision with other inner class name */
            public static final class C2295a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f106370d;

                /* renamed from: e, reason: collision with root package name */
                int f106371e;

                public C2295a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f106370d = obj;
                    this.f106371e |= LinearLayoutManager.INVALID_OFFSET;
                    return C2294a.this.emit(null, this);
                }
            }

            public C2294a(InterfaceC2397i interfaceC2397i) {
                this.f106369a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C2295a c2295a;
                int i11;
                if (dVar instanceof C2295a) {
                    c2295a = (C2295a) dVar;
                    int i12 = c2295a.f106371e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c2295a.f106371e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c2295a.f106370d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c2295a.f106371e;
                        if (i11 != 0) {
                            s.b(obj2);
                            String jSONObject = new JSONObject((String) obj).toString(4);
                            c2295a.f106371e = 1;
                            if (this.f106369a.emit(jSONObject, c2295a) == aVar) {
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
                c2295a = new C2295a(dVar);
                Object obj22 = c2295a.f106370d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2295a.f106371e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public a(InterfaceC2395h interfaceC2395h) {
            this.f106368a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super String> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f106368a.collect(new C2294a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public b(@NotNull v30.d fintechAntiFraudInteractor, @NotNull S80.b fintechNavigation) {
        Intrinsics.checkNotNullParameter(fintechAntiFraudInteractor, "fintechAntiFraudInteractor");
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        this.f106365a = fintechAntiFraudInteractor;
        this.f106366b = fintechNavigation;
    }

    public final M0<String> d0() {
        return this.f106367c;
    }

    public final void e0() {
        this.f106366b.pop();
    }

    public final void f0() {
        M0<String> m02;
        f b11 = this.f106365a.b();
        if (b11 != null) {
            a aVar = new a(b11);
            C6788a a11 = x0.a(this);
            int i11 = I0.f818a;
            m02 = C2399j.M(aVar, a11, I0.a.c(), "");
        } else {
            m02 = null;
        }
        this.f106367c = m02;
    }
}
