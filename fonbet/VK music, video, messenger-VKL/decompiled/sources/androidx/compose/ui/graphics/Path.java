package androidx.compose.ui.graphics;

import android.graphics.RectF;
import xsna.aog0;
import xsna.asp;
import xsna.ozl;
import xsna.zhf0;
import xsna.zrp;

/* compiled from: Path.kt */
/* loaded from: classes11.dex */
public interface Path {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Path.kt */
    public static final class Direction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction Clockwise;
        public static final Direction CounterClockwise;

        static {
            Direction direction = new Direction("CounterClockwise", 0);
            CounterClockwise = direction;
            Direction direction2 = new Direction("Clockwise", 1);
            Clockwise = direction2;
            Direction[] directionArr = {direction, direction2};
            $VALUES = directionArr;
            $ENTRIES = new asp(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    static void u(a aVar, zhf0 zhf0Var) {
        Direction direction = Direction.CounterClockwise;
        if (aVar.b == null) {
            aVar.b = new RectF();
        }
        aVar.b.set(zhf0Var.a, zhf0Var.b, zhf0Var.c, zhf0Var.d);
        aVar.a.addOval(aVar.b, b.b(direction));
    }

    void a(float f, float f2);

    void b(float f, float f2, float f3, float f4, float f5, float f6);

    void c(float f, float f2);

    void close();

    @ozl
    void d(float f, float f2, float f3, float f4);

    void e(long j);

    default void f(float f, float f2, float f3, float f4) {
        d(f, f2, f3, f4);
    }

    void g(zhf0 zhf0Var, Direction direction);

    zhf0 getBounds();

    int h();

    boolean j();

    @ozl
    void k(float f, float f2, float f3, float f4);

    void l(int i);

    void m(float f, float f2);

    void n(float f, float f2);

    void o(float f, float f2, float f3, float f4, float f5, float f6);

    void q(aog0 aog0Var, Direction direction);

    default a r(a aVar) {
        a a = b.a();
        a.x(this, aVar, 2);
        return a;
    }

    void reset();

    default void rewind() {
        reset();
    }

    void s(zhf0 zhf0Var, float f, float f2);

    default void t(float f, float f2, float f3, float f4) {
        k(f, f2, f3, f4);
    }
}
