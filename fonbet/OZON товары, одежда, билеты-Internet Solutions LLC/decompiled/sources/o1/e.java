package o1;

import android.graphics.Matrix;
import android.graphics.Outline;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.InterfaceC7802U;
import l1.z0;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f77505a = a.f77506a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f77506a = new a();

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private static final Function1<InterfaceC8412e, Unit> f77507b = C1304a.f77508b;

        /* renamed from: o1.e$a$a, reason: collision with other inner class name */
        static final class C1304a extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1304a f77508b = new C1304a(1);

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(InterfaceC8412e interfaceC8412e) {
                long j11;
                j11 = C7807Z.f72258l;
                InterfaceC8412e.Q(interfaceC8412e, j11, 0L, 0L, 0.0f, null, 126);
                return Unit.f71690a;
            }
        }

        @NotNull
        public static Function1 a() {
            return f77507b;
        }
    }

    float A();

    long B();

    int C();

    float D();

    void E(long j11);

    float F();

    void G(int i11);

    void H(long j11);

    float I();

    void J(long j11);

    void a(@NotNull Z1.d dVar, @NotNull Z1.s sVar, @NotNull d dVar2, @NotNull Function1<? super InterfaceC8412e, Unit> function1);

    z0 b();

    void c(float f7);

    void d(float f7);

    void e(float f7);

    void f(float f7);

    long g();

    float getAlpha();

    void h(float f7);

    float i();

    void j(float f7);

    void k(float f7);

    void l(z0 z0Var);

    @NotNull
    Matrix m();

    void n(float f7);

    void o(Outline outline, long j11);

    float p();

    float q();

    default boolean r() {
        return true;
    }

    void s();

    void setAlpha(float f7);

    float t();

    void u(@NotNull InterfaceC7802U interfaceC7802U);

    int v();

    void w(int i11, int i12, long j11);

    void x(boolean z11);

    float y();

    void z(float f7);
}
