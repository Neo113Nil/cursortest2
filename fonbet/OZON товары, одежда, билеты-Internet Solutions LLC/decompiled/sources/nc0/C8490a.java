package nc0;

import Sc.InterfaceC4008j;
import Sc.s;
import We.B;
import We.G;
import We.L;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rc0.C9246c;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppApi;
import xe.C10727i;
import xe.M;

/* renamed from: nc0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8490a extends Db0.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<q> f76727a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f76728b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76729c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76730d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f76731e;

    /* renamed from: nc0.a$a, reason: collision with other inner class name */
    static final class C1295a extends AbstractC7737t implements Function0<ConditionVariable> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1295a f76732b = new C1295a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ConditionVariable invoke() {
            return new ConditionVariable(false);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.AutologinInterceptor$interceptAfterOzonIdInit$1", f = "AutologinInterceptor.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: nc0.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f76733d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8490a.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f76733d;
            C8490a c8490a = C8490a.this;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    if (C8490a.d(c8490a).compareAndSet(false, true)) {
                        q qVar = (q) c8490a.f76727a.getValue();
                        this.f76733d = 1;
                        if (qVar.i(this) == aVar) {
                            return aVar;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            } finally {
                c8490a.f76728b = true;
                C8490a.b(c8490a).open();
            }
        }
    }

    /* renamed from: nc0.a$c */
    static final class c extends AbstractC7737t implements Function0<AtomicBoolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f76735b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final AtomicBoolean invoke() {
            return new AtomicBoolean(false);
        }
    }

    /* renamed from: nc0.a$d */
    static final class d extends AbstractC7737t implements Function0<M> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f76736b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final M invoke() {
            return td0.f.a();
        }
    }

    public C8490a(@NotNull InterfaceC4008j<q> crossAppAutologinUseCase) {
        Intrinsics.checkNotNullParameter(crossAppAutologinUseCase, "crossAppAutologinUseCase");
        this.f76727a = crossAppAutologinUseCase;
        this.f76729c = Sc.k.b(c.f76735b);
        this.f76730d = Sc.k.b(C1295a.f76732b);
        this.f76731e = Sc.k.b(d.f76736b);
    }

    public static final ConditionVariable b(C8490a c8490a) {
        return (ConditionVariable) c8490a.f76730d.getValue();
    }

    public static final AtomicBoolean d(C8490a c8490a) {
        return (AtomicBoolean) c8490a.f76729c.getValue();
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        if (!this.f76728b) {
            Intrinsics.checkNotNullParameter(request, "<this>");
            if (request.i(Ic0.j.class) == null) {
                Intrinsics.checkNotNullParameter(request, "<this>");
                if (request.i(C9246c.class) == null && request.i(CrossAppApi.a.class) == null) {
                    td0.k.a(chain);
                    C10727i.c((M) this.f76731e.getValue(), null, null, new b(null), 3);
                    ((ConditionVariable) this.f76730d.getValue()).block();
                }
            }
        }
        return chain.proceed(request);
    }
}
