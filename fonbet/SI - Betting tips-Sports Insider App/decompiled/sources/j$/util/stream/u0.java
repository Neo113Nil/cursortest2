package j$.util.stream;

import io.appmetrica.analytics.impl.C0122e9;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class u0 implements ToIntFunction, IntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer, BinaryOperator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18096a;

    public /* synthetic */ u0(int i5) {
        this.f18096a = i5;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void n(Object obj) {
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f18096a) {
            case 4:
                break;
            case 8:
                break;
            case 12:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f18096a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.f18096a) {
            case 14:
                return Long.valueOf(j);
            case 21:
                return x3.h0(j);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return x3.r0(j);
            default:
                return x3.s0(j);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i5, int i10) {
        switch (this.f18096a) {
            case 2:
                return Math.min(i5, i10);
            case 5:
                return i5 + i10;
            default:
                return Math.max(i5, i10);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j6) {
        switch (this.f18096a) {
            case 10:
                return Math.min(j, j6);
            case 17:
                return Math.max(j, j6);
            default:
                return j + j6;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i5) {
        switch (this.f18096a) {
            case 1:
                return Integer.valueOf(i5);
            case 13:
                return new Long[i5];
            case 20:
                return new Object[i5];
            case 28:
                return new Object[i5];
            default:
                return new Integer[i5];
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        switch (this.f18096a) {
            case 9:
                ((j$.util.z) obj).accept(j);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f18096a) {
            case 4:
                ((j$.util.x) obj).a((j$.util.x) obj2);
                break;
            case 8:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 12:
                ((j$.util.z) obj).a((j$.util.z) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i5) {
        switch (this.f18096a) {
            case 3:
                ((j$.util.x) obj).accept(i5);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i5;
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f18096a) {
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new p2((c2) obj, (c2) obj2);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
            case C0122e9.F /* 25 */:
            default:
                return new t2((i2) obj, (i2) obj2);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new q2((e2) obj, (e2) obj2);
            case C0122e9.G /* 26 */:
                return new r2((g2) obj, (g2) obj2);
        }
    }
}
