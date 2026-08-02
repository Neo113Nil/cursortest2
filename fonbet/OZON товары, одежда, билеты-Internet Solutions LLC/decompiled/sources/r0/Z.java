package r0;

import S0.C3961h0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.C8008p;
import m0.InterfaceC8002m;
import m0.W0;
import m0.X0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Z {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C8008p f82536f = new C8008p(0.0f);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X0<C8008p> f82537a;

    /* renamed from: b, reason: collision with root package name */
    private long f82538b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private C8008p f82539c = f82536f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82540d;

    /* renamed from: e, reason: collision with root package name */
    private float f82541e;

    private static final class a {
    }

    public Z(@NotNull InterfaceC8002m<Float> interfaceC8002m) {
        this.f82537a = interfaceC8002m.a(W0.b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        if (S0.C3961h0.a(r2.getContext()).v(r0, r2) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b1 -> B:24:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull Function1 function1, @NotNull Function0 function0, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        a0 a0Var;
        int i11;
        a0 a0Var2;
        Function0 function02;
        Function1 function12;
        float f7;
        Z z11;
        Function0 function03;
        Z z12;
        try {
            if (cVar instanceof a0) {
                a0Var = (a0) cVar;
                int i12 = a0Var.f82548j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    a0Var.f82548j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = a0Var.f82546h;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = a0Var.f82548j;
                    C8008p c8008p = f82536f;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (this.f82540d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        e1.g gVar = (e1.g) a0Var.getContext().get(e1.g.f61781e0);
                        float scaleFactor = gVar != null ? gVar.getScaleFactor() : 1.0f;
                        this.f82540d = true;
                        a0Var2 = a0Var;
                        function02 = function0;
                        function12 = function1;
                        f7 = scaleFactor;
                        z11 = this;
                        if (Math.abs(z11.f82541e) >= 0.01f) {
                            b0 b0Var = new b0(z11, f7, function12);
                            a0Var2.f82542d = z11;
                            a0Var2.f82543e = function12;
                            a0Var2.f82544f = function02;
                            a0Var2.f82545g = f7;
                            a0Var2.f82548j = 1;
                            if (C3961h0.a(a0Var2.getContext()).v(b0Var, a0Var2) == aVar) {
                                return aVar;
                            }
                            function02.invoke();
                        }
                        Z z13 = z11;
                        Function1 function13 = function12;
                        Z z14 = z13;
                        function03 = function02;
                        if (Math.abs(z14.f82541e) == 0.0f) {
                            z12 = z14;
                            z12.f82538b = Long.MIN_VALUE;
                            z12.f82539c = c8008p;
                            z12.f82540d = false;
                            return Unit.f71690a;
                        }
                        c0 c0Var = new c0(z14, function13);
                        a0Var2.f82542d = z14;
                        a0Var2.f82543e = function03;
                        a0Var2.f82544f = null;
                        a0Var2.f82548j = 2;
                        function0 = z14;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            function03 = (Function0) a0Var.f82543e;
                            Z z15 = a0Var.f82542d;
                            Sc.s.b(obj);
                            function0 = z15;
                            function03.invoke();
                            z12 = function0;
                            z12.f82538b = Long.MIN_VALUE;
                            z12.f82539c = c8008p;
                            z12.f82540d = false;
                            return Unit.f71690a;
                        }
                        f7 = a0Var.f82545g;
                        Function0 function04 = a0Var.f82544f;
                        Function1 function14 = (Function1) a0Var.f82543e;
                        Z z16 = a0Var.f82542d;
                        try {
                            Sc.s.b(obj);
                            a0 a0Var3 = a0Var;
                            function02 = function04;
                            function12 = function14;
                            a0Var2 = a0Var3;
                            z11 = z16;
                            try {
                                function02.invoke();
                            } catch (Throwable th2) {
                                th = th2;
                                function0 = z11;
                                function0.f82538b = Long.MIN_VALUE;
                                function0.f82539c = c8008p;
                                function0.f82540d = false;
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            function0 = z16;
                            function0.f82538b = Long.MIN_VALUE;
                            function0.f82539c = c8008p;
                            function0.f82540d = false;
                            throw th;
                        }
                    }
                }
            }
            if (i11 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        a0Var = new a0(this, cVar);
        Object obj2 = a0Var.f82546h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a0Var.f82548j;
        C8008p c8008p2 = f82536f;
    }

    public final float h() {
        return this.f82541e;
    }

    public final void i(float f7) {
        this.f82541e = f7;
    }
}
