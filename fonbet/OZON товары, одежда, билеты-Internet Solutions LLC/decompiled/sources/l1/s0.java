package l1;

import Sc.InterfaceC3999a;
import k1.C7460f;
import k1.C7462h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface s0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a Clockwise;
        public static final a CounterClockwise;

        static {
            a aVar = new a("CounterClockwise", 0);
            CounterClockwise = aVar;
            a aVar2 = new a("Clockwise", 1);
            Clockwise = aVar2;
            $VALUES = new a[]{aVar, aVar2};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    void a(float f7, float f11);

    void b(float f7, float f11);

    void c(float f7, float f11, float f12, float f13, float f14, float f15);

    void close();

    void d(@NotNull C7460f c7460f, @NotNull a aVar);

    void e(float f7, float f11);

    void f(float f7, float f11, float f12, float f13, float f14, float f15);

    @InterfaceC3999a
    void g(float f7, float f11, float f12, float f13);

    @NotNull
    C7460f getBounds();

    default void h() {
        reset();
    }

    void i(long j11);

    default void j(float f7, float f11, float f12, float f13) {
        g(f7, f11, f12, f13);
    }

    boolean k(@NotNull s0 s0Var, @NotNull s0 s0Var2, int i11);

    default void l(@NotNull C7460f c7460f, float f7, float f11) {
        ((C7786D) this).w(c7460f, f7 * 57.29578f, f11 * 57.29578f);
    }

    int m();

    boolean o();

    @InterfaceC3999a
    void p(float f7, float f11, float f12, float f13);

    void q(int i11);

    default void r(float f7, float f11, float f12, float f13) {
        p(f7, f11, f12, f13);
    }

    void reset();

    void s(@NotNull C7462h c7462h, @NotNull a aVar);

    void t(float f7, float f11);
}
